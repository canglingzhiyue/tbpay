package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class xjy extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRADEONSTAGE = "-4231265500675731027";

    static {
        kge.a(2138601568);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dleVar == null || dleVar.a() == null) {
            return new dkw(new dkv(-1, "context is null"));
        }
        JSONObject c = dlhVar.c();
        if (c == null) {
            return new dkw(new dkv(-2, "params is null"));
        }
        if (!(c.get("stage") instanceof String) || !(c.get("bizType") instanceof String)) {
            return new dkw(new dkv(-3, "data is wrong"));
        }
        c.put("context", (Object) dleVar.a());
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a((String) c.get("stage"), (String) c.get("bizType"), c);
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1104211767);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public xjy a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (xjy) ipChange.ipc$dispatch("16c318db", new Object[]{this, obj}) : new xjy();
        }
    }
}
