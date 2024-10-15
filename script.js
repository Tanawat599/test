function toggleAdditionalInfo(id) {
    const additionalExperience = document.getElementById(id);
    
    if (additionalExperience) {
        additionalExperience.style.display = 
            additionalExperience.style.display === 'none' || additionalExperience.style.display === ''
                ? 'block' // Show content when the button is clicked
                : 'none';  // Hide content when the button is clicked again
    }
}

document.addEventListener('DOMContentLoaded', function() {

    for (let i = 0; i <= 10; i++) { // Adjust the loop range based on the number of elements
        const button = document.querySelector(`.read-more${i}`);
        if (button) {
            button.addEventListener('click', function(event) {
                event.preventDefault(); // Prevent the link from loading a new page
                toggleAdditionalInfo(`additional-experience${i}`); // Call the function with the content ID
            });
        }
    }

});
