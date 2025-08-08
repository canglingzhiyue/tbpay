package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.b;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.track.XSWeexRenderTrackEvent;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.imn;
import tb.irg;
import tb.itx;
import tb.jvm;
import tb.jzg;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_WIDGET_CONTEXT = "widgetContext";

    /* renamed from: a  reason: collision with root package name */
    private final imn f16253a;
    private com.taobao.android.weex_framework.p b;
    private Activity c;
    private com.taobao.android.weex_framework.g d;
    private k e;
    private com.taobao.android.xsearchplugin.weex.weex.h f;
    private long g;
    private String h;
    private boolean i;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Float p;
    private l q;
    private irg r;
    private Context u;
    private int j = -1;
    private boolean s = true;
    private boolean t = true;

    static {
        kge.a(1482008738);
    }

    public abstract TemplateBean a(MuiseBean muiseBean);

    public abstract jvm.c c(String str);

    public abstract void c(com.taobao.android.weex_framework.p pVar);

    public abstract void d();

    public static /* synthetic */ com.taobao.android.weex_framework.g a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.g) ipChange.ipc$dispatch("bc472507", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87bfa755", new Object[]{aVar, str});
        }
        aVar.l = str;
        return str;
    }

    public static /* synthetic */ void a(a aVar, TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c718ef", new Object[]{aVar, templateBean, str, str2});
        } else {
            aVar.a(templateBean, str, str2);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe38d43f", new Object[]{aVar, str, str2, str3});
        } else {
            aVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ boolean a(a aVar, Map map, TemplateBean templateBean, String str, itx itxVar, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea469ba8", new Object[]{aVar, map, templateBean, str, itxVar, str2, str3, new Integer(i)})).booleanValue() : aVar.a(map, templateBean, str, itxVar, str2, str3, i);
    }

    public static /* synthetic */ long b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5170fb56", new Object[]{aVar})).longValue() : aVar.g;
    }

    public static /* synthetic */ irg c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irg) ipChange.ipc$dispatch("69671ae5", new Object[]{aVar}) : aVar.r;
    }

    public static /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b18f13c", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ int e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1df6e18", new Object[]{aVar})).intValue() : aVar.j;
    }

    public static /* synthetic */ imn f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("b7b984d6", new Object[]{aVar}) : aVar.f16253a;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9cd3baab", new Object[]{aVar})).booleanValue() : aVar.s;
    }

    public static /* synthetic */ Activity h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("768f1ac0", new Object[]{aVar}) : aVar.c;
    }

    public a(Activity activity, imn imnVar, com.taobao.android.weex_framework.g gVar, com.taobao.android.xsearchplugin.weex.weex.h hVar) {
        this.c = activity;
        this.f16253a = imnVar;
        this.d = gVar;
        this.f = hVar;
        Activity activity2 = this.c;
        if (activity2 instanceof irg) {
            this.r = (irg) activity2;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void a(com.taobao.android.xsearchplugin.weex.weex.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e64f2be", new Object[]{this, hVar});
            return;
        }
        this.f = hVar;
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.setTag(SFMuiseSDK.MUISE_EVENT_LISTENER, this.f);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.u = context;
        }
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : this.c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfb60d7", new Object[]{this, kVar});
        } else {
            this.e = kVar;
        }
    }

    public final imn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("16b7abf3", new Object[]{this}) : this.f16253a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b != null;
    }

    public void b(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194dea44", new Object[]{this, pVar});
            return;
        }
        this.b = pVar;
        com.taobao.android.weex_framework.p pVar2 = this.b;
        if (pVar2 == null) {
            return;
        }
        pVar2.setTag(SFMuiseSDK.MUISE_EVENT_LISTENER, this.f);
        k kVar = this.e;
        if (kVar != null) {
            kVar.a(this.b);
        }
        c(this.b);
        l lVar = this.q;
        if (lVar != null) {
            this.b.setTag(KEY_WIDGET_CONTEXT, lVar);
        }
        this.b.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.taobao.android.xsearchplugin.muise.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(com.taobao.android.weex_framework.p pVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar3});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).onForeground(pVar3);
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar3});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).onPrepareSuccess(pVar3);
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(com.taobao.android.weex_framework.p pVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar3});
                    return;
                }
                System.currentTimeMillis();
                a.b(a.this);
                if (a.a(a.this) == null) {
                    return;
                }
                a.a(a.this).onRenderSuccess(pVar3);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(com.taobao.android.weex_framework.p pVar3, int i, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar3, new Integer(i), str, new Boolean(z)});
                    return;
                }
                a(pVar3, String.valueOf(i), str);
                if (a.a(a.this) != null) {
                    a.a(a.this).onRenderFailed(pVar3, i, str, z);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str);
                a.c(a.this).a("MuiseRender", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar3});
                    return;
                }
                System.currentTimeMillis();
                a.b(a.this);
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise refresh] Success, tItemType: %s, to index: %d", a.d(a.this), Integer.valueOf(a.e(a.this)));
                if (a.a(a.this) == null) {
                    return;
                }
                a.a(a.this).onRefreshSuccess(pVar3);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(com.taobao.android.weex_framework.p pVar3, int i, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar3, new Integer(i), str, new Boolean(z)});
                    return;
                }
                a(pVar3, String.valueOf(i), str);
                com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise refresh] Failed, tItemType: %s, to index: %d, error: %s", a.d(a.this), Integer.valueOf(a.e(a.this)), str);
                if (a.a(a.this) != null) {
                    a.a(a.this).onRefreshFailed(pVar3, i, str, z);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str);
                a.c(a.this).a("MuiseRefresh", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(com.taobao.android.weex_framework.p pVar3, int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar3, new Integer(i), str});
                    return;
                }
                a(pVar3, String.valueOf(i), str);
                if (a.a(a.this) != null) {
                    a.a(a.this).onJSException(pVar3, i, str);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str);
                a.c(a.this).a("JSException", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(com.taobao.android.weex_framework.p pVar3, int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar3, new Integer(i), str});
                    return;
                }
                a(pVar3, String.valueOf(i), str);
                if (a.a(a.this) != null) {
                    a.a(a.this).onFatalException(pVar3, i, str);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str);
                a.c(a.this).a("FatalException", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).onDestroyed(mUSDKInstance);
                }
            }

            public void a(com.taobao.android.weex_framework.p pVar3, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e16fbb9", new Object[]{this, pVar3, str, str2});
                    return;
                }
                com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise error] tItemType: %s, index: %d, errorCode: %s, error: %s", a.d(a.this), Integer.valueOf(a.e(a.this)), str, str2);
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str2);
                hashMap.put("errCode", str);
                a.c(a.this).a("RenderException", hashMap);
            }
        });
    }

    public boolean a(MuiseBean muiseBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbefdc8", new Object[]{this, muiseBean, map})).booleanValue();
        }
        if (muiseBean == null) {
            this.f16253a.b().b("AbsMuiseRender", "bean is null");
            return false;
        } else if (!f()) {
            this.f16253a.b().b("AbsMuiseRender", "state not legal");
            return false;
        } else {
            if (!this.k) {
                d();
                this.k = true;
            }
            if (jzg.a(this.f16253a)) {
                String a2 = jzg.a(muiseBean.type);
                if (!StringUtils.isEmpty(a2) && a2.startsWith("http")) {
                    b().b().d("AbsMuiseRender", "使用测试模板进行");
                    return a(muiseBean, map, a2);
                }
            }
            return c(muiseBean, map);
        }
    }

    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfbd536", new Object[]{this, lVar});
        } else {
            this.q = lVar;
        }
    }

    private boolean c(MuiseBean muiseBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("531b534a", new Object[]{this, muiseBean, map})).booleanValue();
        }
        if (muiseBean == null) {
            this.f16253a.b().b("AbsMuiseRender", "render while MuiseBean is null");
            return false;
        }
        TemplateBean a2 = a(muiseBean);
        if (this.f16253a.e().a(a2)) {
            com.taobao.android.searchbaseframe.util.k b = this.f16253a.b();
            b.b("AbsMuiseRender", "illegal template：" + muiseBean.type);
            this.f16253a.o().d(XSWeexRenderTrackEvent.a(this.c, muiseBean.type));
            com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise render] Error before render called: tItemType: %s, index: %d, error: template miss, server did not return template data or template data format invalid", muiseBean.type, Integer.valueOf(this.j));
            com.taobao.android.weex_framework.r rVar = new com.taobao.android.weex_framework.r();
            rVar.a(this.n);
            rVar.c(muiseBean.type);
            rVar.b(this.o);
            rVar.d(a2 == null ? "null" : a2.url);
            MUSAppMonitor.a(rVar, a2 == null ? "no template from server" : "template invalid");
            return false;
        }
        this.l = a2.templateName;
        this.m = a2.version;
        String fileName = a2.getFileName();
        jvm.c c = c(a2.url);
        if (c == null) {
            jvm.c c2 = c("prebuild://" + a2.templateName);
            if (c2 != null) {
                com.taobao.android.searchbaseframe.util.k.e("[XS.render]", "[Muise render] Using preBuild template, tItemType: %s index: %d, version: %s", muiseBean.type, Integer.valueOf(this.j), this.m);
                c = c2;
            }
        }
        if (c == null) {
            com.taobao.android.weex_framework.r rVar2 = new com.taobao.android.weex_framework.r();
            rVar2.a(this.n);
            rVar2.c(muiseBean.type);
            rVar2.b(this.o);
            rVar2.d(a2.url);
            MUSAppMonitor.a(rVar2, "not download");
            com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise render] Error before render called: tItemType: %s, index: %d, error: template file lost, download failed or cache lost. check if template cdn url/md5 is correct. template: %s", muiseBean.type, Integer.valueOf(this.j), a2);
            return false;
        }
        itx itxVar = new itx(c.a());
        itxVar.c = c.c();
        com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise render] Render called, tItemType: %s index: %d, version: %s", muiseBean.type, Integer.valueOf(this.j), this.m);
        return a(map, a2, fileName, itxVar, muiseBean.type, a2.version, this.j);
    }

    private boolean a(Map<String, Object> map, final TemplateBean templateBean, final String str, itx itxVar, String str2, String str3, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f248bef", new Object[]{this, map, templateBean, str, itxVar, str2, str3, new Integer(i)})).booleanValue();
        }
        if (itxVar.f29316a == null) {
            this.f16253a.b().a("AbsMuiseRender", "Muise template null", new Object[0]);
            return false;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.i(this.f16253a.c().j().j);
        Float f = this.p;
        if (f != null) {
            mUSInstanceConfig.a(f.floatValue());
        }
        Context context = this.u;
        if (context != null) {
            this.b = s.a(context, this.f, mUSInstanceConfig);
        } else {
            this.b = s.a(this.c, this.f, mUSInstanceConfig);
        }
        k kVar = this.e;
        if (kVar != null) {
            kVar.a(this.b);
        }
        c(this.b);
        this.b.setTag(SFMuiseSDK.MUISE_BUNDLE_TYPE, templateBean.getFileName());
        l lVar = this.q;
        if (lVar != null) {
            this.b.setTag(KEY_WIDGET_CONTEXT, lVar);
        }
        this.b.registerRenderListener(this.d);
        String str4 = this.n;
        if (str4 == null) {
            str4 = templateBean.url;
        }
        this.b.addInstanceEnv("bundleUrl", str4);
        com.taobao.android.weex_framework.r monitorInfo = this.b.getMonitorInfo();
        monitorInfo.a(this.n);
        monitorInfo.c(this.l);
        monitorInfo.b(this.o);
        monitorInfo.d(templateBean.url);
        monitorInfo.b(itxVar.c);
        this.b.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.taobao.android.xsearchplugin.muise.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(com.taobao.android.weex_framework.p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).onForeground(pVar);
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).onPrepareSuccess(pVar);
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - a.b(a.this);
                a.f(a.this).b().c("AbsMuiseRender", "Muise render time: %d, fileName: %s", Long.valueOf(currentTimeMillis), str);
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise render] Success, tItemType: %s, index: %d", a.d(a.this), Integer.valueOf(i));
                if (a.g(a.this)) {
                    a.f(a.this).o().d(XSWeexRenderTrackEvent.a(a.h(a.this), templateBean, currentTimeMillis));
                }
                if (a.a(a.this) == null) {
                    return;
                }
                a.a(a.this).onRenderSuccess(pVar);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i2, String str5, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i2), str5, new Boolean(z)});
                    return;
                }
                a(pVar, String.valueOf(i2), str5);
                com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise render] Failed, tItemType: %s, index: %d, error: %s", a.d(a.this), Integer.valueOf(i), str5);
                if (a.a(a.this) != null) {
                    a.a(a.this).onRenderFailed(pVar, i2, str5, z);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str5);
                a.c(a.this).a("MuiseRender", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - a.b(a.this);
                a.f(a.this).b().c("AbsMuiseRender", "Muise Refresh time: %d, fileName: %s", Long.valueOf(currentTimeMillis), str);
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise refresh] Success, tItemType: %s, to index: %d", a.d(a.this), Integer.valueOf(a.e(a.this)));
                if (a.g(a.this)) {
                    a.f(a.this).o().d(XSWeexRenderTrackEvent.b(a.h(a.this), templateBean, currentTimeMillis));
                }
                if (a.a(a.this) == null) {
                    return;
                }
                a.a(a.this).onRefreshSuccess(pVar);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i2, String str5, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i2), str5, new Boolean(z)});
                    return;
                }
                a(pVar, String.valueOf(i2), str5);
                com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise refresh] Failed, tItemType: %s, to index: %d, error: %s", a.d(a.this), Integer.valueOf(a.e(a.this)), str5);
                if (a.a(a.this) != null) {
                    a.a(a.this).onRefreshFailed(pVar, i2, str5, z);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str5);
                a.c(a.this).a("MuiseRefresh", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(com.taobao.android.weex_framework.p pVar, int i2, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i2), str5});
                    return;
                }
                a(pVar, String.valueOf(i2), str5);
                if (a.a(a.this) != null) {
                    a.a(a.this).onJSException(pVar, i2, str5);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str5);
                a.c(a.this).a("JSException", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(com.taobao.android.weex_framework.p pVar, int i2, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i2), str5});
                    return;
                }
                a(pVar, String.valueOf(i2), str5);
                if (a.a(a.this) != null) {
                    a.a(a.this).onFatalException(pVar, i2, str5);
                }
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str5);
                a.c(a.this).a("FatalException", hashMap);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).onDestroyed(mUSDKInstance);
                }
            }

            public void a(com.taobao.android.weex_framework.p pVar, String str5, String str6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e16fbb9", new Object[]{this, pVar, str5, str6});
                    return;
                }
                a.a(a.this, templateBean, str5, str6);
                com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise error] tItemType: %s, index: %d, errorCode: %s, error: %s", a.d(a.this), Integer.valueOf(a.e(a.this)), str5, str6);
                a.f(a.this).o().d(XSWeexRenderTrackEvent.a(a.h(a.this), templateBean, str5, str6));
                if (a.c(a.this) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", a.d(a.this));
                hashMap.put("index", String.valueOf(a.e(a.this)));
                hashMap.put("errMsg", str6);
                hashMap.put("errCode", str5);
                a.c(a.this).a("RenderException", hashMap);
            }
        });
        JSONObject b = this.f16253a.e().b(map);
        this.f16253a.b().c("AbsMuiseRender", "Muise type:%s, initData:%s", str, map);
        if (this.f16253a.a().c()) {
            this.b.setTag("renderData", b);
        }
        this.g = System.currentTimeMillis();
        this.h = str;
        this.b.prepare(itxVar.f29316a, null);
        Float f2 = this.p;
        if (f2 != null) {
            this.b.updateBaseFontSize(f2.floatValue());
        }
        this.b.render(b, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) templateBean.url);
        jSONObject.put("bundleUrl", (Object) str4);
        this.b.addInstanceEnv("instanceInfo", jSONObject.toJSONString());
        return true;
    }

    public boolean a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11e8b529", new Object[]{this, pVar})).booleanValue();
        }
        if (!this.f16253a.c().j().q || pVar == null) {
            return false;
        }
        return pVar.isDestroyed() || this.c.isFinishing();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    private void a(TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5de41f6", new Object[]{this, templateBean, str, str2});
        } else {
            a(templateBean.toPrintString(), str, str2, templateBean.url);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        a("LocalDev: \n  " + str, str2, str3, str);
    }

    private void a(String str, String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (!b().a().c() || b().c().j().d || !com.taobao.android.weex_framework.m.c()) {
        } else {
            AlertDialog.Builder title = new AlertDialog.Builder(this.c).setPositiveButton("查看源码", new DialogInterface.OnClickListener() { // from class: com.taobao.android.xsearchplugin.muise.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        com.taobao.android.searchbaseframe.chitu.b.a(a.this.b(), a.h(a.this), str3, str4, "muise");
                    }
                }
            }).setNegativeButton(com.alibaba.ability.localization.b.a(R.string.app_sure), (DialogInterface.OnClickListener) null).setTitle("MuiseError(Debug包)");
            title.setMessage(str + "\n------------\n\n" + str2 + "\n\n" + str3).show();
        }
    }

    public void a(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f847471", new Object[]{this, f});
        } else {
            this.p = f;
        }
    }

    public final com.taobao.android.weex_framework.p e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.p) ipChange.ipc$dispatch("b30991e9", new Object[]{this}) : this.b;
    }

    public boolean b(MuiseBean muiseBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f6d2889", new Object[]{this, muiseBean, map})).booleanValue();
        }
        if (!f()) {
            this.f16253a.b().b("AbsMuiseRender", "muise refresh check failed");
            return false;
        } else if (this.b == null) {
            this.f16253a.b().b("AbsMuiseRender", "muiseInstance is null，can't refresh");
            return false;
        } else {
            if (this.f16253a.c().j().h && this.t) {
                com.taobao.android.searchbaseframe.util.t.a(this.b.getRenderRoot());
            }
            JSONObject b = this.f16253a.e().b(map);
            if (this.i) {
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise refresh] Refresh called, tItemType: %s, to index: %d, localUrl: %s", muiseBean.type, Integer.valueOf(this.j), this.h);
            } else {
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise refresh] Refresh called, tItemType: %s, to index: %d, version: %s", muiseBean.type, Integer.valueOf(this.j), this.m);
            }
            this.g = System.currentTimeMillis();
            ScreenType.a(this.b);
            this.b.refresh(b, null);
            return true;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.f16253a.b().b("AbsMuiseRender", "activity is null");
            return false;
        } else if (this.d != null) {
            return true;
        } else {
            this.f16253a.b().b("AbsMuiseRender", "renderListener is null");
            return false;
        }
    }

    private boolean a(final MuiseBean muiseBean, final Map<String, Object> map, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1411be92", new Object[]{this, muiseBean, map, str})).booleanValue();
        }
        if (muiseBean == null) {
            this.f16253a.b().b("AbsMuiseRender", "render while MuiseBean is null");
            return false;
        }
        this.i = true;
        com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise render] Render called, tItemType: %s index: %d, localUrl: %s", muiseBean.type, Integer.valueOf(this.j), str);
        final int i = this.j;
        com.taobao.android.searchbaseframe.net.b.a(this.f16253a, new com.taobao.android.searchbaseframe.net.a(str), new b.AbstractC0575b() { // from class: com.taobao.android.xsearchplugin.muise.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.net.b.AbstractC0575b
            public void a(com.taobao.android.searchbaseframe.net.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("828c1bf2", new Object[]{this, eVar});
                } else if (eVar.b()) {
                    a aVar = a.this;
                    String str2 = str;
                    a.a(aVar, str2, "" + eVar.c().getCode(), eVar.c().getMsg());
                } else {
                    TemplateBean templateBean = new TemplateBean();
                    templateBean.binary = true;
                    templateBean.url = str;
                    templateBean.version = "0";
                    templateBean.templateName = muiseBean.type;
                    itx itxVar = new itx(eVar.a());
                    a.a(a.this, muiseBean.type);
                    a aVar2 = a.this;
                    Map map2 = map;
                    a.a(aVar2, map2, templateBean, templateBean.getFileName() + "_local", itxVar, muiseBean.type, templateBean.version, i);
                }
            }
        });
        return true;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.destroy();
        this.b = null;
    }

    public void a(ViewGroup viewGroup, com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb9cc46", new Object[]{this, viewGroup, pVar});
        } else {
            a(viewGroup, pVar, true);
        }
    }

    public void a(ViewGroup viewGroup, com.taobao.android.weex_framework.p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a806f4e", new Object[]{this, viewGroup, pVar, new Boolean(z)});
        } else {
            a(viewGroup, pVar, z, -1, -2);
        }
    }

    public void a(ViewGroup viewGroup, com.taobao.android.weex_framework.p pVar, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac30342e", new Object[]{this, viewGroup, pVar, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.android.searchbaseframe.util.k b = b().b();
        b.f("AbsMuiseRender", "Muise Render success: " + this.h);
        if (viewGroup == null) {
            b().b().b("AbsMuiseRender", "frameContainer is null");
        } else if (pVar == null) {
            b().b().b("AbsMuiseRender", "MUSInstance is null");
        } else if (pVar.isDestroyed()) {
        } else {
            View renderRoot = pVar.getRenderRoot();
            com.taobao.android.searchbaseframe.util.t.a(renderRoot);
            if (z) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(renderRoot, i, i2);
            if (!b().c().j().f29272a || !b().a().c() || Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (this.i) {
                viewGroup.setForeground(new com.taobao.android.searchbaseframe.uikit.c("本地Dev, instId: " + pVar.getInstanceId(), -13261794, 25));
                return;
            }
            viewGroup.setForeground(new com.taobao.android.searchbaseframe.uikit.c(this.h + ", instId: " + pVar.getInstanceId(), -13261794, 25));
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStart();
        this.b.onActivityResume();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.onActivityPause();
        this.b.onActivityStop();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage("appear", null);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage("disappear", null);
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return 0;
        }
        return pVar.getRootHeight();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.i;
    }
}
