package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.awm;

@AURAExtensionImpl(code = "tbbuy.impl.render.component.creator.dx.float.autoSize")
/* loaded from: classes6.dex */
public final class oqg extends aee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f32287a = 0;
    private int b = 0;

    static {
        kge.a(2111944936);
    }

    public static /* synthetic */ Object ipc$super(oqg oqgVar, String str, Object... objArr) {
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
            if (this.f32287a == 0) {
                this.f32287a = View.MeasureSpec.makeMeasureSpec(ami.d(e), 1073741824);
                ard a2 = arc.a();
                a2.a("float updateRenderParam cacheWidthSpec = " + this.f32287a);
            }
            bVar.f25653a = this.f32287a;
        } else {
            if (this.b == 0) {
                this.b = View.MeasureSpec.makeMeasureSpec(ami.d(e) / 2, 1073741824);
                ard a3 = arc.a();
                a3.a("float updateRenderParam cacheHeightSpec = " + this.b);
            }
            bVar.f25653a = this.b;
        }
        return bVar;
    }
}
