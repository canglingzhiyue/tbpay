package com.alibaba.ability.result;

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
/* loaded from: classes2.dex */
public @interface MegaStatusCode {
    public static final int ABILITY_NOT_FOUND = 404;
    public static final int API_NOT_FOUND = 405;
    public static final int BIZ_ERROR = 1000;
    public static final int BIZ_EXP = 499;
    public static final int CALL_ON_DESTROYED = 198;
    public static final int CALL_ON_MAIN = 201;
    public static final int CALL_ON_NON_MAIN = 200;
    public static final int CONTAINER_EXTENSION_NOT_FOUND = 102;
    public static final int CONTAINER_INSTANCE_NOT_FOUND = 100;
    public static final int CONTAINER_PAGE_NOT_FOUND = 101;
    public static final a Companion = a.f1983a;
    public static final int EXECUTING = 1;
    public static final int FINISH = 99;
    public static final int FORBIDDEN = 403;
    public static final int INSTANCE_DUPLICATED = 407;
    public static final int INSTANCE_NOT_CREATED = 406;
    public static final int INSTANCE_NO_BINDING_ID = 408;
    public static final int MEGA_EXP = 199;
    public static final int NONE = 2;
    public static final int PARAMS_INVALID = 500;
    public static final int SUCCESS = 0;

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ABILITY_NOT_FOUND = 404;
        public static final int API_NOT_FOUND = 405;
        public static final int BIZ_ERROR = 1000;
        public static final int BIZ_EXP = 499;
        public static final int CALL_ON_DESTROYED = 198;
        public static final int CALL_ON_MAIN = 201;
        public static final int CALL_ON_NON_MAIN = 200;
        public static final int CONTAINER_EXTENSION_NOT_FOUND = 102;
        public static final int CONTAINER_INSTANCE_NOT_FOUND = 100;
        public static final int CONTAINER_PAGE_NOT_FOUND = 101;
        public static final int EXECUTING = 1;
        public static final int FINISH = 99;
        public static final int FORBIDDEN = 403;
        public static final int INSTANCE_DUPLICATED = 407;
        public static final int INSTANCE_NOT_CREATED = 406;
        public static final int INSTANCE_NO_BINDING_ID = 408;
        public static final int MEGA_EXP = 199;
        public static final int NONE = 2;
        public static final int PARAMS_INVALID = 500;
        public static final int SUCCESS = 0;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1983a;

        public final String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
            }
            if (i == 499) {
                return "BIZ_EXP";
            }
            if (i == 500) {
                return "PARAMS_INVALID";
            }
            switch (i) {
                case 100:
                    return "CONTAINER_INSTANCE_NOT_FOUND";
                case 101:
                    return "CONTAINER_PAGE_NOT_FOUND";
                case 102:
                    return "CONTAINER_EXTENSION_NOT_FOUND";
                default:
                    switch (i) {
                        case 198:
                            return "CALL_ON_DESTROYED";
                        case 199:
                            return "MEGA_EXP";
                        case 200:
                            return "CALL_ON_NON_MAIN";
                        case 201:
                            return "CALL_ON_MAIN";
                        default:
                            switch (i) {
                                case 403:
                                    return "FORBIDDEN";
                                case 404:
                                    return "ABILITY_NOT_FOUND";
                                case 405:
                                    return "API_NOT_FOUND";
                                default:
                                    return "UNKNOWN";
                            }
                    }
            }
        }

        static {
            kge.a(-94147131);
            f1983a = new a();
        }

        private a() {
        }
    }
}
