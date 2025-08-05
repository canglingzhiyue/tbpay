package anet.channel.detect;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.HttpConnector;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.TlsSniSocketFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.search.common.util.k;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import tb.kge;

/* loaded from: classes.dex */
public class HorseRaceDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.HorseRaceDetector";
    private TreeMap<String, StrategyResultParser.HrTask> tasks = new TreeMap<>();
    private AtomicInteger seq = new AtomicInteger(1);

    static {
        kge.a(-1062936761);
    }

    public static /* synthetic */ TreeMap access$000(HorseRaceDetector horseRaceDetector) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TreeMap) ipChange.ipc$dispatch("5047f636", new Object[]{horseRaceDetector}) : horseRaceDetector.tasks;
    }

    public static /* synthetic */ void access$100(HorseRaceDetector horseRaceDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50957ea2", new Object[]{horseRaceDetector});
        } else {
            horseRaceDetector.runnableTask();
        }
    }

    private void runnableTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710339c9", new Object[]{this});
            return;
        }
        ALog.e(TAG, "network detect thread start", null, new Object[0]);
        while (true) {
            synchronized (this.tasks) {
                if (!AwcnConfig.isHorseRaceEnable()) {
                    this.tasks.clear();
                    return;
                }
                Map.Entry<String, StrategyResultParser.HrTask> pollFirstEntry = this.tasks.pollFirstEntry();
                if (pollFirstEntry == null) {
                    return;
                }
                try {
                    startTask(pollFirstEntry.getValue());
                } catch (Exception e) {
                    ALog.e(TAG, "start hr task failed", null, e, new Object[0]);
                }
            }
        }
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        StrategyCenter.getInstance().registerListener(new IStrategyListener() { // from class: anet.channel.detect.HorseRaceDetector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyListener
            public void onStrategyUpdated(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c33e6115", new Object[]{this, httpDnsResponse});
                    return;
                }
                ALog.i(HorseRaceDetector.TAG, "onStrategyUpdated", null, new Object[0]);
                if (!AwcnConfig.isHorseRaceEnable() || httpDnsResponse.hrTasks == null || httpDnsResponse.hrTasks.length == 0) {
                    return;
                }
                synchronized (HorseRaceDetector.access$000(HorseRaceDetector.this)) {
                    for (int i = 0; i < httpDnsResponse.hrTasks.length; i++) {
                        StrategyResultParser.HrTask hrTask = httpDnsResponse.hrTasks[i];
                        HorseRaceDetector.access$000(HorseRaceDetector.this).put(hrTask.host, hrTask);
                    }
                }
            }
        });
        AppLifecycle.registerLifecycleListener(new AppLifecycle.AppLifecycleListener() { // from class: anet.channel.detect.HorseRaceDetector.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
            public void forground() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f5402817", new Object[]{this});
                }
            }

            @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
            public void background() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("550392b5", new Object[]{this});
                    return;
                }
                ALog.i(HorseRaceDetector.TAG, "background", null, new Object[0]);
                if (!AwcnConfig.isHorseRaceEnable()) {
                    return;
                }
                ThreadPoolExecutorFactory.submitHRTask(new Runnable() { // from class: anet.channel.detect.HorseRaceDetector.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            HorseRaceDetector.access$100(HorseRaceDetector.this);
                        }
                    }
                });
            }
        });
    }

    private void startTask(StrategyResultParser.HrTask hrTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e63c8c", new Object[]{this, hrTask});
        } else if (hrTask.strategies != null && hrTask.strategies.length != 0) {
            String str = hrTask.host;
            for (int i = 0; i < hrTask.strategies.length; i++) {
                StrategyResultParser.Strategy strategy = hrTask.strategies[i];
                String str2 = strategy.aisles.protocol;
                if (str2.equalsIgnoreCase("http") || str2.equalsIgnoreCase("https")) {
                    startShortLinkTask(str, strategy);
                } else if (str2.equalsIgnoreCase(ConnType.HTTP2) || str2.equalsIgnoreCase("spdy") || str2.equalsIgnoreCase(ConnType.QUIC)) {
                    startLongLinkTask(str, strategy);
                } else if (str2.equalsIgnoreCase("tcp")) {
                    startTcpTask(str, strategy);
                }
            }
        }
    }

    private void startShortLinkTask(String str, StrategyResultParser.Strategy strategy) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f1e14c", new Object[]{this, str, strategy});
            return;
        }
        HttpUrl parse = HttpUrl.parse(strategy.aisles.protocol + HttpConstant.SCHEME_SPLIT + str + strategy.path);
        if (parse == null) {
            return;
        }
        ALog.i(TAG, "startShortLinkTask", null, "url", parse);
        Request.Builder sslSocketFactory = new Request.Builder().setUrl(parse).addHeader("Connection", "close").setConnectTimeout(strategy.aisles.cto).setReadTimeout(strategy.aisles.rto).setRedirectEnable(false).setSslSocketFactory(new TlsSniSocketFactory(str));
        Request build = sslSocketFactory.setSeq("HR" + this.seq.getAndIncrement()).build();
        build.setDnsOptimize(strategy.ip, strategy.aisles.port);
        long currentTimeMillis = System.currentTimeMillis();
        HttpConnector.Response connect = HttpConnector.connect(build);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, strategy);
        horseRaceStat.connTime = currentTimeMillis2;
        if (connect.httpCode <= 0) {
            horseRaceStat.connErrorCode = connect.httpCode;
        } else {
            horseRaceStat.connRet = 1;
            if (connect.httpCode != 200) {
                i = 0;
            }
            horseRaceStat.reqRet = i;
            horseRaceStat.reqErrorCode = connect.httpCode;
            horseRaceStat.reqTime = horseRaceStat.connTime;
        }
        startPing6Task(strategy.ip, horseRaceStat);
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    private void startLongLinkTask(String str, final StrategyResultParser.Strategy strategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96396208", new Object[]{this, str, strategy});
            return;
        }
        ConnProtocol valueOf = ConnProtocol.valueOf(strategy.aisles);
        ConnType valueOf2 = ConnType.valueOf(valueOf);
        if (valueOf2 == null) {
            return;
        }
        ALog.i(TAG, "startLongLinkTask", null, "host", str, c.IP, strategy.ip, "port", Integer.valueOf(strategy.aisles.port), "protocol", valueOf);
        final String str2 = "HR" + this.seq.getAndIncrement();
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf2.isSSL() ? k.HTTPS_PREFIX : k.HTTP_PREFIX);
        sb.append(str);
        final TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new ConnInfo(sb.toString(), str2, makeConnStrategy(valueOf, strategy)));
        final HorseRaceStat horseRaceStat = new HorseRaceStat(str, strategy);
        final long currentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new EventCb() { // from class: anet.channel.detect.HorseRaceDetector.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.entity.EventCb
            public void onEvent(Session session, int i, Event event) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i), event});
                } else if (horseRaceStat.connTime != 0) {
                } else {
                    horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
                    if (i != 1) {
                        horseRaceStat.connErrorCode = event.errorCode;
                        synchronized (horseRaceStat) {
                            horseRaceStat.notify();
                        }
                        return;
                    }
                    ALog.i(HorseRaceDetector.TAG, "tnetSpdySession connect success", str2, new Object[0]);
                    horseRaceStat.connRet = 1;
                    HttpUrl parse = HttpUrl.parse(session.getHost() + strategy.path);
                    if (parse == null) {
                        return;
                    }
                    tnetSpdySession.request(new Request.Builder().setUrl(parse).setReadTimeout(strategy.aisles.rto).setRedirectEnable(false).setSeq(str2).build(), new RequestCb() { // from class: anet.channel.detect.HorseRaceDetector.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // anet.channel.RequestCb
                        public void onDataReceive(ByteArray byteArray, boolean z) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                            }
                        }

                        @Override // anet.channel.RequestCb
                        public void onResponseCode(int i2, Map<String, List<String>> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("38c34976", new Object[]{this, new Integer(i2), map});
                            } else {
                                horseRaceStat.reqErrorCode = i2;
                            }
                        }

                        @Override // anet.channel.RequestCb
                        public void onFinish(int i2, String str3, RequestStatistic requestStatistic) {
                            IpChange ipChange3 = $ipChange;
                            int i3 = 1;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i2), str3, requestStatistic});
                                return;
                            }
                            ALog.i(HorseRaceDetector.TAG, "LongLinkTask request finish", str2, "statusCode", Integer.valueOf(i2), "msg", str3);
                            if (horseRaceStat.reqErrorCode == 0) {
                                horseRaceStat.reqErrorCode = i2;
                            } else {
                                HorseRaceStat horseRaceStat2 = horseRaceStat;
                                if (horseRaceStat.reqErrorCode != 200) {
                                    i3 = 0;
                                }
                                horseRaceStat2.reqRet = i3;
                            }
                            horseRaceStat.reqTime = (System.currentTimeMillis() - currentTimeMillis) + horseRaceStat.connTime;
                            synchronized (horseRaceStat) {
                                horseRaceStat.notify();
                            }
                        }
                    });
                }
            }
        });
        tnetSpdySession.connect();
        synchronized (horseRaceStat) {
            try {
                horseRaceStat.wait(strategy.aisles.cto == 0 ? 10000 : strategy.aisles.cto);
                if (horseRaceStat.connTime == 0) {
                    horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
                }
                startPing6Task(strategy.ip, horseRaceStat);
                AppMonitor.getInstance().commitStat(horseRaceStat);
            } catch (InterruptedException unused) {
            }
        }
        tnetSpdySession.close(false, "HorseRace close");
    }

    private static IConnStrategy makeConnStrategy(final ConnProtocol connProtocol, final StrategyResultParser.Strategy strategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnStrategy) ipChange.ipc$dispatch("7eefc3ba", new Object[]{connProtocol, strategy}) : new IConnStrategy() { // from class: anet.channel.detect.HorseRaceDetector.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IConnStrategy
            public String getAccessPoint() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("7a134b63", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public Map<String, Object> getCommonInfo() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("6eaa1deb", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getHeartbeat() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpSource() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("e15dde12", new Object[]{this})).intValue();
                }
                return 2;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpType() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue();
                }
                return 1;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public List<ProxyStrategy> getProxyStrategies() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("69e2ba17", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getRetryTimes() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getStatus() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
                }
                return -1;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getUnit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("9e7fcd3f", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public boolean isSupportMultiPath() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("43485f44", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getIp() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("d02517fc", new Object[]{this}) : StrategyResultParser.Strategy.this.ip;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getPort() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a73231f1", new Object[]{this})).intValue() : StrategyResultParser.Strategy.this.aisles.port;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public ConnProtocol getProtocol() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ConnProtocol) ipChange2.ipc$dispatch("f3fe3d0f", new Object[]{this}) : connProtocol;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getConnectionTimeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3af0dde7", new Object[]{this})).intValue() : StrategyResultParser.Strategy.this.aisles.cto;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getReadTimeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("4db89faf", new Object[]{this})).intValue() : StrategyResultParser.Strategy.this.aisles.rto;
            }
        };
    }

    private void startTcpTask(String str, StrategyResultParser.Strategy strategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea9ee21", new Object[]{this, str, strategy});
            return;
        }
        String str2 = "HR" + this.seq.getAndIncrement();
        ALog.i(TAG, "startTcpTask", str2, c.IP, strategy.ip, "port", Integer.valueOf(strategy.aisles.port));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, strategy);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(strategy.ip, strategy.aisles.port);
            socket.setSoTimeout(strategy.aisles.cto == 0 ? 10000 : strategy.aisles.cto);
            ALog.i(TAG, "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            horseRaceStat.connErrorCode = ErrorConstant.ERROR_IO_EXCEPTION;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    private void startPing6Task(String str, HorseRaceStat horseRaceStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6efadd", new Object[]{this, str, horseRaceStat});
        } else if (!Utils.isIPV6Address(str)) {
        } else {
            try {
                PingResponse pingResponse = new PingTask(str, 1000, 3, 0, 0).launch().get();
                if (pingResponse == null) {
                    return;
                }
                horseRaceStat.pingSuccessCount = pingResponse.e();
                horseRaceStat.pingTimeoutCount = 3 - horseRaceStat.pingSuccessCount;
                horseRaceStat.localIP = pingResponse.a();
            } catch (Throwable th) {
                ALog.e(TAG, "ping6 task fail.", null, th, new Object[0]);
            }
        }
    }
}
