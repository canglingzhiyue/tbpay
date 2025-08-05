package com.taobao.message.notification.banner.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class StickPublish<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Consumer<T> mConsumer;
    private List<T> mList = new ArrayList();

    /* loaded from: classes7.dex */
    public interface Consumer<T> {
        void accept(T t);
    }

    static {
        kge.a(999087250);
    }

    public void emitter(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142f5591", new Object[]{this, t});
            return;
        }
        Consumer<T> consumer = this.mConsumer;
        if (consumer != null) {
            consumer.accept(t);
        } else {
            this.mList.add(t);
        }
    }

    public void subscribe(Consumer<T> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76648228", new Object[]{this, consumer});
        } else if (consumer != null) {
            this.mConsumer = consumer;
            if (this.mList.size() <= 0) {
                return;
            }
            for (T t : this.mList) {
                this.mConsumer.accept(t);
            }
        }
    }
}
