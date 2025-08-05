package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.b;
import com.taobao.android.detail.core.utils.n;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ego;

/* loaded from: classes4.dex */
public class ecc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(369675563);
        emu.a("com.taobao.android.detail.core.detail.profile.TBAlertMonitor");
    }

    @Deprecated
    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str3);
        hashMap.put("errorMsg", str5);
        hashMap.put("popId", str2);
        hashMap.put("renderType", str4);
        n.a(new ego.a().a(n.KEY_SHOW_COMMON_DIALOG_POINT).b("showCommonDialogFail").d(str).a(hashMap).c(str5).f(epo.f()).g(b.b).a());
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("failUrl", str2);
        hashMap.put("detail", str);
        n.a(new ego.a().a("LoadDesc").b("80005").d("1").a(hashMap).c("图文详情H5加载失败").f(epo.f()).g(b.b).a());
    }

    @Deprecated
    public static void a(Context context, String str, MtopResponse mtopResponse) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d414a76f", new Object[]{context, str, mtopResponse});
            return;
        }
        if (mtopResponse == null) {
            str2 = "";
        } else {
            str2 = mtopResponse.getRetCode() + "|" + mtopResponse.getRetMsg();
        }
        n.a(new ego.a().a("LoadDetail").b("80001").c(str2).d("1").e(str).f(epo.f()).g(b.b).a());
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
        } else {
            n.a(new ego.a().a("LoadDesc").b("80005").d("0,1").e(str).f(epo.f()).g(b.b).c("模板请求失败").a());
        }
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
        } else {
            n.a(new ego.a().a("LoadDesc").b("80005").d("0,2").e(str).f(epo.f()).g(b.b).c("模板解析失败").a());
        }
    }
}
