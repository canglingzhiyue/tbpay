package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.protocolCache")
/* loaded from: classes2.dex */
public final class avn extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(546742003);
    }

    public static /* synthetic */ Object ipc$super(avn avnVar, String str, Object... objArr) {
        if (str.hashCode() == -362309544) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        com.alibaba.android.aura.datamodel.parse.a aVar2;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (!aVar.c().equals(com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE) || !(aURAInputData.getData() instanceof AURAParseIO) || (aVar2 = ((AURAParseIO) aURAInputData.getData()).getData().get(0)) == null || (a2 = aVar2.a()) == null) {
            return;
        }
        JSONObject jSONObject = a2.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        JSONObject jSONObject2 = a2.getJSONObject("container");
        if (jSONObject2 == null) {
            a(jSONObject, a2);
        } else {
            b(jSONObject, jSONObject2);
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject == null || (jSONObject3 = jSONObject.getJSONObject("meta")) == null || (jSONObject4 = jSONObject3.getJSONObject("template")) == null) {
        } else {
            String string = jSONObject4.getString("id");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            s b = a().b();
            Object a2 = bao.a(b, bao.CACHE_KEY_TEMPLATE_CONTAINER + string);
            if (!(a2 instanceof JSONObject)) {
                return;
            }
            jSONObject2.put("container", a2);
        }
    }

    private void b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject == null || (jSONObject3 = jSONObject.getJSONObject("meta")) == null || (jSONObject4 = jSONObject3.getJSONObject("template")) == null) {
        } else {
            String string = jSONObject4.getString("id");
            String string2 = jSONObject4.getString("version");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            s b = a().b();
            Object a2 = bao.a(b, bao.CACHE_KEY_TEMPLATE_INFO);
            if (!(a2 instanceof JSONArray)) {
                a2 = new JSONArray();
            }
            JSONArray jSONArray = (JSONArray) a2;
            int i = 0;
            boolean z2 = false;
            while (true) {
                if (i >= jSONArray.size()) {
                    break;
                }
                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                if (jSONObject5 != null && TextUtils.equals(jSONObject5.getString("id"), string)) {
                    if (!TextUtils.equals(jSONObject5.getString("version"), string2)) {
                        jSONObject5.putAll(jSONObject4);
                        z = true;
                        z2 = true;
                        break;
                    }
                    z2 = true;
                }
                i++;
            }
            if (!z2) {
                jSONArray.add(jSONObject4);
                z = true;
            }
            if (!z) {
                return;
            }
            bao.a(b, bao.CACHE_KEY_TEMPLATE_INFO, jSONArray, null);
            bao.a(b, bao.CACHE_KEY_TEMPLATE_CONTAINER + string, jSONObject2, null);
        }
    }
}
