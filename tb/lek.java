package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lek implements lli {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(648884306);
        kge.a(-1961016863);
    }

    @Override // tb.lli
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "InsertCard";
    }

    @Override // tb.lli
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        return null;
    }
}
