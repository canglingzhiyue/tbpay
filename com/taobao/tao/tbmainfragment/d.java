package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.TBMainLog;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ID_TBMAIN_FRAGMENT = "TBMainFragmentOpen";
    public static final String FRAGMENT_MODEL_SP_NAME = "fragment_model_downgrade_switch";
    public static final String KEY_ORANGE_FRAGMENT_JUMP_ABILITY = "fragment_jump_ability";
    public static final String KEY_ORANGE_FRAGMENT_MOCK_POP_TO_MAIN = "fragment_mock_pop_to_main";
    public static final String KEY_ORANGE_RANDOM_THRESHOLD = "randomThreshold";
    public static final String ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY = "isDowngrade";
    public static final String ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_NAME_SPACE = "fragment_model_downgrade_switch";
    public static final String ORANGE_NAV_THRESHOLD_NAME_SPACE = "NavThreshold";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21131a;
    private static SharedPreferences b;
    private static final AtomicBoolean c;
    private static final AtomicBoolean d;
    private static Boolean e;
    public static boolean f;
    public static final AtomicBoolean sIsInit;

    public static /* synthetic */ void a(SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f2dc4d", new Object[]{editor, str});
        } else {
            b(editor, str);
        }
    }

    public static /* synthetic */ void a(SharedPreferences.Editor editor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7786cd7", new Object[]{editor, str, str2});
        } else {
            b(editor, str, str2);
        }
    }

    public static /* synthetic */ SharedPreferences e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("6314e040", new Object[0]) : b;
    }

    static {
        kge.a(-1221509924);
        sIsInit = new AtomicBoolean(false);
        f21131a = false;
        f = true;
        c = new AtomicBoolean(false);
        d = new AtomicBoolean(false);
    }

    private static void b(SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b2544e", new Object[]{editor, str});
        } else {
            b(editor, "fragment_model_downgrade_switch", str);
        }
    }

    private static void b(SharedPreferences.Editor editor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef44698", new Object[]{editor, str, str2});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, null);
        if (config != null) {
            editor.putString(str2, config);
        }
        TBMainLog.tlog("FragmentSwitch", "save string to sp. namespace is " + str + ", key is " + str2 + ", configValue is " + config);
    }

    private static boolean a(String str, boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        return (sharedPreferences == null || (string = sharedPreferences.getString(str, null)) == null) ? z : Boolean.parseBoolean(string);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        b = applicationContext.getSharedPreferences("fragment_model_downgrade_switch", 0);
        OrangeConfig.getInstance().registerListener(new String[]{"fragment_model_downgrade_switch", ORANGE_NAV_THRESHOLD_NAME_SPACE}, new com.taobao.orange.d() { // from class: com.taobao.tao.tbmainfragment.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                if ("fragment_model_downgrade_switch".equals(str)) {
                    TBMainLog.tlog("FragmentSwitch", "get fragment_model_downgrade_switch");
                    SharedPreferences.Editor edit = d.e().edit();
                    d.a(edit, d.ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY);
                    d.a(edit, "start_actionbar_init_delay");
                    d.a(edit, d.KEY_ORANGE_FRAGMENT_JUMP_ABILITY);
                    d.a(edit, d.KEY_ORANGE_FRAGMENT_MOCK_POP_TO_MAIN);
                    d.a(edit, "lifecycle_operation_mytaobao");
                    d.a(edit, "oppo_anr_opt");
                    edit.apply();
                }
                if (!d.ORANGE_NAV_THRESHOLD_NAME_SPACE.equals(str)) {
                    return;
                }
                TBMainLog.tlog("FragmentSwitch", "get NavThreshold");
                SharedPreferences.Editor edit2 = d.e().edit();
                d.a(edit2, d.ORANGE_NAV_THRESHOLD_NAME_SPACE, d.KEY_ORANGE_RANDOM_THRESHOLD);
                d.a(edit2, d.ORANGE_NAV_THRESHOLD_NAME_SPACE, "processor_error_threshold");
                edit2.apply();
            }
        }, true);
        c.a(context);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (e == null) {
            e = Boolean.valueOf(com.taobao.android.autosize.l.d(context));
        }
        if (e.booleanValue()) {
            TBMainLog.tlog("FragmentSwitch", "this is fold device , close fragment model");
            return false;
        } else if (b()) {
            TBMainLog.tlog("FragmentSwitch", "close fragment model by orange");
            return false;
        } else if (!c.get()) {
            return true;
        } else {
            TBMainLog.tlog("FragmentSwitch", "close TBMainFragmentOpen by user.");
            return false;
        }
    }

    public static synchronized boolean c(Context context) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
            } else if (d.get()) {
                TBMainLog.tlog("FragmentSwitch", "close FragmentModelOpenByHomePage TBMainFragmentOpen by user.");
                return false;
            } else {
                return c.b(context);
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        TBMainLog.tlog("FragmentSwitch", "set close fragment model by homepage.");
        boolean compareAndSet = d.compareAndSet(false, true);
        TBMainLog.tlog("FragmentSwitch", "sCloseFragmentModel.compareAndSet(false, true), and ret is " + compareAndSet);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            f21131a = Boolean.parseBoolean(sharedPreferences.getString(ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY, "false"));
        }
        return f21131a;
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, str);
        TBMainLog.tlog("FragmentSwitch", "get " + str + " ; value is " + isFeatureOpened);
        return isFeatureOpened;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        TBMainLog.tlog("FragmentNavDelegate", "set close fragment model by user.");
        boolean compareAndSet = c.compareAndSet(false, true);
        TBMainLog.tlog("FragmentNavDelegate", "sCloseFragmentModel.compareAndSet(false, true), and ret is " + compareAndSet);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, "TBMainFragmentThreeFloorsOpen");
        TBMainLog.tlog("FragmentSwitch", "isThreeFloorsOpen:" + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, "start_public_menu_init_delay");
        TBMainLog.tlog("FragmentSwitch", "isPublicMenuInitDelayedOpened: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a("start_actionbar_init_delay", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a(KEY_ORANGE_FRAGMENT_JUMP_ABILITY, true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : a(KEY_ORANGE_FRAGMENT_MOCK_POP_TO_MAIN, true);
    }

    private static int a(String str, int i) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null || (string = sharedPreferences.getString(str, null)) == null) {
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (Throwable th) {
            TBMainLog.tlog("FragmentSwitch", "getNavThreshold error, error is: " + th + " navThresholdStr: " + string + ". Use default value " + i);
            return i;
        }
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : a(KEY_ORANGE_RANDOM_THRESHOLD, 1000000);
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : a("processor_error_threshold", 100000);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : a("lifecycle_operation_mytaobao", true);
    }
}
