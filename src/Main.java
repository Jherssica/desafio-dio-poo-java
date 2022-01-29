import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso de java para iniciantes");
        curso1.setDescricao("Curso passo a passo sobre desenvolvimento java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de javascipt para iniciantes");
        curso2.setDescricao("Curso passo a passo sobre desenvolvimento web para iniciantes");
        curso2.setCargaHoraria(4);


        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("Mentoria Phyton");
        mentoria.setDescricao("aqui você tem maiores informações sobre a mentoria...");
        mentoria.setData(LocalDate.now());


        System.out.println (String.valueOf(curso1));
        System.out.println (String.valueOf(curso2));
        System.out.println (String.valueOf(mentoria));


    }
}
