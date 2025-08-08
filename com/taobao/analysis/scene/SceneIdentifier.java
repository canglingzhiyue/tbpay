package com.taobao.analysis.scene;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.monitor.JankContinuousMonitor;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dis;
import tb.mpa;
import tb.nog;
import tb.rfx;

/* loaded from: classes.dex */
public class SceneIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_HOMEPAGE_EXIT_BY_TWO_CLICK = "HOMEPAGE_EXIT_BY_TWO_CLICK";
    public static final int DEVICE_LEVEL_HIGH = 1;
    public static final int DEVICE_LEVEL_LOW = 3;
    public static final int DEVICE_LEVEL_MID = 2;
    public static final int DEVICE_LEVEL_UNKNOWN = 0;
    public static final String PAGE_WELCOME = "com.taobao.tao.welcome.Welcome";
    public static final String TAG = "falco.SceneIdentifier";
    public static final int TYPE_COVER_LAUNCH = 2;
    public static final int TYPE_FULL_NEW_LAUNCH = 1;
    public static final int TYPE_HOT_LAUNCH = 3;
    public static final int TYPE_LUANCH_UNKNOWN = -1;
    public static final int TYPE_NORMAL_COLD_LAUNCH = 0;
    public static final int USER_TYPE_INNER = 1;
    public static final int USER_TYPE_NORMAL = 0;
    public static final int USER_TYPE_VIP = 2;
    private static volatile long appLaunchTime = 0;
    private static String bgType = null;
    private static volatile String currentPageName = "com.taobao.tao.welcome.Welcome";
    private static volatile int deviceLevel = 0;
    private static volatile long homeCreateTime = 0;
    private static long homeFragmentCreateTime = 0;
    private static volatile boolean isBackground = false;
    private static volatile Boolean isFromExternal = null;
    private static Field isLauncherStartField = null;
    private static boolean isLinkManagerValid = false;
    private static boolean isTbMainValid = false;
    private static Field jumpUrlField = null;
    private static volatile long landingCompletionTime = 0;
    private static volatile long landingCreateTime = 0;
    private static Field landingUrlField = null;
    private static volatile long lastLaunchTime = 0;
    private static long launchPicEndTime = 0;
    private static Class linkMangerClazz = null;
    private static volatile long pageCreateTime = 0;
    private static volatile long pageResumeTime = 0;
    private static volatile String processName = null;
    private static volatile long processStartTime = 0;
    private static final BroadcastReceiver receiver;
    private static volatile int startType = -1;
    private static Class tbMainClazz;
    private static Method tbMainMethod;
    private static List<String> landingWhiteList = new ArrayList();
    private static volatile boolean isLandingFinished = false;
    private static AtomicBoolean isApmInited = new AtomicBoolean(false);
    private static CopyOnWriteArraySet<a> listeners = new CopyOnWriteArraySet<>();
    private static AtomicBoolean contextInitialize = new AtomicBoolean(false);
    private static volatile int userType = 0;
    private static volatile int processId = -1;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public static /* synthetic */ long access$002(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550f5f", new Object[]{new Long(j)})).longValue();
        }
        pageCreateTime = j;
        return j;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : currentPageName;
    }

    public static /* synthetic */ Boolean access$1002(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9d3c0ce2", new Object[]{bool});
        }
        isFromExternal = bool;
        return bool;
    }

    public static /* synthetic */ String access$102(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de613c1c", new Object[]{str});
        }
        currentPageName = str;
        return str;
    }

    public static /* synthetic */ boolean access$1100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ad12feb", new Object[0])).booleanValue() : updateUrlLaunch();
    }

    public static /* synthetic */ long access$1202(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aa021ce", new Object[]{new Long(j)})).longValue();
        }
        landingCompletionTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$1302(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2818acd", new Object[]{new Boolean(z)})).booleanValue();
        }
        isBackground = z;
        return z;
    }

    public static /* synthetic */ void access$1400(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f9066a", new Object[]{new Boolean(z)});
        } else {
            notifyLifecycleListener(z);
        }
    }

    public static /* synthetic */ String access$1502(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("192d5d09", new Object[]{str});
        }
        bgType = str;
        return str;
    }

    public static /* synthetic */ boolean access$200(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c85448f", new Object[]{activity})).booleanValue() : isTbMain(activity);
    }

    public static /* synthetic */ long access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b88b92e", new Object[0])).longValue() : homeCreateTime;
    }

    public static /* synthetic */ long access$302(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f895fc", new Object[]{new Long(j)})).longValue();
        }
        homeCreateTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue() : isLandingFinished;
    }

    public static /* synthetic */ boolean access$402(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80d9fefb", new Object[]{new Boolean(z)})).booleanValue();
        }
        isLandingFinished = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8874f212", new Object[]{activity})).booleanValue() : isLandingActivity(activity);
    }

    public static /* synthetic */ long access$602(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c1c99", new Object[]{new Long(j)})).longValue();
        }
        landingCreateTime = j;
        return j;
    }

    public static /* synthetic */ long access$702(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b87d4978", new Object[]{new Long(j)})).longValue();
        }
        pageResumeTime = j;
        return j;
    }

    public static /* synthetic */ int access$800() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6407e172", new Object[0])).intValue() : startType;
    }

    public static /* synthetic */ int access$802(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205e7295", new Object[]{new Integer(i)})).intValue();
        }
        startType = i;
        return i;
    }

    public static /* synthetic */ long access$902(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883fa336", new Object[]{new Long(j)})).longValue();
        }
        appLaunchTime = j;
        return j;
    }

    static {
        try {
            linkMangerClazz = Class.forName("com.taobao.linkmanager.AfcLifeCycleCenter");
            landingWhiteList.add("com.taobao.search.sf.MainSearchResultActivity");
            landingWhiteList.add("com.taobao.browser.BrowserActivity");
            landingWhiteList.add("com.taobao.android.detail.wrapper.activity.DetailActivity");
            landingWhiteList.add("com.taobao.order.detail.ui.OrderDetailActivity");
            landingWhiteList.add("com.taobao.message.accounts.activity.AccountActivity");
            landingWhiteList.add("com.taobao.android.shop.activity.ShopHomePageActivity");
            landingWhiteList.add("com.taobao.weex.WXActivity");
            landingWhiteList.add("com.taobao.android.trade.cart.CartActivity");
            isLinkManagerValid = true;
        } catch (Exception e) {
            ALog.e(TAG, "AfcLifeCycleCenter not support.", null, e, new Object[0]);
            isLinkManagerValid = false;
        }
        try {
            Class<?> cls = Class.forName("com.taobao.tao.TBMainHost");
            tbMainClazz = cls;
            tbMainMethod = cls.getDeclaredMethod("fromActivity", Activity.class);
            isTbMainValid = true;
        } catch (Exception e2) {
            ALog.e(TAG, "TBMainHost not support.", null, e2, new Object[0]);
            isTbMainValid = false;
        }
        checkApmInitStatus();
        receiver = new BroadcastReceiver() { // from class: com.taobao.analysis.scene.SceneIdentifier.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!SceneIdentifier.ACTION_HOMEPAGE_EXIT_BY_TWO_CLICK.equals(intent.getAction())) {
                } else {
                    SceneIdentifier.access$1502("back");
                }
            }
        };
    }

    public static boolean isUrlLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5809d083", new Object[0])).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(updateUrlLaunch());
        isFromExternal = valueOf;
        return valueOf.booleanValue();
    }

    private static boolean updateUrlLaunch() {
        if (!isLinkManagerValid) {
            return false;
        }
        try {
            if (isLauncherStartField == null) {
                isLauncherStartField = linkMangerClazz.getField("isLauncherStart");
            }
            return !isLauncherStartField.getBoolean(linkMangerClazz);
        } catch (Exception unused) {
            ALog.e(TAG, "isUrlLaunch failed.", null, new Object[0]);
            return false;
        }
    }

    public static int getStartType() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c914980", new Object[0])).intValue();
        }
        if (!checkApmInitStatus()) {
            return -1;
        }
        int i2 = startType;
        if (i2 != -1) {
            return i2;
        }
        d a2 = c.a();
        boolean a3 = a2.a("isFullNewInstall", false);
        if (a3) {
            i = 1;
        } else {
            boolean a4 = a2.a("isFirstLaunch", false);
            if (a3 || !a4) {
                String a5 = a2.a("launchType", mpa.COLD);
                if (a3 || a4 || !mpa.COLD.equalsIgnoreCase(a5)) {
                    i = mpa.HOT.equalsIgnoreCase(a5) ? 3 : i2;
                }
            } else {
                i = 2;
            }
        }
        startType = i;
        return i;
    }

    public static long getAppLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7dcd66", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        long j = appLaunchTime;
        if (j != 0) {
            return j;
        }
        long a2 = c.a().a("startProcessSystemTime", 0L);
        appLaunchTime = a2;
        return a2;
    }

    public static long getLastLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5544fc7", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        long j = lastLaunchTime;
        if (j != 0) {
            return j;
        }
        long a2 = c.a().a("lastStartProcessTime", 0L);
        lastLaunchTime = a2;
        return a2;
    }

    public static int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (!checkApmInitStatus()) {
            return 0;
        }
        int i2 = deviceLevel;
        if (i2 != 0) {
            return i2;
        }
        switch (c.a().a("deviceLevel", -1)) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 3;
                break;
        }
        deviceLevel = i;
        return i;
    }

    public static long getHomeCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e653a299", new Object[0])).longValue();
        }
        if (checkApmInitStatus()) {
            return homeCreateTime;
        }
        return 0L;
    }

    public static long getHomeFragmentCreateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93cd8009", new Object[0])).longValue() : homeFragmentCreateTime;
    }

    public static String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f927f6fc", new Object[0]) : !checkApmInitStatus() ? "com.taobao.tao.welcome.Welcome" : currentPageName;
    }

    public static String getCurrentPageNameWithFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21acb6e6", new Object[0]);
        }
        if (!checkApmInitStatus()) {
            return "com.taobao.tao.welcome.Welcome";
        }
        d a2 = c.a();
        if (a2 != null) {
            String a3 = a2.a("currFragmentName", (String) null);
            if (!StringUtils.isEmpty(a3)) {
                return currentPageName + "_" + a3;
            }
        }
        return currentPageName;
    }

    public static String getCurrentPageUrl() {
        d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6efb597c", new Object[0]);
        }
        if (!checkApmInitStatus() || (a2 = c.a()) == null) {
            return null;
        }
        String a3 = a2.a("currActivitySchemaUrl", (String) null);
        if (dis.a()) {
            Log.e(TAG, "getCurrentPageUrl=" + a3);
        }
        return a3;
    }

    public static boolean isAppBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca5f730", new Object[0])).booleanValue();
        }
        if (checkApmInitStatus()) {
            return isBackground;
        }
        return false;
    }

    public static long getPageResumeTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d717c27a", new Object[0])).longValue();
        }
        if (checkApmInitStatus()) {
            return pageResumeTime;
        }
        return 0L;
    }

    public static long getPageCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582d5c49", new Object[0])).longValue();
        }
        if (checkApmInitStatus()) {
            return pageCreateTime;
        }
        return 0L;
    }

    public static String getBucketInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50e4520b", new Object[0]) : ABTestCenter.getTBSpeedBucket();
    }

    public static String getLandingUrl() {
        if (!isLinkManagerValid) {
            return null;
        }
        try {
            if (landingUrlField == null) {
                landingUrlField = linkMangerClazz.getField(ActivityJumpUtil.LANDING_URL);
            }
            return (String) landingUrlField.get(linkMangerClazz);
        } catch (Exception e) {
            ALog.e(TAG, "getLandingUrl failed.", null, e, new Object[0]);
            return null;
        }
    }

    public static long getLandingCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1b8d625", new Object[0])).longValue();
        }
        if (checkApmInitStatus()) {
            return landingCreateTime;
        }
        return 0L;
    }

    public static long getLandingCompletionTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3923085", new Object[0])).longValue();
        }
        if (checkApmInitStatus()) {
            return landingCompletionTime;
        }
        return 0L;
    }

    public static String getJumpUrl() {
        if (!isLinkManagerValid) {
            return null;
        }
        try {
            if (jumpUrlField == null) {
                jumpUrlField = linkMangerClazz.getField("jumpUrl");
            }
            return (String) jumpUrlField.get(linkMangerClazz);
        } catch (Exception e) {
            ALog.e(TAG, "getJumpUrl failed.", null, e, new Object[0]);
            return null;
        }
    }

    private static boolean isLandingActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22235559", new Object[]{activity})).booleanValue();
        }
        String name = activity.getClass().getName();
        if (!"com.taobao.browser.BrowserActivity".equals(name)) {
            return landingWhiteList.contains(name) || isTbMain(activity);
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            String dataString = intent.getDataString();
            if (!StringUtils.isEmpty(dataString) && dataString.contains("s.click.taobao.com")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTbMain(Activity activity) {
        if (!isTbMainValid) {
            return false;
        }
        try {
            return tbMainMethod.invoke(tbMainClazz, activity) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkApmInitStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af817e43", new Object[0])).booleanValue();
        }
        if (c.a() == d.DEFAULT) {
            return false;
        }
        if (isApmInited.compareAndSet(false, true)) {
            c.a(new a.InterfaceC0630a() { // from class: com.taobao.analysis.scene.SceneIdentifier.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    } else if (activity == null) {
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        SceneIdentifier.access$002(currentTimeMillis);
                        SceneIdentifier.access$102(activity.getLocalClassName());
                        FullTraceAnalysis.getInstance().log(null, "fulltrace", "pageIn", SceneIdentifier.access$100());
                        if (SceneIdentifier.access$200(activity)) {
                            SceneIdentifier.access$302(currentTimeMillis);
                            if (dis.a()) {
                                Log.e(SceneIdentifier.TAG, "homeActivityCreate=" + SceneIdentifier.access$300());
                            }
                        }
                        if (!SceneIdentifier.access$400() && SceneIdentifier.access$500(activity)) {
                            SceneIdentifier.access$602(currentTimeMillis);
                        }
                        JankContinuousMonitor.a().c(SceneIdentifier.access$100());
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    } else if (activity == null) {
                    } else {
                        String localClassName = activity.getLocalClassName();
                        if (SceneIdentifier.access$100() == null || !SceneIdentifier.access$100().equals(localClassName)) {
                            SceneIdentifier.access$102(localClassName);
                            SceneIdentifier.access$702(System.currentTimeMillis());
                            FullTraceAnalysis.getInstance().log(null, "fulltrace", "pageIn", SceneIdentifier.access$100());
                        } else {
                            SceneIdentifier.access$102(localClassName);
                            SceneIdentifier.access$702(System.currentTimeMillis());
                        }
                        JankContinuousMonitor.a().a(localClassName, SceneIdentifier.getCurrentPageUrl());
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    } else if (activity == null) {
                    } else {
                        JankContinuousMonitor.a().d(activity.getLocalClassName());
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    } else if (activity == null) {
                    } else {
                        JankContinuousMonitor.a().e(activity.getLocalClassName());
                    }
                }
            }, true);
            c.a(new a.c() { // from class: com.taobao.analysis.scene.SceneIdentifier.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IAppLaunchListener
                public void a(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    int access$800 = SceneIdentifier.access$800();
                    if (i == 1 && access$800 != 3) {
                        SceneIdentifier.access$902(System.currentTimeMillis());
                        SceneIdentifier.access$802(3);
                        SceneIdentifier.access$1002(Boolean.valueOf(SceneIdentifier.access$1100()));
                    }
                    if (i2 == 0) {
                        SceneIdentifier.access$402(false);
                        if (!dis.a()) {
                            return;
                        }
                        Log.e(SceneIdentifier.TAG, "LAUNCH_DRAW_START=" + System.currentTimeMillis());
                    } else if (i2 == 1) {
                        if (!dis.a()) {
                            return;
                        }
                        Log.e(SceneIdentifier.TAG, "LAUNCH_VISIBLE=" + System.currentTimeMillis());
                    } else if (i2 == 2) {
                        if (!dis.a()) {
                            return;
                        }
                        Log.e(SceneIdentifier.TAG, "LAUNCH_INTERACTIVE=" + System.currentTimeMillis());
                    } else if (i2 == 3) {
                        if (!dis.a()) {
                            return;
                        }
                        Log.e(SceneIdentifier.TAG, "LAUNCH_SKI_INTERACTIVE=" + System.currentTimeMillis());
                    } else if (i2 != 4) {
                    } else {
                        SceneIdentifier.access$402(true);
                        SceneIdentifier.access$1202(System.currentTimeMillis());
                        if (!dis.a()) {
                            return;
                        }
                        Log.e(SceneIdentifier.TAG, "LAUNCH_COMPLETED=" + System.currentTimeMillis());
                    }
                }
            });
            c.a(new a.b() { // from class: com.taobao.analysis.scene.SceneIdentifier.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i == 1) {
                        SceneIdentifier.access$1302(true);
                        SceneIdentifier.access$1400(true);
                    } else if (i != 2) {
                    } else {
                        SceneIdentifier.access$1302(false);
                        SceneIdentifier.access$1502(null);
                        SceneIdentifier.access$1400(false);
                    }
                }
            });
        }
        return true;
    }

    private static void notifyLifecycleListener(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b24a658", new Object[]{new Boolean(z)});
            return;
        }
        Iterator<a> it = listeners.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (z) {
                try {
                    next.b();
                } catch (Exception e) {
                    ALog.e(TAG, "notifyListener exception.", null, e, new Object[0]);
                }
            } else {
                next.a();
            }
        }
    }

    public static void registerLifecycleListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a672f50", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            listeners.add(aVar);
        }
    }

    public static void unregisterLifecycleListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d54aa9", new Object[]{aVar});
        } else {
            listeners.remove(aVar);
        }
    }

    public static String getBgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f262f604", new Object[0]);
        }
        if (!isBackground) {
            return null;
        }
        return bgType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (com.taobao.android.ab.api.ABGlobal.a(r6, "taobao", "tbspeed", "home_local_broadcast_optimize") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setContext(android.content.Context r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.analysis.scene.SceneIdentifier.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r6 = "1a164154"
            r0.ipc$dispatch(r6, r1)
            return
        L12:
            if (r6 != 0) goto L15
            return
        L15:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.taobao.analysis.scene.SceneIdentifier.contextInitialize
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto L5a
            setUserType(r6)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "HOMEPAGE_EXIT_BY_TWO_CLICK"
            r0.addAction(r1)
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()     // Catch: java.lang.Throwable -> L49
            int r1 = r1.flags     // Catch: java.lang.Throwable -> L49
            r1 = r1 & 2
            if (r1 == 0) goto L36
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            if (r1 != 0) goto L48
            java.lang.String r1 = "taobao"
            java.lang.String r4 = "tbspeed"
            java.lang.String r5 = "home_local_broadcast_optimize"
            boolean r1 = com.taobao.android.ab.api.ABGlobal.a(r6, r1, r4, r5)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L49
        L48:
            r3 = 1
        L49:
            if (r3 != 0) goto L51
            android.content.BroadcastReceiver r1 = com.taobao.analysis.scene.SceneIdentifier.receiver
            r6.registerReceiver(r1, r0)
            return
        L51:
            android.support.v4.content.LocalBroadcastManager r6 = android.support.v4.content.LocalBroadcastManager.getInstance(r6)
            android.content.BroadcastReceiver r1 = com.taobao.analysis.scene.SceneIdentifier.receiver
            r6.registerReceiver(r1, r0)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.scene.SceneIdentifier.setContext(android.content.Context):void");
    }

    public static boolean isLaunchFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1028d21a", new Object[0])).booleanValue() : isLandingFinished;
    }

    public static long getLaunchFinishTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("71d0d84", new Object[0])).longValue() : landingCompletionTime;
    }

    public static void setLaunchPicEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f0290a", new Object[]{new Long(j)});
            return;
        }
        if (dis.a()) {
            Log.e(TAG, "pictureEnd=" + j);
            if (homeFragmentCreateTime != 0) {
                Log.e(TAG, "picDuration=" + (j - homeFragmentCreateTime));
            }
        }
        launchPicEndTime = j;
    }

    public static int getUserType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acace15", new Object[0])).intValue() : userType;
    }

    private static void setUserType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844bd25a", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                userType = context.getSharedPreferences(rfx.INNER_USER_CONFIG, 0).getInt("user_type", 0);
                ALog.e(TAG, "[setUserType]", null, nog.PRD_USER_TYPE, Integer.valueOf(userType));
            } catch (Exception e) {
                userType = 0;
                ALog.e(TAG, "[setUserType]failed.", null, e, new Object[0]);
            }
        }
    }

    public static int getProcessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa1a83ae", new Object[0])).intValue();
        }
        if (processId != -1) {
            return processId;
        }
        int myPid = Process.myPid();
        processId = myPid;
        return myPid;
    }

    public static long getProcessStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        if (!checkApmInitStatus()) {
            return 0L;
        }
        long j = processStartTime;
        if (j != 0) {
            return j;
        }
        long a2 = c.a().a("startProcessSystemTime", 0L);
        processStartTime = a2;
        return a2;
    }

    public static String getProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[0]);
        }
        if (processName != null) {
            return processName;
        }
        String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
        processName = currentProcess;
        return currentProcess;
    }
}
