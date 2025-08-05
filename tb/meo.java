package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import tb.dsu;

/* loaded from: classes6.dex */
public class meo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1749721805);
    }

    public static void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{bdVar});
        } else {
            bdVar.d().a(icv.DX_PARSER_ID, new icv());
        }
    }

    public static void b(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290e0723", new Object[]{bdVar});
            return;
        }
        bdVar.d().a(icw.ID, new icw());
        bdVar.d().a(7700670404894374791L, new mqm());
    }

    public static void a(dsu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b3b6f5", new Object[]{aVar});
        } else {
            aVar.a(icv.DX_PARSER_ID, new icv());
        }
    }

    public static void b(dsu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8f2136", new Object[]{aVar});
            return;
        }
        aVar.a(icw.ID, new icw());
        aVar.a(7700670404894374791L, new mqm());
    }
}
