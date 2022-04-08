package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	// You need to implement this class
	private String reader;

	public NewsSubscriber(String reader){
		this.reader = reader;
	}

	@Override
	public void onSubscribe(Subscription subscription){
		System.out.printf("%s subscribed for %s\n", reader, subscription.getClass().getName());
	}

	@Override
    public void onNext(News item) {
        System.out.printf("%s get the news (%s): %s\n", reader, item.getClass().getName(), item.getContent());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.printf("NewsSubscribe Error!");
    }

    @Override
    public void onComplete() {
		System.out.printf("NewsSubscribe Complete!");
	}
}
