package com.taobao.search.m3.feedback;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class FeedbackPanel extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int btnHorizontalMargin;
    private static final int btnVerticalMargin;
    private static final String closeBtn2024 = "https://gw.alicdn.com/imgextra/i1/O1CN01PdFu2f1NSePmOe6p4_!!6000000001569-2-tps-60-60.png";
    private static final int closeBtnMarginRight;
    private static final int closeBtnMarginTop;
    private static final String closeBtnNor2024 = "https://gw.alicdn.com/tfs/TB1L6fbDUH1gK0jSZSyXXXtlpXa-40-42.png";
    private static final int closeBtnSize;
    private static final int listPaddingLeft;
    private static final int listPaddingRight;
    private static final int wfBtnHeight;
    private static final int wfBtnSimilarMargin;
    private static final int wfBtnVerticalMargin;
    private static final int wfHorizontalMargin;
    private static final int wfPaddingBottom;
    private static final int wfSimilarHeight;
    private ArrayList<FeedbackButton> buttonList;
    private final TUrlImageView closeButton;
    private boolean showLongPic;
    private final SimilarButton similarBtn;
    private final boolean waterfall;

    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.search.m3.feedback.b f19083a;
        public final /* synthetic */ JSONObject b;

        public b(com.taobao.search.m3.feedback.b bVar, JSONObject jSONObject) {
            this.f19083a = bVar;
            this.b = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f19083a.a(this.b.getJSONObject("param"), this.b.getJSONObject("coverInfo"), true);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.search.m3.feedback.b f19084a;

        public c(com.taobao.search.m3.feedback.b bVar) {
            this.f19084a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f19084a.d_("zszxs_feedback");
            }
        }
    }

    public static /* synthetic */ Object ipc$super(FeedbackPanel feedbackPanel, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-681076110);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackPanel(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.waterfall = z;
        this.buttonList = new ArrayList<>();
        this.similarBtn = new SimilarButton(context, this.waterfall);
        this.closeButton = new TUrlImageView(context);
        TUrlImageView tUrlImageView = this.closeButton;
        int i = closeBtnSize;
        tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
    }

    static {
        kge.a(1390853034);
        Companion = new a(null);
        wfHorizontalMargin = l.a(8.0f);
        wfBtnHeight = l.a(35.0f);
        wfSimilarHeight = l.a(47.0f);
        wfBtnVerticalMargin = l.a(8.0f);
        wfBtnSimilarMargin = l.a(8.0f);
        wfPaddingBottom = l.a(8.0f);
        closeBtnSize = l.a(15.0f);
        closeBtnMarginTop = l.a(8.0f);
        closeBtnMarginRight = l.a(12.0f);
        listPaddingLeft = l.a(8.0f);
        listPaddingRight = l.a(31.0f);
        btnHorizontalMargin = l.a(8.0f);
        btnVerticalMargin = l.a(8.0f);
    }

    public final TUrlImageView getCloseButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("88e80381", new Object[]{this}) : this.closeButton;
    }

    public final void update(JSONArray actions, String str, com.taobao.search.m3.feedback.b listener, float f, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867190e", new Object[]{this, actions, str, listener, new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(actions, "actions");
        q.c(listener, "listener");
        removeAllViews();
        this.showLongPic = z2;
        this.closeButton.setImageUrl(z ? closeBtn2024 : closeBtnNor2024);
        ArrayList<FeedbackButton> arrayList = new ArrayList<>(actions.size());
        int size = actions.size();
        while (i < size) {
            JSONObject item = actions.getJSONObject(i);
            FeedbackButton feedbackButton = i < this.buttonList.size() ? this.buttonList.get(i) : new FeedbackButton(getContext());
            q.a((Object) feedbackButton, "if (index < buttonList.s…e FeedbackButton(context)");
            arrayList.add(feedbackButton);
            addView(feedbackButton);
            q.a((Object) item, "item");
            feedbackButton.update(item, f);
            feedbackButton.setOnClickListener(new b(listener, item));
            i++;
        }
        this.buttonList.clear();
        this.buttonList = arrayList;
        this.similarBtn.update(str, f, z);
        this.similarBtn.setOnClickListener(new c(listener));
        addView(this.similarBtn);
        if (this.waterfall) {
            this.similarBtn.startEnterAnim();
        }
        addView(this.closeButton);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.waterfall) {
            layoutWaterfall();
        } else {
            layoutList();
        }
        this.closeButton.layout((getWidth() - this.closeButton.getMeasuredWidth()) - closeBtnMarginRight, closeBtnMarginTop, getWidth() - closeBtnMarginRight, closeBtnMarginTop + this.closeButton.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.waterfall) {
            measureWaterfall();
        } else {
            measureList();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(closeBtnSize, 1073741824);
        this.closeButton.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final void layoutWaterfall() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caa0d8f", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View view = getChildAt(i4);
            if (view != this.closeButton) {
                q.a((Object) view, "view");
                i2 += view.getMeasuredHeight();
                if (i3 > 0) {
                    i2 += view instanceof FeedbackButton ? wfBtnVerticalMargin : wfBtnSimilarMargin;
                }
                i3++;
            }
        }
        int height = this.showLongPic ? (getHeight() - i2) / 2 : (getHeight() - i2) - wfPaddingBottom;
        int childCount2 = getChildCount();
        int i5 = height;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount2; i7++) {
            View view2 = getChildAt(i7);
            if (view2 != this.closeButton) {
                if (i6 > 0) {
                    if (view2 instanceof FeedbackButton) {
                        i = wfBtnVerticalMargin;
                    } else {
                        i = wfBtnSimilarMargin;
                    }
                    i5 += i;
                }
                int i8 = wfHorizontalMargin;
                q.a((Object) view2, "view");
                view2.layout(i8, i5, view2.getMeasuredWidth() + i8, view2.getMeasuredHeight() + i5);
                i5 = view2.getBottom();
                i6++;
            }
        }
    }

    private final void layoutList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e74b6f", new Object[]{this});
            return;
        }
        float ceil = (float) Math.ceil((this.buttonList.size() + 1) / 2.0f);
        float f = (wfBtnHeight * ceil) + ((ceil - 1) * btnVerticalMargin);
        int i = listPaddingLeft;
        int childCount = getChildCount();
        int height = (int) ((getHeight() - f) / 2);
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View view = getChildAt(i3);
            if (view != this.closeButton) {
                q.a((Object) view, "view");
                view.layout(i, height, view.getMeasuredWidth() + i, view.getMeasuredHeight() + height);
                i += view.getMeasuredWidth() + btnHorizontalMargin;
                i2++;
                if (i2 == 2) {
                    i = listPaddingLeft;
                    height += wfBtnHeight + btnVerticalMargin;
                    i2 = 0;
                }
            }
        }
    }

    private final void measureWaterfall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c897db", new Object[]{this});
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (wfHorizontalMargin * 2), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(wfBtnHeight, 1073741824);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.closeButton) {
                if (childAt instanceof FeedbackButton) {
                    childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                } else {
                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(wfSimilarHeight, 1073741824));
                }
            }
        }
    }

    private final void measureList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9681a3", new Object[]{this});
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((((getMeasuredWidth() - listPaddingLeft) - listPaddingRight) - btnHorizontalMargin) / 2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(wfBtnHeight, 1073741824);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.closeButton) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }
}
