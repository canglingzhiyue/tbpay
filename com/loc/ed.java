package com.loc;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ed extends dz implements Serializable {
    public int j;
    public int k;
    public int l;
    public int m;

    public ed() {
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    public ed(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        ed edVar = new ed(this.h, this.i);
        edVar.a(this);
        edVar.j = this.j;
        edVar.k = this.k;
        edVar.l = this.l;
        edVar.m = this.m;
        return edVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellWcdma{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", uarfcn=" + this.m + ", mcc='" + this.f7753a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
