package tb;

import android.app.Application;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareEnv;

/* loaded from: classes8.dex */
public class nym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_GEN3_CODE = "gen3Code";
    public static final String TYPE_QR_CODE = "qrcode";
    public static final String UNUSED_CODE_TAG = "UNUSED_CODE_TAG";

    static {
        kge.a(-867096879);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[0]) : ShareEnv.getApplication();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : GlobalAppRuntimeInfo.getUserId();
    }
}
