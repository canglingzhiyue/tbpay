package tb;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.d;
import com.airbnb.lottie.model.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ahx {
    private final AssetManager d;
    private d e;

    /* renamed from: a  reason: collision with root package name */
    private final h<String> f25346a = new h<>();
    private final Map<h<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String f = ".ttf";

    public ahx(Drawable.Callback callback, d dVar) {
        AssetManager assets;
        this.e = dVar;
        if (!(callback instanceof View)) {
            akh.c("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.d = assets;
    }

    private Typeface a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    private Typeface a(String str) {
        String b;
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = null;
        d dVar = this.e;
        if (dVar != null) {
            typeface2 = dVar.a(str);
        }
        d dVar2 = this.e;
        if (dVar2 != null && typeface2 == null && (b = dVar2.b(str)) != null) {
            typeface2 = Typeface.createFromAsset(this.d, b);
        }
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(this.d, "fonts/" + str + this.f);
        }
        this.c.put(str, typeface2);
        return typeface2;
    }

    public Typeface a(String str, String str2) {
        this.f25346a.a(str, str2);
        Typeface typeface = this.b.get(this.f25346a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a2 = a(a(str), str2);
        this.b.put(this.f25346a, a2);
        return a2;
    }

    public void a(d dVar) {
        this.e = dVar;
    }
}
