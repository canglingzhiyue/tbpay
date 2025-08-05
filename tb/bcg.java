package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bcg extends bce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(738995785);
    }

    public static /* synthetic */ Object ipc$super(bcg bcgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bcg(bbz bbzVar) {
        super(bbzVar);
    }

    public void a(JSONObject jSONObject, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1544cd06", new Object[]{this, jSONObject, jnvVar});
        } else {
            this.f25794a.a(true, a(jSONObject), jnvVar);
        }
    }

    public void b(JSONObject jSONObject, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebc5aa5", new Object[]{this, jSONObject, jnvVar});
        } else {
            this.f25794a.b(true, a(jSONObject), jnvVar);
        }
    }

    public void a(boolean z, JSONObject jSONObject, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18241a82", new Object[]{this, new Boolean(z), jSONObject, jnvVar});
            return;
        }
        HashMap hashMap = null;
        if (jSONObject != null) {
            hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else if ((obj instanceof JSON) || (obj instanceof Map)) {
                    hashMap.put(str, JSON.toJSONString(obj));
                } else {
                    hashMap.put(str, String.valueOf(obj));
                }
            }
        }
        this.f25794a.b(z, hashMap, jnvVar);
    }

    public void a(IDMComponent iDMComponent, JSONObject jSONObject, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6919602", new Object[]{this, iDMComponent, jSONObject, jnvVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS) : null;
        if (iDMComponent != null && jSONObject2 != null) {
            jpy.a(iDMComponent.getData(), jSONObject2);
        }
        b(jSONObject2, jnvVar);
    }

    private Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.CUSTOM_EXPARAMS, JSON.toJSONString(jSONObject));
        return hashMap;
    }
}
