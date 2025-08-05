package com.alipay.zoloz.toyger.extservice.record;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TimeRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static TimeRecord f6275a = new TimeRecord();
    private long c;
    private long h;
    private long i;
    private long j;
    private long b = -1;
    private long d = -1;
    private long e = -1;
    private long f = -1;
    private long g = -1;

    public static TimeRecord getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeRecord) ipChange.ipc$dispatch("10008bd", new Object[0]) : f6275a;
    }

    public long getEntrySdkTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7e29ac6", new Object[]{this})).longValue() : this.b;
    }

    public void setEntrySdkTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300742a6", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public long getEnterDetectionTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc94bd6b", new Object[]{this})).longValue() : this.c;
    }

    public void setEnterDetectionTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec334da1", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public long getEnterDetectionEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fac30f40", new Object[]{this})).longValue() : this.d;
    }

    public void setEnterDetectionEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e0704", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public long getAlgoInitTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68bef361", new Object[]{this})).longValue() : this.e;
    }

    public void setAlgoInitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab5fd6b", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public long getImageCaptureStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97d578e9", new Object[]{this})).longValue() : this.f;
    }

    public void setImageCaptureStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5298d27b", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public long getFaceImageDetectEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b956ab8", new Object[]{this})).longValue() : this.g;
    }

    public void setFaceImageDetectEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f306ff4", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public long getUploadStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2eded793", new Object[]{this})).longValue() : this.h;
    }

    public void setUploadStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274fc211", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public long getLivebodyEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97f2b61f", new Object[]{this})).longValue() : this.i;
    }

    public void setLivebodyEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7b505", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public long getInitAlgStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("555c8b4", new Object[]{this})).longValue() : this.j;
    }

    public void setInitAlgStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75767878", new Object[]{this, new Long(j)});
        } else {
            this.j = j;
        }
    }
}
