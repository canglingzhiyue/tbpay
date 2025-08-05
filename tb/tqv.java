package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class tqv implements trh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private t f34291a = tjy.b("tblive");

    static {
        kge.a(1096518336);
        kge.a(-1639217248);
    }

    public tqv() {
        this.f34291a.a(aw.TRACK_ORANGES);
    }

    @Override // tb.trh
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        t tVar = this.f34291a;
        if (tVar != null) {
            for (Map.Entry<String, String> entry : tVar.a().entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("tintType", str);
        hashMap.put("tintPage", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a(aw.STAIN_TRACK_PAGE, 2101, aw.STAIN_TRACK_ARG1, null, null, hashMap);
    }
}
