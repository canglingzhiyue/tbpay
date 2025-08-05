package com.taobao.umipublish.extension.windvane.abilities;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.b;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"createAbility", "Lcom/taobao/umipublish/extension/windvane/abilities/BaseAbility;", "abilityClass", "Ljava/lang/Class;", "Lcom/taobao/umipublish/extension/windvane/abilities/IAbility;", "umipublish_extends_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class AbilityUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1721034341);
    }

    public static final BaseAbility a(Class<? extends IAbility> abilityClass) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("fbab5d5", new Object[]{abilityClass});
        } else {
            q.d(abilityClass, "abilityClass");
            a2 = b.a(abilityClass, new Object[0]);
        }
        return (BaseAbility) a2;
    }
}
