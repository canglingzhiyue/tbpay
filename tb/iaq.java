package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabClickEvent;

/* loaded from: classes6.dex */
public class iaq extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_SUCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private hzf f28881a;

    static {
        kge.a(-245269918);
    }

    public static /* synthetic */ Object ipc$super(iaq iaqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "2198668913342927770";
    }

    public iaq(hzf hzfVar) {
        this.f28881a = hzfVar;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        String string = e(eVar).getString("tabCode");
        if (StringUtils.isEmpty(string)) {
            string = h();
        }
        this.f28881a.c();
        this.f28881a.d(string);
        JSONArray jSONArray = eVar.d().getFields().getJSONArray("tabs");
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            if (jSONObject.getString("isSelected").equals("true")) {
                jSONObject.put("isSelected", (Object) "false");
            }
            if (jSONObject.getString("tabCode").equals(string)) {
                jSONObject.put("isSelected", (Object) "true");
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tab", (Object) jSONArray);
        a(eVar, "success", jSONObject2);
    }

    private String h() {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.c == null) {
            return null;
        }
        Object d = this.c.d(f.KEY_DXEVENT);
        if (!(d instanceof DXOnTabClickEvent) || (data = ((DXOnTabClickEvent) d).getData()) == null) {
            return null;
        }
        return data.getString("tabCode");
    }
}
