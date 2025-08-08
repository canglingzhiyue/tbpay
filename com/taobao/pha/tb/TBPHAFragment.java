package com.taobao.pha.tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.error.a;
import com.taobao.pha.core.p;
import com.taobao.pha.core.tabcontainer.b;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;
import com.taobao.tao.util.TBStatusBarUtils;
import com.taobao.taobao.R;
import tb.kge;
import tb.ngn;
import tb.ngr;
import tb.nom;

/* loaded from: classes7.dex */
public class TBPHAFragment extends TBMainBaseFragment implements com.taobao.pha.core.controller.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private AppController mAppController;
    private boolean mImmersiveStatus;
    private String mManifestUrl;
    private int mManifestUrlHashCode;
    private long mNavStartTime;
    private b mNavigationBarHandler;
    private boolean mNavigationBarHidden;
    private View mView;

    public static /* synthetic */ Object ipc$super(TBPHAFragment tBPHAFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1542694236:
                super.onSupportInvisible();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -739997161:
                super.onAttachFragment((Fragment) objArr[0]);
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
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.pha.core.controller.d
    public int getNavigationBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f7254aa", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447db125", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    static {
        kge.a(1758841923);
        kge.a(-1253718971);
        TAG = TBPHAFragment.class.getName();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        String str = this.mManifestUrl;
        if (str != null) {
            if (this.mAppController == null) {
                this.mAppController = new AppController(str, PHAContainerType.GENERIC, this.mManifestUrlHashCode);
            } else {
                ngr.c(TAG, "appController has been instantiated.");
            }
            this.mAppController.a(this, getContext());
            this.mAppController.a(bundle);
            if (this.mNavigationBarHandler != null) {
                return;
            }
            this.mNavigationBarHandler = new m(this.mAppController);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isFragment", (Object) 1);
        com.taobao.pha.core.controller.i.a("launch", jSONObject, PHAErrorType.REFERENCE_ERROR.toString(), a.ERR_MSG_MANIFEST_URL_IS_NULL);
        finish();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (getArguments() != null && (bundle2 = getArguments().getBundle(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_ARGS)) != null) {
            this.mManifestUrl = bundle2.getString("pha_fragment_uri");
            if (bundle != null) {
                this.mManifestUrlHashCode = com.taobao.pha.core.manifest.e.a().a(Uri.parse(this.mManifestUrl));
                this.mNavStartTime = SystemClock.uptimeMillis();
            } else {
                this.mManifestUrlHashCode = bundle2.getInt("manifest_uri_hashcode");
                this.mNavStartTime = bundle2.getLong("pha_timestamp", 0L);
            }
            this.mAppController = AppController.b(bundle2.getLong("AppControllerInstanceId"));
        }
        if (!StringUtils.isEmpty(this.mManifestUrl)) {
            setNavigationBarParams(Uri.parse(this.mManifestUrl));
        }
        super.onCreate(bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mView == null) {
            this.mView = layoutInflater.inflate(R.layout.pha_fragment_layout, viewGroup, false);
        }
        return this.mView;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        AppController appController = this.mAppController;
        if (appController != null) {
            if (this.mNavigationBarHandler == null) {
                this.mNavigationBarHandler = new m(appController);
            }
            this.mNavigationBarHandler.a(menu);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e48a17", new Object[]{this, fragment});
        } else {
            super.onAttachFragment(fragment);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.onResume();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.onSupportInvisible();
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.onPause();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.onSupportVisible();
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.onResume();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : i == 4 && this.mAppController.T();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.S();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.onPause();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AppController appController = this.mAppController;
        if (appController != null) {
            appController.onDestroy();
            String str = TAG;
            ngr.c(str, this.mManifestUrl + " is destroyed");
        }
        super.onDestroy();
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean attachToHost(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b3a4a7", new Object[]{this, fragment})).booleanValue();
        }
        if (!isAdded()) {
            return false;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager != null) {
            childFragmentManager.beginTransaction().replace(this.mView.getId(), fragment, "AppFragment").commitNowAllowingStateLoss();
        }
        return true;
    }

    @Override // com.taobao.pha.core.controller.d
    public long getNavStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78326e5d", new Object[]{this})).longValue() : this.mNavStartTime;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : this.mImmersiveStatus;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isNavigationBarHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b479b6a", new Object[]{this})).booleanValue() : this.mNavigationBarHidden;
    }

    @Override // com.taobao.pha.core.controller.d
    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue() : ngn.e("status_bar_height");
    }

    @Override // com.taobao.pha.core.controller.d
    public int getNotchHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9637083", new Object[]{this})).intValue() : ngn.e("notch_height");
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean downgrade(Uri uri, DowngradeType downgradeType, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4424f9ca", new Object[]{this, uri, downgradeType, bool})).booleanValue();
        }
        boolean a2 = p.b().u().a(uri, getContext(), bool);
        finish();
        return a2;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        finish();
        return true;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isTrustedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{this, str})).booleanValue();
        }
        if (!p.c().t()) {
            return true;
        }
        return android.taobao.windvane.config.p.a(str);
    }

    private void setNavigationBarParams(Uri uri) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7e6f7d", new Object[]{this, uri});
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof AppCompatActivity)) {
            ngr.b(TAG, "GetActivity is not AppCompatActivity or null!");
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        this.mNavigationBarHidden = nom.VALUE_YES.equals(uri.getQueryParameter("disableNav"));
        if (this.mNavigationBarHidden) {
            if (Build.VERSION.SDK_INT < 19 && !TBStatusBarUtils.isMIUIDevice() && !TBStatusBarUtils.isMeizuDevice()) {
                z = false;
            }
            if (z) {
                String queryParameter = uri.getQueryParameter("status_bar_transparent");
                if (!StringUtils.isEmpty(queryParameter)) {
                    this.mImmersiveStatus = "true".equals(queryParameter);
                }
            }
        }
        if (appCompatActivity.getWindow() == null) {
            return;
        }
        appCompatActivity.getWindow().setFormat(-3);
    }
}
