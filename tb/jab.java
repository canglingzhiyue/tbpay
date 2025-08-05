package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ag;

/* loaded from: classes6.dex */
public class jab extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEWPAGERCHANGEINDEX = "-8963138421018785284";

    static {
        kge.a(1415802216);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return new dkw(new dkv(30009, "rootViewContext为空"), true);
        }
        DXWidgetNode d = h.d();
        if (d == null) {
            return new dkw(new dkv(30009, "rootWidget为空"), true);
        }
        String c = dlhVar.c("viewPagerUserId");
        if (TextUtils.isEmpty(c)) {
            return new dkw(new dkv(30009, "userId为空"), true);
        }
        DXWidgetNode queryWidgetNodeByUserId = d.queryWidgetNodeByUserId(c);
        if (!(queryWidgetNodeByUserId instanceof ag)) {
            return new dkw(new dkv(30009, "查找tabheader出错"), true);
        }
        int a2 = dmo.a(dlhVar.c(), "index", -1);
        if (a2 < 0) {
            return new dkw(new dkv(30009, "index 值出错"), true);
        }
        ((ag) queryWidgetNodeByUserId).a(a2, dmo.a(dlhVar.c(), "animated", true));
        return new dla();
    }
}
