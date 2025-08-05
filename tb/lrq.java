package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f30868a = SystemClock.uptimeMillis();
    private final JSONObject b;
    private final boolean c;
    private final String d;

    static {
        kge.a(-998753900);
    }

    public lrq(JSONObject jSONObject, boolean z, String str) {
        this.b = jSONObject;
        this.c = z;
        this.d = str;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f30868a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }
}
