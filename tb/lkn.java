package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;

/* loaded from: classes.dex */
public interface lkn {

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar, IJsBridgeService.a.InterfaceC0670a interfaceC0670a);
    }

    /* loaded from: classes7.dex */
    public interface b {
        String a();

        String b();

        JSONObject c();
    }

    void a(String str, a aVar);

    boolean a(String str, b bVar, IJsBridgeService.a.InterfaceC0670a interfaceC0670a);
}
