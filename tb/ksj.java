package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes7.dex */
public class ksj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f30286a;
    private ksl b;

    static {
        kge.a(-722075962);
    }

    public ksj(String str, List<String> list) {
        this.f30286a = str;
        this.b = new ksl(str, list);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.b.a();
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b.b();
    }

    public JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str}) : this.b.a(str).getExt();
    }

    public JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c68059d4", new Object[]{this, str}) : this.b.a(str).getRangerParams();
    }

    public JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{this, str}) : this.b.a(str).getPassParams();
    }
}
