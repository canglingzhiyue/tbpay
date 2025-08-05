package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.api.TBLiveBaseComponentView;
import tb.kge;
import tb.prc;

/* loaded from: classes6.dex */
public class TBLiveMessageView extends TBLiveBaseComponentView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] mGradientColors;
    private float[] mGradientPosition;
    private TBLiveMessageRealView mMessageRealView;
    private int mMessageRealViewHeight;
    private Paint mPaint;
    private int[] mShaderParams;

    static {
        kge.a(534295072);
    }

    public static /* synthetic */ Object ipc$super(TBLiveMessageView tBLiveMessageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
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

    public TBLiveMessageView(Context context) {
        super(context);
        this.mGradientColors = new int[]{-1, 0};
        this.mGradientPosition = new float[]{0.0f, 1.0f};
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint(1);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, 0);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(12, -1);
        setGravity(80);
        layoutParams.setMargins(prc.a(getContext(), 8.0f), 0, prc.a(getContext(), 8.0f), prc.a(getContext(), 4.0f));
        setLayoutParams(layoutParams);
        this.mMessageRealView = new TBLiveMessageRealView(getContext());
        addView(this.mMessageRealView);
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
            return;
        }
        TBLiveMessageRealView tBLiveMessageRealView = this.mMessageRealView;
        if (tBLiveMessageRealView == null) {
            return;
        }
        tBLiveMessageRealView.setData(jSONObject);
        this.mMessageRealViewHeight = this.mMessageRealView.getViewHeight();
        this.mShaderParams = this.mMessageRealView.getShaderParams();
    }

    private void initShader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e855af1c", new Object[]{this});
            return;
        }
        int[] iArr = this.mShaderParams;
        if (iArr == null || iArr.length != 2) {
            return;
        }
        this.mPaint.setShader(new LinearGradient(0.0f, iArr[0], 0.0f, iArr[1], this.mGradientColors, this.mGradientPosition, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        initShader();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.mPaint);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mMessageRealViewHeight, 1073741824);
        super.onMeasure(i, makeMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), makeMeasureSpec);
    }

    @Override // com.taobao.taolive.uikit.api.TBLiveBaseComponentView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLiveMessageRealView tBLiveMessageRealView = this.mMessageRealView;
        if (tBLiveMessageRealView == null) {
            return;
        }
        tBLiveMessageRealView.destroy();
    }
}
