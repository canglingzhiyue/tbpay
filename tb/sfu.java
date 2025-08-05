package tb;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes9.dex */
public class sfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33534a;
    public String b;
    public String c;
    public JSONObject d;
    public List<AppModel> e;

    static {
        kge.a(-419176599);
    }

    public sfu(boolean z) {
        this.f33534a = z;
    }

    public List<AppModel> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.e;
    }

    public sfu a(List<AppModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfu) ipChange.ipc$dispatch("fa617acb", new Object[]{this, list});
        }
        this.e = list;
        return this;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f33534a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public sfu a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfu) ipChange.ipc$dispatch("7c7521d2", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public sfu b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfu) ipChange.ipc$dispatch("7d21cd71", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.d;
    }

    public sfu a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfu) ipChange.ipc$dispatch("2906a5bc", new Object[]{this, jSONObject});
        }
        this.d = jSONObject;
        return this;
    }
}
