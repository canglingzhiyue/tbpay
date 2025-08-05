package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.net.e;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.h;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.k;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MESSAGE_ID_CACHE_SIZE = 50;
    public int b;
    public FlowControl c;
    public AntiBrush d;
    private Context h;
    private com.taobao.accs.net.c i;
    private String j;
    private ConcurrentMap<Message.Id, Message> g = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentMap<String, ScheduledFuture<?>> f8234a = new ConcurrentHashMap();
    public String e = "";
    public String f = "";
    private LinkedHashMap<String, String> k = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.data.MessageHandler$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            b bVar = b.this;
            return b.$ipChange.a() ? size() > 200 : size() > 50;
        }
    };
    private Map<String, a> l = new HashMap();

    static {
        kge.a(1419533854);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == -1 || i == -9 || i == -18 || i == -10 || i == -11;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e38d71", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13371f2", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public b(Context context, com.taobao.accs.net.c cVar) {
        String str;
        this.j = "MsgRecv_";
        this.h = context;
        this.i = cVar;
        this.c = new FlowControl(this.h);
        this.d = new AntiBrush(this.h);
        if (cVar == null) {
            str = this.j;
        } else {
            str = this.j + cVar.o;
        }
        this.j = str;
        com.taobao.accs.common.a.e().execute(new Runnable() { // from class: com.taobao.accs.data.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this);
                }
            }
        });
    }

    public void a(byte[] bArr, String str, long j, Map<String, Object> map) throws IOException {
        k kVar;
        int i;
        int i2;
        int a2;
        int b;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886bb57a", new Object[]{this, bArr, str, new Long(j), map});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(this.j, b.c.EVENT_ON_MESSAGE, "host", str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        k kVar2 = new k(bArr);
        try {
            int a3 = kVar2.a();
            i = (a3 & 240) >> 4;
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str2 = this.j;
                ALog.d(str2, "version:" + i, new Object[0]);
            }
            i2 = a3 & 15;
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str3 = this.j;
                ALog.d(str3, "compress:" + i2, new Object[0]);
            }
            a2 = kVar2.a();
            b = kVar2.b();
            i3 = 0;
        } catch (Throwable th) {
            th = th;
            kVar = kVar2;
        }
        while (i3 < b) {
            int b2 = kVar2.b();
            int i4 = i3 + 2;
            if (b2 > 0) {
                byte[] bArr2 = new byte[b2];
                kVar2.read(bArr2);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    String str4 = this.j;
                    ALog.d(str4, "buf len:" + bArr2.length, new Object[0]);
                }
                int length = i4 + bArr2.length;
                int i5 = i;
                int i6 = b;
                kVar = kVar2;
                try {
                    a(i2, bArr2, str, i, a2, j, currentTimeMillis, map);
                    i3 = length;
                    i = i5;
                    b = i6;
                    kVar2 = kVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                kVar = kVar2;
                throw new IOException("data format error");
            }
            th = th2;
            try {
                d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.b + th.toString());
                ALog.e(this.j, "onMessage err", th, new Object[0]);
                return;
            } finally {
                kVar.close();
            }
        }
        kVar2.close();
    }

    private void a(int i, byte[] bArr, String str, int i2, int i3, long j, long j2, Map<String, Object> map) throws IOException {
        b bVar;
        Map<Integer, String> map2;
        byte[] bArr2;
        Map<Integer, String> map3;
        byte[] c;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7066c39", new Object[]{this, new Integer(i), bArr, str, new Integer(i2), new Integer(i3), new Long(j), new Long(j2), map});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = new k(bArr);
        long b = kVar.b();
        String a2 = kVar.a(kVar.a());
        String a3 = kVar.a(kVar.a());
        if ("1|grace-bye|".equals(a3) && i3 == 1) {
            String str2 = this.j;
            Object[] objArr = new Object[2];
            objArr[0] = "mConnection";
            if (this.i != null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            ALog.e(str2, "received reconnect command", objArr);
            com.taobao.accs.net.c cVar = this.i;
            if (cVar != null) {
                cVar.f();
            }
            h.a((Closeable) kVar);
            return;
        }
        try {
            String a4 = kVar.a(kVar.a());
            ALog.e(this.j, "parseMessage", "dataId", a4, "target", a2, "source", a3, "accsFlag", Integer.valueOf(i3));
            boolean r = m.r();
            if (a3.contains(Constants.TARGET_FORE) || a3.contains(Constants.TARGET_BACK)) {
                bVar = this;
            } else if (!a3.contains(Constants.TARGET_BACK_LIMIT)) {
                if (r) {
                    ((e) this.i).y().reSchedule();
                }
                if (a3.contains(Constants.TARGET_SERVICE_ST)) {
                    ALog.e(this.j, "ignore source 4|sal|st message", new Object[0]);
                    this.g.remove(new Message.Id(0, a4));
                    h.a((Closeable) kVar);
                    return;
                } else if (Constants.TARGET_AServer_PING_CONTROL.contains(a3)) {
                    ALog.e(this.j, "aserver ping control received", new Object[0]);
                    this.g.remove(new Message.Id(0, a4));
                    h.a((Closeable) kVar);
                    return;
                } else {
                    String str3 = a3 + a4;
                    if (kVar.available() > 0) {
                        if (i2 == 2) {
                            map3 = a(kVar);
                            if (map3 != null && map3.containsKey(16) && map3.containsKey(17)) {
                                z = true;
                            }
                        } else {
                            map3 = null;
                        }
                        if (i == 0 || z) {
                            c = kVar.c();
                        } else if (i == 1) {
                            c = h.a((InputStream) kVar);
                        } else {
                            map2 = map3;
                            bArr2 = null;
                        }
                        map2 = map3;
                        bArr2 = c;
                    } else {
                        map2 = null;
                        bArr2 = null;
                    }
                    kVar.close();
                    a(a2, z, a4, a3, b, str, map2, str3, bArr2, i, bArr, j, j2, currentTimeMillis, map);
                    return;
                }
            } else {
                bVar = this;
            }
            ALog.e(bVar.j, "ignore source 4|sal|sg/fg/bg message dataId:" + a4, new Object[0]);
            bVar.g.remove(new Message.Id(0, a4));
            h.a((Closeable) kVar);
            if (!r) {
                return;
            }
            ((e) bVar.i).y().e();
        } catch (Exception e) {
            ALog.e(this.j, "dataId read error ", e, new Object[0]);
            h.a((Closeable) kVar);
            d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.b + "data id read error" + e.toString());
        }
    }

    private void a(String str, boolean z, String str2, String str3, long j, String str4, Map<Integer, String> map, String str5, byte[] bArr, int i, byte[] bArr2, long j2, long j3, long j4, Map<String, Object> map2) {
        b bVar;
        Exception e;
        Message.ReqType reqType;
        byte[] bArr3;
        int i2;
        Message.ReqType reqType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c06cd", new Object[]{this, str, new Boolean(z), str2, str3, new Long(j), str4, map, str5, bArr, new Integer(i), bArr2, new Long(j2), new Long(j3), new Long(j4), map2});
            return;
        }
        if (bArr == null) {
            try {
                ALog.d(this.j, "oriData is null", new Object[0]);
            } catch (Exception e2) {
                e = e2;
                bVar = this;
                ALog.e(bVar.j, "handleMessage", e, new Object[0]);
                d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", bVar.b + e.toString());
            }
        }
        try {
            int valueOf = Message.MsgType.valueOf((int) ((j >> 15) & 1));
            Message.ReqType valueOf2 = Message.ReqType.valueOf((int) ((j >> 13) & 3));
            int i3 = (int) ((j >> 12) & 1);
            int valueOf3 = Message.MsgResType.valueOf((int) ((j >> 11) & 1));
            boolean z2 = ((int) ((j >> 6) & 1)) == 1;
            if (ALog.isPrintLog(ALog.Level.I) || str.contains(Constants.IMPAAS)) {
                ALog.e(this.j, "handleMessage", "dataId", str2, "type", Message.MsgType.name(valueOf), "reqType", valueOf2.name(), "resType", Message.MsgResType.name(valueOf3), "target", str);
            }
            if (valueOf == 1) {
                if (valueOf2 != Message.ReqType.ACK && valueOf2 != Message.ReqType.RES) {
                    reqType = valueOf2;
                }
                i2 = valueOf;
                reqType = valueOf2;
                bArr3 = bArr2;
                a(valueOf2, str2, i3, bArr, map, j2, j4, str4, bArr2);
                if (i2 == 0 || reqType != Message.ReqType.RES) {
                    reqType2 = reqType;
                } else {
                    reqType2 = reqType;
                    a(str2, bArr, str4, bArr3);
                }
                if (i2 != 1 || reqType2 != Message.ReqType.DATA) {
                }
                a(str, z, valueOf3, str2, str3, j, str4, map, str5, bArr, i, z2, bArr2, j2, j3, j4, map2);
                return;
            }
            reqType = valueOf2;
            i2 = valueOf;
            bArr3 = bArr2;
            if (i2 == 0) {
            }
            reqType2 = reqType;
            if (i2 != 1) {
            }
        } catch (Exception e3) {
            e = e3;
            bVar = this;
            ALog.e(bVar.j, "handleMessage", e, new Object[0]);
            d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", bVar.b + e.toString());
        }
    }

    private void a(Message.ReqType reqType, String str, int i, byte[] bArr, Map<Integer, String> map, long j, long j2, String str2, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11be2ad", new Object[]{this, reqType, str, new Integer(i), bArr, map, new Long(j), new Long(j2), str2, bArr2});
            return;
        }
        Message remove = this.g.remove(new Message.Id(0, str));
        if (remove != null) {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.j, "handleMessage reqMessage not null", new Object[0]);
            }
            int i2 = 200;
            if (i == 1) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    int i3 = jSONObject.getInt("code");
                    ALog.e(this.j, "handleMessageDataAck error", "json", jSONObject);
                    i2 = i3;
                } catch (Exception unused) {
                    i2 = -3;
                }
            }
            if (remove.getNetPermanceMonitor() != null) {
                remove.getNetPermanceMonitor().onRecUnParse(j);
                remove.getNetPermanceMonitor().onStartParse(j2);
                remove.getNetPermanceMonitor().onRecAck();
            }
            if (reqType == Message.ReqType.RES) {
                a(remove, i2, reqType, bArr, map);
                return;
            } else {
                a(remove, i2, map);
                return;
            }
        }
        ALog.e(this.j, "handleMessage data ack/res reqMessage is null", "dataId", str);
    }

    private void a(String str, byte[] bArr, String str2, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c8da0a", new Object[]{this, str, bArr, str2, bArr2});
            return;
        }
        Message remove = this.g.remove(new Message.Id(0, str));
        if (remove != null) {
            a(remove, bArr, bArr2, str2);
            return;
        }
        ALog.e(this.j, "handleMessage control ACK reqMessage is null", "dataId", str);
        if (!ALog.isPrintLog(ALog.Level.D)) {
            return;
        }
        ALog.d(this.j, "handleMessage not handled", AgooConstants.MESSAGE_BODY, new String(bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r25, boolean r26, int r27, java.lang.String r28, java.lang.String r29, long r30, java.lang.String r32, java.util.Map<java.lang.Integer, java.lang.String> r33, java.lang.String r34, byte[] r35, int r36, boolean r37, byte[] r38, long r39, long r41, long r43, java.util.Map<java.lang.String, java.lang.Object> r45) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.b.a(java.lang.String, boolean, int, java.lang.String, java.lang.String, long, java.lang.String, java.util.Map, java.lang.String, byte[], int, boolean, byte[], long, long, long, java.util.Map):void");
    }

    private boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        if (com.taobao.accs.connection.state.a.a().a(context)) {
            return false;
        }
        ALog.e(this.j, "bg msg", "serviceId", str);
        d.a("accs", BaseMonitor.BACKGROUND_RECV_MSG, str, mto.a.GEO_NOT_SUPPORT);
        return true;
    }

    private String a(String str, String str2, String str3, String str4, long j, String str5, Map<Integer, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7d8d4b9", new Object[]{this, str, str2, str3, str4, new Long(j), str5, map});
        }
        if (map == null) {
            hashMap = new HashMap(2);
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put(32, String.valueOf(this.i.t()));
        Message buildPushAck = Message.buildPushAck(this.i.c(null), this.i.g(), str3, str4, str2, false, (short) j, str5, hashMap);
        this.i.b(buildPushAck, true);
        if (UtilityImpl.isServiceIdPrintLog(str)) {
            ALog.e(this.j, "handleMessage try sendAck dataId", "dataId", str2);
        }
        return buildPushAck.dataId;
    }

    private void a(Message message, byte[] bArr, byte[] bArr2, String str) {
        int i;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90e53a3", new Object[]{this, message, bArr, bArr2, str});
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(new String(bArr));
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.j, "handleControlMessage parse", "json", jSONObject3.toString());
            }
            i = message.command.intValue() == 100 ? 200 : jSONObject3.getInt("code");
            try {
                if (i == 200) {
                    int intValue = message.command.intValue();
                    if (intValue == 1) {
                        UtilityImpl.saveUtdid(Constants.SP_FILE_NAME, this.h);
                        this.i.l().a(this.h.getPackageName());
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                        this.e = i.a(jSONObject4, Constants.KEY_ACCS_TOKEN, null);
                        this.f = i.a(jSONObject4, "deviceToken", null);
                        String a2 = i.a(jSONObject4, "regId", null);
                        if (!TextUtils.isEmpty(this.f)) {
                            Config.setDeviceToken(this.h, this.f);
                        }
                        if (!TextUtils.isEmpty(a2)) {
                            String q = l.q(this.h);
                            if (!a2.equals(q)) {
                                this.i.l().a();
                                l.p(this.h);
                                ALog.e(this.j, "handleControlMessage clearRegId()", "regId", a2, "currentRegId", q);
                            }
                        }
                        if (jSONObject4 != null) {
                            JSONArray jSONArray2 = jSONObject4.getJSONArray(Constants.KEY_PACKAGE_NAMES);
                            if (jSONArray2 != null) {
                                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                    String string = jSONArray2.getString(i2);
                                    if (UtilityImpl.packageExist(this.h, string)) {
                                        this.i.l().a(message.packageName);
                                    } else {
                                        ALog.d(this.j, "unbind app", "pkg", string);
                                        this.i.b(Message.buildUnbindApp(this.i.c(null), string), true);
                                    }
                                }
                            }
                            if (jSONObject4.has(Constants.KEY_EVENT_COLLECT_CONTROL) && (jSONObject2 = jSONObject4.getJSONObject(Constants.KEY_EVENT_COLLECT_CONTROL)) != null) {
                                l.a(this.h, "switch", jSONObject2.getBoolean("switch"));
                                l.a(this.h, jSONObject2.toString());
                            }
                            if (jSONObject4.has("agooControl") && (jSONObject = jSONObject4.getJSONObject("agooControl")) != null) {
                                boolean z = jSONObject.getBoolean(Constants.KEY_CONTROL);
                                l.a(this.h, Constants.KEY_CONTROL, z);
                                if (z && (jSONArray = jSONObject.getJSONArray("strategy")) != null && jSONArray.length() != 0) {
                                    NoTraceTriggerHelper.a(jSONArray.toString(), this.h, null, 7, -1);
                                }
                            }
                        }
                    } else if (intValue == 2) {
                        this.i.l().b(message.packageName);
                    } else if (intValue == 3) {
                        this.i.l().a(message.packageName, message.userinfo);
                    } else if (intValue == 4) {
                        this.i.l().b(message.packageName, message.userinfo);
                    } else if (intValue == 100 && (this.i instanceof e) && "4|sal|accs-iot".equals(message.target)) {
                        ((e) this.i).a(jSONObject3);
                    }
                } else if (message.command.intValue() == 3 && i == 300) {
                    this.i.l().b(message.packageName);
                }
            } catch (Throwable th) {
                th = th;
                ALog.e(this.j, "handleControlMessage", th, new Object[0]);
                d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.b + th.toString());
                a(message, i, null, bArr, null);
            }
        } catch (Throwable th2) {
            th = th2;
            i = -8;
        }
        a(message, i, null, bArr, null);
    }

    private Map<Integer, String> a(k kVar) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4740c72f", new Object[]{this, kVar});
        }
        if (kVar == null) {
            return null;
        }
        try {
            int b = kVar.b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.j, "extHeaderLen:" + b, new Object[0]);
            }
            hashMap = null;
            int i = 0;
            while (i < b) {
                try {
                    int b2 = kVar.b();
                    int i2 = (64512 & b2) >> 10;
                    int i3 = b2 & 1023;
                    String a2 = kVar.a(i3);
                    i = i + 2 + i3;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(Integer.valueOf(i2), a2);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.d(this.j, "", "extHeaderType", Integer.valueOf(i2), "value", a2);
                    }
                } catch (Exception e) {
                    e = e;
                    ALog.e(this.j, "parseExtHeader", e, new Object[0]);
                    return hashMap;
                }
            }
        } catch (Exception e2) {
            e = e2;
            hashMap = null;
        }
        return hashMap;
    }

    public void a(Message message, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd84498", new Object[]{this, message, new Integer(i)});
        } else {
            a(message, i, null, null, null);
        }
    }

    public void a(Message message, int i, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e04d3ed", new Object[]{this, message, new Integer(i), map});
        } else {
            a(message, i, null, null, map);
        }
    }

    public void a(Message message, int i, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e336e77", new Object[]{this, message, new Integer(i), reqType, bArr, map});
        } else if (message.command == null || message.getType() < 0 || message.getType() == 2) {
            ALog.d(this.j, "onError, skip ping/ack", new Object[0]);
        } else {
            if (message.cunstomDataId != null) {
                this.f8234a.remove(message.cunstomDataId);
            }
            if (this.d.checkAntiBrush(message.host, map)) {
                i = 70022;
                reqType = null;
                bArr = null;
                map = null;
            }
            int a2 = this.c.a(map, message.serviceId);
            if (a2 != 0) {
                i = a2 == 2 ? 70021 : a2 == 3 ? 70023 : 70020;
                reqType = null;
                bArr = null;
                map = null;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.j, "onResult", "command", message.command, "erorcode", Integer.valueOf(i));
            }
            if (message.command.intValue() == 102) {
                return;
            }
            if (!message.isCancel) {
                if (a(i) && message.command.intValue() != 100 && message.retryTimes <= Message.CONTROL_MAX_RETRY_TIMES) {
                    message.startSendTime = System.currentTimeMillis();
                    message.retryTimes++;
                    ALog.d(this.j, "onResult", "retryTimes", Integer.valueOf(message.retryTimes));
                    this.i.b(message, true);
                    a(message, i, true);
                    return;
                }
                a(message, i, true);
                Intent c = c(message);
                c.putExtra("errorCode", i);
                Message.ReqType valueOf = Message.ReqType.valueOf((message.flags >> 13) & 3);
                if (reqType == Message.ReqType.RES || valueOf == Message.ReqType.REQ) {
                    c.putExtra(Constants.KEY_SEND_TYPE, Constants.SEND_TYPE_RES);
                }
                if (i == 200) {
                    c.putExtra("data", bArr);
                }
                c.putExtra("appKey", this.i.b);
                c.putExtra(Constants.KEY_CONFIG_TAG, this.i.o);
                try {
                    NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                    if (netPermanceMonitor != null && netPermanceMonitor.send_to_rcv_time > 0) {
                        c.putExtra(Constants.KEY_UP_RTT, netPermanceMonitor.send_to_rcv_time);
                        c.putExtra("host", this.i.j.getInappHost());
                    }
                } catch (Exception e) {
                    ALog.e(this.j, "netMonitor rtt err", e, new Object[0]);
                    d.a("accs", BaseMonitor.COUNT_EXCEPTIONS, "ex_rtt", mto.a.GEO_NOT_SUPPORT);
                }
                a(map, c);
                c.a().b(this.h, c);
                if (TextUtils.isEmpty(message.serviceId)) {
                    return;
                }
                d.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, "1commandId=" + message.command + "serviceId=" + message.serviceId, mto.a.GEO_NOT_SUPPORT);
                return;
            }
            ALog.e(this.j, "onResult message is cancel", "command", message.command);
            a(message, i, true);
        }
    }

    private void a(Message message, int i, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e31013c", new Object[]{this, message, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
            if (netPermanceMonitor == null) {
                return;
            }
            String url = message.host == null ? null : message.host.toString();
            if (i == 200) {
                if (message.retryTimes > 0) {
                    d.a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", mto.a.GEO_NOT_SUPPORT);
                    d.a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.retryTimes, mto.a.GEO_NOT_SUPPORT);
                } else {
                    d.a("accs", BaseMonitor.ALARM_POINT_REQUEST, url);
                }
            } else {
                if (message.retryTimes > 0) {
                    d.a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + i, mto.a.GEO_NOT_SUPPORT);
                    d.a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail", mto.a.GEO_NOT_SUPPORT);
                } else if (i != -13) {
                    String valueOf = String.valueOf(i);
                    d.a("accs", BaseMonitor.ALARM_POINT_REQUEST, url, valueOf, this.b + message.serviceId + message.timeout);
                }
                netPermanceMonitor.setFailReason(i);
                z2 = false;
            }
            netPermanceMonitor.setRet(z2);
            if (!z) {
                return;
            }
            if (message.isCancel) {
                netPermanceMonitor.setRet(false);
                netPermanceMonitor.setFailReason("msg cancel");
            }
            AppMonitor.getInstance().commitStat(netPermanceMonitor);
        } catch (Throwable th) {
            ALog.e(this.j, "monitorPerf", th, new Object[0]);
        }
    }

    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ccd27cb", new Object[]{this, message});
        } else if (message.getType() == -1 || message.getType() == 2 || message.isAck) {
        } else {
            this.g.put(message.getMsgId(), message);
        }
    }

    public void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a5e78c", new Object[]{this, message});
        } else if (this.g.keySet().size() > 0) {
            for (Message.Id id : this.g.keySet()) {
                Message message2 = this.g.get(id);
                if (message2 != null && message2.command != null && message2.getPackageName().equals(message.getPackageName())) {
                    switch (message.command.intValue()) {
                        case 1:
                        case 2:
                            if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                        case 3:
                        case 4:
                            if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                        case 5:
                        case 6:
                            if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                    }
                }
                if (message2 != null && message2.isCancel) {
                    ALog.e(this.j, "cancelControlMessage", "command", message2.command);
                }
            }
        }
    }

    public Collection<Message> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.g.values();
    }

    public Set<Message.Id> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.g.keySet();
    }

    public Message a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("b70bbb07", new Object[]{this, str}) : this.g.get(new Message.Id(0, str));
    }

    public Message b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e4e45566", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.g.remove(new Message.Id(0, str));
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return this.k.containsKey(str);
        }
        return false;
    }

    private byte[] a(String str, Map<Integer, String> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("57034303", new Object[]{this, str, map, bArr});
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int parseInt = Integer.parseInt(map.get(17));
                    int parseInt2 = Integer.parseInt(map.get(16));
                    if (parseInt2 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    }
                    if (parseInt < 0 || parseInt >= parseInt2) {
                        throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", Integer.valueOf(parseInt2), Integer.valueOf(parseInt)));
                    }
                    String str2 = map.get(18);
                    String str3 = map.get(15);
                    long parseLong = !TextUtils.isEmpty(str3) ? Long.parseLong(str3) : 0L;
                    a aVar = this.l.get(str);
                    if (aVar == null) {
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(this.j, "putBurstMessage", "dataId", str, "burstLength", Integer.valueOf(parseInt2));
                        }
                        aVar = new a(str, parseInt2, str2);
                        aVar.a(parseLong);
                        this.l.put(str, aVar);
                    }
                    return aVar.a(parseInt, parseInt2, bArr);
                }
            } catch (Throwable th) {
                ALog.w(this.j, "putBurstMessage", th, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || this.k.containsKey(str)) {
        } else {
            this.k.put(str, str);
            com.taobao.accs.common.a.e().execute(new Runnable() { // from class: com.taobao.accs.data.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.c(b.this);
                    }
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            File dir = this.h.getDir("accs", 0);
            File file = new File(dir, "message" + this.i.k() + this.i.o);
            if (!file.exists()) {
                ALog.d(this.j, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    this.k.put(readLine, readLine);
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            File dir = this.h.getDir("accs", 0);
            FileWriter fileWriter = new FileWriter(new File(dir, "message" + this.i.k() + this.i.o));
            fileWriter.write("");
            for (String str : this.k.keySet()) {
                fileWriter.append((CharSequence) str).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Intent c(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ec2a2f26", new Object[]{this, message});
        }
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.packageName);
        intent.putExtra("command", message.command);
        intent.putExtra("serviceId", message.serviceId);
        intent.putExtra("userInfo", message.userinfo);
        if (message.command != null && message.command.intValue() == 100) {
            intent.putExtra("dataId", message.cunstomDataId);
            if (this.i.a()) {
                intent.putExtra(Constants.KEY_FULL_LINK, new TaoBaseService.AccsFullLink(message.getAccsUpTime(), message.getSendTime(), message.getSendEndTime()));
            }
        }
        return intent;
    }

    private void a(Map<Integer, String> map, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a052da", new Object[]{this, map, intent});
        } else if (map == null || intent == null) {
        } else {
            intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
        }
    }

    private void a(Map<Integer, String> map, Map<String, Object> map2, Intent intent) {
        long parseLong;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f965b85", new Object[]{this, map, map2, intent});
            return;
        }
        long j = 0;
        if (map == null) {
            parseLong = 0;
        } else {
            try {
                parseLong = Long.parseLong(map.get(33));
            } catch (Throwable unused) {
                return;
            }
        }
        if (map2 != null) {
            j = Long.parseLong(map2.get("frameRecvTime") + "") + this.i.u();
        }
        intent.putExtra(Constants.KEY_FULL_LINK, new TaoBaseService.AccsFullLink(parseLong, j, Long.parseLong(map2.get(Constants.KEY_DATA_RECEIVED_TIME) + ""), 0L));
    }

    private void a(Intent intent, String str, String str2, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2786ecf4", new Object[]{this, intent, str, str2, new Short(s)});
        } else if (intent == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra("flags", s);
        }
    }
}
