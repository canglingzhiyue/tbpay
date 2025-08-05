package tb;

import android.content.Context;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class phd implements pgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Class<? extends phb>> f32648a = new HashMap();

    static {
        kge.a(-1090504680);
        kge.a(-6804085);
    }

    public phd() {
        this.f32648a.put("openNewBuy", phc.class);
    }

    @Override // tb.pgy
    public void a(String str, Map<String, Object> map, Context context, pgz pgzVar) {
        try {
            Class<? extends phb> cls = this.f32648a.get(str);
            if (cls == null) {
                return;
            }
            cls.newInstance().a(map, context);
        } catch (Throwable th) {
            m.e("TaoLiveGoodsAbility", th.toString());
        }
    }
}
