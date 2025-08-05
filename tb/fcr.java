package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fcr extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27810a;

    static {
        kge.a(278384108);
    }

    public fcr(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27810a = jSONObject.getString("url");
        }
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenTmallAppEvent");
    }

    @Override // tb.eoc, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27810a;
    }
}
