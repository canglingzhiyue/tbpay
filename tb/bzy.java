package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class bzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE = "PopLayer";
    public static final String POINT_ACCS = "accsLaunch";
    public static final String POINT_COLD_LAUNCH_REOPEN = "ColdLaunchReopen";
    public static final String POINT_CONFIG_FAIL = "ConfigCheckFail";
    public static final String POINT_CONFIG_PARSE_TIME = "ConfigParseTime";
    public static final String POINT_CONFIG_START = "ConfigCheckStart";
    public static final String POINT_JUMPLOSE = "JumpLose";
    public static final String POINT_ONE_POP = "OnePop";
    public static final String POINT_POP_DISPLAY = "PopDisplay";
    public static final String POINT_POP_ERROR = "PopError";
    public static final String POINT_POP_PROCESS = "PopProcess";
    public static final String POINT_TEMPLATE_CACHE = "TemplateCache";
    public static final String POINT_WEBVIEW_LOAD = "webviewLoadTime";
    public static final String POINT_WEEX_RENDER = "weexRenderTime";

    /* renamed from: a  reason: collision with root package name */
    private List<cad> f26215a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static bzy f26216a;

        static {
            kge.a(-832997355);
            f26216a = new bzy();
        }

        public static /* synthetic */ bzy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bzy) ipChange.ipc$dispatch("f030a1d", new Object[0]) : f26216a;
        }
    }

    static {
        kge.a(897356610);
    }

    public static bzy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bzy) ipChange.ipc$dispatch("f030a1d", new Object[0]) : a.a();
    }

    public void a(cad cadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30a1152", new Object[]{this, cadVar});
            return;
        }
        if (this.f26215a == null) {
            this.f26215a = new ArrayList();
        }
        if (!this.f26215a.contains(cadVar)) {
            this.f26215a.add(cadVar);
        }
        c.a("AppMonitorManager.registerAppMonitorAdapter.", new Object[0]);
    }

    public void a(String str, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{this, str, map, map2});
            return;
        }
        try {
            if (this.f26215a != null && !TextUtils.isEmpty(str)) {
                for (cad cadVar : this.f26215a) {
                    if (cadVar != null) {
                        cadVar.a(str, map, map2);
                    }
                }
            }
        } catch (Throwable th) {
            c.a("AppMonitorManager.stat.error.", th);
        }
    }
}
