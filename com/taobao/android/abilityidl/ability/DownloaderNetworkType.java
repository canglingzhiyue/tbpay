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
public @interface DownloaderNetworkType {
    public static final String ANY = "ANY";
    public static final a Companion = a.f8651a;
    public static final String WIFI_ONLY = "WIFI_ONLY";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ANY = "ANY";
        public static final String WIFI_ONLY = "WIFI_ONLY";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8651a;

        static {
            kge.a(2002239969);
            f8651a = new a();
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
            if (hashCode == -77771114) {
                if (!str.equals("WIFI_ONLY")) {
                    return null;
                }
                return "WIFI_ONLY";
            } else if (hashCode != 64972 || !str.equals("ANY")) {
                return null;
            } else {
                return "ANY";
            }
        }
    }
}
