package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class loj implements llk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f30773a;
    private JSONObject b;

    static {
        kge.a(-408621555);
        kge.a(-166808486);
    }

    public loj(String str, JSONObject jSONObject) {
        this.f30773a = str;
        this.b = jSONObject;
    }

    @Override // tb.llk
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30773a;
    }

    @Override // tb.llk
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }
}
