public class Main {

    public static void main(String[]args){
        Atendente Patrick  =    new Atendente();
        Gerente Ronaldo = new Gerente();
        Supervisor Iago = new Supervisor();
        System.out.println(Patrick.getSalario(23, 12));
        System.out.println(Ronaldo.getSalario(34 , 2 ));
        System.out.println(Iago.getSalario(12 , 4 ));
        System.out.println(Patrick.Falando());
        System.out.println(Ronaldo.Falando());
        System.out.println(Iago.Falando());
    }




}
