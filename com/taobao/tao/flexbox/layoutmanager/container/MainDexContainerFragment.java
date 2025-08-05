package com.taobao.tao.flexbox.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.containerlifecycle.TBFragmentContainer;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.taolive.room.utils.ag;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import tb.bip;
import tb.gvw;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ogt;
import tb.ohd;
import tb.ohh;

/* loaded from: classes8.dex */
public class MainDexContainerFragment extends TBBaseFragment implements d.InterfaceC0837d, l, ab.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAB2_INSTANCE_NAME = "tab2";
    private static final String TAG = "MainDexContainerFragment";
    private static Map<String, Map<String, Object>> instanceState;
    public Future dataFuture;
    private boolean isRestore;
    private boolean isResumeCalled;
    private d.c itbOnTabChangeListener;
    private Map<String, String> pageProperties;
    private TNodeView rootView;

    public static /* synthetic */ Object ipc$super(MainDexContainerFragment mainDexContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1542694236:
                super.onSupportInvisible();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public String getNewIntentEventName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ae1a31a", new Object[]{this}) : "onWeitaoListRefresh";
    }

    public static /* synthetic */ TNodeView access$000(MainDexContainerFragment mainDexContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("d79d825d", new Object[]{mainDexContainerFragment}) : mainDexContainerFragment.rootView;
    }

    public static /* synthetic */ ab access$100(MainDexContainerFragment mainDexContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("e5e36c5e", new Object[]{mainDexContainerFragment}) : mainDexContainerFragment.getTNodeEngine();
    }

    static {
        kge.a(-1500294422);
        kge.a(-1760409128);
        kge.a(26727213);
        kge.a(1800109709);
        instanceState = new HashMap();
    }

    public MainDexContainerFragment() {
        ogh.c();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            z = false;
        }
        this.isRestore = z;
        getArguments().putBoolean("isTNodeRecovery", this.isRestore);
        if (this.isRestore || getArguments().getLong("CLICK_TIME") <= 0) {
            return;
        }
        gvw.a(getContext(), Uri.parse(getUrl()));
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ogg.a(TAG, "APMdata onCreateView uptimeMillis=" + SystemClock.uptimeMillis());
        com.taobao.android.layoutmanager.container.d.a(true);
        ogh.a("MaindexFragment onCreateView");
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getLong("CLICK_TIME") > 0) {
            if (ogt.f32045a == 0) {
                ogt.f32045a = System.currentTimeMillis();
            }
            ogt.a(ogt.TASK_FRAGMENT_CREATE);
            ogt.a(ogt.TASK_FRAGMENT_CREATE, new JSONObject(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().c()));
        }
        if (this.rootView == null) {
            TNodeView create = TNodeView.create(getContext(), this, null, getUrl(), this.dataFuture, null, null);
            create.setBackgroundColor(-1);
            int[] containerSize = getContainerSize();
            if (containerSize[0] > 0 && containerSize[1] > 0) {
                create.prelayout(containerSize[0], containerSize[1]);
            }
            this.rootView = create;
            this.rootView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.rootView.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int measuredHeight = MainDexContainerFragment.access$000(MainDexContainerFragment.this).getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        return;
                    }
                    ohh.b(com.taobao.android.layoutmanager.container.d.MAIN_PAGE_HEIGHT, Integer.valueOf(measuredHeight));
                }
            });
        }
        ogh.b();
        if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().x() != null) {
            getContext();
        }
        w.a("onCreateView", getTNodeEngine());
        if (oeb.bO() && this.rootView.getParent() != null) {
            ((ViewGroup) this.rootView.getParent()).removeView(this.rootView);
        }
        return this.rootView;
    }

    private ab getTNodeEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("11c783b4", new Object[]{this});
        }
        TNodeView tNodeView = this.rootView;
        if (tNodeView == null) {
            return null;
        }
        return tNodeView.getEngine();
    }

    private aa getRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("3d74285d", new Object[]{this});
        }
        ab tNodeEngine = getTNodeEngine();
        if (tNodeEngine == null) {
            return null;
        }
        return tNodeEngine.A();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        ogg.a(TAG, "APMdata onAttach uptimeMillis=" + SystemClock.uptimeMillis());
        this.itbOnTabChangeListener = new d.c() { // from class: com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.d
            public void onTabChanged(int i, String str) {
                ab access$100;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                } else if (i != 1 || (access$100 = MainDexContainerFragment.access$100(MainDexContainerFragment.this)) == null) {
                } else {
                    access$100.u();
                }
            }
        };
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(this.itbOnTabChangeListener);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ogg.c(TAG, "onStart");
        super.onStart();
        if (isTBFragmentContainerShow()) {
            return;
        }
        mainOnStart();
    }

    private void mainOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1f8951", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.rootView;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onStart();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ogh.a("MaindexFragment onResume");
        super.onResume();
        ogg.c(TAG, "onResume");
        if (isTBFragmentContainerShow()) {
            return;
        }
        mainOnResume(false);
        ogh.b();
        w.a("onResume", getTNodeEngine());
        ogg.c(TAG, "onResume end");
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ogg.c(TAG, "onPause");
        if (isTBFragmentContainerShow()) {
            return;
        }
        mainOnPause(false);
        w.a("onPause", getTNodeEngine());
    }

    private void mainOnResume(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd869288", new Object[]{this, new Boolean(z)});
            return;
        }
        ogg.c(TAG, "mainOnResume doPageAppear:" + z);
        if (z && getActivity() != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity());
            if (this.pageProperties != null) {
                if (oeb.bx()) {
                    resetUtParams();
                }
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), this.pageProperties);
            }
        }
        setDisappearFlag(false);
        this.isResumeCalled = true;
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(1, this);
        getTNodeEngine();
        getRootNode();
        TNodeView tNodeView = this.rootView;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onResume();
    }

    private void resetUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100cadfb", new Object[]{this});
            return;
        }
        try {
            l.c orNewUTPageStateObject = com.ut.mini.l.getInstance().getOrNewUTPageStateObject(getActivity());
            if (this.pageProperties.get(bip.KEY_UMBRELLA_SPM_PRE) != null) {
                orNewUTPageStateObject.mSpmPre = oec.a((Object) this.pageProperties.get(bip.KEY_UMBRELLA_SPM_PRE), orNewUTPageStateObject.mSpmPre);
                com.ut.mini.l.getInstance().setLastCacheKeySpmUrl(orNewUTPageStateObject.mSpmPre);
            }
            if (this.pageProperties.get("spm-url") != null) {
                orNewUTPageStateObject.mSpmUrl = oec.a((Object) this.pageProperties.get("spm-url"), orNewUTPageStateObject.mSpmUrl);
            }
            if (this.pageProperties.get(ag.KEY_UTPARAM_URL) != null) {
                orNewUTPageStateObject.mUtparamUrl = oec.a((Object) this.pageProperties.get(ag.KEY_UTPARAM_URL), orNewUTPageStateObject.mUtparamUrl);
            }
            if (this.pageProperties.get("utparam-pre") != null) {
                orNewUTPageStateObject.mUtparamPre = oec.a((Object) this.pageProperties.get("utparam-pre"), orNewUTPageStateObject.mUtparamPre);
            }
            if (this.pageProperties.get("scm") != null) {
                orNewUTPageStateObject.mScmUrl = oec.a((Object) this.pageProperties.get("scm"), orNewUTPageStateObject.mScmUrl);
            }
            if (this.pageProperties.get("scm-pre") == null) {
                return;
            }
            orNewUTPageStateObject.mScmPre = oec.a((Object) this.pageProperties.get("scm-pre"), orNewUTPageStateObject.mScmPre);
            com.ut.mini.l.getInstance().setLastCacheKeyScmUrl(orNewUTPageStateObject.mScmPre);
        } catch (Throwable th) {
            ogg.a("MaindexContainerFragment", "resetUtParams" + th.getMessage());
        }
    }

    private void mainOnPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6ce8f", new Object[]{this, new Boolean(z)});
            return;
        }
        ogg.c(TAG, "mainOnPause doPageDisAppear:" + z);
        if (getActivity() != null) {
            this.pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(getActivity());
        }
        TabBarControllerComponent.f20080a = false;
        ab tNodeEngine = getTNodeEngine();
        aa rootNode = getRootNode();
        TNodeView tNodeView = this.rootView;
        if (tNodeView != null) {
            tNodeView.onPause();
        }
        if (tNodeEngine == null || rootNode == null) {
            setDisappearFlag(true);
        }
        if (!z || getActivity() == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        ogg.c(TAG, "onDestroyView");
        w.a("onDestroyView", getTNodeEngine());
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        ogg.c(TAG, "onDetach");
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().b(this.itbOnTabChangeListener);
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(1, (d.InterfaceC0837d) null);
        TNodeView tNodeView = this.rootView;
        if (tNodeView != null) {
            tNodeView.onDestroy();
        }
        com.taobao.android.layoutmanager.container.d.a(false);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ogg.c(TAG, MessageID.onStop);
        if (isTBFragmentContainerShow()) {
            return;
        }
        mainOnStop();
    }

    private void mainOnStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f45ad21", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.rootView;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onStop();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ogg.c(TAG, MessageID.onDestroy);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else if (intent != null) {
            ogg.c(TAG, "onNewIntent");
            if (intent.getBooleanExtra(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m.EXTRA_POP_TO, false)) {
                ogg.c(TAG, "popTo触发onNewIntent, 不需要刷新");
                return;
            }
            Uri data = intent.getData();
            if (isTBFragmentContainerShow() && oeb.a("fixTab2NewIntent", true)) {
                pop();
            }
            String newIntentEventName = getNewIntentEventName();
            if (data != null) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                HashMap hashMap2 = new HashMap();
                for (String str : queryParameterNames) {
                    hashMap2.put(str, data.getQueryParameter(str));
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            ab tNodeEngine = getTNodeEngine();
            if (tNodeEngine == null) {
                return;
            }
            aa rootNode = getRootNode();
            tNodeEngine.b(0, rootNode, newIntentEventName, rootNode != null ? oec.a(rootNode.e(newIntentEventName), (String) null) : null, hashMap, null);
        }
    }

    private int[] getContainerSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("85cabc51", new Object[]{this});
        }
        int[] iArr = new int[2];
        if (oeb.w() && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w() != null && !com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w().c()) {
            int b = ohd.b(getContext());
            int a2 = com.taobao.android.layoutmanager.container.d.a((Activity) getContext());
            iArr[0] = b;
            iArr[1] = a2;
        }
        return iArr;
    }

    public String getUrl() {
        Bundle arguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        Intent intent = getActivity().getIntent();
        StringBuilder sb = new StringBuilder();
        Uri data = intent.getData();
        if (data != null) {
            for (String str : data.getQueryParameterNames()) {
                sb.append("&" + str + "=" + Uri.encode(data.getQueryParameter(str)));
            }
        }
        if (!this.isRestore && (arguments = getArguments()) != null && arguments.getLong("CLICK_TIME") > 0) {
            sb.append("&clickEnter=true");
        }
        String string = getArguments().getString("url");
        return string + sb.toString();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d.InterfaceC0837d
    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            return;
        }
        aa rootNode = getRootNode();
        if (rootNode == null || rootNode.x() == null) {
            return;
        }
        rootNode.k().b(2, rootNode, "onforcerefresh", null, null, null);
    }

    public boolean isResumeCalled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("106b2df", new Object[]{this})).booleanValue() : this.isResumeCalled;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.c
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue() : isDetached() || isRemoving() || (getActivity() != null && getActivity().isFinishing());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.c
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue() : !isDestroy() && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().b() == 1;
    }

    public void setDisappearFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf83ee0", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("disappear_flag", z);
        try {
            setArguments(arguments);
        } catch (IllegalStateException e) {
            ogg.b(e.getMessage());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.l
    public boolean push(String str, List<Pair<View, String>> list, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7614263c", new Object[]{this, str, list, bundle})).booleanValue();
        }
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (w != null && w.f()) {
            ogg.c("折叠屏或者pad， 不开启fragment模式");
            return false;
        } else if (isTBFragmentContainerShow()) {
            ogg.c("当前已经打开了一个TBFragmentContainer");
            return false;
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b == null || !b.d()) {
                ogg.c("当前手淘未打开Fragment模式");
                return false;
            }
            mainOnPause(true);
            mainOnStop();
            com.taobao.android.layoutmanager.container.containerlifecycle.c.a(str);
            TBFragmentContainer tBFragmentContainer = new TBFragmentContainer();
            Bundle bundle2 = new Bundle();
            bundle2.putString("url", str);
            bundle2.putBundle("params", bundle);
            tBFragmentContainer.setArguments(bundle2);
            tBFragmentContainer.setSharedViewInfo(this.rootView, list);
            ((SupportActivity) getActivity()).start(tBFragmentContainer, 0, 2);
            return true;
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
        } else {
            super.onSupportVisible();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
        } else {
            super.onSupportInvisible();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.l
    public boolean pop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e863a65c", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof SupportActivity) || !(com.taobao.tao.tbmainfragment.i.a(getActivity().getSupportFragmentManager()) instanceof TBFragmentContainer)) {
            return false;
        }
        ((SupportActivity) getActivity()).pop();
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.l
    public void onTBFragmentContainerDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3aba1dd", new Object[]{this});
        } else if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().b() != 1) {
        } else {
            mainOnStart();
            mainOnResume(true);
        }
    }

    private boolean isTBFragmentContainerShow() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec61d601", new Object[]{this})).booleanValue();
        }
        if (getActivity() != null && (fragments = getActivity().getSupportFragmentManager().getFragments()) != null) {
            for (Fragment fragment : fragments) {
                if ((fragment instanceof TBFragmentContainer) && !fragment.isDetached() && !fragment.isRemoving()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        aa rootNode = getRootNode();
        if (i == 4 && rootNode != null) {
            if (rootNode.k().x()) {
                return true;
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (!(b != null && b.g())) {
                b.a(false, true);
                return true;
            }
        }
        return super.onPanelKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        String instanceName = getInstanceName();
        Map<String, Object> map = instanceState.get(instanceName);
        if (map == null) {
            map = new HashMap<>();
            instanceState.put(instanceName, map);
        }
        TNodeView tNodeView = this.rootView;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onSaveInstanceState(map);
    }

    public String getInstanceName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5010a983", new Object[]{this}) : getClass().getSimpleName().equals("GuangGuangTnodeMainFragment") ? "tab2" : "";
    }

    public static Map getInstanceState(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6a25e14c", new Object[]{str}) : instanceState.get(str);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ab tNodeEngine = getTNodeEngine();
        if (tNodeEngine == null) {
            return;
        }
        tNodeEngine.a(i, i2, intent);
    }
}
