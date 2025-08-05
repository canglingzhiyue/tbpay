package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bio f25930a;
    private JSONObject b;

    public static /* synthetic */ JSONObject a(bio bioVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("45974b40", new Object[]{bioVar, jSONObject});
        }
        bioVar.b = jSONObject;
        return jSONObject;
    }

    static {
        kge.a(-1697154240);
        f25930a = new bio();
    }

    public static bio a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bio) ipChange.ipc$dispatch("f02c916", new Object[0]) : f25930a;
    }

    private bio() {
    }

    public JSONObject a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2901b94a", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.b == null && context != null) {
            b(context, false);
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    private void b(final Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{this, context, new Boolean(z)});
        } else if (context == null) {
        } else {
            if (z) {
                new Thread(new Runnable() { // from class: tb.bio.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            bio.a(bio.this, JSON.parseObject(bis.a(context, bip.CONFIG_PATH)));
                        }
                    }
                }, "PageConfigDataProvider");
            } else {
                this.b = JSON.parseObject(bis.a(context, bip.CONFIG_PATH));
            }
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (a().b != null) {
        } else {
            a().b(context, z);
        }
    }
}
