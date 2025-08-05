package tb;

import android.app.Activity;
import android.os.Bundle;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.android.ultron.trade.presenter.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.t;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bed;

/* loaded from: classes2.dex */
public class bdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f25827a;

    static {
        kge.a(999476798);
    }

    public static /* synthetic */ void a(bdy bdyVar, Activity activity, Bundle bundle, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca7ba48", new Object[]{bdyVar, activity, bundle, new Integer(i), str, new Boolean(z)});
        } else {
            bdyVar.a(activity, bundle, i, str, z);
        }
    }

    public bdy(c cVar) {
        this.f25827a = cVar;
    }

    public String a(IDMComponent iDMComponent, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("554f3438", new Object[]{this, iDMComponent, bundle});
        }
        c cVar = this.f25827a;
        if (cVar == null) {
            return "presenter_is_null";
        }
        try {
            return JSONObject.parseObject(iDMComponent.getFields().getString("couponApply")) != null ? "need_coupon" : a(cVar.m(), bundle) ? "true" : "touch_down_perf_disable";
        } catch (Throwable th) {
            th.printStackTrace();
            return "coupon_exception";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: Throwable -> 0x009b, TryCatch #0 {Throwable -> 0x009b, blocks: (B:11:0x0042, B:15:0x0053, B:17:0x0063, B:22:0x0074, B:24:0x0094, B:21:0x006c), top: B:29:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.ultron.common.model.IDMComponent r17, final java.lang.String r18, final int r19, final android.os.Bundle r20, final boolean r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r20
            com.android.alibaba.ip.runtime.IpChange r0 = tb.bdy.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r17
            r2 = 2
            r1[r2] = r18
            r2 = 3
            java.lang.Integer r3 = new java.lang.Integer
            r10 = r19
            r3.<init>(r10)
            r1[r2] = r3
            r2 = 4
            r1[r2] = r9
            r2 = 5
            java.lang.Boolean r3 = new java.lang.Boolean
            r11 = r21
            r3.<init>(r11)
            r1[r2] = r3
            java.lang.String r2 = "e8a03b0d"
            r0.ipc$dispatch(r2, r1)
            return
        L33:
            r10 = r19
            r11 = r21
            com.alibaba.android.ultron.trade.presenter.c r0 = r8.f25827a
            if (r0 != 0) goto L3c
            return
        L3c:
            android.app.Activity r12 = r0.m()
            if (r9 == 0) goto L52
            java.lang.String r0 = "float"
            java.lang.String r1 = "pageType"
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L52
            r13 = 1
            goto L53
        L52:
            r13 = 0
        L53:
            com.alibaba.fastjson.JSONObject r0 = r17.getFields()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "couponApply"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L9b
            com.alibaba.fastjson.JSONObject r14 = com.alibaba.fastjson.JSONObject.parseObject(r0)     // Catch: java.lang.Throwable -> L9b
            if (r14 == 0) goto L9b
            boolean r0 = a()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L6c
            r0 = 0
        L6a:
            r15 = r0
            goto L74
        L6c:
            com.alibaba.android.icart.core.widget.b r0 = new com.alibaba.android.icart.core.widget.b     // Catch: java.lang.Throwable -> L9b
            int r1 = com.taobao.taobao.R.style.Ultron_Dialog_Cart_PromotionDialog     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r12, r1)     // Catch: java.lang.Throwable -> L9b
            goto L6a
        L74:
            tb.bdy$1 r7 = new tb.bdy$1     // Catch: java.lang.Throwable -> L9b
            r0 = r7
            r1 = r16
            r2 = r15
            r3 = r20
            r4 = r12
            r5 = r19
            r6 = r18
            r8 = r7
            r7 = r21
            r0.<init>()     // Catch: java.lang.Throwable -> L9b
            com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent r0 = tb.bdz.a(r14, r8)     // Catch: java.lang.Throwable -> L9b
            com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent r0 = r0.setModalBuy(r13)     // Catch: java.lang.Throwable -> L9b
            r0.runEvent(r12, r14)     // Catch: java.lang.Throwable -> L9b
            if (r15 == 0) goto L9a
            int r0 = com.taobao.taobao.R.layout.icart_loading_promotion_submit     // Catch: java.lang.Throwable -> L9b
            r1 = -2
            r15.a(r0, r1, r1)     // Catch: java.lang.Throwable -> L9b
        L9a:
            return
        L9b:
            r0 = r16
            r1 = r12
            r2 = r20
            r3 = r19
            r4 = r18
            r5 = r21
            r0.a(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bdy.a(com.taobao.android.ultron.common.model.IDMComponent, java.lang.String, int, android.os.Bundle, boolean):void");
    }

    public static boolean a() {
        bni bniVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!bea.w() || (bniVar = (bni) AliAdaptServiceManager.getInstance().findAliAdaptService(bni.class)) == null) {
            return false;
        }
        return Boolean.parseBoolean(bniVar.getParams().get("enablePrefetch"));
    }

    private void a(Activity activity, Bundle bundle, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510ee241", new Object[]{this, activity, bundle, new Integer(i), str, new Boolean(z)});
            return;
        }
        bed.a(bed.a.b("SettlementSuccess").a("成功下单").a(0.001f));
        bni bniVar = (bni) AliAdaptServiceManager.getInstance().findAliAdaptService(bni.class);
        if (!z && bniVar != null && bniVar.process(activity, bundle, i)) {
            return;
        }
        t.a().a(activity).b(i).a(bundle).a(str);
    }

    private boolean a(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18eae0de", new Object[]{this, activity, bundle})).booleanValue();
        }
        bed.a(bed.a.b("SettlementSuccess").a("成功下单").a(0.001f));
        bni bniVar = (bni) AliAdaptServiceManager.getInstance().findAliAdaptService(bni.class);
        if (bniVar == null) {
            return false;
        }
        return bniVar.prefetch(activity, bundle);
    }
}
