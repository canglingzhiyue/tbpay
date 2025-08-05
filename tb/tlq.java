package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/pub/task/PubAPICheckedList;", "", "()V", "checkedAPIList", "", "", "add", "", "apiName", "contains", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f34197a = new CopyOnWriteArrayList();

    static {
        kge.a(488030086);
    }

    public final void a(String apiName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, apiName});
            return;
        }
        q.d(apiName, "apiName");
        this.f34197a.add(apiName);
    }

    public final boolean b(String apiName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, apiName})).booleanValue();
        }
        q.d(apiName, "apiName");
        return this.f34197a.contains(apiName);
    }
}
