package com.taobao.android.detail.wrapper.fragment.weex;

import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.fragment.weex.module.WXAppInfoModule;
import com.taobao.taobao.R;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.appfram.navigator.a;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;
import java.net.URLDecoder;
import java.util.HashMap;
import tb.ecu;
import tb.emu;
import tb.epo;
import tb.kge;
import tb.ljl;

/* loaded from: classes5.dex */
public class DetailWeexFragment extends Fragment implements a, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_URL = "bundle_url";
    private static final String TAG = "DetailWeexFragment";
    private static boolean isSupportSmartBar;
    private View contentView;
    private TextView errorView;
    private FrameLayout flWeex;
    private WXSDKInstance mInstance;
    private String mUrl;
    private View progressBar;
    private boolean weexViewAdd;

    public static /* synthetic */ Object ipc$super(DetailWeexFragment detailWeexFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 797441118:
                super.onPause();
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

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd47acc", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bac709a", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b81447", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean pop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665cea26", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean push(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e9da61", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c1d02f", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4ea752", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ View access$000(DetailWeexFragment detailWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9c867f90", new Object[]{detailWeexFragment}) : detailWeexFragment.contentView;
    }

    public static /* synthetic */ String access$100(DetailWeexFragment detailWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f377af1", new Object[]{detailWeexFragment}) : detailWeexFragment.mUrl;
    }

    public static /* synthetic */ WXSDKInstance access$200(DetailWeexFragment detailWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("139d552e", new Object[]{detailWeexFragment}) : detailWeexFragment.mInstance;
    }

    static {
        kge.a(1662501208);
        kge.a(-748561575);
        kge.a(684822686);
        isSupportSmartBar = isSupportSmartBar();
        try {
            WXSDKEngine.registerModule("detailAppInfo", WXAppInfoModule.class);
        } catch (WXException e) {
            i.a(TAG, "", e);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        WXSDKEngine.setActivityNavBarSetter(this);
        emu.a("com.taobao.android.detail.wrapper.fragment.weex.DetailWeexFragment");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.contentView = View.inflate(getActivity(), R.layout.x_detail_weex_fragment, null);
        this.flWeex = (FrameLayout) this.contentView.findViewById(R.id.detail_fl_weex);
        this.progressBar = this.contentView.findViewById(R.id.detail_weex_progress);
        this.errorView = (TextView) this.contentView.findViewById(R.id.detail_weex_tip);
        return this.contentView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (ecu.z && !WXEnvironment.isCPUSupport()) {
            i.a(TAG, "WXEnvironment.isSupport() == false");
            return;
        }
        if (this.mInstance == null) {
            this.mInstance = new WXSDKInstance(getActivity());
            this.mInstance.a(this);
        }
        Bundle arguments = getArguments();
        if (arguments != null && !StringUtils.isEmpty(arguments.getString("bundle_url"))) {
            this.mUrl = arguments.getString("bundle_url");
        }
        final HashMap hashMap = new HashMap();
        this.contentView.post(new Runnable() { // from class: com.taobao.android.detail.wrapper.fragment.weex.DetailWeexFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FragmentActivity activity = DetailWeexFragment.this.getActivity();
                int height = DetailWeexFragment.access$000(DetailWeexFragment.this).getHeight();
                if (activity instanceof AppCompatActivity) {
                    height = DetailWeexFragment.getDisplayHeight((AppCompatActivity) DetailWeexFragment.this.getActivity());
                }
                DetailWeexFragment.access$200(DetailWeexFragment.this).a(DetailWeexFragment.TAG, DetailWeexFragment.access$100(DetailWeexFragment.this), hashMap, null, epo.b, height, WXRenderStrategy.APPEND_ASYNC);
            }
        });
        this.progressBar.setVisibility(0);
    }

    public static int getDisplayHeight(AppCompatActivity appCompatActivity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b7b006", new Object[]{appCompatActivity})).intValue();
        }
        if (appCompatActivity == null || appCompatActivity.getWindowManager() == null || appCompatActivity.getWindowManager().getDefaultDisplay() == null) {
            i = 0;
        } else {
            Point point = new Point();
            appCompatActivity.getWindowManager().getDefaultDisplay().getSize(point);
            i = point.y;
        }
        i.a("WXTBUtil", "isSupportSmartBar:" + isSupportSmartBar);
        if (isSupportSmartBar) {
            int smartBarHeight = getSmartBarHeight(appCompatActivity);
            i.a("WXTBUtil", "smartBarHeight:" + smartBarHeight);
            i -= smartBarHeight;
        }
        if (appCompatActivity.getSupportActionBar() != null) {
            int c = appCompatActivity.getSupportActionBar().c();
            if (c == 0) {
                c = (int) appCompatActivity.obtainStyledAttributes(new int[]{16843499}).getDimension(0, 0.0f);
            }
            i -= c;
        }
        return i - getStatusBarHeight(appCompatActivity);
    }

    private static boolean isSupportSmartBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("314db8fa", new Object[0])).booleanValue() : Build.class.getMethod("hasSmartBar", new Class[0]) != null;
    }

    private static int getSmartBarHeight(AppCompatActivity appCompatActivity) {
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    return appCompatActivity.getResources().getDimensionPixelSize(appCompatActivity.getResources().getIdentifier("mz_action_button_min_height", "dimen", "android"));
                }
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                return appCompatActivity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString()));
            } catch (Exception e) {
                e.printStackTrace();
                supportActionBar.c();
                return 0;
            }
        }
        return 0;
    }

    private static int getStatusBarHeight(AppCompatActivity appCompatActivity) {
        int dimensionPixelSize;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                dimensionPixelSize = appCompatActivity.getResources().getDimensionPixelSize(appCompatActivity.getResources().getIdentifier("status_bar_height", "dimen", "android"));
            } else {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                dimensionPixelSize = appCompatActivity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            }
            return dimensionPixelSize;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityDestroy();
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        FrameLayout frameLayout = this.flWeex;
        if (frameLayout != null) {
            frameLayout.addView(view);
            this.weexViewAdd = true;
        }
        i.a(TAG, "onViewCreated");
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        this.progressBar.setVisibility(8);
        this.errorView.setVisibility(8);
        i.a(TAG, ljl.RENDER_SUCCESS_TIME);
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        this.progressBar.setVisibility(8);
        this.errorView.setVisibility(8);
        i.a(TAG, "onRefreshSuccess");
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        this.progressBar.setVisibility(8);
        if (!this.weexViewAdd) {
            this.errorView.setText(b.a(R.string.x_detail_app_load_failed));
            this.errorView.setVisibility(0);
        }
        i.a(TAG, "onException");
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832309b", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                getActivity().getActionBar().setTitle(JSONObject.parseObject(URLDecoder.decode(str, "utf-8")).getString("title"));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
