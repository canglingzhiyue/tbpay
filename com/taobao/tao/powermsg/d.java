package com.taobao.tao.powermsg;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.common.e;
import com.taobao.tao.powermsg.common.g;
import com.taobao.tao.powermsg.model.Message;
import com.taobao.tao.powermsg.model.P2P;
import com.taobao.tao.powermsg.model.a;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.omg;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-689567074);
    }

    public static BaseMessage a(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMessage) ipChange.ipc$dispatch("4483b37f", new Object[]{powerMessage});
        }
        powerMessage.toData();
        Message create = Message.create();
        create.bizCode = powerMessage.bizCode;
        create.content = powerMessage.data;
        create.sysCode = 1;
        create.needACK = powerMessage.needAck;
        if (!StringUtils.isEmpty(powerMessage.topic)) {
            create.header.f31524a = powerMessage.topic;
        }
        create.header.g = powerMessage.type;
        if (!StringUtils.isEmpty(powerMessage.from)) {
            create.body.f31517a = powerMessage.from;
        }
        if (!StringUtils.isEmpty(powerMessage.to)) {
            create.body.b = powerMessage.to;
        }
        create.body.c = powerMessage.timestamp;
        create.qosLevel = (byte) powerMessage.qosLevel;
        create.body.d = powerMessage.sendFullTags;
        if (powerMessage.tags != null) {
            create.body.e = powerMessage.tags;
        }
        create.content = powerMessage.data;
        return create;
    }

    public static PowerMsgServiceImpl a() {
        IpChange ipChange = $ipChange;
        return (PowerMsgServiceImpl) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("89346093", new Object[0]) : g.a());
    }

    public static PowerMessage a(BaseMessage baseMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("36a4fd75", new Object[]{baseMessage});
        }
        PowerMessage powerMessage = new PowerMessage();
        if (baseMessage instanceof Message) {
            int i = baseMessage.header.g;
            if (i == 101) {
                powerMessage = new TextPowerMessage();
            } else if (i == 102) {
                powerMessage = new CountPowerMessage();
            } else if (i == 103) {
                powerMessage = new e();
            }
            Message message = (Message) baseMessage;
            powerMessage.from = message.body.f31517a;
            powerMessage.to = message.body.b;
            powerMessage.timestamp = message.body.c;
            powerMessage.tags = message.body.e;
            powerMessage.sendFullTags = message.body.d;
            powerMessage.data = message.content;
        } else if (baseMessage instanceof P2P) {
            powerMessage.data = ((P2P) baseMessage).content;
        }
        powerMessage.type = baseMessage.header.g;
        powerMessage.bizCode = baseMessage.bizCode;
        powerMessage.topic = baseMessage.header.f31524a;
        powerMessage.userId = baseMessage.header.h;
        powerMessage.qosLevel = baseMessage.qosLevel;
        powerMessage.needAck = baseMessage.needACK;
        powerMessage.priority = baseMessage.header.b;
        powerMessage.messageId = baseMessage.header.f;
        powerMessage.fromData();
        return powerMessage;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : "_default";
    }

    public static void a(b<BaseMessage> bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727deb78", new Object[]{bVar, new Integer(i)});
            return;
        }
        int i2 = bVar.f20780a.header.j;
        if (i2 == -2) {
            return;
        }
        if (i2 == 0) {
            a(bVar, i, b(), false);
        } else {
            a(bVar, i, i2 < 0 ? -1L : i2 * 1000, true);
        }
    }

    public static void a(b<BaseMessage> bVar, int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac00208", new Object[]{bVar, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        a aVar = new a(com.taobao.tao.messagekit.base.monitor.c.a(bVar.c, bVar.f20780a.header.f), 1, bVar.f20780a.bizCode, bVar.f20780a.header.f31524a, b(bVar.f20780a), i, com.taobao.tao.powermsg.managers.e.b(bVar.f20780a.header.f31524a, b(bVar.f20780a)).first.intValue());
        aVar.f = bVar.d;
        aVar.h = com.taobao.tao.messagekit.base.monitor.c.a(bVar.e, bVar.i);
        if (bVar.f20780a instanceof Message) {
            aVar.l = ((Message) bVar.f20780a).body.c;
        }
        if (z) {
            aVar.m = 1;
        }
        com.taobao.tao.messagekit.base.monitor.c.a(aVar, j, z);
    }

    public static void a(String str, int i, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a593acbb", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), str2});
        } else {
            a(str, i, i2, i3, str2, b());
        }
    }

    public static void a(String str, int i, int i2, int i3, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce26169", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), str2, new Long(j)});
            return;
        }
        a aVar = new a(str, i, 0, null, null, i2, 0);
        aVar.f = i3;
        aVar.h = str2;
        com.taobao.tao.messagekit.base.monitor.c.a(aVar, j, false);
    }

    public static void a(String str, PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2660721c", new Object[]{str, powerMessage});
            return;
        }
        Object[] objArr = new Object[24];
        objArr[0] = "msg:";
        objArr[1] = Integer.valueOf(powerMessage.bizCode);
        objArr[2] = "topic:";
        objArr[3] = powerMessage.topic;
        objArr[4] = "type:";
        objArr[5] = Integer.valueOf(powerMessage.type);
        objArr[6] = "ack:";
        objArr[7] = Boolean.valueOf(powerMessage.needAck);
        objArr[8] = "from:";
        objArr[9] = powerMessage.from;
        objArr[10] = "to:";
        objArr[11] = powerMessage.to;
        objArr[12] = "timestamp:";
        objArr[13] = Long.valueOf(powerMessage.timestamp);
        objArr[14] = "usr";
        objArr[15] = powerMessage.userId;
        objArr[16] = "qos";
        objArr[17] = Integer.valueOf(powerMessage.qosLevel);
        objArr[18] = "sendFullTags";
        objArr[19] = Boolean.valueOf(powerMessage.sendFullTags);
        objArr[20] = "tags";
        objArr[21] = Arrays.toString(powerMessage.tags);
        objArr[22] = "data";
        if (powerMessage.data != null) {
            i = powerMessage.data.length;
        }
        objArr[23] = Integer.valueOf(i);
        MsgLog.a(str, null, objArr);
    }

    public static boolean a(List<com.taobao.tao.messagekit.base.monitor.b> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19a0788f", new Object[]{list, new Long(j)})).booleanValue();
        }
        if (com.taobao.tao.messagekit.base.c.a("monitor_range_open", 1) != 0) {
            long a2 = omg.b % com.taobao.tao.messagekit.base.c.a("monitor_range_mod", 10000L);
            MsgLog.a("Utils", Long.valueOf(omg.b), " report condition >>", Long.valueOf(a2));
            if (com.taobao.tao.messagekit.base.c.a("monitor_range_left", -10000L) <= a2 && a2 <= com.taobao.tao.messagekit.base.c.a("monitor_range_right", 10000L)) {
                return true;
            }
        }
        return false;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        int a2 = com.taobao.tao.messagekit.base.c.a(com.taobao.tao.messagekit.base.monitor.c.CONF_DEFAULT_TIME, 2);
        if (a2 >= 0) {
            return a2 * 1000;
        }
        return -1L;
    }

    public static String b(BaseMessage baseMessage) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6985ba8", new Object[]{baseMessage});
        }
        if ((baseMessage instanceof Message) && (strArr = ((Message) baseMessage).body.e) != null && strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }
}
