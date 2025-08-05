package com.taobao.android.lightbuy.performance;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jvw;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f13284a = new JSONObject();

    static {
        kge.a(-2064310576);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f85bd323", new Object[0]);
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        Intent intent = activity.getIntent();
        long longExtra = intent.getLongExtra("START_CLICK_TIME", 0L);
        if (longExtra != 0) {
            this.f13284a.put("BuyButtonClick", (Object) Long.valueOf(longExtra));
        }
        long longExtra2 = intent.getLongExtra("COUPON_FINISH", 0L);
        if (longExtra2 != 0) {
            this.f13284a.put("CouponEnd", (Object) Long.valueOf(longExtra2));
        }
        long longExtra3 = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        if (longExtra3 != 0) {
            this.f13284a.put(jvw.KEY_PAGE_STAGES_STANDARD_NAV_START, (Object) Long.valueOf(longExtra3));
        }
        long longExtra4 = intent.getLongExtra("NEW_BUY_ON_CREATE_TIME", 0L);
        if (longExtra4 == 0) {
            return;
        }
        this.f13284a.put("OrderInit", (Object) Long.valueOf(longExtra4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r10.equals(com.taobao.android.lightbuy.performance.LightBuyStage.WEEX_INIT) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.lightbuy.performance.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r9
            r1[r3] = r10
            java.lang.String r10 = "f3a64c32"
            r0.ipc$dispatch(r10, r1)
            return
        L15:
            long r0 = java.lang.System.currentTimeMillis()
            r5 = -1
            int r6 = r10.hashCode()
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1568064630: goto L4b;
                case -1566912924: goto L41;
                case -600527357: goto L37;
                case 945379533: goto L2d;
                case 1082676878: goto L24;
                default: goto L23;
            }
        L23:
            goto L55
        L24:
            java.lang.String r6 = "WEEX_INIT"
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L55
            goto L56
        L2d:
            java.lang.String r2 = "WEEX_REQ_INVOKED"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L55
            r2 = 4
            goto L56
        L37:
            java.lang.String r2 = "MTOP_REQ_END"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L55
            r2 = 2
            goto L56
        L41:
            java.lang.String r2 = "WEEX_REQ_CALLBACK"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L55
            r2 = 3
            goto L56
        L4b:
            java.lang.String r2 = "MTOP_REQ_START"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L55
            r2 = 1
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L91
            if (r2 == r3) goto L85
            if (r2 == r4) goto L79
            if (r2 == r8) goto L6d
            if (r2 == r7) goto L61
            goto L6c
        L61:
            com.alibaba.fastjson.JSONObject r10 = r9.f13284a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "WeexReqInvoked"
            r10.put(r1, r0)
        L6c:
            return
        L6d:
            com.alibaba.fastjson.JSONObject r10 = r9.f13284a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "WeexReqCallback"
            r10.put(r1, r0)
            return
        L79:
            com.alibaba.fastjson.JSONObject r10 = r9.f13284a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "MTOPReqEnd"
            r10.put(r1, r0)
            return
        L85:
            com.alibaba.fastjson.JSONObject r10 = r9.f13284a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "MTOPReqStart"
            r10.put(r1, r0)
            return
        L91:
            com.alibaba.fastjson.JSONObject r10 = r9.f13284a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "WeexInit"
            r10.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.lightbuy.performance.a.a(java.lang.String):void");
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f13284a.put(str, (Object) str2);
        }
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.f13284a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f13284a.clear();
        }
    }
}
