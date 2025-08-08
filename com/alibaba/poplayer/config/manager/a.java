package com.alibaba.poplayer.config.manager;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.config.model.trigger.TriggerModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

@Monitor.TargetClass
/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_PAGE_ORANGE_VERSION)
    private volatile String e;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, List<BaseConfigItem>> f3175a = new ConcurrentHashMap();
    private final ConcurrentMap<String, BaseConfigItem> b = new ConcurrentHashMap();
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_CONFIG_SET)
    private List<String> c = new CopyOnWriteArrayList();
    @Monitor.TargetField(name = com.alibaba.poplayer.utils.b.MONITOR_CONFIG_ITEMS)
    private List<BaseConfigItem> d = new CopyOnWriteArrayList();
    private List<String> f = new CopyOnWriteArrayList();
    private boolean g = false;

    static {
        kge.a(-123401231);
    }

    public Map<String, List<BaseConfigItem>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        e();
        return this.f3175a;
    }

    public Map<String, BaseConfigItem> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        e();
        return this.b;
    }

    private synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.g) {
            c(this.d);
            d(this.d);
            this.g = false;
        }
    }

    private void c(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        ConcurrentMap<String, List<BaseConfigItem>> concurrentMap = this.f3175a;
        concurrentMap.clear();
        for (BaseConfigItem baseConfigItem : list) {
            if (baseConfigItem != null && baseConfigItem.triggerConfigs != null) {
                TriggerModel triggerModel = baseConfigItem.triggerConfigs;
                if (triggerModel.pages != null && triggerModel.pages.size() > 0) {
                    for (UriModel uriModel : triggerModel.pages) {
                        for (String str : uriModel.uris) {
                            if (!StringUtils.isEmpty(str)) {
                                List<BaseConfigItem> list2 = concurrentMap.get(str);
                                if (list2 == null) {
                                    list2 = new ArrayList<>();
                                }
                                list2.add(baseConfigItem);
                                concurrentMap.put(str, list2);
                            }
                        }
                    }
                }
            }
        }
    }

    private void d(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
            return;
        }
        ConcurrentMap<String, BaseConfigItem> concurrentMap = this.b;
        concurrentMap.clear();
        for (BaseConfigItem baseConfigItem : list) {
            if (baseConfigItem != null && !StringUtils.isEmpty(baseConfigItem.indexID)) {
                concurrentMap.put(baseConfigItem.indexID, baseConfigItem);
            }
        }
    }

    public void e(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f;
    }

    public List<String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.c;
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public void b(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.d = list;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }
}
