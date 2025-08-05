package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.al;
import com.ut.share.ShareEnv;

/* loaded from: classes8.dex */
public class obl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        boolean a(String str);
    }

    static {
        kge.a(-515193228);
    }

    public static String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c770f637", new Object[0]);
        }
        if (ShareEnv.getApplication().getApplicationInfo().targetSdkVersion >= 33 && Build.VERSION.SDK_INT >= 33) {
            return new String[]{al.READ_MEDIA_IMAGES, al.READ_MEDIA_VIDEO, "android.permission.READ_MEDIA_AUDIO"};
        }
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : obm.b() && ShareEnv.getApplication().getApplicationInfo().targetSdkVersion >= 33 && Build.VERSION.SDK_INT >= 33;
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68bb17a6", new Object[]{aVar})).booleanValue();
        }
        if (ShareEnv.getApplication().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
            return aVar.a("android.permission.READ_EXTERNAL_STORAGE") && aVar.a("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return aVar.a(al.READ_MEDIA_IMAGES) && aVar.a(al.READ_MEDIA_VIDEO) && aVar.a("android.permission.READ_MEDIA_AUDIO");
    }
}
