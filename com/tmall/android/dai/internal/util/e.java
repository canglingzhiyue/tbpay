package com.tmall.android.dai.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class e implements com.taobao.mrt.task.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f23714a = false;

    static {
        kge.a(-1262791317);
        kge.a(818017447);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f23714a;
    }

    @Override // com.taobao.mrt.task.h
    public MRTRuntimeException a(String str, Object obj) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (MRTRuntimeException) ipChange.ipc$dispatch("e3ceb210", new Object[]{this, str, obj});
        }
        if (obj == null || !(obj instanceof List)) {
            return new MRTRuntimeException(302, "result type check failed");
        }
        List list = (List) obj;
        if (list.size() != 2) {
            return new MRTRuntimeException(302, "result size check failed");
        }
        Object obj2 = list.get(0);
        if (obj2 == null || (!((z = obj2 instanceof Boolean)) && !(obj2 instanceof Integer))) {
            return new MRTRuntimeException(302, "ret type check failed");
        }
        if (z) {
            z2 = ((Boolean) obj2).booleanValue();
        } else if ((obj2 instanceof Integer) && ((Integer) obj2).intValue() > 0) {
            z2 = true;
        }
        this.f23714a = z2;
        if (z2) {
            return null;
        }
        return new MRTRuntimeException(302, "ret check failed");
    }
}
