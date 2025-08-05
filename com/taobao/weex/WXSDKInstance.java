package com.taobao.weex;

import android.app.Activity;
import android.app.AlertDialog;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IHttpCacheAdapter;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.adapter.IWXJSEngineManager;
import com.taobao.weex.adapter.URIAdapter;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.bridge.INativeInvoker;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXPerformance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.render.WXAbstractRenderContainer;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.view.WXScrollView;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXFileUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ifq;
import tb.kge;
import tb.rjd;

/* loaded from: classes9.dex */
public class WXSDKInstance implements View.OnLayoutChangeListener, l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_URL = "bundleUrl";
    public static String d;
    public static String e;
    public g A;
    public volatile boolean C;
    private boolean D;
    private boolean E;
    public boolean F;
    public boolean G;
    private boolean O;
    private int Q;
    private boolean R;
    private com.taobao.weex.performance.f S;
    public FlatGUIContext T;
    private Map<String, String> V;
    private WXSDKManager.a W;
    private m Z;

    /* renamed from: a  reason: collision with root package name */
    private List<Pair<Runnable, Boolean>> f23481a;
    public c aA;
    public Map<String, Object> aB;
    public Map<Long, Object> aC;
    public List<rjd> aD;
    private IHttpCacheAdapter aH;
    private int aJ;
    public List<j> aL;
    private boolean aM;
    private boolean aN;
    private boolean aP;
    public HashMap<String, List<String>> aQ;
    public ConcurrentHashMap<String, d> aR;
    private boolean aS;
    private float aT;
    private IWXComputeScreenAdapter aV;
    private boolean aa;
    private WXRenderStrategy ab;
    public WXPerformance af;
    public ScrollView ag;
    public WXScrollView.WXScrollViewListener ah;
    public List<OnWXScrollListener> ai;
    public List<String> aj;
    public List<a> ak;
    public List<i> al;
    public List<h> am;
    public WXSDKInstance an;
    private String ao;
    private boolean ap;
    private boolean at;
    private WXLifecycleObserver au;
    private com.taobao.weex.d b;
    private com.taobao.weex.remote.c c;
    public boolean f;
    public boolean g;
    public Context h;
    public IWXBridgeManager.BundType i;
    public boolean j;
    public volatile boolean k;
    private boolean l;
    private boolean m;
    public String[] n;
    public long[] o;
    public WeakReference<String> p;
    public Map<String, List<String>> q;
    public long r;
    public TimeCalculator s;
    public PriorityQueue<Object> t;
    private final String v;
    private WXAbstractRenderContainer w;

    /* loaded from: classes9.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f23500a;
        public e b;

        static {
            kge.a(-2134335451);
        }

        public d(String str, e eVar) {
            this.f23500a = str;
            this.b = eVar;
        }
    }

    /* loaded from: classes9.dex */
    public interface e {
        f CallModuleMethod(String str, String str2, JSONArray jSONArray, JSONObject jSONObject);
    }

    /* loaded from: classes9.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23501a;
        public Object b;

        static {
            kge.a(-422976350);
        }

        public f(boolean z, Object obj) {
            this.f23501a = false;
            this.b = null;
            this.f23501a = z;
            this.b = obj;
        }
    }

    /* loaded from: classes9.dex */
    public interface g {
        void onCreateNestInstance(WXSDKInstance wXSDKInstance, NestedContainer nestedContainer);
    }

    /* loaded from: classes9.dex */
    public interface i {
        boolean a();
    }

    /* loaded from: classes9.dex */
    public interface j {
        void onAppear();

        void onDisappear();
    }

    /* loaded from: classes9.dex */
    public interface m {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)});
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boolean a(WXSDKInstance wXSDKInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1573312", new Object[]{wXSDKInstance, new Boolean(z)})).booleanValue();
        }
        wXSDKInstance.l = z;
        return z;
    }

    public static /* synthetic */ String b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a147725b", new Object[]{wXSDKInstance}) : wXSDKInstance.v;
    }

    public static /* synthetic */ boolean c(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a9a0148", new Object[]{wXSDKInstance})).booleanValue() : wXSDKInstance.m;
    }

    public static /* synthetic */ void d(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed939a3", new Object[]{wXSDKInstance});
        } else {
            wXSDKInstance.h();
        }
    }

    public static /* synthetic */ void e(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13187202", new Object[]{wXSDKInstance});
        } else {
            wXSDKInstance.a();
        }
    }

    public static /* synthetic */ WXSDKManager.a f(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKManager.a) ipChange.ipc$dispatch("d4c83638", new Object[]{wXSDKInstance}) : wXSDKInstance.W;
    }

    public static /* synthetic */ com.taobao.weex.remote.c g(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.remote.c) ipChange.ipc$dispatch("c834a110", new Object[]{wXSDKInstance}) : wXSDKInstance.c;
    }

    public static /* synthetic */ void h(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd61b1f", new Object[]{wXSDKInstance});
        } else {
            wXSDKInstance.aN();
        }
    }

    public static /* synthetic */ com.taobao.weex.d i(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.d) ipChange.ipc$dispatch("22e54e06", new Object[]{wXSDKInstance}) : wXSDKInstance.b;
    }

    static {
        kge.a(1639474995);
        kge.a(-864520249);
        kge.a(-782512414);
        d = "DEBUG_INSTANCE_REFRESH";
        e = "INSTANCE_RELOAD";
    }

    private void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{this, runnable, new Boolean(z)});
        } else if (this.C) {
        } else {
            if (this.c != null) {
                runnable.run();
                return;
            }
            WXLogUtils.d(WXLogUtils.WEEX_TAG, "instance id:" + this.v + "add waiting task");
            this.f23481a.add(new Pair<>(runnable, Boolean.valueOf(z)));
        }
    }

    private void aM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d8aa93", new Object[]{this});
        } else if (this.au != null) {
        } else {
            try {
                if (this.h == null || !(this.h instanceof LifecycleOwner)) {
                    return;
                }
                this.au = new WXLifecycleObserver();
                Lifecycle lifecycle = ((LifecycleOwner) this.h).getLifecycle();
                if (lifecycle == null) {
                    return;
                }
                lifecycle.addObserver(this.au);
                WXLogUtils.e(WXLogUtils.WEEX_TAG, "add lifecycleObserver");
            } catch (Throwable th) {
                WXLogUtils.e(WXLogUtils.WEEX_TAG, th.getMessage());
            }
        }
    }

    private void aN() {
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e6c214", new Object[]{this});
        } else if (this.au == null) {
        } else {
            try {
                if (this.h == null || !(this.h instanceof LifecycleOwner) || (lifecycle = ((LifecycleOwner) this.h).getLifecycle()) == null) {
                    return;
                }
                lifecycle.removeObserver(this.au);
                this.au = null;
                WXLogUtils.e(WXLogUtils.WEEX_TAG, "remove lifecycleObserver");
            } catch (Throwable th) {
                WXLogUtils.e(WXLogUtils.WEEX_TAG, th.getMessage());
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.C) {
            WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + this.v + "has destroyed. clear waiting task");
            this.f23481a.clear();
        } else {
            for (Pair<Runnable, Boolean> pair : this.f23481a) {
                WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + this.v + "run waiting task");
                if (((Boolean) pair.second).booleanValue()) {
                    WXSDKManager.getInstance().postOnUiThread((Runnable) pair.first, 0L);
                } else {
                    WXSDKManager.getInstance().getWXBridgeManager().post((Runnable) pair.first);
                }
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IWXInitTaskAdapter wXInitTaskAdapter = WXSDKManager.getInstance().getWXInitTaskAdapter();
        if (wXInitTaskAdapter == null) {
            return;
        }
        this.l = false;
        ar().a(com.taobao.weex.performance.f.KEY_PAGE_STAGES_REMOTE_INSTALL_START);
        wXInitTaskAdapter.doInit(new IWXInitTaskAdapter.Callback() { // from class: com.taobao.weex.WXSDKInstance.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.adapter.IWXInitTaskAdapter.Callback
            public void onRemoteInstalled() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("50311ffc", new Object[]{this});
                    return;
                }
                WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + WXSDKInstance.b(WXSDKInstance.this) + " onRemoteInstalled");
                WXSDKInstance.this.ar().a(com.taobao.weex.performance.f.KEY_PAGE_STAGES_REMOTE_INSTALL_END);
                WXSDKInstance.d(WXSDKInstance.this);
                WXSDKInstance.e(WXSDKInstance.this);
            }

            @Override // com.taobao.weex.adapter.IWXInitTaskAdapter.Callback
            public void onRemoteFailed(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f382afbd", new Object[]{this, str, str2});
                    return;
                }
                WXSDKInstance.a(WXSDKInstance.this, true);
                WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + WXSDKInstance.b(WXSDKInstance.this) + " init fail : error" + str2);
                if (WXSDKInstance.f(WXSDKInstance.this) != null) {
                    try {
                        WXSDKInstance.f(WXSDKInstance.this).a(str, str2);
                    } catch (Throwable th) {
                        WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                    }
                }
                WXSDKInstance.this.ar().a(com.taobao.weex.performance.f.KEY_PAGE_STAGES_REMOTE_INSTALL_END);
                if (WXSDKInstance.f(WXSDKInstance.this) != null || WXSDKInstance.c(WXSDKInstance.this)) {
                    WXExceptionUtils.commitCriticalExceptionRT(WXSDKInstance.b(WXSDKInstance.this), WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL, null, null, null);
                }
                WXSDKInstance.this.b(WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL.getErrorCode(), WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL.getErrorMsg());
            }
        });
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.at;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.at = z;
        }
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.aj;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.aj == null) {
            this.aj = new ArrayList();
        }
        this.aj.add(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        List<String> list = this.aj;
        if (list == null) {
            return;
        }
        list.remove(str);
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
            return;
        }
        ar().e = str;
        ar().b();
        ar().b(str);
    }

    public void a(WXSDKManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7341c54b", new Object[]{this, aVar});
        } else if (WXUtils.forceInitCallback()) {
            aVar.onInitSuccess();
        } else {
            if (this.W != null) {
                WXSDKManager.getInstance().removeInitListener(this.W);
            }
            this.W = aVar;
            WXSDKManager.getInstance().setInitListener(this.W);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.W == null) {
        } else {
            WXSDKManager.getInstance().removeInitListener(this.W);
            this.W = null;
        }
    }

    public boolean aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa2d379d", new Object[]{this})).booleanValue() : this.aS;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
        } else {
            this.aS = z;
        }
    }

    public float aT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa3b4f0a", new Object[]{this})).floatValue();
        }
        float f2 = this.aT;
        if (f2 > 0.0f) {
            return f2;
        }
        IWXFoldDeviceAdapter wXFoldDeviceAdapter = WXSDKManager.getInstance().getWXFoldDeviceAdapter();
        if (wXFoldDeviceAdapter != null) {
            Context context = this.h;
            if (context instanceof Activity) {
                return wXFoldDeviceAdapter.getScaleRadio((Activity) context);
            }
        }
        return 1.0f;
    }

    public void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
        } else {
            this.aT = f2;
        }
    }

    public void a(IHttpCacheAdapter iHttpCacheAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd6cc16", new Object[]{this, iHttpCacheAdapter});
        } else {
            this.aH = iHttpCacheAdapter;
        }
    }

    public IHttpCacheAdapter m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHttpCacheAdapter) ipChange.ipc$dispatch("5294d262", new Object[]{this}) : this.aH;
    }

    /* loaded from: classes9.dex */
    public static abstract class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f23502a;

        static {
            kge.a(-2014524818);
        }

        public abstract boolean a(int i, int i2, Intent intent, String str);

        public h(String str) {
            this.f23502a = str;
        }

        public boolean a(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79f30289", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue() : a(i, i2, intent, this.f23502a);
        }
    }

    public void c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                    } else {
                        WXSDKInstance.g(WXSDKInstance.this).setUseSandBox(z);
                    }
                }
            }, false);
        }
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.aJ;
    }

    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            this.aJ = i2;
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.aB.put(str, obj);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.aB.remove(str);
        }
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("73a838bc", new Object[]{this, str}) : this.aB.get(str);
    }

    public void a(final RenderContainer renderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4646fe49", new Object[]{this, renderContainer});
            return;
        }
        if (renderContainer != null) {
            renderContainer.setSDKInstance(this);
            renderContainer.addOnLayoutChangeListener(this);
        }
        this.w = renderContainer;
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).setRenderContainer(renderContainer);
                }
            }
        }, false);
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.O;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.R = z;
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.R;
    }

    public void a(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else {
            this.Q = i2;
        }
    }

    public int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : this.Q;
    }

    public void a(IWXComputeScreenAdapter iWXComputeScreenAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c3023e", new Object[]{this, iWXComputeScreenAdapter});
        } else if (!ifq.d() && !ifq.c()) {
        } else {
            this.aV = iWXComputeScreenAdapter;
        }
    }

    public Rect aX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("2a92b3e7", new Object[]{this});
        }
        IWXComputeScreenAdapter iWXComputeScreenAdapter = this.aV;
        if (iWXComputeScreenAdapter == null) {
            return null;
        }
        return iWXComputeScreenAdapter.computeCurrentScreenMetrics();
    }

    public WXSDKInstance(Context context) {
        this.T = new FlatGUIContext();
        this.aa = false;
        this.f23481a = new CopyOnWriteArrayList();
        this.f = false;
        this.g = false;
        this.D = false;
        this.E = false;
        this.G = false;
        this.C = false;
        this.F = false;
        this.O = false;
        this.R = false;
        this.Q = 750;
        this.j = false;
        this.n = new String[5];
        this.o = new long[5];
        this.q = new HashMap();
        this.ab = WXRenderStrategy.APPEND_ASYNC;
        this.aS = false;
        this.aT = -1.0f;
        this.k = false;
        this.ao = "platform";
        this.ap = true;
        this.at = false;
        this.l = false;
        this.m = false;
        this.aB = new ArrayMap();
        this.aC = new ArrayMap();
        this.aJ = -1;
        this.aL = new ArrayList();
        this.aM = false;
        this.aN = false;
        this.aP = true;
        this.aQ = new HashMap<>();
        this.aR = new ConcurrentHashMap<>();
        this.h = context;
        this.v = WXSDKManager.getInstance().generateInstanceId();
        a(context);
    }

    public WXSDKInstance() {
        this.T = new FlatGUIContext();
        this.aa = false;
        this.f23481a = new CopyOnWriteArrayList();
        this.f = false;
        this.g = false;
        this.D = false;
        this.E = false;
        this.G = false;
        this.C = false;
        this.F = false;
        this.O = false;
        this.R = false;
        this.Q = 750;
        this.j = false;
        this.n = new String[5];
        this.o = new long[5];
        this.q = new HashMap();
        this.ab = WXRenderStrategy.APPEND_ASYNC;
        this.aS = false;
        this.aT = -1.0f;
        this.k = false;
        this.ao = "platform";
        this.ap = true;
        this.at = false;
        this.l = false;
        this.m = false;
        this.aB = new ArrayMap();
        this.aC = new ArrayMap();
        this.aJ = -1;
        this.aL = new ArrayList();
        this.aM = false;
        this.aN = false;
        this.aP = true;
        this.aQ = new HashMap<>();
        this.aR = new ConcurrentHashMap<>();
        this.v = WXSDKManager.getInstance().generateInstanceId();
        this.af = new WXPerformance(this.v);
        this.S = new com.taobao.weex.performance.f(this.v);
        WXSDKManager.getInstance().getAllInstanceMap().put(this.v, this);
        this.s = new TimeCalculator(this);
    }

    private void h() {
        if (this.c != null) {
            return;
        }
        try {
            this.c = (com.taobao.weex.remote.c) Class.forName("com.taobao.weex.WXSDKInstanceImpl").getConstructor(WXSDKInstance.class).newInstance(this);
            WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + this.v + " init remote instance impl success");
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
        }
    }

    public WXComponent z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("c4975e9a", new Object[]{this});
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.getRootComponent();
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28513963", new Object[]{this, gVar});
        } else {
            this.A = gVar;
        }
    }

    public final WXSDKInstance a(NestedContainer nestedContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("76192e9d", new Object[]{this, nestedContainer});
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.createNestedInstance(nestedContainer);
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.D;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.E;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        WXLogUtils.d("createInstanceFuncHeartBeat: " + this.v);
        this.G = true;
        ar().a("wxEndExecuteBundle");
        ar().a("wxCreateInstanceEnd");
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else {
            ar().a("wxCreateInstanceStart");
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            ar().a(com.taobao.weex.performance.f.KEY_PAGE_STATS_SCRIPT_USE_QJS_BYTE_CODE, Double.parseDouble(str));
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            ar().a(com.taobao.weex.performance.f.KEY_PAGE_STATS_API_USE_QJS_BYTE_CODE, Double.parseDouble(str));
        }
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28529680", new Object[]{this, jVar});
        } else {
            this.aL.add(jVar);
        }
    }

    public void b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a5331f", new Object[]{this, jVar});
        } else {
            this.aL.remove(jVar);
        }
    }

    public WXSDKInstance f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("79f1320b", new Object[]{this}) : new WXSDKInstance(this.h);
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        if (this.af == null) {
            this.af = new WXPerformance(this.v);
        }
        if (this.S == null) {
            this.S = new com.taobao.weex.performance.f(this.v);
        }
        this.V = new HashMap(4);
        this.af.WXSDKVersion = WXEnvironment.WXSDK_VERSION;
        this.af.JSLibInitTime = WXEnvironment.sJSLibInitTime;
        WXSDKManager.getInstance().getAllInstanceMap().put(this.v, this);
        this.V.put("wxContainerName", context instanceof Activity ? context.getClass().getSimpleName() : "unKnowContainer");
        this.V.put("wxInstanceType", "page");
        if (this.s == null) {
            this.s = new TimeCalculator(this);
        }
        aM();
        b();
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).init(context);
                }
            }
        }, false);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1b1b51", new Object[]{this, cVar});
        } else {
            this.aA = cVar;
        }
    }

    public c C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8193cab3", new Object[]{this}) : this.aA;
    }

    public INativeInvoker n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INativeInvoker) ipChange.ipc$dispatch("783e5541", new Object[]{this});
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.getNativeInvokeHelper();
    }

    public ScrollView E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollView) ipChange.ipc$dispatch("b40d2f60", new Object[]{this}) : this.ag;
    }

    public void a(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bdefbc", new Object[]{this, scrollView});
        } else {
            this.ag = scrollView;
        }
    }

    @Deprecated
    public void a(WXScrollView.WXScrollViewListener wXScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ea952b", new Object[]{this, wXScrollViewListener});
        } else {
            this.ah = wXScrollViewListener;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.V.put(str, str2);
        }
    }

    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ef1c5942", new Object[]{this}) : this.V;
    }

    public void a(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3553277b", new Object[]{this, str, str2, map, str3, wXRenderStrategy});
        } else {
            a(str, new com.taobao.weex.h(str2), map, str3, wXRenderStrategy);
        }
    }

    public void a(final String str, final com.taobao.weex.h hVar, final Map<String, Object> map, final String str2, final WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f9dba1", new Object[]{this, str, hVar, map, str2, wXRenderStrategy});
            return;
        }
        this.m = true;
        this.af.beforeInstanceRender(this.v);
        WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + this.v + " pageName:" + str + " render base");
        if (WXEnvironment.isApkDebugable() && "default".equals(str)) {
            if (M() == null) {
                return;
            }
            new AlertDialog.Builder(M()).setTitle("Error: Missing pageName").setMessage("We highly recommend you to set pageName. Call\nWXSDKInstance#render(String pageName, String template, Map<String, Object> options, String jsonInitData, WXRenderStrategy flag)\nto fix it.").show();
            return;
        }
        c();
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + WXSDKInstance.b(WXSDKInstance.this) + " pageName:" + str + " render remote");
                    WXSDKInstance.g(WXSDKInstance.this).renderInternal(str, hVar, map, str2, wXRenderStrategy);
                }
            }
        }, false);
    }

    public void a(String str, byte[] bArr, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae3c4b6", new Object[]{this, str, bArr, map, str2});
        } else {
            a(str, new com.taobao.weex.h(bArr), map, str2, WXRenderStrategy.DATA_RENDER_BINARY);
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.aM;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.aN;
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        WXLogUtils.d("test->", "onInstanceReady");
        this.S.a(com.taobao.weex.performance.f.KEY_PAGE_STAGES_CONTAINER_READY);
        if (!this.aM && !this.aN) {
            return;
        }
        this.k = true;
        this.S.a(this.aN);
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).onInstanceReady();
                }
            }
        }, false);
    }

    public void b(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecfbd3c", new Object[]{this, str, str2, map, str3, wXRenderStrategy});
            return;
        }
        this.aM = true;
        a(wXRenderStrategy);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("pre_init_mode", "true");
        this.S.k = false;
        WXSDKManager.getInstance().createInstance(this, new com.taobao.weex.h(str2), map, str3);
    }

    public void a(WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452fec6", new Object[]{this, wXRenderStrategy});
        } else {
            this.ab = wXRenderStrategy;
        }
    }

    public void a(String str, Map<String, Object> map, String str2, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcecab1", new Object[]{this, str, map, str2, wXRenderStrategy});
            return;
        }
        this.aN = true;
        a(wXRenderStrategy);
        this.S.k = false;
        c(str, str, map, str2, wXRenderStrategy);
    }

    @Deprecated
    public void a(String str, String str2, Map<String, Object> map, String str3, int i2, int i3, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7593db", new Object[]{this, str, str2, map, str3, new Integer(i2), new Integer(i3), wXRenderStrategy});
        } else {
            c(str, str2, map, str3, wXRenderStrategy);
        }
    }

    public void c(final String str, final String str2, final Map<String, Object> map, final String str3, final WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84c52fd", new Object[]{this, str, str2, map, str3, wXRenderStrategy});
            return;
        }
        this.m = true;
        c();
        ar().e = str;
        ar().b();
        ar().b(str);
        WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + this.v + " url:" + str2 + " renderByUr base");
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXLogUtils.e(WXLogUtils.WEEX_TAG, "instance id:" + WXSDKInstance.b(WXSDKInstance.this) + " url:" + str2 + " renderByUrlInternal remote");
                    WXSDKInstance.g(WXSDKInstance.this).renderByUrlInternal(str, str2, map, str3, wXRenderStrategy);
                }
            }
        }, false);
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.reloadPage(z);
    }

    public void h(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                    } else {
                        WXLogUtils.d(WXLogUtils.WEEX_TAG, "instance id:" + WXSDKInstance.b(WXSDKInstance.this) + " refreshInstance remote");
                        WXSDKInstance.g(WXSDKInstance.this).refreshInstance(str);
                    }
                }
            }, false);
        }
    }

    public WXRenderStrategy L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXRenderStrategy) ipChange.ipc$dispatch("c0260b1", new Object[]{this}) : this.ab;
    }

    public Context M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3b56394c", new Object[]{this}) : O();
    }

    public String N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40a0b6b", new Object[]{this}) : this.v;
    }

    public Context O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8df6024e", new Object[]{this});
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar != null) {
            return cVar.getContext();
        }
        return this.h;
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47cdcca", new Object[]{this})).intValue();
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar != null) {
            return cVar.getWeexHeight();
        }
        return 0;
    }

    public int Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48af44b", new Object[]{this})).intValue();
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar != null) {
            return cVar.getWeexWidth();
        }
        return 0;
    }

    public IWXImgLoaderAdapter R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXImgLoaderAdapter) ipChange.ipc$dispatch("c74f3662", new Object[]{this}) : WXSDKManager.getInstance().getIWXImgLoaderAdapter();
    }

    public URIAdapter S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URIAdapter) ipChange.ipc$dispatch("b82e9e4d", new Object[]{this}) : WXSDKManager.getInstance().getURIAdapter();
    }

    public Uri a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("e52e6d20", new Object[]{this, uri, str}) : S().rewrite(this, str, uri);
    }

    public com.taobao.weex.appfram.websocket.a U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.websocket.a) ipChange.ipc$dispatch("8f23edc5", new Object[]{this}) : WXSDKManager.getInstance().getIWXWebSocketAdapter();
    }

    public void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.h = context;
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).setContext(context);
                }
            }
        }, false);
    }

    public void a(final com.taobao.weex.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1b8fb0", new Object[]{this, dVar});
            return;
        }
        this.b = dVar;
        if (this.l) {
            b(WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL.getErrorCode(), WXErrorCode.WX_DEGRAD_REMOTE_INSTALL_FAIL.getErrorMsg());
        }
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).registerRenderListener(dVar);
                }
            }
        }, false);
    }

    @Override // com.taobao.weex.l
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onActivityCreate();
    }

    @Override // com.taobao.weex.l
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onActivityStart();
    }

    public boolean a(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2945674", new Object[]{this, menu})).booleanValue();
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar != null) {
            cVar.onCreateOptionsMenu(menu);
        }
        return true;
    }

    @Override // com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onActivityPause();
    }

    @Override // com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onActivityResume();
    }

    @Override // com.taobao.weex.l
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onActivityStop();
    }

    public synchronized void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else if (this.c != null) {
            this.c.onActivityDestroy();
        } else {
            e();
        }
    }

    public boolean ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[]{this})).booleanValue();
        }
        List<a> list = this.ak;
        if (list != null) {
            for (a aVar : list) {
                if (aVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue();
        }
        List<i> list = this.al;
        if (list != null) {
            for (i iVar : list) {
                if (iVar.a()) {
                    return true;
                }
            }
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return false;
        }
        return cVar.onBackPressed();
    }

    public void a(final int i2, final int i3, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).onActivityResult(i2, i3, intent);
                }
            }
        }, false);
        List<h> list = this.am;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<h> it = this.am.iterator();
        while (it.hasNext() && !it.next().a(i2, i3, intent)) {
        }
    }

    /* loaded from: classes9.dex */
    public class WXLifecycleObserver implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-391725938);
            kge.a(2139684418);
        }

        private WXLifecycleObserver() {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            WXSDKInstance.h(WXSDKInstance.this);
            WXSDKManager.getInstance().postOnUiThread(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.WXLifecycleObserver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    WXLogUtils.e(WXLogUtils.WEEX_TAG, "on lifecycleObserver destroy");
                    WXSDKInstance.this.onActivityDestroy();
                }
            }, 5000L);
        }
    }

    public void ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
            return;
        }
        this.aa = false;
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onViewDisappear();
    }

    public void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
            return;
        }
        this.aa = true;
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onViewAppear();
    }

    public void ag() {
        com.taobao.weex.remote.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
        } else if (this.g || (cVar = this.c) == null) {
        } else {
            cVar.onCreateFinish();
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            WXSDKManager.getInstance().postOnUiThread(runnable, 0L);
        }
    }

    public void a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.F = true;
        if (!this.j) {
            ar().g();
        }
        if (!ar().f23517a.containsKey("wxInteraction")) {
            ar().a(z());
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.r;
            long[] renderFinishTime = WXSDKManager.getInstance().getWXBridgeManager().getRenderFinishTime(N());
            this.af.callBridgeTime = renderFinishTime[0];
            this.af.cssLayoutTime = renderFinishTime[1];
            this.af.parseJsonTime = renderFinishTime[2];
            this.af.totalTime = currentTimeMillis;
            if (this.af.screenRenderTime < 0.001d) {
                this.af.screenRenderTime = currentTimeMillis;
            }
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
        }
        com.taobao.weex.d dVar = this.b;
        if (dVar != null && this.h != null) {
            dVar.onRenderSuccess(this, i2, i3);
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.d(WXLogUtils.WEEX_PERF_TAG, this.af.toString());
            }
        }
        if (!WXEnvironment.isPerf()) {
            return;
        }
        WXLogUtils.e(WXLogUtils.WEEX_PERF_TAG, this.af.getPerfData());
    }

    public void b(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        com.taobao.weex.d dVar = this.b;
        if (dVar == null || this.h == null) {
            return;
        }
        dVar.onRefreshSuccess(this, i2, i3);
    }

    public void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        this.E = true;
        if (this.b == null || this.h == null) {
            return;
        }
        WXLogUtils.e("onRenderError " + str + "," + str2);
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.i(WXSDKInstance.this) == null || WXSDKInstance.this.h == null) {
                } else {
                    WXSDKInstance.i(WXSDKInstance.this).onException(WXSDKInstance.this, str, str2);
                }
            }
        });
    }

    public void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.D = true;
        if (this.b == null || this.h == null) {
            return;
        }
        WXLogUtils.e("onJSException " + str + "," + str3);
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.i(WXSDKInstance.this) == null || WXSDKInstance.this.h == null) {
                } else {
                    WXSDKInstance.i(WXSDKInstance.this).onException(WXSDKInstance.this, str, str2 + str3);
                }
            }
        });
    }

    public void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
        } else if (!this.aP) {
        } else {
            this.af.firstScreenJSFExecuteTime = j2 - this.r;
            this.aP = false;
        }
    }

    public void b(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j2)});
        } else if (this.f) {
        } else {
            this.af.fsCallJsTotalTime += j2;
            this.af.fsCallJsTotalNum++;
        }
    }

    public void d(long j2) {
        WXPerformance wXPerformance;
        WXPerformance wXPerformance2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j2)});
            return;
        }
        this.af.mActionAddElementCount++;
        this.af.mActionAddElementSumTime = (int) (wXPerformance.mActionAddElementSumTime + j2);
        if (!this.f) {
            this.af.fsComponentCreateTime = (int) (wXPerformance2.fsComponentCreateTime + j2);
            this.af.fsComponentCount++;
        }
        this.af.componentCount++;
        this.af.componentCreateTime += j2;
    }

    public void c(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j2)});
            return;
        }
        WXPerformance wXPerformance = this.af;
        wXPerformance.mActionAddElementSumTime = (int) (wXPerformance.mActionAddElementSumTime + j2);
    }

    public void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
        } else if (this.f) {
        } else {
            this.f = true;
            this.S.h();
            this.af.fsRenderTime = System.currentTimeMillis();
            this.af.screenRenderTime = System.currentTimeMillis() - this.r;
        }
    }

    public WXSDKInstance ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("ba6fcd4d", new Object[]{this}) : this.an;
    }

    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            this.an = wXSDKInstance;
        }
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.c == null && !this.C && (this.W != null || this.m)) {
            WXExceptionUtils.commitCriticalExceptionRT(this.v, WXErrorCode.WX_USER_CANCEL_REMOTE_INSTALL, null, null, null);
            ar().e();
        }
        if (this.c != null) {
            this.c.destroy();
        }
        this.C = true;
        aN();
        this.f23481a.clear();
        if (this.T != null) {
            u().destroy();
            this.T = null;
        }
        WXSDKManager.getInstance().postOnUiThread(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WXSDKManager.getInstance().getAllInstanceMap().remove(WXSDKInstance.this.N());
                }
            }
        }, 1000L);
    }

    public boolean P_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dd3ef1a", new Object[]{this})).booleanValue() : this.C;
    }

    public String ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfb410f", new Object[]{this});
        }
        com.taobao.weex.remote.c cVar = this.c;
        return cVar != null ? cVar.getBundleUrl() : "";
    }

    public View al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c61872f4", new Object[]{this});
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.getRootView();
    }

    public View am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("104a0c35", new Object[]{this});
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar != null) {
            return cVar.getContainerView();
        }
        return this.w;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.w != null || O() == null) {
        } else {
            a(new RenderContainer(O()));
            this.w.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.w.setBackgroundColor(0);
            this.w.setSDKInstance(this);
            this.w.addOnLayoutChangeListener(this);
        }
    }

    public void a(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972b2f4d", new Object[]{this, wXComponent});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onRootCreated(wXComponent);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.moveFixedView(view);
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.removeFixedView(view);
    }

    public int an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aba9b227", new Object[]{this})).intValue();
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return 0;
        }
        return cVar.getRenderContainerPaddingLeft();
    }

    public int ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abb7c9a8", new Object[]{this})).intValue();
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return 0;
        }
        return cVar.getRenderContainerPaddingTop();
    }

    public synchronized List<OnWXScrollListener> ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bae69e51", new Object[]{this});
        }
        return this.ai;
    }

    public synchronized void a(OnWXScrollListener onWXScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0ce1ef", new Object[]{this, onWXScrollListener});
            return;
        }
        if (this.ai == null) {
            this.ai = new ArrayList();
        }
        this.ai.add(onWXScrollListener);
    }

    public synchronized void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284e7f29", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (this.ak == null) {
                this.ak = new ArrayList();
            }
            this.ak.add(aVar);
        }
    }

    public synchronized void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2851adc2", new Object[]{this, hVar});
            return;
        }
        if (this.am != null && hVar != null) {
            this.am.remove(hVar);
        }
    }

    public synchronized void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a44a61", new Object[]{this, hVar});
        } else if (hVar == null) {
        } else {
            if (this.am == null) {
                this.am = new ArrayList();
            }
            this.am.add(hVar);
        }
    }

    public synchronized void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28522221", new Object[]{this, iVar});
        } else if (iVar == null) {
        } else {
            if (this.al == null) {
                this.al = new ArrayList();
            }
            this.al.add(iVar);
        }
    }

    public void c(final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                    } else {
                        WXSDKInstance.g(WXSDKInstance.this).setSize(i2, i3);
                    }
                }
            }, true);
        }
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        List<String> list = this.aQ.get(str);
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            WXSDKManager.getInstance().callback(this.v, str2, map, true);
        }
    }

    public void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee206cd", new Object[]{this, str, str2, map, map2, list});
        } else {
            a(str, str2, map, map2, list, null);
        }
    }

    public void a(final String str, final String str2, final Map<String, Object> map, final Map<String, Object> map2, final List<Object> list, final EventResult eventResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e663110", new Object[]{this, str, str2, map, map2, list, eventResult});
            return;
        }
        WXPerformance wXPerformance = this.af;
        if (wXPerformance != null && wXPerformance.fsCallEventTotalNum < Integer.MAX_VALUE) {
            this.af.fsCallEventTotalNum++;
        }
        this.S.b(com.taobao.weex.performance.f.KEY_PAGE_STATS_FS_CALL_EVENT_NUM, 1.0d);
        a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                } else {
                    WXSDKInstance.g(WXSDKInstance.this).fireEvent(str, str2, map, map2, list, eventResult);
                }
            }
        }, true);
    }

    public void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
        } else {
            a(str, str2, map, map2, (List<Object>) null);
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            a(str, str2, map, (Map<String, Object>) null);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            List<String> list = this.aQ.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.aQ.put(str, list);
            }
            list.add(str2);
        }
    }

    public void e(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (list = this.aQ.get(str)) == null) {
        } else {
            list.remove(str2);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.aQ.remove(str);
        }
    }

    public void a(final String str, final WXModule wXModule, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2aad4c", new Object[]{this, str, wXModule, map});
        } else {
            a(new Runnable() { // from class: com.taobao.weex.WXSDKInstance.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WXSDKInstance.g(WXSDKInstance.this) == null) {
                    } else {
                        WXSDKInstance.g(WXSDKInstance.this).fireModuleEvent(str, wXModule, map);
                    }
                }
            }, true);
        }
    }

    public boolean a(String str, WXModule wXModule) {
        List<String> eventCallbacks;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc3cb91d", new Object[]{this, str, wXModule})).booleanValue() : (wXModule == null || (eventCallbacks = wXModule.getEventCallbacks(str)) == null || eventCallbacks.size() <= 0) ? false : true;
    }

    public WXPerformance aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXPerformance) ipChange.ipc$dispatch("a2d0f488", new Object[]{this}) : this.af;
    }

    public com.taobao.weex.performance.f ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.performance.f) ipChange.ipc$dispatch("2753ed3d", new Object[]{this}) : this.S;
    }

    public String av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5ba45e4", new Object[]{this});
        }
        String ax = ax();
        if (ax == null) {
            return " template md5 null ,httpHeader:" + JSONObject.toJSONString(this.q);
        } else if (TextUtils.isEmpty(ax)) {
            return " template md5  length 0 ,httpHeader" + JSONObject.toJSONString(this.q);
        } else {
            try {
                byte[] bytes = ax.getBytes("UTF-8");
                String md5 = WXFileUtils.md5(bytes);
                String base64Md5 = WXFileUtils.base64Md5(bytes);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(md5);
                arrayList2.add(base64Md5);
                this.q.put("templateSourceMD5", arrayList);
                this.q.put("templateSourceBase64MD5", arrayList2);
                return " template md5 " + md5 + " length " + bytes.length + " base64 md5 " + base64Md5 + " response header " + JSONObject.toJSONString(this.q);
            } catch (Exception unused) {
                return "template md5 getBytes error";
            }
        }
    }

    public boolean aw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[]{this})).booleanValue();
        }
        Map<String, List<String>> map = this.q;
        if (map == null) {
            return true;
        }
        List<String> list = map.get("Content-Md5");
        if (list == null) {
            list = this.q.get(HttpConstant.Content_MD52);
        }
        if (list != null && list.size() > 0) {
            String str = list.get(0);
            List<String> list2 = this.q.get("templateSourceBase64MD5");
            if (list2 == null) {
                av();
                list2 = this.q.get("templateSourceBase64MD5");
            }
            if (list2 != null && list2.size() != 0) {
                return str.equals(list2.get(0));
            }
        }
        return true;
    }

    public String ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c5bb22", new Object[]{this});
        }
        WeakReference<String> weakReference = this.p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            this.p = new WeakReference<>(str);
        }
    }

    public void ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac44b4bf", new Object[]{this});
            return;
        }
        com.taobao.weex.remote.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.OnVSync();
    }

    public void a(long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e008e838", new Object[]{this, new Long(j2), obj});
        } else {
            this.aC.put(Long.valueOf(j2), obj);
        }
    }

    public Object e(long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ae0a085a", new Object[]{this, new Long(j2)}) : this.aC.get(Long.valueOf(j2));
    }

    public List<rjd> az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c738fe07", new Object[]{this});
        }
        if (this.aD == null) {
            this.aD = new ArrayList();
        }
        return this.aD;
    }

    public void a(rjd rjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd21962c", new Object[]{this, rjdVar});
        } else if (rjdVar == null || az().contains(rjdVar)) {
        } else {
            az().add(rjdVar);
        }
    }

    public String aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc0aa2f9", new Object[]{this}) : this.ao;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.ap;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else {
            this.ap = z;
        }
    }

    public f a(String str, String str2, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("defc9c68", new Object[]{this, str, str2, jSONArray, jSONObject});
        }
        d dVar = this.aR.get(str);
        if (dVar != null && dVar.b != null) {
            return dVar.b.CallModuleMethod(str, str2, jSONArray, jSONObject);
        }
        return null;
    }

    public IWXJSEngineManager.EngineType aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJSEngineManager.EngineType) ipChange.ipc$dispatch("27a59831", new Object[]{this}) : IWXJSEngineManager.EngineType.QuickJS;
    }

    public FlatGUIContext u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlatGUIContext) ipChange.ipc$dispatch("6c4bc466", new Object[]{this}) : this.T;
    }

    public boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue() : this.aa;
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{this, str})).booleanValue() : this.aR.containsKey(str);
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1f121b", new Object[]{this, str, eVar});
        } else if (TextUtils.isEmpty(str) || eVar == null) {
        } else {
            this.aR.put(str, new d(str, eVar));
        }
    }

    public m aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("550f2183", new Object[]{this}) : this.Z;
    }
}
