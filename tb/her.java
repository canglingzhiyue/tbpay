package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.b;

/* loaded from: classes5.dex */
public class her<T> implements hes<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b<T> f28577a;

    static {
        kge.a(1950256481);
        kge.a(1729247049);
    }

    public her(b<T> bVar) {
        this.f28577a = bVar;
    }

    @Override // tb.hes
    public b<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2167b599", new Object[]{this}) : this.f28577a;
    }

    @Override // tb.hes
    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.f28577a.a((b<T>) t);
        }
    }
}
