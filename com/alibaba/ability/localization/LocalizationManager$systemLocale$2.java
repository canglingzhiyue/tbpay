package com.alibaba.ability.localization;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes2.dex */
public final class LocalizationManager$systemLocale$2 extends Lambda implements ruk<Locale> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LocalizationManager$systemLocale$2 INSTANCE = new LocalizationManager$systemLocale$2();

    public LocalizationManager$systemLocale$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Locale mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("43cf0a6c", new Object[]{this});
        }
        Locale locale = Locale.getDefault();
        return locale == null ? Locale.SIMPLIFIED_CHINESE : locale;
    }
}
