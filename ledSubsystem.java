public class ledSubsystem {
        private String color; 
    
        public ledSubsystem() {
            this.color = ""; 
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public void turnOff() {
            this.color = "";
        }
    
        public String getColor() {
            return this.color;
        }
    }


