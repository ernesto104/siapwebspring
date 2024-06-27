var months = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio',
    'Agosto','Setiembre','Octubre','Noviembre','Diciembre'];       

var today = new Date();
day = today.getDay();
var week = ['Domingo','Lunes','Martes','Miercoles','Jueves','Viernes','Sabado']    
var showWeek = (week[day]);


    //today.setTime(today.getTime() + (1000*3600*24));       
    document.getElementById("fecha-hora").innerHTML = showWeek+ " "+  today.getDate()+" de " +months[today.getMonth()] + " del " + today.getFullYear();
    