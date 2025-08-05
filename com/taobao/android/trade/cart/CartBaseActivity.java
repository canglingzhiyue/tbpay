package com.taobao.android.trade.cart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.f;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import java.util.List;
import tb.jjm;
import tb.kge;

/* loaded from: classes6.dex */
public class CartBaseActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CartBaseActivity";

    /* renamed from: a  reason: collision with root package name */
    private Fragment f15592a;

    static {
        kge.a(340290129);
    }

    public static /* synthetic */ Object ipc$super(CartBaseActivity cartBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity
    public boolean isLoginRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594922a9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        jjm.a(TAG, i.b.MEASURE_ONCREATE);
        f.a(getActivity());
        setContentView(R.layout.cart_activity_layout);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f15592a = new TabCartFragment();
        b();
        getSupportFragmentManager().beginTransaction().replace(R.id.cart_activity_root, this.f15592a, getResources().getString(R.string.cart_fragment_tag)).commit();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        intent.getData();
        a();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        Fragment fragment = this.f15592a;
        if ((fragment instanceof TabCartFragment) && ((TabCartFragment) fragment).onPanelKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f15592a;
        if (fragment == null) {
            return;
        }
        fragment.onActivityResult(i, i2, intent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        jjm.a(TAG, "onResume");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        jjm.a(TAG, "onPause");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        jjm.a(TAG, MessageID.onStop);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        jjm.a(TAG, MessageID.onDestroy);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        jjm.a(TAG, "finish");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            for (Fragment fragment : fragments) {
                beginTransaction.remove(fragment);
            }
            beginTransaction.commit();
        } catch (Exception e) {
            jjm.a(TAG, "clear fragment error:" + e.getMessage());
        }
    }
}
