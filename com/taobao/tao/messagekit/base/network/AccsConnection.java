package com.taobao.tao.messagekit.base.network;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.c;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.h;
import com.taobao.tao.powermsg.model.SubscribeMessage;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tao.reactivex.e;
import tao.reactivex.i;
import tb.jew;
import tb.kge;
import tb.olt;
import tb.olu;
import tb.omg;

/* loaded from: classes8.dex */
public abstract class AccsConnection extends olu<DataPackage, byte[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DATA_PACKAGE_MAX = 10240;

    /* renamed from: a  reason: collision with root package name */
    private tao.reactivex.h.a<com.taobao.tao.messagekit.core.model.b> f20769a = tao.reactivex.h.a.c();
    private c<com.taobao.tao.messagekit.core.model.b> d = new c<>();
    private jew<List<com.taobao.tao.messagekit.core.model.b>> e = new jew<List<com.taobao.tao.messagekit.core.model.b>>() { // from class: com.taobao.tao.messagekit.base.network.AccsConnection.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(List<com.taobao.tao.messagekit.core.model.b> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (list == null || list.size() <= 0 || AccsConnection.this.b() == null) {
            } else {
                e.a(list).a((i) AccsConnection.this.b()).c(new jew<DataPackage>() { // from class: com.taobao.tao.messagekit.base.network.AccsConnection.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void a(DataPackage dataPackage) {
                        IpChange ipChange2 = $ipChange;
                        char c = 2;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4feb7632", new Object[]{this, dataPackage});
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList<DataPackage> arrayList = new ArrayList(2);
                        String str = "";
                        String str2 = str;
                        int i = 0;
                        int i2 = 0;
                        while (i < dataPackage.c().size()) {
                            com.taobao.tao.messagekit.core.model.b bVar = dataPackage.c().get(i);
                            long j = currentTimeMillis;
                            bVar.f = System.currentTimeMillis();
                            byte[] protocol = bVar.f20780a.toProtocol();
                            try {
                                str = bVar.f20780a.getID();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (arrayList.size() <= i2 || ((DataPackage) arrayList.get(i2)).d().size() + protocol.length >= 10240) {
                                DataPackage dataPackage2 = new DataPackage(dataPackage.f20773a, dataPackage.c, dataPackage.b);
                                dataPackage2.a(dataPackage.b());
                                dataPackage2.a(dataPackage.a());
                                arrayList.add(dataPackage2);
                                int size = arrayList.size() - 1;
                                ((DataPackage) arrayList.get(size)).a(bVar);
                                i2 = size;
                                str2 = str;
                            }
                            try {
                                ((DataPackage) arrayList.get(i2)).d().write(protocol);
                                Object[] objArr = new Object[6];
                                objArr[0] = "combine msg >";
                                objArr[1] = str;
                                objArr[c] = "to";
                                objArr[3] = str2;
                                objArr[4] = "sendReq:";
                                objArr[5] = Boolean.valueOf(((DataPackage) arrayList.get(i2)).a());
                                MsgLog.c("AccsConnection", objArr);
                            } catch (IOException e2) {
                                MsgLog.c("AccsConnection", e2, "protocol packet error");
                                d.a().e().a(bVar.f20780a.getID(), -3005, null);
                                e2.printStackTrace();
                            }
                            bVar.c = ((DataPackage) arrayList.get(i2)).d;
                            d.a().g().a(bVar.c, bVar);
                            bVar.f = System.currentTimeMillis() - bVar.f;
                            bVar.g = j;
                            i++;
                            currentTimeMillis = j;
                            c = 2;
                        }
                        for (DataPackage dataPackage3 : arrayList) {
                            AccsConnection.this.a(dataPackage3);
                        }
                    }

                    @Override // tb.jew
                    public /* synthetic */ void accept(DataPackage dataPackage) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b028bfab", new Object[]{this, dataPackage});
                        } else {
                            a(dataPackage);
                        }
                    }
                });
            }
        }

        @Override // tb.jew
        public /* synthetic */ void accept(List<com.taobao.tao.messagekit.core.model.b> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, list});
            } else {
                a(list);
            }
        }
    };

    /* loaded from: classes8.dex */
    public static class DataPackage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20773a;
        public String b;
        public int c;
        public String e;
        public String f;
        public String g;
        public byte[] h;
        private int k;
        public String d = "";
        private boolean l = false;
        public List<com.taobao.tao.messagekit.core.model.b> i = new ArrayList();
        public ByteArrayOutputStream j = new ByteArrayOutputStream();

        static {
            kge.a(-640172921);
        }

        public DataPackage(String str, int i, String str2) {
            this.f20773a = "";
            this.b = "";
            this.e = "";
            this.f = "";
            this.f20773a = str;
            this.c = i;
            this.b = str2;
            String str3 = omg.e.get(Integer.valueOf(i));
            if (str3 != null) {
                this.e = str3;
            } else if (omg.c()) {
                throw new Error("serviceId " + i + " not set");
            }
            this.f = omg.h.c();
        }

        public DataPackage a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataPackage) ipChange.ipc$dispatch("8fa7bfe5", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public void a(com.taobao.tao.messagekit.core.model.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
                return;
            }
            if (this.i.size() <= 0) {
                this.d = bVar.f20780a.getID();
            }
            this.i.add(bVar);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.l = z;
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.l;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.k;
        }

        public List<com.taobao.tao.messagekit.core.model.b> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.i;
        }

        public ByteArrayOutputStream d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ByteArrayOutputStream) ipChange.ipc$dispatch("ec5e66", new Object[]{this}) : this.j;
        }

        public byte[] e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("aef483f1", new Object[]{this});
            }
            byte[] bArr = this.h;
            return bArr != null ? bArr : this.j.toByteArray();
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
            }
            String str = "";
            if (getRouteInfo() != null) {
                return str;
            }
            if (!StringUtils.isEmpty(this.f20773a)) {
                str = str + this.f20773a;
            }
            if (StringUtils.isEmpty(this.b) || olt.a()) {
                return str;
            }
            return str + ":T_" + this.b;
        }

        public String getRouteInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4fc0e5b8", new Object[]{this});
            }
            if (!StringUtils.isEmpty(this.g)) {
                return this.g + "||";
            }
            h a2 = com.taobao.tao.powermsg.managers.e.a(this.k, this.b);
            if (a2 == null) {
                return null;
            }
            return a2.b() + "|" + a2.d() + "|" + a2.e();
        }
    }

    static {
        kge.a(-419272561);
    }

    public AccsConnection() {
        this.b = 0;
        this.d.a(this.f20769a).a(100L).a(this.e);
    }

    @Override // tb.olu
    public int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{this, new Integer(i), str})).intValue();
        }
        if (i == -13 || i == -11) {
            return -3004;
        }
        return i != -9 ? i != 200 ? 2000 : -30000 : PowerMsgType.TIMEOUT;
    }

    @Override // tb.olu
    public void a(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        Command create = Command.create(1);
        create.header.c = i;
        create.header.g = 306;
        create.body.e = new HashMap();
        if (map != null) {
            create.body.e.putAll(map);
        }
        Map<String, String> map2 = create.body.e;
        map2.put(olu.CONNECTION_TYPE, "" + this.b);
        MsgLog.c("AccsConnection", Integer.valueOf(this.b), Integer.valueOf(i), "code:", create.body.e.get(olu.CONNECTION_CODE));
        e.a(new com.taobao.tao.messagekit.core.model.b(create)).b(d.a().d());
        if (1000 != i) {
            return;
        }
        e.a(new com.taobao.tao.messagekit.core.model.b(new AccsConnInfo(true))).b(d.a().d());
    }

    public abstract void a(DataPackage dataPackage);

    @Override // tb.olu
    public void a(final com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
        } else if (bVar == null || !bVar.m || !(bVar.f20780a instanceof BaseMessage)) {
            this.f20769a.onNext(bVar);
        } else {
            com.taobao.tao.messagekit.base.monitor.monitorthread.b.a().execute(new Runnable() { // from class: com.taobao.tao.messagekit.base.network.AccsConnection.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        com.taobao.tao.messagekit.core.model.b bVar2 = bVar;
                        DataPackage dataPackage = new DataPackage(((BaseMessage) bVar2.f20780a).routerId, bVar2.b, ((BaseMessage) bVar2.f20780a).header.f31524a);
                        dataPackage.a(((BaseMessage) bVar2.f20780a).bizCode);
                        if (((BaseMessage) bVar2.f20780a).msgType == 8 || ((BaseMessage) bVar2.f20780a).msgType == 10) {
                            dataPackage.a(true);
                        }
                        dataPackage.h = ((BaseMessage) bVar2.f20780a).toProtocol();
                        dataPackage.d = ((BaseMessage) bVar2.f20780a).getID();
                        if (bVar2.f20780a instanceof SubscribeMessage) {
                            dataPackage.g = ((SubscribeMessage) bVar2.f20780a).routeGroup;
                        }
                        d.a().g().a(((BaseMessage) bVar2.f20780a).getID(), bVar2);
                        AccsConnection.this.a(dataPackage);
                    } catch (Throwable th) {
                        MsgLog.c("AccsConnection", th, "accs send err");
                    }
                }
            });
        }
    }
}
