package com.taobao.themis.container.splash;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.utils.k;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public class ProgressView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ProgressView";
    private static final int TIMER_MESSAGE_CODE = 10086;
    private boolean autoPlay;
    private View currentDot;
    private final ArrayList<View> dots;
    private int index;
    private int mDotMargin;
    private int mDotSize;
    private a mHandler;

    static {
        kge.a(1631528790);
    }

    public static /* synthetic */ Object ipc$super(ProgressView progressView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public static /* synthetic */ View access$000(ProgressView progressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("62080356", new Object[]{progressView}) : progressView.currentDot;
    }

    public static /* synthetic */ View access$002(ProgressView progressView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b42e0682", new Object[]{progressView, view});
        }
        progressView.currentDot = view;
        return view;
    }

    public static /* synthetic */ void access$100(ProgressView progressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd21af3", new Object[]{progressView});
        } else {
            progressView.addIndex();
        }
    }

    public static /* synthetic */ int access$200(ProgressView progressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f086dc5", new Object[]{progressView})).intValue() : progressView.index;
    }

    public static /* synthetic */ ArrayList access$300(ProgressView progressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("310b620b", new Object[]{progressView}) : progressView.dots;
    }

    public static /* synthetic */ void access$400(ProgressView progressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61751390", new Object[]{progressView});
        } else {
            progressView.postTimer();
        }
    }

    public ProgressView(Context context) {
        this(context, null, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.dots = new ArrayList<>();
        this.index = 0;
        this.mHandler = new a();
        this.autoPlay = true;
        this.mDotMargin = k.a(context, 8.0f);
        this.mDotSize = k.a(context, 8.0f);
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ProgressView, i, 0)) != null) {
            this.mDotSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ProgressView_tms_dot_size, this.mDotSize);
            this.mDotMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ProgressView_tms_dot_margin, this.mDotMargin);
            obtainStyledAttributes.recycle();
        }
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View.inflate(context, R.layout.tms_view_progress_dot, this);
        View findViewById = findViewById(R.id.progress_dot1);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        int i = this.mDotSize;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        marginLayoutParams.setMargins(0, 0, this.mDotMargin, 0);
        findViewById.setAlpha(0.5f);
        findViewById.setLayoutParams(marginLayoutParams);
        this.dots.add(findViewById);
        View findViewById2 = findViewById(R.id.progress_dot2);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        int i2 = this.mDotSize;
        marginLayoutParams2.height = i2;
        marginLayoutParams2.width = i2;
        marginLayoutParams2.setMargins(0, 0, this.mDotMargin, 0);
        findViewById2.setAlpha(0.5f);
        findViewById2.setLayoutParams(marginLayoutParams2);
        this.dots.add(findViewById2);
        View findViewById3 = findViewById(R.id.progress_dot3);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
        int i3 = this.mDotSize;
        marginLayoutParams3.height = i3;
        marginLayoutParams3.width = i3;
        findViewById3.setAlpha(0.5f);
        findViewById3.setLayoutParams(marginLayoutParams3);
        findViewById3.setAlpha(0.5f);
        this.dots.add(findViewById3);
    }

    private void addIndex() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c793c0b8", new Object[]{this});
            return;
        }
        int i2 = this.index;
        if (i2 < 2) {
            i = i2 + 1;
            this.index = i;
        }
        this.index = i;
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.mHandler.removeMessages(10086);
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler = null;
    }

    public void stopLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41d5261", new Object[]{this});
            return;
        }
        a aVar = this.mHandler;
        if (aVar != null) {
            aVar.removeMessages(10086);
            this.mHandler.removeCallbacksAndMessages(null);
        }
        ArrayList<View> arrayList = this.dots;
        if (arrayList == null) {
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(0.2f);
        }
    }

    public void startLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9591a01", new Object[]{this});
            return;
        }
        a aVar = this.mHandler;
        if (aVar != null) {
            aVar.removeMessages(10086);
            this.mHandler.removeCallbacksAndMessages(null);
        }
        postTimer();
    }

    public void setDotMargin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73eeab24", new Object[]{this, new Float(f)});
            return;
        }
        this.mDotMargin = k.a(getContext(), f);
        for (int i = 0; i < this.dots.size(); i++) {
            View view = this.dots.get(i);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i2 = this.mDotSize;
            marginLayoutParams.height = i2;
            marginLayoutParams.width = i2;
            if (i != this.dots.size() - 1) {
                marginLayoutParams.setMargins(0, 0, this.mDotMargin, 0);
            }
            view.setAlpha(0.5f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public void setDotSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4976f1", new Object[]{this, new Float(f)});
            return;
        }
        this.mDotSize = k.a(getContext(), f);
        for (int i = 0; i < this.dots.size(); i++) {
            View view = this.dots.get(i);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i2 = this.mDotSize;
            marginLayoutParams.height = i2;
            marginLayoutParams.width = i2;
            if (i != this.dots.size() - 1) {
                marginLayoutParams.setMargins(0, 0, this.mDotMargin, 0);
            }
            view.setAlpha(0.5f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (this.autoPlay) {
            if (i == 0 && view.getVisibility() == 0) {
                postTimer();
            } else {
                a aVar = this.mHandler;
                if (aVar != null) {
                    aVar.removeMessages(10086);
                }
            }
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mHandler;
        if (aVar == null) {
            return;
        }
        aVar.removeMessages(10086);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    private void postTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde99c8c", new Object[]{this});
            return;
        }
        a aVar = this.mHandler;
        if (aVar == null) {
            return;
        }
        aVar.sendEmptyMessageDelayed(10086, 400L);
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.autoPlay = z;
        }
    }

    /* loaded from: classes9.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-85110029);
        }

        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (ProgressView.access$000(ProgressView.this) != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ProgressView.access$000(ProgressView.this), "alpha", 0.2f, 0.5f);
                ofFloat.setDuration(400L);
                animatorSet.play(ofFloat);
            }
            ProgressView.access$100(ProgressView.this);
            View view = (View) ProgressView.access$300(ProgressView.this).get(ProgressView.access$200(ProgressView.this));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 0.2f);
            ofFloat2.setDuration(400L);
            animatorSet.play(ofFloat2);
            animatorSet.start();
            ProgressView.access$002(ProgressView.this, view);
            ProgressView.access$400(ProgressView.this);
        }
    }

    public void setDotsBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c50982", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<View> arrayList = this.dots;
        if (arrayList == null) {
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().setBackgroundResource(i);
        }
    }
}
