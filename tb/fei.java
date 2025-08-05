package tb;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.wrapper.ext.request.client.CustomApiRequestClient;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.b;
import java.util.Map;

/* loaded from: classes5.dex */
public class fei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f27858a;

    static {
        kge.a(2103378121);
        f27858a = i.a("DetailRequestImpl", BTags.MainRequestTag);
        emu.a("com.taobao.android.detail.wrapper.ext.request.DetailRequestImpl");
    }

    public static void a(Context context, MtopRequestListener<String> mtopRequestListener, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1466c2cc", new Object[]{context, mtopRequestListener, map});
            return;
        }
        fem femVar = new fem();
        femVar.b().a(map);
        femVar.a(context);
        String a2 = k.a(f27858a);
        com.taobao.android.detail.core.utils.i.c(a2, "first start main request, requestExParams: " + femVar.a());
        if (map.containsKey("isInit")) {
            a(femVar, mtopRequestListener);
        }
        if (Boolean.parseBoolean(femVar.a().get("updateWithCustomApi"))) {
            a(context, femVar, mtopRequestListener);
        } else {
            b(context, femVar, mtopRequestListener);
        }
    }

    private static void a(fem femVar, MtopRequestListener<String> mtopRequestListener) {
        ebx c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf254c3", new Object[]{femVar, mtopRequestListener});
        } else if (mtopRequestListener == null || (c = femVar.c()) == null) {
        } else {
            fef.a(c, mtopRequestListener);
        }
    }

    public static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        fem a2 = new fem().a(context, intent);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        String a3 = k.a(f27858a);
        com.taobao.android.detail.core.utils.i.c(a3, "prefetch request exParams:" + a2.a());
        fef.a(a2, uptimeMillis2);
        b(context, a2, null);
    }

    private static void a(Context context, fem femVar, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941ad0bb", new Object[]{context, femVar, mtopRequestListener});
        } else {
            new CustomApiRequestClient(context, femVar.a(), mtopRequestListener).a();
        }
    }

    private static void b(Context context, fem femVar, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4a1cda", new Object[]{context, femVar, mtopRequestListener});
        } else if (femVar == null) {
            com.taobao.android.detail.core.utils.i.a(k.a(f27858a), "mainRequestExParams is null.");
        } else {
            ebx c = femVar.c();
            if (c == null) {
                com.taobao.android.detail.core.utils.i.a(k.a(f27858a), "queryParams is null.");
                return;
            }
            String str = c.f27180a;
            String str2 = femVar.a().get(DetailCoreActivity.DETAIL_ITEM_ID);
            if (str2 != null) {
                str = str2;
            }
            MainRequestParams mainRequestParams = new MainRequestParams(str, femVar.a());
            com.taobao.android.detail.core.utils.i.c(k.a(f27858a), "sendDetailRequestNormally start request");
            b.a(context, c, mainRequestParams, mtopRequestListener);
        }
    }
}
