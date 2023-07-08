function increase() {
  counter = document.getElementById("counter");
  counter.innerHTML = parseInt(counter.innerHTML) + 1;
}

function decrease() {
  counter = document.getElementById("counter");
  counter.innerHTML = parseInt(counter.innerHTML) - 1;
}

function reset() {
  counter = document.getElementById("counter");
  counter.innerHTML = 0;
}
