package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ju.track.server.JTrackParams;
import java.util.Map;

/* loaded from: classes4.dex */
public class eny extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27483a;
    public String b;
    public Map<String, String> c;

    static {
        kge.a(1485278426);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this;
    }

    public eny(JSONObject jSONObject, final JSONObject jSONObject2) {
        emu.a("com.taobao.android.detail.datasdk.event.basic.UserTrackEvent");
        if (jSONObject == null) {
            return;
        }
        this.f27483a = epw.a(jSONObject.getString("trackName"));
        this.b = epw.a(jSONObject.getString("trackNamePre"));
        this.c = epw.a(jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS), new epy<String>() { // from class: tb.eny.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) epz.a(jSONObject2, obj);
            }
        });
    }

    public eny(String str, String str2, Map<String, String> map) {
        this.f27483a = str2;
        this.b = str;
        this.c = map;
        emu.a("com.taobao.android.detail.datasdk.event.basic.UserTrackEvent");
    }
}
