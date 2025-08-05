package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(931403174);
    }

    public static NinePatchDrawable a(Resources resources, Bitmap bitmap, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NinePatchDrawable) ipChange.ipc$dispatch("d8e17f8e", new Object[]{resources, bitmap, rect, new Integer(i), new Integer(i2)});
        }
        float min = Math.min((i * 1.0f) / bitmap.getWidth(), (i2 * 1.0f) / bitmap.getHeight());
        if (min != 1.0f && min > 0.0f) {
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }
        Bitmap bitmap2 = bitmap;
        return a(resources, bitmap2, (int) (rect.top * min), (int) (rect.left * min), (int) (bitmap2.getHeight() - (rect.bottom * min)), (int) (bitmap2.getWidth() - (rect.right * min)), null);
    }

    private static NinePatchDrawable a(Resources resources, Bitmap bitmap, int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NinePatchDrawable) ipChange.ipc$dispatch("fc0cde29", new Object[]{resources, bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str});
        }
        if (i2 == i4) {
            int i5 = i4 + 1;
            if (i5 >= bitmap.getWidth() - 1) {
                i2--;
                if (i2 < 0) {
                    i2 = 0;
                }
            } else {
                i4 = i5;
            }
        }
        if (i == i3) {
            int i6 = i3 + 1;
            if (i6 >= bitmap.getHeight() - 1) {
                i--;
                if (i < 0) {
                    i = 0;
                }
            } else {
                i3 = i6;
            }
        }
        return new NinePatchDrawable(resources, bitmap, a(i, i2, i3, i4).array(), new Rect(), str);
    }

    private static ByteBuffer a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("5d9eea69", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i2);
        order.putInt(i4);
        order.putInt(i);
        order.putInt(i3);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
