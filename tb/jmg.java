package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;

/* loaded from: classes6.dex */
public class jmg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_KEY_ACTIVITIES = "idleActivities";
    public static final String CONFIG_KEY_CONFIG = "tschedule_config";
    public static final String CONFIG_KEY_DELAY_PRERENDER = "is_delay_prerender_on";
    public static final String CONFIG_KEY_FRAGMENTS = "idleFragments";
    public static final String CONFIG_KEY_INJECT_JS = "injectJs";
    public static final String CONFIG_KEY_MULTI_PROCESS_PROTOCOL_H5 = "multi_process_h5";
    public static final String CONFIG_KEY_MULTI_PROCESS_PROTOCOL_MINIAPP = "multi_process_mini";
    public static final String CONFIG_KEY_RENDER_PROTOCOL_H5 = "render_h5";
    public static final String CONFIG_KEY_RENDER_PROTOCOL_MINIAPP = "render_mini";
    public static final String CONFIG_KEY_RENDER_PROTOCOL_PHA = "render_pha";
    public static final String CONFIG_KEY_RENDER_VERSION = "render_version";
    public static final String CONFIG_KEY_SAMPLE_RATIO = "sample_ratio";
    public static final String CONFIG_KEY_SMOOTH_DURATION = "smooth_duration";
    public static final String CONFIG_KEY_TRIGGER_CUSTOM_WHITE_LIST = "trigger_custom_whitelist";
    public static final String CONFIG_KEY_TRIGGER_IDLE_WHITE_LIST = "trigger_idle_whitelist";
    public static final String CONFIG_KEY_TRIGGER_NAV_BLACK_LIST = "trigger_nav_blacklist";
    public static final String DEFER_INIT_PREFETCH_CONFIG = "tsche_init_defer";
    public static final String SP_FILE_NAME = "tschedule";
    public static final String SWITCH_KEY_ENABLE_CONFIG_TRIGGER = "config_trigger_enable";
    public static final String SWITCH_KEY_ENABLE_FOREACH_INTENT = "foreach_intent_enable";
    public static final String SWITCH_KEY_ENABLE_NAV = "nav_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_CUSTOM = "custom_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_DINAMIC2 = "dinamic2_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_DINAMIC3 = "dinamic3_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_HTTP = "http_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_MTOP = "mtop_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_PHENIX = "phenix_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_RENDER = "webview_task_enable";
    public static final String TIME_CONTENT_FIX = "timeContentFix";
    public static final String TS_ENABLE = "tsEnable";
    public static final String TS_MEMORY_THRESHOLD = "tsMemoryThreshold";
    public static final String TS_PREDICT_ENABLE = "tsPredict";
    public static final String TS_RENDER_BY_EDITION = "render_by_edition_enable";
    public static final String TS_RENDER_HIT_ENABLE = "tsRender";

    static {
        kge.a(1902536083);
    }

    public static synchronized SharedPreferences a(String str) {
        synchronized (jmg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            try {
                return e.b().getSharedPreferences(str, 0);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        SharedPreferences a2 = a(str);
        if (a2 == null) {
            return str3;
        }
        try {
            return a2.getString(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        SharedPreferences a2 = a(str);
        if (a2 == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str2, str3);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r1.commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r1.commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        tb.jmf.a("resetValues", new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jmg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "20476513"
            r0.ipc$dispatch(r4, r1)
            return
        L15:
            java.lang.String r0 = "resetValues"
            tb.jmf.a(r0)
            android.content.SharedPreferences r4 = a(r4)
            if (r4 != 0) goto L21
            return
        L21:
            r1 = 0
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch: java.lang.Throwable -> L66
            r1.clear()     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L59
            boolean r4 = r5.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L32
            goto L59
        L32:
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L66
        L3a:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L66
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r5.getKey()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L66
            r1.putString(r3, r5)     // Catch: java.lang.Throwable -> L66
            goto L3a
        L56:
            if (r1 == 0) goto L6b
            goto L68
        L59:
            if (r1 == 0) goto L5e
            r1.commit()
        L5e:
            return
        L5f:
            r4 = move-exception
            if (r1 == 0) goto L65
            r1.commit()
        L65:
            throw r4
        L66:
            if (r1 == 0) goto L6b
        L68:
            r1.commit()
        L6b:
            java.lang.String[] r4 = new java.lang.String[r2]
            tb.jmf.a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jmg.a(java.lang.String, java.util.Map):void");
    }
}
