package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class clg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static clg f26346a = new clg();
    private Thread b = null;
    private LinkedList<Runnable> c = new LinkedList<>();

    public static /* synthetic */ LinkedList a(clg clgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("421c9b74", new Object[]{clgVar}) : clgVar.c;
    }

    public static clg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (clg) ipChange.ipc$dispatch("f0347c0", new Object[0]) : f26346a;
    }

    public static /* synthetic */ Thread b(clg clgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("50cf13ac", new Object[]{clgVar});
        }
        clgVar.b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        this.c.add(runnable);
        if (this.b == null) {
            this.b = new Thread(new Runnable() { // from class: tb.clg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Process.setThreadPriority(0);
                        while (!clg.a(clg.this).isEmpty()) {
                            Runnable runnable2 = (Runnable) clg.a(clg.this).get(0);
                            clg.a(clg.this).remove(0);
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    } catch (Exception unused) {
                    } finally {
                        clg.b(clg.this);
                    }
                }
            }, "APSecuritySdk");
            this.b.start();
        }
    }
}
