package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.request.Cancelable;
import anet.channel.request.FutureCancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpConnector;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.Inet64Util;
import anet.channel.util.RequestPriorityTable;
import anet.channel.util.TlsSniSocketFactory;
import anet.channel.util.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import tb.kge;

/* loaded from: classes.dex */
public class HttpSession extends Session {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HttpSession";
    private SSLSocketFactory sslSocketFactory;
    private boolean useOkhttp;

    static {
        kge.a(479678934);
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4a74edeb", new Object[]{this});
        }
        return null;
    }

    @Override // anet.channel.Session
    public boolean isReuse(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4949e94d", new Object[]{this, session})).booleanValue();
        }
        return false;
    }

    @Override // anet.channel.Session
    public boolean isSupportSmoothReconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c04e9cf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(HttpSession httpSession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16feba21", new Object[]{httpSession, new Integer(i), event});
        } else {
            httpSession.notifyStatus(i, event);
        }
    }

    public static /* synthetic */ void access$100(HttpSession httpSession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85049a2", new Object[]{httpSession, new Integer(i), event});
        } else {
            httpSession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ void access$200(HttpSession httpSession, Request request, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f8c192", new Object[]{httpSession, request, new Integer(i)});
        } else {
            httpSession.handleResponseCode(request, i);
        }
    }

    public static /* synthetic */ void access$300(HttpSession httpSession, Request request, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb4673", new Object[]{httpSession, request, map});
        } else {
            httpSession.handleResponseHeaders(request, map);
        }
    }

    public static /* synthetic */ void access$400(HttpSession httpSession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc44f825", new Object[]{httpSession, new Integer(i), event});
        } else {
            httpSession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ boolean access$500(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("787c419", new Object[]{httpSession})).booleanValue() : httpSession.useOkhttp;
    }

    public static /* synthetic */ boolean access$600(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9427ef1a", new Object[]{httpSession})).booleanValue() : httpSession.forceCellular;
    }

    public static /* synthetic */ boolean access$700(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20c81a1b", new Object[]{httpSession})).booleanValue() : httpSession.forceCellular;
    }

    public static /* synthetic */ boolean access$800(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad68451c", new Object[]{httpSession})).booleanValue() : httpSession.forceCellular;
    }

    public HttpSession(Context context, ConnInfo connInfo) {
        super(context, connInfo);
        this.useOkhttp = false;
        if (this.mConnStrategy == null) {
            this.mConnType = (this.mHost == null || !this.mHost.startsWith("https")) ? ConnType.HTTP : ConnType.HTTPS;
        } else if (!AwcnConfig.isHttpsSniEnable() || !this.mConnType.equals(ConnType.HTTPS)) {
        } else {
            this.sslSocketFactory = new TlsSniSocketFactory(this.mRealHost);
        }
    }

    public void setUseOkhttp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3405c244", new Object[]{this, new Boolean(z)});
        } else {
            this.useOkhttp = z;
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue() : this.mStatus == 4;
    }

    @Override // anet.channel.Session
    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
            return;
        }
        try {
            if (this.mConnStrategy != null && this.mConnStrategy.getIpSource() == 1) {
                notifyStatus(4, new Event(1));
            } else if (this.mConnStrategy != null && this.mConnStrategy.getStatus() == 1) {
                notifyStatus(4, new Event(1));
            } else {
                Request.Builder redirectEnable = new Request.Builder().setUrl(this.mHost).setSeq(this.mSeq).setConnectTimeout((int) (this.mConnTimeout * Utils.getNetworkTimeFactor())).setReadTimeout((int) (this.mReadTimeout * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
                if (this.sslSocketFactory != null) {
                    redirectEnable.setSslSocketFactory(this.sslSocketFactory);
                }
                if (this.mIpToHost) {
                    redirectEnable.addHeader(HttpConstant.HOST, this.mIp);
                }
                if (AwcnConfig.isAllowConvertIPv4ToIPv6() && Inet64Util.isIPv6OnlyNetwork() && anet.channel.strategy.utils.Utils.isIPV4Address(this.mIp)) {
                    try {
                        this.mConnectIp = Inet64Util.convertToIPv6ThrowsException(this.mIp);
                    } catch (Exception unused) {
                    }
                }
                ALog.e(TAG, "HttpSession connect", null, "host", this.mHost, c.IP, this.mConnectIp, "port", Integer.valueOf(this.mPort));
                final Request build = redirectEnable.build();
                build.setDnsOptimize(this.mConnectIp, this.mPort);
                ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.HttpSession.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        HttpConnector.Response connect = HttpConnector.connect(build, HttpSession.this.getForceCellular());
                        if (connect.httpCode > 0) {
                            HttpSession.access$000(HttpSession.this, 4, new Event(1));
                        } else {
                            HttpSession.access$100(HttpSession.this, 256, new Event(256, connect.httpCode, "Http connect fail"));
                        }
                    }
                }, ThreadPoolExecutorFactory.Priority.LOW);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public void close(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        updateCloseReason(str);
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            notifyStatus(6, null);
        }
    }

    @Override // anet.channel.Session
    public void close(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651642bf", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.autoReCreate = false;
        close(str);
    }

    @Override // anet.channel.Session
    public void close(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        this.autoReCreate = false;
        close();
    }

    @Override // anet.channel.Session
    public Cancelable request(final Request request, final RequestCb requestCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cancelable) ipChange.ipc$dispatch("f956c133", new Object[]{this, request, requestCb});
        }
        FutureCancelable futureCancelable = FutureCancelable.NULL;
        Request.Builder builder = null;
        final RequestStatistic requestStatistic = request != null ? request.rs : new RequestStatistic(this.mRealHost, null);
        if (!this.forceCellular) {
            requestStatistic.setConnType(this.mConnType);
        }
        if (requestStatistic.start == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = currentTimeMillis;
            requestStatistic.start = currentTimeMillis;
        }
        requestStatistic.isComplex = this.mSessionStat.isComplex;
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return futureCancelable;
        }
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (request.getSslSocketFactory() == null && this.sslSocketFactory != null) {
                builder = request.newBuilder().setSslSocketFactory(this.sslSocketFactory);
            }
            if (this.mIpToHost) {
                if (builder == null) {
                    builder = request.newBuilder();
                }
                builder.addHeader(HttpConstant.HOST, this.mIp);
            }
            if (builder != null) {
                request = builder.build();
            }
            if (this.mConnectIp == null) {
                String host = request.getHttpUrl().host();
                if (AwcnConfig.isAllowConvertIPv4ToIPv6() && Inet64Util.isIPv6OnlyNetwork() && anet.channel.strategy.utils.Utils.isIPV4Address(host)) {
                    try {
                        this.mConnectIp = Inet64Util.convertToIPv6ThrowsException(host);
                    } catch (Exception unused) {
                    }
                }
            }
            request.setDnsOptimize(this.mConnectIp, this.mPort);
            request.setUrlScheme(this.mConnType.isSSL());
            if (this.mConnStrategy != null) {
                request.rs.setIpInfo(this.mConnStrategy.getIpSource(), this.mConnStrategy.getIpType());
            } else {
                request.rs.setIpInfo(1, 1);
            }
            request.rs.unit = this.unit;
            final RequestCb requestCb2 = new RequestCb() { // from class: anet.channel.session.HttpSession.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                        return;
                    }
                    ALog.i(HttpSession.TAG, "", request.getSeq(), "httpStatusCode", Integer.valueOf(i), " bizReqId", request.rs.bizReqId);
                    ALog.i(HttpSession.TAG, "", request.getSeq(), "response headers", map, " bizReqId", request.rs.bizReqId);
                    requestCb.onResponseCode(i, map);
                    requestStatistic.serverRT = HttpHelper.parseServerRT(map, 1);
                    requestStatistic.serverBRT = HttpHelper.parseServerRT(map, 2);
                    requestStatistic.eagleEyeId = HttpHelper.parseEagleId(map);
                    requestStatistic.isHitCache = HttpHelper.parseCache(map);
                    requestStatistic.hitCache = HttpHelper.parseXCache(map);
                    requestStatistic.via = HttpHelper.parseVia(map);
                    HttpSession.access$200(HttpSession.this, request, i);
                    HttpSession.access$300(HttpSession.this, request, map);
                }

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else {
                        requestCb.onDataReceive(byteArray, z);
                    }
                }

                @Override // anet.channel.RequestCb
                public void onFinish(int i, String str, RequestStatistic requestStatistic2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic2});
                        return;
                    }
                    if (i <= 0 && i != -204) {
                        HttpSession.access$400(HttpSession.this, 2, new Event(2, 0, "Http connect fail"));
                    }
                    requestCb.onFinish(i, str, requestStatistic2);
                }
            };
            Runnable runnable = new Runnable() { // from class: anet.channel.session.HttpSession.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    request.rs.sendBeforeTime = System.currentTimeMillis() - request.rs.reqStart;
                    if (!HttpSession.access$500(HttpSession.this) || HttpSession.access$600(HttpSession.this)) {
                        HttpConnector.connect(request, requestCb2, HttpSession.access$800(HttpSession.this));
                        return;
                    }
                    try {
                        OkHttpConnector.request(request, requestCb2, false);
                    } catch (Throwable th) {
                        ALog.e(HttpSession.TAG, "try OkHttp request error.", request.getSeq(), th, " bizReqId", request.rs.bizReqId);
                        request.rs.useOkHttp = -1;
                        HttpConnector.connect(request, requestCb2, HttpSession.access$700(HttpSession.this));
                    }
                }
            };
            request.rs.requestTime = request.rs.sendStart - currentTimeMillis2;
            if (!request.isGold && !this.forceCellular) {
                return new FutureCancelable(ThreadPoolExecutorFactory.submitPriorityTask(runnable, RequestPriorityTable.lookup(request)), request.getSeq());
            }
            ALog.e(TAG, "send request with BACKUP-QUEUE, isGold=" + request.isGold + ", forceCellular=" + this.forceCellular, request.getSeq(), " bizReqId", request.rs.bizReqId);
            return new FutureCancelable(ThreadPoolExecutorFactory.submitBackupTask(runnable), request.getSeq());
        } catch (Throwable th) {
            if (requestCb != null) {
                requestCb.onFinish(-101, ErrorConstant.formatMsg(-101, th.toString()), requestStatistic);
            }
            return futureCancelable;
        }
    }
}
