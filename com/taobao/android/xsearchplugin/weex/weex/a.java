package com.taobao.android.xsearchplugin.weex.weex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.track.XSWeexRenderTrackEvent;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.taobao.R;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.component.list.WXCell;
import java.util.HashMap;
import java.util.Map;
import tb.imn;
import tb.imo;
import tb.itx;
import tb.jvm;
import tb.jzg;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a implements com.taobao.weex.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16270a;
    private final imn b;
    private d c;
    private Activity d;
    private InterfaceC0626a e;
    private d.a f;
    private int g;
    private h h;
    private long i;
    private String j;
    private boolean k;

    /* renamed from: com.taobao.android.xsearchplugin.weex.weex.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0626a {
        void a(d dVar);

        void a(d dVar, String str, String str2);

        void b(d dVar);
    }

    public abstract TemplateBean a(WeexBean weexBean);

    public abstract jvm.c a(String str);

    public abstract void a(d dVar);

    public abstract void a(WXSDKInstance wXSDKInstance);

    @Override // com.taobao.weex.c
    public void onCreate(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbed927", new Object[]{this, wXComponent});
        }
    }

    @Override // com.taobao.weex.c
    public void onPreDestory(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb808dc", new Object[]{this, wXComponent});
        }
    }

    @Override // com.taobao.weex.c
    public void onViewCreated(WXComponent wXComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9884402", new Object[]{this, wXComponent, view});
        }
    }

    public static /* synthetic */ long a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e61c419", new Object[]{aVar})).longValue() : aVar.i;
    }

    public static /* synthetic */ void a(a aVar, TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c6c8f3", new Object[]{aVar, templateBean, str, str2});
        } else {
            aVar.a(templateBean, str, str2);
        }
    }

    public static /* synthetic */ void a(a aVar, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbda8129", new Object[]{aVar, wXSDKInstance});
        } else {
            aVar.c(wXSDKInstance);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0bd843", new Object[]{aVar, str, str2, str3});
        } else {
            aVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ imn b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("6cdc0756", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void b(a aVar, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8beb48", new Object[]{aVar, wXSDKInstance});
        } else {
            aVar.b(wXSDKInstance);
        }
    }

    public static /* synthetic */ Activity c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2b49f961", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ InterfaceC0626a d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0626a) ipChange.ipc$dispatch("de1e94e", new Object[]{aVar}) : aVar.e;
    }

    static {
        kge.a(-2056919942);
        kge.a(1438393912);
        f16270a = false;
    }

    public a(Activity activity, imn imnVar, InterfaceC0626a interfaceC0626a, d.a aVar) {
        this.d = activity;
        this.b = imnVar;
        this.e = interfaceC0626a;
        this.f = aVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e64f2be", new Object[]{this, hVar});
        } else {
            this.h = hVar;
        }
    }

    public final imn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f060694", new Object[]{this}) : this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c != null;
    }

    public boolean a(WeexBean weexBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bbf77ae", new Object[]{this, weexBean, map})).booleanValue();
        }
        if (weexBean == null) {
            this.b.b().b("AbsWeexRender", "bean is null");
            return false;
        } else if (!d()) {
            this.b.b().b("AbsWeexRender", "state not legal");
            return false;
        } else {
            b(weexBean.type);
            if (jzg.a(this.b)) {
                String a2 = jzg.a(weexBean.type);
                if (!TextUtils.isEmpty(a2) && a2.startsWith("http")) {
                    a().b().d("AbsWeexRender", "使用测试模板进行");
                    return a(weexBean, map, a2);
                }
            }
            return c(weexBean, map);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tItemType", (Object) str);
        imn b = imo.b();
        if (b != null) {
            jSONObject.put("sversion", (Object) b.a().e());
        }
        AppMonitor.Counter.commit("tbsearch", "weex_card_usage", jSONObject.toString(), 1.0d);
    }

    private boolean c(WeexBean weexBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0a169ec", new Object[]{this, weexBean, map})).booleanValue();
        }
        if (weexBean == null) {
            this.b.b().b("AbsWeexRender", "render while WeexBean is null");
            return false;
        }
        final TemplateBean a2 = a(weexBean);
        if (f16270a && a2 != null && a2.url != null && a2.url.contains(".wlasm")) {
            return false;
        }
        if (this.b.e().a(a2)) {
            k b = this.b.b();
            b.b("AbsWeexRender", "illegal template：" + weexBean.type);
            this.b.o().d(XSWeexRenderTrackEvent.a(this.d, weexBean.type));
            return false;
        }
        String str = a2.url;
        final String fileName = a2.getFileName();
        itx itxVar = null;
        jvm.c a3 = a(a2.url);
        if (a3 != null) {
            if (a2.url != null && a2.binary) {
                itxVar = new itx(a3.a());
            } else {
                try {
                    itxVar = new itx(new String(a3.a()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (itxVar == null) {
            this.b.b().f("AbsWeexRender", "no template found");
            return false;
        }
        this.c = new d(this.d);
        this.c.a(a(this.d));
        this.c.a(this.e);
        this.c.a(this.f);
        this.c.a(this.h);
        a(this.c);
        this.c.a(new com.taobao.weex.d() { // from class: com.taobao.android.xsearchplugin.weex.weex.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - a.a(a.this);
                a.b(a.this).b().c("AbsWeexRender", "Weex render time: %d, fileName: %s", Long.valueOf(currentTimeMillis), fileName);
                a.b(a.this).o().d(XSWeexRenderTrackEvent.a(a.c(a.this), a2, currentTimeMillis));
                if (a.d(a.this) != null) {
                    a.d(a.this).a((d) wXSDKInstance);
                }
                if (!a2.cellBinary) {
                    return;
                }
                a.a(a.this, wXSDKInstance);
            }

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - a.a(a.this);
                a.b(a.this).b().c("AbsWeexRender", "Weex Refresh time: %d, fileName: %s", Long.valueOf(currentTimeMillis), fileName);
                a.b(a.this).o().d(XSWeexRenderTrackEvent.b(a.c(a.this), a2, currentTimeMillis));
                a.b(a.this, wXSDKInstance);
                if (a.d(a.this) == null) {
                    return;
                }
                a.d(a.this).b((d) wXSDKInstance);
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str2, str3});
                } else if (wXSDKInstance.L() == WXRenderStrategy.DATA_RENDER_BINARY && str3 != null && (str3.startsWith("jsc reboot") || str3.startsWith("jsc Crashed"))) {
                } else {
                    a.a(a.this, a2, str2, str3);
                    k b2 = a.b(a.this).b();
                    b2.b("AbsWeexRender", "Weex render error: " + fileName);
                    if (a.d(a.this) != null) {
                        a.d(a.this).a((d) wXSDKInstance, str2, str3);
                    }
                    a.b(a.this).o().d(XSWeexRenderTrackEvent.a(a.c(a.this), a2, str2, str3));
                }
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", str);
        hashMap.put("bundleName", weexBean.type);
        String a4 = this.b.e().a(map);
        this.b.b().c("AbsWeexRender", "RenderWeex type:%s, initData:%s", fileName, a4);
        this.i = System.currentTimeMillis();
        this.j = fileName;
        if (itxVar.a()) {
            this.c.a(str, itxVar.b, hashMap, a4 != null ? a4 : "", WXRenderStrategy.APPEND_ONCE);
        } else {
            d dVar = this.c;
            byte[] bArr = itxVar.f29316a;
            if (a4 == null) {
                a4 = "";
            }
            dVar.a(str, bArr, hashMap, a4);
        }
        return true;
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
        } else if (!a().a().c() || a().c().j().d) {
        } else {
            AlertDialog.Builder title = new AlertDialog.Builder(this.d).setPositiveButton("查看源码", new DialogInterface.OnClickListener() { // from class: com.taobao.android.xsearchplugin.weex.weex.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (!str4.endsWith(".wlasm")) {
                        Toast.makeText(a.c(a.this), "只支持Eagle", 0).show();
                    } else {
                        com.taobao.android.searchbaseframe.chitu.b.a(a.this.a(), a.c(a.this), str3, str4, "weex");
                    }
                }
            }).setNegativeButton(com.alibaba.ability.localization.b.a(R.string.app_sure), (DialogInterface.OnClickListener) null).setTitle("WeexError");
            title.setMessage(str + "\n------------\n\n" + str2 + "\n\n" + str3).show();
        }
    }

    public final WXSDKInstance c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("4566f2c8", new Object[]{this}) : this.c;
    }

    public boolean b(WeexBean weexBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a63070cd", new Object[]{this, weexBean, map})).booleanValue();
        }
        if (!d()) {
            this.b.b().b("AbsWeexRender", "weex refresh check failed");
            return false;
        } else if (this.c == null) {
            this.b.b().b("AbsWeexRender", "weexInstance is null，can't refresh");
            return false;
        } else {
            String a2 = this.b.e().a(map);
            k.e("AbsWeexRender", "initData: " + a2);
            this.i = System.currentTimeMillis();
            this.c.h(a2);
            return true;
        }
    }

    public RenderContainer a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContainer) ipChange.ipc$dispatch("c2864e81", new Object[]{this, context});
        }
        RenderContainer renderContainer = new RenderContainer(context);
        renderContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (this.g > 0) {
            renderContainer.getLayoutParams().height = this.g;
        }
        return renderContainer;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.b.b().b("AbsWeexRender", "activity is null");
            return false;
        } else if (this.e != null) {
            return true;
        } else {
            this.b.b().b("AbsWeexRender", "renderListener is null");
            return false;
        }
    }

    private boolean a(WeexBean weexBean, Map<String, Object> map, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359caf8", new Object[]{this, weexBean, map, str})).booleanValue();
        }
        if (weexBean == null) {
            this.b.b().b("AbsWeexRender", "render while WeexBean is null");
            return false;
        }
        this.k = true;
        this.c = new d(this.d);
        this.c.a(a(this.d));
        this.c.a(this.e);
        this.c.a(this.f);
        this.c.a(this.h);
        a(this.c);
        this.c.a(new com.taobao.weex.d() { // from class: com.taobao.android.xsearchplugin.weex.weex.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                if (a.d(a.this) != null) {
                    a.d(a.this).a((d) wXSDKInstance);
                }
                a.a(a.this, wXSDKInstance);
            }

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                a.b(a.this, wXSDKInstance);
                if (a.d(a.this) == null) {
                    return;
                }
                a.d(a.this).b((d) wXSDKInstance);
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str2, str3});
                } else if (wXSDKInstance.L() == WXRenderStrategy.DATA_RENDER_BINARY && str3 != null && (str3.startsWith("jsc reboot") || str3.startsWith("jsc Crashed"))) {
                } else {
                    a.a(a.this, str, str2, str3);
                    k b = a.b(a.this).b();
                    b.b("AbsWeexRender", "Weex render error: " + str);
                    if (a.d(a.this) == null) {
                        return;
                    }
                    a.d(a.this).a((d) wXSDKInstance, str2, str3);
                }
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", "/search_dev_test");
        hashMap.put("bundleName", weexBean.type);
        String a2 = this.b.e().a(map);
        k.e("AbsWeexRender", "initData: " + a2);
        WXRenderStrategy wXRenderStrategy = WXRenderStrategy.APPEND_ONCE;
        this.j = str;
        d dVar = this.c;
        if (a2 == null) {
            a2 = "";
        }
        dVar.c("/search_dev_test", str, hashMap, a2, wXRenderStrategy);
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View] */
    private void b(WXSDKInstance wXSDKInstance) {
        WXVContainer wXVContainer;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ac8e5", new Object[]{this, wXSDKInstance});
        } else if (wXSDKInstance == null || (wXVContainer = (WXVContainer) wXSDKInstance.z()) == null) {
        } else {
            a(wXVContainer);
            ?? hostView = wXVContainer.mo1286getHostView();
            if (hostView == 0 || (layoutParams = hostView.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = -2;
            hostView.requestLayout();
        }
    }

    private void c(WXSDKInstance wXSDKInstance) {
        WXVContainer wXVContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9a0144", new Object[]{this, wXSDKInstance});
        } else if (wXSDKInstance == null || (wXVContainer = (WXVContainer) wXSDKInstance.z()) == null || wXVContainer.getChildCount() <= 0) {
        } else {
            WXCell child = wXVContainer.getChild(0);
            if (!(child instanceof WXCell)) {
                return;
            }
            WXCell wXCell = child;
            if (wXCell.getRealView() == null) {
                wXCell.lazy(false);
                wXCell.createView();
                wXCell.applyLayoutAndEvent(wXCell);
                wXCell.bindData(wXCell);
            }
            wXVContainer.addSubView(wXCell.getHostView(), 0);
        }
    }

    private void a(WXVContainer wXVContainer) {
        WXComponent child;
        View mo1286getHostView;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6267fbdb", new Object[]{this, wXVContainer});
        } else if (wXVContainer.getChildCount() <= 0 || (child = wXVContainer.getChild(0)) == null || (mo1286getHostView = child.mo1286getHostView()) == null || (layoutParams = mo1286getHostView.getLayoutParams()) == null) {
        } else {
            layoutParams.height = -2;
        }
    }

    public int e() {
        WXVContainer wXVContainer;
        WXComponent child;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        d dVar = this.c;
        if (dVar != null && (wXVContainer = (WXVContainer) dVar.z()) != null && wXVContainer.getChildCount() > 0 && (child = wXVContainer.getChild(0)) != null) {
            return (int) child.getLayoutHeight();
        }
        return -1;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        if (!dVar.P_()) {
            this.c.e();
        }
        a((WXSDKInstance) this.c);
        this.c = null;
    }

    public void a(ViewGroup viewGroup, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d0d467", new Object[]{this, viewGroup, wXSDKInstance});
        } else {
            a(viewGroup, wXSDKInstance, true);
        }
    }

    public void a(ViewGroup viewGroup, WXSDKInstance wXSDKInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14a6b4d", new Object[]{this, viewGroup, wXSDKInstance, new Boolean(z)});
            return;
        }
        k b = a().b();
        b.f("AbsWeexRender", "Weex Render success: " + this.j);
        if (viewGroup == null) {
            a().b().b("AbsWeexRender", "frameContainer is null");
        } else if (wXSDKInstance == null) {
            a().b().b("AbsWeexRender", "wxInstance is null");
        } else {
            View am = wXSDKInstance.am();
            if (am == null) {
                a().b().b("AbsWeexRender", "renderContainer is null");
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) am.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(am);
            }
            if (z) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(am);
            if (!a().c().j().f29272a || !a().a().c() || Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (this.k) {
                viewGroup.setForeground(new com.taobao.android.searchbaseframe.uikit.c("本地Dev", -16758088, 25));
            } else {
                viewGroup.setForeground(new com.taobao.android.searchbaseframe.uikit.c(this.j, -16758088, 25));
            }
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.onActivityResume();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.onActivityPause();
    }

    public void i() {
        WXComponent z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null || (z = dVar.z()) == null) {
            return;
        }
        this.c.a(z.getRef(), "appear", (Map<String, Object>) null, (Map<String, Object>) null);
    }

    public void j() {
        WXComponent z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null || (z = dVar.z()) == null) {
            return;
        }
        this.c.a(z.getRef(), "disappear", (Map<String, Object>) null, (Map<String, Object>) null);
    }
}
