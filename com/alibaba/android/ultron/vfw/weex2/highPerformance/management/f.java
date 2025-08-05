package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.TBMainHost;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.alz;
import tb.cts;
import tb.ifn;
import tb.iro;
import tb.jqd;
import tb.jqh;
import tb.kge;
import tb.spk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/management/UltronTradeHybridTabManager;", "", "()V", "mytaobaoStageDestroyed", "", "mytaobaoStageResume", "notifyTabChanged", "tabNum", "", "(Ljava/lang/Integer;)V", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f2778a;

        public b(JSONObject jSONObject) {
            this.f2778a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f2778a.put((JSONObject) "useCustomDataSource", "true");
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_RESUME, "mytaobao", this.f2778a);
        }
    }

    static {
        kge.a(-1483263975);
        INSTANCE = new f();
    }

    private f() {
    }

    public final void a(Integer num) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else if (!spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableAddTabListener", true)) {
        } else {
            if (num != null && num.intValue() == 0) {
                b();
                str = "tabHomepage";
            } else if (num != null && num.intValue() == 1) {
                b();
                str = "tabGuangGuang";
            } else if (num != null && num.intValue() == 2) {
                com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache.a.a(15);
                b();
                str = "tabMessage";
            } else if (num != null && num.intValue() == 3) {
                com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache.a.a(1);
                b();
                str = "tabCart";
            } else {
                com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache.a.a(9);
                a();
                str = "mytaobao";
            }
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_TAB_CHANGE, str, null);
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        TBMainHost a2 = TBMainHost.a();
        q.b(a2, "TBMainHost.get()");
        Context context = a2.getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        jSONObject2.put((JSONObject) "context", (String) ((Activity) context));
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a3 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
        q.b(a3, "UltronTradeHybridManager.getInstance()");
        j f = a3.f();
        q.b(f, "UltronTradeHybridManager…etInstance().cacheManager");
        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefund", true) && f.c("first_data", alz.BizKeyRefund)) {
            jSONObject2.put((JSONObject) "enablePreRequestRefund", (String) true);
        }
        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enablePreRequestOrderList", true)) {
            List<String> a4 = ifn.Companion.a();
            jqd a5 = jqd.a("order_list");
            q.b(a5, "UltronMMKV.get(\"order_list\")");
            String userId = Login.getUserId();
            int a6 = spk.a(iro.ORANGE_KEY_MY_TAOBAO, "maxWotaoRequestNum", 4);
            for (String str : a4) {
                if (a6 > 0) {
                    if (f.a(userId + str, cts.a.BIZ_ORDER_LIST) == null) {
                        if (a5.e(userId + str) == null) {
                            a6--;
                            jSONObject2.put((JSONObject) ("enablePreRequestListCode" + str), (String) true);
                        }
                    }
                }
            }
        }
        jqh.a(new b(jSONObject), spk.a(iro.ORANGE_KEY_MY_TAOBAO, "onMyTaobaoOptDelayMills", 0L));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "mytaobao", null);
            }
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            jqh.a(a.INSTANCE, 0L);
        }
    }
}
