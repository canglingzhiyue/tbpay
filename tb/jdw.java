package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jdw extends jdx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String adashxServerHost = "Configuration.adashxServerHost";
    public static final String enableExternalLinster = "Configuration.enableExternalLinster";
    public static final String enableReportContentCompress = "Configuration.enableReportContentCompress";
    public static final String enableSafeGuard = "Configuration.enableSafeGuard";
    public static final String enableSecuritySDK = "Configuration.enableSecuritySDK";
    public static final String enableUIProcessSafeGuard = "Configuration.enableUIProcessSafeGuard";

    /* loaded from: classes6.dex */
    public static class a {
        public static final jdw INSTANCE = new jdw();
    }

    public static final jdw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdw) ipChange.ipc$dispatch("f065a41", new Object[0]) : a.INSTANCE;
    }

    private jdw() {
        a(enableExternalLinster, (Object) true);
        a(enableSafeGuard, (Object) true);
        a(enableUIProcessSafeGuard, (Object) false);
        a(enableReportContentCompress, (Object) true);
        a(enableSecuritySDK, (Object) true);
        a(adashxServerHost, "h-adashx.ut.taobao.com");
    }
}
