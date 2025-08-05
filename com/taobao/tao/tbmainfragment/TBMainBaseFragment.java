package com.taobao.tao.tbmainfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.util.TBMainLog;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.ut.mini.UTAnalytics;
import tb.kge;
import tb.omh;

/* loaded from: classes.dex */
public abstract class TBMainBaseFragment extends SupportFragment implements ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBMainBaseFragment";
    public Activity mActivity;
    private String mPageName;
    private TBPublicMenu mPublicMenu;

    static {
        kge.a(-317929920);
        kge.a(-1343974867);
    }

    public static /* synthetic */ Object ipc$super(TBMainBaseFragment tBMainBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public Fragment asFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("41d3098b", new Object[]{this}) : this;
    }

    public abstract String name();

    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract boolean onKeyDown(int i, KeyEvent keyEvent);

    public abstract void onNewIntent(Intent intent);

    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        if (context instanceof Activity) {
            this.mActivity = (Activity) context;
            return;
        }
        throw new RuntimeException("context error");
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (!needPublicMenu()) {
            return;
        }
        this.mPublicMenu = new TBPublicMenu(this.mActivity, this);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu == null) {
            return;
        }
        tBPublicMenu.onResume();
    }

    public String getPopLayerConfigName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("121bd256", new Object[]{this}) : getClass().getSimpleName();
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

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
        if (getActivity() == null || TextUtils.isEmpty(getUTPageName())) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (TBMainHost.a(this.mActivity) == null) {
        } else {
            ((SupportActivity) this.mActivity).pop();
            TBMainLog.tlog(TAG, "finish and pop");
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.onSupportVisible();
        if (getActivity() != null && !TextUtils.isEmpty(getUTPageName())) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity(), getUTPageName());
        }
        if (TBMainHost.a(getActivity()) == null || getClass().getName().equals(com.taobao.tao.navigation.e.b(0).k()) || getClass().getName().equals("com.taobao.tao.tbmainfragment.TBMainFragment")) {
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        String popLayerConfigName = getPopLayerConfigName();
        if (!TextUtils.isEmpty(popLayerConfigName)) {
            intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, popLayerConfigName);
        }
        if (getActivity() != null && getActivity().getIntent() != null && getActivity().getIntent().getData() != null) {
            intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, getActivity().getIntent().getData().toString());
        }
        LocalBroadcastManager.getInstance(getActivity()).sendBroadcast(intent);
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        if (this.mPublicMenu == null) {
            omh.a("menu_error", "menu_is_null");
            this.mPublicMenu = new TBPublicMenu(this.mActivity, this);
        }
        return this.mPublicMenu;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        TBMainLog.tlog(TAG, "into onHiddenChanged: " + z + " fragmentName: " + getClass().getSimpleName());
        super.onHiddenChanged(z);
    }
}
