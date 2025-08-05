package com.taobao.phenix.compat.stat;

import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONST_0 = "0";
    public static final String CONST_1 = "1";
    public static final int COVERAGE_RANGE_MAX = 100;
    public static final int COVERAGE_RANGE_MIN = 0;
    private static Random b = new Random();

    /* renamed from: a  reason: collision with root package name */
    public boolean f18917a;

    public abstract void d();

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i <= 0 || (i < 100 && !b(i));
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue() : b.nextInt(100) + 1 <= i;
    }

    public void a(MeasureSet measureSet, String str, Double d, Double d2, Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a46c2c", new Object[]{this, measureSet, str, d, d2, d3});
            return;
        }
        Measure measure = new Measure(str, d);
        if (d2 != null && d3 != null) {
            measure.setRange(d2, d3);
        }
        measureSet.addMeasure(measure);
    }
}
