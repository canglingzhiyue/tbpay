package tb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class acm {

    /* renamed from: a  reason: collision with root package name */
    private Context f25243a;

    private acm(Context context) {
        this.f25243a = context;
    }

    public static acm a(Context context) {
        return new acm(context);
    }

    public int a() {
        Configuration configuration = this.f25243a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public boolean b() {
        return Build.VERSION.SDK_INT >= 19 || !ViewConfiguration.get(this.f25243a).hasPermanentMenuKey();
    }

    public int c() {
        return this.f25243a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d() {
        return this.f25243a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public int e() {
        TypedArray obtainStyledAttributes = this.f25243a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
        Resources resources = this.f25243a.getResources();
        if (!d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.f25243a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g() {
        return this.f25243a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
