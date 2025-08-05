package com.loc;

import com.amap.api.location.AMapLocation;

/* loaded from: classes4.dex */
public final class ev {

    /* renamed from: a  reason: collision with root package name */
    ew f7775a = null;
    long b = 0;
    long c = 0;
    private boolean h = true;
    int d = 0;
    long e = 0;
    AMapLocation f = null;
    long g = 0;

    private ew b(ew ewVar) {
        int i;
        if (fy.a(ewVar)) {
            if (!this.h || !fq.a(ewVar.getTime())) {
                i = this.d;
            } else if (ewVar.getLocationType() == 5 || ewVar.getLocationType() == 6) {
                i = 4;
            }
            ewVar.setLocationType(i);
        }
        return ewVar;
    }

    public final AMapLocation a(AMapLocation aMapLocation) {
        if (!fy.a(aMapLocation)) {
            return aMapLocation;
        }
        long b = fy.b() - this.g;
        this.g = fy.b();
        if (b > 5000) {
            return aMapLocation;
        }
        AMapLocation aMapLocation2 = this.f;
        if (aMapLocation2 == null) {
            this.f = aMapLocation;
            return aMapLocation;
        } else if (1 != aMapLocation2.getLocationType() && !"gps".equalsIgnoreCase(this.f.getProvider())) {
            this.f = aMapLocation;
            return aMapLocation;
        } else if (this.f.getAltitude() == aMapLocation.getAltitude() && this.f.getLongitude() == aMapLocation.getLongitude()) {
            this.f = aMapLocation;
            return aMapLocation;
        } else {
            long abs = Math.abs(aMapLocation.getTime() - this.f.getTime());
            if (30000 < abs) {
                this.f = aMapLocation;
                return aMapLocation;
            } else if (fy.a(aMapLocation, this.f) > (((this.f.getSpeed() + aMapLocation.getSpeed()) * ((float) abs)) / 2000.0f) + ((this.f.getAccuracy() + aMapLocation.getAccuracy()) * 2.0f) + 3000.0f) {
                return this.f;
            } else {
                this.f = aMapLocation;
                return aMapLocation;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x011c, code lost:
        if (r11 < 30000) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
        if ((r9 - r2) > 30000) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(com.loc.ew r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ev.a(com.loc.ew):com.loc.ew");
    }

    public final void a() {
        this.f7775a = null;
        this.b = 0L;
        this.c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final void a(boolean z) {
        this.h = z;
    }
}
