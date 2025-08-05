package com.taobao.phenix.cache.memory;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.pexode.animate.a f18877a;

    static {
        kge.a(523344705);
    }

    public a(com.taobao.pexode.animate.a aVar, String str, String str2, int i, int i2) {
        super(str, str2, i, i2);
        this.f18877a = aVar;
    }

    @Override // com.taobao.phenix.cache.memory.b
    public e a(String str, String str2, int i, int i2, boolean z, Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c285d26c", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z), resources}) : new com.taobao.phenix.animate.b(str, str2, i, i2, this.f18877a);
    }

    @Override // com.taobao.phenix.cache.memory.b
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        com.taobao.pexode.animate.a aVar = this.f18877a;
        if (aVar != null) {
            return aVar.getSizeInBytes();
        }
        return 0;
    }
}
