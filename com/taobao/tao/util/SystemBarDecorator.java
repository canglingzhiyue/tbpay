package com.taobao.tao.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.graphics.ColorUtils;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SystemBarDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENABLE_KEY = "immersive_status_enable";
    private static final String GROUP_NAME = "message_box_switch";
    private static final int MASK_COLOR = 805306368;
    private static final String TAG = "SystemBarDecorator";
    private WeakReference<Activity> mActivity;
    private SystemBarConfig mConfig;
    private boolean mNavBarAvailable = false;
    private boolean mStatusBarAvailable;
    private View mStatusBarTintView;
    private int mType;

    public SystemBarDecorator(Activity activity) {
        this.mStatusBarAvailable = true;
        this.mActivity = new WeakReference<>(activity);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mType = 2;
        } else if (Build.VERSION.SDK_INT >= 19) {
        } else {
            this.mType = 0;
            this.mStatusBarAvailable = false;
        }
    }

    public SystemBarConfig getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarConfig) ipChange.ipc$dispatch("d88fa4a0", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        if (this.mConfig == null) {
            this.mConfig = new SystemBarConfig(this.mActivity.get(), this.mStatusBarAvailable, this.mNavBarAvailable);
        }
        return this.mConfig;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.mType;
    }

    public boolean isStatusBarAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73cbbb5d", new Object[]{this})).booleanValue() : this.mStatusBarAvailable;
    }

    @Deprecated
    public boolean enableImmersiveStatus(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1181ae7", new Object[]{this, new Boolean(z)})).booleanValue() : enableImmersiveStatus(null, true, z);
    }

    @Deprecated
    public boolean enableImmersiveStatus(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83e9e49d", new Object[]{this, str, new Boolean(z)})).booleanValue() : enableImmersiveStatus(str, true, z);
    }

    @Deprecated
    public boolean enableImmersiveStatus(String str, boolean z, boolean z2) {
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f953615f", new Object[]{this, str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (!this.mStatusBarAvailable || (weakReference = this.mActivity) == null || weakReference.get() == null) {
            return false;
        }
        Activity activity = this.mActivity.get();
        int i = this.mType;
        if (i != 1) {
            if (i == 2) {
                activity.getWindow().clearFlags(201326592);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                if (z2) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(1024);
                }
            } else {
                this.mStatusBarAvailable = false;
                return false;
            }
        }
        setStatusBarColor(str, z);
        return true;
    }

    public void setStatusBarColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d82f5b5", new Object[]{this, str});
        } else {
            setStatusBarColor(str, true);
        }
    }

    public void setStatusBarColor(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32dc73bf", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int parseColor = Color.parseColor("#ffffff");
        if (!TextUtils.isEmpty(str)) {
            parseColor = Color.parseColor(str);
        }
        setStatusBarColor(parseColor, z);
    }

    public void setStatusBarColor(int i, boolean z) {
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ffa21c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!this.mStatusBarAvailable || (weakReference = this.mActivity) == null || weakReference.get() == null) {
        } else {
            Activity activity = this.mActivity.get();
            if (z) {
                i = ColorUtils.compositeColors(MASK_COLOR, i);
            }
            int i2 = this.mType;
            if (i2 == 1 || i2 != 2) {
                return;
            }
            activity.getWindow().setStatusBarColor(i);
        }
    }

    public void enableFitsWindowsOnRoot(boolean z) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1d716e", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference == null || weakReference.get() == null || (childAt = ((ViewGroup) this.mActivity.get().findViewById(16908290)).getChildAt(0)) == null || !z) {
            return;
        }
        childAt.setFitsSystemWindows(true);
    }

    /* loaded from: classes8.dex */
    public static class SystemBarConfig {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
        private static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
        private static final String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
        private static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
        private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
        private final int mActionBarHeight;
        private final boolean mInPortrait;
        private final float mSmallestWidthDp;
        private final int mStatusBarHeight;
        private final boolean mTranslucentNavBar;
        private final boolean mTranslucentStatusBar;

        public SystemBarConfig(Activity activity, boolean z, boolean z2) {
            this.mInPortrait = isPortrait(activity);
            this.mSmallestWidthDp = getSmallestWidthDp(activity);
            this.mStatusBarHeight = getStatusBarHeight(activity);
            this.mActionBarHeight = getActionBarHeight(activity);
            this.mTranslucentStatusBar = z;
            this.mTranslucentNavBar = z2;
        }

        public static int getActionBarHeight(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be5e9886", new Object[]{context})).intValue();
            }
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        public static int getStatusBarHeight(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue() : getInternalDimensionSize(context.getResources(), STATUS_BAR_HEIGHT_RES_NAME);
        }

        private static int getInternalDimensionSize(Resources resources, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("84c806a3", new Object[]{resources, str})).intValue();
            }
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            return resources.getDimensionPixelSize(identifier);
        }

        private float getSmallestWidthDp(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6abde4e6", new Object[]{this, activity})).floatValue();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            return Math.min(displayMetrics.widthPixels / displayMetrics.density, displayMetrics.heightPixels / displayMetrics.density);
        }

        public static boolean isPortrait(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1709c060", new Object[]{context})).booleanValue() : context.getResources().getConfiguration().orientation == 1;
        }

        public boolean isNavigationAtBottom() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34e993c7", new Object[]{this})).booleanValue() : this.mSmallestWidthDp >= 600.0f || this.mInPortrait;
        }

        public int getStatusBarHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue() : this.mStatusBarHeight;
        }

        public int getActionBarHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue() : this.mActionBarHeight;
        }

        public int getPixelInsetTop(boolean z) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e386c38", new Object[]{this, new Boolean(z)})).intValue();
            }
            int i2 = this.mTranslucentStatusBar ? this.mStatusBarHeight : 0;
            if (z) {
                i = this.mActionBarHeight;
            }
            return i2 + i;
        }
    }

    public boolean enableImmersiveStatusBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("80119d34", new Object[]{this})).booleanValue() : enableImmersiveStatusBar(false);
    }

    public boolean enableImmersiveStatusBar(boolean z) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8222bba8", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return false;
        }
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = activity.getWindow();
            int systemUiVisibility = TBStatusBarSwitch.isIconVisibleFeatureOpen(activity) ? window2.getDecorView().getSystemUiVisibility() : 0;
            try {
                if (z) {
                    window2.clearFlags(201326592);
                    window2.getDecorView().setSystemUiVisibility(systemUiVisibility | 9472);
                    window2.addFlags(Integer.MIN_VALUE);
                } else {
                    window2.clearFlags(201334784);
                    window2.getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
                    window2.addFlags(Integer.MIN_VALUE);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            window2.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
        }
        if (TBStatusBarUtils.isMIUIDevice()) {
            TBStatusBarUtils.miuiSetStatusBarLightMode(activity, z);
        } else if (TBStatusBarUtils.isMeizuDevice()) {
            TBStatusBarUtils.setStatusBarDarkIcon(activity, z);
        }
        return true;
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue() : getSystemComponentDimen(context, "status_bar_height");
    }

    public static int getSystemComponentDimen(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8f46c5", new Object[]{context, str})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier(str, "dimen", "android");
            Log.e(TAG, str + " " + identifier);
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
