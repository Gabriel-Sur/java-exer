public class Empresa {

        private String nome;
        private String dataNascimento;
        private String cnpj;

        public Empresa(String nome, String dataNascimento, String cnpj){
            this.nome = nome;
            this.dataNascimento = dataNascimento;
            this.cnpj = cnpj;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
    }

