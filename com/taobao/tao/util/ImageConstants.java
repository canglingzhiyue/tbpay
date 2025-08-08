package com.taobao.tao.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ImageConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String isTaobaocdnPic = ".*taobao.*|.*cdn.*";
    private static Pattern sCDNPattern;

    public static boolean isTaboCDN(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bf7b9e", new Object[]{str})).booleanValue();
        }
        if (sCDNPattern == null) {
            sCDNPattern = Pattern.compile(isTaobaocdnPic);
        }
        if (StringUtils.isEmpty(str) || str.contains("a.tbcdn") || str.contains("b.tbcdn")) {
            return false;
        }
        return sCDNPattern.matcher(str).matches();
    }
}
