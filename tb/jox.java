package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;

/* loaded from: classes6.dex */
public class jox extends jov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29667a = jpw.a("removeDataWhenDeleteOfDeltaMode", false);

    static {
        kge.a(403248752);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "delete";
    }

    @Override // tb.jov
    public void a(b bVar, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee2b290", new Object[]{this, bVar, jSONObject, jSONObject2, str, str2, str3});
        } else if (this.f29667a) {
            bVar.c(str, str2);
        } else {
            bVar.a(str, str2);
            bVar.b(str, str2);
        }
    }
}
