package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class lwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwz f30938a;
    private String b;
    private List<SectionModel> c;
    private List<SectionModel> d;
    private List<SectionModel> e;
    private StringBuilder f;
    private AwesomeGetContainerData g;
    private Map<String, List<SectionModel>> h;
    private List<SectionModel> i;
    private boolean j;

    static {
        kge.a(1494259897);
    }

    public List<SectionModel> a(lwz lwzVar, String str, AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7102808", new Object[]{this, lwzVar, str, awesomeGetContainerData, awesomeGetContainerData2});
        }
        if (!b(lwzVar, str, awesomeGetContainerData, awesomeGetContainerData2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.c);
        List<SectionModel> list = this.d;
        if (list != null && !list.isEmpty()) {
            this.h = new HashMap(this.d.size());
            this.i = new ArrayList();
            for (SectionModel sectionModel : this.d) {
                a(sectionModel, arrayList);
            }
            a(this.h, arrayList, this.e, arrayList.size());
            if (!this.i.isEmpty()) {
                this.d.removeAll(this.i);
            }
        }
        b();
        a();
        return arrayList;
    }

    private boolean b(lwz lwzVar, String str, AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d68624", new Object[]{this, lwzVar, str, awesomeGetContainerData, awesomeGetContainerData2})).booleanValue();
        }
        if (awesomeGetContainerData == null) {
            return false;
        }
        this.f30938a = lwzVar;
        this.b = str;
        this.g = awesomeGetContainerData;
        this.c = awesomeGetContainerData.getBaseData();
        this.d = awesomeGetContainerData.getDeltaData();
        this.e = awesomeGetContainerData2 == null ? null : awesomeGetContainerData2.getTotalData();
        List<SectionModel> list = this.c;
        if (list == null || list.isEmpty()) {
            return false;
        }
        this.f = new StringBuilder();
        return true;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = false;
    }

    private void a(SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0b2576", new Object[]{this, sectionModel, list});
            return;
        }
        JSONArray jSONArray = sectionModel.getJSONArray("updateRules");
        if (jSONArray == null || jSONArray.size() <= 0) {
            this.f.append("0");
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                a((JSONObject) next, sectionModel, list);
            }
        }
    }

    private void a(JSONObject jSONObject, SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e36256", new Object[]{this, jSONObject, sectionModel, list});
            return;
        }
        String string = jSONObject.getString(StWindow.UPDATE_TYPE);
        String string2 = jSONObject.getString("updateTarget");
        String string3 = jSONObject.getString("updatePosition");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3)) {
            this.f.append("1");
            return;
        }
        int a2 = a(string2, string3, jSONObject, sectionModel, list);
        if (a2 > list.size()) {
            this.i.add(sectionModel);
            lxo.a("MergeDataCoreUtils", "targetPosition is bigger than list size");
            this.f.append("8");
        } else if (a2 < 0) {
            this.f.append("9");
        } else if (StringUtils.equals(string, "insert")) {
            list.add(a2, sectionModel);
        } else if (StringUtils.equals(string, "update")) {
            list.remove(a2);
            list.add(a2, sectionModel);
        } else if (!StringUtils.equals(string, "remove")) {
        } else {
            list.remove(a2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (r10.equals("before") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(java.lang.String r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11, com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel r12, java.util.List<com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel> r13) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lwg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r1[r6] = r9
            r1[r5] = r10
            r1[r4] = r11
            r1[r3] = r12
            r9 = 5
            r1[r9] = r13
            java.lang.String r9 = "37fc455d"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            return r9
        L28:
            java.lang.String r0 = "position"
            boolean r0 = android.text.StringUtils.equals(r0, r10)
            r1 = -1
            if (r0 == 0) goto L42
            int r9 = r8.a(r9)
            if (r9 != r1) goto L3f
            java.lang.StringBuilder r10 = r8.f
            java.lang.String r11 = "2"
            r10.append(r11)
        L3f:
            r1 = r9
            goto Laa
        L42:
            int r7 = a(r9, r13)
            if (r7 >= 0) goto L50
            java.lang.StringBuilder r9 = r8.f
            java.lang.String r10 = "3"
            r9.append(r10)
            return r1
        L50:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1392885889: goto L82;
                case -1383228885: goto L78;
                case 115029: goto L6d;
                case 92734940: goto L63;
                case 1094496948: goto L58;
                default: goto L57;
            }
        L57:
            goto L8b
        L58:
            java.lang.String r0 = "replace"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L8b
            r2 = 4
            goto L8c
        L63:
            java.lang.String r0 = "after"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L8b
            r2 = 1
            goto L8c
        L6d:
            java.lang.String r0 = "top"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L8b
            r2 = 3
            goto L8c
        L78:
            java.lang.String r0 = "bottom"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L8b
            r2 = 2
            goto L8c
        L82:
            java.lang.String r0 = "before"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L8b
            goto L8c
        L8b:
            r2 = -1
        L8c:
            if (r2 == 0) goto La8
            if (r2 == r6) goto La5
            if (r2 == r5) goto L99
            if (r2 == r4) goto L99
            if (r2 == r3) goto L97
            goto Laa
        L97:
            r1 = r7
            goto Laa
        L99:
            r0 = r8
            r1 = r12
            r2 = r9
            r3 = r7
            r4 = r10
            r5 = r11
            r6 = r13
            int r1 = r0.a(r1, r2, r3, r4, r5, r6)
            goto Laa
        La5:
            int r1 = r7 + 1
            goto Laa
        La8:
            int r1 = r7 + (-1)
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lwg.a(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel, java.util.List):int");
    }

    private int a(SectionModel sectionModel, String str, int i, String str2, JSONObject jSONObject, List<SectionModel> list) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ff32f6", new Object[]{this, sectionModel, str, new Integer(i), str2, jSONObject, list})).intValue();
        }
        List<SectionModel> list2 = this.e;
        int i3 = -1;
        int indexOf = list2 == null ? -1 : list2.indexOf(sectionModel);
        if (indexOf >= 0) {
            List<SectionModel> list3 = this.h.get(str);
            if (list3 == null) {
                list3 = new ArrayList<>();
                this.h.put(str, list3);
            }
            list3.add(sectionModel);
        } else {
            this.j = true;
            this.h.get(str);
            a(this.h, list, this.e, i);
            b b = (this.f30938a == null || StringUtils.isEmpty(this.b)) ? null : this.f30938a.b(this.b);
            if (b != null) {
                JSONObject deltaExt = this.g.getDeltaExt();
                if (StringUtils.equals("bottom", str2)) {
                    String string = jSONObject.getString("bottomInsertFree");
                    if (StringUtils.isEmpty(string) && deltaExt != null) {
                        string = deltaExt.getString("bottomInsertFree");
                    }
                    i2 = b.a(this.b, i, StringUtils.equals("true", string));
                } else if (StringUtils.equals("top", str2)) {
                    i2 = b.a(this.b, i);
                } else {
                    this.f.append("4");
                    i2 = -1;
                }
                String string2 = jSONObject.getString("exposeRatioFree");
                if (StringUtils.isEmpty(string2) && deltaExt != null) {
                    string2 = deltaExt.getString("exposeRatioFree");
                }
                boolean equals = StringUtils.equals("true", string2);
                if (i2 >= 0 && !equals) {
                    double b2 = b.b(this.b, i2);
                    float a2 = a(this.g.getDeltaExt());
                    if (a2 <= 0.0f || b2 > a2) {
                        i3 = i2;
                    } else {
                        this.f.append("5");
                    }
                    indexOf = i3;
                } else {
                    this.f.append("6");
                    indexOf = i2;
                }
            } else {
                this.f.append("7");
                indexOf = -1;
            }
            if (indexOf < 0) {
                this.i.add(sectionModel);
            } else {
                lxn.a(this.b, str, sectionModel);
            }
        }
        return indexOf;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private void a(Map<String, List<SectionModel>> map, List<SectionModel> list, List<SectionModel> list2, int i) {
        List<SectionModel> list3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f515bce4", new Object[]{this, map, list, list2, new Integer(i)});
            return;
        }
        for (String str : map.keySet()) {
            if (a(str, list2) <= i && (list3 = map.get(str)) != null && list3.size() > 0) {
                for (int size = list3.size() - 1; size >= 0; size--) {
                    SectionModel sectionModel = list3.get(size);
                    int indexOf = list.indexOf(sectionModel);
                    int indexOf2 = list2.indexOf(sectionModel);
                    if (indexOf != indexOf2) {
                        list.remove(indexOf);
                        list.add(indexOf2, sectionModel);
                    }
                }
                list3.clear();
            }
        }
    }

    public static int a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1aa3516", new Object[]{str, list})).intValue();
        }
        if (StringUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (a(list.get(i).getString("sectionBizCode"), str)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean a(String str, String str2) {
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

    private float a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("266fb78", new Object[]{this, jSONObject})).floatValue() : a(jSONObject, "windvaneDisplay", 0.2f);
    }

    private float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{this, jSONObject, str, new Float(f)})).floatValue();
        }
        try {
            JSONObject a2 = a(jSONObject, str);
            if (a2 != null && !a2.isEmpty()) {
                return a2.getFloat("exposeRatio").floatValue();
            }
            return f;
        } catch (Throwable th) {
            lxl.c("RealRecommendUtils", "getExposeRatioValue exception : " + th.getMessage());
            return f;
        }
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && !StringUtils.isEmpty(str) && (jSONObject2 = jSONObject.getJSONObject("edgeComputeConfig")) != null) {
            return jSONObject2.getJSONObject(str);
        }
        return null;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.f.length() <= 0) {
                return;
            }
            String sb = this.f.toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finalReason", (Object) sb);
            jSONObject.put("isCurrentDelta", (Object) Boolean.valueOf(this.j));
            if (this.d != null && this.d.size() > 0) {
                jSONObject.put("deltaSize", (Object) Integer.valueOf(this.d.size()));
            } else {
                jSONObject.put("deltaSize", (Object) 0);
            }
            lxl.c("MergeDataCoreUtils", "delta notReplaceReason ", sb);
            lxu.a(lxu.f30977a, 19999, "Page_Home_Delta_Lose", jSONObject);
        } catch (Throwable th) {
            lxl.a("MergeDataCoreUtils", "notReplaceReason error", th);
        }
    }
}
