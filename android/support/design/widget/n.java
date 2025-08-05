package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1227a = {R.attr.colorPrimary};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1227a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            return;
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }
}
