package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.b;
import com.taobao.taobao.R;
import tb.hfy;
import tb.kge;

/* loaded from: classes5.dex */
public class BottomShowChatView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsAnimating;

    static {
        kge.a(-744046111);
    }

    public static /* synthetic */ boolean access$002(BottomShowChatView bottomShowChatView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("323e14d1", new Object[]{bottomShowChatView, new Boolean(z)})).booleanValue();
        }
        bottomShowChatView.mIsAnimating = z;
        return z;
    }

    public BottomShowChatView(Context context) {
        super(context);
    }

    public BottomShowChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomShowChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void animate(hfy hfyVar, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4014eea9", new Object[]{this, hfyVar, aVar});
            return;
        }
        this.mIsAnimating = true;
        hfyVar.itemView.setAlpha(1.0f);
        if (getChildCount() > 0) {
            final View childAt = getChildAt(0);
            removeView(hfyVar.itemView);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            addView(hfyVar.itemView, layoutParams);
            hfyVar.itemView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE));
            ObjectAnimator duration = ObjectAnimator.ofFloat(hfyVar.itemView, "translationY", hfyVar.itemView.getMeasuredHeight(), 0.0f).setDuration(300L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(childAt, "alpha", 1.0f, 0.0f).setDuration(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.BottomShowChatView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
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
                    BottomShowChatView.this.removeView(childAt);
                    if (childAt.getTag(R.id.bottom_show_chat_view) instanceof hfy) {
                        aVar.a((hfy) childAt.getTag(R.id.bottom_show_chat_view));
                    }
                    BottomShowChatView.access$002(BottomShowChatView.this, false);
                }
            });
            animatorSet.playTogether(duration, duration2);
            animatorSet.start();
            return;
        }
        removeView(hfyVar.itemView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        addView(hfyVar.itemView, layoutParams2);
        hfyVar.itemView.setTag(R.id.bottom_show_chat_view, hfyVar);
        hfyVar.itemView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE));
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(hfyVar.itemView, "translationY", hfyVar.itemView.getMeasuredHeight(), 0.0f).setDuration(300L);
        duration3.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.BottomShowChatView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
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
                BottomShowChatView.access$002(BottomShowChatView.this, false);
            }
        });
        duration3.start();
    }

    public boolean isAnimating() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue() : this.mIsAnimating;
    }
}
