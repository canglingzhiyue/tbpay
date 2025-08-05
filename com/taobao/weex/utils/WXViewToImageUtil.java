package com.taobao.weex.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import tb.kge;

/* loaded from: classes9.dex */
public class WXViewToImageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int mBackgroundColor;

    /* loaded from: classes9.dex */
    public interface OnImageSavedCallback {
        void onSaveFailed(String str);

        void onSaveSucceed(String str);
    }

    static {
        kge.a(612102275);
        mBackgroundColor = 0;
    }

    public static void generateImage(final View view, final int i, int i2, final OnImageSavedCallback onImageSavedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be362443", new Object[]{view, new Integer(i), new Integer(i2), onImageSavedCallback});
            return;
        }
        mBackgroundColor = i2;
        WXSDKManager.getInstance().getWXWorkThreadManager().post(new Thread(new Runnable() { // from class: com.taobao.weex.utils.WXViewToImageUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Bitmap bitmapFromImageView = WXViewToImageUtil.getBitmapFromImageView(view, i);
                if (bitmapFromImageView != null) {
                    final String saveBitmapToGallery = WXViewToImageUtil.saveBitmapToGallery(view.getContext(), bitmapFromImageView, onImageSavedCallback);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.weex.utils.WXViewToImageUtil.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (onImageSavedCallback == null) {
                            } else {
                                onImageSavedCallback.onSaveSucceed(saveBitmapToGallery);
                                view.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse(saveBitmapToGallery)));
                            }
                        }
                    });
                    return;
                }
                OnImageSavedCallback onImageSavedCallback2 = onImageSavedCallback;
                if (onImageSavedCallback2 == null) {
                    return;
                }
                onImageSavedCallback2.onSaveFailed("Image is empty");
            }
        }, "WXViewToImageUtilThr"));
    }

    public static String saveBitmapToGallery(Context context, Bitmap bitmap, OnImageSavedCallback onImageSavedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24af702a", new Object[]{context, bitmap, onImageSavedCallback});
        }
        File file = new File(context.getFilesDir(), "Weex");
        if (!file.exists()) {
            file.mkdir();
        }
        String str = System.currentTimeMillis() + ".jpg";
        File file2 = new File(file, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            if (onImageSavedCallback != null) {
                onImageSavedCallback.onSaveFailed("Image creation failed due to system reason");
            }
            e.printStackTrace();
        } catch (IOException e2) {
            if (onImageSavedCallback != null) {
                onImageSavedCallback.onSaveFailed("Android IOException");
            }
            e2.printStackTrace();
        }
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(), file2.getAbsolutePath(), str, (String) null);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
        }
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file.getAbsolutePath() + "/" + str)));
        return file2.getAbsolutePath();
    }

    public static Bitmap getBitmapFromImageView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a0d2a47", new Object[]{view, new Integer(i)});
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        view.setDrawingCacheEnabled(true);
        return view.getDrawingCache();
    }
}
