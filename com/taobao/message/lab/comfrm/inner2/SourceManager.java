package com.taobao.message.lab.comfrm.inner2;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IErrorReportProvider;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.config.SourceInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes7.dex */
public class SourceManager implements CommandHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ActionDispatcher mActionDispatcher;
    private final String mClassNamespace;
    private final String mContainerKey;
    private final String mIdentifier;
    private List<CI<SourceItem, Source>> mList;
    private final Plugin mPlugin;
    private final Map<String, Object> mProps;
    private final SourceInfo mSourceInfo;
    private final boolean mUseRemote;
    private long useSourceStartTime;
    private volatile boolean timeoutFlag = false;
    private volatile boolean isDispose = false;
    private final Set<SourceItem> mUsedSet = new HashSet();
    private final Map<String, Object> originalData = new ConcurrentHashMap();
    private final Map<String, DeltaItem> deltaItemMap = new ConcurrentHashMap();
    private final Map<String, SourceRuntimeInfo> runtimeInfoMap = new ConcurrentHashMap();
    private final List<Source> mSubscribeSource = new ArrayList();

    /* loaded from: classes7.dex */
    public static class SourceRuntimeInfo {
        public List<Error> errors = new ArrayList();
        public long firstUseWaitTime = -1;
        public long firstDispatcherDurTime = -1;
        public int dispatcherCount = 0;

        static {
            kge.a(-703777832);
        }
    }

    static {
        kge.a(1206488145);
        kge.a(-729682912);
    }

    public static /* synthetic */ String access$000(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9057840b", new Object[]{sourceManager}) : sourceManager.mContainerKey;
    }

    public static /* synthetic */ Map access$1000(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5ad11819", new Object[]{sourceManager}) : sourceManager.mProps;
    }

    public static /* synthetic */ long access$102(SourceManager sourceManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("662635c0", new Object[]{sourceManager, new Long(j)})).longValue();
        }
        sourceManager.useSourceStartTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$1100(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e2931a9", new Object[]{sourceManager})).booleanValue() : sourceManager.isReadyDefaultSource();
    }

    public static /* synthetic */ boolean access$1200(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4edefe6a", new Object[]{sourceManager})).booleanValue() : sourceManager.timeoutFlag;
    }

    public static /* synthetic */ boolean access$1202(SourceManager sourceManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6dbaf70", new Object[]{sourceManager, new Boolean(z)})).booleanValue();
        }
        sourceManager.timeoutFlag = z;
        return z;
    }

    public static /* synthetic */ void access$1300(SourceManager sourceManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46667d7e", new Object[]{sourceManager, map});
        } else {
            sourceManager.dispatchUpdateAction(map);
        }
    }

    public static /* synthetic */ Map access$1400(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7700b41d", new Object[]{sourceManager}) : sourceManager.originalData;
    }

    public static /* synthetic */ void access$1500(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810064a9", new Object[]{sourceManager});
        } else {
            sourceManager.checkSourceError();
        }
    }

    public static /* synthetic */ boolean access$1602(SourceManager sourceManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beeadcec", new Object[]{sourceManager, new Boolean(z)})).booleanValue();
        }
        sourceManager.isDispose = z;
        return z;
    }

    public static /* synthetic */ void access$1700(SourceManager sourceManager, SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e4bbe0", new Object[]{sourceManager, sourceItem});
        } else {
            sourceManager.updateFirstDispatcherDurTime(sourceItem);
        }
    }

    public static /* synthetic */ String access$1800(SourceManager sourceManager, SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7143f91f", new Object[]{sourceManager, sourceItem}) : sourceManager.getKey(sourceItem);
    }

    public static /* synthetic */ Set access$1900(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("5a3f00dc", new Object[]{sourceManager}) : sourceManager.mUsedSet;
    }

    public static /* synthetic */ List access$200(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1ae832b0", new Object[]{sourceManager}) : sourceManager.mList;
    }

    public static /* synthetic */ Map access$2000(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("75421138", new Object[]{sourceManager}) : sourceManager.deltaItemMap;
    }

    public static /* synthetic */ List access$202(SourceManager sourceManager, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f84415d", new Object[]{sourceManager, list});
        }
        sourceManager.mList = list;
        return list;
    }

    public static /* synthetic */ void access$2200(SourceManager sourceManager, SourceItem sourceItem, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8deff02", new Object[]{sourceManager, sourceItem, error});
        } else {
            sourceManager.updateErrors(sourceItem, error);
        }
    }

    public static /* synthetic */ SourceInfo access$300(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SourceInfo) ipChange.ipc$dispatch("f96dfd58", new Object[]{sourceManager}) : sourceManager.mSourceInfo;
    }

    public static /* synthetic */ String access$400(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98b43987", new Object[]{sourceManager}) : sourceManager.mIdentifier;
    }

    public static /* synthetic */ boolean access$500(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55d160fe", new Object[]{sourceManager})).booleanValue() : sourceManager.mUseRemote;
    }

    public static /* synthetic */ String access$600(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ce29445", new Object[]{sourceManager}) : sourceManager.mClassNamespace;
    }

    public static /* synthetic */ void access$700(SourceManager sourceManager, SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16689131", new Object[]{sourceManager, sourceItem});
        } else {
            sourceManager.updateFirstUseWaitTime(sourceItem);
        }
    }

    public static /* synthetic */ List access$800(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b98e096a", new Object[]{sourceManager}) : sourceManager.mSubscribeSource;
    }

    public static /* synthetic */ Plugin access$900(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Plugin) ipChange.ipc$dispatch("ae8f19db", new Object[]{sourceManager}) : sourceManager.mPlugin;
    }

    public SourceManager(String str, String str2, SourceInfo sourceInfo, Map<String, Object> map, ActionDispatcher actionDispatcher, boolean z, String str3, Plugin plugin) {
        this.mIdentifier = str;
        this.mContainerKey = str2;
        this.mProps = map;
        this.mClassNamespace = str3;
        this.mUseRemote = z;
        this.mSourceInfo = sourceInfo;
        this.mActionDispatcher = actionDispatcher;
        this.mPlugin = plugin;
    }

    public void useSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696a0c09", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1003).ext("containerKey", SourceManager.access$000(SourceManager.this)).build());
                    SourceManager.access$102(SourceManager.this, System.currentTimeMillis());
                    SourceManager.access$202(SourceManager.this, new ArrayList());
                    if (SourceManager.access$300(SourceManager.this).sourceList != null) {
                        for (SourceItem sourceItem : SourceManager.access$300(SourceManager.this).sourceList) {
                            SourceManager.access$200(SourceManager.this).add(new CI(sourceItem, ClassPool.instance().getInstance(sourceItem.type, Source.class, SourceManager.access$400(SourceManager.this), SourceManager.access$500(SourceManager.this), SourceManager.access$600(SourceManager.this))));
                        }
                    }
                    for (CI ci : SourceManager.access$200(SourceManager.this)) {
                        MergeActionDispatcher mergeActionDispatcher = new MergeActionDispatcher(ci);
                        if (ci == null) {
                            throw new NullPointerException("useSource|" + ((SourceItem) ci.getConfig()).name);
                        }
                        SourceManager.access$700(SourceManager.this, (SourceItem) ci.getConfig());
                        ((Source) ci.getInstance()).subscribe(mergeActionDispatcher);
                        SourceManager.access$800(SourceManager.this).add(ci.getInstance());
                        Command build = new Command.Build(((SourceItem) ci.getConfig()).name, StdActions.COMMAND_INIT_SOURCE).build();
                        Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1004).ext("containerKey", SourceManager.access$000(SourceManager.this), "commandName", build.getName(), "sourceName", build.getSourceName(), "first", "1").build());
                        if (SourceManager.access$900(SourceManager.this) != null) {
                            SourceManager.access$900(SourceManager.this).onSourceStart((SourceItem) ci.getConfig(), build);
                        }
                        ((Source) ci.getInstance()).use(build, new PropsProxy(SourceManager.access$1000(SourceManager.this), (SourceItem) ci.getConfig()), mergeActionDispatcher);
                    }
                    Schedules.getLogic().schedule(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            synchronized (SourceManager.class) {
                                if (!SourceManager.access$1100(SourceManager.this)) {
                                    SourceManager.access$1202(SourceManager.this, true);
                                    SourceManager.access$1300(SourceManager.this, null);
                                    AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "timeout", JSON.toJSONString(SourceManager.access$1400(SourceManager.this).keySet()), 1.0d);
                                    SourceManager.access$1500(SourceManager.this);
                                }
                            }
                        }
                    }, SourceManager.access$300(SourceManager.this).initTimeout, TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    private boolean isReadyDefaultSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f049aae", new Object[]{this})).booleanValue();
        }
        if (this.mUsedSet.size() >= this.mList.size()) {
            return true;
        }
        for (CI<SourceItem, Source> ci : this.mList) {
            if (ci.getConfig().defaultLoad && !this.mUsedSet.contains(ci.getConfig())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.CommandHandler
    public void handle(final Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6b56d4", new Object[]{this, command});
        } else {
            Schedules.logicTryKeep(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    char c = 1;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    char c2 = 5;
                    if (SourceManager.access$200(SourceManager.this) == null) {
                        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).ext("errMsg", "丢弃command", "commandName", command.getName(), "sourceName", command.getSourceName(), "sourceInstance", command.getSourceInstance()).build());
                        return;
                    }
                    for (CI ci : SourceManager.access$200(SourceManager.this)) {
                        if (((SourceItem) ci.getConfig()).name.equals(command.getSourceName()) && TextUtils.equals(((SourceItem) ci.getConfig()).instance, command.getSourceInstance())) {
                            Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(i).module(16).point(1004);
                            String[] strArr = new String[8];
                            strArr[i] = "commandName";
                            strArr[c] = command.getName();
                            strArr[2] = "sourceName";
                            strArr[3] = command.getSourceName();
                            strArr[4] = "sourceInstance";
                            strArr[c2] = command.getSourceInstance();
                            strArr[6] = "first";
                            strArr[7] = "0";
                            Logger.ftl(point.ext(strArr).build());
                            ((Source) ci.getInstance()).use(command, SourceManager.access$1000(SourceManager.this), new MergeActionDispatcher(ci));
                        }
                        i = 0;
                        c = 1;
                        c2 = 5;
                    }
                }
            });
        }
    }

    private void dispatchUpdateAction(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e91e185", new Object[]{this, map});
        } else if (this.isDispose) {
        } else {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("__originalDelta", new HashMap(this.deltaItemMap));
            this.deltaItemMap.clear();
            hashMap.remove("delta");
            hashMap.remove(StdActions.SOURCE_CONTEXT_KEY_DELTA_TYPE);
            hashMap.remove("reasons");
            this.mActionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(new HashMap(this.originalData)).context(hashMap).build());
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (Source source : SourceManager.access$800(SourceManager.this)) {
                        source.dispose();
                    }
                    SourceManager.access$1602(SourceManager.this, true);
                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1901).ext("containerKey", SourceManager.access$000(SourceManager.this)).build());
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public class MergeActionDispatcher implements ActionDispatcher, ErrorDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final CI<SourceItem, Source> source;

        static {
            kge.a(1692514722);
            kge.a(341861051);
            kge.a(-126477234);
        }

        public static /* synthetic */ CI access$2100(MergeActionDispatcher mergeActionDispatcher) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CI) ipChange.ipc$dispatch("d4a75fd", new Object[]{mergeActionDispatcher}) : mergeActionDispatcher.source;
        }

        public MergeActionDispatcher(CI<SourceItem, Source> ci) {
            this.source = ci;
        }

        @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(final Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                return;
            }
            SourceManager.access$1700(SourceManager.this, this.source.getConfig());
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (SourceManager.class) {
                if (SourceManager.access$900(SourceManager.this) != null) {
                    SourceManager.access$900(SourceManager.this).onSourceEnd(this.source == null ? null : this.source.getConfig(), action);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1005);
                String[] strArr = new String[8];
                strArr[0] = "containerKey";
                strArr[1] = SourceManager.access$000(SourceManager.this);
                strArr[2] = "action";
                strArr[3] = action.getName();
                strArr[4] = "sourceName";
                strArr[5] = (this.source == null || this.source.getConfig() == null) ? "" : this.source.getConfig().name;
                strArr[6] = HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME;
                strArr[7] = String.valueOf(currentTimeMillis2);
                Logger.ftl(point.ext(strArr).build());
                final String access$1800 = SourceManager.access$1800(SourceManager.this, this.source.getConfig());
                if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
                    SourceManager.access$1900(SourceManager.this).add(this.source.getConfig());
                    SourceManager.access$1400(SourceManager.this).put(access$1800, action.getData());
                    Diff.mergeDeltaItem(SourceManager.access$2000(SourceManager.this), SourceManager.access$1800(SourceManager.this, this.source.getConfig()), new DeltaItem(ValueUtil.getInteger(action.getContext().get(StdActions.SOURCE_CONTEXT_KEY_DELTA_TYPE), 0), action.getContext().get("delta"), action.getContext().get("reasons")), SourceManager.access$400(SourceManager.this), SourceManager.access$500(SourceManager.this));
                    if (SourceManager.access$1100(SourceManager.this) || SourceManager.access$1200(SourceManager.this)) {
                        HashMap hashMap = new HashMap(action.getContext());
                        hashMap.put("source", this.source.getConfig().name);
                        SourceManager.access$1300(SourceManager.this, hashMap);
                    }
                } else if (StdActions.UPDATE_ORIGINAL_DATA_PARTIAL.equals(action.getName()) && SourceManager.access$1900(SourceManager.this).contains(this.source.getConfig())) {
                    Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.MergeActionDispatcher.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Object obj = SourceManager.access$1400(SourceManager.this).get(access$1800);
                            Object updateOriginalData = ((Source) MergeActionDispatcher.access$2100(MergeActionDispatcher.this).getInstance()).updateOriginalData(action, obj);
                            if (obj == updateOriginalData) {
                                return;
                            }
                            HashMap hashMap2 = new HashMap(action.getContext());
                            hashMap2.put("source", ((SourceItem) MergeActionDispatcher.access$2100(MergeActionDispatcher.this).getConfig()).name);
                            SourceManager.access$1400(SourceManager.this).put(access$1800, updateOriginalData);
                            Diff.mergeDeltaItem(SourceManager.access$2000(SourceManager.this), ((SourceItem) MergeActionDispatcher.access$2100(MergeActionDispatcher.this).getConfig()).name, new DeltaItem(ValueUtil.getInteger(action.getContext().get(StdActions.SOURCE_CONTEXT_KEY_DELTA_TYPE), 0), action.getContext().get("delta"), action.getContext().get("reasons")), SourceManager.access$400(SourceManager.this), SourceManager.access$500(SourceManager.this));
                            SourceManager.access$1300(SourceManager.this, hashMap2);
                        }
                    });
                }
            }
        }

        @Override // com.taobao.message.lab.comfrm.inner2.ErrorDispatcher
        public void error(Object obj, Error error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8325e4b3", new Object[]{this, obj, error});
                return;
            }
            SourceManager.access$2200(SourceManager.this, this.source.getConfig(), error);
            dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(obj).build());
        }
    }

    private String getKey(SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4fd595b", new Object[]{this, sourceItem}) : SharedState.getKey(sourceItem.instance, sourceItem.name);
    }

    private void checkSourceError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28beda8c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(">>timeout source is :");
        for (CI<SourceItem, Source> ci : this.mList) {
            if (ci.getConfig().defaultLoad && !this.originalData.containsKey(getKey(ci.getConfig()))) {
                arrayList.add(ci.getConfig().name);
                sb.append(ci.getConfig().name);
                sb.append("--");
            }
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg(sb.toString()).build());
        IErrorReportProvider iErrorReportProvider = (IErrorReportProvider) GlobalContainer.getInstance().get(IErrorReportProvider.class);
        if (iErrorReportProvider != null) {
            iErrorReportProvider.report("dojo", "sourceCheck", Constant.CODE_ERROR_NO_SIM_FAIL, sb.toString(), null);
        }
        Plugin plugin = this.mPlugin;
        if (plugin == null) {
            return;
        }
        plugin.onSourceTimeout(arrayList);
    }

    public SourceRuntimeInfo getSourceRuntimeInfo(SourceItem sourceItem) {
        SourceRuntimeInfo sourceRuntimeInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SourceRuntimeInfo) ipChange.ipc$dispatch("71501e3c", new Object[]{this, sourceItem});
        }
        synchronized (this.runtimeInfoMap) {
            sourceRuntimeInfo = this.runtimeInfoMap.get(sourceItem.name);
            if (sourceRuntimeInfo == null) {
                sourceRuntimeInfo = new SourceRuntimeInfo();
                this.runtimeInfoMap.put(sourceItem.name, sourceRuntimeInfo);
            }
        }
        return sourceRuntimeInfo;
    }

    private void updateErrors(SourceItem sourceItem, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac64658", new Object[]{this, sourceItem, error});
        } else if (ApplicationUtil.isDebug()) {
            synchronized (this.runtimeInfoMap) {
                getSourceRuntimeInfo(sourceItem).errors.add(error);
                if (this.mPlugin != null) {
                    this.mPlugin.onSourceRuntimeChanged(this.runtimeInfoMap);
                }
            }
        } else {
            Plugin plugin = this.mPlugin;
            if (plugin == null) {
                return;
            }
            plugin.onSourceRuntimeChanged(this.runtimeInfoMap);
        }
    }

    private void updateFirstUseWaitTime(SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaa69de", new Object[]{this, sourceItem});
        } else if (ApplicationUtil.isDebug()) {
            synchronized (this.runtimeInfoMap) {
                getSourceRuntimeInfo(sourceItem).firstUseWaitTime = System.currentTimeMillis() - this.useSourceStartTime;
                if (this.mPlugin != null) {
                    this.mPlugin.onSourceRuntimeChanged(this.runtimeInfoMap);
                }
            }
        } else {
            Plugin plugin = this.mPlugin;
            if (plugin == null) {
                return;
            }
            plugin.onSourceRuntimeChanged(this.runtimeInfoMap);
        }
    }

    private void updateFirstDispatcherDurTime(SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a2515c", new Object[]{this, sourceItem});
        } else if (ApplicationUtil.isDebug()) {
            synchronized (this.runtimeInfoMap) {
                long currentTimeMillis = System.currentTimeMillis();
                SourceRuntimeInfo sourceRuntimeInfo = getSourceRuntimeInfo(sourceItem);
                sourceRuntimeInfo.dispatcherCount++;
                if (sourceRuntimeInfo.firstDispatcherDurTime < 0) {
                    sourceRuntimeInfo.firstDispatcherDurTime = currentTimeMillis - this.useSourceStartTime;
                }
                if (this.mPlugin != null) {
                    this.mPlugin.onSourceRuntimeChanged(this.runtimeInfoMap);
                }
            }
        } else {
            Plugin plugin = this.mPlugin;
            if (plugin == null) {
                return;
            }
            plugin.onSourceRuntimeChanged(this.runtimeInfoMap);
        }
    }

    /* loaded from: classes7.dex */
    public static class PropsProxy extends HashMap<String, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> dist;
        private SourceItem sourceItem;

        static {
            kge.a(-1209483983);
        }

        public PropsProxy(Map<String, Object> map, SourceItem sourceItem) {
            this.dist = Collections.unmodifiableMap(map);
            this.sourceItem = sourceItem;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public int size() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.dist.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : this.dist.isEmpty();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
            }
            if (!TextUtils.isEmpty(this.sourceItem.instance)) {
                return this.dist.get(SharedState.getKey(this.sourceItem.instance, (String) obj));
            }
            return this.dist.get(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
            }
            if (!TextUtils.isEmpty(this.sourceItem.instance)) {
                return this.dist.containsKey(SharedState.getKey(this.sourceItem.instance, (String) obj));
            }
            return this.dist.containsKey(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.containsValue(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<String> keySet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.keySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Collection<Object> values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.values();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, Object>> entrySet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.entrySet();
        }
    }
}
