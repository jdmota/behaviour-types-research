
function stateToStr({h, pr, ended, won}) {
  let str = "";
  if(h!=null){str+=`h${h}_`;}
  str+= pr.map(v=>(v?1:0)).join("");
  if(ended){str="ended_"+str;}
  if(won){str="won_"+str;}
  return "S_" + str;
}

const start = {
  h: null,
  pr: [false, false, false],
  ended: false,
  won: false,
  actions: []
};

const seen = new Set([stateToStr(start)]);
const queue = [start];
const allStates = [start];

const actions = [
  ["void bid0(double)", s => (s.h !== 0 && !s.pr[0] && !s.ended), s => {if(s.h!=null){s.pr[s.h]=true;} s.h = 0;}],
  ["void bid1(double)", s => (s.h !== 1 && !s.pr[1] && !s.ended), s => {if(s.h!=null){s.pr[s.h]=true;} s.h = 1;}],
  ["void bid2(double)", s => (s.h !== 2 && !s.pr[2] && !s.ended), s => {if(s.h!=null){s.pr[s.h]=true;} s.h = 2;}],
  ["void withdraw0()", s => (s.h !== 0 && s.pr[0]), s => {s.pr[0] = false;}],
  ["void withdraw1()", s => (s.h !== 1 && s.pr[1]), s => {s.pr[1] = false;}],
  ["void withdraw2()", s => (s.h !== 2 && s.pr[2]), s => {s.pr[2] = false;}],
  ["void win0()", s => (s.h === 0 && s.ended && !s.won), s => {s.won = true;}],
  ["void win1()", s => (s.h === 1 && s.ended && !s.won), s => {s.won = true;}],
  ["void win2()", s => (s.h === 2 && s.ended && !s.won), s => {s.won = true;}],
  ["void finish()", s => (s.h != null && !s.ended), s => {s.ended = true;}],
];

while(queue.length) {
  const state = queue.pop();
  
  for (const [action, pre, pos] of actions) {
    if (pre(state)) {      
      const newState = {
        ...state,
        pr: [...state.pr],
        actions: []
      };
      pos(newState);
      
      const newStateStr = stateToStr(newState);
      state.actions.push([action, newStateStr]);
      
      if(!seen.has(newStateStr)){
        seen.add(newStateStr);
        queue.push(newState);
        allStates.push(newState);
      }
    }
  }
}

let typestate = "typestate AuctionProtocol {\n";
for (const state of allStates) {
  typestate += `  ${stateToStr(state)} = {\n`;
  typestate += state.actions.map(([method, to]) => `    ${method}: ${to}`).join(",\n") + "\n";
  typestate += `  }\n`;
}
typestate += `}\n`;

console.log(typestate);
