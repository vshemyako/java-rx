package rx.knowledge.sharing.error;

import org.junit.Test;
import rx.Observable;

import static rx.knowledge.sharing.error.Messages.ERROR;
import static rx.knowledge.sharing.error.Messages.FINISH_MESSAGE;
import static rx.knowledge.sharing.error.Messages.START_MESSAGE;

public class ErrorNote001_OnErrorCallback {


    /**
     * Subscriber can provide a callback which will be invoked in case Observable's
     * pipeline encounters error.
     */
    @Test
    public void shouldNotifyObserverAboutError() {
        System.out.println(START_MESSAGE);

        Observable.<String>error(new IllegalStateException(ERROR))
                .subscribe(
                        event -> System.out.println(event),
                        error -> System.err.println(error)
                );

        System.out.println(FINISH_MESSAGE);
    }
}
