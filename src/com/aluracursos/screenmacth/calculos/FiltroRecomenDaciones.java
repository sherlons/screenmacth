package com.aluracursos.screenmacth.calculos;

public class FiltroRecomenDaciones {
   public void filtra(Clasificable clasificable){
       if (clasificable.getClasificable()>=4){
           System.out.println("lo mas visto por los Usuarios");
       } else if (clasificable.getClasificable()>=2){
           System.out.println("popular en el momento");
       }else {
           System.out.println("miralo para despues");
       }
   }

}
