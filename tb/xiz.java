package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.b;
import com.taobao.android.detail.ttdetail.utils.aq;
import com.taobao.android.detail.ttdetail.utils.bq;
import java.util.Map;

/* loaded from: classes3.dex */
public class xiz extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ABILITY_ID;
    public static final String MEGA_NAME = "ttDetail";
    public static final String NAME = "userBehavior";

    /* renamed from: a  reason: collision with root package name */
    public Context f34318a;
    public eyx b;

    public static /* synthetic */ Object ipc$super(xiz xizVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(2063763041);
        DX_ABILITY_ID = fxa.a(NAME);
    }

    public xiz(Context context, eyx eyxVar) {
        this.f34318a = context;
        this.b = eyxVar;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            return new dkw(new dkv(-10086, "params is null"), true);
        }
        JSONObject c = dlhVar.c();
        String string = c.getString("action");
        if (TextUtils.equals(string, "putContent")) {
            String a2 = a(c);
            if (!TextUtils.isEmpty(a2) && (jSONObject = c.getJSONObject("contentInfo")) != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    b.a(this.f34318a, a2, entry.getKey(), entry.getValue());
                }
            }
        } else if (TextUtils.equals(string, "runAbility")) {
            String string2 = c.getString("eventType");
            if (!TextUtils.isEmpty(string2)) {
                b.a(this.f34318a, a(c), string2, aq.b(c.getJSONObject("eventInfo")));
            }
        } else {
            return new dkw(new dkv(-10086, "action is not defined for: " + string), true);
        }
        return new dla();
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("componentName");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = jSONObject.getString("ttHideComponentId");
        return !TextUtils.isEmpty(string2) ? bq.a(this.b.b().a(string2)) : string;
    }

    /* loaded from: classes3.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f34319a;
        public eyx b;

        static {
            kge.a(1706126392);
            kge.a(-1749066050);
        }

        public a(Context context, eyx eyxVar) {
            this.f34319a = context;
            this.b = eyxVar;
        }

        @Override // tb.dln
        public dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : new xiz(this.f34319a, this.b);
        }
    }
}
