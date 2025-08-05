package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ddv;
import tb.kge;
import tb.ply;
import tb.plz;

/* loaded from: classes6.dex */
public class UserRecExpFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_HIDE_USER_REC_EXP_PANEL = "com.taobao.taolive.room.hide_user_rec_exp_panel";
    private static final String EVENT_SHOW_USER_REC_EXP_PANEL = "com.taobao.taolive.room.show_user_rec_exp_panel";
    private View mContentView;

    static {
        kge.a(847587236);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(UserRecExpFrame userRecExpFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "UserRecExpFrame";
    }

    public static /* synthetic */ void access$000(UserRecExpFrame userRecExpFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fee786", new Object[]{userRecExpFrame});
        } else {
            userRecExpFrame.removeAllViews();
        }
    }

    public static /* synthetic */ View access$100(UserRecExpFrame userRecExpFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3e2b227", new Object[]{userRecExpFrame}) : userRecExpFrame.mContentView;
    }

    public static /* synthetic */ View access$102(UserRecExpFrame userRecExpFrame, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f585ae91", new Object[]{userRecExpFrame, view});
        }
        userRecExpFrame.mContentView = view;
        return view;
    }

    public static /* synthetic */ void access$200(UserRecExpFrame userRecExpFrame, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a950f8e", new Object[]{userRecExpFrame, view});
        } else {
            userRecExpFrame.startShowAnimation(view);
        }
    }

    public static /* synthetic */ void access$300(UserRecExpFrame userRecExpFrame, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4c438f", new Object[]{userRecExpFrame, view});
        } else {
            userRecExpFrame.startCloseAnimation(view);
        }
    }

    public UserRecExpFrame(Context context) {
        super(context);
    }

    public UserRecExpFrame(Context context, boolean z) {
        super(context, z);
    }

    public UserRecExpFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
    }

    public UserRecExpFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public UserRecExpFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_user_recommend_experience_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (!ply.aJ() || this.mFrameContext == null || this.mContext == null || this.mContainer == null || this.mContainer.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mContainer.getLayoutParams();
        layoutParams.width = com.taobao.taolive.room.utils.d.a(this.mContext, 272.0f);
        layoutParams.width = plz.b(this.mContext);
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 12.0f);
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(a2, com.taobao.taolive.room.utils.d.a(this.mContext, 3.0f), a2, 0);
        }
        this.mContainer.setLayoutParams(layoutParams);
        this.mFrameContext.e().a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (!ply.aJ()) {
            return;
        }
        if (this.mFrameContext != null && this.mFrameContext.e() != null) {
            this.mFrameContext.e().b(this);
        }
        removeAllViews();
    }

    @Override // tb.ddv
    public void onEvent(String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!ply.aJ()) {
        } else {
            if ("com.taobao.taolive.room.show_user_rec_exp_panel".equals(str) && (obj instanceof View) && (this.mContainer instanceof ViewGroup) && !isShowing()) {
                this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.UserRecExpFrame.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        UserRecExpFrame.access$000(UserRecExpFrame.this);
                        UserRecExpFrame.access$102(UserRecExpFrame.this, (View) obj);
                        ((ViewGroup) UserRecExpFrame.this.mContainer).addView(UserRecExpFrame.access$100(UserRecExpFrame.this), new FrameLayout.LayoutParams(UserRecExpFrame.this.mContainer.getMeasuredWidth(), 0));
                        UserRecExpFrame userRecExpFrame = UserRecExpFrame.this;
                        UserRecExpFrame.access$200(userRecExpFrame, UserRecExpFrame.access$100(userRecExpFrame));
                    }
                });
            } else if (!"com.taobao.taolive.room.hide_user_rec_exp_panel".equals(str) || !(this.mContainer instanceof ViewGroup) || !isShowing()) {
            } else {
                this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.UserRecExpFrame.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        UserRecExpFrame userRecExpFrame = UserRecExpFrame.this;
                        UserRecExpFrame.access$300(userRecExpFrame, UserRecExpFrame.access$100(userRecExpFrame));
                    }
                });
            }
        }
    }

    private boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : (!(this.mContainer instanceof ViewGroup) || this.mContentView == null || ((ViewGroup) this.mContainer).indexOfChild(this.mContentView) == -1) ? false : true;
    }

    private void startShowAnimation(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08a4b86", new Object[]{this, view});
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(this.mContainer.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.mContainer.getMeasuredWidth(), Integer.MIN_VALUE));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, view.getMeasuredHeight());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.UserRecExpFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                View view2 = view;
                if (view2 == null || view2.getLayoutParams() == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(100L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
    }

    private void startCloseAnimation(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66c33bd", new Object[]{this, view});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredHeight(), 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.UserRecExpFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                View view2 = view;
                if (view2 == null || view2.getLayoutParams() == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(100L);
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.UserRecExpFrame.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                UserRecExpFrame.access$000(UserRecExpFrame.this);
            }
        });
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
    }

    private void removeAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816149f8", new Object[]{this});
        } else if (!(this.mContainer instanceof ViewGroup)) {
        } else {
            ((ViewGroup) this.mContainer).removeAllViews();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.show_user_rec_exp_panel", "com.taobao.taolive.room.hide_user_rec_exp_panel"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }
}
