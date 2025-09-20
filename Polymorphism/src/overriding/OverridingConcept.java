package overriding;
class Television {
    void watch(String channelname){
        System.out.println("Television have the following channels:");
    }
}
class Movie extends Television{
    @Override
    void watch(String channelname) {
        System.out.println("Television plays the" + channelname + "channel");
    }
}

class Cartoon extends Television{
    @Override
    void watch(String channelname) {
        System.out.println("Television plays the" + channelname + "channel");
    }
}

class Serial extends Television{
    @Override
    void watch(String channelname) {
        System.out.println("Television plays the" + channelname + "channel");
    }
}

public class OverridingConcept {
    public static void main(String[] args){

        Television t1 = new Movie();
        Television t2 = new Cartoon();
        Television t3 = new Serial();

        t1.watch(" StarGold ");
        t2.watch(" PoGo ");
        t3.watch(" ZeeMarathi ");

    }
}
