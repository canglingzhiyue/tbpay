package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.adjust")
/* loaded from: classes6.dex */
public final class jtk extends jte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1380554647);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    @Override // tb.aro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.android.aura.b r14) {
        /*
            r13 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jtk.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r13
            r1[r2] = r14
            java.lang.String r14 = "2c671180"
            r0.ipc$dispatch(r14, r1)
            return
        L15:
            java.lang.String r0 = r14.f()
            java.lang.String r1 = "AURANextRPCServiceDomain"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
            return
        L22:
            java.util.Map r14 = r14.c()
            java.lang.Class<com.alibaba.android.aura.datamodel.nextrpc.a> r0 = com.alibaba.android.aura.datamodel.nextrpc.a.class
            r1 = 0
            java.lang.String r3 = "NextRPCRemoteResponse"
            java.lang.Object r14 = tb.bbc.a(r14, r3, r0, r1)
            com.alibaba.android.aura.datamodel.nextrpc.a r14 = (com.alibaba.android.aura.datamodel.nextrpc.a) r14
            if (r14 != 0) goto L41
            tb.ard r14 = tb.arc.a()
            java.lang.String r0 = "TBBuyAdjustOrderErrorExtension"
            java.lang.String r1 = "onError"
            java.lang.String r2 = "remoteResponse is null"
            r14.c(r0, r1, r2)
            return
        L41:
            java.lang.String r0 = r14.a()
            java.lang.String r3 = "F-10000-00-15-002"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4e
            return
        L4e:
            com.alibaba.android.aura.q r3 = r13.b()
            boolean r3 = tb.dss.a(r3, r14)
            if (r3 == 0) goto L59
            return
        L59:
            java.lang.String r3 = r14.b()
            mtopsdk.mtop.domain.MtopResponse r6 = r14.g()
            r14 = 200(0xc8, float:2.8E-43)
            if (r6 == 0) goto L84
            int r14 = r6.getResponseCode()
            java.lang.String r1 = r6.getMappingCode()
            boolean r4 = r6.isNetworkError()
            if (r4 == 0) goto L7b
            int r4 = com.taobao.taobao.R.string.purchase_taobao_app_1029_1_19084
            java.lang.String r4 = com.alibaba.ability.localization.b.a(r4)
        L79:
            r12 = r4
            goto L85
        L7b:
            boolean r4 = r6.isApiLockedResult()
            if (r4 == 0) goto L84
            java.lang.String r4 = com.taobao.android.purchase.core.b.BUILD_DATA_PARSE_ERROR_MSG_NEW
            goto L79
        L84:
            r12 = r3
        L85:
            com.alibaba.android.aura.q r4 = r13.b()
            android.content.Context r5 = r4.e()
            java.lang.String r4 = "FAIL_SYS_SESSION_EXPIRED"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9f
            boolean r14 = r5 instanceof android.app.Activity
            if (r14 == 0) goto Lba
            android.app.Activity r5 = (android.app.Activity) r5
            r5.finish()
            goto Lba
        L9f:
            r3 = 419(0x1a3, float:5.87E-43)
            if (r3 != r14) goto La6
            java.lang.String r3 = com.taobao.android.purchase.core.b.BUILD_ORDER_WARNING_TITLE_NEW
            goto Lba
        La6:
            java.lang.String r3 = com.taobao.android.purchase.core.b.CREATE_ORDER_WARNING_TITLE
            boolean r14 = android.text.TextUtils.isEmpty(r1)
            if (r14 != 0) goto Lb0
            r8 = r1
            goto Lb1
        Lb0:
            r8 = r0
        Lb1:
            java.lang.String r7 = com.taobao.android.purchase.core.b.CREATE_ORDER_WARNING_TITLE
            r10 = 1
            r11 = 0
            r4 = r13
            r9 = r12
            r4.a(r5, r6, r7, r8, r9, r10, r11)
        Lba:
            boolean r14 = android.text.TextUtils.isEmpty(r1)
            if (r14 != 0) goto Lc1
            goto Lc2
        Lc1:
            r1 = r0
        Lc2:
            com.taobao.android.purchase.core.utils.c.a(r1, r12)
            tb.aqs r14 = r13.a()
            com.alibaba.android.aura.b r1 = new com.alibaba.android.aura.b
            java.lang.String r4 = "AbsAURAErrorExtension"
            r1.<init>(r2, r4, r0, r3)
            r14.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jtk.a(com.alibaba.android.aura.b):void");
    }
}
