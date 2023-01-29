import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descricao curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria de java");
    mentoria.setData(LocalDate.now());

    /*
     * System.out.println(curso1);
     * System.out.println(curso2);
     * System.out.println(mentoria);
     */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devYasmim = new Dev();
    devYasmim.setNome("Yasmim");
    devYasmim.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos - Yasmim" + devYasmim.getConteudosInscritos());
    devYasmim.progredir();
    devYasmim.progredir();
    System.out.println("-");
    System.out.println("Conteúdos inscritos - Yasmim" + devYasmim.getConteudosInscritos());
    System.out.println("Conteúdos concluídos - Yasmim" + devYasmim.getConteudosConcluidos());
    System.out.println("XP: " + devYasmim.calcularTotalXp());

    System.out.println("------------");

    Dev devBruno = new Dev();
    devBruno.setNome("Bruno");
    devBruno.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos - Bruno" + devBruno.getConteudosInscritos());
    devBruno.progredir();
    devBruno.progredir();
    devBruno.progredir();
    System.out.println("-");
    System.out.println("Conteúdos inscritos - Bruno" + devBruno.getConteudosInscritos());
    System.out.println("Conteúdos concluídos - Bruno" + devBruno.getConteudosConcluidos());
    System.out.println("XP: " + devBruno.calcularTotalXp());
  }

}
