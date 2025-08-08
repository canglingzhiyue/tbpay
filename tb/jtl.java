package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.core.utils.c;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;

@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.build")
/* loaded from: classes6.dex */
public final class jtl extends jte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-231368732);
    }

    @Override // tb.aro
    public void a(b bVar) {
        String str;
        duj d;
        String retMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        bVar.a();
        if (!"AURANextRPCServiceDomain".equals(bVar.f())) {
            return;
        }
        String str2 = null;
        a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
        if (aVar == null) {
            arc.a().c("TBBuyBuildOrderErrorExtension", "onError", "remoteResponse is null");
        } else if (dss.a(b(), aVar)) {
        } else {
            String a2 = aVar.a();
            String b = aVar.b();
            MtopResponse g = aVar.g();
            int i = 200;
            if (g != null) {
                i = g.getResponseCode();
                str2 = g.getMappingCode();
                if (g.isNetworkError()) {
                    retMsg = com.taobao.android.purchase.core.a.NETWORK_ERROR_MSG;
                } else if (g.isApiLockedResult()) {
                    retMsg = com.taobao.android.purchase.core.b.BUILD_DATA_PARSE_ERROR_MSG_NEW;
                } else {
                    retMsg = g.getRetMsg();
                }
                str = retMsg;
            } else {
                str = b;
            }
            duk dukVar = (duk) b().a("aliBuyRequestHelper", duk.class);
            if (dukVar == null) {
                d = new duj(new HashMap());
            } else {
                d = dukVar.d();
            }
            if (d == null) {
                new duj(new HashMap());
                a().a(new b(1, jte.ERROR_DOMAIN, "emptyQueryKey", "queryKey为空"));
            }
            Context e = b().e();
            if ("F-10000-00-15-002".equals(a2)) {
                return;
            }
            if ("FAIL_SYS_SESSION_EXPIRED".equals(a2)) {
                if (e instanceof Activity) {
                    ((Activity) e).finish();
                }
            } else if (i == 419) {
                b = com.taobao.android.purchase.core.b.BUILD_ORDER_WARNING_TITLE_NEW;
                if (e instanceof Activity) {
                    ((Activity) e).finish();
                }
            } else {
                String str3 = StringUtils.isEmpty(str2) ? a2 : str2;
                String str4 = com.taobao.android.purchase.core.b.BUILD_ORDER_WARNING_TITLE_NEW;
                a(e, g, str4, str3, str, false, true);
                b = str4;
            }
            if (StringUtils.isEmpty(str2)) {
                str2 = a2;
            }
            c.a(str2, b);
            a().a(new b(1, jte.ERROR_DOMAIN, a2, b));
        }
    }
}
