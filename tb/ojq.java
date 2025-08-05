package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.c;
import tb.awm;

@AURAExtensionImpl(code = "tbbuy.impl.render.component.creator.dx.autoSize")
/* loaded from: classes6.dex */
public final class ojq extends aee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f32122a = 0;
    private int b = 0;

    static {
        kge.a(-1464538944);
    }

    public static /* synthetic */ Object ipc$super(ojq ojqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : ((Boolean) bbc.a(a().a(), "autoSize", Boolean.class, false)).booleanValue();
    }

    @Override // tb.aee
    public awm.b a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awm.b) ipChange.ipc$dispatch("d18c5ea9", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (!b()) {
            return null;
        }
        awm.b bVar = new awm.b();
        bVar.b = i2;
        bVar.f25653a = i;
        Context e = a().e();
        if (ami.c(a().e())) {
            if (this.f32122a == 0) {
                this.f32122a = View.MeasureSpec.makeMeasureSpec(ami.d(e), 1073741824);
                ard a2 = arc.a();
                a2.a("updateRenderParam cacheWidthSpec = " + this.f32122a);
            }
            bVar.f25653a = this.f32122a;
        } else {
            if (this.b == 0) {
                int d = ami.d(e);
                if (c()) {
                    d /= 2;
                }
                this.b = View.MeasureSpec.makeMeasureSpec(d, 1073741824);
                ard a3 = arc.a();
                a3.a("updateRenderParam cacheHeightSpec = " + this.b);
            }
            bVar.f25653a = this.b;
        }
        return bVar;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        Object c = fke.c(a().e());
        if (c == null) {
            tdh.b("EMPTY_CONTAINER_FORM_(isHalfScreen)", "container is empty");
            return false;
        } else if (c instanceof c) {
            return TBBuyPageMode.halfPageMode.equals(((c) c).bc_());
        } else {
            return false;
        }
    }
}
