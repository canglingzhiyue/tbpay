package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class okd extends ova {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32136a;

    static {
        kge.a(-1579001759);
    }

    public okd(JSONObject jSONObject) {
        super(jSONObject);
        if (this.c == null) {
            return;
        }
        this.f32136a = this.c.getString("url");
    }

    @Override // tb.ova
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : qnk.f;
    }

    @Override // tb.ova
    public String dG_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a748c01d", new Object[]{this}) : this.f32136a;
    }

    public static ovd b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovd) ipChange.ipc$dispatch("16ba86c0", new Object[0]) : new ovd() { // from class: tb.okd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovd
            public ova a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ova) ipChange2.ipc$dispatch("29050de4", new Object[]{this, jSONObject}) : new okd(jSONObject);
            }
        };
    }
}
