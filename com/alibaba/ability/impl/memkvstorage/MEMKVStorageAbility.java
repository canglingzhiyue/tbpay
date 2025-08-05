package com.alibaba.ability.impl.memkvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility;
import com.taobao.android.abilityidl.ability.dc;
import com.taobao.android.abilityidl.ability.dd;
import com.taobao.android.abilityidl.ability.de;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class MEMKVStorageAbility extends AbsMEMKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(582015492);
    }

    public static /* synthetic */ Object ipc$super(MEMKVStorageAbility mEMKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public void setItem(als p0, dd p1, gml p2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f051623", new Object[]{this, p0, p1, p2});
            return;
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        q.d(p2, "p2");
        long j = p1.f8809a;
        String str = p1.c;
        q.b(str, "p1.value");
        if (a(j, str)) {
            p2.a(new ErrorResult("LRU_OVERSIZE", "单条数据不能超过 1M", (Map) null, 4, (o) null));
            return;
        }
        b bVar = b.INSTANCE;
        String str2 = p1.b;
        q.b(str2, "p1.key");
        String str3 = p1.c;
        q.b(str3, "p1.value");
        if (bVar.a(str2, str3, p1.f8809a, p1.d)) {
            return;
        }
        p2.a(new ErrorResult("INVALIDATED_TTL", "TTL 须大于 0", (Map) null, 4, (o) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public g<String, ErrorResult> getItem(als p0, dc p1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9297687c", new Object[]{this, p0, p1});
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        b bVar = b.INSTANCE;
        String str = p1.f8808a;
        q.b(str, "p1.key");
        Object a2 = b.a(bVar, str, false, 2, null);
        if (a2 == null) {
            return new g<>(null, new ErrorResult("DATA_EXPIRED_OR_NOT_EXIST", "设置失效，数据已过期或不存在", (Map) null, 4, (o) null));
        }
        return new g<>(a2.toString(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public void removeItem(als p0, dc p1, gml p2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22101c66", new Object[]{this, p0, p1, p2});
            return;
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        q.d(p2, "p2");
        b bVar = b.INSTANCE;
        String str = p1.f8808a;
        q.b(str, "p1.key");
        bVar.c(str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public void setItemTTL(als p0, de p1, gml p2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b85084", new Object[]{this, p0, p1, p2});
            return;
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        q.d(p2, "p2");
        long j = p1.f8810a;
        b bVar = b.INSTANCE;
        String str2 = p1.b;
        q.b(str2, "p1.key");
        Object a2 = bVar.a(str2, true);
        if (a2 == null || (str = a2.toString()) == null) {
            str = "";
        }
        if (a(j, str)) {
            p2.a(new ErrorResult("LRU_OVERSIZE", "单条数据不能超过 1M", (Map) null, 4, (o) null));
            return;
        }
        b bVar2 = b.INSTANCE;
        String str3 = p1.b;
        q.b(str3, "p1.key");
        if (bVar2.a(str3, p1.f8810a)) {
            return;
        }
        p2.a(new ErrorResult("INVALIDATED_TTL", "TTL 须大于 0", (Map) null, 4, (o) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public g<Long, ErrorResult> getItemTTL(als p0, dc p1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1e225822", new Object[]{this, p0, p1});
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        b bVar = b.INSTANCE;
        String str = p1.f8808a;
        q.b(str, "p1.key");
        return new g<>(Long.valueOf(bVar.d(str)), null, 2, null);
    }

    private final boolean a(long j, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d8a222a", new Object[]{this, new Long(j), str})).booleanValue() : b.INSTANCE.a(j) && b.INSTANCE.a(str) > 1048576;
    }
}
