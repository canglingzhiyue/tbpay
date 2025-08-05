package com.taobao.tao.messagekit.base.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.f;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tao.reactivex.e;
import tao.reactivex.f.k;
import tao.reactivex.g;
import tao.reactivex.i;
import tb.jew;
import tb.kge;
import tb.olu;

/* loaded from: classes8.dex */
public abstract class a extends olu<Map<String, Object>, byte[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_API = "api";
    public static final String KEY_DATA = "data";
    public static final String KEY_DID = "did";
    public static final String KEY_ID = "id";
    public static final String KEY_REQ_MODE = "req";
    public static final String KEY_RESULT = "result";
    public static final String KEY_TIMEOUT = "timeout";
    public static final String KEY_VERSION = "version";
    public static final String REQ_MODE_GET = "get";
    public static final String REQ_MODE_POST = "post";

    /* renamed from: a  reason: collision with root package name */
    private jew<Map<String, Object>> f20774a = new jew<Map<String, Object>>() { // from class: com.taobao.tao.messagekit.base.network.a.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            MsgLog.b("MtopConnection", "send data map:", Integer.valueOf(map.size()));
            a.this.a(map, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.messagekit.base.network.a.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.messagekit.core.model.a
                public void a(int i, Map<String, Object> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map2});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("mqtt_type", map.get("mqtt_type"));
                    hashMap.put("msg_type", map.get("msg_type"));
                    hashMap.put("sub_type", map.get("sub_type"));
                    if (map2 != null) {
                        hashMap.put("data", map2.get("result"));
                        hashMap.put("context", map2.get("context"));
                        hashMap.put("re_msg", map2.get("re_msg"));
                        if (MsgLog.a(MsgLog.Level.D)) {
                            MsgLog.a("MtopConnection", "mtop onResult", map2);
                        }
                    }
                    a.this.a((String) map.get("id"), i, hashMap);
                }
            });
        }

        @Override // tb.jew
        public /* synthetic */ void accept(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, map});
            } else {
                a(map);
            }
        }
    };

    static {
        kge.a(-239013179);
    }

    public a() {
        this.b = 1;
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97432ae8", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5122a6a1", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.c = i;
        return i;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbd5129", new Object[]{aVar})).intValue();
        }
        int i = aVar.c + 1;
        aVar.c = i;
        return i;
    }

    @Override // tb.olu
    public int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{this, new Integer(i), str})).intValue();
        }
        if ("SUCCESS".equalsIgnoreCase(str)) {
            return 1000;
        }
        if (ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT.equalsIgnoreCase(str) || -202 == i) {
            return PowerMsgType.TIMEOUT;
        }
        if ("ANDROID_SYS_API_FLOW_LIMIT_LOCKED".equalsIgnoreCase(str) || String.valueOf(4001).equals(str)) {
            return 4001;
        }
        if ("ANDROID_SYS_NETWORK_ERROR".equalsIgnoreCase(str)) {
            return -3004;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            MsgLog.c("MtopConnection", "transCode", Integer.valueOf(i), str);
            return 2000;
        }
    }

    @Override // tb.olu
    public void a(final com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
            return;
        }
        d.a().g().a(bVar.f20780a.getID(), bVar);
        if (b() != null) {
            e.a(new ArrayList<com.taobao.tao.messagekit.core.model.b>() { // from class: com.taobao.tao.messagekit.base.network.MtopConnection$1
                {
                    add(bVar);
                }
            }).b(k.b()).a((i) b()).c(this.f20774a);
        } else {
            MsgLog.c("MtopConnection", "getConverter2Data is null !!!!!!");
        }
    }

    @Override // tb.olu
    public void a(final String str, final int i, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6e4a54", new Object[]{this, str, new Integer(i), map});
            return;
        }
        Object[] objArr = new Object[7];
        objArr[0] = "type:";
        objArr[1] = Integer.valueOf(this.b);
        objArr[2] = str;
        objArr[3] = "response:";
        objArr[4] = Integer.valueOf(i);
        objArr[5] = "service:";
        objArr[6] = map != null ? map.get("service_id") : null;
        MsgLog.b("MtopConnection", objArr);
        e.a((g) new g<f.a>() { // from class: com.taobao.tao.messagekit.base.network.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tao.reactivex.g
            public void a(tao.reactivex.f<f.a> fVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aabfb9b0", new Object[]{this, fVar});
                    return;
                }
                f g = d.a().g();
                String str2 = str;
                f.a a2 = g.a(str2, str2);
                if (a2 != null) {
                    fVar.a(a2);
                }
                fVar.a_();
            }
        }).c(new jew<f.a>() { // from class: com.taobao.tao.messagekit.base.network.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(f.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77641af2", new Object[]{this, aVar});
                } else if (aVar == null) {
                } else {
                    a aVar2 = a.this;
                    int i2 = i;
                    Map map2 = map;
                    int a2 = aVar2.a(i2, (String) (map2 != null ? map2.get("re_msg") : null));
                    Ack a3 = a.this.c() != null ? a.this.c().a(a2, map) : null;
                    if (a3 == null) {
                        a3 = Ack.create();
                    }
                    a3.setStatus(a2);
                    a3.setID(str);
                    com.taobao.tao.messagekit.core.model.b bVar = new com.taobao.tao.messagekit.core.model.b(a3);
                    bVar.c = str;
                    Map map3 = map;
                    bVar.n = map3 != null ? map3.get("context") : null;
                    e.a(bVar).b(aVar);
                    if (-30000 == a2 || 1000 == a2) {
                        a.a(a.this, 0);
                        com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_ACCS_RATE");
                        return;
                    }
                    if (a.a(a.this) < 3) {
                        a.b(a.this);
                    }
                    com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_ACCS_RATE", "" + i, (String) null);
                }
            }

            @Override // tb.jew
            public /* synthetic */ void accept(f.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, aVar});
                } else {
                    a(aVar);
                }
            }
        });
    }

    public abstract void a(Map<String, Object> map, com.taobao.tao.messagekit.core.model.a aVar);
}
