package org.android.netutil;

/* loaded from: classes.dex */
public abstract class NetListener {
    public long native_ptr = 0;
    public NetListenerType netListenerType;

    public NetListener(NetListenerType netListenerType) {
        this.netListenerType = netListenerType;
    }
}
