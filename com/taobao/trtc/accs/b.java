package com.taobao.trtc.accs;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.h;
import com.taobao.trtc.utils.j;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class b implements com.taobao.trtc.signal.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(871106619);
        kge.a(-1925098298);
    }

    @Override // com.taobao.trtc.signal.a
    public void a(final String str, final byte[] bArr, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b21bdec", new Object[]{this, str, bArr, map});
        } else {
            com.taobao.artc.utils.a.b(new Runnable() { // from class: com.taobao.trtc.accs.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map map2 = map;
                    if (map2 == null) {
                        map2 = new HashMap();
                        map2.put("dataId", str);
                    }
                    TrtcLog.a("TrtcAccsSignalRecvImpl", "<<<<<< onData begin, dataId: " + str + ", arg: " + map2);
                    h.a("onData begin| dataId: " + str + " arg: " + map2);
                    TrtcSignalChannel.a(j.a(bArr), JSON.toJSONString(map2));
                    TrtcLog.d("TrtcAccsSignalRecvImpl", "onData end");
                }
            });
        }
    }
}
