public class ledSubsystem {
        private String color; 
        private int cycleCount = 0; 
    
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
    
        public void twoColorsBlink(String color1, String color2) {
            cycleCount++;
            if (cycleCount % 3 == 0) {
                if (this.color.equals(color1)) {
                    this.color = color2;
                } else {
                    this.color = color1;
                }
            }
    }
            
        public void oneColorBlink(String color) {
                if (this.color.equals(color)) {
                    this.color = "";
                } else {
                    this.color = color;
                }
            }
            public void twoColorsBlink2(String color1, String color2){
                cycleCount++;
                if (cycleCount %2 == 0){
                    if (cycleCount %6 == 0)
                }
            }
            private int cycleCount = 0;
             private int blinkRate = 2; 

    public void twoColorsBlinkVariableRate(String color1, String color2) {
        cycleCount++;

        if (cycleCount % blinkRate == 0) {
            if (color.equals(color1)) {
                color = color2;
            } else {
                color = color1;
            }
        }

        if (cycleCount % 6 == 0) {
            blinkRate = (blinkRate == 2) ? 4 : 2;
        }
    }
    
        }
    

