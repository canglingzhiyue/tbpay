package com.taobao.android.detail.ttdetail.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes5.dex */
public class LiveIconAnimaView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BAR_COUNT = 3;
    private static final int BAR_GAP;
    private static final int BAR_HEIGHT_END;
    private static final int BAR_HEIGHT_START;
    private static final int BAR_MARGIN_BOTTOM;
    private static final int BAR_MARGIN_LEFT;
    private static final float BAR_WIDTH;
    private static final float CORNER_RADIUS;
    private static final int DELAY = 300;
    private static final int DURATION = 600;
    private boolean hasStarted;
    private float[] mBarHeights;
    private Paint mPaint;
    private RectF[] mRectFs;

    public static /* synthetic */ Object ipc$super(LiveIconAnimaView liveIconAnimaView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ float[] access$000(LiveIconAnimaView liveIconAnimaView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("9534030f", new Object[]{liveIconAnimaView}) : liveIconAnimaView.mBarHeights;
    }

    static {
        kge.a(1628798232);
        BAR_WIDTH = com.taobao.android.detail.ttdetail.utils.f.a(2.7f);
        CORNER_RADIUS = com.taobao.android.detail.ttdetail.utils.f.a(1.6f);
        BAR_GAP = com.taobao.android.detail.ttdetail.utils.f.a(1.6f);
        BAR_MARGIN_BOTTOM = com.taobao.android.detail.ttdetail.utils.f.a(4.3f);
        BAR_MARGIN_LEFT = com.taobao.android.detail.ttdetail.utils.f.a(4.7f);
        BAR_HEIGHT_START = com.taobao.android.detail.ttdetail.utils.f.a(6.7f);
        BAR_HEIGHT_END = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
    }

    public LiveIconAnimaView(Context context) {
        super(context);
        this.mBarHeights = new float[3];
        this.mRectFs = new RectF[3];
        init();
    }

    public LiveIconAnimaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBarHeights = new float[3];
        this.mRectFs = new RectF[3];
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint(1);
        this.mPaint.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        for (int i = 0; i < 3; i++) {
            float height = (getHeight() - BAR_MARGIN_BOTTOM) - this.mBarHeights[i];
            float f = BAR_MARGIN_LEFT + ((BAR_WIDTH + BAR_GAP) * i);
            RectF rectF = this.mRectFs[i];
            if (rectF == null) {
                rectF = new RectF();
            }
            rectF.left = f;
            rectF.top = height;
            rectF.right = f + BAR_WIDTH;
            rectF.bottom = height + this.mBarHeights[i];
            float f2 = CORNER_RADIUS;
            canvas.drawRoundRect(rectF, f2, f2, this.mPaint);
        }
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (!this.hasStarted) {
            for (int i = 0; i < 3; i++) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(BAR_HEIGHT_START, BAR_HEIGHT_END);
                ofFloat.setDuration(600L);
                ofFloat.setStartDelay(i * 300);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.addUpdateListener(new a(this, i));
                ofFloat.start();
            }
            this.hasStarted = true;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<LiveIconAnimaView> f10979a;
        private int b;

        static {
            kge.a(1398709653);
            kge.a(1499308443);
        }

        public a(LiveIconAnimaView liveIconAnimaView, int i) {
            this.f10979a = new WeakReference<>(liveIconAnimaView);
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LiveIconAnimaView liveIconAnimaView = this.f10979a.get();
            if (liveIconAnimaView == null) {
                return;
            }
            LiveIconAnimaView.access$000(liveIconAnimaView)[this.b] = floatValue;
            liveIconAnimaView.invalidate();
        }
    }
}
