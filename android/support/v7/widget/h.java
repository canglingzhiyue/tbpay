package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
class h extends g {

    /* renamed from: a  reason: collision with root package name */
    private final SeekBar f1483a;
    private Drawable b;
    private ColorStateList c;
    private PorterDuff.Mode d;
    private boolean e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(SeekBar seekBar) {
        super(seekBar);
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.f1483a = seekBar;
    }

    private void d() {
        if (this.b != null) {
            if (!this.e && !this.f) {
                return;
            }
            this.b = DrawableCompat.wrap(this.b.mutate());
            if (this.e) {
                DrawableCompat.setTintList(this.b, this.c);
            }
            if (this.f) {
                DrawableCompat.setTintMode(this.b, this.d);
            }
            if (!this.b.isStateful()) {
                return;
            }
            this.b.setState(this.f1483a.getDrawableState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (this.b != null) {
            int max = this.f1483a.getMax();
            int i = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.b.getIntrinsicWidth();
            int intrinsicHeight = this.b.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.b.setBounds(-i2, -i, i2, i);
            float width = ((this.f1483a.getWidth() - this.f1483a.getPaddingLeft()) - this.f1483a.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.f1483a.getPaddingLeft(), this.f1483a.getHeight() / 2);
            for (int i3 = 0; i3 <= max; i3++) {
                this.b.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    void a(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1483a);
            DrawableCompat.setLayoutDirection(drawable, ViewCompat.getLayoutDirection(this.f1483a));
            if (drawable.isStateful()) {
                drawable.setState(this.f1483a.getDrawableState());
            }
            d();
        }
        this.f1483a.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.g
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f1483a.getContext(), attributeSet, R.styleable.AppCompatSeekBar, i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.f1483a.setThumb(drawableIfKnown);
        }
        a(obtainStyledAttributes.getDrawable(R.styleable.AppCompatSeekBar_tickMark));
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.d = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.d);
            this.f = true;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.c = obtainStyledAttributes.getColorStateList(R.styleable.AppCompatSeekBar_tickMarkTint);
            this.e = true;
        }
        obtainStyledAttributes.recycle();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.b;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(this.f1483a.getDrawableState())) {
            return;
        }
        this.f1483a.invalidateDrawable(drawable);
    }
}
