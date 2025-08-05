package com.taobao.taobaoavsdk;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.g;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT = "MediaPlayer_";
    public static final String CONDITION_KEY_NONCE_100 = "nonce_100";
    public static final String CONDITION_KEY_PROXY_AVAILABLE = "proxyAvailable";
    public static final String CONDITION_KEY_URL = "url";
    public static final String MODULE_HLS_FMP4 = "hls_fmp4_20240620";
    public static final String VARIATION_KEY_REWRITE = "rewrite";

    static {
        kge.a(1373827683);
    }

    public static g a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("29ad017", new Object[]{str});
        }
        g.a aVar = new g.a(str);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(CONDITION_KEY_NONCE_100, Integer.valueOf(new Random().nextInt(100)));
        arrayMap.put("url", str);
        VariationSet activate = UTABTest.activate(COMPONENT, MODULE_HLS_FMP4, arrayMap, null);
        String[][] strArr = (String[][]) com.taobao.taobaoavsdk.util.h.a(activate, VARIATION_KEY_REWRITE, String[][].class);
        if (activate.size() > 0) {
            aVar.a(activate);
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        aVar.b = a(str, strArr);
        return aVar.a();
    }

    public static String a(String str, String[][] strArr) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e20f4c84", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2 != null && strArr2.length == 2 && (a2 = a(str, strArr2[0], strArr2[1])) != null) {
                return a2;
            }
        }
        return str;
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        if (matcher.find()) {
            return matcher.replaceFirst(str3);
        }
        return null;
    }
}
