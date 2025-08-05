package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.basement.weex.a;
import com.taobao.tao.log.TLog;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class muh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE = "MyTaobao";
    public static final String MONITOR_MODULE = "MyTaoBao";
    public static final String ORDER_NUM = "orderNum";

    /* renamed from: a  reason: collision with root package name */
    private static h f31268a;
    private static h.d b;
    private static h.f c;
    private static String d;

    static {
        kge.a(-598450718);
        d = null;
        b = new h.d() { // from class: tb.muh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.alivfssdk.cache.h.d
            public void onObjectRemoveCallback(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dbe537fc", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                TLog.logd("MyTaobaoCache", "onObjectRemoveCallback, key=" + str + ", success=" + z);
            }
        };
        c = new h.f() { // from class: tb.muh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.alivfssdk.cache.h.f
            public void onObjectSetCallback(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                TLog.logd("MyTaobaoCache", "onObjectSetCallback, key=" + str + ", success=" + z);
                if (z) {
                    qpl.c(muh.MONITOR_MODULE, "LocalStorage", "write");
                } else {
                    qpl.a(muh.MONITOR_MODULE, "LocalStorage", "write", str, "Callback");
                }
            }
        };
    }

    private static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("2f1a026f", new Object[0]);
        }
        h hVar = f31268a;
        if (hVar != null) {
            return hVar;
        }
        h a2 = AVFSCacheManager.getInstance().cacheForModule("MyTaobao").a(muh.class.getClassLoader()).a(new c()).a();
        f31268a = a2;
        return a2;
    }

    public static boolean a(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbedb2ca", new Object[]{str, serializable})).booleanValue();
        }
        if (TextUtils.equals(a.DB_KEY_FEED_DATA, str)) {
            Log.e("BasementFeedData", "setCacheObjectForKey, value=" + serializable.toString());
        }
        if (serializable != null && Login.checkSessionValid()) {
            try {
                h a2 = a();
                a2.a(str + Login.getUserId(), serializable, c);
                qpl.c(MONITOR_MODULE, "LocalStorage", "write");
                return true;
            } catch (Exception e) {
                TLog.loge("MyTaobaoCache", "setCacheObjectForKey", e);
                qpl.a(MONITOR_MODULE, "LocalStorage", "write", str, Log.getStackTraceString(e));
            }
        }
        return false;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        Object b2 = b(str);
        if (TextUtils.equals(a.DB_KEY_FEED_DATA, str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("getCacheString, value=");
            sb.append(b2 == null ? "null" : b2.toString());
            Log.e("BasementFeedData", sb.toString());
        }
        if (b2 == null) {
            return null;
        }
        return b2.toString();
    }

    public static Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e4e661f", new Object[]{str});
        }
        boolean checkSessionValid = Login.checkSessionValid();
        if (!checkSessionValid && TextUtils.isEmpty(d)) {
            if (TextUtils.equals(a.DB_KEY_FEED_DATA, str)) {
                Log.e("BasementFeedData", "getCacheString, sessionValid=" + checkSessionValid + " userId=" + Login.getUserId());
            }
            return null;
        }
        if (checkSessionValid) {
            try {
                d = Login.getUserId();
            } catch (Exception e) {
                TLog.loge("MyTaobaoCache", "getCacheObjectForKey", e);
                qpl.a(MONITOR_MODULE, "LocalStorage", "read", str, Log.getStackTraceString(e));
                return null;
            }
        }
        h a2 = a();
        Object b2 = a2.b(str + d);
        qpl.c(MONITOR_MODULE, "LocalStorage", "read");
        return b2;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(a.DB_KEY_FEED_DATA, str)) {
            Log.e("BasementFeedData", "removeCacheObjectForKey");
        }
        if (!Login.checkSessionValid()) {
            return false;
        }
        try {
            h a2 = a();
            a2.a(str + Login.getUserId(), b);
            qpl.c(MONITOR_MODULE, "LocalStorage", "remove");
            return true;
        } catch (Exception e) {
            TLog.loge("MyTaobaoCache", "removeCacheObjectForKey", e);
            qpl.a(MONITOR_MODULE, "LocalStorage", "remove", str, Log.getStackTraceString(e));
            return false;
        }
    }
}
