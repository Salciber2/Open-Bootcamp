/*
- Crea un mapa en HTML

- Pon chinchetas en tus 3 lugares favoritos del planeta tierra
*/

let map
let marker_obelisco
let maker_garganta
let marker_protrerillos

function initMap() {

    const posicion_obelisco = { lat: -34.603730, lng: -58.381570 }
    
    const posicion_garganta = { lat: -25.695520, lng: -54.437303 }
    
    const posicion_potrerillos = { lat: -32.997451, lng: -69.136959 }

    map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: posicion_obelisco,
    });

    marker_obelisco = new google.maps.Marker({
        position: posicion_obelisco,
        map: map,
    }); 

    maker_garganta = new google.maps.Marker({
        position: posicion_garganta,
        map: map,
    }); 

    marker_protrerillos = new google.maps.Marker({
        position: posicion_potrerillos,
        map: map,
    }); 
    
}