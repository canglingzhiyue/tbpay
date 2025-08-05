package com.taobao.themis.kernel.metaInfo.manifest;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes9.dex */
public final class AppManifest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AppInfo appInfo;
    private Cache cache;
    private Container container;
    private boolean preset;
    private Object variables;

    static {
        kge.a(-2124495504);
        kge.a(1028243835);
    }

    public final AppInfo getAppInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfo) ipChange.ipc$dispatch("8ade078a", new Object[]{this}) : this.appInfo;
    }

    public final void setAppInfo(AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aaa768", new Object[]{this, appInfo});
        } else {
            this.appInfo = appInfo;
        }
    }

    public final Container getContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Container) ipChange.ipc$dispatch("e842be6", new Object[]{this}) : this.container;
    }

    public final void setContainer(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e45968", new Object[]{this, container});
        } else {
            this.container = container;
        }
    }

    public final Cache getCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Cache) ipChange.ipc$dispatch("2c3861d0", new Object[]{this}) : this.cache;
    }

    public final void setCache(Cache cache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f47d334", new Object[]{this, cache});
        } else {
            this.cache = cache;
        }
    }

    public final Object getVariables() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d97d56a", new Object[]{this}) : this.variables;
    }

    public final void setVariables(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb82a18", new Object[]{this, obj});
        } else {
            this.variables = obj;
        }
    }

    public final boolean getPreset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46f097e0", new Object[]{this})).booleanValue() : this.preset;
    }

    public final void setPreset(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8889ec", new Object[]{this, new Boolean(z)});
        } else {
            this.preset = z;
        }
    }

    /* loaded from: classes9.dex */
    public static final class AppInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String appId;
        private JSONObject bizInfo;
        private String bizType;
        private String logo;
        private String name;
        private String version;

        static {
            kge.a(-1706715365);
            kge.a(1028243835);
        }

        public final String getAppId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94038553", new Object[]{this}) : this.appId;
        }

        public final void setAppId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
            } else {
                this.appId = str;
            }
        }

        public final String getVersion() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
        }

        public final void setVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                this.version = str;
            }
        }

        public final String getName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
        }

        public final void setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            } else {
                this.name = str;
            }
        }

        public final String getLogo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfcecf78", new Object[]{this}) : this.logo;
        }

        public final void setLogo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
            } else {
                this.logo = str;
            }
        }

        public final String getBizType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.bizType;
        }

        public final void setBizType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
            } else {
                this.bizType = str;
            }
        }

        public final JSONObject getBizInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9c07aa52", new Object[]{this}) : this.bizInfo;
        }

        public final void setBizInfo(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5beed0a", new Object[]{this, jSONObject});
            } else {
                this.bizInfo = jSONObject;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class Container implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<Page> pages;
        private Performance performance;
        private Solution solution;
        private TabBar tabBar;
        private JSONObject window;

        static {
            kge.a(-1094578643);
            kge.a(1028243835);
        }

        public final Solution getSolution() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Solution) ipChange.ipc$dispatch("c837c37a", new Object[]{this}) : this.solution;
        }

        public final void setSolution(Solution solution) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d91c2392", new Object[]{this, solution});
            } else {
                this.solution = solution;
            }
        }

        public final List<Page> getPages() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("51843212", new Object[]{this}) : this.pages;
        }

        public final void setPages(List<Page> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3887efa", new Object[]{this, list});
            } else {
                this.pages = list;
            }
        }

        public final Performance getPerformance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Performance) ipChange.ipc$dispatch("23078708", new Object[]{this}) : this.performance;
        }

        public final void setPerformance(Performance performance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d28a4c48", new Object[]{this, performance});
            } else {
                this.performance = performance;
            }
        }

        public final JSONObject getWindow() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("77cc578d", new Object[]{this}) : this.window;
        }

        public final void setWindow(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9270bf97", new Object[]{this, jSONObject});
            } else {
                this.window = jSONObject;
            }
        }

        public final TabBar getTabBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TabBar) ipChange.ipc$dispatch("9b9cb12e", new Object[]{this}) : this.tabBar;
        }

        public final void setTabBar(TabBar tabBar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("445e095c", new Object[]{this, tabBar});
            } else {
                this.tabBar = tabBar;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class Page implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean autofocus;
        private List<String> children;
        private boolean external;
        private JSONObject groupConfig;
        private String id;
        private String pageType;
        private QueryPass queryPass;
        private String renderer;
        private String url;
        private String version;
        private JSONObject window;

        static {
            kge.a(-1789639325);
            kge.a(1028243835);
        }

        public final String getId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
        }

        public final void setId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
            } else {
                this.id = str;
            }
        }

        public final String getUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
        }

        public final void setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.url = str;
            }
        }

        public final String getVersion() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
        }

        public final void setVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                this.version = str;
            }
        }

        public final String getRenderer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3570fe60", new Object[]{this}) : this.renderer;
        }

        public final void setRenderer(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c2816", new Object[]{this, str});
            } else {
                this.renderer = str;
            }
        }

        public final boolean getExternal() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e449d4c", new Object[]{this})).booleanValue() : this.external;
        }

        public final void setExternal(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d262500", new Object[]{this, new Boolean(z)});
            } else {
                this.external = z;
            }
        }

        public final JSONObject getWindow() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("77cc578d", new Object[]{this}) : this.window;
        }

        public final void setWindow(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9270bf97", new Object[]{this, jSONObject});
            } else {
                this.window = jSONObject;
            }
        }

        public final boolean getAutofocus() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65af80de", new Object[]{this})).booleanValue() : this.autofocus;
        }

        public final void setAutofocus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1837b546", new Object[]{this, new Boolean(z)});
            } else {
                this.autofocus = z;
            }
        }

        public final String getPageType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85bdc7a", new Object[]{this}) : this.pageType;
        }

        public final void setPageType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfd0d3c", new Object[]{this, str});
            } else {
                this.pageType = str;
            }
        }

        public final List<String> getChildren() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this}) : this.children;
        }

        public final void setChildren(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f4ad579", new Object[]{this, list});
            } else {
                this.children = list;
            }
        }

        public final JSONObject getGroupConfig() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("167bcb92", new Object[]{this}) : this.groupConfig;
        }

        public final void setGroupConfig(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("429a8dca", new Object[]{this, jSONObject});
            } else {
                this.groupConfig = jSONObject;
            }
        }

        public final QueryPass getQueryPass() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (QueryPass) ipChange.ipc$dispatch("41878722", new Object[]{this}) : this.queryPass;
        }

        public final void setQueryPass(QueryPass queryPass) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda3a314", new Object[]{this, queryPass});
            } else {
                this.queryPass = queryPass;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class Solution implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String type;

        static {
            kge.a(-1023957427);
            kge.a(1028243835);
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class Performance implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<DataPrefetch> dataPrefetch;
        private OfflineResource offlineResource;
        private List<String> prerenderSubPageWhiteList;
        private List<ResourcePrefetch> resourcePrefetch;

        static {
            kge.a(-1311107364);
            kge.a(1028243835);
        }

        public final List<DataPrefetch> getDataPrefetch() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d768ff49", new Object[]{this}) : this.dataPrefetch;
        }

        public final void setDataPrefetch(List<DataPrefetch> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c299fd3b", new Object[]{this, list});
            } else {
                this.dataPrefetch = list;
            }
        }

        public final OfflineResource getOfflineResource() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (OfflineResource) ipChange.ipc$dispatch("80292d46", new Object[]{this}) : this.offlineResource;
        }

        public final void setOfflineResource(OfflineResource offlineResource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1a95c28", new Object[]{this, offlineResource});
            } else {
                this.offlineResource = offlineResource;
            }
        }

        public final List<ResourcePrefetch> getResourcePrefetch() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2e869765", new Object[]{this}) : this.resourcePrefetch;
        }

        public final void setResourcePrefetch(List<ResourcePrefetch> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e912029f", new Object[]{this, list});
            } else {
                this.resourcePrefetch = list;
            }
        }

        public final List<String> getPrerenderSubPageWhiteList() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("794f8165", new Object[]{this}) : this.prerenderSubPageWhiteList;
        }

        public final void setPrerenderSubPageWhiteList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40da5807", new Object[]{this, list});
            } else {
                this.prerenderSubPageWhiteList = list;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class OfflineResource implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion;
        public static final String PRELOAD_STRATEGY = "preload";
        private List<MatchRule> matchRules;
        private String resourceManifestUrl;
        private String strategy;

        static {
            kge.a(941978557);
            kge.a(1028243835);
            Companion = new a(null);
        }

        public final List<MatchRule> getMatchRules() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ee583b8", new Object[]{this}) : this.matchRules;
        }

        public final void setMatchRules(List<MatchRule> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ea1d9ac", new Object[]{this, list});
            } else {
                this.matchRules = list;
            }
        }

        public final String getStrategy() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f8429b0", new Object[]{this}) : this.strategy;
        }

        public final void setStrategy(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebde66c6", new Object[]{this, str});
            } else {
                this.strategy = str;
            }
        }

        public final String getResourceManifestUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2244dfdd", new Object[]{this}) : this.resourceManifestUrl;
        }

        public final void setResourceManifestUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2c96a1", new Object[]{this, str});
            } else {
                this.resourceManifestUrl = str;
            }
        }

        /* loaded from: classes9.dex */
        public static final class a {
            static {
                kge.a(882480837);
            }

            private a() {
            }

            public /* synthetic */ a(o oVar) {
                this();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class MatchRule implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion;
        public static final String PREFIX_TYPE = "prefix";
        private String type;
        private String value;

        static {
            kge.a(-69649395);
            kge.a(1028243835);
            Companion = new a(null);
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }

        public final String getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this}) : this.value;
        }

        public final void setValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
            } else {
                this.value = str;
            }
        }

        /* loaded from: classes9.dex */
        public static final class a {
            static {
                kge.a(1739275029);
            }

            private a() {
            }

            public /* synthetic */ a(o oVar) {
                this();
            }
        }
    }
}
