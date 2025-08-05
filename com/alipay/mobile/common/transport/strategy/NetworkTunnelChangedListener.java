package com.alipay.mobile.common.transport.strategy;

import java.util.Observable;
import java.util.Observer;

/* loaded from: classes3.dex */
public interface NetworkTunnelChangedListener extends Observer {
    @Override // java.util.Observer
    void update(Observable observable, Object obj);
}
