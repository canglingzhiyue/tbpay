package com.taobao.search.searchdoor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.ImmersiveRelativeLayout;
import com.taobao.search.sf.k;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.kge;
import tb.ntx;
import tb.nut;

/* loaded from: classes7.dex */
public class TransparentSearchDoorActivity extends SearchDoorActivity implements nut {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImmersiveRelativeLayout b;
    private boolean c;

    static {
        kge.a(-1686394254);
        kge.a(1486308555);
    }

    public static /* synthetic */ Object ipc$super(TransparentSearchDoorActivity transparentSearchDoorActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, tb.tqn
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.search.common.SearchBaseActivity
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ ImmersiveRelativeLayout a(TransparentSearchDoorActivity transparentSearchDoorActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImmersiveRelativeLayout) ipChange.ipc$dispatch("5a63726a", new Object[]{transparentSearchDoorActivity}) : transparentSearchDoorActivity.b;
    }

    public static /* synthetic */ void b(TransparentSearchDoorActivity transparentSearchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d13ae6", new Object[]{transparentSearchDoorActivity});
        } else {
            super.finish();
        }
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        k.a(this);
        o();
        a(true, (Animator.AnimatorListener) null);
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        k.b(this);
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : R.layout.tbsearch_sf_searchdoor_popup;
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity
    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : findViewById(R.id.tbsearch_searchdoor);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.b = (ImmersiveRelativeLayout) findViewById(R.id.tbsearch_searchdoor);
        this.b.setTopRadius(com.taobao.android.searchbaseframe.util.j.a(24.0f));
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = SystemBarDecorator.getStatusBarHeight(this);
    }

    private void a(boolean z, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6d24c8", new Object[]{this, new Boolean(z), animatorListener});
        } else if (this.f19325a == null || !p()) {
        } else {
            ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(ntx.c(), 0.0f) : ValueAnimator.ofFloat(0.0f, ntx.c());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.search.searchdoor.TransparentSearchDoorActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        TransparentSearchDoorActivity.a(TransparentSearchDoorActivity.this).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
            });
            if (animatorListener != null) {
                ofFloat.addListener(animatorListener);
            }
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.c || (this.f19325a != null && this.f19325a.a());
    }

    @Override // tb.nut
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.c = true;
        finish();
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        if (!p()) {
            setVisible(false);
            super.finish();
        }
        a(false, (Animator.AnimatorListener) new AnimatorListenerAdapter() { // from class: com.taobao.search.searchdoor.TransparentSearchDoorActivity.2
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
                TransparentSearchDoorActivity.b(TransparentSearchDoorActivity.this);
            }
        });
    }

    @Override // tb.nut
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }
}
