package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.g;
import com.taobao.search.mmd.util.j;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes7.dex */
public class nps extends npq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UTDID = "utd_id";

    static {
        kge.a(1434987454);
    }

    public nps(String str, String str2, MethodEnum methodEnum) {
        super("mtop.relationrecommend.WirelessRecommend.recommend", "2.0", true, false, true, str2, methodEnum);
        String str3;
        a("appId", str);
        b("_input_charset", "UTF8");
        b("_output_charset", "UTF8");
        b("sversion", noa.SERVER_VERSION_VALUE);
        ScreenType.a(this.f31631a.h);
        try {
            str3 = UTDevice.getUtdid(Globals.getApplication());
        } catch (Throwable th) {
            q.c("TppRxMtopRequest", "获取utdid失败", th);
            str3 = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            b("utd_id", str3);
        }
        String d = g.d();
        if (!TextUtils.isEmpty(d)) {
            b(noa.KEY_EDITION_CODE, d);
        }
        b("elderHome", String.valueOf(j.INSTANCE.a()));
    }

    public nps(String str, String str2) {
        this(str, str2, null);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a("appId", str);
        }
    }
}
