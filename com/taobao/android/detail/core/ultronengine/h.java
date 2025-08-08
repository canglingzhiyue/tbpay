package com.taobao.android.detail.core.ultronengine;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.ultron.engine.template.b;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bao;
import tb.bpp;
import tb.emu;
import tb.eps;
import tb.fjp;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENGINE_ULTRON_PROTOCOL_GENERATE_ERROR = "[详情2.0][端侧引擎]生成奥创协议失败";
    public static final String ENGINE_ULTRON_PROTOCOL_PARSE_ERROR = "[详情2.0][端侧引擎]解析奥创协议失败";

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f9934a;
    private static final Map<UMTagKey, String> b;
    private static final Map<UMDimKey, Object> c;

    static {
        kge.a(1562215122);
        f9934a = bpp.a();
        b = new HashMap(1);
        c = new HashMap(2);
        b.put(UMTagKey.TAG_1, "ultron_container");
        c.put(UMDimKey.TAG_1, "ultron_container");
        emu.a("com.taobao.android.detail.core.ultronengine.UltronMonitor");
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        try {
            String stackTraceString = Log.getStackTraceString(th);
            f9934a.logError("detail2", "", "exception", null, fjp.ERROR_CODE_PENDING_GESTURE_TEN_ERROR, stackTraceString, c, null);
            f9934a.commitFailure("exception", str, "1.0", "detail2", "", null, fjp.ERROR_CODE_PENDING_GESTURE_TEN_ERROR, stackTraceString);
        } catch (Throwable th2) {
            i.a("UltronMonitor", "commitDataLoadFailed", th2);
        }
    }

    public static void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bee015da", new Object[]{aVar});
            return;
        }
        String str = "奥创协议生成失败:";
        if (aVar != null) {
            try {
                str = str + aVar.toString();
            } catch (Throwable th) {
                i.a("UltronMonitor", "commitProtocolParseError", th);
                return;
            }
        }
        String str2 = str;
        f9934a.logError("detail2", "", "degrade", null, fjp.ERROR_CODE_FIRST_302, str2, c, null);
        f9934a.commitFailure("degrade", "gen_ultron_protocol_fail", "1.0", "detail2", "", null, fjp.ERROR_CODE_FIRST_302, str2);
    }

    public static void a(b.a aVar, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea6632b", new Object[]{aVar, ultronError});
            return;
        }
        String str = "奥创协议生成失败:";
        if (aVar != null) {
            try {
                str = str + aVar.toString();
            } catch (Throwable th) {
                i.a("UltronMonitor", "commitDataLoadFailed", th);
                return;
            }
        }
        if (ultronError != null) {
            str = str + " UltronError" + ultronError.extraMsg;
        }
        String str2 = str;
        f9934a.logError("detail2", "", "degrade", null, fjp.ERROR_CODE_DATA_EMPTY, str2, c, null);
        f9934a.commitFailure("ultronProtocol2CompFail", "", "", "detail2", "", null, fjp.ERROR_CODE_DATA_EMPTY, str2);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            f9934a.logError("detail2", "", "createNavBarVMFail", null, fjp.ERROR_CODE_ITEM_ID_EMPTY, "生成导航栏ViewModel失败", c, null);
            f9934a.commitFailure("createNavBarVMFail", "", "", "detail2", "", null, fjp.ERROR_CODE_ITEM_ID_EMPTY, "生成导航栏ViewModel失败");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitNavBarError", th);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            f9934a.logError("detail2", "", "createHomeVMFail", null, "10009", "生成主屏容器ViewModel失败", c, null);
            f9934a.commitFailure("createHomeVMFail", "", "", "detail2", "", null, "10009", "生成主屏容器ViewModel失败");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitDetailHomeContainerError", th);
        }
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            return;
        }
        String str = "adjust合并数据异常";
        if (th != null) {
            try {
                str = str + Log.getStackTraceString(th);
            } catch (Throwable th2) {
                i.a("UltronMonitor", "commitAdjustError", th2);
                return;
            }
        }
        String str2 = str;
        f9934a.logError("detail2", "", "adjustFail", null, "10009", str2, c, null);
        f9934a.commitFailure("adjustFail", "merge_data_error", "1.0", "detail2", "", null, fjp.ERROR_CODE_DESC_RENDER_ERROR, str2);
    }

    public static void a(List<String> list, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d60e0b3", new Object[]{list, bVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("notSupportComps", JSON.toJSONString(list));
            if (bVar != null) {
                com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = new com.taobao.android.detail.datasdk.model.datamodel.node.c(bVar);
                String q = cVar.q();
                String i = cVar.i();
                if (StringUtils.isEmpty(q)) {
                    q = "";
                }
                if (StringUtils.isEmpty(i)) {
                    i = "";
                }
                hashMap.put("sellerType", q);
                hashMap.put("itemId", i);
            }
            f9934a.logError("detail2", "", "degrade", null, fjp.ERROR_CODE_VIEW_EMPTY, "组件缺失触发降级兜底", c, com.alibaba.android.umbrella.link.export.a.a(hashMap));
            f9934a.commitFailure("degrade", "degrade_lack_comp", "1.0", "detail2", "", hashMap, fjp.ERROR_CODE_VIEW_EMPTY, "组件缺失触发降级兜底");
            if (list == null || list.size() <= 0) {
                return;
            }
            eps.a("Page_Detail_2.0", "degrade", hashMap);
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitDegradeLackComp", th);
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("bizData", JSON.toJSONString(jSONObject));
            f9934a.logError("detail2", "", "degrade", null, "10001", "bizData模版信息缺失", c, com.alibaba.android.umbrella.link.export.a.a(hashMap));
            f9934a.commitFailure("degrade", "bizData_no_template_info", "1.0", "detail2", "", hashMap, "10001", "bizData模版信息缺失");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitDegradeLackComp", th);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            f9934a.logError("detail2", "", "degrade", null, "10002", "VO缺失", c, null);
            f9934a.commitFailure("degrade", "no_vo", "1.0", "detail2", "", null, "10002", "VO缺失");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitDegradeLackVO", th);
        }
    }

    public static void a(JSONObject jSONObject, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee13e4fa", new Object[]{jSONObject, aVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put(bao.CACHE_KEY_TEMPLATE_INFO, JSON.toJSONString(jSONObject));
            if (aVar != null) {
                hashMap.put("templateRenderError", aVar.toString());
            }
            f9934a.logError("detail2", "", "degrade", null, "10004", "没有找到2.0模版", c, com.alibaba.android.umbrella.link.export.a.a(hashMap));
            f9934a.commitFailure("degrade", "ultron_template_not_found", "1.0", "detail2", "", hashMap, "10004", "没有找到2.0模版");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitTemplateNotFound", th);
        }
    }

    public static void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{th});
            return;
        }
        String str = "没有style ";
        if (th != null) {
            try {
                str = str + Log.getStackTraceString(th);
            } catch (Throwable th2) {
                i.a("UltronMonitor", "commitGlobalStyleNotFound", th2);
                return;
            }
        }
        String str2 = str;
        f9934a.logError("detail2", "", "degrade", null, fjp.ERROR_CODE_DESC_TEMPLATE_RENDER_ERROR, str2, c, null);
        f9934a.commitFailure("degrade", "style_degrade", "1.0", "detail2", "", null, fjp.ERROR_CODE_DESC_TEMPLATE_RENDER_ERROR, str2);
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        try {
            f9934a.logError("detail2", "", "degrade", null, fjp.ERROR_CODE_DESC_TEMPLATE_VERSION_PARSE_ERROR, "服务端下发的标降级", c, null);
            f9934a.commitFailure("degrade", "server_degrade", "1.0", "detail2", "", null, fjp.ERROR_CODE_DESC_TEMPLATE_VERSION_PARSE_ERROR, "服务端下发的标降级");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitGlobalStyleNotFound", th);
        }
    }

    public static void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{eVar});
        } else if (eVar == null) {
        } else {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("eventType", eVar.b());
                f9934a.logInfo("detail2", "", "routeEvent2OldDetail", null, c, com.alibaba.android.umbrella.link.export.a.a(hashMap));
            } catch (Throwable th) {
                i.a("UltronMonitor", "commitEventRouteUltron2Old", th);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null) {
        } else {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("eventType", str);
                f9934a.logInfo("detail2", "", "routeEvent2NewDetail", null, c, com.alibaba.android.umbrella.link.export.a.a(hashMap));
            } catch (Throwable th) {
                i.a("UltronMonitor", "commitEventRouteOld2Ultron", th);
            }
        }
    }

    public static void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{bVar});
        } else {
            i.d("UltronMonitor", "ServerSupportDetail2.0 各种服务端开关数据节点存在性检查通过");
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (str == null) {
        } else {
            try {
                if (!str.startsWith("v7")) {
                    return;
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("protocolVersion", str);
                f9934a.logError("detail2", "taodetail", "use_v7", null, "taodetail-v7", "使用v7协议", c, com.alibaba.android.umbrella.link.export.a.a(hashMap));
                f9934a.commitFailure("use_v7", "", "1.0", "detail2", "taodetail", hashMap, "taodetail-v7", "使用v7协议");
            } catch (Throwable th) {
                i.a("UltronMonitor", "commitUseV7", th);
            }
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            f9934a.logError("detail2", "taodetail", "degrade", null, "taodetail-10011", "v7协议降级", c, null);
            f9934a.commitFailure("degrade", "", "1.0", "detail2", "taodetail", null, "taodetail-10011", "v7协议降级");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitDegradeV7", th);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        try {
            f9934a.logError("detail2", "taodetail", "degrade", null, "taodetail-10012", "v7-协议降级", c, null);
            f9934a.commitFailure("degrade", "", "1.0", "detail2", "taodetail", null, "taodetail-10012", "v7-协议降级");
        } catch (Throwable th) {
            i.a("UltronMonitor", "commitDegradeV7Low", th);
        }
    }
}
