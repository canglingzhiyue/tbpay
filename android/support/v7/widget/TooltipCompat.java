package android.support.v7.widget;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public class TooltipCompat {
    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ac.a(view, charSequence);
        }
    }
}
