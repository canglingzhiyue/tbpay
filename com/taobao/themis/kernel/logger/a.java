package com.taobao.themis.kernel.logger;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AFTER_EXECUTE = "AFTER_EXECUTE";
    public static final String EVENT_BEFORE_EXECUTE = "BEFORE_EXECUTE";
    public static final String EVENT_CLOSE = "close";
    public static final String EVENT_DOWNLOAD_FINISH = "DOWNLOAD_FINISH";
    public static final String EVENT_DOWNLOAD_START = "DOWNLOAD_START";
    public static final String EVENT_LIFECYCLE = "LIFECYCLE";
    public static final String EVENT_MEGA_CALLBACK = "ON_MEGA_CALLBACK";
    public static final String EVENT_ON_CALLBACK = "ON_CALLBACK";
    public static final String EVENT_ON_CLOSE = "ON_CLOSE";
    public static final String EVENT_ON_COMMIT_LAUNCH_MONITOR = "ON_COMMIT_LAUNCH";
    public static final String EVENT_ON_COMMIT_UT_MONITOR = "ON_COMMIT_UT";
    public static final String EVENT_ON_CONTINUE = "ON_CONTINUE";
    public static final String EVENT_ON_ERROR = "ON_ERROR";
    public static final String EVENT_ON_EXECUTE = "ON_EXECUTE";
    public static final String EVENT_ON_FINISH = "ON_FINISH";
    public static final String EVENT_ON_INIT = "ON_INIT";
    public static final String EVENT_ON_INTERRUPT = "ON_INTERRUPT";
    public static final String EVENT_ON_INVOKE = "ON_INVOKE";
    public static final String EVENT_ON_START = "ON_START";
    public static final String EVENT_ON_SUCCESS = "ON_SUCCESS";
    public static final String EVENT_OPEN = "open";
    public static final String EVENT_PAGE_INIT = "ON_PAGE_INIT";
    public static final String EVENT_PAGE_ON_DESTROY = "ON_PAGE_DESTROY";
    public static final String EVENT_PAGE_ON_PAUSE = "ON_PAGE_PAUSE";
    public static final String EVENT_PAGE_ON_RESUME = "ON_PAGE_RESUME";
    public static final String EVENT_PAGE_ON_START = "ON_PAGE_START";
    public static final String EVENT_PAGE_ON_STOP = "ON_PAGE_STOP";
    public static final String EVENT_PAGE_ON_VIEW_APPEAR = "ON_VIEW_APPEAR";
    public static final String EVENT_PAGE_ON_VIEW_DISAPPEAR = "ON_VIEW_DISAPPEAR";
    public static final String EVENT_PAGE_REGISTER_EXTENSION = "ON_PAGE_EXTENSION_REGISTER";
    public static final String EVENT_PAGE_RENDER_ERROR = "ON_PAGE_RENDER_ERROR";
    public static final String EVENT_PAGE_RENDER_READY = "ON_PAGE_RENDER_READY";
    public static final String EVENT_PAGE_RENDER_SUCCESS = "ON_PAGE_RENDER_SUCCESS";
    public static final String EVENT_REGISTER = "REGISTER";
    public static final String EVENT_REQUEST = "REQUEST";
    public static final String EVENT_RESPONSE = "RESPONSE";
    public static final String EVENT_UNREGISTER = "UNREGISTER";
    public static final String EVENT_VIEW_CREATE = "ON_VIEW_CREATE";
    public static final String EVEN_ON_NEVENT_CANCEL = "ON_NEVENT_CANCEL";
    public static final String EVEN_ON_NEVENT_FIRE = "ON_NEVENT_FIRE";
    public static final String EVEN_ON_NEVENT_INTERRUPT = "ON_NEVENT_INTERRUPT";
    public static final String EVEN_ON_NEVENT_REGISTER = "ON_NEVENT_REGISTER";
    public static final String GLOBAL_EVENT_ROOT_ID = "TMS_Global";
    public static final a INSTANCE;
    public static final String MODULE_EMBED = "Themis/Embed";
    public static final String MODULE_GLOBAL = "Themis/Global";
    public static final String MODULE_GLOBAL_CONTAINER = "Themis/Global/AppContainer";
    public static final String MODULE_GLOBAL_HANDLER = "Themis/Global/Handler";
    public static final String MODULE_GLOBAL_WIDGET_ENGINE = "Themis/Global/WidgetEngine";
    public static final String MODULE_INSTANCE = "Themis/Instance";
    public static final String MODULE_JSBRIDGE = "Themis/JSBridge";
    public static final String MODULE_LAUNCH = "Themis/Launch";
    public static final String MODULE_LAUNCH_APPINFO = "Themis/AppInfo";
    public static final String MODULE_LAUNCH_PACKAGE = "Themis/Package";
    public static final String MODULE_LAUNCH_PAGE = "Themis/Page";
    public static final String MODULE_LAUNCH_PUB = "Themis/Launch/Pub";
    public static final String MODULE_MEGA = "Themis/Mega";
    public static final String MODULE_MONITOR = "Themis/Monitor";
    public static final String MODULE_NATIVE_EVENT = "Themis/JSBridge/NativeEvent";

    /* renamed from: a  reason: collision with root package name */
    private static int f22541a;

    static {
        kge.a(1873047501);
        INSTANCE = new a();
        a(MODULE_GLOBAL, EVENT_ON_INIT, null, GLOBAL_EVENT_ROOT_ID, new JSONObject());
    }

    private a() {
    }

    @JvmStatic
    public static final void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05860", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        IRemoteLoggerAdapter iRemoteLoggerAdapter = (IRemoteLoggerAdapter) qpt.b(IRemoteLoggerAdapter.class);
        if (iRemoteLoggerAdapter == null) {
            return;
        }
        iRemoteLoggerAdapter.i(str, str2, str4, str3, jSONObject);
    }

    @JvmStatic
    public static final void b(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4b6dff", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        IRemoteLoggerAdapter iRemoteLoggerAdapter = (IRemoteLoggerAdapter) qpt.b(IRemoteLoggerAdapter.class);
        if (iRemoteLoggerAdapter == null) {
            return;
        }
        iRemoteLoggerAdapter.d(str, str2, str4, str3, jSONObject);
    }

    @JvmStatic
    public static final void c(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc6839e", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        IRemoteLoggerAdapter iRemoteLoggerAdapter = (IRemoteLoggerAdapter) qpt.b(IRemoteLoggerAdapter.class);
        if (iRemoteLoggerAdapter == null) {
            return;
        }
        iRemoteLoggerAdapter.e(str, str2, str4, str3, jSONObject);
    }

    @JvmStatic
    public static final String a(String baseTraceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{baseTraceId});
        }
        q.d(baseTraceId, "baseTraceId");
        StringBuilder sb = new StringBuilder();
        sb.append(baseTraceId);
        sb.append("_");
        int i = f22541a;
        f22541a = i + 1;
        sb.append(i);
        return sb.toString();
    }
}
