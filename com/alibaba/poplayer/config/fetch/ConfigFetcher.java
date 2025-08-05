package com.alibaba.poplayer.config.fetch;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.Monitor;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bzz;
import tb.kge;

@Monitor.TargetClass
/* loaded from: classes2.dex */
public class ConfigFetcher implements IConfigFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IConfigAdapter mConfigAdapter;
    private final b mConfigManagerAdapter;
    private long mParseStartTime;
    private boolean isInitialized = false;
    private volatile boolean mIsUpdating = false;

    /* loaded from: classes2.dex */
    public interface b {
        void onConfigUpdated(a aVar);
    }

    static {
        kge.a(-1090682031);
        kge.a(1264486096);
    }

    public ConfigFetcher(IConfigAdapter iConfigAdapter, b bVar) {
        this.mConfigAdapter = iConfigAdapter;
        this.mConfigAdapter.init(new com.alibaba.poplayer.config.fetch.a() { // from class: com.alibaba.poplayer.config.fetch.-$$Lambda$ConfigFetcher$vcTzuoBeAIjAv3e02mjdE21fuHI
            @Override // com.alibaba.poplayer.config.fetch.a
            public final void onConfigFetched(boolean z, String str, String str2, Set set) {
                ConfigFetcher.this.lambda$new$47$ConfigFetcher(z, str, str2, set);
            }
        });
        this.mConfigManagerAdapter = bVar;
    }

    public /* synthetic */ void lambda$new$47$ConfigFetcher(boolean z, String str, String str2, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0bca62", new Object[]{this, new Boolean(z), str, str2, set});
        } else {
            startLoadConfigs(z, str);
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public boolean isUpdatingConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27af6d7d", new Object[]{this})).booleanValue() : this.mIsUpdating;
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startFetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80abeab5", new Object[]{this, new Boolean(z)});
        } else if (this.isInitialized) {
        } else {
            this.isInitialized = true;
            com.alibaba.poplayer.utils.a.a().a(2);
            this.mConfigAdapter.startFetchConfig();
        }
    }

    @Override // com.alibaba.poplayer.config.fetch.IConfigFetcher
    public void startLoadConfigs(boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bcc5ae", new Object[]{this, new Boolean(z), str});
        } else {
            f.a(new Runnable() { // from class: com.alibaba.poplayer.config.fetch.-$$Lambda$ConfigFetcher$7MTpsJHeVYsBlDX3aYjYCFHhUEo
                {
                    ConfigFetcher.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ConfigFetcher.this.lambda$startLoadConfigs$48$ConfigFetcher(str);
                }
            });
        }
    }

    public /* synthetic */ void lambda$startLoadConfigs$48$ConfigFetcher(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbd89d3", new Object[]{this, str});
            return;
        }
        try {
            c.a("ConfigFetcher.startLoadConfigs.configVersion=%s", str);
            com.alibaba.poplayer.utils.a a2 = com.alibaba.poplayer.utils.a.a();
            a2.b(2);
            a2.a(3);
            this.mParseStartTime = SystemClock.elapsedRealtime();
            this.mIsUpdating = true;
            onReadyToUpdateConfig(updateCacheConfig(str));
        } catch (Throwable th) {
            c.a("ConfigFetcher.updateCacheConfigAsync.runInGlobalThread.error", th);
        }
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
            c.a("ConfigFetcher.getConfigItemById.error", th);
            return null;
        }
    }

    private a updateCacheConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a6de46cf", new Object[]{this, str});
        }
        c.c("configUpdate", "", "ConfigFetcher.updateCacheConfig.run.start.configVersion=" + str);
        ArrayList arrayList = new ArrayList();
        String configsIdSetString = this.mConfigAdapter.getConfigsIdSetString();
        if (isConfigStringEmpty(configsIdSetString)) {
            c.c("configUpdate", "", "ConfigFetcher.configSet.empty.return.");
            return new a();
        }
        c.c("configUpdate", "", "ConfigFetcher.run.configSet=" + configsIdSetString + ".configVersion=" + str);
        String[] split = configsIdSetString.split(",");
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : split) {
            String trim = str2.trim();
            try {
                BaseConfigItem a2 = com.alibaba.poplayer.config.manager.c.a(this.mConfigAdapter.getConfigItemById(trim), trim, str);
                if (a2 != null) {
                    arrayList.add(a2);
                    arrayList2.add(trim);
                }
            } catch (Throwable th) {
                c.a("ConfigFetcher.parse.error", th);
            }
        }
        com.alibaba.poplayer.utils.a.a().f();
        PopMiscInfoFileHelper.a().a(arrayList);
        com.alibaba.poplayer.info.frequency.b.e().a((List<BaseConfigItem>) arrayList, true);
        return new a(arrayList, arrayList2, str);
    }

    private void onReadyToUpdateConfig(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4bb1222", new Object[]{this, aVar});
            return;
        }
        try {
            if (aVar == null) {
                this.mIsUpdating = false;
                return;
            }
            long elapsedRealtime = this.mParseStartTime > 0 ? SystemClock.elapsedRealtime() - this.mParseStartTime : 0L;
            if (elapsedRealtime > 0) {
                bzz.a(elapsedRealtime);
            }
            if (this.mConfigManagerAdapter != null) {
                this.mConfigManagerAdapter.onConfigUpdated(aVar);
            }
            this.mIsUpdating = false;
        } catch (Throwable th) {
            c.a("ConfigFetcher.onReadyToUpdateConfig.error", th);
            this.mIsUpdating = false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<BaseConfigItem> f3171a;
        public final List<String> b;
        public final String c;

        static {
            kge.a(1175798404);
        }

        public a(List<BaseConfigItem> list, List<String> list2, String str) {
            this.f3171a = list;
            this.b = list2;
            this.c = str;
        }

        public a() {
            this.f3171a = new CopyOnWriteArrayList();
            this.b = new CopyOnWriteArrayList();
            this.c = "";
        }
    }

    private static boolean isConfigStringEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1070f9a5", new Object[]{str})).booleanValue() : str == null || "".equals(str) || "\"\"".equals(str);
    }
}
