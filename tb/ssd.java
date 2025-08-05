package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.d;

/* loaded from: classes6.dex */
public class ssd extends sry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2067243433);
    }

    public static /* synthetic */ Object ipc$super(ssd ssdVar, String str, Object... objArr) {
        if (str.hashCode() == -1416936231) {
            super.c(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ssb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 104;
    }

    public ssd(sro sroVar, srk srkVar, a aVar, srw srwVar, d.a aVar2) {
        super(sroVar, srkVar, aVar, srwVar, aVar2);
    }

    @Override // tb.sry
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f33876a == null) {
        } else {
            if (i2 == 205) {
                this.f33876a.p();
            }
            kej.a("2ARCH_TerminateState", "handle close --> " + this.f33876a.f());
            this.b.a(i2, this.f33876a.f(), this.f33876a.u());
        }
    }

    @Override // tb.sry, tb.srs
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        super.c(i);
        kej.a("2ARCH_TerminateState", "notifyTerminate: ");
        this.f33876a.p();
    }
}
