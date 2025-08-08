package com.taobao.tao.flexbox.layoutmanager.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.a;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.drd;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogq;
import tb.ohg;

/* loaded from: classes8.dex */
public class TNodeView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TNodeView";
    public static final int UPPER_VIEW_LEVEL_HIGH = 60;
    public static final int UPPER_VIEW_LEVEL_HIGHEST = 100;
    public static final int UPPER_VIEW_LEVEL_LOW = 10;
    public static final int UPPER_VIEW_LEVEL_MIDDLE = 50;
    private a.InterfaceC0858a callback;
    private int currentHeight;
    private int currentScreenType;
    private int currentWidth;
    private Object data;
    private com.taobao.tao.flexbox.layoutmanager.view.tabbar.a delegate;
    private ab engine;
    private String errorPage;
    private boolean firstTime;
    private boolean forceSize;
    private Handler handler;
    private Object host;
    private boolean ignoreTouchEvent;
    private boolean isDestroy;
    private boolean isResumed;
    private boolean isStarted;
    private int lastLayoutStatus;
    private s messageHandler;
    private NetworkConnectChangedReceiver networkConnectChangedReceiver;
    private ohg.a oConfigListener;
    private boolean onMeasureCalled;
    private boolean onStartLayoutSent;
    private boolean orangeRead;
    private com.taobao.tao.flexbox.layoutmanager.container.i pageRenderIntercept;
    private HashMap params;
    private boolean prepared;
    private b renderCallback;
    private boolean renderUrlMode;
    private aa rootNode;
    private OnScreenChangedListener screenChangedListener;
    private String shortLinkName;
    private boolean suspendLayout;
    private d suspendStateChangeCallback;
    private FrameLayout tnodeViewContainer;
    private e upperViewChangeCallback;
    private FrameLayout upperViewContainer;
    private String url;
    private m.b urlConfigs;
    private boolean useDefaultShortLinkUrl;
    private f viewLayoutCallback;

    /* loaded from: classes8.dex */
    public interface a {
        void a(TNodeView tNodeView, View view);

        void b(TNodeView tNodeView, View view);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onLayoutCompleted(aa aaVar);

        void onLayoutError();
    }

    /* loaded from: classes8.dex */
    public interface c extends b {
        void onStartLayout(m.b bVar);
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a(boolean z);
    }

    /* loaded from: classes8.dex */
    public interface e {
        void a(View view);
    }

    /* loaded from: classes8.dex */
    public interface f {
        void c();
    }

    static {
        kge.a(457963348);
    }

    public static /* synthetic */ Object ipc$super(TNodeView tNodeView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb70e56", new Object[]{tNodeView});
        } else {
            tNodeView.startRender();
        }
    }

    public static /* synthetic */ m.b access$100(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m.b) ipChange.ipc$dispatch("858c527c", new Object[]{tNodeView}) : tNodeView.urlConfigs;
    }

    public static /* synthetic */ b access$1000(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f1798c26", new Object[]{tNodeView}) : tNodeView.renderCallback;
    }

    public static /* synthetic */ m.b access$102(TNodeView tNodeView, m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m.b) ipChange.ipc$dispatch("a71efb23", new Object[]{tNodeView, bVar});
        }
        tNodeView.urlConfigs = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$1100(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6c4be6", new Object[]{tNodeView});
        } else {
            tNodeView.unwatchOrangeUpdate();
        }
    }

    public static /* synthetic */ void access$1200(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35701745", new Object[]{tNodeView});
        } else {
            tNodeView.unwatchNetworkUpdate();
        }
    }

    public static /* synthetic */ FrameLayout access$1300(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("4e8f9fb5", new Object[]{tNodeView}) : tNodeView.tnodeViewContainer;
    }

    public static /* synthetic */ int access$1400(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4177adf6", new Object[]{tNodeView})).intValue() : tNodeView.currentWidth;
    }

    public static /* synthetic */ int access$1500(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("477b7955", new Object[]{tNodeView})).intValue() : tNodeView.currentHeight;
    }

    public static /* synthetic */ void access$1600(TNodeView tNodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626a0633", new Object[]{tNodeView, new Boolean(z)});
        } else {
            tNodeView.layout(z);
        }
    }

    public static /* synthetic */ ab access$1702(TNodeView tNodeView, ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("483711d8", new Object[]{tNodeView, abVar});
        }
        tNodeView.engine = abVar;
        return abVar;
    }

    public static /* synthetic */ aa access$1802(TNodeView tNodeView, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("73ca00f9", new Object[]{tNodeView, aaVar});
        }
        tNodeView.rootNode = aaVar;
        return aaVar;
    }

    public static /* synthetic */ void access$1900(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8aa6de", new Object[]{tNodeView});
        } else {
            tNodeView.setContainerMessageHandlerInternal();
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.view.tabbar.a access$200(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.view.tabbar.a) ipChange.ipc$dispatch("a53338a0", new Object[]{tNodeView}) : tNodeView.delegate;
    }

    public static /* synthetic */ boolean access$2000(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3de210c", new Object[]{tNodeView})).booleanValue() : tNodeView.isDestroy;
    }

    public static /* synthetic */ boolean access$2100(TNodeView tNodeView, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f926cf0b", new Object[]{tNodeView, new Integer(i), new Integer(i2)})).booleanValue() : tNodeView.syncLayout(i, i2);
    }

    public static /* synthetic */ void access$2200(TNodeView tNodeView, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e5472e", new Object[]{tNodeView, aaVar});
        } else {
            tNodeView.relayout(aaVar);
        }
    }

    public static /* synthetic */ void access$2300(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e98325", new Object[]{tNodeView});
        } else {
            tNodeView.layoutInternal();
        }
    }

    public static /* synthetic */ boolean access$2400(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbed4e88", new Object[]{tNodeView})).booleanValue() : tNodeView.orangeRead;
    }

    public static /* synthetic */ boolean access$2402(TNodeView tNodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a328ce56", new Object[]{tNodeView, new Boolean(z)})).booleanValue();
        }
        tNodeView.orangeRead = z;
        return z;
    }

    public static /* synthetic */ boolean access$2502(TNodeView tNodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d9e6ed7", new Object[]{tNodeView, new Boolean(z)})).booleanValue();
        }
        tNodeView.useDefaultShortLinkUrl = z;
        return z;
    }

    public static /* synthetic */ String access$300(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c52e188d", new Object[]{tNodeView}) : tNodeView.url;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.container.i access$400(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.container.i) ipChange.ipc$dispatch("8ec53241", new Object[]{tNodeView}) : tNodeView.pageRenderIntercept;
    }

    public static /* synthetic */ int access$502(TNodeView tNodeView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ade2eb67", new Object[]{tNodeView, new Integer(i)})).intValue();
        }
        tNodeView.lastLayoutStatus = i;
        return i;
    }

    public static /* synthetic */ boolean access$600(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12cdd294", new Object[]{tNodeView})).booleanValue() : tNodeView.renderUrlMode;
    }

    public static /* synthetic */ void access$700(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d19def", new Object[]{tNodeView});
        } else {
            tNodeView.watchNetworkUpdate();
        }
    }

    public static /* synthetic */ void access$800(TNodeView tNodeView, m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1298fa49", new Object[]{tNodeView, bVar});
        } else {
            tNodeView.watchOrangeUpdate(bVar);
        }
    }

    public static /* synthetic */ void access$900(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d934ad", new Object[]{tNodeView});
        } else {
            tNodeView.addErrorView();
        }
    }

    public void onStop() {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.isStarted = false;
        ab abVar = this.engine;
        if (abVar == null || (aaVar = this.rootNode) == null) {
            return;
        }
        abVar.i(aaVar);
    }

    public void onStart() {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.isStarted = true;
        ab abVar = this.engine;
        if (abVar == null || (aaVar = this.rootNode) == null) {
            return;
        }
        abVar.h(aaVar);
    }

    /* loaded from: classes8.dex */
    public class NetworkConnectChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1859856169);
        }

        public NetworkConnectChangedReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return;
            }
            TNodeView.access$000(TNodeView.this);
        }
    }

    private void setContainerMessageHandlerInternal() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf50f46", new Object[]{this});
            return;
        }
        aa aaVar = this.rootNode;
        if (aaVar == null || (sVar = this.messageHandler) == null) {
            return;
        }
        aaVar.a(202, sVar);
    }

    public TNodeView(Context context) {
        super(context);
        this.renderUrlMode = false;
        this.currentScreenType = -1;
        this.lastLayoutStatus = 0;
        this.firstTime = true;
        this.isResumed = true;
        this.isStarted = true;
        this.isDestroy = false;
        this.suspendLayout = false;
        this.forceSize = false;
        this.onMeasureCalled = false;
        this.prepared = false;
        this.callback = new a.b() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private String a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
                }
                String a2 = TNodeView.access$100(TNodeView.this) != null ? TNodeView.access$100(TNodeView.this).a() : null;
                return (!StringUtils.isEmpty(a2) || TNodeView.access$200(TNodeView.this) == null) ? a2 : TNodeView.access$200(TNodeView.this).a();
            }

            private String b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
                }
                String access$300 = TNodeView.access$300(TNodeView.this);
                if (StringUtils.isEmpty(access$300) && TNodeView.access$100(TNodeView.this) != null) {
                    access$300 = TNodeView.access$100(TNodeView.this).c;
                }
                return (!StringUtils.isEmpty(access$300) || !(TNodeView.this.getContext() instanceof Activity) || ((Activity) TNodeView.this.getContext()).getIntent() == null) ? access$300 : ((Activity) TNodeView.this.getContext()).getIntent().getDataString();
            }

            private void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("type", "renderfailed");
                w.a(false, 100, "engineLoadError", null, hashMap.toString(), a(), b(), null, null, null);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.b
            public void a(ab.h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("971f5bab", new Object[]{this, hVar});
                    return;
                }
                ogg.a("TNodeView onLayoutError");
                TNodeView.access$400(TNodeView.this).a((aa) null);
                com.taobao.tao.flexbox.layoutmanager.container.m.b(TNodeView.access$300(TNodeView.this));
                TNodeView.access$102(TNodeView.this, hVar.a());
                TNodeView.access$502(TNodeView.this, -1);
                if (TNodeView.access$600(TNodeView.this)) {
                    if (TNodeView.access$100(TNodeView.this) != null) {
                        if (TNodeView.access$100(TNodeView.this).g) {
                            TNodeView.access$700(TNodeView.this);
                        } else {
                            TNodeView tNodeView = TNodeView.this;
                            TNodeView.access$800(tNodeView, TNodeView.access$100(tNodeView));
                        }
                    }
                    TNodeView.access$900(TNodeView.this);
                }
                c();
                if (TNodeView.access$1000(TNodeView.this) == null) {
                    return;
                }
                TNodeView.access$1000(TNodeView.this).onLayoutError();
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.InterfaceC0858a
            public void a(aa aaVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                    return;
                }
                TNodeView.access$1100(TNodeView.this);
                TNodeView.access$1200(TNodeView.this);
                if (oeb.bZ() && aaVar.k() != null && (aaVar.k().j() || aaVar.k().j())) {
                    ogg.b("onLayoutCompleted, engine is destroy");
                    return;
                }
                TNodeView.access$1300(TNodeView.this).removeAllViews();
                View x = aaVar.x();
                if (x == null) {
                    ogg.b("onLayoutCompleted, rootView is Null");
                    return;
                }
                ogg.a("TNodeView onLayoutCompleted");
                ViewGroup.LayoutParams layoutParams = x.getLayoutParams();
                if (layoutParams != null && (layoutParams.width != TNodeView.access$1400(TNodeView.this) || layoutParams.height != TNodeView.access$1500(TNodeView.this))) {
                    ogg.c(TNodeView.TAG, hashCode() + " onLayoutCompleted sizeChanged, layoutWidth:" + layoutParams.width + " layoutHeight:" + layoutParams.height + " currentWidth:" + TNodeView.access$1400(TNodeView.this) + " currentHeight:" + TNodeView.access$1500(TNodeView.this));
                    TNodeView.access$1600(TNodeView.this, false);
                }
                TNodeView.access$502(TNodeView.this, 1);
                TNodeView.access$1702(TNodeView.this, aaVar.k());
                TNodeView.access$1802(TNodeView.this, aaVar);
                TNodeView.access$1900(TNodeView.this);
                if (x.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x.getParent()).removeView(x);
                }
                TNodeView.access$1300(TNodeView.this).addView(x, new FrameLayout.LayoutParams(-1, -1));
                TNodeView.access$400(TNodeView.this).a(false);
                TNodeView.access$400(TNodeView.this).a(aaVar);
                if (TNodeView.access$1000(TNodeView.this) == null) {
                    return;
                }
                TNodeView.access$1000(TNodeView.this).onLayoutCompleted(aaVar);
            }
        };
        this.handler = new Handler();
        setMotionEventSplittingEnabled(false);
        this.tnodeViewContainer = new FrameLayout(context);
        addView(this.tnodeViewContainer, new FrameLayout.LayoutParams(-1, -1));
        this.upperViewContainer = new FrameLayout(context);
        addView(this.upperViewContainer, new FrameLayout.LayoutParams(-1, -1));
        this.pageRenderIntercept = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().D().a(context, (m.b) null);
    }

    public void setHost(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcae8a4d", new Object[]{this, obj});
        } else {
            this.host = obj;
        }
    }

    public void setMessageHandler(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1449bd69", new Object[]{this, sVar});
            return;
        }
        this.messageHandler = sVar;
        setContainerMessageHandlerInternal();
    }

    public void setErrorPage(String str) {
        String encodedPath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42755b46", new Object[]{this, str});
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null && (encodedPath = parse.getEncodedPath()) != null && encodedPath.startsWith(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAGE_PREFIX)) {
            this.errorPage = com.taobao.tao.flexbox.layoutmanager.container.m.b(str, true);
        } else {
            this.errorPage = str;
        }
    }

    @Deprecated
    public static TNodeView create(ab.h.a aVar, ab abVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("3e4d319c", new Object[]{aVar, abVar, bVar});
        }
        TNodeView tNodeView = new TNodeView(aVar.a());
        tNodeView.renderCallback = bVar;
        com.taobao.tao.flexbox.layoutmanager.view.tabbar.a aVar2 = new com.taobao.tao.flexbox.layoutmanager.view.tabbar.a(aVar, abVar, tNodeView.callback);
        aVar2.a(tNodeView);
        tNodeView.delegate = aVar2;
        return tNodeView;
    }

    @Deprecated
    public static TNodeView create(Context context, String str, String str2, JSONObject jSONObject, HashMap hashMap, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("1a165990", new Object[]{context, str, str2, jSONObject, hashMap, bVar}) : create(context, null, str, str2, 1, jSONObject, hashMap, bVar);
    }

    @Deprecated
    public static TNodeView create(Context context, ab abVar, String str, String str2, int i, JSONObject jSONObject, HashMap hashMap, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("b70233c6", new Object[]{context, abVar, str, str2, new Integer(i), jSONObject, hashMap, bVar});
        }
        TNodeView tNodeView = new TNodeView(context);
        tNodeView.renderCallback = bVar;
        com.taobao.tao.flexbox.layoutmanager.view.tabbar.a aVar = new com.taobao.tao.flexbox.layoutmanager.view.tabbar.a(context, null, abVar, str, str2, jSONObject, hashMap, i, tNodeView.callback);
        aVar.a(tNodeView);
        tNodeView.delegate = aVar;
        return tNodeView;
    }

    public static TNodeView create(Context context, ab abVar, String str, HashMap hashMap, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("45a4ad6f", new Object[]{context, abVar, str, hashMap, bVar}) : create(context, null, abVar, str, null, hashMap, bVar);
    }

    public static TNodeView create(Context context, ab abVar, String str, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("7f0ed1d6", new Object[]{context, abVar, str, bVar}) : create(context, null, abVar, str, null, null, bVar);
    }

    public static TNodeView create(Context context, ab abVar, String str, Object obj, HashMap hashMap, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("b03072cb", new Object[]{context, abVar, str, obj, hashMap, bVar}) : create(context, null, abVar, str, obj, hashMap, bVar);
    }

    public static TNodeView create(Context context, Object obj, ab abVar, String str, Object obj2, HashMap hashMap, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("427ecb67", new Object[]{context, obj, abVar, str, obj2, hashMap, bVar});
        }
        TNodeView tNodeView = new TNodeView(context);
        tNodeView.url = str;
        tNodeView.data = obj2;
        tNodeView.params = hashMap;
        tNodeView.renderCallback = bVar;
        tNodeView.engine = abVar;
        tNodeView.renderUrlMode = true;
        tNodeView.host = obj;
        tNodeView.startRender();
        return tNodeView;
    }

    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else if (this.lastLayoutStatus != -1 || this.delegate == null) {
        } else {
            layout(false);
            this.delegate.b();
        }
    }

    public void setPendingArgs(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833b7d8c", new Object[]{this, map});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.view.tabbar.a aVar = this.delegate;
        if (aVar == null) {
            return;
        }
        aVar.a(map);
    }

    public ab getEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("d8d1967e", new Object[]{this}) : this.engine;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ogg.c(TAG, hashCode() + "onMeasure, width:" + measuredWidth + " height:" + measuredHeight + " forceSize:" + this.forceSize);
        this.onMeasureCalled = true;
        if (this.forceSize) {
            return;
        }
        boolean z2 = this.tnodeViewContainer.getChildCount() > 0 && this.rootNode != null;
        if (!this.suspendLayout) {
            syncLayout(measuredWidth, measuredHeight);
        } else {
            doPrepare(measuredWidth, measuredHeight);
        }
        if (this.tnodeViewContainer.getChildCount() <= 0 || this.rootNode == null) {
            z = false;
        }
        if (!oeb.a("fixAddMeasure", false) || z2 || !z) {
            return;
        }
        ogg.a("tnode view同步添加，手动measure");
        this.tnodeViewContainer.measure(i, i2);
    }

    public void setSuspendLayoutState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64afd1a0", new Object[]{this, new Boolean(z)});
        } else if (this.suspendLayout == z) {
        } else {
            ogg.c(TAG, "setSuspendLayoutState suspendLayout:" + this.suspendLayout + " suspend:" + z + " measurecalled:" + this.onMeasureCalled);
            this.suspendLayout = z;
            d dVar = this.suspendStateChangeCallback;
            if (dVar != null) {
                dVar.a(z);
            }
            if (z || !this.onMeasureCalled || this.isDestroy) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TNodeView.access$2000(TNodeView.this)) {
                    } else {
                        TNodeView.access$2100(TNodeView.this, TNodeView.this.getMeasuredWidth(), TNodeView.this.getMeasuredHeight());
                    }
                }
            }, oeb.a("syncSuspendLayout", false));
        }
    }

    public void setSuspendStateChangeCallback(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5902fc5a", new Object[]{this, dVar});
        } else {
            this.suspendStateChangeCallback = dVar;
        }
    }

    public void setUpperViewChangeCallback(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cc7b8b", new Object[]{this, eVar});
        } else {
            this.upperViewChangeCallback = eVar;
        }
    }

    private void onWindowSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a5970b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.delegate.d() == null) {
        } else {
            int i5 = this.currentScreenType;
            IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
            if (w == null || !(getContext() instanceof Activity)) {
                return;
            }
            this.currentScreenType = w.b((Activity) getContext());
            if (this.currentScreenType == i5 || i5 == -1) {
                return;
            }
            this.engine.a(this.delegate.d(), i5, this.currentScreenType, i3, i4);
        }
    }

    public void layout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0d52d1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.currentWidth == i && this.currentHeight == i2) {
        } else {
            onWindowSizeChanged(this.currentWidth, this.currentHeight, i, i2);
            this.currentWidth = i;
            this.currentHeight = i2;
            layout(false);
        }
    }

    private boolean syncLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e0cb110", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.currentWidth == i && this.currentHeight == i2) {
            return false;
        }
        onWindowSizeChanged(this.currentWidth, this.currentHeight, i, i2);
        this.currentWidth = i;
        this.currentHeight = i2;
        layout(true);
        return true;
    }

    private boolean syncRelayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba236803", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        aa d2 = this.delegate.d();
        if (d2 == null || (this.currentWidth == i && this.currentHeight == i2)) {
            return false;
        }
        onWindowSizeChanged(this.currentWidth, this.currentHeight, i, i2);
        this.currentWidth = i;
        this.currentHeight = i2;
        relayout(d2);
        return true;
    }

    public void forceLayout(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f537527", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!syncRelayout(i, i2)) {
        } else {
            this.forceSize = true;
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TNodeView.this.resetForceLayout();
                    }
                }
            }, i3);
        }
    }

    public void resetForceLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7c4aad", new Object[]{this});
        } else if (!this.forceSize) {
        } else {
            this.forceSize = false;
            if (!this.onMeasureCalled || this.isDestroy) {
                return;
            }
            syncLayout(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private void doPrepare(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d27e823", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ab e2 = this.delegate.e();
        if (e2 == null || e2.A() == null || this.prepared || !oeb.b()) {
            return;
        }
        this.prepared = true;
        drd a2 = e2.a((Activity) getContext());
        if (a2 == null) {
            return;
        }
        a2.a();
        e2.A().a(getContext());
    }

    public void prelayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8128f4", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.suspendLayout) {
        } else {
            syncLayout(i, i2);
        }
    }

    private void relayout(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bbe00c", new Object[]{this, aaVar});
        } else if (aaVar == null) {
        } else {
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w().f() && aaVar.G() != null) {
                int i = aaVar.G().f20361a;
                int i2 = this.currentWidth;
                if (i != i2) {
                    aaVar.b(i2, this.currentHeight);
                    return;
                }
            }
            aaVar.a(this.currentWidth, this.currentHeight);
        }
    }

    private void layout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75112e43", new Object[]{this, new Boolean(z)});
        } else if (this.delegate == null) {
        } else {
            ab abVar = this.engine;
            if (abVar != null && abVar.B()) {
                return;
            }
            final aa d2 = this.delegate.d();
            if (d2 != null) {
                this.handler.removeCallbacksAndMessages(null);
                this.handler.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TNodeView.access$2200(TNodeView.this, d2);
                        }
                    }
                });
            } else if (!this.firstTime && this.lastLayoutStatus == 0) {
            } else {
                this.firstTime = false;
                this.handler.removeCallbacksAndMessages(null);
                if (z) {
                    layoutInternal();
                } else {
                    this.handler.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                TNodeView.access$2300(TNodeView.this);
                            }
                        }
                    });
                }
            }
        }
    }

    private void layoutInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ae850e", new Object[]{this});
            return;
        }
        this.delegate.a(this.host);
        this.delegate.a(this.currentWidth, this.currentHeight);
        this.engine = this.delegate.c();
    }

    public aa getRootNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("3d74285d", new Object[]{this}) : this.rootNode;
    }

    public void addUpperView(View view, ViewGroup.LayoutParams layoutParams, int i, a aVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83cc0645", new Object[]{this, view, layoutParams, new Integer(i), aVar});
        } else if (view == null) {
        } else {
            view.setTag(R.id.layout_manager_tnode_upper_level, Integer.valueOf(i));
            if (aVar != null) {
                view.setTag(R.id.layout_manager_tnode_upper_lifcycle, aVar);
            }
            int childCount = this.upperViewContainer.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                } else if (oec.a(this.upperViewContainer.getChildAt(childCount).getTag(R.id.layout_manager_tnode_upper_level), 9999) < i) {
                    i2 = childCount + 1;
                    break;
                } else {
                    childCount--;
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.upperViewContainer.addView(view, i2, layoutParams);
            ogg.c(TAG, "addUpperView:" + view);
        }
    }

    public boolean containView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("469dbb36", new Object[]{this, view})).booleanValue();
        }
        if (this.upperViewContainer != null) {
            for (int i = 0; i < this.upperViewContainer.getChildCount(); i++) {
                if (this.upperViewContainer.getChildAt(i) == view) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removeUpperView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3b8348", new Object[]{this, view});
        } else if (this.upperViewContainer == null || view == null || !containView(view)) {
        } else {
            this.upperViewContainer.removeView(view);
            e eVar = this.upperViewChangeCallback;
            if (eVar != null) {
                eVar.a(view);
            }
            ogg.c(TAG, "removeUpperView:" + view);
        }
    }

    public View findUpperViewAtLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1de4e6bb", new Object[]{this, new Integer(i)});
        }
        if (this.upperViewContainer == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.upperViewContainer.getChildCount(); i2++) {
            View childAt = this.upperViewContainer.getChildAt(i2);
            if (childAt != null && oec.a(childAt.getTag(R.id.layout_manager_tnode_upper_level), -1) == i) {
                return childAt;
            }
        }
        return null;
    }

    private void startRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e191f", new Object[]{this});
            return;
        }
        if (this.delegate == null) {
            Context context = getContext();
            ab abVar = this.engine;
            String str = this.url;
            Object obj = this.data;
            this.delegate = new com.taobao.tao.flexbox.layoutmanager.view.tabbar.a(context, abVar, str, obj instanceof JSONObject ? (JSONObject) obj : null, this.params, this.callback);
            this.delegate.a(this);
            Object obj2 = this.data;
            if (obj2 instanceof Future) {
                this.delegate.a((Future) obj2);
                this.data = null;
            }
        }
        m.b a2 = com.taobao.tao.flexbox.layoutmanager.container.m.a(this.url);
        if (a2 != null) {
            this.pageRenderIntercept = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().D().a(getContext(), a2);
            this.pageRenderIntercept.a(getContext(), this, this.host, a2);
        }
        if (a2 != null) {
            b bVar = this.renderCallback;
            if ((bVar instanceof c) && !this.onStartLayoutSent) {
                this.onStartLayoutSent = true;
                ((c) bVar).onStartLayout(a2);
            }
        }
        this.delegate.a(a2);
        this.delegate.a(this.useDefaultShortLinkUrl);
        if (this.currentWidth <= 0 || this.currentHeight <= 0) {
            return;
        }
        layout(false);
    }

    private void addErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4217b3", new Object[]{this});
            return;
        }
        this.tnodeViewContainer.removeAllViews();
        this.tnodeViewContainer.addView(ogq.a(getContext(), this.url, null, "tnode view render fail", this.errorPage, new ogq.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ogq.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                TNodeView.access$1300(TNodeView.this).removeAllViews();
                TNodeView.access$000(TNodeView.this);
            }
        }), new FrameLayout.LayoutParams(-1, -1));
    }

    private void watchNetworkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680cd88f", new Object[]{this});
        } else if (this.networkConnectChangedReceiver != null || Build.VERSION.SDK_INT < 23) {
        } else {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService(ConnectivityManager.class)).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.networkConnectChangedReceiver = new NetworkConnectChangedReceiver();
            getContext().registerReceiver(this.networkConnectChangedReceiver, intentFilter);
        }
    }

    private void unwatchNetworkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7612fe68", new Object[]{this});
        } else if (this.networkConnectChangedReceiver == null) {
        } else {
            getContext().unregisterReceiver(this.networkConnectChangedReceiver);
            this.networkConnectChangedReceiver = null;
        }
    }

    private void unwatchOrangeUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0d9794", new Object[]{this});
        } else if (this.oConfigListener == null) {
        } else {
            ohg.a().b("weitao_switch", this.shortLinkName, this.oConfigListener);
            this.oConfigListener = null;
        }
    }

    private void watchOrangeUpdate(m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339e1c08", new Object[]{this, bVar});
        } else if (bVar == null || bVar.g || StringUtils.isEmpty(bVar.h) || this.oConfigListener != null) {
        } else {
            this.shortLinkName = bVar.h;
            this.oConfigListener = new ohg.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ohg.a
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else if (StringUtils.isEmpty(str3) || TNodeView.access$2400(TNodeView.this)) {
                    } else {
                        TNodeView.access$2402(TNodeView.this, true);
                        TNodeView.access$000(TNodeView.this);
                    }
                }
            };
            ohg.a().a("weitao_switch", this.shortLinkName, this.oConfigListener);
            if (!oeb.n()) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TNodeView.access$2502(TNodeView.this, true);
                    if (TNodeView.access$2400(TNodeView.this)) {
                        return;
                    }
                    TNodeView.access$2402(TNodeView.this, true);
                    TNodeView.access$000(TNodeView.this);
                }
            }, 500L);
        }
    }

    public void setViewLayoutCallback(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d8ce6e", new Object[]{this, fVar});
        } else {
            this.viewLayoutCallback = fVar;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        f fVar = this.viewLayoutCallback;
        if (fVar == null) {
            return;
        }
        fVar.c();
    }

    public void setIgnoreTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9075fe", new Object[]{this, new Boolean(z)});
        } else {
            this.ignoreTouchEvent = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.ignoreTouchEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ogg.a("TNodeView onResume");
        this.isResumed = true;
        for (int i = 0; i <= this.upperViewContainer.getChildCount() - 1; i++) {
            View childAt = this.upperViewContainer.getChildAt(i);
            Object tag = childAt.getTag(R.id.layout_manager_tnode_upper_lifcycle);
            if (tag instanceof a) {
                ((a) tag).b(this, childAt);
            }
        }
        this.pageRenderIntercept.a(getContext(), this.host);
        ab abVar = this.engine;
        if (abVar == null) {
            return;
        }
        abVar.v();
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ogg.a("TNodeView onPause");
        this.isResumed = false;
        boolean a2 = oeb.a("fixPauseIntercept", true);
        if (!a2) {
            this.pageRenderIntercept.b(getContext(), this.host);
        }
        for (int i = 0; i <= this.upperViewContainer.getChildCount() - 1; i++) {
            View childAt = this.upperViewContainer.getChildAt(i);
            Object tag = childAt.getTag(R.id.layout_manager_tnode_upper_lifcycle);
            if (tag instanceof a) {
                ((a) tag).a(this, childAt);
            }
        }
        ab abVar = this.engine;
        if (abVar != null) {
            abVar.w();
        }
        if (!a2) {
            return;
        }
        this.pageRenderIntercept.b(getContext(), this.host);
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.isDestroy = true;
        for (int i = 0; i <= this.upperViewContainer.getChildCount() - 1; i++) {
            this.upperViewContainer.getChildAt(i).getTag(R.id.layout_manager_tnode_upper_lifcycle);
        }
        ab abVar = this.engine;
        if (abVar == null) {
            return;
        }
        abVar.y();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else if (view == this.upperViewContainer || view == this.tnodeViewContainer) {
            ogg.a("upperViewContainer or tnodeViewContainer is not allowed to remove");
            if (!oec.e(getContext())) {
                return;
            }
            Toast.makeText(getContext(), "不允许删除upperView或者tnodeView容器", 0).show();
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.screenChangedListener == null) {
            this.screenChangedListener = new OnScreenChangedListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.TNodeView.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        return;
                    }
                    ogg.a("onScreenChanged, changeType: " + i);
                }
            };
        }
        com.taobao.android.autosize.h.a().c(this.screenChangedListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        com.taobao.android.autosize.h.a().d(this.screenChangedListener);
    }

    public void onSaveInstanceState(Map<String, Object> map) {
        aa rootNode;
        aa b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
        } else if (!oeb.a("enableSaveInstanceState", true) || (rootNode = getRootNode()) == null || (b2 = rootNode.b(TabBarControllerComponent.class)) == null) {
        } else {
            b2.I().onSaveInstanceState(map);
        }
    }

    public boolean isContainerResumed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebaa37eb", new Object[]{this})).booleanValue() : this.isResumed | this.isStarted;
    }

    public com.taobao.tao.flexbox.layoutmanager.container.i getRenderIntercept() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.container.i) ipChange.ipc$dispatch("4070f656", new Object[]{this}) : this.pageRenderIntercept;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }
}
