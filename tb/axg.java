package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.event.toast")
/* loaded from: classes2.dex */
public final class axg extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(971036401);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "toast";
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            arc.a().c("AURAToastEvent", "innerHandleEvent", "eventFields 为空");
            return;
        }
        String string = c.getString("message");
        if (StringUtils.isEmpty(string)) {
            arc.a().c("AURAToastEvent", "innerHandleEvent", "message 为空");
        } else {
            bat.a(b().e(), string);
        }
    }
}
