package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class tft extends oet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(487430895);
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 26;
    }

    @Override // tb.oet
    public void a(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a7e82c", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else if (!(component instanceof u)) {
            if (view == null) {
                return;
            }
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() <= 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            childAt.setPadding(i, childAt.getPaddingTop(), childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    @Override // tb.oet
    public void b(aa aaVar, Component component, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e13b8b", new Object[]{this, aaVar, component, view, new Integer(i)});
        } else {
            aaVar.a(a.ATOM_EXT_UDL_padding_left, (Object) Integer.valueOf(i), false);
        }
    }

    @Override // tb.oet
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f31983a != null) {
            View x = this.f31983a.x();
            if (this.f31983a.I() instanceof u) {
                ViewGroup viewGroup = (ViewGroup) x;
                if (viewGroup.getChildCount() > 0) {
                    return viewGroup.getChildAt(0).getPaddingLeft();
                }
            } else if (x != null) {
                return x.getPaddingLeft();
            }
        }
        return 0;
    }

    public static tft a(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tft) ipChange.ipc$dispatch("526be1e0", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        tft tftVar = new tft();
        tftVar.a(z);
        tftVar.a(aaVar, i, i2);
        return tftVar;
    }
}
