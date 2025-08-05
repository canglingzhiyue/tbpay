package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.widget.AutoSizeableTextView;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView {
    private final d mBackgroundTintHelper;
    private final i mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mBackgroundTintHelper = new d(this);
        this.mBackgroundTintHelper.a(attributeSet, i);
        this.mTextHelper = i.a(this);
        this.mTextHelper.a(attributeSet, i);
        this.mTextHelper.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.c();
        }
        i iVar = this.mTextHelper;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return -1;
        }
        return iVar.g();
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return -1;
        }
        return iVar.f();
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return -1;
        }
        return iVar.e();
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextAvailableSizes();
        }
        i iVar = this.mTextHelper;
        return iVar != null ? iVar.h() : new int[0];
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return 0;
        }
        return iVar.d();
    }

    @Override // android.support.v4.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // android.support.v4.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i iVar = this.mTextHelper;
        if (iVar != null) {
            iVar.a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper == null || PLATFORM_SUPPORTS_AUTOSIZE || !this.mTextHelper.c()) {
            return;
        }
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return;
        }
        iVar.a(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return;
        }
        iVar.a(iArr, i);
    }

    @Override // android.widget.TextView, android.support.v4.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return;
        }
        iVar.a(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        i iVar = this.mTextHelper;
        if (iVar != null) {
            iVar.a(z);
        }
    }

    @Override // android.support.v4.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        i iVar = this.mTextHelper;
        if (iVar != null) {
            iVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i, f);
            return;
        }
        i iVar = this.mTextHelper;
        if (iVar == null) {
            return;
        }
        iVar.a(i, f);
    }
}
