package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* loaded from: classes6.dex */
public class jvn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29820a;
    private MUSDKInstance b;
    private String c;

    static {
        kge.a(-477442958);
    }

    public jvn(MUSDKInstance mUSDKInstance, String str, int i) {
        this.b = mUSDKInstance;
        this.c = str;
        this.f29820a = i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(null);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b.fireEventOnNode(this.f29820a, this.c, jSONObject);
        }
    }
}
