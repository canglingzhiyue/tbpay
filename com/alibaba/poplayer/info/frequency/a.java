package com.alibaba.poplayer.info.frequency;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f3182a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: com.alibaba.poplayer.info.frequency.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0118a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f3183a;

        static {
            kge.a(837581394);
            f3183a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c795165e", new Object[0]) : f3183a;
        }
    }

    static {
        kge.a(-1907511425);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c795165e", new Object[0]) : C0118a.a();
    }

    public boolean a(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d997a272", new Object[]{this, baseConfigItem})).booleanValue();
        }
        if (!f.a()) {
            com.alibaba.poplayer.utils.c.a("ColdLaunchFrequency.checkColdLaunched.set.not on MainThread!!! cur thread name = " + Thread.currentThread().getName());
        }
        if (baseConfigItem == null) {
            return false;
        }
        return !baseConfigItem.onlyColdLaunch || !this.f3182a.contains(baseConfigItem.indexID);
    }

    public void b(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb41488d", new Object[]{this, baseConfigItem});
            return;
        }
        if (!f.a()) {
            com.alibaba.poplayer.utils.c.a("ColdLaunchFrequency.updateColdLaunched.set.not on MainThread!!! cur thread name = " + Thread.currentThread().getName());
        }
        if (baseConfigItem == null || StringUtils.isEmpty(baseConfigItem.indexID) || !baseConfigItem.onlyColdLaunch) {
            return;
        }
        this.f3182a.add(baseConfigItem.indexID);
    }
}
