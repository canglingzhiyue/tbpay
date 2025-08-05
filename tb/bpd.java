package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.c;
import com.taobao.android.e;
import java.util.Map;

/* loaded from: classes2.dex */
public class bpd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BLANK_SCREEN_MONITOR = "enableBlankScreenMonitor";
    public static final String KEY_COMPONENT_LIFECYCLE = "enableComponentLifecycle";
    public static final String KEY_CONFIG_NAME_SPACE = "newUltron_container";
    public static final String KEY_DOWNGRADE_PRESET = "downgradePreset";
    public static final String KEY_DOWNLOAD_REFRESH = "downloadRefresh";
    public static final String KEY_ENABLE_CREATE_JSENGINE_WITH_JSI = "enableCreateJSEngineWithJsi";
    public static final String KEY_ENABLE_LIST_CONTAINER_SCROLLER = "enableListContainerScroller";
    public static final String KEY_HEADER_APPEAR_EVENT = "headerAppearEvent";
    public static final String KEY_PRESET_TEMPLATE_DIFF_REFRESH = "presetTemplateDiffRefresh";
    public static final String KEY_RELEASE_DX_ENGINE_WHEN_DESTROY = "releaseDXEngineWhenDestroy";
    public static final String KEY_REMOVE_UNSAFE_JSI = "removeUnSafeJSI";
    public static final String KEY_SCROLL_VISIBILITY_CHECK = "disableScrollVisibilityCheck";
    public static final String KEY_TEMPLATE_TIME_OUT = "template_time_out";
    public static final String KEY_USE_DATA_LOAD_TASK_CLEAN = "useDataloadTaskClean";
    public static final String KEY_USE_SYSTEM_TOAST = "useSystemToast";

    /* renamed from: a  reason: collision with root package name */
    public static AliConfigInterface f26033a;
    private static boolean b;

    static {
        kge.a(-1823127548);
        b = false;
        f26033a = e.a();
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str}) : f26033a.a(str);
    }

    public static void a(String[] strArr, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53491f6", new Object[]{strArr, cVar});
        } else {
            f26033a.a(strArr, cVar);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (jpx.a(context) && b) {
            return true;
        }
        return spk.a("newUltron_container", KEY_DOWNLOAD_REFRESH, true);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : spk.a("newUltron_container", KEY_DOWNGRADE_PRESET, true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : spk.a("newUltron_container", "useSystemToast", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : spk.a("newUltron_container", KEY_USE_DATA_LOAD_TASK_CLEAN, true);
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : spk.a("newUltron_container", KEY_TEMPLATE_TIME_OUT, 5000);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : spk.a("newUltron_container", KEY_HEADER_APPEAR_EVENT, true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : spk.a("newUltron_container", KEY_PRESET_TEMPLATE_DIFF_REFRESH, true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : spk.a("newUltron_container", KEY_REMOVE_UNSAFE_JSI, true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : spk.a("newUltron_container", KEY_RELEASE_DX_ENGINE_WHEN_DESTROY, true);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : spk.a("newUltron_container", str, z);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : spk.a("newUltron_container", "breakWhenOutOfBounds", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : spk.a("newUltron_container", "enableUltronThreadPoolExecutor", true);
    }
}
