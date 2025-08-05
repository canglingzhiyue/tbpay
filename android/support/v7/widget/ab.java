package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class ab extends u {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f1471a;

    public ab(Context context, Resources resources) {
        super(resources);
        this.f1471a = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.u, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1471a.get();
        if (drawable != null && context != null) {
            AppCompatDrawableManager.get();
            AppCompatDrawableManager.tintDrawableUsingColorFilter(context, i, drawable);
        }
        return drawable;
    }
}
