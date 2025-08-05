package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.bootimage.linked.h;
import com.taobao.homepage.utils.RequestTypeEnum;

/* loaded from: classes8.dex */
public class oqf implements ktx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f32286a;

    static {
        kge.a(-1167224651);
        kge.a(1692916670);
    }

    @Override // tb.ktx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "bootImage";
    }

    public oqf(String str) {
        this.f32286a = str;
    }

    @Override // tb.ktx
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        e.e("bootImage", "BootImageParamBuild build ");
        if (RequestTypeEnum.COLD_START.requestName.equals(this.f32286a)) {
            return null;
        }
        kef g = h.a("").g();
        if (g == null) {
            e.e("bootImage", "BootImageParamBuild stabilityService is null ");
            return null;
        }
        boolean a2 = g.a();
        if (!a2) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bootImageOccupied", (Object) Boolean.valueOf(a2));
        g.b();
        return jSONObject.toJSONString();
    }
}
