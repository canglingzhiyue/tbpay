package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.RadiusFrameLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;

/* loaded from: classes7.dex */
public class lqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f30817a;
    private ProgressBar b;
    private boolean c;
    private LinearLayout d;
    private LinearLayout e;
    private FrameLayout[] f = new FrameLayout[3];
    private lpj g = new lpj();
    private ljs h;

    static {
        kge.a(-1038978661);
    }

    public static /* synthetic */ void a(lqc lqcVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9321bbf8", new Object[]{lqcVar, view});
        } else {
            lqcVar.b(view);
        }
    }

    public static /* synthetic */ boolean a(lqc lqcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f346b29e", new Object[]{lqcVar})).booleanValue() : lqcVar.c;
    }

    public static /* synthetic */ boolean a(lqc lqcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7590537e", new Object[]{lqcVar, new Boolean(z)})).booleanValue();
        }
        lqcVar.c = z;
        return z;
    }

    public lqc(ljs ljsVar) {
        this.h = ljsVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f30817a;
        if (viewGroup == null || viewGroup.getParent() == null || this.c) {
            return;
        }
        this.c = true;
        a(viewGroup, a(viewGroup));
    }

    private void a(ViewGroup viewGroup, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a672ed3", new Object[]{this, viewGroup, animationListener});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setAnimationListener(animationListener);
        viewGroup.startAnimation(alphaAnimation);
    }

    private Animation.AnimationListener a(final View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation.AnimationListener) ipChange.ipc$dispatch("93a90e98", new Object[]{this, view}) : new Animation.AnimationListener() { // from class: tb.lqc.1
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
                    lqc.a(lqc.this, view);
                }
            }
        };
    }

    private void b(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null || (parent = view.getParent()) == null) {
        } else {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public void a(Context context, ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, BaseSectionModel<?> baseSectionModel) {
        BaseSectionModel<?> mo1101getOverlay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23bd887", new Object[]{this, context, viewGroup, onClickListener, onClickListener2, baseSectionModel});
            return;
        }
        BaseSubSectionModel mo1098getSubSection = baseSectionModel.mo1098getSubSection();
        if (mo1098getSubSection == null || (mo1101getOverlay = mo1098getSubSection.mo1101getOverlay()) == null) {
            return;
        }
        viewGroup.addView(a(context, this.g.b(viewGroup), this.g.a(viewGroup), baseSectionModel));
        new lqb(this.d, this.f, this.b).a(mo1101getOverlay, onClickListener, onClickListener2, baseSectionModel);
        b();
    }

    private View a(Context context, int i, int i2, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ef5ee84a", new Object[]{this, context, new Integer(i), new Integer(i2), baseSectionModel});
        }
        this.f30817a = a(context, i, i2);
        this.d = a(context);
        this.e = a(context, baseSectionModel);
        this.b = (ProgressBar) this.f30817a.findViewById(R.id.pb_server_progress);
        c();
        return this.f30817a;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            this.f30817a.startAnimation(alphaAnimation);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 20.0f, 0.0f);
            translateAnimation.setDuration(150L);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            this.e.startAnimation(animationSet);
        } catch (Exception e) {
            ldf.a("Home.RNItemOverlayView", "enter animation overlay met exception.", e);
        }
    }

    private ViewGroup a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("eb4a9555", new Object[]{this, context, new Integer(i), new Integer(i2)});
        }
        this.f30817a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.info_flow_delete_feedback, (ViewGroup) null);
        ((RadiusFrameLayout) this.f30817a.findViewById(R.id.radiusLayout)).setRadius(gbg.b(context, 6.0f));
        this.f30817a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        return this.f30817a;
    }

    private LinearLayout a(Context context, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("20038eff", new Object[]{this, context, baseSectionModel});
        }
        this.e = (LinearLayout) this.f30817a.findViewById(R.id.ll_feedback);
        if (!a(baseSectionModel)) {
            this.e.addView(a(context, b.a(R.string.taobao_app_1000_1_16146)));
            this.d.setVisibility(8);
            return this.e;
        }
        while (true) {
            FrameLayout[] frameLayoutArr = this.f;
            if (i < frameLayoutArr.length) {
                frameLayoutArr[i] = b(context);
                this.e.addView(this.f[i]);
                i++;
            } else {
                return this.e;
            }
        }
    }

    private boolean a(BaseSectionModel<?> baseSectionModel) {
        BaseSubSectionModel mo1098getSubSection;
        BaseSectionModel mo1101getOverlay;
        BaseItemModel mo1097getItem;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc98adb4", new Object[]{this, baseSectionModel})).booleanValue() : (baseSectionModel == null || (mo1098getSubSection = baseSectionModel.mo1098getSubSection()) == null || (mo1101getOverlay = mo1098getSubSection.mo1101getOverlay()) == null || (mo1097getItem = mo1101getOverlay.mo1097getItem()) == null || mo1097getItem.getJSONObject("0") == null) ? false : true;
    }

    private LinearLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("319105b7", new Object[]{this, context});
        }
        this.d = (LinearLayout) this.f30817a.findViewById(R.id.ll_find_similar);
        this.d.addView(a(context, b.a(R.string.app_find_similar)));
        this.d.addView(f(context));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.height = gbg.b(context, 63.0f);
        this.d.setLayoutParams(layoutParams);
        return this.d;
    }

    private FrameLayout b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("de12f17a", new Object[]{this, context});
        }
        FrameLayout d = d(context);
        LinearLayout c = c(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, gbg.b(context, 35.0f));
        layoutParams.gravity = 1;
        d.addView(c, layoutParams);
        return d;
    }

    private LinearLayout c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("4b6b33f5", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        HImageView hImageView = new HImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gbg.b(context, 15.0f), gbg.b(context, 15.0f));
        layoutParams.gravity = 16;
        linearLayout.addView(hImageView, layoutParams);
        TextView e = e(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = gbg.b(context, 6.0f);
        layoutParams2.gravity = 16;
        linearLayout.addView(e, layoutParams2);
        return linearLayout;
    }

    private FrameLayout d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("293b037c", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gbg.b(context, 152.0f), gbg.b(context, 35.0f));
        layoutParams.bottomMargin = gbg.b(context, 7.5f);
        layoutParams.topMargin = gbg.b(context, 7.5f);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(8);
        a(context, frameLayout);
        return frameLayout;
    }

    private TextView e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("68c4e750", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        textView.setGravity(19);
        textView.setMaxWidth(gbg.b(context, 118.0f));
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setTextSize(0, gbg.b(context, 13.0f));
        textView.setTextColor(Color.parseColor("#333333"));
        return textView;
    }

    private TextView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("38e9809e", new Object[]{this, context, str});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(0, gbg.b(context, 15.0f));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setText(str);
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(null, 1);
        return textView;
    }

    private TextView f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("82e065ef", new Object[]{this, context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        tIconFontTextView.setGravity(17);
        layoutParams.leftMargin = gbg.b(context, 6.0f);
        layoutParams.gravity = 16;
        tIconFontTextView.setLayoutParams(layoutParams);
        tIconFontTextView.setTextColor(Color.parseColor("#ffffff"));
        return tIconFontTextView;
    }

    private void a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef3872", new Object[]{this, context, view});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(gbg.b(context, 63.0f));
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(gradientDrawable);
        } else {
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f30817a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.lqc.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    return;
                }
                view.setVisibility(4);
                if (view.getParent() == null || lqc.a(lqc.this)) {
                    return;
                }
                lqc.a(lqc.this, true);
                ((ViewGroup) view.getParent()).removeView(view);
            }
        });
        this.f30817a.setOnTouchListener(new View.OnTouchListener() { // from class: tb.lqc.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                ldf.d("Home.RNItemOverlayView", "popupView.setOnTouchListener.onTouch");
                lqc.this.a();
                return true;
            }
        });
    }
}
