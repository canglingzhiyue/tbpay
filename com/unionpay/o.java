package com.unionpay;

/* loaded from: classes9.dex */
final class o implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24030a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(UPPayWapActivity uPPayWapActivity) {
        this.f24030a = uPPayWapActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // com.unionpay.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r13, com.unionpay.aa r14) {
        /*
            r12 = this;
            java.lang.String r0 = "extra"
            java.lang.String r1 = "1"
            r2 = 0
            com.unionpay.UPPayWapActivity r3 = r12.f24030a     // Catch: java.lang.Exception -> Lce
            com.unionpay.UPPayWapActivity.a(r3, r14)     // Catch: java.lang.Exception -> Lce
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lce
            r3.<init>(r13)     // Catch: java.lang.Exception -> Lce
            java.lang.String r13 = "packageName"
            java.lang.String r13 = r3.getString(r13)     // Catch: java.lang.Exception -> Lce
            java.lang.String r4 = "type"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> Lce
            java.lang.String r5 = "openParams"
            java.lang.String r5 = r3.optString(r5)     // Catch: java.lang.Exception -> Lce
            java.lang.String r6 = "tn"
            java.lang.String r6 = r3.optString(r6)     // Catch: java.lang.Exception -> Lce
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Exception -> Lce
            java.lang.String r7 = "0"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.Exception -> Lce
            java.lang.String r8 = "Call application error"
            r9 = 1
            java.lang.String r10 = "Parameter error"
            java.lang.String r11 = "2"
            if (r7 == 0) goto L84
            boolean r4 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Lce
            if (r4 != 0) goto L7a
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lce
            if (r4 != 0) goto L7a
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> Lce
            r4.<init>()     // Catch: java.lang.Exception -> Lce
            java.lang.String r5 = "com.unionpay.uppay.PayActivity"
            r4.setClassName(r13, r5)     // Catch: java.lang.Exception -> Lce
            java.lang.String r13 = "paydata"
            r4.putExtra(r13, r6)     // Catch: java.lang.Exception -> Lce
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a()     // Catch: java.lang.Exception -> Lce
            com.unionpay.UPPayWapActivity r5 = r12.f24030a     // Catch: java.lang.Exception -> Lce
            java.lang.String r5 = com.unionpay.UPPayWapActivity.c(r5)     // Catch: java.lang.Exception -> Lce
            r4.putExtra(r13, r5)     // Catch: java.lang.Exception -> Lce
            r4.putExtra(r0, r3)     // Catch: java.lang.Exception -> Lce
            com.unionpay.UPPayWapActivity r13 = r12.f24030a     // Catch: java.lang.Exception -> L70
            r13.startActivityForResult(r4, r9)     // Catch: java.lang.Exception -> L70
            return
        L70:
            if (r14 == 0) goto L79
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a(r11, r8, r2)     // Catch: java.lang.Exception -> Lce
            r14.a(r13)     // Catch: java.lang.Exception -> Lce
        L79:
            return
        L7a:
            if (r14 == 0) goto Lcd
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a(r1, r10, r2)     // Catch: java.lang.Exception -> Lce
            r14.a(r13)     // Catch: java.lang.Exception -> Lce
            return
        L84:
            boolean r4 = r11.equals(r4)     // Catch: java.lang.Exception -> Lce
            if (r4 == 0) goto Lc4
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lce
            if (r4 != 0) goto Lba
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> Lce
            java.lang.String r6 = "android.intent.action.VIEW"
            r4.<init>(r6)     // Catch: java.lang.Exception -> Lce
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> Lce
            r4.setData(r5)     // Catch: java.lang.Exception -> Lce
            r4.putExtra(r0, r3)     // Catch: java.lang.Exception -> Lce
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Lce
            if (r0 != 0) goto Laa
            r4.setPackage(r13)     // Catch: java.lang.Exception -> Lce
        Laa:
            com.unionpay.UPPayWapActivity r13 = r12.f24030a     // Catch: java.lang.Exception -> Lb0
            r13.startActivityForResult(r4, r9)     // Catch: java.lang.Exception -> Lb0
            return
        Lb0:
            if (r14 == 0) goto Lb9
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a(r11, r8, r2)     // Catch: java.lang.Exception -> Lce
            r14.a(r13)     // Catch: java.lang.Exception -> Lce
        Lb9:
            return
        Lba:
            if (r14 == 0) goto Lcd
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a(r1, r10, r2)     // Catch: java.lang.Exception -> Lce
            r14.a(r13)     // Catch: java.lang.Exception -> Lce
            return
        Lc4:
            if (r14 == 0) goto Lcd
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a(r1, r10, r2)     // Catch: java.lang.Exception -> Lce
            r14.a(r13)     // Catch: java.lang.Exception -> Lce
        Lcd:
            return
        Lce:
            r13 = move-exception
            if (r14 == 0) goto Ldc
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.unionpay.UPPayWapActivity.a(r1, r13, r2)
            r14.a(r13)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.o.a(java.lang.String, com.unionpay.aa):void");
    }
}
