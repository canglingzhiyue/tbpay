package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class qpk extends qpj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BOTTOM_BAR = "bottomBar";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_DESC_SUFFIX_SHRINK = "descSuffixShrink";
    public static final String KEY_DIVISION_DESC = "divisionDesc";
    public static final String KEY_DIVISION_RECOMMEND = "divisionRecd";
    public static final String KEY_HEADER_PIC = "headerPic";
    public static final String KEY_MAIN_SCREEN = "mainScreen";
    public static final String KEY_NAV_BAR = "navBar";
    public static final String KEY_RECOMMEND = "recommend";
    private qms A_;
    private pst j;
    private ptl k;
    private qms l;
    private qms m;
    private qms n;
    private qms o;
    private qms q;
    private tpd r;

    static {
        kge.a(-1824097328);
    }

    public qpk(JSONObject jSONObject, plc plcVar) {
        super(jSONObject, plcVar);
        a(jSONObject, plcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [tb.qms] */
    /* JADX WARN: Type inference failed for: r7v10, types: [tb.tpd] */
    /* JADX WARN: Type inference failed for: r7v2, types: [tb.qms] */
    /* JADX WARN: Type inference failed for: r7v3, types: [tb.pst] */
    /* JADX WARN: Type inference failed for: r7v4, types: [tb.ptl] */
    /* JADX WARN: Type inference failed for: r7v5, types: [tb.qms] */
    /* JADX WARN: Type inference failed for: r7v6, types: [tb.qms] */
    /* JADX WARN: Type inference failed for: r7v7, types: [tb.qms] */
    /* JADX WARN: Type inference failed for: r7v8, types: [tb.qms] */
    /* JADX WARN: Type inference failed for: r7v9, types: [tb.qms] */
    private void a(JSONObject jSONObject, plc plcVar) {
        JSONObject jSONObject2;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5d0eb1", new Object[]{this, jSONObject, plcVar});
            return;
        }
        for (String str : jSONObject.keySet()) {
            if (str != null && (jSONObject2 = jSONObject.getJSONObject(str)) != null) {
                ?? r7 = 0;
                switch (str.hashCode()) {
                    case -1855408664:
                        if (str.equals("bottomBar")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1724546052:
                        if (str.equals("description")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1655995170:
                        if (str.equals("divisionDesc")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1655578591:
                        if (str.equals(KEY_DIVISION_RECOMMEND)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052597264:
                        if (str.equals("navBar")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -213307459:
                        if (str.equals("headerPic")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 449233797:
                        if (str.equals("mainScreen")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 844540395:
                        if (str.equals("descSuffixShrink")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 989204668:
                        if (str.equals("recommend")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        r7 = new qms(jSONObject2, plcVar);
                        this.A_ = r7;
                        break;
                    case 1:
                        r7 = new pst(jSONObject2, plcVar);
                        this.j = r7;
                        break;
                    case 2:
                        r7 = new ptl(jSONObject2, plcVar);
                        this.k = r7;
                        break;
                    case 3:
                        r7 = new qms(jSONObject2, plcVar);
                        this.l = r7;
                        break;
                    case 4:
                        r7 = new qms(jSONObject2, plcVar);
                        this.q = r7;
                        break;
                    case 5:
                        r7 = new qms(jSONObject2, plcVar);
                        this.m = r7;
                        break;
                    case 6:
                        r7 = new qms(jSONObject2, plcVar);
                        this.n = r7;
                        break;
                    case 7:
                        r7 = new qms(jSONObject2, plcVar);
                        this.o = r7;
                        break;
                    case '\b':
                        r7 = new tpd(jSONObject2, plcVar);
                        this.r = r7;
                        break;
                }
                if (r7 != 0) {
                    a((qms) r7);
                }
            }
        }
    }

    public Map<String, qms> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ptl ptlVar = this.k;
        if (ptlVar != null) {
            linkedHashMap.put("mainScreen", ptlVar);
        }
        qms qmsVar = this.l;
        if (qmsVar != null) {
            linkedHashMap.put("divisionDesc", qmsVar);
        }
        qms qmsVar2 = this.m;
        if (qmsVar2 != null) {
            linkedHashMap.put("description", qmsVar2);
        }
        qms qmsVar3 = this.q;
        if (qmsVar3 != null) {
            linkedHashMap.put("descSuffixShrink", qmsVar3);
        }
        qms qmsVar4 = this.n;
        if (qmsVar4 != null) {
            linkedHashMap.put(KEY_DIVISION_RECOMMEND, qmsVar4);
        }
        qms qmsVar5 = this.o;
        if (qmsVar5 != null) {
            linkedHashMap.put("recommend", qmsVar5);
        }
        return linkedHashMap;
    }

    public qms d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qms) ipChange.ipc$dispatch("261e9a44", new Object[]{this}) : this.A_;
    }

    public qms<eze> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qms) ipChange.ipc$dispatch("2dd03fa3", new Object[]{this}) : this.j;
    }

    public ptl f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ptl) ipChange.ipc$dispatch("35818a11", new Object[]{this}) : this.k;
    }

    public tpd i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tpd) ipChange.ipc$dispatch("4c983bae", new Object[]{this}) : this.r;
    }
}
