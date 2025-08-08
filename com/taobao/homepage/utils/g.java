package com.taobao.homepage.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.l;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.kss;
import tb.ood;

/* loaded from: classes.dex */
public class g extends com.ut.mini.module.plugin.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RANGER_BUCKETS_KEY = "ranger_buckets_native";
    public static final String TRACK_KEY = "ranger_track";
    public static final String UTPARAM_KEY = "utparam-cnt";
    private static g c;
    private static final int[] d;
    private final String e = "[|_,\\s]+";
    private final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public l f17287a = new l();
    public WeakReference<Object> b = null;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1134211760);
        d = new int[]{2001, 2101, 2201};
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("337e8d5e", new Object[0]);
        }
        if (c == null) {
            c = new g();
        }
        return c;
    }

    private g() {
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b = new WeakReference<>(obj);
        }
    }

    @Override // com.ut.mini.module.plugin.a
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this}) : d;
    }

    public Map<String, String> a(Object obj, String str, NewRangerOptions newRangerOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("53a5d59d", new Object[]{this, obj, str, newRangerOptions});
        }
        synchronized (this.f) {
            if (obj != null) {
                if (!StringUtils.isEmpty(str)) {
                    if (newRangerOptions == null) {
                        newRangerOptions = new NewRangerOptions();
                    }
                    l lVar = this.f17287a;
                    if (!StringUtils.isEmpty(newRangerOptions.trackGroup)) {
                        l.a aVar = lVar.b.get(newRangerOptions.trackGroup);
                        if (aVar == null) {
                            Map<String, l.a> map = lVar.b;
                            String str2 = newRangerOptions.trackGroup;
                            l.a aVar2 = new l.a();
                            map.put(str2, aVar2);
                            aVar = aVar2;
                        }
                        aVar.f17293a = str.split("[|_,\\s]+");
                        Collections.addAll(aVar.b, aVar.f17293a);
                    } else {
                        Collections.addAll(lVar.c, str.split("[|_,\\s]+"));
                    }
                    if (!StringUtils.isEmpty(newRangerOptions.rangerBucketsAlias)) {
                        Collections.addAll(lVar.d, newRangerOptions.rangerBucketsAlias.split("[,|\\s]+"));
                    }
                    HashSet hashSet = new HashSet(lVar.c);
                    Map<String, String> pageProperties = com.ut.mini.l.getInstance().getPageProperties(obj);
                    if (pageProperties != null && !StringUtils.isEmpty(pageProperties.get(RANGER_BUCKETS_KEY))) {
                        Collections.addAll(hashSet, pageProperties.get(RANGER_BUCKETS_KEY).split("[|_,\\s]+"));
                    }
                    for (l.a aVar3 : lVar.b.values()) {
                        if (aVar3 != null) {
                            hashSet.removeAll(aVar3.b);
                            Collections.addAll(hashSet, aVar3.f17293a);
                        }
                    }
                    String join = StringUtils.join("_", hashSet);
                    HashMap hashMap = new HashMap();
                    if (!com.taobao.android.home.component.utils.j.a("enableDeleteRangerBucketsNative", true)) {
                        hashMap.put(RANGER_BUCKETS_KEY, join);
                    }
                    Iterator<String> it = lVar.d.iterator();
                    while (it.hasNext()) {
                        hashMap.put(it.next(), join);
                    }
                    if (newRangerOptions.commParams != null) {
                        for (Map.Entry<String, Object> entry : newRangerOptions.commParams.entrySet()) {
                            if (entry.getValue() instanceof String) {
                                hashMap.put(entry.getKey(), (String) entry.getValue());
                            }
                        }
                    }
                    UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, hashMap);
                    UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, JSON.toJSONString(hashMap));
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
                    c();
                    lVar.f17292a = hashMap;
                    return hashMap;
                }
            }
            return null;
        }
    }

    @Override // com.ut.mini.module.plugin.a
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        }
        try {
            if (StringUtils.equals(str, kss.f30292a) && this.b != null && this.b.get() != null) {
                if (!StringUtils.isEmpty(map.get(RANGER_BUCKETS_KEY))) {
                    return a(this.b.get(), map.get(RANGER_BUCKETS_KEY), null);
                }
                l lVar = this.f17287a;
                if (lVar != null && lVar.f17292a != null && !lVar.f17292a.isEmpty()) {
                    c();
                    return lVar.f17292a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private boolean b() {
        Map<String, String> pageProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        WeakReference<Object> weakReference = this.b;
        Object obj = weakReference == null ? null : weakReference.get();
        return (obj == null || (pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj)) == null || !pageProperties.containsKey("clearNdHomeBuckets")) ? false : true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!b()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(ood.HOME_BUCKETS, "404");
            com.taobao.android.home.component.utils.e.e(RPCDataItems.SWITCH_TAG_LOG, "符合条件，过滤替换 home_buckets");
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
        }
    }
}
