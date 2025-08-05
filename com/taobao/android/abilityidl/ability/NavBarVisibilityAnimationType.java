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
public @interface NavBarVisibilityAnimationType {
    public static final String ALPHA = "ALPHA";
    public static final a Companion = a.f8704a;
    public static final String OTHER = "OTHER";
    public static final String TRANLSATE = "TRANLSATE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ALPHA = "ALPHA";
        public static final String OTHER = "OTHER";
        public static final String TRANLSATE = "TRANLSATE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8704a;

        static {
            kge.a(-1782118038);
            f8704a = new a();
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
            if (hashCode == -461796544) {
                if (!str.equals("TRANLSATE")) {
                    return null;
                }
                return "TRANLSATE";
            } else if (hashCode == 62372158) {
                if (!str.equals("ALPHA")) {
                    return null;
                }
                return "ALPHA";
            } else if (hashCode != 75532016 || !str.equals("OTHER")) {
                return null;
            } else {
                return "OTHER";
            }
        }
    }
}
