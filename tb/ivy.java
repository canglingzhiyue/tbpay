package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ivy implements ivw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c;
    public long d;
    public JSONObject e;

    public ivy(String str, long j, JSONObject jSONObject) {
        this.d = -1L;
        this.c = str;
        this.d = j;
        this.e = jSONObject;
    }

    @Override // tb.ivw
    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.d;
    }

    @Override // tb.ivw
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.e;
    }
}
