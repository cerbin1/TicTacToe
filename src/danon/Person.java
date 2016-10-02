package danon;

interface Person {
    String getGreeting();

    int getAge();
}

class Bartek implements Person {
    @Override
    public String getGreeting() {
        return "Poka bydle";
    }

    @Override
    public int getAge() {
        return 20;
    }
}

class Daniel implements Person {
    @Override
    public String getGreeting() {
        return "Hejo";
    }

    @Override
    public int getAge() {
        return 19;
    }
}

class Popek implements Person {
    @Override
    public String getGreeting() {
        return "Pizda nad głową";
    }

    @Override
    public int getAge() {
        return 35;
    }
}

class Eminem implements Person {
    @Override
    public String getGreeting() {
        return "Mom's spaghetti";
    }

    @Override
    public int getAge() {
        return 32;
    }
}
