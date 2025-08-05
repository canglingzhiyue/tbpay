package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.aa;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;
import tb.toa;

/* loaded from: classes9.dex */
public final class tob implements toa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private shc f34238a;
    private final f b;

    static {
        kge.a(-1685609310);
        kge.a(-934918989);
    }

    public tob(f instance) {
        q.d(instance, "instance");
        this.b = instance;
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        toa.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            toa.a.b(this);
        }
    }

    @Override // tb.toa
    public void a(shc span) {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb9cb6a", new Object[]{this, span});
            return;
        }
        q.d(span, "span");
        this.f34238a = span;
        ITMSPage c = this.b.b().c();
        if (c == null || (aaVar = (aa) c.a(aa.class)) == null) {
            return;
        }
        aaVar.a(false);
    }

    @Override // tb.toa
    public shc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shc) ipChange.ipc$dispatch("f0a7e30", new Object[]{this}) : this.f34238a;
    }
}
