package com.alibaba.aliweex.hc.bundle;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.utils.WXLogUtils;
import tb.amu;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f2025a = -1;
    public int b = -1;
    public Bitmap c = null;
    public String d = "";
    public String e = "";
    public Intent f = null;
    public boolean g = false;
    public amu.a h;

    static {
        kge.a(-586534428);
    }

    public boolean a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123a1d2", new Object[]{this, str, new Float(f)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replace = str.replace(' ', '+');
        try {
            byte[] decode = Base64.decode(replace, 0);
            this.c = a(BitmapFactory.decodeByteArray(decode, 0, decode.length), (int) (f / 2.0f));
            if (this.c == null) {
                WXLogUtils.e("TBWXActionBarMenuItem", replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            WXLogUtils.e("TBWXActionBarMenuItem", "base64 to byteArr decode fail");
        }
        return this.c != null;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        int i = -1;
        if ("tb_icon_navibar_default_right".equals(str)) {
            i = R.drawable.tb_icon_navibar_default_right;
        }
        this.f2025a = i;
        return i;
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        this.b = b(context, str);
        return this.b;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public static final int b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b80d7fc", new Object[]{context, str})).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getIdentifier("uik_icon_" + str, "string", context.getPackageName());
    }
}
