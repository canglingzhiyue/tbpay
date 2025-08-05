package tb;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.searchbaseframe.uikit.a;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.common.util.q;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes8.dex */
public class ntx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f31762a;
    private static int b;
    private static float c;

    static {
        kge.a(97958099);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (f31762a <= 0) {
            if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
                f31762a = h.a().a((Context) Globals.getApplication());
            } else {
                f31762a = Constants.screen_width;
            }
        }
        q.a("ScreenAdaptUtil", "getScreenWidth:" + f31762a);
        return f31762a;
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[0])).floatValue();
        }
        if (c <= 0.0f) {
            c = Constants.screen_density;
        }
        return c;
    }

    public static int a(int i, int i2, Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c78040d", new Object[]{new Integer(i), new Integer(i2), activity})).intValue();
        }
        if (activity instanceof a) {
            z = ((a) activity).aF_();
        }
        int a2 = (a(activity) - i) - i2;
        return !z ? a2 + SystemBarDecorator.getStatusBarHeight(activity) : a2;
    }

    public static int a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cabb047c", new Object[]{activity, new Integer(i)})).intValue() : a(activity) - i;
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            Log.e("ScreenAdaptUtil", "getContentView：activity is null");
            return c();
        }
        View findViewById = activity.findViewById(16908290);
        if (findViewById == null) {
            Log.e("ScreenAdaptUtil", "getContentView：content view is null");
            return c();
        }
        int height = findViewById.getHeight();
        if (height > 0) {
            return height;
        }
        Log.e("ScreenAdaptUtil", "getContentView：the height of content view is invalid");
        return c();
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        if (b <= 0) {
            b = Constants.screen_height;
        }
        q.a("ScreenAdaptUtil", "getScreenHeight:" + b);
        return b;
    }

    public static void a(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e34e4b", new Object[]{displayMetrics});
            return;
        }
        c = displayMetrics.density;
        f31762a = displayMetrics.widthPixels;
        b = displayMetrics.heightPixels;
    }

    public static void a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26196df8", new Object[]{new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        f31762a = i;
        b = i2;
        c = f;
    }
}
