package tb;

import android.content.Context;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.b;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class fpy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, Pools.Pool<b>>> f28110a = new ConcurrentHashMap();
    private final Map<String, Map<String, Pools.Pool<DXRootView>>> b = new ConcurrentHashMap();
    private final Map<String, Map<String, Pools.Pool<DXRootView>>> c = new ConcurrentHashMap();
    private final Map<String, Map<String, DXRootView>> d = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fpy f28111a;

        static {
            kge.a(-1156209624);
            f28111a = new fpy();
        }

        public static /* synthetic */ fpy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fpy) ipChange.ipc$dispatch("f04b60f", new Object[0]) : f28111a;
        }
    }

    static {
        kge.a(-905372632);
    }

    public static fpy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpy) ipChange.ipc$dispatch("f04b60f", new Object[0]) : a.a();
    }

    public static String a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4a5106e", new Object[]{dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return "";
        }
        return dinamicTemplate.name + "_" + dinamicTemplate.version;
    }

    public void a(String str, String str2, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9f96fd", new Object[]{this, str, str2, dXRootView});
        } else if (dXRootView == null || TextUtils.isEmpty(str) || str2 == null) {
        } else {
            Map<String, DXRootView> map = this.d.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.d.put(str, map);
            }
            map.put(str2, dXRootView);
        }
    }

    public DXRootView a(Context context, String str, String str2) {
        Map<String, DXRootView> map;
        DXRootView remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("15c981e3", new Object[]{this, context, str, str2});
        }
        if (str2 == null || TextUtils.isEmpty(str) || (map = this.d.get(str)) == null || (remove = map.remove(str2)) == null) {
            return null;
        }
        if ((remove.getContext() instanceof fpz) && context != null) {
            ((fpz) remove.getContext()).a(context);
        }
        return remove;
    }

    public void a(b bVar, DinamicTemplate dinamicTemplate, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52634642", new Object[]{this, bVar, dinamicTemplate, str});
        } else if (bVar == null || TextUtils.isEmpty(str) || dinamicTemplate == null) {
        } else {
            String a2 = a(dinamicTemplate);
            Map<String, Pools.Pool<b>> map = this.f28110a.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.f28110a.put(str, map);
            }
            Pools.Pool<b> pool = map.get(a2);
            if (pool == null) {
                pool = new Pools.SynchronizedPool<>(6);
                map.put(a2, pool);
            }
            pool.release(bVar);
        }
    }

    public b a(Context context, DinamicTemplate dinamicTemplate, String str) {
        Map<String, Pools.Pool<b>> map;
        Pools.Pool<b> pool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6d1e2bfa", new Object[]{this, context, dinamicTemplate, str});
        }
        if (dinamicTemplate == null || TextUtils.isEmpty(str) || (map = this.f28110a.get(str)) == null || (pool = map.get(a(dinamicTemplate))) == null) {
            return null;
        }
        b acquire = pool.acquire();
        if (acquire != null && acquire.e() != null) {
            Context context2 = acquire.e().getContext();
            if ((context2 instanceof fpz) && context != null) {
                ((fpz) context2).a(context);
            }
        }
        return acquire;
    }

    public void b(DXRootView dXRootView, DXTemplateItem dXTemplateItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb29699d", new Object[]{this, dXRootView, dXTemplateItem, str});
        } else if (dXRootView == null || TextUtils.isEmpty(str) || dXTemplateItem == null) {
        } else {
            Map<String, Pools.Pool<DXRootView>> map = this.c.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.c.put(str, map);
            }
            Pools.Pool<DXRootView> pool = map.get(dXTemplateItem.b());
            if (pool == null) {
                pool = new Pools.SynchronizedPool<>(8);
                map.put(dXTemplateItem.b(), pool);
            }
            pool.release(dXRootView);
        }
    }

    public DXRootView b(Context context, DXTemplateItem dXTemplateItem, String str) {
        Map<String, Pools.Pool<DXRootView>> map;
        Pools.Pool<DXRootView> pool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("1fb6665", new Object[]{this, context, dXTemplateItem, str});
        }
        if (dXTemplateItem == null || TextUtils.isEmpty(str) || (map = this.c.get(str)) == null || (pool = map.get(dXTemplateItem.b())) == null) {
            return null;
        }
        DXRootView acquire = pool.acquire();
        if (acquire != null && (acquire.getContext() instanceof fpz) && context != null) {
            ((fpz) acquire.getContext()).a(context);
        }
        return acquire;
    }

    public void b(String str) {
        Map<String, Map<String, Pools.Pool<DXRootView>>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (map = this.c) == null) {
        } else {
            map.remove(str);
            this.d.remove(str);
        }
    }

    public void a(DXRootView dXRootView, DXTemplateItem dXTemplateItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6038511c", new Object[]{this, dXRootView, dXTemplateItem, str});
        } else if (dXRootView == null || TextUtils.isEmpty(str) || dXTemplateItem == null) {
        } else {
            Map<String, Pools.Pool<DXRootView>> map = this.b.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.b.put(str, map);
            }
            Pools.Pool<DXRootView> pool = map.get(dXTemplateItem.b());
            if (pool == null) {
                pool = new Pools.SynchronizedPool<>(6);
                map.put(dXTemplateItem.b(), pool);
            }
            pool.release(dXRootView);
        }
    }

    public DXRootView a(Context context, DXTemplateItem dXTemplateItem, String str) {
        Map<String, Pools.Pool<DXRootView>> map;
        Pools.Pool<DXRootView> pool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f67b80e4", new Object[]{this, context, dXTemplateItem, str});
        }
        if (dXTemplateItem == null || TextUtils.isEmpty(str) || (map = this.b.get(str)) == null || (pool = map.get(dXTemplateItem.b())) == null) {
            return null;
        }
        DXRootView acquire = pool.acquire();
        if (acquire != null && (acquire.getContext() instanceof fpz) && context != null) {
            ((fpz) acquire.getContext()).a(context);
        }
        return acquire;
    }

    public void a(String str) {
        Map<String, Map<String, Pools.Pool<DXRootView>>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (map = this.b) == null) {
        } else {
            map.remove(str);
        }
    }
}
