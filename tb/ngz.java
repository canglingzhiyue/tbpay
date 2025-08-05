package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.pha.core.k;

/* loaded from: classes.dex */
public class ngz implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(614930275);
        kge.a(2041244856);
    }

    @Override // com.taobao.pha.core.k
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            e.a(RVLLevel.Info, str, str2);
        }
    }

    @Override // com.taobao.pha.core.k
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else {
            e.a(RVLLevel.Debug, str, str2);
        }
    }

    @Override // com.taobao.pha.core.k
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            e.a(RVLLevel.Warn, str, str2);
        }
    }

    @Override // com.taobao.pha.core.k
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            e.a(RVLLevel.Error, str, str2);
        }
    }
}
