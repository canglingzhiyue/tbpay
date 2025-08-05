package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oes extends oet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1770309374);
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 12;
    }

    @Override // tb.oet
    public void a(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a7e82c", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (component == null) {
        } else {
            component.setAnimationHeight(i);
        }
    }

    @Override // tb.oet
    public void b(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e13b8b", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (component == null) {
        } else {
            component.resetAnimationHeight();
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
            return x.getHeight();
        }
        return 0;
    }

    public static oes a(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oes) ipChange.ipc$dispatch("52699825", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        oes oesVar = new oes();
        oesVar.a(z);
        oesVar.a(aaVar, i, i2);
        return oesVar;
    }
}
