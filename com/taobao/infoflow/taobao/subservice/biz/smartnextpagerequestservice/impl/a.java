package com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import tb.bxn;
import tb.kge;
import tb.ldf;
import tb.ldl;
import tb.lja;
import tb.ljd;
import tb.nlr;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f17532a = new JSONObject();

    static {
        kge.a(933960605);
    }

    public static /* synthetic */ JSONObject a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("844a2df2", new Object[]{aVar}) : aVar.f17532a;
    }

    public static /* synthetic */ JSONObject a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0c0c57e", new Object[]{aVar, jSONObject});
        }
        aVar.f17532a = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String a(a aVar, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55939610", new Object[]{aVar, iContainerDataService}) : aVar.a(iContainerDataService);
    }

    public static /* synthetic */ String b(a aVar, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("654b4891", new Object[]{aVar, iContainerDataService}) : aVar.c(iContainerDataService);
    }

    public static /* synthetic */ boolean b(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da2934c1", new Object[]{aVar, jSONObject})).booleanValue() : aVar.a(jSONObject);
    }

    public static /* synthetic */ int c(a aVar, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f63fbf41", new Object[]{aVar, iContainerDataService})).intValue() : aVar.b(iContainerDataService);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this).clear();
                    }
                }
            });
        }
    }

    public void a(final IContainerDataService<?> iContainerDataService, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195159ba", new Object[]{this, iContainerDataService, new Long(j), new Long(j2)});
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this).put("zeroScrollTimestamp", (Object) Long.valueOf(j));
                    a.a(a.this).put("sessionId", (Object) a.a(a.this, iContainerDataService));
                    a.a(a.this).put("dataType", (Object) a.b(a.this, iContainerDataService));
                    a.a(a.this).put("dataOnscreenTimestamp", (Object) Long.valueOf(j2));
                    ldf.d("DynamicRtUserTracer", "第0页滚动开始点位：" + a.a(a.this).toJSONString());
                    ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_first_screen_scroll_trigger", null, null, nlr.c(a.a(a.this)));
                }
            });
        }
    }

    public void a(final String str, final IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4931b30", new Object[]{this, str, iContainerDataService});
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    a aVar = a.this;
                    JSONObject a2 = a.a(aVar);
                    String str2 = str;
                    a.a(aVar, aVar.a(a2, str2, bxn.b(iContainerDataService.getContainerData()) + "", a.a(a.this, iContainerDataService), a.c(a.this, iContainerDataService) + "", uptimeMillis + ""));
                    ldf.d("DynamicRtUserTracer", "翻页请求开始点位：" + a.a(a.this).toJSONString());
                    ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_prefetch_request_trigger", null, null, nlr.c(a.a(a.this)));
                }
            });
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || a.a(a.this).isEmpty()) {
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a2 = a.a(a.this);
                        a2.put("requestDidFinished", (Object) (uptimeMillis + ""));
                        a.a(a.this).put("extendedTime", (Object) str);
                        ldf.d("DynamicRtUserTracer", "翻页请求完成点位：" + a.a(a.this).toJSONString());
                        ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_prefetch_request_did_finished", null, null, nlr.c(a.a(a.this)));
                        a aVar = a.this;
                        if (!a.b(aVar, a.a(aVar))) {
                            return;
                        }
                        a.a(a.this).clear();
                    }
                }
            });
        }
    }

    public void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || a.a(a.this).isEmpty()) {
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a2 = a.a(a.this);
                        a2.put("lastModelWillDisplay", (Object) (uptimeMillis + ""));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            a.a(a.this).putAll(map);
                        }
                        ldf.d("DynamicRtUserTracer", "翻页请求最后一张完成点位：" + a.a(a.this).toJSONString());
                        ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_last_model_will_display", null, null, nlr.c(a.a(a.this)));
                        a aVar = a.this;
                        if (!a.b(aVar, a.a(aVar))) {
                            return;
                        }
                        a.a(a.this).clear();
                    }
                }
            });
        }
    }

    public JSONObject a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dfb3049a", new Object[]{this, jSONObject, str, str2, str3, str4, str5});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                ldf.a("DynamicRtUserTracer", "bxFeatures encode error", e);
            }
            jSONObject.put("bxFeatures", (Object) str);
        }
        jSONObject.put(BioDetector.EXT_KEY_PAGENUM, (Object) str2);
        jSONObject.put("sessionId", (Object) str3);
        jSONObject.put("pageLastIndex", (Object) str4);
        jSONObject.put("requestStart", (Object) str5);
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private String a(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df919826", new Object[]{this, iContainerDataService});
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            return null;
        }
        List totalData = containerData.getTotalData();
        if (totalData.isEmpty()) {
            return null;
        }
        Object a2 = lja.a("args.utLogMapEdge.sessionId", (BaseSectionModel) totalData.get(0));
        if (!(a2 instanceof String)) {
            return null;
        }
        return (String) a2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private int b(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d86d94c", new Object[]{this, iContainerDataService})).intValue();
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData != 0) {
            return containerData.getTotalData().size() - 1;
        }
        return -1;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : jSONObject.containsKey("requestDidFinished") && jSONObject.containsKey("lastModelWillDisplay");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private String c(IContainerDataService<?> iContainerDataService) {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("301e18a8", new Object[]{this, iContainerDataService});
        }
        ?? containerData = iContainerDataService.getContainerData();
        return (containerData == 0 || (base = containerData.getBase()) == null) ? "unknown" : base.isRemote() ? "remote" : "cache";
    }
}
