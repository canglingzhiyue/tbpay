package tb;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class dai {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f26639a = new AtomicInteger();
    private Handler c;
    private volatile boolean f;

    public boolean a() {
        return this.f;
    }

    public void d() {
        this.f = false;
        Handler handler = this.c;
        if (handler != null) {
            handler.obtainMessage(2).sendToTarget();
        }
    }
}
