package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.g;
import com.taobao.android.virtual_thread.stub.StubThreadLocal;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1569751573);
        kge.a(1789629085);
    }

    @Override // com.taobao.android.virtual_thread.face.g
    public <T> ThreadLocal<T> a(final g.a<? extends T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("7823d1eb", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return new StubThreadLocal();
        }
        return new StubThreadLocal<T>() { // from class: com.taobao.android.virtual_thread.face.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            @Override // com.taobao.android.virtual_thread.stub.StubThreadLocal, java.lang.ThreadLocal
            public T initialValue() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("2908671e", new Object[]{this}) : aVar.get();
            }
        };
    }
}
