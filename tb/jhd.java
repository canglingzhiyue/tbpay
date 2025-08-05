package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class jhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Integer encryptionType;

    /* renamed from: a  reason: collision with root package name */
    private String f29550a;
    private final String b;
    private String c;
    private String d;
    private String e;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static jhd f29551a;

        static {
            kge.a(1519507210);
            f29551a = new jhd();
        }

        public static /* synthetic */ jhd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jhd) ipChange.ipc$dispatch("f0666f8", new Object[0]) : f29551a;
        }
    }

    static {
        kge.a(-219693941);
        encryptionType = 0;
    }

    private jhd() {
        this.f29550a = "TLogProtocol";
        this.b = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC1cueeBrz4VMOr09PxnO7ILYh6jDhcZwEUgzjPfwy2apBZIHAfGagR8LzN35O0UhvoeN570mJP4g0nLm2KL1H/K1NGYqT254w0sdV51kzO/yu+WcfgPkPLosnR1kVaPqiYKT2Bl1Yi85ZJwApO2y8lPmFwpIrMmKiTYqR2Gmd9nQIDAQAB";
        this.c = null;
    }

    public static synchronized jhd a() {
        synchronized (jhd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jhd) ipChange.ipc$dispatch("f0666f8", new Object[0]);
            }
            return a.a();
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.e == null) {
            this.e = jhx.a(c().getBytes());
        }
        return this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.c = str;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String str = this.c;
        return str == null ? "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC1cueeBrz4VMOr09PxnO7ILYh6jDhcZwEUgzjPfwy2apBZIHAfGagR8LzN35O0UhvoeN570mJP4g0nLm2KL1H/K1NGYqT254w0sdV51kzO/yu+WcfgPkPLosnR1kVaPqiYKT2Bl1Yi85ZJwApO2y8lPmFwpIrMmKiTYqR2Gmd9nQIDAQAB" : str;
    }

    public String b(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (this.d == null) {
            this.d = jhw.c(jhy.a(str.getBytes(), c()));
        }
        String str2 = this.d;
        if (str2 != null) {
            return str2;
        }
        Log.e(this.f29550a, " rc4 Encrypt secret obtain failure ");
        return null;
    }
}
