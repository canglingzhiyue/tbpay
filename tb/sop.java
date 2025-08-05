package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class sop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private soo f33775a;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static sop f33776a;

        static {
            kge.a(-1209226419);
            f33776a = new sop();
        }

        public static /* synthetic */ sop a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (sop) ipChange.ipc$dispatch("f0a9a0a", new Object[0]) : f33776a;
        }
    }

    static {
        kge.a(-1067206559);
    }

    public static sop a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sop) ipChange.ipc$dispatch("f0a9a0a", new Object[0]) : a.a();
    }

    private sop() {
        this.f33775a = new soo(null);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f33775a = new soo(jSONObject);
        }
    }

    public soo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (soo) ipChange.ipc$dispatch("16bc3f4a", new Object[]{this}) : this.f33775a;
    }
}
