public class Animals {
    public void voice(String s) {

        System.out.println("Голос " + s);
    }

    public class Bear extends Animals {
                @Override
        public void voice(String s) {
            System.out.println("R-r-r-r");

        }
    }

    public class Cat extends Animals {
        @Override
        public void voice(String s) {
            System.out.println("meooooow");
//            return null;
        }
    }

    public class Dog extends Animals {
        @Override
        public void voice(String s) {
            System.out.println("Haf-haf");
//            return null;
        }

    }
    public static void main(String[] args) {
//            Animals animal1 = new Dog();
//            Animals animal2 = new Cat();
//            Animals animal3 = new Bear();
//
//            animal1.voice();
//            animal2.voice();
//            animal3.voice();
    }
}


