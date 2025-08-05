package com.alibaba.ability.localization;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

/* loaded from: classes2.dex */
public final class Localization$localeChangeListeners$2 extends Lambda implements ruk<ConcurrentSkipListSet<b.a>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Localization$localeChangeListeners$2 INSTANCE = new Localization$localeChangeListeners$2();

    public Localization$localeChangeListeners$2() {
        super(0);
    }

    /* renamed from: com.alibaba.ability.localization.Localization$localeChangeListeners$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> implements Comparator<b.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // java.util.Comparator
        public /* synthetic */ int compare(b.a aVar, b.a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
        }

        public final int a(b.a aVar, b.a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("961ded5b", new Object[]{this, aVar, aVar2})).intValue();
            }
            if (!q.a(aVar, aVar2)) {
                return q.a(aVar.hashCode(), aVar2.hashCode());
            }
            return 0;
        }
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final ConcurrentSkipListSet<b.a> mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentSkipListSet) ipChange.ipc$dispatch("975c10f0", new Object[]{this}) : new ConcurrentSkipListSet<>(AnonymousClass1.INSTANCE);
    }
}
