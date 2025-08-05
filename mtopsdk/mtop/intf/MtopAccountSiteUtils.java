package mtopsdk.mtop.intf;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes.dex */
public class MtopAccountSiteUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ConcurrentMap<String, String> siteMap;

    static {
        kge.a(-1330200717);
        siteMap = new ConcurrentHashMap();
    }

    public static String getInstanceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f61ee9", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return siteMap.get(str);
        }
        return null;
    }

    public static boolean bindInstanceId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f622f82", new Object[]{str})).booleanValue() : bindInstanceId(Mtop.Id.INNER, str);
    }

    public static boolean bindInstanceId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f75b5cc", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Mtop.getMtopInstance(str) != null && !siteMap.containsKey(str2)) {
            synchronized (MtopAccountSiteUtils.class) {
                if (!siteMap.containsKey(str2)) {
                    siteMap.put(str2, str);
                    return true;
                }
            }
        }
        return false;
    }
}
