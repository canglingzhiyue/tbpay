package com.taobao.message.uikit.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IMPLocalizedProvider;
import com.taobao.message.kit.provider.IToLargeScreenProvider;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import tb.gbg;
import tb.kge;

/* loaded from: classes7.dex */
public class DisplayUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int DEF_KEYBOARD_HEIGHT = 0;
    public static final String Preference_KeyBoardHeight = "Preference_KeyBoardHeight";
    public static int SCREEN_HEIGHT_OFFSET = 0;
    private static final String TAG = "msgcenter:DisplayUtil";
    public static int actionBarHeight;
    public static ComponentCallbacks configCallback;
    public static int half_screen_width;
    private static int isLargeScreen;
    public static float screen_density;
    public static int screen_height;
    public static int screen_width;
    public static int screen_widthmul2;
    public static int statusBarHeight;

    static {
        kge.a(-1977780769);
        screen_density = -1.0f;
        screen_width = -1;
        screen_height = -1;
        statusBarHeight = -1;
        actionBarHeight = -1;
        configCallback = null;
        DEF_KEYBOARD_HEIGHT = 214;
        isLargeScreen = -1;
    }

    public static void initScreenConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aa2585", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = ApplicationUtil.getApplication().getResources().getDisplayMetrics();
        if (configCallback == null) {
            Application application = ApplicationUtil.getApplication();
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: com.taobao.message.uikit.util.DisplayUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bbd23dd", new Object[]{this});
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                        return;
                    }
                    DisplayUtil.resetKeyBoardHeight();
                    DisplayUtil.reset();
                }
            };
            configCallback = componentCallbacks;
            application.registerComponentCallbacks(componentCallbacks);
        }
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            SCREEN_HEIGHT_OFFSET = 96;
        }
        Configuration configuration = ApplicationUtil.getApplication().getResources().getConfiguration();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            SCREEN_HEIGHT_OFFSET = 96;
        }
        if (configuration.orientation == 2) {
            half_screen_width = displayMetrics.heightPixels / 2;
            screen_density = displayMetrics.density;
            screen_width = displayMetrics.heightPixels;
            screen_height = displayMetrics.widthPixels - SCREEN_HEIGHT_OFFSET;
            screen_widthmul2 = screen_width << 1;
            return;
        }
        half_screen_width = displayMetrics.widthPixels / 2;
        screen_density = displayMetrics.density;
        screen_width = displayMetrics.widthPixels;
        screen_height = displayMetrics.heightPixels - SCREEN_HEIGHT_OFFSET;
        screen_widthmul2 = screen_width << 1;
    }

    public static int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        if (screen_width < 0) {
            initScreenConfig();
        }
        return screen_width;
    }

    public static int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (screen_height < 0) {
            initScreenConfig();
        }
        return screen_height;
    }

    public static int getRealScreenHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e765beb3", new Object[]{activity})).intValue();
        }
        if (activity != null && activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
            return activity.getWindow().getDecorView().getHeight();
        }
        return getScreenHeight();
    }

    public static float getScreenDensity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        if (screen_density < 0.0f) {
            initScreenConfig();
        }
        return screen_density;
    }

    public static void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        screen_density = -1.0f;
        screen_width = -1;
        screen_height = -1;
        statusBarHeight = -1;
        actionBarHeight = -1;
    }

    public static int dip2px(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue() : (int) ((f * getScreenDensity()) + 0.5f);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static float px2w750(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7806b54", new Object[]{context, new Float(f)})).floatValue();
        }
        float screenWidth = getScreenWidth();
        if (screenWidth <= 0.0f) {
            return 0.0f;
        }
        return (f * 750.0f) / screenWidth;
    }

    public static float measureTextWidth(String str, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82772a88", new Object[]{str, textView})).floatValue();
        }
        if (textView != null && str != null) {
            return textView.getPaint().measureText(str);
        }
        return 0.0f;
    }

    public static void getTextBounds(float f, String str, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442949ce", new Object[]{new Float(f), str, rect});
            return;
        }
        Paint paint = new Paint();
        paint.setTextSize(f);
        paint.getTextBounds(str, 0, str.length(), rect);
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int i = statusBarHeight;
        return i != -1 ? i : getInternalDimensionSize(context.getResources(), "status_bar_height");
    }

    private static int getInternalDimensionSize(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84c806a3", new Object[]{resources, str})).intValue();
        }
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        statusBarHeight = i;
        return i;
    }

    public static int getActionBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[0])).intValue();
        }
        int i = actionBarHeight;
        if (i != -1) {
            return i;
        }
        TypedArray obtainStyledAttributes = ApplicationUtil.getApplication().getTheme().obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        actionBarHeight = dimension;
        return dimension;
    }

    public static boolean isVisibleOnScreen(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74900c5c", new Object[]{view})).booleanValue();
        }
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.intersect(new Rect(0, 0, getScreenWidth(), getScreenHeight()));
    }

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8bb227", new Object[]{listView});
            return;
        }
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int count = adapter.getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            View view = adapter.getView(i2, null, listView);
            view.measure(0, 0);
            i += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
    }

    public static int getRealPx(Object obj) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aebb42d2", new Object[]{obj})).intValue();
        }
        if (obj == null) {
            return -1;
        }
        try {
            if (obj instanceof String) {
                intValue = Integer.valueOf((String) obj).intValue();
            } else {
                intValue = ((Integer) obj).intValue();
            }
            return Math.round(getRealPxByWidth(intValue));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static float getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a42f8b16", new Object[]{new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * getScreenWidth()) / 750.0f;
        double d = screenWidth;
        if (d > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue() : (int) (f / context.getResources().getDisplayMetrics().density);
    }

    public static int sp2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20fc282f", new Object[]{context, new Float(f)})).intValue() : (int) (f * context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int getKeyBoardHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cb41f3e", new Object[0])).intValue() : SharedPreferencesUtil.getIntSharedPreference("Preference_KeyBoardHeight", dip2px(DEF_KEYBOARD_HEIGHT));
    }

    public static void resetKeyBoardHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b88104", new Object[0]);
        } else {
            SharedPreferencesUtil.addIntSharedPreference("Preference_KeyBoardHeight", dip2px(DEF_KEYBOARD_HEIGHT));
        }
    }

    public static boolean isLargeScreen(Context context) {
        IToLargeScreenProvider iToLargeScreenProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{context})).booleanValue();
        }
        if (isLargeScreen == -1 && (iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class)) != null) {
            if (iToLargeScreenProvider.isLargeScreen(context)) {
                isLargeScreen = 1;
            } else {
                isLargeScreen = 0;
            }
        }
        return isLargeScreen == 1;
    }

    public static final String isOpenHeaderStr(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e908ef7", new Object[]{activity});
        }
        IToLargeScreenProvider iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class);
        return iToLargeScreenProvider != null ? iToLargeScreenProvider.isOpenHeaderStr(activity) : "0";
    }

    public static final int ap2DesignScalePx(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b84a0f23", new Object[]{context, new Float(f)})).intValue();
        }
        IToLargeScreenProvider iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class);
        if (iToLargeScreenProvider != null) {
            return iToLargeScreenProvider.ap2DesignScalePx(context, f);
        }
        return gbg.b(context, f);
    }

    public static final int getDesignWindowWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90a76df2", new Object[]{context})).intValue();
        }
        IToLargeScreenProvider iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class);
        if (iToLargeScreenProvider == null) {
            return 0;
        }
        return iToLargeScreenProvider.getDesignWindowWidth(context);
    }

    public static final int getMaxWindowWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14fe5d6c", new Object[]{context})).intValue();
        }
        IToLargeScreenProvider iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class);
        if (iToLargeScreenProvider != null) {
            return iToLargeScreenProvider.getMaxWindowWidth(context);
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final int px2DesignScaleAp(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9376f63", new Object[]{context, new Float(f)})).intValue();
        }
        IToLargeScreenProvider iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class);
        if (iToLargeScreenProvider != null) {
            return iToLargeScreenProvider.px2DesignScaleAp(context, f);
        }
        return gbg.c(context, f);
    }

    public static Activity getActivityFromContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("16e9b907", new Object[]{context});
        }
        IToLargeScreenProvider iToLargeScreenProvider = (IToLargeScreenProvider) GlobalContainer.getInstance().get(IToLargeScreenProvider.class);
        if (iToLargeScreenProvider == null) {
            return null;
        }
        return iToLargeScreenProvider.getActivityFromContext(context);
    }

    public static String formatDate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d58945a8", new Object[]{new Long(j)});
        }
        IMPLocalizedProvider iMPLocalizedProvider = (IMPLocalizedProvider) GlobalContainer.getInstance().get(IMPLocalizedProvider.class);
        if (iMPLocalizedProvider != null) {
            return iMPLocalizedProvider.formatDate(j);
        }
        return d.a(j, 7);
    }

    public static String formatDateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b5aa255", new Object[]{new Long(j)});
        }
        IMPLocalizedProvider iMPLocalizedProvider = (IMPLocalizedProvider) GlobalContainer.getInstance().get(IMPLocalizedProvider.class);
        if (iMPLocalizedProvider != null) {
            return iMPLocalizedProvider.formatDateTime(j);
        }
        return d.a(j, 31);
    }

    public static boolean isSimplifiedChinese() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef4a576", new Object[0])).booleanValue();
        }
        IMPLocalizedProvider iMPLocalizedProvider = (IMPLocalizedProvider) GlobalContainer.getInstance().get(IMPLocalizedProvider.class);
        if (iMPLocalizedProvider != null) {
            return iMPLocalizedProvider.isSimplifiedChinese();
        }
        return b.b();
    }

    public static String localizedString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c25c8543", new Object[]{str});
        }
        IMPLocalizedProvider iMPLocalizedProvider = (IMPLocalizedProvider) GlobalContainer.getInstance().get(IMPLocalizedProvider.class);
        if (iMPLocalizedProvider != null) {
            return iMPLocalizedProvider.localizedString(str);
        }
        return b.a(str);
    }

    public static String localizedString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f754730", new Object[]{new Integer(i)});
        }
        IMPLocalizedProvider iMPLocalizedProvider = (IMPLocalizedProvider) GlobalContainer.getInstance().get(IMPLocalizedProvider.class);
        if (iMPLocalizedProvider != null) {
            return iMPLocalizedProvider.localizedString(i);
        }
        return b.a(i);
    }
}
