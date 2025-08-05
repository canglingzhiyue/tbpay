package com.etao.feimagesearch.capture.scan;

import com.etao.feimagesearch.capture.scan.e;

/* loaded from: classes3.dex */
public interface IDecodeTask {
    public static final e.a Companion = e.a.f6590a;
    public static final String TAG_PREFIX = "_scancode_";

    /* loaded from: classes3.dex */
    public enum TaskStatus {
        NORMAL,
        TIMEOUT,
        CANCELLED
    }

    void a(TaskStatus taskStatus);

    boolean i();
}
