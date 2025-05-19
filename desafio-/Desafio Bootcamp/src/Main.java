import java.time.LocalDate;
import java.util.HashSet;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Aprenda os conceitos básicos de Java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tire suas dúvidas sobre Java com um especialista");
        mentoria.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Avançado");
        curso2.setDescricao("Aprofunde seus conhecimentos em Java");
        curso2.setCargaHoraria(10);



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao avançado com o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devFelipe = new Dev(); 
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devFelipe.getNome() + ": " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("Conteúdos concluidos " + devFelipe.getNome() + ": " + devFelipe.getConteudosConcluidos());
        System.out.println("-----------------------------------------");
        System.out.println("Conteúdos Inscritos " + devFelipe.getNome() + ": " + devFelipe.getConteudosInscritos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());
        System.out.println("-----------------------------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Concluidos " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("-----------------------------------------");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
