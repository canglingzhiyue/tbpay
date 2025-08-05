package tb;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.drawable.b;

/* loaded from: classes8.dex */
public class oeq extends oer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2126497269);
    }

    public static /* synthetic */ Object ipc$super(oeq oeqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
        return 24;
    }

    public static float a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35a", new Object[]{view})).floatValue();
        }
        Drawable background = view.getBackground();
        if (!(background instanceof b.C0848b)) {
            return 0.0f;
        }
        return ((b.C0848b) background).b();
    }

    public static oeq a(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oeq) ipChange.ipc$dispatch("526997e7", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        oeq oeqVar = new oeq();
        oeqVar.a(z);
        oeqVar.a(aaVar, i, i2);
        return oeqVar;
    }

    private void a(Component component, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11337bd1", new Object[]{this, component, view, new Float(f)});
            return;
        }
        Drawable a2 = b.a(view.getBackground(), component.getViewParams());
        if (!(a2 instanceof GradientDrawable)) {
            return;
        }
        ((GradientDrawable) a2).setCornerRadius(f);
    }

    @Override // tb.oer
    public void b(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b664bf", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            a(aaVar.I(), view, f);
        }
    }

    @Override // tb.oer
    public void c(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae21800", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            a(aaVar.I(), view, f);
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
            return a(x);
        }
        return 0.0f;
    }
}
