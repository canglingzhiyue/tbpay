package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.model.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fwl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CACHE_SIZE = 100;
    public static final int WHITE_DEFAULT_CACHE_SIZE = 20;

    /* renamed from: a  reason: collision with root package name */
    private final String f28162a;
    private final Map<String, LruCache<String, DXWidgetNode>> b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fwl f28163a;

        static {
            kge.a(1038812762);
            f28163a = new fwl();
        }

        public static /* synthetic */ fwl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fwl) ipChange.ipc$dispatch("f04cec3", new Object[0]) : f28163a;
        }
    }

    static {
        kge.a(1068845959);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (bx.a()) {
            this.b.put("public_cache", new LruCache<>(200));
        } else {
            this.b.put("public_cache", new LruCache<>(100));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<String, Integer> Q = fqi.Q();
        if (Q == null || Q.isEmpty()) {
            if (!DinamicXEngine.j()) {
                return;
            }
            fuw.d("DXConfigCenter", "原型树缓存白名单未命中 or 白名单配置未 Empty ");
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXConfigCenter", "原型树缓存白名单命中");
        }
        for (Map.Entry<String, Integer> entry : Q.entrySet()) {
            Integer value = entry.getValue();
            a(entry.getKey(), value == null ? 20 : value.intValue());
        }
    }

    public static fwl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fwl) ipChange.ipc$dispatch("16b67422", new Object[0]) : a.a();
    }

    private fwl() {
        this.f28162a = "public_cache";
        this.b = new HashMap();
        d();
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this.b) {
                if (this.b.containsKey(str)) {
                    return;
                }
                this.b.put(str, new LruCache<>(i));
            }
        }
    }

    public void a(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f4710c", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        } else if (!fxb.a(str, dXTemplateItem)) {
        } else {
            synchronized (this.b) {
                LruCache<String, DXWidgetNode> lruCache = this.b.get(a(str, dXTemplateItem));
                if (lruCache != null) {
                    lruCache.remove(c(str, dXTemplateItem, dinamicXEngine));
                }
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this.b) {
            LruCache<String, DXWidgetNode> lruCache = this.b.get(str);
            if (lruCache != null) {
                lruCache.evictAll();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            this.b.clear();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            LruCache<String, DXWidgetNode> lruCache = this.b.get("public_cache");
            if (lruCache != null) {
                lruCache.evictAll();
            }
        }
    }

    public void a(String str, DXTemplateItem dXTemplateItem, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e495034", new Object[]{this, str, dXTemplateItem, dXWidgetNode});
        } else if (!fxb.a(str, dXTemplateItem) || dXWidgetNode == null) {
        } else {
            synchronized (this.b) {
                String a2 = a(str, dXTemplateItem);
                LruCache<String, DXWidgetNode> lruCache = this.b.get(a2);
                if (lruCache != null) {
                    lruCache.put(c(str, dXTemplateItem, dXWidgetNode.getEngine()), dXWidgetNode);
                    if (DinamicXEngine.j()) {
                        fuw.b("往" + a2 + "  缓存池中加入模板原型树缓存 " + dXTemplateItem.b());
                    }
                }
            }
        }
    }

    public DXWidgetNode b(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e2b5f02c", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (!fxb.a(str, dXTemplateItem)) {
            return null;
        }
        synchronized (this.b) {
            LruCache<String, DXWidgetNode> lruCache = this.b.get(a(str, dXTemplateItem));
            if (lruCache == null) {
                return null;
            }
            return lruCache.get(c(str, dXTemplateItem, dinamicXEngine));
        }
    }

    private String c(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        String str2;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868e2152", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (f.e()) {
            return str + dXTemplateItem.b() + "_" + gbg.b(DinamicXEngine.i());
        }
        f z = dinamicXEngine.b().z();
        if (z != null) {
            if (z.c() > 0) {
                b = z.c();
            } else {
                Context N = dinamicXEngine.N();
                if (N == null) {
                    N = DinamicXEngine.i();
                }
                b = gbg.b(N);
            }
            str2 = b + "" + z.b() + z.a();
        } else {
            Context N2 = dinamicXEngine.N();
            if (N2 == null) {
                N2 = DinamicXEngine.i();
            }
            str2 = gbg.b(N2) + "";
        }
        return str + dXTemplateItem.b() + "_" + str2;
    }

    private String a(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b56935a5", new Object[]{this, str, dXTemplateItem}) : (this.b.get(str) == null || dXTemplateItem == null || dXTemplateItem.h() != 1) ? "public_cache" : str;
    }
}
