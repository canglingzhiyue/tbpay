package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class lui extends lua implements lkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1421036194);
        kge.a(1400609277);
    }

    public lui(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lkb
    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : e().f();
    }

    @Override // tb.lkb
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : e().g();
    }

    @Override // tb.lkb
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : e().h();
    }

    @Override // tb.lkb
    public Map<String, Integer> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2}) : e().a(str, str2);
    }

    @Override // tb.lkb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            e().i();
        }
    }
}
