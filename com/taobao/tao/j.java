package com.taobao.tao;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class j implements a.InterfaceC0630a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-682101043);
        kge.a(370049290);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if ((activity instanceof BaseActivity) || !(activity instanceof AppCompatActivity)) {
        } else {
            if (((activity instanceof m) && !((m) activity).b()) || (supportActionBar = ((AppCompatActivity) activity).getSupportActionBar()) == null || !supportActionBar.f()) {
                return;
            }
            supportActionBar.a(0.0f);
            supportActionBar.b(ContextCompat.getDrawable(activity, R.color.uik_action_bar_normal));
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.action_bar_container);
            Toolbar toolbar = (Toolbar) activity.findViewById(R.id.action_bar);
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = (int) activity.getResources().getDimension(R.dimen.uik_action_bar_height);
                viewGroup.setLayoutParams(layoutParams);
            }
            if (toolbar == null) {
                return;
            }
            toolbar.setContentInsetStartWithNavigation(0);
            ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
            layoutParams2.height = (int) activity.getResources().getDimension(R.dimen.uik_action_bar_height);
            toolbar.setLayoutParams(layoutParams2);
            toolbar.setTitleTextColor(ContextCompat.getColor(activity, R.color.uik_action_icon_normal));
            toolbar.setSubtitleTextColor(ContextCompat.getColor(activity, R.color.uik_action_icon_normal));
            toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                Drawable wrap = DrawableCompat.wrap(navigationIcon);
                wrap.mutate();
                DrawableCompat.setTint(wrap, ContextCompat.getColor(activity, R.color.uik_action_icon_normal));
            }
            toolbar.setTitleTextAppearance(activity, R.style.TBTitle);
            toolbar.setSubtitleTextAppearance(activity, R.style.TBSubTitle);
            toolbar.setTitleMargin(0, toolbar.getTitleMarginTop(), 0, toolbar.getTitleMarginBottom());
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon == null) {
                return;
            }
            Drawable wrap2 = DrawableCompat.wrap(overflowIcon);
            wrap2.mutate();
            DrawableCompat.setTint(wrap2, ContextCompat.getColor(activity, R.color.uik_action_icon_normal));
        }
    }
}
