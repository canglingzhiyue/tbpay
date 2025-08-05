package com.alibaba.ability.impl.kvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsKVStorageAbility;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfoAndKeys;
import com.taobao.android.abilityidl.ability.cx;
import com.taobao.android.abilityidl.ability.cy;
import com.taobao.android.abilityidl.ability.cz;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class KVStorageAbility extends AbsKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f1902a = new b(false);

    static {
        kge.a(-434430430);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<Object, ErrorResult> clear(als context, cx params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3e743f2e", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8802a;
        q.b(str, "params.bizID");
        return bVar.a(context, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<List<String>, ErrorResult> getAllKeys(als context, cx params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5b45f53c", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8802a;
        q.b(str, "params.bizID");
        return bVar.b(context, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<KVStorageCurrentInfo, ErrorResult> getCurrentInfo(als context, cx params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4a2c4e6a", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8802a;
        q.b(str, "params.bizID");
        return bVar.c(context, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<KVStorageCurrentInfoAndKeys, ErrorResult> getCurrentInfoAndKeys(als context, cx params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5e26f5c1", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8802a;
        q.b(str, "params.bizID");
        return bVar.d(context, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<String, ErrorResult> getItem(als context, cy params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2601cc73", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8803a;
        q.b(str, "params.bizID");
        String str2 = params.b;
        q.b(str2, "params.key");
        return bVar.a(context, str, str2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<Object, ErrorResult> removeItem(als context, cy params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ec585f85", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8803a;
        q.b(str, "params.bizID");
        String str2 = params.b;
        q.b(str2, "params.key");
        return bVar.b(context, str, str2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public g<Object, ErrorResult> setItem(als context, cz params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4323cde8", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1902a;
        String str = params.f8804a;
        q.b(str, "params.bizID");
        String str2 = params.b;
        q.b(str2, "params.key");
        String str3 = params.c;
        q.b(str3, "params.value");
        return bVar.a(context, str, str2, str3);
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f1902a.a();
        }
    }
}
