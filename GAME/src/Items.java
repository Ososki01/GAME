public abstract class Items {
        private String name;
        private int weight;
        private int value;

        public Items(String name,int weight,int value)
        {
            this.name=name;
            this.weight=weight;
            this.value=value;

        }






        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

    }