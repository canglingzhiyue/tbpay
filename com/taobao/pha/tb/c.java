package com.taobao.pha.tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f18809a = -1;
    public int b = -1;
    public Bitmap c = null;
    public String d = "";
    public String e = "";
    public Intent f = null;

    static {
        kge.a(-1815367993);
    }

    public boolean a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8bb1508", new Object[]{this, activity, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String replace = str.replace(' ', '+');
        try {
            byte[] decode = Base64.decode(replace, 0);
            this.c = a(BitmapFactory.decodeByteArray(decode, 0, decode.length), a(activity) / 2);
            if (this.c == null) {
                ngr.a(replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            ngr.a("base64 to byteArr decode fail");
        }
        return this.c != null;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        "tb_icon_navibar_default_right".equals(str);
        this.f18809a = -1;
        return -1;
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        this.b = b(context, str);
        return this.b;
    }

    private Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{this, bitmap, new Integer(i)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private int b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b80d7fc", new Object[]{this, context, str})).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getIdentifier("uik_icon_" + str, "string", context.getPackageName());
    }

    private int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{this, activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return dimension;
    }
}
