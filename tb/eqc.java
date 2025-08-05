package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class eqc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAGE_EVENT_ID = 65172;
    public static final String PAGE_NAME = "Page_Detail";
    public static final String TAG_API_REQUEST = "mReq";
    public static final String TAG_CREATE_DETAIL_MODEL = "mCreateDetailModel";
    public static final String TAG_CREATE_DINAMIC = "mCreateDinamic";
    public static final String TAG_CREATE_LAYOUT_MODEL = "mCreateLayoutModel";
    public static final String TAG_CREATE_MAIN = "mLoad";
    public static final String TAG_CREATE_PROTOCOL_MAP = "mCreateProtocolMap";
    public static final String TAG_CREATE_VIEW_MODEL = "mCreateViewModel";
    public static final String TAG_CREAT_VIEW = "mCreatView";
    public static final String TAG_DESC_LOAD = "desc_load";
    public static final String TAG_DETAIL_CONTAINER_STRUCTURE = "mMakeContainerStructure";
    public static final String TAG_DETAIL_STRUCTURE = "mParseDetailStructure";
    public static final String TAG_FETCH_TEMPLATE = "mFetchTemplate";
    public static final String TAG_GET_ULTRON = "mGetUltron";
    public static final String TAG_INIT = "mInit";
    public static final String TAG_LIFECYCLE = "mLifeCycle";
    public static final String TAG_LOAD = "load";
    public static final String TAG_MTOP = "mMtop";
    public static final String TAG_ONCREAT = "onCreat";
    public static final String TAG_ONRESUME = "onResume";
    public static final String TAG_ONSTART = "onStart";
    public static final String TAG_PARSE_DETAIL_DATA = "mParseDetailData";
    public static final String TAG_PROCESS_DATA = "mProcessData";
    public static final String TAG_SDK_INIT = "mSDKInit";
    public static final String TAG_TEMPLATE_ARRIVED_PHASE = "mTemplateArrivedPhase";
    public static final String TAG_TEMPLATE_FROM_FILE = "mTemplateFromFile";
    public static final String TAG_TEMPLATE_FROM_MEM = "mTemplateFromMem";
    public static final String TAG_TEMPLATE_FROM_NETWORK = "mTemplateFromNetwork";
    public static final String TAG_TEMPLATE_PARSE_JSON = "mTemplateParseJSON";
    public static final String TAG_THREAD_SWITCH = "mThreadSwitch";
    public static final String TAG_ULTRON_PARSE = "mParseUltron";
    public static final String TAG_ULTRON_STRUCTURE = "mUltronStructure";
    public static final String TAG_UPDATE_MAIN = "mUpdate";

    static {
        kge.a(-1061416833);
        emu.a("com.taobao.android.detail.datasdk.utils.SDKPerfMonitor");
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            epc.a(context, 65172, "Page_Detail", str, str2);
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            epc.a(context, 65172, "Page_Detail", str, "");
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else {
            epc.a(context, 65172, "Page_Detail", str);
        }
    }

    public static void a(Context context, String str, long j, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32965f74", new Object[]{context, str, new Long(j), new Long(j2), str2});
        } else {
            epc.a(context, 65172, "Page_Detail", str, j, j2, str2);
        }
    }

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context}) : epc.b(context, 65172, "Page_Detail");
    }

    public static void a(Context context, HashMap<String, jko> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
            return;
        }
        jko jkoVar = null;
        long j = 0;
        for (jko jkoVar2 : hashMap.values()) {
            long j2 = jkoVar2.e + jkoVar2.f + jkoVar2.g + jkoVar2.h;
            if (j2 > j) {
                jkoVar = jkoVar2;
                j = j2;
            }
        }
        if (jkoVar == null) {
            return;
        }
        epc.a(context, 65172, "Page_Detail", "mTemplateArrivedPhase", jkoVar.d, "");
        epc.a(context, 65172, "Page_Detail", "mTemplateFromMem", jkoVar.e, "从内存对模板");
        epc.a(context, 65172, "Page_Detail", "mTemplateFromFile", jkoVar.f, "从文件读模板");
        epc.a(context, 65172, "Page_Detail", "mTemplateFromNetwork", jkoVar.g, "从网络读模板");
        epc.a(context, 65172, "Page_Detail", "mTemplateParseJSON", jkoVar.h, "模板序列化");
    }
}
