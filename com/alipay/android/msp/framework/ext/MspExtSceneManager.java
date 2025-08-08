package com.alipay.android.msp.framework.ext;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.utils.DeviceScreenUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspExtSceneManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile MspExtSceneManager g;
    private double c;
    private Resources e;
    private DisplayMetrics f;
    private AccessibilityManager h;
    private JSONObject i;
    private boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4713a = false;
    private String d = null;
    private Boolean k = null;
    private Boolean j = null;

    public static MspExtSceneManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("60555e94", new Object[]{context});
        }
        if (g == null) {
            synchronized (MspExtSceneManager.class) {
                g = new MspExtSceneManager(context);
            }
        }
        return g;
    }

    public MspExtSceneManager(Context context) {
        this.c = 8.0d;
        this.e = null;
        this.f = null;
        this.h = null;
        this.i = null;
        if (context == null) {
            return;
        }
        JSONObject jsonConfig = FastStartActivityHelper.getJsonConfig(context, DrmKey.EXT_SCENE_CONFIGS);
        if (jsonConfig != null) {
            try {
                this.c = jsonConfig.getDouble("pad_screen_size_threshold").doubleValue();
            } catch (Exception unused) {
            }
        }
        this.i = FastStartActivityHelper.getJsonConfig(context, DrmKey.PAD_ADAPT_TEMPLATE_METADATA);
        this.e = context.getResources();
        Resources resources = this.e;
        if (resources != null) {
            this.f = resources.getDisplayMetrics();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.h = (AccessibilityManager) context.getSystemService("accessibility");
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 100) {
            return;
        }
        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "getSystemService", String.valueOf(elapsedRealtime2));
    }

    public String updateScreenSizeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2291f75", new Object[]{this});
        }
        Resources resources = this.e;
        if (resources == null) {
            return null;
        }
        this.f = resources.getDisplayMetrics();
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics != null) {
            return a(displayMetrics.widthPixels, this.f.heightPixels);
        }
        return null;
    }

    public void updateScreenSizeInfo(Configuration configuration, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898c01e3", new Object[]{this, configuration, context});
        } else if (this.e == null || configuration == null) {
        } else {
            this.f = this.e.getDisplayMetrics();
            a((int) (configuration.screenWidthDp * UIUtil.getDp(context)), (int) (configuration.screenHeightDp * UIUtil.getDp(context)));
        }
    }

    private String a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdaf8ad8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return null;
        }
        float f = i / displayMetrics.xdpi;
        float f2 = i2 / this.f.ydpi;
        double sqrt = Math.sqrt((f * f) + (f2 * f2));
        String str = "-dipWidth:" + f + "-dipHeight:" + f2 + "-screenSize:" + sqrt;
        if (sqrt - this.c >= 1.0E-6d) {
            this.d = str;
            this.b = true;
            this.f4713a = true;
        } else {
            this.f4713a = false;
        }
        return str;
    }

    public boolean checkIsBigScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29bec0e5", new Object[]{this})).booleanValue();
        }
        updateScreenSizeInfo();
        return this.b;
    }

    public String isBigScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a38528b7", new Object[]{this});
        }
        String updateScreenSizeInfo = updateScreenSizeInfo();
        if (!this.b) {
            return updateScreenSizeInfo == null ? "unknown" : "false".concat(String.valueOf(updateScreenSizeInfo));
        }
        return "true" + this.d;
    }

    public static boolean onPadAdaptMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0e52eb4", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_PAD_ADAPT_MODE);
        }
        return false;
    }

    public boolean onPadAdaptMode(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca4359e", new Object[]{this, context, str, new Boolean(z)})).booleanValue() : context != null && z && !isExcludedPadAdaptTpl(str) && checkCurrentIsBigScreen() && UIUtil.isQuickPayTpl(str) && !UIUtil.isPadHuaweiMultiWindow(context);
    }

    public static boolean onPadAdaptMode(Context context, MspExtSceneManager mspExtSceneManager, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a1ed950", new Object[]{context, mspExtSceneManager, str, new Boolean(z)})).booleanValue() : context != null && z && !isExcludedPadAdaptTpl(str, context) && mspExtSceneManager.checkCurrentIsBigScreen() && UIUtil.isQuickPayTpl(str) && !UIUtil.isPadHuaweiMultiWindow(context);
    }

    public boolean checkCurrentIsBigScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa3e737c", new Object[]{this})).booleanValue();
        }
        updateScreenSizeInfo();
        return this.f4713a;
    }

    public boolean onProxyPadAdaptMode(Configuration configuration, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd72d0f8", new Object[]{this, configuration, context, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        updateScreenSizeInfo(configuration, context);
        return this.f4713a && z;
    }

    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue();
        }
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public int getDisplayWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4d7baba", new Object[]{this, context})).intValue();
        }
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return 0;
        }
        int i = (int) (displayMetrics.heightPixels * 0.35427135f);
        if (this.f.heightPixels < this.f.widthPixels) {
            i = (int) (this.f.widthPixels * 0.35427135f);
        }
        if (i < 750) {
            i = 750;
        }
        return (!this.f4713a || UIUtil.isPadHuaweiMultiWindow(context)) ? this.f.widthPixels : i;
    }

    public int getDisplayWidth(int i, int i2, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e74602", new Object[]{this, new Integer(i), new Integer(i2), configuration})).intValue();
        }
        int i3 = (int) (i2 * 0.35427135f);
        if (i > i2) {
            i3 = (int) (i * 0.35427135f);
        }
        int i4 = 750;
        if (i3 >= 750) {
            i4 = i3;
        }
        return (!this.f4713a || UIUtil.isProxyHuaweiMultiWindow(configuration)) ? i : i4;
    }

    public String isAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad73c4bc", new Object[]{this});
        }
        AccessibilityManager accessibilityManager = this.h;
        return accessibilityManager == null ? "unknown" : (!accessibilityManager.isEnabled() || !this.h.isTouchExplorationEnabled()) ? "false" : "true";
    }

    public boolean checkAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6dca246", new Object[]{this})).booleanValue();
        }
        AccessibilityManager accessibilityManager = this.h;
        return accessibilityManager != null && accessibilityManager.isEnabled() && this.h.isTouchExplorationEnabled();
    }

    public boolean isFullScreenTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("815b56e0", new Object[]{this, str})).booleanValue() : a(str, "full_screen");
    }

    public boolean isNonPadAdaptableTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55d01859", new Object[]{this, str})).booleanValue() : a(str, "non_pad_adaptable");
    }

    public boolean isAutoRotatingTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b72b494", new Object[]{this, str})).booleanValue() : a(str, "auto_rotating");
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            JSONObject jSONObject = this.i;
            if (jSONObject == null || !jSONObject.containsKey(str) || !jSONObject.getJSONObject(str).containsKey(str2)) {
                jSONObject = JSONObject.parseObject(GlobalConstant.PAD_ADAPT_TPL_METADATA);
            }
            if (jSONObject != null && jSONObject.containsKey(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (!jSONObject2.containsKey(str2)) {
                    return false;
                }
                return StringUtils.equals("Y", jSONObject2.getString(str2));
            }
            return false;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    public boolean isExcludedPadAdaptTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2fe1c2", new Object[]{this, str})).booleanValue() : isNonPadAdaptableTpl(str) || isFullScreenTpl(str);
    }

    public static boolean isFullScreenTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46636470", new Object[]{str, context})).booleanValue() : getConfigValue(str, "full_screen", context);
    }

    public static boolean isNonPadAdaptableTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53d20d17", new Object[]{str, context})).booleanValue() : getConfigValue(str, "non_pad_adaptable", context);
    }

    public static boolean isAutoRotatingTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a42d193c", new Object[]{str, context})).booleanValue() : getConfigValue(str, "auto_rotating", context);
    }

    public static boolean getConfigValue(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32df3b18", new Object[]{str, str2, context})).booleanValue();
        }
        try {
            JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.PAD_ADAPT_TEMPLATE_METADATA);
            if (drmValueFromKey == null || !drmValueFromKey.containsKey(str) || !drmValueFromKey.getJSONObject(str).containsKey(str2)) {
                drmValueFromKey = JSONObject.parseObject(GlobalConstant.PAD_ADAPT_TPL_METADATA);
            }
            if (drmValueFromKey != null && drmValueFromKey.containsKey(str)) {
                JSONObject jSONObject = drmValueFromKey.getJSONObject(str);
                if (!jSONObject.containsKey(str2)) {
                    return false;
                }
                return StringUtils.equals("Y", jSONObject.getString(str2));
            }
            return false;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    public static boolean isExcludedPadAdaptTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7b97bce", new Object[]{str, context})).booleanValue() : isNonPadAdaptableTpl(str, context) || isFullScreenTpl(str, context);
    }

    public void resetInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08aa4a4", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    public boolean isFoldableDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e76299e6", new Object[]{this})).booleanValue();
        }
        if (this.k == null) {
            this.k = Boolean.valueOf(DeviceScreenUtil.isFoldDevice());
        }
        return this.k.booleanValue();
    }

    public boolean isPad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad47fb14", new Object[]{this})).booleanValue();
        }
        if (this.j == null) {
            this.j = Boolean.valueOf(DeviceScreenUtil.isPadDevice());
        }
        return this.j.booleanValue();
    }
}
