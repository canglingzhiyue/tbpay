package com.taobao.android.editionswitcher.homepage;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import tb.kge;
import tb.njn;
import tb.njr;

/* loaded from: classes5.dex */
public class b implements njr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12298a;
    public boolean b = false;
    private String c;
    private View d;
    private View e;
    private TBMaterialDialog f;
    private HomeLocationResult g;

    static {
        kge.a(-514355081);
        kge.a(1885639559);
    }

    @Override // tb.njr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "normal";
    }

    @Override // tb.njr
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92368715", new Object[]{bVar});
        } else {
            bVar.e();
        }
    }

    public static /* synthetic */ boolean a(b bVar, Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ace950ab", new Object[]{bVar, activity})).booleanValue() : bVar.a(activity);
    }

    public static /* synthetic */ TBMaterialDialog b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMaterialDialog) ipChange.ipc$dispatch("5a4129d4", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ String c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9a9cf92d", new Object[]{bVar}) : bVar.c;
    }

    public b(Activity activity, int i, HomeLocationResult homeLocationResult) {
        this.f12298a = i;
        this.g = homeLocationResult;
        this.f = a(activity, i, homeLocationResult);
    }

    @Override // tb.njr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = true;
        TBMaterialDialog tBMaterialDialog = this.f;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.show();
            View customView = this.f.getCustomView();
            if (!(customView instanceof EditionSwitchView)) {
                return;
            }
            ((EditionSwitchView) customView).traceShowEvent();
            return;
        }
        e();
    }

    @Override // tb.njr
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    private TBMaterialDialog a(final Activity activity, int i, HomeLocationResult homeLocationResult) {
        CTaoEditionSwitchView cTaoEditionSwitchView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMaterialDialog) ipChange.ipc$dispatch("137eb124", new Object[]{this, activity, new Integer(i), homeLocationResult});
        }
        if (activity == null) {
            return null;
        }
        try {
            d dVar = new d() { // from class: com.taobao.android.editionswitcher.homepage.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.editionswitcher.homepage.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        b.a(b.this);
                    }
                }
            };
            if (com.taobao.android.editionswitcher.b.f(activity)) {
                if (com.taobao.android.editionswitcher.b.h(activity)) {
                    cTaoEditionSwitchView = new OldEditionSwitchView(activity, i, dVar);
                } else {
                    if (!com.taobao.android.editionswitcher.b.j(activity) && ((i != 0 || com.taobao.android.editionswitcher.b.l(activity) || !com.taobao.android.editionswitcher.b.k(activity)) && (i != 1 || !com.taobao.android.editionswitcher.b.k(activity)))) {
                        cTaoEditionSwitchView = new HTaoEditionSwitchView(activity, i, dVar);
                    }
                    cTaoEditionSwitchView = new CTaoEditionSwitchView(activity, i, dVar);
                }
            } else if (com.taobao.android.editionswitcher.b.g(activity)) {
                CTaoEditionSwitchView cTaoEditionSwitchView2 = new CTaoEditionSwitchView(activity, i, dVar);
                cTaoEditionSwitchView = cTaoEditionSwitchView2;
                if (i == 0) {
                    cTaoEditionSwitchView = cTaoEditionSwitchView2;
                    if (this.g != null) {
                        cTaoEditionSwitchView = cTaoEditionSwitchView2;
                        if (StringUtils.equals(this.g.isNewVillageDialog, "y")) {
                            cTaoEditionSwitchView2.setAreaName(this.g.villageTitle);
                            cTaoEditionSwitchView2.setChangeAreaReason(this.g.villageDesc);
                            cTaoEditionSwitchView2.setChangeAreaConfirmText(this.g.villageButtonTitle);
                            cTaoEditionSwitchView2.useNewAreaIcon();
                            cTaoEditionSwitchView = cTaoEditionSwitchView2;
                        }
                    }
                }
            } else if (com.taobao.android.editionswitcher.b.e(activity)) {
                cTaoEditionSwitchView = new OldEditionSwitchView(activity, i, dVar);
            } else {
                cTaoEditionSwitchView = new HTaoEditionSwitchView(activity, i, dVar);
            }
            TBMaterialDialog build = new TBMaterialDialog.Builder(cTaoEditionSwitchView.getContext()).customView((View) cTaoEditionSwitchView, false).cardDialog(true).build();
            a(build);
            build.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.editionswitcher.homepage.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    View customView = b.b(b.this).getCustomView();
                    if (customView instanceof EditionSwitchView) {
                        EditionSwitchView editionSwitchView = (EditionSwitchView) customView;
                        editionSwitchView.traceCancelEvent();
                        editionSwitchView.onDismiss();
                    }
                    if (b.c(b.this) != null) {
                        njn.a(b.c(b.this)).b(b.this);
                    }
                    b.a(b.this, activity);
                }
            });
            return build;
        } catch (Throwable th) {
            TLog.loge("EditionSwitcherPopOperation", th.toString());
            return null;
        }
    }

    private boolean a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        final PositionInfo b = com.taobao.android.editionswitcher.b.b(activity);
        if (c.a(StringUtils.equals("CN", b.countryCode) ? b.editionCode : "global") || ((!com.taobao.android.editionswitcher.b.h(activity) && com.taobao.android.editionswitcher.b.f(activity)) || com.taobao.android.editionswitcher.b.d(activity))) {
            return false;
        }
        final View view = null;
        if (com.taobao.android.editionswitcher.b.e(activity)) {
            b(activity);
            view = this.d;
            ((TextView) view.findViewById(R.id.home_edition_tips_content)).setText("您可以随时通过这里切回标准版手淘");
        } else if (!com.taobao.android.editionswitcher.b.h(activity) || !com.taobao.android.editionswitcher.b.f(activity)) {
            c(activity);
            view = this.e;
        }
        if (view == null) {
            return false;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(activity, R.anim.home_common_fade_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(activity, R.anim.home_common_fade_out);
        final View view2 = view;
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.editionswitcher.homepage.b.3
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
                c.a(StringUtils.equals("CN", b.countryCode) ? b.editionCode : "global", true);
                view2.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    new Handler(activity.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.editionswitcher.homepage.b.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (view2.getVisibility() != 0) {
                            } else {
                                if (view2.isShown()) {
                                    view2.startAnimation(loadAnimation2);
                                } else {
                                    view2.setVisibility(8);
                                }
                            }
                        }
                    }, 3000L);
                }
            }
        });
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.editionswitcher.homepage.b.4
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
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.homepage.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                } else {
                    view.startAnimation(loadAnimation2);
                }
            }
        });
        view.startAnimation(loadAnimation);
        return true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TBMaterialDialog tBMaterialDialog = this.f;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.setOnDismissListener(null);
            this.f.dismiss();
        }
        String str = this.c;
        if (str == null) {
            return;
        }
        njn.a(str).b(this);
    }

    private void a(TBMaterialDialog tBMaterialDialog) {
        HomeLocationResult homeLocationResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778a7cc8", new Object[]{this, tBMaterialDialog});
        } else if (!com.taobao.android.editionswitcher.b.g(tBMaterialDialog.getContext()) || this.f12298a != 0 || (homeLocationResult = this.g) == null || !StringUtils.equals(homeLocationResult.isNewVillageDialog, "y") || !StringUtils.equals(this.g.villageForceSwitch, "y")) {
        } else {
            try {
                tBMaterialDialog.getView().findViewById(R.id.uik_mdButtonClose).setVisibility(8);
                tBMaterialDialog.setCanceledOnTouchOutside(false);
                tBMaterialDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.android.editionswitcher.homepage.b.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnKeyListener
                    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue() : i == 4;
                    }
                });
            } catch (Throwable th) {
                TLog.loge("EditionSwitcherPopOperation", th.toString());
            }
        }
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        if (this.d == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.home_edition_tips_old);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 19) {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 45.0f) + SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            } else {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 45.0f);
            }
            this.d = viewStub.inflate();
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        if (this.e == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.home_edition_tips_base);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 19) {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 40.0f) + SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            } else {
                layoutParams.topMargin = DensityUtil.dip2px(Globals.getApplication(), 40.0f);
            }
            this.e = viewStub.inflate();
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
