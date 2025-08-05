package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.entity.ConnType;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.ComplexUtils;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.util.a;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ado;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyInstance implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.StrategyCenter";
    public static int detectHttp3Status;
    public static AtomicBoolean isContainHttp3;
    public boolean isInitialized = false;
    public StrategyInfoHolder holder = null;
    public long lastPersistentTime = 0;
    public CopyOnWriteArraySet<IStrategyListener> listeners = new CopyOnWriteArraySet<>();
    public AtomicBoolean isLocalDns = new AtomicBoolean(false);

    public static /* synthetic */ boolean access$000(StrategyInstance strategyInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21c91b65", new Object[]{strategyInstance})).booleanValue() : strategyInstance.checkHolderIsNull();
    }

    static {
        kge.a(795664037);
        kge.a(1611077076);
        kge.a(-1033239576);
        isContainHttp3 = new AtomicBoolean(false);
        detectHttp3Status = -1;
    }

    /* loaded from: classes.dex */
    public class DefaultStrategyFilter implements IStrategyFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public volatile String host;

        static {
            kge.a(-578844531);
            kge.a(-1890152329);
        }

        public DefaultStrategyFilter(String str) {
            this.host = str;
        }

        @Override // anet.channel.strategy.IStrategyFilter
        public boolean accept(IConnStrategy iConnStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue();
            }
            String str = iConnStrategy.getProtocol().protocol;
            if (ConnType.QUIC.equals(str) || ConnType.QUIC_PLAIN.equals(str)) {
                ALog.i(StrategyInstance.TAG, "gquic strategy disabled, host=" + this.host, null, "strategy", iConnStrategy);
                return false;
            } else if (AwcnConfig.isSpdyOfflineEnable() && "spdy".equals(str)) {
                ALog.i(StrategyInstance.TAG, "spdy strategy disabled, host=" + this.host, null, "strategy", iConnStrategy);
                return false;
            } else if (!AwcnConfig.isIpv6Enable() && Utils.isIPV6Address(iConnStrategy.getIp())) {
                ALog.e(StrategyInstance.TAG, "isIpv6Enable = false, not use ipv6, host=" + this.host, null, "strategy", iConnStrategy);
                return false;
            } else {
                if (ConnType.HTTP3.equals(str) || ConnType.HTTP3_PLAIN.equals(str)) {
                    if (!Http3ConnectionDetector.isQuicReady()) {
                        ALog.e(StrategyInstance.TAG, "[xquic remote] xquic not ready, can't use http3", null, "strategy", iConnStrategy);
                        return false;
                    } else if (AwcnConfig.isHostInHttp3BlackList(this.host)) {
                        ALog.e(StrategyInstance.TAG, "isHostInHttp3BlackList, not use http3, host=" + this.host, null, "strategy", iConnStrategy);
                        return false;
                    } else {
                        boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
                        StrategyInstance.detectHttp3Status = Http3ConnectionDetector.detectHttp3Status();
                        if (AwcnConfig.isHostInHttp3WhiteList(this.host)) {
                            ALog.e(StrategyInstance.TAG, "isHttp3WhiteList, try use http3, host=" + this.host, null, "strategy", iConnStrategy);
                            return true;
                        }
                        boolean isHostIn1RttHttp3WhiteList = AwcnConfig.isHostIn1RttHttp3WhiteList(this.host);
                        if (!isHttp3Enable || StrategyInstance.detectHttp3Status == 0 || (StrategyInstance.detectHttp3Status == -1 && !isHostIn1RttHttp3WhiteList)) {
                            ALog.e(StrategyInstance.TAG, "http3 strategy disabled, host=" + this.host + " globalHttp3Enable=" + isHttp3Enable + " detectHttp3Status=" + StrategyInstance.detectHttp3Status + " is1RttHttp3WhiteList=" + isHostIn1RttHttp3WhiteList, null, "strategy", iConnStrategy);
                            return false;
                        } else if (!AwcnConfig.isHttp3DefaultEnable() && AwcnConfig.isHostInHttp3DefaultWhiteList(this.host)) {
                            ALog.e(StrategyInstance.TAG, "Default http3 strategy disabled, host=" + this.host, null, "strategy", iConnStrategy);
                            return false;
                        }
                    }
                }
                return true;
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else if (this.isInitialized || context == null) {
        } else {
            try {
                ALog.i(TAG, "StrategyCenter initialize started.", null, new Object[0]);
                AwcnConfig.init(context);
                NetworkStatusHelper.startListener(context);
                AmdcRuntimeInfo.setContext(context);
                StrategySerializeHelper.initialize(context);
                HttpDispatcher.getInstance().addListener(this);
                this.holder = StrategyInfoHolder.newInstance();
                this.isInitialized = true;
                ALog.i(TAG, "StrategyCenter initialize finished.", null, new Object[0]);
            } catch (Exception e) {
                ALog.e(TAG, "StrategyCenter initialize failed.", null, e, new Object[0]);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cced20", new Object[]{this});
            return;
        }
        StrategySerializeHelper.clearStrategyFolder();
        HttpDispatcher.getInstance().switchENV();
        if (this.holder != null) {
            this.holder.clear();
            this.holder = StrategyInfoHolder.newInstance();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("83b20dd5", new Object[]{this, str}) : getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45b26e0b", new Object[]{this, str, str2}) : getSchemeByHost(str, str2, false);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13d97841", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (checkHolderIsNull()) {
            return (!AwcnConfig.isGetSchemeOptEnable() || str2 != null) ? str2 : getGuessSchemeByHost(str);
        }
        String safeAislesByHost = this.holder.strategyConfig.getSafeAislesByHost(str, z);
        if (safeAislesByHost != null || TextUtils.isEmpty(str2)) {
            str2 = safeAislesByHost;
        }
        if (str2 == null) {
            str2 = getGuessSchemeByHost(str);
        }
        ALog.d(TAG, "getSchemeByHost", null, "host", str, "scheme", str2);
        return str2;
    }

    public String getGuessSchemeByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e37b32a", new Object[]{this, str});
        }
        String guessScheme = SchemeGuesser.getInstance().guessScheme(str);
        return guessScheme == null ? "http" : guessScheme;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11fc59b8", new Object[]{this, str});
        }
        if (!checkHolderIsNull() && !TextUtils.isEmpty(str)) {
            return this.holder.getCurrStrategyTable().getCnameByHost(str);
        }
        return null;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d1fb8f", new Object[]{this, str});
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            ALog.e(TAG, "url is invalid.", null, MonitorItemConstants.KEY_URL, str);
            return null;
        }
        String urlString = parse.urlString();
        try {
            String schemeByHost = getSchemeByHost(parse.host(), parse.scheme());
            if (!schemeByHost.equalsIgnoreCase(parse.scheme())) {
                urlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf(ado.URL_SEPARATOR)));
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(TAG, "", null, a.ATOM_raw, StringUtils.simplifyString(str, 128), com.taobao.mtop.wvplugin.a.RESULT_KEY, StringUtils.simplifyString(urlString, 128));
            }
        } catch (Exception e) {
            ALog.e(TAG, "getFormalizeUrl failed", null, e, a.ATOM_raw, str);
        }
        return urlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUniqueId(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75163034", new Object[]{this, networkStatus});
        }
        StrategyInfoHolder strategyInfoHolder = this.holder;
        return strategyInfoHolder == null ? "error" : strategyInfoHolder.getUniqueId(networkStatus);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cd8a4c22", new Object[]{this, new Boolean(z), str}) : getConnStrategyListByHost(str, new DefaultStrategyFilter(str), false, z);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("310eabf6", new Object[]{this, str, new Boolean(z)}) : getConnStrategyListByHost(str, new DefaultStrategyFilter(str), z);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fc1e56e4", new Object[]{this, str}) : getConnStrategyListByHost(str, new DefaultStrategyFilter(str));
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("66706ca0", new Object[]{this, str, iStrategyFilter}) : getConnStrategyListByHost(str, iStrategyFilter, false, true);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getLocalDnsConnStrategyListByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("35653446", new Object[]{this, str}) : this.holder.localDnsStrategyTable.queryByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("10ff4dba", new Object[]{this, str, iStrategyFilter, new Boolean(z)}) : getConnStrategyListByHost(str, iStrategyFilter, false, true);
    }

    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter, boolean z, boolean z2) {
        String cnameByHost;
        List queryByHost;
        String str2 = str;
        IpChange ipChange = $ipChange;
        int i = 4;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b84c8fe0", new Object[]{this, str2, iStrategyFilter, new Boolean(z), new Boolean(z2)});
        }
        isContainHttp3.set(false);
        if (TextUtils.isEmpty(str) || checkHolderIsNull()) {
            return Collections.EMPTY_LIST;
        }
        if (z) {
            cnameByHost = this.holder.getCellularStrategyTable().getCnameByHost(str2, z);
        } else {
            cnameByHost = this.holder.getCurrStrategyTable().getCnameByHost(str2, z);
        }
        if (!TextUtils.isEmpty(cnameByHost)) {
            str2 = cnameByHost;
        }
        if (z) {
            queryByHost = this.holder.getCellularStrategyTable().queryByHost(str2, z);
        } else {
            queryByHost = this.holder.getCurrStrategyTable().queryByHost(str2, z);
        }
        if (z2) {
            if (queryByHost.isEmpty()) {
                queryByHost = this.holder.localDnsStrategyTable.queryByHost(str2);
                this.isLocalDns.set(true);
                ALog.e("[Ipv6_H3] getConnStrategyListByHost, isLocalDns", null, "host", str2, "localStrategy", queryByHost);
            }
            if (queryByHost.isEmpty()) {
                this.isLocalDns.set(false);
                ALog.d("[Ipv6_H3] getConnStrategyListByHost", null, "host", str2, "result", queryByHost);
                return queryByHost;
            }
        }
        ListIterator<IConnStrategy> listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (isHttp3(next)) {
                isContainHttp3.set(true);
            }
            if (AwcnConfig.isIpv6WifiDualStackOptEnable() && NetworkStatusHelper.getStatus().isWifi() && ComplexUtils.isAllowComplexConnect(str2, next.getIp()) && isHttp3(next)) {
                next = IPConnStrategy.create(next.getIp(), next.getPort(), ConnProtocol.valueOf(ConnType.HTTP3_1RTT, "", ""), next.getConnectionTimeout(), next.getReadTimeout(), next.getRetryTimes(), next.getHeartbeat(), next.getUnit(), next.getAccessPoint(), next.getAccessPoint());
                listIterator.set(next);
                Object[] objArr = new Object[i];
                objArr[0] = "host";
                objArr[1] = str2;
                objArr[2] = "useStrategy";
                objArr[3] = next;
                ALog.e(TAG, "[Ipv6_H3] getConnStrategyListByHost, wifi+ipv6+dual_stack, use h3_1rtt=", null, objArr);
            }
            if (iStrategyFilter != null && !iStrategyFilter.accept(next)) {
                listIterator.remove();
            }
            i = 4;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("getConnStrategyListByHost", null, "host", str2, "result", queryByHost);
        }
        return queryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public int getDetectHttp3Status() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf353f9e", new Object[]{this})).intValue() : detectHttp3Status;
    }

    public boolean isHttp3(IConnStrategy iConnStrategy) {
        ConnType valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9472e152", new Object[]{this, iConnStrategy})).booleanValue();
        }
        if (iConnStrategy != null && (valueOf = ConnType.valueOf(iConnStrategy.getProtocol())) != null) {
            return valueOf.isHTTP3();
        }
        return false;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getIpv4ConnStrategyListByHost(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7873c30", new Object[]{this, str, new Boolean(z), new Integer(i)});
        }
        List<IConnStrategy> queryIpv4ByHost = this.holder.localDnsStrategyTable.queryIpv4ByHost(str, z, i);
        if (queryIpv4ByHost.isEmpty()) {
            return queryIpv4ByHost;
        }
        ListIterator<IConnStrategy> listIterator = queryIpv4ByHost.listIterator();
        while (listIterator.hasNext()) {
            if (!new DefaultStrategyFilter(str).accept(listIterator.next())) {
                listIterator.remove();
            }
        }
        return queryIpv4ByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListWithoutWait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("48be98ec", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || checkHolderIsNull()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.holder.getCurrStrategyTable().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List<IConnStrategy> queryByHost = this.holder.getCurrStrategyTable().queryByHost(str);
        if (queryByHost.isEmpty()) {
            queryByHost = this.holder.localDnsStrategyTable.queryWithoutWait(str);
        }
        ListIterator<IConnStrategy> listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            if (!new DefaultStrategyFilter(str).accept(listIterator.next())) {
                listIterator.remove();
            }
        }
        return queryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5136f54", new Object[]{this, str});
        } else if (checkHolderIsNull() || TextUtils.isEmpty(str)) {
        } else {
            ALog.i(TAG, "force refresh strategy", null, "host", str);
            this.holder.getCurrStrategyTable().sendAmdcRequest(str, true);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68119030", new Object[]{this, iStrategyListener});
            return;
        }
        ALog.e(TAG, "registerListener", null, DataReceiveMonitor.CB_LISTENER, this.listeners);
        if (iStrategyListener == null) {
            return;
        }
        this.listeners.add(iStrategyListener);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7cf837", new Object[]{this, iStrategyListener});
            return;
        }
        ALog.e(TAG, "unregisterListener", null, DataReceiveMonitor.CB_LISTENER, this.listeners);
        this.listeners.remove(iStrategyListener);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db8852d6", new Object[]{this, str});
        }
        if (!checkHolderIsNull()) {
            return this.holder.strategyConfig.getUnitByHost(str);
        }
        return null;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getAccessPointByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4acca4fa", new Object[]{this, str});
        }
        if (!checkHolderIsNull()) {
            return this.holder.strategyConfig.getAccessPointByHost(str);
        }
        return null;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5fb6831", new Object[]{this}) : checkHolderIsNull() ? "" : this.holder.getCurrStrategyTable().clientIp;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e0d0", new Object[]{this, str, iConnStrategy, connEvent});
        } else if (checkHolderIsNull() || iConnStrategy == null || !(iConnStrategy instanceof IPConnStrategy)) {
        } else {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (iPConnStrategy.ipSource == 1) {
                this.holder.localDnsStrategyTable.notifyConnEvent(str, iConnStrategy, connEvent);
            } else if (iPConnStrategy.ipSource != 0) {
            } else {
                this.holder.getCurrStrategyTable().notifyConnEvent(str, iConnStrategy, connEvent);
            }
        }
    }

    private boolean checkHolderIsNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13671d0", new Object[]{this})).booleanValue();
        }
        if (this.holder != null) {
            return false;
        }
        ALog.w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.isInitialized));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(anet.channel.strategy.dispatch.DispatchEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "awcn.StrategyCenter"
            com.android.alibaba.ip.runtime.IpChange r1 = anet.channel.strategy.StrategyInstance.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L17
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r7
            r0[r3] = r8
            java.lang.String r8 = "d9ad8809"
            r1.ipc$dispatch(r8, r0)
            return
        L17:
            int r1 = r8.eventType
            if (r1 != r3) goto La9
            anet.channel.strategy.StrategyInfoHolder r1 = r7.holder
            if (r1 == 0) goto La9
            r1 = 0
            java.lang.Object r2 = r8.extraObject     // Catch: java.lang.Throwable -> L39
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L42
            java.lang.String r3 = "st"
            java.lang.String r5 = r8.st     // Catch: java.lang.Throwable -> L37
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "rm"
            java.lang.String r5 = r8.rm     // Catch: java.lang.Throwable -> L37
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r3 = move-exception
            goto L3b
        L39:
            r3 = move-exception
            r2 = r1
        L3b:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "[smooth] onEvent failed"
            anet.channel.util.ALog.e(r0, r6, r1, r3, r5)
        L42:
            anet.channel.strategy.StrategyResultParser$HttpDnsResponse r2 = anet.channel.strategy.StrategyResultParser.parse(r2)
            if (r2 != 0) goto L50
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r2 = "[ap] receive amdc event， response null"
            anet.channel.util.ALog.e(r0, r2, r1, r8)
            return
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "[ap] [amdc_file] receive response, Client_IP="
            r3.append(r5)
            java.lang.String r5 = r2.clientIp
            r3.append(r5)
            java.lang.String r5 = " ,accessPoint="
            r3.append(r5)
            java.lang.String r5 = r2.accessPoint
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            anet.channel.util.ALog.e(r0, r3, r1, r5)
            java.lang.String r3 = r2.accessPoint
            r8.setAccessPoint(r3)
            anet.channel.strategy.StrategyInfoHolder r3 = r7.holder
            boolean r8 = r8.isForceCellular
            r3.update(r8, r2)
            r7.saveData()
            anet.channel.strategy.StrategyInfoHolder r8 = r7.holder
            java.lang.String r3 = r2.accessPoint
            java.lang.String r5 = r2.clientIp
            r8.startHttp3Detect(r3, r5)
            java.util.concurrent.CopyOnWriteArraySet<anet.channel.strategy.IStrategyListener> r8 = r7.listeners
            java.util.Iterator r8 = r8.iterator()
        L90:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto La9
            java.lang.Object r3 = r8.next()
            anet.channel.strategy.IStrategyListener r3 = (anet.channel.strategy.IStrategyListener) r3
            r3.onStrategyUpdated(r2)     // Catch: java.lang.Exception -> La0
            goto L90
        La0:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "[smooth] onStrategyUpdated failed"
            anet.channel.util.ALog.e(r0, r6, r1, r3, r5)
            goto L90
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyInstance.onEvent(anet.channel.strategy.dispatch.DispatchEvent):void");
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        ALog.i(TAG, "saveData", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastPersistentTime > 30000) {
            this.lastPersistentTime = currentTimeMillis;
            AmdcThreadPoolExecutor.scheduleTask(new Runnable() { // from class: anet.channel.strategy.StrategyInstance.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (StrategyInstance.access$000(StrategyInstance.this)) {
                    } else {
                        StrategyInstance.this.holder.saveData();
                    }
                }
            }, 500L);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public boolean getAbStrategyStatusByHost(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf1c1a", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !checkHolderIsNull()) {
            return this.holder.getCurrStrategyTable().getAbStrategyStatusByHost(str, str2);
        }
        return false;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public boolean isContainHttp3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f69268c", new Object[]{this})).booleanValue() : isContainHttp3.get();
    }
}
