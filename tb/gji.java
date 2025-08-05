package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;

/* loaded from: classes5.dex */
public class gji implements gjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSCallback f28355a;
    private Context b;

    static {
        kge.a(2060083970);
        kge.a(1387563485);
    }

    public gji(JSCallback jSCallback, Context context) {
        this.f28355a = jSCallback;
        this.b = context;
    }

    @Override // tb.gjg
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.f28355a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) str);
            jSONObject.put("code", (Object) "WX_FAILED");
            jSONObject.put("errorMsg", (Object) str3);
            jSONObject.put("errorCode", (Object) str2);
            this.f28355a.invoke(jSONObject);
        }
    }

    @Override // tb.gjg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f28355a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) "WX_SUCCESS");
            jSONObject.put("data", (Object) str);
            this.f28355a.invoke(jSONObject);
        }
    }
}
