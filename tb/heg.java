package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ab;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class heg extends hdz<List<Paster>> implements ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1266427922);
        kge.a(907183500);
    }

    public static /* synthetic */ Object ipc$super(heg hegVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f3f7e", new Object[]{this, paster});
            return;
        }
        q();
        List<Paster> a2 = a();
        a2.add(paster.mo940clone());
        g().a(a2);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(Paster paster, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba492345", new Object[]{this, paster, new Integer(i)});
            return;
        }
        List<Paster> a2 = t().a();
        if (a2 == null || i < 0 || a2.size() <= 0 || a2.size() <= i) {
            return;
        }
        q();
        a2.remove(i);
        a2.add(i, paster.mo940clone());
        g().a(a2);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        q();
        List<Paster> a2 = a();
        a2.clear();
        if (list == null) {
            list = new ArrayList<>();
        }
        for (Paster paster : list) {
            a2.add(paster.mo940clone());
        }
        g().a(a2);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public List<Paster> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : t().a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public List<Paster> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        List<Paster> c = c();
        if (c != null) {
            return new ArrayList(c);
        }
        return null;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void b(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa30add", new Object[]{this, paster});
            return;
        }
        List<Paster> a2 = t().a();
        if (a2 == null || a2.size() <= 0) {
            return;
        }
        a2.remove(paster);
        g().a(a2);
    }

    private List<Paster> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<Paster> a2 = t().a();
        return a2 == null ? new ArrayList() : a2;
    }
}
