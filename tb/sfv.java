package tb;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;

/* loaded from: classes9.dex */
public class sfv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33535a;
    public String b;
    public String c;
    public JSONObject d;
    public AppModel e;
    public AppInfoStrategy f;

    static {
        kge.a(-1250066550);
    }

    public AppModel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppModel) ipChange.ipc$dispatch("6c402d1f", new Object[]{this}) : this.e;
    }

    public sfv a(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("1ed7d024", new Object[]{this, appModel});
        }
        this.e = appModel;
        return this;
    }

    public sfv a(AppInfoStrategy appInfoStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("ce06f31e", new Object[]{this, appInfoStrategy});
        }
        this.f = appInfoStrategy;
        return this;
    }

    public AppInfoStrategy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfoStrategy) ipChange.ipc$dispatch("a934b08a", new Object[]{this}) : this.f;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f33535a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b;
    }

    public sfv a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("7c7521f1", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    public sfv b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("7d21cd90", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.d;
    }

    public sfv a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("2906a5db", new Object[]{this, jSONObject});
        }
        this.d = jSONObject;
        return this;
    }

    public sfv(boolean z) {
        this.f33535a = z;
    }
}
