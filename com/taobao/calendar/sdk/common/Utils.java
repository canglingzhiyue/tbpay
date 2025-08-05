package com.taobao.calendar.sdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Date;
import tb.kge;

/* loaded from: classes6.dex */
public class Utils {
    private static TelephonyManager telephonyManager;

    static {
        kge.a(1759133440);
        telephonyManager = null;
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static String digest(InputStream inputStream, String str) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr, 0, 1024);
            while (read >= 0) {
                messageDigest.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, 1024);
            }
            return bytesToHexString(messageDigest.digest());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Security exception", e);
        }
    }

    private static String digest(byte[] bArr, String str) {
        return bytesToHexString(digest2byte(bArr, str));
    }

    private static byte[] digest2byte(byte[] bArr, String str) {
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Security exception", e);
        }
    }

    public static String getImei(Context context) {
        if (telephonyManager == null) {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        }
        TelephonyManager telephonyManager2 = telephonyManager;
        String proxy_getDeviceId = telephonyManager2 != null ? ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager2) : null;
        return (proxy_getDeviceId == null || proxy_getDeviceId.trim().equals("")) ? "000000000000000" : proxy_getDeviceId;
    }

    public static String getImsi(Context context) {
        if (telephonyManager == null) {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        }
        TelephonyManager telephonyManager2 = telephonyManager;
        String proxy_getSubscriberId = telephonyManager2 != null ? ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager2) : null;
        return (proxy_getSubscriberId == null || proxy_getSubscriberId.trim().equals("")) ? "000000000000000" : proxy_getSubscriberId;
    }

    public static String getPhoneOS() {
        int i = Build.VERSION.SDK_INT;
        return "Android" + i;
    }

    public static String getPhoneType() {
        return Build.MODEL;
    }

    public static int[] getScreenSize(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int getStatusBarHeight(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String getTimeStamp() {
        return String.valueOf(new Date().getTime() / 1000);
    }

    public static String getUserIdByReflect() {
        String str = "0";
        Log.e("Test", "========getUserIdByReflect start========");
        try {
            Class<?> cls = Class.forName("com.taobao.login4android.api.Login");
            Log.e("Test", "clazz:" + cls);
            if (cls != null) {
                Method method = cls.getMethod("getUserId", new Class[0]);
                Log.e("Test", "method:" + method);
                if (method != null) {
                    String str2 = (String) method.invoke(cls, new Object[0]);
                    try {
                        Log.e("Test", "userId:" + str2);
                        str = str2;
                    } catch (Exception e) {
                        e = e;
                        str = str2;
                        e.printStackTrace();
                        Log.e("Test", "exception:" + e.getMessage());
                        Log.e("Test", "========getUserIdByReflect end========");
                        return str;
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        Log.e("Test", "========getUserIdByReflect end========");
        return str;
    }

    public static String join(long[] jArr, String str) {
        int length = jArr.length;
        int i = length - 1;
        String str2 = "";
        for (int i2 = 0; i2 < length; i2++) {
            str2 = str2 + jArr[i2];
            if (i2 != i) {
                str2 = str2 + str;
            }
        }
        return str2;
    }

    public static String join(String[] strArr, String str) {
        int length = strArr.length;
        int i = length - 1;
        String str2 = "";
        for (int i2 = 0; i2 < length; i2++) {
            str2 = str2 + strArr[i2];
            if (i2 != i) {
                str2 = str2 + str;
            }
        }
        return str2;
    }

    public static String md5ToHex(InputStream inputStream) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr, 0, 1024);
            while (read >= 0) {
                messageDigest.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, 1024);
            }
            return bytesToHexString(messageDigest.digest());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("gen MD5 exception", e);
        }
    }

    public static String md5ToHex(String str) {
        if (str == null) {
            return null;
        }
        try {
            return digest(str.getBytes("utf-8"), "MD5");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String md5ToHex(byte[] bArr) throws IOException {
        return md5ToHex(new ByteArrayInputStream(bArr));
    }

    public static String replaceOrAddQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        int indexOf = str.indexOf(str2 + "=");
        StringBuilder sb = new StringBuilder();
        if (indexOf != -1) {
            sb.append(str.substring(0, indexOf));
            sb.append(str2);
            sb.append("=");
            sb.append(str3);
            int indexOf2 = str.indexOf("&", indexOf);
            if (indexOf2 != -1) {
                sb.append(str.substring(indexOf2));
            }
        } else {
            sb.append(str);
            if (str.indexOf("?") == -1) {
                sb.append("?");
            } else if (!str.endsWith("?")) {
                sb.append("&");
            }
            sb.append(str2);
            sb.append("=");
            sb.append(str3);
        }
        return sb.toString();
    }

    public static Drawable resizeBackgroundForApp(Context context, int i) {
        int[] screenSize = getScreenSize(context);
        return resizeBackgroundForView(context, i, screenSize[0], screenSize[1] - getStatusBarHeight(context));
    }

    public static Drawable resizeBackgroundForApp(Context context, Bitmap bitmap) {
        int[] screenSize = getScreenSize(context);
        return resizeBackgroundForView(context, bitmap, screenSize[0], screenSize[1] - getStatusBarHeight(context));
    }

    public static Drawable resizeBackgroundForView(Context context, int i, int i2, int i3) {
        return resizeBackgroundForView(context, BitmapFactory.decodeResource(context.getResources(), i), i2, i3);
    }

    public static Drawable resizeBackgroundForView(Context context, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i;
        float f2 = i2;
        float f3 = width;
        float f4 = height;
        float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
        Matrix matrix = new Matrix();
        matrix.postScale(f5, f5);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint(2);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(createBitmap, (i / 2) - (createBitmap.getWidth() / 2), (i2 / 2) - (createBitmap.getHeight() / 2), paint);
        canvas.save();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap2);
        createBitmap.recycle();
        return bitmapDrawable;
    }
}
