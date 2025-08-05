package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ien {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TINT_COLOR = -1728053248;

    /* renamed from: a  reason: collision with root package name */
    private static String f28973a;
    private final a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private View f;
    private View g;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f28973a;
    }

    static {
        kge.a(557075329);
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                declaredMethod.setAccessible(true);
                f28973a = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable unused) {
                f28973a = null;
            }
        }
    }

    public ien(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.c = obtainStyledAttributes.getBoolean(0, false);
                this.d = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if ((67108864 & attributes.flags) != 0) {
                    this.c = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.d = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.b = new a(activity, this.c, this.d);
        if (!this.b.c()) {
            this.d = false;
        }
        if (this.c) {
            a(activity, viewGroup);
        }
        if (this.d) {
            b(activity, viewGroup);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = z;
        if (!this.c) {
            return;
        }
        View view = this.f;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.c) {
        } else {
            this.f.setBackgroundResource(i);
        }
    }

    private void a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdef09f", new Object[]{this, context, viewGroup});
            return;
        }
        this.f = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.b.b());
        layoutParams.gravity = 48;
        if (this.d && !this.b.a()) {
            layoutParams.rightMargin = this.b.e();
        }
        this.f.setLayoutParams(layoutParams);
        this.f.setBackgroundColor(DEFAULT_TINT_COLOR);
        this.f.setVisibility(8);
        viewGroup.addView(this.f);
    }

    private void b(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fa6f3e", new Object[]{this, context, viewGroup});
            return;
        }
        this.g = new View(context);
        if (this.b.a()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.b.d());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.b.e(), -1);
            layoutParams.gravity = 5;
        }
        this.g.setLayoutParams(layoutParams);
        this.g.setBackgroundColor(DEFAULT_TINT_COLOR);
        this.g.setVisibility(8);
        viewGroup.addView(this.g);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f28974a;
        private final boolean b;
        private final int c;
        private final int d;
        private final boolean e;
        private final int f;
        private final int g;
        private final boolean h;
        private final float i;

        static {
            kge.a(1062082691);
        }

        private a(Activity activity, boolean z, boolean z2) {
            Resources resources = activity.getResources();
            boolean z3 = false;
            this.h = resources.getConfiguration().orientation == 1;
            this.i = a(activity);
            this.c = a(resources, "status_bar_height");
            this.d = a((Context) activity);
            this.f = b(activity);
            this.g = c(activity);
            this.e = this.f > 0 ? true : z3;
            this.f28974a = z;
            this.b = z2;
        }

        private int a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
            }
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return context.getResources().getDimensionPixelSize(typedValue.resourceId);
        }

        private int b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{this, context})).intValue();
            }
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !d(context)) {
                return 0;
            }
            return a(resources, this.h ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }

        private int c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{this, context})).intValue();
            }
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT >= 14 && d(context)) {
                return a(resources, "navigation_bar_width");
            }
            return 0;
        }

        private boolean d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{this, context})).booleanValue();
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z = resources.getBoolean(identifier);
            if ("1".equals(ien.a())) {
                return false;
            }
            if (!"0".equals(ien.a())) {
                return z;
            }
            return true;
        }

        private int a(Resources resources, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("760a7176", new Object[]{this, resources, str})).intValue();
            }
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            return resources.getDimensionPixelSize(identifier);
        }

        private float a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68a25aa", new Object[]{this, activity})).floatValue();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            return Math.min(displayMetrics.widthPixels / displayMetrics.density, displayMetrics.heightPixels / displayMetrics.density);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.i >= 600.0f || this.h;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.g;
        }
    }
}
