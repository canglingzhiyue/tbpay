package com.unionpay;

/* loaded from: classes9.dex */
final class m implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24028a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(UPPayWapActivity uPPayWapActivity) {
        this.f24028a = uPPayWapActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0005, B:13:0x002f, B:15:0x0070, B:12:0x0024), top: B:25:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.unionpay.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7, com.unionpay.aa r8) {
        /*
            r6 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = ""
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            r3.<init>(r7)     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "url"
            java.lang.Object r7 = r3.get(r7)     // Catch: java.lang.Exception -> L20
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L20
            java.lang.String r4 = "title"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Exception -> L1e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1e
            r1 = r3
            goto L2f
        L1e:
            r3 = move-exception
            goto L22
        L20:
            r3 = move-exception
            r7 = r1
        L22:
            if (r8 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> L7d
            java.lang.String r3 = com.unionpay.UPPayWapActivity.a(r0, r3, r2)     // Catch: java.lang.Exception -> L7d
            r8.a(r3)     // Catch: java.lang.Exception -> L7d
        L2f:
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Exception -> L7d
            r3.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "waptype"
            java.lang.String r5 = "new_page"
            r3.putString(r4, r5)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "magic_data"
            java.lang.String r5 = "949A1CC"
            r3.putString(r4, r5)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "wapurl"
            r3.putString(r4, r7)     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "waptitle"
            r3.putString(r7, r1)     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "actionType"
            com.unionpay.UPPayWapActivity r1 = r6.f24028a     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = com.unionpay.UPPayWapActivity.b(r1)     // Catch: java.lang.Exception -> L7d
            r3.putString(r7, r1)     // Catch: java.lang.Exception -> L7d
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Exception -> L7d
            r7.<init>()     // Catch: java.lang.Exception -> L7d
            r7.putExtras(r3)     // Catch: java.lang.Exception -> L7d
            com.unionpay.UPPayWapActivity r1 = r6.f24028a     // Catch: java.lang.Exception -> L7d
            java.lang.Class<com.unionpay.UPPayWapActivity> r3 = com.unionpay.UPPayWapActivity.class
            r7.setClass(r1, r3)     // Catch: java.lang.Exception -> L7d
            com.unionpay.UPPayWapActivity r1 = r6.f24028a     // Catch: java.lang.Exception -> L7d
            r1.startActivity(r7)     // Catch: java.lang.Exception -> L7d
            if (r8 == 0) goto L7c
            java.lang.String r7 = "0"
            java.lang.String r1 = "success"
            java.lang.String r7 = com.unionpay.UPPayWapActivity.a(r7, r1, r2)     // Catch: java.lang.Exception -> L7d
            r8.a(r7)     // Catch: java.lang.Exception -> L7d
        L7c:
            return
        L7d:
            r7 = move-exception
            if (r8 == 0) goto L8b
            java.lang.String r7 = r7.getMessage()
            java.lang.String r7 = com.unionpay.UPPayWapActivity.a(r0, r7, r2)
            r8.a(r7)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.m.a(java.lang.String, com.unionpay.aa):void");
    }
}
