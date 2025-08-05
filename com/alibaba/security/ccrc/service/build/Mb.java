package com.alibaba.security.ccrc.service.build;

/* loaded from: classes3.dex */
public interface Mb {
    void registerPipe(Pb pb);

    void resetPipeData(Pb pb);

    void unregisterPipe(Pb pb);

    void writeData(Pb pb, String str);
}
