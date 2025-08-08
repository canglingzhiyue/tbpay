package com.taobao.taolive.sdk.business;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TextMessage;
import com.taobao.taolive.sdk.utils.u;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pnk;
import tb.pnq;
import tb.pns;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pns f21799a;
    private com.taobao.taolive.sdk.business.interact.comment.b b;
    private com.taobao.taolive.sdk.business.interact.favor.a c;

    static {
        kge.a(564753404);
    }

    public g(pns pnsVar) {
        this.f21799a = pnsVar;
    }

    public static void a(String str, String str2, String str3, final int i, String str4, String[] strArr, final com.taobao.taolive.sdk.model.b bVar, pns pnsVar) {
        byte[] bytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c178f", new Object[]{str, str2, str3, new Integer(i), str4, strArr, bVar, pnsVar});
        } else if (u.A() && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && u.B().contains(Integer.valueOf(i))) {
            new com.taobao.taolive.sdk.business.sendmsg.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.taolive.sdk.business.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    pnj m = pmd.a().m();
                    m.c(pnj.LOG_TAG, "Message: send msg success type " + i);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
                        return;
                    }
                    pnj m = pmd.a().m();
                    m.c(pnj.LOG_TAG, "Message: send msg error type " + i);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj});
                    } else {
                        onError(i2, netResponse, obj);
                    }
                }
            }).a(str, str2, str3, String.valueOf(i), str4);
        } else {
            TLiveMsg tLiveMsg = new TLiveMsg();
            tLiveMsg.topic = str3;
            tLiveMsg.bizCode = 1;
            tLiveMsg.type = i;
            tLiveMsg.tags = strArr;
            pnk q = pmd.a().q();
            if (q != null) {
                tLiveMsg.from = q.b();
            }
            if (str4 != null) {
                try {
                    bytes = str4.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } else {
                bytes = null;
            }
            tLiveMsg.data = bytes;
            if (pnsVar != null) {
                pnsVar.a(1, tLiveMsg, new pnq() { // from class: com.taobao.taolive.sdk.business.g.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnq
                    public void a(int i2, Map<String, Object> map, Object... objArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                        } else if (i2 == 1000) {
                            pnj m = pmd.a().m();
                            m.c(pnj.LOG_TAG, "Message: send msg success type " + i);
                        } else {
                            pnj m2 = pmd.a().m();
                            m2.c(pnj.LOG_TAG, "Message: send msg error type " + i);
                        }
                    }
                }, new Object[0]);
            }
            pnj m = pmd.a().m();
            m.c(pnj.LOG_TAG, "Message: send msg: roomId---" + str3 + "  content---" + str4);
        }
    }

    public void a(String str, String str2, String str3, HashMap<String, String> hashMap, com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130280c2", new Object[]{this, str, str2, str3, hashMap, dVar});
            return;
        }
        if (this.b == null) {
            this.b = new com.taobao.taolive.sdk.business.interact.comment.b(dVar);
        }
        this.b.a(str, str2, str3, hashMap);
    }

    public void a(String str, String str2, String str3, HashMap<String, String> hashMap, com.taobao.taolive.sdk.adapter.network.d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60897e83", new Object[]{this, str, str2, str3, hashMap, dVar, map});
            return;
        }
        if (this.b == null) {
            this.b = new com.taobao.taolive.sdk.business.interact.comment.b(dVar);
        }
        this.b.a(str, str2, str3, hashMap, map);
    }

    public void a(String str, String str2, String str3, String str4, HashMap<String, String> hashMap, com.taobao.taolive.sdk.adapter.network.d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16abf3cd", new Object[]{this, str, str2, str3, str4, hashMap, dVar, map});
            return;
        }
        if (this.b == null) {
            this.b = new com.taobao.taolive.sdk.business.interact.comment.b(dVar);
        }
        this.b.a(str, str2, str3, str4, hashMap, map);
    }

    public void a(String str, String str2, String str3, String str4, HashMap<String, String> hashMap, com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819160b8", new Object[]{this, str, str2, str3, str4, hashMap, dVar});
            return;
        }
        if (this.b == null) {
            this.b = new com.taobao.taolive.sdk.business.interact.comment.b(dVar);
        }
        this.b.a(str, str2, str3, str4, hashMap);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TextMessage textMessage = new TextMessage();
        textMessage.message = str2;
        TLiveMsg tLiveMsg = new TLiveMsg();
        tLiveMsg.type = 101;
        tLiveMsg.bizCode = 1;
        tLiveMsg.topic = str;
        try {
            tLiveMsg.data = JSON.toJSONString(textMessage).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        pnk q = pmd.a().q();
        if (q == null) {
            return;
        }
        tLiveMsg.from = q.b();
        pns pnsVar = this.f21799a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.b(1, tLiveMsg, new pnq() { // from class: com.taobao.taolive.sdk.business.g.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                } else if (i == 1000) {
                    pmd.a().m().c(pnj.LOG_TAG, "Message: send msg: sendMessage SUCCESS");
                } else {
                    pmd.a().m().c(pnj.LOG_TAG, "Message: send msg: sendMessage FAIL");
                }
            }
        }, new Object[0]);
        pnj m = pmd.a().m();
        m.c(pnj.LOG_TAG, "Message: send msg: roomId---" + str + "  content---" + str2);
    }

    public void a(String str, final long j, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607f662f", new Object[]{this, str, new Long(j), pnqVar});
            return;
        }
        pns pnsVar = this.f21799a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(1, str, (Map<String, Double>) new HashMap<String, Double>() { // from class: com.taobao.taolive.sdk.business.InteractBusiness$4
            {
                g.this = this;
                put(PowerMsgType.KEY_FAVOR, Double.valueOf(j));
            }
        }, false, pnqVar, new Object[0]);
    }

    public void a(long j, long j2, String str, com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a89587", new Object[]{this, new Long(j), new Long(j2), str, dVar});
            return;
        }
        if (this.c == null) {
            this.c = new com.taobao.taolive.sdk.business.interact.favor.a(dVar);
        }
        this.c.a(j, j2, str, (String) null, (Map<String, String>) null);
    }

    public void a(long j, long j2, String str, com.taobao.taolive.sdk.adapter.network.d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b8a71e", new Object[]{this, new Long(j), new Long(j2), str, dVar, map});
            return;
        }
        if (this.c == null) {
            this.c = new com.taobao.taolive.sdk.business.interact.favor.a(dVar);
        }
        this.c.a(j, j2, str, (String) null, map);
    }

    public void a(long j, long j2, String str, String str2, com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d287fa51", new Object[]{this, new Long(j), new Long(j2), str, str2, dVar});
            return;
        }
        if (this.c == null) {
            this.c = new com.taobao.taolive.sdk.business.interact.favor.a(dVar);
        }
        this.c.a(j, j2, str, str2, (Map<String, String>) null);
    }

    public void a(long j, long j2, String str, String str2, com.taobao.taolive.sdk.adapter.network.d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bdd514", new Object[]{this, new Long(j), new Long(j2), str, str2, dVar, map});
            return;
        }
        if (this.c == null) {
            this.c = new com.taobao.taolive.sdk.business.interact.favor.a(dVar);
        }
        this.c.a(j, j2, str, str2, map);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.business.interact.favor.a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
        com.taobao.taolive.sdk.business.interact.comment.b bVar = this.b;
        if (bVar != null) {
            bVar.a();
        }
        this.f21799a = null;
    }
}
