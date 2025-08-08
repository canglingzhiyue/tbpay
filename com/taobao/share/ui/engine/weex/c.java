package com.taobao.share.ui.engine.weex;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.share.ui.engine.weex.b;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import com.ut.share.business.ShareBusiness;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.nyy;
import tb.obc;
import tb.obf;
import tb.obh;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NOTCH_IN_SCREEN_VIVO = 32;
    public static final int VIVO_NOTCH = 32;

    /* renamed from: a  reason: collision with root package name */
    public static int f19687a;
    private static Boolean b;
    private static String c;

    /* loaded from: classes8.dex */
    public interface a {
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : c;
    }

    static {
        kge.a(1358146864);
        c = "WeexRender";
        b = false;
    }

    public static VesselView a(Activity activity, String str, b.InterfaceC0815b interfaceC0815b, String str2) {
        VesselView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("7848f964", new Object[]{activity, str, interfaceC0815b, str2});
        }
        String str3 = "";
        String a3 = com.taobao.orange.util.c.a(str);
        if ("true".equals(obh.h())) {
            if (StringUtils.isEmpty(str3)) {
                str3 = ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext().getFilesDir().getAbsolutePath() + File.separator + a3 + obf.KEY_SHARE_PANEL_JS;
            }
            if ("true".equals(obc.b(activity, a3 + obf.KEY_SHARE_PANEL))) {
                try {
                    if (new File(str3).exists()) {
                        a2 = a(activity, interfaceC0815b, "file://" + str3);
                        nyy.b("render weex url by file cache,path=" + str3);
                    } else {
                        a2 = a(activity, interfaceC0815b, str);
                        nyy.b("render weex url by url, url=" + str);
                    }
                } catch (Throwable th) {
                    a2 = a(activity, interfaceC0815b, str);
                    nyy.b("render weex url by file downgrade NETWORK, url=" + str + "downgrade info =" + th.toString());
                }
            } else {
                a2 = a(activity, interfaceC0815b, str);
                nyy.b("render weex url by netowrk, url=" + str);
            }
            ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            obf.c(ShareBizAdapter.getInstance().getAppEnv().b(), str, a3 + obf.KEY_SHARE_PANEL_JS, a3 + obf.KEY_SHARE_PANEL, true);
            return a2;
        }
        VesselView a4 = a(activity, interfaceC0815b, str);
        nyy.b("orange close, render weex url by netowrk,url=" + str);
        return a4;
    }

    public static WeexBizView b(Activity activity, String str, final b.InterfaceC0815b interfaceC0815b, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBizView) ipChange.ipc$dispatch("89945fd2", new Object[]{activity, str, interfaceC0815b, str2});
        }
        final WeexBizView weexBizView = new WeexBizView(activity);
        weexBizView.init(new WeexBizView.b() { // from class: com.taobao.share.ui.engine.weex.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    WeexBizView.this.clear();
                }
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(WeexBizView weexBizView2, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("48e048d7", new Object[]{this, weexBizView2, view});
                } else {
                    c.c();
                }
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(WeexBizView weexBizView2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98ac8c1b", new Object[]{this, weexBizView2});
                    return;
                }
                c.c();
                interfaceC0815b.getDowngradeListener().a();
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(String str3, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20476513", new Object[]{this, str3, map});
                    return;
                }
                c.c();
                WeexBizView.this.clear();
            }
        }, str2);
        String str3 = "weex2 share  file:" + str;
        weexBizView.render(str, null);
        return weexBizView;
    }

    public static VesselView a(Activity activity, b.InterfaceC0815b interfaceC0815b, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("4985e31a", new Object[]{activity, interfaceC0815b, str});
        }
        VesselView vesselView = new VesselView(activity);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap hashMap = new HashMap();
        hashMap.put("height", Integer.valueOf(a((Context) activity)));
        if (vesselView.findViewWithTag("WebMaskView") == null) {
            vesselView.setOnLoadListener(new b(interfaceC0815b, new WebMaskView(vesselView, str), str));
        }
        vesselView.setLayoutParams(layoutParams);
        vesselView.loadUrl(VesselType.Weex, str, hashMap);
        return vesselView;
    }

    public static int a(Context context) {
        int c2;
        int i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        Activity activity = (Activity) context;
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig("android_share", "shareScreenHeightFix_" + Build.MODEL, "");
        if (!StringUtils.isEmpty(config)) {
            int parseInt = Integer.parseInt(config);
            return a(activity) ? parseInt - c(context) : parseInt;
        }
        if (Build.BRAND.equalsIgnoreCase("huawei") || Build.BRAND.equalsIgnoreCase("honor")) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    TLog.logd("huaweiSharePanel", "metrics.heightPixels:" + i2);
                    Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                    f19687a = ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
                    i2 += f19687a;
                    TLog.logd("huaweiSharePanel", "fix_height:" + i2);
                } else {
                    TLog.logd("huaweiSharePanel", "sdk < 28 so height:" + i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!a(activity) || Build.VERSION.SDK_INT < 24 || !activity.isInMultiWindowMode()) {
                return i2;
            }
            c2 = c(context);
        } else {
            try {
                if ("xiaomi".equalsIgnoreCase(Build.BRAND)) {
                    if (Settings.Global.getInt(context.getContentResolver(), "force_black", 1) != 1) {
                        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                        if (identifier <= 0) {
                            return i2;
                        }
                        i = context.getResources().getDimensionPixelSize(identifier);
                    } else if (Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
                        return ((Activity) context).getWindow().getDecorView().getHeight();
                    } else {
                        int identifier2 = context.getResources().getIdentifier("notch_height", "dimen", "android");
                        if (identifier2 <= 0) {
                            return i2;
                        }
                        i = context.getResources().getDimensionPixelSize(identifier2);
                    }
                } else if ("oppo".equalsIgnoreCase(Build.BRAND)) {
                    if (!d(context)) {
                        return i2;
                    }
                    f19687a = 80;
                    i = f19687a;
                } else if ("vivo".equalsIgnoreCase(Build.BRAND)) {
                    if (!b(context)) {
                        return i2;
                    }
                    f19687a = a(context, 32.0f);
                    i = f19687a;
                } else if (!"ONEPLUS A6000".equals(Build.MODEL)) {
                    return i2;
                } else {
                    i2 = activity.getWindow().getDecorView().getHeight();
                    if (!a(activity)) {
                        return i2;
                    }
                    c2 = c(context);
                }
                return i2 + i;
            } catch (Throwable unused) {
                return i2;
            }
        }
        return i2 - c2;
    }

    public static boolean b(Context context) {
        if ("false".equals(OrangeConfig.getInstance().getConfig("android_share", "checkHasNotchInScreenAtVIVO", "true"))) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).getContext().getPackageName();
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
