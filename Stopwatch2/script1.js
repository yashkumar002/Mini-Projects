


//  Created by Yash kumar Banjare.....

let [milliseconds, seconds, minutes, hours] = [0, 0, 0, 0];
let display = document.getElementById("display");
let timer = null;
//  Created by Yash kumar Banjare.....
function updateDisplay() {
  let h = hours < 10 ? "0" + hours : hours;
  let m = minutes < 10 ? "0" + minutes : minutes;
  let s = seconds < 10 ? "0" + seconds : seconds;
  let ms = milliseconds < 10 ? "0" + milliseconds : milliseconds;
  display.textContent = `${h}:${m}:${s}.${ms}`;
}//  Created by Yash kumar Banjare.....

function stopwatch() {
  milliseconds++;
  if (milliseconds === 100) {
    milliseconds = 0;
    seconds++;
    if (seconds === 60) {
      seconds = 0;//  Created by Yash kumar Banjare.....
      minutes++;
      if (minutes === 60) {
        minutes = 0;
        hours++;
      }
    }//  Created by Yash kumar Banjare.....
  }
  updateDisplay();

}
document.getElementById("start").addEventListener("click", () => {
  if (timer !== null) return;
  timer = setInterval(stopwatch, 10); // 10ms = 1/100s
});
//  Created by Yash kumar Banjare.....
document.getElementById("stop").addEventListener("click", () => {
  clearInterval(timer);
  timer = null;
});//  Created by Yash kumar Banjare.....

document.getElementById("reset").addEventListener("click", () => {
  clearInterval(timer);
  timer = null;
  [milliseconds, seconds, minutes, hours] = [0, 0, 0, 0];
  updateDisplay();
});
//  Created by Yash kumar Banjare.....


