package com.alibaba.aliweex.bundle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.b;
import com.alibaba.aliweex.bundle.k;
import com.alibaba.aliweex.bundle.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.view.WXScrollView;
import com.taobao.weex.utils.WXExceptionUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.amu;
import tb.kge;

/* loaded from: classes2.dex */
public class WeexPageFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String FRAGMENT_ARG_BUNDLE_URL = null;
    public static String FRAGMENT_ARG_CUSTOM_OPT = null;
    public static String FRAGMENT_ARG_FROM_ACTIVITY = null;
    public static String FRAGMENT_ARG_INIT_DATA = null;
    public static String FRAGMENT_ARG_RENDER_URL = null;
    public static String FRAGMENT_ARG_TAG = null;
    public static String FRAGMENT_ARG_TEMPLATE = null;
    @Deprecated
    public static String FRAGMENT_ARG_URI = null;
    public static String FRAGMENT_TAG = null;
    private static final String TAG = "WeexPageFragment";
    public static final String WX_RENDER_STRATEGY = "render_strategy";
    private k.c mDynamicUrlPresenter;
    private k.d mErrorView;
    private Boolean mFullScreen;
    private j mNavBarAdapter;
    private boolean mNoAnimated;
    private m.c mProgressBarView;
    private BroadcastReceiver mRefreshReceiver;
    private BroadcastReceiver mReloadReceiver;
    private a mRenderListener;
    private k.e mRenderPresenter;
    private FrameLayout mRootView;
    private k.f mUTPresenter;
    private k.g mUrlValidate;
    public String mFtag = FRAGMENT_TAG;
    private boolean mUTEnable = true;
    private boolean mDyUrlEnable = false;
    private boolean mEnableUnicornWeexRender = false;
    private amu.a mOnBackPressedListener = null;
    private RenderContainer mRenderContainer = null;
    private boolean mIsHeron = false;
    public l mWXRenderListener = null;

    /* loaded from: classes2.dex */
    public static class a implements com.taobao.weex.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1509814396);
            kge.a(-748561575);
        }

        public boolean needWrapper() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae2c8d28", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view}) : view;
        }

        @Override // com.taobao.weex.d
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            }
        }

        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
            }
        }

        @Override // com.taobao.weex.d
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.weex.d
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.weex.d
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }
    }

    public static /* synthetic */ Object ipc$super(WeexPageFragment weexPageFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
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
            case 188604040:
                super.onStop();
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void onWXException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda540c", new Object[]{this, wXSDKInstance, str, str2});
        }
    }

    static {
        kge.a(1721214460);
        FRAGMENT_TAG = "weex_page";
        FRAGMENT_ARG_URI = "arg_uri";
        FRAGMENT_ARG_TAG = "arg_tag";
        FRAGMENT_ARG_BUNDLE_URL = "arg_bundle_url";
        FRAGMENT_ARG_RENDER_URL = "arg_render_url";
        FRAGMENT_ARG_TEMPLATE = "arg_template";
        FRAGMENT_ARG_CUSTOM_OPT = "arg_custom_opt";
        FRAGMENT_ARG_INIT_DATA = "arg_init_data";
        FRAGMENT_ARG_FROM_ACTIVITY = "arg_from_activity";
    }

    @Deprecated
    public static Fragment newInstance(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("ecf3b645", new Object[]{fragmentActivity, cls, str, new Integer(i)}) : installFragment(fragmentActivity, cls, null, str, str, null, null, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("9ceffcfc", new Object[]{fragmentActivity, cls, str, str2, new Integer(i)}) : installFragment(fragmentActivity, cls, null, str, str2, null, null, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i, Serializable serializable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("38711590", new Object[]{fragmentActivity, cls, str, str2, new Integer(i), serializable}) : installFragment(fragmentActivity, cls, null, str, str2, null, null, i, null, serializable);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("124ebd11", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i)}) : installFragment(fragmentActivity, cls, null, str, str2, hashMap, str3, i, null, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("f15c511b", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i), str4}) : installFragment(fragmentActivity, cls, null, str, str2, hashMap, str3, i, str4, null);
    }

    public static Fragment newInstanceWithUrl(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i, String str4, Serializable serializable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("7627f86f", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i), str4, serializable}) : installFragment(fragmentActivity, cls, null, str, str2, hashMap, str3, i, str4, serializable);
    }

    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("6ff77dbb", new Object[]{fragmentActivity, cls, str, str2, new Integer(i)}) : installFragment(fragmentActivity, cls, str, str2, null, null, null, i, null, null);
    }

    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("529a17b2", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i)}) : installFragment(fragmentActivity, cls, str, str2, null, hashMap, str3, i, null, null);
    }

    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, HashMap<String, Object> hashMap, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("136ca57c", new Object[]{fragmentActivity, cls, str, str2, hashMap, str3, new Integer(i), str4}) : installFragment(fragmentActivity, cls, str, str2, null, hashMap, str3, i, str4, null);
    }

    @Deprecated
    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("b1267e45", new Object[]{fragmentActivity, cls, str, new Integer(i)}) : installFragment(fragmentActivity, cls, str, null, null, null, null, i, null, null);
    }

    @Deprecated
    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, HashMap<String, Object> hashMap, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("e9538568", new Object[]{fragmentActivity, cls, str, hashMap, str2, new Integer(i)}) : installFragment(fragmentActivity, cls, str, null, null, hashMap, str2, i, null, null);
    }

    @Deprecated
    public static Fragment newInstanceWithTemplate(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, HashMap<String, Object> hashMap, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("90a651b2", new Object[]{fragmentActivity, cls, str, hashMap, str2, new Integer(i), str3}) : installFragment(fragmentActivity, cls, str, null, null, hashMap, str2, i, str3, null);
    }

    public static Fragment newInstance(Context context, Class<? extends WeexPageFragment> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("28770bc7", new Object[]{context, cls, str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString(FRAGMENT_ARG_BUNDLE_URL, str);
        bundle.putString(FRAGMENT_ARG_RENDER_URL, str2);
        Fragment instantiate = Fragment.instantiate(context, cls.getName(), bundle);
        instantiate.setArguments(bundle);
        return instantiate;
    }

    private static Fragment installFragment(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, String str3, HashMap<String, Object> hashMap, String str4, int i, String str5, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("1e78c910", new Object[]{fragmentActivity, cls, str, str2, str3, hashMap, str4, new Integer(i), str5, serializable});
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        String str6 = StringUtils.isEmpty(str5) ? FRAGMENT_TAG : str5;
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str6);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        Bundle bundle = new Bundle();
        bundle.putString(FRAGMENT_ARG_TAG, str6);
        if (!StringUtils.isEmpty(str)) {
            bundle.putString(FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!StringUtils.isEmpty(str2)) {
            bundle.putString(FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            bundle.putString(FRAGMENT_ARG_RENDER_URL, str3);
        }
        if (hashMap != null) {
            bundle.putSerializable(FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (!StringUtils.isEmpty(str4)) {
            bundle.putString(FRAGMENT_ARG_INIT_DATA, str4);
        }
        if (serializable != null) {
            bundle.putSerializable(FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        Fragment instantiate = Fragment.instantiate(fragmentActivity, cls.getName(), bundle);
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (StringUtils.isEmpty(str5)) {
            str5 = FRAGMENT_TAG;
        }
        beginTransaction.add(i, instantiate, str5);
        beginTransaction.commitAllowingStateLoss();
        return instantiate;
    }

    public void setUserTrackEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc442ac", new Object[]{this, new Boolean(z)});
        } else {
            this.mUTEnable = z;
        }
    }

    public void setUserTrackPresenter(k.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a8b72f", new Object[]{this, fVar});
        } else {
            this.mUTPresenter = fVar;
        }
    }

    public void setDynamicUrlEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d3e178", new Object[]{this, new Boolean(z)});
        } else {
            this.mDyUrlEnable = z;
        }
    }

    public void setProgressBarView(m.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caec832f", new Object[]{this, cVar});
        } else {
            this.mProgressBarView = cVar;
        }
    }

    public void setErrorView(k.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d779e32", new Object[]{this, dVar});
        } else {
            this.mErrorView = dVar;
        }
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        k.e eVar = this.mRenderPresenter;
        return eVar != null ? eVar.k() : "";
    }

    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this});
        }
        k.e eVar = this.mRenderPresenter;
        return eVar != null ? eVar.l() : "";
    }

    public String getRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        k.e eVar = this.mRenderPresenter;
        return eVar != null ? eVar.m() : "";
    }

    public String getOriginalRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("992695c7", new Object[]{this});
        }
        k.e eVar = this.mRenderPresenter;
        return eVar != null ? eVar.n() : "";
    }

    public void setRenderListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a401dd55", new Object[]{this, aVar});
            return;
        }
        this.mRenderListener = aVar;
        l lVar = this.mWXRenderListener;
        if (lVar == null || lVar.a() != null) {
            return;
        }
        com.alibaba.aliweex.d.a().a("ReSetRenderListener", null);
        this.mWXRenderListener.a(aVar);
    }

    public void setNavBarAdapter(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39078a05", new Object[]{this, jVar});
        } else {
            this.mNavBarAdapter = jVar;
        }
    }

    public j getNavBarAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("4853bb87", new Object[]{this}) : this.mNavBarAdapter;
    }

    public NestedContainer getNestedContainer(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedContainer) ipChange.ipc$dispatch("984d011a", new Object[]{this, wXSDKInstance});
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return null;
        }
        return eVar.a(wXSDKInstance);
    }

    @Deprecated
    public void startRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad0d929", new Object[]{this, str});
        } else {
            startRenderByTemplate(str, null, null);
        }
    }

    @Deprecated
    public void startRender(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7fbe06", new Object[]{this, str, map, str2});
        } else {
            startRenderByTemplate(str, map, str2);
        }
    }

    @Deprecated
    public void startRenderWXByUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb1f2ba", new Object[]{this, str, str2});
        } else {
            startRenderByUrl(null, null, str, str2);
        }
    }

    @Deprecated
    public void startRenderWXByUrl(Map<String, Object> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611ab6bd", new Object[]{this, map, str, str2, str3});
        } else {
            startRenderByUrl(map, str, str2, str3);
        }
    }

    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    public void replace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244830cf", new Object[]{this, str, str2});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.a(str, str2);
    }

    public void destroyWeex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fea622", new Object[]{this});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar != null) {
            eVar.b();
        }
        if (getFragmentManager() == null) {
            return;
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    @Deprecated
    public void startRenderByTemplate(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f9cad5", new Object[]{this, str, map, str2});
        } else {
            startRenderByTemplate(str, "", map, str2);
        }
    }

    public void startRenderByTemplate(String str, String str2, Map<String, Object> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f1ccb", new Object[]{this, str, str2, map, str3});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.a(str, str2, map, str3);
    }

    public void startRenderByUrl(Map<String, Object> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b8979c", new Object[]{this, map, str, str2, str3});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.a(map, str, str2, str3);
    }

    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.a(str, map);
    }

    public void fireGlobalEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143b6cd3", new Object[]{this, str, map});
            return;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null || eVar.c() == null) {
            return;
        }
        this.mRenderPresenter.c().a(str, map);
    }

    public WXSDKInstance getWXSDKInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("169676dd", new Object[]{this}) : this.mRenderPresenter.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        parseArgsFromActivity();
        registerBroadcastReceiver();
        setHasOptionsMenu(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.mEnableUnicornWeexRender = enableUnicornRender();
        if (this.mUTEnable) {
            if (this.mUTPresenter == null) {
                this.mUTPresenter = new e(getActivity());
            }
            this.mUTPresenter.c();
        }
        if (this.mDyUrlEnable && this.mDynamicUrlPresenter == null) {
            this.mDynamicUrlPresenter = new c();
        }
        if (!this.mEnableUnicornWeexRender && this.mProgressBarView == null) {
            this.mProgressBarView = new b.C0062b();
        }
        if (this.mUrlValidate != null) {
            return;
        }
        this.mUrlValidate = new g(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || getContext() == null) {
            return;
        }
        String string = arguments.getString(FRAGMENT_ARG_URI);
        String string2 = arguments.getString(FRAGMENT_ARG_BUNDLE_URL);
        String string3 = arguments.getString(FRAGMENT_ARG_RENDER_URL);
        String string4 = arguments.getString(FRAGMENT_ARG_TEMPLATE);
        HashMap hashMap = (HashMap) arguments.getSerializable(FRAGMENT_ARG_CUSTOM_OPT);
        String string5 = arguments.getString(FRAGMENT_ARG_INIT_DATA);
        if (this.mRenderPresenter != null && getContext() != null) {
            this.mRenderPresenter.a(this.mRootView, hashMap, string5, string4, string2, string3, string);
        }
        arguments.remove(FRAGMENT_ARG_TEMPLATE);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        m.c cVar = this.mProgressBarView;
        if (cVar != null) {
            frameLayout.addView(cVar.a(getContext()));
        }
        ViewStub viewStub = new ViewStub(getContext());
        viewStub.setId(R.id.wx_fragment_error);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub.setLayoutResource(R.layout.weex_content_error);
        viewStub.setVisibility(8);
        frameLayout.addView(viewStub);
        this.mRootView = frameLayout;
        return frameLayout;
    }

    private boolean isScollViewOnTop(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2546fdc6", new Object[]{this, viewGroup})).booleanValue();
        }
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            if ((childAt instanceof WXScrollView) && ((WXScrollView) childAt).getScrollY() == 0) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isAtTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a568d1a3", new Object[]{this})).booleanValue();
        }
        try {
            boolean isScollViewOnTop = (!(this.mRootView.getParent() instanceof FrameLayout) || !(((FrameLayout) this.mRootView.getParent()).getChildAt(1) instanceof ViewGroup)) ? false : isScollViewOnTop((ViewGroup) ((FrameLayout) this.mRootView.getParent()).getChildAt(1));
            if (isScollViewOnTop) {
                return isScollViewOnTop;
            }
            try {
                if (this.mRootView == null || this.mRootView.getChildCount() <= 0) {
                    return isScollViewOnTop;
                }
                View childAt = this.mRootView.getChildAt(0);
                return childAt instanceof ViewGroup ? isScollViewOnTop((ViewGroup) childAt) : isScollViewOnTop;
            } catch (Exception unused) {
                return isScollViewOnTop;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    public void addViewToRoot(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87827908", new Object[]{this, view});
            return;
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(view);
    }

    public void setRenderContainer(RenderContainer renderContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76916e13", new Object[]{this, renderContainer, new Boolean(z)});
            return;
        }
        this.mRenderContainer = renderContainer;
        this.mIsHeron = false;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.mRenderPresenter != null) {
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("ListenerValue", this.mRenderListener == null ? "No" : "Yes");
        com.alibaba.aliweex.d.a().a("createWXRenderListener", hashMap);
        this.mWXRenderListener = new l(this.mRootView, this.mProgressBarView, this.mUTPresenter, this.mRenderListener, new a() { // from class: com.alibaba.aliweex.bundle.WeexPageFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1997000981) {
                    super.onException((WXSDKInstance) objArr[0], (String) objArr[1], (String) objArr[2]);
                    return null;
                } else if (hashCode != -1632936177) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onViewCreated((WXSDKInstance) objArr[0], (View) objArr[1]);
                    return null;
                }
            }

            @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view2});
                    return;
                }
                super.onViewCreated(wXSDKInstance, view2);
                WeexPageFragment.this.onWXViewCreated(wXSDKInstance, view2);
            }

            @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                    return;
                }
                super.onException(wXSDKInstance, str, str2);
                WeexPageFragment.this.onWXException(wXSDKInstance, str, str2);
            }
        });
        this.mRenderPresenter = createRenderPresenter(this.mWXRenderListener, this.mUTPresenter, this.mDynamicUrlPresenter, this.mProgressBarView, this.mUrlValidate);
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        if (this.mErrorView == null) {
            this.mErrorView = new b.a(eVar);
        }
        this.mWXRenderListener.a(this.mErrorView);
        transformUrl();
        this.mRenderPresenter.a(this.mRenderContainer);
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        if (this.mNavBarAdapter != null) {
            WXSDKManager.getInstance().setActivityNavBarSetter(this.mNavBarAdapter);
        }
        getActivity().invalidateOptionsMenu();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.e();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        k.f fVar = this.mUTPresenter;
        if (fVar != null) {
            fVar.b();
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar != null) {
            eVar.f();
        }
        if (this.mNoAnimated && getActivity() != null) {
            getActivity().overridePendingTransition(0, 0);
        }
        WXSDKManager.getInstance().setActivityNavBarSetter(null);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        showFullScreenSystemStatusbar();
        k.f fVar = this.mUTPresenter;
        if (fVar != null) {
            fVar.a(getUrl());
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar != null) {
            eVar.g();
        }
        if (this.mNavBarAdapter == null) {
            return;
        }
        WXSDKManager.getInstance().setActivityNavBarSetter(this.mNavBarAdapter);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        k.e eVar = this.mRenderPresenter;
        if (eVar != null) {
            eVar.h();
        }
        k.d dVar = this.mErrorView;
        if (dVar != null) {
            dVar.a();
        }
        if (WXEnvironment.isApkDebugable() && this.mRefreshReceiver != null) {
            getActivity().unregisterReceiver(this.mRefreshReceiver);
            this.mRefreshReceiver = null;
        }
        if (this.mReloadReceiver != null) {
            getActivity().unregisterReceiver(this.mReloadReceiver);
            this.mReloadReceiver = null;
        }
        k.f fVar = this.mUTPresenter;
        if (fVar != null) {
            fVar.d();
        }
        j jVar = this.mNavBarAdapter;
        if (jVar == null) {
            return;
        }
        jVar.destroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return;
        }
        eVar.a(menu);
    }

    public void setBackPressedListener(amu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6bd6be", new Object[]{this, aVar});
        } else {
            this.mOnBackPressedListener = aVar;
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        amu.a aVar = this.mOnBackPressedListener;
        if (aVar != null) {
            aVar.a(0);
            return true;
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return false;
        }
        return eVar.i();
    }

    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        k.e eVar = this.mRenderPresenter;
        if (eVar == null) {
            return false;
        }
        return eVar.j();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        k.e eVar = this.mRenderPresenter;
        if (eVar != null) {
            eVar.a(i, i2, intent);
        }
        Intent intent2 = intent == null ? new Intent() : new Intent(intent);
        intent2.setAction(WXModule.ACTION_ACTIVITY_RESULT);
        intent2.putExtra("requestCode", i);
        intent2.putExtra("resultCode", i2);
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent2);
    }

    public void onWXViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be11bc0e", new Object[]{this, wXSDKInstance, view});
            return;
        }
        if ((wXSDKInstance instanceof AliWXSDKInstance) && getNavBarAdapter() != null) {
            ((AliWXSDKInstance) wXSDKInstance).a(getNavBarAdapter());
        }
        k.g gVar = this.mUrlValidate;
        if (gVar == null) {
            return;
        }
        gVar.a(wXSDKInstance, view);
    }

    public k.e createRenderPresenter(com.taobao.weex.d dVar, k.f fVar, k.c cVar, m.c cVar2, k.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k.e) ipChange.ipc$dispatch("e8be68df", new Object[]{this, dVar, fVar, cVar, cVar2, gVar}) : new d(getActivity(), this.mFtag, dVar, fVar, cVar, cVar2, getNavBarAdapter(), gVar, this.mEnableUnicornWeexRender);
    }

    private void transformUrl() {
        k.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9943b56a", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString(FRAGMENT_ARG_URI);
        String string2 = arguments.getString(FRAGMENT_ARG_BUNDLE_URL);
        String string3 = arguments.getString(FRAGMENT_ARG_RENDER_URL);
        if (!StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string3)) {
            k.e eVar2 = this.mRenderPresenter;
            if (eVar2 == null) {
                return;
            }
            eVar2.b(string2, string3);
        } else if (StringUtils.isEmpty(string) || (eVar = this.mRenderPresenter) == null) {
        } else {
            eVar.b(string, string);
        }
    }

    private void registerBroadcastReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3799b774", new Object[]{this});
            return;
        }
        if (WXEnvironment.isApkDebugable()) {
            this.mRefreshReceiver = new BroadcastReceiver() { // from class: com.alibaba.aliweex.bundle.WeexPageFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else {
                        WeexPageFragment.this.reload();
                    }
                }
            };
            getActivity().registerReceiver(this.mRefreshReceiver, new IntentFilter("DEBUG_INSTANCE_REFRESH"));
        }
        try {
            this.mReloadReceiver = new BroadcastReceiver() { // from class: com.alibaba.aliweex.bundle.WeexPageFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (WeexPageFragment.this.getContext() == null) {
                    } else {
                        WeexPageFragment.this.reload();
                    }
                }
            };
            getActivity().registerReceiver(this.mReloadReceiver, new IntentFilter("INSTANCE_RELOAD"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void showFullScreenSystemStatusbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ec5321", new Object[]{this});
        } else if (this.mFullScreen == null || getActivity() == null || !this.mFullScreen.booleanValue() || Build.VERSION.SDK_INT < 16) {
        } else {
            try {
                getActivity().getWindow().getDecorView().setSystemUiVisibility(4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void showFullScreenActionbar() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbc8c4c", new Object[]{this});
        } else if (this.mFullScreen == null || getActivity() == null || !this.mFullScreen.booleanValue() || Build.VERSION.SDK_INT < 16) {
        } else {
            try {
                if (getActivity().getActionBar() != null) {
                    getActivity().getActionBar().hide();
                    return;
                }
                try {
                    Class.forName("android.support.v7.app.AppCompatActivity");
                    z = true;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if (!z || !(getActivity() instanceof AppCompatActivity) || (supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar()) == null) {
                    return;
                }
                supportActionBar.e();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void parseArgsFromActivity() {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148d4730", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        Serializable serializable = arguments.getSerializable(FRAGMENT_ARG_FROM_ACTIVITY);
        this.mFtag = arguments.getString(FRAGMENT_ARG_TAG);
        if (!(serializable instanceof Map)) {
            return;
        }
        Map map = (Map) serializable;
        String str = (String) map.get("orientation");
        if (!StringUtils.isEmpty(str) && str.equalsIgnoreCase("landscape") && getActivity() != null) {
            String str2 = (String) map.get("preferredOrientation");
            if ("landscapeRight".equalsIgnoreCase(str2)) {
                getActivity().setRequestedOrientation(0);
            } else if ("landscapeLeft".equalsIgnoreCase(str2)) {
                getActivity().setRequestedOrientation(8);
            } else {
                getActivity().setRequestedOrientation(6);
            }
        }
        this.mFullScreen = Boolean.valueOf((String) map.get("fullscreen"));
        showFullScreenSystemStatusbar();
        showFullScreenActionbar();
        Object obj = map.get("animated");
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            booleanValue = Boolean.parseBoolean((String) obj);
        } else {
            booleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
        }
        if (!booleanValue) {
            z = true;
        }
        this.mNoAnimated = z;
    }

    private boolean enableUnicornRender() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f53f696", new Object[]{this})).booleanValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(FRAGMENT_ARG_CUSTOM_OPT);
            if ((serializable instanceof HashMap) && (obj = ((HashMap) serializable).get("enable_unicorn_weex_render")) != null) {
                return "true".equals(String.valueOf(obj));
            }
        }
        return false;
    }

    public static boolean shouldDegrade(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983359fc", new Object[]{wXSDKInstance, str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && str.contains("|")) {
            return StringUtils.equals("1", str.substring(0, str.indexOf("|")));
        }
        if (StringUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode()) && !StringUtils.isEmpty(str2) && str2.contains("createInstance fail")) {
            String N = wXSDKInstance.N();
            WXErrorCode wXErrorCode = WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED;
            WXExceptionUtils.commitCriticalExceptionRT(N, wXErrorCode, "shouldDegrade", WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorMsg() + " -- " + str2, null);
            return true;
        } else if (StringUtils.equals(str, WXErrorCode.WX_DEGRAD_EAGLE_RENDER_ERROR.getErrorCode()) && !StringUtils.isEmpty(str2) && str2.contains("eagleRenderErr")) {
            String N2 = wXSDKInstance.N();
            WXErrorCode wXErrorCode2 = WXErrorCode.WX_DEGRAD_EAGLE_RENDER_ERROR;
            WXExceptionUtils.commitCriticalExceptionRT(N2, wXErrorCode2, "shouldDegrade", WXErrorCode.WX_DEGRAD_EAGLE_RENDER_ERROR.getErrorMsg() + " -- " + str2, null);
            return true;
        } else if (StringUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR.getErrorCode()) && !StringUtils.isEmpty(str2) && str2.contains("degradeToH5")) {
            String N3 = wXSDKInstance.N();
            WXErrorCode wXErrorCode3 = WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR;
            WXExceptionUtils.commitCriticalExceptionRT(N3, wXErrorCode3, "shouldDegrade", WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR.getErrorMsg() + " -- " + str2, null);
            return true;
        } else if (StringUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED.getErrorCode()) && !StringUtils.isEmpty(str2) && str2.contains("degradeToH5")) {
            String N4 = wXSDKInstance.N();
            WXErrorCode wXErrorCode4 = WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED;
            WXExceptionUtils.commitCriticalExceptionRT(N4, wXErrorCode4, "shouldDegrade", WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED.getErrorMsg() + "-- " + str2, null);
            return true;
        } else if (StringUtils.equals(str, WXErrorCode.WX_ERR_JSC_CRASH.getErrorCode()) && !StringUtils.isEmpty(str2) && str2.contains("degradeToH5")) {
            String N5 = wXSDKInstance.N();
            WXErrorCode wXErrorCode5 = WXErrorCode.WX_ERR_JSC_CRASH;
            WXExceptionUtils.commitCriticalExceptionRT(N5, wXErrorCode5, "shouldDegrade", WXErrorCode.WX_ERR_JSC_CRASH.getErrorMsg() + "-- " + str2, null);
            return true;
        } else if (StringUtils.equals(str, WXErrorCode.WX_DEGRAD_WAIT_INIT_TIMEOUT.getErrorCode())) {
            String N6 = wXSDKInstance.N();
            WXErrorCode wXErrorCode6 = WXErrorCode.WX_DEGRAD_WAIT_INIT_TIMEOUT;
            WXExceptionUtils.commitCriticalExceptionRT(N6, wXErrorCode6, "shouldDegrade", WXErrorCode.WX_DEGRAD_WAIT_INIT_TIMEOUT.getErrorMsg() + "-- " + str2, null);
            return true;
        } else if (!StringUtils.equals(str, WXErrorCode.WX_FORCEQJS_DEGRADE.getErrorCode())) {
            return StringUtils.equals(str, WXErrorCode.WX_ERR_LOAD_SO.getErrorCode());
        } else {
            String N7 = wXSDKInstance.N();
            WXErrorCode wXErrorCode7 = WXErrorCode.WX_FORCEQJS_DEGRADE;
            WXExceptionUtils.commitCriticalExceptionRT(N7, wXErrorCode7, "shouldDegrade", WXErrorCode.WX_FORCEQJS_DEGRADE.getErrorMsg() + "-- " + str2, null);
            return true;
        }
    }
}
