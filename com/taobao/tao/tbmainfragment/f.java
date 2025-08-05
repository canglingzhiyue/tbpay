package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentationMagician;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.anim.DefaultHorizontalAnimator;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import com.taobao.tao.util.TBMainLog;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ADD = 0;
    public static final int TYPE_ADD_RESULT = 1;
    public static final int TYPE_ADD_RESULT_WITHOUT_HIDE = 3;
    public static final int TYPE_ADD_WITHOUT_HIDE = 2;
    public static final int TYPE_REPLACE = 10;
    public static final int TYPE_REPLACE_DONT_BACK = 11;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21132a = false;
    public boolean b = true;
    private final e c;
    private final FragmentActivity d;
    private o e;
    private FragmentAnimator f;

    static {
        kge.a(-78878869);
    }

    public f(e eVar) {
        if (!(eVar instanceof FragmentActivity)) {
            throw new RuntimeException("Must extends FragmentActivity/AppCompatActivity");
        }
        this.c = eVar;
        this.d = (FragmentActivity) eVar;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        this.e = a();
        this.f = this.c.onCreateFragmentAnimator();
    }

    public o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("ad294d22", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new o(this.c);
        }
        return this.e;
    }

    public FragmentAnimator b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("8d937e9d", new Object[]{this}) : this.f.copy();
    }

    public void a(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4936d1c", new Object[]{this, fragmentAnimator});
            return;
        }
        this.f = fragmentAnimator;
        for (Fragment fragment : FragmentationMagician.getActiveFragments(e())) {
            if (fragment instanceof ISupportFragment) {
                h supportDelegate = ((ISupportFragment) fragment).getSupportDelegate();
                if (supportDelegate.g) {
                    supportDelegate.f21133a = fragmentAnimator.copy();
                    if (supportDelegate.b != null) {
                        supportDelegate.b.a(supportDelegate.f21133a);
                    }
                }
            }
        }
    }

    public FragmentAnimator c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("b327879e", new Object[]{this}) : new DefaultHorizontalAnimator();
    }

    public boolean a(int i, KeyEvent keyEvent) {
        boolean onBackPressedSupport;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        Fragment fragment = (Fragment) i.a(this.d.getSupportFragmentManager());
        if (fragment instanceof TBMainBaseFragment) {
            onBackPressedSupport = ((TBMainBaseFragment) fragment).onKeyDown(i, keyEvent);
        } else {
            onBackPressedSupport = (!(fragment instanceof SupportFragment) || i != 4) ? false : ((SupportFragment) fragment).onBackPressedSupport();
        }
        if (onBackPressedSupport || i != 4) {
            return onBackPressedSupport;
        }
        TBMainLog.tlog("SupportActivityDelegate", "onBackPressedSupport pop");
        d();
        return true;
    }

    public void a(int i, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefdcebc", new Object[]{this, new Integer(i), iSupportFragment});
        } else {
            a(i, iSupportFragment, true, false);
        }
    }

    public void a(int i, ISupportFragment iSupportFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6db6a3c", new Object[]{this, new Integer(i), iSupportFragment, new Boolean(z), new Boolean(z2)});
        } else {
            this.e.a(e(), i, iSupportFragment, z, z2);
        }
    }

    public void a(ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b68f989", new Object[]{this, iSupportFragment});
        } else {
            a(iSupportFragment, 0);
        }
    }

    public void a(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b6aa9a", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.e.a(e(), f(), iSupportFragment, 0, i, 0);
        }
    }

    public void a(ISupportFragment iSupportFragment, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151f1ba9", new Object[]{this, iSupportFragment, new Integer(i), new Integer(i2)});
        } else {
            this.e.a(e(), f(), iSupportFragment, 0, i, i2);
        }
    }

    public void b(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd22939", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.e.a(e(), f(), iSupportFragment, i, 0, 1);
        }
    }

    public void a(ISupportFragment iSupportFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b6ea6b", new Object[]{this, iSupportFragment, new Boolean(z)});
        } else {
            this.e.a(e(), f(), iSupportFragment, 0, 0, z ? 10 : 11);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TBMainLog.tlog("SupportActivityDelegate", "pop");
        this.e.a(e(), this.d);
    }

    public void a(Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4f659f", new Object[]{this, cls, new Boolean(z)});
        } else {
            a(cls, z, Integer.MAX_VALUE);
        }
    }

    public void a(Class<?> cls, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9dc144", new Object[]{this, cls, new Boolean(z), new Integer(i)});
        } else {
            this.e.a(cls.getName(), z, e(), i);
        }
    }

    private FragmentManager e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("b40c0b5b", new Object[]{this}) : this.d.getSupportFragmentManager();
    }

    private ISupportFragment f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISupportFragment) ipChange.ipc$dispatch("41771cea", new Object[]{this}) : i.a(e());
    }
}
