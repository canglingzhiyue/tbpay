package com.unionpay;

import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class n implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24029a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(UPPayWapActivity uPPayWapActivity) {
        this.f24029a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        String b2;
        String str2;
        String b3;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                if (aaVar == null) {
                    return;
                }
                b2 = UPPayWapActivity.b("1", "Parameter error", (String) null);
                aaVar.a(b2);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (true) {
                str2 = "0";
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("packageName");
                if (com.unionpay.utils.b.a(this.f24029a, string, jSONObject2.getString("packageSign"), jSONObject2.getString(BaseFBPlugin.ACT_CONF.supportVersion))) {
                    str2 = "1";
                }
                jSONObject.put(string, str2);
                i++;
            }
            if (aaVar == null) {
                return;
            }
            b3 = UPPayWapActivity.b(str2, "success", jSONObject);
            aaVar.a(b3);
        } catch (Exception e) {
            if (aaVar == null) {
                return;
            }
            b = UPPayWapActivity.b("1", e.getMessage(), (String) null);
            aaVar.a(b);
        }
    }
}
