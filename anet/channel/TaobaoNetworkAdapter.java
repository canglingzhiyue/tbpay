package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import anet.channel.Config;
import anet.channel.analysis.DefaultFullTraceAnalysis;
import anet.channel.analysis.DefaultFullTraceAnalysisV3;
import anet.channel.analysis.DefaultNetworkAnalysis;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.appmonitor.DefaultAppMonitor;
import anet.channel.assist.NetworkAssist;
import anet.channel.cache.AVFSCacheImpl;
import anet.channel.config.OrangeConfigImpl;
import anet.channel.encode.ZstdDictHelper;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.SessionType;
import anet.channel.flow.FlowStatHelper;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.log.TLogAdapter;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ABSwitchUtils;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anetwork.channel.cache.CacheConfig;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.cache.CachePrediction;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.monitor.RRPSpeedCalculator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import org.json.JSONArray;
import tb.kge;

/* loaded from: classes.dex */
public class TaobaoNetworkAdapter implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.TaobaoNetworkAdapter";
    public static HashMap<String, Object> initParams;
    public static AtomicBoolean isInited;
    private static AtomicBoolean isInitedAsync;

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            initConfigAsync(context);
        }
    }

    static {
        kge.a(1934972750);
        kge.a(1028243835);
        isInited = new AtomicBoolean();
        isInitedAsync = new AtomicBoolean(false);
        initParams = new HashMap<>();
    }

    public static void init(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{context, hashMap});
        } else if (!isInited.compareAndSet(false, true)) {
        } else {
            ALog.setLog(new TLogAdapter());
            ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter init start!!!", null, new Object[0]);
            if (hashMap == null || hashMap.isEmpty()) {
                ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter getBasicParams!!!", null, new Object[0]);
                hashMap = GlobalAppRuntimeInfo.getBasicParams();
            }
            NetworkConfigCenter.setRemoteConfig(new OrangeConfigImpl());
            AppMonitor.setInstance(new DefaultAppMonitor());
            if (hashMap != null) {
                initParams = hashMap;
                if (hashMap.containsKey("isNextLaunch")) {
                    AwcnConfig.setTbNextLaunch(true);
                }
                final String str = (String) hashMap.get("process");
                try {
                    if (AwcnConfig.isParamsOpened()) {
                        if (!StringUtils.isEmpty(str)) {
                            GlobalAppRuntimeInfo.setCurrentProcess(str);
                        }
                        String str2 = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
                        if (!StringUtils.isEmpty(str2)) {
                            GlobalAppRuntimeInfo.setAppkey(str2);
                        }
                        String str3 = (String) hashMap.get("ttid");
                        if (!StringUtils.isEmpty(str3)) {
                            GlobalAppRuntimeInfo.setTtid(str3);
                        }
                        String str4 = (String) hashMap.get("deviceId");
                        if (!StringUtils.isEmpty(str4)) {
                            GlobalAppRuntimeInfo.setUtdid(str4);
                        }
                    }
                    if (AwcnConfig.isSecondRefreshABEnable()) {
                        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.TaobaoNetworkAdapter.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (!"com.taobao.taobao".equals(str)) {
                                } else {
                                    Set<String> initHosts = HttpDispatcher.getInstance().getInitHosts();
                                    if (AwcnConfig.isOrangeOptEnable()) {
                                        if (initHosts == null) {
                                            initHosts = new TreeSet<>();
                                        }
                                        initHosts.add("orange-dc.m.taobao.com");
                                    }
                                    ALog.e(TaobaoNetworkAdapter.TAG, "[Launcher] TaobaoNetworkAdapter 1 amdc start!!!", null, "isOrangeOptEnable", Boolean.valueOf(AwcnConfig.isOrangeOptEnable()));
                                    StrategyTemplate.getInstance().sendAmdcRequest(initHosts);
                                    if (!AwcnConfig.isOrangeOptEnable()) {
                                        return;
                                    }
                                    AwcnConfig.setPresetHostWhiteList("{\"orange-dc.m.taobao.com\":[\"acs\",\"1\",\"false\",\"2\"]}");
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add("orange-dc.m.taobao.com");
                                    AwcnConfig.setLongAmdcWhiteList("[\"orange-dc.m.taobao.com\",\"amdc.m.taobao.com\"]");
                                    StrategyTemplate.getInstance().localDnsLookupByHost(arrayList);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter set Params fail! error=" + th.toString(), null, new Object[0]);
                }
                if ("com.taobao.taobao".equals(str)) {
                    AwcnConfig.setAccsSessionCreateForbiddenInBg(true);
                    NetworkConfigCenter.setBindServiceOptimize(true);
                }
            }
            ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter init end!!!", null, new Object[0]);
        }
    }

    public static void initAsync(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac695955", new Object[]{context});
        } else if (!isInitedAsync.compareAndSet(false, true)) {
        } else {
            ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter initAsync start!!!", null, new Object[0]);
            if (NetworkConfigCenter.isInitConfigAsync()) {
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.TaobaoNetworkAdapter.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TaobaoNetworkAdapter.access$000(context);
                        if (!AwcnConfig.isOkHttpEnable()) {
                            return;
                        }
                        OkHttpConnector.checkEnvAvailable();
                        OkHttpConnector.preBuildConnections();
                    }
                });
            } else {
                initConfigAsync(context);
                if (AwcnConfig.isOkHttpEnable()) {
                    OkHttpConnector.checkEnvAvailable();
                    OkHttpConnector.preBuildConnections();
                }
            }
            ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter initAsync end!!!", null, new Object[0]);
        }
    }

    private static void initConfigAsync(final Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7326437", new Object[]{context});
            return;
        }
        AnalysisFactory.setInstance(new DefaultFullTraceAnalysis());
        AnalysisFactory.setV3Instance(new DefaultFullTraceAnalysisV3());
        NetworkAnalysis.setInstance(new DefaultNetworkAnalysis());
        RRPSpeedCalculator.getInstance().startTick();
        ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.TaobaoNetworkAdapter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                        return;
                    }
                    AVFSCacheImpl aVFSCacheImpl = new AVFSCacheImpl();
                    aVFSCacheImpl.initialize();
                    CacheManager.addCache(aVFSCacheImpl, new CachePrediction() { // from class: anet.channel.TaobaoNetworkAdapter.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // anetwork.channel.cache.CachePrediction
                        public boolean handleCache(String str2, Map<String, String> map) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("fb09dede", new Object[]{this, str2, map})).booleanValue() : "weex".equals(map.get("f-refer"));
                        }
                    }, 1);
                    for (CacheConfig cacheConfig : NetworkConfigCenter.getHttpCacheConfigs()) {
                        Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, StringUtils.isEmpty(cacheConfig.getAbExperiment()) ? "network_http_cache_isolation" : "network_http_cache_" + cacheConfig.getAbExperiment());
                        if (isABGlobalFeatureOpened != null && isABGlobalFeatureOpened.booleanValue()) {
                            AVFSCacheImpl aVFSCacheImpl2 = new AVFSCacheImpl(cacheConfig);
                            aVFSCacheImpl2.initialize();
                            CacheManager.addCache(aVFSCacheImpl2, cacheConfig.getPrediction(), 1);
                        }
                    }
                } catch (Exception e) {
                    ALog.e(TaobaoNetworkAdapter.TAG, "[httpCacheInit]error.", null, e, new Object[0]);
                }
            }
        }, ThreadPoolExecutorFactory.Priority.NORMAL);
        HashMap<String, Object> hashMap = initParams;
        if (hashMap == null || hashMap.isEmpty()) {
            ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter getBasicParams!!!", null, new Object[0]);
            hashMap = GlobalAppRuntimeInfo.getBasicParams();
        }
        if (hashMap == null) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String str2 = (String) hashMap.get("process");
        if ("com.taobao.taobao".equals(str2)) {
            if (!AwcnConfig.isParamsOpened() || !AwcnConfig.isSecondRefreshABEnable()) {
                HttpDispatcher.getInstance().getInitHosts();
                ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter 2 amdc start!!!", null, new Object[0]);
            }
            if (AwcnConfig.isComplexConnectEnable()) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN);
                jSONArray.put(MtopUnitStrategy.TRADE_ONLINE_DOMAIN);
                jSONArray.put("gw.alicdn.com");
                jSONArray.put("heic.alicdn.com");
                jSONArray.put("ossgw.alicdn.com");
                jSONArray.put("dorangesource.alicdn.com");
                AwcnConfig.setComplexConnectWhiteList(jSONArray.toString());
            }
            ZstdDictHelper.loadZstdAttributesMap();
            boolean z = defaultSharedPreferences.getBoolean(AwcnConfig.DETECT_CENTER_ENABLE, true);
            AwcnConfig.setDetectCenterEnable(z);
            String str3 = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            AwcnConfig.setHttp3WhiteList("[\"umsgacs.m.taobao.com\"]");
            AwcnConfig.setHttp3VipBlackList("[\"2401:b180:2000:60::1\",\"2401:b180:2000:60::e\",\"2401:b180:2000:60::8\",\"2401:b180:2000:50::10\",\"2401:b180:2000:50::14\",\"2401:b180:2000:50::15\",\"2401:b180:2000:10::31\",\"2401:b180:2000:10::32\",\"2401:b180:2000:10::33\",\"2401:b180:2000::31\",\"2401:b180:2000::32\",\"2401:b180:2000::33\",\"203.119.244.129\",\"203.119.244.130\",\"203.119.244.131\",\"203.119.244.132\",\"203.119.244.133\",\"203.119.244.193\",\"203.119.244.194\",\"203.119.244.195\",\"203.119.244.196\",\"203.119.244.197\",\"47.246.64.88\",\"47.246.64.89\",\"47.246.64.84\",\"47.246.64.76\",\"47.246.64.68\",\"47.246.64.69\",\"47.246.64.77\",\"47.246.64.92\",\"47.246.103.30\",\"47.246.103.26\",\"47.246.103.25\",\"47.246.103.35\",\"47.246.103.22\",\"47.246.103.44\"]");
            AwcnConfig.set1RttHttp3WhiteList("[\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"gw.alicdn.com\",\"heic.alicdn.com\",\"img.alicdn.com\"]");
            AwcnConfig.setAllowRetryUseLongLinkWhiteList("[\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"gw.alicdn.com\",\"heic.alicdn.com\",\"img.alicdn.com\"]");
            AwcnConfig.setHttp3OptWhiteList("[\"pages-fast.m.taobao.com\"]");
            AwcnConfig.setPreSessionWhiteList("[\"pages-fast.m.taobao.com\",\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"gw.alicdn.com\",\"heic.alicdn.com\",\"img.alicdn.com\"]");
            Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, "http3_network_opt_default");
            AwcnConfig.setHttp3DefaultEnable(isABGlobalFeatureOpened == null || !isABGlobalFeatureOpened.booleanValue());
            boolean isAmdcReduceFrequencyEnable = AwcnConfig.isAmdcReduceFrequencyEnable();
            boolean isLightMainProcess = GlobalAppRuntimeInfo.isLightMainProcess();
            if (!isAmdcReduceFrequencyEnable || !isLightMainProcess) {
                if (AwcnConfig.isHttp3PreHostEnable()) {
                    AwcnConfig.setPresetHostHttp3WhiteList(AwcnConfig.isHttp3DefaultEnable() ? "{\"guide-acs.m.taobao.com\":[\"acs\",\"true\",\"0\"], \"trade-acs.m.taobao.com\":[\"acs\",\"true\",\"0\"],\"gw.alicdn.com\":[\"cdn\",\"true\",\"2\"],\"heic.alicdn.com\":[\"cdn\",\"true\",\"2\"],\"img.alicdn.com\":[\"cdn\",\"true\",\"2\"],\"pages-fast.m.taobao.com\":[\"cdn\",\"true\",\"2\"]}" : "{\"guide-acs.m.taobao.com\":[\"acs\",\"true\",\"0\"], \"trade-acs.m.taobao.com\":[\"acs\",\"true\",\"0\"],\"gw.alicdn.com\":[\"cdn\",\"true\",\"2\"],\"heic.alicdn.com\":[\"cdn\",\"true\",\"2\"],\"img.alicdn.com\":[\"cdn\",\"true\",\"2\"]}");
                    registerPresetHttp3Session(context, str3);
                    str = "{\"pages-fast.m.taobao.com\":[\"cdn\",\"true\"],\"taocaicai.m.taobao.com\":[\"cdn\",\"true\"],\"dorangesource.alicdn.com\":[\"cdn\",\"true\"],\"ossgw.alicdn.com\":[\"cdn\",\"true\"]}";
                } else {
                    str = "{\"guide-acs.m.taobao.com\":[\"acs\",\"true\"],\"trade-acs.m.taobao.com\":[\"acs\",\"true\"],\"gw.alicdn.com\":[\"cdn\",\"true\"], \"heic.alicdn.com\":[\"cdn\",\"true\"], \"pages-fast.m.taobao.com\":[\"cdn\",\"true\"],\"img.alicdn.com\":[\"cdn\",\"true\"],\"dorangesource.alicdn.com\":[\"cdn\",\"true\"],\"ossgw.alicdn.com\":[\"cdn\",\"true\"]}";
                }
                AwcnConfig.setPresetHostHttp2WhiteList(str);
                registerPresetSession(context, str3);
                ArrayList arrayList = new ArrayList();
                arrayList.add("mtlexternal.alibabausercontent.com");
                arrayList.add("video-zb.cloudvideocdn.taobao.com");
                arrayList.add("video-sh.cloudvideocdn.taobao.com");
                arrayList.add("guangguang.cloudvideocdn.taobao.com");
                arrayList.add("img.alicdn.com");
                arrayList.add(MtopUnitStrategy.CENTER_ONLINE_DOMAIN);
                arrayList.add("acs-mum.alibabachengdun.com");
                arrayList.add("poplayer.template.alibaba.com");
                arrayList.add("dinamicx.alibabausercontent.com");
                arrayList.add("zconfig.alibabausercontent.com");
                arrayList.add("yixiu-abtest.alicdn.com");
                arrayList.add("ilce.alicdn.com");
                arrayList.add("zres.alicdn.com");
                arrayList.add("hudong.alicdn.com");
                arrayList.add("mdike.alicdn.com");
                arrayList.add("miniapp-package-zcache.taobao.com");
                arrayList.add("login.m.taobao.com");
                arrayList.add("wwc.alicdn.com");
                arrayList.add("log.mmstat.com");
                arrayList.add("arms-retcode.aliyuncs.com");
                arrayList.add("fourier.taobao.com");
                arrayList.add("at.alicdn.com");
                arrayList.add("passport.taobao.com");
                arrayList.add("x.alicdn.com");
                arrayList.add("d.alicdn.com");
                arrayList.add("i.alicdn.com");
                arrayList.add("ynuf.aliapp.org");
                arrayList.add("s-gm.mmstat.com");
                arrayList.add("sjarvis.taobao.com");
                arrayList.add("assets.tbcdn.cn");
                arrayList.add("gw.alipayobjects.com");
                arrayList.add("tbexpand.alicdn.com");
                arrayList.add("infinite.m.taobao.com");
                arrayList.add("duang.alicdn.com");
                arrayList.add("alimama.cloudvideocdn.taobao.com");
                StrategyTemplate.getInstance().localDnsLookupByHost(arrayList);
            } else {
                ALog.e(TAG, "not need registerPresetSession and localDnsPresetDetect! ", null, "isAmdcReduceFrequencyEnable", Boolean.valueOf(isAmdcReduceFrequencyEnable), "isLightMainProcess", Boolean.valueOf(isLightMainProcess));
            }
            AwcnConfig.setMultiConnectWhiteList("[\"gw.alicdn.com\",\"heic.alicdn.com\"]");
            AwcnConfig.setMtopInterceptorWhiteList("[\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"acs.m.taobao.com\",\"h5api.m.tmall.com\",\"h5api.m.taobao.com\",\"pmbee.alicdn.com\",\"global.alicdn.com\",\"waimai-guide.ele.me\"]");
            AwcnConfig.setWifiFgForceCellWhiteList("[\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"acs.m.taobao.com\",\"h5api.m.taobao.com\",\"h5api.m.tmall.com\",\"guide-acs4miniapp-inner.m.taobao.com\",\"heic.alicdn.com\",\"gw.alicdn.com\",\"g.alicdn.com\",\"ilce.alicdn.com\",\"img.alicdn.com\",\"pages-fast.m.taobao.com\",\"meta.m.taobao.com\",\"web.m.taobao.com\",\"pages.tmall.com\",\"pages.m.taobao.com\",\"market.m.taobao.com\",\"hudong.alicdn.com\",\"ugcdn.taobao.com\",\"dinamicx.alibabausercontent.com\",\"ossgw.alicdn.com\",\"taocaicai.m.taobao.com\",\"miniapp-package-zcache.taobao.com\",\"zconfig.alibabausercontent.com\",\"infinite.m.taobao.com\",\"dorangesource.alicdn.com\",\"item.taobao.com\",\"passport.taobao.com\",\"login.m.taobao.com\",\"atoken.m.taobao.com\",\"amdc.m.taobao.com\"]");
            AwcnConfig.setMtopAmdcWhiteList("[\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"acs.m.taobao.com\"]");
            AwcnConfig.setDetectHostWhiteList("[\"guide-acs.m.taobao.com\", \"trade-acs.m.taobao.com\", \"gw.alicdn.com\", \"heic.alicdn.com\"]");
            AwcnConfig.setUrlMonitorRequestList("[\"guide-acs.m.taobao.com/gw/mtop.taobao.wireless.home.newface.awesome.get\",\"guide-acs.m.taobao.com/gw/mtop.taobao.wireless.home.newface.awesome.newget\"]");
            AwcnConfig.setCookiePrintLogHostWhiteList("[\"ai.alimebot.taobao.com\"]");
            AwcnConfig.setAcceptEncodeHostWhiteList("[\"pages-fast.m.taobao.com\",\"pages-g.m.taobao.com\"]");
            AwcnConfig.setVpnFastDegradeHostWhiteList("{\"trade-acs.m.taobao.com\":[\"/gw/mtop.taobao.detail.data.get/1.0/\",\"/gw/mtop.trade.query.bag/5.0/\"],\"guide-acs.m.taobao.com\":[\"/gw/mtop.taobao.wireless.home.newface.awesome.get/1.0/\",\"/gw/mtop.relationrecommend.mtoprecommend.recommend/1.0/\",\"/gw/mtop.taobao.rate.detaillist.get/5.0/\",\"/gw/mtop.taobao.rate.component.render/1.0/\",\"/gw/mtop.taobao.rate.append.render/2.0/\",\"/gw/mtop.taobao.afc.linkinfo.get/1.0/\",\"/gw/mtop.cogman.container.nologin/1.0/\",\"/gw/mtop.taobao.volvo.mytaobao/1.0/\",\"/gw/mtop.relationrecommend.wirelessrecommend.recommend/2.0/\"],\"heic.alicdn.com\":\"*\",\"gw.alicdn.com\":\"*\",\"img.alicdn.com\":\"*\",\"g.alicdn.com\":\"*\",\"pages.tmall.com\":\"*\",\"market.m.taobao.com\":\"*\",\"huodong.taobao.com\":\"*\",\"guangguang.cloudvideocdn.taobao.com\":\"*\"}");
            AwcnConfig.setVpnFastDegradBizIdWhiteList("[\"15\",\"53\",\"51\"]");
            AwcnConfig.setHttp3BlackList(defaultSharedPreferences.getString(AwcnConfig.HTTP3_BLACK_LIST_KEY, null));
            AwcnConfig.setIpv6DetectEnable(defaultSharedPreferences.getBoolean(AwcnConfig.IPV6_DETECT_KEY, true));
            NetworkAssist.getAssistManager().initialize(context);
            if (((Boolean) hashMap.get("isDebuggable")).booleanValue()) {
                try {
                    Utils.invokeStaticMethodThrowException("com.taobao.android.request.analysis.RequestRecorder", "init", new Class[]{Context.class}, context);
                } catch (Exception e) {
                    ALog.e(TAG, "RequestRecorder error.", null, e, new Object[0]);
                }
            }
            FlowStatHelper.commitFlowStat();
            AwcnConfig.setHttp3Enable(defaultSharedPreferences.getBoolean(AwcnConfig.HTTP3_ENABLE, true));
            Boolean isABGlobalFeatureOpened2 = ABSwitchUtils.isABGlobalFeatureOpened(context, "vpn_fast_degrade_closed");
            AwcnConfig.setVpnFastDegradeABEnable(isABGlobalFeatureOpened2 == null || !isABGlobalFeatureOpened2.booleanValue());
            GlobalAppRuntimeInfo.initThreadCountABOpen();
            Boolean isABGlobalFeatureOpened3 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_multi_path");
            if (isABGlobalFeatureOpened3 != null) {
                NetworkConfigCenter.setMultiPathABEnable(isABGlobalFeatureOpened3.booleanValue());
            }
            Boolean isABGlobalFeatureOpened4 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_body_timeout_checker");
            if (isABGlobalFeatureOpened4 != null) {
                NetworkConfigCenter.setBodyTimeoutCheckerABEnable(isABGlobalFeatureOpened4.booleanValue());
            }
            Boolean isABGlobalFeatureOpened5 = ABSwitchUtils.isABGlobalFeatureOpened(context, "android_nw_qos_queue");
            Boolean isABGlobalFeatureOpened6 = ABSwitchUtils.isABGlobalFeatureOpened(context, "android_nw_qos_pacing");
            Boolean isABGlobalFeatureOpened7 = ABSwitchUtils.isABGlobalFeatureOpened(context, "android_nw_qos_recv_wnd");
            if (isABGlobalFeatureOpened5 != null) {
                AwcnConfig.setQoSQueueABSwitch(isABGlobalFeatureOpened5.booleanValue());
            }
            if (isABGlobalFeatureOpened6 != null) {
                AwcnConfig.setQoSPacingABSwitch(isABGlobalFeatureOpened6.booleanValue());
            }
            if (isABGlobalFeatureOpened7 != null) {
                AwcnConfig.setQoSRecvWndABSwitch(isABGlobalFeatureOpened7.booleanValue());
            }
            String aBGlobalFeatureValue = ABSwitchUtils.getABGlobalFeatureValue(context, "network_cell_5g_bandwidth_quality_coeff");
            if (aBGlobalFeatureValue != null) {
                AwcnConfig.setCell5GBandwidthQualityCoeff(Double.parseDouble(aBGlobalFeatureValue));
            }
            String aBGlobalFeatureValue2 = ABSwitchUtils.getABGlobalFeatureValue(context, "network_cell_4g_bandwidth_quality_coeff");
            if (aBGlobalFeatureValue2 != null) {
                AwcnConfig.setCell4GBandwidthQualityCoeff(Double.parseDouble(aBGlobalFeatureValue2));
            }
            String aBGlobalFeatureValue3 = ABSwitchUtils.getABGlobalFeatureValue(context, "network_double_paths_slipdown_coeff");
            if (aBGlobalFeatureValue3 != null) {
                AwcnConfig.setDoublePathsSlipdownCoeff(Double.parseDouble(aBGlobalFeatureValue3));
            }
            Boolean isABGlobalFeatureOpened8 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_session_async");
            if (isABGlobalFeatureOpened8 != null) {
                NetworkConfigCenter.setGetSessionAsyncEnable(isABGlobalFeatureOpened8.booleanValue());
            }
            Boolean isABGlobalFeatureOpened9 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_mtu_optimize");
            if (isABGlobalFeatureOpened9 != null) {
                AwcnConfig.setMTUConnectOptimize(isABGlobalFeatureOpened9.booleanValue());
            }
            Boolean isABGlobalFeatureOpened10 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_session_reuse_optimize");
            if (isABGlobalFeatureOpened10 != null) {
                AwcnConfig.setSessionReuseOptimized(isABGlobalFeatureOpened10.booleanValue());
            }
            Boolean isABGlobalFeatureOpened11 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_session_fast_timeout");
            if (isABGlobalFeatureOpened11 != null) {
                NetworkConfigCenter.setSessionFastTimeoutEnable(isABGlobalFeatureOpened11.booleanValue());
            }
            if (z) {
                SessionCenter.getInstance(new Config.Builder().setAppkey(str3).setEnv(ENV.ONLINE).build());
            }
        }
        if ("com.taobao.taobao:channel".equals(str2)) {
            NetworkConfigCenter.setCookieDisable(true);
            if (NetworkConfigCenter.isChannelLocalInstanceEnable()) {
                ALog.e(TAG, "localInstanceEnable", null, new Object[0]);
                NetworkConfigCenter.setRemoteNetworkServiceEnable(false);
            }
        }
        if ((Mtop.WIDGET_PROCESS_NAME.equals(str2) || Mtop.XIAOMI_WIDGET_PROCESS_NAME.equals(str2)) && NetworkConfigCenter.isWidgetLocalInstanceEnable()) {
            ALog.e(TAG, "localInstanceEnable", null, new Object[0]);
            NetworkConfigCenter.setRemoteNetworkServiceEnable(false);
        }
        recordInitEvent(hashMap);
    }

    private static void recordInitEvent(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25734165", new Object[]{map});
        } else if (map == null) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("env", map.get(OConstant.LAUNCH_ENVINDEX));
                hashMap.put("brand", StringUtils.isEmpty(Build.BRAND) ? Build.MANUFACTURER : Build.BRAND);
                hashMap.put("model", Build.MODEL);
                hashMap.put("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("appKey", map.get(OConstant.LAUNCH_ONLINEAPPKEY));
                hashMap.put("appVersion", GlobalAppRuntimeInfo.getAppVersion());
                hashMap.put("utdid", GlobalAppRuntimeInfo.getUtdid());
                hashMap.put("userId", map.get("userId"));
                hashMap.put("isDebuggable", map.get("isDebuggable"));
                hashMap.put("process", GlobalAppRuntimeInfo.getCurrentProcess());
                hashMap.put("packageName", map.get("packageName"));
                hashMap.put("netType", NetworkStatusHelper.getFormatNetwork());
                if (Utils.isHarmonyOS()) {
                    hashMap.put("isHarmonyOS", 1);
                    hashMap.put("harmonyVersion", Utils.getHarmonyVersion());
                } else {
                    hashMap.put("isHarmonyOS", 0);
                }
                AnalysisFactory.getV3Instance().recordAppStatus("App", hashMap.toString());
            } catch (Exception unused) {
                ALog.e(TAG, "[recordInitEvent]error.", null, new Object[0]);
            }
        }
    }

    public static void registerPresetSession(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd89bd57", new Object[]{context, str});
            return;
        }
        try {
            for (Map.Entry<String, List<String>> entry : AwcnConfig.getPresetHostHttp2WhiteList().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                boolean parseBoolean = Boolean.parseBoolean(value.get(1));
                StrategyTemplate.getInstance().registerConnProtocol(context, key, ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, value.get(0)));
                getPresetSession(key, str, parseBoolean);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[registerPresetSession]error." + th.toString(), null, new Object[0]);
        }
    }

    public static void registerPresetHttp3Session(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c84c91e", new Object[]{context, str});
            return;
        }
        try {
            for (Map.Entry<String, List<String>> entry : AwcnConfig.getPresetHostHttp3WhiteList().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                boolean parseBoolean = Boolean.parseBoolean(value.get(1));
                StrategyTemplate.getInstance().registerHTTP3ConnProtocol(context, key, value.get(0), Integer.parseInt(value.get(2)));
                getPresetSession(key, str, parseBoolean);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[registerPresetHttp3Session]error." + th.toString(), null, new Object[0]);
        }
    }

    private static void getPresetSession(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52f7e38", new Object[]{str, str2, new Boolean(z)});
        } else if (!z) {
        } else {
            SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, str)), SessionType.LONG_LINK, 0L);
        }
    }
}
