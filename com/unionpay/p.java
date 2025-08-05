package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class p implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24031a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(UPPayWapActivity uPPayWapActivity) {
        this.f24031a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        String b2;
        String b3;
        try {
            this.f24031a.i = aaVar;
            String optString = new JSONObject(str).optString("scheme");
            if (TextUtils.isEmpty(optString)) {
                if (aaVar == null) {
                    return;
                }
                b2 = UPPayWapActivity.b("1", "Parameter error", (String) null);
                aaVar.a(b2);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(optString));
            try {
                this.f24031a.startActivity(intent);
            } catch (Exception unused) {
                if (aaVar == null) {
                    return;
                }
                b3 = UPPayWapActivity.b("2", "Call application error", (String) null);
                aaVar.a(b3);
            }
        } catch (Exception e) {
            if (aaVar == null) {
                return;
            }
            b = UPPayWapActivity.b("1", e.getMessage(), (String) null);
            aaVar.a(b);
        }
    }
}
