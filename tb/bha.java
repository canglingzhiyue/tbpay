package tb;

import com.alibaba.android.split.u;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bha implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private u f25892a;
    private String b;

    static {
        kge.a(-2059823266);
        kge.a(-1390502639);
    }

    @Override // java.lang.Runnable
    @Deprecated
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        }
    }

    public bha(u uVar, String str) {
        this.f25892a = uVar;
        this.b = str;
    }
}
