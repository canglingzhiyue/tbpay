package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class cjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26310a;
    public Map<String, String> b = new HashMap();
    public Map<String, Object> c = new HashMap();
    public String d = "";

    static {
        kge.a(-797810572);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "EkycRequest{eKYCId=" + this.f26310a + ", eKYCConfig=" + this.b.toString() + ", clientCfg=" + this.d + ", bizConfig=" + this.c.toString() + '}';
    }
}
