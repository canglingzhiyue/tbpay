package com.etao.feimagesearch.structure.capture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import tb.kge;

@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes3.dex */
public @interface PltLifecycleState {
    public static final int CREATED = 1;
    public static final a Companion = a.f6986a;
    public static final int DESTROYED = 5;
    public static final int PAUSED = 3;
    public static final int RESUMED = 2;
    public static final int STOPPED = 4;

    /* loaded from: classes3.dex */
    public static final class a {
        public static final int CREATED = 1;
        public static final int DESTROYED = 5;
        public static final int PAUSED = 3;
        public static final int RESUMED = 2;
        public static final int STOPPED = 4;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f6986a;

        static {
            kge.a(-1302274925);
            f6986a = new a();
        }

        private a() {
        }
    }
}
