package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ta.utdid2.device.UTDevice;

/* loaded from: classes.dex */
public class aop implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f25480a = 0;

    static {
        kge.a(904414119);
        kge.a(-2114741388);
    }

    public aop() {
        a(f.a().a("sample_ipv6"));
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str2);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        apr.b("SampleIpv6Listener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f25480a = Integer.parseInt(str);
        } catch (Exception unused) {
            this.f25480a = 0;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String utdid = UTDevice.getUtdid(aob.a().k());
        if (utdid != null && !utdid.equals(Constants.UTDID_INVALID)) {
            int abs = Math.abs(aqc.a(utdid));
            apr.b("SampleIpv6Listener", "hashcode", Integer.valueOf(abs), "sample", Integer.valueOf(this.f25480a));
            if (abs % 10000 < this.f25480a) {
                return true;
            }
        }
        return false;
    }
}
