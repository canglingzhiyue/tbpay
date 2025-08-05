package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class enp extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f27473a;

    static {
        kge.a(1684828950);
    }

    public enp(JSONObject jSONObject) {
        emu.a("com.taobao.android.detail.datasdk.event.basic.ExposureTrackEvent");
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        this.f27473a = epw.a(jSONObject, new epy<String>() { // from class: tb.enp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27473a;
    }
}
