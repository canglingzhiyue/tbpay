package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.utils.e;

/* loaded from: classes7.dex */
public class mbk extends mbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1810237495);
    }

    @Override // tb.mbn
    public boolean a(Context context, a aVar, String str, Bundle bundle) {
        boolean uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62acc361", new Object[]{this, context, aVar, str, bundle})).booleanValue();
        }
        if (StringUtils.equals(aVar.f, "h5")) {
            if (e.b(Uri.parse(str))) {
                c.a("linkx", "TbNavCenter === B方案，跳首页");
                uri = Nav.from(context).withExtras(bundle).withFlags(65536).disableTransition().toUri(str);
            } else {
                c.a("linkx", "TbNavCenter === B方案，跳其他页面");
                uri = Nav.from(context).withExtras(bundle).withFlags(4259840).disableTransition().toUri(str);
            }
            if (uri) {
                return uri;
            }
            if (bundle != null) {
                bundle.remove("cold_startup_h5");
            }
            return Nav.from(context).withExtras(bundle).withFlags(65536).disableTransition().withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(str);
        }
        if (bundle != null) {
            bundle.remove("cold_startup_h5");
        }
        return Nav.from(context).withExtras(bundle).toUri(str);
    }
}
