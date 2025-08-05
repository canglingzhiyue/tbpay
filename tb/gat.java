package tb;

import android.graphics.PointF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gat implements gao {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PointF c;
    public gao d;
    public boolean e = true;

    static {
        kge.a(-2100765706);
        kge.a(1548859453);
    }

    @Override // tb.gao
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        gao gaoVar = this.d;
        if (gaoVar != null) {
            return gaoVar.a(view);
        }
        return gau.a(view, this.c);
    }

    @Override // tb.gao
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        gao gaoVar = this.d;
        if (gaoVar != null) {
            return gaoVar.b(view);
        }
        return gau.a(view, this.c, this.e);
    }
}
