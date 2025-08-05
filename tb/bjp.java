package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bjh f25941a;
    public bjs b;
    public boolean c = false;

    static {
        kge.a(888339434);
    }

    public bjp(bjs bjsVar) {
        this.b = bjsVar;
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f25941a = this.b.a();
        if (this.b.c().isEmpty()) {
            return;
        }
        this.c = true;
    }

    public bjh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bjh) ipChange.ipc$dispatch("f02cbfe", new Object[]{this}) : this.f25941a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b.b();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public bjs d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bjs) ipChange.ipc$dispatch("2617bd70", new Object[]{this}) : this.b;
    }
}
