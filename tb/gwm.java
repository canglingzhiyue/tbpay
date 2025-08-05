package tb;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;

/* loaded from: classes5.dex */
public class gwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(933682352);
    }

    public static Drawable a(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f7dff157", new Object[]{resources, str});
        }
        if (str == null) {
            return null;
        }
        try {
            try {
                return new BitmapDrawable(resources, BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode(str, 0))));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return null;
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
