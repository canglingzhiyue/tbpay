package com.taobao.android.upp;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.e;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends WeakReference<e.b> implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(415506894);
        kge.a(1583970229);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 1666372597) {
            return super.get();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.upp.a
    public /* synthetic */ e.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.b) ipChange.ipc$dispatch("bbeece07", new Object[]{this}) : (e.b) super.get();
    }

    public d(e.b bVar) {
        super(bVar);
    }
}
