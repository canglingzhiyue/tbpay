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
public @interface MEMKVStorageError {
    public static final a Companion = a.f8700a;
    public static final String DATA_EXPIRED_OR_NOT_EXIST = "DATA_EXPIRED_OR_NOT_EXIST";
    public static final String INVALIDATED_TTL = "INVALIDATED_TTL";
    public static final String LRU_OVERSIZE = "LRU_OVERSIZE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String DATA_EXPIRED_OR_NOT_EXIST = "DATA_EXPIRED_OR_NOT_EXIST";
        public static final String INVALIDATED_TTL = "INVALIDATED_TTL";
        public static final String LRU_OVERSIZE = "LRU_OVERSIZE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8700a;

        static {
            kge.a(1221146299);
            f8700a = new a();
        }

        private a() {
        }
    }
}
