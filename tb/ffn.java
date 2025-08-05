package tb;

import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.h;
import java.util.Map;

@MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.isFavoriteItem", version = "1.0")
/* loaded from: classes5.dex */
public class ffn extends h {
    static {
        kge.a(-967955643);
    }

    public ffn(String str, Map<String, Object> map) {
        super(str, map);
        emu.a("com.taobao.android.detail.wrapper.msoa.invoke.IsFavRequest");
    }
}
