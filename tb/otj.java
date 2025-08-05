package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* loaded from: classes8.dex */
public class otj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1055909303);
    }

    public static String a(String str, String str2, String str3) {
        AwesomeGetContainerData b;
        JSONObject ext;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        ope f = d.f(str);
        return (f == null || (b = f.b(str)) == null || (ext = b.getExt()) == null || (jSONObject = ext.getJSONObject("hotEffectConfig")) == null || !jSONObject.containsKey(str2)) ? str3 : jSONObject.getString(str2);
    }
}
