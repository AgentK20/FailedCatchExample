import reactor.core.publisher.Mono;

public class FailingBehavior {
    public static void main(String[] args) {
        Mono.just("hello")
                .map(s -> {
                    throw new ExceptionInInitializerError("test");
                })
                .subscribe(output -> {});
    }
}
