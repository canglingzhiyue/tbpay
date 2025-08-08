package tb;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class kyv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CID = "default";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, LruCache<String, String>> f30411a = new HashMap(4);

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        LruCache<String, String> a2 = a(str);
        if (str3 == null) {
            a2.remove(str2);
            c.a("PopStaticCache ", "remove key=" + str2);
            return;
        }
        a2.put(str2, str3);
        c.a("PopStaticCache ", "save key=" + str2 + ", value=" + str3);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String str3 = a(str).get(str2);
        c.a("PopStaticCache ", "get static cache, key=" + str2 + ", value=" + str3);
        return str3;
    }

    private static LruCache<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("d04c4963", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            c.a("PopStaticCache ", "cid is empty, set to default");
            str = "default";
        }
        LruCache<String, String> lruCache = f30411a.get(str);
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<String, String> lruCache2 = new LruCache<>(64);
        f30411a.put(str, lruCache2);
        return lruCache2;
    }
}
