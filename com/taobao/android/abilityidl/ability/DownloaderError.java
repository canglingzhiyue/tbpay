package com.taobao.android.abilityidl.ability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.kge;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes4.dex */
public @interface DownloaderError {
    public static final a Companion = a.f8650a;
    public static final String FILE_MD5_ERROR = "FILE_MD5_ERROR";
    public static final String FILE_SIZE_ERROR = "FILE_SIZE_ERROR";
    public static final String NETWORK_ERROR = "NETWORK_ERROR";
    public static final String OUT_OF_SPACE = "OUT_OF_SPACE";
    public static final String SINGLE_FILE_OUT_OF_SPACE = "SINGLE_FILE_OUT_OF_SPACE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String FILE_MD5_ERROR = "FILE_MD5_ERROR";
        public static final String FILE_SIZE_ERROR = "FILE_SIZE_ERROR";
        public static final String NETWORK_ERROR = "NETWORK_ERROR";
        public static final String OUT_OF_SPACE = "OUT_OF_SPACE";
        public static final String SINGLE_FILE_OUT_OF_SPACE = "SINGLE_FILE_OUT_OF_SPACE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8650a;

        static {
            kge.a(-600523231);
            f8650a = new a();
        }

        private a() {
        }
    }
}
