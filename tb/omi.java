package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class omi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private oml f32176a;
    private final TBFragmentTabHost d;
    private Animator f;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AnimatorListenerAdapter e = new a();

    public static /* synthetic */ AtomicBoolean a(omi omiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("22a0e5ad", new Object[]{omiVar}) : omiVar.c;
    }

    public static /* synthetic */ AtomicBoolean b(omi omiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4bf53aee", new Object[]{omiVar}) : omiVar.b;
    }

    public static /* synthetic */ oml c(omi omiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oml) ipChange.ipc$dispatch("8d90d969", new Object[]{omiVar}) : omiVar.f32176a;
    }

    public static /* synthetic */ TBFragmentTabHost d(omi omiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBFragmentTabHost) ipChange.ipc$dispatch("b57b5b7d", new Object[]{omiVar}) : omiVar.d;
    }

    public static /* synthetic */ void e(omi omiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23bb2b1", new Object[]{omiVar});
        } else {
            omiVar.a();
        }
    }

    public omi(TBFragmentTabHost tBFragmentTabHost) {
        this.d = tBFragmentTabHost;
    }

    public void a(oml omlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f830f5ca", new Object[]{this, omlVar});
        } else {
            this.f32176a = omlVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.set(false);
        this.b.set(false);
        this.f = null;
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        String a2 = com.taobao.tao.navigation.a.a();
        TLog.loge(a2, "NavigationVisibilityController", "start animate. should hide " + z);
        if (z) {
            if (this.c.get()) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "NavigationVisibilityController", "hide animate failed. is animating");
                return false;
            } else if (this.d.getVisibility() == 4) {
                String a3 = com.taobao.tao.navigation.a.a();
                TLog.loge(a3, "NavigationVisibilityController", "hide animate failed. tabhost is invisible. should hide " + z + this.d);
                return false;
            } else {
                if (this.f != null && this.b.get()) {
                    omq.a(this.d, this.f);
                }
                oml omlVar = this.f32176a;
                if (omlVar != null) {
                    omlVar.b();
                }
                this.c.set(true);
                this.b.set(false);
            }
        } else if (this.b.get()) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "NavigationVisibilityController", "hide animate failed. is animating");
            return false;
        } else {
            if (this.d.getVisibility() == 0) {
                if (this.f != null && this.c.get()) {
                    omq.a(this.d, this.f);
                } else {
                    String a4 = com.taobao.tao.navigation.a.a();
                    TLog.loge(a4, "NavigationVisibilityController", "hide animate failed. tabhost is visible. should hide " + z + this.d);
                    return false;
                }
            }
            this.d.setVisibility(0);
            this.b.set(true);
            this.c.set(false);
        }
        this.f = omq.a(this.d, z, this.e);
        return true;
    }

    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        String a2 = com.taobao.tao.navigation.a.a();
        TLog.loge(a2, "NavigationVisibilityController", "start visible operation. should hide " + z);
        if (z) {
            if (this.d.getVisibility() == 4) {
                String a3 = com.taobao.tao.navigation.a.a();
                TLog.loge(a3, "NavigationVisibilityController", "hide failed. tab host is invisible. should hide " + z);
                return false;
            } else if (this.c.get()) {
                String a4 = com.taobao.tao.navigation.a.a();
                TLog.loge(a4, "NavigationVisibilityController", "hide return. tab host is hide animating. should hide " + z);
                return false;
            } else {
                if (this.f != null && this.b.get()) {
                    omq.a(this.d, this.f);
                    String a5 = com.taobao.tao.navigation.a.a();
                    TLog.loge(a5, "NavigationVisibilityController", "stop show animation. tab host should hide " + z);
                }
                oml omlVar = this.f32176a;
                if (omlVar != null) {
                    z2 = omlVar.b();
                }
                if (z2) {
                    this.d.setVisibility(4);
                }
                return z2;
            }
        } else if (this.d.getVisibility() == 0) {
            if (this.f != null && this.c.get()) {
                omq.a(this.d, this.f);
                String a6 = com.taobao.tao.navigation.a.a();
                TLog.loge(a6, "NavigationVisibilityController", "stop hide animation. tab host should hide " + z);
                return true;
            }
            String a7 = com.taobao.tao.navigation.a.a();
            TLog.loge(a7, "NavigationVisibilityController", "show failed. tab host is visible. should hide " + z);
            return false;
        } else {
            oml omlVar2 = this.f32176a;
            boolean a8 = omlVar2 != null ? omlVar2.a() : false;
            if (!a8) {
                return a8;
            }
            this.d.setVisibility(0);
            return a8;
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            } else if (hashCode != -1868320925) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAnimationCancel((Animator) objArr[0]);
                return null;
            }
        }

        private a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            super.onAnimationCancel(animator);
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, "NavigationVisibilityController", "animate cancle. isHideAnimating:" + omi.a(omi.this).get() + " isShowAnimating:" + omi.b(omi.this).get());
            if (omi.c(omi.this) != null) {
                omi.c(omi.this).a();
            }
            omi.d(omi.this).setVisibility(0);
            omi.e(omi.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, "NavigationVisibilityController", "animate end. isHideAnimating:" + omi.a(omi.this).get() + " isShowAnimating:" + omi.b(omi.this).get());
            if (omi.a(omi.this).get()) {
                omi.d(omi.this).setVisibility(4);
            } else if (omi.c(omi.this) != null) {
                omi.c(omi.this).a();
            }
            omi.e(omi.this);
        }
    }
}
