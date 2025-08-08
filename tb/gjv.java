package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.gateway.msgcenter.Message;
import com.taobao.android.gateway.msgcenter.a;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class gjv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_MSG_CHANNEL = "gateway";
    public static final String GATEWAY_PARAM_EVENTS = "events";

    /* renamed from: a  reason: collision with root package name */
    public static Context f28356a;
    public static String b;
    private gjz c;

    static {
        kge.a(1934849574);
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{str, context});
            return;
        }
        f28356a = context;
        b = str;
    }

    public gjv(String str, JSONObject jSONObject) throws GatewayException {
        if (f28356a == null) {
            throw new GatewayException("gateway must init");
        }
        this.c = new gjz(str, jSONObject);
    }

    public gjv(String str, String str2, String str3) throws GatewayException {
        if (f28356a == null) {
            throw new GatewayException("gateway must init");
        }
        this.c = new gjz(str, str2, str3, false);
    }

    public void a(gke gkeVar, String str) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc3d41", new Object[]{this, gkeVar, str});
        } else {
            this.c.b().a(str, gkeVar);
        }
    }

    public void a(gkl gklVar, String str) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b284579a", new Object[]{this, gklVar, str});
        } else {
            this.c.b().a(str, gklVar);
        }
    }

    public void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b bVar : list) {
                if (bVar != null) {
                    arrayList.add(bVar.b());
                }
            }
            TLog.logd("gateway2-gateway.triggerEvents", StringUtils.join(",", arrayList));
        }
        gjy.a(list, this.c);
    }

    public void a(com.taobao.android.gateway.msgcenter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4671258c", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            bVar.a("gateway", new a() { // from class: tb.gjv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "gateway";
                }

                @Override // com.taobao.android.gateway.msgcenter.a
                public void a(Message message) {
                    JSONObject params;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1be9bf67", new Object[]{this, message});
                    } else if (!StringUtils.equals(message.getChannelId(), a()) || (params = message.getParams()) == null) {
                    } else {
                        try {
                            List<b> list = (List) params.get("events");
                            if (list != null && !list.isEmpty()) {
                                gjv.this.a(list);
                            }
                        } catch (Throwable th) {
                            com.taobao.android.gateway.util.a.a(th, "msgCenter trigerEvent failed");
                        }
                    }
                }
            });
        }
    }
}
