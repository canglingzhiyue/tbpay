package mtopsdk.ssrcore;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.mtc;
import tb.mtd;
import tb.mth;
import tb.mtj;
import tb.mtk;

/* loaded from: classes.dex */
public class a implements mtd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, b> f25032a = new ConcurrentHashMap<>();

    @Override // tb.mtd
    public boolean asyncSend(mtj mtjVar, mtc mtcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d571220", new Object[]{this, mtjVar, mtcVar, handler})).booleanValue();
        }
        if (mtcVar == null || mtjVar == null || StringUtils.isEmpty(mtjVar.f31244a)) {
            TBSdkLog.e("ssr.MtopSsrService", "illegal param.");
            return false;
        } else if (!mth.a(mtjVar.f31244a)) {
            TBSdkLog.e("ssr.MtopSsrService", "url invalidate.");
            mtopsdk.ssrcore.util.b.a(mtjVar, mtcVar, handler, new mtk.a().a(417).a("SSRE_URL_NOT_SUPPORT").b("URL不支持").a());
            return false;
        } else {
            b a2 = a(mtjVar, mtcVar, handler);
            this.f25032a.put(mtjVar.f31244a, a2);
            a2.a(this.f25032a);
            a2.b();
            a2.c();
            return true;
        }
    }

    @Override // tb.mtd
    public boolean cancel(mtj mtjVar) {
        b remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9299d0f2", new Object[]{this, mtjVar})).booleanValue();
        }
        if (mtjVar != null && !StringUtils.isEmpty(mtjVar.f31244a) && (remove = this.f25032a.remove(mtjVar.f31244a)) != null && !remove.e()) {
            remove.d();
        }
        return false;
    }

    private b a(mtj mtjVar, mtc mtcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("67f8ce83", new Object[]{this, mtjVar, mtcVar, handler});
        }
        b a2 = b.a(Mtop.instance(Mtop.Id.SSR, (Context) null), mtjVar);
        String str = mtjVar.f31244a;
        if (!StringUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String query = parse.getQuery();
            if (!StringUtils.isEmpty(query)) {
                if (query.contains("x-sec=wua")) {
                    a2.h();
                }
                String queryParameter = parse.getQueryParameter("x-login");
                if (!StringUtils.isEmpty(queryParameter)) {
                    a2.a(queryParameter);
                }
            }
        }
        if (handler != null) {
            a2.a(handler);
        }
        a2.a(mtjVar.c);
        a2.a(mtcVar);
        return a2;
    }
}
