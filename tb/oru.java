package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.home.component.view.ClipLayout;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class oru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public orv f32331a;
    private ViewGroup b;
    private ProgressBar c;
    private boolean d;
    private LinearLayout e;
    private LinearLayout f;
    private FrameLayout g;
    private FrameLayout h;
    private FrameLayout i;
    private JSONObject j;
    private DinamicXEngine k;
    private boolean l;

    static {
        kge.a(-1987724468);
    }

    public static /* synthetic */ ViewGroup a(oru oruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("c329fcaf", new Object[]{oruVar}) : oruVar.b;
    }

    public static /* synthetic */ void a(oru oruVar, JSONObject jSONObject, int i, View.OnClickListener onClickListener, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd48890", new Object[]{oruVar, jSONObject, new Integer(i), onClickListener, jSONObject2});
        } else {
            oruVar.a(jSONObject, i, onClickListener, jSONObject2);
        }
    }

    public static /* synthetic */ boolean a(oru oruVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16f584f2", new Object[]{oruVar, new Boolean(z)})).booleanValue();
        }
        oruVar.d = z;
        return z;
    }

    public static /* synthetic */ FrameLayout b(oru oruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("8283ff52", new Object[]{oruVar}) : oruVar.g;
    }

    public static /* synthetic */ FrameLayout c(oru oruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("d9a1f031", new Object[]{oruVar}) : oruVar.h;
    }

    public static /* synthetic */ FrameLayout d(oru oruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("30bfe110", new Object[]{oruVar}) : oruVar.i;
    }

    public static /* synthetic */ LinearLayout e(oru oruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("4e0f4b01", new Object[]{oruVar}) : oruVar.e;
    }

    public static /* synthetic */ boolean f(oru oruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a10aa32f", new Object[]{oruVar})).booleanValue() : oruVar.d;
    }

    public oru(orv orvVar, DinamicXEngine dinamicXEngine, String str) {
        this.f32331a = orvVar;
        this.k = dinamicXEngine;
        this.l = b.a(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b.getParent() == null || this.d) {
        } else {
            this.d = true;
            try {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.oru.1
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
                            ((ViewGroup) oru.a(oru.this).getParent()).removeView(oru.a(oru.this));
                        }
                    }
                });
                this.b.startAnimation(alphaAnimation);
            } catch (Exception e) {
                ooa.a("enter animation overlay met exception.", e);
            }
        }
    }

    public void a(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11774de", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        try {
            int paddingLeft = view.getPaddingLeft();
            a(context, (view.getWidth() - paddingLeft) - view.getPaddingRight(), (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom(), jSONObject);
            ((ViewGroup) view).addView(this.b);
            if (jSONObject.getJSONObject("subSection") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay") == null) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("subSection").getJSONObject("overlay");
            a(jSONObject2, onClickListener, onClickListener2);
            this.f32331a.a(jSONObject2);
            b();
        } catch (Exception e) {
            ooa.a("Delete overlay met exception.", e);
        }
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
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.oru.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    }
                }

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
            });
            this.b.startAnimation(alphaAnimation);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 20.0f, 0.0f);
            translateAnimation.setDuration(150L);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            this.f.startAnimation(animationSet);
        } catch (Exception e) {
            ooa.a("enter animation overlay met exception.", e);
        }
    }

    public void a(final JSONObject jSONObject, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507982e8", new Object[]{this, jSONObject, onClickListener, onClickListener2});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null) {
            return;
        }
        if (jSONObject2.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR) == null) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: tb.oru.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    View.OnClickListener onClickListener3 = onClickListener2;
                    if (onClickListener3 == null) {
                        return;
                    }
                    onClickListener3.onClick(view);
                    oru.b(oru.this).setVisibility(8);
                    oru.c(oru.this).setVisibility(8);
                    oru.d(oru.this).setVisibility(8);
                    oru.e(oru.this).setVisibility(8);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (jSONObject2.getJSONObject("" + i) == null) {
                break;
            }
            arrayList.add(jSONObject2.getJSONObject("" + i));
            i++;
        }
        if (arrayList.isEmpty()) {
            this.e.setVisibility(8);
            return;
        }
        FrameLayout[] frameLayoutArr = {this.g, this.h, this.i};
        int size = arrayList.size();
        for (int i2 = 0; i2 < frameLayoutArr.length; i2++) {
            JSONObject jSONObject3 = null;
            if (i2 < size) {
                jSONObject3 = (JSONObject) arrayList.get(i2);
            }
            final JSONObject jSONObject4 = jSONObject3;
            FrameLayout frameLayout = frameLayoutArr[i2];
            if (jSONObject4 != null && jSONObject4.getJSONObject("content") != null) {
                frameLayout.setVisibility(0);
                LinearLayout linearLayout = (LinearLayout) frameLayout.getChildAt(0);
                ((TextView) linearLayout.getChildAt(1)).setText(jSONObject4.getJSONObject("content").getString("title"));
                ((HImageView) linearLayout.getChildAt(0)).setImageUrl(jSONObject4.getJSONObject("content").getString("pic"));
                frameLayout.setTag(jSONObject4.getJSONObject("content").getString("reasonArgs"));
                final int i3 = i2 + 1;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.oru.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            oru.a(oru.this, jSONObject, i3, onClickListener, jSONObject4);
                        }
                    }
                });
            }
        }
    }

    private void a(Context context, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c52a630", new Object[]{this, context, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        this.j = jSONObject;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.recommend_delete_feedback, (ViewGroup) null);
        ClipLayout clipLayout = (ClipLayout) this.b.findViewById(R.id.clipLayout);
        int i3 = 6;
        if (this.l && b.b()) {
            i3 = 18;
        }
        clipLayout.setOnlyRadius(HomePageUtility.a(this.k, context, i3));
        this.e = (LinearLayout) this.b.findViewById(R.id.ll_find_similar);
        this.e.addView(a(context));
        this.e.addView(c(context));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.height = HomePageUtility.a(this.k, context, 63.0f);
        this.e.setLayoutParams(layoutParams);
        this.c = (ProgressBar) this.b.findViewById(R.id.pb_server_progress);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(i, i2);
        this.b.setTag("guess_delete_popup");
        this.b.setLayoutParams(layoutParams2);
        this.b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.oru.5
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
                if (view.getParent() == null || oru.f(oru.this)) {
                    return;
                }
                oru.a(oru.this, true);
                ((ViewGroup) view.getParent()).removeView(view);
            }
        });
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: tb.oru.6
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
                ksp.a("Home.RNItemOverlayView", "popupView.setOnTouchListener.onTouch");
                oru.this.a();
                return true;
            }
        });
        this.f = (LinearLayout) this.b.findViewById(R.id.ll_feedback);
        if (jSONObject.getJSONObject("subSection") != null && jSONObject.getJSONObject("subSection").getJSONObject("overlay") != null && jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item") != null && jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item").getJSONObject("0") != null) {
            this.g = d(context);
            this.f.addView(this.g);
            this.h = d(context);
            this.f.addView(this.h);
            this.i = d(context);
            this.f.addView(this.i);
            return;
        }
        this.f.addView(b(context));
        this.e.setVisibility(8);
    }

    public TextView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("56ecd4", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        textView.setGravity(17);
        textView.setTextSize(0, HomePageUtility.a(this.k, context, 15.0f));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16162));
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(null, 1);
        return textView;
    }

    public TextView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1a726b73", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        textView.setGravity(17);
        textView.setTextSize(0, HomePageUtility.a(this.k, context, 15.0f));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16146));
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(null, 1);
        return textView;
    }

    public TextView c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("348dea12", new Object[]{this, context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        tIconFontTextView.setGravity(17);
        layoutParams.leftMargin = HomePageUtility.a(this.k, context, 6.0f);
        layoutParams.gravity = 16;
        tIconFontTextView.setLayoutParams(layoutParams);
        tIconFontTextView.setTextColor(Color.parseColor("#ffffff"));
        tIconFontTextView.setText(R.string.uik_icon_right);
        return tIconFontTextView;
    }

    public FrameLayout d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("293b037c", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(HomePageUtility.a(this.k, context, 152.0f), HomePageUtility.a(this.k, context, 35.0f));
        layoutParams.bottomMargin = HomePageUtility.a(this.k, context, 7.5f);
        layoutParams.topMargin = HomePageUtility.a(this.k, context, 7.5f);
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(layoutParams);
        a(context, frameLayout);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, HomePageUtility.a(this.k, context, 35.0f));
        layoutParams2.gravity = 1;
        linearLayout.setOrientation(0);
        frameLayout.addView(linearLayout, layoutParams2);
        HImageView hImageView = new HImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(HomePageUtility.a(this.k, context, 15.0f), HomePageUtility.a(this.k, context, 15.0f));
        layoutParams3.gravity = 16;
        linearLayout.addView(hImageView, layoutParams3);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        textView.setGravity(19);
        textView.setMaxWidth(HomePageUtility.a(this.k, context, 118.0f));
        layoutParams4.leftMargin = HomePageUtility.a(this.k, context, 6.0f);
        layoutParams4.gravity = 16;
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setTextSize(0, HomePageUtility.a(this.k, context, 13.0f));
        textView.setTextColor(Color.parseColor("#333333"));
        linearLayout.addView(textView, layoutParams4);
        return frameLayout;
    }

    public void a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef3872", new Object[]{this, context, view});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(HomePageUtility.a(this.k, context, 63.0f));
        view.setBackgroundDrawable(gradientDrawable);
    }

    private void a(JSONObject jSONObject, int i, View.OnClickListener onClickListener, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a700d2", new Object[]{this, jSONObject, new Integer(i), onClickListener, jSONObject2});
            return;
        }
        this.f32331a.a(jSONObject, jSONObject2);
        View[] viewArr = {this.e, this.g, this.h, this.i};
        View view = viewArr[i];
        for (View view2 : viewArr) {
            view2.setClickable(false);
            view2.setVisibility(8);
        }
        onClickListener.onClick(view);
        nlr.b(this.j, jSONObject2);
        this.c.setVisibility(0);
    }
}
