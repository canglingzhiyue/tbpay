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
public @interface ImagePreviewError {
    public static final a Companion = a.f8689a;
    public static final String INDEX_OUT_OF_RANGE = "INDEX_OUT_OF_RANGE";
    public static final String MISS_IMAGE_URL = "MISS_IMAGE_URL";
    public static final String MISS_VIDEO_PLAYER_CONFIG = "MISS_VIDEO_PLAYER_CONFIG";
    public static final String MISS_VIDEO_URL = "MISS_VIDEO_URL";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String INDEX_OUT_OF_RANGE = "INDEX_OUT_OF_RANGE";
        public static final String MISS_IMAGE_URL = "MISS_IMAGE_URL";
        public static final String MISS_VIDEO_PLAYER_CONFIG = "MISS_VIDEO_PLAYER_CONFIG";
        public static final String MISS_VIDEO_URL = "MISS_VIDEO_URL";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8689a;

        static {
            kge.a(-949712151);
            f8689a = new a();
        }

        private a() {
        }
    }
}
