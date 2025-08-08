package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class pld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f32747a = new ArrayList();
    private boolean b = false;

    static {
        kge.a(-1723446331);
    }

    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (a() && spyVar != null && spyVar.i != null) {
            this.f32747a.clear();
            JSONArray jSONArray = (JSONArray) spyVar.i.get("scenes");
            if (jSONArray != null && jSONArray.size() > 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    String a2 = oec.a(jSONArray.get(i), "");
                    if (!StringUtils.isEmpty(a2)) {
                        this.f32747a.add(a2);
                    }
                }
            }
            spz.c("BackInterceptHelper", "接收来自业务层注册的拦截消息 scenes=" + this.f32747a);
            if (this.f32747a.size() <= 0) {
                z = false;
            }
            this.b = z;
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : a() && this.b && this.f32747a.contains(str);
    }

    public void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{this, fluidContext, str});
        } else if (!a(str)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new spy("VSMSG_backClick", "-1", hashMap));
            this.b = false;
            spz.c("BackInterceptHelper", "拦截后，发送消息给互动层 scene=" + str);
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableInterceptBack", true);
    }
}
