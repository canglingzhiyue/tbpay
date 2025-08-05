package com.taobao.android.weex_framework;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.a;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.jyx;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSAppMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIMUISE_SDK_VERSION = "alimuise_sdk_version";
    public static final String BUNDLE_URL = "bundle_url";
    public static final String BYTECODE = "bytecode";
    public static final String ERROR_MSG = "error_msg";
    public static final String LOG_TAG = "[Monitor]";
    public static final String MODULE = "MUSAppMonitor";
    public static final String MUISE_SDK_VERSION = "muise_sdk_version";
    public static final String PAGE_NAME = "page_name";
    public static final String SCRIPT_URL = "script_url";
    public static final String SVERSION = "sversion";
    public static final String T_ITEM_TYPE = "t_item_type";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface AvailErrorCodeType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface DownloadErrorCodeType {
    }

    static {
        kge.a(1104380360);
    }

    public static void a(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e99de3", new Object[]{rVar});
        } else if (rVar != null && rVar.c()) {
        } else {
            String jSONObject = (rVar == null ? new JSONObject() : rVar.o()).toString();
            if (a.a()) {
                return;
            }
            try {
                AppMonitor.Alarm.commitSuccess("MUSAppMonitor", "download", jSONObject);
            } catch (Throwable unused) {
                com.taobao.android.weex_framework.util.g.f(LOG_TAG, "AppMonitor not found");
            }
        }
    }

    public static void b(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194ed302", new Object[]{rVar});
        } else if (rVar != null && rVar.c()) {
        } else {
            String jSONObject = (rVar == null ? new JSONObject() : rVar.o()).toString();
            if (a.a()) {
                return;
            }
            try {
                AppMonitor.Alarm.commitSuccess("MUSAppMonitor", jyx.a.POINT_NAME, jSONObject);
            } catch (Throwable unused) {
                com.taobao.android.weex_framework.util.g.f(LOG_TAG, "AppMonitor not found");
            }
        }
    }

    public static void a(r rVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287634ed", new Object[]{rVar, str});
        } else {
            g(rVar, "1000", str);
        }
    }

    public static void a(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc52dd77", new Object[]{rVar, str, str2});
            return;
        }
        g(rVar, "1004", "downgrade to: " + str + ", reason: " + str2);
    }

    public static void c(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b40821", new Object[]{rVar});
        } else {
            g(rVar, "1009", "downgrade to h5");
        }
    }

    public static void d(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756d254", new Object[]{rVar, str, str2});
        } else {
            g(rVar, "1005", String.format("code: %s, error: %s", str, str2));
        }
    }

    public static void e(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205823f3", new Object[]{rVar, str, str2});
        } else {
            g(rVar, "1006", String.format("code: %s, error: %s", str, str2));
        }
    }

    public static void f(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39597592", new Object[]{rVar, str, str2});
        } else {
            g(rVar, com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_INVALIDATE_END_TIME_CODE, String.format("code: %s, error: %s", str, str2));
        }
    }

    public static void g(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525ac731", new Object[]{rVar, str, str2});
        } else if (rVar != null && rVar.c()) {
        } else {
            JSONObject jSONObject = rVar == null ? new JSONObject() : rVar.o();
            if (MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn != rVar.a()) {
                z = false;
            }
            a(jSONObject, str, str2, z);
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d139b8", new Object[]{jSONObject, str, str2, new Boolean(z)});
            return;
        }
        if (str2.length() > 1024) {
            str2 = str2.substring(0, 1024);
        }
        jSONObject.put(ERROR_MSG, (Object) str2);
        if (a.a()) {
            return;
        }
        try {
            AppMonitor.Alarm.commitFail("MUSAppMonitor", "available_error", jSONObject.toString(), str, "");
        } catch (Throwable unused) {
            com.taobao.android.weex_framework.util.g.f(LOG_TAG, "AppMonitor not found");
        }
    }

    public static void h(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5c18d0", new Object[]{rVar, str, str2});
        } else if (rVar != null && rVar.c()) {
        } else {
            JSONObject jSONObject = rVar == null ? new JSONObject() : rVar.o();
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            jSONObject.put(ERROR_MSG, (Object) str2);
            if (a.a()) {
                return;
            }
            try {
                AppMonitor.Alarm.commitFail("MUSAppMonitor", "download_error", jSONObject.toString(), str, "");
            } catch (Throwable unused) {
                com.taobao.android.weex_framework.util.g.f(LOG_TAG, "AppMonitor not found");
            }
        }
    }

    public static void a(r rVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4a9541", new Object[]{rVar, new Long(j)});
        } else if (rVar == null) {
        } else {
            MUSMonitor.a(rVar, j);
        }
    }

    public static void d(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28193d40", new Object[]{rVar});
        } else if (rVar == null || rVar.c() || a.a()) {
        } else {
            JSONObject o = rVar.o();
            String n = rVar.n();
            if (TextUtils.isEmpty(n)) {
                n = "No activity info";
            }
            o.put(ERROR_MSG, (Object) n);
            try {
                AppMonitor.Alarm.commitFail("MUSAppMonitor", "monitor_error", o.toString(), n, "");
            } catch (Throwable unused) {
                com.taobao.android.weex_framework.util.g.f(LOG_TAG, "AppMonitor not found");
            }
        }
    }
}
