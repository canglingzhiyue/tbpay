package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class nly {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static nly b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f31569a = new HashMap<>();

    static {
        kge.a(-543638639);
    }

    public static nly a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nly) ipChange.ipc$dispatch("f084a03", new Object[0]);
        }
        if (b == null) {
            b = new nly();
        }
        return b;
    }

    public boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue() : StringUtils.equals(d(j, j2), "true");
    }

    private String c(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9ed7476", new Object[]{this, new Long(j), new Long(j2)});
        }
        return j + "_" + j2;
    }

    public boolean b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f8062d", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        HashMap<String, String> hashMap = this.f31569a;
        if (hashMap == null) {
            this.f31569a = new HashMap<>();
            return false;
        }
        return hashMap.containsKey(c(j, j2));
    }

    private String d(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5ef0355", new Object[]{this, new Long(j), new Long(j2)});
        }
        HashMap<String, String> hashMap = this.f31569a;
        if (hashMap == null) {
            this.f31569a = new HashMap<>();
            return "";
        }
        String str = hashMap.get(c(j, j2));
        return str != null ? str.toString() : "";
    }

    public void a(long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262844ec", new Object[]{this, new Long(j), new Long(j2), new Boolean(z)});
            return;
        }
        if (this.f31569a == null) {
            this.f31569a = new HashMap<>();
        }
        this.f31569a.put(c(j, j2), String.valueOf(z));
    }
}
