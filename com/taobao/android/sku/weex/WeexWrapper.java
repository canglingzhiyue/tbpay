package com.taobao.android.sku.weex;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import com.taobao.weex.common.WXRenderStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.kge;
import tb.ljl;

/* loaded from: classes6.dex */
public class WeexWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WeexWrapper";
    public static final int WEEX_VERSION_V1 = 1;
    public static final int WEEX_VERSION_V2 = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f15219a;
    private Context b;
    private int c;
    private int d;
    private b e;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SkuWeexVersion {
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(View view);

        void a(b bVar);

        void a(b bVar, String str, String str2);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void a(a aVar);

        void a(String str, JSONObject jSONObject, boolean z);

        void a(String str, Map<String, Object> map);

        View b();

        boolean c();

        boolean d();

        void e();

        void f();

        void g();

        void h();

        void i();
    }

    static {
        kge.a(642283049);
    }

    public WeexWrapper(Context context, int i, String str) {
        this.b = context;
        this.d = i;
        this.f15219a = str;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.c = i;
        i();
        s.a().a(this.b);
        s.a().b();
        s.a().c();
        s.a().d();
        if (i == 2) {
            this.e = new d(this.b, this.d, str, this.f15219a);
        } else {
            this.e = new c(this.b, this.d);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        b bVar = this.e;
        return bVar != null && bVar.c();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        b bVar = this.e;
        return bVar != null && bVar.d();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed258b3", new Object[]{this, aVar});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.a(aVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.a(str, jSONObject, z);
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        b bVar = this.e;
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.a(str, map);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.e();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.f();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.g();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.h();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.i();
        }
        s.a().e();
        s.a().f();
        s.a().g();
    }

    /* loaded from: classes6.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f15220a;
        private WXSDKInstance b;
        private a c;
        private RenderContainer d;
        private int e;

        static {
            kge.a(-951739636);
            kge.a(-1069358371);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            }
        }

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed34164", new Object[]{cVar})).intValue() : cVar.e;
        }

        public static /* synthetic */ a b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f3e56c1b", new Object[]{cVar}) : cVar.c;
        }

        public c(final Context context, int i) {
            this.f15220a = context;
            this.e = i;
            this.b = new WXSDKInstance(this.f15220a);
            RenderContainer renderContainer = new RenderContainer(this.f15220a);
            renderContainer.setBackgroundColor(0);
            this.b.a(renderContainer);
            this.d = renderContainer;
            if (com.taobao.android.sku.pad.b.INSTANCE.a(context)) {
                this.b.a(new IWXComputeScreenAdapter() { // from class: com.taobao.android.sku.weex.WeexWrapper.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
                    public Rect computeCurrentScreenMetrics() {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this}) : com.taobao.android.sku.pad.b.INSTANCE.c(context);
                    }
                });
            }
            this.b.a(new com.taobao.weex.d() { // from class: com.taobao.android.sku.weex.WeexWrapper.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private String a(int i2) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i2)}) : i2 == 3 ? o.LOG_TRACE_MODULE : o.LOG_TRACE_MODULE_SKU_V3;
                }

                @Override // com.taobao.weex.d
                public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                    } else {
                        s.a().a(wXSDKInstance, view);
                    }
                }

                @Override // com.taobao.weex.d
                public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i2, int i3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i2), new Integer(i3)});
                        return;
                    }
                    o.b(a(c.a(c.this)), ljl.RENDER_SUCCESS_TIME, "code: 1", "SkuWXRenderListener：onRenderSuccess");
                    Log.e("Weex SKU", "SkuWXRenderListener：onRenderSuccess");
                    s.a().a(wXSDKInstance);
                    if (c.b(c.this) == null) {
                        return;
                    }
                    c.b(c.this).a(c.this);
                }

                @Override // com.taobao.weex.d
                public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i2, int i3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i2), new Integer(i3)});
                        return;
                    }
                    o.b(a(c.a(c.this)), "onRefreshSuccess", "code: 0", "SkuWXRenderListener：onRefreshSuccess");
                    Log.e("Weex SKU", "SkuWXRenderListener：onRefreshSuccess");
                }

                @Override // com.taobao.weex.d
                public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                        return;
                    }
                    String a2 = a(c.a(c.this));
                    o.b(a2, "renderError", "code: " + str, str2);
                    s.a().a(wXSDKInstance, str, str2);
                    if (c.b(c.this) == null) {
                        return;
                    }
                    c.b(c.this).a(c.this, str, str2);
                }
            });
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed258b3", new Object[]{this, aVar});
                return;
            }
            if (this.c == aVar) {
                z = false;
            }
            this.c = aVar;
            if (!z) {
                return;
            }
            j();
        }

        private void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
                return;
            }
            a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.a(this.d);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.e == 3) {
                SkuWeexModule.registerCurrentModule();
            } else {
                SkuV3WeexModule.registerCurrentModule();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public View b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b.am();
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            } else {
                this.b.a(str, map);
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a(String str, JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
                return;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            this.b.c(!TextUtils.isEmpty(str) ? str : o.PAGE_NAME, str, null, jSONObject.toJSONString(), WXRenderStrategy.APPEND_ASYNC);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
                return;
            }
            this.b.a((com.taobao.weex.d) null);
            this.b.e();
        }
    }

    /* loaded from: classes6.dex */
    public static class d implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f15223a;
        private p b;
        private a c;
        private int d;
        private boolean f;
        private boolean e = n.a("is_weex2_intercept_back_press");
        private g g = new g() { // from class: com.taobao.android.sku.weex.WeexWrapper.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                    return;
                }
                o.d(WeexWrapper.TAG, "onForeground" + pVar);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                    return;
                }
                o.d(WeexWrapper.TAG, "onPrepareSuccess" + pVar);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                    return;
                }
                d.a(d.this);
                o.d(WeexWrapper.TAG, ljl.RENDER_SUCCESS_TIME + pVar);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(p pVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                if (d.b(d.this) != null) {
                    a b = d.b(d.this);
                    d dVar = d.this;
                    b.a(dVar, i + "", str);
                }
                o.d(WeexWrapper.TAG, "onRenderFailed downgrade with errorCode: " + i + " errorMsg: " + str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                    return;
                }
                o.d(WeexWrapper.TAG, "onRefreshSuccess" + pVar);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(p pVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                o.d(WeexWrapper.TAG, "onRefreshFailed downgrade with errorCode: " + i + " errorMsg: " + str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(p pVar, int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                    return;
                }
                if (d.b(d.this) != null) {
                    a b = d.b(d.this);
                    d dVar = d.this;
                    b.a(dVar, i + "", str);
                }
                o.d(WeexWrapper.TAG, "onJSException " + str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(p pVar, int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                    return;
                }
                if (d.b(d.this) != null) {
                    a b = d.b(d.this);
                    d dVar = d.this;
                    b.a(dVar, i + "", str);
                }
                o.d(WeexWrapper.TAG, "onFatalException " + str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else {
                    o.d(WeexWrapper.TAG, "onDestroyed");
                }
            }
        };

        static {
            kge.a(1535773197);
            kge.a(-1069358371);
        }

        public static /* synthetic */ void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed3b5d0", new Object[]{dVar});
            } else {
                dVar.k();
            }
        }

        public static /* synthetic */ void a(d dVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c1b1102", new Object[]{dVar, view});
            } else {
                dVar.a(view);
            }
        }

        public static /* synthetic */ a b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ad5cf9ba", new Object[]{dVar}) : dVar.c;
        }

        public static /* synthetic */ Context c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f8250e86", new Object[]{dVar}) : dVar.f15223a;
        }

        public d(Context context, int i, String str, String str2) {
            this.f = false;
            this.f15223a = context;
            this.d = i;
            MUSDKInstance a2 = a(str, str2);
            if (a2 != null) {
                this.b = a2;
                this.f = true;
                a(this.b.getRenderRoot());
                k();
                this.b.registerRenderListener(this.g);
                return;
            }
            a(str);
            if (!n.a("enable_fix_double_weex") || this.b == null) {
                return;
            }
            com.taobao.android.sku.weex.c.a(str, str2);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f;
        }

        private boolean a(MUSDKInstance mUSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a98364a6", new Object[]{this, mUSDKInstance, str, str2})).booleanValue();
            }
            if (mUSDKInstance == null) {
                o.d(WeexWrapper.TAG, "getPreloadedInstance null");
                return false;
            } else if (mUSDKInstance.isInvalid()) {
                mUSDKInstance.destroy();
                o.a(o.DEFAULT_BIZ_NAME, o.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance is isInvalid");
                return false;
            } else if (mUSDKInstance.getRenderRoot() == null) {
                mUSDKInstance.destroy();
                o.a(o.DEFAULT_BIZ_NAME, o.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance getRenderRoot is null");
                return false;
            } else {
                String b = com.taobao.android.sku.weex.c.b(str, str2);
                if (!SkuPreloadModule.isInstanceReady(b)) {
                    mUSDKInstance.destroy();
                    o.a(o.DEFAULT_BIZ_NAME, o.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance is not ready");
                    return false;
                } else if (!mUSDKInstance.isUIReady()) {
                    mUSDKInstance.destroy();
                    o.a(o.DEFAULT_BIZ_NAME, o.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance isUIReady is false");
                    return false;
                } else {
                    o.b(b, str);
                    o.d(WeexWrapper.TAG, "WeexPreloadHit : " + b);
                    return true;
                }
            }
        }

        private MUSDKInstance a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSDKInstance) ipChange.ipc$dispatch("97f9d322", new Object[]{this, str, str2});
            }
            MUSDKInstance a2 = com.taobao.android.sku.weex.c.a(this.f15223a, str, str2);
            if (a2 == null) {
                return null;
            }
            if (a(a2, str, str2)) {
                com.taobao.android.sku.weex.c.d(str2);
                return a2;
            }
            com.taobao.android.sku.weex.c.d(str2);
            return null;
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            mUSInstanceConfig.d(true);
            mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.c(str);
            mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.sku.weex.WeexWrapper.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.f
                public void onCreateView(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    } else {
                        d.a(d.this, view);
                    }
                }
            });
            if (com.taobao.android.sku.pad.b.INSTANCE.a(this.f15223a)) {
                mUSInstanceConfig.a(new com.taobao.android.weex.config.a() { // from class: com.taobao.android.sku.weex.WeexWrapper.d.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex.config.a
                    public Rect a() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Rect) ipChange2.ipc$dispatch("ef387fb1", new Object[]{this}) : com.taobao.android.sku.pad.b.INSTANCE.c(d.c(d.this));
                    }
                });
            }
            this.b = q.a().a(this.f15223a, mUSInstanceConfig);
            this.b.registerRenderListener(new g() { // from class: com.taobao.android.sku.weex.WeexWrapper.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                    } else if (d.b(d.this) == null) {
                    } else {
                        d.b(d.this).a(d.this);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar, int i, String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z)});
                        return;
                    }
                    if (d.b(d.this) != null) {
                        a b = d.b(d.this);
                        d dVar = d.this;
                        b.a(dVar, i + "", str2);
                    }
                    o.d("weexV2Mode", "onRenderFailed downgrade with errorCode: " + i + " errorMsg: " + str2);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar, int i, String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z)});
                        return;
                    }
                    o.d("weexV2Mode", "onRefreshFailed downgrade with errorCode: " + i + " errorMsg: " + str2);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str2});
                    } else if (d.b(d.this) == null) {
                    } else {
                        a b = d.b(d.this);
                        d dVar = d.this;
                        b.a(dVar, i + "", str2);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str2});
                    } else if (d.b(d.this) == null) {
                    } else {
                        a b = d.b(d.this);
                        d dVar = d.this;
                        b.a(dVar, i + "", str2);
                    }
                }
            });
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed258b3", new Object[]{this, aVar});
                return;
            }
            if (this.c == aVar) {
                z = false;
            }
            this.c = aVar;
            if (!z) {
                return;
            }
            a(b());
            k();
        }

        private void k() {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[]{this});
            } else if (!c() || (aVar = this.c) == null) {
            } else {
                aVar.a(this);
            }
        }

        private void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.a(view);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.d == 3) {
                SkuWeexV2Module.registerCurrentModule();
                o.d(WeexWrapper.TAG, "registerCurrentModule SKU_MODE_WEEX NewBuy_Detail");
            } else {
                SkuV3WeexV2Module.registerCurrentModule();
                o.d(WeexWrapper.TAG, "registerCurrentModule SKU_MODE_WEEX_SKU_V3 Sku_V3_Detail");
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public View b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b.getRenderRoot();
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            if (!this.e || !this.b.canGoBack()) {
                return false;
            }
            this.b.goBack();
            return true;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            } else {
                this.b.fireEvent(0, str, new JSONObject(map));
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a(String str, JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
                return;
            }
            this.b.initWithURL(Uri.parse(str));
            if (z) {
                jSONObject = null;
            }
            this.b.render(jSONObject, null);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.b.onActivityStart();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else {
                this.b.onActivityResume();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            } else {
                this.b.onActivityPause();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            } else {
                this.b.onActivityStop();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
                return;
            }
            this.f = false;
            this.b.registerRenderListener(null);
            this.b.destroy();
        }
    }
}
