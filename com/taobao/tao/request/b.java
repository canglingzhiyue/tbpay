package com.taobao.tao.request;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavAddCollectResponse;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavCheckcollectResponse;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavDelcollectResponseData;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1489567631);
    }

    public b(Application application) {
        super(application);
    }

    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("com.taobao.mcl.fav.delcollect");
        basicRequest.setNEED_ECODE(true);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", Long.valueOf(j));
        hashMap.put("favType", 1);
        startRequest(Long.valueOf(j), i, basicRequest, ComTaobaoMclFavDelcollectResponseData.class, hashMap);
    }

    public void b(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f791ca", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("com.taobao.mcl.fav.addCollect");
        basicRequest.setNEED_ECODE(true);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", Long.valueOf(j));
        hashMap.put("favType", 1);
        startRequest(Long.valueOf(j), i, basicRequest, ComTaobaoMclFavAddCollectResponse.class, hashMap);
    }

    public void c(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddcd0b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("com.taobao.mcl.fav.checkcollect");
        basicRequest.setNEED_ECODE(true);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", Long.valueOf(j));
        hashMap.put("favType", 1);
        startRequest(Long.valueOf(j), i, basicRequest, ComTaobaoMclFavCheckcollectResponse.class, hashMap);
    }
}
