package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.m;
import java.util.Map;

/* loaded from: classes4.dex */
public class smw extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEGA_NAME = "abilityHub";
    public static final String NAME = "bxSubscribe";

    /* renamed from: a  reason: collision with root package name */
    public static final long f33724a;

    static {
        kge.a(-1342803354);
        f33724a = fxa.a(NAME);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            return new dkw(new dkv(90030, "params is null"), true);
        }
        try {
            JSONObject c = dlhVar.c();
            String string = c.getString("bxAction");
            String string2 = c.getString("pageName");
            String string3 = c.getString("arg1");
            JSONObject jSONObject = c.getJSONObject("args");
            if (TextUtils.isEmpty(string3)) {
                JSONObject jSONObject2 = c.getJSONObject("data");
                String string4 = jSONObject2.getString("arg1");
                jSONObject = jSONObject2.getJSONObject("args");
                str = string4;
            } else {
                str = string3;
            }
            if (TextUtils.equals("click", string)) {
                odg.l().a(string2, str, (String) null, m.a((Map<String, ? extends Object>) jSONObject));
            } else if (TextUtils.equals("appear", string)) {
                odg.l().a(string2, str, null, null, m.a((Map<String, ? extends Object>) jSONObject));
            }
            return new dla();
        } catch (Exception unused) {
            return new dkw(new dkv(90030, "execute exception"));
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-212892867);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : new smw();
        }
    }
}
