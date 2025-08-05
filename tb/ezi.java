package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;

/* loaded from: classes4.dex */
public class ezi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27691a;
    private long b;
    private String c;

    static {
        kge.a(-1685537681);
    }

    public ezi() {
        this.b = -1L;
    }

    public ezi(JSONObject jSONObject) {
        this.b = -1L;
        this.f27691a = jSONObject.getString("name");
        b(jSONObject.getString("version"));
        this.c = jSONObject.getString("url");
    }

    public ezi(String str, long j, String str2) {
        this.b = -1L;
        this.f27691a = str;
        this.b = j;
        this.c = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f27691a;
    }

    public ezi a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezi) ipChange.ipc$dispatch("7c6f0e40", new Object[]{this, str});
        }
        this.f27691a = str;
        return this;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public ezi b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezi) ipChange.ipc$dispatch("7d1bb9df", new Object[]{this, str});
        }
        try {
            this.b = Long.parseLong(str);
        } catch (Throwable th) {
            i.a("DxTemplateInfo", "constructor error: ", th);
        }
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public ezi c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezi) ipChange.ipc$dispatch("7dc8657e", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }
}
