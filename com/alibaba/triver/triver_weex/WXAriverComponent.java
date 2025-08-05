package com.alibaba.triver.triver_weex;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.android.enhance.nested.nested.WXNestedHeader;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.android.triver.base.api.b;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.kit.api.proxy.IEnvProxy;
import com.alibaba.triver.triver_render.extension.PagePulldownPoint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.component.Scrollable;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXDiv;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Map;
import tb.kge;
import tb.rjd;

@Component(lazyload = false)
/* loaded from: classes3.dex */
public class WXAriverComponent extends WXDiv implements WXNestedHeader.c, PagePulldownPoint, WXSDKInstance.j, NestedContainer, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FragmentActivity mActivity;
    private boolean mEnablePullDown;
    private View mErrorView;
    private c mHelperWrapper;
    private a mInstanceOnScrollFireEventInterceptor;
    private boolean mIsVisible;
    private WXSwipeLayout.OnRefreshOffsetChangedListener mOnRefreshOffsetChangedListener;
    private String mSrc;
    public WXSDKInstance mWeexInstance;
    private WeexPageFragment mWeexPageFragment;

    static {
        kge.a(1030030388);
        kge.a(2010057944);
        kge.a(1389239202);
        kge.a(-1259996479);
        kge.a(1335175128);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(WXAriverComponent wXAriverComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1470271414:
                super.addEvent((String) objArr[0]);
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case -17468269:
                super.onActivityDestroy();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            case 1778838323:
                super.updateStyles((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_render.extension.PagePulldownPoint
    public void onRefresh(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281e3f97", new Object[]{this, app});
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public void renderNewURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6f31b6", new Object[]{this, str});
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public void setOnNestEventListener(NestedContainer.OnNestedInstanceEventListener onNestedInstanceEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b90a214", new Object[]{this, onNestedInstanceEventListener});
        }
    }

    public static /* synthetic */ c access$000(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("497134d", new Object[]{wXAriverComponent}) : wXAriverComponent.mHelperWrapper;
    }

    public static /* synthetic */ void access$100(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ab42f3", new Object[]{wXAriverComponent});
        } else {
            wXAriverComponent.launcherApp();
        }
    }

    public static /* synthetic */ View access$200(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e4064f36", new Object[]{wXAriverComponent}) : wXAriverComponent.mErrorView;
    }

    public static /* synthetic */ View access$202(WXAriverComponent wXAriverComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ced17bde", new Object[]{wXAriverComponent, view});
        }
        wXAriverComponent.mErrorView = view;
        return view;
    }

    public static /* synthetic */ FragmentActivity access$300(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("a4f77d08", new Object[]{wXAriverComponent}) : wXAriverComponent.mActivity;
    }

    @Deprecated
    public WXAriverComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public WXAriverComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mIsVisible = true;
        this.mEnablePullDown = true;
        wXSDKInstance.a(new WXSDKInstance.a() { // from class: com.alibaba.triver.triver_weex.WXAriverComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.WXSDKInstance.a
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                if (WXAriverComponent.access$000(WXAriverComponent.this) == null) {
                    return false;
                }
                return WXAriverComponent.access$000(WXAriverComponent.this).onBackPressed();
            }
        });
        wXSDKInstance.a(new WXSDKInstance.i() { // from class: com.alibaba.triver.triver_weex.WXAriverComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.WXSDKInstance.i
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                if (WXAriverComponent.access$000(WXAriverComponent.this) == null) {
                    return false;
                }
                return WXAriverComponent.access$000(WXAriverComponent.this).onBackPressed();
            }
        });
        this.mWeexInstance = wXSDKInstance;
        this.mInstanceOnScrollFireEventInterceptor = new a(this);
        this.mActivity = (FragmentActivity) getContext();
        try {
            if ("TM".equals(((IEnvProxy) RVProxy.get(IEnvProxy.class)).getEnvValue("appName"))) {
                Field declaredField = this.mActivity.getClass().getDeclaredField("mWeexPageFragment");
                declaredField.setAccessible(true);
                this.mWeexPageFragment = (WeexPageFragment) declaredField.get(this.mActivity);
            } else {
                Field declaredField2 = this.mActivity.getClass().getDeclaredField("mPageFragment");
                declaredField2.setAccessible(true);
                this.mWeexPageFragment = (WeexPageFragment) declaredField2.get(this.mActivity);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public ViewGroup getViewContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("bb9ebe48", new Object[]{this}) : (ViewGroup) mo1286getHostView();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        super.addEvent(str);
        if ("scrollstart".equals(str)) {
            this.mInstanceOnScrollFireEventInterceptor.addInterceptEvent(str);
        } else if ("scrollend".equals(str)) {
            this.mInstanceOnScrollFireEventInterceptor.addInterceptEvent(str);
        } else if (!"scroll".equals(str)) {
        } else {
            this.mInstanceOnScrollFireEventInterceptor.addInterceptEvent(str);
        }
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        this.mSrc = str;
        try {
            tryLauncherApp();
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
    }

    @WXComponentProp(name = "mEnablePullDown")
    public void setEnablePullDown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df61d281", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnablePullDown = z;
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateStyles(Map<String, Object> map) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a06eb33", new Object[]{this, map});
            return;
        }
        super.updateStyles(map);
        if (!map.containsKey("visibility")) {
            return;
        }
        if (TextUtils.equals("hidden", map.get("visibility").toString())) {
            c cVar2 = this.mHelperWrapper;
            if (cVar2 == null) {
                return;
            }
            this.mIsVisible = false;
            cVar2.onHidden();
            this.mHelperWrapper.onPause();
            this.mHelperWrapper.onStop();
        } else if (!TextUtils.equals("visible", map.get("visibility").toString()) || (cVar = this.mHelperWrapper) == null) {
        } else {
            this.mIsVisible = true;
            cVar.onVisible();
            this.mHelperWrapper.onResume();
        }
    }

    @JSMethod(uiThread = false)
    public void destroy(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33982167", new Object[]{this, jSCallback});
            return;
        }
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.destroyApp();
        this.mHelperWrapper = null;
    }

    @JSMethod(uiThread = false)
    public void relaunch(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a68383b", new Object[]{this, jSCallback});
        } else {
            tryLauncherApp();
        }
    }

    private void tryLauncherApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f575a32d", new Object[]{this});
        } else {
            b.a("WXAriverComponent", this.mSrc, ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC, this.mActivity, new ITriverRemoteProxy.a() { // from class: com.alibaba.triver.triver_weex.WXAriverComponent.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WXAriverComponent.access$100(WXAriverComponent.this);
                    }
                }

                @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    try {
                        WXAriverComponent.access$202(WXAriverComponent.this, View.inflate(WXAriverComponent.access$300(WXAriverComponent.this), R.layout.triver_remote_error, null));
                        ((TUrlImageView) WXAriverComponent.access$200(WXAriverComponent.this).findViewById(R.id.triver_error_icon)).setImageUrl("https://img.alicdn.com/tfs/TB1Hh2cQFXXXXbOXFXXXXXXXXXX-220-220.png");
                        WXAriverComponent.this.getViewContainer().addView(WXAriverComponent.access$200(WXAriverComponent.this));
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void launcherApp() {
        try {
            this.mHelperWrapper = (c) Class.forName("com.alibaba.triver.triver_weex.WeexTRViewHelperWrapper").getConstructor(FragmentActivity.class, WXSDKInstance.class, PagePulldownPoint.class, WeexPageFragment.class, ViewGroup.class, Boolean.TYPE).newInstance(this.mActivity, this.mWeexInstance, this, this.mWeexPageFragment, getViewContainer(), Boolean.valueOf(this.mEnablePullDown));
        } catch (Throwable unused) {
        }
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.init();
        this.mHelperWrapper.startApp(this.mSrc);
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mSrc = null;
        if (getInstance() == null) {
            return;
        }
        getInstance().b(this);
    }

    @Override // com.taobao.weex.WXSDKInstance.j
    public void onAppear() {
        WXSDKInstance wXSDKInstance;
        WXComponent z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else if (!this.mIsVisible || (wXSDKInstance = this.mWeexInstance) == null || (z = wXSDKInstance.z()) == null) {
        } else {
            z.fireEvent(Constants.Event.VIEWAPPEAR);
        }
    }

    @Override // com.taobao.weex.WXSDKInstance.j
    public void onDisappear() {
        WXSDKInstance wXSDKInstance;
        WXComponent z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
        } else if (!this.mIsVisible || (wXSDKInstance = this.mWeexInstance) == null || (z = wXSDKInstance.z()) == null) {
        } else {
            z.fireEvent(Constants.Event.VIEWDISAPPEAR);
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.onResume();
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.onStop();
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.onPause();
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        c cVar = this.mHelperWrapper;
        if (cVar == null) {
            return;
        }
        cVar.onDestroy();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void addLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c05be57", new Object[]{this, str});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.b(getRef());
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void removeLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0044e94", new Object[]{this, str});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.c(str);
    }

    @Override // com.alibaba.triver.triver_render.extension.PagePulldownPoint
    public void onReachPullRefreshDistance(App app, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e896bb1", new Object[]{this, app, new Integer(i)});
            return;
        }
        WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener = this.mOnRefreshOffsetChangedListener;
        if (onRefreshOffsetChangedListener == null) {
            return;
        }
        onRefreshOffsetChangedListener.onOffsetChanged(i);
    }

    public void addOnRefreshOffsetChangedListener(WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcb4314", new Object[]{this, onRefreshOffsetChangedListener});
        } else {
            this.mOnRefreshOffsetChangedListener = onRefreshOffsetChangedListener;
        }
    }

    /* loaded from: classes3.dex */
    public static class a extends rjd implements OnWXScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WXAriverComponent f4169a;
        private WXComponent b;

        static {
            kge.a(-1711929781);
            kge.a(931919082);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrollStateChanged(View view, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b177cda7", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        public a(WXAriverComponent wXAriverComponent) {
            this.f4169a = wXAriverComponent;
        }

        @Override // tb.rjd
        public void onFireEvent(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("883d45aa", new Object[]{this, str, str2, str3, map, map2});
                return;
            }
            WXAriverComponent wXAriverComponent = this.f4169a;
            if (wXAriverComponent == null || wXAriverComponent.mWeexInstance == null || !this.f4169a.mWeexInstance.N().equals(str)) {
                return;
            }
            if (this.b == null) {
                a();
            }
            WXComponent wXComponent = this.b;
            if (wXComponent == null || !wXComponent.getRef().equals(str2)) {
                return;
            }
            this.f4169a.getInstance().a(this.f4169a.getRef(), str3, map, map2);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.b == null) {
                this.b = b();
                if (this.b == null) {
                    return;
                }
                for (String str : getListenEvents()) {
                    if (!this.b.containsEvent(str)) {
                        this.b.getEvents().add(str);
                        this.b.addEvent(str);
                    }
                }
            }
        }

        private WXComponent b() {
            WXComponent wXComponent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("616217b2", new Object[]{this});
            }
            if (this.f4169a.mWeexInstance == null) {
                return null;
            }
            WXComponent z = this.f4169a.mWeexInstance.z();
            if (z instanceof Scrollable) {
                return z;
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.offer(z);
            while (!arrayDeque.isEmpty() && (wXComponent = (WXComponent) arrayDeque.poll()) != null) {
                if (wXComponent instanceof Scrollable) {
                    return wXComponent;
                }
                if (wXComponent instanceof WXVContainer) {
                    WXVContainer wXVContainer = (WXVContainer) wXComponent;
                    for (int i = 0; i < wXVContainer.getChildCount(); i++) {
                        arrayDeque.offer(wXVContainer.getChild(i));
                    }
                }
            }
            return null;
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrolled(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f253d1c0", new Object[]{this, view, new Integer(i), new Integer(i2)});
            } else if (this.b != null || getListenEvents().size() <= 0) {
            } else {
                a();
            }
        }
    }
}
