package com.alibaba.poplayer.info.frequency;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.info.frequency.FrequencyManager;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class b extends FrequencyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f3184a;

        static {
            kge.a(-1421118468);
            f3184a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c795167d", new Object[0]) : f3184a;
        }
    }

    static {
        kge.a(-577159895);
    }

    private String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "config_frequency_info";
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.poplayer.info.frequency.FrequencyManager
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "poplayer_frequency_page";
    }

    @Override // com.alibaba.poplayer.info.frequency.FrequencyManager
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        return 604800L;
    }

    public static b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5c9ad181", new Object[0]) : a.a();
    }

    @Override // com.alibaba.poplayer.info.frequency.FrequencyManager
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            super.a();
        }
    }

    public int a(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d997a261", new Object[]{this, baseConfigItem})).intValue();
        }
        if (baseConfigItem != null && baseConfigItem.freqConfigs != null) {
            return a(g(), baseConfigItem.indexID, baseConfigItem.getStartTimeStamp(), PopLayer.getReference().getCurrentTimeStamp(), baseConfigItem.freqConfigs.freqSecs, baseConfigItem.freqConfigs.freqMaxCount, baseConfigItem.freqConfigs.freqFirstOffset, baseConfigItem.freqConfigs.freqEnableSection, baseConfigItem.freqConfigs.freqIntervalSecs);
        }
        return -1;
    }

    public boolean b(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb414891", new Object[]{this, baseConfigItem})).booleanValue() : (baseConfigItem == null || baseConfigItem.freqConfigs == null || a(g(), baseConfigItem.indexID, baseConfigItem.getStartTimeStamp(), PopLayer.getReference().getCurrentTimeStamp(), baseConfigItem.freqConfigs.freqSecs, baseConfigItem.freqConfigs.freqMaxCount, baseConfigItem.freqConfigs.freqIntervalSecs) != 0) ? false : true;
    }

    public FrequencyManager.FrequencyInfo c(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrequencyManager.FrequencyInfo) ipChange.ipc$dispatch("5da176fc", new Object[]{this, baseConfigItem}) : a(g(), baseConfigItem.indexID);
    }

    public void a(List<BaseConfigItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (list != null) {
            HashSet hashSet = new HashSet();
            for (BaseConfigItem baseConfigItem : list) {
                if (baseConfigItem.freqConfigs != null && a(baseConfigItem.freqConfigs.freqSecs, baseConfigItem.freqConfigs.freqIntervalSecs)) {
                    hashSet.add(baseConfigItem.indexID);
                }
            }
            a(g(), hashSet, z);
        }
    }

    public void a(Set<String> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3272085d", new Object[]{this, set, new Boolean(z)});
        } else if (set == null) {
        } else {
            a(g(), set, z);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(g());
        a(arrayList);
    }
}
