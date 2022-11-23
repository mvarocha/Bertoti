public abstract class Carro {
    public class Carro {

        private String placa;
        private String marca;
        private Double km;
        
        public Carro() {
            
        }
        public Carro(String placa, String marca, Double km) {
            super();
            this.placa = placa;
            this.marca = marca;
            this.km = km;
        }
    
    
        public String getPlaca() {
            return placa;
        }
    
    
        public void setPlaca(String placa) {
            this.placa = placa;
        }
    
    
        public String getMarca() {
            return marca;
        }
    
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
    
        public Double getKm() {
            return km;
        }
    
    
        public void setKm(Double km) {
            this.km = km;
        }
        
        public void setInfo(String placa, String marca, Double km) {
            this.placa = placa;
            this.marca = marca;
            this.km = km;
            
            Notifica.mandarNotificacao(placa, marca, km);
            
            
        }
    
    
        @Override
        public String toString() {
            return "Carro [placa=" + placa + ", marca=" + marca + ", km=" + km + "]";
        }
        
        
    }
}
