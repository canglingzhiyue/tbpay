package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.android.behavix.j;
import com.taobao.android.behavix.utils.b;
import com.taobao.tao.log.TLog;
import tb.mto;

/* loaded from: classes4.dex */
public class dsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1119599943);
    }

    public static void a(drs drsVar, String str, long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bf55dd", new Object[]{drsVar, str, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
        } else if (drsVar == null || !a.b.e() || StringUtils.equals("exposeEnd", drsVar.g)) {
        } else {
            b(drsVar, str, j);
            if (StringUtils.equals("exposeStart", str)) {
                return;
            }
            if (StringUtils.equals("scrollEnd", str)) {
                a(drsVar, str, j2, j3, j4, j5, j6);
            } else if (StringUtils.equals("exposeEnd", str)) {
                b(drsVar);
            } else {
                a(drsVar);
            }
            c(drsVar);
        }
    }

    public static void a(drs drsVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdc4447", new Object[]{drsVar, str, new Long(j)});
        } else {
            a(drsVar, str, j, 0L, 0L, 0L, 0L, 0L);
        }
    }

    private static void b(drs drsVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850c8426", new Object[]{drsVar, str, new Long(j)});
            return;
        }
        drsVar.d = drsVar.g;
        drsVar.e = drsVar.h;
        drsVar.g = str;
        drsVar.h = j;
    }

    private static void a(drs drsVar, String str, double d, double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d284c1", new Object[]{drsVar, str, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5)});
        } else if (!StringUtils.equals("scrollEnd", str)) {
        } else {
            drsVar.f = drsVar.i;
            double d6 = d * d2;
            double d7 = d3 * d4;
            if (d7 == mto.a.GEO_NOT_SUPPORT || d5 == mto.a.GEO_NOT_SUPPORT) {
                drsVar.i = mto.a.GEO_NOT_SUPPORT;
            } else {
                drsVar.i = (Math.pow(d6 / d7, 2.0d) * d6) / d5;
            }
        }
    }

    private static void a(drs drsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b54b13", new Object[]{drsVar});
        } else {
            drsVar.f = drsVar.i;
        }
    }

    private static void b(drs drsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4385194", new Object[]{drsVar});
            return;
        }
        drsVar.f = drsVar.i;
        drsVar.i = mto.a.GEO_NOT_SUPPORT;
    }

    private static void c(final drs drsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2bb5815", new Object[]{drsVar});
        } else if (StringUtils.equals("leave", drsVar.d) || StringUtils.isEmpty(drsVar.d)) {
        } else {
            if (drsVar.e == 0 || drsVar.h == 0) {
                TLog.logd("BehaviX", "computeExposeFocusDur", "TriggerTime == 0");
                return;
            }
            double d = ((drsVar.h - drsVar.e) * (drsVar.f + drsVar.i)) / 2.0d;
            drsVar.j += d;
            if (StringUtils.equals("exposeEnd", drsVar.g) && drsVar.j == mto.a.GEO_NOT_SUPPORT) {
                drsVar.j = 1.0d;
            }
            if (drsVar.f26931a == null) {
                drsVar.f26931a = new JSONObject();
            }
            drsVar.f26931a.put("exposeFocusDur", (Object) Long.valueOf((long) Math.ceil(drsVar.j)));
            if (!StringUtils.equals("exposeEnd", drsVar.g) && d <= mto.a.GEO_NOT_SUPPORT) {
                return;
            }
            if ((StringUtils.equals("scrollStart", drsVar.g) || StringUtils.equals("scrollEnd", drsVar.g)) && !a.b.d()) {
                return;
            }
            dsc.a(new b("ExposeCompute") { // from class: tb.dsa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (StringUtils.equals(drsVar.d, "exposeEnd") || StringUtils.equals(drsVar.g, "exposeEnd")) {
                    } else {
                        JSONObject jSONObject = drsVar.f26931a;
                        if (!a.a("enableExpSeries", false) && jSONObject != null) {
                            jSONObject.put("exposeSeries", (Object) new JSONArray());
                        }
                        drsVar.b.k = j.a(jSONObject);
                        BHXCXXInnerBridge.transferBaseNodeToBUFS(drsVar.b, "exposeUpdate");
                    }
                }
            });
        }
    }
}
