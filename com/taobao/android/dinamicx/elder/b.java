package com.taobao.android.dinamicx.elder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bm;
import tb.gbg;

/* loaded from: classes.dex */
public class b implements bm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.bm
    public float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue() : a((int) f);
    }

    private static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        float a2 = gbg.a(DinamicXEngine.i(), i);
        if (a2 < 12.0f) {
            return gbg.a(DinamicXEngine.i(), 15.0f);
        }
        if (a2 < 15.0f) {
            return gbg.a(DinamicXEngine.i(), 18.0f);
        }
        if (a2 < 18.0f) {
            return gbg.a(DinamicXEngine.i(), 21.0f);
        }
        if (a2 < 21.0f) {
            return gbg.a(DinamicXEngine.i(), 24.0f);
        }
        return gbg.a(DinamicXEngine.i(), 30.0f);
    }
}
