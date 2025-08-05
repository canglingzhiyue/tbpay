package tb;

import android.graphics.PointF;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class ppk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<String> f32800a = new HashSet<>();
    private FaceDetectorConfig.FaceDetectionConfigInfo b;

    static {
        kge.a(1929646919);
    }

    public void a(FaceDetectorConfig.FaceDetectionConfigInfo faceDetectionConfigInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d5fee3", new Object[]{this, faceDetectionConfigInfo});
        } else {
            this.b = faceDetectionConfigInfo;
        }
    }

    public ppj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppj) ipChange.ipc$dispatch("7c73e8ea", new Object[]{this, str});
        }
        ppj ppjVar = new ppj();
        ppjVar.d = str;
        ppjVar.u = Long.parseLong(this.b.preDetectionIntervalTime);
        return ppjVar;
    }

    public ppj a(ppj ppjVar, boolean z, Rect rect, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppj) ipChange.ipc$dispatch("57ad4749", new Object[]{this, ppjVar, new Boolean(z), rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (this.b == null || ppjVar.s) {
            return ppjVar;
        }
        ppjVar.h++;
        if (ppjVar.h >= Integer.parseInt(this.b.preDetectionThreshold)) {
            ppjVar.u = Long.parseLong(this.b.intervalTime);
        }
        if (z) {
            ppjVar.n = ppjVar.h;
            ppjVar.e.add(new PointF(rect.exactCenterX() - i3, rect.exactCenterY() - i4));
            float width = (i2 * i) / (rect.width() * rect.height());
            ppjVar.k.add(Float.valueOf(width));
            ppjVar.i++;
            ppjVar.r = rect;
            ArrayList<Float> farApartScaleList = this.b.getFarApartScaleList(width);
            if (farApartScaleList != null && farApartScaleList.size() > 0) {
                float floatValue = farApartScaleList.get(0).floatValue();
                float floatValue2 = farApartScaleList.size() >= 2 ? farApartScaleList.get(1).floatValue() : floatValue;
                ppjVar.j++;
                int i5 = ppjVar.h - ppjVar.m;
                ppjVar.l = ppjVar.h;
                if (ppjVar.h <= Integer.parseInt(this.b.preDetectionThreshold)) {
                    ppjVar.t = true;
                    ppjVar.u = Long.parseLong(this.b.intervalTime);
                    if (ppjVar.v == -1) {
                        ppjVar.v = ppjVar.h;
                    }
                }
                if (!ppjVar.t && i5 >= Integer.parseInt(this.b.continuedIsFarApartThreshold)) {
                    ppjVar.t = true;
                    ppjVar.u = Long.parseLong(this.b.intervalTime);
                    if (ppjVar.v == -1) {
                        ppjVar.v = ppjVar.h;
                    }
                }
                if (ppjVar.t) {
                    int i6 = i3 + (i / 2);
                    if (ppjVar.p == 1.0f) {
                        int i7 = i / 6;
                        if (rect.centerX() > i6 - i7 && rect.centerX() < i6 + i7) {
                            ppjVar.q = floatValue;
                        } else {
                            ppjVar.q = floatValue2;
                        }
                        ppjVar.w++;
                    }
                }
            } else {
                int min = Math.min(ppjVar.h - ppjVar.l, ppjVar.h - ppjVar.o);
                ppjVar.m = ppjVar.h;
                if (ppjVar.q == 1.0f && min >= Integer.parseInt(this.b.continuedIsNotFarApartCloseThreshold)) {
                    if (ppjVar.t) {
                        ppjVar.t = false;
                    } else {
                        ppjVar.s = true;
                        ldf.d(FaceDetectionNet.BIZ_NAME, "has not far frame, close Detect");
                        this.f32800a.add(ppjVar.d);
                    }
                }
                if (min >= Integer.parseInt(this.b.continuedIsNotFarApartThreshold)) {
                    if (ppjVar.q != 1.0f) {
                        ppjVar.w++;
                    }
                    ppjVar.q = 1.0f;
                }
            }
            return ppjVar;
        }
        int i8 = ppjVar.h - ppjVar.n;
        ppjVar.o = ppjVar.h;
        ppjVar.m = ppjVar.h;
        if (i8 >= this.b.getDetectionContinuedFailCloseThreshold() && !ppjVar.t) {
            ppjVar.s = true;
            ldf.d(FaceDetectionNet.BIZ_NAME, "Too many failures, close Detect");
            this.f32800a.add(ppjVar.d);
        }
        if (i8 >= Integer.parseInt(this.b.detectionContinuedFailThreshold)) {
            if (ppjVar.q != 1.0f) {
                ppjVar.w++;
            }
            ppjVar.q = 1.0f;
        }
        return ppjVar;
    }

    public static float a(CopyOnWriteArrayList<Float> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31b3e85", new Object[]{copyOnWriteArrayList})).floatValue();
        }
        float f = 0.0f;
        Iterator<Float> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f += it.next().floatValue();
        }
        return f / copyOnWriteArrayList.size();
    }

    public static float a(CopyOnWriteArrayList<Float> copyOnWriteArrayList, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("604cfbbb", new Object[]{copyOnWriteArrayList, new Float(f)})).floatValue();
        }
        float f2 = 0.0f;
        Iterator<Float> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f2 = (float) (f2 + Math.pow(it.next().floatValue() - f, 2.0d));
        }
        return (float) Math.sqrt(f2 / copyOnWriteArrayList.size());
    }

    public static float[] b(CopyOnWriteArrayList<PointF> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("5fd62eed", new Object[]{copyOnWriteArrayList});
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return null;
        }
        int size = copyOnWriteArrayList.size();
        Iterator<PointF> it = copyOnWriteArrayList.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            PointF next = it.next();
            f2 += next.x;
            f3 += next.y;
        }
        float[] fArr = new float[4];
        float f4 = size;
        fArr[0] = f2 / f4;
        fArr[1] = f3 / f4;
        Iterator<PointF> it2 = copyOnWriteArrayList.iterator();
        float f5 = 0.0f;
        while (it2.hasNext()) {
            PointF next2 = it2.next();
            f = (float) (f + Math.pow(next2.x - fArr[0], 2.0d));
            f5 = (float) (f5 + Math.pow(next2.y - fArr[1], 2.0d));
        }
        fArr[2] = (float) Math.sqrt(f / f4);
        fArr[3] = (float) Math.sqrt(f5 / f4);
        return fArr;
    }
}
