package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class InvokeQrGenStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeQrGenStore(int i) {
        super(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:13|(16:15|(1:17)|18|19|20|21|22|(1:24)|25|26|27|28|(1:30)|31|32|33)(1:42)|39|26|27|28|(0)|31|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:30:0x0095, B:32:0x00bc, B:33:0x00c0), top: B:41:0x0095 }] */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r18, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r19) {
        /*
            r17 = this;
            r1 = r17
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.drivers.stores.store.events.InvokeQrGenStore.$ipChange
            boolean r2 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1d
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r1
            r2[r4] = r18
            r2[r3] = r19
            java.lang.String r3 = "719dcfee"
            java.lang.Object r0 = r0.ipc$dispatch(r3, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1d:
            com.alipay.android.msp.core.clients.MspUIClient r0 = r1.c
            r2 = 0
            if (r0 == 0) goto Ldf
            com.alipay.android.msp.core.clients.MspUIClient r0 = r1.c
            com.alipay.android.msp.ui.presenters.MspBasePresenter r0 = r0.getCurrentPresenter()
            if (r0 != 0) goto L2c
            goto Ldf
        L2c:
            com.alipay.android.msp.core.clients.MspUIClient r0 = r1.c
            com.alipay.android.msp.ui.presenters.MspBasePresenter r0 = r0.getCurrentPresenter()
            com.alipay.android.msp.ui.contracts.MspBaseContract$IView r0 = r0.mo545getIView()
            if (r0 != 0) goto L39
            return r2
        L39:
            com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel r0 = com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel.L
            r2 = 128(0x80, float:1.794E-43)
            com.alibaba.fastjson.JSONObject r6 = r19.getActionParamsJson()
            java.lang.String r7 = ""
            if (r6 == 0) goto L6e
            java.lang.String r8 = "content"
            java.lang.String r8 = r6.getString(r8)
            if (r8 == 0) goto L4e
            goto L4f
        L4e:
            r8 = r7
        L4f:
            java.lang.String r9 = "ecLevel"
            java.lang.String r9 = r6.getString(r9)
            com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel r0 = com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel.valueOf(r9)     // Catch: java.lang.Exception -> L59
        L59:
            java.lang.String r9 = "width"
            java.lang.Integer r6 = r6.getInteger(r9)     // Catch: java.lang.Exception -> L6b
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L6b
            if (r6 == 0) goto L67
            r2 = r6
        L67:
            r14 = r0
            r13 = r2
            r9 = r8
            goto L72
        L6b:
            r14 = r0
            r9 = r8
            goto L70
        L6e:
            r14 = r0
            r9 = r7
        L70:
            r13 = 128(0x80, float:1.794E-43)
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "content="
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r2 = ", ecLevel="
            r0.append(r2)
            r0.append(r14)
            java.lang.String r2 = ", width="
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "InvokeQrGenStore:onMspAction"
            com.alipay.android.msp.utils.LogUtil.record(r4, r2, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> Lcb
            r0.<init>()     // Catch: java.lang.Exception -> Lcb
            com.alipay.android.msp.framework.minizxing.BarcodeFormat r10 = com.alipay.android.msp.framework.minizxing.BarcodeFormat.QR_CODE     // Catch: java.lang.Exception -> Lcb
            r11 = 0
            r15 = 0
            r16 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12 = r13
            android.graphics.Bitmap r6 = com.alipay.android.msp.utils.ZXingHelper.createCodeBitmap(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> Lcb
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> Lcb
            r6.compress(r8, r5, r0)     // Catch: java.lang.Exception -> Lcb
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Exception -> Lcb
            java.lang.String r7 = android.util.Base64.encodeToString(r0, r3)     // Catch: java.lang.Exception -> Lcb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcb
            java.lang.String r3 = "img length= "
            r0.<init>(r3)     // Catch: java.lang.Exception -> Lcb
            if (r7 == 0) goto Lc0
            int r5 = r7.length()     // Catch: java.lang.Exception -> Lcb
        Lc0:
            r0.append(r5)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lcb
            com.alipay.android.msp.utils.LogUtil.record(r4, r2, r0)     // Catch: java.lang.Exception -> Lcb
            goto Lcf
        Lcb:
            r0 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
        Lcf:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.lang.String r2 = "img"
            r0.put(r2, r7)
            java.lang.String r0 = r0.toJSONString()
            return r0
        Ldf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.InvokeQrGenStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
