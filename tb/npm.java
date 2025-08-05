package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.j;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.ut.device.UTDevice;

/* loaded from: classes7.dex */
public class npm extends npq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CODE = "code";
    public static final String KEY_TTID = "ttid";
    public static final String KEY_UTDID = "utd_id";
    private static final String b;

    static {
        kge.a(-540340881);
        b = npm.class.getSimpleName();
    }

    public npm(String str, String str2, boolean z, boolean z2, String str3) {
        super(str, str2, z, z2, str3);
        b();
    }

    private void b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            str = UTDevice.getUtdid(Globals.getApplication());
        } catch (Throwable th) {
            q.c(b, "获取utdid失败", th);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a("utd_id", str);
        }
        a("ttid", TaoApplication.getTTID());
        a("code", "utf-8");
        a("elderHome", String.valueOf(j.INSTANCE.a()));
    }
}
