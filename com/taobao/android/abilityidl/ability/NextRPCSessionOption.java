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
public @interface NextRPCSessionOption {
    public static final String AUTO_LOGIN_AND_MANUAL_LOGIN = "AUTO_LOGIN_AND_MANUAL_LOGIN";
    public static final String AUTO_LOGIN_ONLY = "AUTO_LOGIN_ONLY";
    public static final a Companion = a.f8716a;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String AUTO_LOGIN_AND_MANUAL_LOGIN = "AUTO_LOGIN_AND_MANUAL_LOGIN";
        public static final String AUTO_LOGIN_ONLY = "AUTO_LOGIN_ONLY";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8716a;

        static {
            kge.a(1145156315);
            f8716a = new a();
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
            if (hashCode != 206721502) {
                if (hashCode != 1770548082 || !str.equals("AUTO_LOGIN_ONLY")) {
                    return null;
                }
                return "AUTO_LOGIN_ONLY";
            } else if (!str.equals("AUTO_LOGIN_AND_MANUAL_LOGIN")) {
                return null;
            } else {
                return "AUTO_LOGIN_AND_MANUAL_LOGIN";
            }
        }
    }
}
