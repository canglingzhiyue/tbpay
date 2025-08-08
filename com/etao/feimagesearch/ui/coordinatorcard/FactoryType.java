package com.etao.feimagesearch.ui.coordinatorcard;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class FactoryType {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final FactoryType INSTANCE;
    public static final String TYPE_INVALID = "invalid";
    public static final String TYPE_MUISE = "ms";
    public static final String TYPE_NATIVE = "nt";

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TypeAnno {
    }

    static {
        kge.a(1962071657);
        INSTANCE = new FactoryType();
    }

    private FactoryType() {
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return TYPE_INVALID;
        }
        String str2 = str;
        if (StringUtils.isEmpty(str2)) {
            return TYPE_INVALID;
        }
        String str3 = (String) n.b((CharSequence) str2, new String[]{"_"}, false, 0, 6, (Object) null).get(0);
        int hashCode = str3.hashCode();
        if (hashCode == 3494) {
            if (str3.equals("ms")) {
                return "ms";
            }
        } else if (hashCode == 3526 && str3.equals("nt")) {
            return "nt";
        }
        return TYPE_INVALID;
    }
}
