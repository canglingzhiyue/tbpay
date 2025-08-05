package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.android.base.Versions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes8.dex */
public class oyb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STRING = "encode";

    static {
        kge.a(-162456659);
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return null;
        }
        return str + "encode" + str2;
    }

    public static Bitmap a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2cf2285a", new Object[]{str, str2});
        }
        if (str != null && str2 != null) {
            h a2 = AVFSCacheManager.getInstance().defaultCache().a();
            String b = b(str, str2);
            InputStream d = a2.d(b);
            if (d == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(d);
            if (decodeStream != null) {
                if (Versions.isDebug()) {
                    String str3 = "get cache true: " + b;
                }
                return decodeStream;
            } else if (Versions.isDebug()) {
                String str4 = "get cache false: " + b;
            }
        }
        return null;
    }

    public static boolean a(Bitmap bitmap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76e0bcde", new Object[]{bitmap, str, str2})).booleanValue();
        }
        if (bitmap == null || str == null || str2 == null) {
            return false;
        }
        String b = b(str, str2);
        boolean a2 = AVFSCacheManager.getInstance().defaultCache().a().a(b, (InputStream) new ByteArrayInputStream(oxz.a(bitmap)));
        if (Versions.isDebug()) {
            String str3 = "set cache:" + b;
        }
        return a2;
    }
}
