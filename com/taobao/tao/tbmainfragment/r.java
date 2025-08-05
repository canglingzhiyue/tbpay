package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentationMagician;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21141a;
    private boolean c;
    private Runnable g;
    private Handler h;
    private ISupportFragment i;
    private Fragment j;
    private boolean b = true;
    private boolean d = true;
    private boolean e = true;
    private boolean f = false;

    static {
        kge.a(-315272225);
    }

    public static /* synthetic */ Runnable a(r rVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("542ba5b7", new Object[]{rVar, runnable});
        }
        rVar.g = runnable;
        return runnable;
    }

    public static /* synthetic */ void a(r rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36937af5", new Object[]{rVar, new Boolean(z)});
        } else {
            rVar.d(z);
        }
    }

    public r(ISupportFragment iSupportFragment) {
        this.i = iSupportFragment;
        this.j = (Fragment) iSupportFragment;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            this.c = bundle.getBoolean("fragmentation_invisible_when_leave");
            this.e = bundle.getBoolean("fragmentation_compat_replace");
        }
    }

    public void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47681e4b", new Object[]{this, bundle});
            return;
        }
        bundle.putBoolean("fragmentation_invisible_when_leave", this.c);
        bundle.putBoolean("fragmentation_compat_replace", this.e);
    }

    public void c(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369ad2a", new Object[]{this, bundle});
        } else if (!this.e && this.j.getTag() != null && this.j.getTag().startsWith("android:switcher:")) {
        } else {
            if (this.e) {
                this.e = false;
            }
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c || this.j.isHidden() || !this.j.getUserVisibleHint()) {
        } else {
            if (this.j.getParentFragment() != null && !a(this.j.getParentFragment())) {
                return;
            }
            this.b = false;
            c(true);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d) {
            if (this.f21141a || this.c || !a(this.j)) {
                return;
            }
            this.b = false;
            d(true);
        } else if (!this.f) {
        } else {
            this.f = false;
            e();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g != null) {
            i().removeCallbacks(this.g);
            this.f = true;
        } else if (this.f21141a && a(this.j)) {
            this.b = false;
            this.c = false;
            d(false);
        } else {
            this.c = true;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            c(false);
        } else {
            f();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.j.isResumed() && (this.j.isAdded() || !z)) {
        } else {
            if (!this.f21141a && z) {
                c(true);
            } else if (!this.f21141a || z) {
            } else {
                d(false);
            }
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!this.d) {
            d(z);
        } else if (!z) {
        } else {
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.g = new Runnable() { // from class: com.taobao.tao.tbmainfragment.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                r.a(r.this, (Runnable) null);
                r.a(r.this, true);
            }
        };
        i().post(this.g);
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (z && g()) {
        } else {
            if (this.f21141a == z) {
                this.b = true;
                return;
            }
            this.f21141a = z;
            if (z) {
                if (h()) {
                    return;
                }
                this.i.onSupportVisible();
                if (this.d) {
                    this.d = false;
                }
                e(true);
                return;
            }
            e(false);
            this.i.onSupportInvisible();
        }
    }

    private void e(boolean z) {
        List<Fragment> activeFragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (!this.b) {
            this.b = true;
        } else if (!h() && (activeFragments = FragmentationMagician.getActiveFragments(this.j.getChildFragmentManager())) != null) {
            for (Fragment fragment : activeFragments) {
                if ((fragment instanceof ISupportFragment) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                    ((ISupportFragment) fragment).getSupportDelegate().k().d(z);
                }
            }
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        Fragment parentFragment = this.j.getParentFragment();
        return parentFragment instanceof ISupportFragment ? !((ISupportFragment) parentFragment).isSupportVisible() : parentFragment != null && !parentFragment.isVisible();
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (this.j.isAdded()) {
            return false;
        }
        this.f21141a = !this.f21141a;
        return true;
    }

    private boolean a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f0514e", new Object[]{this, fragment})).booleanValue() : !fragment.isHidden() && fragment.getUserVisibleHint();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f21141a;
    }

    private Handler i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("90235056", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new Handler(Looper.getMainLooper());
        }
        return this.h;
    }
}
