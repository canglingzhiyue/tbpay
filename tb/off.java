package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class off extends oet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1732190467);
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 11;
    }

    @Override // tb.oet
    public void a(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a7e82c", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (component == null) {
        } else {
            component.setAnimationWidth(i);
        }
    }

    @Override // tb.oet
    public void b(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e13b8b", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (component == null) {
        } else {
            component.resetAnimationWidth();
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
            return x.getWidth();
        }
        return 0;
    }

    public static off a(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (off) ipChange.ipc$dispatch("52699a53", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        off offVar = new off();
        offVar.a(z);
        offVar.a(aaVar, i, i2);
        return offVar;
    }
}
