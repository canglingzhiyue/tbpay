package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.model.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class ctz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CACHE_SIZE = 100;

    /* renamed from: a  reason: collision with root package name */
    private final String f26526a;
    private final Map<String, LruCache<String, DXWidgetNode>> b;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ctz f26527a;

        static {
            kge.a(292263930);
            f26527a = new ctz();
        }

        public static /* synthetic */ ctz a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ctz) ipChange.ipc$dispatch("f036815", new Object[0]) : f26527a;
        }
    }

    static {
        kge.a(147660071);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
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
            a(entry.getKey(), value == null ? 100 : value.intValue());
        }
    }

    public static ctz b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctz) ipChange.ipc$dispatch("16b50d74", new Object[0]) : a.a();
    }

    private ctz() {
        this.f26526a = "public_cache";
        this.b = new HashMap();
        c();
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
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
                LruCache<String, DXWidgetNode> lruCache = this.b.get(a(str));
                if (lruCache != null) {
                    lruCache.remove(c(str, dXTemplateItem, dinamicXEngine));
                }
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
                LruCache<String, DXWidgetNode> lruCache = this.b.get(a(str));
                if (lruCache != null) {
                    lruCache.put(c(str, dXTemplateItem, dXWidgetNode.getEngine()), dXWidgetNode);
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
            LruCache<String, DXWidgetNode> lruCache = this.b.get(a(str));
            if (lruCache == null) {
                return null;
            }
            return lruCache.get(c(str, dXTemplateItem, dinamicXEngine));
        }
    }

    private String c(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868e2152", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (f.e()) {
            return str + dXTemplateItem.b() + "_" + gbg.b(DinamicXEngine.i());
        }
        f z = dinamicXEngine.b().z();
        if (z != null && z.c() > 0) {
            b = z.c();
        } else {
            Context N = dinamicXEngine.N();
            if (N == null) {
                N = DinamicXEngine.i();
            }
            b = gbg.b(N);
        }
        return str + dXTemplateItem.b() + "_" + b;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.b.get(str) != null ? str : "public_cache";
    }
}
