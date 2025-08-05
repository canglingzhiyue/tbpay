package com.etao.feimagesearch.nn.optimize;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.a;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class OptimizeOutput {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f6919a;
    public boolean b;
    public float c;
    public Bitmap d;
    public long e;
    public String f;
    public String g;
    public a.b h;
    public boolean i;
    public List<RectF> j;
    public List<Float> k;
    public String l = "";
    public String m = "";
    public String n = "";
    public float[] o;
    public String p;
    public String q;

    static {
        kge.a(-385168016);
    }

    private OptimizeOutput(int i) {
        this.f6919a = i;
    }

    public static OptimizeOutput a(List<RectF> list, List<Float> list2, Bitmap bitmap, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OptimizeOutput) ipChange.ipc$dispatch("4f6c68ab", new Object[]{list, list2, bitmap, new Long(j), str});
        }
        OptimizeOutput optimizeOutput = new OptimizeOutput(-1);
        optimizeOutput.i = true;
        optimizeOutput.d = bitmap;
        optimizeOutput.j = list;
        optimizeOutput.k = list2;
        optimizeOutput.e = j;
        optimizeOutput.q = str;
        return optimizeOutput;
    }

    public static OptimizeOutput a(List<RectF> list, List<Float> list2, Bitmap bitmap, String str, String str2, String str3, long j, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OptimizeOutput) ipChange.ipc$dispatch("c41df48d", new Object[]{list, list2, bitmap, str, str2, str3, new Long(j), str4});
        }
        OptimizeOutput a2 = a(list, list2, bitmap, j, str4);
        a2.m = str;
        a2.n = str2;
        a2.l = str3;
        return a2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OptimizeOutput{id=" + this.f6919a + ", branch=" + this.b + ", conf=" + this.c + ", bitmap=" + this.d + ", time=" + this.e + ", failedReason='" + this.f + "', className='" + this.g + "', mainPart=" + this.h + ", mBox=" + Arrays.toString(this.o) + ", hint='" + this.p + "'}";
    }
}
