package com.taobao.realtimerecommend;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.statistic.TBS;
import com.taobao.tao.homepage.d;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.jqm;
import tb.kge;
import tb.ksk;
import tb.ksp;
import tb.kss;
import tb.nlr;
import tb.ope;
import tb.oqc;
import tb.seb;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_FIRST_APPEAR = "isFirstAppear";
    public static final String IS_USER_ACTION_TRACKED = "isUserActionTracked";

    /* renamed from: a  reason: collision with root package name */
    private static String f18968a;

    static {
        kge.a(446811780);
        f18968a = "RealRecommendUtils";
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null && jSONObject.getJSONObject("edgeComputeConfig") != null && jSONObject.getJSONObject("edgeComputeConfig").getJSONObject("edgeComputeRequest") != null && jSONObject.getJSONObject("edgeComputeConfig").getJSONObject("edgeComputeRequest").getJSONObject("config") != null) {
            return jSONObject.getJSONObject("edgeComputeConfig").getJSONObject("edgeComputeRequest").getJSONObject("config");
        }
        return null;
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7af4d51", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && jSONObject.getJSONObject("edgeComputeConfig") != null && jSONObject.getJSONObject("edgeComputeConfig").getJSONObject(str) != null && jSONObject.getJSONObject("edgeComputeConfig").getJSONObject(str).getJSONObject("config") != null) {
            return jSONObject.getJSONObject("edgeComputeConfig").getJSONObject(str).getJSONObject("config");
        }
        return null;
    }

    public static float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        try {
            JSONObject c = c(jSONObject, str);
            if (c != null && !c.isEmpty()) {
                return c.getFloat("exposeRatio").floatValue();
            }
            return f;
        } catch (Throwable th) {
            e.e("RealRecommendUtils", "getExposeRatioValue exception : " + th.getMessage());
            return f;
        }
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a0a6430", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && !StringUtils.isEmpty(str) && (jSONObject2 = jSONObject.getJSONObject("edgeComputeConfig")) != null) {
            return jSONObject2.getJSONObject(str);
        }
        return null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : StringUtils.equals("l", g.b());
    }

    public static List<SectionModel> a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SectionModel sectionModel = new SectionModel();
            SectionModel sectionModel2 = list.get(i);
            if (sectionModel2 != null && !sectionModel2.getBooleanValue(IS_USER_ACTION_TRACKED)) {
                sectionModel.put("sectionBizCode", (Object) sectionModel2.getString("sectionBizCode"));
                JSONObject jSONObject = sectionModel2.getJSONObject("args");
                if (jSONObject != null) {
                    if (jSONObject.getJSONObject("utLogMapEdge") != null) {
                        sectionModel.put("utLogMapEdge", (Object) jSONObject.getJSONObject("utLogMapEdge"));
                    }
                    if (jSONObject.getString("spm") != null) {
                        sectionModel.put("spm", (Object) jSONObject.getString("spm"));
                    }
                }
                arrayList.add(sectionModel);
            }
        }
        return arrayList;
    }

    public static void a(final String str, final List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (!jqm.a()) {
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.realtimerecommend.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
                        ArrayList arrayList2 = new ArrayList();
                        if (arrayList.size() > 0) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                arrayList2.add(((SectionModel) arrayList.get(i)).getString("sectionBizCode"));
                                String str2 = null;
                                if (((SectionModel) arrayList.get(i)).getJSONObject("args") != null) {
                                    str2 = ((SectionModel) arrayList.get(i)).getJSONObject("args").getString("isFixPos");
                                }
                                if (StringUtils.equals(str2, "true")) {
                                    arrayList2.set(arrayList2.size() - 1, ((String) arrayList2.get(arrayList2.size() - 1)) + ":**fixPos**");
                                }
                            }
                        }
                        String jSONString = JSON.toJSONString(arrayList2);
                        if (jqm.a()) {
                            String str3 = kss.f30292a;
                            TBS.Ext.commitEvent(str3, 19999, "rerank_sectionBizCode_list", null, null, str + " = " + jSONString);
                        }
                        ksp.b("real_time_rec", str + " = " + jSONString);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.alibaba.fastjson.JSONObject r22, android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.realtimerecommend.j.a(com.alibaba.fastjson.JSONObject, android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.alibaba.fastjson.JSONObject r9, android.view.View r10, int r11) {
        /*
            java.lang.String r0 = "spm"
            java.lang.String r1 = "isFirstAppear"
            java.lang.String r2 = ""
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.realtimerecommend.j.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L25
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r9 = 1
            r0[r9] = r10
            r9 = 2
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r0[r9] = r10
            java.lang.String r9 = "5863d318"
            r3.ipc$dispatch(r9, r0)
            return
        L25:
            if (r9 != 0) goto L28
            return
        L28:
            java.lang.String r3 = "args"
            com.alibaba.fastjson.JSONObject r3 = r9.getJSONObject(r3)
            if (r3 != 0) goto L31
            return
        L31:
            java.lang.String r4 = "utLogMapEdge"
            com.alibaba.fastjson.JSONObject r4 = r3.getJSONObject(r4)
            if (r4 != 0) goto L3b
            return
        L3b:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            java.lang.String r6 = "x_item_ids"
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> Lb4
            boolean r7 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L54
            java.lang.String r7 = "x_object_id"
            java.lang.String r6 = r4.getString(r7)     // Catch: java.lang.Throwable -> Lb5
        L54:
            com.taobao.realtimerecommend.b r7 = new com.taobao.realtimerecommend.b     // Catch: java.lang.Throwable -> Lb5
            r7.<init>(r10, r6)     // Catch: java.lang.Throwable -> Lb5
            r10.post(r7)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "itemId"
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "realExposeIndex"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lb5
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> Lb5
            r7 = 0
            tb.ope r7 = com.taobao.tao.homepage.d.f(r7)     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L8e
            tb.oqc r8 = tb.oqc.a()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = r8.m()     // Catch: java.lang.Throwable -> Lb5
            com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData r7 = r7.c(r8)     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L8e
            java.lang.String r8 = "infoFlowIndex"
            int r7 = r7.infoFlowCardStartOffset     // Catch: java.lang.Throwable -> Lb5
            int r11 = r11 - r7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lb5
            r5.put(r8, r11)     // Catch: java.lang.Throwable -> Lb5
        L8e:
            boolean r11 = r9.getBooleanValue(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> Lb5
            r5.put(r1, r11)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r11 = "itemType"
            java.lang.String r1 = "x_object_type"
            java.lang.String r1 = r4.getString(r1)     // Catch: java.lang.Throwable -> Lb5
            r5.put(r11, r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r11 = "utLogMap"
            r5.put(r11, r4)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r11 = r3.getString(r0)     // Catch: java.lang.Throwable -> Lb5
            r5.put(r0, r11)     // Catch: java.lang.Throwable -> Lb5
            goto Lbd
        Lb4:
            r6 = r2
        Lb5:
            java.lang.String r11 = com.taobao.realtimerecommend.j.f18968a
            java.lang.String r0 = "trackRecyclerViewScroll utLogMap"
            tb.ksp.c(r11, r0)
        Lbd:
            java.lang.String r11 = "exposureParam"
            com.alibaba.fastjson.JSONObject r9 = r9.getJSONObject(r11)
            if (r9 == 0) goto Ld4
            java.lang.String r11 = "arg1"
            java.lang.String r2 = r9.getString(r11)
            java.lang.String r11 = "page"
            java.lang.String r9 = r9.getString(r11)
            goto Ld5
        Ld4:
            r9 = r2
        Ld5:
            java.lang.String[] r11 = tb.nlr.b(r5)
            com.taobao.android.behavix.h.a(r9, r2, r6, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.realtimerecommend.j.b(com.alibaba.fastjson.JSONObject, android.view.View, int):void");
    }

    public static void c(JSONObject jSONObject, View view, int i) {
        AwesomeGetContainerInnerData c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e550ea37", new Object[]{jSONObject, view, new Integer(i)});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = new JSONObject(10);
            if (jSONObject2 != null) {
                jSONObject3.put("spm", (Object) jSONObject2.getString("spm"));
                jSONObject3.put("scm", (Object) jSONObject2.getString("scm"));
                jSONObject3.put("guess_buckets", (Object) jSONObject2.getString("guess_buckets"));
            }
            ope f = d.f(null);
            if (f != null && (c = f.c(oqc.a().m())) != null) {
                jSONObject3.put("infoFlowIndex", (Object) Integer.valueOf(i - c.infoFlowCardStartOffset));
            }
            jSONObject3.put("isFirstAppear", (Object) Boolean.valueOf(jSONObject.getBooleanValue("isFirstAppear")));
            JSONObject jSONObject4 = jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM);
            if (jSONObject4 == null) {
                return;
            }
            com.taobao.android.behavix.h.a(jSONObject4.getString("page"), jSONObject4.getString("arg1"), "", view, nlr.b(jSONObject3));
        }
    }

    public static String a(String str) {
        ksk a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (!b(str) && (a2 = ksk.a(str)) != null) ? a2.c : "Page_Home";
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (oqc.b(str)) {
            return true;
        }
        return str != null && str.startsWith(ksk.REC_MAIN.f30287a);
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        ksk a2 = ksk.a(str);
        if (a2 != null) {
            str2 = a2.c;
        } else {
            str2 = (str == null || !str.startsWith(ksk.REC_MAIN.f30287a)) ? "" : kss.f30292a;
        }
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        HashMap hashMap = new HashMap();
        long b = b(jSONObject);
        if (b > 0) {
            hashMap.put("requestCost", b + "");
        }
        JSONObject b2 = b();
        if (b2 != null && !b2.isEmpty()) {
            hashMap.put("edgeRtFeature", b2.toJSONString());
        }
        hashMap.put("containerId", str);
        hashMap.put("action", "requestEndLoadNext");
        if (jSONObject != null) {
            hashMap.put(i.CDN_REQUEST_TYPE, jSONObject.getString(i.CDN_REQUEST_TYPE));
            hashMap.put(BioDetector.EXT_KEY_PAGENUM, a(jSONObject, str) + "");
        }
        seb.a(str2, str, (String) null, com.taobao.android.behavix.j.c(hashMap));
    }

    private static long b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b9981b", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return jSONObject.getLongValue("requestEndTime") - jSONObject.getLongValue("requestStartTime");
        }
        return -1L;
    }

    private static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[0]);
        }
        JSONObject c = d.a().c();
        if (c != null && !c.isEmpty()) {
            return c.getJSONObject("edgeRtFeature");
        }
        return null;
    }

    private static int a(JSONObject jSONObject, String str) {
        AwesomeGetData awesomeGetData;
        AwesomeGetContainerData awesomeGetContainerData;
        AwesomeGetPageData mo1280getPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48075345", new Object[]{jSONObject, str})).intValue();
        }
        if (!StringUtils.isEmpty(str) && (awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel")) != null && (awesomeGetContainerData = awesomeGetData.containers.get(str)) != null && awesomeGetContainerData.base != null && (mo1280getPageParams = awesomeGetContainerData.base.mo1280getPageParams()) != null) {
            return mo1280getPageParams.getPageNum();
        }
        return 0;
    }
}
