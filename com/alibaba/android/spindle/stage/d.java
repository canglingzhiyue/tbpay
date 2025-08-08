package com.alibaba.android.spindle.stage;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.g;
import com.taobao.analysis.v3.h;
import com.taobao.analysis.v3.n;
import com.taobao.analysis.v3.r;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import tb.bge;
import tb.mys;
import tb.myx;
import tb.myz;
import tb.mze;
import tb.oqd;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2425a;
    private Map<String, String> b;
    private Map<String, n> c;
    private boolean d;

    public d(String str) {
        this(str, null);
    }

    public d(String str, Map<String, String> map) {
        this.f2425a = str;
        this.b = map;
        this.c = new HashMap();
        this.d = bge.a(OrangeConfig.getInstance().getConfig(com.alibaba.android.umbrella.trace.b.ORANGE_GROUP_NAME, "UmbrellaFullTraceSwitch", "true"), false);
    }

    public void a(String str, String str2) {
        r rVar;
        n c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!this.d || (rVar = FalcoGlobalTracer.get()) == null) {
        } else {
            r.a a2 = rVar.a(str, str2);
            if ("Page_Ultron".equals(str)) {
                Map<String, String> map = this.b;
                if (map != null) {
                    a2.b(rVar.a(map));
                }
                c = a2.b();
            } else {
                c = a2.c();
            }
            this.c.put(str2, c);
        }
    }

    public void a(String str, String str2, Long l) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f854dbb", new Object[]{this, str, str2, l});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || !this.d || (nVar = this.c.get(str)) == null) {
        } else {
            boolean z = nVar instanceof h;
            boolean z2 = nVar instanceof g;
            if (com.taobao.analysis.v3.a.PRE_PROCESS.equals(str2)) {
                if (z2) {
                    ((g) nVar).a(l);
                } else if (!z) {
                } else {
                    ((h) nVar).a(l);
                }
            } else if (oqd.MTOP_STAGE_NETWORKREQUEST.equals(str2)) {
                if (z2) {
                    ((g) nVar).b(l);
                } else if (!z) {
                } else {
                    ((h) nVar).b(l);
                }
            } else if ("dataParse".equals(str2)) {
                if (z2) {
                    ((g) nVar).c(l);
                } else if (!z) {
                } else {
                    ((h) nVar).c(l);
                }
            } else if (!"viewRender".equals(str2)) {
            } else {
                if (z2) {
                    ((g) nVar).d(l);
                } else if (!z) {
                } else {
                    ((h) nVar).d(l);
                }
            }
        }
    }

    public void a(String str, String str2, int i, boolean z) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6998bead", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
        } else if (!this.d || (nVar = this.c.get(str)) == null) {
        } else {
            if ("viewRender".equals(str2)) {
                if (nVar instanceof g) {
                    ((g) nVar).e(null);
                } else if (nVar instanceof h) {
                    ((h) nVar).e(null);
                }
                a(str, z ? 1 : 0);
                return;
            }
            new mze(str2).a(nVar, Integer.valueOf(i));
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!this.d) {
        } else {
            n nVar = this.c.get(str);
            if (nVar != null && i == 0) {
                nVar.b("succeed");
            } else if (nVar != null && 1 == i) {
                nVar.b("failed");
            }
            this.c.remove(str);
        }
    }

    public Map<String, String> a(String str) {
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        n nVar = this.c.get(str);
        if (nVar == null || (rVar = FalcoGlobalTracer.get()) == null) {
            return null;
        }
        mys h = nVar.h();
        HashMap hashMap = new HashMap();
        rVar.a(h, myx.a.TEXT_MAP, new myz(hashMap));
        return hashMap;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<String, n> map = this.c;
        if (map == null) {
            return;
        }
        map.clear();
    }
}
