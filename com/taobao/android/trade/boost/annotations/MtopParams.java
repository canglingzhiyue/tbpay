package com.taobao.android.trade.boost.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface MtopParams {

    /* renamed from: com.taobao.android.trade.boost.annotations.MtopParams$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15589a;
        public static final /* synthetic */ int[] b = new int[UnitStrategy.values().length];

        static {
            try {
                b[UnitStrategy.UNIT_TRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[UnitStrategy.UNIT_GUIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[UnitStrategy.UNIT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15589a = new int[RequestMethod.values().length];
            try {
                f15589a[RequestMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15589a[RequestMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum RequestMethod {
        GET,
        POST;

        @Override // java.lang.Enum
        public String toString() {
            int i = AnonymousClass1.f15589a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalArgumentException();
                }
                return "POST";
            }
            return "GET";
        }
    }

    /* loaded from: classes6.dex */
    public enum UnitStrategy {
        UNIT_TRADE,
        UNIT_GUIDE,
        UNIT_NULL;

        @Override // java.lang.Enum
        public String toString() {
            int i = AnonymousClass1.b[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "UNIT_GUIDE";
                }
                if (i != 3) {
                    throw new IllegalArgumentException();
                }
                return "";
            }
            return "UNIT_TRADE";
        }
    }

    String apiName();

    String apiVersion();

    String clientName() default "";

    boolean needEcode() default false;

    boolean needSession() default false;

    RequestMethod requestMethod() default RequestMethod.GET;

    UnitStrategy unitStrategy() default UnitStrategy.UNIT_NULL;

    boolean useWua() default false;
}
