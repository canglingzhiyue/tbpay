package tb;

import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.List;

/* loaded from: classes3.dex */
public final class afq implements d.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25313a;

    static {
        kge.a(290777612);
        kge.a(-312919124);
    }

    public afq(String str) {
        this.f25313a = str;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.d.c
    public void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
        } else {
            bnvVar.b(bVar.a(this.f25313a));
        }
    }
}
