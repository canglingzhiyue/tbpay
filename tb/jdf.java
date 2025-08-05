package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.extension.ability.validate.c;
import com.taobao.android.dinamicx.bd;
import tb.dtg;
import tb.mqu;

/* loaded from: classes4.dex */
public class jdf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1002433879);
    }

    public static void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{bdVar});
            return;
        }
        bdVar.d().l().a("-8184561642900287420", c.class, "validatesData");
        bdVar.d().l().a("3653929102547346655", dti.class, "sequenceData");
    }

    public static void b(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290e0723", new Object[]{bdVar});
            return;
        }
        bdVar.a(dtg.DX_WIDGET_ID, new dtg.a());
        bdVar.a(mqu.WIDGET_ID, new mqu.a());
    }

    public static void c(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb5daa4", new Object[]{bdVar});
            return;
        }
        bdVar.a(1544903441687469454L, new axe());
        bdVar.a(-489609274268614298L, new dsy());
    }
}
