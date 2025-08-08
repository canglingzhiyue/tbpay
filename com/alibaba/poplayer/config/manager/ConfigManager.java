package com.alibaba.poplayer.config.manager;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.fetch.ConfigFetcher;
import com.alibaba.poplayer.config.fetch.ConfigFetcherNew;
import com.alibaba.poplayer.config.fetch.IConfigFetcher;
import com.alibaba.poplayer.config.manager.ConfigFilterRule;
import com.alibaba.poplayer.config.model.predeal.PreDealIndexContent;
import com.alibaba.poplayer.config.model.trigger.TriggerModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.e;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bzl;
import tb.cag;
import tb.kge;

@Monitor.TargetClass
/* loaded from: classes2.dex */
public class ConfigManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField
    private IConfigFetcher mConfigFetcher;
    @Monitor.TargetField
    private final a mConfigInfo;
    @Monitor.TargetField
    private final b mConfigInfoNew;

    static {
        kge.a(-864125558);
        kge.a(1028243835);
    }

    public ConfigManager(IConfigAdapter iConfigAdapter, INewConfigAdapter iNewConfigAdapter) {
        com.alibaba.poplayer.utils.c.a("ConfigManager.use.BaseConfigItem");
        this.mConfigInfo = new a();
        this.mConfigInfoNew = new b();
        createConfigFetcher(iConfigAdapter, iNewConfigAdapter);
    }

    private void createConfigFetcher(IConfigAdapter iConfigAdapter, INewConfigAdapter iNewConfigAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b440d1da", new Object[]{this, iConfigAdapter, iNewConfigAdapter});
        } else if (useNewConfigFetcher()) {
            this.mConfigFetcher = new ConfigFetcherNew(iNewConfigAdapter, new ConfigFetcherNew.b() { // from class: com.alibaba.poplayer.config.manager.-$$Lambda$ConfigManager$lP2VKdzmOUbBj6bUndv5qbl9ArA
                @Override // com.alibaba.poplayer.config.fetch.ConfigFetcherNew.b
                public final void onFetchFinish(ConfigFetcherNew.a aVar) {
                    ConfigManager.this.lambda$createConfigFetcher$23$ConfigManager(aVar);
                }
            });
        } else {
            this.mConfigFetcher = new ConfigFetcher(iConfigAdapter, new ConfigFetcher.b() { // from class: com.alibaba.poplayer.config.manager.-$$Lambda$ConfigManager$ER4SmJx8FtT-UWz7LZBIn1sfZtI
                @Override // com.alibaba.poplayer.config.fetch.ConfigFetcher.b
                public final void onConfigUpdated(ConfigFetcher.a aVar) {
                    ConfigManager.this.lambda$createConfigFetcher$24$ConfigManager(aVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$createConfigFetcher$23$ConfigManager(ConfigFetcherNew.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52de8103", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            try {
                com.alibaba.poplayer.utils.c.a("ConfigFetcherNew.onFetchFinish", new Object[0]);
                com.alibaba.poplayer.utils.a.a().f();
                boolean a2 = this.mConfigInfoNew.a(aVar.f3174a, aVar.b, aVar.c, aVar.d);
                com.alibaba.poplayer.utils.c.c("configUpdate", "", "ConfigManager.ConfigFetcherNew.onFetchFinish.configVersion=" + aVar.b + ".updated=" + a2 + ".configIds=" + aVar.d);
                if (a2) {
                    PopMiscInfoFileHelper.a().a(aVar.d);
                    com.alibaba.poplayer.info.frequency.b.e().a(aVar.d, false);
                }
                com.alibaba.poplayer.utils.a.a().g();
                if (!a2 || bzl.a().b().removeConfigUpdateNotify()) {
                    return;
                }
                e.a(aVar.b, new ArrayList(aVar.d));
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("ConfigManager.ConfigFetcherNew.startFetch.error", th);
            }
        }
    }

    public /* synthetic */ void lambda$createConfigFetcher$24$ConfigManager(ConfigFetcher.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59e4932", new Object[]{this, aVar});
            return;
        }
        try {
            this.mConfigInfo.a(true);
            this.mConfigInfo.a(aVar.c);
            this.mConfigInfo.a(aVar.b);
            this.mConfigInfo.b(aVar.f3171a);
            com.alibaba.poplayer.utils.c.c("configUpdate", "", "BaseConfigManager.ConfigFetcher.onCachedConfigChanged.configVersion=" + aVar.c + ".configIndexIds=" + aVar.b);
            cag.i().d();
            com.alibaba.poplayer.utils.a.a().g();
            if (bzl.a().b().removeConfigUpdateNotify()) {
                return;
            }
            e.a(aVar.c, aVar.b);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("ConfigManager.ConfigFetcher.startFetch.error", th);
        }
    }

    public void startFetchConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f30293", new Object[]{this, new Boolean(z)});
        } else {
            this.mConfigFetcher.startFetch(z);
        }
    }

    public void startLoadConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232fb1ba", new Object[]{this, str});
        } else {
            this.mConfigFetcher.startLoadConfigs(true, str);
        }
    }

    public boolean isUpdatingConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27af6d7d", new Object[]{this})).booleanValue() : this.mConfigFetcher.isUpdatingConfig();
    }

    public boolean useNewConfigFetcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ad6e7b7", new Object[]{this})).booleanValue() : bzl.a().b().isConfigFetchOptEnable();
    }

    public List<String> getObserverCurrentConfigSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("79839b4d", new Object[]{this}) : this.mConfigInfo.d();
    }

    public void setDirectlyBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eeb395d", new Object[]{this, list});
        } else {
            this.mConfigInfo.e(list);
        }
    }

    public Map<String, String> filterFatigue(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b910101c", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty() && bzl.a().b() != null && bzl.a().b().isFatigueFilterEnable()) {
            for (String str : list) {
                if (!StringUtils.isEmpty(str)) {
                    BaseConfigItem syncAndGetConfigById = syncAndGetConfigById(str);
                    if (syncAndGetConfigById == null) {
                        hashMap.put(str, "");
                    } else {
                        hashMap.put(str, ConfigFilterRule.a(syncAndGetConfigById));
                    }
                }
            }
        }
        return hashMap;
    }

    public com.alibaba.poplayer.trigger.b findValidConfigs(Event event, List<BaseConfigItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.poplayer.trigger.b) ipChange.ipc$dispatch("5f8e8074", new Object[]{this, event, list, new Boolean(z)});
        }
        try {
            ArrayList<BaseConfigItem> arrayList = new ArrayList<>();
            List<BaseConfigItem> syncAndGetConfigsByUri = syncAndGetConfigsByUri(event.uri);
            if (syncAndGetConfigsByUri != null) {
                for (BaseConfigItem baseConfigItem : filterExclusiveConfigs(syncAndGetConfigsByUri, list)) {
                    if (baseConfigItem != null && checkTriggerFilter(event, baseConfigItem)) {
                        arrayList.add(baseConfigItem);
                    }
                }
            }
            return filterValidConfigsFromArray(event, arrayList, z);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PageConfigMgr.findValidConfigs.error.", th);
            return null;
        }
    }

    private com.alibaba.poplayer.trigger.b findValidConfigsFromPreDeal(Event event, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.poplayer.trigger.b) ipChange.ipc$dispatch("66c8adec", new Object[]{this, event, new Boolean(z)});
        }
        try {
            ArrayList<BaseConfigItem> arrayList = new ArrayList<>();
            Map<String, PreDealIndexContent> indexMap = event.getPreDealCustomEventParams().getIndexMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (indexMap != null) {
                for (String str : indexMap.keySet()) {
                    if (StringUtils.isEmpty(str)) {
                        com.alibaba.poplayer.utils.c.c("configCheck", "", "findValidConfigsFromPreDeal.noIndexId.");
                    } else {
                        BaseConfigItem syncAndGetConfigById = syncAndGetConfigById(str);
                        if (syncAndGetConfigById != null) {
                            arrayList3.add(str);
                            if (checkTriggerFilter(event, syncAndGetConfigById)) {
                                arrayList.add(syncAndGetConfigById);
                            }
                        } else {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            com.alibaba.poplayer.trigger.b filterValidConfigsFromArray = filterValidConfigsFromArray(event, arrayList, z);
            filterValidConfigsFromArray.f.addAll(arrayList2);
            filterValidConfigsFromArray.g.addAll(arrayList3);
            return filterValidConfigsFromArray;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PageConfigMgr.findValidConfigsFromPreDeal.error.", th);
            return null;
        }
    }

    public com.alibaba.poplayer.trigger.b findConfigs(Event event, List<BaseConfigItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.poplayer.trigger.b) ipChange.ipc$dispatch("8dd411be", new Object[]{this, event, list, new Boolean(z)});
        }
        com.alibaba.poplayer.trigger.b bVar = new com.alibaba.poplayer.trigger.b();
        if (onInterceptEvent(event)) {
            BaseConfigItem baseConfigItem = null;
            if (event.source == 3) {
                baseConfigItem = c.a(event, this.mConfigInfo.c());
            } else if (event.source == 5) {
                baseConfigItem = c.a(event.originConfigItem);
            }
            if (baseConfigItem == null) {
                return bVar;
            }
            com.alibaba.poplayer.trigger.d dVar = new com.alibaba.poplayer.trigger.d(event, baseConfigItem, PopLayer.getReference().internalGetCurrentActivity(), cag.i());
            ConfigFilterRule.ConfigStatus a2 = ConfigFilterRule.a(dVar, z);
            if (ConfigFilterRule.ConfigStatus.VALIED == a2) {
                if (baseConfigItem.isKeepLive()) {
                    bVar.b.add(dVar);
                    return bVar;
                } else if (baseConfigItem.isPageLive()) {
                    bVar.c.add(dVar);
                    return bVar;
                } else {
                    bVar.f3207a.add(dVar);
                    return bVar;
                }
            } else if (ConfigFilterRule.ConfigStatus.INVALIED != a2 || dVar.t() == null || dVar.t().T == null) {
                return bVar;
            } else {
                bVar.d.add(dVar);
                return bVar;
            }
        } else if (event.source == 4) {
            return findValidConfigsFromPreDeal(event, z);
        } else {
            return findValidConfigs(event, list, z);
        }
    }

    private com.alibaba.poplayer.trigger.b filterValidConfigsFromArray(Event event, ArrayList<BaseConfigItem> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.poplayer.trigger.b) ipChange.ipc$dispatch("41bb31fb", new Object[]{this, event, arrayList, new Boolean(z)});
        }
        com.alibaba.poplayer.trigger.b bVar = new com.alibaba.poplayer.trigger.b();
        com.alibaba.poplayer.utils.c.a("ConfigManager.blackList check.", new Object[0]);
        Iterator<BaseConfigItem> it = arrayList.iterator();
        while (it.hasNext()) {
            BaseConfigItem next = it.next();
            com.alibaba.poplayer.trigger.d dVar = new com.alibaba.poplayer.trigger.d(event, next, PopLayer.getReference().internalGetCurrentActivity(), cag.i());
            ConfigFilterRule.ConfigStatus a2 = ConfigFilterRule.a(dVar, z);
            if (ConfigFilterRule.ConfigStatus.VALIED == a2) {
                if (next.isKeepLive()) {
                    bVar.b.add(dVar);
                } else if (next.isPageLive()) {
                    bVar.c.add(dVar);
                } else {
                    bVar.f3207a.add(dVar);
                }
            } else if (ConfigFilterRule.ConfigStatus.VALIED_BUT_UNSTARTED == a2) {
                bVar.e.add(next);
            } else if (ConfigFilterRule.ConfigStatus.INVALIED == a2 && dVar.t() != null && dVar.t().T != null) {
                bVar.d.add(dVar);
            }
        }
        return bVar;
    }

    private boolean onInterceptEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7169c3c", new Object[]{this, event})).booleanValue() : event.source == 3 || event.source == 5;
    }

    private List<BaseConfigItem> filterExclusiveConfigs(List<BaseConfigItem> list, List<BaseConfigItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af921453", new Object[]{this, list, list2});
        }
        if (list == null || list2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        for (BaseConfigItem baseConfigItem : list) {
            Iterator<BaseConfigItem> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    BaseConfigItem next = it.next();
                    if (!StringUtils.isEmpty(next.indexID)) {
                        if (next.indexID.equals(baseConfigItem.indexID)) {
                            arrayList.remove(baseConfigItem);
                            break;
                        }
                    } else if (next.uuid.equals(baseConfigItem.uuid)) {
                        arrayList.remove(baseConfigItem);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean checkTriggerFilter(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32bfe4d1", new Object[]{this, event, baseConfigItem})).booleanValue();
        }
        if (event.source == 4) {
            return d.a(event.curPageUrl, baseConfigItem.paramContains);
        }
        TriggerModel triggerModel = baseConfigItem.triggerConfigs;
        if (triggerModel != null && triggerModel.isValid()) {
            UriModel uriModel = null;
            Iterator<UriModel> it = triggerModel.pages.iterator();
            while (true) {
                if (it.hasNext()) {
                    UriModel next = it.next();
                    if (next != null && next.isValid() && next.uris.contains(event.uri) && d.a(event.param, next.filter)) {
                        uriModel = next;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (uriModel != null) {
                return true;
            }
        }
        return false;
    }

    private List<BaseConfigItem> syncAndGetConfigsByUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a201ae18", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (bzl.a().b().isConfigFetchOptEnable()) {
            String a2 = this.mConfigInfoNew.a();
            List<BaseConfigItem> c = this.mConfigInfoNew.c(str);
            if (c == null) {
                c = new ArrayList<>();
                Set<String> a3 = this.mConfigInfoNew.a(str);
                if (a3 != null) {
                    com.alibaba.poplayer.utils.c.c("configCheck", "", "syncAndGetConfigsByUri.newConfig.uri=" + str + ".configs=" + a3);
                    for (String str2 : a3) {
                        BaseConfigItem configItemById = this.mConfigFetcher.getConfigItemById(str2, a2);
                        if (configItemById == null) {
                            com.alibaba.poplayer.utils.c.c("configCheck", str2, "syncAndGetConfigsByUri.newConfig.getConfigItemById=null");
                        } else {
                            this.mConfigInfoNew.a(str2, configItemById);
                            c.add(configItemById);
                        }
                    }
                }
                this.mConfigInfoNew.a(str, c);
            }
            return c;
        }
        return this.mConfigInfo.a().get(str);
    }

    private BaseConfigItem syncAndGetConfigById(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("d06e6be5", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (bzl.a().b().isConfigFetchOptEnable()) {
            BaseConfigItem b = this.mConfigInfoNew.b(str);
            if (b != null) {
                return b;
            }
            BaseConfigItem configItemById = this.mConfigFetcher.getConfigItemById(str, this.mConfigInfoNew.a());
            StringBuilder sb = new StringBuilder();
            sb.append("syncAndGetConfigById.newConfig.configFind=");
            if (configItemById == null) {
                z = false;
            }
            sb.append(z);
            com.alibaba.poplayer.utils.c.c("configCheck", str, sb.toString());
            if (configItemById == null) {
                return null;
            }
            this.mConfigInfoNew.a(str, configItemById);
            return configItemById;
        }
        return this.mConfigInfo.b().get(str);
    }
}
