package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.d;
import com.taobao.share.ui.engine.friend.a;
import com.taobao.tao.Globals;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes7.dex */
public class mxq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-665750137);
    }

    public static void a(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af386b6c", new Object[]{imageView, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            int a2 = a(str);
            if (a2 != 0) {
                a(imageView, a2);
            } else if (!(imageView instanceof TUrlImageView)) {
            } else {
                ((TUrlImageView) imageView).setImageUrl(str);
            }
        }
    }

    public static void a(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017121", new Object[]{imageView, new Integer(i)});
            return;
        }
        String a2 = d.a(i);
        if (imageView instanceof TUrlImageView) {
            ((TUrlImageView) imageView).setImageUrl(a2);
            imageView.setImageResource(i);
            return;
        }
        imageView.setImageResource(i);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        Uri parse = Uri.parse(str);
        if (!a.CONTACTS_INFO_NOT_EMPTY_STATUS.equals(parse.getScheme())) {
            return 0;
        }
        MytaobaoApplication application = MytaobaoApplication.getApplication();
        return application.getResources().getIdentifier(parse.getHost(), a.CONTACTS_INFO_NOT_EMPTY_STATUS, application.getPackageName());
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            return djt.a(context);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        int b = b(str);
        return b == -1 ? i : b;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str != null && !str.isEmpty()) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                qpl.a(muh.MONITOR_MODULE, "ErrorMonitor", "MyTaobaoUtil-parseColor", str, e.getMessage());
            }
        }
        return -1;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && activity.isDestroyed();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!TextUtils.equals(scheme, "https")) {
            buildUpon.scheme("https");
        }
        return buildUpon.toString();
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue();
        }
        Application application = Globals.getApplication();
        if (Float.isNaN(f)) {
            return f;
        }
        float b = (f * 750.0f) / gbg.b(application);
        double d = b;
        if (d > 0.005d && b < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    public static float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{new Integer(i)})).floatValue() : i / Globals.getApplication().getResources().getDisplayMetrics().density;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        Application application = Globals.getApplication();
        return (i * Math.min(gbg.b(application), gbg.c(application))) / 375;
    }
}
