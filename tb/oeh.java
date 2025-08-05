package tb;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oeh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VALUE = -1;
    public PointF c;
    public PointF d;
    public ofg h;

    /* renamed from: a  reason: collision with root package name */
    public int f31971a = -1;
    public int b = -1;
    public float e = -1.0f;
    public int f = 1;
    public int g = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;

    static {
        kge.a(-670834651);
    }

    public static oeh a(aa aaVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (oeh) ipChange.ipc$dispatch("ce972924", new Object[]{aaVar});
        }
        View x = aaVar.x();
        if (x == null) {
            return null;
        }
        oeh oehVar = new oeh();
        oehVar.f31971a = x.getWidth();
        oehVar.b = x.getHeight();
        oehVar.e = x.getAlpha();
        if (aaVar.I() instanceof u) {
            ViewGroup viewGroup = (ViewGroup) x;
            if (viewGroup.getChildCount() > 0) {
                i = viewGroup.getChildAt(0).getPaddingLeft();
            }
        } else {
            i = x.getPaddingLeft();
        }
        oehVar.i = i;
        oehVar.j = x.getPaddingRight();
        oehVar.k = x.getPaddingTop();
        oehVar.l = x.getPaddingBottom();
        oehVar.h = new ofg();
        oehVar.h.c = x.getRotation();
        oehVar.h.f31986a = x.getRotationX();
        oehVar.h.b = x.getRotationY();
        oehVar.h.e = new PointF();
        oehVar.h.e.x = x.getTranslationX();
        oehVar.h.e.y = x.getTranslationY();
        oehVar.h.d = new PointF();
        oehVar.h.d.x = x.getScaleX();
        oehVar.h.d.y = x.getScaleY();
        oehVar.f = oeo.a(x);
        oehVar.g = (int) oeq.a(x);
        return oehVar;
    }
}
