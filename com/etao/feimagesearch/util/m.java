package com.etao.feimagesearch.util;

import android.graphics.RectF;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1784749069);
    }

    public static RectF a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("4e2d74f5", new Object[]{str});
        }
        List parseArray = JSON.parseArray(str, Float.class);
        if (parseArray != null && parseArray.size() == 4) {
            return new RectF(((Float) parseArray.get(0)).floatValue(), ((Float) parseArray.get(1)).floatValue(), ((Float) parseArray.get(2)).floatValue(), ((Float) parseArray.get(3)).floatValue());
        }
        return null;
    }
}
