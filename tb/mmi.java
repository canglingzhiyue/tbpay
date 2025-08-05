package tb;

import android.os.SystemClock;
import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.ha.bizerrorreporter.module.a;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.monitor.performance.cpu.g;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mmi extends mmc<mkp, mko> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private long f31110a;

    public static /* synthetic */ Object ipc$super(mmi mmiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean lambda$dBdF6MlStLVn72_Tj1ZWLIkpS2g(mmi mmiVar, int i, Map map) {
        return mmiVar.c(i, map);
    }

    public mmi(MetricContext metricContext, mly mlyVar, mkp mkpVar) {
        super(metricContext, mlyVar, mkpVar);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{80, 54};
    }

    @Override // tb.mmc
    public mmb f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mmb) ipChange.ipc$dispatch("35801177", new Object[]{this}) : new mmb() { // from class: tb.-$$Lambda$mmi$dBdF6MlStLVn72_Tj1ZWLIkpS2g
            @Override // tb.mmb
            public final boolean isFilter(int i, Map map) {
                return mmi.lambda$dBdF6MlStLVn72_Tj1ZWLIkpS2g(mmi.this, i, map);
            }
        };
    }

    public /* synthetic */ boolean c(int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98fb2990", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        long a2 = mqe.a(map.get("time"), 0L);
        this.f31110a = a2;
        return a2 - this.f31110a > 300000;
    }

    @Override // tb.mmc
    public void a(mko mkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ac72a7", new Object[]{this, mkoVar});
        } else if (mkoVar.i().size() <= 0) {
        } else {
            a aVar = new a();
            aVar.f3119a = "MetricKit_CPU_Exception";
            aVar.b = AggregationType.STACK;
            aVar.c = aVar.f3119a + SystemClock.uptimeMillis();
            aVar.k = a(mkoVar.g());
            aVar.l = mkoVar.h();
            aVar.e = "1.0.1";
            aVar.f = a(mkoVar.i());
            aVar.h = c(mkoVar);
            aVar.i = b(mkoVar);
            e.a().a(d().getApplication(), aVar);
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.k == null ? null : a(aVar.k));
            sb.append("\n");
            sb.append(aVar.f);
            sb.append("\n");
            sb.append(aVar.g);
            sb.append("\n\n");
            sb.append(aVar.h);
            TLog.loge("MetricKit.CpuAbnormalProcessor", sb.toString());
        }
    }

    private Throwable a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("8fe4f18e", new Object[]{this, stackTraceElementArr});
        }
        if (stackTraceElementArr == null) {
            return null;
        }
        Throwable th = new Throwable();
        th.setStackTrace(stackTraceElementArr);
        return th;
    }

    private String a(Map<String, List<StackTraceElement[]>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = map.isEmpty();
        if (isEmpty) {
            sb.append("\n");
            sb.append("------stack------");
            sb.append("\n");
        }
        for (Map.Entry<String, List<StackTraceElement[]>> entry : map.entrySet()) {
            List<StackTraceElement[]> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                sb.append("thread=");
                sb.append(entry.getKey());
                sb.append("\n");
                for (StackTraceElement[] stackTraceElementArr : value) {
                    sb.append(a(a(stackTraceElementArr)));
                    sb.append("\n");
                }
            }
        }
        if (isEmpty) {
            sb.append("------stack------");
            sb.append("\n");
        }
        return sb.toString();
    }

    private Map<String, Object> b(mko mkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5a22655d", new Object[]{this, mkoVar});
        }
        HashMap hashMap = new HashMap();
        float a2 = mkoVar.a("processLoadRate", -1.0f);
        hashMap.put("beforeType", mkoVar.a("type"));
        hashMap.put("processLoadRateCollectingBefore", String.valueOf(a2));
        hashMap.put("processLoadRateCollectingAfter", String.valueOf(mkoVar.d()));
        hashMap.put("eventType", EventCenter.a(mkoVar.a()));
        hashMap.put(StEvent.EVENT_TIME, String.valueOf(mkoVar.a("time", -1L)));
        hashMap.put("currActivityName", d().getCurrActivityName());
        hashMap.put("schemaUrl", d().getSchemaUrl());
        return hashMap;
    }

    private String c(mko mkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5439c17", new Object[]{this, mkoVar});
        }
        if (!mkoVar.b()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        long c = mkoVar.c();
        List<g> a2 = com.taobao.monitor.performance.cpu.e.a(mkoVar.e(), mkoVar.f());
        Collections.sort(a2);
        for (g gVar : a2.subList(0, Math.min(a2.size(), 20))) {
            for (g gVar2 : mkoVar.e()) {
                if (gVar.c == gVar2.c) {
                    sb.append("id=");
                    sb.append(gVar.c);
                    sb.append(" name=");
                    sb.append(gVar.d);
                    sb.append(" threadLoadRate=");
                    sb.append(a(c, gVar2, gVar));
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    private float a(long j, g gVar, g gVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe241cb8", new Object[]{this, new Long(j), gVar, gVar2})).floatValue();
        }
        long j2 = ((gVar2.g + gVar2.f) - gVar.g) - gVar.f;
        if (j > 0) {
            return (((1000.0f / ((float) com.taobao.monitor.performance.cpu.e.a())) * ((float) j2)) * 1.0f) / ((float) j);
        }
        return 0.0f;
    }

    private String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
