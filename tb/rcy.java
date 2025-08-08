package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.c;
import com.taobao.android.litecreator.util.n;

/* loaded from: classes9.dex */
public class rcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-771554411);
    }

    public static Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            String str2 = split[0];
            if (split.length >= 2) {
                str2 = split[1];
            }
            byte[] decode = Base64.decode(str2, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        Bitmap a2 = a(str);
        if (a2 == null) {
            return null;
        }
        String c = n.c(context);
        if (!c.a(a2, c)) {
            return null;
        }
        return c;
    }
}
