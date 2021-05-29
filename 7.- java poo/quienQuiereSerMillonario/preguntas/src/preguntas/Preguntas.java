/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;
import java.util.Scanner;
import java.util.Random;
/**

/**
 *
 * @author orregol
 */
public class Preguntas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta,avanza,op, c50, cp, ct, como, puntaje;
        char comodin;
        puntaje=0;
     c50=1;
     cp=1;
     ct=1;
       
       System.out.println("Bienvenidos a Quien quiere ser Millonario");
       Pregunta p1 = new Pregunta("¿Cuál es el nombre del río más largo del mundo?","Río Amazonas","Río Nilo","Río Danubio","Río Loa",10);
       Pregunta p2 = new Pregunta("¿Cuál es el océano más grande del mundo?","Océano Pacífico","Océano Índico","Océano Atlántico","Océano Artico",20);
       Pregunta p3 = new Pregunta("¿En qué continente se encuentra Surinam?","América","África","Oceanía","Europa",30); 
       Pregunta p4 = new Pregunta(" ¿Cuál es la segunda montaña más alta del mundo?","K2","K3","K1","K4",40);
       Pregunta p5 = new Pregunta("¿Cuál es el idioma más antiguo que pervive en Europa?","Vasco","Inglés","Francés","Español",50);
       Pregunta p6 = new Pregunta("¿Cuál fue el primer hombre en ir a la luna?","Neil Armstrong","Louis Armstrong","Michael Armstrong","nick Armstrong",60); 
       Pregunta p7 = new Pregunta("¿Cómo se llama la primera mujer que viajó al espacio?","Valentina Tereshkova","Amanda Tereshkova","Alexandra Tereshkova","Carla Tereshkova",70);
       Pregunta p8 = new Pregunta("¿En qué guerra participó Juana de Arco?","Guerra de los 100 años","Guerra Civil Española","Guerra de la independencia francesa","Guerra de la independencia Suiza",80);
       Pregunta p9 = new Pregunta("¿En qué isla murió Napoleón?","Santa Elena","Creta","Sicilia","Madagascar",90); 
       Pregunta p10 = new Pregunta("¿Quién pintó La noche estrellada?","Vincent van Gogh","Rembrandt","Velazquez","Dali",100);
       Pregunta p11 = new Pregunta("¿En qué año murió Kurt Cobain?","1994","1998","1996","1992",200);
       Pregunta p12 = new Pregunta("¿A cuánto equivale el número pi?","3,1416","3,1412","3,1418","3,1410",300); 
       Pregunta p13 = new Pregunta("¿Quién compuso Los Conciertos de Brandeburgo?","Bach","Beethoven","Mozart","Tozzi",400);
       Pregunta p14 = new Pregunta(" ¿Cuántos huesos tiene en total un ser humano?","206","60","145","305",500);
       Pregunta p15 = new Pregunta("¿Qué año solo tuvo 355 días?","1582","1615","1823","1705",1000);
    avanza=p1.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p1.C50y50(avanza); }
       if(como==3){ cp=p1.CPublico(); }
       if(como==2){ ct=p1.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p1.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
  //-------------------------------------------------------------------
  
 System.out.println("_________________________________________");
       avanza=p2.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p2.C50y50(avanza); }
       if(como==3){ cp=p2.CPublico(); }
       if(como==2){ ct=p2.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p2.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
    System.out.println("_________________________________________");
       avanza=p3.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p3.C50y50(avanza); }
       if(como==3){ cp=p3.CPublico(); }
       if(como==2){ ct=p3.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p3.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
        System.out.println("_________________________________________");
       avanza=p4.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p4.C50y50(avanza); }
       if(como==3){ cp=p4.CPublico(); }
       if(como==2){ ct=p4.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p4.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p5.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p5.C50y50(avanza); }
       if(como==3){ cp=p5.CPublico(); }
       if(como==2){ ct=p5.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p5.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p6.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p6.C50y50(avanza); }
       if(como==3){ cp=p6.CPublico(); }
       if(como==2){ ct=p6.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p6.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p7.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p7.C50y50(avanza); }
       if(como==3){ cp=p7.CPublico(); }
       if(como==2){ ct=p7.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p7.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p8.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p8.C50y50(avanza); }
       if(como==3){ cp=p8.CPublico(); }
       if(como==2){ ct=p8.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p8.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p9.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p9.C50y50(avanza); }
       if(como==3){ cp=p9.CPublico(); }
       if(como==2){ ct=p9.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p9.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p10.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p10.C50y50(avanza); }
       if(como==3){ cp=p10.CPublico(); }
       if(como==2){ ct=p10.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p10.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p11.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p11.C50y50(avanza); }
       if(como==3){ cp=p11.CPublico(); }
       if(como==2){ ct=p11.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p11.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p12.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p12.C50y50(avanza); }
       if(como==3){ cp=p12.CPublico(); }
       if(como==2){ ct=p12.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p12.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p13.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p13.C50y50(avanza); }
       if(como==3){ cp=p13.CPublico(); }
       if(como==2){ ct=p13.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p13.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p14.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p14.C50y50(avanza); }
       if(como==3){ cp=p14.CPublico(); }
       if(como==2){ ct=p14.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p14.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
            System.out.println("_________________________________________");
       avanza=p15.MostrarPregunta();
    if((c50==1)||(cp==1)||(ct==1)){
    System.out.print("Desea un Comodin s/n: ");
   comodin = leer.next().charAt(0);
   if(comodin=='s'){
       System.out.println("Elija un Comodin: ");
       if(c50==1){ System.out.println("1.- Comodin de Cincuenta y Cincuenta");}
        if(ct==1){    System.out.println("2.- Comodin Telefonico");}
         if(cp==1){   System.out.println("3.- Comodin del Publico");}
          System.out.print("Elija su Comodin: ");
       como = leer.nextInt();
       if(como==1){ c50=p15.C50y50(avanza); }
       if(como==3){ cp=p15.CPublico(); }
       if(como==2){ ct=p15.Ctelefono(); }
       System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   } else {
        System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
   }
    }
    else{
    System.out.print("Elija su Respuesta Definitiva: ");
       respuesta = leer.nextInt();
    }
    if(respuesta==avanza){
    puntaje=p15.SumaPuntos(puntaje);
    }
    else{
    System.out.println("Respuesta incorrecta, Gracias por Jugar");
   System.exit(0);
    }
    System.out.println("Felicidades, el cheque lo firma el Profesor Mauricio");
// TODO code application logic here
    }
    
}
