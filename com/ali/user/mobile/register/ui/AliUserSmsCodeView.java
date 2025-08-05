package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserSmsCodeView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean autoHideKeyboard;
    public float mBorderWidth;
    public float mBorderheight;
    public float mDividerWidth;
    public int mHeight;
    public int mNextUnderLineColor;
    private OnCompletedListener mOnCompletedListener;
    private OnTextChangedListener mOnTextChangedListener;
    public RectF[] mOuterRects;
    public StringBuilder mTextBuilder;
    private int mTextColor;
    public int mTextCount;
    public Paint mTextPaint;
    public PointF[] mTextPositions;
    public RectF[] mTextRects;
    public float mTextSize;
    public int mUnderLineColor;
    public Paint mUnderLinePaint;
    public float mUnderLineStrokeWidth;
    public int mWidth;
    public int padding;

    /* loaded from: classes2.dex */
    public interface OnCompletedListener {
        void onCompleted(String str);
    }

    /* loaded from: classes2.dex */
    public interface OnTextChangedListener {
        void onTextChanged(String str);
    }

    static {
        kge.a(-1937108839);
    }

    public static /* synthetic */ Object ipc$super(AliUserSmsCodeView aliUserSmsCodeView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1391904137:
                return new Boolean(super.onKeyMultiple(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (KeyEvent) objArr[2]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public AliUserSmsCodeView(Context context) {
        super(context);
        this.mTextColor = -16777216;
        this.mTextSize = 36.0f;
        this.mTextCount = 6;
        this.padding = 10;
        this.mDividerWidth = 6.0f;
        this.mUnderLineColor = -16777216;
        this.mNextUnderLineColor = -16777216;
        this.mUnderLineStrokeWidth = 1.0f;
        this.mBorderWidth = ScreenUtil.dip2px(getContext(), 36.0f);
        this.mBorderheight = ScreenUtil.dip2px(getContext(), 40.0f);
        this.autoHideKeyboard = true;
        init(context, null);
    }

    public AliUserSmsCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextColor = -16777216;
        this.mTextSize = 36.0f;
        this.mTextCount = 6;
        this.padding = 10;
        this.mDividerWidth = 6.0f;
        this.mUnderLineColor = -16777216;
        this.mNextUnderLineColor = -16777216;
        this.mUnderLineStrokeWidth = 1.0f;
        this.mBorderWidth = ScreenUtil.dip2px(getContext(), 36.0f);
        this.mBorderheight = ScreenUtil.dip2px(getContext(), 40.0f);
        this.autoHideKeyboard = true;
        init(context, attributeSet);
    }

    public AliUserSmsCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTextColor = -16777216;
        this.mTextSize = 36.0f;
        this.mTextCount = 6;
        this.padding = 10;
        this.mDividerWidth = 6.0f;
        this.mUnderLineColor = -16777216;
        this.mNextUnderLineColor = -16777216;
        this.mUnderLineStrokeWidth = 1.0f;
        this.mBorderWidth = ScreenUtil.dip2px(getContext(), 36.0f);
        this.mBorderheight = ScreenUtil.dip2px(getContext(), 40.0f);
        this.autoHideKeyboard = true;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AliUserSmsCodeView);
            this.mTextCount = obtainStyledAttributes.getInt(R.styleable.AliUserSmsCodeView_scTextCount, this.mTextCount);
            this.mTextColor = obtainStyledAttributes.getColor(R.styleable.AliUserSmsCodeView_scTextColor, this.mTextColor);
            this.mTextSize = obtainStyledAttributes.getDimension(R.styleable.AliUserSmsCodeView_scTextSize, TypedValue.applyDimension(2, this.mTextSize, context.getResources().getDisplayMetrics()));
            setTextSize();
            this.mDividerWidth = obtainStyledAttributes.getDimension(R.styleable.AliUserSmsCodeView_scDividerWidth, TypedValue.applyDimension(1, this.mDividerWidth, context.getResources().getDisplayMetrics()));
            this.mUnderLineStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.AliUserSmsCodeView_scUnderLineStrokeWidth, TypedValue.applyDimension(1, this.mUnderLineStrokeWidth, context.getResources().getDisplayMetrics()));
            this.mUnderLineColor = obtainStyledAttributes.getColor(R.styleable.AliUserSmsCodeView_scUnderLineColor, this.mUnderLineColor);
            this.mNextUnderLineColor = obtainStyledAttributes.getColor(R.styleable.AliUserSmsCodeView_scNextUnderLineColor, this.mNextUnderLineColor);
            obtainStyledAttributes.recycle();
        }
        this.mTextBuilder = new StringBuilder(this.mTextCount);
        int i = this.mTextCount;
        this.mTextPositions = new PointF[i];
        this.mOuterRects = new RectF[i];
        this.mTextRects = new RectF[i];
        if (i == 4) {
            this.mBorderWidth = ScreenUtil.dip2px(getContext(), 45.0f);
            this.mBorderheight = ScreenUtil.dip2px(getContext(), 50.0f);
        }
        initPaint();
        setFocusableInTouchMode(true);
    }

    public void setTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a835d7", new Object[]{this});
        } else if (this.mTextCount != 4) {
        } else {
            this.mTextSize = (float) (this.mTextSize * 1.2d);
        }
    }

    public void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        if (this.mTextPaint == null) {
            this.mTextPaint = new Paint(1);
        }
        this.mTextPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        if (this.mUnderLinePaint == null) {
            this.mUnderLinePaint = new Paint(1);
        }
        this.mUnderLinePaint.setStyle(Paint.Style.STROKE);
        this.mUnderLinePaint.setColor(this.mUnderLineColor);
        this.mUnderLinePaint.setStrokeWidth(this.mUnderLineStrokeWidth);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mWidth = View.MeasureSpec.getSize(i);
        this.mHeight = View.MeasureSpec.getSize(i2);
        double measureChildPositions = measureChildPositions();
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) measureChildPositions, this.mHeight + (this.padding * 2));
        } else {
            setMeasuredDimension(this.mWidth, this.mHeight + (this.padding * 2));
        }
    }

    private double measureChildPositions() {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b9b3a21", new Object[]{this})).doubleValue();
        }
        Paint.FontMetricsInt fontMetricsInt = this.mTextPaint.getFontMetricsInt();
        float measureText = this.mTextPaint.measureText("0");
        float f = (this.mHeight / 2) + this.padding + ((fontMetricsInt.bottom - fontMetricsInt.top) / 4.0f);
        float f2 = this.mBorderWidth;
        while (true) {
            if (i2 < this.mTextCount) {
                float f3 = i2;
                float f4 = f3 * f2;
                this.mTextPositions[i2] = new PointF((this.mDividerWidth * f3) + f4 + (f2 / 2.0f) + this.padding, f);
                RectF[] rectFArr = this.mOuterRects;
                float f5 = this.mDividerWidth;
                int i3 = this.padding;
                int i4 = i2 + 1;
                rectFArr[i2] = new RectF(f4 + (f3 * f5) + i3, 0.0f, (i4 * f2) + (f3 * f5) + i3, this.mHeight);
                float f6 = measureText / 2.0f;
                this.mTextRects[i2] = new RectF(this.mTextPositions[i2].x - f6, this.mTextPositions[i2].y + fontMetricsInt.top, this.mTextPositions[i2].x + f6, this.mTextPositions[i2].y + fontMetricsInt.bottom);
                i2 = i4;
            } else {
                return (i * f2) + (this.mDividerWidth * (i - 1)) + (this.padding * 2);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        initPaint();
        int length = this.mTextBuilder.length();
        for (int i = 0; i < this.mTextCount; i++) {
            if (i < length) {
                canvas.drawText(this.mTextBuilder.toString(), i, i + 1, this.mTextPositions[i].x, this.mTextPositions[i].y, this.mTextPaint);
            }
            int i2 = this.mUnderLineColor;
            if (hasFocus() && i == length) {
                i2 = this.mNextUnderLineColor;
            } else if (i < length) {
                i2 = this.mNextUnderLineColor;
            }
            this.mUnderLinePaint.setColor(i2);
            drawUnderLine(canvas, this.mUnderLinePaint, this.mOuterRects[i], this.mTextRects[i]);
        }
        setBackgroundColor(-1);
    }

    public void drawUnderLine(Canvas canvas, Paint paint, RectF rectF, RectF rectF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb18ced", new Object[]{this, canvas, paint, rectF, rectF2});
            return;
        }
        float f = rectF2.left;
        rectF2.width();
        canvas.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.bottom, paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            focus();
        }
        return true;
    }

    public void focus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6100ad5f", new Object[]{this});
            return;
        }
        requestFocus();
        postDelayed(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserSmsCodeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) AliUserSmsCodeView.this.getContext().getSystemService("input_method");
                if (inputMethodManager == null) {
                    return;
                }
                inputMethodManager.showSoftInput(AliUserSmsCodeView.this, 0);
            }
        }, 100L);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputConnection) ipChange.ipc$dispatch("bab20287", new Object[]{this, editorInfo});
        }
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false) { // from class: com.ali.user.mobile.register.ui.AliUserSmsCodeView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean deleteSurroundingText(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a62772b1", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
            }
        };
        editorInfo.actionLabel = null;
        editorInfo.inputType = 3;
        editorInfo.imeOptions = 5;
        return baseInputConnection;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 67 && this.mTextBuilder.length() > 0) {
            StringBuilder sb = this.mTextBuilder;
            sb.deleteCharAt(sb.length() - 1);
            OnTextChangedListener onTextChangedListener = this.mOnTextChangedListener;
            if (onTextChangedListener != null) {
                onTextChangedListener.onTextChanged(this.mTextBuilder.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.mTextBuilder.length() < this.mTextCount) {
            this.mTextBuilder.append(keyEvent.getDisplayLabel());
            OnTextChangedListener onTextChangedListener2 = this.mOnTextChangedListener;
            if (onTextChangedListener2 != null) {
                onTextChangedListener2.onTextChanged(this.mTextBuilder.toString());
            }
            invalidate();
        }
        if (this.mTextBuilder.length() >= this.mTextCount && this.autoHideKeyboard) {
            OnCompletedListener onCompletedListener = this.mOnCompletedListener;
            if (onCompletedListener != null && i != 4) {
                onCompletedListener.onCompleted(this.mTextBuilder.toString());
            }
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52f6c589", new Object[]{this, new Integer(i), new Integer(i2), keyEvent})).booleanValue();
        }
        String characters = keyEvent.getCharacters();
        if (!TextUtils.isEmpty(characters) && TextUtils.isDigitsOnly(characters)) {
            this.mTextBuilder.append(characters);
            OnTextChangedListener onTextChangedListener = this.mOnTextChangedListener;
            if (onTextChangedListener != null) {
                onTextChangedListener.onTextChanged(this.mTextBuilder.toString());
            }
            invalidate();
            if (this.mTextBuilder.length() >= this.mTextCount && this.autoHideKeyboard) {
                OnCompletedListener onCompletedListener = this.mOnCompletedListener;
                if (onCompletedListener != null) {
                    onCompletedListener.onCompleted(this.mTextBuilder.toString());
                }
                InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                }
            }
            return false;
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        StringBuilder sb = this.mTextBuilder;
        return sb != null ? sb.toString() : "";
    }

    public void setTextCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ef01bc", new Object[]{this, new Integer(i)});
        } else if (this.mTextCount == i) {
        } else {
            this.mTextCount = i;
            this.mTextBuilder = new StringBuilder(i);
            this.mTextPositions = new PointF[i];
            this.mOuterRects = new RectF[i];
            this.mTextRects = new RectF[i];
            if (i == 4) {
                this.mBorderWidth = ScreenUtil.dip2px(getContext(), 45.0f);
                this.mBorderheight = ScreenUtil.dip2px(getContext(), 50.0f);
            }
            setTextSize();
            invalidate();
        }
    }

    public int getTextCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e41cfa6", new Object[]{this})).intValue() : this.mTextCount;
    }

    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
        } else if (this.mTextBuilder.length() == 0) {
        } else {
            StringBuilder sb = this.mTextBuilder;
            sb.delete(0, sb.length());
            OnTextChangedListener onTextChangedListener = this.mOnTextChangedListener;
            if (onTextChangedListener != null) {
                onTextChangedListener.onTextChanged(this.mTextBuilder.toString());
            }
            invalidate();
        }
    }

    public void setOnTextChangedListener(OnTextChangedListener onTextChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75db5d3f", new Object[]{this, onTextChangedListener});
        } else {
            this.mOnTextChangedListener = onTextChangedListener;
        }
    }

    public void setOnCompletedListener(OnCompletedListener onCompletedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cf78ff", new Object[]{this, onCompletedListener});
        } else {
            this.mOnCompletedListener = onCompletedListener;
        }
    }
}
