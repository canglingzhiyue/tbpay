package com.taobao.android.msoa.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface MSOAServiceDefinition {

    /* renamed from: com.taobao.android.msoa.annotation.MSOAServiceDefinition$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14419a;
        public static final /* synthetic */ int[] b = new int[Platform.values().length];

        static {
            try {
                b[Platform.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Platform.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Platform.WEEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Platform.WINDVANE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14419a = new int[ProviderType.values().length];
            try {
                f14419a[ProviderType.BUNDLE_INTERFACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14419a[ProviderType.SERVICE_HUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14419a[ProviderType.AIDL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum Platform {
        ALL,
        NATIVE,
        WEEX,
        WINDVANE;

        public int value() {
            int i = AnonymousClass1.b[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 4;
                }
                if (i == 3) {
                    return 2;
                }
                if (i != 4) {
                    throw new IllegalArgumentException();
                }
                return 1;
            }
            return 7;
        }
    }

    /* loaded from: classes6.dex */
    public enum ProviderType {
        BUNDLE_INTERFACE,
        SERVICE_HUB,
        AIDL;

        @Override // java.lang.Enum
        public String toString() {
            int i = AnonymousClass1.f14419a[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "serviceHub";
                }
                if (i != 3) {
                    throw new IllegalArgumentException();
                }
                return "bindService";
            }
            return "bundleInterface";
        }
    }

    String action() default "";

    String bizName();

    Platform platform() default Platform.ALL;

    ProviderType providerType() default ProviderType.BUNDLE_INTERFACE;

    String serviceId();

    boolean timeout() default false;

    String version() default "1.0";
}
