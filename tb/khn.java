package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class khn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile khn f30074a;
    private final Context b;

    public static /* synthetic */ Context a(khn khnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e06b007f", new Object[]{khnVar}) : khnVar.b;
    }

    public static /* synthetic */ String a(khn khnVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f94c2f", new Object[]{khnVar, str}) : khnVar.e(str);
    }

    public static khn a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khn) ipChange.ipc$dispatch("34c57d95", new Object[]{context});
        }
        if (f30074a == null) {
            synchronized (khn.class) {
                if (f30074a == null) {
                    f30074a = new khn(context);
                }
            }
        }
        return f30074a;
    }

    private khn(Context context) {
        if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        try {
            String b = b();
            if (StringUtils.isEmpty(b)) {
                return null;
            }
            JSONObject parseObject = JSON.parseObject(b);
            boolean booleanValue = parseObject.getBoolean("enable").booleanValue();
            long longValue = parseObject.getLong("timestamp").longValue();
            JSONObject jSONObject = parseObject.getJSONObject("mockData");
            khu.b("enable: " + booleanValue + "timestamp: " + longValue + " mockData: " + jSONObject);
            if (!booleanValue) {
                return null;
            }
            if (System.currentTimeMillis() / 1000 >= longValue) {
                return null;
            }
            return jSONObject;
        } catch (Exception e) {
            khu.a("getServerMockData error: " + e.getMessage());
            return null;
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            kho.a().execute(new Runnable() { // from class: tb.khn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Class<?> cls = getClass();
                    khu.a(cls, "saveLoginUid: " + str);
                    if (StringUtils.isEmpty(str)) {
                        khn.a(khn.a(khn.this)).c("");
                        khn.a(khn.a(khn.this)).d("");
                        return;
                    }
                    khn.a(khn.a(khn.this)).c(str);
                    khn.a(khn.a(khn.this)).d(khn.a(khn.this, str));
                }
            });
        }
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        try {
            String staticSafeEncrypt = SecurityGuardManager.getInstance(this.b).getStaticDataEncryptComp().staticSafeEncrypt(16, "tbcp", str, "");
            Class<?> cls = getClass();
            khu.b(cls, "encryptUid: " + staticSafeEncrypt);
            return staticSafeEncrypt;
        } catch (SecException e) {
            Class<?> cls2 = getClass();
            khu.b(cls2, "encryptUid error" + e.getErrorCode() + e.toString());
            return "";
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : (String) khw.a(this.b).b("mockSet", "");
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            khw.a(this.b).a("mockSet", str);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String str = (String) khw.a(this.b).b("login_uid", "");
        Class<?> cls = getClass();
        khu.b(cls, "getUid: " + str);
        return str;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            khw.a(this.b).a("login_uid", str);
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String valueOf = String.valueOf(khw.a(this.b).b("login_encrypt_uid", ""));
        Class<?> cls = getClass();
        khu.b(cls, "getEUid: " + valueOf);
        return valueOf;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            khw.a(this.b).a("login_encrypt_uid", str);
        }
    }
}
