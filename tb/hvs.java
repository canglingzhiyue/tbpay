package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;

/* loaded from: classes6.dex */
public class hvs extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPENNOTIFICATIONSETTING = "6183157295986091279";

    static {
        kge.a(-1280070751);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar == null) {
            return new dla();
        }
        Context a2 = lVar.a();
        if (a2 == null) {
            return new dla();
        }
        Intent d = ibm.d(a2);
        if (a2 instanceof TBOrderBaseActivity) {
            ((Activity) a2).startActivityForResult(d, 1001);
        } else {
            a2.startActivity(d);
        }
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1384731000);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvs a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvs) ipChange.ipc$dispatch("16bbff3d", new Object[]{this, obj}) : new hvs();
        }
    }
}
