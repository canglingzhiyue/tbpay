package tb;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.cts;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0010H\u0007J\b\u0010\u0019\u001a\u00020\u0010H\u0007J\b\u0010\u001a\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/utils/UltronTradeHybridSwitcherHelper;", "", "()V", "ORANGE_KEY_ALI_PAY", "", "ORANGE_KEY_HYBRID_CONTAINER", "ORANGE_KEY_LIGHT_BUY", "ORANGE_KEY_MY_TAOBAO", "ORANGE_KEY_NEW_BUY", "ORANGE_KEY_ORDER_DETAIL", "ORANGE_KEY_ORDER_LIST", "ORANGE_KEY_PAY_SUCCESS", "ORANGE_KEY_PURCHASE", "ORANGE_KEY_REFUND_LIST", "ORANGE_KEY_WAIT_PAY", "enableCustomCallback", "", TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, "enablePreRender", "bizName", "enablePreRequest", "enablePreRequestFrontEnd", "enablePreRequestImage", "enableStorage", "enableSurfaceViewRenderMode", "enableTradeHybrid", "enableTradeHybridThemis", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class iro {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final iro INSTANCE;
    public static final String ORANGE_KEY_ALI_PAY = "tradeHybridAlipay";
    public static final String ORANGE_KEY_HYBRID_CONTAINER = "trade_weex_container";
    public static final String ORANGE_KEY_LIGHT_BUY = "tradeHybridLightBuy";
    public static final String ORANGE_KEY_MY_TAOBAO = "tradeHybridMytaobao";
    public static final String ORANGE_KEY_NEW_BUY = "tradeHybridNewBuy";
    public static final String ORANGE_KEY_ORDER_DETAIL = "tradeHybridOrderDetail";
    public static final String ORANGE_KEY_ORDER_LIST = "tradeHybridOrderList";
    public static final String ORANGE_KEY_PAY_SUCCESS = "tradeHybridPaySuccess";
    public static final String ORANGE_KEY_PURCHASE = "tradeHybridPurchase";
    public static final String ORANGE_KEY_REFUND_LIST = "tradeHybridRefundList";
    public static final String ORANGE_KEY_WAIT_PAY = "tradeHybridWaitPay";

    static {
        kge.a(-1838008644);
        INSTANCE = new iro();
    }

    private iro() {
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : spk.a(ORANGE_KEY_HYBRID_CONTAINER, "enableTradeHybrid", true);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : spk.a(ORANGE_KEY_HYBRID_CONTAINER, "enableSurfaceViewRenderMode", true);
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : spk.a(ORANGE_KEY_HYBRID_CONTAINER, "enableTradeHybridThemis", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r4.equals(tb.alz.BizKeyOrderDetail) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r4.equals("waitPay") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r4.equals("tbWaitPayDetail") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (com.alibaba.ability.localization.b.c() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (tb.add.a() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (tb.spk.a(tb.iro.ORANGE_KEY_WAIT_PAY, "enablePaySuccessPreRender", false) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r4.equals(tb.alz.BizKeyOrderList) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        r4 = r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (r4 == (-2076803997)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r4 == 344030109) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        if (r5.equals(tb.cts.a.BIZ_CONFIRM_GOOD) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
        return tb.spk.a("babelorder", "enableConfirmGoodTradeHybrid", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
        if (r5.equals(tb.cts.a.BIZ_LOGISTICS) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
        return tb.spk.a(tb.iro.ORANGE_KEY_ORDER_LIST, "enableLogisticsPreRender", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
        return false;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iro.b(java.lang.String, java.lang.String):boolean");
    }

    @JvmStatic
    public static final boolean a(String sceneName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{sceneName, str})).booleanValue();
        }
        q.d(sceneName, "sceneName");
        switch (sceneName.hashCode()) {
            case -1414960566:
                if (sceneName.equals("alipay") && !b.c() && add.a() && spk.a(ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequest", true)) {
                    return true;
                }
                break;
            case -767426601:
                if (sceneName.equals("refundProcess")) {
                    return spk.a(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundRefundProcess", false);
                }
                break;
            case -391817972:
                if (sceneName.equals(alz.BizKeyOrderList)) {
                    return spk.a(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundOrderList", true);
                }
                break;
            case 120528346:
                if (sceneName.equals("mytaobao") && str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode == -934813832) {
                        if (str.equals(alz.BizKeyRefund)) {
                            return spk.a(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefund", true);
                        }
                    } else if (hashCode == -754911396 && str.equals(cts.a.BIZ_ORDER_LIST)) {
                        return spk.a(ORANGE_KEY_MY_TAOBAO, "enablePreRequestOrderList", true);
                    }
                }
                return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        return tb.spk.a("babelorder", "enableConfirmGoodTradeHybrid", true);
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.iro.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r4 = "3dd7e577"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L19:
            java.lang.String r0 = "sceneName"
            kotlin.jvm.internal.q.d(r4, r0)
            int r0 = r4.hashCode()
            r1 = -1414960566(0xffffffffaba96a4a, float:-1.2037673E-12)
            if (r0 == r1) goto L4c
            r1 = -391817972(0xffffffffe8a5550c, float:-6.2460745E24)
            if (r0 == r1) goto L3b
            r1 = 1187338559(0x46c5593f, float:25260.623)
            if (r0 == r1) goto L32
            goto L6b
        L32:
            java.lang.String r0 = "orderDetail"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L6b
            goto L43
        L3b:
            java.lang.String r0 = "orderList"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L6b
        L43:
            java.lang.String r4 = "babelorder"
            java.lang.String r0 = "enableConfirmGoodTradeHybrid"
            boolean r4 = tb.spk.a(r4, r0, r3)
            return r4
        L4c:
            java.lang.String r0 = "alipay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L6b
            boolean r4 = com.alibaba.ability.localization.b.c()
            if (r4 != 0) goto L6b
            boolean r4 = tb.add.a()
            if (r4 == 0) goto L6b
            java.lang.String r4 = "tradeHybridAlipay"
            java.lang.String r0 = "enablePaySuccessPreRequestFrontEnd"
            boolean r4 = tb.spk.a(r4, r0, r3)
            if (r4 == 0) goto L6b
            return r3
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iro.b(java.lang.String):boolean");
    }

    @JvmStatic
    public static final boolean c(String sceneName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{sceneName})).booleanValue();
        }
        q.d(sceneName, "sceneName");
        int hashCode = sceneName.hashCode();
        if (hashCode != -391817972) {
            return hashCode == 120528346 && sceneName.equals("mytaobao") && spk.a(ORANGE_KEY_MY_TAOBAO, "enableMytaobaoPreRequestImage", true) && add.a("AB_OrderListPrefetchImg_Android", "Prefetch_Opt_Android", "hitGray", true);
        } else if (sceneName.equals(alz.BizKeyOrderList) && spk.a(ORANGE_KEY_MY_TAOBAO, "enableMytaobaoPreRequestImage", true) && add.a("AB_OrderListPrefetchImg_Android", "Prefetch_Opt_Android", "hitGray", true)) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean d(String sceneName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{sceneName})).booleanValue();
        }
        q.d(sceneName, "sceneName");
        int hashCode = sceneName.hashCode();
        if (hashCode != -1414960566) {
            if (hashCode == -767426601) {
                if (sceneName.equals("refundProcess")) {
                    return spk.a(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundRefundProcess", false);
                }
            } else if (hashCode == 120528346 && sceneName.equals("mytaobao")) {
                return spk.a(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefund", true);
            }
        } else if (sceneName.equals("alipay") && !b.c() && add.a() && spk.a(ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequest", true)) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean e(String sceneName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{sceneName})).booleanValue();
        }
        q.d(sceneName, "sceneName");
        return spk.a(ORANGE_KEY_HYBRID_CONTAINER, "enableCustomCallback", true);
    }
}
