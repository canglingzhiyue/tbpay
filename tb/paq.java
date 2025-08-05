package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class paq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1944502135);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("insideDetailType", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("code", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            if (str4.length() > 100) {
                str4 = str4.substring(0, 99);
            }
            hashMap.put("url", str4);
        }
        pmd.a().e().b("Page_TaobaoLiveWatch", str, hashMap);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("hit", "true");
        hashMap.put("itemSourceType", str2);
        pmd.a().e().b("Page_TaobaoLiveWatch", "PreloadItemHit", hashMap);
    }
}
