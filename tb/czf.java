package tb;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class czf {

    /* renamed from: a  reason: collision with root package name */
    private czh f26612a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public czf(czh czhVar) {
        this.f26612a = null;
        this.f26612a = czhVar;
    }

    public String a() {
        czh czhVar = this.f26612a;
        if (czhVar != null) {
            String b = czhVar.b();
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    if (this.f26612a.c().a() != jSONObject.optInt("version", -1)) {
                        return null;
                    }
                    return jSONObject.optString("content");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public boolean a(String str) {
        if (this.f26612a != null) {
            if (TextUtils.isEmpty(str)) {
                this.f26612a.a();
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("content", str);
                jSONObject.put("version", this.f26612a.c().a());
                this.f26612a.a(jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
