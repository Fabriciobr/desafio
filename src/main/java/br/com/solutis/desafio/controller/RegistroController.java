package br.com.solutis.desafio.controller;


import br.com.solutis.desafio.domain.Registro;
import br.com.solutis.desafio.helper.ProcessaString;
import br.com.solutis.desafio.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("AlvaraEmitidoController")
@RequestMapping("/registro")
public class RegistroController {


    @Autowired
    RegistroRepository registroRepository;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody Registro bean) {
        bean = ProcessaString.processarRegistro(bean.getString());
        return this.buildResponse(registroRepository.save(bean));
    }



    protected <T> ResponseEntity<T> buildResponse(T value) {
        return new ResponseEntity<T>(value, (value != null) ? HttpStatus.OK : HttpStatus.NO_CONTENT);
    }
}
