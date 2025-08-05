package com.taobao.live.home.dinamic.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import tb.pqt;

/* loaded from: classes7.dex */
public class DXTBLNativeTextView extends DXNativeTextView implements pqt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final byte MARQUEE_RUNNING = 2;
    private static final byte MARQUEE_STARTING = 1;
    private static final byte MARQUEE_STOPPED = 0;
    public Runnable animalRunnable;
    private boolean autoMarquee;
    private LinearGradient gradient;
    private boolean isTextGradient;
    private float mNewSpeed;
    private float mOrgSpeed;
    private boolean mShaderInit;
    private long mTextAnimalTime;
    public Runnable marqueeRunnable;
    private TextPaint paint;
    private int postDelayTime;
    private Shader shader;

    public static /* synthetic */ Object ipc$super(DXTBLNativeTextView dXTBLNativeTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    @Override // tb.pqt
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public DXTBLNativeTextView(Context context) {
        super(context);
        this.isTextGradient = false;
        this.marqueeRunnable = new Runnable() { // from class: com.taobao.live.home.dinamic.widget.DXTBLNativeTextView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXTBLNativeTextView.this.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                DXTBLNativeTextView.this.setSelected(true);
                DXTBLNativeTextView.this.setSingleLine(true);
                DXTBLNativeTextView.this.setHorizontallyScrolling(true);
            }
        };
        this.animalRunnable = new Runnable() { // from class: com.taobao.live.home.dinamic.widget.DXTBLNativeTextView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXTBLNativeTextView.this.setVisibility(0);
                }
            }
        };
        this.mShaderInit = false;
    }

    public DXTBLNativeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isTextGradient = false;
        this.marqueeRunnable = new Runnable() { // from class: com.taobao.live.home.dinamic.widget.DXTBLNativeTextView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXTBLNativeTextView.this.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                DXTBLNativeTextView.this.setSelected(true);
                DXTBLNativeTextView.this.setSingleLine(true);
                DXTBLNativeTextView.this.setHorizontallyScrolling(true);
            }
        };
        this.animalRunnable = new Runnable() { // from class: com.taobao.live.home.dinamic.widget.DXTBLNativeTextView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXTBLNativeTextView.this.setVisibility(0);
                }
            }
        };
        this.mShaderInit = false;
    }

    public DXTBLNativeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isTextGradient = false;
        this.marqueeRunnable = new Runnable() { // from class: com.taobao.live.home.dinamic.widget.DXTBLNativeTextView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXTBLNativeTextView.this.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                DXTBLNativeTextView.this.setSelected(true);
                DXTBLNativeTextView.this.setSingleLine(true);
                DXTBLNativeTextView.this.setHorizontallyScrolling(true);
            }
        };
        this.animalRunnable = new Runnable() { // from class: com.taobao.live.home.dinamic.widget.DXTBLNativeTextView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXTBLNativeTextView.this.setVisibility(0);
                }
            }
        };
        this.mShaderInit = false;
    }

    public boolean isAutoMarquee() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f75eb3f4", new Object[]{this})).booleanValue() : this.autoMarquee;
    }

    public void setAutoMarquee(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9664bc1c", new Object[]{this, new Boolean(z)});
        } else {
            this.autoMarquee = z;
        }
    }

    public int getPostDelayTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8256b5f4", new Object[]{this})).intValue() : this.postDelayTime;
    }

    public void setPostDelayTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fabff2e", new Object[]{this, new Integer(i)});
        } else {
            this.postDelayTime = i;
        }
    }

    public void setTextGradient(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd6d58e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isTextGradient = z;
        requestLayout();
    }

    @Override // tb.pqt
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (!isSelected()) {
        } else {
            cancelLongTextMarquee();
        }
    }

    @Override // tb.pqt
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!isSelected()) {
        } else {
            cancelLongTextMarquee();
        }
    }

    public void cancelLongTextMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28b8d46", new Object[]{this});
        } else if (!isSelected()) {
        } else {
            Runnable runnable = this.marqueeRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            Runnable runnable2 = this.animalRunnable;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
            }
            setSelected(false);
        }
    }

    public void startLongTextMarquee() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb1e5e", new Object[]{this});
        } else if (!isAutoMarquee() || (runnable = this.marqueeRunnable) == null) {
        } else {
            removeCallbacks(runnable);
            removeCallbacks(this.animalRunnable);
            setVisibility(0);
            Runnable runnable2 = this.marqueeRunnable;
            int i = this.postDelayTime;
            postDelayed(runnable2, i > 0 ? i : 500L);
        }
    }

    public void startAnimalMarquee() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b534dbcb", new Object[]{this});
        } else if (!isAutoMarquee() || isSelected() || (runnable = this.animalRunnable) == null) {
        } else {
            removeCallbacks(runnable);
            removeCallbacks(this.marqueeRunnable);
            setEllipsize(TextUtils.TruncateAt.MARQUEE);
            setSelected(true);
            setSingleLine(true);
            setHorizontallyScrolling(true);
            if (this.mTextAnimalTime <= 0) {
                return;
            }
            setVisibility(4);
            postDelayed(this.animalRunnable, this.mTextAnimalTime);
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
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f = measuredWidth;
        this.gradient = new LinearGradient(f * 0.6666667f, 0.0f, f, 0.0f, new int[]{changeAlpha(getCurrentTextColor(), 255), getCurrentTextColor(), 0}, new float[]{0.0f, 0.6666667f, 1.0f}, Shader.TileMode.CLAMP);
        this.paint = getPaint();
        if (this.mShaderInit) {
            return;
        }
        this.mShaderInit = true;
        this.shader = this.paint.getShader();
    }

    public static int changeAlpha(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("38b9f828", new Object[]{new Integer(i), new Integer(i2)})).intValue() : Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        TextPaint textPaint = this.paint;
        if (textPaint != null && this.gradient != null) {
            if (this.isTextGradient && textPaint.measureText((String) getText()) > getMeasuredWidth()) {
                float measuredWidth = getMeasuredWidth();
                this.gradient = new LinearGradient(measuredWidth * 0.6666667f, 0.0f, measuredWidth, 0.0f, new int[]{changeAlpha(getCurrentTextColor(), 255), getCurrentTextColor(), 0}, new float[]{0.0f, 0.6666667f, 1.0f}, Shader.TileMode.CLAMP);
                this.paint.setShader(this.gradient);
            } else {
                this.paint.setShader(this.shader);
            }
        }
        super.onDraw(canvas);
    }

    public void setNewSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a594a8b0", new Object[]{this, new Float(f)});
        } else {
            this.mNewSpeed = f;
        }
    }

    public long getTextAnimalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73ca3f67", new Object[]{this})).longValue() : this.mTextAnimalTime;
    }

    public void setTextAnimalTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c2e525", new Object[]{this, new Long(j)});
        } else {
            this.mTextAnimalTime = j;
        }
    }

    public void setMarqueeSpeed(float f) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Field declaredField = Class.forName("android.widget.TextView").getDeclaredField("mMarquee");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj == null) {
                    return;
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getDeclaredFields()) {
                    TLog.loge("SpanTextView", field.getName());
                }
                Field declaredField2 = cls.getDeclaredField("mPixelsPerSecond");
                declaredField2.setAccessible(true);
                this.mOrgSpeed = ((Float) declaredField2.get(obj)).floatValue();
                declaredField2.set(obj, Float.valueOf(f));
            } catch (ClassNotFoundException e) {
                e = e;
                TLog.loge("SpanTextView", "setMarqueeSpeed: 设置跑马灯速度失败", e);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e = e3;
                TLog.loge("SpanTextView", "setMarqueeSpeed: 设置跑马灯速度失败", e);
            }
        }
    }
}
