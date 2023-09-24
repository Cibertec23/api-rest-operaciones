package pe.edu.cibertec.apirestoperaciones.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apirestoperaciones.model.MensajeResponse;
import pe.edu.cibertec.apirestoperaciones.service.MatematicaService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/matematica")
public class MatematicaController {

    private MatematicaService matematicaService;


    @GetMapping("/suma")
    public ResponseEntity<MensajeResponse> suma(@RequestParam Integer numero1,
                                                @RequestParam Integer numero2){
        return new ResponseEntity<>(
                matematicaService.suma(numero1, numero2), HttpStatus.OK );
    }

    @GetMapping("/promedio")
    public ResponseEntity<MensajeResponse> promedioCibertec(@RequestParam Integer cl1,
                                                            @RequestParam Integer cl2,
                                                            @RequestParam Integer cl3,
                                                            @RequestParam(defaultValue = "20") Integer ap,
                                                            @RequestParam Integer pf){
        return new ResponseEntity<>(
                matematicaService.promedioCibertec(cl1, cl2, cl3, ap, pf), HttpStatus.OK
        );
    }

    @GetMapping("/primos")
    public ResponseEntity<List<Integer>> listaNumerosPrimos(@RequestParam(name = "listarhasta")
                                                                Integer hasta){
        return new ResponseEntity<>(
                matematicaService.listarNumeroPrimos(hasta),
                HttpStatus.OK
        );
    }





}
