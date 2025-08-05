package com.taobao.phenix.loader.network;

import java.util.Map;
import java.util.concurrent.Future;
import tb.njf;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes7.dex */
    public interface a {
        void a(Exception exc);

        void a(njf njfVar);

        void a(njf njfVar, boolean z, boolean z2);
    }

    Future<?> a(String str, Map<String, String> map, a aVar);

    void a(int i);

    void b(int i);
}
