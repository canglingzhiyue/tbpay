package com.alibaba.poplayer.config.manager;

import android.text.TextUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.kge;

@Monitor.TargetClass
/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_PAGE_ORANGE_VERSION_NEW)

    /* renamed from: a  reason: collision with root package name */
    private String f3176a;
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_CONFIG_SET_NEW)
    private Set<String> b = new HashSet();
    private Map<String, Set<String>> c = new ConcurrentHashMap();
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_CONFIG_URI_ITEM_LOADED)
    private final ConcurrentMap<String, List<BaseConfigItem>> d = new ConcurrentHashMap();
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_CONFIG_ITEM_LOADED)
    private final ConcurrentMap<String, BaseConfigItem> e = new ConcurrentHashMap();

    static {
        kge.a(246010863);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f3176a;
    }

    private boolean a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f3176a) || "mock".equals(str) || "mock".equals(this.f3176a)) {
            return true;
        }
        return z;
    }

    public boolean a(boolean z, String str, Map<String, Set<String>> map, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5d06054", new Object[]{this, new Boolean(z), str, map, set})).booleanValue();
        }
        if (!a(z, str)) {
            com.alibaba.poplayer.utils.c.a("ConfigInfoNew.resetConfigs.notNeedUpdateConfigs.newConfigVersion=%s.curConfigVersion=%s", str, this.f3176a);
            return false;
        }
        this.d.clear();
        this.e.clear();
        this.f3176a = str;
        this.c = map != null ? new ConcurrentHashMap(map) : new ConcurrentHashMap();
        this.b = set != null ? new HashSet(set) : new HashSet();
        return true;
    }

    public void a(String str, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b1e2e4", new Object[]{this, str, baseConfigItem});
        } else if (TextUtils.isEmpty(str) || baseConfigItem == null) {
        } else {
            this.e.put(str, baseConfigItem);
        }
    }

    public void a(String str, List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
        } else {
            this.d.put(str, list);
        }
    }

    public Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public BaseConfigItem b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("689088f9", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.e.get(str);
        }
        return null;
    }

    public List<BaseConfigItem> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !this.d.containsKey(str)) {
            com.alibaba.poplayer.utils.c.a("ConfigInfoNew.getConfigItemsByUri.NO URI.mCacheUriConfigMap=%s.uri=%s", this.d, str);
            return null;
        }
        List<BaseConfigItem> list = this.d.get(str);
        return list != null ? list : new ArrayList();
    }
}
