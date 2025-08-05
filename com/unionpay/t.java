package com.unionpay;

import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class t implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(UPPayWapActivity uPPayWapActivity) {
        this.f24035a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        String b2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                UPUtils.a(this.f24035a, jSONObject.getString(next), next);
            }
            if (aaVar == null) {
                return;
            }
            b2 = UPPayWapActivity.b("0", "success", (String) null);
            aaVar.a(b2);
        } catch (Exception e) {
            if (aaVar == null) {
                return;
            }
            b = UPPayWapActivity.b("1", e.getMessage(), (String) null);
            aaVar.a(b);
        }
    }
}
