package tb;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.performance.preload.d;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.client.CustomApiRequestClient;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import tb.bax;

/* loaded from: classes5.dex */
public class fek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TEXT_FEATURE_TYPE = "detaolRequestChange";

    /* renamed from: a  reason: collision with root package name */
    private static final String f27860a;
    private static final d b;
    private static final List<fer> c;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f27860a;
    }

    static {
        kge.a(-985211956);
        f27860a = i.a("TaobaoRequestImpl", BTags.MainRequestTag);
        b = new d();
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        arrayList.add(new fes());
        emu.a("com.taobao.android.detail.wrapper.ext.request.TaobaoRequestImpl");
    }

    public static void a(Context context, ebx ebxVar, MtopRequestListener<String> mtopRequestListener, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb384e97", new Object[]{context, ebxVar, mtopRequestListener, map});
        } else if (map != null && Boolean.parseBoolean(map.get("updateWithCustomApi"))) {
            a(context, map, mtopRequestListener);
        } else {
            b(context, ebxVar, mtopRequestListener, map);
        }
    }

    private static void a(Context context, Map<String, String> map, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df059cde", new Object[]{context, map, mtopRequestListener});
        } else {
            new CustomApiRequestClient(context, map, mtopRequestListener).a();
        }
    }

    private static void b(Context context, ebx ebxVar, MtopRequestListener<String> mtopRequestListener, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb16098", new Object[]{context, ebxVar, mtopRequestListener, map});
        } else if (mtopRequestListener == null || map == null) {
            String str = f27860a;
            com.taobao.android.detail.core.utils.i.a(str, "requestListener or params is null, params=" + map);
        } else {
            for (fer ferVar : c) {
                Map<String, String> a2 = ferVar.a(context);
                if (a2 != null) {
                    map.putAll(a2);
                }
            }
            String str2 = ebxVar.f27180a;
            String str3 = map.get(DetailCoreActivity.DETAIL_ITEM_ID);
            if (str3 != null) {
                str2 = str3;
            }
            try {
                PositionInfo b2 = b.b(context);
                if (b2 != null) {
                    map.put("countryCode", b2.countryCode);
                }
            } catch (Throwable unused) {
            }
            map.put("container_type", eaz.DINAMIC_MODULE_NAME);
            if (ecu.p && ecu.q) {
                map.put("ultron2", "true");
                if (ecu.r) {
                    map.put("dinamic_v3", "true");
                }
            }
            if (jqm.a()) {
                map.put(Constants.SP_KEY_DEBUG_MODE, "true");
            }
            b(context, map);
            e(context, map);
            d(context, map);
            if (map.containsKey("isInit")) {
                try {
                    a(context, map);
                } catch (Exception e) {
                    String a3 = k.a(f27860a);
                    com.taobao.android.detail.core.utils.i.a(a3, "compareMainRequestExParams: " + e);
                }
            }
            iyx.a(map);
            b(map);
            MainRequestParams mainRequestParams = new MainRequestParams(str2, new HashMap(map));
            com.taobao.android.detail.core.utils.i.d(j.a(f27860a), "start main request +++");
            com.taobao.android.detail.wrapper.ext.request.client.newmtop.b.a(context, ebxVar, mainRequestParams, mtopRequestListener);
        }
    }

    private static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else if (!eip.K) {
        } else {
            map.put("dynamicJsonData", "true");
        }
    }

    private static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (!eip.f || !(context instanceof DetailCoreActivity)) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
            b().execute(new a(detailCoreActivity, map, new fem().a(detailCoreActivity)));
        }
    }

    /* loaded from: classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DetailCoreActivity> f27861a;
        private Map<String, String> b;
        private fem c;

        static {
            kge.a(282095146);
            kge.a(-1390502639);
        }

        public a(DetailCoreActivity detailCoreActivity, Map<String, String> map, fem femVar) {
            this.f27861a = new WeakReference<>(detailCoreActivity);
            this.b = map;
            this.c = femVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                a();
            } catch (Exception e) {
                String a2 = k.a(fek.a());
                com.taobao.android.detail.core.utils.i.a(a2, "CompareRunnable, compareMainRequestExParams: " + e);
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            DetailCoreActivity detailCoreActivity = this.f27861a.get();
            if (detailCoreActivity == null) {
                return;
            }
            List<String> a2 = fef.a(this.b, this.c.a(), eip.d);
            if (a2.isEmpty()) {
                com.taobao.android.detail.core.utils.i.c(k.a(fek.a()), "请求参数对比相同");
                return;
            }
            String a3 = k.a(fek.a());
            com.taobao.android.detail.core.utils.i.c(a3, "请求参数对比不同: " + a2);
            ebx ebxVar = detailCoreActivity.f9411a;
            if (ebxVar == null) {
                return;
            }
            ecg.a(detailCoreActivity, ebxVar.f27180a, ebxVar.q, a2);
        }
    }

    private static ExecutorService b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1a7854d2", new Object[0]) : b.a(2, 5, "compareMainRequestExParams");
    }

    private static void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
        } else if (!(context instanceof DetailActivity)) {
        } else {
            c(context, map);
            a(map);
        }
    }

    private static void c(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c334b027", new Object[]{context, map});
        } else if (!f.a()) {
            map.put("finalUltron", "false");
            com.taobao.android.detail.core.utils.i.d(f27860a, "setupFinialUltronParam finalUltron:false");
        } else if (jqm.a() && !com.taobao.android.detail.core.debug.a.k(context)) {
            map.put("finalUltron", "false");
        } else if ((context instanceof DetailCoreActivity) && ((DetailCoreActivity) context).H()) {
            map.put("finalUltron", "false");
            com.taobao.android.detail.core.utils.i.d(i.a(f27860a, BTags.DowngradeTag), "setupFinialUltronParam isDowngrade finalUltron:false");
        } else {
            map.put("finalUltron", "true");
            com.taobao.android.detail.core.utils.i.d(f27860a, "setupFinialUltronParam finalUltron:true");
        }
    }

    private static void a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        bax.a a2 = bax.a();
        if (a2.f25741a == 3) {
            str = "high";
        } else {
            str = a2.f25741a == 2 ? "medium" : "low";
        }
        map.put("deviceLevel", str);
    }

    private static void d(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd572a8", new Object[]{context, map});
            return;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            map.put(com.taobao.android.detail2.core.framework.data.model.d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, displayMetrics.widthPixels + "");
            map.put("screenHeight", displayMetrics.heightPixels + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8763529", new Object[]{context, map});
        } else if (!(context instanceof DetailActivity)) {
        } else {
            map.put("supportIndustryMainPic", String.valueOf(f.i()));
            if ((context instanceof DetailCoreActivity) && ((DetailCoreActivity) context).J()) {
                map.put("industryMainPicDegrade", "true");
            } else {
                map.put("industryMainPicDegrade", "false");
            }
        }
    }
}
