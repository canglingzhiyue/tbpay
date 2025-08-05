package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;

/* loaded from: classes5.dex */
public class ovb extends ova {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MainMediaInfo f32447a;

    static {
        kge.a(-1754078911);
    }

    public ovb(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.f32447a = MainMediaInfo.transformToMainMediaInfo(jSONObject);
    }

    public MainMediaInfo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainMediaInfo) ipChange.ipc$dispatch("5064a50e", new Object[]{this}) : this.f32447a;
    }

    @Override // tb.ova
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : rbv.f;
    }

    @Override // tb.ova
    public String dG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a748c01d", new Object[]{this});
        }
        MainMediaInfo mainMediaInfo = this.f32447a;
        return (mainMediaInfo == null || mainMediaInfo.data == null) ? "" : this.f32447a.data.videoThumbnailURL;
    }

    public static ovd c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovd) ipChange.ipc$dispatch("1e6c2c1f", new Object[0]) : new ovd() { // from class: tb.ovb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovd
            public ova a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ova) ipChange2.ipc$dispatch("29050de4", new Object[]{this, jSONObject}) : new ovb(jSONObject);
            }
        };
    }
}
