package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f13146a = false;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    static {
        kge.a(760047724);
    }

    private boolean a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26196dfc", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).booleanValue();
        }
        double d = f;
        return d >= ((double) i) / 100.0d && d <= ((double) i2) / 100.0d;
    }

    public void a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d57028", new Object[]{this, new Integer(i), bVar});
            return;
        }
        a();
        if (Color.alpha(i) < 255) {
            bVar.a();
            return;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        if (fArr[0] < 0.1d && fArr[1] < 0.1d) {
            float f = fArr[2];
            if (a(0, 20, f)) {
                bVar.a(this.b);
                return;
            } else if (a(21, 36, f)) {
                bVar.a(this.c);
                return;
            } else if (a(37, 43, f)) {
                bVar.a(this.h);
                return;
            } else if (a(44, 57, f)) {
                bVar.a(this.i);
                return;
            } else if (a(58, 63, f)) {
                bVar.a(this.f);
                return;
            } else if (a(64, 74, f)) {
                bVar.a(this.g);
                return;
            } else if (a(84, 87, f)) {
                bVar.a(this.d);
                return;
            } else if (a(88, 93, f)) {
                bVar.a(this.e);
                return;
            } else if (a(94, 99, f)) {
                bVar.a(this.j);
                return;
            } else {
                bVar.f13144a = false;
                return;
            }
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        double d = f2;
        int i2 = (d > 0.625d ? 1 : (d == 0.625d ? 0 : -1));
        if (i2 > 0 && f3 > 0.5d && f4 > 0.85d) {
            fArr[1] = f3 * 0.8f;
            bVar.a(Color.HSVToColor(fArr));
        } else if (d < 0.5555555555555556d && f3 < 0.25d && f4 > 0.85d) {
            fArr[2] = f4 - 0.1f;
            bVar.a(Color.HSVToColor(fArr));
        } else if (d < 0.4583333333333333d && f3 > 0.7d && f4 > 0.9d) {
            bVar.a();
        } else if (i2 > 0 && f3 < 0.5d && f4 > 0.9d) {
            bVar.a();
        } else {
            bVar.a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f13146a) {
        } else {
            this.f13146a = true;
            this.b = Color.parseColor("#EEEEEE");
            this.c = Color.parseColor("#DDDDDD");
            this.d = Color.parseColor("#777777");
            this.e = Color.parseColor("#383838");
            this.f = Color.parseColor("#888888");
            this.g = Color.parseColor("#808080");
            this.h = Color.parseColor("#AAAAAA");
            this.i = Color.parseColor("#949494");
            this.j = Color.parseColor("#333333");
        }
    }
}
