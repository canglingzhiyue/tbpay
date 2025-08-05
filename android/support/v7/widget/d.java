package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import com.taobao.taobao.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f1480a;
    private aa d;
    private aa e;
    private aa f;
    private int c = -1;
    private final AppCompatDrawableManager b = AppCompatDrawableManager.get();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(View view) {
        this.f1480a = view;
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new aa();
        }
        aa aaVar = this.f;
        aaVar.a();
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(this.f1480a);
        if (backgroundTintList != null) {
            aaVar.d = true;
            aaVar.f1470a = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(this.f1480a);
        if (backgroundTintMode != null) {
            aaVar.c = true;
            aaVar.b = backgroundTintMode;
        }
        if (aaVar.d || aaVar.c) {
            AppCompatDrawableManager.tintDrawable(drawable, aaVar, this.f1480a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList a() {
        aa aaVar = this.e;
        if (aaVar != null) {
            return aaVar.f1470a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.b;
        b(appCompatDrawableManager != null ? appCompatDrawableManager.getTintList(this.f1480a.getContext(), i) : null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new aa();
        }
        aa aaVar = this.e;
        aaVar.f1470a = colorStateList;
        aaVar.d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new aa();
        }
        aa aaVar = this.e;
        aaVar.b = mode;
        aaVar.c = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.c = -1;
        b((ColorStateList) null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f1480a.getContext(), attributeSet, R.styleable.ViewBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_android_background)) {
                this.c = obtainStyledAttributes.getResourceId(R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList tintList = this.b.getTintList(this.f1480a.getContext(), this.c);
                if (tintList != null) {
                    b(tintList);
                }
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.setBackgroundTintList(this.f1480a, obtainStyledAttributes.getColorStateList(R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.setBackgroundTintMode(this.f1480a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode b() {
        aa aaVar = this.e;
        if (aaVar != null) {
            return aaVar.b;
        }
        return null;
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new aa();
            }
            aa aaVar = this.d;
            aaVar.f1470a = colorStateList;
            aaVar.d = true;
        } else {
            this.d = null;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable background = this.f1480a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            aa aaVar = this.e;
            if (aaVar != null) {
                AppCompatDrawableManager.tintDrawable(background, aaVar, this.f1480a.getDrawableState());
                return;
            }
            aa aaVar2 = this.d;
            if (aaVar2 == null) {
                return;
            }
            AppCompatDrawableManager.tintDrawable(background, aaVar2, this.f1480a.getDrawableState());
        }
    }
}
