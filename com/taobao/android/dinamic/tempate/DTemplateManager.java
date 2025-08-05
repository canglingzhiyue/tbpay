package com.taobao.android.dinamic.tempate;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.h;
import com.taobao.android.dinamic.tempate.c;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import tb.fpa;
import tb.fpb;
import tb.fps;
import tb.fpt;
import tb.kge;

/* loaded from: classes.dex */
public class DTemplateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11753a;
    private fps b;
    private Context e;
    private LruCache<String, Integer> c = new LruCache<>(100);
    private LruCache<String, Boolean> d = new LruCache<>(100);
    private int f = 3000;
    private c g = new c();
    private String h = "dinamic";
    private CacheStrategy i = CacheStrategy.STRATEGY_DEFAULT;

    /* loaded from: classes5.dex */
    public enum CacheStrategy {
        STRATEGY_DEFAULT,
        STRATEGY_ALLOW_VERSION_DEGRADE
    }

    static {
        kge.a(-126737613);
    }

    public static /* synthetic */ String a(DTemplateManager dTemplateManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a2479a", new Object[]{dTemplateManager}) : dTemplateManager.f11753a;
    }

    public static /* synthetic */ CacheStrategy b(DTemplateManager dTemplateManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CacheStrategy) ipChange.ipc$dispatch("36cfa192", new Object[]{dTemplateManager}) : dTemplateManager.i;
    }

    public DTemplateManager(String str) {
        this.f11753a = str;
        this.e = e.b();
        if (this.e == null) {
            this.e = h.a();
            e.a(this.e);
        }
        this.b = new fps(this.e, str);
        this.b.a(com.taobao.android.dinamic.c.a().e());
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(i);
        }
    }

    public static DTemplateManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DTemplateManager) ipChange.ipc$dispatch("1baddcc6", new Object[0]) : e.a("default").b;
    }

    public static DTemplateManager a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DTemplateManager) ipChange.ipc$dispatch("20564b90", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return e.a("default").b;
        }
        return e.a(str).b;
    }

    public XmlResourceParser a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("1a819744", new Object[]{this, dinamicTemplate});
        }
        if (this.e != null && dinamicTemplate != null && !TextUtils.isEmpty(dinamicTemplate.name)) {
            try {
                int b = b(dinamicTemplate.name);
                if (b > 0) {
                    String str = "Res parser is applied: " + dinamicTemplate.name;
                    return this.e.getResources().getLayout(b);
                }
            } catch (Exception e) {
                Log.e("DTemplateManager", "Get layout parser exception", e);
            }
        }
        return null;
    }

    public byte[] b(DinamicTemplate dinamicTemplate) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("29758fca", new Object[]{this, dinamicTemplate});
        }
        String h = h(dinamicTemplate);
        if (!TextUtils.isEmpty(h)) {
            return this.b.b(h);
        }
        return null;
    }

    public byte[] c(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("b662a6e9", new Object[]{this, dinamicTemplate}) : this.b.a(this.h, h(dinamicTemplate));
    }

    public void a(List<DinamicTemplate> list, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c63c4b", new Object[]{this, list, aVar});
            return;
        }
        c.b bVar = new c.b() { // from class: com.taobao.android.dinamic.tempate.DTemplateManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamic.tempate.c.b
            public void a(b bVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fab23079", new Object[]{this, bVar2});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(bVar2);
                } else if (!e.a()) {
                } else {
                    fpa.c("DTemplateManager", "DinamicTemplateDownloaderCallback is null");
                }
            }
        };
        c.a aVar2 = new c.a(this.b, this.f);
        aVar2.f11758a = bVar;
        aVar2.b = list;
        aVar2.c = this.f11753a;
        this.g.a(aVar2);
    }

    public DinamicTemplate d(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("4f0e2c8b", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        long nanoTime = System.nanoTime();
        if (dinamicTemplate.isPreset()) {
            DinamicTemplate g = g(dinamicTemplate);
            a(dinamicTemplate, g, System.nanoTime() - nanoTime);
            return g;
        }
        if (this.i == CacheStrategy.STRATEGY_DEFAULT) {
            DinamicTemplate e = e(dinamicTemplate);
            if (e != null) {
                a(dinamicTemplate, e, System.nanoTime() - nanoTime);
                return e;
            }
        } else if (this.i == CacheStrategy.STRATEGY_ALLOW_VERSION_DEGRADE) {
            DinamicTemplate e2 = e(dinamicTemplate);
            if (e2 != null) {
                a(dinamicTemplate, e2, System.nanoTime() - nanoTime);
                return e2;
            }
            DinamicTemplate f = f(dinamicTemplate);
            if (f != null) {
                a(dinamicTemplate, f, System.nanoTime() - nanoTime);
                return f;
            }
        }
        DinamicTemplate g2 = g(dinamicTemplate);
        a(dinamicTemplate, g2, System.nanoTime() - nanoTime);
        return g2;
    }

    public DinamicTemplate e(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("14401dea", new Object[]{this, dinamicTemplate});
        }
        if (!this.b.a(h(dinamicTemplate))) {
            return null;
        }
        DinamicTemplate dinamicTemplate2 = new DinamicTemplate();
        dinamicTemplate2.templateUrl = dinamicTemplate.templateUrl;
        dinamicTemplate2.name = dinamicTemplate.name;
        dinamicTemplate2.version = dinamicTemplate.version;
        return dinamicTemplate2;
    }

    public DinamicTemplate f(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicTemplate) ipChange.ipc$dispatch("d9720f49", new Object[]{this, dinamicTemplate}) : this.b.a(dinamicTemplate);
    }

    public DinamicTemplate g(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("9ea400a8", new Object[]{this, dinamicTemplate});
        }
        if (b(dinamicTemplate.name) > 0) {
            DinamicTemplate dinamicTemplate2 = new DinamicTemplate();
            dinamicTemplate2.name = dinamicTemplate.name;
            dinamicTemplate2.version = "";
            return dinamicTemplate2;
        } else if (!c(dinamicTemplate.name)) {
            return null;
        } else {
            DinamicTemplate dinamicTemplate3 = new DinamicTemplate();
            dinamicTemplate3.name = dinamicTemplate.name;
            dinamicTemplate3.version = "";
            return dinamicTemplate3;
        }
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (this.e != null && !TextUtils.isEmpty(str)) {
            Integer num = this.c.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.e.getResources().getIdentifier(str, "layout", this.e.getPackageName()));
                    this.c.put(str, num);
                } catch (Exception e) {
                    Log.e("DTemplateManager", "Get layout parser exception", e);
                }
            }
            if (num != null && num.intValue() != 0) {
                return num.intValue();
            }
        }
        return -1;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean bool = this.d.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        String str2 = str + ".xml";
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(e.b().getAssets(), this.h + "/" + str2);
            this.d.put(str, Boolean.valueOf(proxy_open != null));
            return proxy_open != null;
        } catch (IOException unused) {
            this.d.put(str, false);
            return false;
        }
    }

    public void a(CacheStrategy cacheStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45487055", new Object[]{this, cacheStrategy});
        } else {
            this.i = cacheStrategy;
        }
    }

    public void a(fpt.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40efab0", new Object[]{this, bVar});
        } else {
            this.b.a(bVar);
        }
    }

    public String h(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dbbe047", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        if (dinamicTemplate.isPreset()) {
            return dinamicTemplate.name;
        }
        return dinamicTemplate.name + "_" + dinamicTemplate.version;
    }

    public fps b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fps) ipChange.ipc$dispatch("16b65ab4", new Object[]{this}) : this.b;
    }

    private void a(final DinamicTemplate dinamicTemplate, final DinamicTemplate dinamicTemplate2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82436c8", new Object[]{this, dinamicTemplate, dinamicTemplate2, new Long(j)});
        } else if (com.taobao.android.dinamic.c.a().b() == null || !fpb.a()) {
        } else {
            fpb.f28086a.a(new Runnable() { // from class: com.taobao.android.dinamic.tempate.DTemplateManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (e.a()) {
                        fpa.a(e.TAG, "fetch exact template=origin template=" + dinamicTemplate + "exact template=" + dinamicTemplate2 + "consuming=" + (j / 1000000.0d));
                    }
                    com.taobao.android.dinamic.c.a().b().a(DTemplateManager.a(DTemplateManager.this), DTemplateManager.b(DTemplateManager.this), dinamicTemplate, dinamicTemplate2, j / 1000000.0d);
                }
            });
        }
    }
}
