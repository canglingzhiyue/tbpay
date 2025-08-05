package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class rhx extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REFRESHLISTBYORDERIDS = "5489520136482826103";

    static {
        kge.a(1561066114);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject c = dlhVar.c();
        if (c != null && c.getString("orderIdList") != null) {
            arrayList.addAll(Arrays.asList(c.getString("orderIdList").split(",")));
        }
        com.taobao.android.order.bundle.helper.a.a(dleVar.a(), arrayList);
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1306079065);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public rhx a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rhx) ipChange.ipc$dispatch("16c05700", new Object[]{this, obj}) : new rhx();
        }
    }
}
