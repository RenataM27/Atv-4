
import java.util.Scanner;
import Cargo.CargoJunior;
import Cargo.CargoPleno;
import Cargo.CargoSenior;
public class Main {
    public static void main(String[] args) {
        CargoJunior desenvolvedor1=new CargoJunior ("funcionario","Vale alimentação");
        CargoPleno desenvolvedor2=new CargoPleno("funcionario1","Vale alimentação");
        CargoSenior desenvolvedor3=new CargoSenior("Chefe","Vale alimentação");
System.out.println("nome do funcionario Junior:" + desenvolvedor1.getNome());
System.out.println("beneficios do funcionario Junior:" + desenvolvedor1.getBeneficios());
System.out.println("salario do funcionario Junior:" + desenvolvedor1.getSalario());
System.out.println("nome do funcionario Pleno:" + desenvolvedor2.getNome());
System.out.println("beneficios do funcionario Pleno:" + desenvolvedor2.getBeneficios());
System.out.println("salario do funcionario Pleno:" + desenvolvedor2.getSalario());
System.out.println("nome do funcionario Senior:" + desenvolvedor3.getNome());
System.out.println("beneficios do funcionario Senior" + desenvolvedor3.getBeneficios());
System.out.println("salario do funcionario Senior:" + desenvolvedor3.getSalario());

    }
}







