package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.c;

/* loaded from: classes6.dex */
public class hvx extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEWCONTAINERSTORAGEREMOVE = "4075834123623453115";

    static {
        kge.a(-350399214);
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
        Context a2 = dleVar.a();
        if (!(a2 instanceof tey)) {
            return new dkw(new dkv(5, "context of ability do not implement IOrderPageStorage"));
        }
        ((tey) a2).c(string);
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1334904343);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvx a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvx) ipChange.ipc$dispatch("16bbffd8", new Object[]{this, obj}) : new hvx();
        }
    }
}
