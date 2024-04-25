Este é um projeto em Java que implementa um simulador da Lotofácil, um jogo de loteria brasileiro. Ele é desenvolvido utilizando o Oracle OpenJDK versão 21.0.2.



https://github.com/barbaraNov/Lotofacil/assets/161669229/7e79e75b-fd19-4c3e-a7dd-8d3214361a57



Funcionalidades:
Geração de apostas aleatórias da Lotofácil.
Verificação de acertos em uma aposta em relação ao resultado oficial.
Botões de apostar de A a Z, 0 a 100 e ímpar ou par.
Requisitos:
Java Development Kit (JDK) versão 21.0.2 ou superior.
Um editor de código de sua preferência (recomendado: IntelliJ IDEA, Eclipse, NetBeans).import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LotofacilInter extends JFrame {
    private JPanel painel = new JPanel();
    private JButton botao1 = new JButton("Apostar de 0 a 100");
    private JButton botao2 = new JButton("Apostar de A a Z");
    private JButton botao3 = new JButton("Apostar se é par ou ímpar");

    public LotofacilInter() {
        super("Lotofácil");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        painel.setLayout(new GridLayout(3, 1));
        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);

        botao1.addActionListener(e -> aposta1());
        botao2.addActionListener(e -> apostarDeAToZ());
        botao3.addActionListener(e -> apostarParOuImpar());

        add(painel);
        setVisible(true);
    }

    private void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object numeroApostado = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100", "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random rdn = new Random();
        int numeroSorteado = rdn.nextInt(101);
        if (numeroApostadoInt == numeroSorteado) {
            JOptionPane.showMessageDialog(null, "Você ganhou mil reais", "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + numeroSorteado + ".", "Aposta de 0 a 100", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    private void apostarDeAToZ() {
        String input = JOptionPane.showInputDialog("Digite uma letra de A à Z:");
        char letraPremiada = 'B'; // Aqui você pode definir a letra premiada
        char aposta = input.toUpperCase().charAt(0);

        if (!Character.isLetter(aposta)) {
            JOptionPane.showMessageDialog(null, "Aposta inválida.");
            return;
        }

        if (aposta == letraPremiada) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou R$ 500,00 reais.");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letraPremiada + ".");
        }
    }

    private void apostarParOuImpar() {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numeroSorteado = Integer.parseInt(input);

        if (numeroSorteado % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou R$ 100,00 reais.");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi ímpar.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LotofacilInter());
    }
}
