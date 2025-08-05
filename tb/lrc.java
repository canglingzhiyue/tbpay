package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.base.configservice.TbHomeConfigService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.JsBridgeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.cachereqbizparamsservice.CacheReqBizParamsServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.sharedataservice.SharedDataServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.smartrtservice.SmartRtService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.VideoPlayControllerServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1286469138);
    }

    public static List<ISubService> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TbHomeConfigService());
        arrayList.add(new JsBridgeServiceImpl());
        arrayList.add(new SharedDataServiceImpl());
        arrayList.add(new CacheReqBizParamsServiceImpl());
        arrayList.add(new SmartRtService());
        if (!qno.c()) {
            arrayList.add(new AiServiceImpl());
            arrayList.add(new VideoPlayControllerServiceImpl());
        }
        return arrayList;
    }
}
