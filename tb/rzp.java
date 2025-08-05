package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.a;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes.dex */
public final class rzp extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile rzp c;

    public static rzp a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rzp) ipChange.ipc$dispatch("838066f4", new Object[]{context, str});
        }
        if (c == null) {
            synchronized (rzp.class) {
                if (c == null) {
                    try {
                        c = new rzp(context, str);
                    } catch (Exception e) {
                        TBSdkLog.e("ssr.SsrLoginImpl", "[getDefaultLoginImpl]get DefaultLoginImpl instance error", e);
                    }
                }
            }
        }
        return c;
    }

    private rzp(Context context, String str) throws NoSuchMethodException, ClassNotFoundException {
        super(context, Mtop.getInstance(str));
    }
}
