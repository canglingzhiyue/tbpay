package com.alibaba.ability.inject;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import kotlin.Metadata;
import tb.dlw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/alibaba/ability/inject/TBSwitcherImpl;", "Lcom/alibaba/ability/inject/ISwitcher;", "()V", "enableParametersLog", "", "getMainThreadAbilities", "", "", "getMainThreadApis", "isConnectedAppDevTools", "open_ability_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class f implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.ability.inject.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : dlw.b();
    }

    @Override // com.alibaba.ability.inject.c
    public Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : com.alibaba.ability.utils.a.INSTANCE.a();
    }

    @Override // com.alibaba.ability.inject.c
    public Set<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this}) : com.alibaba.ability.utils.a.INSTANCE.b();
    }

    @Override // com.alibaba.ability.inject.c
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : com.alibaba.ability.utils.a.INSTANCE.c();
    }
}
