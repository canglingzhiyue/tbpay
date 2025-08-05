package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.sku.c;

/* loaded from: classes4.dex */
public class eoh extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27499a;
    private String b;
    private c c;

    static {
        kge.a(-1877302286);
    }

    @Override // com.taobao.android.trade.event.Event
    public /* synthetic */ Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : a();
    }

    public eoh(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27499a = jSONObject.getString("itemId");
            this.b = jSONObject.getString("params");
        }
        emu.a("com.taobao.android.detail.datasdk.event.sku.UpdateItemIdEvent");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f27499a;
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d1cb04e9", new Object[]{this}) : this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }
}
