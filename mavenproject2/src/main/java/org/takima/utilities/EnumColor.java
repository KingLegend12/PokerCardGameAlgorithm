package org.takima.utilities;

public enum EnumColor {


        Square("square"),
        Spade("spade"),
        Club("club"),
        Hearth("hearth");

        private final String name;

        EnumColor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

}
