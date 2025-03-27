// Array of image URLs
const images = [
  "https://placehold.co/600x400?text=Slide-1",
  "https://placehold.co/600x400?text=Slide-2",
  "https://placehold.co/600x400?text=Slide-3",
  "https://placehold.co/600x400?text=Slide-4",
];

let currentImageIndex = 0;
const imageElement = document.getElementById("current-image");

// Function to display current image
function displayCurrentImage() {
  imageElement.src = images[currentImageIndex];
}

// Next image function
function nextImage() {
  currentImageIndex = (currentImageIndex + 1) % images.length;
  displayCurrentImage();
}

// Previous image function
function previousImage() {
  currentImageIndex = (currentImageIndex - 1 + images.length) % images.length;
  displayCurrentImage();
}

// Initialize first image
displayCurrentImage();
