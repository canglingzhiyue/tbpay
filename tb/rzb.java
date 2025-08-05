package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.e;
import com.taobao.tao.remotebusiness.login.h;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.ssrcore.c;
import mtopsdk.ssrcore.util.SsrLoginOption;
import mtopsdk.ssrcore.util.b;
import tb.mtk;

/* loaded from: classes.dex */
public class rzb implements rzj, rzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrCheckSessionDuplexFilter";
    }

    @Override // tb.rzk
    public String a(c cVar) {
        e b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("352515cf", new Object[]{this, cVar});
        }
        try {
            if (TextUtils.equals(cVar.h.i(), "none")) {
                return FilterResult.CONTINUE;
            }
            Mtop mtop = cVar.j;
            String str = cVar.h.b.userInfo;
            if (!StringUtils.isBlank(mtop.getMultiAccountSid(str)) || (b = h.b(mtop, str)) == null || StringUtils.isBlank(b.f21035a)) {
                return FilterResult.CONTINUE;
            }
            mtop.registerMultiAccountSession(str, b.f21035a, b.b);
            return FilterResult.CONTINUE;
        } catch (Throwable unused) {
            return FilterResult.CONTINUE;
        }
    }

    @Override // tb.rzj
    public String b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1c540d0", new Object[]{this, cVar});
        }
        mtk mtkVar = cVar.f;
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtkVar.d, HttpHeaderConstant.X_RETCODE);
        String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtkVar.d, "x-sec-reason");
        if (!ErrorConstant.isSessionInvalid(singleHeaderFieldByKey) && !ErrorConstant.isSessionInvalid(singleHeaderFieldByKey2)) {
            return FilterResult.CONTINUE;
        }
        if (cVar.h.g() == 0) {
            String i = cVar.h.i();
            char c = 65535;
            int hashCode = i.hashCode();
            if (hashCode != -902327211) {
                if (hashCode != 3387192) {
                    if (hashCode == 970409740 && i.equals(SsrLoginOption.SILENT_UI)) {
                        c = 2;
                    }
                } else if (i.equals("none")) {
                    c = 1;
                }
            } else if (i.equals(SsrLoginOption.SILENT)) {
                c = 0;
            }
            if (c == 0) {
                rzz.a().a(cVar.j, cVar.h);
                h.a(cVar.j, null, false, null);
                return "STOP";
            } else if (c == 1) {
                return FilterResult.CONTINUE;
            } else {
                rzz.a().a(cVar.j, cVar.h);
                h.a(cVar.j, null, true, null);
                return "STOP";
            }
        }
        cVar.f = new mtk.a().a(mtkVar.f31246a).a(mtkVar.d).a("SSRE_SESSION_EXPIRED").b("Session 过期").a();
        b.a(cVar);
        return "STOP";
    }
}
