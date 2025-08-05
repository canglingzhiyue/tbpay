package com.alibaba.android.umf.node.service;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.b;
import tb.bpx;
import tb.bqg;

/* loaded from: classes2.dex */
public interface IUMFService<INPUT extends UMFBaseIO, OUTPUT extends UMFBaseIO> {
    void onAfterExecute(OUTPUT output, b bVar);

    void onBeforeExecute(INPUT input, b bVar);

    void onCreate();

    void onDestroy();

    void onExecute(INPUT input, b bVar, bpx<OUTPUT> bpxVar);

    @Deprecated
    void registerExtension(String str, String str2, int i, bqg bqgVar, Class<? extends bqg> cls);
}
