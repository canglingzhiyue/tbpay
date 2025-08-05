package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import tb.kge;
import tb.ntx;

/* loaded from: classes7.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2057114491);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : DensityUtil.dip2px(Globals.getApplication(), i);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : DensityUtil.dip2px(Globals.getApplication(), f);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : DensityUtil.px2dip(Globals.getApplication(), i);
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f)})).intValue() : (int) ((f / Globals.getApplication().getResources().getDisplayMetrics().widthPixels) * 750.0f);
    }

    public static float c(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{new Float(f)})).floatValue() : (f / Globals.getApplication().getResources().getDisplayMetrics().widthPixels) * 750.0f;
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue() : b(a(i));
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{new Integer(i)})).intValue() : (ntx.a() * i) / 750;
    }

    public static float e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aef4f607", new Object[]{new Integer(i)})).floatValue() : (ntx.a() * i) / 750.0f;
    }
}
