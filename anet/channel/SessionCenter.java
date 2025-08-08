package anet.channel;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.security.ISecurity;
import anet.channel.session.HttpSession;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.statist.SwitchFlowStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.IAmdcSign;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.SessionSeq;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anetwork.channel.util.RequestConstant;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.tao.log.statistics.d;
import com.taobao.taolive.room.utils.ag;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.kge;
import tb.nog;
import tb.riy;

/* loaded from: classes.dex */
public class SessionCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "awcn.SessionCenter";
    public static Map<Config, SessionCenter> instancesMap;
    private static boolean mInit;
    public final AccsSessionManager accsSessionManager;
    public Config config;
    public String seqNum;
    public final SessionPool sessionPool = new SessionPool();
    public final SessionPool retryReqSessionPool = new SessionPool();
    public final Map<String, SessionRequest> srCacheMap = new HashMap();
    public final LruCache<String, SessionRequest> srConcurrencyCache = new LruCache<>(32);
    public final SessionAttributeManager attributeManager = new SessionAttributeManager();
    public final InnerListener innerListener = new InnerListener();
    public Context context = GlobalAppRuntimeInfo.getContext();

    public static /* synthetic */ void access$100(SessionCenter sessionCenter, StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8091be0", new Object[]{sessionCenter, httpDnsResponse});
        } else {
            sessionCenter.checkAndUpdateStrategy(httpDnsResponse);
        }
    }

    public static /* synthetic */ boolean access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue() : mInit;
    }

    static {
        kge.a(-1380365780);
        instancesMap = new HashMap();
        mInit = false;
    }

    public static synchronized void init(Context context) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            } else {
                GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
                if (!mInit) {
                    instancesMap.put(Config.DEFAULT_CONFIG, new SessionCenter(Config.DEFAULT_CONFIG));
                    AppLifecycle.initialize();
                    if (!AwcnConfig.isTbNextLaunch()) {
                        StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                    }
                    mInit = true;
                }
            }
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
            } else {
                init(context, str, GlobalAppRuntimeInfo.getEnv());
            }
        }
    }

    public static synchronized void init(Context context, String str, ENV env) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f406f06", new Object[]{context, str, env});
            } else if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            } else {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(str).setEnv(env).build();
                }
                init(context, config);
            }
        }
    }

    public static synchronized void init(Context context, Config config) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("910b656f", new Object[]{context, config});
            } else if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            } else if (config == null) {
                ALog.e(TAG, "paramter config is null!", null, new Object[0]);
                throw new NullPointerException("init failed. config is null");
            } else {
                init(context);
                if (!instancesMap.containsKey(config)) {
                    instancesMap.put(config, new SessionCenter(config));
                }
            }
        }
    }

    private SessionCenter(final Config config) {
        this.config = config;
        this.seqNum = config.getAppkey();
        this.innerListener.registerAll();
        this.accsSessionManager = new AccsSessionManager(this);
        if (!config.getAppkey().equals("[default]")) {
            final String appkey = config.getAppkey();
            ALog.e(TAG, "amdc set sign start！", null, new Object[0]);
            AmdcRuntimeInfo.setSign(new IAmdcSign() { // from class: anet.channel.SessionCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String getAppkey() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this}) : appkey;
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String sign(String str) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd165d2", new Object[]{this, str}) : config.getSecurity().sign(SessionCenter.this.context, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String aesEncryptStr(String str) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f310614", new Object[]{this, str}) : config.getSecurity().aesEncryptStr(appkey, str);
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String aesDecryptStr(String str) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7787bb3c", new Object[]{this, str}) : config.getSecurity().aesDecryptStr(appkey, str);
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public boolean useSecurityGuard() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6b2f289", new Object[]{this})).booleanValue() : !config.getSecurity().isSecOff();
                }
            });
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25480b21", new Object[]{this, env});
        } else {
            switchEnvironment(env);
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("410fe7bb", new Object[]{env});
                return;
            }
            if (GlobalAppRuntimeInfo.getEnv() != env) {
                ALog.i(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                GlobalAppRuntimeInfo.setEnv(env);
                StrategyCenter.getInstance().switchEnv();
                SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).switchAccsServer(env == ENV.TEST ? 0 : 1);
            }
            Iterator<Map.Entry<Config, SessionCenter>> it = instancesMap.entrySet().iterator();
            while (it.hasNext()) {
                SessionCenter value = it.next().getValue();
                if (value.config.getEnv() != env) {
                    ALog.i(TAG, "remove instance", value.seqNum, RequestConstant.ENVIRONMENT, value.config.getEnv());
                    value.accsSessionManager.forceCloseSession(false);
                    value.innerListener.unRegisterAll();
                    it.remove();
                }
            }
        }
    }

    public static synchronized SessionCenter getInstance(String str) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionCenter) ipChange.ipc$dispatch("493af5fd", new Object[]{str});
            }
            Config configByTag = Config.getConfigByTag(str);
            if (configByTag == null) {
                throw new RuntimeException("tag not exist!");
            }
            return getInstance(configByTag);
        }
    }

    public static synchronized SessionCenter getInstance(Config config) {
        Context appContext;
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionCenter) ipChange.ipc$dispatch("57ed800b", new Object[]{config});
            }
            if (config == null) {
                throw new NullPointerException("config is null!");
            }
            if (!mInit && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = instancesMap.get(config);
            if (sessionCenter == null) {
                sessionCenter = new SessionCenter(config);
                instancesMap.put(config, sessionCenter);
            }
            return sessionCenter;
        }
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionCenter) ipChange.ipc$dispatch("35a03d87", new Object[0]);
            }
            if (!mInit && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry<Config, SessionCenter> entry : instancesMap.entrySet()) {
                SessionCenter value = entry.getValue();
                if (entry.getKey() != Config.DEFAULT_CONFIG) {
                    return value;
                }
                sessionCenter = value;
            }
            return sessionCenter;
        }
    }

    public Session getThrowsException(String str, long j) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("cb9171c7", new Object[]{this, str, new Long(j)}) : getInternal(HttpUrl.parse(str), SessionType.ALL, ProtocolType.ALL, j, null);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("442ac39d", new Object[]{this, str, typeLevel, new Long(j)});
        }
        return getInternal(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, ProtocolType.ALL, j, null);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, long j, SessionParamStat sessionParamStat) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("f195542d", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionParamStat}) : getInternal(httpUrl, i, ProtocolType.ALL, j, null, sessionParamStat);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, long j) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("b663f858", new Object[]{this, httpUrl, new Integer(i), new Long(j)}) : getInternal(httpUrl, i, ProtocolType.ALL, j, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String, anet.channel.strategy.IConnStrategy] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public void getThrowsException(Uri uri, int i, long j, String str) throws Exception {
        String str2;
        String str3;
        HttpUrl httpUrl;
        String str4;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 2;
        char c = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85059a7f", new Object[]{this, uri, new Integer(i), new Long(j), str});
            return;
        }
        List<String> matchHostListByOption = AwcnConfig.getMatchHostListByOption(uri, str);
        if (matchHostListByOption == null || matchHostListByOption.isEmpty()) {
            return;
        }
        Iterator<String> it = matchHostListByOption.iterator();
        while (it.hasNext()) {
            String str5 = "https" + HttpConstant.SCHEME_SPLIT + it.next();
            HttpUrl parse = HttpUrl.parse(str5);
            if (parse == null) {
                return;
            }
            Object[] objArr = new Object[i3];
            objArr[0] = "list";
            objArr[c] = matchHostListByOption;
            ALog.e(TAG, "[dnsOpt] long link realUrl=" + str5, null, objArr);
            try {
                i2 = ProtocolType.ALL;
                str2 = 0;
                httpUrl = parse;
                str3 = TAG;
                str4 = HttpConstant.SCHEME_SPLIT;
            } catch (NoAvailStrategyException unused) {
                str2 = 0;
                httpUrl = parse;
                str4 = HttpConstant.SCHEME_SPLIT;
            } catch (Exception e) {
                e = e;
                str2 = 0;
                str3 = TAG;
            }
            try {
                getInternal(parse, i, i2, j, null);
            } catch (NoAvailStrategyException unused2) {
                Session session = get(httpUrl, SessionType.SHORT_LINK, 0L);
                if (session == null) {
                    session = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(StringUtils.concatString(httpUrl.scheme(), str4, httpUrl.host()), str2, str2));
                }
                if ((session instanceof HttpSession) && OkHttpConnector.isOkHttpEnable(httpUrl)) {
                    ((HttpSession) session).setUseOkhttp(true);
                }
                i3 = 2;
                c = 1;
            } catch (Exception e2) {
                e = e2;
                ALog.e(str3, "[dnsOpt] getThrowsException error =" + e.toString(), str2, new Object[0]);
                i3 = 2;
                c = 1;
            }
            i3 = 2;
            c = 1;
        }
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("456e6a35", new Object[]{this, httpUrl, typeLevel, new Long(j)});
        }
        return getInternal(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, ProtocolType.ALL, j, null);
    }

    public Session get(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("625cc7d1", new Object[]{this, str, new Long(j)}) : get(HttpUrl.parse(str), SessionType.ALL, j);
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("40a9c7a7", new Object[]{this, str, typeLevel, new Long(j)});
        }
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, j);
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("9872516b", new Object[]{this, httpUrl, typeLevel, new Long(j)});
        }
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, j);
    }

    public Session get(HttpUrl httpUrl, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("306ac9e2", new Object[]{this, httpUrl, new Integer(i), new Long(j)}) : get(httpUrl, i, ProtocolType.ALL, j);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, int i2, long j) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("defe8f7f", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j)}) : getInternal(httpUrl, i, i2, j, null);
    }

    public Session get(HttpUrl httpUrl, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("a5d1ef35", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j)}) : get(httpUrl, i, i2, j, null);
    }

    public Session get(HttpUrl httpUrl, int i, int i2, long j, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("438fc1b0", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j), sessionParamStat});
        }
        try {
            return getInternal(httpUrl, i, i2, j, null, sessionParamStat);
        } catch (NoAvailStrategyException e) {
            httpUrl.isNoStrategy = true;
            ALog.e(TAG, "[Get] no strategy! " + e.getMessage(), this.seqNum, "url", httpUrl.urlString());
            return null;
        } catch (NoSocketPermissionInBgException unused) {
            throw new NoSocketPermissionInBgException("no socket permissions in background");
        } catch (ConnectException e2) {
            ALog.e(TAG, "[Get]connect exception", this.seqNum, "errMsg", e2.getMessage(), "url", httpUrl.urlString());
            return null;
        } catch (InvalidParameterException e3) {
            ALog.e(TAG, "[Get]param url is invalid", this.seqNum, e3, "url", httpUrl);
            return null;
        } catch (TimeoutException e4) {
            ALog.e(TAG, "[Get]timeout exception", this.seqNum, e4, "url", httpUrl.urlString());
            return null;
        } catch (Exception e5) {
            ALog.e(TAG, "[Get]" + e5.getMessage(), this.seqNum, "url", httpUrl.urlString());
            return null;
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dac02", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionGetCallback, sessionParamStat});
        } else if (sessionGetCallback == null) {
            throw new NullPointerException("cb is null");
        } else {
            if (j <= 0) {
                throw new InvalidParameterException("timeout must > 0");
            }
            try {
                getInternalAsync(httpUrl, i, j, sessionGetCallback, sessionParamStat);
            } catch (NoAvailStrategyException e) {
                httpUrl.isNoStrategy = true;
                sessionGetCallback.onSessionGetFail();
                ALog.e(TAG, "[Get] no strategy! " + e.getMessage(), this.seqNum, "url", httpUrl.urlString());
            } catch (NoSocketPermissionInBgException unused) {
                sessionGetCallback.onSessionGetFail();
                throw new NoSocketPermissionInBgException("no socket permissions in background");
            } catch (Exception e2) {
                sessionGetCallback.onSessionGetFail();
                ALog.e(TAG, "[asyncGet] fail! ", this.seqNum, "url", httpUrl.urlString(), "error", e2);
            }
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c5bd5", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionGetCallback});
        } else {
            asyncGet(httpUrl, i, j, sessionGetCallback, (SessionParamStat) null);
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, boolean z, SessionGetCallback sessionGetCallback) throws Exception {
        SessionRequest sessionRequestByUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cb9cd1", new Object[]{this, httpUrl, new Integer(i), new Long(j), new Boolean(z), sessionGetCallback});
        } else if (!mInit) {
            ALog.e(TAG, "[fragmentation] getInternal not inited!", this.seqNum, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        } else {
            String str = this.seqNum;
            Object[] objArr = new Object[6];
            objArr[0] = RVStartParams.KEY_URL_SHORT;
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i == SessionType.LONG_LINK ? "LongLink" : "ShortLink";
            objArr[4] = "timeout";
            objArr[5] = Long.valueOf(j);
            ALog.e(TAG, "[fragmentation] getInternal", str, objArr);
            if (z) {
                sessionRequestByUrl = getConcurrencyRequestByUrl(httpUrl);
            } else {
                sessionRequestByUrl = getSessionRequestByUrl(httpUrl);
            }
            sessionRequestByUrl.setForceCellular(z);
            Session session = this.sessionPool.getSession(sessionRequestByUrl, i);
            if (session != null) {
                ALog.e(TAG, "fragmentation get internal hit cache session", this.seqNum, MspGlobalDefine.SESSION, session);
                sessionGetCallback.onSessionGetSuccess(session);
                return;
            }
            ALog.e(TAG, "[fragmentation] create session, isMultipath=[" + z + riy.ARRAY_END_STR, this.seqNum, new Object[0]);
            sessionRequestByUrl.startAsync(this.context, i, SessionSeq.createSequenceNo(this.seqNum), sessionGetCallback, j, z, null);
        }
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54836d52", new Object[]{this, sessionInfo});
            return;
        }
        this.attributeManager.registerSessionInfo(sessionInfo);
        if (!sessionInfo.isKeepAlive) {
            return;
        }
        this.accsSessionManager.checkAndStartSession();
    }

    public void unregisterSessionInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8f9b19", new Object[]{this, str});
            return;
        }
        SessionInfo unregisterSessionInfo = this.attributeManager.unregisterSessionInfo(str);
        if (unregisterSessionInfo == null || !unregisterSessionInfo.isKeepAlive) {
            return;
        }
        this.accsSessionManager.checkAndStartSession();
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31c66a5", new Object[]{this, iSessionListener});
        } else {
            this.accsSessionManager.registerListener(iSessionListener);
        }
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1dff7e", new Object[]{this, iSessionListener});
        } else {
            this.accsSessionManager.unregisterListener(iSessionListener);
        }
    }

    public void registerPublicKey(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5ec55f", new Object[]{this, str, new Integer(i)});
        } else {
            this.attributeManager.registerPublicKey(str, i);
        }
    }

    public static void checkAndStartAccsSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a0638", new Object[0]);
            return;
        }
        for (SessionCenter sessionCenter : instancesMap.values()) {
            sessionCenter.accsSessionManager.checkAndStartSession();
        }
    }

    public void forceRecreateAccsSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f581051", new Object[]{this});
        } else {
            this.accsSessionManager.forceCloseSession(true);
        }
    }

    private SessionRequest getSessionRequestByUrl(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionRequest) ipChange.ipc$dispatch("4ebfe2f1", new Object[]{this, httpUrl});
        }
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String scheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            scheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, scheme);
        }
        return getSessionRequest(StringUtils.concatString(scheme, HttpConstant.SCHEME_SPLIT, cNameByHost));
    }

    private SessionRequest getConcurrencyRequestByUrl(HttpUrl httpUrl) {
        SessionRequest sessionRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionRequest) ipChange.ipc$dispatch("3ab76c54", new Object[]{this, httpUrl});
        }
        String concatString = StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host());
        if (StringUtils.isEmpty(concatString)) {
            return null;
        }
        synchronized (this.srConcurrencyCache) {
            sessionRequest = this.srConcurrencyCache.get(concatString);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(concatString, this);
                this.srConcurrencyCache.put(concatString, sessionRequest);
            }
        }
        return sessionRequest;
    }

    public Session getInternal(HttpUrl httpUrl, int i, int i2, long j, SessionGetCallback sessionGetCallback) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("3031b487", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j), sessionGetCallback}) : getInternal(httpUrl, i, i2, j, sessionGetCallback, null);
    }

    public Session getInternal(HttpUrl httpUrl, int i, int i2, long j, SessionGetCallback sessionGetCallback, SessionParamStat sessionParamStat) throws Exception {
        Session session;
        Session session2;
        SessionInfo sessionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("edebd21e", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j), sessionGetCallback, sessionParamStat});
        }
        String str = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z = sessionParamStat != null && sessionParamStat.isRetry;
        if (!mInit) {
            ALog.e(TAG, "getInternal not inited!", this.seqNum, "reqSeq", str);
            throw new IllegalStateException("getInternal not inited");
        } else if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        } else {
            String str2 = this.seqNum;
            Object[] objArr = new Object[12];
            objArr[0] = RVStartParams.KEY_URL_SHORT;
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i == SessionType.LONG_LINK ? "LongLink" : "ShortLink";
            objArr[4] = "protocolType";
            objArr[5] = Integer.valueOf(i2);
            objArr[6] = "timeout";
            objArr[7] = Long.valueOf(j);
            objArr[8] = "reqSeq";
            objArr[9] = str;
            objArr[10] = d.PARAM_IS_RETRY;
            objArr[11] = Boolean.valueOf(z);
            ALog.e(TAG, "getInternal", str2, objArr);
            SessionRequest sessionRequestByUrl = getSessionRequestByUrl(httpUrl);
            if (z) {
                session = this.retryReqSessionPool.getSessionByRetry(sessionRequestByUrl, i, i2, sessionParamStat);
            } else {
                session = this.sessionPool.getSession(sessionRequestByUrl, i, i2);
            }
            Session session3 = session;
            if (session3 != null) {
                ALog.e(TAG, "fragmentation get internal hit cache session", this.seqNum, MspGlobalDefine.SESSION, session3, "reqSeq", str);
            } else if (this.config == Config.DEFAULT_CONFIG && i != SessionType.SHORT_LINK) {
                if (sessionGetCallback == null) {
                    return null;
                }
                sessionGetCallback.onSessionGetFail();
                return null;
            } else if (GlobalAppRuntimeInfo.isAppBackground() && i == SessionType.LONG_LINK && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfo = this.attributeManager.getSessionInfo(httpUrl.host())) != null && sessionInfo.isAccs) {
                ALog.w(TAG, "app background, forbid to create accs session", this.seqNum, "reqSeq", str);
                throw new ConnectException("accs session connecting forbidden in background");
            } else {
                sessionRequestByUrl.start(this.context, i, i2, SessionSeq.createSequenceNo(this.seqNum), sessionGetCallback, j, sessionParamStat);
                if (sessionGetCallback == null && j > 0 && ((i == SessionType.ALL || sessionRequestByUrl.getConnectingType() == i) && (i2 == ProtocolType.ALL || sessionRequestByUrl.getConnectingProtocolType() == i2))) {
                    sessionRequestByUrl.await(j);
                    if (z) {
                        session2 = this.retryReqSessionPool.getSessionByRetry(sessionRequestByUrl, i, i2, sessionParamStat);
                    } else {
                        session2 = this.sessionPool.getSession(sessionRequestByUrl, i, i2);
                    }
                    session3 = session2;
                    if (session3 == null) {
                        throw new ConnectException("session connecting failed or timeout");
                    }
                }
            }
            return session3;
        }
    }

    public void getInternalAsync(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback, SessionParamStat sessionParamStat) throws Exception {
        SessionInfo sessionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5ff713", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionGetCallback, sessionParamStat});
            return;
        }
        String str = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z = sessionParamStat != null && sessionParamStat.isRetry;
        if (!mInit) {
            ALog.e(TAG, "getInternal not inited!", this.seqNum, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        } else if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        } else {
            if (sessionGetCallback == null) {
                throw new InvalidParameterException("sessionGetCallback is null");
            }
            String str2 = this.seqNum;
            Object[] objArr = new Object[10];
            objArr[0] = RVStartParams.KEY_URL_SHORT;
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i == SessionType.LONG_LINK ? "LongLink" : "ShortLink";
            objArr[4] = "timeout";
            objArr[5] = Long.valueOf(j);
            objArr[6] = "reqSeq";
            objArr[7] = str;
            objArr[8] = d.PARAM_IS_RETRY;
            objArr[9] = Boolean.valueOf(z);
            ALog.d(TAG, "getInternal", str2, objArr);
            SessionRequest sessionRequestByUrl = getSessionRequestByUrl(httpUrl);
            Session session = null;
            if (sessionParamStat != null && sessionParamStat.sessionFlag == 0) {
                if (z) {
                    session = this.retryReqSessionPool.getSessionByRetry(sessionRequestByUrl, i, ProtocolType.ALL, sessionParamStat);
                } else {
                    session = this.sessionPool.getSession(sessionRequestByUrl, i, ProtocolType.ALL);
                }
            }
            if (session != null) {
                ALog.e(TAG, "get internal hit cache session", this.seqNum, MspGlobalDefine.SESSION, session, "reqSeq", str);
                sessionGetCallback.onSessionGetSuccess(session);
            } else if (this.config == Config.DEFAULT_CONFIG && i != SessionType.SHORT_LINK) {
                sessionGetCallback.onSessionGetFail();
            } else if (GlobalAppRuntimeInfo.isAppBackground() && i == SessionType.LONG_LINK && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfo = this.attributeManager.getSessionInfo(httpUrl.host())) != null && sessionInfo.isAccs) {
                ALog.w(TAG, "app background, forbid to create accs session", this.seqNum, "reqSeq", str);
                throw new ConnectException("accs session connecting forbidden in background");
            } else {
                sessionRequestByUrl.startAsync(this.context, i, SessionSeq.createSequenceNo(this.seqNum), sessionGetCallback, j, false, sessionParamStat);
            }
        }
    }

    public Session getSessionBySessionPool(HttpUrl httpUrl, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("60c6e2b1", new Object[]{this, httpUrl, new Integer(i)}) : this.sessionPool.getSession(getSessionRequestByUrl(httpUrl), i, ProtocolType.ALL);
    }

    @Deprecated
    public void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
        } else {
            AppLifecycle.onBackground();
        }
    }

    @Deprecated
    public void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
        } else {
            AppLifecycle.onForeground();
        }
    }

    private void checkAndUpdateStrategy(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5e9817", new Object[]{this, httpDnsResponse});
            return;
        }
        try {
            StrategyResultParser.Dns[] dnsArr = httpDnsResponse.dns;
            if (dnsArr != null && dnsArr.length != 0) {
                for (StrategyResultParser.Dns dns : dnsArr) {
                    if (AwcnConfig.isAllowAccessPoint()) {
                        if (httpDnsResponse.accessPoint != null || httpDnsResponse.clientIp != null) {
                            handleAccessPointChange(dns.safeAisles, dns.host, ((httpDnsResponse.accessPoint == null || httpDnsResponse.accessPoint.isEmpty()) && httpDnsResponse.clientIp != null && !httpDnsResponse.clientIp.isEmpty()) ? httpDnsResponse.clientIp : httpDnsResponse.accessPoint);
                        }
                    } else {
                        if (dns.effectNow) {
                            handleEffectNowByDns(dns);
                        }
                        if (dns.unit != null) {
                            handleUnitChange(dns.safeAisles, dns.host, dns.unit);
                        }
                        if (dns.hasIPv6) {
                            handleIPv6Reconnect(dns.safeAisles, dns.host);
                        }
                    }
                    if (dns.hasHttp3) {
                        handleHttp3Reconnect(dns.safeAisles, dns.host);
                    }
                    handleInvalidStrategyReconnect(dns.safeAisles, dns.host);
                    handlePreSession(dns.safeAisles, dns.host, SwitchMonitorLogUtil.SRC_AMDC);
                    AwcnConfig.updateAccessPointStatus(dns.host);
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "checkStrategy failed", this.seqNum, e, new Object[0]);
        }
    }

    private void handleIPv6Reconnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b17f223", new Object[]{this, str, str2});
            return;
        }
        String buildKey = StringUtils.buildKey(str, str2);
        for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
            if (!anet.channel.strategy.utils.Utils.isIPV6Address(session.mIp) && !session.isComplex) {
                ALog.e(TAG, "[handleSession] reconnect to ipv6", session.mSeq, "session host", session.mHost, c.IP, session.mIp);
                handleSession(str2, buildKey, session, 1, null, "ipv6");
            }
        }
    }

    private void handleHttp3Reconnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec44954f", new Object[]{this, str, str2});
        } else if (AwcnConfig.isHttp3ReconnectEnable()) {
            String buildKey = StringUtils.buildKey(str, str2);
            for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
                if (!session.mConnType.isHTTP3() && !session.isDeprecated) {
                    ALog.e(TAG, "[handleSession] reconnect to http3 ", session.mSeq, "session host", session.mHost, c.IP, session.mIp);
                    handleSession(str2, buildKey, session, 2, null, "http3_reconnect");
                }
            }
        }
    }

    private void handleInvalidStrategyReconnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8ea750", new Object[]{this, str, str2});
        } else if (AwcnConfig.isAmdcStrategyUpdateEnable()) {
            String buildKey = StringUtils.buildKey(str, str2);
            for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
                if (session.isStrategyInvalid && !session.isDeprecated) {
                    ALog.e(TAG, "[handleSession] reconnect to invalid strategy", session.mSeq, "session host", session.mHost, c.IP, session.mIp);
                    handleSession(str2, buildKey, session, 2, null, "invalid_strategy");
                }
            }
        }
    }

    public void handlePreSession(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4bbe20", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (!AwcnConfig.isPreSessionOptEnable() || !AwcnConfig.isPreSessionWhiteList(str2) || !AwcnConfig.isAllowUsePreSession(str2)) {
                return;
            }
            AwcnConfig.updateUsePreSession(str2);
            String buildKey = StringUtils.buildKey(str, str2);
            Session session = this.sessionPool.getSession(getSessionRequest(buildKey), SessionType.LONG_LINK);
            if (session == null) {
                getThrowsException(HttpUrl.parse(buildKey), SessionType.LONG_LINK, 0L);
                ALog.e(TAG, "[handlePreSession] pre session = ", null, "host", str2, "msg", str3);
                return;
            }
            ALog.e(TAG, "[handlePreSession] exist pre session = " + session, session.mSeq, "host", str2, "msg", str3);
        } catch (Throwable th) {
            ALog.e(TAG, "[handlePreSession] error = " + th.toString(), null, "host", str2);
        }
    }

    private void handleUnitChange(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd30dec1", new Object[]{this, str, str2, str3});
            return;
        }
        String buildKey = StringUtils.buildKey(str, str2);
        for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
            if (!StringUtils.isStringEqual(session.unit, str3)) {
                ALog.e(TAG, "[handleSession] reconnect to unit", session.mSeq, "session unit", session.unit, nog.PRICE_UNIT, str3);
                handleSession(str2, buildKey, session, 3, str3, nog.PRICE_UNIT);
            }
        }
    }

    private void handleAccessPointChange(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdb7639", new Object[]{this, str, str2, str3});
        } else if (AwcnConfig.isVpnOptOpened() && AwcnConfig.isHostInVpnProxySessionWhiteList(str2)) {
            String buildKey = StringUtils.buildKey(str, str2);
            for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
                if (!StringUtils.isStringEqual(session.accessPoint, str3)) {
                    ALog.e(TAG, "[handleSession] reconnect to ap", session.mSeq, "session accessPoint", session.accessPoint, ag.KEY_ACCESS_POINT, str3, "session host", session.mHost, c.IP, session.mIp);
                    handleSession(str2, buildKey, session, 4, str3, ag.KEY_ACCESS_POINT);
                }
            }
        }
    }

    public boolean isExistH3Session(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cda825f3", new Object[]{this, str})).booleanValue();
        }
        for (Session session : this.sessionPool.getSessions(getSessionRequest(StringUtils.buildKey("https", str)))) {
            if (session.mConnType.isHTTP3()) {
                ALog.e(TAG, "[registerHTTP3ConnProtocol] isExistH3Session", session.mSeq, "host", str, c.IP, session.mConnStrategy.getIp(), "protocol", session.mConnStrategy.getProtocol().toString());
                return true;
            }
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(false, str);
        if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
            ListIterator<IConnStrategy> listIterator = connStrategyListByHost.listIterator();
            while (listIterator.hasNext()) {
                IConnStrategy next = listIterator.next();
                ConnType valueOf = ConnType.valueOf(next.getProtocol());
                if (valueOf != null && valueOf.isHTTP3()) {
                    ALog.e(TAG, "[registerHTTP3ConnProtocol] isExistH3Strategy", this.seqNum, "host", str, "connType", valueOf.toString(), c.IP, next.getIp());
                    return true;
                }
            }
        }
        return false;
    }

    private void handleSession(String str, String str2, final Session session, int i, String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92759f76", new Object[]{this, str, str2, session, new Integer(i), str3, str4});
            return;
        }
        final SwitchFlowStat switchFlowStat = new SwitchFlowStat(str, str4);
        if (AwcnConfig.isSmoothReconnectEnable() && session.isSupportSmoothReconnect()) {
            ALog.e(TAG, "[handleSession] smooth reconnect start" + str4, session.mSeq, "host", str);
            if (AwcnConfig.isSmoothReconnectOptOpened()) {
                asyncGet(HttpUrl.parse(str2), SessionType.LONG_LINK, 3000L, new SessionGetCallback() { // from class: anet.channel.SessionCenter.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // anet.channel.SessionGetCallback
                    public void onSessionGetSuccess(Session session2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d473443", new Object[]{this, session2});
                            return;
                        }
                        ALog.e(SessionCenter.TAG, "[handleSession] need smooth reconnect, scene=" + str4 + " ,onSessionGetSuccess! ", session.mSeq, "newSession", session2.mSeq, "oldSession", session.mSeq);
                        switchFlowStat.smoothReconnect = 1;
                        session.isDeprecated = true;
                    }

                    @Override // anet.channel.SessionGetCallback
                    public void onSessionGetFail() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("735355e4", new Object[]{this});
                            return;
                        }
                        ALog.e(SessionCenter.TAG, "[handleSession] not smooth reconnect, scene=" + str4 + " ,onSessionGetFail", session.mSeq, "Session", session);
                    }
                }, new SessionParamStat(i));
            } else {
                switchFlowStat.smoothReconnect = 1;
                session.isDeprecated = true;
                get(HttpUrl.parse(str2), session.getConnType().isHttpType() ? SessionType.SHORT_LINK : SessionType.LONG_LINK, 0L);
            }
        } else {
            session.close(true, str4 + "connect_change");
        }
        AppMonitor.getInstance().commitStat(switchFlowStat);
    }

    public void handleSessionNetworkStatus(List<Session> list, boolean z, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd9580b", new Object[]{this, list, new Boolean(z), networkStatus});
        } else if (list != null && !list.isEmpty()) {
            for (Session session : list) {
                if (AwcnConfig.isLastStatusNoneOpt() && networkStatus != null && networkStatus.isLastNone.get()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[handleSessionNetworkStatus] isLastNone=");
                    sb.append(networkStatus.isLastNone.get() ? 1 : 2);
                    ALog.e(TAG, sb.toString(), session.mSeq, new Object[0]);
                    session.ping(true, 2000);
                } else if (session.mConnType.isHTTP3() && ((z || session.mConnStrategy.isSupportMultiPath()) && session.isSupportSmoothReconnect())) {
                    ALog.e(TAG, "[handleSessionNetworkStatus]smooth reconnect", session.mSeq, new Object[0]);
                    session.isDeprecated = true;
                    session.isNetworkStatusChangeDeprecated = true;
                    session.ping(true, 2000);
                } else if (AwcnConfig.isNetworkStatusOpt() && session.isSupportSmoothReconnect()) {
                    session.isDeprecated = true;
                    session.isNetworkStatusChangeDeprecated = true;
                    session.autoReCreate = true;
                    session.ping(true, 1000);
                    ALog.e(TAG, "[network status opt] [handleSessionNetworkStatus] smooth reconnect", session.mSeq, new Object[0]);
                } else {
                    session.close(true, "network_change");
                }
            }
        }
    }

    private void handleEffectNowByDns(StrategyResultParser.Dns dns) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b2bd1a", new Object[]{this, dns});
            return;
        }
        ALog.i(TAG, "find effectNow by dns", this.seqNum, "host", dns.host);
        if (dns.servers == null || dns.servers.length == 0) {
            return;
        }
        for (Session session : this.sessionPool.getSessions(getSessionRequest(StringUtils.buildKey(dns.safeAisles, dns.host)))) {
            if (!session.getConnType().isHttpType()) {
                for (int i = 0; i < dns.servers.length; i++) {
                    StrategyResultParser.Channel[] channelArr = dns.servers[i].channels;
                    if (channelArr != null && channelArr.length != 0) {
                        for (int i2 = 0; i2 < channelArr.length; i2++) {
                            StrategyResultParser.ChannelAttribute[] channelAttributeArr = channelArr[i2].attributes;
                            String[] strArr = channelArr[i2].ips;
                            if (channelAttributeArr != null && channelAttributeArr.length != 0 && strArr != null && strArr.length != 0) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= strArr.length) {
                                        z = false;
                                        break;
                                    } else if (session.getIp().equals(strArr[i3])) {
                                        z = true;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= channelAttributeArr.length) {
                                        z2 = false;
                                        break;
                                    } else if (session.getPort() == channelAttributeArr[i4].port && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(channelAttributeArr[i4])))) {
                                        z2 = true;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                if (z2 & z) {
                                    if (!ALog.isPrintLog(2)) {
                                        return;
                                    }
                                    ALog.i(TAG, "ip & ConnStrategy match", session.mSeq, c.IP, session.getIp(), "port", Integer.valueOf(session.getPort()), "connType", session.getConnType());
                                    return;
                                }
                            }
                        }
                        continue;
                    }
                }
                session.close(true, "ip_ConnStrategy_not_match");
            }
        }
    }

    public SessionRequest getSessionRequest(String str) {
        SessionRequest sessionRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionRequest) ipChange.ipc$dispatch("49e71bf9", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.srCacheMap) {
            sessionRequest = this.srCacheMap.get(str);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(str, this);
                this.srCacheMap.put(str, sessionRequest);
            }
        }
        return sessionRequest;
    }

    /* loaded from: classes.dex */
    public class InnerListener implements NetworkStatusHelper.INetworkStatusChangeListener, NetworkStatusHelper.IVpnProxyStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean foreGroundCheckRunning;

        static {
            kge.a(1595365522);
            kge.a(-971120945);
            kge.a(-1738877398);
            kge.a(-1892858381);
            kge.a(-850519803);
        }

        private InnerListener() {
            this.foreGroundCheckRunning = false;
        }

        public void registerAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0db8185", new Object[]{this});
                return;
            }
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
            NetworkStatusHelper.registerVpnProxyStatusListener(this);
        }

        public void unRegisterAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbe05ac", new Object[]{this});
                return;
            }
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
            NetworkStatusHelper.unregisterVpnProxyStatusListener(this);
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            String str = "onNetworkStatusChanged. config=" + SessionCenter.this.config.getTag();
            String str2 = SessionCenter.this.seqNum;
            Object[] objArr = new Object[4];
            objArr[0] = "networkStatus";
            objArr[1] = networkStatus;
            objArr[2] = "isLastNone";
            if (networkStatus == null) {
                i = -1;
            } else if (networkStatus.isLastNone.get()) {
                i = 1;
            }
            objArr[3] = Integer.valueOf(i);
            ALog.e(SessionCenter.TAG, str, str2, objArr);
            List<SessionRequest> infos = SessionCenter.this.sessionPool.getInfos();
            if (!infos.isEmpty()) {
                for (SessionRequest sessionRequest : infos) {
                    ALog.d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.seqNum, new Object[0]);
                    sessionRequest.reCreateSession(null, networkStatus);
                }
            }
            SessionCenter.this.accsSessionManager.checkAndStartSession();
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33e6115", new Object[]{this, httpDnsResponse});
                return;
            }
            SessionCenter.access$100(SessionCenter.this, httpDnsResponse);
            SessionCenter.this.accsSessionManager.checkAndStartSession();
        }

        @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
        public void onVpnProxyStatusChanged(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            List<SessionRequest> infos = SessionCenter.this.sessionPool.getInfos();
            if (infos.isEmpty()) {
                return;
            }
            for (SessionRequest sessionRequest : infos) {
                ALog.e(SessionCenter.TAG, "[ap] onVpnProxyStatusChanged check session available. request=" + sessionRequest.getHost(), SessionCenter.this.config.getTag(), new Object[0]);
                sessionRequest.checkSession(1500, SessionCenter.this.config.getTag());
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5402817", new Object[]{this});
                return;
            }
            ALog.e(SessionCenter.TAG, "[forground] config=" + SessionCenter.this.config.getTag(), SessionCenter.this.seqNum, new Object[0]);
            if (SessionCenter.this.context == null || this.foreGroundCheckRunning) {
                return;
            }
            this.foreGroundCheckRunning = true;
            try {
                if (!SessionCenter.access$200()) {
                    ALog.e(SessionCenter.TAG, "forground not inited!", SessionCenter.this.seqNum, new Object[0]);
                    return;
                }
                try {
                    if (AppLifecycle.lastEnterBackgroundTime != 0 && System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime > 60000) {
                        SessionCenter.this.accsSessionManager.forceCloseSession(true);
                    } else {
                        SessionCenter.this.accsSessionManager.checkAndStartSession();
                    }
                    if (AppLifecycle.lastEnterBackgroundTime != 0) {
                        ALog.e(SessionCenter.TAG, "foreground check session available.", SessionCenter.this.seqNum, new Object[0]);
                        List<SessionRequest> infos = SessionCenter.this.sessionPool.getInfos();
                        if (!infos.isEmpty()) {
                            for (SessionRequest sessionRequest : infos) {
                                sessionRequest.checkSessionsAvailable();
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.foreGroundCheckRunning = false;
                    throw th;
                }
                this.foreGroundCheckRunning = false;
            } catch (Exception unused2) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
                return;
            }
            ALog.e(SessionCenter.TAG, "[background] config=" + SessionCenter.this.config.getTag(), SessionCenter.this.seqNum, new Object[0]);
            if (!SessionCenter.access$200()) {
                ALog.e(SessionCenter.TAG, "background not inited!", SessionCenter.this.seqNum, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (!AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                    return;
                }
                ALog.e(SessionCenter.TAG, "close session", SessionCenter.this.seqNum, new Object[0]);
                SessionCenter.this.accsSessionManager.forceCloseSession(false);
            } catch (Exception unused) {
            }
        }
    }
}
