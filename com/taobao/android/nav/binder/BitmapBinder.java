package com.taobao.android.nav.binder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public class BitmapBinder extends Binder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<Drawable> drawable;
    public final WeakReference<View> sourceView;

    static {
        kge.a(-171632385);
    }

    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return null;
    }

    public Bitmap screenshotOnView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e4190b5f", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public BitmapBinder(View view) {
        this.sourceView = new WeakReference<>(view);
        this.drawable = new WeakReference<>(null);
    }

    public BitmapBinder(Drawable drawable) {
        this.drawable = new WeakReference<>(drawable);
        this.sourceView = new WeakReference<>(null);
    }

    public Drawable getDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this}) : this.drawable.get();
    }
}
