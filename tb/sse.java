package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.arch.flow.view.d;

/* loaded from: classes6.dex */
public class sse extends sry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1247630718);
    }

    public static /* synthetic */ Object ipc$super(sse sseVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1445565382) {
            super.b(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1544639176) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // tb.ssb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 102;
    }

    public sse(sro sroVar, srk srkVar, a aVar, srw srwVar, d.a aVar2) {
        super(sroVar, srkVar, aVar, srwVar, aVar2);
    }

    @Override // tb.sry
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(i, i2);
        c e = this.f33876a.e();
        if (e == null || e.c()) {
            kej.a("2ARCH_ViewShownState", "handle baseView null: ");
        } else {
            this.b.a(this.f33876a.e(), i2);
        }
    }

    @Override // tb.sry
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kej.a("2ARCH_ViewShownState", "onTimeOut: ");
        this.d.a(104, this.e);
    }

    @Override // tb.sry, tb.srs
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        this.f.b();
        kej.a("2ARCH_ViewShownState", "notifyViewShown: ");
        this.f33876a.a(new d.a.InterfaceC0637a() { // from class: tb.sse.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.bootimage.arch.flow.view.d.a.InterfaceC0637a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    sse.this.d.a(104, sse.this.e);
                }
            }
        });
    }
}
