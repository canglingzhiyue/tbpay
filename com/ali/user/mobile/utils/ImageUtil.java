package com.ali.user.mobile.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ImageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static LruCache<String, Bitmap> mMemoryCache;

    static {
        kge.a(-1455246889);
        mMemoryCache = new LruCache<>(3);
    }

    public static void addBitmapToMemoryCache(String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25824bc7", new Object[]{str, bitmap});
        } else if (getBitmapFromMemoryCache(str) != null) {
        } else {
            mMemoryCache.put(str, bitmap);
        }
    }

    public static Bitmap getBitmapFromMemoryCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1b5c8901", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (mMemoryCache == null) {
            mMemoryCache = new LruCache<>(5);
        }
        return mMemoryCache.get(str);
    }

    public static void emptyMemoryCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416165fb", new Object[0]);
        } else {
            mMemoryCache = new LruCache<>(5);
        }
    }

    private static int calculateInSampleSize(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7507999", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        double d = i3;
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > Math.min(i / d, i2 / d)) {
                return (int) f;
            }
            f = f2;
        }
    }

    public static Bitmap decodeSampledBitmapFromResource(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a627371d", new Object[]{str, new Integer(i)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        options.inJustDecodeBounds = false;
        options.inSampleSize = calculateInSampleSize(i2, i3, i);
        return BitmapFactory.decodeFile(str, options);
    }

    public static void updateBackground(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d414c0fe", new Object[]{view, str});
            return;
        }
        Bitmap bitmapFromMemoryCache = getBitmapFromMemoryCache(MD5Util.getMD5(str));
        if (bitmapFromMemoryCache != null) {
            view.setBackground(new BitmapDrawable(bitmapFromMemoryCache));
        } else {
            new LoadImageTask(DataProviderFactory.getApplicationContext(), view, "HeadImages", 800).execute(str);
        }
    }

    public static void updateImage(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0967b1d", new Object[]{imageView, str});
        } else {
            updateImage(imageView, str, 640);
        }
    }

    public static void updateImage(ImageView imageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52395b86", new Object[]{imageView, str, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            imageView.setVisibility(0);
            Bitmap bitmapFromMemoryCache = getBitmapFromMemoryCache(MD5Util.getMD5(str));
            if (bitmapFromMemoryCache != null) {
                imageView.setImageBitmap(bitmapFromMemoryCache);
            } else {
                new LoadImageTask(DataProviderFactory.getApplicationContext(), imageView, "HeadImages", i).execute(str);
            }
        }
    }
}
