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
public @interface ContainerRendererMode {
    public static final a Companion = a.f8646a;
    public static final String dx = "dx";
    public static final String fcanvas = "fcanvas";
    public static final String web = "web";
    public static final String weex = "weex";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8646a;
        public static final String dx = "dx";
        public static final String fcanvas = "fcanvas";
        public static final String web = "web";
        public static final String weex = "weex";

        static {
            kge.a(1775152373);
            f8646a = new a();
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
            if (hashCode == -1036644034) {
                if (!str.equals("fcanvas")) {
                    return null;
                }
                return "fcanvas";
            } else if (hashCode == 3220) {
                if (!str.equals("dx")) {
                    return null;
                }
                return "dx";
            } else if (hashCode == 117588) {
                if (!str.equals("web")) {
                    return null;
                }
                return "web";
            } else if (hashCode != 3645441 || !str.equals("weex")) {
                return null;
            } else {
                return "weex";
            }
        }
    }
}
