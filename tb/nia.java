package tb;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public interface nia {

    /* loaded from: classes7.dex */
    public interface a {
        Bitmap a(int i, int i2, Bitmap.Config config);
    }

    String getId();

    Bitmap process(String str, a aVar, Bitmap bitmap);
}
