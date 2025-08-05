package com.alibaba.ability.impl.memkvstorage;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes2.dex */
public final class MemStorage$lruMap$2 extends Lambda implements ruk<AnonymousClass1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemStorage$lruMap$2(b bVar) {
        super(0);
        this.this$0 = bVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.alibaba.ability.impl.memkvstorage.MemStorage$lruMap$2$1] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final AnonymousClass1 mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnonymousClass1) ipChange.ipc$dispatch("b5c93bd5", new Object[]{this}) : new LruCache<String, Object>(1048576) { // from class: com.alibaba.ability.impl.memkvstorage.MemStorage$lruMap$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.util.LruCache
            public /* synthetic */ int sizeOf(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("33c6036a", new Object[]{this, str, obj})).intValue() : a(str, obj);
            }

            public int a(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("8bb65381", new Object[]{this, str, obj})).intValue() : b.INSTANCE.a(String.valueOf(obj));
            }
        };
    }
}
