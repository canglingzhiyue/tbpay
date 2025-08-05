package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nlw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_MESSAGE_KEY = "errorMessage";

    static {
        kge.a(-872340170);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.put("HY_SUCCESS", (Object) jSONObject);
        } else {
            jSONObject2.put("HY_SUCCESS", (Object) new JSONObject());
        }
        return jSONObject2;
    }

    public static JSONObject a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("22be7ce9", new Object[]{objArr});
        }
        if (objArr != null) {
            if (objArr.length % 2 != 0) {
                throw new IllegalArgumentException(" key and value are not match");
            }
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length; i += 2) {
                jSONObject.put((String) objArr[i], objArr[i + 1]);
            }
            return a(jSONObject);
        }
        return a(new JSONObject());
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.put(WVResultWrapper.EXCEPTION, (Object) jSONObject);
        } else {
            jSONObject2.put(WVResultWrapper.EXCEPTION, (Object) new JSONObject());
        }
        return jSONObject2;
    }

    public static JSONObject b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("23f4cfc8", new Object[]{objArr});
        }
        if (objArr != null) {
            if (objArr.length % 2 != 0) {
                throw new IllegalArgumentException(" key and value are not match");
            }
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length; i += 2) {
                jSONObject.put((String) objArr[i], objArr[i + 1]);
            }
            return b(jSONObject);
        }
        return b(new JSONObject());
    }
}
