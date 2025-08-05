package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_ability.xr.a;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.juh;
import tb.juk;
import tb.jvq;
import tb.jvr;
import tb.jvs;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexContainerFragment extends Fragment implements com.taobao.android.weex.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String KEY_CONFIG = "config";
    public static final String KEY_INIT_DATA = "initData";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_WLM_URL = "wlmUrl";
    public static final String MUS_NAVIGATION_ADAPTER = "ali_ms_navigation";
    public static final String TLOG_MODULE = "Weex/WeexFragment/";
    private boolean downgrade;
    private com.taobao.android.weex.config.a mComputeScreenAdapter;
    private jvq mGestureEventListener;
    private boolean mIsPresetViewSize = false;
    private View.OnLayoutChangeListener mLayoutChangeListener;
    private a mOnDowngradeListener;
    private jvs mOverscrollListener;
    public FrameLayout mRenderContainer;
    private int mRenderViewHeight;
    private int mRenderViewWidth;
    private jvr mReportInfoListener;
    public FrameLayout mRootContainer;
    private i mSplashView;
    private boolean mViewCreated;
    public WeexInstance mWeexInstance;
    private com.taobao.android.weex.h mWeexInstanceListener;
    private com.taobao.android.weex_ability.xr.a mXRInitializer;
    public Object navigationAdapter;

    /* loaded from: classes6.dex */
    public interface a {
    }

    static {
        kge.a(-225080544);
        kge.a(1947023493);
    }

    public static /* synthetic */ Object ipc$super(WeexContainerFragment weexContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private void notifyDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8ae9b3", new Object[]{this});
        }
    }

    public static /* synthetic */ int access$000(WeexContainerFragment weexContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("35767df9", new Object[]{weexContainerFragment})).intValue() : weexContainerFragment.mRenderViewWidth;
    }

    public static /* synthetic */ int access$002(WeexContainerFragment weexContainerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db8c5ee", new Object[]{weexContainerFragment, new Integer(i)})).intValue();
        }
        weexContainerFragment.mRenderViewWidth = i;
        return i;
    }

    public static /* synthetic */ int access$100(WeexContainerFragment weexContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1137f9ba", new Object[]{weexContainerFragment})).intValue() : weexContainerFragment.mRenderViewHeight;
    }

    public static /* synthetic */ int access$102(WeexContainerFragment weexContainerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea26c24d", new Object[]{weexContainerFragment, new Integer(i)})).intValue();
        }
        weexContainerFragment.mRenderViewHeight = i;
        return i;
    }

    public static /* synthetic */ View.OnLayoutChangeListener access$200(WeexContainerFragment weexContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLayoutChangeListener) ipChange.ipc$dispatch("7e5c5ddb", new Object[]{weexContainerFragment}) : weexContainerFragment.mLayoutChangeListener;
    }

    /* loaded from: classes6.dex */
    public static class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<WeexContainerFragment> f15958a;
        private final JSONObject b;

        static {
            kge.a(1182444789);
            kge.a(1560838736);
        }

        public b(WeexContainerFragment weexContainerFragment, JSONObject jSONObject) {
            this.f15958a = new WeakReference<>(weexContainerFragment);
            this.b = jSONObject;
        }

        @Override // com.taobao.android.weex_ability.xr.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            WeexContainerFragment weexContainerFragment = this.f15958a.get();
            if (weexContainerFragment == null) {
                return;
            }
            weexContainerFragment.doInit(weexContainerFragment.getContext(), this.b);
        }

        @Override // com.taobao.android.weex_ability.xr.a.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            WeexContainerFragment weexContainerFragment = this.f15958a.get();
            if (weexContainerFragment == null || weexContainerFragment.mWeexInstance == null) {
                return;
            }
            weexContainerFragment.onRenderFailed(weexContainerFragment.mWeexInstance, false, WeexErrorType.ERR_RENDER, "XR initialize failed");
        }
    }

    public static WeexContainerFragment newInstance(String str, String str2, Map<String, String> map, JSONObject jSONObject, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexContainerFragment) ipChange.ipc$dispatch("f7282e7b", new Object[]{str, str2, map, jSONObject, map2});
        }
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        if (jSONObject != null) {
            bundle.putSerializable("initData", jSONObject);
        }
        if (map2 != null) {
            bundle.putString("options", JSON.toJSONString(map2));
        }
        if (map != null) {
            bundle.putString("config", JSON.toJSONString(map));
        }
        WeexContainerFragment weexContainerFragment = new WeexContainerFragment();
        weexContainerFragment.setArguments(bundle);
        return weexContainerFragment;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mViewCreated) {
            return this.mRootContainer;
        }
        this.mViewCreated = true;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_mus_page, viewGroup, false);
        this.mRootContainer = frameLayout;
        this.mRenderContainer = (FrameLayout) frameLayout.findViewById(R.id.render_container);
        this.mLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.weex_ability.page.WeexContainerFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                if (WeexContainerFragment.access$000(WeexContainerFragment.this) == 0 || WeexContainerFragment.access$100(WeexContainerFragment.this) == 0) {
                    WeexContainerFragment.access$002(WeexContainerFragment.this, i3 - i);
                    WeexContainerFragment.access$102(WeexContainerFragment.this, i4 - i2);
                    WeexContainerFragment.this.presetViewSize();
                }
                WeexContainerFragment.this.mRenderContainer.removeOnLayoutChangeListener(WeexContainerFragment.access$200(WeexContainerFragment.this));
            }
        };
        this.mRenderContainer.addOnLayoutChangeListener(this.mLayoutChangeListener);
        doInit(layoutInflater.getContext(), null);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doInit(android.content.Context r14, com.alibaba.fastjson.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.page.WeexContainerFragment.doInit(android.content.Context, com.alibaba.fastjson.JSONObject):void");
    }

    public void presetViewSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc864c", new Object[]{this});
        } else if (this.mRenderViewHeight == 0 || this.mRenderViewWidth == 0 || this.mIsPresetViewSize || this.mWeexInstance == null || getActivity() == null) {
        } else {
            this.mWeexInstance.updateContainerSize(this.mRenderViewWidth, this.mRenderViewHeight);
            this.mIsPresetViewSize = true;
        }
    }

    public void updateViewPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc2c5b6", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null || weexInstance.getExtend(juk.class) == null) {
            return;
        }
        ((juk) this.mWeexInstance.getExtend(juk.class)).c();
    }

    public void setWeexInstanceListener(com.taobao.android.weex.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba70481", new Object[]{this, hVar});
        } else {
            this.mWeexInstanceListener = hVar;
        }
    }

    public void setComputeScreenAdapter(com.taobao.android.weex.config.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6c7575", new Object[]{this, aVar});
        } else {
            this.mComputeScreenAdapter = aVar;
        }
    }

    public void setSplashView(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e4783a", new Object[]{this, iVar});
        } else {
            this.mSplashView = iVar;
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onInitSuccess(weexInstance, z);
    }

    @Override // com.taobao.android.weex.h
    public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onInitFailed(weexInstance, z, weexErrorType, str);
    }

    @Override // com.taobao.android.weex.h
    public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onRenderSuccess(weexInstance, z);
    }

    @Override // com.taobao.android.weex.h
    public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar != null) {
            hVar.onRenderFailed(weexInstance, z, weexErrorType, str);
        }
        downgrade();
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteSuccess(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onExecuteSuccess(weexInstance);
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onExecuteFailed(weexInstance, weexErrorType, str);
    }

    @Override // com.taobao.android.weex.h
    public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onScriptException(weexInstance, weexErrorType, str);
    }

    @Override // com.taobao.android.weex.h
    public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onEngineException(weexInstance, weexErrorType, str);
    }

    @Override // com.taobao.android.weex.h
    public void onDestroyed(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            return;
        }
        com.taobao.android.weex.h hVar = this.mWeexInstanceListener;
        if (hVar == null) {
            return;
        }
        hVar.onDestroyed(weexInstance);
    }

    public i provideSplashScreen(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("cc72c282", new Object[]{this, new Boolean(z)});
        }
        i iVar = this.mSplashView;
        return iVar != null ? iVar : new i() { // from class: com.taobao.android.weex_ability.page.WeexContainerFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.ui.i
            public View a(Context context, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("2955c7b6", new Object[]{this, context, bundle});
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                if (!z) {
                    return frameLayout;
                }
                frameLayout.setBackgroundColor(-1);
                ProgressBar progressBar = new ProgressBar(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                frameLayout.addView(progressBar);
                return frameLayout;
            }

            @Override // com.taobao.android.weex_framework.ui.i
            public void a(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("39112e6", new Object[]{this, runnable});
                } else {
                    runnable.run();
                }
            }
        };
    }

    public void setReportInfoListener(jvr jvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7382ac69", new Object[]{this, jvrVar});
        } else {
            this.mReportInfoListener = jvrVar;
        }
    }

    public void setOverScrollListener(jvs jvsVar) {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a05f807", new Object[]{this, jvsVar});
            return;
        }
        this.mOverscrollListener = jvsVar;
        if (jvsVar == null || (weexInstance = this.mWeexInstance) == null || weexInstance.getExtend(juh.class) == null) {
            return;
        }
        ((juh) this.mWeexInstance.getExtend(juh.class)).a(jvsVar);
    }

    public void setGestureEventListener(jvq jvqVar) {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb918d9", new Object[]{this, jvqVar});
            return;
        }
        this.mGestureEventListener = jvqVar;
        if (jvqVar == null || (weexInstance = this.mWeexInstance) == null || weexInstance.getExtend(juh.class) == null) {
            return;
        }
        ((juh) this.mWeexInstance.getExtend(juh.class)).a(jvqVar);
    }

    public void setNavigationAdapter(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b1ce3c", new Object[]{this, obj});
            return;
        }
        this.navigationAdapter = obj;
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.setTag("ali_ms_navigation", obj);
    }

    public WeexInstance getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("ded4f1a2", new Object[]{this}) : this.mWeexInstance;
    }

    public void downgrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.mWeexInstance = null;
        }
        FrameLayout frameLayout = this.mRenderContainer;
        if (frameLayout == null) {
            this.downgrade = true;
            notifyDowngrade();
            return;
        }
        frameLayout.removeAllViews();
        notifyDowngrade();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        realDestroy();
    }

    private void realDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfb5703", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.mWeexInstance = null;
        }
        FrameLayout frameLayout = this.mRootContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.mRootContainer = null;
        }
        com.taobao.android.weex_ability.xr.a aVar = this.mXRInitializer;
        if (aVar != null) {
            aVar.a();
            this.mXRInitializer = null;
        }
        this.mViewCreated = false;
    }

    public void setOnDowngradeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e9d021", new Object[]{this, aVar});
        } else {
            this.mOnDowngradeListener = aVar;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityResult(i, i2, intent);
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        WeexInstance weexInstance = this.mWeexInstance;
        if (weexInstance == null || !weexInstance.canGoBack()) {
            return false;
        }
        this.mWeexInstance.goBack();
        return true;
    }
}
