package com.taobao.ask.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.utils.e;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.view.TImageView;
import tb.kge;

/* loaded from: classes6.dex */
public class AskImageView extends TImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(934894856);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public AskImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public AskImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AskImageView(Context context) {
        super(context);
        init();
    }

    public void setImageUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960413c", new Object[]{this, str, new Integer(i)});
            return;
        }
        setImageDrawable(new ColorDrawable(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a(getContext(), str, -1, -1, new e.a() { // from class: com.taobao.ask.view.AskImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ask.utils.e.a
            public void a(String str2, BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc1cd0a7", new Object[]{this, str2, bitmapDrawable});
                } else {
                    AskImageView.this.setImageDrawable(bitmapDrawable);
                }
            }
        });
    }

    public void setCircle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69703e9b", new Object[]{this, new Boolean(z)});
            return;
        }
        AbsFeature<? super ImageView> findFeature = findFeature(MyRoundRectFeature.class);
        if (findFeature instanceof MyRoundRectFeature) {
            ((MyRoundRectFeature) findFeature).setCircle(z);
            return;
        }
        MyRoundRectFeature myRoundRectFeature = new MyRoundRectFeature();
        myRoundRectFeature.setCircle(z);
        addFeature(myRoundRectFeature);
    }

    /* loaded from: classes6.dex */
    public class MyRoundRectFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Paint mPaint;
        private Path mPath;
        private float[] mRadii;
        private RectF mRectF;
        private boolean mIsCircle = false;
        private float mRadiusX = 20.0f;
        private float mRadiusY = 20.0f;

        static {
            kge.a(439799052);
            kge.a(-396248018);
            kge.a(-980398080);
        }

        public static /* synthetic */ Object ipc$super(MyRoundRectFeature myRoundRectFeature, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void afterDispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void afterDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void afterOnDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void beforeDispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void beforeDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.LayoutCallback
        public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        public MyRoundRectFeature() {
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void beforeOnDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
                return;
            }
            Path path = this.mPath;
            if (path == null || path.isEmpty()) {
                return;
            }
            canvas.clipPath(this.mPath);
        }

        @Override // com.taobao.uikit.feature.callback.LayoutCallback
        public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            this.mRectF.set(0.0f, 0.0f, this.mHost.getMeasuredWidth(), this.mHost.getMeasuredHeight());
            if (this.mIsCircle) {
                this.mRadiusX = this.mHost.getMeasuredWidth() / 2.0f;
                this.mRadiusY = this.mHost.getMeasuredHeight() / 2.0f;
            }
            this.mPath.reset();
            RectF rectF = new RectF(this.mRectF);
            float[] fArr = this.mRadii;
            if (fArr != null) {
                this.mPath.addRoundRect(rectF, fArr, Path.Direction.CW);
            } else {
                this.mPath.addRoundRect(rectF, this.mRadiusX, this.mRadiusY, Path.Direction.CW);
            }
        }

        public void setCircle(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69703e9b", new Object[]{this, new Boolean(z)});
                return;
            }
            this.mIsCircle = z;
            AskImageView.this.requestLayout();
            invalidateHost();
        }

        private void invalidateHost() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b2908a", new Object[]{this});
            } else if (this.mHost == 0) {
            } else {
                this.mHost.invalidate();
            }
        }

        @Override // com.taobao.uikit.feature.features.AbsFeature
        public void constructor(Context context, AttributeSet attributeSet, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
                return;
            }
            this.mPath = new Path();
            this.mRectF = new RectF();
        }
    }
}
