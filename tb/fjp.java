package tb;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.detail2.core.framework.a;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fjp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_CONTEXT_KEY_CARD_INDEX = "cardIndex";
    public static final String BIZ_CONTEXT_KEY_CARD_NID = "cardNid";
    public static final String BIZ_CONTEXT_KEY_CARD_TYPE = "cardType";
    public static final String BIZ_CONTEXT_KEY_DETAIL_TRACE_ID = "detailTraceId";
    public static final String BIZ_CONTEXT_KEY_RECOMMEND_TRACE_ID = "recommendTraceId";
    public static final String ERROR_CODE_ATMOS_COLOR_PARSE_ERROR = "20802";
    public static final String ERROR_CODE_ATMOS_PARAMS_PARSE_ERROR = "20801";
    public static final String ERROR_CODE_BIZ_EMPTY = "10003";
    public static final String ERROR_CODE_COMMON_ADAPTER_BIND_DATA_ERROR = "10017";
    public static final String ERROR_CODE_COMMON_CONTEXT_NULL = "10016";
    public static final String ERROR_CODE_COMMON_GET_HOLDER_ERROR = "10018";
    public static final String ERROR_CODE_COMMON_RECYCLERVIEW_LAYOUT_ERROR = "10015";
    public static final String ERROR_CODE_CONTROL_SCROLL = "30001";
    public static final String ERROR_CODE_DATA_EMPTY = "10007";
    public static final String ERROR_CODE_DELIVER_DATA_ABSENT = "20709";
    public static final String ERROR_CODE_DESC_ERROR = "10004";
    public static final String ERROR_CODE_DESC_RENDER_ERROR = "10010";
    public static final String ERROR_CODE_DESC_TEMPLATE_RENDER_ERROR = "10012";
    public static final String ERROR_CODE_DESC_TEMPLATE_VERSION_PARSE_ERROR = "10011";
    public static final String ERROR_CODE_FIRST_302 = "10005";
    public static final String ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL = "20012";
    public static final String ERROR_CODE_FLOAT_NODE_GENERATE_ERROR = "10013";
    public static final String ERROR_CODE_IMAGE_URL_IS_NULL = "31001";
    public static final String ERROR_CODE_INNER_NODE_GENERATE_ERROR = "10013";
    public static final String ERROR_CODE_INSIDE_DETAIL_FLOAT_UNKNOWN_ERROR = "40011";
    public static final String ERROR_CODE_INSIDE_DETAIL_NO_FLOAT_ERROR = "40010";
    public static final String ERROR_CODE_ITEM_ID_EMPTY = "10008";
    public static final String ERROR_CODE_MAIN_PAGE_FLOAT_EMPTY = "10001";
    public static final String ERROR_CODE_MAIN_PIC_MARIN_TOP_PARSE_ERROR = "10014";
    public static final String ERROR_CODE_MAIN_PIC_NATIVE_INCONSISTENT = "20902";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_BLUR_PARSE_ERROR = "20708";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_DATA_EMPTY = "20703";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_DATA_PART_ABSENT = "20704";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_GAUSSIAN_PIC_LOAD_FAIL = "20706";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH = "10081";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH_DISTINCT = "10082";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_PARSE_ERROR = "20701";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_PIC_LOAD_FAIL = "20702";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_PRELOAD_RESOURCES_EXCEPTION = "20705";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_REQUEST_FAIL = "10080";
    public static final String ERROR_CODE_PENDING_GESTURE_FIVE_ERROR = "10019";
    public static final String ERROR_CODE_PENDING_GESTURE_TEN_ERROR = "10020";
    public static final String ERROR_CODE_PLAYER_MEDIA_INCONSISTENT = "20901";
    public static final String ERROR_CODE_RECOMMEND_DATA_EMPTY = "10050";
    public static final String ERROR_CODE_RECOMMEND_FAIL_EXCEED_MAX_COUNT = "10062";
    public static final String ERROR_CODE_RECOMMEND_FAIL_HAS_DATA_APPEND = "10063";
    public static final String ERROR_CODE_RECOMMEND_FIRST_CARD_ERROR_SHOW = "10061";
    public static final String ERROR_CODE_RECOMMEND_FIRST_NODE_DETAIL_INFO_EMPTY = "10058";
    public static final String ERROR_CODE_RECOMMEND_ITEM_ID_EMPTY = "10052";
    public static final String ERROR_CODE_RECOMMEND_ITEM_ID_INCONSISTENCY = "10059";
    public static final String ERROR_CODE_RECOMMEND_NODE_DETAIL_INFO_EMPTY = "10056";
    public static final String ERROR_CODE_RECOMMEND_SECTION_BUFFER_DUPLICATE_ID = "10054";
    public static final String ERROR_CODE_RECOMMEND_SECTION_DUPLICATE_ID = "10053";
    public static final String ERROR_CODE_RECOMMEND_SECTION_EMPTY = "10051";
    public static final String ERROR_CODE_RERANK_BUFFER_NULL = "20301";
    public static final String ERROR_CODE_RERANK_ERROR = "20305";
    public static final String ERROR_CODE_RERANK_EXPOSE_POS_EXCEPTION = "20304";
    public static final String ERROR_CODE_RERANK_SCROLL = "20302";
    public static final String ERROR_CODE_RERANK_UNEXPOSED_EXCEPTION = "20303";
    public static final String ERROR_CODE_SERVER_WEEX_URL_NULL = "20013";
    public static final String ERROR_CODE_TBLIVE_JUMP_URL_ERROR = "20203";
    public static final String ERROR_CODE_TBLIVE_MAIN_PAGE_FLOAT_EMPTY = "20205";
    public static final String ERROR_CODE_TBLIVE_PLAYER_ERROR = "20200";
    public static final String ERROR_CODE_TBLIVE_PM_INFO_ERROR = "20202";
    public static final String ERROR_CODE_TBLIVE_PM_STATUS_ERROR = "20201";
    public static final String ERROR_CODE_VIDEO_THEME_MAIN_PAGE_FLOAT_EMPTY = "20501";
    public static final String ERROR_CODE_VIEW_EMPTY = "10006";
    public static final String ERROR_CODE_WEEX_RELOAD_BROADCAST = "20005";
    public static final String ERROR_CODE_WEEX_RENDER_EXCEPTION = "20002";
    public static final String ERROR_CODE_WEEX_RENDER_FAILED = "20010";
    public static final String ERROR_CODE_WEEX_RENDER_FATAL_EXCEPTION = "20009";
    public static final String ERROR_CODE_WEEX_URL_CHANGE = "20004";
    public static final String ERROR_CODE_WEEX_URL_EMPTY = "20003";
    public static final String ERROR_CODE_WEEX_V1_WHITE_SCREEN = "20007";
    public static final String ERROR_CODE_WEEX_V2_WHITE_SCREEN = "20006";
    public static final String ERROR_CODE_WEEX_VIEW_NULL = "20011";
    public static final String NEW_DETAIL_MODULE_NAME = "new_detail";
    public static final String NEW_DETAIL_TAG_SECTION = "new_detail分阶段";
    public static final String NEW_DETAIL_TAG_SPINDLE = "new_detail异常";
    public static final String SCENE_CONTROL_SCROLL = "controlScrollEnable";
    public static final String SCENE_DESC = "desc";
    public static final String SCENE_DOWNGRADE = "downgrade";
    public static final String SCENE_ENTRANCE_ATMOS = "entranceCardAtmos";
    public static final String SCENE_HOME_PAGE_INTO = "intoHomePage";
    public static final String SCENE_INSIDE_DETAIL = "nd-inside-detail";
    public static final String SCENE_MAIN = "main";
    public static final String SCENE_MAIN_PAGE_FLOAT = "mainPageFloat";
    public static final String SCENE_MAIN_PIC_FLOAT = "mainPicFloat";
    public static final String SCENE_MEDIA_PLAYER = "media";
    public static final String SCENE_OPEN_IMMEDIATELY = "openImmediately";
    public static final String SCENE_RECOMMEND = "recommend";
    public static final String SCENE_RERANK = "rerank";
    public static final String SCENE_TBLIVE_JUMP = "tbliveJumpUrl";
    public static final String SCENE_TBLIVE_MAIN_PAGE_FLOAT = "tbliveMainPageFloat";
    public static final String SCENE_TBLIVE_PLAYER = "tblivePlayer";
    public static final String SCENE_TBLIVE_PM_INFO = "tblivePMInfo";
    public static final String SCENE_TBLIVE_PM_STATUS = "tblivePMStatus";
    public static final String SCENE_VIDEO_THEME_MAIN_PAGE_FLOAT = "videoThemeMainPageFloat";
    public static final String SCENE_WEEX_CONTAINER = "weexContainer";
    public static final String SECTION_CONTAINER_INIT = "NewDetail_ContainerInit";
    public static final String SECTION_FAST_ANIM_VISIBLE = "NewDetail_FcpFastAnimRootVisible";
    public static final String SECTION_FIRST_DETAIL_REQUEST = "NewDetail_FcpRequest";
    public static final String SECTION_FIRST_DETAIL_REQUEST_PARSE = "NewDetail_FcpDataParser";
    public static final String SECTION_FIRST_MAIN_WEEXV2_INSTANCE_CREATE = "NewDetail_FcpMainWeexV2Init";
    public static final String SECTION_FIRST_MAIN_WEEXV2_RENDER = "NewDetail_FcpMainWeexV2Render";
    public static final String SECTION_FIRST_MAIN_WEEX_GET_DETAIL_RENDER = "NewDetail_FcpMainWeexGetDetail";
    public static final String SECTION_FIRST_MAIN_WEEX_REFRESH = "NewDetail_FcpMainWeexRefresh";
    public static final String SECTION_FIRST_MAIN_WEEX_REFRESH_PRE = "NewDetail_FcpMainWeexRefresh_Pre";
    public static final String SECTION_FIRST_NATIVE_PIC_VISIBLE = "NewDetail_FcpNativePicVisible";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE = "NewDetail_FcpOpenImmediatelyNativeGaussianPicVisible";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE = "NewDetail_FcpOpenImmediatelyNativePicVisible";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY = "NewDetail_FcpVideoOpenImmediatelyReady";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_WEEX_VISIBLE = "NewDetail_FcpOpenImmediatelyWeexVisible";
    public static final String SECTION_FIRST_OTHER_BIND = "NewDetail_FcpOtherBind";
    public static final String SECTION_FIRST_OTHER_BIND_PRE = "NewDetail_FcpOtherBindPre";
    public static final String SECTION_FIRST_RECYCLERVIEW = "NewDetail_FcpRecyclerView";
    public static final String SECTION_FIRST_RECYCLERVIEW_PRE = "NewDetail_FcpRecyclerViewPre";
    public static final String SECTION_FIRST_TPP_REQUEST = "NewDetail_FcpTppRequest";
    public static final String SECTION_FIRST_TPP_REQUEST_PARSE = "NewDetail_FcpTppDataParser";
    public static final String SECTION_FIRST_UI_DATA_REFRESH = "NewDetail_FcpUIDataRefresh";
    public static final String SECTION_FIRST_UI_DATA_REFRESH_PRE = "NewDetail_FcpUIDataRefreshPre";
    public static final String SECTION_FIRST_VIDEO_READY = "NewDetail_FcpVideoReady";
    public static final String SECTION_NAV = "NewDetail_Nav";
    public static final String SECTION_NAV_BAR_WEEX_VISIBLE = "NewDetail_NavBarWeexVisible";
    public static final String SECTION_OPEN_IMMED_HP_TO_REAL_REQUEST = "NewDetail_OpenImmedHPToRealRequest";
    public static final String SECTION_SECOND_NATIVE_PIC_VISIBLE = "NewDetail_SecondNativePicVisible";
    public static final String SECTION_SECOND_WEEX_VISIBLE = "NewDetail_SecondWeexVisible";
    public static final String SECTION_START_REQUEST_TO_CLICK = "NewDetail_RequestToClick";
    public static final String SECTION_VISIBLE = "NewDetail_FcpRootVisible";
    public static final String UMBRELLA_FEATURE_TYPE_EVENT_PROCESS = "eventProcess";
    public static final String UMBRELLA_TAG_ENTER_PAGE_INIT = "Monitor_NewDetail_PageInit";
    public static final String UMBRELLA_TAG_ERROR_PAGE = "Monitor_NewDetail_ErrorPage";
    public static final String UMBRELLA_TAG_FIRST_PAGE_REQUEST = "Monitor_NewDetail_FirstPageReq";
    public static final String UMBRELLA_TAG_PLACEHOLDER_GAUSSIAN_IMAGE_CALLBACK_SUCCESS = "Monitor_NewDetail_PlaceholderGaussianImageCallbackSuccess";
    public static final String UMBRELLA_TAG_PLACEHOLDER_IMAGE_CALLBACK_SUCCESS = "Monitor_NewDetail_PlaceholderImageCallbackSuccess";
    public static final String UMBRELLA_TAG_PLACEHOLDER_RENDER_SUCCESS = "Monitor_NewDetail_PlaceholderRenderSuccess";
    public static final String UMBRELLA_TAG_PRELOAD_MEDIA_SUCCESS = "Monitor_NewDetail_PreloadMediaSuccess";
    public static final String UMBRELLA_TAG_PRELOAD_WEEX_LOAD_SO_SUCCESS = "Monitor_NewDetail_PreloadWeexLoadSoSuccess";
    public static final String UMBRELLA_TAG_PRE_REQUEST_SUCCESS = "Monitor_NewDetail_PreRequestSuccess";
    public static final String UMBRELLA_TAG_PRE_REQUEST_VISIT = "Monitor_NewDetail_PreRequestVisit";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_BEHAVIOR = "Monitor_NewDetail_RealTimeRequestBehavior";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_EFFECT = "Monitor_NewDetail_RealTimeRequestEffect";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_START = "Monitor_NewDetail_RealTimeRequestStart";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_USE_RATIO = "Monitor_NewDetail_RealTimeRequestUseRatio";
    public static final String UMBRELLA_TAG_REQUEST = "Monitor_NewDetail_Req";
    public static final String UMBRELLA_TAG_REQUEST_FAIL = "Monitor_NewDetail_ReqFail";
    public static final String UMBRELLA_TAG_REQUEST_TIME_OUT = "Monitor_NewDetail_ReqTimeOut";
    public static final String UMBRELLA_TAG_WEEX_CACHE_HIT_SUCCESS = "Monitor_NewDetail_WeexCacheHitSuccess";
    public static final String UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_REQUEST = "Monitor_NewDetail_OpenImmediatelyPreSendDataRequest";
    public static final String UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_SUCCESS = "Monitor_NewDetail_OpenImmediatelyPreSendDataSuccess";
    public static final String UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_RENDER_SUCCESS = "Monitor_NewDetail_OpenImmediatelyRenderSuccess";

    /* renamed from: a  reason: collision with root package name */
    private static UMLinkLogInterface f28004a;

    static {
        kge.a(692127251);
        f28004a = bpp.a();
    }

    public static void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b5160c", new Object[]{aVar, str, str2});
        } else if (aVar == null) {
        } else {
            boolean b = l.b((Context) aVar.getNewDetailContext());
            boolean d = l.d((Context) aVar.getNewDetailContext());
            if (b && !fkt.aV()) {
                return;
            }
            if (d && !fkt.aK()) {
                return;
            }
            if (aVar instanceof Activity) {
                s.f18233a.b((Activity) aVar).a(str);
            } else if (aVar instanceof Fragment) {
                s.f18233a.b((Fragment) aVar).a(str);
            }
            fjt.a(fjt.TAG_RENDER, str + " start, currentTime: " + SystemClock.uptimeMillis() + ", [" + str2 + riy.ARRAY_END_STR);
        }
    }

    public static void a(a aVar, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c154938c", new Object[]{aVar, str, new Long(j), str2});
        } else if (aVar == null) {
        } else {
            boolean b = l.b((Context) aVar.getNewDetailContext());
            boolean d = l.d((Context) aVar.getNewDetailContext());
            if (b && !fkt.aV()) {
                return;
            }
            if (d && !fkt.aK()) {
                return;
            }
            if (aVar instanceof Activity) {
                s.f18233a.b((Activity) aVar).c(str, j);
            } else if (aVar instanceof Fragment) {
                s.f18233a.b((Fragment) aVar).c(str, j);
            }
            fjt.a("new_detail分阶段", str + " start, currentTime: " + j + ", [" + str2 + riy.ARRAY_END_STR);
        }
    }

    public static void b(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675658ab", new Object[]{aVar, str, str2});
        } else if (aVar == null) {
        } else {
            boolean b = l.b((Context) aVar.getNewDetailContext());
            boolean d = l.d((Context) aVar.getNewDetailContext());
            if (b && !fkt.aV()) {
                return;
            }
            if (d && !fkt.aK()) {
                return;
            }
            if (aVar instanceof Activity) {
                s.f18233a.b((Activity) aVar).e(str, null);
            } else if (aVar instanceof Fragment) {
                s.f18233a.b((Fragment) aVar).e(str, null);
            }
            fjt.a("new_detail分阶段", str + " end, currentTime: " + SystemClock.uptimeMillis() + ", [" + str2 + riy.ARRAY_END_STR);
        }
    }

    public static void b(a aVar, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdba4cd", new Object[]{aVar, str, new Long(j), str2});
        } else if (aVar == null) {
        } else {
            boolean b = l.b((Context) aVar.getNewDetailContext());
            boolean d = l.d((Context) aVar.getNewDetailContext());
            if (b && !fkt.aV()) {
                return;
            }
            if (d && !fkt.aK()) {
                return;
            }
            if (aVar instanceof Activity) {
                s.f18233a.b((Activity) aVar).a(str, j, (Map<String, Object>) null);
            } else if (aVar instanceof Fragment) {
                s.f18233a.b((Fragment) aVar).a(str, j, (Map<String, Object>) null);
            }
            fjt.a("new_detail分阶段", str + " end, currentTime: " + j + ", [" + str2 + riy.ARRAY_END_STR);
        }
    }

    public static void a(a aVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d433dc1e", new Object[]{aVar, str, obj});
        } else if (aVar == null) {
        } else {
            boolean b = l.b((Context) aVar.getNewDetailContext());
            boolean d = l.d((Context) aVar.getNewDetailContext());
            if (b && !fkt.aV()) {
                return;
            }
            if (d && !fkt.aK()) {
                return;
            }
            if (aVar instanceof Activity) {
                s.f18233a.b((Activity) aVar).a(str, obj);
            } else if (aVar instanceof Fragment) {
                s.f18233a.b((Fragment) aVar).a(str, obj);
            }
            fjt.a("new_detail分阶段", " addProperty, key: " + str + ", value: " + obj);
        }
    }

    public static void a(a aVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e3b642", new Object[]{aVar, str, new Long(j)});
        } else if (aVar == null) {
        } else {
            boolean b = l.b((Context) aVar.getNewDetailContext());
            boolean d = l.d((Context) aVar.getNewDetailContext());
            if (b && !fkt.aV()) {
                return;
            }
            if (d && !fkt.aK()) {
                return;
            }
            if (aVar instanceof Activity) {
                s.f18233a.b((Activity) aVar).a(str, j);
            } else if (!(aVar instanceof Fragment)) {
            } else {
                s.f18233a.b((Fragment) aVar).a(str, j);
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce21d813", new Object[]{str, str2, str3, map, str4, str5});
            return;
        }
        a(str, str2, str3 + ", detailTraceId: " + str4 + ", recommendTraceId: " + str5, map);
    }

    public static void a(d dVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df0bf1c", new Object[]{dVar, str, str2, str3});
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (dVar == null) {
            return;
        }
        a(str, str2, a(str3 + ", bizContext: " + JSON.toJSONString(dVar.x), dVar), a(dVar));
    }

    private static Map<String, String> a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5432a573", new Object[]{dVar});
        }
        HashMap hashMap = new HashMap(dVar.C().T());
        JSONObject L = dVar.L();
        if (L != null) {
            hashMap.putAll(fju.a(L, new fjn<String>() { // from class: tb.fjp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // tb.fjn
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                }
            }));
        }
        JSONObject M = dVar.M();
        if (M != null) {
            hashMap.putAll(fju.a(M, new fjn<String>() { // from class: tb.fjp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // tb.fjn
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                }
            }));
        }
        return hashMap;
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            a("new_detail异常", str, b(str2), str3, map);
        }
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{str, str2, str3, str4, map});
            return;
        }
        b("dataParse", str2, str3, str4, map);
        TLog.loge(str, str4);
    }

    private static void b(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba640454", new Object[]{str, str2, str3, str4, map});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                String str5 = TextUtils.isEmpty(str4) ? "" : str4;
                if (map == null) {
                    map = new HashMap<>();
                }
                Map<String, String> map2 = map;
                map2.put("catalog", str);
                map2.put("extraInfo", str2);
                f28004a.commitFailure("AppErrorTrace", "", "", bgc.UMBRELLA_SPINDLE_BIZ, "new_detail", map2, str3, str5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(d dVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176d54dd", new Object[]{dVar, str, str2, str3});
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (dVar == null) {
            return;
        }
        b(str, str2, a(str3 + ", bizContext: " + JSON.toJSONString(dVar.x), dVar), a(dVar));
    }

    public static void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10af9e", new Object[]{str, str2, str3, map});
            return;
        }
        b("componentRender", str, b(str2), str3, map);
        TLog.loge("new_detail异常", str3);
    }

    public static void c(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4581a8bd", new Object[]{str, str2, str3, map});
        } else {
            b("insideDetail", str, str2, str3, map);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3d92d6", new Object[]{str, str2, str3, map, th});
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        b(str, str2, str3 + stringWriter2, map);
    }

    public static void c(d dVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e9ea9e", new Object[]{dVar, str, str2, str3});
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (dVar != null) {
            str2 = b(str2);
            str3 = a(str3 + ", bizContext: " + JSON.toJSONString(dVar.x), dVar);
        }
        b("downgrade", str, str2, str3, a(dVar));
        TLog.loge("new_detail异常", str3);
    }

    public static void a(String str, String str2, String str3, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1bc4def", new Object[]{str, str2, str3, traceLogEventType, strArr});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        if (a2 == null) {
            return;
        }
        a2.trace("new_detail", str, "NewDetailActivity", str2, null, str3, traceLogEventType, strArr);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        if (a2 == null) {
            return;
        }
        a2.commitSuccess(str, str2, "", "Page_NewDetail", "", map);
    }

    public static void a(d dVar, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6027d738", new Object[]{dVar, str, str2, str3, new Boolean(z)});
            return;
        }
        a(dVar, str2, str3, z);
        b(dVar, str, str2, str3);
    }

    public static void b(d dVar, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63df997", new Object[]{dVar, str, str2, str3, new Boolean(z)});
            return;
        }
        a(dVar, str2, str3, z);
        a(dVar, str, str2, str3);
    }

    public static void a(d dVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aeec742", new Object[]{dVar, str, str2, new Boolean(z)});
        } else if (dVar == null) {
        } else {
            d.a aVar = new d.a();
            aVar.c = z;
            aVar.f11524a = str;
            aVar.b = str2;
            dVar.w.add(aVar);
        }
    }

    public static void a(d dVar, String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d9d1", new Object[]{dVar, str, str2, th, new Boolean(z)});
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        a(dVar, str, str2 + stringWriter2, z);
    }

    public static void a(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e6a5d2", new Object[]{dVar, str, str2});
        } else if (dVar == null) {
        } else {
            dVar.x.put(str, str2);
        }
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : a(str);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "tppGuide" + str;
    }

    private static String a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adb64418", new Object[]{str, dVar});
        }
        return str + ", subType: " + dVar.h;
    }
}
