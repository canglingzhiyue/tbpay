package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oez extends oer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2119441301);
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
        return 19;
    }

    @Override // tb.oer
    public void b(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b664bf", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            view.setRotationY(f);
        }
    }

    @Override // tb.oer
    public void c(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae21800", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            aaVar.a("rotateY", (Object) Float.valueOf(f), false);
        }
    }

    @Override // tb.oer
    public float c() {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        if (this.f31980a != null && (x = this.f31980a.x()) != null) {
            return x.getRotationY();
        }
        return 0.0f;
    }

    public static oez a(aa aaVar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oez) ipChange.ipc$dispatch("7ca6909e", new Object[]{aaVar, new Float(f), new Float(f2), new Boolean(z)});
        }
        oez oezVar = new oez();
        oezVar.a(z);
        oezVar.a(aaVar, f, f2);
        return oezVar;
    }
}
