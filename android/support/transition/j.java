package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
interface j {

    /* loaded from: classes2.dex */
    public interface a {
        j a(View view, ViewGroup viewGroup, Matrix matrix);

        void a(View view);
    }

    void reserveEndViewTransition(ViewGroup viewGroup, View view);

    void setVisibility(int i);
}
