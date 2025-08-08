package com.taobao.analysis.flow;

import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.PageFlowStatistic;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.dir;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile e b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d> f8551a = new LinkedHashMap<String, d>(21, 0.75f, false) { // from class: com.taobao.analysis.flow.PageFlowReport$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, d> entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > 20;
        }
    };

    private e() {
        AppMonitor.getInstance().register(PageFlowStatistic.class);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("48e9add9", new Object[0]);
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            d dVar = this.f8551a.get(str);
            if (dVar == null) {
                dVar = new d();
                this.f8551a.put(str, dVar);
            }
            dVar.j = System.currentTimeMillis();
        }
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            d dVar = this.f8551a.get(str);
            if (dVar != null) {
                if (dVar.j != 0) {
                    dVar.i += System.currentTimeMillis() - dVar.j;
                }
                dVar.j = 0L;
                if (dir.c) {
                    String str2 = "updatePageExitPoint page:" + str + " pageStayTimes(s):" + (dVar.i / 1000);
                }
            }
        }
    }

    public synchronized void a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        if (!StringUtils.isEmpty(str) && (j != 0 || j2 != 0)) {
            d dVar = this.f8551a.get(str);
            if (dVar == null) {
                dVar = new d();
                this.f8551a.put(str, dVar);
            }
            dVar.h++;
            dVar.f += j;
            dVar.g += j2;
            if (dir.c) {
                String str2 = "commitPageFlow page:" + str + " upstream:" + dVar.f + " downstream:" + dVar.g;
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (Map.Entry<String, d> entry : this.f8551a.entrySet()) {
            d value = entry.getValue();
            if (value != null) {
                long j = value.i / 1000;
                long j2 = value.f;
                long j3 = value.g;
                if (j != 0 && (j2 != 0 || j3 != 0)) {
                    if (dir.c) {
                        String str = "tryCommitPageFlow page:" + entry.getKey() + " avgAll:" + ((j2 + j3) / j) + " avfUp:" + (j2 / j) + " avgDown:" + (j3 / j) + " reqCount:" + value.h + " alltimes:" + j;
                    }
                    AppMonitor.getInstance().commitStat(new PageFlowStatistic(entry.getKey(), j2, j3, value.h, j));
                }
            }
        }
        this.f8551a.clear();
    }
}
