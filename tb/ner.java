package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.f;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.m;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.w;
import com.alibaba.jsi.standard.js.y;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class ner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1541106232);
    }

    public static w[] a(ArrayList<Object> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w[]) ipChange.ipc$dispatch("5d51740d", new Object[]{arrayList});
        }
        w[] wVarArr = null;
        if (arrayList != null && arrayList.size() > 0) {
            wVarArr = new w[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                wVarArr[i] = a(arrayList.get(i));
            }
        }
        return wVarArr;
    }

    public static w a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("eb2a78a2", new Object[]{obj});
        }
        if (obj instanceof String) {
            return new s((String) obj);
        }
        if (obj instanceof Boolean) {
            return new f(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return new m(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return new m(((Double) obj).doubleValue());
        }
        if (obj instanceof Long) {
            return new m(((Integer) obj).intValue());
        }
        if (obj instanceof w) {
            return (w) obj;
        }
        return new y();
    }

    public static Object a(w wVar, d dVar) {
        o oVar;
        com.alibaba.jsi.standard.js.d e;
        Object valueOf;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("44ebaebf", new Object[]{wVar, dVar});
        }
        if (wVar instanceof s) {
            String p_ = ((s) wVar).p_();
            wVar.a();
            return p_;
        } else if (wVar instanceof f) {
            Boolean valueOf2 = Boolean.valueOf(((f) wVar).l_());
            wVar.a();
            return valueOf2;
        } else if (wVar instanceof m) {
            m mVar = (m) wVar;
            if (mVar.h()) {
                valueOf = Integer.valueOf(mVar.j());
            } else {
                valueOf = Double.valueOf(mVar.m_());
            }
            wVar.a();
            return valueOf;
        } else {
            JSONObject jSONObject = null;
            JSONArray jSONArray = null;
            jSONObject = null;
            if (wVar instanceof com.alibaba.jsi.standard.js.d) {
                com.alibaba.jsi.standard.js.d dVar2 = (com.alibaba.jsi.standard.js.d) wVar;
                int a2 = dVar2.a(dVar);
                if (a2 > 0) {
                    jSONArray = new JSONArray();
                    while (i < a2) {
                        jSONArray.add(a(dVar2.a(dVar, i), dVar));
                        i++;
                    }
                }
                return jSONArray;
            } else if (wVar instanceof j) {
                j jVar = (j) wVar;
                String a_ = jVar.a_(dVar);
                jVar.a();
                return a_;
            } else {
                if ((wVar instanceof o) && (e = (oVar = (o) wVar).e(dVar)) != null) {
                    jSONObject = new JSONObject();
                    while (i < e.a(dVar)) {
                        w a3 = e.a(dVar, i);
                        w a4 = oVar.a(dVar, a3);
                        if (a3 instanceof s) {
                            jSONObject.put(((s) a3).p_(), a(a4, dVar));
                        }
                        a3.a();
                        a4.a();
                        i++;
                    }
                    e.a();
                    wVar.a();
                }
                return jSONObject;
            }
        }
    }
}
