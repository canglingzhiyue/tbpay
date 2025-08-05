package com.taobao.android.dinamic;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fpa;
import tb.fpq;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-780112592);
    }

    public static fpq a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpq) ipChange.ipc$dispatch("396db7d5", new Object[]{view});
        }
        if (view == null) {
            return new fpq();
        }
        Object tag = view.getTag(j.PROPERTY_KEY);
        return tag == null ? new fpq() : (fpq) tag;
    }

    public static Pair<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(riy.BRACKET_START_STR);
        int indexOf2 = str.indexOf(riy.BRACKET_END_STR);
        if (indexOf < 0 || indexOf2 < 0) {
            if (e.a()) {
                fpa.b(e.TAG, String.format("事件属性:%s语法出错,没有包含\"（）\"", str));
            }
            return null;
        }
        String trim = str.trim();
        String substring = trim.substring(0, indexOf);
        String substring2 = trim.substring(indexOf + 1, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        return new Pair<>(substring, substring2);
    }

    public static void a(View view, Canvas canvas) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f54a13b", new Object[]{view, canvas});
        } else if (canvas == null || canvas.getWidth() <= 0 || Build.VERSION.SDK_INT < 16 || (fArr = (float[]) view.getTag(j.LAYOUT_RADII)) == null) {
        } else {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            if (Build.VERSION.SDK_INT >= 11 && canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 18) {
                view.setLayerType(1, null);
            }
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, width, height), fArr, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }
}
