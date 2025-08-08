package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.netutil.SecurityUtils;
import org.android.spdy.QuicCacher;
import org.android.spdy.SpdyAgent;
import org.android.spdy.spduLog;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class xps implements QuicCacher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f34462a;
    private static Context b;

    @Override // org.android.spdy.QuicCacher
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!sad.z() || f34462a != null) {
        } else {
            if (context == null) {
                context = SpdyAgent.getContext();
            }
            if (context == null || f34462a != null) {
                return;
            }
            b = context;
            f34462a = context.getSharedPreferences("tnet_session_cache", 0);
        }
    }

    @Override // org.android.spdy.QuicCacher
    public boolean store(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87800600", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            a();
            if (f34462a != null && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                String encrypt = SecurityUtils.encrypt(str, str2);
                if (StringUtils.isEmpty(encrypt)) {
                    return false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", System.currentTimeMillis());
                jSONObject.put("cache", encrypt);
                f34462a.edit().putString(str, jSONObject.toString()).apply();
                return true;
            }
            return false;
        } catch (Throwable th) {
            spduLog.Tloge("tnetsdk.QuicSecureSpCache", null, "store except, key=" + str, th);
            return false;
        }
    }

    @Override // org.android.spdy.QuicCacher
    public byte[] load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("86e330c6", new Object[]{this, str});
        }
        try {
            a();
        } catch (Throwable th) {
            spduLog.Tloge("tnetsdk.QuicSecureSpCache", null, "load except, key=" + str, th);
        }
        if (f34462a != null && !StringUtils.isEmpty(str)) {
            String string = f34462a.getString(str, "");
            if (StringUtils.isEmpty(string)) {
                return null;
            }
            String optString = new JSONObject(string).optString("cache");
            if (!StringUtils.isEmpty(optString)) {
                String decrypt = SecurityUtils.decrypt(str, optString);
                if (!StringUtils.isEmpty(decrypt)) {
                    return decrypt.getBytes();
                }
                f34462a.edit().remove(str).apply();
            }
            return null;
        }
        return null;
    }

    @Override // org.android.spdy.QuicCacher
    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        try {
            a();
            if (f34462a != null && !StringUtils.isEmpty(str)) {
                f34462a.edit().remove(str).apply();
            }
        } catch (Throwable unused) {
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f34462a != null) {
        } else {
            Context context = b;
            if (context == null) {
                context = SpdyAgent.getContext();
            }
            init(context);
        }
    }
}
