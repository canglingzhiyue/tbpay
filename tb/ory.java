package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class ory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f32343a;
    public osa b;
    private ViewGroup c;
    private ViewGroup d;
    private View e;
    private ProgressBar f;
    private boolean g;
    private boolean h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;

    static {
        kge.a(791513570);
    }

    public static /* synthetic */ TextView a(ory oryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("32343696", new Object[]{oryVar}) : oryVar.j;
    }

    public static /* synthetic */ void a(ory oryVar, View view, int i, View.OnClickListener onClickListener, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950acfea", new Object[]{oryVar, view, new Integer(i), onClickListener, jSONObject});
        } else {
            oryVar.a(view, i, onClickListener, jSONObject);
        }
    }

    public static /* synthetic */ void a(ory oryVar, TextView textView, View[] viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61849f7f", new Object[]{oryVar, textView, viewArr});
        } else {
            oryVar.a(textView, viewArr);
        }
    }

    public static /* synthetic */ void a(ory oryVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c463730e", new Object[]{oryVar, jSONObject});
        } else {
            oryVar.a(jSONObject);
        }
    }

    public static /* synthetic */ boolean a(ory oryVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("172de2f6", new Object[]{oryVar, new Boolean(z)})).booleanValue();
        }
        oryVar.g = z;
        return z;
    }

    public static /* synthetic */ TextView b(ory oryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("45dc0a17", new Object[]{oryVar}) : oryVar.i;
    }

    public static /* synthetic */ boolean c(ory oryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5836128", new Object[]{oryVar})).booleanValue() : oryVar.g;
    }

    public static /* synthetic */ ProgressBar d(ory oryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("42f60c45", new Object[]{oryVar}) : oryVar.f;
    }

    public static /* synthetic */ ViewGroup e(ory oryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("796b212f", new Object[]{oryVar}) : oryVar.d;
    }

    public ory(osa osaVar, boolean z) {
        this.b = osaVar;
        this.h = z;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c.getParent() == null || this.g) {
        } else {
            this.g = true;
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
    }

    public void a(Context context, View view, final View.OnClickListener onClickListener, View.OnClickListener onClickListener2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11774de", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        try {
            int paddingLeft = view.getPaddingLeft();
            a(context, (view.getWidth() - paddingLeft) - view.getPaddingRight(), (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom());
            this.b.a(jSONObject);
            ((ViewGroup) view).addView(this.c);
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.guess_longclick_scale_circle);
            loadAnimation.setFillAfter(true);
            this.e.startAnimation(loadAnimation);
            this.i.startAnimation(AnimationUtils.loadAnimation(context, R.anim.guess_similar_slide_in));
            if (this.j != null) {
                this.j.startAnimation(AnimationUtils.loadAnimation(context, R.anim.guess_delete_bottom_slide_in));
            }
            if (this.j != null) {
                if (onClickListener != null) {
                    this.j.setOnClickListener(new View.OnClickListener() { // from class: tb.ory.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                                return;
                            }
                            ory.this.b.b(jSONObject);
                            if (ory.this.f32343a != null) {
                                ory.a(ory.this, jSONObject);
                                return;
                            }
                            ory oryVar = ory.this;
                            ory.a(oryVar, ory.a(oryVar), new View[]{ory.b(ory.this)});
                            onClickListener.onClick(view2);
                        }
                    });
                } else {
                    this.j.setBackgroundResource(R.drawable.recommend2_none_similar_background);
                }
            }
            if (onClickListener2 != null) {
                this.i.setOnClickListener(onClickListener2);
                return;
            }
            this.i.setBackgroundResource(R.drawable.recommend2_none_similar_background);
            this.i.setText(b.a(R.string.taobao_app_1000_1_16171));
        } catch (Exception e) {
            ooa.a("Delete overlay met exception.", e);
        }
    }

    public void a(ory oryVar, JSONObject jSONObject, View.OnClickListener onClickListener) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2b826b", new Object[]{this, oryVar, jSONObject, onClickListener});
        } else if (jSONObject != null && jSONObject.getJSONObject("ext") != null && (jSONArray = jSONObject.getJSONObject("ext").getJSONArray("deleteReasons")) != null && !jSONArray.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && !StringUtils.isEmpty(jSONObject2.getString("reasonId")) && !StringUtils.isEmpty(jSONObject2.getString("reason"))) {
                    jSONArray2.add(jSONObject2);
                }
            }
            if (jSONArray2.isEmpty()) {
                return;
            }
            a(jSONObject, jSONArray2, onClickListener);
            oryVar.f32343a.setTag(jSONObject);
        }
    }

    private void a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c642cc0", new Object[]{this, context, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.h) {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.recommend2_component_delete_overlay, (ViewGroup) null);
            this.j = (TextView) this.c.findViewById(R.id.btn_guess_delete);
        } else {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.recommend2_component_without_delete_overlay, (ViewGroup) null);
        }
        this.d = (ViewGroup) this.c.findViewById(R.id.guess_delete_layout);
        this.e = this.c.findViewById(R.id.circle_guess_longclick);
        this.i = (TextView) this.c.findViewById(R.id.btn_guess_similar);
        this.f = (ProgressBar) this.c.findViewById(R.id.pb_server_progress);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i, i2);
        this.c.setTag("guess_delete_popup");
        this.c.setLayoutParams(layoutParams);
        this.c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.ory.2
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
                if (view.getParent() == null || ory.c(ory.this)) {
                    return;
                }
                ory.a(ory.this, true);
                ((ViewGroup) view.getParent()).removeView(view);
            }
        });
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: tb.ory.3
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
                ksp.a("Home.RItemOverlayView", "popupView.setOnTouchListener.onTouch");
                ory.this.a();
                return true;
            }
        });
    }

    private void a(final TextView textView, View[] viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ed40f9", new Object[]{this, textView, viewArr});
            return;
        }
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }
        if (textView == null) {
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(textView.getContext(), R.anim.recommend2_dislike_scale_circle);
        textView.setText("");
        textView.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.ory.4
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
                textView.setVisibility(8);
                ory.d(ory.this).setVisibility(0);
            }
        });
    }

    private void a(final JSONObject jSONObject, JSONArray jSONArray, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac4d89", new Object[]{this, jSONObject, jSONArray, onClickListener});
            return;
        }
        this.f32343a = (ViewGroup) this.c.findViewById(R.id.guess_reason_layout);
        this.k = (TextView) this.c.findViewById(R.id.btn_guess_reason_title);
        this.l = (TextView) this.c.findViewById(R.id.btn_guess_reason1);
        this.m = (TextView) this.c.findViewById(R.id.btn_guess_reason2);
        this.n = (TextView) this.c.findViewById(R.id.btn_guess_reason3);
        this.o = (TextView) this.c.findViewById(R.id.btn_guess_reason4);
        TextView[] textViewArr = {this.l, this.m, this.n, this.o};
        int size = jSONArray.size();
        for (int i = 0; i < textViewArr.length; i++) {
            JSONObject jSONObject2 = null;
            if (i < size) {
                jSONObject2 = jSONArray.getJSONObject(i);
            }
            TextView textView = textViewArr[i];
            if (jSONObject2 != null) {
                textView.setVisibility(0);
                textView.setText(jSONObject2.getString("reason"));
                textView.setTag(jSONObject2.getString("reasonId"));
                final int i2 = i + 1;
                textView.setOnClickListener(new View.OnClickListener() { // from class: tb.ory.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            ory.a(ory.this, view, i2, onClickListener, jSONObject);
                        }
                    }
                });
            }
        }
    }

    private void a(View view, int i, View.OnClickListener onClickListener, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff91c630", new Object[]{this, view, new Integer(i), onClickListener, jSONObject});
            return;
        }
        this.b.a(view.getTag() == null ? null : view.getTag().toString(), jSONObject);
        TextView[] textViewArr = {this.k, this.l, this.m, this.n, this.o};
        TextView textView = textViewArr[i];
        for (TextView textView2 : textViewArr) {
            textView2.setClickable(false);
        }
        onClickListener.onClick(textView);
        int parseColor = Color.parseColor("#33000000");
        int parseColor2 = Color.parseColor("#ccffffff");
        Drawable mutate = textView.getBackground().mutate();
        if (mutate != null && (mutate instanceof GradientDrawable)) {
            ((GradientDrawable) mutate).setColor(parseColor);
            textView.setTextColor(parseColor2);
        } else {
            textView.setBackgroundColor(parseColor);
        }
        textView.postDelayed(new Runnable() { // from class: tb.ory.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.ory.6.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                            return;
                        }
                        ory.this.f32343a.setVisibility(8);
                        ory.d(ory.this).setVisibility(0);
                    }
                });
                ory.this.f32343a.startAnimation(alphaAnimation);
            }
        }, 100L);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            this.b.c(jSONObject);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.ory.7
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
                        ory.e(ory.this).setVisibility(8);
                    }
                }
            });
            this.d.startAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(300L);
            alphaAnimation2.setStartOffset(100L);
            alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: tb.ory.8
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
                    } else {
                        ory.this.f32343a.setVisibility(0);
                    }
                }
            });
            this.f32343a.setAnimation(alphaAnimation2);
        } catch (Exception e) {
            ooa.a("Delete overlay met exception.", e);
        }
    }
}
