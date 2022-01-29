import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Phyton");
        mentoria.setDescricao("aqui você tem maiores informações sobre a mentoria...");
        mentoria.setData(LocalDate.now());


        /*System.out.println (String.valueOf(curso1));
        System.out.println (String.valueOf(curso2));
        System.out.println (String.valueOf(mentoria));

        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJherssica = new Dev();
        devJherssica.setNome("Jherssica");
        devJherssica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jherssica:" + devJherssica.getConteudosInscritos());
        devJherssica.progredir();
        devJherssica.progredir();
        System.out.println("Conteudos Inscritos Jherssica:" + devJherssica.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jherssica:" + devJherssica.getConteudosConcluidos());
        System.out.printf("XP:" + devJherssica.CalcularXp());


        System.out.printf("===================================");


        Dev devJunior = new Dev();
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Junior:" + devJunior.getConteudosInscritos());
        devJunior.progredir();
        devJunior.progredir();
        devJunior.progredir();
        System.out.printf("==");
        System.out.println("Conteudos Inscritos Junior:" + devJunior.getConteudosInscritos());
        System.out.println("Conteudos Concluidos  Junior:" + devJunior.getConteudosConcluidos());
        System.out.println("XP:" + devJunior.CalcularXp());

    }

}
