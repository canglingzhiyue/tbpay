package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes8.dex */
public class ocx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(899738113);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        String str2 = context.getExternalCacheDir().getAbsolutePath() + File.separator + "ShareOutput" + File.separator + "ShareVideo" + File.separator;
        b(str2);
        return str2 + str + "_" + System.currentTimeMillis() + keu.SUFFIX_MP4;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        String str2 = context.getExternalCacheDir().getAbsolutePath() + File.separator + "ShareOutput" + File.separator + qnt.TYPE_IMAGE + File.separator;
        b(str2);
        return str2 + str + "_mask_search.png";
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b6487b8", new Object[]{context, str});
        }
        String str2 = context.getExternalCacheDir().getAbsolutePath() + File.separator + "ShareOutput" + File.separator + qnt.TYPE_IMAGE + File.separator;
        b(str2);
        return str2 + str + "_mask_bottom.png";
    }

    public static String a(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cbb95d6", new Object[]{context, str, new Integer(i), new Integer(i2)});
        }
        String str2 = context.getExternalCacheDir().getAbsolutePath() + File.separator + "ShareOutput" + File.separator + qnt.TYPE_IMAGE + File.separator;
        b(str2);
        return str2 + str + "_" + i + "_" + i2 + "_mask_bg.png";
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b923ffb9", new Object[]{context, str});
        }
        String str2 = context.getExternalCacheDir().getAbsolutePath() + File.separator + "ShareOutput" + File.separator + qnt.TYPE_IMAGE + File.separator;
        b(str2);
        return str2 + str + "_mask_profile.png";
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (new File(str).exists()) {
            return false;
        }
        return new File(str).mkdirs();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
