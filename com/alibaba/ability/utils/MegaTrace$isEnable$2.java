package com.alibaba.ability.utils;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.gvt;
import tb.ruk;

/* loaded from: classes2.dex */
public final class MegaTrace$isEnable$2 extends Lambda implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MegaTrace$isEnable$2 INSTANCE = new MegaTrace$isEnable$2();

    public MegaTrace$isEnable$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        try {
            gvt.a();
            z = true;
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            z = false;
        }
        if (z) {
            b bVar = b.INSTANCE;
            if (b.$ipChange) {
                return 1;
            }
        }
        return null;
    }
}
