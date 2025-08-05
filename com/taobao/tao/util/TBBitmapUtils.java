package com.taobao.tao.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class TBBitmapUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;

    static {
        kge.a(-2134630489);
        TAG = "TBBitmapUtils";
    }

    public static Bitmap captureView(Activity activity, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c80d602c", new Object[]{activity, view, new Integer(i), new Integer(i2)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (view == null || i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.round(view.getWidth() * 0.1f), Math.round(view.getHeight() * 0.1f), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.1f, 0.1f);
        view.draw(canvas);
        for (TextureView textureView : ViewUtils.find((ViewGroup) activity.findViewById(16908290), TextureView.class)) {
            View findViewById = ((ViewGroup) textureView.getParent()).findViewById(textureView.getContext().getResources().getIdentifier("dw_frontcover_cover", "id", textureView.getContext().getPackageName()));
            if (findViewById != null && findViewById.getParent() != null && ((View) findViewById.getParent()).getVisibility() == 0) {
                findViewById.draw(canvas);
            } else {
                Rect rect = new Rect();
                textureView.getGlobalVisibleRect(rect);
                Bitmap bitmap = textureView.getBitmap(rect.right - rect.left, rect.bottom - rect.top);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, rect.left, rect.top, new Paint());
                }
            }
        }
        canvas.drawColor(view.getContext().getResources().getColor(R.color.uik_public_menu_item_new_bg), PorterDuff.Mode.SRC_OVER);
        String str = "capture consumes " + (System.currentTimeMillis() - currentTimeMillis);
        return Bitmap.createScaledBitmap(createBitmap, Math.round(i * 0.1f), Math.round(i2 * 0.1f), false);
    }

    public static Bitmap blur(int i, RenderScript renderScript, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7284c4ef", new Object[]{new Integer(i), renderScript, bitmap});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.setRadius(i);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(bitmap);
        String str = "blur consumes " + (System.currentTimeMillis() - currentTimeMillis);
        return bitmap;
    }
}
