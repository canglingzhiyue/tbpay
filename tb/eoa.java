package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eoa extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f27486a;

    static {
        kge.a(625635291);
    }

    public eoa() {
        emu.a("com.taobao.android.detail.datasdk.event.desc.OpenDescViewEvent");
    }

    public eoa(JSONObject jSONObject) {
        this.f27486a = jSONObject;
        emu.a("com.taobao.android.detail.datasdk.event.desc.OpenDescViewEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27486a;
    }
}
