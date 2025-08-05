package tb;

import com.alibaba.android.ultron.event.base.e;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes2.dex */
public class bpk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_DX_BIND_DATA_FAIL = "F_ULTRON_DX_10003";
    public static final String ERROR_DX_DOWNGRADE = "F_ULTRON_DX_10004";
    public static final String ERROR_DX_DOWNLOAD_FAIL = "F_ULTRON_DX_10001";
    public static final String ERROR_DX_RENDER_FAIL = "F_ULTRON_DX_10002";
    public static final String ERROR_DX_VERSION_EXCEPTION = "F_ULTRON_DX_VERSION_11000";
    public static final String ERROR_ENGINE_EXCEPTION = "F_ULTRON_ENGINE_EXCEPTION_10020";
    public static final String ERROR_ENGINE_INIT = "F_ULTRON_ENGINE_10006";
    public static final String ERROR_ENGINE_JS_ENGINE = "F_ULTRON_ENGINE_10004";
    public static final String ERROR_ENGINE_JS_ENGINE_JSI = "F_ULTRON_ENGINE_10004_JSI";
    public static final String ERROR_ENGINE_JS_EXCEPTION = "F_ULTRON_ENGINE_10003";
    public static final String ERROR_ENGINE_JS_EXCEPTION_JSI = "F_ULTRON_ENGINE_10003_JSI";
    public static final String ERROR_ENGINE_JS_FILE_ERROR_JSI = "F_ULTRON_ENGINE_10006_JSI";
    public static final String ERROR_ENGINE_JS_INIT = "F_ULTRON_ENGINE_10002";
    public static final String ERROR_ENGINE_JS_INIT_DUOKAI_JSI = "F_ULTRON_ENGINE_10007_JSI";
    public static final String ERROR_ENGINE_JS_INIT_JSI = "F_ULTRON_ENGINE_10002_JSI";
    public static final String ERROR_ENGINE_JS_TIMEOUT = "F_ULTRON_ENGINE_10005";
    public static final String ERROR_ENGINE_JS_TIMEOUT_JSI = "F_ULTRON_ENGINE_10005_JSI";
    public static final String ERROR_ENGINE_TEMPLATE_RENDER = "F_ULTRON_ENGINE_10001";
    public static final String ERROR_EVENT_NOT_FOUND = "F_ULTRON_EVENT_10001";
    public static final String FEATURE_TYPE_ENGINE = "error_ultorn_engine";
    public static final String FEATURE_TYPE_EVENT = "error_event";
    public static final String FEATURE_TYPE_PRESET = "error_preset";
    public static final String FEATURE_TYPE_RENDER = "error_render";

    static {
        kge.a(-668758843);
    }

    public static void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{eVar});
        }
    }
}
