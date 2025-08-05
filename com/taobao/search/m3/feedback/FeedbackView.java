package com.taobao.search.m3.feedback;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.image.M3ImageView;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class FeedbackView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion;
    private static final int feedbackMaskColor;
    private static final int feedbackMaskColor2024;
    private Animator animation;
    private final FeedbackCoverView cover;
    private float currentRadius;
    private final FeedbackPanel panel;
    private final boolean waterfall;

    /* loaded from: classes7.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            FeedbackView.this.setVisibility(8);
            ViewParent parent = FeedbackView.this.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup == null) {
                return;
            }
            viewGroup.removeView(FeedbackView.this);
        }
    }

    public static /* synthetic */ Object ipc$super(FeedbackView feedbackView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class c {
        static {
            kge.a(-822762297);
        }

        private c() {
        }

        public /* synthetic */ c(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackView(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.waterfall = z;
        this.cover = new FeedbackCoverView(context);
        this.panel = new FeedbackPanel(context, this.waterfall);
        this.currentRadius = M3ImageView.Companion.a();
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.feedback.FeedbackView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                q.c(view, "view");
                q.c(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), FeedbackView.access$getCurrentRadius$p(FeedbackView.this));
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.m3.feedback.FeedbackView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    FeedbackView.this.hide();
                }
            }
        });
        this.panel.getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.m3.feedback.FeedbackView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    FeedbackView.this.hide();
                }
            }
        });
        this.cover.setVisibility(8);
        this.panel.setVisibility(8);
        addView(this.cover, new FrameLayout.LayoutParams(-1, -1));
        addView(this.panel, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(FeedbackView feedbackView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43fba608", new Object[]{feedbackView})).floatValue() : feedbackView.currentRadius;
    }

    public static final /* synthetic */ void access$setCurrentRadius$p(FeedbackView feedbackView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b51b4", new Object[]{feedbackView, new Float(f)});
        } else {
            feedbackView.currentRadius = f;
        }
    }

    static {
        kge.a(-1478968257);
        Companion = new c(null);
        feedbackMaskColor2024 = Color.parseColor("#cc0E1119");
        feedbackMaskColor = Color.parseColor("#e6F2F2F2");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void update(com.taobao.search.m3.M3CellBean r17, java.lang.String r18, com.taobao.search.m3.feedback.b r19, com.taobao.search.searchdoor.sf.config.TbSearchStyle r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.feedback.FeedbackView.update(com.taobao.search.m3.M3CellBean, java.lang.String, com.taobao.search.m3.feedback.b, com.taobao.search.searchdoor.sf.config.TbSearchStyle, boolean):void");
    }

    /* loaded from: classes7.dex */
    public static final class b implements com.taobao.search.m3.feedback.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.search.m3.feedback.b b;

        public b(com.taobao.search.m3.feedback.b bVar) {
            this.b = bVar;
        }

        @Override // com.taobao.search.m3.feedback.b
        public void a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7727ef6c", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)});
            } else {
                this.b.a(jSONObject, jSONObject2, z);
            }
        }

        @Override // com.taobao.search.m3.feedback.b
        public void d_(String from) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdee8cc", new Object[]{this, from});
                return;
            }
            q.c(from, "from");
            this.b.d_(from);
            FeedbackView.this.hide();
        }
    }

    public final void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, getAlpha(), 0.0f);
        ofFloat.addListener(new a());
        q.a((Object) ofFloat, "with(ObjectAnimator.ofFl…           this\n        }");
        runAnimation(ofFloat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Animator animator = this.animation;
        if (animator == null) {
            return;
        }
        animator.cancel();
    }

    private final void runAnimation(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d2a15d", new Object[]{this, animator});
            return;
        }
        Animator animator2 = this.animation;
        if (animator2 != null && animator2.isRunning()) {
            Animator animator3 = this.animation;
            if (animator3 == null) {
                q.a();
            }
            animator3.cancel();
        }
        animator.start();
        this.animation = animator;
    }
}
