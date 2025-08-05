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
public @interface ScanCodeScanType {
    public static final String ALL = "ALL";
    public static final String BARCODE = "BARCODE";
    public static final a Companion = a.f8730a;
    public static final String QRCODE = "QRCODE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ALL = "ALL";
        public static final String BARCODE = "BARCODE";
        public static final String QRCODE = "QRCODE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8730a;

        static {
            kge.a(1850277763);
            f8730a = new a();
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
            if (hashCode == -1898203250) {
                if (!str.equals("QRCODE")) {
                    return null;
                }
                return "QRCODE";
            } else if (hashCode != 64897) {
                if (hashCode != 384398432 || !str.equals("BARCODE")) {
                    return null;
                }
                return "BARCODE";
            } else if (!str.equals("ALL")) {
                return null;
            } else {
                return "ALL";
            }
        }
    }
}
