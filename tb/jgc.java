package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jgc implements jga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jga
    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (j > 0) {
            jdu.a().b().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            jdu.a().b().execute(runnable);
        }
    }
}
