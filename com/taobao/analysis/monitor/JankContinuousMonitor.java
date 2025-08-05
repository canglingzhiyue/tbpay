package com.taobao.analysis.monitor;

import android.text.TextUtils;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.monitor.JankChecker;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.stat.FullTraceStatistic;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import org.json.JSONArray;
import tb.dit;
import tb.its;

/* loaded from: classes4.dex */
public class JankContinuousMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXCLUDE_BIZ_CODES = "jankContinuous_exclude_biz_codes";
    public static final String KEY_JANK_CHECK_INTERVAL = "jankContinuous_check_interval";
    public static final String KEY_JANK_THRESHOLD = "jankContinuous_threshold";
    public static final String KEY_WHITE_LIST = "jankContinuous_host_whitelist";

    /* renamed from: a  reason: collision with root package name */
    private JankChecker f8572a;
    private JankChecker b;
    private List<String> g;
    private List<String> h;
    private float i;
    private long j;
    public boolean k;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final JankContinuousMonitor f8579a = new JankContinuousMonitor();

        public static /* synthetic */ JankContinuousMonitor a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JankContinuousMonitor) ipChange.ipc$dispatch("e0a0cbf7", new Object[0]) : f8579a;
        }
    }

    public static /* synthetic */ JankChecker a(JankContinuousMonitor jankContinuousMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JankChecker) ipChange.ipc$dispatch("390b439c", new Object[]{jankContinuousMonitor}) : jankContinuousMonitor.f8572a;
    }

    public static /* synthetic */ JankChecker b(JankContinuousMonitor jankContinuousMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JankChecker) ipChange.ipc$dispatch("198d0b7b", new Object[]{jankContinuousMonitor}) : jankContinuousMonitor.b;
    }

    public static /* synthetic */ List c(JankContinuousMonitor jankContinuousMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cad8f272", new Object[]{jankContinuousMonitor}) : jankContinuousMonitor.h;
    }

    private JankContinuousMonitor() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.k = true;
        this.g.add(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN);
        this.g.add(MtopUnitStrategy.TRADE_ONLINE_DOMAIN);
        this.h.add("SUCCESS");
        this.h.add("NO_DATA");
        this.h.add("UserFuqiNotEnoughError");
        this.h.add("WateringTimeLimitError");
        this.h.add("ExceedFrequencyLimit");
        this.h.add("TeamWateringTimeLimitError");
        this.h.add("UserHasNoSeedError");
        this.h.add("FAIL_SYS_SESSION_EXPIRED");
        this.h.add(its.TRAFFIC_LIMIT_STATUS);
        this.h.add("FAIL_SYS_FLOWLIMIT");
        this.h.add("FAIL_SYS_USER_VALIDATE");
        this.i = 0.3f;
        this.j = 10L;
        this.f8572a = new JankChecker(JankChecker.JankModel.GLOBAL_MTOP_REQUEST);
        this.b = new JankChecker(JankChecker.JankModel.PAGE_MTOP_REQUEST);
    }

    public static JankContinuousMonitor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JankContinuousMonitor) ipChange.ipc$dispatch("e0a0cbf7", new Object[0]) : a.a();
    }

    public void a(final String str, final FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a0617a", new Object[]{this, str, fullTraceStatistic});
        } else if (!this.k || SceneIdentifier.isAppBackground()) {
        } else {
            dit.c(new Runnable() { // from class: com.taobao.analysis.monitor.JankContinuousMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!"mtop".equals(fullTraceStatistic.reqType)) {
                    } else {
                        JankContinuousMonitor.a(JankContinuousMonitor.this).a(str);
                        JankContinuousMonitor.b(JankContinuousMonitor.this).a(str);
                    }
                }
            });
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        try {
            return UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b(final String str, final FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00e5dd9", new Object[]{this, str, fullTraceStatistic});
        } else if (!this.k || SceneIdentifier.isAppBackground()) {
        } else {
            dit.c(new Runnable() { // from class: com.taobao.analysis.monitor.JankContinuousMonitor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str2 = (fullTraceStatistic.ret != 0 || JankContinuousMonitor.c(JankContinuousMonitor.this).contains(fullTraceStatistic.bizErrorCode)) ? fullTraceStatistic.bizRspCbEnd - fullTraceStatistic.bizReqStart > 3000 ? JankChecker.JankStatus.SLOW : "normal" : "failed";
                    String path = HttpUrl.parse(fullTraceStatistic.url).path();
                    if (!TextUtils.isEmpty(path)) {
                        String[] split = path.split("/");
                        if (split.length > 2) {
                            path = split[2];
                        }
                    } else {
                        path = null;
                    }
                    JankContinuousMonitor.a(JankContinuousMonitor.this).a(str, path, str2);
                    JankContinuousMonitor.b(JankContinuousMonitor.this).a(str, path, str2);
                }
            });
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                this.g = arrayList;
            } catch (Throwable unused) {
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                this.h = arrayList;
            } catch (Throwable unused) {
            }
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.i = f;
        }
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.i;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j < 0) {
            this.k = false;
        } else {
            this.j = j;
        }
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.j;
    }

    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        dit.c(new Runnable() { // from class: com.taobao.analysis.monitor.JankContinuousMonitor.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JankContinuousMonitor.a(JankContinuousMonitor.this).a(str, str2, currentTimeMillis);
                JankContinuousMonitor.b(JankContinuousMonitor.this).a(str, str2, currentTimeMillis);
            }
        });
    }

    public void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        dit.c(new Runnable() { // from class: com.taobao.analysis.monitor.JankContinuousMonitor.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JankContinuousMonitor.a(JankContinuousMonitor.this).a(str, currentTimeMillis);
                JankContinuousMonitor.b(JankContinuousMonitor.this).a(str, currentTimeMillis);
            }
        });
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            dit.c(new Runnable() { // from class: com.taobao.analysis.monitor.JankContinuousMonitor.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JankContinuousMonitor.a(JankContinuousMonitor.this).a();
                    JankContinuousMonitor.b(JankContinuousMonitor.this).a();
                }
            });
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            dit.c(new Runnable() { // from class: com.taobao.analysis.monitor.JankContinuousMonitor.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JankContinuousMonitor.a(JankContinuousMonitor.this).b();
                    JankContinuousMonitor.b(JankContinuousMonitor.this).b();
                }
            });
        }
    }
}
