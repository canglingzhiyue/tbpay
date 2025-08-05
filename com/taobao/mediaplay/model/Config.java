package com.taobao.mediaplay.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class Config implements Serializable {
    public boolean p2p = false;
    public boolean svc = false;
    public int playerBuffer = -1;
    public boolean audio = false;

    static {
        kge.a(-1628549486);
        kge.a(1028243835);
    }
}
