package lesson1.enums;

public enum Color {
        WHITE("Белый"),
        BLACK("Чёрный"),
        BROWN("Корчиневый"),
        GRAY("Серый"),
        YELLOW("Желтый"),
        RED("Красный");

        private String name;

        Color(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }
}
