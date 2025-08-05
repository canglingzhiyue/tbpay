package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.b;
import java.util.Map;

/* loaded from: classes8.dex */
public class omu implements omv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(615777733);
        kge.a(-192962239);
    }

    @Override // tb.omv
    public void a(Map<String, Object> map, b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3231a0", new Object[]{this, map, bVar});
            return;
        }
        boolean a2 = olt.a(bVar.f20780a.bizCode, olt.MTOP_API_SWITCH, String.valueOf(37));
        if (bVar.f20780a.msgType == 8) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.subscribe" : "mtop.taobao.powermsg.msg.subscribe");
            map.put("req", "post");
        } else if (bVar.f20780a.msgType == 10) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.unsubscribe" : "mtop.taobao.powermsg.msg.unsubscribe");
        } else if (bVar.f20780a.type == 7) {
            map.put("api", "mtop.taobao.powermsg.monitor.ack.upload");
            map.put("req", "post");
        } else if (bVar.f20780a.type == 6) {
            map.put("api", "mtop.taobao.powermsg.report.report");
        } else if (bVar.f20780a.header.g == 401) {
            map.put("api", "mtop.taobao.powermsg.msg.pullmsgv0");
        } else if (bVar.f20780a.header.g == 404) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.pullhistorymsg" : "mtop.taobao.powermsg.msg.pullhistorymsg");
        } else if (bVar.f20780a.header.g == 405) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.pullnativemsg" : "mtop.taobao.powermsg.msg.pullnativemsg");
        } else if (bVar.f20780a.header.g == 402) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.pulltopicstat" : "mtop.taobao.powermsg.msg.pulltopicstat");
        } else if (bVar.f20780a.header.g == 403) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.pulltopicuserlist" : "mtop.taobao.powermsg.msg.pulltopicuserlist");
        } else if (bVar.f20780a.type == 2) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.count" : "mtop.taobao.powermsg.msg.count");
        } else if (bVar.f20780a.type == 1) {
            map.put("api", a2 ? "mtop.taobao.powermsg.interact.msg.sendmsg" : "mtop.taobao.powermsg.msg.sendmsg");
        } else if (bVar.f20780a.type != 8) {
        } else {
            map.put("api", "mtop.common.gettimestamp");
        }
    }
}
