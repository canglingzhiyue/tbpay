package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cfx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f26274a;
    private Intent b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static cfx f26276a = new cfx();
    }

    public static /* synthetic */ void a(cfx cfxVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d82b5b", new Object[]{cfxVar, jSONObject});
        } else {
            cfxVar.a(jSONObject);
        }
    }

    public static cfx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cfx) ipChange.ipc$dispatch("f033349", new Object[0]) : a.f26276a;
    }

    public Intent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ee89e30a", new Object[]{this});
        }
        if (this.b == null) {
            this.b = a((Intent) null, cfy.a().c());
        }
        return this.b;
    }

    public synchronized void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            c().execute(new Runnable() { // from class: tb.cfx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        cfx.a(cfx.this, new JSONObject(str));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject(cge.a().b);
            if (optJSONObject == null) {
                d();
                return;
            }
            String optString = optJSONObject.optString("versionProp");
            if (StringUtils.isEmpty(optString)) {
                b(optJSONObject);
            } else {
                a(optJSONObject, optString);
            }
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
        } else if (a(jSONObject.optJSONArray("default")) != null) {
        } else {
            d();
        }
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str});
            return;
        }
        try {
            String a2 = cge.a().a(str);
            if (StringUtils.isEmpty(a2) || a(jSONObject.optJSONArray(a2)) != null) {
                return;
            }
            b(jSONObject);
        } catch (Throwable unused) {
        }
    }

    private Intent a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("72adc1d1", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                intent = a(intent, jSONObject);
                if (cgb.a(intent)) {
                    this.b = intent;
                    cfy.a().a(jSONObject.toString());
                    return intent;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Intent a(Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("64cfce3a", new Object[]{this, intent, jSONObject});
        }
        if (jSONObject == null) {
            return intent;
        }
        if (intent == null) {
            intent = new Intent();
            intent.addFlags(268435456);
        }
        String optString = jSONObject.optString("packageName");
        if (!StringUtils.isEmpty(optString)) {
            intent.setPackage(optString);
        }
        String optString2 = jSONObject.optString("className");
        if (!StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString2)) {
            intent.setClassName(optString, optString2);
        }
        String optString3 = jSONObject.optString("action");
        if (!StringUtils.isEmpty(optString3)) {
            intent.setAction(optString3);
        }
        String optString4 = jSONObject.optString("data");
        if (!StringUtils.isEmpty(optString4)) {
            intent.setData(Uri.parse(optString4));
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("category");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    intent.addCategory((String) optJSONArray.get(i));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("flag");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    intent.addFlags(((Integer) optJSONArray2.get(i2)).intValue());
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("extras");
            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray3.get(i3);
                    if (jSONObject2 != null) {
                        String optString5 = jSONObject2.optString("key");
                        if (!StringUtils.isEmpty(optString5)) {
                            intent.putExtra(optString5, jSONObject2.optString("value"));
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String optString6 = jSONObject.optString("extraPkgKey");
        if (!StringUtils.isEmpty(optString6)) {
            intent.putExtra(optString6, cfw.e());
        } else {
            intent.putExtra("packageName", cfw.e());
        }
        String optString7 = jSONObject.optString("uidKey");
        if (!StringUtils.isEmpty(optString7)) {
            intent.putExtra(optString7, cfw.f());
        }
        String optString8 = jSONObject.optString("nameForUidKey");
        if (!StringUtils.isEmpty(optString8)) {
            intent.putExtra(optString8, cfw.g());
        }
        String optString9 = jSONObject.optString("appLabelKey");
        if (!StringUtils.isEmpty(optString9)) {
            intent.putExtra(optString9, cfw.c());
        }
        String optString10 = jSONObject.optString("appIconKey");
        if (!StringUtils.isEmpty(optString10)) {
            intent.putExtra(optString10, cfw.d());
        }
        String optString11 = jSONObject.optString("versionCodeKey");
        if (!StringUtils.isEmpty(optString11)) {
            intent.putExtra(optString11, cfw.h());
        }
        String optString12 = jSONObject.optString("versionNameKey");
        if (!StringUtils.isEmpty(optString12)) {
            intent.putExtra(optString12, cfw.i());
        }
        return intent;
    }

    public synchronized ThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("5b89fc4a", new Object[]{this});
        }
        if (this.f26274a == null) {
            this.f26274a = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), cgb.a("PermissionRouter_Parse", false));
            this.f26274a.allowCoreThreadTimeOut(true);
        }
        return this.f26274a;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = null;
        cfy.a().b();
    }
}
