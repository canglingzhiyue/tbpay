package com.taobao.themis.open.ability.audio;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class MegaPlayerInstance$setSrc$1 extends MutablePropertyReference0Impl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MegaPlayerInstance$setSrc$1(MegaPlayerInstance megaPlayerInstance) {
        super(megaPlayerInstance, MegaPlayerInstance.class, "mSrc", "getMSrc()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.l
    public Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : MegaPlayerInstance.a((MegaPlayerInstance) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, obj});
        } else {
            MegaPlayerInstance.a((MegaPlayerInstance) this.receiver, (String) obj);
        }
    }
}
