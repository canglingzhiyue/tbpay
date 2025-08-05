package com.taobao.android.trade.cart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.UltronICartFragment;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.d;
import com.taobao.tao.navigation.e;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.jjn;
import tb.kge;

/* loaded from: classes6.dex */
public class TabCartFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TabCartFragment";
    public TBBaseFragment cartFragment;
    private d mListener = new d() { // from class: com.taobao.android.trade.cart.TabCartFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.navigation.d
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            } else if (i != 3) {
            } else {
                boolean a2 = jjn.a();
                if ((TabCartFragment.this.cartFragment instanceof CartWebFragment) || !a2) {
                    return;
                }
                TabCartFragment.this.getChildFragmentManager().beginTransaction().remove(TabCartFragment.this.cartFragment).commitNowAllowingStateLoss();
            }
        }
    };
    private BroadcastReceiver mReceiver = new ChangeToOldBroadcastReceiver(this);
    private long mStartTime;

    static {
        kge.a(-1317262956);
    }

    public static /* synthetic */ Object ipc$super(TabCartFragment tabCartFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.mStartTime = System.currentTimeMillis();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.android.trade.cart.changeToOldCart");
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.mReceiver, intentFilter);
        initTabChangeListener();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.cart_activity_layout, viewGroup, false);
        addCartFragment();
        return inflate;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TBBaseFragment tBBaseFragment = this.cartFragment;
        if (tBBaseFragment != null && tBBaseFragment.onPanelKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onPanelKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        TBBaseFragment tBBaseFragment = this.cartFragment;
        if (tBBaseFragment == null) {
            return;
        }
        tBBaseFragment.onNewIntent(intent);
    }

    private void addCartFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720338d8", new Object[]{this});
            return;
        }
        boolean a2 = jjn.a();
        try {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            if (fragments != null) {
                FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                for (Fragment fragment : fragments) {
                    if (fragment == this.cartFragment) {
                        UnifyLog.d(TAG, "fragment == cartFragment,return");
                        return;
                    }
                    beginTransaction.remove(fragment);
                    TLog.loge(TAG, "remove fragment :" + fragment.getClass().getSimpleName());
                }
                beginTransaction.commitAllowingStateLoss();
            }
        } catch (Exception e) {
            TLog.loge(TAG, "clear fragment error:" + e.getMessage());
        }
        if (!a2) {
            this.cartFragment = new UltronICartFragment();
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBoolean("isFromCartActivity", getActivity() instanceof CartActivity);
            arguments.putLong("tabCartStartTime", this.mStartTime);
            this.cartFragment.setArguments(arguments);
        } else {
            this.cartFragment = new CartWebFragment();
        }
        getChildFragmentManager().beginTransaction().add(R.id.cart_activity_root, this.cartFragment, "cartSubFragment").commitAllowingStateLoss();
    }

    private void initTabChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad68450", new Object[]{this});
        } else {
            e.a(this.mListener);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        TLog.loge(TAG, "handleLoginAction： " + String.valueOf(loginAction));
        TBBaseFragment tBBaseFragment = this.cartFragment;
        if (tBBaseFragment == null) {
            return;
        }
        tBBaseFragment.handleLoginAction(loginAction);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.mActivity).unregisterReceiver(this.mReceiver);
        e.b(this.mListener);
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        TBBaseFragment tBBaseFragment = this.cartFragment;
        if (tBBaseFragment == null) {
            return;
        }
        tBBaseFragment.onActivityResult(i, i2, intent);
    }

    /* loaded from: classes6.dex */
    public static class ChangeToOldBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabCartFragment> f15604a;

        static {
            kge.a(530424452);
        }

        public ChangeToOldBroadcastReceiver(TabCartFragment tabCartFragment) {
            this.f15604a = new WeakReference<>(tabCartFragment);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TabCartFragment tabCartFragment;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            UnifyLog.d("TabICartSwitch", "onReceive mReference.get=" + this.f15604a.get() + ",intent=" + intent);
            if (intent == null || (tabCartFragment = this.f15604a.get()) == null || !tabCartFragment.isResumed()) {
                return;
            }
            FragmentManager childFragmentManager = tabCartFragment.getChildFragmentManager();
            if ("com.taobao.android.trade.cart.changeToOldCart".equals(intent.getAction())) {
                tabCartFragment.cartFragment = new CartWebFragment();
            }
            UnifyLog.d("TabICartSwitch", "onReceive " + tabCartFragment.cartFragment + " broadcast");
            if (childFragmentManager == null) {
                return;
            }
            childFragmentManager.beginTransaction().replace(R.id.cart_activity_root, tabCartFragment.cartFragment).commitAllowingStateLoss();
        }
    }
}
