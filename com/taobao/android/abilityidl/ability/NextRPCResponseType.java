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
public @interface NextRPCResponseType {
    public static final a Companion = a.f8715a;
    public static final String JSON = "JSON";
    public static final String ORIGINAL_JSON = "ORIGINAL_JSON";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String JSON = "JSON";
        public static final String ORIGINAL_JSON = "ORIGINAL_JSON";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8715a;

        static {
            kge.a(-1272353541);
            f8715a = new a();
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
            if (hashCode == 2286824) {
                if (!str.equals("JSON")) {
                    return null;
                }
                return "JSON";
            } else if (hashCode != 713924246 || !str.equals("ORIGINAL_JSON")) {
                return null;
            } else {
                return "ORIGINAL_JSON";
            }
        }
    }
}
