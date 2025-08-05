package com.alibaba.poplayer.config.fetch;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.bzl;
import tb.kge;

/* loaded from: classes2.dex */
public class ConfigFetcherNew implements IConfigFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final INewConfigAdapter mConfigAdapter;
    private final b mConfigFetchListener;

    /* loaded from: classes2.dex */
    public interface b {
        void onFetchFinish(a aVar);
    }

    static {
        kge.a(-1080713073);
        kge.a(1264486096);
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public boolean isUpdatingConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27af6d7d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startLoadConfigs(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bcc5ae", new Object[]{this, new Boolean(z), str});
        }
    }

    public ConfigFetcherNew(INewConfigAdapter iNewConfigAdapter, b bVar) {
        this.mConfigAdapter = iNewConfigAdapter;
        this.mConfigAdapter.init();
        this.mConfigFetchListener = bVar;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3174a;
        public final String b;
        public final Map<String, Set<String>> c;
        public final Set<String> d;

        static {
            kge.a(-1104842046);
        }

        public a(boolean z, String str, Map<String, Set<String>> map, Set<String> set) {
            this.f3174a = z;
            this.b = str;
            this.c = map;
            this.d = set;
        }

        public boolean a() {
            Map<String, Set<String>> map;
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.b) && (map = this.c) != null && !map.isEmpty();
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startFetch(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80abeab5", new Object[]{this, new Boolean(z)});
        } else {
            f.a(new Runnable() { // from class: com.alibaba.poplayer.config.fetch.-$$Lambda$ConfigFetcherNew$YyxLFgCSEnmWs-K_wBHMJu8SAK8
                {
                    ConfigFetcherNew.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ConfigFetcherNew.this.lambda$startFetch$51$ConfigFetcherNew(z);
                }
            });
        }
    }

    public /* synthetic */ void lambda$startFetch$51$ConfigFetcherNew(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f496c0e2", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            c.c("configUpdate", "", "ConfigFetcherNew.startFetch.enter.forceFetch=" + z);
            final com.alibaba.poplayer.utils.a a2 = com.alibaba.poplayer.utils.a.a();
            a2.a(2);
            a aVar = new a(true, this.mConfigAdapter.getCurConfigVersion(), this.mConfigAdapter.getUriConfigsMap(), this.mConfigAdapter.getConfigsIdSet());
            if (!z && bzl.a().b().isConfigFetchLocalEnable() && aVar.a()) {
                a2.b(2);
                a2.a(3);
                a2.b(3);
                c.c("configUpdate", "", "ConfigFetcherNew.startFetch.doLazyFetch");
                this.mConfigFetchListener.onFetchFinish(aVar);
                this.mConfigAdapter.startFetchConfig(new com.alibaba.poplayer.config.fetch.a() { // from class: com.alibaba.poplayer.config.fetch.-$$Lambda$ConfigFetcherNew$pGfLPbX49t6IxzzKqdUzB2HDPE4
                    @Override // com.alibaba.poplayer.config.fetch.a
                    public final void onConfigFetched(boolean z2, String str, String str2, Set set) {
                        ConfigFetcherNew.this.lambda$null$49$ConfigFetcherNew(z2, str, str2, set);
                    }
                });
                return;
            }
            c.c("configUpdate", "", "ConfigFetcherNew.startFetch.doFetch");
            this.mConfigAdapter.startFetchConfig(new com.alibaba.poplayer.config.fetch.a() { // from class: com.alibaba.poplayer.config.fetch.-$$Lambda$ConfigFetcherNew$JrOD9SZ40Tw6e4Wwyl_i-dtcSTw
                @Override // com.alibaba.poplayer.config.fetch.a
                public final void onConfigFetched(boolean z2, String str, String str2, Set set) {
                    ConfigFetcherNew.this.lambda$null$50$ConfigFetcherNew(a2, z2, str, str2, set);
                }
            });
        } catch (Throwable th) {
            c.a("ConfigFetcherNew.startFetch.error", th);
            this.mConfigFetchListener.onFetchFinish(null);
        }
    }

    public /* synthetic */ void lambda$null$49$ConfigFetcherNew(boolean z, String str, String str2, Set set) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4474a2c3", new Object[]{this, new Boolean(z), str, str2, set});
            return;
        }
        c.c("configUpdate", "", "ConfigFetcherNew.startFetch.doLazyFetch.fetchDone.updated=" + z + ".configVersion=" + str);
        try {
            map = (Map) JSON.parseObject(str2, new TypeReference<Map<String, Set<String>>>() { // from class: com.alibaba.poplayer.config.fetch.ConfigFetcherNew.1
            }, new Feature[0]);
        } catch (Throwable th) {
            c.a("ConfigFetcherNew.parseUriMap.error", th);
            map = null;
        }
        this.mConfigFetchListener.onFetchFinish(new a(z, str, map, set));
    }

    public /* synthetic */ void lambda$null$50$ConfigFetcherNew(com.alibaba.poplayer.utils.a aVar, boolean z, String str, String str2, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f4ec73", new Object[]{this, aVar, new Boolean(z), str, str2, set});
            return;
        }
        c.c("configUpdate", "", "ConfigFetcherNew.startFetch.doFetch.fetchDone.updated=" + z + ".configVersion=" + str);
        aVar.b(2);
        aVar.a(3);
        aVar.b(3);
        Map map = null;
        try {
            map = (Map) JSON.parseObject(str2, new TypeReference<Map<String, Set<String>>>() { // from class: com.alibaba.poplayer.config.fetch.ConfigFetcherNew.2
            }, new Feature[0]);
        } catch (Throwable th) {
            c.a("ConfigFetcherNew.parseUriMap.error", th);
        }
        this.mConfigFetchListener.onFetchFinish(new a(z, str, map, set));
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public BaseConfigItem getConfigItemById(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("97376cfe", new Object[]{this, str, str2});
        }
        try {
            String configItemById = this.mConfigAdapter.getConfigItemById(str);
            if (!TextUtils.isEmpty(configItemById)) {
                return com.alibaba.poplayer.config.manager.c.a(configItemById, str, str2);
            }
            return null;
        } catch (Throwable th) {
            c.a("ConfigFetcherNew.getConfigItemById.error", th);
            return null;
        }
    }
}
