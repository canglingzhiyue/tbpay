package tb;

import com.alipay.security.mobile.module.http.UploadFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class ckm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ckm b = new ckm();

    /* renamed from: a  reason: collision with root package name */
    public int f26337a = 0;

    public static ckm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ckm) ipChange.ipc$dispatch("f0344b9", new Object[0]) : b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String zhiZhiGateway = UploadFactory.getZhiZhiGateway();
        if (cjw.b(zhiZhiGateway)) {
            return zhiZhiGateway;
        }
        int i = this.f26337a;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "https://mobilegw.alipay.com/mgw.htm" : "http://mobilegw.aaa.alipay.net/mgw.htm" : "http://mobilegw-1-64.test.alipay.net/mgw.htm" : "https://mobilegwpre.alipay.com/mgw.htm" : "http://mobilegw.stable.alipay.net/mgw.htm";
    }
}
