package com.taobao.tao.sharepanel.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class BubbleContainer extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bitmap mBubbleBmp;
    private Handler mH;
    public boolean mIsShow;
    private Runnable mRun;
    private int mX;
    private int mY;

    static {
        kge.a(-1996551703);
    }

    public static /* synthetic */ Object ipc$super(BubbleContainer bubbleContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public BubbleContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsShow = false;
        this.mH = new Handler();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
            if (!this.mIsShow || this.mBubbleBmp == null || this.mBubbleBmp.isRecycled()) {
                return;
            }
            canvas.drawBitmap(this.mBubbleBmp, this.mX, this.mY, (Paint) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBubbleBmp;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.mBubbleBmp.recycle();
    }

    public void showBubble(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe91cc1a", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else if (this.mIsShow) {
        } else {
            this.mX = i;
            this.mY = i2;
            this.mIsShow = true;
            final TextView textView = (TextView) findViewById(R.id.tv_buddle);
            textView.setText(str);
            this.mH.post(new Runnable() { // from class: com.taobao.tao.sharepanel.normal.view.BubbleContainer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BubbleContainer.this.mBubbleBmp = Bitmap.createBitmap(textView.getMeasuredWidth(), textView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    BubbleContainer.this.mBubbleBmp.setDensity(BubbleContainer.this.getResources().getDisplayMetrics().densityDpi);
                    Canvas canvas = new Canvas(BubbleContainer.this.mBubbleBmp);
                    textView.draw(canvas);
                    canvas.setBitmap(null);
                    BubbleContainer.this.invalidate();
                }
            });
        }
    }

    public void hideBubble(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e862136f", new Object[]{this, new Long(j)});
        } else if (!this.mIsShow) {
        } else {
            Runnable runnable = this.mRun;
            if (runnable == null) {
                this.mRun = new Runnable() { // from class: com.taobao.tao.sharepanel.normal.view.BubbleContainer.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (BubbleContainer.this.mBubbleBmp == null || BubbleContainer.this.mBubbleBmp.isRecycled()) {
                        } else {
                            BubbleContainer.this.mBubbleBmp.recycle();
                            BubbleContainer bubbleContainer = BubbleContainer.this;
                            bubbleContainer.mBubbleBmp = null;
                            bubbleContainer.invalidate();
                        }
                    }
                };
            } else {
                this.mH.removeCallbacks(runnable);
            }
            this.mH.postDelayed(this.mRun, j);
        }
    }
}
