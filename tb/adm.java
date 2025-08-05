package tb;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public interface adm {
    public static final AtomicInteger id = new AtomicInteger(-1);
    public static final AtomicInteger subId = new AtomicInteger(-1);

    String getCurId();
}
