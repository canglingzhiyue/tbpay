package com.etao.feimagesearch.util;

import android.app.Application;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.etao.feimagesearch.util.o;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.cof;
import tb.com;
import tb.cox;
import tb.fxb;
import tb.imo;
import tb.kge;
import tb.noa;
import tb.rul;
import tb.ruw;

/* loaded from: classes4.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final o INSTANCE;
    public static final String KEY_IMG = "strimg";

    /* renamed from: a */
    private static String f7030a;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str, String str2, Integer num, String str3);

        void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject);
    }

    static {
        kge.a(-1500473105);
        INSTANCE = new o();
        f7030a = "";
    }

    private o() {
    }

    public static final /* synthetic */ String a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("157a4ab8", new Object[]{oVar}) : f7030a;
    }

    public static final /* synthetic */ String a(o oVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41c2ab93", new Object[]{oVar, mtopResponse}) : oVar.a(mtopResponse);
    }

    public static final /* synthetic */ void a(o oVar, String str, String str2, Map map, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2750658e", new Object[]{oVar, str, str2, map, mtopResponse});
        } else {
            oVar.a(str, str2, map, mtopResponse);
        }
    }

    public static final /* synthetic */ void a(o oVar, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c87e566", new Object[]{oVar, mtopResponse, aVar});
        } else {
            oVar.a(mtopResponse, aVar);
        }
    }

    public static final /* synthetic */ void b(o oVar, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fee54a7", new Object[]{oVar, mtopResponse, aVar});
        } else {
            oVar.b(mtopResponse, aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f9, code lost:
        if (r0.equals(tb.its.TRAFFIC_LIMIT_STATUS) != false) goto L40;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.etao.feimagesearch.util.am a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.o.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):com.etao.feimagesearch.util.am");
    }

    @JvmStatic
    public static final void a(Map<String, String> map, rul<? super Map<String, com.etao.feimagesearch.capture.dynamic.templates.a>, kotlin.t> rulVar, ruw<? super Integer, ? super String, kotlin.t> ruwVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6da6fc0", new Object[]{map, rulVar, ruwVar});
            return;
        }
        am a2 = a("38719", com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), (String) null, map);
        if (!a2.a()) {
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(a2.b(), a2.c());
            return;
        }
        JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(a2.d(), "data");
        if (b2 == null) {
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(-1, "result data is empty");
            return;
        }
        JSONArray a3 = com.taobao.android.searchbaseframe.util.a.a(b2, "result");
        JSONArray jSONArray = a3;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            z = false;
        }
        if (z) {
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(-1, "templates json is empty");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = a3.get(0);
        if (!(obj instanceof JSONObject)) {
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(-1, "templates json is invalid");
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        for (String str : jSONObject.keySet()) {
            if (str != null && !StringUtils.isEmpty(str) && (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, str)) != null) {
                kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO… templateKey) ?: continue");
                String templateUrl = com.taobao.android.searchbaseframe.util.a.a(b, "url", "");
                if (!StringUtils.isEmpty(templateUrl)) {
                    kotlin.jvm.internal.q.a((Object) templateUrl, "templateUrl");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) str, (String) b);
                    linkedHashMap.put(str, new com.etao.feimagesearch.capture.dynamic.templates.a(str, templateUrl, jSONObject2));
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(-1, "templates data is empty");
        } else if (rulVar != null) {
            rulVar.mo2421invoke(linkedHashMap);
        }
    }

    @JvmStatic
    public static final am b(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am) ipChange.ipc$dispatch("43b61727", new Object[]{str, str2, str3, str4, map});
        }
        am a2 = a(str, str2, str3, str4, map);
        com.etao.feimagesearch.newresult.perf.a.a(a2.g());
        return a2;
    }

    @JvmStatic
    public static final void a(String str, String str2, Map<String, String> map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b4030a", new Object[]{str, str2, map, aVar});
            return;
        }
        com.taobao.android.searchbaseframe.ace.b.a(imo.b(), map, "wxrcmd");
        f7030a = w.a(str, str2, map, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.util.ImageSearchMtopUtil$searchRequest$mtopBusiness$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* loaded from: classes4.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ MtopResponse b;

                public a(MtopResponse mtopResponse) {
                    this.b = mtopResponse;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        o.a(o.INSTANCE, this.b, o.a.this);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (o.a.this == null) {
                } else {
                    com.etao.feimagesearch.pipline.c.a(new a(mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                o.a aVar2 = o.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(o.a(o.INSTANCE), "", Integer.valueOf(i), mtopResponse != null ? mtopResponse.getRetMsg() : null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                o.a aVar2 = o.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(o.a(o.INSTANCE), "", Integer.valueOf(i), mtopResponse != null ? mtopResponse.getRetMsg() : null);
            }
        }, false, true).mtopProp.falcoId;
    }

    @JvmStatic
    public static final void a(String str, final String str2, final String str3, Map<String, String> map, final a aVar) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65ec9d4", new Object[]{str, str2, str3, map, aVar});
            return;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.taobao.android.searchbaseframe.ace.b.a(imo.b(), map, "wxrcmd");
        linkedHashMap.put("params", JSONObject.toJSONString(map));
        if (StringUtils.isEmpty(str)) {
            if (map == null || (str4 = map.get("pssource")) == null) {
                str4 = "";
            }
            str = com.etao.feimagesearch.config.b.i(str4);
        }
        linkedHashMap.put("appId", str);
        f7030a = w.a(str2, str3, linkedHashMap, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.util.ImageSearchMtopUtil$asyncImageSearch$mtopBusiness$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* loaded from: classes4.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ MtopResponse b;

                public a(MtopResponse mtopResponse) {
                    this.b = mtopResponse;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        o.b(o.INSTANCE, this.b, o.a.this);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                cox.a("PaiBase64Success", new String[0]);
                if (o.a.this == null) {
                    return;
                }
                com.etao.feimagesearch.pipline.c.a(new a(mtopResponse));
                o.a(o.INSTANCE, str2, str3, linkedHashMap, mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                cox.a("PaiBase64Fail", new String[0]);
                String a2 = o.a(o.INSTANCE, mtopResponse);
                o.a aVar2 = o.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(o.a(o.INSTANCE), a2, Integer.valueOf(i), mtopResponse != null ? mtopResponse.getRetMsg() : null);
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSystemError(int r6, mtopsdk.mtop.domain.MtopResponse r7, java.lang.Object r8) {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.util.ImageSearchMtopUtil$asyncImageSearch$mtopBusiness$1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 0
                    if (r1 == 0) goto L20
                    r1 = 4
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r2] = r5
                    r2 = 1
                    java.lang.Integer r3 = new java.lang.Integer
                    r3.<init>(r6)
                    r1[r2] = r3
                    r6 = 2
                    r1[r6] = r7
                    r6 = 3
                    r1[r6] = r8
                    java.lang.String r6 = "d3b51d43"
                    r0.ipc$dispatch(r6, r1)
                    return
                L20:
                    java.lang.String[] r8 = new java.lang.String[r2]
                    java.lang.String r0 = "PaiBase64Fail"
                    tb.cox.a(r0, r8)
                    r8 = 0
                    if (r7 == 0) goto L2f
                    java.lang.String r0 = r7.getRetCode()
                    goto L30
                L2f:
                    r0 = r8
                L30:
                    java.lang.String r1 = "FAIL_SYS_TRAFFIC_LIMIT"
                    boolean r0 = kotlin.jvm.internal.q.a(r0, r1)
                    if (r0 != 0) goto L5c
                    if (r7 == 0) goto L3f
                    java.lang.String r0 = r7.getRetCode()
                    goto L40
                L3f:
                    r0 = r8
                L40:
                    java.lang.String r1 = "FAIL_SYS_FLOW_CONTROL_ERROR"
                    boolean r0 = kotlin.jvm.internal.q.a(r0, r1)
                    if (r0 == 0) goto L49
                    goto L5c
                L49:
                    if (r7 == 0) goto L50
                    java.lang.String r0 = r7.getRetCode()
                    goto L51
                L50:
                    r0 = r8
                L51:
                    java.lang.String r1 = "ANDROID_SYS_LOGIN_CANCEL"
                    boolean r0 = kotlin.jvm.internal.q.a(r0, r1)
                    if (r0 == 0) goto L5e
                    r6 = -16
                    goto L5e
                L5c:
                    r6 = -17
                L5e:
                    com.etao.feimagesearch.util.o r0 = com.etao.feimagesearch.util.o.INSTANCE
                    java.lang.String r0 = com.etao.feimagesearch.util.o.a(r0, r7)
                    com.etao.feimagesearch.util.o$a r1 = com.etao.feimagesearch.util.o.a.this
                    if (r1 == 0) goto L97
                    com.etao.feimagesearch.util.o r2 = com.etao.feimagesearch.util.o.INSTANCE
                    java.lang.String r2 = com.etao.feimagesearch.util.o.a(r2)
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    if (r7 == 0) goto L7e
                    java.lang.String r4 = r7.getRetCode()
                    goto L7f
                L7e:
                    r4 = r8
                L7f:
                    r3.append(r4)
                    r4 = 58
                    r3.append(r4)
                    if (r7 == 0) goto L8d
                    java.lang.String r8 = r7.getRetMsg()
                L8d:
                    r3.append(r8)
                    java.lang.String r7 = r3.toString()
                    r1.a(r2, r0, r6, r7)
                L97:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.ImageSearchMtopUtil$asyncImageSearch$mtopBusiness$1.onSystemError(int, mtopsdk.mtop.domain.MtopResponse, java.lang.Object):void");
            }
        }, false, true).mtopProp.falcoId;
    }

    private final void a(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3578dfe6", new Object[]{this, mtopResponse, aVar});
            return;
        }
        JSONObject jSONObject = null;
        if (mtopResponse != null) {
            try {
                byte[] bytedata = mtopResponse.getBytedata();
                kotlin.jvm.internal.q.a((Object) bytedata, "response.bytedata");
                jSONObject = JSONObject.parseObject(new String(bytedata, kotlin.text.d.UTF_8));
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            aVar.a(f7030a, "", (Integer) (-1), "parse result error");
        } else {
            aVar.a(mtopResponse, f7030a, "", jSONObject);
        }
    }

    private final void b(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c394c5", new Object[]{this, mtopResponse, aVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = null;
        if (mtopResponse != null) {
            try {
                byte[] bytedata = mtopResponse.getBytedata();
                kotlin.jvm.internal.q.a((Object) bytedata, "response.bytedata");
                jSONObject = JSONObject.parseObject(new String(bytedata, kotlin.text.d.UTF_8));
                com.etao.feimagesearch.newresult.perf.a.k(Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Exception unused) {
            }
        }
        String a2 = a(mtopResponse);
        if (jSONObject == null) {
            aVar.a(f7030a, a2, (Integer) (-1), "parse result error");
        } else {
            aVar.a(mtopResponse, f7030a, a2, jSONObject);
        }
    }

    private final void a(String str, String str2, Map<String, String> map, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce7c00e", new Object[]{this, str, str2, map, mtopResponse});
            return;
        }
        if (XslModule.a().l().a() && com.taobao.android.searchbaseframe.chitu.c.a(XslModule.a())) {
            try {
                String a2 = com.taobao.android.searchbaseframe.util.r.a("http://mtop.taobao.com/" + str + fxb.DIR + str2, "data", JSON.toJSONString(map));
                kotlin.jvm.internal.q.a((Object) a2, "SearchUrlUtil.appendQuer…SON.toJSONString(params))");
                XslModule.a().k().a(a2, mtopResponse != null ? mtopResponse.getBytedata() : null, "plt-request", true);
            } catch (Exception unused) {
            }
        }
    }

    @JvmStatic
    public static final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null) {
        } else {
            map.put("utd_id", com.a(com.b()));
            map.put("rainbow", cof.a());
            if (!map.containsKey("m")) {
                map.put("m", "api4etao");
            }
            if (!map.containsKey("n")) {
                map.put("n", "60");
            }
            map.put("busiKey", "face,floatBar1,icons,poplayer,tjbIcon,atmosphere,resultPoplayer");
            map.put("hdpoplayer", "true");
            map.put("maxn", "60");
            map.put("vm", "nw");
            map.put("biz_type", "pai");
            map.put("setSpApp", "picture");
            map.put("closepict", "false");
            map.put("page", "1");
            map.put("from", "");
            map.put("sversion", com.h());
            map.put("musPageVersion", com.etao.feimagesearch.config.b.h());
            map.put("deviceLevel", com.etao.feimagesearch.config.c.a());
            map.put("subSearchType", "imageText_v3");
            map.put("newPhotoSearch", "true");
            if (kotlin.jvm.internal.q.a((Object) map.get(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM), (Object) PhotoFrom.Values.PRODUCT_CODE.getValue())) {
                map.put("barcodePage", "plt");
            }
            map.put("base91", "false");
            String b = com.taobao.search.common.util.f.b();
            if (!StringUtils.isEmpty(b)) {
                map.put("LBS", b);
            }
            if (StringUtils.isEmpty(map.get(noa.KEY_GLOBAL_LBS))) {
                com.taobao.search.common.util.o oVar = com.taobao.search.common.util.o.INSTANCE;
                Application b2 = com.b();
                kotlin.jvm.internal.q.a((Object) b2, "GlobalAdapter.getCtx()");
                map.put(noa.KEY_GLOBAL_LBS, oVar.c(b2));
            }
            if (StringUtils.isEmpty(map.get(noa.KEY_EDITION_CODE))) {
                map.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
            }
            String a2 = INSTANCE.a();
            if (!StringUtils.isEmpty(a2)) {
                map.put("clientIrpUserParams", a2);
            }
            if (!map.containsKey(noa.KEY_GOOD_PRICE)) {
                map.put(noa.KEY_GOOD_PRICE, String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.c()));
            }
            if (com.alibaba.ability.localization.b.c()) {
                map.put("foreignImageSearch", String.valueOf(true));
            }
            map.put("triggerElder", String.valueOf(com.etao.feimagesearch.config.b.L()));
        }
    }

    @JvmStatic
    public static final void b(Map<String, String> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{params});
            return;
        }
        kotlin.jvm.internal.q.c(params, "params");
        String str = params.get("pssource");
        StringBuilder sb = new StringBuilder("use_multi_cat:1;use_pid_summary:1;cat_deleted:1;use_pid_tag:1;extend_count:3;agg:;auction_agg:tag,svid;");
        INSTANCE.b(sb, com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, params.get(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM));
        INSTANCE.b(sb, "psfrom", params.get("psfrom"));
        INSTANCE.b(sb, "pssource", str);
        INSTANCE.b(sb, "region", params.get("region"));
        INSTANCE.b(sb, "backflow_id", params.get("backflow_id"));
        if (kotlin.jvm.internal.q.a((Object) str, (Object) "store") || kotlin.jvm.internal.q.a((Object) str, (Object) "detailsku")) {
            String str2 = params.get("sellerId");
            if (StringUtils.isEmpty(str2)) {
                str2 = params.get("sellerid");
            }
            if (StringUtils.isEmpty(str2)) {
                str2 = params.get("seller_id");
            }
            INSTANCE.b(sb, "sellid", str2);
        }
        String str3 = params.get("shopId");
        if (StringUtils.isEmpty(str3)) {
            str3 = params.get(WXConstantsOut.SHOPID);
        }
        INSTANCE.b(sb, WXConstantsOut.SHOPID, str3);
        params.put("extraParams", sb.toString());
        String l = com.etao.feimagesearch.config.b.l(str);
        if (StringUtils.isEmpty(l)) {
            return;
        }
        params.put("component", l);
    }

    private final String a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String clientIrpUserParams = com.etao.feimagesearch.k.b(com.b(), IrpMuiseModule.KEY_IRP_USER_DATA);
        if (StringUtils.isEmpty(clientIrpUserParams)) {
            return "";
        }
        if (!com.etao.feimagesearch.config.b.dq()) {
            kotlin.jvm.internal.q.a((Object) clientIrpUserParams, "clientIrpUserParams");
            return clientIrpUserParams;
        }
        JSONArray parseArray = JSON.parseArray(clientIrpUserParams);
        if (parseArray == null || parseArray.isEmpty()) {
            return "";
        }
        long j = 1000;
        long currentTimeMillis = System.currentTimeMillis() / j;
        Iterator<Object> it = parseArray.iterator();
        kotlin.jvm.internal.q.a((Object) it, "dataArrs.iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                if (com.taobao.android.searchbaseframe.util.a.a((JSONObject) next, "expirationTime", 0L) / j < currentTimeMillis) {
                    it.remove();
                }
            } else {
                it.remove();
            }
            z = true;
        }
        if (parseArray.isEmpty()) {
            com.etao.feimagesearch.k.a(com.b(), IrpMuiseModule.KEY_IRP_USER_DATA);
            return "";
        }
        String newValue = JSON.toJSONString(parseArray);
        if (z) {
            com.etao.feimagesearch.k.a(com.b(), IrpMuiseModule.KEY_IRP_USER_DATA, newValue);
        }
        kotlin.jvm.internal.q.a((Object) newValue, "newValue");
        return newValue;
    }

    private final void b(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53aac876", new Object[]{this, sb, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(";");
        }
    }

    private final String a(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf8a613", new Object[]{this, mtopResponse}) : (mtopResponse == null || mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) == null || list.size() <= 0) ? "" : list.get(0);
    }

    @JvmStatic
    public static final void a(StringBuilder extraParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97b4057", new Object[]{extraParams, str, str2});
            return;
        }
        kotlin.jvm.internal.q.c(extraParams, "extraParams");
        if (str2 == null) {
            return;
        }
        extraParams.append(str);
        extraParams.append(":");
        extraParams.append(str2);
        extraParams.append(";");
    }
}
