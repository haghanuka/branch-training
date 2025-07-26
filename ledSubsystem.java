public class ledSubsystem {
        private String color; 
        private int cycleCount = 0; // Counter for blink cycles
    
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
    
        public void updateBlink(String color1, String color2) {
            cycleCount++;
            if (cycleCount % 3 == 0) {
                if (this.color.equals(color1)) {
                    this.color = color2;
                } else {
                    this.color = color1;
                }
            }
        }
    }


