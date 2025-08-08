package tb;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ohh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f32059a;
    private static LruCache<String, Object> b;

    static {
        kge.a(436620265);
        f32059a = new HashMap();
        b = new LruCache<>(5);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            f32059a.put(str, obj);
        }
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return f32059a.get(str);
        }
        return null;
    }

    public static boolean b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18567e93", new Object[]{str, obj})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (obj != null) {
            b.put(str, obj);
        } else {
            b.remove(str);
        }
        a.a().q().a(str, obj);
        return true;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2)) {
            return false;
        }
        b.remove(str2);
        return a.a().q().b(str, str2);
    }

    public static void a(final String str, final IStorage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13256ee6", new Object[]{str, aVar});
        } else {
            new AsyncTask() { // from class: tb.ohh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public Object doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : ohh.b(str);
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                        return;
                    }
                    IStorage.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(obj);
                }
            }.execute(null);
        }
    }

    public static Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e4e661f", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Object obj = f32059a.get(str);
        if (obj != null) {
            return obj;
        }
        Object obj2 = b.get(str);
        if (obj2 != null) {
            return obj2;
        }
        Object b2 = a.a().q().b(str);
        if (b2 != null) {
            b.put(str, b2);
        }
        return b2;
    }

    public static Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c56c56fe", new Object[]{str});
        }
        ogh.a("getInitDataCache");
        long currentTimeMillis = System.currentTimeMillis();
        b.remove(str);
        Object b2 = a.a().q().b(str);
        ogg.a("cacheABTest", "cache data key " + str + " cost time " + (System.currentTimeMillis() - currentTimeMillis));
        ogh.b();
        return b2;
    }
}
