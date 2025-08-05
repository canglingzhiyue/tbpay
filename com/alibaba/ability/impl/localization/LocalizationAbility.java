package com.alibaba.ability.impl.localization;

import android.content.Context;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.localization.constants.Location;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLocalizationAbility;
import com.taobao.android.abilityidl.ability.bz;
import com.taobao.android.abilityidl.ability.da;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class LocalizationAbility extends AbsLocalizationAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(130506020);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public g<String, ErrorResult> getLanguage(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("fc619e0d", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Language a2 = b.a();
        q.b(a2, "Localization.getLanguage()");
        return new g<>(a2.getTag(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public g<String, ErrorResult> getLocation(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a9c65e50", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(b.d(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public void setLocale(als abilityContext, da params, bz events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a036c9e0", new Object[]{this, abilityContext, params, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (f == null) {
            events.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        Language cast2Enum = Language.cast2Enum(params.f8806a);
        if (cast2Enum != null) {
            q.b(cast2Enum, "Language.cast2Enum(param…         return\n        }");
            Location cast2Enum2 = Location.cast2Enum(params.b);
            if (cast2Enum2 != null) {
                q.b(cast2Enum2, "Location.cast2Enum(param…         return\n        }");
                b.a(cast2Enum, cast2Enum2);
                com.taobao.android.editionswitcher.b.b(f, params.b);
                events.a();
                return;
            }
            events.a(a$a.Companion.b("param location invalid"));
            return;
        }
        events.a(a$a.Companion.b("param language invalid"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public g<Boolean, ErrorResult> isCnSite(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ef6bda7f", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(Boolean.valueOf(b.f()), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public g<Boolean, ErrorResult> isI18nEdition(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("cb4271a5", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(Boolean.valueOf(b.c()), null, 2, null);
    }
}
