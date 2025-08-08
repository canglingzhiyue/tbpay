package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class ial extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FOLD_STATE = "foldState";
    public static final String STATE_DISABLE = "DISABLE";
    public static final String STATE_HIDE = "HIDE";
    public static final String STATE_SHOW = "SHOW";
    public static final String STATE_SOLID = "SOLID";
    public static final String VISIBLE = "visible";

    static {
        kge.a(1179098325);
    }

    public static /* synthetic */ Object ipc$super(ial ialVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "3864592043693486457";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        a(eVar.d().getFields());
        if (!(eVar.h() instanceof d)) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(eVar.d());
        eVar.h().a(arrayList);
    }

    private void a(JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null && jSONObject.getString(FOLD_STATE) != null) {
            String string = jSONObject.getString(FOLD_STATE);
            if (StringUtils.isEmpty(string)) {
                return;
            }
            if ("HIDE".equals(string.toUpperCase())) {
                jSONObject.put(FOLD_STATE, "SHOW");
                z = true;
            } else {
                if ("SHOW".equals(string.toUpperCase())) {
                    jSONObject.put(FOLD_STATE, "HIDE");
                } else if (STATE_DISABLE.equals(string.toUpperCase())) {
                    return;
                }
                z = false;
            }
            hzy.a("RefreshComponentV2Subscriber", "replaceFoldState ", "isFold = " + z);
        }
        a((ial) jSONObject);
    }

    private <T> T a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9798556e", new Object[]{this, t});
        }
        if (t instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) t;
            for (int i = 0; i < jSONArray.size(); i++) {
                a((ial) jSONArray.get(i));
            }
        } else if (t instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) t;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONArray) {
                    a((ial) ((JSONArray) value));
                } else if (value instanceof JSONObject) {
                    a((ial) ((JSONObject) value));
                } else if (value instanceof String) {
                    entry.getKey();
                    if ("visible".equals(entry.getKey())) {
                        String str = (String) value;
                        if ("HIDE".equals(str.toUpperCase())) {
                            jSONObject.put("visible", (Object) "SHOW");
                        } else if ("SHOW".equals(str.toUpperCase())) {
                            jSONObject.put("visible", (Object) "HIDE");
                        }
                    }
                }
            }
        }
        hzy.a("RefreshComponentV2Subscriber", "replaceJsonValue", t.toString());
        return t;
    }
}
