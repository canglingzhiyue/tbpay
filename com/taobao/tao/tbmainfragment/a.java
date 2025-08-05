package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Animation f21127a;
    private Animation b;
    private Animation c;
    private Animation d;
    private Animation e;
    private Animation f;
    private Context g;
    private FragmentAnimator h;

    static {
        kge.a(1973276845);
    }

    public a(Context context, FragmentAnimator fragmentAnimator) {
        this.g = context;
        this.h = fragmentAnimator;
    }

    public void a(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4936d1c", new Object[]{this, fragmentAnimator});
            return;
        }
        this.h = fragmentAnimator;
        g();
        h();
        i();
        j();
    }

    public Animation a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("367601ae", new Object[]{this});
        }
        if (this.f21127a == null) {
            this.f21127a = AnimationUtils.loadAnimation(this.g, R.anim.no_anim);
        }
        return this.f21127a;
    }

    public Animation b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("97c89e4d", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new Animation() { // from class: com.taobao.tao.tbmainfragment.a.1
            };
        }
        return this.b;
    }

    public Animation c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("f91b3aec", new Object[]{this});
        }
        Animation animation = this.c;
        return animation != null ? animation : g();
    }

    public Animation d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("5a6dd78b", new Object[]{this});
        }
        Animation animation = this.d;
        return animation != null ? animation : h();
    }

    public Animation e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("bbc0742a", new Object[]{this});
        }
        Animation animation = this.e;
        return animation != null ? animation : i();
    }

    public Animation f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("1d1310c9", new Object[]{this});
        }
        Animation animation = this.f;
        return animation != null ? animation : j();
    }

    public Animation a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7609c10c", new Object[]{this, fragment});
        }
        if ((fragment.getTag() == null || !fragment.getTag().startsWith("android:switcher:") || !fragment.getUserVisibleHint()) && (fragment.getParentFragment() == null || !fragment.getParentFragment().isRemoving() || fragment.isHidden())) {
            return null;
        }
        Animation animation = new Animation() { // from class: com.taobao.tao.tbmainfragment.a.2
        };
        animation.setDuration(d().getDuration());
        return animation;
    }

    private Animation g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7e65ad68", new Object[]{this});
        }
        if (this.h.getEnter() == 0) {
            this.c = a();
        } else {
            this.c = AnimationUtils.loadAnimation(this.g, this.h.getEnter());
        }
        return this.c;
    }

    private Animation h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("dfb84a07", new Object[]{this});
        }
        if (this.h.getExit() == 0) {
            this.d = a();
        } else {
            this.d = AnimationUtils.loadAnimation(this.g, this.h.getExit());
        }
        return this.d;
    }

    private Animation i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("410ae6a6", new Object[]{this});
        }
        if (this.h.getPopEnter() == 0) {
            this.e = a();
        } else {
            this.e = AnimationUtils.loadAnimation(this.g, this.h.getPopEnter());
        }
        return this.e;
    }

    private Animation j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("a25d8345", new Object[]{this});
        }
        if (this.h.getPopExit() == 0) {
            this.f = a();
        } else {
            this.f = AnimationUtils.loadAnimation(this.g, this.h.getPopExit());
        }
        return this.f;
    }
}
