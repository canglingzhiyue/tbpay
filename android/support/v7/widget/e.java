package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.CompoundButtonCompat;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.taobao.taobao.R;
import tb.ace;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1481a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(CompoundButton compoundButton) {
        this.f1481a = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        Drawable buttonDrawable;
        return (Build.VERSION.SDK_INT >= 17 || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.f1481a)) == null) ? i : i + buttonDrawable.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1481a.getContext().obtainStyledAttributes(attributeSet, R.styleable.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.CompoundButton_android_button, 0)) != 0) {
                this.f1481a.setButtonDrawable(ace.b(this.f1481a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.CompoundButton_buttonTint)) {
                CompoundButtonCompat.setButtonTintList(this.f1481a, obtainStyledAttributes.getColorStateList(R.styleable.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.CompoundButton_buttonTintMode)) {
                CompoundButtonCompat.setButtonTintMode(this.f1481a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        d();
    }

    void d() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.f1481a);
        if (buttonDrawable != null) {
            if (!this.d && !this.e) {
                return;
            }
            Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
            if (this.d) {
                DrawableCompat.setTintList(mutate, this.b);
            }
            if (this.e) {
                DrawableCompat.setTintMode(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1481a.getDrawableState());
            }
            this.f1481a.setButtonDrawable(mutate);
        }
    }
}
