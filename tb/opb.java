package tb;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.core.b;
import com.taobao.android.gateway.datastructure.a;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend3.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class opb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f32249a;
    public static a b;
    public static a c;
    public static a d;
    public static a e;
    public static a f;
    public static a g;
    public static a h;
    private static Map<String, gjv> i;

    public static long a(Context context, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9e58", new Object[]{context, new Long(j)})).longValue() : j;
    }

    private static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "baseRefresh" : "deltaRefresh";
    }

    static {
        kge.a(-1125595821);
        f32249a = "preloadOptimize";
        b = new a(c());
        c = new a(c() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
        d = new a(c() + ".error");
        e = new a(c() + ".loading");
        f = new a(c() + ".*.overlay");
        g = new a(c() + ".*.dinamicX");
        h = new a(c() + ".*.video");
        i = new ConcurrentHashMap(16);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b = new a(c());
        c = new a(c() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
        d = new a(c() + ".error");
        e = new a(c() + ".loading");
        f = new a(c() + ".*.overlay");
        g = new a(c() + ".*.dinamicX");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        if (android.text.StringUtils.equals("cover", r5) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel> a(java.lang.String r20, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData r21, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData r22) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.opb.a(java.lang.String, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData):java.util.List");
    }

    private static void a(JSONArray jSONArray, List<SectionModel> list, SectionModel sectionModel, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c632fb7", new Object[]{jSONArray, list, sectionModel, new Integer(i2)});
        } else if (!d()) {
            e.e("gw2.GatewayUtils", "enableUpdateDataByRefreshPaths is false");
        } else if (jSONArray == null || jSONArray.isEmpty() || i2 < 0) {
            e.e("gw2.GatewayUtils", "refreshPaths is null or empty");
        } else {
            SectionModel sectionModel2 = new SectionModel(list.get(i2));
            Iterator<Object> it = jSONArray.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    e.e("gw2.GatewayUtils", "refreshPath is not JSONObject");
                } else {
                    String string = ((JSONObject) next).getString("path");
                    if (StringUtils.isEmpty(string)) {
                        e.e("gw2.GatewayUtils", "path is empty");
                    } else {
                        int lastIndexOf = string.lastIndexOf(".");
                        String substring = lastIndexOf > 0 ? string.substring(0, lastIndexOf) : "";
                        String substring2 = string.substring(lastIndexOf + 1);
                        Object a2 = HomePageUtility.a((JSONObject) sectionModel2, substring);
                        Object a3 = HomePageUtility.a((JSONObject) sectionModel, string);
                        if (StringUtils.isEmpty(substring2) || a2 == null || a3 == null) {
                            e.e("gw2.GatewayUtils", "replaceKey or parentObj or targetObj is null or empty");
                        } else if (a2 instanceof JSONObject) {
                            ((JSONObject) a2).put(substring2, a3);
                            e.e("gw2.GatewayUtils", "refresh path success: " + string);
                        }
                    }
                }
                z = true;
            }
            if (z) {
                ldg.b("merge_path_data_error", "Page_Home", null);
                return;
            }
            list.remove(i2);
            list.add(i2, sectionModel2);
        }
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : j.a("enableUpdateDataByRefreshPaths", true);
    }

    public static void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804c6060", new Object[]{awesomeGetContainerData, awesomeGetContainerData2});
        } else if (awesomeGetContainerData != null && awesomeGetContainerData2 != null) {
            if (awesomeGetContainerData2.base == null || !awesomeGetContainerData2.base.dataChange || awesomeGetContainerData2.getPageNum() != 0) {
                z = false;
            }
            String a2 = a(z);
            List<SectionModel> deltaData = awesomeGetContainerData.getDeltaData();
            List<SectionModel> deltaData2 = awesomeGetContainerData2.getDeltaData();
            ArrayList arrayList = new ArrayList();
            if (StringUtils.equals(a2, "deltaRefresh")) {
                arrayList.add("baseRefresh");
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (StringUtils.equals(a2, "baseRefresh")) {
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (StringUtils.equals(a2, "pageExit")) {
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (StringUtils.equals(a2, "appExit")) {
                arrayList.add("never");
            } else {
                StringUtils.equals(a2, "never");
            }
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty() && deltaData != null) {
                for (SectionModel sectionModel : deltaData) {
                    if (arrayList.contains(sectionModel.getString("invalidType"))) {
                        arrayList2.add(sectionModel);
                    }
                }
            }
            if (deltaData2 != null) {
                for (int i2 = 0; i2 < deltaData2.size(); i2++) {
                    SectionModel sectionModel2 = deltaData2.get(i2);
                    if (a(sectionModel2.getString("keep"))) {
                        int a3 = a(sectionModel2, deltaData);
                        if (a3 >= 0) {
                            SectionModel sectionModel3 = deltaData.get(a3);
                            if (a(sectionModel3, arrayList2) < 0) {
                                arrayList2.add(sectionModel3);
                            }
                        }
                    } else {
                        int a4 = a(sectionModel2, arrayList2);
                        if (a4 >= 0) {
                            arrayList2.remove(a4);
                        }
                        arrayList2.add(sectionModel2);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                awesomeGetContainerData2.delta = null;
                return;
            }
            if (awesomeGetContainerData2.delta == null) {
                awesomeGetContainerData2.delta = awesomeGetContainerData.delta.m1279clone();
            }
            awesomeGetContainerData2.delta.sections = arrayList2;
        }
    }

    private static void a(Map<String, List<SectionModel>> map, List<SectionModel> list, List<SectionModel> list2, int i2) {
        List<SectionModel> list3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f515bce4", new Object[]{map, list, list2, new Integer(i2)});
            return;
        }
        for (String str : map.keySet()) {
            if (a(str, list2) <= i2 && (list3 = map.get(str)) != null && list3.size() > 0) {
                for (int size = list3.size() - 1; size >= 0; size--) {
                    SectionModel sectionModel = list3.get(size);
                    int indexOf = list.indexOf(sectionModel);
                    int indexOf2 = list2.indexOf(sectionModel);
                    if (indexOf != indexOf2) {
                        if (indexOf >= 0) {
                            list.remove(indexOf);
                        }
                        if (indexOf2 >= 0 && indexOf2 <= list.size()) {
                            list.add(indexOf2, sectionModel);
                        }
                    }
                }
                list3.clear();
            }
        }
    }

    public static int a(SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a0b2569", new Object[]{sectionModel, list})).intValue();
        }
        if (sectionModel == null || list == null || list.isEmpty()) {
            return -1;
        }
        int indexOf = list.indexOf(sectionModel);
        return indexOf >= 0 ? indexOf : a(sectionModel.getString("sectionBizCode"), list);
    }

    public static int a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1aa3516", new Object[]{str, list})).intValue();
        }
        if (StringUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (a(list.get(i2).getString("sectionBizCode"), str)) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.equals(str, str2)) {
            if (!StringUtils.equals(str + "_delta", str2)) {
                if (!StringUtils.equals(str, str2 + "_delta")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static AwesomeGetContainerInnerData a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("33b3ec9e", new Object[]{awesomeGetContainerData});
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.getDeltaData() == null) {
            return null;
        }
        AwesomeGetContainerInnerData m1279clone = awesomeGetContainerData.delta.m1279clone();
        for (SectionModel sectionModel : awesomeGetContainerData.getDeltaData()) {
            if (!StringUtils.equals(sectionModel.getString("invalidType"), "never")) {
                m1279clone.sections.remove(sectionModel);
            }
        }
        return m1279clone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0 != 4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.opb.a(java.lang.String):boolean");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String a2 = i.a();
        return a2.equalsIgnoreCase("main") ? "recommend_home_main" : a2.equalsIgnoreCase(h.HOMEPAGE_CTAO) ? "recommend_home_cun" : a2.equalsIgnoreCase("old") ? "recommend_home_old" : "recommend_home_intl";
    }

    public static JSONObject a(String str, a aVar, JSONObject jSONObject, int i2, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2cfba279", new Object[]{str, aVar, jSONObject, new Integer(i2), jSONObject2});
        }
        laq a2 = laq.a().a("MTopRequest").b(b.TRIGGER_REQUEST).c("gw2.GatewayUtils.triggerEvent").c("非newFace或非首页发起网络请求").a(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        String a3 = a(jSONObject);
        jSONObject2.put("containerId", (Object) a3);
        a2.a("containerId", a3).b();
        if (jSONObject2.getJSONObject("bizParam") != null) {
            jSONObject3 = jSONObject2.getJSONObject("bizParam");
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject2.put("bizParam", (Object) jSONObject4);
            jSONObject3 = jSONObject4;
        }
        if (jSONObject2.getString(f32249a) != null) {
            String str2 = f32249a;
            jSONObject3.put(str2, (Object) jSONObject2.getString(str2));
        }
        if (i2 >= 0) {
            jSONObject3.put("tabIndex", (Object) Integer.valueOf(i2 + 1));
        }
        if (jSONObject != null) {
            jSONObject3.put("appId", (Object) jSONObject.getString("appId"));
        }
        jSONObject3.put("new2021UIEnable", (Object) Boolean.valueOf(com.taobao.tao.homepage.revision.a.a().e()));
        jSONObject3.put(com.taobao.homepage.view.widgets.bgcontainer.a.IS_COMPLEX_TEXTURE, (Object) Boolean.valueOf(com.taobao.homepage.view.widgets.bgcontainer.a.b()));
        e.b("xingze", "triggerEvent=" + str);
        if (StringUtils.equals(str, "PageBack")) {
            c.a(a3);
            JSONObject b2 = c.b(a3);
            if (b2 != null) {
                for (String str3 : b2.keySet()) {
                    String string = b2.getString(str3);
                    jSONObject3.put(str3, (Object) b2.getString(str3));
                    if (StringUtils.equals("itemId", str3)) {
                        c.a(a3, string);
                    }
                }
            }
        } else {
            String a4 = ooi.a(a3);
            if (!StringUtils.isEmpty(a4)) {
                jSONObject3.put("guessModelVersion", (Object) a4);
            }
        }
        if (StringUtils.equals(str, "modelCompute")) {
            return jSONObject2;
        }
        com.taobao.android.gateway.datastructure.b bVar = new com.taobao.android.gateway.datastructure.b(str, aVar, jSONObject2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null) {
            d.b(a3).a(message);
        }
        return jSONObject2;
    }

    public static JSONObject a(String str, a aVar, JSONObject jSONObject) {
        com.taobao.android.gateway.msgcenter.b b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2f6252c", new Object[]{str, aVar, jSONObject});
        }
        laq.a().a("GatewayEvents").b("triggerSimpleEventByNewFace").c("gw2.GatewayUtils.triggerSimpleEventByNewFace;").c("触发网关事件;").a(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, str).b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.taobao.android.gateway.datastructure.b bVar = new com.taobao.android.gateway.datastructure.b(str, aVar, jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null && (b2 = d.b(oqc.a().m())) != null) {
            b2.a(message);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.alibaba.fastjson.JSONObject] */
    public static JSONObject a(String str, a aVar, String[] strArr, JSONObject jSONObject) {
        JSONObject jSONObject2;
        com.taobao.android.gateway.msgcenter.b b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5b41035", new Object[]{str, aVar, strArr, jSONObject});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!StringUtils.equals("ViewAppear", str)) {
            laq.a().a("MTopRequest").b("triggerNewFaceRequest").c("gw2.GatewayUtils.triggerEventByNewFace;").c("触发newFace网络请求;").a(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, str).b();
        }
        JSONObject jSONObject3 = jSONObject == null ? new JSONObject() : jSONObject;
        if (strArr == null) {
            return jSONObject3;
        }
        jSONObject3.put("containers", (Object) strArr);
        if (jSONObject3.getJSONObject("bizParam") != null) {
            jSONObject2 = jSONObject3.getJSONObject("bizParam");
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject3.put("bizParam", (Object) jSONObject4);
            jSONObject2 = jSONObject4;
        }
        if (jSONObject3.getString(f32249a) != null) {
            String str2 = f32249a;
            jSONObject2.put(str2, jSONObject3.getString(str2));
        }
        Map<String, String> k = com.taobao.tao.topmultitab.c.a().k(str);
        if (k != null && !k.isEmpty()) {
            jSONObject2.putAll(k);
        }
        lar.k("guessModelVersion");
        for (String str3 : strArr) {
            if (StringUtils.equals(str, "PageBack") && oqc.a().c(str3)) {
                c.a(str3);
                JSONObject b3 = c.b(str3);
                if (b3 != null) {
                    for (String str4 : b3.keySet()) {
                        String string = b3.getString(str4);
                        jSONObject2.put(str4, b3.getString(str4));
                        if (StringUtils.equals("itemId", str4)) {
                            c.a(str3, string);
                        }
                    }
                }
            } else {
                String a2 = ooi.a(str3);
                if (!StringUtils.isEmpty(a2)) {
                    jSONObject2.put("guessModelVersion", a2);
                }
            }
        }
        lar.l("guessModelVersion");
        if (StringUtils.equals(str, "modelCompute")) {
            return jSONObject3;
        }
        jSONObject3.put(oqd.MTOP_STAGE_ASSEMBLEPARAMS_STARTTIME, (Object) Long.valueOf(uptimeMillis));
        if (StringUtils.equals(str, "ColdStart") && com.taobao.homepage.utils.i.f()) {
            jSONObject3.put("forceRequest", (Object) true);
            oqc.a().a("ColdStart", strArr, "coldStart", jSONObject3);
            return jSONObject3;
        }
        com.taobao.android.gateway.datastructure.b bVar = new com.taobao.android.gateway.datastructure.b(str, aVar, jSONObject3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null && (b2 = d.b(oqc.a().m())) != null) {
            b2.a(message);
        }
        if (StringUtils.equals(str, "LoadCache")) {
            oqd.b("gateWay", str, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis), null);
        }
        return jSONObject3;
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return c();
        }
        return jSONObject.getString("containerId");
    }

    private static void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!jqm.a()) {
        } else {
            new Handler(Globals.getApplication().getMainLooper()).post(new Runnable() { // from class: tb.opb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Application application = Globals.getApplication();
                    Toast.makeText(application, "Error:" + str, 0).show();
                }
            });
        }
    }
}
