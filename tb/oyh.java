package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.ui.view.NewDetailMaskFrameLayout;

/* loaded from: classes8.dex */
public class oyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f32488a;
    private NewDetailMaskFrameLayout b;
    private boolean c;
    private boolean d = false;
    private NewDetailMaskFrameLayout.a e = new NewDetailMaskFrameLayout.a() { // from class: tb.oyh.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.a
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "delay";
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (oyh.a(oyh.this) != null) {
                oyh.a(oyh.this).d(true);
            }
            ddw.a().a("com.taobao.taolive.room.ent.opt.animation.end");
        }
    };
    private e f;

    static {
        kge.a(842705469);
    }

    public static /* synthetic */ e a(oyh oyhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("48d655f0", new Object[]{oyhVar}) : oyhVar.f;
    }

    public oyh(Activity activity) {
        this.f32488a = activity;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        b(bundle);
        i();
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!e()) {
        } else {
            try {
                if (this.f32488a == null) {
                    return;
                }
                this.f32488a.setTheme(R.style.Theme_TransparentLive);
            } catch (Throwable unused) {
            }
        }
    }

    public void a() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!e() || (activity = this.f32488a) == null) {
        } else {
            activity.setContentView(R.layout.taolive_animation_layout);
            this.b = (NewDetailMaskFrameLayout) this.f32488a.findViewById(R.id.rootAnimFrameLayout);
            NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.b;
            if (newDetailMaskFrameLayout == null) {
                return;
            }
            newDetailMaskFrameLayout.prepareActivity();
            this.b.setParentFrameLayout((FrameLayout) this.f32488a.findViewById(R.id.rootParentFrameLayout));
            this.b.setMaskFrameLayoutHandler(new NewDetailMaskFrameLayout.b() { // from class: tb.oyh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1003426823) {
                        super.a((String) objArr[0], (String) objArr[1], (Throwable) objArr[2]);
                        return null;
                    } else if (hashCode != -650670724) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.a((String) objArr[0], (String) objArr[1]);
                        return null;
                    }
                }

                @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.b
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.b
                public int b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
                    }
                    return 1;
                }

                @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.b
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        super.a(str, str2);
                    }
                }

                @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.b
                public void a(String str, String str2, Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                    } else {
                        super.a(str, str2, th);
                    }
                }
            });
            this.b.getNewDetailMaskFrameLayoutContext().a(this.e);
            this.b.initAnim();
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
        } else if (!e()) {
        } else {
            this.f = eVar;
            e eVar2 = this.f;
            if (eVar2 == null) {
                return;
            }
            eVar2.b(true);
        }
    }

    public void a(View view) {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!e() || (newDetailMaskFrameLayout = this.b) == null) {
        } else {
            newDetailMaskFrameLayout.addView(view);
        }
    }

    public void c() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!e() || (newDetailMaskFrameLayout = this.b) == null) {
        } else {
            newDetailMaskFrameLayout.onFinish();
        }
    }

    public void d() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!e() || (newDetailMaskFrameLayout = this.b) == null) {
        } else {
            newDetailMaskFrameLayout.destroy();
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : h() && g();
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c;
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.d;
    }

    private void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47681e4b", new Object[]{this, bundle});
        } else if (bundle != null) {
            this.c = false;
        } else {
            Intent intent = this.f32488a.getIntent();
            Bundle bundleExtra = intent.getBundleExtra("nav_animation_extra");
            if (!intent.getBooleanExtra("extraEnableTransition", false) || !c(bundleExtra)) {
                z = false;
            }
            this.c = z;
        }
    }

    private boolean c(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4369ad2e", new Object[]{this, bundle})).booleanValue() : bundle != null && bundle.containsKey("view_screen_start_x") && bundle.containsKey("view_screen_start_y") && bundle.getFloat("view_height", -1.0f) > 0.0f && bundle.getFloat("view_width", -1.0f) > 0.0f;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (pmd.a().d() == null) {
        } else {
            this.d = l.d(pmd.a().d().a("tblive", "enableLiveRoomEnterOpt0304", "true"));
        }
    }
}
