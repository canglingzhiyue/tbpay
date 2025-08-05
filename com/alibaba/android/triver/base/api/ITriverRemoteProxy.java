package com.alibaba.android.triver.base.api;

import android.content.Context;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.triver.base.taobao.TriverRemoteManager")
/* loaded from: classes2.dex */
public interface ITriverRemoteProxy extends Proxiable {

    /* loaded from: classes2.dex */
    public enum DependenceMode {
        TRIVER_ONLY,
        TRIVER_AND_UC,
        UC_ONLY,
        AMAP
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i);
    }

    boolean hasInstalled(DependenceMode dependenceMode);

    boolean hasInstalled(DependenceMode dependenceMode, Context context);

    void install(String str, String str2, DependenceMode dependenceMode, Context context, a aVar);

    void install(String str, String str2, DependenceMode dependenceMode, Context context, a aVar, b bVar);

    void installWithRemoUI(String str, String str2, DependenceMode dependenceMode, Context context, a aVar);

    void installWithRemoUI(String str, String str2, boolean z, DependenceMode dependenceMode, Context context, a aVar);
}
