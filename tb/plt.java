package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.utils.aq;
import com.taobao.taolive.room.utils.c;
import com.taobao.taolive.room.utils.n;
import java.util.Map;

/* loaded from: classes8.dex */
public class plt implements phh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(310537794);
        kge.a(-74997932);
    }

    @Override // tb.phh
    public void a(Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6e17eb", new Object[]{this, activity, new Boolean(z), map});
        } else {
            c.a(activity, z, map);
        }
    }

    @Override // tb.phh
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            aq.a(n.a(), str, map);
        }
    }

    @Override // tb.phh
    public boolean a(ViewGroup viewGroup, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ebb34b8", new Object[]{this, viewGroup, str, map})).booleanValue() : aq.b(n.a(), viewGroup, str, map);
    }

    @Override // tb.phh
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3d35f71d", new Object[]{this}) : n.a();
    }
}
