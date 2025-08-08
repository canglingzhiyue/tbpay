package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jvw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PAGE_METRIC_BASELINE_SPAN = "wxMtrcTaskBaselineSpan";
    public static final String KEY_PAGE_METRIC_CSS_PARSE_TIME = "wxMtrcCSSParseTime";
    public static final String KEY_PAGE_METRIC_CSS_TEXT_SIZE = "wxMtrcCSSTextSize";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK0 = "wxMtrcDOMBatchTask0";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK1 = "wxMtrcDOMBatchTask1";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK2 = "wxMtrcDOMBatchTask2";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK3 = "wxMtrcDOMBatchTask3";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK4 = "wxMtrcDOMBatchTask4";
    public static final String KEY_PAGE_METRIC_DOM_FLUSH_TIME = "wxMtrcDOMFlushTime";
    public static final String KEY_PAGE_METRIC_JS_MEM_AVG = "wxMtrcJSMemAvg";
    public static final String KEY_PAGE_METRIC_JS_MEM_MAX = "wxMtrcJSMemMax";
    public static final String KEY_PAGE_METRIC_JS_MEM_ROOT_VIEW_FIRST_ADDED = "wxMtrcJSMemRootViewFirstAdded";
    public static final String KEY_PAGE_METRIC_MAIN_SCRIPT_TIME = "wxMtrcMainScriptTime";
    public static final String KEY_PAGE_METRIC_NODE_COUNT_AVG = "wxMtrcNodeAvg";
    public static final String KEY_PAGE_METRIC_NODE_COUNT_MAX = "wxMtrcNodeMax";
    public static final String KEY_PAGE_METRIC_RENDER_MEM_AVG = "wxMtrcRenderMemAvg";
    public static final String KEY_PAGE_METRIC_RENDER_MEM_MAX = "wxMtrcRenderMemMax";
    public static final String KEY_PAGE_METRIC_SDK_INIT_TIME = "wxMtrcSDKInitTime";
    public static final String KEY_PAGE_METRIC_TASK_ALL_TASK_COUNT = "wxMtrcTaskAllCount";
    public static final String KEY_PAGE_METRIC_TASK_ALL_TIME = "wxMtrcTaskAllTime";
    public static final String KEY_PAGE_METRIC_TASK_BG_TASK_COUNT = "wxMtrcTaskBgCount";
    public static final String KEY_PAGE_METRIC_TASK_BG_TASK_TIME = "wxMtrcTaskBgTime";
    public static final String KEY_PAGE_METRIC_TASK_BUSY_RATIO = "wxMtrcTaskBusyRatio";
    public static final String KEY_PAGE_METRIC_TASK_T0_AVG = "wxMtrcTaskT0avg";
    public static final String KEY_PAGE_METRIC_TASK_T0_COUNT = "wxMtrcTaskT0count";
    public static final String KEY_PAGE_METRIC_TASK_T1_AVG = "wxMtrcTaskT1avg";
    public static final String KEY_PAGE_METRIC_TASK_T1_COUNT = "wxMtrcTaskT1count";
    public static final String KEY_PAGE_METRIC_TASK_T2_AVG = "wxMtrcTaskT2avg";
    public static final String KEY_PAGE_METRIC_TASK_T2_COUNT = "wxMtrcTaskT2count";
    public static final String KEY_PAGE_METRIC_TASK_T3_AVG = "wxMtrcTaskT3avg";
    public static final String KEY_PAGE_METRIC_TASK_T3_COUNT = "wxMtrcTaskT3count";
    public static final String KEY_PAGE_PROPERTIES_AB_TEST_INFO = "wxABTestInfo";
    public static final String KEY_PAGE_PROPERTIES_BIZ_ID = "wxBizID";
    public static final String KEY_PAGE_PROPERTIES_BUBDLE_URL = "wxBundleUrl";
    public static final String KEY_PAGE_PROPERTIES_BYTECODE_VERSION = "wxBytecodeVersion";
    public static final String KEY_PAGE_PROPERTIES_CONTAINER_NAME = "wxContainerName";
    public static final String KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER = "wxInstancePreRender";
    public static final String KEY_PAGE_PROPERTIES_INSTANCE_TYPE = "wxInstanceType";
    public static final String KEY_PAGE_PROPERTIES_JS_BUNDLE_VERSION = "wxJSBundleVersion";
    public static final String KEY_PAGE_PROPERTIES_RENDER_TYPE = "wxRenderType";
    public static final String KEY_PAGE_PROPERTIES_REQUEST_TYPE = "wxRequestType";
    public static final String KEY_PAGE_PROPERTIES_START_UP_DISTANCE = "wxStartUpDistance";
    public static final String KEY_PAGE_PROPERTIES_ZCACHE_INFO = "wxZCacheInfo";
    public static final String KEY_PAGE_STAGES_AREA_COVERAGE = "wxUnicornAreaCoverage";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_END = "wxCreateInstanceEnd";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_START = "wxCreateInstanceStart";
    public static final String KEY_PAGE_STAGES_CUSTOM_START_TIME = "wxCustomStart";
    public static final String KEY_PAGE_STAGES_DESTROY = "wxDestroy";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_END = "wxEndDownLoadBundle";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_START = "wxStartDownLoadBundle";
    public static final String KEY_PAGE_STAGES_END_EXECUTE_BUNDLE = "wxEndExecuteBundle";
    public static final String KEY_PAGE_STAGES_INTERACTION = "wxInteraction";
    public static final String KEY_PAGE_STAGES_INTERACTION_OPT = "wxInteractionOpt";
    public static final String KEY_PAGE_STAGES_INTERACTION_SCREEN_RATIO = "wxInteractionScreenRatio";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_END = "wxEndLoadBundle";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_START = "wxStartLoadBundle";
    public static final String KEY_PAGE_STAGES_NAV_START = "wxNavigationStart";
    public static final String KEY_PAGE_STAGES_RASTER_INTERACTION = "wxInteractionRaster";
    public static final String KEY_PAGE_STAGES_RASTER_INTERACTION_OPT = "wxInteractionRasterOpt";
    public static final String KEY_PAGE_STAGES_RASTER_INTERACTION_SCREEN_RATIO = "wxInteractionRasterScreenRatio";
    public static final String KEY_PAGE_STAGES_RENDER_END = "wxRenderEnd";
    public static final String KEY_PAGE_STAGES_RENDER_ORGIGIN = "wxRenderTimeOrigin";
    public static final String KEY_PAGE_STAGES_RENDER_START = "wxRenderStart";
    public static final String KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT = "wxSamePixelMaxCount";
    public static final String KEY_PAGE_STAGES_STANDARD_CONTAINER_START = "wxContainerStart";
    public static final String KEY_PAGE_STAGES_STANDARD_NAVIGATION_START = "NavigationStart";
    public static final String KEY_PAGE_STAGES_STANDARD_NAV_START = "NavStart";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_END = "wxUnicornEngineInitEnd";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_START = "wxUnicornEngineInitStart";
    public static final String KEY_PROPERTIES_ERROR_CODE = "wxErrorCode";
    public static final String VALUE_ERROR_CODE_DEFAULT = "0";
    public static final String WEEX_PAGE_TOPIC = "weex_page";
    private static final String[] d;
    private static final String[] e;
    public String c;
    private String f;
    private jvu g;
    public final Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f29821a = new ConcurrentHashMap();

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        }
    }

    static {
        kge.a(2080386744);
        d = new String[]{KEY_PAGE_STAGES_STANDARD_NAV_START, KEY_PAGE_STAGES_STANDARD_CONTAINER_START, KEY_PAGE_STAGES_NAV_START, KEY_PAGE_STAGES_STANDARD_NAVIGATION_START, "wxStartDownLoadBundle", "wxEndDownLoadBundle", "wxRenderTimeOrigin", "wxStartLoadBundle", "wxEndLoadBundle", "wxInteraction", KEY_PAGE_STAGES_INTERACTION_OPT, KEY_PAGE_STAGES_INTERACTION_SCREEN_RATIO, KEY_PAGE_STAGES_RASTER_INTERACTION, KEY_PAGE_STAGES_RASTER_INTERACTION_OPT, KEY_PAGE_STAGES_RASTER_INTERACTION_SCREEN_RATIO, "wxDestroy", "wxEndExecuteBundle", "wxCreateInstanceStart", "wxCreateInstanceEnd", "wxUnicornEngineInitStart", "wxUnicornEngineInitEnd", KEY_PAGE_STAGES_AREA_COVERAGE, KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT, KEY_PAGE_STAGES_RENDER_START, KEY_PAGE_STAGES_RENDER_END, KEY_PAGE_METRIC_BASELINE_SPAN, KEY_PAGE_METRIC_TASK_T0_COUNT, KEY_PAGE_METRIC_TASK_T1_COUNT, KEY_PAGE_METRIC_TASK_T2_COUNT, KEY_PAGE_METRIC_TASK_T3_COUNT, KEY_PAGE_METRIC_TASK_T0_AVG, KEY_PAGE_METRIC_TASK_T1_AVG, KEY_PAGE_METRIC_TASK_T2_AVG, KEY_PAGE_METRIC_TASK_T3_AVG, KEY_PAGE_METRIC_TASK_BG_TASK_COUNT, KEY_PAGE_METRIC_TASK_BG_TASK_TIME, KEY_PAGE_METRIC_TASK_ALL_TIME, KEY_PAGE_METRIC_TASK_ALL_TASK_COUNT, KEY_PAGE_METRIC_TASK_BUSY_RATIO, KEY_PAGE_METRIC_JS_MEM_AVG, KEY_PAGE_METRIC_JS_MEM_MAX, KEY_PAGE_METRIC_JS_MEM_ROOT_VIEW_FIRST_ADDED, KEY_PAGE_METRIC_NODE_COUNT_AVG, KEY_PAGE_METRIC_NODE_COUNT_MAX, KEY_PAGE_METRIC_RENDER_MEM_AVG, KEY_PAGE_METRIC_RENDER_MEM_MAX, KEY_PAGE_METRIC_CSS_TEXT_SIZE, KEY_PAGE_METRIC_CSS_PARSE_TIME, KEY_PAGE_METRIC_DOM_FLUSH_TIME, KEY_PAGE_METRIC_MAIN_SCRIPT_TIME, KEY_PAGE_METRIC_DOM_BATCH_TASK0, KEY_PAGE_METRIC_DOM_BATCH_TASK1, KEY_PAGE_METRIC_DOM_BATCH_TASK2, KEY_PAGE_METRIC_DOM_BATCH_TASK3, KEY_PAGE_METRIC_DOM_BATCH_TASK4};
        e = new String[]{"wxErrorCode", "wxBizID", "wxBundleUrl", "wxContainerName", "wxInstanceType", "wxRenderType", "wxRequestType", KEY_PAGE_PROPERTIES_BYTECODE_VERSION, KEY_PAGE_PROPERTIES_JS_BUNDLE_VERSION, KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER, "wxZCacheInfo", KEY_PAGE_PROPERTIES_AB_TEST_INFO, KEY_PAGE_PROPERTIES_START_UP_DISTANCE};
    }

    public jvw(String str, jvt jvtVar) {
        this.f = str;
        if (jvtVar != null) {
            this.g = jvtVar.a("weex_page");
            jvu jvuVar = this.g;
            if (jvuVar == null) {
                return;
            }
            jvuVar.a(this.f);
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String[] strArr = d;
        return (i < 0 || i >= strArr.length) ? FactoryType.TYPE_INVALID : strArr[i];
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        String[] strArr = e;
        return (i < 0 || i >= strArr.length) ? FactoryType.TYPE_INVALID : strArr[i];
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar != null) {
            str = jvuVar.b(str);
        }
        this.c = str;
        this.c = StringUtils.isEmpty(this.c) ? "emptyPageName" : this.c;
        a("wxBizID", this.c);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a(str, str2);
        this.g.a(Integer.parseInt(this.f), str, str2);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a(str, j);
    }

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a(str, j);
        this.g.a(Integer.parseInt(this.f), str, j);
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a(str, map);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a();
    }

    public void a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{this, new Integer(i), str, new Long(j)});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a(i, str, j);
    }

    public void a(int i, View view, jvv jvvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d25fdd", new Object[]{this, new Integer(i), view, jvvVar});
            return;
        }
        jvu jvuVar = this.g;
        if (jvuVar == null) {
            return;
        }
        jvuVar.a(i, view, jvvVar);
    }

    public jvu b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvu) ipChange.ipc$dispatch("16b842f4", new Object[]{this}) : this.g;
    }
}
