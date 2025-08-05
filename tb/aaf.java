package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.template.b;
import com.alibaba.android.ultron.vfw.template.c;
import com.alibaba.android.ultron.vfw.template.f;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0007JJ\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0003J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\nH\u0007J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\nH\u0007J \u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0007J\"\u0010#\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020\fH\u0003J \u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0007J\b\u0010'\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/alibaba/android/icart/core/performance/dx/CartDXPreRender;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "alreadyPreRenderTemplates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "dxEngines", "Landroid/content/Context;", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "hasDXRegister", "", "pendingTemplate", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "destroy", "", "context", "doPreRender", "dxEngine", "template", "data", "Lcom/alibaba/fastjson/JSONObject;", "position", "", "repeatCount", "forcePreRender", "onDXEngineCreated", "onDXRegisterFinished", tbt.PRE_RENDER, "cartPresenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "components", "", "Lcom/taobao/android/ultron/common/model/IDMComponent;", "prefetchComponent", "component", "isPreRender", "prefetchComponents", "skipDXButter", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class aaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aaf INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25173a;
    private static final ConcurrentHashMap<Context, bd> b;
    private static final ConcurrentHashMap<String, Long> c;
    private static final ConcurrentHashMap<String, DXTemplateItem> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25174a;
        public final /* synthetic */ bd b;

        public a(Context context, bd bdVar) {
            this.f25174a = context;
            this.b = bdVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                jqg.b("CartDXPreRender", "onDXRegisterFinished");
                aaf.a(aaf.INSTANCE, true);
                Iterator it = aaf.a(aaf.INSTANCE).entrySet().iterator();
                while (it.hasNext()) {
                    DXTemplateItem dXTemplateItem = (DXTemplateItem) ((Map.Entry) it.next()).getValue();
                    String str = dXTemplateItem.f11925a;
                    q.b(str, "template.name");
                    aaf.a(aaf.INSTANCE, this.f25174a, this.b, dXTemplateItem, null, -1, aad.a(str), false);
                    it.remove();
                }
            } catch (Throwable th) {
                jpu c = jpu.a("Ultron").c("CartDXPreRender");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c.b(message));
            }
        }
    }

    static {
        kge.a(1710503730);
        INSTANCE = new aaf();
        b = new ConcurrentHashMap<>();
        c = new ConcurrentHashMap<>();
        d = new ConcurrentHashMap<>();
    }

    private aaf() {
    }

    public static final /* synthetic */ ConcurrentHashMap a(aaf aafVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("982b3ed4", new Object[]{aafVar}) : d;
    }

    public static final /* synthetic */ void a(aaf aafVar, Context context, bd bdVar, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e8831d", new Object[]{aafVar, context, bdVar, dXTemplateItem, jSONObject, new Integer(i), new Integer(i2), new Boolean(z)});
        } else {
            aafVar.a(context, bdVar, dXTemplateItem, jSONObject, i, i2, z);
        }
    }

    public static final /* synthetic */ void a(aaf aafVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14888442", new Object[]{aafVar, new Boolean(z)});
        } else {
            f25173a = z;
        }
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !akg.b() || !aad.INSTANCE.a();
    }

    @JvmStatic
    public static final void a(Context context, bd dxEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd794b9a", new Object[]{context, dxEngine});
            return;
        }
        q.d(dxEngine, "dxEngine");
        if (INSTANCE.a() || context == null) {
            return;
        }
        jqg.b("CartDXPreRender", "onDXEngineCreated");
        b.put(context, dxEngine);
    }

    @JvmStatic
    public static final void b(Context context, bd dxEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b7bb39", new Object[]{context, dxEngine});
            return;
        }
        q.d(context, "context");
        q.d(dxEngine, "dxEngine");
        if (INSTANCE.a()) {
            return;
        }
        jqh.a(new a(context, dxEngine));
    }

    @JvmStatic
    public static final void b(bbz cartPresenter, List<? extends IDMComponent> list) {
        int a2;
        bny p;
        bob e;
        JSONObject containerInfo;
        DXTemplateItem a3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6b45d0", new Object[]{cartPresenter, list});
            return;
        }
        q.d(cartPresenter, "cartPresenter");
        if (list == null || INSTANCE.a() || (a2 = spk.a("iCart", "preRenderBodyCount", 10)) <= 0) {
            return;
        }
        jqg.b("CartDXPreRender", "preRender with real data");
        bez x = cartPresenter.x();
        if (x == null || (p = x.p()) == null || (e = p.e()) == null) {
            return;
        }
        for (IDMComponent iDMComponent : list) {
            if (i >= a2) {
                return;
            }
            JSONObject data = iDMComponent.getData();
            if (data != null && iDMComponent.isNormalComponent() && (containerInfo = iDMComponent.getContainerInfo()) != null && (a3 = ipm.a(containerInfo)) != null) {
                aaf aafVar = INSTANCE;
                Activity m = cartPresenter.m();
                q.b(m, "cartPresenter.context");
                bd a4 = e.a();
                q.b(a4, "engine.dxEngine");
                aafVar.a(m, a4, a3, iDMComponent.getData(), i, 1, true);
                String string = data.getString("position");
                if (!q.a((Object) "footer", (Object) string) && !q.a((Object) "header", (Object) string) && !q.a((Object) "tabCard", (Object) data.getString("tag"))) {
                    i++;
                }
            }
        }
    }

    private final void a(Context context, bd bdVar, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a531c7", new Object[]{this, context, bdVar, dXTemplateItem, jSONObject, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        String f = dXTemplateItem.f();
        if (f == null) {
            return;
        }
        if (!z) {
            long g = dXTemplateItem.g();
            Long l = c.get(f);
            if (l != null && g == l.longValue()) {
                return;
            }
        }
        DXTemplateItem a2 = bdVar.a(dXTemplateItem);
        if (a2 == null) {
            a2 = dXTemplateItem;
        }
        a2.l = aag.Companion.a(a2);
        if (!a2.l || i2 == 0) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            if (i3 != 0) {
                a2 = adq.a(a2);
            }
            DXTemplateItem dXTemplateItem2 = a2;
            if (jSONObject != null) {
                DinamicXEngine d2 = bdVar.d();
                if (d2 != null) {
                    d2.b(context, dXTemplateItem2, jSONObject, i, new DXRenderOptions.a().a((Object) new LinkedHashMap()).a());
                }
            } else {
                bdVar.a(context, dXTemplateItem2, jSONObject, i, new DXRenderOptions.a().a((Object) new LinkedHashMap()).a());
            }
            i3++;
            a2 = dXTemplateItem2;
        }
        c.put(f, Long.valueOf(dXTemplateItem.g()));
        jqg.b("CartDXPreRender", "preRender：" + a2 + ",预渲染个数：" + i2 + ",butter：" + a2.l);
    }

    @JvmStatic
    public static final void a(Context context) {
        DinamicXEngine d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                bd remove = b.remove(context);
                if (remove == null || (d2 = remove.d()) == null) {
                    return;
                }
                d2.o();
            } catch (Throwable th) {
                jpu c2 = jpu.a("Ultron").c("CartDXPreRender");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c2.b(message));
            }
        }
    }

    @Deprecated(message = "老逻辑，如果验证DX Butter有效，则后面可以下线")
    @JvmStatic
    public static final void a(bbz cartPresenter, List<? extends IDMComponent> list) {
        int a2;
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61b614f", new Object[]{cartPresenter, list});
            return;
        }
        q.d(cartPresenter, "cartPresenter");
        if (list == null || aad.INSTANCE.a() || (a2 = spk.a("iCart", "preRenderBodyCount", 10)) <= 0) {
            return;
        }
        jqg.b("CartDXPreRender", "prefetchComponents");
        HashMap hashMap = new HashMap();
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && (data = iDMComponent.getData()) != null && iDMComponent.isNormalComponent()) {
                String string = data.getString("position");
                if (q.a((Object) "footer", (Object) string) || q.a((Object) "header", (Object) string) || q.a((Object) "tabCard", (Object) data.getString("tag"))) {
                    INSTANCE.a(cartPresenter, iDMComponent, true);
                } else if (a2 > 0) {
                    String templateName = iDMComponent.getContainerInfo() != null ? iDMComponent.getContainerInfo().getString("name") : "";
                    if (!TextUtils.isEmpty(templateName)) {
                        INSTANCE.a(cartPresenter, iDMComponent, hashMap.get(templateName) == null);
                        q.b(templateName, "templateName");
                        hashMap.put(templateName, true);
                        a2--;
                    }
                }
            }
        }
    }

    @Deprecated(message = "老逻辑，如果验证DX Butter有效，则后面可以下线")
    private final void a(bbz bbzVar, IDMComponent iDMComponent, boolean z) {
        bny p;
        Map<String, Object> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ead7de", new Object[]{this, bbzVar, iDMComponent, new Boolean(z)});
        } else if (iDMComponent == null || iDMComponent.getContainerInfo() == null || iDMComponent.getData() == null) {
        } else {
            bez x = bbzVar.x();
            q.b(x, "cartPresenter.viewManager");
            bny p2 = x.p();
            q.b(p2, "cartPresenter.viewManager.viewEngine");
            String string = iDMComponent.getContainerInfo().getString("name");
            c a2 = ((f) p2.a(f.class)).a(iDMComponent.getContainerType());
            if (a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.android.ultron.vfw.template.DinamicXTemplateProvider");
            }
            DXTemplateItem a3 = ((b) a2).a(string);
            bob e = p2.e();
            q.b(e, "viewEngine.dinamicXEngineManager");
            bd a4 = e.a();
            q.b(a4, "viewEngine.dinamicXEngineManager.dxEngine");
            HashMap hashMap = new HashMap();
            hashMap.put(d.TAG_DINAMICX_VIEW_COMPONENT, iDMComponent);
            bez x2 = bbzVar.x();
            if (x2 == null || (p = x2.p()) == null || (c2 = p.c()) == null) {
                return;
            }
            hashMap.putAll(c2);
            DXRenderOptions a5 = new DXRenderOptions.a().a((Object) hashMap).a();
            if (z) {
                if (a3 == null || aag.Companion.a(a3)) {
                    return;
                }
                a4.a(bbzVar.m(), a3, iDMComponent.getData(), -1, a5);
                return;
            }
            a4.d().a(bbzVar.m(), iDMComponent.getData(), a3, -1, a5);
        }
    }
}
