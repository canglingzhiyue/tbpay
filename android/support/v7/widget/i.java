package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.widget.AutoSizeableTextView;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    final TextView f1492a;
    private aa b;
    private aa c;
    private aa d;
    private aa e;
    private final k f;
    private int g = 0;
    private Typeface h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(TextView textView) {
        this.f1492a = textView;
        this.f = new k(this.f1492a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aa a(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList != null) {
            aa aaVar = new aa();
            aaVar.d = true;
            aaVar.f1470a = tintList;
            return aaVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new j(textView) : new i(textView);
    }

    private void a(Context context, TintTypedArray tintTypedArray) {
        String string;
        Typeface typeface;
        this.g = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.g);
        boolean z = false;
        if (tintTypedArray.hasValue(R.styleable.TextAppearance_android_fontFamily) || tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            this.h = null;
            int i = tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily) ? R.styleable.TextAppearance_fontFamily : R.styleable.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f1492a);
                try {
                    this.h = tintTypedArray.getFont(i, this.g, new ResourcesCompat.FontCallback() { // from class: android.support.v7.widget.i.1
                        @Override // android.support.v4.content.res.ResourcesCompat.FontCallback
                        public void onFontRetrievalFailed(int i2) {
                        }

                        @Override // android.support.v4.content.res.ResourcesCompat.FontCallback
                        public void onFontRetrieved(Typeface typeface2) {
                            i.this.a(weakReference, typeface2);
                        }
                    });
                    if (this.h == null) {
                        z = true;
                    }
                    this.i = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.h != null || (string = tintTypedArray.getString(i)) == null) {
                return;
            }
            this.h = Typeface.create(string, this.g);
        } else if (!tintTypedArray.hasValue(R.styleable.TextAppearance_android_typeface)) {
        } else {
            this.i = false;
            int i2 = tintTypedArray.getInt(R.styleable.TextAppearance_android_typeface, 1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.h = Typeface.MONOSPACE;
                return;
            } else {
                typeface = Typeface.SERIF;
            }
            this.h = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.i) {
            this.h = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface, this.g);
        }
    }

    private void b(int i, float f) {
        this.f.a(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.b == null && this.c == null && this.d == null && this.e == null) {
            return;
        }
        Drawable[] compoundDrawables = this.f1492a.getCompoundDrawables();
        a(compoundDrawables[0], this.b);
        a(compoundDrawables[1], this.c);
        a(compoundDrawables[2], this.d);
        a(compoundDrawables[3], this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || c()) {
            return;
        }
        b(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f.a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        ColorStateList colorStateList;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            a(obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor) && (colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor)) != null) {
            this.f1492a.setTextColor(colorStateList);
        }
        a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        Typeface typeface = this.h;
        if (typeface != null) {
            this.f1492a.setTypeface(typeface, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable, aa aaVar) {
        if (drawable == null || aaVar == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, aaVar, this.f1492a.getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f1492a.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextHelper, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.b = a(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.c = a(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z3 = this.f1492a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, R.styleable.TextAppearance);
            if (z3 || !obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes2.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, obtainStyledAttributes2);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList colorStateList4 = obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_android_textColor) ? obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor) : null;
                colorStateList2 = obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_android_textColorHint) ? obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColorHint) : null;
                if (obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_android_textColorLink)) {
                    colorStateList3 = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList5 = colorStateList4;
                colorStateList = colorStateList3;
                colorStateList3 = colorStateList5;
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            obtainStyledAttributes2.recycle();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
        }
        TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i, 0);
        if (z3 || !obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            z4 = z;
        } else {
            z2 = obtainStyledAttributes3.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_android_textColor)) {
                colorStateList3 = obtainStyledAttributes3.getColorStateList(R.styleable.TextAppearance_android_textColor);
            }
            if (obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_android_textColorHint)) {
                colorStateList2 = obtainStyledAttributes3.getColorStateList(R.styleable.TextAppearance_android_textColorHint);
            }
            if (obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_android_textColorLink)) {
                colorStateList = obtainStyledAttributes3.getColorStateList(R.styleable.TextAppearance_android_textColorLink);
            }
        }
        a(context, obtainStyledAttributes3);
        obtainStyledAttributes3.recycle();
        if (colorStateList3 != null) {
            this.f1492a.setTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f1492a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f1492a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z4) {
            a(z2);
        }
        Typeface typeface = this.h;
        if (typeface != null) {
            this.f1492a.setTypeface(typeface, this.g);
        }
        this.f.a(attributeSet, i);
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || this.f.a() == 0) {
            return;
        }
        int[] e = this.f.e();
        if (e.length <= 0) {
            return;
        }
        if (this.f1492a.getAutoSizeStepGranularity() != -1.0f) {
            this.f1492a.setAutoSizeTextTypeUniformWithConfiguration(this.f.c(), this.f.d(), this.f.b(), 0);
        } else {
            this.f1492a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1492a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, int i, int i2, int i3, int i4) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, int i) throws IllegalArgumentException {
        this.f.a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f.e();
    }
}
