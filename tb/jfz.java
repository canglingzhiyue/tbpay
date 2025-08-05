package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jfz implements jga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29531a = new Handler();

    @Override // tb.jga
    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (j <= 0) {
            this.f29531a.post(runnable);
        } else {
            this.f29531a.postDelayed(runnable, j);
        }
    }
}
