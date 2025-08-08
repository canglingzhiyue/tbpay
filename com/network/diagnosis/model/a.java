package com.network.diagnosis.model;

import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.e;
import com.network.diagnosis.statistics.OrangeRecoverStat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.czd;
import tb.cze;

/* loaded from: classes.dex */
public class a implements com.network.diagnosis.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Long> f8036a = new HashMap();
    private int b = 0;
    private boolean c = false;
    private boolean d = false;
    private int e = 0;

    /* renamed from: com.network.diagnosis.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0298a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f8041a = new a();

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4e7a74ab", new Object[0]) : f8041a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f8042a;

        public b(String str) {
            this.f8042a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!cze.a()) {
            } else {
                Long l = (Long) a.a(a.this).remove(this.f8042a);
                if (l == null || System.currentTimeMillis() - l.longValue() < 10000) {
                    a.a(a.this, 0);
                } else {
                    a.b(a.this);
                    AppMonitor.getInstance().commitCount(new com.network.diagnosis.statistics.a("more_10s"));
                    ALog.e("npm.MtopDetector", "sign error, cost >10s.", null, "falcoId", this.f8042a);
                }
                if (a.c(a.this) || a.d(a.this) < 5 || a.e(a.this) || a.f(a.this) >= 3) {
                    return;
                }
                a.g(a.this);
                a.b(a.this, true);
                a.a(a.this, 0);
                a.h(a.this);
            }
        }
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9143bab", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.b = i;
        return i;
    }

    public static /* synthetic */ Map a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ad2d7a0", new Object[]{aVar}) : aVar.f8036a;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9147b8d", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efe504fd", new Object[]{aVar})).intValue();
        }
        int i = aVar.b;
        aVar.b = i + 1;
        return i;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbc4f0e", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.d = z;
        return z;
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64243d6d", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public static /* synthetic */ int d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d86375bb", new Object[]{aVar})).intValue() : aVar.b;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ca2ae2b", new Object[]{aVar})).booleanValue() : aVar.c;
    }

    public static /* synthetic */ int f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0e1e679", new Object[]{aVar})).intValue() : aVar.e;
    }

    public static /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35211ee5", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ int h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9605737", new Object[]{aVar})).intValue();
        }
        int i = aVar.e;
        aVar.e = i + 1;
        return i;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4e7a74ab", new Object[0]) : C0298a.a();
    }

    @Override // com.network.diagnosis.a
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!cze.a() || StringUtils.isEmpty(str)) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            czd.a(new Runnable() { // from class: com.network.diagnosis.model.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this).put(str, Long.valueOf(currentTimeMillis));
                    AppMonitor.getInstance().commitCount(new com.network.diagnosis.statistics.a("sign_start"));
                    czd.a(new b(str), 10000L, TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    @Override // com.network.diagnosis.a
    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!cze.a() || StringUtils.isEmpty(str)) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            czd.a(new Runnable() { // from class: com.network.diagnosis.model.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AppMonitor.getInstance().commitCount(new com.network.diagnosis.statistics.a("sign_finish"));
                    Long l = (Long) a.a(a.this).remove(str);
                    if (l == null) {
                        return;
                    }
                    long longValue = currentTimeMillis - l.longValue();
                    if (longValue < 0) {
                        return;
                    }
                    if (longValue <= 1000) {
                        str2 = "less_1s";
                    } else if (longValue <= 2000) {
                        str2 = "1_2s";
                    } else if (longValue <= 3000) {
                        str2 = "2_3s";
                    } else if (longValue <= Constants.STARTUP_TIME_LEVEL_1) {
                        str2 = "3_4s";
                    } else if (longValue <= 5000) {
                        str2 = "4_5s";
                    } else if (longValue <= 10000) {
                        ALog.e("npm.MtopDetector", "sign cost >5s.", null, "falcoId", str);
                        str2 = "5_10s";
                    } else {
                        ALog.e("npm.MtopDetector", "sign cost >10s.", null, "falcoId", str);
                        str2 = "more_10s";
                    }
                    AppMonitor.getInstance().commitCount(new com.network.diagnosis.statistics.a(str2));
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RequestImpl requestImpl = new RequestImpl("http://guide-acs.m.taobao.com/gw/mtop.taobao.aserver.concurrent.count/2.0");
        DegradableNetwork degradableNetwork = new DegradableNetwork(e.b());
        final OrangeRecoverStat orangeRecoverStat = new OrangeRecoverStat();
        final long currentTimeMillis = System.currentTimeMillis();
        degradableNetwork.asyncSend(requestImpl, null, null, new NetworkCallBack.FinishListener() { // from class: com.network.diagnosis.model.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anetwork.channel.NetworkCallBack.FinishListener
            public void onFinished(final NetworkEvent.FinishEvent finishEvent, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                } else {
                    czd.a(new Runnable() { // from class: com.network.diagnosis.model.a.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            int httpCode = finishEvent.getHttpCode();
                            if (httpCode == 200) {
                                ALog.e("npm.MtopDetector", "[tryRecoverOrange]request is ok.", null, new Object[0]);
                                a.a(a.this, true);
                                orangeRecoverStat.ret = 1;
                            } else {
                                orangeRecoverStat.ret = 0;
                                ALog.e("npm.MtopDetector", "[tryRecoverOrange]request error.", null, "httpCode", Integer.valueOf(httpCode));
                            }
                            orangeRecoverStat.statusCode = httpCode;
                            orangeRecoverStat.totalTime = System.currentTimeMillis() - currentTimeMillis;
                            AppMonitor.getInstance().commitStat(orangeRecoverStat);
                            a.b(a.this, false);
                        }
                    });
                }
            }
        });
    }
}
