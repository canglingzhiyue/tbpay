package com.taobao.search.musie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.IrpOverlaySlice;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.jwq;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class MUSPopPageActivity extends MUSPageActivity implements jwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int b;
    private float c = 0.9f;
    private int d = b;
    private float e = 0.5f;
    private boolean f = false;
    private Animator g = null;
    private final List<MUSOverlay> h = new ArrayList(5);

    public static /* synthetic */ Object ipc$super(MUSPopPageActivity mUSPopPageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.musie.MUSPageActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static /* synthetic */ void a(MUSPopPageActivity mUSPopPageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546bed37", new Object[]{mUSPopPageActivity});
        } else {
            super.finish();
        }
    }

    public static /* synthetic */ void a(MUSPopPageActivity mUSPopPageActivity, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988db67b", new Object[]{mUSPopPageActivity, new Boolean(z), animatorListenerAdapter});
        } else {
            mUSPopPageActivity.a(z, animatorListenerAdapter);
        }
    }

    public static /* synthetic */ float b(MUSPopPageActivity mUSPopPageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53f58728", new Object[]{mUSPopPageActivity})).floatValue() : mUSPopPageActivity.c;
    }

    public static /* synthetic */ int c(MUSPopPageActivity mUSPopPageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("537f212c", new Object[]{mUSPopPageActivity})).intValue() : mUSPopPageActivity.d;
    }

    static {
        kge.a(883863392);
        kge.a(-1300944702);
        b = Color.argb(127, 0, 0, 0);
    }

    @Override // com.taobao.search.musie.MUSPageActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            this.c = com.taobao.android.searchbaseframe.util.g.a(data.getQueryParameter(noa.KEY_POP_UP_HEIGHT), 0.9f);
            int a2 = com.taobao.android.searchbaseframe.util.g.a("#" + data.getQueryParameter("tbsearch_popup_background"), b);
            this.e = ((float) Color.alpha(a2)) / 255.0f;
            this.d = a2;
        }
        super.onCreate(bundle);
        e();
        View findViewById = findViewById(R.id.fl_root);
        if (findViewById != null) {
            findViewById.setBackgroundColor(0);
        }
        if (getWindow().getDecorView() == null) {
            return;
        }
        View view = new View(this);
        ((ViewGroup) getWindow().getDecorView()).addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.musie.MUSPopPageActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    MUSPopPageActivity.this.finish();
                }
            }
        });
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (this.f) {
        } else {
            this.f = true;
            Animator animator = this.g;
            if (animator != null && animator.isRunning()) {
                this.g.end();
            }
            a(false, new AnimatorListenerAdapter() { // from class: com.taobao.search.musie.MUSPopPageActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                        return;
                    }
                    MUSPopPageActivity.a(MUSPopPageActivity.this);
                    MUSPopPageActivity.this.overridePendingTransition(0, 0);
                }
            });
        }
    }

    private void e() {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (getWindow() == null || (decorView = getWindow().getDecorView()) == null) {
        } else {
            final View findViewById = findViewById(16908290);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.musie.MUSPopPageActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            findViewById.setVisibility(4);
            decorView.post(new Runnable() { // from class: com.taobao.search.musie.MUSPopPageActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = (int) ((1.0f - MUSPopPageActivity.b(MUSPopPageActivity.this)) * findViewById.getMeasuredHeight());
                    findViewById.requestLayout();
                    MUSPopPageActivity.a(MUSPopPageActivity.this, true, new AnimatorListenerAdapter() { // from class: com.taobao.search.musie.MUSPopPageActivity.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                            } else {
                                findViewById.setVisibility(0);
                            }
                        }
                    });
                }
            });
        }
    }

    private void a(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d0f02c", new Object[]{this, new Boolean(z), animatorListenerAdapter});
            return;
        }
        View findViewById = findViewById(16908290);
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[2];
        float f = 0.0f;
        fArr[0] = z ? findViewById.getMeasuredHeight() - marginLayoutParams.topMargin : 0.0f;
        fArr[1] = z ? 0.0f : findViewById.getMeasuredHeight();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, property, fArr);
        final View decorView = getWindow().getDecorView();
        float[] fArr2 = new float[2];
        fArr2[0] = z ? 0.0f : this.e;
        if (z) {
            f = this.e;
        }
        fArr2[1] = f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.search.musie.MUSPopPageActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    decorView.setBackgroundColor(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f), Color.red(MUSPopPageActivity.c(MUSPopPageActivity.this)), Color.green(MUSPopPageActivity.c(MUSPopPageActivity.this)), Color.blue(MUSPopPageActivity.c(MUSPopPageActivity.this))));
                }
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.start();
        this.g = animatorSet;
    }

    @Override // tb.jwq
    public MUSOverlaySlice a(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlaySlice) ipChange.ipc$dispatch("b898b90d", new Object[]{this, context, mUSView, mUSOverlay, mUSOverlayView}) : new IrpOverlaySlice(context, mUSView, mUSOverlay, mUSOverlayView);
    }

    @Override // tb.jwq
    public void a(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81397a02", new Object[]{this, mUSOverlay});
        } else {
            this.h.add(mUSOverlay);
        }
    }

    @Override // tb.jwq
    public void b(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1577e9a1", new Object[]{this, mUSOverlay});
        } else {
            this.h.remove(mUSOverlay);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getKeyCode() == 4) {
            if (keyEvent.getAction() == 0) {
                if (this.h.isEmpty()) {
                    finish();
                } else {
                    List<MUSOverlay> list = this.h;
                    list.get(list.size() - 1).fireEvent("close", null);
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
