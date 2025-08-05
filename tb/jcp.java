package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

/* loaded from: classes4.dex */
public class jcp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f29456a;
    private String b;
    private String c;

    static {
        kge.a(1265321438);
    }

    public jcp(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        if (jSONObject2 == null) {
            arc.a().b("endpoint is null !!", arc.a.a().b("StreamConfigModel").b());
            return;
        }
        this.b = jSONObject2.getString("streamCount");
        this.f29456a = jSONObject2.getString("qpUp");
        this.c = jSONObject2.getString("streamPopWindowEnable");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        return str != null && Integer.parseInt(str) > 1;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : "true".equals(this.c);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f29456a = "1";
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : !"0".equals(this.f29456a);
    }
}
