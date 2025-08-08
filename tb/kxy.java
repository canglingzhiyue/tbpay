package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.g;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class kxy implements j<Event> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lbo f30387a;
    private View b;
    private View c;
    private Handler d = new Handler(Looper.getMainLooper());

    static {
        kge.a(-223627810);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Handler a(kxy kxyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("6e54789a", new Object[]{kxyVar}) : kxyVar.d;
    }

    public static /* synthetic */ String a(kxy kxyVar, PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50cfcf05", new Object[]{kxyVar, positionInfo}) : kxyVar.a(positionInfo);
    }

    public kxy(lbo lboVar) {
        this.f30387a = lboVar;
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        Activity curActivity = this.f30387a.a().getCurActivity();
        if (curActivity == null) {
            return i.FAILURE;
        }
        final PositionInfo b = l.b(curActivity);
        if (g.a(a(b)) || (!l.i(curActivity) && l.f(curActivity))) {
            return i.FAILURE;
        }
        if (l.d(curActivity)) {
            return i.FAILURE;
        }
        final View view = null;
        if (l.e(curActivity)) {
            a(curActivity);
            view = this.c;
            ((TextView) view.findViewById(R.id.home_edition_tips_content)).setText(b.a(R.string.taobao_app_1000_1_16154));
        } else if (!l.i(curActivity) || !l.f(curActivity)) {
            b(curActivity);
            view = this.b;
        }
        if (view == null) {
            return i.FAILURE;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(curActivity, R.anim.home_common_fade_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(curActivity, R.anim.home_common_fade_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.kxy.1
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
                    return;
                }
                g.a(kxy.a(kxy.this, b), true);
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    kxy.a(kxy.this).postDelayed(new Runnable() { // from class: tb.kxy.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (view.getVisibility() != 0) {
                            } else {
                                if (view.isShown()) {
                                    view.startAnimation(loadAnimation2);
                                } else {
                                    view.setVisibility(8);
                                }
                            }
                        }
                    }, 3000L);
                }
            }
        });
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: tb.kxy.2
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
                    view.setVisibility(8);
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: tb.kxy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    view.startAnimation(loadAnimation2);
                }
            }
        });
        view.startAnimation(loadAnimation);
        return i.SUCCESS;
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        if (this.c == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.home_edition_tips_old);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 19) {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 45.0f) + SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            } else {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 45.0f);
            }
            this.c = viewStub.inflate();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        if (this.b == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.home_edition_tips_base);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 19) {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 40.0f) + SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            } else {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 40.0f);
            }
            this.b = viewStub.inflate();
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private String a(PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6a55dc1", new Object[]{this, positionInfo}) : StringUtils.equals("CN", positionInfo.countryCode) ? positionInfo.editionCode : "global";
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
