package com.alipay.biometrics.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class CircleForegroud extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Xfermode SXFERMODE = new PorterDuffXfermode(PorterDuff.Mode.XOR);
    public Context mContext;
    private int mFloodColor;
    private Bitmap mMaskBitmap;
    private Paint mPaint;
    private WeakReference<Bitmap> mWeakBitmap;

    public static /* synthetic */ Object ipc$super(CircleForegroud circleForegroud, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1621401666) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.invalidate();
            return null;
        }
    }

    public CircleForegroud(Context context) {
        super(context);
        this.mFloodColor = -1;
        sharedConstructor();
    }

    public CircleForegroud(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFloodColor = -1;
        sharedConstructor();
    }

    public CircleForegroud(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFloodColor = -1;
        sharedConstructor();
    }

    private void sharedConstructor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7974e45c", new Object[]{this});
        } else {
            this.mPaint = new Paint(1);
        }
    }

    public void setFloodColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3d7bb5", new Object[]{this, new Integer(i)});
        } else if (this.mFloodColor == i) {
        } else {
            this.mFloodColor = i;
            invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        this.mWeakBitmap = null;
        Bitmap bitmap = this.mMaskBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mMaskBitmap.recycle();
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!isInEditMode()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            try {
                Bitmap bitmap = this.mWeakBitmap != null ? this.mWeakBitmap.get() : null;
                if ((bitmap == null || bitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                    try {
                        bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        drawable.setBounds(0, 0, getWidth(), getHeight());
                        drawable.draw(canvas2);
                        if (this.mMaskBitmap == null || this.mMaskBitmap.isRecycled()) {
                            this.mMaskBitmap = createMask1();
                        }
                        this.mPaint.reset();
                        this.mPaint.setFilterBitmap(false);
                        this.mPaint.setXfermode(SXFERMODE);
                        canvas2.drawColor(this.mFloodColor);
                        canvas2.drawBitmap(this.mMaskBitmap, 0.0f, 0.0f, this.mPaint);
                        this.mMaskBitmap.recycle();
                        this.mMaskBitmap = null;
                        this.mWeakBitmap = new WeakReference<>(bitmap);
                    } catch (OutOfMemoryError e) {
                        BioLog.e(e);
                        System.gc();
                        canvas.restoreToCount(saveLayer);
                        return;
                    }
                }
                if (bitmap != null) {
                    this.mPaint.setXfermode(null);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mPaint);
                    canvas.restoreToCount(saveLayer);
                    return;
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                canvas.restoreToCount(saveLayer);
                throw th;
            }
            canvas.restoreToCount(saveLayer);
        } else {
            super.onDraw(canvas);
        }
    }

    public Bitmap createMask1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b5760a0e", new Object[]{this});
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        float width = getWidth();
        float height = (getHeight() - width) / 2.0f;
        canvas.drawOval(new RectF(0.0f, height, width, height + width), paint);
        return createBitmap;
    }
}
