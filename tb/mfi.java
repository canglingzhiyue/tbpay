package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.c;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.m;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class mfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31058a;

    static {
        kge.a(-1303917768);
        f31058a = mfi.class.getSimpleName();
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        if (l.e(str)) {
            return null;
        }
        try {
            b cacheForModule = AVFSCacheManager.getInstance().cacheForModule("taobao_live_home");
            if (cacheForModule == null) {
                return null;
            }
            return cacheForModule.a(cacheForModule.c()).a(new c()).a().b(str);
        } catch (Exception e) {
            String str2 = f31058a;
            m.a(str2, "read data [" + str + "] exp", e);
            return null;
        }
    }

    public static boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            b cacheForModule = AVFSCacheManager.getInstance().cacheForModule("taobao_live_home");
            if (cacheForModule == null) {
                return false;
            }
            return cacheForModule.a(cacheForModule.c()).a(new c()).a().a(str, obj);
        } catch (Exception e) {
            String str2 = f31058a;
            m.a(str2, "write data [" + str + "] exp", e);
            return false;
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context != null && !l.e(str)) {
            try {
                return context.getSharedPreferences("taobao_live_home", 0).getString(str, "");
            } catch (Exception e) {
                String str2 = f31058a;
                m.a(str2, "read preferences [" + str + "] exp", e);
            }
        }
        return null;
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context != null && !l.e(str)) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("taobao_live_home", 0).edit();
                edit.putString(str, str2);
                edit.apply();
                return true;
            } catch (Exception e) {
                String str3 = f31058a;
                m.a(str3, "write preferences [" + str + "] exp", e);
            }
        }
        return false;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                try {
                    byteArrayOutputStream.close();
                    proxy_open.close();
                } catch (Exception e) {
                    m.a(f31058a, "read assets close stream exp.", e);
                }
                return byteArrayOutputStream2;
            } catch (Exception e2) {
                m.a(f31058a, "read assets write buffer exp.", e2);
                try {
                    byteArrayOutputStream.close();
                    proxy_open.close();
                    return null;
                } catch (Exception e3) {
                    m.a(f31058a, "read assets close stream exp.", e3);
                    return null;
                }
            }
        } catch (Exception e4) {
            m.a(f31058a, "read assets open assets exp.", e4);
            return null;
        }
    }
}
