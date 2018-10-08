package br.com.solutis.desafio.helper;

import br.com.solutis.desafio.domain.Registro;

import java.util.Arrays;
import java.util.List;

public class ProcessaString {

    static String vogais = "aeiou";

    public static Registro processarRegistro(String textoOriginal){

        String texto = textoOriginal.toLowerCase();

        Registro reg =  new Registro();
        reg.setString(textoOriginal);

        // passa por cada letra da string pulando as duas primeiras
        for(int i = 2;i < texto.length(); i++){
            System.out.println(
                    isVogal(texto.charAt(i))+" _ "+
                    !isVogal(texto.charAt(i-1))+" _ "+
                    isVogal(texto.charAt(i-2))+" _ "+
                    texto.indexOf(texto.charAt(i))+" - "
                            +texto.lastIndexOf(texto.charAt(i))+" - "
                            +i);
            if(
                    //se a letra for vogal
                    isVogal(texto.charAt(i))

                    //e a letra anterior for consoante
                    && !isVogal(texto.charAt(i-1))

                    //e a letra anterior a ela for vogal
                    && isVogal(texto.charAt(i-2))

                    //e se ela n se repetir na string
                    && (texto.indexOf(texto.charAt(i)) == i )
                    && (texto.lastIndexOf(texto.charAt(i)) == i )
            ){
                reg.setVogal(""+texto.charAt(i));
                reg.setMensagem("Processado com Sucesso.");
                break;
            }
        }

        if(reg.getVogal() == null){
            reg.setMensagem("String não encontrada.");
        }

        return reg;
    }


    public static boolean isVogal(char letra){
        return vogais.contains(""+letra);
    }

}
