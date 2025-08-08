package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.alibaba.analytics.core.sync.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;

/* loaded from: classes.dex */
public class aow implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static aow h;

    /* renamed from: a  reason: collision with root package name */
    private int f25486a = 3;
    private int b = 0;
    private int c = 0;
    private int d = 10000;
    private int e = 2;
    private int f = 2;
    private int g = 2;

    static {
        kge.a(-902917143);
        kge.a(-2114741388);
    }

    public static synchronized aow a() {
        synchronized (aow.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aow) ipChange.ipc$dispatch("f026c35", new Object[0]);
            }
            if (h == null) {
                h = new aow();
            }
            return h;
        }
    }

    private aow() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String utdid = UTDevice.getUtdid(aob.a().k());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            this.d = 0;
        } else {
            this.d = Math.abs(aqc.a(utdid)) % 10000;
        }
        apr.b("SampleSipListener", "sipRandomNumber", Integer.valueOf(this.d));
        a(f.a().a("amdc_sip_sample"));
        this.e = a(f.a().a("sip_fail_count"), 2);
        this.f = a(f.a().a("amdc_sip_fail_count"), 2);
        this.g = a(f.a().a("amdc_sip_fail_count_all"), 2);
        this.f25486a = a(f.a().a("upload_count"), 3);
        o.b().a(this.f25486a);
        f.a().a("amdc_sip_sample", this);
        f.a().a("sip_fail_count", this);
        f.a().a("amdc_sip_fail_count", this);
        f.a().a("amdc_sip_fail_count_all", this);
        f.a().a("upload_count", this);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d < this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d < this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.g;
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        apr.b("TnetSipHostPortMgr", "key", str, "value", str2);
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return;
        }
        if ("amdc_sip_sample".equalsIgnoreCase(str)) {
            a(str2);
        }
        if ("sip_fail_count".equalsIgnoreCase(str)) {
            this.e = a(str2, 2);
        }
        if ("amdc_sip_fail_count".equalsIgnoreCase(str)) {
            this.f = a(str2, 2);
        }
        if ("amdc_sip_fail_count_all".equalsIgnoreCase(str)) {
            this.g = a(str2, 2);
        }
        if (!"upload_count".equalsIgnoreCase(str)) {
            return;
        }
        this.f25486a = a(str2, 3);
        o.b().a(this.f25486a);
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            this.b = 0;
            this.c = 0;
        } else {
            String[] split = str.split("_");
            if (split.length < 2) {
                this.b = 0;
                this.c = 0;
                return;
            }
            this.b = a(split[0], 0);
            this.c = a(split[1], 0);
        }
    }
}
