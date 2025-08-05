package tb;

import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.g;
import java.util.Map;

@MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.showCategoryList")
/* loaded from: classes5.dex */
public class ffo extends g {
    static {
        kge.a(1291136397);
    }

    public ffo(String str, Map<String, Object> map) {
        super(str, map);
        emu.a("com.taobao.android.detail.wrapper.msoa.invoke.ShowCategoryRequest");
    }
}
