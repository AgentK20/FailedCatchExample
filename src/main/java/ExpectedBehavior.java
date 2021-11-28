import reactor.core.publisher.Mono;

public class ExpectedBehavior {
    public static void main(String[] args) {
        Mono.just("hello")
                .map(s -> {
                    throw new Error("test");
                })
                .subscribe(output -> {});
    }
}
