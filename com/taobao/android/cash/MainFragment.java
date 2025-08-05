package com.taobao.android.cash;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.activity.CustomHalfWXActivity;
import com.taobao.android.cash.activity.a;
import tb.kge;

/* loaded from: classes4.dex */
public class MainFragment extends WeexPageFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CustomHalfWXActivity mAttachedActivity;
    public View mRootView;

    static {
        kge.a(-636603854);
    }

    public static /* synthetic */ Object ipc$super(MainFragment mainFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1589549411) {
            super.onAttach((Context) objArr[0]);
            return null;
        } else if (hashCode != -1126882532) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        }
    }

    @Override // com.alibaba.aliweex.bundle.WeexPageFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mAttachedActivity = (CustomHalfWXActivity) getActivity();
        this.mRootView = onCreateView;
        return onCreateView;
    }

    @Override // com.alibaba.aliweex.bundle.WeexPageFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        setProgressBarView(new a());
        super.onAttach(context);
    }

    public void onCloseCashier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2368b1", new Object[]{this});
        } else {
            this.mAttachedActivity.a();
        }
    }

    public void moveUp(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e4d51f", new Object[]{this, view});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        view.startAnimation(translateAnimation);
    }

    public void moveDown(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19945778", new Object[]{this, view});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.cash.MainFragment.1
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
                    MainFragment.this.mAttachedActivity.finish();
                }
            }
        });
        view.startAnimation(translateAnimation);
    }
}
