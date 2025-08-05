package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oep extends oet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private int e;

    static {
        kge.a(-204305406);
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 16;
    }

    @Override // tb.oet
    public void a(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a7e82c", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (component == null || component.getView() == null) {
        } else {
            component.setAnimationBottom(component.getView().getTop() + this.d + ((int) ((((i - this.b) * 1.0f) / (this.c - this.b)) * (this.e - this.d))));
        }
    }

    @Override // tb.oet
    public void b(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e13b8b", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (component == null) {
        } else {
            component.resetAnimationBottom();
        }
    }

    @Override // tb.oet
    public int c() {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f31983a != null && (x = this.f31983a.x()) != null) {
            return x.getBottom();
        }
        return 0;
    }

    public static oep a(aa aaVar, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oep) ipChange.ipc$dispatch("9fb12c28", new Object[]{aaVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
        oep oepVar = new oep();
        oepVar.a(z);
        oepVar.d = i;
        oepVar.e = i2;
        oepVar.a(aaVar, i3, i4);
        return oepVar;
    }
}
