package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ali.user.open.core.Site;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.c;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.a;
import com.taobao.monitor.performance.cpu.e;
import com.taobao.monitor.performance.cpu.g;
import com.taobao.tao.log.TLog;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class mmm extends mma<mkn, mkm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final Set<String> f31113a;

    public static /* synthetic */ Object ipc$super(mmm mmmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$Hzer7j_riJmwQj7wIlTDiUm-QHk */
    public static /* synthetic */ void m2468lambda$Hzer7j_riJmwQj7wIlTDiUmQHk(mmm mmmVar, Map map, mkm mkmVar) {
        mmmVar.b(map, mkmVar);
    }

    static {
        HashSet hashSet = new HashSet();
        f31113a = hashSet;
        hashSet.add(c.TMALL);
        f31113a.add(Site.CAINIAO);
        f31113a.add("mtop");
        f31113a.add("com.taobao");
        f31113a.add("com.etao");
        f31113a.add("com.uc.");
        f31113a.add("com.ali");
        f31113a.add("me.ele");
        f31113a.add("com.ut");
        f31113a.add("anet.");
        f31113a.add("anetwork.");
    }

    public mmm(MetricContext metricContext, mkn mknVar) {
        super(metricContext, null, mknVar);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{9, 10};
    }

    @Override // tb.mma
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{12};
    }

    @Override // tb.mmc
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            d().getDefaultInnerHandler().post(new mmn(str, map));
        }
    }

    @Override // tb.mma
    public void a(int i, final Map<String, ?> map, List<mkm> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180d777b", new Object[]{this, new Integer(i), map, list});
            return;
        }
        for (final mkm mkmVar : list) {
            mkmVar.a(a(map, "blockFrameMetrics"));
            a.a().d().execute(new Runnable() { // from class: tb.-$$Lambda$mmm$Hzer7j_riJmwQj7wIlTDiUm-QHk
                @Override // java.lang.Runnable
                public final void run() {
                    mmm.m2468lambda$Hzer7j_riJmwQj7wIlTDiUmQHk(mmm.this, map, mkmVar);
                }
            });
        }
    }

    public /* synthetic */ void b(Map map, mkm mkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853fb1fd", new Object[]{this, map, mkmVar});
        } else {
            a(map, mkmVar);
        }
    }

    private com.alibaba.ha.bizerrorreporter.module.a a(Map<String, ?> map, mkm mkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ha.bizerrorreporter.module.a) ipChange.ipc$dispatch("a595e1a5", new Object[]{this, map, mkmVar});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        long d = mkn.d();
        long e = mkn.e();
        Throwable th = new Throwable("The Second Dump Point Difference Stack(" + (d + e) + "ms)", new Throwable("The First Dump Point Difference Stack(" + d + "ms)"));
        StackTraceElement[] a2 = a(mkmVar.c(), mkmVar.h(), th);
        String[] strArr = new String[5];
        strArr[0] = "ReportId";
        strArr[1] = mkmVar.a();
        strArr[2] = "doStackTraceDiff";
        strArr[3] = String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis2);
        strArr[4] = String.valueOf(a2 == null);
        TLog.loge("MetricKit.BlockStackProcessor", strArr);
        if (a2 == null) {
            return null;
        }
        TLog.loge("MetricKit.BlockStackProcessor", "ReportId", mkmVar.a(), "\n卡顿堆栈公共部分\n", a(a2), "两次卡顿堆栈dump差异部分\n", a(th));
        com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
        aVar.f3119a = "HA_MAIN_THREAD_BLOCK";
        aVar.b = AggregationType.STACK;
        aVar.c = aVar.f3119a + SystemClock.uptimeMillis();
        aVar.l = null;
        aVar.e = "1.0.2";
        Throwable th2 = new Throwable("Main thread timeout.");
        th2.setStackTrace(a2);
        aVar.k = th2;
        aVar.f = a(th);
        aVar.g = a(mkmVar);
        aVar.h = mkmVar.l();
        g a3 = e.a(mkmVar.d(), mkmVar.j());
        g a4 = e.a(mkmVar.m(), mkmVar.p());
        HashMap hashMap = new HashMap();
        aVar.i = hashMap;
        hashMap.put("CollectType", "ApmDeltaCollection");
        hashMap.put("frameTimeNanos", Long.valueOf(mkmVar.k()));
        hashMap.put("pageName", a(map, "activity"));
        hashMap.put("firstCollectTimeNanos", Long.valueOf(mkmVar.b()));
        hashMap.put("secondCollectTimeNanos", Long.valueOf(mkmVar.g()));
        hashMap.put("firstProcessStat", mkmVar.f());
        hashMap.put("secondProcessStat", mkmVar.r());
        hashMap.put("firstMainThreadStat", mkmVar.o());
        hashMap.put("secondMainThreadStat", mkmVar.q());
        hashMap.put("processDiff", Long.valueOf(a3.k));
        hashMap.put("mainThreadDiff", Long.valueOf(a4.k));
        hashMap.put("topActivity", d().getCurrActivityName());
        hashMap.put("topFragment", d().getCurrFragmentName());
        hashMap.put("schemaUrl", d().getSchemaUrl());
        hashMap.put("scrollHitchRate", map.get("scrollHitchRate"));
        Map<String, Object> n = mkmVar.n();
        if (n != null && !n.isEmpty()) {
            hashMap.putAll(n);
        }
        TLog.logi("MetricKit.BlockStackProcessor", "exceptionArgs", hashMap.toString());
        com.alibaba.ha.bizerrorreporter.e.a().a(d().getApplication(), aVar);
        a("blockStackUpload", (Map<String, Object>) null);
        TLog.loge("MetricKit.BlockStackProcessor", "BlockReport run: ", String.valueOf(SystemClock.uptimeMillis() - uptimeMillis), String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
        return aVar;
    }

    private String a(mkm mkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dab859d7", new Object[]{this, mkmVar});
        }
        if (mkmVar.e() != null && mkmVar.i() != null) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            for (g gVar : mkmVar.e()) {
                e.a(gVar, gVar.f18216a, gVar.b);
            }
            for (g gVar2 : mkmVar.i()) {
                e.a(gVar2, gVar2.f18216a, gVar2.b);
            }
            g a2 = e.a(mkmVar.d(), mkmVar.j());
            g a3 = e.a(mkmVar.m(), mkmVar.p());
            List<g> a4 = e.a(mkmVar.e(), mkmVar.i());
            if (a2 != null && a4 != null) {
                Collections.sort(a4);
                StringBuilder sb = new StringBuilder();
                sb.append("+ --------------------------------------------------------------------------------------------");
                sb.append("\n");
                sb.append("| ");
                sb.append("process");
                sb.append(" :");
                sb.append("\n");
                sb.append("| ");
                sb.append("  -> ");
                sb.append("pid=");
                sb.append(mkmVar.d().c);
                sb.append("\t");
                sb.append("reportId=");
                sb.append(mkmVar.a());
                sb.append("\t");
                sb.append("ProcessDiff(jiffies)=");
                sb.append(a2.k);
                sb.append("\t");
                sb.append("MainThreadDiff(jiffies)=");
                sb.append(a3.k);
                sb.append("\n");
                sb.append("+ --------------------------------------------------------------------------------------------");
                sb.append("\n");
                sb.append("| ");
                sb.append("threads");
                sb.append(" :");
                sb.append("\n");
                for (g gVar3 : a4.subList(0, Math.min(a4.size(), 8))) {
                    sb.append("| ");
                    sb.append("  -> ");
                    sb.append(riy.BRACKET_START_STR);
                    sb.append(gVar3.j ? riy.PLUS : Constants.WAVE_SEPARATOR);
                    sb.append("/");
                    sb.append(gVar3.e);
                    sb.append(riy.BRACKET_END_STR);
                    sb.append(gVar3.d);
                    sb.append(riy.BRACKET_START_STR);
                    sb.append(gVar3.c);
                    sb.append(riy.BRACKET_END_STR);
                    sb.append("\t");
                    sb.append(gVar3.k);
                    sb.append(" jiffies");
                    sb.append("\n");
                }
                String sb2 = sb.toString();
                TLog.loge("MetricKit.BlockStackProcessor", sb2);
                TLog.loge("MetricKit.BlockStackProcessor", "doTaskStatDiff", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                return sb2;
            }
        }
        return null;
    }

    private StackTraceElement[] a(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("d71714ac", new Object[]{this, stackTraceElementArr, stackTraceElementArr2, th});
        }
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0 || stackTraceElementArr2 == null || stackTraceElementArr2.length == 0) {
            th.setStackTrace(new StackTraceElement[0]);
            if (th.getCause() != null) {
                th.getCause().setStackTrace(new StackTraceElement[0]);
            }
            return null;
        }
        boolean z = !com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_BLOCK_STACK_DETECT_KEYWORDS);
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTraceElementArr2.length - 1;
        int i = -1;
        int i2 = -1;
        while (true) {
            if (length < 0 || length2 < 0) {
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[length];
            if (!stackTraceElement.equals(stackTraceElementArr2[length2])) {
                i = length + 1;
                i2 = length2 + 1;
                break;
            } else if (!stackTraceElement.getClassName().startsWith("tb.")) {
                Iterator<String> it = f31113a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (stackTraceElement.getClassName().contains(it.next())) {
                        if (length == 0 || length2 == 0) {
                            z = true;
                            i = 0;
                            i2 = 0;
                        } else {
                            z = true;
                        }
                    }
                }
                length--;
                length2--;
            } else if (length == 0 || length2 == 0) {
                z = true;
                i = 0;
                i2 = 0;
            } else {
                z = true;
            }
        }
        if (z && i >= 0 && i <= stackTraceElementArr.length - 1 && i2 <= stackTraceElementArr2.length - 1) {
            th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr2, 0, i2));
            th.getCause().setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, 0, i));
            return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i, stackTraceElementArr.length);
        }
        th.setStackTrace(new StackTraceElement[0]);
        if (th.getCause() != null) {
            th.getCause().setStackTrace(new StackTraceElement[0]);
        }
        return null;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935bc097", new Object[]{this, stackTraceElementArr});
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        return sb.toString();
    }

    private String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th});
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static String a(Map<String, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        if (map != null && !TextUtils.isEmpty(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }
}
