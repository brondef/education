package lesson1.enums;

public enum Color {
        WHITE("�����"),
        BLACK("׸����"),
        BROWN("����������"),
        GRAY("�����"),
        YELLOW("������"),
        RED("�������");

        private String name;

        Color(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }
}
