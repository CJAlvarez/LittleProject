/*

document.getElementById("container-almacenes").style.display = 'none';

function funcion() {

}*/

/* EVENTS. */
// CLICK


/* FUNCTIONS. */

function changeDisplay(id) {
    document.getElementById("container-buttons").style.display = "none";
    document.getElementById("container-" + id.toLowerCase()).style.display = "block";
}

