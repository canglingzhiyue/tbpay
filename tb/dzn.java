package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class dzn implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f27139a;
    private static final int b;
    private Context c;
    private WindowManager g;
    private WindowManager.LayoutParams h;
    private boolean k;
    private String l;
    private PopupWindow j = null;
    private View d = LayoutInflater.from(epo.a()).inflate(R.layout.x_detail_service_banner, (ViewGroup) null);
    private TextView e = (TextView) this.d.findViewById(R.id.service_banner_tips);
    private Button f = (Button) this.d.findViewById(R.id.service_banner_button);
    private Handler i = new Handler(Looper.getMainLooper(), this);
    private DetailImageView m = (DetailImageView) this.d.findViewById(R.id.service_banner_logo);

    public static /* synthetic */ Context a(dzn dznVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1929f980", new Object[]{dznVar, context});
        }
        dznVar.c = context;
        return context;
    }

    public static /* synthetic */ View a(dzn dznVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb3b8754", new Object[]{dznVar, view});
        }
        dznVar.d = view;
        return view;
    }

    public static /* synthetic */ WindowManager a(dzn dznVar, WindowManager windowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("46f71cd6", new Object[]{dznVar, windowManager});
        }
        dznVar.g = windowManager;
        return windowManager;
    }

    public static /* synthetic */ boolean a(dzn dznVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e623c144", new Object[]{dznVar})).booleanValue() : dznVar.k;
    }

    public static /* synthetic */ boolean a(dzn dznVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de551998", new Object[]{dznVar, new Boolean(z)})).booleanValue();
        }
        dznVar.k = z;
        return z;
    }

    public static /* synthetic */ PopupWindow b(dzn dznVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("13af0c53", new Object[]{dznVar}) : dznVar.j;
    }

    public static /* synthetic */ WindowManager c(dzn dznVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager) ipChange.ipc$dispatch("20761e30", new Object[]{dznVar}) : dznVar.g;
    }

    public static /* synthetic */ WindowManager.LayoutParams d(dzn dznVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager.LayoutParams) ipChange.ipc$dispatch("773004d3", new Object[]{dznVar}) : dznVar.h;
    }

    public static /* synthetic */ View e(dzn dznVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9dcfaa86", new Object[]{dznVar}) : dznVar.d;
    }

    public static /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue() : b;
    }

    static {
        kge.a(-2073482378);
        kge.a(-1043440182);
        f27139a = 3000;
        b = ViewConfiguration.getTouchSlop();
    }

    public dzn(Context context) {
        this.c = context;
        this.g = (WindowManager) this.c.getSystemService(a.ATOM_EXT_window);
        emu.a("com.taobao.android.detail.core.detail.kit.view.banner.ServiceBanner");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.j == null || !this.j.isShowing()) {
                return;
            }
            this.j.dismiss();
            this.j = null;
        } catch (Exception e) {
            i.a("ServiceBanner", "removeBanner", e);
        }
    }

    public void a(String str, String str2, String str3, String str4, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb741a9", new Object[]{this, str, str2, str3, str4, onClickListener});
            return;
        }
        this.l = str2;
        this.f.setOnClickListener(new View.OnClickListener() { // from class: tb.dzn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                onClickListener.onClick(view);
                dzn.this.d();
            }
        });
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: tb.dzn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    dzn.a(dzn.this, true);
                    motionEvent.getY();
                    return true;
                }
                if (action != 2) {
                    if (action != 3) {
                        if (!dzn.a(dzn.this)) {
                            return false;
                        }
                        onClickListener.onClick(view);
                        dzn.this.d();
                        return true;
                    }
                } else if (0.0f - motionEvent.getY() > dzn.f()) {
                    dzn.a(dzn.this, false);
                    dzn.this.d();
                }
                return true;
            }
        });
        this.e.setText(str);
        this.f.setText(str3);
        if (str4 != null) {
            this.m.setVisibility(0);
            f.a(this.c).a(this.m, str4);
            return;
        }
        this.m.setVisibility(8);
    }

    public void b() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (e()) {
        } else {
            WindowManager windowManager = this.g;
            if (windowManager != null && (view = this.d) != null) {
                windowManager.addView(view, this.h);
                a(true).start();
            }
            this.i.sendEmptyMessageDelayed(5395284, f27139a);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        final Activity activity = (Activity) this.c;
        PopupWindow popupWindow = this.j;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.j.dismiss();
        }
        this.j = new PopupWindow(this.d, -1, -2, false);
        this.j.setTouchable(true);
        this.j.setOutsideTouchable(true);
        this.j.setAnimationStyle(R.style.DetailBannerAnim);
        this.j.setSoftInputMode(16);
        final View decorView = ((Activity) this.c).getWindow().getDecorView();
        decorView.postDelayed(new Runnable() { // from class: tb.dzn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (activity.isFinishing() || dzn.b(dzn.this) == null) {
                } else {
                    dzn.b(dzn.this).showAtLocation(decorView, 48, 0, 0);
                }
            }
        }, 100L);
        this.i.sendEmptyMessageDelayed(5395284, f27139a);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 4477780) {
            b();
        } else if (i == 5395284) {
            a();
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.i.removeMessages(5395284);
        this.i.sendEmptyMessage(5395284);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        View view = this.d;
        return view != null && view.isShown();
    }

    private ValueAnimator a(final boolean z) {
        ValueAnimator duration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("94358cd0", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            duration = ValueAnimator.ofInt(0, a(72.0f)).setDuration(300L);
        } else {
            duration = ValueAnimator.ofInt(a(72.0f), 0).setDuration(300L);
        }
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.dzn.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (dzn.c(dzn.this) == null || !valueAnimator.isRunning()) {
                } else {
                    dzn.d(dzn.this).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    dzn.c(dzn.this).updateViewLayout(dzn.e(dzn.this), dzn.d(dzn.this));
                }
            }
        });
        duration.addListener(new Animator.AnimatorListener() { // from class: tb.dzn.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (z || dzn.c(dzn.this) == null || dzn.e(dzn.this) == null) {
                } else {
                    try {
                        dzn.c(dzn.this).removeView(dzn.e(dzn.this));
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    dzn.a(dzn.this, (View) null);
                    dzn.a(dzn.this, (WindowManager) null);
                    dzn.a(dzn.this, (Context) null);
                }
            }
        });
        return duration;
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) (f * epo.f27511a);
    }
}
