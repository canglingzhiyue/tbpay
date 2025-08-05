package tb;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.lnv;

/* loaded from: classes7.dex */
public class lnu implements lnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f30752a;
    public WeakReference<View> b;
    public final lnv.a c;
    public final WeakReference<Context> d;
    private Animation e;
    private boolean f = false;
    private final ViewGroup g = f();

    static {
        kge.a(-3884403);
        kge.a(-1449157298);
    }

    public static /* synthetic */ Animation.AnimationListener a(lnu lnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation.AnimationListener) ipChange.ipc$dispatch("189fd75d", new Object[]{lnuVar}) : lnuVar.h();
    }

    public static /* synthetic */ Animation a(lnu lnuVar, Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7e359d71", new Object[]{lnuVar, animation});
        }
        lnuVar.e = animation;
        return animation;
    }

    public static /* synthetic */ Animation b(lnu lnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation) ipChange.ipc$dispatch("82fd6090", new Object[]{lnuVar}) : lnuVar.e;
    }

    public static /* synthetic */ void c(lnu lnuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02aa7c7", new Object[]{lnuVar});
        } else {
            lnuVar.i();
        }
    }

    public static /* synthetic */ ViewGroup d(lnu lnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e0b3dacd", new Object[]{lnuVar}) : lnuVar.g;
    }

    public lnu(Context context, lnv.a aVar) {
        this.d = new WeakReference<>(context);
        this.c = aVar;
    }

    @Override // tb.lnv
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f30752a = new WeakReference<>(view);
        }
    }

    @Override // tb.lnv
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.b = new WeakReference<>(view);
        }
    }

    @Override // tb.lnv
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // tb.lnv
    public lnv.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lnv.a) ipChange.ipc$dispatch("4cac752c", new Object[]{this}) : this.c;
    }

    public Animation a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("8649f91e", new Object[]{this, new Long(j), new Boolean(z)});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        return translateAnimation;
    }

    @Override // tb.lnv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Animation animation = this.e;
        if (animation != null) {
            animation.cancel();
        }
        i();
    }

    @Override // tb.lnv
    public void d() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f = true;
        WeakReference<View> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || (view = this.f30752a.get()) == null) {
            return;
        }
        if (this.g.getChildCount() != 0) {
            this.g.removeAllViews();
        }
        ViewGroup g = g();
        if (g == null) {
            return;
        }
        e();
        this.g.addView(view, new ViewGroup.LayoutParams(-1, -1));
        g.addView(this.g, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // tb.lnv
    public void a(final boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
        } else {
            this.g.postDelayed(new Runnable() { // from class: tb.lnu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    View view;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    lnu lnuVar = lnu.this;
                    lnu.a(lnuVar, lnuVar.a(lnuVar.c.f(), z));
                    lnu.b(lnu.this).setAnimationListener(lnu.a(lnu.this));
                    if (lnu.this.f30752a == null || (view = lnu.this.f30752a.get()) == null) {
                        return;
                    }
                    view.startAnimation(lnu.b(lnu.this));
                }
            }, j);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page", (Object) "Page_Home");
        jSONObject.put("eventId", (Object) "2201");
        jSONObject.put("arg1", (Object) "Page_MiniApp_Show-zoom-animation");
        jSONObject.put("args", JSON.toJSON(this.c));
        ljh.a(jSONObject, (JSONObject) null);
    }

    private ViewGroup f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.d.get());
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: tb.lnu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return true;
            }
        });
        return frameLayout;
    }

    private ViewGroup g() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this});
        }
        Context context = this.d.get();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) {
            return null;
        }
        return (ViewGroup) window.findViewById(16908290);
    }

    private Animation.AnimationListener h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation.AnimationListener) ipChange.ipc$dispatch("a666f4f3", new Object[]{this}) : new Animation.AnimationListener() { // from class: tb.lnu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    lnu.c(lnu.this);
                }
            }
        };
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        final ViewGroup g = g();
        if (g == null) {
            return;
        }
        g.post(new Runnable() { // from class: tb.lnu.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (lnu.this.f30752a != null && lnu.this.f30752a.get() != null) {
                    lnu.d(lnu.this).removeView(lnu.this.f30752a.get());
                }
                g.removeView(lnu.d(lnu.this));
            }
        });
    }
}
