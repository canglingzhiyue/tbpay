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
public @interface GlobalMenuSupportModifyItemType {
    public static final a Companion = a.f8685a;
    public static final String feedback = "feedback";
    public static final String help = "help";
    public static final String report = "report";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8685a;
        public static final String feedback = "feedback";
        public static final String help = "help";
        public static final String report = "report";

        static {
            kge.a(1780641794);
            f8685a = new a();
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
            if (hashCode == -934521548) {
                if (!str.equals("report")) {
                    return null;
                }
                return "report";
            } else if (hashCode == -191501435) {
                if (!str.equals("feedback")) {
                    return null;
                }
                return "feedback";
            } else if (hashCode != 3198785 || !str.equals("help")) {
                return null;
            } else {
                return "help";
            }
        }
    }
}
