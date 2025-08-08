package com.taobao.taolive.adapterimpl.msg;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.e;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;
import tb.kge;
import tb.pnn;
import tb.pnq;
import tb.pnr;
import tb.pns;

/* loaded from: classes8.dex */
public class c implements pns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f21382a;

    static {
        kge.a(990319840);
        kge.a(-1749827940);
    }

    @Override // tb.pns
    public void a(boolean z, boolean z2, pnn pnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f92f28", new Object[]{this, new Boolean(z), new Boolean(z2), pnnVar});
        }
    }

    @Override // tb.pns
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.pns
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // tb.pns
    public int a(int i, String str, pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f909d354", new Object[]{this, new Integer(i), str, pnrVar})).intValue();
        }
        if (this.f21382a == null) {
            this.f21382a = new d();
        }
        this.f21382a.a(pnrVar);
        return com.taobao.tao.powermsg.common.g.b(i, str, this.f21382a);
    }

    @Override // tb.pns
    public void a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
        } else {
            com.taobao.tao.powermsg.common.g.a(i, str, i2);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, String str2, String str3, String str4, String str5, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716ecc7", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pnqVar, objArr});
        } else {
            com.taobao.tao.powermsg.common.g.a(i, str, StringUtils.isEmpty(str2) ? "" : str2, str3, str4, str5, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, String str2, String str3, String str4, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcda211", new Object[]{this, new Integer(i), str, str2, str3, str4, pnqVar, objArr});
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "";
        }
        com.taobao.tao.powermsg.common.g.a(i, str, str2, str3, str4, null, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 == null) {
                    return;
                }
                pnqVar2.a(i2, map, objArr2);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void a(int i, String str, String str2, String str3, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b61f5db", new Object[]{this, new Integer(i), str, str2, str3, pnqVar, objArr});
        } else {
            com.taobao.tao.powermsg.common.g.a(i, str, str2, str3, (String) null, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void b(int i, String str, String str2, String str3, String str4, String str5, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c63188", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pnqVar, objArr});
        } else {
            com.taobao.tao.powermsg.common.g.b(i, str, StringUtils.isEmpty(str2) ? "" : str2, str3, str4, str5, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void b(int i, String str, String str2, String str3, String str4, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61554512", new Object[]{this, new Integer(i), str, str2, str3, str4, pnqVar, objArr});
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "";
        }
        com.taobao.tao.powermsg.common.g.b(i, str, str2, str3, str4, null, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 == null) {
                    return;
                }
                pnqVar2.a(i2, map, objArr2);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void b(int i, String str, String str2, String str3, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e9071c", new Object[]{this, new Integer(i), str, str2, str3, pnqVar, objArr});
        } else {
            com.taobao.tao.powermsg.common.g.b(i, str, str2, str3, null, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, TLiveMsg tLiveMsg, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab74d526", new Object[]{this, new Integer(i), tLiveMsg, pnqVar, objArr});
        } else if (tLiveMsg == null) {
        } else {
            com.taobao.tao.powermsg.common.g.a(i, a(tLiveMsg), new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map, objArr2);
                }
            }, objArr);
        }
    }

    public static PowerMessage a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("1d57a1f", new Object[]{tLiveMsg});
        }
        PowerMessage powerMessage = new PowerMessage();
        powerMessage.bizCode = tLiveMsg.bizCode;
        powerMessage.from = tLiveMsg.from;
        powerMessage.messageId = tLiveMsg.messageId;
        powerMessage.qosLevel = tLiveMsg.qosLevel;
        powerMessage.priority = tLiveMsg.priority;
        powerMessage.type = tLiveMsg.type;
        powerMessage.userId = tLiveMsg.userId;
        powerMessage.needAck = tLiveMsg.needAck;
        powerMessage.topic = tLiveMsg.topic;
        powerMessage.to = tLiveMsg.to;
        powerMessage.timestamp = tLiveMsg.timestamp;
        powerMessage.sendFullTags = tLiveMsg.sendFullTags;
        powerMessage.tags = tLiveMsg.tags;
        powerMessage.data = tLiveMsg.data;
        return powerMessage;
    }

    @Override // tb.pns
    public void b(int i, TLiveMsg tLiveMsg, final pnq pnqVar, Object... objArr) {
        PowerMessage a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89683b05", new Object[]{this, new Integer(i), tLiveMsg, pnqVar, objArr});
        } else if (tLiveMsg == null || (a2 = a(tLiveMsg)) == null) {
        } else {
            com.taobao.tao.powermsg.common.g.a(i, a2, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, Map<String, Double> map, boolean z, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b5da0", new Object[]{this, new Integer(i), str, map, new Boolean(z), pnqVar, objArr});
        } else {
            com.taobao.tao.powermsg.common.g.a(i, str, map, z, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i2, Map<String, Object> map2, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i2, map2, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, TLiveMsg tLiveMsg, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3970df5", new Object[]{this, new Integer(i), tLiveMsg, new Integer(i2)});
        } else if (tLiveMsg == null) {
        } else {
            com.taobao.tao.powermsg.common.g.a(i, a(tLiveMsg), i2);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, int i2, int i3, int i4, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c4f616", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), pnqVar, objArr});
        } else {
            com.taobao.tao.powermsg.common.g.a(i, str, i2, i3, i4, new com.taobao.tao.powermsg.common.b() { // from class: com.taobao.taolive.adapterimpl.msg.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.powermsg.common.b
                public void a(int i5, Map<String, Object> map, Object... objArr2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i5), map, objArr2});
                        return;
                    }
                    pnq pnqVar2 = pnqVar;
                    if (pnqVar2 == null) {
                        return;
                    }
                    pnqVar2.a(i5, map, objArr2);
                }
            }, objArr);
        }
    }

    @Override // tb.pns
    public void a(TLiveMsg tLiveMsg, int i, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0459252", new Object[]{this, tLiveMsg, new Integer(i), new Boolean(z)});
        } else if (tLiveMsg == null) {
        } else {
            PowerMessage a2 = a(tLiveMsg);
            e eVar = new e();
            eVar.b = i;
            if (z) {
                i2 = 1000;
            }
            eVar.f20763a = i2;
            com.taobao.tao.powermsg.common.g.a().doFullLink(a2, eVar);
        }
    }
}
