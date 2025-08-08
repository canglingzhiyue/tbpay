package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class llr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String[] f30698a;

    static {
        kge.a(-788233267);
    }

    public llr() {
        String a2 = ldj.a("messiahMainBizWhiteList", "Page_Home_VideoPlayer_Count,Page_Home_VideoPlayer");
        if (StringUtils.isEmpty(a2)) {
            this.f30698a = null;
            return;
        }
        try {
            this.f30698a = a2.split(",");
        } catch (Throwable th) {
            ldf.a("TBDefaultMessiah", "init white list error", th);
            this.f30698a = null;
        }
    }

    public void a(String str, String str2, String str3, Map<String, String> map, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a9de89", new Object[]{this, str, str2, str3, map, str4});
        } else if (!a(str3)) {
        } else {
            HashMap hashMap = new HashMap(16);
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            hashMap.put("featureType", str);
            hashMap.put("tagId", str2);
            hashMap.put("errorCode", str4);
            ldg.b(str3, str, hashMap);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String[] strArr = this.f30698a;
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (StringUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
