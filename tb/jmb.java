package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jmb implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f29625a;
    private long c;
    private a e;
    private boolean d = false;
    private long b = System.nanoTime();

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1444525228);
        kge.a(-569788179);
    }

    public jmb() {
        long j = this.b;
        this.f29625a = j;
        this.c = j;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96294cdc", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.d) {
        } else {
            if (TimeUnit.NANOSECONDS.toMillis(j - this.f29625a) > 10000) {
                String str = "idle check timeout. instance:" + hashCode();
                this.d = true;
                return;
            }
            long j2 = j - this.b;
            if (j2 > orq.FRAME_TIME_NANO && j2 / orq.FRAME_TIME_NANO > 10) {
                String str2 = "block happened. instance:" + hashCode();
                this.c = j;
            }
            if (TimeUnit.NANOSECONDS.toMillis(j - this.c) > jmh.a(jmg.CONFIG_KEY_SMOOTH_DURATION, 2000L)) {
                String str3 = "sommth checked. instance:" + hashCode();
                this.d = true;
                a aVar = this.e;
                if (aVar == null) {
                    return;
                }
                aVar.a();
                return;
            }
            this.b = j;
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
