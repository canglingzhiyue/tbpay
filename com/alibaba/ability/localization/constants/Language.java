package com.alibaba.ability.localization.constants;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public enum Language {
    SIMPLIFIED_CHINESE("zh", "CN", "zh_CN"),
    ENGLISH("en", "US", "en_US");
    
    public static final a Companion = new a(null);
    private final String country;
    private final String language;
    private final String tag;

    Language(String str, String str2, String str3) {
        this.language = str;
        this.country = str2;
        this.tag = str3;
    }

    @JvmStatic
    public static final Language cast2Enum(String str) {
        return Companion.a(str);
    }

    public final boolean compare$Localization_release(Locale locale) {
        return locale != null && StringUtils.equals(this.language, locale.getLanguage()) && StringUtils.equals(this.country, locale.getCountry());
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getTag() {
        return this.tag;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1512025200);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final Language a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Language) ipChange.ipc$dispatch("3fb7af1b", new Object[]{this, str});
            }
            if (q.a((Object) str, (Object) Language.ENGLISH.getTag())) {
                return Language.ENGLISH;
            }
            if (!q.a((Object) str, (Object) Language.SIMPLIFIED_CHINESE.getTag())) {
                return null;
            }
            return Language.SIMPLIFIED_CHINESE;
        }
    }
}
