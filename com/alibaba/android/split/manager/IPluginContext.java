package com.alibaba.android.split.manager;

import java.io.File;

/* loaded from: classes2.dex */
public interface IPluginContext {

    /* loaded from: classes2.dex */
    public enum Status {
        UN_VERIFIED,
        VERIFIED,
        EMULATED,
        INSTALLED,
        LOADED,
        UPDATED
    }

    File a();

    void a(Status status);

    String b();

    boolean c();

    boolean d();
}
