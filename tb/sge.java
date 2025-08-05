package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class sge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMBRELLA_LAY_PAGE_TAG_ID = "Monitor_NewDetail_HomeLayPageSendRequest";
    public static final String UMBRELLA_ON_SCREEN_TAG_ID = "Monitor_NewDetail_HomeOnScreenSendRequest";

    static {
        kge.a(876777327);
    }

    public static void a(String str, PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6659dec2", new Object[]{str, preLoadModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", a(preLoadModel));
        ldk.a("eventProcess", str, "2.0", "Page_NewDetail", null, hashMap);
    }

    public static void a(String str, PreLoadModel preLoadModel, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ec4273", new Object[]{str, preLoadModel, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", a(preLoadModel));
        ldk.a("eventProcess", str, "2.0", "Page_NewDetail", null, hashMap, "newDetailPreLoadError", th.getMessage());
    }

    private static String a(PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55581354", new Object[]{preLoadModel});
        }
        if (preLoadModel.getItems() != null) {
            i = preLoadModel.getItems().size();
        }
        return i + "";
    }
}
