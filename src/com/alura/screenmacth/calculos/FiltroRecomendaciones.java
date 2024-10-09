package com.alura.screenmacth.screenmacth.calculos;

public class FiltroRecomendaciones {
   public void filtra(Clasificable clasificable){
       if (clasificable.getClasificable()>=100){
           System.out.println("lo mas visto por los Usuarios");
       } else if (clasificable.getClasificable()>=100){
           System.out.println("popular en el momento");
       }else {
           System.out.println("miralo para despues");
       }
   }

}
