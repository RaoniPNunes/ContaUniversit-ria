
package contauniversitária;


public class Cliente {
private String nome;
    private int RG;
    private int CPF;
    private String endereço;
    private String estadoCivil;
    
    public Cliente(String no, int rg, int cpf, String en, String ec){
        this.nome = no;
        this.RG = rg;
        this.CPF = cpf;
        this.endereço = en;
        this.estadoCivil = ec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }    
}
