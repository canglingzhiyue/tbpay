package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FragmentAnimator f21133a;
    public a b;
    public int c;
    public p d;
    public Bundle e;
    public FragmentActivity f;
    private Handler j;
    private r k;
    private final ISupportFragment l;
    private final Fragment m;
    private e n;
    private boolean o;
    private int h = 0;
    private int i = Integer.MIN_VALUE;
    public boolean g = true;

    static {
        kge.a(-828078676);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ e a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("619cbf8d", new Object[]{hVar}) : hVar.n;
    }

    public static /* synthetic */ Handler b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("59df1d1e", new Object[]{hVar}) : hVar.l();
    }

    public h(ISupportFragment iSupportFragment) {
        if (!(iSupportFragment instanceof Fragment)) {
            throw new RuntimeException("Must extends Fragment");
        }
        this.l = iSupportFragment;
        this.m = (Fragment) iSupportFragment;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context instanceof e) {
            this.o = true;
            this.n = (e) context;
            this.f = (FragmentActivity) context;
        } else {
            this.o = false;
        }
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else if (!this.o) {
        } else {
            k().a(bundle);
            Bundle arguments = this.m.getArguments();
            if (arguments != null) {
                this.c = arguments.getInt("fragmentation_arg_container");
                this.h = arguments.getInt("fragmentation_arg_root_status", 0);
                this.i = arguments.getInt("fragmentation_arg_custom_enter_anim", Integer.MIN_VALUE);
            }
            if (bundle == null) {
                m();
            } else {
                if (!ABGlobal.isFeatureOpened(this.f, s.KEY_SET_CLASS_LOADER)) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                this.f21133a = (FragmentAnimator) bundle.getParcelable("fragmentation_state_save_animator");
                if (this.f21133a == null) {
                    m();
                }
                this.c = bundle.getInt("fragmentation_arg_container");
            }
            this.b = new a(this.f.getApplicationContext(), this.f21133a);
            final Animation n = n();
            if (n == null) {
                return;
            }
            n().setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.tbmainfragment.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        return;
                    }
                    h.a(h.this).getSupportDelegate().b = false;
                    h.b(h.this).postDelayed(new Runnable() { // from class: com.taobao.tao.tbmainfragment.h.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                h.a(h.this).getSupportDelegate().b = true;
                            }
                        }
                    }, n.getDuration());
                }
            });
        }
    }

    private Handler l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("8427fcf3", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new Handler(Looper.getMainLooper());
        }
        return this.j;
    }

    public Animation a(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("cbee26cc", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!this.o) {
            return null;
        }
        if (this.n.getSupportDelegate().f21132a) {
            if (i == 8194 && z) {
                return this.b.b();
            }
            return this.b.a();
        } else if (i == 4097) {
            if (z) {
                if (this.h == 1) {
                    return this.b.a();
                }
                return this.b.c();
            }
            return this.b.f();
        } else if (i == 8194) {
            return z ? this.b.e() : this.b.d();
        } else if (z) {
            return null;
        } else {
            return this.b.a(this.m);
        }
    }

    public void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47681e4b", new Object[]{this, bundle});
        } else if (!this.o) {
        } else {
            k().b(bundle);
            bundle.putParcelable("fragmentation_state_save_animator", this.f21133a);
            bundle.putBoolean("fragmentation_state_save_status", this.m.isHidden());
            bundle.putInt("fragmentation_arg_container", this.c);
        }
    }

    public void c(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369ad2a", new Object[]{this, bundle});
        } else if (!this.o) {
        } else {
            k().c(bundle);
            View view = this.m.getView();
            if (view == null) {
                return;
            }
            view.setClickable(true);
            if (Build.VERSION.SDK_INT < 16) {
                return;
            }
            view.setImportantForAccessibility(2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            if (!this.o) {
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.o) {
        } else {
            k().a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.o) {
        } else {
            k().b();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            if (!this.o) {
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.o) {
        } else {
            this.n.getSupportDelegate().b = true;
            k().c();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            if (!this.o) {
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.o) {
        } else {
            k().a(z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.o) {
        } else {
            k().b(z);
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.o) {
            return k().d();
        }
        return false;
    }

    public FragmentAnimator h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("6f0bb4a3", new Object[]{this});
        }
        if (this.o) {
            return this.n.getFragmentAnimator();
        }
        return null;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!this.o) {
        } else {
            if (this.n == null) {
                throw new RuntimeException("Fragment has not been attached to Activity!");
            }
            if (this.f21133a != null) {
                return;
            }
            this.f21133a = this.l.onCreateFragmentAnimator();
            if (this.f21133a != null) {
                return;
            }
            this.f21133a = this.n.getFragmentAnimator();
        }
    }

    public FragmentAnimator i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("949fbda4", new Object[]{this});
        }
        if (!this.o) {
            return null;
        }
        if (this.f21133a == null) {
            m();
        }
        return this.f21133a;
    }

    public void a(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4936d1c", new Object[]{this, fragmentAnimator});
        } else if (!this.o) {
        } else {
            this.f21133a = fragmentAnimator;
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(fragmentAnimator);
            }
            this.g = false;
        }
    }

    public void a(int i, Bundle bundle) {
        Bundle arguments;
        ResultRecord resultRecord;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i), bundle});
        } else if (!this.o || (arguments = this.m.getArguments()) == null || !arguments.containsKey("fragment_arg_result_record") || (resultRecord = (ResultRecord) arguments.getParcelable("fragment_arg_result_record")) == null) {
        } else {
            resultRecord.resultCode = i;
            resultRecord.resultBundle = bundle;
        }
    }

    public void d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6b3c09", new Object[]{this, bundle});
        } else if (!this.o) {
        } else {
            this.e = bundle;
        }
    }

    public r k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("71b79089", new Object[]{this});
        }
        if (!this.o) {
            return null;
        }
        if (this.k == null) {
            this.k = new r(this.l);
        }
        return this.k;
    }

    private Animation n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("27a7f5c1", new Object[]{this});
        }
        int i = this.i;
        if (i == Integer.MIN_VALUE) {
            a aVar = this.b;
            if (aVar != null && aVar.c() != null) {
                return this.b.c();
            }
            return null;
        }
        try {
            return AnimationUtils.loadAnimation(this.f, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
