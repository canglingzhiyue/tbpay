package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.File;

/* loaded from: classes5.dex */
public class nld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (b(context, "bootimage_coldstart_launch").exists()) {
            return context.getSharedPreferences("bootimage_coldstart_launch", 0).getBoolean("needLaunchRely", false);
        }
        String string = context.getSharedPreferences(tcs.BOOTIMAGE_GROUP_NAME, 0).getString("cold_start_boot_info", "");
        return !StringUtils.isEmpty(string) && !StringUtils.equals(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, string);
    }

    private static File b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4a8e03a4", new Object[]{context, str});
        }
        File file = new File(context.getCacheDir().getParentFile(), "shared_prefs");
        return new File(file, str + ".xml");
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (b(context, "bootimage_coldstart_launch").exists()) {
            return context.getSharedPreferences("bootimage_coldstart_launch", 0).getBoolean("needLaunchOnly", false);
        }
        String string = context.getSharedPreferences(tcs.BOOTIMAGE_GROUP_NAME, 0).getString("bootimage_info_coldstart", "");
        return !StringUtils.isEmpty(string) && !StringUtils.equals("{\"result\":[]}", string);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        String str2 = null;
        if (b(context, "bootimage_coldstart_launch").exists()) {
            str2 = context.getSharedPreferences("bootimage_coldstart_launch", 0).getString("userId", null);
        }
        if (str2 != null) {
            return str2;
        }
        try {
            return PreferenceManager.getDefaultSharedPreferences(context).getString("UserId", str);
        } catch (ClassCastException unused) {
            return str;
        }
    }
}
