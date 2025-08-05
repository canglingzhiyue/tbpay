package com.taobao.android.change.app.icon.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIcon.bitmap";

    static {
        kge.a(-1513428006);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.graphics.Bitmap r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.change.app.icon.utils.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            java.lang.String r5 = "a510269a"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            r0 = 0
            if (r5 == 0) goto L5c
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4d
            r4 = 100
            r5.compress(r3, r4, r1)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4d
            r1.flush()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4d
            r1.close()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4d
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4d
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4d
            r0 = r1
            goto L5d
        L34:
            r5 = move-exception
            goto L3b
        L36:
            r5 = move-exception
            r1 = r0
            goto L4e
        L39:
            r5 = move-exception
            r1 = r0
        L3b:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4b
            r1.flush()     // Catch: java.lang.Exception -> L47
            r1.close()     // Catch: java.lang.Exception -> L47
            goto L4b
        L47:
            r5 = move-exception
            r5.printStackTrace()
        L4b:
            r5 = r0
            goto L6a
        L4d:
            r5 = move-exception
        L4e:
            if (r1 == 0) goto L5b
            r1.flush()     // Catch: java.lang.Exception -> L57
            r1.close()     // Catch: java.lang.Exception -> L57
            goto L5b
        L57:
            r0 = move-exception
            r0.printStackTrace()
        L5b:
            throw r5
        L5c:
            r5 = r0
        L5d:
            if (r0 == 0) goto L6a
            r0.flush()     // Catch: java.lang.Exception -> L66
            r0.close()     // Catch: java.lang.Exception -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.change.app.icon.utils.a.a(android.graphics.Bitmap):java.lang.String");
    }

    public static Bitmap a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6a58e66a", new Object[]{drawable});
        }
        if (drawable == null) {
            AdapterForTLog.loge(TAG, "drawable is null");
            return null;
        } else if (drawable instanceof BitmapDrawable) {
            AdapterForTLog.loge(TAG, "drawable is BitmapDrawable");
            return ((BitmapDrawable) drawable).getBitmap();
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            AdapterForTLog.loge(TAG, "drawable start convert to bitmap");
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                intrinsicWidth = Math.round(TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics()));
                intrinsicHeight = intrinsicWidth;
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        }
    }
}
