package org.endava.tmd.generics;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    static <T> T[] swap(T[] lista, int poz1, int poz2){
        T aux;
        aux = lista[poz1];
        lista[poz1] = lista[poz2];
        lista[poz2] = aux;
        return lista;
    }

    static <T> void print(T[] lista){
        for(T element : lista){
            System.out.println(element);
        }
    }

    static <T> void print(List<T> lista){
        for(T element : lista){
            System.out.println(element);
        }
    }

    static <T> int countPrimeNumbers(List<T> lista){
        int cnt = 0, a;
        boolean ok;

        for(T element : lista){
            try {
                a = Integer.parseInt(element.toString());
            }catch(Exception e){
                System.out.println("Un cuvant a fost introdus in lista de numere");
                continue;
            }

            ok = true;

            for(int i = 2; i <= a / 2; i++){
                if(a % i == 0){
                    ok = false;
                }
            }

            if(ok){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Integer[] lista = {1, 2, 3, 4, 5, 6};

        print(lista);

        System.out.println("----------");

        lista = swap(lista, 1,2);

        print(lista);

        System.out.println("----------");

        List<String> lista2 = Arrays.asList("1", "Ana", "3", "4", "5", "6");

        print(lista2);
        System.out.println("----------");

        System.out.println(countPrimeNumbers(lista2));
    }
}
