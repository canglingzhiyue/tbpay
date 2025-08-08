package com.taobao.android.litecreator.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.keu;
import tb.kge;

/* loaded from: classes5.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LC_ASK_TEMP_DIR = "/LcAskTemp";
    public static final String LC_RATE_TEMP_DIR = "/LcRateTemp";
    public static final String LC_TEMP_DIR = "/LcTemp";
    public static final String LC_XGUANG = "/XGuangCreator";

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f13504a;

    static {
        kge.a(-1073839951);
        f13504a = new AtomicBoolean(false);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : a(context, false, "/LcTemp/PublishVideo", keu.SUFFIX_MP4);
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : a(context, false, "/LcTemp/PublishVideoCover", ".jpg");
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : a(context, false, "/LcTemp/PublishImage", ".jpg");
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context}) : a(context, false, "/LcTemp/PublishImage", ".png");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.contains("/LcTemp/PublishImage");
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : a(context, false, "/LcTemp/PublishVideo", str);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : a(context, false, "/LcTemp/PublishImage", str);
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context}) : a(context, false, "/LcTemp/ComprehensionImages", ".jpg");
    }

    public static String a(Context context, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee86d018", new Object[]{context, new Boolean(z), str, str2}) : a(context, z, str, str2, true);
    }

    public static String a(Context context, boolean z, String str, String str2, boolean z2) {
        File cacheDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("859157d4", new Object[]{context, new Boolean(z), str, str2, new Boolean(z2)});
        }
        f13504a.set(true);
        if (z2) {
            cacheDir = z ? context.getExternalCacheDir() : context.getExternalFilesDir(null);
        } else {
            cacheDir = z ? context.getCacheDir() : context.getFilesDir();
        }
        if (cacheDir == null || !cacheDir.exists()) {
            return null;
        }
        String str3 = cacheDir.getAbsolutePath() + str;
        File file = new File(str3);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return str3 + "/" + l.a() + str2;
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2}) : b(context, false, str, str2);
    }

    private static String b(Context context, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36862e77", new Object[]{context, new Boolean(z), str, str2});
        }
        File externalCacheDir = z ? context.getExternalCacheDir() : context.getExternalFilesDir(null);
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            return null;
        }
        String str3 = externalCacheDir.getAbsolutePath() + str;
        File file = new File(str3);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return str3 + "/" + str2;
    }
}
