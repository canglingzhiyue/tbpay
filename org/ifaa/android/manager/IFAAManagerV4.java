package org.ifaa.android.manager;

/* loaded from: classes9.dex */
public abstract class IFAAManagerV4 extends IFAAManagerV3 {
    public abstract int getEnabled(int i);

    public abstract int[] getIDList(int i);

    @Override // org.ifaa.android.manager.IFAAManager
    public int getVersion() {
        return 4;
    }
}
