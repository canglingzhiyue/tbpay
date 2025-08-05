package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.c;

/* loaded from: classes6.dex */
public class hvy extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEWCONTAINERSTORAGESET = "5066898434423252598";

    static {
        kge.a(-983671588);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null) {
            return new dkw(new dkv(1, c.LOAD_DATA_NULL));
        }
        JSONObject c = dlhVar.c();
        if (c == null) {
            return new dkw(new dkv(2, "params is null"));
        }
        String string = c.getString("key");
        if (TextUtils.isEmpty(string)) {
            return new dkw(new dkv(3, "key is empty"));
        }
        Object obj = c.get("value");
        if (obj == null) {
            return new dkw(new dkv(4, "value is null"));
        }
        Context a2 = dleVar.a();
        if (!(a2 instanceof tey)) {
            return new dkw(new dkv(5, "context of ability do not implement IOrderPageStorage"));
        }
        ((tey) a2).a(string, obj);
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1766287437);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvy a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvy) ipChange.ipc$dispatch("16bbfff7", new Object[]{this, obj}) : new hvy();
        }
    }
}
