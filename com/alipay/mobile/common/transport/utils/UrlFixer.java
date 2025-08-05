package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class UrlFixer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static BitSet allowedChars = new BitSet() { // from class: com.alipay.mobile.common.transport.utils.UrlFixer.1
        {
            for (int i = 0; i < 85; i++) {
                set(":/?#[]@!$&'()*+,;=abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%".charAt(i));
            }
        }
    };

    public static String fixUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1db17d5", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        String replaceAll = str.replaceAll("%(?![0-9A-Fa-f]{2})", "%25");
        int length = replaceAll.length();
        for (int i = 0; i < length; i++) {
            char charAt = replaceAll.charAt(i);
            if (allowedChars.get(charAt)) {
                sb.append(charAt);
            } else {
                String ch = Character.toString(charAt);
                try {
                    sb.append(URLEncoder.encode(ch, "UTF-8"));
                } catch (Exception unused) {
                    sb.append(ch);
                }
            }
        }
        int indexOf = sb.indexOf("#");
        while (indexOf >= 0) {
            indexOf = sb.indexOf("#", indexOf + 1);
            if (indexOf > 0) {
                sb.replace(indexOf, indexOf + 1, "%23");
            }
        }
        return sb.toString();
    }
}
