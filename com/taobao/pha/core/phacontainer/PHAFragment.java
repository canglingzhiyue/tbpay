package com.taobao.pha.core.phacontainer;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.p;
import tb.kge;
import tb.nfc;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class PHAFragment extends Fragment implements com.taobao.pha.core.controller.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public AppController mAppController;
    public String mManifestUrl;
    public long mNavTime;
    public int mUrlHashCode;
    public View mView;
    public PHAContainerType mContainerType = PHAContainerType.GENERIC;
    private final int mViewId = View.generateViewId();

    public static /* synthetic */ Object ipc$super(PHAFragment pHAFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
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
        return false;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isNavigationBarHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b479b6a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isTrustedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1598068441);
        kge.a(-1253718971);
        TAG = PHAFragment.class.getName();
    }

    public AppController getAppController() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("e0095b36", new Object[]{this}) : this.mAppController;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            ngr.b(TAG, "args is null");
            return;
        }
        this.mManifestUrl = arguments.getString(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL);
        if (TextUtils.isEmpty(this.mManifestUrl)) {
            ngr.b(TAG, "manifestUrl is empty");
            return;
        }
        this.mNavTime = SystemClock.uptimeMillis() - (System.currentTimeMillis() - arguments.getLong("pha_timestamp"));
        if (arguments.containsKey("manifest_uri_hashcode")) {
            this.mUrlHashCode = arguments.getInt("manifest_uri_hashcode");
        } else {
            this.mUrlHashCode = com.taobao.pha.core.manifest.e.a().a(Uri.parse(this.mManifestUrl));
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mView == null) {
            this.mView = new FrameLayout(getContext());
            this.mView.setId(this.mViewId);
        }
        return this.mView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else if (this.mAppController != null) {
        } else {
            this.mAppController = new AppController(getContext(), this.mManifestUrl, this.mContainerType, this, this.mUrlHashCode);
            this.mAppController.a(bundle);
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
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.S();
    }

    @Override // android.support.v4.app.Fragment
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

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
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
        AppController appController = this.mAppController;
        if (appController == null) {
            return;
        }
        appController.onDestroy();
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean attachToHost(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b3a4a7", new Object[]{this, fragment})).booleanValue();
        }
        if (getView() == null) {
            return false;
        }
        try {
            getChildFragmentManager().beginTransaction().replace(this.mViewId, fragment).commitNowAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override // com.taobao.pha.core.controller.d
    public long getNavStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78326e5d", new Object[]{this})).longValue() : this.mNavTime;
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
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4424f9ca", new Object[]{this, uri, downgradeType, bool})).booleanValue();
        }
        com.taobao.pha.core.tabcontainer.a u = p.b().u();
        if (u == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("downgrade to :");
        if (uri != null) {
            str = uri.toString();
        } else {
            str = "," + bool;
        }
        sb.append(str);
        ngr.b(TAG, sb.toString());
        return u.a(uri, getContext(), bool);
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return false;
        }
        ((Activity) context).finish();
        return true;
    }
}
