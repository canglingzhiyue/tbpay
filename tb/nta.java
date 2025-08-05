package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nta extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e;
    private final Boolean f;
    private final ius<?, ?, ?> g;
    private final int h;
    private final nsz i;

    static {
        kge.a(-966507633);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nta(View view, Boolean bool, ius<?, ?, ?> widget, boolean z, int i, nsz nszVar) {
        super(view, z, new d(1000, 1001, 3000), 0);
        q.c(widget, "widget");
        this.f = bool;
        this.g = widget;
        this.h = i;
        this.i = nszVar;
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (q.a((Object) this.f, (Object) true)) {
            if (i != 0) {
                if (i <= 0) {
                    z = false;
                }
                if (this.e != z) {
                    nsz nszVar = this.i;
                    if (nszVar != null) {
                        nszVar.a(z);
                    }
                    this.e = z;
                }
            }
            return 0;
        }
        float f = this.b;
        float f2 = f - i;
        int i4 = this.h;
        View view = this.f14987a;
        q.a((Object) view, "view");
        int min = Math.min(i4, view.getMeasuredHeight());
        if (i < 0 && f2 > 0) {
            f2 = 0.0f;
        } else if (i > 0) {
            View view2 = this.f14987a;
            q.a((Object) view2, "view");
            float measuredHeight = (view2.getMeasuredHeight() + f2) - g();
            if (!f()) {
                measuredHeight += i2;
            }
            float f3 = i2 + min;
            if (measuredHeight < f3) {
                if (!f()) {
                    f3 = min;
                }
                View view3 = this.f14987a;
                q.a((Object) view3, "view");
                f2 = (f3 - view3.getMeasuredHeight()) + g();
            }
        }
        this.b = (int) f2;
        if (f()) {
            View view4 = this.f14987a;
            q.a((Object) view4, "view");
            a(1.0f - ((Math.abs(this.b) * 1.0f) / (((view4.getMeasuredHeight() - g()) - i2) - min)));
        } else {
            View view5 = this.f14987a;
            q.a((Object) view5, "view");
            a(1.0f - ((Math.abs(this.b) * 1.0f) / ((view5.getMeasuredHeight() - g()) - min)));
        }
        if (h() >= 1.0E-6f) {
            z = false;
        }
        if (this.e != z) {
            nsz nszVar2 = this.i;
            if (nszVar2 != null) {
                nszVar2.a(z);
            }
            this.e = z;
        }
        return (int) (f - f2);
    }
}
