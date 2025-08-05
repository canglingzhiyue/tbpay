package com.taobao.tmgdeliverybase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.flexa.compat.c;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;
import com.taobao.taobao.R;
import com.taobao.tmgdeliverybase.fragment.EmptyFragment;

/* loaded from: classes9.dex */
public class TMGDeliveryPurchaseActivity extends AppCompatActivity implements EmptyFragment.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FragmentManager f22968a;
    private FragmentTransaction b;
    private Fragment c;
    private ViewGroup d;

    public static /* synthetic */ Object ipc$super(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ Fragment a(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("8d614d96", new Object[]{tMGDeliveryPurchaseActivity}) : tMGDeliveryPurchaseActivity.c;
    }

    public static /* synthetic */ Fragment a(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("3e006460", new Object[]{tMGDeliveryPurchaseActivity, fragment});
        }
        tMGDeliveryPurchaseActivity.c = fragment;
        return fragment;
    }

    public static /* synthetic */ FragmentTransaction b(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("ce8eb1e1", new Object[]{tMGDeliveryPurchaseActivity}) : tMGDeliveryPurchaseActivity.b;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_tmgdelivery_purchase);
        this.d = (ViewGroup) ((ViewGroup) findViewById(16908290)).getChildAt(0);
        this.f22968a = getSupportFragmentManager();
        this.b = this.f22968a.beginTransaction();
        if (!b()) {
            EmptyFragment emptyFragment = new EmptyFragment();
            emptyFragment.setRetryCallback(this);
            c();
            this.b.add(16908290, emptyFragment);
            this.b.commit();
            return;
        }
        this.c = Fragment.instantiate(this, "com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment", null);
        this.b.add(16908290, this.c);
        this.b.commit();
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

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.c;
        if (fragment == null) {
            return;
        }
        fragment.onActivityResult(i, i2, intent);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        g c = c.Companion.a().c();
        return c == null || b.a().j() == null || (b.a().c("tmgdelivery") != null && c.a().contains("tmgdelivery"));
    }

    @Override // com.taobao.tmgdeliverybase.fragment.EmptyFragment.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.alibaba.flexa.compat.c.a("com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment", new c.a() { // from class: com.taobao.tmgdeliverybase.TMGDeliveryPurchaseActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                        return;
                    }
                    TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity = TMGDeliveryPurchaseActivity.this;
                    TMGDeliveryPurchaseActivity.a(tMGDeliveryPurchaseActivity, Fragment.instantiate(tMGDeliveryPurchaseActivity, "com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment", null));
                    TMGDeliveryPurchaseActivity.b(TMGDeliveryPurchaseActivity.this).add(16908290, TMGDeliveryPurchaseActivity.a(TMGDeliveryPurchaseActivity.this));
                    TMGDeliveryPurchaseActivity.b(TMGDeliveryPurchaseActivity.this).commit();
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    } else {
                        AppMonitor.Alarm.commitFail("tmgdelivery", "install", "INSTALL_FAILED", "class not found");
                    }
                }
            });
        }
    }
}
