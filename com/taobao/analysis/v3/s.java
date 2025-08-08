package com.taobao.analysis.v3;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.ALog;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationPO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.dit;
import tb.mto;
import tb.mzq;

/* loaded from: classes.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f8593a = "falco";
    private static String c = "_monitor";
    private List<String> d = new ArrayList();
    private Map<String, String> e = new HashMap();
    private Set<String> f = new HashSet();
    private Set<String> g = new HashSet();
    private r h;

    public static /* synthetic */ void a(s sVar, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5a2f48", new Object[]{sVar, oVar});
        } else {
            sVar.b(oVar);
        }
    }

    public static /* synthetic */ void b(s sVar, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ee3849", new Object[]{sVar, oVar});
        } else {
            sVar.c(oVar);
        }
    }

    public s(r rVar) {
        this.h = rVar;
        a();
        b();
        c();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.put(o.e.a(), "module");
        this.e.put(o.g.a(), ExperimentCognationPO.TYPE_LAYER);
        this.e.put(o.f.a(), "status");
        this.e.put(o.h.a(), NWFullTracePlugin.FullTraceJSParam.STAGES);
        this.e.put(o.i.a(), "pStage");
        this.e.put("_scene", "scene");
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = this.e.get(str);
        return StringUtils.isEmpty(str2) ? str : str2;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f.add("traceID");
        this.f.add("spanID");
        this.f.add("operationName");
        this.f.add("startTime");
        this.f.add("finishTime");
        this.f.add("tags");
        this.f.add("baggage");
        this.f.add("traceSize");
        this.f.add("logSize");
        this.f.add(a(o.e.a()));
        this.f.add(a(o.g.a()));
        this.f.add(a(o.f.a()));
        this.f.add(a(o.h.a()));
        this.f.add(a(o.i.a()));
        this.f.add(a("_scene"));
        this.f.add(n.ERROR_CODE.a());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g.add(k.REQ_INFLATE_SIZE.a());
        this.g.add(k.REQ_DEFLATE_SIZE.a());
        this.g.add(k.RSP_INFLATE_SIZE.a());
        this.g.add(k.RSP_DEFLATE_SIZE.a());
        this.g.add(k.DESERIALIZE_TIME.a());
        this.g.add(k.MTOP_SIGN_TIME.a());
        this.g.add(k.FIRST_DATA_TIME.a());
        this.g.add(k.SEND_DATA_TIME.a());
        this.g.add(k.DISK_CACHE_LOOKUP_TIME.a());
    }

    public void a(final o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d539bda", new Object[]{this, oVar});
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.v3.s.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        s.a(s.this, oVar);
                        s.b(s.this, oVar);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void b(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23c641b", new Object[]{this, oVar});
            return;
        }
        String b = oVar.b();
        if (StringUtils.isEmpty(b)) {
            return;
        }
        String trim = b.trim();
        if (!this.d.contains(trim)) {
            this.d.add(trim);
            if (this.h.a() != null) {
                this.h.a().a(f8593a, trim, this.g, this.f);
            }
        }
        try {
            a(trim, oVar);
        } catch (Exception e) {
            ALog.e("falco.Metrics", "[commitSpanToSamplingTable] error.", null, e, new Object[0]);
        }
    }

    private void c(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7252c5c", new Object[]{this, oVar});
            return;
        }
        String b = oVar.b();
        if (StringUtils.isEmpty(b)) {
            return;
        }
        String str = b.trim() + c;
        if (!this.d.contains(str)) {
            this.d.add(str);
            if (this.h.a() != null) {
                this.h.a().a(f8593a, str, this.g, this.f);
            }
        }
        try {
            if (!FullTraceAnalysis.getInstance().isImportantMtopApi("mtop".equals(b) ? (String) oVar.i(k.API_NAME.a()) : null) && !FullTraceAnalysis.getInstance().isImportantUser()) {
                return;
            }
            ALog.e("falco.Metrics", "[commitSpanToFullSamplingTable].", null, new Object[0]);
            a(str, oVar);
        } catch (Exception e) {
            ALog.e("falco.Metrics", "[commitSpanToSamplingTable] error.", null, e, new Object[0]);
        }
    }

    private void a(String str, o oVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddbf324", new Object[]{this, str, oVar});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("traceSize", Double.valueOf(oVar.g()));
        hashMap2.put("logSize", Double.valueOf(oVar.f()));
        hashMap.put("traceID", oVar.h().a());
        hashMap.put("spanID", oVar.h().b());
        hashMap.put("operationName", oVar.i());
        hashMap.put("startTime", String.valueOf(oVar.k()));
        hashMap.put("finishTime", String.valueOf(oVar.l()));
        hashMap.put(a("_scene"), oVar.bB_());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ?> entry : oVar.j().entrySet()) {
            String a2 = a(entry.getKey());
            String valueOf = String.valueOf(entry.getValue() != null ? entry.getValue() : "");
            if (this.f.contains(a2)) {
                hashMap.put(a2, valueOf);
            } else if (this.g.contains(a2)) {
                double d = mto.a.GEO_NOT_SUPPORT;
                try {
                    d = Double.valueOf(valueOf).doubleValue();
                } catch (Exception unused) {
                }
                hashMap2.put(a2, Double.valueOf(d));
            } else {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(mzq.a(a2));
                sb.append("=");
                sb.append(mzq.a(valueOf));
            }
        }
        if (sb.length() > 0) {
            hashMap.put("tags", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry2 : oVar.h().c()) {
            String key = entry2.getKey();
            String value = entry2.getValue();
            if (!"_scene".equals(key)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(mzq.a(key));
                sb2.append("=");
                sb2.append(mzq.a(value));
            }
        }
        if (sb2.length() > 0) {
            hashMap.put("baggage", sb2.toString());
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("falco.Metrics", "[commitMetrics]", null, "point", str, "dimension", hashMap, "measure", hashMap2);
        }
        if (this.h.a() == null) {
            return;
        }
        this.h.a().a(f8593a, str, hashMap2, hashMap);
    }
}
