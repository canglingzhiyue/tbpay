package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.core.sync.h;
import com.alibaba.analytics.core.sync.i;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f25481a = new h();
    private boolean b;

    static {
        kge.a(-566790802);
    }

    public aoq() {
        this.b = false;
        this.f25481a.a("v6-adashx.ut.taobao.com");
        this.f25481a.b(1);
        try {
            Context k = aob.a().k();
            String a2 = apg.a(k, "utanalytics_tnet_host_port_ipv6");
            if (!TextUtils.isEmpty(a2)) {
                this.b = true;
            }
            a(a2);
            String a3 = aqb.a(k, "utanalytics_tnet_host_port_ipv6");
            if (!TextUtils.isEmpty(a3)) {
                this.b = true;
            }
            a(a3);
        } catch (Throwable unused) {
        }
    }

    public h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("165ef97f", new Object[]{this});
        }
        if (this.b) {
            return this.f25481a;
        }
        if (!i.a().b()) {
            return this.f25481a;
        }
        return null;
    }

    private synchronized void a(String str) {
        String trim;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && (indexOf = (trim = str.trim()).indexOf(":")) != -1) {
            String substring = trim.substring(0, indexOf);
            int parseInt = Integer.parseInt(trim.substring(indexOf + 1, trim.length()));
            if (!TextUtils.isEmpty(substring) && parseInt > 0) {
                this.f25481a.a(substring);
                this.f25481a.a(parseInt);
            }
        }
    }
}
