package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ifx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TASK_TYPE_DEFAULT = 1000;
    public static final int TASK_TYPE_HIGH_EXPEND = 3003;
    public static final int TASK_TYPE_LOW_EXPEND = 3001;
    public static final int TASK_TYPE_MID_EXPEND = 3002;

    /* renamed from: a  reason: collision with root package name */
    public static float f29003a;
    public static float b;
    public static float c;
    public Runnable d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public String j;
    public HashMap<String, String> k;

    static {
        kge.a(1771029737);
        f29003a = 1.0f;
        b = 2.0f;
        c = 4.0f;
    }

    public ifx(Runnable runnable, int i, long j, String str) {
        this.d = runnable;
        this.i = i;
        this.f = System.nanoTime();
        this.e = this.f + TimeUnit.MILLISECONDS.toNanos(j);
        this.j = str;
    }

    public ifx(Runnable runnable, String str) {
        this(runnable, 1000, 500L, str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            if (this.k == null) {
                this.k = new HashMap<>();
            }
            this.k.put(str, str2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long nanoTime = System.nanoTime();
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
        this.h = System.nanoTime() - this.f;
        this.g = System.nanoTime() - nanoTime;
    }
}
