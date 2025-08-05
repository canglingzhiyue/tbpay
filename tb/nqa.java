package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.q;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.ut.device.UTDevice;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes7.dex */
public class nqa extends nps {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CODE = "code";
    public static final String KEY_TTID = "ttid";
    public static final String KEY_UTDID = "utd_id";
    private static final String b;

    static {
        kge.a(-1270509234);
        b = nqa.class.getSimpleName();
    }

    public nqa(String str, String str2, MethodEnum methodEnum) {
        super(str, str2, methodEnum);
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
            b("utd_id", str);
        }
        b("ttid", TaoApplication.getTTID());
        b("code", "utf-8");
        b(noa.KEY_IS_BETA, String.valueOf(SearchSdk.isBeta()));
    }
}
