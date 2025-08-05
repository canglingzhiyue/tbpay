package com.alibaba.triver.cannal_engine.manager;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.android.triver.base.api.a;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.kit.api.proxy.IDeviceInfoProxy;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.media.MessageID;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f3644a;
    private static Map<String, Map<String, WeakReference<TRWidgetInstance>>> b;
    private static int c;

    static {
        kge.a(-387129593);
        c = 5;
    }

    public h() {
        b = new HashMap();
        c = c();
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("db6f8ca4", new Object[0]);
        }
        if (f3644a == null) {
            synchronized (h.class) {
                if (f3644a == null) {
                    f3644a = new h();
                }
            }
        }
        return f3644a;
    }

    public Map<String, WeakReference<TRWidgetInstance>> a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        if (!b.containsKey(str)) {
            if ("default".equals(str)) {
                b.put(str, new HashMap());
            } else {
                Map<String, Map<String, WeakReference<TRWidgetInstance>>> map = b;
                final int i = c;
                map.put(str, new LinkedHashMap<String, WeakReference<TRWidgetInstance>>(i, 0.75f, true) { // from class: com.alibaba.triver.cannal_engine.manager.TRWidgetInstanceManager$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.LinkedHashMap
                    public boolean removeEldestEntry(Map.Entry<String, WeakReference<TRWidgetInstance>> entry) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                        }
                        if (size() <= h.$ipChange) {
                            return false;
                        }
                        if (entry != null && entry.getValue() != null && entry.getValue().get() != null) {
                            RVLogger.e("TRWidgetInstanceManager", "remove instance in cache, scene id : " + str + ",cache id : " + entry.getKey());
                            entry.getValue().get().destroy();
                        }
                        return true;
                    }
                });
            }
        }
        return b.get(str);
    }

    public void b(String str) {
        Map<String, WeakReference<TRWidgetInstance>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (map = b.get(str)) == null) {
        } else {
            try {
                Iterator<Map.Entry<String, WeakReference<TRWidgetInstance>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, WeakReference<TRWidgetInstance>> next = it.next();
                    RVLogger.e("TRWidgetInstanceManager", "onResume,sceneId: " + str + ",cacheId:" + next.getKey());
                    if (next.getValue() == null) {
                        it.remove();
                    } else {
                        TRWidgetInstance tRWidgetInstance = next.getValue().get();
                        if (tRWidgetInstance == null) {
                            it.remove();
                        } else {
                            tRWidgetInstance.resume();
                        }
                    }
                }
            } catch (Exception e) {
                RVLogger.e("TRWidgetInstanceManager", e.getMessage());
            }
        }
    }

    public void a(String str, Boolean bool) {
        Map<String, WeakReference<TRWidgetInstance>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f9e1db", new Object[]{this, str, bool});
            return;
        }
        RVLogger.e("TRWidgetInstanceManager", "onPause");
        if (TextUtils.isEmpty(str) || (map = b.get(str)) == null) {
            return;
        }
        try {
            Iterator<Map.Entry<String, WeakReference<TRWidgetInstance>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<TRWidgetInstance>> next = it.next();
                RVLogger.e("TRWidgetInstanceManager", "onResume, groupId: " + str + ",cacheId:" + next.getKey());
                if (next.getValue() == null) {
                    it.remove();
                } else {
                    TRWidgetInstance tRWidgetInstance = next.getValue().get();
                    if (tRWidgetInstance == null) {
                        it.remove();
                    } else if (Build.VERSION.SDK_INT >= 19 && bool.booleanValue() && !tRWidgetInstance.getRootView().isAttachedToWindow()) {
                        RVLogger.e("TRWidgetInstanceManager", "release Cache when onPause,groupId: " + str + ",cacheId:" + next.getKey());
                        tRWidgetInstance.destroy();
                        it.remove();
                    } else {
                        RVLogger.e("TRWidgetInstanceManager", "onPause,groupId: " + str + ",cacheId:" + next.getKey());
                        tRWidgetInstance.pause();
                    }
                }
            }
        } catch (Exception e) {
            RVLogger.e("TRWidgetInstanceManager", e.getMessage());
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            a(str, true);
        }
    }

    public void d(String str) {
        Map<String, WeakReference<TRWidgetInstance>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        RVLogger.e("TRWidgetInstanceManager", MessageID.onDestroy);
        if (TextUtils.isEmpty(str) || (map = b.get(str)) == null) {
            return;
        }
        try {
            Iterator<Map.Entry<String, WeakReference<TRWidgetInstance>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<TRWidgetInstance>> next = it.next();
                RVLogger.e("TRWidgetInstanceManager", "release Cache when onDestory,sceneId: " + str + ",cacheId:" + next.getKey());
                if (next.getValue() != null) {
                    TRWidgetInstance tRWidgetInstance = next.getValue().get();
                    if (tRWidgetInstance != null) {
                        tRWidgetInstance.destroy();
                    }
                    it.remove();
                }
            }
        } catch (Exception e) {
            RVLogger.e("TRWidgetInstanceManager", e.getMessage());
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : a.a(d());
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        int deviceScore = ((IDeviceInfoProxy) RVProxy.get(IDeviceInfoProxy.class)).getDeviceScore();
        if (deviceScore >= 80) {
            return 0;
        }
        return deviceScore >= 60 ? 1 : 2;
    }
}
