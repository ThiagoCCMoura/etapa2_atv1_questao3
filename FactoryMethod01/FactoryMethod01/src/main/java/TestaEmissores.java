public class TestaEmissores {
    public static void main(String[] args) {
//        Emissor emissor1 = new EmissorSMS();
//        emissor1.envia("Aula EAD Padrões de projetos");
//
//        Emissor emissor2= new EmissorEmail();
//        emissor2.envia("Aula EAD Padrões de projetos");
//
//        Emissor emissor3 = new EmissorJMS();
//        emissor3.envia("Aula EAD Padrões de projetos");

        EmissorCreator creator = new EmissorCreator();

        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia("Aula EAD Padrões de projetos");

        Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
        emissor2.envia("Aula EAD Padrões de projetos");

        Emissor emissor3 = creator.create(EmissorCreator.JMS);
        emissor3.envia("Aula EAD Padrões de projetos");
    }
}
