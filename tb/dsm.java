package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bzu;
import tb.cts;

/* loaded from: classes2.dex */
public class dsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2146001827);
    }

    public static void a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{new Boolean(z), str, str2});
        } else {
            b(z, a(str), str2);
        }
    }

    public static void b(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e189f79f", new Object[]{new Boolean(z), str, str2});
        } else if (TextUtils.isEmpty(str)) {
            jqg.b("UltronTradeHybridJSTrackerUtil.reportPreRender", "bizName is empty!");
        } else {
            bzu.a(bzu.a.b(String.format("preRender_%s", str)).a(z).a(str2).a(b(str)));
        }
    }

    public static void c(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef2cbe", new Object[]{new Boolean(z), str, str2});
        } else if (TextUtils.isEmpty(str)) {
            jqg.b("UltronTradeHybridJSTrackerUtil.reportPreRequest", "bizName is empty!");
        } else {
            bzu.a(bzu.a.b(String.format("preRequest_%s", str)).a(z).a(str2).a(d(str)));
        }
    }

    public static void a(boolean z, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6753bb", new Object[]{new Boolean(z), mtopResponse, str});
            return;
        }
        String api = mtopResponse == null ? "" : mtopResponse.getApi();
        bzu.a(bzu.b.a(api, z).a(gnq.a(mtopResponse)).b(str).a(d(c(api))));
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : a.a(str, cts.a.PRE_RENDER_URL_ORDER_DETAIL) ? cts.a.BIZ_ORDER_DETAIL : a.a(str, cts.a.PRE_RENDER_URL_PAY_SUCCESS) ? cts.a.BIZ_PAY_SUCCESS : a.a(str, cts.a.PRE_RENDER_URL_REFUND_LIST) ? cts.a.BIZ_REFUND_LIST : a.a(str, cts.a.PRE_RENDER_URL_CONFIRM_GOOD) ? cts.a.BIZ_CONFIRM_GOOD : a.a(str, cts.a.PRE_RENDER_URL_LOGISTICS) ? cts.a.BIZ_LOGISTICS : "";
    }

    private static float b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue() : TextUtils.equals(str, cts.a.BIZ_ORDER_DETAIL) ? 1.0E-4f : 0.001f;
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : TextUtils.equals(str, "mtop.trade.receipt.rendersimplepaysuccess") ? cts.a.BIZ_PAY_SUCCESS : (TextUtils.equals(str, "mtop.taobao.order.query.detailv2") || TextUtils.equals(str, "mtop.taobao.order.batchquery.detail")) ? cts.a.BIZ_ORDER_DETAIL : TextUtils.equals(str, "mtop.order.dopay") ? cts.a.BIZ_CONFIRM_GOOD : "";
    }

    private static float d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{str})).floatValue() : TextUtils.equals(str, cts.a.BIZ_ORDER_DETAIL) ? 1.0E-4f : 0.001f;
    }
}
