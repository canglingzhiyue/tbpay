package com.taobao.android.detail.ttdetail.handler.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.be;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.kge;
import tb.scq;
import tb.scr;
import tb.scs;

/* loaded from: classes5.dex */
public abstract class FloatFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_TITLE = "titleTextView";
    public static boolean needOpenGradient;
    public Context context;
    public FrameLayout customContainer;
    private b emptyViewWrapper;
    private a errorViewWrapper;
    public FrameLayout flLoading;
    public View llContainer;
    private b loadingViewWrapper;
    public ListView lvData;
    public RelativeLayout rlPanel;
    public String title;
    public TextView tvClose;
    public TextView tvTitle;
    public int themeResourceID = 16973840;
    public int mCloseBtnColor = R.color.detail_theme_color;
    private String mStdPopId = null;
    private View.OnClickListener closeListener = new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            FloatFragment floatFragment = FloatFragment.this;
            floatFragment.alphaUp(floatFragment.llContainer);
            FloatFragment.this.moveDown();
        }
    };

    public static /* synthetic */ Object ipc$super(FloatFragment floatFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1840095042:
                super.setupDialog((Dialog) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1373052399:
                super.dismiss();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 937454072:
                super.dismissAllowingStateLoss();
                return null;
            case 1639966335:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void queryData();

    static {
        kge.a(463907941);
        needOpenGradient = false;
    }

    public boolean isShowByStdPop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebede357", new Object[]{this})).booleanValue() : this.mStdPopId != null;
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        scr a2;
        if (e.b()) {
            try {
                Field declaredField = Class.forName("android.support.v4.app.FragmentManagerImpl").getDeclaredField("mContainer");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(fragmentManager);
                Field declaredField2 = Class.forName("android.support.v4.app.FragmentHostCallback").getDeclaredField("mActivity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                String str2 = "detail_float_" + System.currentTimeMillis();
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putString("stdPopPopId", str2);
                arguments.putFloat("stdPopMaxH", e.a(activity) ? 1.0f : 0.8f);
                setArguments(arguments);
                if (scs.a(activity, this, new scq() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.scq
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        }
                    }

                    @Override // tb.scq
                    public void b(JSONObject jSONObject) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                        }
                    }
                }).f33478a) {
                    this.mStdPopId = str2;
                    return;
                }
                i.a("FloatFragment", "call StdPop fail on pad: " + a2.b + ", " + a2.c);
                return;
            } catch (Throwable th) {
                i.a("FloatFragment", "hook pop fail on pad", th);
            }
        }
        super.show(fragmentManager, str);
    }

    @Override // android.support.v4.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925260be", new Object[]{this, dialog, new Integer(i)});
            return;
        }
        super.setupDialog(dialog, i);
        if (dialog == null) {
            return;
        }
        be.a(y.a(this), dialog.getWindow(), false);
        be.a(dialog.getWindow(), -1);
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e069f8", new Object[]{this});
        } else if (isShowByStdPop()) {
            scs.a(getActivity(), this.mStdPopId);
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (isShowByStdPop()) {
            scs.a(getActivity(), this.mStdPopId);
        } else {
            super.dismiss();
        }
    }

    public static void startFragment(FragmentActivity fragmentActivity, DialogFragment dialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1366a0", new Object[]{fragmentActivity, dialogFragment});
            return;
        }
        try {
            dialogFragment.show(fragmentActivity.getSupportFragmentManager(), dialogFragment.getTag());
        } catch (IllegalStateException e) {
            i.a("FloatFragment", "startFragment", e);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.context = getActivity();
        setStyle(0, this.themeResourceID);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.title = arguments.getString("titleTextView", "");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.tt_detail_float_dialog, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.llContainer = view.findViewById(R.id.ll_container);
        if (isShowByStdPop()) {
            this.llContainer.setBackgroundColor(-1);
            this.llContainer.setPadding(0, SystemBarDecorator.SystemBarConfig.getStatusBarHeight(f.a()), 0, 0);
            View findViewById = view.findViewById(R.id.tm_detail_background);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        this.tvTitle = (TextView) view.findViewById(R.id.tv_title);
        this.tvClose = (TextView) view.findViewById(R.id.tv_close);
        this.rlPanel = (RelativeLayout) view.findViewById(R.id.rl_panel);
        this.lvData = (ListView) view.findViewById(R.id.lv_data);
        this.flLoading = (FrameLayout) view.findViewById(R.id.fl_loading);
        this.customContainer = (FrameLayout) view.findViewById(R.id.custome_data);
        this.loadingViewWrapper = getLoadingViewWrapper();
        this.emptyViewWrapper = getEmptyViewWrapper();
        this.errorViewWrapper = getErrorViewWrapper();
        if (!TextUtils.isEmpty(this.title)) {
            this.tvTitle.setText(this.title);
        } else {
            this.tvTitle.setVisibility(8);
        }
        if (needOpenGradient) {
            this.tvClose.setBackgroundResource(R.drawable.tt_detail_gradient_color_orange);
        } else {
            this.tvClose.setBackgroundResource(this.mCloseBtnColor);
        }
        this.tvClose.setOnClickListener(this.closeListener);
        this.llContainer.setOnClickListener(this.closeListener);
        alphaDown(this.llContainer);
        moveUp();
    }

    public b getLoadingViewWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("29dca05", new Object[]{this}) : new b() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.fragment.b
            public View a(Context context) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("876fa4a2", new Object[]{this, context}) : LayoutInflater.from(context).inflate(R.layout.tt_detail_view_loading, (ViewGroup) null);
            }
        };
    }

    public b getEmptyViewWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("adbb3614", new Object[]{this}) : new b() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.fragment.b
            public View a(Context context) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("876fa4a2", new Object[]{this, context}) : LayoutInflater.from(context).inflate(R.layout.tt_detail_view_empty, (ViewGroup) null);
            }
        };
    }

    public a getErrorViewWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("978efe1a", new Object[]{this}) : new a() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private View b;

            @Override // com.taobao.android.detail.ttdetail.handler.fragment.b
            public View a(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("876fa4a2", new Object[]{this, context});
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.tt_detail_view_error, (ViewGroup) null);
                this.b = inflate.findViewById(R.id.reloadButton);
                return inflate;
            }

            @Override // com.taobao.android.detail.ttdetail.handler.fragment.a
            public void a(View.OnClickListener onClickListener) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
                } else {
                    this.b.setOnClickListener(onClickListener);
                }
            }
        };
    }

    public void alphaDown(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99fdd1cb", new Object[]{this, view});
        } else if (isShowByStdPop()) {
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
    }

    public void alphaUp(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fec832", new Object[]{this, view});
        } else if (isShowByStdPop()) {
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
    }

    public void moveUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dd14d3", new Object[]{this});
        } else if (isShowByStdPop()) {
        } else {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(300L);
            this.rlPanel.startAnimation(translateAnimation);
        }
    }

    public void moveDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477ec71a", new Object[]{this});
        } else if (!isShowByStdPop()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.6
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
                        return;
                    }
                    try {
                        FloatFragment.this.dismissAllowingStateLoss();
                    } catch (Throwable unused) {
                    }
                }
            });
            this.rlPanel.startAnimation(translateAnimation);
        } else {
            try {
                dismissAllowingStateLoss();
            } catch (Throwable unused) {
            }
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        this.flLoading.removeAllViews();
        this.flLoading.setVisibility(0);
        this.flLoading.addView(this.loadingViewWrapper.a(this.context));
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        this.flLoading.setVisibility(8);
        this.flLoading.removeAllViews();
    }

    public void showEmptyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987e091c", new Object[]{this});
            return;
        }
        this.flLoading.removeAllViews();
        this.flLoading.setVisibility(0);
        this.flLoading.addView(this.emptyViewWrapper.a(this.context));
    }

    public void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
            return;
        }
        this.flLoading.removeAllViews();
        this.flLoading.setVisibility(0);
        View a2 = this.errorViewWrapper.a(this.context);
        this.flLoading.addView(a2);
        a2.setVisibility(0);
        this.errorViewWrapper.a(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    FloatFragment.this.queryData();
                }
            }
        });
    }

    public void setThemeResourceID(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a298e1cc", new Object[]{this, new Integer(i)});
        } else {
            this.themeResourceID = i;
        }
    }

    public void setCloseViewBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad0219", new Object[]{this, new Integer(i)});
            return;
        }
        this.mCloseBtnColor = i;
        this.tvClose.setBackgroundResource(i);
    }
}
