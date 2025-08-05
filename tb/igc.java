package tb;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.android.change.app.icon.core.SilentChangeAppIconActivity;
import com.taobao.android.change.app.icon.core.b;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopResponse;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.android.change.app.icon.mtop.a;
import com.taobao.android.change.app.icon.utils.c;
import com.taobao.android.change.app.icon.utils.e;
import com.taobao.android.change.app.icon.utils.g;
import com.taobao.android.change.app.icon.utils.h;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class igc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIcon";

    /* renamed from: a  reason: collision with root package name */
    private static Application f29006a;
    private static Map<String, AppIconComponentName> b;
    private static AppIconComponentName c;

    static {
        kge.a(2071327015);
    }

    public static boolean a(Application application, boolean z, AppIconComponentName appIconComponentName, AppIconComponentName... appIconComponentNameArr) {
        boolean z2;
        long currentTimeMillis;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6333c514", new Object[]{application, new Boolean(z), appIconComponentName, appIconComponentNameArr})).booleanValue();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            f29006a = application;
            z3 = e.a().b().getBoolean(c.ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT, true);
            AdapterForTLog.loge(TAG, "init canInit:" + z3 + " start:" + currentTimeMillis2);
        } catch (Throwable th) {
            th.printStackTrace();
            AdapterForTLog.loge(TAG, "init error:", th);
            z2 = false;
        }
        if (!z3) {
            AdapterForTLog.loge(TAG, "init canInit:" + z3 + " return");
            return false;
        }
        c = appIconComponentName;
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(appIconComponentName.iconName, appIconComponentName);
        AdapterForTLog.loge(TAG, "init launchEntry Alias:" + c.iconName);
        AdapterForTLog.loge(TAG, "init deviceBrand:" + Build.BRAND + " deviceModel:" + Build.MODEL + " osVersion:" + Build.VERSION.RELEASE + " harmonyVersion:" + h.c());
        a(appIconComponentNameArr);
        List<AppIconComponentName> b2 = b(application);
        int size = b2.size();
        List<AppIconComponentName> c2 = c(application);
        AppIconComponentName d = d(application);
        AppIconComponentName a2 = a();
        StringBuilder sb = new StringBuilder();
        sb.append("init enableStateIcons:");
        sb.append(b2.size());
        sb.append(" defaultStateIcons:");
        sb.append(c2.size());
        sb.append(" currentIcon:");
        String str = "null";
        sb.append(d == null ? str : d.iconName);
        sb.append(" expectIcon:");
        if (a2 != null) {
            str = a2.iconName;
        }
        sb.append(str);
        AdapterForTLog.loge(TAG, sb.toString());
        if (size == 0) {
            AdapterForTLog.loge(TAG, "enableComponentNameSize is zero,defaultState:" + c.state);
            boolean z4 = c.state == 0;
            g.c(g.PAGE_NAME, "init", "first_install:" + z4, null, null);
            if (z4) {
                size = 1;
            }
        }
        e();
        b.a().b();
        if (z) {
            a(b2, c2, d, a2);
        } else if (e.a().b().getBoolean(c.ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON, false)) {
            z2 = true;
            a(true);
            a(size);
            g.c(g.PAGE_NAME, "init", "enableComponentNameSize:" + size, "isMainProcess:" + z, null);
            b(size);
            c(size);
            AdapterForTLog.loge(TAG, "init end:" + System.currentTimeMillis() + " cost(ms):" + (currentTimeMillis - currentTimeMillis2) + " result:" + z2);
            return z2;
        }
        z2 = true;
        a(size);
        g.c(g.PAGE_NAME, "init", "enableComponentNameSize:" + size, "isMainProcess:" + z, null);
        b(size);
        c(size);
        AdapterForTLog.loge(TAG, "init end:" + System.currentTimeMillis() + " cost(ms):" + (currentTimeMillis - currentTimeMillis2) + " result:" + z2);
        return z2;
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        AdapterForTLog.loge(TAG, "updateOrange");
        OrangeConfig.getInstance().getConfigs(c.NAMESPACE_DEFAULT);
        OrangeConfig.getInstance().registerListener(new String[]{c.NAMESPACE_DEFAULT}, new d() { // from class: tb.igc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!c.NAMESPACE_DEFAULT.equals(str)) {
                } else {
                    OrangeConfig.getInstance().unregisterListener(new String[]{c.NAMESPACE_DEFAULT}, this);
                    String string = e.a().b().getString(e.SP_KEY_ORANGE_LAST_VERSION, "");
                    String str2 = map.get("configVersion");
                    AdapterForTLog.loge(igc.TAG, "updateOrange namespace:" + str + " fromCache:" + map.get("fromCache") + " lastV:" + string + " newVersion:" + str2 + " infos:" + OrangeConfig.getInstance().getConfigs(str));
                    if (TextUtils.equals(str2, string)) {
                        return;
                    }
                    boolean a2 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT, "true");
                    boolean a3 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, "false");
                    int a4 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT, 0);
                    boolean a5 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG, "true");
                    boolean a6 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE, "false");
                    boolean a7 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT, "true");
                    boolean a8 = c.a(c.ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON, "false");
                    boolean a9 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN, "true");
                    e.a().a(e.SP_KEY_ORANGE_LAST_VERSION, str2).a(c.ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT, a2).a(c.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, a3).a(c.ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT, a4).a(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG, a5).a(c.ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE, a6).a(c.ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT, a7).a(c.ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON, a8).a(c.ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN, a9).a(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL, c.a(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL, 86400000L)).a(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT, c.a(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT, 2)).c();
                }
            }
        }, true);
    }

    private static void a(AppIconComponentName... appIconComponentNameArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86558744", new Object[]{appIconComponentNameArr});
        } else if (appIconComponentNameArr != null && appIconComponentNameArr.length > 0) {
            for (AppIconComponentName appIconComponentName : appIconComponentNameArr) {
                b.put(appIconComponentName.iconName, appIconComponentName);
                AdapterForTLog.loge(TAG, "launchEntry Alias:" + appIconComponentName.iconName);
            }
        }
    }

    private static void a(List<AppIconComponentName> list, List<AppIconComponentName> list2, AppIconComponentName appIconComponentName, AppIconComponentName appIconComponentName2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5910aa", new Object[]{list, list2, appIconComponentName, appIconComponentName2});
            return;
        }
        int size = list.size();
        int size2 = list2.size();
        boolean z = e.a().b().getBoolean(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG, false);
        boolean z2 = e.a().b().getBoolean(c.ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE, false);
        AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg open:" + z + " enableComponentNameSize:" + size + " redressDefaultIconEnable:" + z2);
        if (!z) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("autoRepairMoreAppIconsInBg attempt repair。 enableComponentNameSize:");
        sb.append(size);
        sb.append(" defaultComponentNameSize:");
        sb.append(size2);
        sb.append(" currentAppIconComponentName:");
        String str = "null";
        sb.append(appIconComponentName == null ? str : appIconComponentName.iconName);
        sb.append(" expectAppIconComponentName:");
        if (appIconComponentName2 != null) {
            str = appIconComponentName2.iconName;
        }
        sb.append(str);
        AdapterForTLog.loge(TAG, sb.toString());
        if (size <= 1) {
            if (!z2 || size != 1 || size2 <= 0) {
                return;
            }
            AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more default icon repair");
            g.c(g.PAGE_NAME, "auto_repair_more_icons_bg", "enableComponentNameSize:" + size, "more_default_icon", null);
            a(appIconComponentName2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = e.a().b(0L);
        long e = e.a().e();
        AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair,currentTimeMillis:" + currentTimeMillis + " autoRepairMoreIconsInBgLastTime:" + b2 + " interval:" + e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("enableComponentNameSize:");
        sb2.append(size);
        g.c(g.PAGE_NAME, "auto_repair_more_icons_bg", sb2.toString(), "more_enable_icon", null);
        if (currentTimeMillis - b2 <= e) {
            AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair，but time interval not exceeded");
            return;
        }
        int c2 = e.a().c(2);
        int b3 = e.a().b(0);
        AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair,maxAttemptCount:" + c2 + " historyAttemptCount:" + b3);
        if (b3 >= c2) {
            AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair，but historyAttemptCount >= maxAttemptCount");
            return;
        }
        AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair start");
        e.a().a(currentTimeMillis);
        e.a().a(b3 + 1);
        a(appIconComponentName2);
    }

    private static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        boolean z = e.a().b().getBoolean(c.ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT, true);
        String d = e.a().d();
        AdapterForTLog.loge(TAG, "checkChangeAppIconIsRestart open:" + z + " infos:" + d);
        ChangeAppIconJSModel changeAppIconJSModel = (ChangeAppIconJSModel) h.a(d, ChangeAppIconJSModel.class);
        if (!z || changeAppIconJSModel == null || TextUtils.isEmpty(changeAppIconJSModel.iconName)) {
            return;
        }
        ChangeAppIconRequest changeAppIconRequest = new ChangeAppIconRequest(changeAppIconJSModel.iconName, "TIMEOUT", i);
        changeAppIconRequest.setChangeType(changeAppIconJSModel);
        changeAppIconRequest.setKilled(true);
        g.c(g.PAGE_NAME, "change_happen_restart", changeAppIconRequest.toString(), null, null);
        com.taobao.android.change.app.icon.utils.b.a(changeAppIconRequest, new a() { // from class: tb.igc.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.change.app.icon.mtop.a
            public void a(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f429f71", new Object[]{this, changeAppIconMtopResponse});
                } else {
                    a();
                }
            }

            @Override // com.taobao.android.change.app.icon.mtop.a
            public void b(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("118d5450", new Object[]{this, changeAppIconMtopResponse});
                } else {
                    a();
                }
            }

            private void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                AdapterForTLog.loge(igc.TAG, "checkChangeAppIconIsRestart clear infos");
                e.a().a("");
            }
        });
    }

    private static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            return;
        }
        int i2 = e.a().b().getInt(c.ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT, 0);
        boolean a2 = h.a(i2);
        AdapterForTLog.loge(TAG, "reportInitByMtop change_app_icon_init_report:" + i2 + " open:" + a2);
        if (!a2) {
            return;
        }
        com.taobao.android.change.app.icon.utils.b.a(new ChangeAppIconRequest("", "INIT", i), (a) null);
    }

    private static void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{new Integer(i)});
            return;
        }
        try {
            UncaughtCrashManager manager = TCrashSDK.instance().getManager();
            jel jelVar = manager instanceof jel ? (jel) manager : null;
            if (jelVar == null) {
                return;
            }
            AppIconComponentName d = d(b());
            AppIconComponentName a2 = a();
            jelVar.a("currentAppIcon", d.toString());
            jelVar.a("expectAppIcon", a2 == null ? "null" : a2.toString());
            jelVar.a("enableAppIcons", Integer.valueOf(i));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static ChangeAppIconJSModel a(String str, AppIconComponentName appIconComponentName, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeAppIconJSModel) ipChange.ipc$dispatch("ccb01a02", new Object[]{str, appIconComponentName, str2});
        }
        a(appIconComponentName);
        ChangeAppIconJSModel changeAppIconJSModel = new ChangeAppIconJSModel();
        changeAppIconJSModel.iconName = appIconComponentName.iconName;
        changeAppIconJSModel.changeType = str;
        changeAppIconJSModel.crash = str2;
        return changeAppIconJSModel;
    }

    public static void a(Context context, AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59701fb1", new Object[]{context, appIconComponentName});
        } else {
            a(context, a(Constrant.ChangeType.SILENT, appIconComponentName, ""));
        }
    }

    public static void a(Context context, ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eefa409", new Object[]{context, changeAppIconJSModel});
            return;
        }
        Intent intent = new Intent(f29006a, SilentChangeAppIconActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        intent.putExtra(SilentChangeAppIconActivity.KEY_CHANGE_APP_ICON_DATA, JSON.toJSONString(changeAppIconJSModel));
        context.startActivity(intent);
    }

    public static void a(AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6836a9", new Object[]{appIconComponentName});
        } else {
            b.a().a(a(Constrant.ChangeType.BG, appIconComponentName, ""));
        }
    }

    public static void b(AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd63308", new Object[]{appIconComponentName});
        } else {
            b.a().a(a(Constrant.ChangeType.NOW, appIconComponentName, ""));
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        int e = e(b());
        AdapterForTLog.loge(TAG, "changeDefaultAppIcon size:" + e + " now:" + z);
        g.c(g.PAGE_NAME, "changeDefaultAppIcon", "enableComponentNameSize:" + e + " now:" + z, "default:" + c.toString(), null);
        if (c.state == 1 || c.state == 0) {
            AdapterForTLog.loge(TAG, "now icon is default,return");
        } else if (z) {
            b(c);
        } else {
            a(c);
        }
    }

    public static List<ComponentName> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        for (Map.Entry<String, AppIconComponentName> entry : c().entrySet()) {
            AppIconComponentName value = entry.getValue();
            ComponentName componentName = new ComponentName(context, value.clzPath);
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            value.state = componentEnabledSetting;
            if (componentEnabledSetting == 1) {
                arrayList.add(componentName);
            }
            AdapterForTLog.loge(TAG, "getEnableLaunchers name:" + value.iconName + " state:" + value.state);
        }
        return arrayList;
    }

    public static List<AppIconComponentName> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30c7e468", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        a(context);
        for (Map.Entry<String, AppIconComponentName> entry : c().entrySet()) {
            AppIconComponentName value = entry.getValue();
            if (value.state == 1) {
                arrayList.add(value);
            }
        }
        if (d().state == 0) {
            arrayList.add(d());
        }
        if (arrayList.isEmpty()) {
            arrayList.add(d());
        }
        return arrayList;
    }

    public static List<AppIconComponentName> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb68a6e9", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        a(context);
        for (Map.Entry<String, AppIconComponentName> entry : c().entrySet()) {
            AppIconComponentName value = entry.getValue();
            if (value.state == 0) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        com.taobao.tlog.adapter.AdapterForTLog.loge(tb.igc.TAG, "getCurrentAppIconComponentName match expect:" + r4.iconName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        r1 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.change.app.icon.model.AppIconComponentName d(android.content.Context r7) {
        /*
            java.lang.String r0 = "ChangeAppIcon"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.igc.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            if (r2 == 0) goto L17
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r7
            java.lang.String r7 = "d1bf563e"
            java.lang.Object r7 = r1.ipc$dispatch(r7, r0)
            com.taobao.android.change.app.icon.model.AppIconComponentName r7 = (com.taobao.android.change.app.icon.model.AppIconComponentName) r7
            return r7
        L17:
            com.taobao.android.change.app.icon.model.AppIconComponentName r1 = d()
            java.util.List r7 = b(r7)     // Catch: java.lang.Exception -> L77
            com.taobao.android.change.app.icon.model.AppIconComponentName r2 = a()     // Catch: java.lang.Exception -> L77
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L77
        L27:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Exception -> L77
            if (r4 == 0) goto L60
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Exception -> L77
            com.taobao.android.change.app.icon.model.AppIconComponentName r4 = (com.taobao.android.change.app.icon.model.AppIconComponentName) r4     // Catch: java.lang.Exception -> L77
            if (r2 == 0) goto L5a
            java.lang.String r5 = r4.iconName     // Catch: java.lang.Exception -> L77
            java.lang.String r6 = r2.iconName     // Catch: java.lang.Exception -> L77
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch: java.lang.Exception -> L77
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57
            r7.<init>()     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = "getCurrentAppIconComponentName match expect:"
            r7.append(r1)     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = r4.iconName     // Catch: java.lang.Exception -> L57
            r7.append(r1)     // Catch: java.lang.Exception -> L57
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L57
            com.taobao.tlog.adapter.AdapterForTLog.loge(r0, r7)     // Catch: java.lang.Exception -> L57
            r1 = r4
            goto L60
        L57:
            r7 = move-exception
            r1 = r4
            goto L78
        L5a:
            int r5 = r4.state     // Catch: java.lang.Exception -> L77
            if (r5 != r3) goto L27
            r1 = r4
            goto L27
        L60:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
            r7.<init>()     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = "getCurrentAppIconComponentName result:"
            r7.append(r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = r1.iconName     // Catch: java.lang.Exception -> L77
            r7.append(r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L77
            com.taobao.tlog.adapter.AdapterForTLog.loge(r0, r7)     // Catch: java.lang.Exception -> L77
            goto L80
        L77:
            r7 = move-exception
        L78:
            r7.printStackTrace()
            java.lang.String r2 = "getCurrentAppIconComponentName error:"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r0, r2, r7)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.igc.d(android.content.Context):com.taobao.android.change.app.icon.model.AppIconComponentName");
    }

    public static void c(AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78442f67", new Object[]{appIconComponentName});
            return;
        }
        try {
            e.a().a(e.SP_KEY_EXPECT_APP_ICON_MODEL, JSON.toJSONString(appIconComponentName)).c();
        } catch (Exception e) {
            e.printStackTrace();
            AdapterForTLog.loge(TAG, "saveExpectAppIconModel error:", e);
        }
    }

    public static AppIconComponentName a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppIconComponentName) ipChange.ipc$dispatch("e3f8d229", new Object[0]);
        }
        AppIconComponentName d = d();
        try {
            d = (AppIconComponentName) h.a(e.a().b().getString(e.SP_KEY_EXPECT_APP_ICON_MODEL, ""), AppIconComponentName.class);
        } catch (Exception e) {
            e.printStackTrace();
            AdapterForTLog.loge(TAG, "getExpectAppIconModel error:", e);
        }
        return d == null ? d() : d;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue() : a(context).size();
    }

    public static Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[0]) : f29006a;
    }

    public static Map<String, AppIconComponentName> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : b;
    }

    public static AppIconComponentName d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppIconComponentName) ipChange.ipc$dispatch("773d456c", new Object[0]) : c;
    }
}
