package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class at {

    /* renamed from: a  reason: collision with root package name */
    static final Property<View, Float> f1286a;
    static final Property<View, Rect> b;
    private static final az c;
    private static Field d;
    private static boolean e;

    static {
        c = Build.VERSION.SDK_INT >= 22 ? new ay() : Build.VERSION.SDK_INT >= 21 ? new ax() : Build.VERSION.SDK_INT >= 19 ? new aw() : Build.VERSION.SDK_INT >= 18 ? new av() : new au();
        f1286a = new Property<View, Float>(Float.class, "translationAlpha") { // from class: android.support.transition.at.1
            @Override // android.util.Property
            /* renamed from: a */
            public Float get(View view) {
                return Float.valueOf(at.c(view));
            }

            @Override // android.util.Property
            /* renamed from: a */
            public void set(View view, Float f) {
                at.a(view, f.floatValue());
            }
        };
        b = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: android.support.transition.at.2
            @Override // android.util.Property
            /* renamed from: a */
            public Rect get(View view) {
                return ViewCompat.getClipBounds(view);
            }

            @Override // android.util.Property
            /* renamed from: a */
            public void set(View view, Rect rect) {
                ViewCompat.setClipBounds(view, rect);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static as a(View view) {
        return c.a(view);
    }

    private static void a() {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, float f) {
        c.a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i) {
        a();
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i, int i2, int i3, int i4) {
        c.a(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, Matrix matrix) {
        c.a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bd b(View view) {
        return c.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Matrix matrix) {
        c.b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return c.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, Matrix matrix) {
        c.c(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view) {
        c.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        c.e(view);
    }
}
