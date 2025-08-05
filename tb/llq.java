package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.k;
import java.util.Map;

/* loaded from: classes.dex */
public class llq implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final llr f30697a = new llr();
    private final UMLinkLogInterface b = bpp.a();

    static {
        kge.a(-1557982544);
        kge.a(-31331215);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.k
    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        this.b.commitSuccess(str, str2, str3, str4, str5, map);
        this.f30697a.a(str, str2, str4, map, null);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.k
    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        this.b.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        this.f30697a.a(str, str2, str4, map, str6);
    }
}
