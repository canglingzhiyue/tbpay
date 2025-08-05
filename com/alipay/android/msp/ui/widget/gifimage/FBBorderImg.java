package com.alipay.android.msp.ui.widget.gifimage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FBBorderImg extends ImageView implements IBorderable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BorderHelper qf;
    private ProgressWheelHelper qg;

    public static /* synthetic */ Object ipc$super(FBBorderImg fBBorderImg, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public FBBorderImg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.qg = null;
        this.qf = new BorderHelper();
    }

    public FBBorderImg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.qg = null;
        this.qf = new BorderHelper();
    }

    public FBBorderImg(Context context) {
        super(context);
        this.qg = null;
        this.qf = new BorderHelper();
    }

    @Override // com.alipay.android.msp.ui.widget.gifimage.IBorderable
    public void setBorderRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73d1fc", new Object[]{this, new Integer(i)});
        } else {
            this.qf.a(i);
        }
    }

    @Override // com.alipay.android.msp.ui.widget.gifimage.IBorderable
    public void setBorder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.qf.setBorder(i, i2);
        }
    }

    public boolean resetWheelHelper(String str) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e20a452f", new Object[]{this, str})).booleanValue();
        }
        float f = 3.0f;
        try {
            f = getContext().getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        int i2 = -1;
        if (str.contains("com.alipay.android.app/alipay_msp_loading_blue.gif") || str.contains("com.alipay.android.app/alipay_msp_loading.gif")) {
            if (this.qg == null) {
                int i3 = (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1));
                if (i3 > 0) {
                    i = 4;
                }
                if (str.contains("com.alipay.android.app/alipay_msp_loading_blue.gif")) {
                    i2 = Color.parseColor("#108ee9");
                    i = i3 > 0 ? 10 : 5;
                }
                this.qg = new ProgressWheelHelper(this, i, i, i2);
                this.qg.a();
                this.qg.setCircleRadius(getWidth());
                this.qg.a(getWidth(), getHeight());
            }
            this.qg.e();
            this.qg.start();
            invalidate();
            return true;
        } else if (str.contains("com.alipay.android.app/alipay_msp_success.gif") || str.contains("com.alipay.android.app/alipay_msp_success_blue.gif")) {
            if (this.qg == null) {
                int i4 = (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1));
                if (i4 > 0) {
                    i = 4;
                }
                if (str.contains("com.alipay.android.app/alipay_msp_success_blue.gif")) {
                    i2 = Color.parseColor("#108ee9");
                    i = i4 > 0 ? 10 : 5;
                }
                this.qg = new ProgressWheelHelper(this, i, i, i2);
                this.qg.a();
                this.qg.setCircleRadius(getWidth());
                this.qg.a(getWidth(), getHeight());
            }
            this.qg.d();
            this.qg.f();
            if (!this.qg.b()) {
                this.qg.start();
            }
            invalidate();
            return true;
        } else {
            if (az()) {
                this.qg.c();
                this.qg.d();
                invalidate();
            }
            return false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (az()) {
            this.qg.a(canvas);
        } else {
            BorderHelper borderHelper = this.qf;
            if (borderHelper != null) {
                borderHelper.a(canvas);
            }
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        BorderHelper borderHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        if (az() || (borderHelper = this.qf) == null) {
            return;
        }
        borderHelper.draw(canvas);
    }

    @Override // com.alipay.android.msp.ui.widget.gifimage.IBorderable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.qf.a();
        this.qf = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (!az()) {
            return;
        }
        int[] measure = this.qg.measure(i, i2);
        setMeasuredDimension(measure[0], measure[1]);
    }

    private boolean az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[]{this})).booleanValue();
        }
        ProgressWheelHelper progressWheelHelper = this.qg;
        return progressWheelHelper != null && progressWheelHelper.b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!az()) {
            return;
        }
        this.qg.a(i, i2, i3, i4);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        if (az()) {
            return this.qg.onSaveInstanceState(super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        super.onRestoreInstanceState(parcelable);
        if (!az()) {
            return;
        }
        this.qg.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (!az()) {
            return;
        }
        this.qg.a(i);
    }
}
