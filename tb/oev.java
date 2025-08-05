package tb;

import android.graphics.PointF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oev extends oer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PointF d;

    static {
        kge.a(-1190772359);
    }

    @Override // tb.oem
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 25;
    }

    @Override // tb.oer
    public void b(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b664bf", new Object[]{this, aaVar, view, new Float(f)});
        }
    }

    @Override // tb.oer
    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    public oev(PointF pointF) {
        this.d = pointF;
    }

    @Override // tb.oer
    public void a(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48ab17e", new Object[]{this, aaVar, view, new Float(f)});
        } else if (view == null) {
        } else {
            PointF pointF = this.d;
            if (pointF == null) {
                ogs.a(view);
                return;
            }
            view.setPivotX(pointF.x);
            view.setPivotY(this.d.y);
        }
    }

    @Override // tb.oer
    public void c(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae21800", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            ogs.a(view);
        }
    }

    @Override // tb.oer
    public void d(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0dcb41", new Object[]{this, aaVar, view, new Float(f)});
        } else {
            ogs.a(view);
        }
    }

    public static oev a(PointF pointF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oev) ipChange.ipc$dispatch("1323c667", new Object[]{pointF}) : new oev(pointF);
    }
}
