package com.loc;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ec extends dz implements Serializable {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public ec() {
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    public ec(boolean z) {
        super(z, true);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        ec ecVar = new ec(this.h);
        ecVar.a(this);
        ecVar.j = this.j;
        ecVar.k = this.k;
        ecVar.l = this.l;
        ecVar.m = this.m;
        ecVar.n = this.n;
        return ecVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellLte{tac=" + this.j + ", ci=" + this.k + ", pci=" + this.l + ", earfcn=" + this.m + ", timingAdvance=" + this.n + ", mcc='" + this.f7753a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
