package com.loc;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ea extends dz implements Serializable {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public ea() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    public ea(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        ea eaVar = new ea(this.h, this.i);
        eaVar.a(this);
        eaVar.j = this.j;
        eaVar.k = this.k;
        eaVar.l = this.l;
        eaVar.m = this.m;
        eaVar.n = this.n;
        return eaVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellCdma{sid=" + this.j + ", nid=" + this.k + ", bid=" + this.l + ", latitude=" + this.m + ", longitude=" + this.n + ", mcc='" + this.f7753a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
