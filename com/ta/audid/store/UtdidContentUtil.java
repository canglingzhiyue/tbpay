package com.ta.audid.store;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.RC4;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.Base64;
import tb.kge;

/* loaded from: classes4.dex */
public class UtdidContentUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(479255713);
    }

    public static String getEncodedContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df65868e", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(Base64.encode(RC4.rc4(str.getBytes()), 2), "UTF-8");
        } catch (Exception e) {
            UtdidLogger.e("", e, new Object[0]);
            return "";
        }
    }
}
