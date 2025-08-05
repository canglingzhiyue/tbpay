package tb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.dispatch.a;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.topmultitab.c;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class til {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lbo f34125a;
    private WeakReference<View> b = null;

    static {
        kge.a(168300746);
    }

    public til(lbo lboVar) {
        this.f34125a = lboVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b != null) {
            laq.a().a("BottomTabBar").b("prepareView").c("已经初始化过了").b();
        } else {
            g();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        laq.a().a("BottomTabBar").b("updateTabBarBgImage").c("TabBarActionButtonProvider.updateTabbarFestival").a("tabBarButtonImageUrl", str).b();
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else {
            f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -(imageView.getHeight() / 2), 0.0f);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(300L);
        imageView.setContentDescription("跳转到猜你喜欢");
        imageView.startAnimation(translateAnimation);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -(imageView.getHeight() / 2));
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(300L);
        imageView.setContentDescription("跳转到首页");
        imageView.startAnimation(translateAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null) {
            return;
        }
        fxq.a((ImageView) view.findViewById(R.id.iv_btn_background), z ? 1 : 0);
        fxq.a((ImageView) view.findViewById(R.id.iv_image), z);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            g();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        imageView.clearAnimation();
        imageView.setVisibility(8);
        ((ImageView) view.findViewById(R.id.iv_btn_background)).setImageDrawable(drawable);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_btn_background);
        ((ImageView) view.findViewById(R.id.iv_image)).setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                imageView.setImageDrawable(view.getContext().getDrawable(R.drawable.homepage_tab_tao_background));
                return;
            } catch (Exception e) {
                ooa.a("Unexpected API call exception.", e);
                return;
            }
        }
        imageView.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.homepage_tab_tao_background));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Activity h = h();
        if (h == null) {
            laq.a().a("BottomTabBar").b("prepareView").c("activity == null").b();
            return;
        }
        final View a2 = ojd.a().a(h);
        a2.setOnClickListener(new View.OnClickListener() { // from class: tb.til.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.a().s();
                }
            }
        });
        this.b = new WeakReference<>(a2);
        a.b().b(new Runnable() { // from class: tb.til.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean a3 = e.a(NavigationTabConstraints.TAB_BIZ_HOMEPAGE, NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET, a2);
                laq b = laq.a().a("BottomTabBar").b("initCustomView");
                b.c("更新小火箭按钮是否成功" + a3).b();
            }
        });
    }

    private Activity h() {
        lbq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2e540519", new Object[]{this});
        }
        lbo lboVar = this.f34125a;
        if (lboVar != null && (a2 = lboVar.a()) != null) {
            return a2.getCurActivity();
        }
        return null;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Activity h = h();
        if (h == null) {
            return;
        }
        b.h().a(h).a(onq.a(str, (String) null), str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, onq.b(str, "5401")).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.til.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                til.this.a(succPhenixEvent.getDrawable());
                return false;
            }
        }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.til.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                til.this.f();
                return false;
            }
        }).fetch();
    }
}
