function addTask() {
  const taskInput = document.getElementById("task-input");
  const taskList = document.getElementById("task-list");

  // Check if input is not empty
  if (taskInput.value.trim() !== "") {
    // Create list item
    const li = document.createElement("li");
    li.className = "task-item";

    // Create task text span
    const taskText = document.createElement("span");
    taskText.textContent = taskInput.value;

    // Create remove button
    const removeBtn = document.createElement("button");
    removeBtn.textContent = "Remove";
    removeBtn.className = "remove-btn";
    removeBtn.onclick = function () {
      taskList.removeChild(li);
    };

    // Append elements
    li.appendChild(taskText);
    li.appendChild(removeBtn);
    taskList.appendChild(li);

    // Clear input
    taskInput.value = "";
  }
}

// Allow adding task by pressing Enter key
document
  .getElementById("task-input")
  .addEventListener("keypress", function (event) {
    if (event.key === "Enter") {
      addTask();
    }
  });
