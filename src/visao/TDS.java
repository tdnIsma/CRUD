package visao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import dao.HospitalDAO;
import modelo.HospitalVO;

import persistencia.ConexaoBanco;
import servicos.HospitalServicos;

public class TDS {

    public static void main(String[] args) throws SQLException {

        //Opções
        String[] op = {"Inserir", "Filtrar", "Deletar"};
        int escolha = JOptionPane.showOptionDialog(
                null, "Informe a opção",
                "Sistema Hospital", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, op, null);

        if (escolha == 0) {

            try {

                HospitalVO hVO = new HospitalVO();

                String nome = JOptionPane.showInputDialog(null, "Informe o nome do hospital: ");

                String telefone = JOptionPane.showInputDialog(
                        null, "Informe o telefone do hospital: ");

                String endereco = JOptionPane.showInputDialog(
                        null, "informe o endereço: ");

                String cnpj = JOptionPane.showInputDialog(
                        null, "informe o CNPJ: ");

                String acessibilidade = JOptionPane.showInputDialog(
                        null, "informe a acessibilidade (Público ou Privado): ");

                String horarioatendimento = JOptionPane.showInputDialog(
                        null, "informe o horário de atendimento: ");

                hVO.setNome(nome);
                hVO.setTelefone(telefone);
                hVO.setEndereco(endereco);
                hVO.setCnpj(cnpj);
                hVO.setAcessibilidade(acessibilidade);
                hVO.setHorarioatendimento(horarioatendimento);

                HospitalServicos hs = servicos.ServicosFactory.getHospitalServicos();
                hs.cadastrarProduto(hVO);

                hs.buscar();

            } catch (Exception e) {
            }
        }//fecha método
        else if (escolha == 1) {

            try {

                HospitalVO hVO = new HospitalVO();

                Long codigo = Long.parseLong(JOptionPane.showInputDialog(
                        null, "informe o ID do hospital: "));

                hVO.setIdHospital(codigo);

                HospitalServicos hs = servicos.ServicosFactory.getHospitalServicos();
                hs.filtrar(hVO.getIdHospital());

            } catch (Exception e) {
            }
        } else if (escolha == 2) {

            try {

                HospitalVO hVO = new HospitalVO();

                Long codigo = Long.parseLong(JOptionPane.showInputDialog(
                        null, "informe o ID do hospital para deletar: "));

                HospitalServicos hs = servicos.ServicosFactory.getHospitalServicos();
                hs.deletarHospital(codigo);

                hs.buscar();

            } catch (Exception e) {
            }

        }

    }

}
