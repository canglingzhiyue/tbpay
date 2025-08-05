package tb;

import com.alibaba.android.aura.f;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class ejx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27353a = false;
    public boolean b = true;

    static {
        kge.a(-1860960000);
    }

    public abstract void a(AURAEventIO aURAEventIO);

    public abstract void a(boolean z);

    public abstract void b(AURAEventIO aURAEventIO);

    public abstract void b(boolean z);

    public abstract void c(AURAEventIO aURAEventIO, f fVar);

    public abstract void d(AURAEventIO aURAEventIO, f fVar);

    public final void a(AURAEventIO aURAEventIO, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429c0768", new Object[]{this, aURAEventIO, fVar});
        } else if (this.f27353a) {
        } else {
            c(aURAEventIO, fVar);
            a(false);
            b(false);
            a(aURAEventIO);
        }
    }

    public final void b(AURAEventIO aURAEventIO, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8874e9", new Object[]{this, aURAEventIO, fVar});
        } else if (!this.f27353a) {
        } else {
            d(aURAEventIO, fVar);
            a(true);
            b(true);
            b(aURAEventIO);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }
}
