package com.taobao.browser;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import tb.kge;
import tb.ngr;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1897297702);
    }

    public static boolean a(String str) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("wopc_jae_rules");
            if (configs != null && !configs.isEmpty()) {
                Iterator<String> it = configs.keySet().iterator();
                a2 = false;
                while (it.hasNext() && !(a2 = a(configs.get(it.next()), str))) {
                }
            } else {
                a2 = a("^http[s]?://([^/\\?#]+\\.)*(?:jae\\.(?:m|wapa|waptest)\\.taobao\\.com|jaeapp\\.com|amap\\.com|autonavi\\.com|mapabc\\.com|jaecdn\\.com)([\\?|#|/].*)?$", str);
                ngr.c("JaeUrlChecker", "get rules from remote error or no rules in remote");
            }
            ngr.c("JaeUrlChecker", str + " isJaeUrl " + a2);
            return a2;
        } catch (Exception e) {
            ngr.c("JaeUrlChecker", "isJaeUrl error" + e.getLocalizedMessage());
            return false;
        }
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return Pattern.compile(str).matcher(str2).matches();
        } catch (Exception e) {
            ngr.c("JaeUrlChecker", str + " error" + e.getLocalizedMessage());
            return false;
        }
    }
}
