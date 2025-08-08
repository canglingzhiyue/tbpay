package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.support.basics.KVStorage;
import com.flybird.support.basics.d;
import com.flybird.support.basics.e;
import com.taobao.android.weex_framework.util.a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cun;
import tb.drm;
import tb.mto;

/* loaded from: classes4.dex */
public class FBDocumentAssistor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static float f7139a = -1.0f;
    public static float b = -1.0f;
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;
    public static float f = -1.0f;
    public static Map<String, String> g = new ConcurrentHashMap();
    public static float h = -1.0f;
    public static BirdNestEngine.SettingProvider i = null;

    public static void a(Context context) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        AppContextHolder.feedAppContext(context);
        GlobalCacheForApi.a();
        float dp = FBTools.getDp(context);
        f7139a = dp;
        float f2 = h;
        if (f2 != -1.0f && Math.abs(dp - f2) > 0.1d) {
            FBLogger.d("FBDocumentAssistor", "screen resolution changed");
            clearDimCache();
        }
        if (b < 0.0f) {
            b = context.getResources().getDisplayMetrics().ydpi;
        }
        h = f7139a;
        DisplayMetrics displayMetrics2 = FBTools.getDisplayMetrics(context);
        c = displayMetrics2.widthPixels;
        d = FBTools.calcScreenHeight(context, displayMetrics2.heightPixels);
        try {
            if (BirdNestEngine.useValueCache) {
                displayMetrics = (DisplayMetrics) drm.b("Conf:DefDisplayMetrics");
            } else {
                displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            }
            e = FBTools.calcScreenHeight(context, displayMetrics.heightPixels);
        } catch (Throwable th) {
            FBLogger.e("FBDocumentAssistor", th);
        }
    }

    @Deprecated
    public static void b(FBDocument fBDocument, e eVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23e3a1a", new Object[]{fBDocument, eVar, new Integer(i2), str});
        } else if (!fBDocument.r) {
        } else {
            a(fBDocument, eVar, i2, str);
        }
    }

    public static BirdNestEngine.ThemeColorProvider c(FBDocument fBDocument) {
        BirdNestEngine engine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.ThemeColorProvider) ipChange.ipc$dispatch("83952442", new Object[]{fBDocument});
        }
        if (fBDocument != null && (engine = fBDocument.getEngine()) != null) {
            return engine.getConfig().getThemeColorProvider();
        }
        return null;
    }

    public static float[] calcTextSize(FBDocument fBDocument, String str, String str2, String str3, float f2, String str4, String str5, int i2, boolean z, float f3, float f4, float f5, float f6, boolean z2) {
        float[] fArr;
        boolean z3;
        Typeface typeface;
        Typeface typeface2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("e88343a3", new Object[]{fBDocument, str, str2, str3, new Float(f2), str4, str5, new Integer(i2), new Boolean(z), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Boolean(z2)});
        }
        float[] fArr2 = {0.0f, 0.0f};
        if (str2 == null || str2.length() == 0) {
            return fArr2;
        }
        FBLabel fBLabel = fBDocument.G.get(str);
        if (fBLabel == null) {
            fArr = fArr2;
            fBLabel = new FBLabel(fBDocument.k, null, fBDocument);
            fBDocument.G.put(str, fBLabel);
            z3 = false;
        } else {
            fArr = fArr2;
            z3 = true;
        }
        fBLabel.c(z2);
        final TextView textView = (TextView) fBLabel.getInnerView();
        textView.setTextSize(Platform.f, f2);
        if (!StringUtils.isEmpty(str3) && (typeface2 = FontCache.getTypeface(fBDocument.k, str3)) != null) {
            textView.setTypeface(typeface2);
        }
        if (i2 > 0) {
            textView.setMaxLines(i2);
        }
        if (z) {
            textView.setEllipsize(StringUtils.TruncateAt.END);
        }
        if (str4.equals("bold")) {
            textView.getPaint().setFakeBoldText(true);
        }
        if (str5.equals("line-through")) {
            textView.getPaint().setFlags(textView.getPaint().getFlags() | 16);
        } else if (str5.equals("underline")) {
            textView.getPaint().setFlags(textView.getPaint().getFlags() | 8);
        }
        String str6 = Platform.f5257a;
        fBLabel.H = str2;
        fBLabel.d();
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i3 > 0) {
            textView.setLineSpacing(f3, 1.0f);
        }
        if (f4 > 0.0f) {
            a(fBDocument, textView, f4);
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            textView.post(new Runnable() { // from class: com.flybird.FBDocumentAssistor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        textView.requestLayout();
                    }
                }
            });
        } else {
            textView.requestLayout();
        }
        if (z3) {
            TextView textView2 = new TextView(fBDocument.getContext());
            textView2.setTextSize(Platform.f, f2);
            if (!StringUtils.isEmpty(str3) && (typeface = FontCache.getTypeface(fBDocument.k, str3)) != null) {
                textView2.setTypeface(typeface);
            }
            if (i2 > 0) {
                textView2.setMaxLines(i2);
            }
            if (z) {
                textView2.setEllipsize(StringUtils.TruncateAt.END);
            }
            if (str4.equals("bold")) {
                textView2.getPaint().setFakeBoldText(true);
            }
            if (str5.equals("line-through")) {
                textView2.getPaint().setFlags(textView.getPaint().getFlags() | 16);
            } else if (str5.equals("underline")) {
                textView2.getPaint().setFlags(textView.getPaint().getFlags() | 8);
            }
            if (i3 > 0) {
                textView2.setLineSpacing(f3, 1.0f);
            }
            textView2.setText(textView.getText());
            textView2.measure(View.MeasureSpec.makeMeasureSpec((int) Math.min(f6, f5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            fArr[0] = textView2.getMeasuredWidth();
            fArr[1] = textView2.getMeasuredHeight();
            return fArr;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec((int) Math.min(f6, f5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        fArr[0] = textView.getMeasuredWidth();
        fArr[1] = textView.getMeasuredHeight();
        return fArr;
    }

    public static native int clearDimCache();

    public static void coreMessageLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae2704d", new Object[]{str});
        } else {
            LoggerFactory.getTraceLogger().debug("Birdnest", str);
        }
    }

    public static CountDownTimer createTimer(final FBDocument fBDocument, final int i2, final boolean z, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownTimer) ipChange.ipc$dispatch("e5760484", new Object[]{fBDocument, new Integer(i2), new Boolean(z), new Long(j)});
        }
        long j2 = i2;
        long j3 = z ? Long.MAX_VALUE : j2;
        FBLogger.d("FBDocumentAssistor", "create timer: interval:" + i2 + ", repeats: " + z + "--------templateId: " + fBDocument.getTid());
        CountDownTimer countDownTimer = new CountDownTimer(j3, j2) { // from class: com.flybird.FBDocumentAssistor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                FBDocument fBDocument2 = fBDocument;
                if (fBDocument2.k == null) {
                    cancel();
                } else if (fBDocument2.mCore != 0) {
                    FBDocumentAssistor.nativeOnTimer(fBDocument.mCore, j);
                } else {
                    cancel();
                }
            }

            @Override // com.flybird.CountDownTimer
            public void onTick(long j4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j4)});
                    return;
                }
                FBDocument fBDocument2 = fBDocument;
                if (fBDocument2.k == null) {
                    cancel();
                } else if (z && fBDocument2.mCore != 0) {
                    FBDocumentAssistor.nativeOnTimer(fBDocument.mCore, j);
                    FBLogger.d("FBDocumentAssistor", "onTick: interval:" + i2 + ", repeats: " + z + "--------templateId: " + fBDocument.getTid());
                } else if (fBDocument.mCore != 0) {
                } else {
                    cancel();
                }
            }
        };
        if (fBDocument.isOnloadFinish()) {
            countDownTimer.start();
        }
        fBDocument.H.add(countDownTimer);
        return countDownTimer;
    }

    public static int destroyTimer(final FBDocument fBDocument, final CountDownTimer countDownTimer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91924176", new Object[]{fBDocument, countDownTimer})).intValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            fBDocument.b0.post(new Runnable() { // from class: com.flybird.FBDocumentAssistor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FBDocumentAssistor.a(FBDocument.this, countDownTimer);
                    } catch (Throwable th) {
                        LogCatLog.e("FBDocumentAssistor", th);
                    }
                }
            });
        } else {
            a(fBDocument, countDownTimer);
        }
        return 0;
    }

    public static String getAppLocale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f41abef4", new Object[0]);
        }
        String str = Platform.f5257a;
        FBLogger.d("FBDocumentAssistor", "current locale: " + ((String) null));
        return null;
    }

    public static Map<String, String> getCachedAssetsMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c7e415dd", new Object[0]) : g;
    }

    public static int getCurrentNetworkEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc2d7222", new Object[0])).intValue();
        }
        Integer num = (Integer) drm.b("App:RpcEnv");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static float getDefaultFontSize(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cb90239", new Object[]{fBDocument})).floatValue();
        }
        if (f == -1.0f && fBDocument != null && fBDocument.k != null) {
            try {
                f = new TextView(fBDocument.k).getTextSize() / f7139a;
            } catch (Throwable unused) {
                f = 14.0f;
            }
        }
        return f;
    }

    public static float getDp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15fb8df9", new Object[0])).floatValue() : f7139a;
    }

    public static String getFbVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ab118f3", new Object[0]) : BirdNestEngine.getVersion();
    }

    public static BirdNestEngine.SettingProvider getGlobalSettingProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestEngine.SettingProvider) ipChange.ipc$dispatch("45dc772a", new Object[0]) : i;
    }

    public static boolean getGlobalSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d49a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String globalSwitchRaw = getGlobalSwitchRaw(str);
        return StringUtils.isEmpty(globalSwitchRaw) ? z : "true".equalsIgnoreCase(globalSwitchRaw);
    }

    public static String getGlobalSwitchRaw(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e17c014", new Object[]{str});
        }
        String str2 = Platform.f5257a;
        String rawSwitch = getGlobalSettingProvider() != null ? getGlobalSettingProvider().getRawSwitch(str, "") : null;
        if (!StringUtils.isEmpty(rawSwitch)) {
            return rawSwitch;
        }
        return null;
    }

    public static float[] getImageSize(FBDocument fBDocument, String str, String str2) {
        BirdNestEngine.ResourceProvider resourceProvider;
        Object resource;
        BirdNestEngine.Params params;
        FBResourceClient fBResourceClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("27d365d9", new Object[]{fBDocument, str, str2});
        }
        e a2 = a(fBDocument);
        float[] fArr = {0.0f, 0.0f};
        try {
            if (!StringUtils.isEmpty(str2) && !"undefined".equals(str2)) {
                if (!str2.startsWith("http") && !str2.startsWith("https") && !str2.startsWith("www")) {
                    Context context = fBDocument.k;
                    Drawable drawable = null;
                    Drawable drawable2 = StringUtils.equals("indicatior", str2) ? context.getResources().getDrawable(ResUtils.getDrawableId(context, "alipay_msp_indicatior_loading")) : null;
                    if (drawable2 == null && (params = fBDocument.param) != null && (fBResourceClient = params.resourceClient) != null && !StringUtils.isEmpty(str2)) {
                        FBLogger.d("FBDocumentAssistor", "offline pkg intercept res(getimagesize) " + str2);
                        Object shouldInterceptResource = fBResourceClient.shouldInterceptResource(str2, FBResourceClient.Type.DRAWABLE);
                        if (shouldInterceptResource != null) {
                            drawable = (Drawable) shouldInterceptResource;
                        }
                        drawable2 = drawable;
                        if (drawable2 != null) {
                            fArr[0] = drawable2.getIntrinsicWidth();
                            fArr[1] = drawable2.getIntrinsicHeight();
                            a(fBDocument, a2, 21, "Ast:imgSize_param");
                            return fArr;
                        }
                    }
                    if (drawable2 == null && (resourceProvider = fBDocument.getEngine().getConfig().getResourceProvider()) != null && (resource = resourceProvider.getResource(fBDocument.k, str2, fBDocument.param.bundleName, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS)) != null && (resource instanceof Drawable)) {
                        drawable2 = (Drawable) resource;
                    }
                    if (drawable2 == null) {
                        FBLogger.e("FBDocumentAssistor", "FATAL ERROR!, The image(src: " + str2 + ") is not existed!");
                    } else {
                        fArr[0] = drawable2.getIntrinsicWidth();
                        fArr[1] = drawable2.getIntrinsicHeight();
                    }
                } else {
                    FBImg fBImg = (FBImg) fBDocument.findViewById(str);
                    if (fBImg != null) {
                        fArr[0] = fBImg.mWidth;
                        fArr[1] = fBImg.mHeight;
                    }
                }
                a(fBDocument, a2, 21, "Ast:imgSize_noParam");
            }
            return fArr;
        } catch (Throwable unused) {
            a(fBDocument, a2, 21, "Ast:imgSize_err");
            return fArr;
        }
    }

    public static String getLocale(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("755cca62", new Object[]{fBDocument});
        }
        if (fBDocument == null || fBDocument.getEngine() == null) {
            return "zh_CN";
        }
        BirdNestEngine engine = fBDocument.getEngine();
        return (engine.getConfig() == null || engine.getConfig().getSettingProvider() == null) ? "zh_CN" : engine.getConfig().getSettingProvider().getLocale();
    }

    public static String getQueryExternalLocale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731dc098", new Object[]{str});
        }
        FBLogger.d("FBDocumentAssistor", "getQueryExternalLocale#configKey: " + str);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            String str2 = Platform.f5257a;
            FBLogger.d("FBDocumentAssistor", "map is null");
            return null;
        } catch (Throwable th) {
            FBLogger.e("FBDocumentAssistor", th);
            return null;
        }
    }

    public static float getScreenHeight(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("917ef447", new Object[]{fBDocument})).floatValue();
        }
        if (fBDocument == null) {
            return d;
        }
        int[] iArr = fBDocument.screenSize;
        if (iArr[1] <= 0) {
            iArr[1] = d;
        }
        return iArr[1];
    }

    public static float getScreenWidth(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88f98622", new Object[]{fBDocument})).floatValue();
        }
        if (fBDocument == null) {
            return c;
        }
        int[] iArr = fBDocument.screenSize;
        if (iArr[0] <= 0) {
            iArr[0] = c;
        }
        return iArr[0];
    }

    public static String getUid() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[0]);
        }
        try {
            Pair a2 = drm.a("User:UserInfoId");
            if (!((Boolean) a2.first).booleanValue() || (obj = a2.second) == null) {
                obj = "";
            }
            return (String) obj;
        } catch (Throwable th) {
            cun.b("FBDocumentAssistor", "uid failed", th);
            return "";
        }
    }

    public static String getUtdid() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        try {
            Pair a2 = drm.a("User:UtdidOrEquiv");
            if (!((Boolean) a2.first).booleanValue() || (obj = a2.second) == null) {
                obj = "";
            }
            return (String) obj;
        } catch (Throwable th) {
            cun.b("FBDocumentAssistor", "utdid failed", th);
            return "";
        }
    }

    public static float getVisibleScreenHeight(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c37332d", new Object[]{fBDocument})).floatValue() : e;
    }

    public static float getYdpi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4338631", new Object[0])).floatValue() : b;
    }

    public static boolean isAlipayAnd2G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2aeef43", new Object[0])).booleanValue();
        }
        String str = Platform.f5257a;
        return false;
    }

    public static native int nativeOnTimer(long j, long j2);

    public static void platformConsoleLog(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd33a38", new Object[]{fBDocument, str});
        } else {
            fBDocument.getTid();
        }
    }

    public static void postAccessibilityEvent(final FBDocument fBDocument, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de68dedf", new Object[]{fBDocument, str, new Integer(i2)});
            return;
        }
        cun.c("FBDocumentAssistor", "sendAccessibilityEvent, content: " + str + ", intType: " + i2);
        if (fBDocument == null) {
            return;
        }
        try {
            if (StringUtils.isEmpty(str) || i2 != 0) {
                return;
            }
            final AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().clear();
            obtain.getText().add(str);
            final AccessibilityManager accessibilityManager = (AccessibilityManager) AppContextHolder.f7228a.getSystemService("accessibility");
            fBDocument.b0.post(new Runnable() { // from class: com.flybird.-$$Lambda$3GHc_C8K2xf_EeKJAt3v7nLytog
                @Override // java.lang.Runnable
                public final void run() {
                    FBDocumentAssistor.a(FBDocument.this, accessibilityManager, obtain);
                }
            });
        } catch (Throwable th) {
            cun.a("FBDocumentAssistor", "sendAccessibilityEvent1, error: " + th.getMessage());
        }
    }

    public static void putAssetRes(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b11eda", new Object[]{str, str2});
        } else {
            g.put(str, str2);
        }
    }

    public static String readAssertFile(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a94d7d90", new Object[]{fBDocument, str});
        }
        e a2 = a(fBDocument);
        String str2 = "";
        if (g.containsKey(str)) {
            return g.get(str);
        }
        if (StringUtils.isEmpty(str)) {
            a(fBDocument, a2, 21, "Ast:readAsset_none");
            return str2;
        }
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1, str.length());
            if (g.containsKey(substring)) {
                a(fBDocument, a2, 21, "Ast:readAsset_cache");
                return g.get(substring);
            }
        } else {
            Resources resources = fBDocument.j;
            if (resources != null) {
                String readAssetsFileWithManager = FBTools.readAssetsFileWithManager(str, resources.getAssets());
                if (!StringUtils.isEmpty(readAssetsFileWithManager)) {
                    a(fBDocument, a2, 21, "Ast:readAsset_asset");
                    return readAssetsFileWithManager;
                }
            }
        }
        FBResourceClient fBResourceClient = fBDocument.param.resourceClient;
        if (fBResourceClient != null && !StringUtils.isEmpty(str)) {
            Object shouldInterceptResource = fBResourceClient.shouldInterceptResource(str, FBResourceClient.Type.STRING);
            if (shouldInterceptResource != null) {
                str2 = String.valueOf(shouldInterceptResource);
            }
            if (!StringUtils.isEmpty(str2)) {
                a(fBDocument, a2, 21, "Ast:readAsset_client");
                return str2;
            }
        }
        String str3 = null;
        Object resource = fBDocument.getEngine().getConfig().getResourceProvider().getResource(fBDocument.k, str, fBDocument.param.bundleName, null);
        if (resource != null) {
            str3 = String.valueOf(resource);
        }
        String readAssetsFile = StringUtils.isEmpty(str3) ? FBTools.readAssetsFile(str, fBDocument.k) : str3;
        if (!StringUtils.isEmpty(readAssetsFile)) {
            g.put(str, readAssetsFile);
        }
        a(fBDocument, a2, 21, "Ast:readAsset_provider");
        return readAssetsFile;
    }

    public static void recordEvent(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8becbb", new Object[]{str, str2, strArr});
            return;
        }
        String str3 = Platform.f5257a;
        try {
            AntEvent.Builder builder = new AntEvent.Builder();
            builder.setEventID(str);
            builder.setBizType("birdnest");
            builder.setLoggerLevel(1);
            while (i2 < strArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("fb_arg");
                int i3 = i2 + 1;
                sb.append(i3);
                builder.addExtParam(sb.toString(), strArr[i2]);
                i2 = i3;
            }
            builder.addExtParam("tpl_id", str2);
            builder.addExtParam("fb_version", Platform.f5257a);
            AntEvent build = builder.build();
            if (BirdNestEngine.useLogBatch) {
                BirdNestEngine.eventBatchRunner.a(build);
            } else {
                build.send();
            }
        } catch (Exception unused) {
        }
    }

    public static void setAbnormal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a53ae5", new Object[]{str, str2});
        } else {
            String str3 = Platform.f5257a;
        }
    }

    public static void setGlobalSettingProvider(BirdNestEngine.SettingProvider settingProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124886c6", new Object[]{settingProvider});
        } else {
            i = settingProvider;
        }
    }

    public static boolean tokenGetEnv(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fcf0c0c", new Object[]{fBDocument, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        Context context = fBDocument.getContext();
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3228) {
            if (hashCode != 3445) {
                if (hashCode != 3075958) {
                    if (hashCode != 99465916) {
                        if (hashCode == 115864556 && str.equals("zhang")) {
                            c2 = 4;
                        }
                    } else if (str.equals("horiz")) {
                        c2 = 3;
                    }
                } else if (str.equals("dark")) {
                    c2 = 2;
                }
            } else if (str.equals("la")) {
                c2 = 1;
            }
        } else if (str.equals("ea")) {
            c2 = 0;
        }
        if (c2 == 0) {
            String str2 = Platform.f5257a;
            return true;
        } else if (c2 == 1) {
            String str3 = Platform.f5257a;
            return false;
        } else if (c2 == 2) {
            return (fBDocument.E & 1) != 0;
        } else if (c2 == 3) {
            return context.getResources().getConfiguration().orientation == 2;
        } else if (c2 == 4) {
            return Platform.g();
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r11.equals("scr-hp") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double tokenGetPxOfUnit(com.flybird.FBDocument r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBDocumentAssistor.tokenGetPxOfUnit(com.flybird.FBDocument, java.lang.String):double");
    }

    public static double tokenGetValueOfScale(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("299c9ee5", new Object[]{fBDocument, str})).doubleValue();
        }
        if (str == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        int i2 = 4;
        if (str.equals("font-scale")) {
            if (!Platform.g()) {
                return 1.0d;
            }
            double[] dArr = Platform.c;
            if (4 >= dArr.length) {
                i2 = dArr.length - 1;
            }
            return dArr[i2];
        } else if (!str.equals("content-scale")) {
            return mto.a.GEO_NOT_SUPPORT;
        } else {
            if (!Platform.g()) {
                return 1.0d;
            }
            double[] dArr2 = Platform.c;
            if (4 >= dArr2.length) {
                i2 = dArr2.length - 1;
            }
            return dArr2[i2];
        }
    }

    public static int b(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("463e8603", new Object[]{fBDocument})).intValue();
        }
        if (fBDocument != null) {
            return fBDocument.E;
        }
        return 0;
    }

    public static void c(FBDocument fBDocument, e eVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f8bb9", new Object[]{fBDocument, eVar, new Integer(i2), str});
        } else if (fBDocument == null || eVar == null) {
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            eVar.c();
            Platform.a(1, i2, timeUnit.convert(SystemClock.elapsedRealtimeNanos() - eVar.f7234a, TimeUnit.NANOSECONDS), fBDocument.getTid(), str, null);
        }
    }

    public static int a(FBDocument fBDocument, CountDownTimer countDownTimer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54a846c", new Object[]{fBDocument, countDownTimer})).intValue();
        }
        if (countDownTimer != null) {
            countDownTimer.cancel();
            FBLogger.d("FBDocumentAssistor", "cancel timer: " + countDownTimer + "--------templateId: " + fBDocument.getTid());
            fBDocument.H.remove(countDownTimer);
        }
        return 0;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("data") ? jSONObject.getString("data") : str;
        } catch (JSONException e2) {
            FBLogger.e("FBDocumentAssistor", e2);
            return str;
        }
    }

    public static void a(FBDocument fBDocument, TextView textView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94e86cb", new Object[]{fBDocument, textView, new Float(f2)});
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int dp = (int) (FBTools.getDp(fBDocument.k) * f2);
        if (dp <= i2) {
            return;
        }
        int i3 = dp - i2;
        textView.setLineSpacing(i3, 1.0f);
        textView.setPadding(0, i3, 0, 0);
    }

    public static e a(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("89e4ec6a", new Object[]{fBDocument});
        }
        if (fBDocument != null && fBDocument.r) {
            return new e();
        }
        return null;
    }

    public static void a(FBDocument fBDocument, e eVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93ce87b", new Object[]{fBDocument, eVar, new Integer(i2), str});
        } else if (fBDocument == null || eVar == null) {
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            eVar.c();
            Platform.a(1, i2, timeUnit.convert(eVar.b(), TimeUnit.NANOSECONDS), fBDocument.getTid(), str, null);
        }
    }

    public static String a(d dVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41b112a2", new Object[]{dVar, str, new Boolean(z)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = dVar.f7233a.get(str);
        return (str2 != null || !z) ? str2 : KVStorage.getKeyValue("fb__kv_js_storage", str);
    }

    public static void a(d dVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233c3eb4", new Object[]{dVar, str, str2, new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (StringUtils.isEmpty(str2)) {
                if (str.endsWith("*")) {
                    String substring = str.substring(0, str.length() - 1);
                    synchronized (dVar.f7233a) {
                        Iterator<Map.Entry<String, String>> it = dVar.f7233a.entrySet().iterator();
                        while (it.hasNext()) {
                            if (it.next().getKey().startsWith(substring)) {
                                it.remove();
                            }
                        }
                    }
                    if (!z) {
                        return;
                    }
                    KVStorage.deleteKeysWithPrefix("fb__kv_js_storage", substring);
                    return;
                }
                dVar.f7233a.remove(str);
                if (!z) {
                    return;
                }
                KVStorage.setKeyValue("fb__kv_js_storage", str, null);
                return;
            }
            synchronized (dVar.f7233a) {
                dVar.f7233a.put(str, str2);
            }
            if (!z) {
                return;
            }
            KVStorage.setKeyValue("fb__kv_js_storage", str, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        cun.a("FBDocumentAssistor", "sendJsExceptionBroadcast, tplId: " + str + ", js exception:" + str2 + "script:" + str3);
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(AppContextHolder.f7228a);
            Intent intent = new Intent();
            intent.setAction("com.flybird.js.exception");
            intent.putExtra("exception", str2);
            intent.putExtra("script", str3);
            intent.putExtra("tplId", str);
            localBroadcastManager.sendBroadcast(intent);
        } catch (Throwable unused) {
        }
    }

    public static void a(FBDocument fBDocument, AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e347da2", new Object[]{fBDocument, accessibilityManager, accessibilityEvent});
            return;
        }
        View view = null;
        try {
            FBView mo650getBodyView = fBDocument.mo650getBodyView();
            if (mo650getBodyView != null) {
                view = mo650getBodyView.getInnerView();
            }
            if (view == null) {
                Context context = fBDocument.getContext();
                if (context instanceof Activity) {
                    view = ((Activity) context).getWindow().getDecorView().getRootView();
                }
            }
            cun.c("FBDocumentAssistor", "sendAccessibilityEvent from " + view);
            if (view == null || accessibilityManager == null || !accessibilityManager.isEnabled()) {
                return;
            }
            accessibilityEvent.setSource(view);
            accessibilityEvent.setClassName(view.getClass().getName());
            accessibilityEvent.setPackageName(AppContextHolder.f7228a.getPackageName());
            cun.c("FBDocumentAssistor", "sendAccessibilityEvent: " + accessibilityEvent);
            accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
        } catch (Throwable th) {
            cun.a("FBDocumentAssistor", "sendAccessibilityEvent2, error: " + th.getMessage());
        }
    }
}
