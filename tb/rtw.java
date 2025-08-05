package tb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes9.dex */
public final class rtw {
    static {
        kge.a(1447226495);
    }

    public static Activity a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return a(((ContextWrapper) context).getBaseContext());
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        if (view.hasFocus()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        if (i > 0) {
            if (view.getHeight() < 10 || view.getWidth() < 10) {
                return true;
            }
            i--;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (a(viewGroup.getChildAt(i2), i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(ViewParent viewParent) {
        boolean z = true;
        if (!(viewParent instanceof View)) {
            return true;
        }
        View view = (View) viewParent;
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            z = false;
        }
        if (z) {
            return a(view.getParent());
        }
        return false;
    }

    public static boolean b(View view) {
        if (view == null) {
            return false;
        }
        if (!(Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null) || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 19 ? background.getAlpha() > 0 : background instanceof ColorDrawable ? Color.alpha(((ColorDrawable) background).getColor()) > 0 : !(background instanceof BitmapDrawable) || ((BitmapDrawable) background).getPaint().getAlpha() > 0;
    }
}
