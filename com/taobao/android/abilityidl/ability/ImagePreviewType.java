package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
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
public @interface ImagePreviewType {
    public static final a Companion = a.f8690a;
    public static final String IMAGE = "IMAGE";
    public static final String VIDEO = "VIDEO";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String IMAGE = "IMAGE";
        public static final String VIDEO = "VIDEO";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8690a;

        static {
            kge.a(-212489399);
            f8690a = new a();
        }

        private a() {
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode == 69775675) {
                if (!str.equals("IMAGE")) {
                    return null;
                }
                return "IMAGE";
            } else if (hashCode != 81665115 || !str.equals("VIDEO")) {
                return null;
            } else {
                return "VIDEO";
            }
        }
    }
}
