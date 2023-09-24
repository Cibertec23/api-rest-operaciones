package pe.edu.cibertec.apirestoperaciones.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.apirestoperaciones.model.MensajeResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatematicaService {

    public MensajeResponse suma(Integer numero1, Integer numero2){
        return MensajeResponse.builder()
                .resultado("La suma es: " + (numero1 + numero2))
                .build();
    }


    public MensajeResponse promedioCibertec(Integer cl1,
                                            Integer cl2,
                                            Integer cl3,
                                            Integer ap,
                                            Integer pf){
        Double promedioFinal = (cl1 *0.15) + (cl2 * 0.2) + (cl3 * 0.3) + (((ap + pf)/2) *0.35);
        return MensajeResponse.builder()
                .resultado("Su promedio es: " + promedioFinal)
                .build();
    }


    public List<Integer> listarNumeroPrimos(Integer hasta){
        List<Integer> numerosPrimos = new ArrayList<>();
        for (int i = 1; i <= hasta; i++){
            if(esPrimo(i)){
                numerosPrimos.add(i);
            }
        }
        return numerosPrimos;
    }

    //Según Sergio Gallegos
    private Boolean esPrimo(Integer numero){
        int contador = 0;
        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            }
        }
        return contador <= 2;
    }


}
