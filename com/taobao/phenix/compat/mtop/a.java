package com.taobao.phenix.compat.mtop;

import android.os.Build;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import tb.ado;
import tb.riy;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f18907a = {"img.alicdn.com", "gw.alicdn.com", "mdn.alicdn.com", "picasso.alicdn.com", "cbu01.alicdn.com"};

    public static Pair<String, Boolean> a(String str) {
        String[] strArr;
        String sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str});
        }
        Pair<String, Boolean> pair = new Pair<>(str, false);
        if (!StringUtils.isEmpty(str) && str.endsWith(".jpg") && !str.contains("-cib")) {
            try {
                String c = c(str);
                for (String str2 : f18907a) {
                    if (StringUtils.equals(str2, c)) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int indexOf = sb2.indexOf(str2);
                        if (!str.contains(".jpg_") && !str.contains(".png_")) {
                            String str3 = "_1200x1200q90.jpg";
                            if (com.taobao.phenix.intf.b.h().G() && ((Build.VERSION.SDK_INT >= 23 && !Process.is64Bit()) || SceneIdentifier.getDeviceLevel() == 3)) {
                                str3 = "_960x960q75.jpg";
                            }
                            StringBuilder replace = sb2.replace(indexOf, str2.length() + indexOf, "heic.alicdn.com");
                            replace.append(str3);
                            replace.append("_.heic");
                            sb = replace.toString();
                            return new Pair<>(sb, true);
                        }
                        if (com.taobao.phenix.intf.b.h().x()) {
                            return pair;
                        }
                        StringBuilder replace2 = sb2.replace(indexOf, str2.length() + indexOf, "heic.alicdn.com");
                        replace2.append("_.heic");
                        sb = replace2.toString();
                        return new Pair<>(sb, true);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return pair;
    }

    private static String c(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            i = 2;
        } else {
            int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
            i = indexOf < 0 ? 0 : indexOf + 3;
        }
        if (i >= str.length()) {
            return "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 < 0) {
            indexOf2 = str.length();
        }
        String substring = str.substring(i, indexOf2);
        return (substring.contains(riy.BLOCK_START_STR) || substring.contains(",") || !substring.contains(".")) ? "" : substring;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        String c = c(str);
        for (String str2 : f18907a) {
            if (StringUtils.equals(str2, c)) {
                return true;
            }
        }
        return false;
    }
}
