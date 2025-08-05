package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f30163a;
    private boolean b = false;

    public static /* synthetic */ Runnable a(kmi kmiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("dcb8b7c3", new Object[]{kmiVar}) : kmiVar.f30163a;
    }

    public static /* synthetic */ Runnable a(kmi kmiVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6d7d2305", new Object[]{kmiVar, runnable});
        }
        kmiVar.f30163a = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean a(kmi kmiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a2b42c7", new Object[]{kmiVar, new Boolean(z)})).booleanValue();
        }
        kmiVar.b = z;
        return z;
    }

    public synchronized void a(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (this.b) {
            this.f30163a = runnable;
        } else {
            this.b = true;
            knd.a(new Runnable() { // from class: tb.kmi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    while (kmi.a(kmi.this) != null) {
                        Runnable a2 = kmi.a(kmi.this);
                        kmi.a(kmi.this, (Runnable) null);
                        a2.run();
                    }
                    kmi.a(kmi.this, false);
                }
            }, false);
        }
    }
}
