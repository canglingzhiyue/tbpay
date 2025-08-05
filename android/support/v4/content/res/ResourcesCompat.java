package android.support.v4.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.Preconditions;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    /* loaded from: classes2.dex */
    public static abstract class FontCallback {
        public final void callbackFailAsync(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: android.support.v4.content.res.ResourcesCompat.FontCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(i);
                }
            });
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: android.support.v4.content.res.ResourcesCompat.FontCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    private ResourcesCompat() {
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColorStateList(i, theme) : resources.getColorStateList(i);
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawableForDensity(i, i2, theme) : Build.VERSION.SDK_INT >= 15 ? resources.getDrawableForDensity(i, i2) : resources.getDrawable(i);
    }

    public static Typeface getFont(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false);
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true);
    }

    public static void getFont(Context context, int i, FontCallback fontCallback, Handler handler) throws Resources.NotFoundException {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false);
        }
    }

    private static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z);
        if (loadFont == null && fontCallback == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return loadFont;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface loadFont(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, android.support.v4.content.res.ResourcesCompat.FontCallback r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L9d
            java.lang.CharSequence r1 = r1.string
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L29
            if (r9 == 0) goto L28
            r9.callbackFailAsync(r14, r10)
        L28:
            return r13
        L29:
            android.graphics.Typeface r1 = android.support.v4.graphics.TypefaceCompat.findFromCache(r0, r4, r5)
            if (r1 == 0) goto L35
            if (r9 == 0) goto L34
            r9.callbackSuccessAsync(r1, r10)
        L34:
            return r1
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = android.support.v4.content.res.FontResourcesParserCompat.parse(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r9 == 0) goto L55
            r9.callbackFailAsync(r14, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
        L55:
            return r13
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = android.support.v4.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = android.support.v4.graphics.TypefaceCompat.createFromResourcesFontFile(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.callbackSuccessAsync(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            goto L78
        L75:
            r9.callbackFailAsync(r14, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L8a
        L82:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L8a:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L9c
            r9.callbackFailAsync(r14, r10)
        L9c:
            return r13
        L9d:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
