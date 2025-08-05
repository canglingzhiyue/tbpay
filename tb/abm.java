package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridDestroyPolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridPreRenderRecyclePolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.b;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.d;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.g;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import tb.cts;

/* loaded from: classes2.dex */
public class abm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<e> f25205a = new ArrayList();

    static {
        kge.a(2134182914);
    }

    private abm() {
    }

    public static abm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abm) ipChange.ipc$dispatch("f023a32", new Object[0]);
        }
        String str = cts.a.QUERY_ASYNC_CREATE_INSTANCE;
        boolean a2 = spk.a(iro.ORANGE_KEY_PURCHASE, str, true);
        a.C0105a a3 = new a.C0105a().a(cts.a.BIZ_PAY_SUCCESS);
        String str2 = cts.a.PRE_RENDER_URL_PAY_SUCCESS;
        String[] strArr = new String[2];
        strArr[0] = cts.a.QUERY_HIT_PRERENDER_OPT;
        if (!a2) {
            str = "";
        }
        strArr[1] = str;
        a a4 = a3.b(adh.a(str2, strArr)).a(1).a(a2).c(UltronTradeHybridStage.ON_RENDER_END).d("none").e("destroy").a();
        e a5 = new e.a().a("purchase").a(Arrays.asList(a4)).a();
        e a6 = new e.a().a("tbWaitPayDetail").a(Arrays.asList(a4)).a();
        e a7 = new e.a().a("waitPay").a(Arrays.asList(a4)).a();
        e a8 = new e.a().a("alipay").b(Arrays.asList(new d.a().a(cts.a.BIZ_PAY_SUCCESS).a(new b.a().a("mtop.trade.receipt.rendersimplepaysuccess").b("1.0").a(false).b(false).c(true).d(true).c("UNIT_TRADE").a(JSONObject.parseObject("{'mainBizOrderIdsStr':'${orderIds}','sourceType':'normal','params':'${preRequestParams}'}")).a()).a(new f.a().a("${storageKey}").a(30000L).b("none").a()).b(UltronTradeHybridStage.ON_CONTAINER_CREATE).c("${enablePreRequest}").e(cts.a.PRE_RENDER_URL_PAY_SUCCESS).a())).c(Arrays.asList(new g.a().a(cts.a.BIZ_PAY_SUCCESS).b(cts.b.FRONT_END_URL_PAY_SUCCESS).c(UltronTradeHybridStage.ON_CONTAINER_CREATE).a())).a();
        e a9 = new e.a().a(alz.BizKeyPaysuccess).a(Arrays.asList(new a.C0105a().a(cts.a.BIZ_ORDER_DETAIL).b(a(cts.a.PRE_RENDER_URL_ORDER_DETAIL)).a(1).c(UltronTradeHybridStage.ON_RENDER_END).d(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD).e("destroy").a())).a();
        a a10 = new a.C0105a().a(cts.a.BIZ_REFUND_LIST).b(cup.Companion.d()).a(1).a(cup.d()).g(cup.Companion.a() ? UltronTradeHybridInstanceRenderMode.SURFACE : UltronTradeHybridInstanceRenderMode.TEXTURE).c(UltronTradeHybridStage.ON_CONTAINER_RESUME).e("destroy").a();
        d d = ifn.d();
        List<d> e = ifn.e();
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        arrayList.addAll(e);
        List<String> asList = Arrays.asList("//img.alicdn.com/tfs/TB1hqbLsz39YK4jSZPcXXXrUFXa-240-240.png", "//gw.alicdn.com/imgextra/i1/O1CN01Qg3xsj1JB0gVHN8ax_!!6000000000989-2-tps-216-144.png");
        e a11 = new e.a().a("mytaobao").d(Arrays.asList(new h.a().a(cts.a.BIZ_ORDER_LIST).b(UltronTradeHybridStage.ON_RENDER_END).a(asList).a(), new h.a().a(cts.a.BIZ_ORDER_LIST).b(UltronTradeHybridStage.ON_CONTAINER_RESUME).a(asList).a())).b(arrayList).a(Collections.singletonList(a10)).a();
        e a12 = new e.a().a("newBuy").a(Arrays.asList(a4)).a();
        a a13 = new a.C0105a().a(cts.a.BIZ_CONFIRM_GOOD).b(cts.a.PRE_RENDER_URL_CONFIRM_GOOD).a(1).c(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER).d("none").e(UltronTradeHybridDestroyPolicy.DESTROY_ON_STAGE).f(UltronTradeHybridStage.ON_CONFIRM_SUCCESS_FLOAT_CLOSE).g(spk.a("babelorder", "enableConfirmGoodForceSurfaceView", true) ? UltronTradeHybridInstanceRenderMode.SURFACE : UltronTradeHybridInstanceRenderMode.TEXTURE).a();
        g a14 = new g.a().a(cts.a.BIZ_CONFIRM_GOOD).b(cts.b.FRONT_END_URL_CONFIRM_GOOD).c(UltronTradeHybridStage.ON_DATA_PRE_LOAD).a();
        e a15 = new e.a().a(alz.BizKeyOrderList).b(Arrays.asList(ifn.f())).a(Arrays.asList(a13, new a.C0105a().a(cts.a.BIZ_LOGISTICS).b(cts.a.PRE_RENDER_URL_LOGISTICS).a(1).c(UltronTradeHybridStage.ON_CONTAINER_RESUME).d(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD).e("destroy").a())).c(Arrays.asList(a14)).d(Arrays.asList(new h.a().a(cts.a.BIZ_ORDER_LIST).b(UltronTradeHybridStage.ON_CONTAINER_DESTROY).a(asList).a())).a();
        e a16 = new e.a().a(alz.BizKeyOrderDetail).a(Arrays.asList(a13)).c(Arrays.asList(a14)).a();
        e a17 = new e.a().a("refundList").a(Arrays.asList(new a.C0105a().a(cts.a.BIZ_REFUND_DETAIL).h(cts.a.TMS_PRE_RENDER_URL_REFUND_DETAIL).a(Arrays.asList("isPrerender", CoreConstants.IN_PARAM_BIZ_ORDER_ID, "disputeId", "type", "jt_pt_navStartTime", "openFrom", "tradeHybrid", "forceThemis")).c(UltronTradeHybridStage.ON_CONTAINER_CREATE).d(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD).a())).a();
        e a18 = new e.a().a("refundProcess").b(Arrays.asList(d)).a();
        abm abmVar = new abm();
        abmVar.f25205a.addAll(Arrays.asList(a5, a6, a7, a8, a9, a11, a12, a15, a16, a17, a18));
        return abmVar;
    }

    public e b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("151918b4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (e eVar : this.f25205a) {
            if (eVar != null && TextUtils.equals(str, eVar.f2793a)) {
                return eVar;
            }
        }
        return null;
    }

    public a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5d187697", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (e eVar : this.f25205a) {
            if (eVar != null && eVar.b != null) {
                for (a aVar : eVar.b) {
                    if (aVar != null) {
                        if (!iro.b(eVar.f2793a, aVar.f2786a)) {
                            jqg.b("UltronTradeHybridConfig.getPreRenderModel", String.format("%s-%s enableTradeHybrid is FALSE", eVar.f2793a, aVar.f2786a));
                        } else if (a.a(str, aVar.b)) {
                            return aVar;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a517d4f6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (e eVar : this.f25205a) {
            if (eVar != null && eVar.b != null) {
                for (a aVar : eVar.b) {
                    if (aVar != null) {
                        if (!iro.b(eVar.f2793a, aVar.f2786a)) {
                            jqg.b("UltronTradeHybridConfig.getTMSPreRenderModel", String.format("%s-%s enableTradeHybrid is FALSE", eVar.f2793a, aVar.f2786a));
                        } else if (a.a(str, aVar.j)) {
                            return aVar;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (EnvironmentSwitcher.a() == 0) {
            return str.replace(".wapa.", ".m.");
        }
        return str.replace(".m.", ".wapa.");
    }
}
