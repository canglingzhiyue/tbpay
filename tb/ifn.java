package tb;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.b;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.d;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.f;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cts;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/utils/HybridPreRequestHelper;", "", "()V", "Companion", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class ifn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f28995a;
    private static f b;
    private static f c;

    @JvmStatic
    public static final void a(b bVar, JSONObject jSONObject, com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942487ef", new Object[]{bVar, jSONObject, aVar});
        } else {
            a.a(Companion, bVar, jSONObject, null, false, aVar, 12, null);
        }
    }

    @JvmStatic
    public static final d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2c1be1d", new Object[0]) : Companion.b();
    }

    @JvmStatic
    public static final List<d> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[0]) : Companion.c();
    }

    @JvmStatic
    public static final d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d720ce5b", new Object[0]) : Companion.e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0011\u001a\u00020\fJ\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J:\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/utils/HybridPreRequestHelper$Companion;", "", "()V", "orderListStorageModel", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/model/UltronTradeHybridStorageModel;", "orderTabCodes", "", "", "getOrderTabCodes", "()Ljava/util/List;", "refundListStorageModel", "generateOrderListPreRequest", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/model/UltronTradeHybridMTopModel;", "tabCode", "generateOrderListPreRequestModel", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/model/UltronTradeHybridPreRequestModel;", "generateOrderRefundPreRequestModel", "generateRefundPreRequest", "generateRefundPreRequestModel", "stage", "startRequestOnIdle", "", "model", "params", "Lcom/alibaba/fastjson/JSONObject;", "topic", "needOnIdle", "", "callback", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/pre/request/IUltronTradeHybridPreRequestCallback;", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1454411133);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final List<String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : ifn.a();
        }

        public final b d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2c1bddf", new Object[]{this});
            }
            int a2 = spk.a(iro.ORANGE_KEY_MY_TAOBAO, "preRequestRefundPageSize", 10);
            b.a c = new b.a().a("mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron").b("1.0").a(true).b(false).c(true).d(true).c("UNIT_TRADE");
            b a3 = c.a(JSONObject.parseObject("{'curPage':'1','inThirtyDays':'false','pageSize':'" + a2 + "','terminal':'wireless','preRequest':'true'}")).a();
            q.b(a3, "UltronTradeHybridMTopMod…\n                .build()");
            return a3;
        }

        @JvmStatic
        public final d b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2e62addf", new Object[]{this}) : b(UltronTradeHybridStage.ON_CONTAINER_RESUME);
        }

        @JvmStatic
        public final d e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6cf1463c", new Object[]{this}) : b(UltronTradeHybridStage.ON_CONTAINER_DESTROY);
        }

        private final d b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("15191895", new Object[]{this, str});
            }
            d a2 = new d.a().a(alz.BizKeyRefund).a(d()).a(ifn.b()).b(str).c("${enablePreRequestRefund}").d("first_data").a();
            q.b(a2, "UltronTradeHybridPreRequ…\n                .build()");
            return a2;
        }

        private final b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cd19b9f8", new Object[]{this, str});
            }
            b.a c = new b.a().a("mtop.taobao.order.queryboughtlistv2").b("1.0").a(true).b(false).c(true).d(true).c("UNIT_TRADE");
            b a2 = c.a(JSONObject.parseObject("{\"OrderType\":\"OrderList\",\"appName\":\"tborder\",\"appVersion\":\"3.0\",\"condition\":\"{\\\"preRequest\\\":\\\"true\\\",\\\"deviceLevel\\\":\\\"low\\\",\\\"inner\\\":\\\"1\\\",\\\"version\\\":\\\"1.0.0\\\"}\",\"exParams\":\"{\\\"inner\\\":\\\"1\\\"}\",\"page\":\"1\",\"tabCode\":\"" + str + "\",\"useV2\":\"true\"}")).a();
            q.b(a2, "UltronTradeHybridMTopMod…\n                .build()");
            return a2;
        }

        @JvmStatic
        public final List<d> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
            }
            List<String> a2 = a();
            ArrayList arrayList = new ArrayList(p.a((Iterable) a2, 10));
            for (String str : a2) {
                d.a b = new d.a().a(cts.a.BIZ_ORDER_LIST).a(ifn.Companion.a(str)).a(ifn.c()).b(UltronTradeHybridStage.ON_CONTAINER_RESUME);
                d.a c = b.c("${enablePreRequestListCode" + str + '}');
                StringBuilder sb = new StringBuilder();
                sb.append("${userId}");
                sb.append(str);
                arrayList.add(c.d(sb.toString()).a());
            }
            return arrayList;
        }

        public static /* synthetic */ void a(a aVar, b bVar, JSONObject jSONObject, String str, boolean z, com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a aVar2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31144dac", new Object[]{aVar, bVar, jSONObject, str, new Boolean(z), aVar2, new Integer(i), obj});
            } else {
                aVar.a(bVar, jSONObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z, aVar2);
            }
        }

        @JvmStatic
        public final void a(b model, JSONObject jSONObject, String str, boolean z, com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f769cd1", new Object[]{this, model, jSONObject, str, new Boolean(z), aVar});
                return;
            }
            q.d(model, "model");
            com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.b bVar = new com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.b(model, jSONObject, aVar);
            if (z) {
                bVar.b(str);
            } else {
                bVar.a(str);
            }
        }
    }

    public static final /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : f28995a;
    }

    public static final /* synthetic */ f b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2e62ae1d", new Object[0]) : b;
    }

    public static final /* synthetic */ f c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9892363c", new Object[0]) : c;
    }

    static {
        kge.a(-729354123);
        Companion = new a(null);
        f28995a = p.b("waitConfirm", "waitSend", "all", "waitPay");
        f a2 = new f.a().a("first_data").b("none").a();
        q.b(a2, "UltronTradeHybridStorage…ONE)\n            .build()");
        b = a2;
        f a3 = new f.a().a("first_data").b("none").a();
        q.b(a3, "UltronTradeHybridStorage…ONE)\n            .build()");
        c = a3;
    }
}
