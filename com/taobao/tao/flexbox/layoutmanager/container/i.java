package com.taobao.tao.flexbox.layoutmanager.container;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.Map;
import tb.guc;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes8.dex */
public abstract class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_ADD_VIDEO_TO_CONTAINER = "add_video_to_container";
    public static final String FEATURE_ASYNC_VIDEO_INFO = "async_videoinfo";
    public static final String FEATURE_DELAY_TAB2_RENDER = "delayTab2Render";
    public static final String FEATURE_DELAY_VIDEO_INTERACT_Layer = "delay_interact_layer";
    public static final String FEATURE_LINKBACK_PREFETCH = "link_back_prefetch";
    public static final String FEATURE_LINK_BACK = "opt_linkback2";
    public static final String FEATURE_LOCAL_URL = "local_url";
    public static final String FEATURE_OPT_LOADING = "opt_loading";
    public static final String FEATURE_OPT_UT = "opt_ut_launch";
    public static final String FEATURE_OTHER_SCENE_PREFETCH_MTOP = "other_scene_prefetch_mtop2";
    public static final String FEATURE_PRECREATE_DWINSTANCE = "precreate_dwinstance";
    public static final String FEATURE_PRERENDER_VIDEO_HOT_LAUNCHER = "prerender_video_hot_launcher";
    public static final String FEATURE_QUICK_RENDER = "quick_render";
    public static final String FEATURE_SIMPLE_DSL = "simple_dsl3";
    public static final String FEATURE_SKIP_VIDEO_MTOP_SIGN = "feature_skip_mtop_sign";
    public static final String FEATURE_USE_LOCAL_VIDEO_PLAY = "use_local_video_play";
    public static final String FEATURE_VIDEO_IN_CONTAINER_WATCH_LIFECYCLE = "video_in_container_watch_lifecycle";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f20262a;
    private static boolean b;
    private static boolean c;
    private static String g;
    private static boolean h;
    public boolean d = false;
    public boolean e = true;
    public m.b f;

    public abstract void a(Context context, TNodeView tNodeView, Object obj, m.b bVar);

    public abstract void a(Context context, aa aaVar, String str, String str2, Map map);

    public abstract void a(Context context, Object obj);

    public abstract void a(Context context, Object obj, Object obj2, m.b bVar);

    public abstract void a(aa aaVar);

    public abstract void b(Context context, Object obj);

    static {
        kge.a(1843332341);
        f20262a = false;
        b = false;
        c = false;
        g = null;
        h = false;
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        f20262a = true;
        g = str;
        b = z;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : f20262a && TextUtils.equals(str, g);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : f20262a;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            c = true;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : c && TextUtils.equals(str, g);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : h;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : b;
    }

    public i(m.b bVar) {
        this.f = bVar;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean a(TNodeView tNodeView) {
        aa A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29395e09", new Object[]{this, tNodeView})).booleanValue();
        }
        if (tNodeView == null || tNodeView.getEngine() == null || (A = tNodeView.getEngine().A()) == null) {
            return false;
        }
        Object e = A.e("onbackclick");
        return (e instanceof String) && !TextUtils.isEmpty((CharSequence) e);
    }

    private static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d49adbef", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            try {
                boolean a2 = guc.a(context, "disable_" + str);
                ogg.b("disableFeature " + str + " " + a2);
                return !a2;
            } catch (Throwable unused) {
                return true;
            }
        }
        try {
            boolean a3 = guc.a(context, "enable_" + str);
            ogg.b("enableFeature " + str + " " + a3);
            return a3;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{context, str, new Boolean(z)})).booleanValue() : z ? oeb.a(str, true) && b(context, str, z) : oeb.a(str, false) || b(context, str, z);
    }
}
