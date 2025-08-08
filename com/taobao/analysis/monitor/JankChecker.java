package com.taobao.analysis.monitor;

import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.stat.FalcoJankStatistic;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dit;
import tb.gve;

/* loaded from: classes4.dex */
public class JankChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f8568a;
    private final Map<String, c> b = new HashMap();
    private final Map<String, b> c = new HashMap();
    private b d;
    private int e;
    private int f;
    private a g;

    /* loaded from: classes4.dex */
    interface JankCheckEvent {
        public static final int REQUEST = 1;
        public static final int TIMER = 2;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes4.dex */
    interface JankModel {
        public static final String GLOBAL_MTOP_REQUEST = "Global_MTopReq";
        public static final String PAGE_MTOP_REQUEST = "Page_MTopReq";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes4.dex */
    interface JankStatus {
        public static final String FAILED = "failed";
        public static final String NORMAL = "normal";
        public static final String SLOW = "slow";
        public static final String UNFINISHED = "unfinished";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes4.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f8570a;
        public String b;
        public long c;
        public long d;

        public b(String str) {
            this.f8570a = str;
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageName", this.f8570a);
                jSONObject.put("pageUrl", this.b);
                jSONObject.put("pageStartTime", this.c);
                jSONObject.put("pageLeaveTime", this.d);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f8571a;
        public String b;

        private c() {
        }
    }

    public static /* synthetic */ void a(JankChecker jankChecker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c58756", new Object[]{jankChecker, new Integer(i)});
        } else {
            jankChecker.a(i);
        }
    }

    public JankChecker(String str) {
        this.f8568a = str;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            c cVar = new c();
            cVar.b = "unfinished";
            this.b.put(str, cVar);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str) || !this.b.containsKey(str)) {
        } else {
            c cVar = this.b.get(str);
            cVar.f8571a = str2;
            cVar.b = str3;
            a(1);
        }
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        b bVar = new b(str);
        bVar.b = str2;
        bVar.c = j;
        this.d = bVar;
        this.c.put(str, bVar);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (!this.c.containsKey(str)) {
        } else {
            this.c.get(str).d = j;
            if (!this.f8568a.equals(JankModel.PAGE_MTOP_REQUEST)) {
                return;
            }
            c();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e++;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f++;
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (Map.Entry<String, c> entry : this.b.entrySet()) {
            c value = entry.getValue();
            if (!"unfinished".equals(value.b)) {
                i2++;
                if (!"normal".equals(value.b)) {
                    i3++;
                    if (JankStatus.SLOW.equals(value.b)) {
                        i4++;
                    }
                    jSONArray.put(value.f8571a);
                }
            }
        }
        if (i == 1 && i2 < 10) {
            a aVar = this.g;
            if (aVar == null) {
                this.g = new a();
                this.g.a();
                return;
            }
            aVar.b();
        } else if (i == 2 && i2 == 0) {
            c();
        } else if (i3 / i2 >= JankContinuousMonitor.a().b()) {
            FalcoJankStatistic falcoJankStatistic = new FalcoJankStatistic();
            falcoJankStatistic.afc_id = JankContinuousMonitor.a().e();
            falcoJankStatistic.processId = SceneIdentifier.getProcessId();
            falcoJankStatistic.processType = SceneIdentifier.getProcessName();
            falcoJankStatistic.processStart = SceneIdentifier.getProcessStartTime();
            falcoJankStatistic.type = this.f8568a;
            falcoJankStatistic.totalCount = i2;
            falcoJankStatistic.jankCount = i3;
            falcoJankStatistic.slowJankCount = i4;
            falcoJankStatistic.pushCount = this.e;
            falcoJankStatistic.popCount = this.f;
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry<String, b> entry2 : this.c.entrySet()) {
                jSONArray2.put(entry2.getValue().a());
            }
            falcoJankStatistic.pageList = jSONArray2.toString();
            falcoJankStatistic.apiList = jSONArray.toString();
            AppMonitor.getInstance().commitStat(falcoJankStatistic);
            ALog.e("falco.JankChecker", "reportJank", null, gve.TAG, falcoJankStatistic, "event", Integer.valueOf(i));
            c();
        } else {
            if (i != 2) {
                return;
            }
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
        this.c.put(this.d.f8570a, this.d);
        this.e = 0;
        this.f = 0;
        this.g.c();
        this.g = null;
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;
        private boolean c;

        private a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.c = true;
            a(JankContinuousMonitor.a().c() * 1000);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b = System.currentTimeMillis() + (JankContinuousMonitor.a().c() * 1000);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.c = false;
            }
        }

        private void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            this.b = System.currentTimeMillis() + j;
            dit.b(this, j, TimeUnit.MILLISECONDS);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.c) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.b;
                if (currentTimeMillis < j) {
                    a(j - currentTimeMillis);
                } else {
                    JankChecker.a(JankChecker.this, 2);
                }
            }
        }
    }
}
