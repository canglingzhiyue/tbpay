package com.taobao.taobao.scancode.gateway.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import tb.cot;
import tb.kge;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-539489399);
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
            List<String> a3 = new q().a();
            if (a3 != null && !a3.isEmpty()) {
                Iterator<String> it = a3.iterator();
                a2 = false;
                while (it.hasNext() && !(a2 = a(it.next(), str))) {
                }
                cot.d("JaeUrlChecker", str + " isJaeUrl " + a2);
                return a2;
            }
            a2 = a("^http[s]?://([^/\\?#]+\\.)*(?:jae\\.(?:m|wapa|waptest)\\.taobao\\.com|jaeapp\\.com|amap\\.com|autonavi\\.com|mapabc\\.com|jaecdn\\.com)([\\?|#|/].*)?$", str);
            cot.d("JaeUrlChecker", "get rules from remote error or no rules in remote");
            cot.d("JaeUrlChecker", str + " isJaeUrl " + a2);
            return a2;
        } catch (Exception e) {
            cot.a("JaeUrlChecker", "isJaeUrl error", e);
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
            cot.a("JaeUrlChecker", str + " error", e);
            return false;
        }
    }
}
