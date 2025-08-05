package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oen extends oer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1443149163);
    }

    @Override // tb.oer
    public void a(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48ab17e", new Object[]{this, aaVar, view, new Float(f)});
        }
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // tb.oer
    public void b(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b664bf", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            view.setAlpha(f);
        }
    }

    @Override // tb.oer
    public void c(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae21800", new Object[]{this, aaVar, view, new Float(f)});
            return;
        }
        boolean w = aaVar.w();
        aaVar.a("opacity", (Object) Float.valueOf(f), false);
        if (!oeb.a("fixAlphaClickListener", true) || !w) {
            return;
        }
        aaVar.I().updateClickListener();
    }

    @Override // tb.oer
    public float c() {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        if (this.f31980a != null && (x = this.f31980a.x()) != null) {
            return x.getAlpha();
        }
        return 0.0f;
    }

    public static oen a(aa aaVar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oen) ipChange.ipc$dispatch("7ca68f2a", new Object[]{aaVar, new Float(f), new Float(f2), new Boolean(z)});
        }
        oen oenVar = new oen();
        oenVar.a(z);
        oenVar.a(aaVar, f, f2);
        return oenVar;
    }
}
