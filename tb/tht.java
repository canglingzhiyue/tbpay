package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class tht implements tgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f34099a;
    private final JSONObject b;
    private final String c;
    private int d;
    private final boolean e;
    private final boolean f;

    static {
        kge.a(-280472199);
        kge.a(1083887979);
    }

    public tht(JSONObject jSONObject, JSONObject jSONObject2, String str, int i, boolean z, boolean z2) {
        this.d = -1;
        this.f34099a = jSONObject;
        this.b = jSONObject2;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    @Override // tb.tgr
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f34099a;
    }

    @Override // tb.tgr
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    @Override // tb.tgr
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    @Override // tb.tgr
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    @Override // tb.tgr
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // tb.tgr
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }
}
