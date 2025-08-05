package com.alibaba.triver.triver_shop.shop2023;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.preload.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.e;
import com.taobao.android.weex.h;
import java.util.Map;
import kotlin.Result;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.jvr;
import tb.jvw;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends com.alibaba.triver.triver_shop.shop2023.b implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;
    private static WeexInstance h;
    private WeexInstance f;
    private final XSDStoreWeexModeComponent$currentObserver$1 g = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.shop2023.XSDStoreWeexModeComponent$currentObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fe877f", new Object[]{this});
                return;
            }
            c.a(c.this);
            c.this.J();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            } else {
                c.this.K();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            WeexInstance b2 = c.b(c.this);
            if (b2 == null) {
                return;
            }
            b2.onActivityStart();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            WeexInstance b2 = c.b(c.this);
            if (b2 == null) {
                return;
            }
            b2.onActivityStop();
        }
    };

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.c$c */
    /* loaded from: classes3.dex */
    public static final class C0152c implements jvr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f4053a;

        public C0152c(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            this.f4053a = dVar;
        }

        @Override // tb.jvr
        public final void a(Map<String, Object> reportDataMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, reportDataMap});
                return;
            }
            Object obj = reportDataMap.get(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT);
            Object obj2 = reportDataMap.get(jvw.KEY_PAGE_STAGES_INTERACTION_OPT);
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.f4053a;
            if (obj == null) {
                obj = obj2;
            }
            dVar.b(g.KEY_XSD_PAGE_FINISH, obj);
            ceg.Companion.b("weex report data");
            ceg.a aVar = ceg.Companion;
            q.b(reportDataMap, "reportDataMap");
            aVar.b(com.alibaba.triver.triver_shop.newShop.ext.b.b(reportDataMap));
            com.alibaba.triver.triver_shop.newShop.ext.h.a(this.f4053a);
        }
    }

    static {
        kge.a(-1171812977);
        kge.a(1947023493);
        Companion = new b(null);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 69750737) {
            super.J();
            return null;
        } else if (hashCode == 70674258) {
            super.K();
            return null;
        } else if (hashCode != 77138905) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.R();
            return null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex.h
    public void onDestroyed(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteSuccess(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    public static final /* synthetic */ WeexInstance U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("4b72de98", new Object[0]) : h;
    }

    public static final /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e5cac8", new Object[]{cVar});
        } else {
            cVar.N();
        }
    }

    public static final /* synthetic */ void a(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ec586", new Object[]{weexInstance});
        } else {
            h = weexInstance;
        }
    }

    public static final /* synthetic */ WeexInstance b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("b9c1e72d", new Object[]{cVar}) : cVar.f;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(355144215);
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        private b() {
        }

        public final void a(Activity context) {
            Object m2371constructorimpl;
            Bundle extras;
            String string;
            Uri c;
            Uri c2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, context});
                return;
            }
            q.d(context, "context");
            if (c.U() != null) {
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                Intent intent = context.getIntent();
                String str = "https://web.m.taobao.com/app/tb-store/same-hour-delivery-shop/shop-frame?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&is_loading=0&disableNav=YES&wx_use_layoutng=true";
                if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString(g.KEY_FIRST_IN_SHOP_URL)) != null && (c = com.alibaba.triver.triver_shop.newShop.ext.b.c(string)) != null && (c2 = com.alibaba.triver.triver_shop.newShop.ext.b.c(str)) != null) {
                    Uri.Builder buildUpon = c2.buildUpon();
                    for (Map.Entry<String, String> entry : com.alibaba.triver.triver_shop.newShop.ext.b.a(c).entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    str = buildUpon.toString();
                    q.b(str, "builder.toString()");
                }
                b bVar = c.Companion;
                WeexInstance a2 = e.a(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, null);
                a2.initWithURL(str);
                a2.setInstanceData(WeexValueImpl.ofJSON(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("shop", com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("xsdCategory", null), j.a("routeProcess", null))))));
                a2.render(null);
                c.a(a2);
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    @Override // com.alibaba.triver.triver_shop.shop2023.b, com.alibaba.triver.triver_shop.newShop.view.component.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.v4.app.FragmentActivity r18, com.alibaba.triver.triver_shop.newShop.data.d r19, com.alibaba.triver.triver_shop.newShop.ext.e r20) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.c.a(android.support.v4.app.FragmentActivity, com.alibaba.triver.triver_shop.newShop.data.d, com.alibaba.triver.triver_shop.newShop.ext.e):void");
    }

    /* loaded from: classes3.dex */
    public static final class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.preload.d.a
        public Object a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8543a356", new Object[]{this, new Long(j)});
            }
            return null;
        }

        public a() {
            c.this = r1;
        }

        @Override // com.alibaba.triver.triver_shop.preload.d.a
        public void a(Object data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, data});
                return;
            }
            q.d(data, "data");
            if (!(data instanceof JSONObject)) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1(c.this, data));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        super.K();
        WeexInstance weexInstance = this.f;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityPause();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        super.J();
        WeexInstance weexInstance = this.f;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityResume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        super.R();
        WeexInstance weexInstance = this.f;
        if (weexInstance == null) {
            return;
        }
        weexInstance.destroy();
    }
}
