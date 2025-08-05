package com.taobao.tao.adapter.biz.plugins.watermask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.adapter.biz.plugins.watermask.view.BottomWaterMaskView;
import com.taobao.tao.adapter.biz.plugins.watermask.view.LastWaterMaskView;
import com.taobao.tao.adapter.biz.plugins.watermask.view.VideoWaterBgView;
import com.taobao.taobao.R;
import java.io.File;
import tb.kge;
import tb.ocw;
import tb.ocx;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIR_NAME = "marvel_watermark_gg";

    static {
        kge.a(176640615);
    }

    public static String a(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dbcb8c0", new Object[]{context, str, str2, new Boolean(z)});
        }
        if (z) {
            return str2 + File.separator + "watermark_tbLive" + File.separator + "watermark.png";
        }
        String c = ocx.c(context, str);
        if (new File(c).exists()) {
            return c;
        }
        try {
            ocw.a(a(context, str, str2 + File.separator + DIR_NAME + File.separator + "watermark.png"), c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static Bitmap a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3d721c52", new Object[]{context, str, str2});
        }
        BottomWaterMaskView bottomWaterMaskView = new BottomWaterMaskView(context, str, str2);
        int a2 = ocw.a(context, 35.0f);
        bottomWaterMaskView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(a2, 1073741824));
        bottomWaterMaskView.layout(0, 0, bottomWaterMaskView.getMeasuredWidth(), a2);
        Bitmap createBitmap = Bitmap.createBitmap(bottomWaterMaskView.getMeasuredWidth(), bottomWaterMaskView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bottomWaterMaskView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static String a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53af5a22", new Object[]{context, str, str2, str3});
        }
        String b = ocx.b(context, str);
        if (new File(b).exists()) {
            return b;
        }
        LastWaterMaskView lastWaterMaskView = new LastWaterMaskView(context, str, str2, str3 + File.separator + DIR_NAME + File.separator + "search_icon.png", str3 + File.separator + DIR_NAME + File.separator + "tab_bar.png");
        lastWaterMaskView.measure(View.MeasureSpec.makeMeasureSpec(ocw.a(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(ocw.b(), Integer.MIN_VALUE));
        lastWaterMaskView.layout(0, 0, lastWaterMaskView.getMeasuredWidth(), lastWaterMaskView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(lastWaterMaskView.getMeasuredWidth(), lastWaterMaskView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        lastWaterMaskView.draw(new Canvas(createBitmap));
        try {
            ocw.a(createBitmap, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public static String a(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cbb95d6", new Object[]{context, str, new Integer(i), new Integer(i2)});
        }
        String a2 = ocx.a(context, str, i, i2);
        if (new File(a2).exists()) {
            return a2;
        }
        VideoWaterBgView videoWaterBgView = new VideoWaterBgView(context, i, i2);
        videoWaterBgView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        videoWaterBgView.layout(0, 0, videoWaterBgView.getMeasuredWidth(), videoWaterBgView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(videoWaterBgView.getMeasuredWidth(), videoWaterBgView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        videoWaterBgView.draw(new Canvas(createBitmap));
        try {
            ocw.a(createBitmap, a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a2;
    }

    public static String a(Context context, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1a49ddc", new Object[]{context, str, bitmap});
        }
        String d = ocx.d(context, str);
        if (new File(d).exists()) {
            return d;
        }
        View a2 = a(context, bitmap);
        int a3 = ocw.a(context, 70.0f);
        int a4 = ocw.a(context, 70.0f);
        a2.measure(View.MeasureSpec.makeMeasureSpec(a3, 1073741824), View.MeasureSpec.makeMeasureSpec(a4, 1073741824));
        a2.layout(0, 0, a2.getMeasuredWidth(), a2.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(a3, a4, Bitmap.Config.ARGB_8888);
        a2.draw(new Canvas(createBitmap));
        try {
            ocw.a(createBitmap, d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    private static View a(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8f6f6290", new Object[]{context, bitmap});
        }
        int a2 = ocw.a(context, 2.0f);
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundResource(R.drawable.share_cricle_white_bg);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setPadding(a2, a2, a2, a2);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }
}
