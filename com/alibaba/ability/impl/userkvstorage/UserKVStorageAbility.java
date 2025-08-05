package com.alibaba.ability.impl.userkvstorage;

import com.alibaba.ability.impl.kvstorage.b;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.UserKVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.ek;
import com.taobao.android.abilityidl.ability.el;
import com.taobao.android.abilityidl.ability.em;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class UserKVStorageAbility extends AbsUserKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f1967a = new b(true);

    static {
        kge.a(-1869894120);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public g<Object, ErrorResult> clear(als context, ek params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("54bf3b5f", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1967a;
        String str = params.f8843a;
        q.b(str, "params.bizID");
        return bVar.a(context, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public g<List<String>, ErrorResult> getAllKeys(als context, ek params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7190f16d", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1967a;
        String str = params.f8843a;
        q.b(str, "params.bizID");
        return bVar.b(context, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public g<UserKVStorageCurrentInfo, ErrorResult> getCurrentInfo(als context, ek params) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("60774a9b", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1967a;
        String str = params.f8843a;
        q.b(str, "params.bizID");
        g<KVStorageCurrentInfo, ErrorResult> c = bVar.c(context, str);
        UserKVStorageCurrentInfo userKVStorageCurrentInfo = new UserKVStorageCurrentInfo();
        KVStorageCurrentInfo a2 = c.a();
        userKVStorageCurrentInfo.freeSize = a2 != null ? a2.freeSize : 0;
        KVStorageCurrentInfo a3 = c.a();
        if (a3 != null) {
            i = a3.totalSize;
        }
        userKVStorageCurrentInfo.totalSize = i;
        t tVar = t.INSTANCE;
        return new g<>(userKVStorageCurrentInfo, c.b());
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public g<String, ErrorResult> getItem(als context, el params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3c4cc8a4", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1967a;
        String str = params.f8844a;
        q.b(str, "params.bizID");
        String str2 = params.b;
        q.b(str2, "params.key");
        return bVar.a(context, str, str2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public g<Object, ErrorResult> removeItem(als context, el params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2a35bb6", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1967a;
        String str = params.f8844a;
        q.b(str, "params.bizID");
        String str2 = params.b;
        q.b(str2, "params.key");
        return bVar.b(context, str, str2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public g<Object, ErrorResult> setItem(als context, em params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("596eca19", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b bVar = this.f1967a;
        String str = params.f8845a;
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
            this.f1967a.a();
        }
    }
}
