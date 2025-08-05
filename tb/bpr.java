package tb;

import com.alibaba.android.umbrella.link.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class bpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f26038a = new ConcurrentHashMap();

    public static /* synthetic */ void a(bpr bprVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6096eb3e", new Object[]{bprVar, str});
        } else {
            bprVar.b(str);
        }
    }

    public bpr(final String str) {
        OrangeConfig.getInstance().registerListener(new String[]{str}, new g() { // from class: tb.bpr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str2, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str2, new Boolean(z)});
                } else {
                    bpr.a(bpr.this, str);
                }
            }
        });
        b(str);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        this.f26038a.clear();
        bpq.b(this.f26038a, configs);
    }

    private String a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : (!j.a(str) && this.f26038a.containsKey(str) && (str3 = this.f26038a.get(str)) != null) ? str3 : str2;
    }

    public double a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81239a3a", new Object[]{this, str, new Double(d)})).doubleValue();
        }
        try {
            return Double.parseDouble(a(str, String.valueOf(d)));
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public Boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("410b752f", new Object[]{this, str});
        }
        String a2 = a(str, "");
        if (!j.a(a2)) {
            return Boolean.valueOf(a2);
        }
        return null;
    }
}
