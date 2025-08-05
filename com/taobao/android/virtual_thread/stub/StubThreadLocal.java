package com.taobao.android.virtual_thread.stub;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.f;
import com.taobao.android.virtual_thread.stub.annotation.Exchange;
import tb.kge;

@Exchange({ThreadLocal.class, f.class})
/* loaded from: classes6.dex */
public class StubThreadLocal<T> extends ThreadLocal<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean isVirtual = true;
    private final f<T> virtualThreadLocal = new f<T>() { // from class: com.taobao.android.virtual_thread.stub.StubThreadLocal.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.f
        public T a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : (T) StubThreadLocal.this.initialValue();
        }
    };

    static {
        kge.a(169667184);
    }

    public static /* synthetic */ Object ipc$super(StubThreadLocal stubThreadLocal, String str, Object... objArr) {
        if (str.hashCode() == 688416542) {
            return super.initialValue();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.lang.ThreadLocal
    public T initialValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2908671e", new Object[]{this}) : (T) super.initialValue();
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : this.virtualThreadLocal.b();
    }

    @Override // java.lang.ThreadLocal
    public void set(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, t});
        } else {
            this.virtualThreadLocal.a(t);
        }
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
        } else {
            this.virtualThreadLocal.c();
        }
    }
}
