package tb;

import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.h;
import java.util.Map;

@MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.addFavoriteItem", version = "1.0")
/* loaded from: classes5.dex */
public class ffl extends h {
    static {
        kge.a(995080142);
    }

    public ffl(String str, Map<String, Object> map) {
        super(str, map);
        emu.a("com.taobao.android.detail.wrapper.msoa.invoke.AddFavRequest");
    }
}
