package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class aos implements Thread.UncaughtExceptionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aos f25483a;
    private Thread.UncaughtExceptionHandler b;
    private List<aot> c = Collections.synchronizedList(new ArrayList());

    static {
        kge.a(-1881667353);
        kge.a(379224950);
        f25483a = new aos();
    }

    public static aos a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aos) ipChange.ipc$dispatch("f026bb9", new Object[0]) : f25483a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            try {
                this.c.get(i).a(thread, th);
            } catch (Throwable unused) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
        if (uncaughtExceptionHandler2 == null) {
            return;
        }
        uncaughtExceptionHandler2.uncaughtException(thread, th);
    }

    public void a(aot aotVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06cef12", new Object[]{this, aotVar});
        } else {
            this.c.add(aotVar);
        }
    }
}
