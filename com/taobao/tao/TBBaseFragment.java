package com.taobao.tao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.ut.mini.UTAnalytics;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class TBBaseFragment extends SupportFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBBaseFragment";
    private String mPageName;
    private String mPoplayerConfigName;
    public View mRootView;

    static {
        kge.a(-167498929);
    }

    public static /* synthetic */ Object ipc$super(TBBaseFragment tBBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -872444662:
                super.onViewStateRestored((Bundle) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
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

    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
        }
    }

    @Deprecated
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    public TBBaseFragment() {
        com.taobao.tao.navigation.g b = com.taobao.tao.navigation.e.b(getClass().getName());
        if (b != null) {
            com.android.tools.ir.runtime.c.a(b.t(), null);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (getActivity() != null && !StringUtils.isEmpty(getUTPageName())) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity(), getUTPageName());
        }
        if (TBMainHost.a(getActivity()) == null || getClass().getName().equals(com.taobao.tao.navigation.e.b(0).k())) {
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        String popLayerconfigName = getPopLayerconfigName();
        if (!StringUtils.isEmpty(popLayerconfigName)) {
            intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, popLayerconfigName);
        }
        if (getActivity() != null && getActivity().getIntent() != null && getActivity().getIntent().getData() != null) {
            intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, getActivity().getIntent().getData().toString());
        }
        LocalBroadcastManager.getInstance(getActivity()).sendBroadcast(intent);
    }

    private String getPopLayerconfigName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af34da76", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.mPoplayerConfigName)) {
            return this.mPoplayerConfigName;
        }
        int a2 = com.taobao.tao.navigation.e.a(getClass().getName());
        if (a2 != 1) {
            if (a2 == 2) {
                this.mPoplayerConfigName = "MsgCenterCategoryFragment";
            } else if (a2 == 3) {
                this.mPoplayerConfigName = "CartFragment";
            } else if (a2 != 4) {
                return null;
            } else {
                this.mPoplayerConfigName = "MyTaobaoFragment";
            }
        } else if (com.taobao.android.navigationextern.e.e()) {
            this.mPoplayerConfigName = "GuangGuangTnodeMainFragment";
        } else {
            this.mPoplayerConfigName = "TmgDiscoveryFragment";
        }
        return this.mPoplayerConfigName;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (getActivity() == null || StringUtils.isEmpty(getUTPageName())) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
    }

    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        k a2 = TBMainHost.a(getActivity());
        if (a2 == null) {
            return null;
        }
        return a2.getFragmentTabHost();
    }

    public void setUTPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fa6fac", new Object[]{this, str});
        } else {
            this.mPageName = str;
        }
    }

    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : this.mPageName;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbff8d0a", new Object[]{this, bundle});
            return;
        }
        super.onViewStateRestored(bundle);
        TLog.loge(TAG, "into onViewStateRestored");
    }

    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        k a2 = TBMainHost.a(getActivity());
        return a2 != null && a2.isLowMemory();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        if (!isLowMemory()) {
            return;
        }
        this.mRootView = null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        TLog.loge(TAG, "into onRequestPermissionsResult, requestCode: " + i + " permissions: " + Arrays.toString(strArr) + "grantResults: " + Arrays.toString(iArr));
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        TLog.loge(TAG, "into onHiddenChanged: " + z + " fragmentName: " + getClass().getSimpleName());
    }
}
