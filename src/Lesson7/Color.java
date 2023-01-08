package Lesson7;



public enum Color {
    YELLOW("yellow"){
        @Override
        void removeLetter() {
           colorName =YELLOW.getColorName().replace("y","");
        }

        @Override
        void showName() {
            System.out.println(colorName);
        }
    },
    GREEN("green") {
        @Override
        void removeLetter() {
            colorName =GREEN.getColorName().replace("e","");
        }

        @Override
        void showName() {
            System.out.println(colorName);
        }
    },
    BLUE("blue") {
        @Override
        void removeLetter() {
            colorName =BLUE.getColorName().replace("u","");

        }

        @Override
        void showName() {
            System.out.println(colorName);
        }
    },
    GREY("grey") {
        @Override
        void removeLetter() {
            colorName =GREY.getColorName().replace("e","");
        }

        @Override
        void showName() {
            System.out.println(colorName);
        }
    };

    String colorName;
    Color(String colorName){
        this.colorName=colorName;
    }

    public String getColorName() {
        return colorName;
    }

    abstract void removeLetter();
    abstract void showName();
}
