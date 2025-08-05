package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.drawable.b;

/* loaded from: classes8.dex */
public class oeo extends oet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-36983540);
    }

    public static /* synthetic */ Object ipc$super(oeo oeoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 9;
    }

    public static int a(View view) {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{view})).intValue();
        }
        if (view == null) {
            return 0;
        }
        Drawable background = view.getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        if ((background instanceof b.C0848b) && (c = ((b.C0848b) background).c()) != 1) {
            return c;
        }
        return 0;
    }

    public static oeo a(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oeo) ipChange.ipc$dispatch("526997a9", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        oeo oeoVar = new oeo();
        oeoVar.a(z);
        oeoVar.a(aaVar, i, i2);
        return oeoVar;
    }

    private void c(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901a8eea", new Object[]{this, aaVar, component, view, new Integer(i)});
            return;
        }
        ogl viewParams = component.getViewParams();
        int i2 = viewParams.aE;
        viewParams.aE = i;
        c.a(aaVar.x(), b.a(view.getBackground(), viewParams));
        viewParams.aE = i2;
    }

    @Override // tb.oet
    public int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue() : ((Integer) aby.a().evaluate(f, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue();
    }

    @Override // tb.oet
    public void a(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a7e82c", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else {
            c(aaVar, aaVar.I(), view, i);
        }
    }

    @Override // tb.oet
    public void b(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e13b8b", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else {
            c(aaVar, aaVar.I(), view, i);
        }
    }

    @Override // tb.oet
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f31983a == null) {
            return 0;
        }
        return a(this.f31983a.x());
    }
}
