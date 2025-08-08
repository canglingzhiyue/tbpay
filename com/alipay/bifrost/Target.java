package com.alipay.bifrost;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.amnetcore.DftAmnetSwitchManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobile.common.transportext.amnet.Mercury;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.alipay.mobile.common.transportext.amnet.StorageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.i;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.ByteString;
import org.android.agoo.common.AgooConstants;
import tb.cpe;
import tb.riy;

/* loaded from: classes3.dex */
public class Target {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Mercury f5245a;
    private Linkage.Touching g;
    private long h;
    private long i;
    private StorageManager b = new StorageManager();
    private Linkage c = new DftLinkage();
    private AmnetSwitchManager d = new DftAmnetSwitchManager();
    private Map<Byte, Channel> e = new TreeMap();
    private Map<Long, NetTest> f = new TreeMap();
    private int j = 0;
    private String k = "";
    private String l = "";
    private boolean m = true;

    private static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "1" : "0";
    }

    public static /* synthetic */ Mercury a(Target target) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mercury) ipChange.ipc$dispatch("c22dbb24", new Object[]{target}) : target.f5245a;
    }

    public static /* synthetic */ void a(Target target, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b827eff0", new Object[]{target, str, bArr});
        } else {
            target.a(str, bArr);
        }
    }

    public Target(Mercury mercury, long j) {
        this.f5245a = mercury;
        this.h = j;
    }

    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : j == this.h;
    }

    public boolean a(Storage storage, Linkage linkage, AmnetSwitchManager amnetSwitchManager, Map<Byte, Channel> map, String str, String str2, String str3, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str4, String str5, boolean z, boolean z2, boolean z3, int i, Map<String, Object> map5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("560c4b56", new Object[]{this, storage, linkage, amnetSwitchManager, map, str, str2, str3, map2, map3, map4, str4, str5, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), map5})).booleanValue();
        }
        if (storage != null) {
            this.b.register(storage);
        }
        if (linkage != null) {
            this.c = linkage;
        }
        if (amnetSwitchManager != null) {
            this.d = amnetSwitchManager;
        }
        if (map != null) {
            for (Map.Entry<Byte, Channel> entry : map.entrySet()) {
                Byte key = entry.getKey();
                if (key != null) {
                    Channel value = entry.getValue();
                    if (value == null) {
                        this.e.remove(key);
                    } else {
                        this.e.put(key, value);
                    }
                }
            }
        }
        g();
        h();
        c(map5);
        return a(str, str2, str3, map2, map3, map4, str4, str5, z, z2, z3, i, map5);
    }

    public void a(long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, byte b, String str2, String str3, Map<String, String> map, byte[] bArr, Map<String, String> map2, long j3, long j4, boolean z6, boolean z7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc45753", new Object[]{this, new Long(j), new Long(j2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), str, new Byte(b), str2, str3, map, bArr, map2, new Long(j3), new Long(j4), new Boolean(z6), new Boolean(z7)});
            return;
        }
        long nanoTime = System.nanoTime();
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "moment";
        strStrItem.val = b(j);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "arrive";
        strStrItem2.val = b(nanoTime);
        universal.alice.add(strStrItem2);
        StrStrItem strStrItem3 = new StrStrItem();
        strStrItem3.key = "receipt";
        strStrItem3.val = b(j2);
        universal.alice.add(strStrItem3);
        StrStrItem strStrItem4 = new StrStrItem();
        strStrItem4.key = "time-queue";
        strStrItem4.val = b(j3);
        universal.alice.add(strStrItem4);
        StrStrItem strStrItem5 = new StrStrItem();
        strStrItem5.key = "time-amnet";
        strStrItem5.val = b(j4);
        universal.alice.add(strStrItem5);
        StrStrItem strStrItem6 = new StrStrItem();
        strStrItem6.key = "IP-fwd";
        strStrItem6.val = a(str2);
        universal.alice.add(strStrItem6);
        StrStrItem strStrItem7 = new StrStrItem();
        strStrItem7.key = "ID-trace";
        strStrItem7.val = a(str3);
        universal.alice.add(strStrItem7);
        StrStrItem strStrItem8 = new StrStrItem();
        strStrItem8.key = "important";
        strStrItem8.val = a(z);
        universal.alice.add(strStrItem8);
        StrStrItem strStrItem9 = new StrStrItem();
        strStrItem9.key = "secret";
        strStrItem9.val = a(z2);
        universal.alice.add(strStrItem9);
        StrStrItem strStrItem10 = new StrStrItem();
        strStrItem10.key = "nearing";
        strStrItem10.val = a(z3);
        universal.alice.add(strStrItem10);
        StrStrItem strStrItem11 = new StrStrItem();
        strStrItem11.key = ShopConstants.PARAM_SHORTCUT;
        strStrItem11.val = a(z4);
        universal.alice.add(strStrItem11);
        StrStrItem strStrItem12 = new StrStrItem();
        strStrItem12.key = "no-long";
        strStrItem12.val = a(z5);
        universal.alice.add(strStrItem12);
        StrStrItem strStrItem13 = new StrStrItem();
        strStrItem13.key = "short-IPList";
        strStrItem13.val = a(str);
        universal.alice.add(strStrItem13);
        StrStrItem strStrItem14 = new StrStrItem();
        strStrItem14.key = "channel";
        strStrItem14.val = a(b);
        universal.alice.add(strStrItem14);
        StrStrItem strStrItem15 = new StrStrItem();
        strStrItem15.key = "multiplex";
        strStrItem15.val = a(z6);
        universal.alice.add(strStrItem15);
        StrStrItem strStrItem16 = new StrStrItem();
        strStrItem16.key = "isUrgent";
        strStrItem16.val = a(z7);
        universal.alice.add(strStrItem16);
        StrBinItem strBinItem = new StrBinItem();
        strBinItem.key = "header";
        strBinItem.val = b(map);
        universal.bob.add(strBinItem);
        StrBinItem strBinItem2 = new StrBinItem();
        strBinItem2.key = AgooConstants.MESSAGE_BODY;
        strBinItem2.val = bArr == null ? null : ByteString.of(bArr);
        universal.bob.add(strBinItem2);
        StrBinItem strBinItem3 = new StrBinItem();
        strBinItem3.key = "params";
        strBinItem3.val = b(map2);
        universal.bob.add(strBinItem3);
        Bifrost.post(universal.toByteArray());
    }

    public void a(int i, String str, String str2, Map<Byte, byte[]> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ec6076", new Object[]{this, new Integer(i), str, str2, map});
            return;
        }
        if (i == 0 && this.m) {
            this.m = false;
            if (this.k == null) {
                this.k = "";
            }
            if (this.l == null) {
                this.l = "";
            }
            if (this.k.equalsIgnoreCase(str) && this.l.equalsIgnoreCase(str2)) {
                Bifrost.a("INFO", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Ignore the first alter net.");
                return;
            }
        }
        if (12 == i) {
            g();
            return;
        }
        if (4 == i) {
            if (str.compareToIgnoreCase("login") == 0) {
                z = true;
            } else if (str.compareToIgnoreCase(Baggage.Amnet.USER_O) != 0) {
                z = false;
                z2 = false;
            } else {
                z = false;
            }
            if (z2) {
                String[] b = b(str2);
                if (StringUtils.isEmpty(b[0]) || !z) {
                    b[0] = "";
                }
                AppLogicICallBackImpl.getInstance().setUserId(b[0]);
            }
        }
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "status";
        strStrItem.val = a(i);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "inf-major";
        strStrItem2.val = a(str);
        universal.alice.add(strStrItem2);
        StrStrItem strStrItem3 = new StrStrItem();
        strStrItem3.key = "inf-minor";
        strStrItem3.val = a(str2);
        universal.alice.add(strStrItem3);
        StringBuilder sb = new StringBuilder();
        sb.append("target.java alter,extMap: ");
        sb.append(map == null ? "is null" : "not null");
        LogCatUtil.printInfo(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, sb.toString());
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Byte, byte[]> entry : map.entrySet()) {
                Byte key = entry.getKey();
                if (key != null) {
                    StrBinItem strBinItem = new StrBinItem();
                    strBinItem.key = String.valueOf((int) key.byteValue());
                    byte[] value = entry.getValue();
                    strBinItem.val = value == null ? null : ByteString.of(value);
                    universal.bob.add(strBinItem);
                }
            }
        }
        Bifrost.alter(universal.toByteArray());
    }

    public void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "receipt";
        strStrItem.val = b(j);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "duration";
        strStrItem2.val = b(j2);
        universal.alice.add(strStrItem2);
        Bifrost.alert(universal.toByteArray());
    }

    public void a(NetTest netTest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2134b1", new Object[]{this, netTest});
            return;
        }
        long j = this.i + 1;
        this.i = j;
        this.f.put(Long.valueOf(j), netTest);
        Bifrost.launch(j);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : Bifrost.ask();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            Bifrost.stop();
        }
    }

    public void a(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c702c780", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            Bifrost.preConnect(str, i, z, i2);
        }
    }

    public void a(byte[] bArr, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e43ec5", new Object[]{this, bArr, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        try {
            Iterator<StrBinItem> it = ((Universal) new i(new Class[0]).a(bArr, Universal.class)).bob.iterator();
            if (z3) {
                while (it.hasNext()) {
                    StrBinItem next = it.next();
                    if (next.key != null) {
                        if (!z2) {
                            this.b.removeCommon(next.key);
                        } else {
                            this.b.removeBigData(next.key);
                        }
                    }
                }
                return;
            }
            while (it.hasNext()) {
                StrBinItem next2 = it.next();
                if (next2.key != null && next2.val != null) {
                    if (z2) {
                        this.b.putBigDataAsync(next2.key, next2.val.toByteArray(), z);
                    } else if (z) {
                        this.b.putCommonTransmit(next2.key, next2.val.toByteArray());
                    } else {
                        this.b.putSecureTransmit(next2.key, next2.val.toByteArray());
                    }
                }
            }
            if (z2) {
                return;
            }
            this.b.putCommit();
        } catch (Throwable th) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a configuration." + th.toString());
        }
    }

    public byte[] a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c7f1e4eb", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        }
        if (StringUtils.isEmpty(str)) {
            return new byte[0];
        }
        if (z2) {
            byte[] bigData = this.b.getBigData(str, z);
            return bigData == null ? new byte[0] : bigData;
        } else if (!z) {
            byte[] secure = this.b.getSecure(str);
            return secure == null ? new byte[0] : secure;
        } else {
            byte[] common = this.b.getCommon(str);
            return common == null ? new byte[0] : common;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        this.c.collect(treeMap);
        this.c.gather(treeMap2);
        a(treeMap);
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        for (Map.Entry<Byte, Map<String, String>> entry : treeMap.entrySet()) {
            Byte key = entry.getKey();
            if (key != null) {
                StrBinItem strBinItem = new StrBinItem();
                strBinItem.key = ":" + String.valueOf((int) key.byteValue());
                strBinItem.val = b(entry.getValue());
                universal.bob.add(strBinItem);
            }
        }
        for (Map.Entry entry2 : treeMap2.entrySet()) {
            Byte b = (Byte) entry2.getKey();
            if (b != null) {
                StrBinItem strBinItem2 = new StrBinItem();
                strBinItem2.key = "." + String.valueOf((int) b.byteValue());
                byte[] bArr = (byte[]) entry2.getValue();
                strBinItem2.val = bArr == null ? null : ByteString.of(bArr);
                universal.bob.add(strBinItem2);
            }
        }
        Bifrost.initialize(universal.toByteArray());
    }

    public void a(long j, byte[] bArr) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262fa523", new Object[]{this, new Long(j), bArr});
            return;
        }
        try {
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            for (StrStrItem strStrItem : ((Universal) new i(new Class[0]).a(bArr, Universal.class)).alice) {
                if (strStrItem.key != null) {
                    if (strStrItem.key.equalsIgnoreCase("fin")) {
                        z = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("ok")) {
                        z3 = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase(a.ATOM_done)) {
                        z2 = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("summary")) {
                        str = strStrItem.val;
                    }
                }
            }
            NetTest remove = (!z || !z2) ? this.f.get(Long.valueOf(j)) : this.f.remove(Long.valueOf(j));
            if (remove == null) {
                return;
            }
            remove.report(z, z3, z2, str);
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a net-test.");
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.j = i2;
        Bifrost.a("INFO", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "state change to " + this.j);
        this.c.change(i2);
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        try {
            Universal universal = (Universal) new i(new Class[0]).a(bArr, Universal.class);
            Initialization.RspInit rspInit = new Initialization.RspInit();
            for (StrStrItem strStrItem : universal.alice) {
                if (strStrItem.key != null) {
                    if (strStrItem.key.equalsIgnoreCase("status")) {
                        rspInit.status = b(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("reconn")) {
                        rspInit.reconn = b(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("origin")) {
                        rspInit.origin = a(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("ncrmnt")) {
                        rspInit.ncrmnt = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("makeup")) {
                        rspInit.makeup = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase(AgooConstants.MESSAGE_NOTIFICATION)) {
                        rspInit.notifyLoginOut = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase(AbsListWidgetInstance.KEY_SECTION_EXPAND)) {
                        rspInit.expand = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE)) {
                        rspInit.device = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID)) {
                        rspInit.clientIp = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("dictid")) {
                        rspInit.dictId = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("mtag")) {
                        rspInit.mtag = strStrItem.val;
                    }
                }
            }
            this.c.establish();
            this.c.initRsp(rspInit);
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of an init-response.");
        }
    }

    public void b(byte[] bArr) {
        Channel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{this, bArr});
            return;
        }
        Channel.Obtaining m = m(bArr);
        if (m == null || (channel = this.e.get(Byte.valueOf(m.channel))) == null) {
            return;
        }
        m.isUseBifrost = true;
        channel.obtain(m);
    }

    public void c(byte[] bArr) {
        Channel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5ddb1", new Object[]{this, bArr});
            return;
        }
        Channel.Obtaining m = m(bArr);
        if (m == null || (channel = this.e.get(Byte.valueOf(m.channel))) == null) {
            return;
        }
        channel.recycle(m.header, m.body);
    }

    public void d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facc18f2", new Object[]{this, bArr});
            return;
        }
        this.g = i(bArr);
        Linkage.Touching touching = this.g;
        if (touching == null) {
            return;
        }
        touching.isUseBifrost = true;
        this.c.touch(touching);
    }

    public void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb25433", new Object[]{this, bArr});
            return;
        }
        Linkage.Touching touching = this.g;
        if (touching == null) {
            touching = new Linkage.Touching();
            touching.msDns = Double.NaN;
            touching.msTcp = Double.NaN;
            touching.msAttempt = Double.NaN;
        } else {
            this.g = null;
        }
        Linkage.Separating j = j(bArr);
        if (j == null) {
            return;
        }
        j.isUseBifrost = true;
        this.c.separate(touching, j);
    }

    public void f(byte[] bArr) {
        Linkage.Keeping[] l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64988f74", new Object[]{this, bArr});
        } else if (this.g == null || (l = l(bArr)) == null) {
        } else {
            Linkage.Touching touching = this.g;
            touching.isUseBifrost = true;
            this.c.keep(touching, l, l.length);
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            this.c.restrict(i, str);
        }
    }

    public void g(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997ecab5", new Object[]{this, bArr});
        } else {
            this.c.command(bArr);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.reactivate();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.resendSessionid();
        }
    }

    public void a(int i, long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2438a9", new Object[]{this, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
        } else if (i > 256 || i < 0 || i2 < 0 || i3 < 0) {
        } else {
            try {
                Channel channel = this.e.get(Byte.valueOf(Integer.valueOf(i).byteValue()));
                if (channel == null) {
                    return;
                }
                channel.tell(j, i2, i3);
            } catch (Throwable th) {
                Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "tellSendTraffic error: " + th.toString());
            }
        }
    }

    public void a(long j, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7b03f2", new Object[]{this, new Long(j), new Integer(i), str, new Integer(i2)});
        } else if (j < 0 || i == 0) {
        } else {
            Bifrost.a("WARN", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "sorry rpcid:" + j + ", errCode:" + i + ", errInf:" + str);
            HashMap hashMap = new HashMap();
            if (1 == i2) {
                hashMap.put(AmnetConstant.KEY_AMNET_LIB_VERSION, AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST_HTTP2);
            } else {
                hashMap.put(AmnetConstant.KEY_AMNET_LIB_VERSION, AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST);
            }
            this.c.sorry(j, i, str, hashMap);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.b.getBigDataAsync("zstd.data", false, 5, new Storage.Result() { // from class: com.alipay.bifrost.Target.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.amnet.Storage.Result
                public void callbackData(final String str, final byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8be62ba7", new Object[]{this, str, bArr});
                    } else {
                        Target.a(Target.this).post(new Runnable() { // from class: com.alipay.bifrost.Target.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    Target.a(Target.this, str, bArr);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            Universal universal = new Universal();
            universal.alice = new LinkedList();
            StrStrItem strStrItem = new StrStrItem();
            strStrItem.key = "imc";
            strStrItem.val = a(this.d.isEnableInitMergeSync());
            universal.alice.add(strStrItem);
            StrStrItem strStrItem2 = new StrStrItem();
            strStrItem2.key = "b_sl";
            strStrItem2.val = a(this.d.isEnableShortLink(true));
            universal.alice.add(strStrItem2);
            StrStrItem strStrItem3 = new StrStrItem();
            strStrItem3.key = "mars.stn.longlink.connmax";
            strStrItem3.val = a(this.d.getLonglinkConnMax());
            universal.alice.add(strStrItem3);
            byte[] byteArray = universal.toByteArray();
            if (byteArray != null && byteArray.length > 0) {
                Bifrost.setSwitch(byteArray);
            }
            LogCatUtil.debug(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "setSwitch, KEY_SW_IMC:" + this.d.isEnableInitMergeSync() + ",KEY_SW_SHORTCUT:" + this.d.isEnableShortLink(true) + ",KEY_SW_LONGLINK_CONNMAX:" + this.d.getLonglinkConnMax());
        } catch (Throwable th) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "setSwitch error" + th.toString());
        }
    }

    public void h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6505f6", new Object[]{this, bArr});
            return;
        }
        try {
            Universal universal = (Universal) new i(new Class[0]).a(bArr, Universal.class);
            HashMap hashMap = new HashMap(8);
            for (StrStrItem strStrItem : universal.alice) {
                if (strStrItem.key != null && strStrItem.val != null) {
                    hashMap.put(strStrItem.key, strStrItem.val);
                }
            }
            this.c.reportPerfinfo(hashMap);
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a configuration.");
        }
    }

    /* loaded from: classes3.dex */
    public class DftLinkage implements Linkage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public boolean cancelAlarmTimer(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27142692", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return false;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void change(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void collect(Map<Byte, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c002b4", new Object[]{this, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void command(List<Linkage.Cmd> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63e06f43", new Object[]{this, list});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void command(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6d2ee99", new Object[]{this, bArr});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void establish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a79fd140", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void eventTracking(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6b13979", new Object[]{this, str, str2, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void gather(Map<Byte, byte[]> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a52d8a43", new Object[]{this, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void gift(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b062bb4b", new Object[]{this, str, str2});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void initRsp(Initialization.RspInit rspInit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66de5ab3", new Object[]{this, rspInit});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void keep(Linkage.Touching touching, Linkage.Keeping[] keepingArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4cb025c", new Object[]{this, touching, keepingArr, new Integer(i)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public String[] network() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("ce914844", new Object[]{this});
            }
            return null;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void panic(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void reactivate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("672d01ad", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void report(String str, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void reportPerfinfo(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea2bf1d3", new Object[]{this, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void resendSessionid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80e3e1bd", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void restrict(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void retrench(Linkage.Touching touching) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff6296c", new Object[]{this, touching});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void separate(Linkage.Touching touching, Linkage.Separating separating) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83a04db9", new Object[]{this, touching, separating});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void sorry(long j, int i, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ae5cb8", new Object[]{this, new Long(j), new Integer(i), str, map});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public boolean startAlarmTimer(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eba8e7e2", new Object[]{this, new Integer(i), new Long(j)})).booleanValue();
            }
            return false;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void touch(Linkage.Touching touching) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50713a6c", new Object[]{this, touching});
            }
        }

        private DftLinkage() {
        }
    }

    private boolean a(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str4, String str5, boolean z, boolean z2, boolean z3, int i, Map<String, Object> map4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72013267", new Object[]{this, str, str2, str3, map, map2, map3, str4, str5, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), map4})).booleanValue();
        }
        this.k = str4;
        this.l = str5;
        byte[] secure = this.b.getSecure("/std-ticket");
        byte[] secure2 = this.b.getSecure("/std-session");
        byte[] secure3 = this.b.getSecure("/mtls-session");
        byte[] common = this.b.getCommon("/mtls-cache");
        byte[] secure4 = this.b.getSecure("/environment");
        byte[] secure5 = this.b.getSecure("/cfg-sequence");
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        universal.bob = new LinkedList();
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = "target";
        strStrItem.val = b(this.h);
        universal.alice.add(strStrItem);
        StrStrItem strStrItem2 = new StrStrItem();
        strStrItem2.key = "host-LL";
        strStrItem2.val = a(str);
        universal.alice.add(strStrItem2);
        StrStrItem strStrItem3 = new StrStrItem();
        strStrItem3.key = "host-SL";
        strStrItem3.val = a(str2);
        universal.alice.add(strStrItem3);
        StrStrItem strStrItem4 = new StrStrItem();
        strStrItem4.key = "host-ML";
        strStrItem4.val = a(str3);
        universal.alice.add(strStrItem4);
        StrStrItem strStrItem5 = new StrStrItem();
        strStrItem5.key = "inf-major";
        strStrItem5.val = a(str4);
        universal.alice.add(strStrItem5);
        StrStrItem strStrItem6 = new StrStrItem();
        strStrItem6.key = "inf-minor";
        strStrItem6.val = a(str5);
        universal.alice.add(strStrItem6);
        StrStrItem strStrItem7 = new StrStrItem();
        strStrItem7.key = "ground";
        strStrItem7.val = a(z);
        universal.alice.add(strStrItem7);
        StrStrItem strStrItem8 = new StrStrItem();
        strStrItem8.key = "screen";
        strStrItem8.val = a(z2);
        universal.alice.add(strStrItem8);
        StrStrItem strStrItem9 = new StrStrItem();
        strStrItem9.key = "master";
        strStrItem9.val = a(z3);
        universal.alice.add(strStrItem9);
        StrStrItem strStrItem10 = new StrStrItem();
        strStrItem10.key = DinamicxNativeConfig.TARGETTYPE;
        strStrItem10.val = a(i);
        universal.alice.add(strStrItem10);
        StrBinItem strBinItem = new StrBinItem();
        strBinItem.key = "cfg-LL";
        strBinItem.val = b(map);
        universal.bob.add(strBinItem);
        StrBinItem strBinItem2 = new StrBinItem();
        strBinItem2.key = "cfg-SL";
        strBinItem2.val = b(map2);
        universal.bob.add(strBinItem2);
        StrBinItem strBinItem3 = new StrBinItem();
        strBinItem3.key = "cfg-ML";
        strBinItem3.val = b(map3);
        universal.bob.add(strBinItem3);
        if (secure != null) {
            StrBinItem strBinItem4 = new StrBinItem();
            strBinItem4.key = "/std-ticket";
            strBinItem4.val = ByteString.of(secure);
            universal.bob.add(strBinItem4);
        }
        if (secure2 != null) {
            StrBinItem strBinItem5 = new StrBinItem();
            strBinItem5.key = "/std-session";
            strBinItem5.val = ByteString.of(secure2);
            universal.bob.add(strBinItem5);
        }
        if (secure3 != null) {
            StrBinItem strBinItem6 = new StrBinItem();
            strBinItem6.key = "/mtls-session";
            strBinItem6.val = ByteString.of(secure3);
            universal.bob.add(strBinItem6);
        }
        if (common != null) {
            StrBinItem strBinItem7 = new StrBinItem();
            strBinItem7.key = "/mtls-cache";
            strBinItem7.val = ByteString.of(common);
            universal.bob.add(strBinItem7);
        }
        if (secure4 != null) {
            StrBinItem strBinItem8 = new StrBinItem();
            strBinItem8.key = "/environment";
            strBinItem8.val = ByteString.of(secure4);
            universal.bob.add(strBinItem8);
        }
        if (secure5 != null) {
            StrBinItem strBinItem9 = new StrBinItem();
            strBinItem9.key = "/cfg-sequence";
            strBinItem9.val = ByteString.of(secure5);
            universal.bob.add(strBinItem9);
        }
        a(map4, universal);
        return Bifrost.start(universal.toByteArray());
    }

    private void a(Map<String, Object> map, Universal universal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e43cca", new Object[]{this, map, universal});
        } else if (map == null) {
        } else {
            Object obj = map.get(Baggage.Amnet.KEY_SUB_TARGET_TYPE);
            if (obj != null && (obj instanceof String)) {
                universal.alice.add(PbHelper.newStrStrItem("subTargetType", (String) obj));
            }
            Object obj2 = map.get(Baggage.Amnet.KEY_CHECK_CERT);
            if (obj2 == null || !(obj2 instanceof String)) {
                return;
            }
            StrBinItem strBinItem = new StrBinItem();
            strBinItem.key = "cfg-params";
            HashMap hashMap = new HashMap();
            hashMap.put(Baggage.Amnet.KEY_CHECK_CERT, (String) obj2);
            strBinItem.val = b(hashMap);
            universal.bob.add(strBinItem);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        byte[] common = this.b.getCommon("/setting-cfg");
        Universal universal = new Universal();
        universal.bob = new LinkedList();
        StrBinItem strBinItem = new StrBinItem();
        if (common != null && common.length > 0) {
            strBinItem.key = "/setting-cfg";
            strBinItem.val = ByteString.of(common);
            universal.bob.add(strBinItem);
        }
        byte[] secure = this.b.getSecure("/mmtp-did");
        if (secure != null && secure.length > 0) {
            StrBinItem strBinItem2 = new StrBinItem();
            strBinItem2.key = "/mmtp-did";
            strBinItem2.val = ByteString.of(secure);
            universal.bob.add(strBinItem2);
        }
        byte[] byteArray = universal.toByteArray();
        if (byteArray == null || byteArray.length <= 0) {
            return;
        }
        Bifrost.setCfg(byteArray);
    }

    private void a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
            return;
        }
        Universal universal = new Universal();
        universal.bob = new LinkedList();
        StrBinItem strBinItem = new StrBinItem();
        if (bArr != null && bArr.length > 0) {
            strBinItem.key = str;
            strBinItem.val = ByteString.of(bArr);
            universal.bob.add(strBinItem);
        } else {
            Bifrost.a("WARN", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "no dict data, remove the dict id in file");
            this.b.removeCommon("zstd_config_storage_key");
            strBinItem.key = "zstd.data";
            strBinItem.val = StrBinItem.DEFAULT_VAL;
            universal.bob.add(strBinItem);
        }
        byte[] byteArray = universal.toByteArray();
        if (byteArray == null || byteArray.length <= 0) {
            return;
        }
        Bifrost.setCfg(byteArray);
    }

    private void a(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null || map2.isEmpty()) {
            AppLogicICallBackImpl.getInstance().setUserId("");
            return;
        }
        String str = map2.get("userId");
        if (StringUtils.isEmpty(str)) {
            AppLogicICallBackImpl.getInstance().setUserId("");
        } else {
            AppLogicICallBackImpl.getInstance().setUserId(str);
        }
    }

    private Linkage.Touching i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Touching) ipChange.ipc$dispatch("e46e0825", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new i(new Class[0]).a(bArr, Universal.class);
            Linkage.Touching touching = new Linkage.Touching();
            touching.yesLnk = true;
            touching.msDns = Double.NaN;
            touching.msTcp = Double.NaN;
            touching.msAttempt = Double.NaN;
            for (StrStrItem strStrItem : universal.alice) {
                if (strStrItem.key != null) {
                    if (strStrItem.key.equalsIgnoreCase("/proxy")) {
                        touching.proxy = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/network")) {
                        touching.network = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/netname")) {
                        touching.netname = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ip-local")) {
                        touching.ipLocal = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ip-remote")) {
                        touching.ipRemote = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ip-server")) {
                        touching.ipServer = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/port-local")) {
                        touching.portLocal = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/port-remote")) {
                        touching.portRemote = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/port-server")) {
                        touching.portServer = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-dns")) {
                        long a2 = a(strStrItem.key, strStrItem.val);
                        if (a2 >= 0) {
                            touching.msDns = a2;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-tcp")) {
                        long a3 = a(strStrItem.key, strStrItem.val);
                        if (a3 >= 0) {
                            touching.msTcp = a3;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-attempt")) {
                        long a4 = a(strStrItem.key, strStrItem.val);
                        if (a4 >= 0) {
                            touching.msAttempt = a4;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/conn-reason")) {
                        touching.reason = b(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/count-attempt")) {
                        touching.cntAttempt = b(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/cid")) {
                        touching.cid = a(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase(DinamicxNativeConfig.TARGETTYPE)) {
                        if (1 == b(strStrItem.key, strStrItem.val)) {
                            touching.isUseHttp2 = true;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("channelSelect")) {
                        touching.channelSelect = b(strStrItem.key, strStrItem.val);
                    }
                }
            }
            return touching;
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a connect-information.");
            return null;
        }
    }

    private Linkage.Separating j(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Separating) ipChange.ipc$dispatch("e8bf1e47", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new i(new Class[0]).a(bArr, Universal.class);
            Linkage.Separating separating = new Linkage.Separating();
            separating.yesSsl = true;
            separating.msSsl = Double.NaN;
            separating.msLife = Double.NaN;
            separating.msFirst = Double.NaN;
            for (StrStrItem strStrItem : universal.alice) {
                if (strStrItem.key != null) {
                    if (strStrItem.key.equalsIgnoreCase("/ssl-fast")) {
                        separating.fast = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/ssl-ticket")) {
                        separating.ticket = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/ssl-standard")) {
                        separating.standard = d(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-ssl")) {
                        long a2 = a(strStrItem.key, strStrItem.val);
                        if (a2 >= 0) {
                            separating.msSsl = a2;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-life")) {
                        long a3 = a(strStrItem.key, strStrItem.val);
                        if (a3 >= 0) {
                            separating.msLife = a3;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/ms-first")) {
                        long a4 = a(strStrItem.key, strStrItem.val);
                        if (a4 >= 0) {
                            separating.msFirst = a4;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/errCode")) {
                        separating.codeErr = b(strStrItem.key, strStrItem.val);
                        separating.yesErr = true;
                    } else if (strStrItem.key.equalsIgnoreCase("/errInf")) {
                        separating.infErr = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("/certificate")) {
                        separating.extMsg = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase("mtag")) {
                        separating.mtag = strStrItem.val;
                    } else if (strStrItem.key.equalsIgnoreCase(DinamicxNativeConfig.TARGETTYPE)) {
                        if (1 == b(strStrItem.key, strStrItem.val)) {
                            separating.isUseHttp2 = true;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("channelSelect")) {
                        separating.channelSelect = b(strStrItem.key, strStrItem.val);
                    }
                }
            }
            for (StrBinItem strBinItem : universal.bob) {
                if (strBinItem.key != null && strBinItem.val != null && strBinItem.key.equalsIgnoreCase("/heartbeat")) {
                    separating.infHb = l(strBinItem.val.toByteArray());
                    separating.cntHb = separating.infHb.length;
                }
            }
            return separating;
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a disconnect-information.");
            return null;
        }
    }

    private Linkage.Keeping k(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage.Keeping) ipChange.ipc$dispatch("e42093b3", new Object[]{this, bArr});
        }
        Linkage.Keeping keeping = new Linkage.Keeping();
        i iVar = new i(new Class[0]);
        keeping.stamp = -1L;
        keeping.interval = -1;
        keeping.rtt = Double.NaN;
        keeping.sReal = -1;
        try {
            for (StrStrItem strStrItem : ((Universal) iVar.a(bArr, Universal.class)).alice) {
                if (strStrItem.key != null) {
                    if (strStrItem.key.equalsIgnoreCase("/stamp")) {
                        keeping.stamp = a(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/RTT")) {
                        long a2 = a(strStrItem.key, strStrItem.val);
                        if (a2 >= 0) {
                            keeping.rtt = a2;
                        }
                    } else if (strStrItem.key.equalsIgnoreCase("/interval")) {
                        keeping.interval = b(strStrItem.key, strStrItem.val);
                    } else if (strStrItem.key.equalsIgnoreCase("/actual")) {
                        keeping.sReal = b(strStrItem.key, strStrItem.val);
                    }
                }
            }
            return keeping;
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a heartbeat-information.");
            return keeping;
        }
    }

    private Linkage.Keeping[] l(byte[] bArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Linkage.Keeping[]) ipChange.ipc$dispatch("5928c831", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new i(new Class[0]).a(bArr, Universal.class);
            Linkage.Keeping[] keepingArr = new Linkage.Keeping[universal.bob.size()];
            for (StrBinItem strBinItem : universal.bob) {
                if (strBinItem.val != null) {
                    keepingArr[i] = k(strBinItem.val.toByteArray());
                    i++;
                }
            }
            return keepingArr;
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of heartbeat-information.");
            return null;
        }
    }

    private Channel.Obtaining m(byte[] bArr) {
        long j;
        Iterator<StrStrItem> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Channel.Obtaining) ipChange.ipc$dispatch("8273c597", new Object[]{this, bArr});
        }
        try {
            Universal universal = (Universal) new i(new Class[0]).a(bArr, Universal.class);
            Channel.Obtaining obtaining = new Channel.Obtaining();
            obtaining.msCall = Double.NaN;
            obtaining.msPassToNative = Double.NaN;
            obtaining.msSend = Double.NaN;
            obtaining.msRead = Double.NaN;
            obtaining.msPassFromNative = Double.NaN;
            obtaining.msCaller = Double.NaN;
            obtaining.msCalling = Double.NaN;
            obtaining.msConfirm = Double.NaN;
            obtaining.msAir = Double.NaN;
            obtaining.msAmnetAllTime = Double.NaN;
            obtaining.msNtIO = Double.NaN;
            obtaining.msQueueOut = Double.NaN;
            obtaining.msHung = Double.NaN;
            obtaining.msEncode = Double.NaN;
            long nanoTime = System.nanoTime();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<StrStrItem> it2 = universal.alice.iterator();
            long j2 = -1;
            long j3 = -1;
            long j4 = -1;
            long j5 = -1;
            long j6 = -1;
            long j7 = -1;
            long j8 = -1;
            long j9 = -1;
            while (it2.hasNext()) {
                StrStrItem next = it2.next();
                if (next.key != null) {
                    it = it2;
                    if (next.key.equalsIgnoreCase("receipt")) {
                        obtaining.receipt = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("channel")) {
                        obtaining.channel = c(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("moment")) {
                        j2 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("arrive")) {
                        j3 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("time-queue")) {
                        j7 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("time-amnet")) {
                        j4 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-hang")) {
                        j8 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-ack")) {
                        j5 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-send")) {
                        j9 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("ms-air")) {
                        j6 = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("retried")) {
                        obtaining.retried = d(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("oneshot")) {
                        obtaining.oneshot = d(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("useShort")) {
                        obtaining.useshort = d(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("rcvRaw")) {
                        obtaining.lenRaw = b(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("rcvPkg")) {
                        obtaining.lenPkg = b(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("rcvZip")) {
                        obtaining.rspZipType = b(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("sendZip")) {
                        obtaining.reqZipType = b(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("mtag")) {
                        obtaining.mtag = next.val;
                    } else if (next.key.equalsIgnoreCase("/cid")) {
                        obtaining.cid = a(next.key, next.val);
                    } else if (next.key.equalsIgnoreCase("targetHost")) {
                        obtaining.targetHost = next.val;
                    } else if (next.key.equalsIgnoreCase("targetHostShort")) {
                        obtaining.targetHostShort = next.val;
                    } else if (next.key.equalsIgnoreCase(DinamicxNativeConfig.TARGETTYPE)) {
                        if (1 == b(next.key, next.val)) {
                            obtaining.isUseHttp2 = true;
                        }
                    } else if (next.key.equalsIgnoreCase("ip_stack")) {
                        obtaining.ipStack = b(next.key, next.val);
                    }
                } else {
                    it = it2;
                }
                it2 = it;
            }
            for (StrBinItem strBinItem : universal.bob) {
                if (strBinItem.key != null && strBinItem.val != null) {
                    if (strBinItem.key.equalsIgnoreCase("header")) {
                        obtaining.header = b(strBinItem.key, strBinItem.val.toByteArray());
                    } else if (strBinItem.key.equalsIgnoreCase(AgooConstants.MESSAGE_BODY)) {
                        obtaining.body = strBinItem.val.toByteArray();
                    }
                }
            }
            if (obtaining.body == null) {
                obtaining.body = new byte[0];
            }
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i < 0 || j3 < 0 || j3 < j2) {
                j = currentTimeMillis;
            } else {
                j = currentTimeMillis;
                obtaining.msCall = (j3 - j2) / 1000000.0d;
            }
            if (i >= 0 && nanoTime >= 0 && nanoTime >= j2) {
                obtaining.msCaller = (nanoTime - j2) / 1000000.0d;
            }
            if (j3 >= 0 && nanoTime >= 0 && nanoTime >= j3) {
                obtaining.msCalling = (nanoTime - j3) / 1000000.0d;
            }
            if (j4 >= 0 && j >= 0 && j >= j4) {
                obtaining.msAmnetAllTime = j - j4;
            }
            long j10 = j7;
            if (j10 >= 0) {
                long j11 = j8;
                if (j11 >= 0) {
                    obtaining.msQueueOut = j11;
                    obtaining.msQueneStorage = j10 + "-0";
                }
            }
            long j12 = j6;
            if (j12 >= 0) {
                obtaining.msAir = j12;
            }
            long j13 = j5;
            if (j13 >= 0) {
                obtaining.msConfirm = j13;
            } else {
                obtaining.msConfirm = obtaining.msAir;
            }
            long j14 = j9;
            if (j14 >= 0) {
                obtaining.msHung = j14;
            }
            return obtaining;
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a data-package.");
            return null;
        }
    }

    private Map<String, String> b(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcb9be2f", new Object[]{this, str, bArr});
        }
        TreeMap treeMap = new TreeMap();
        try {
            for (StrStrItem strStrItem : ((Universal) new i(new Class[0]).a(bArr, Universal.class)).alice) {
                if (strStrItem.key != null) {
                    treeMap.put(strStrItem.key, strStrItem.val);
                }
            }
            return treeMap;
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to decode the PB of a KV. (key=\"" + str + "\")");
            return treeMap;
        }
    }

    private long a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d70", new Object[]{this, str, str2})).longValue();
        }
        try {
            return Long.parseLong(str2);
        } catch (Throwable unused) {
            Bifrost.a("ERROR", AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "Fail to parse a integer. (key=\"" + str + "\", value=\"" + str2 + "\")");
            return -1L;
        }
    }

    private int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{this, str, str2})).intValue() : (int) a(str, str2);
    }

    private byte c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f277e36a", new Object[]{this, str, str2})).byteValue() : (byte) a(str, str2);
    }

    private boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{this, str, str2})).booleanValue() : a(str, str2) > 0;
    }

    private static ByteString b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("c5a709e7", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        Universal universal = new Universal();
        universal.alice = new LinkedList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                StrStrItem strStrItem = new StrStrItem();
                strStrItem.key = key;
                if (!StringUtils.equals(Baggage.Amnet.CFG_CA, key)) {
                    strStrItem.val = a(entry.getValue());
                } else {
                    strStrItem.val = entry.getValue();
                }
                universal.alice.add(strStrItem);
            }
        }
        return ByteString.of(universal.toByteArray());
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (!trim.isEmpty()) {
            return trim;
        }
        return null;
    }

    private static String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{str});
        }
        String[] strArr = new String[2];
        if (!StringUtils.isEmpty(str)) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                strArr[0] = str.trim();
            } else {
                strArr[0] = str.substring(0, indexOf).trim();
                strArr[1] = str.substring(indexOf + 1).trim();
            }
            if (strArr[0].length() == 0) {
                strArr[0] = null;
            }
            if (strArr[1] != null && strArr[1].length() == 0) {
                strArr[1] = null;
            }
        }
        return strArr;
    }

    private void c(Map<String, Object> map) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (map != null) {
            try {
                Object remove = map.remove(Baggage.Amnet.KEY_BIND_HOSTS);
                if (remove == null) {
                    return;
                }
                if (!(remove instanceof Map)) {
                    LogCatUtil.info(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "[setBindedHostsInfo] Illage object type is : " + remove.getClass().getName());
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : ((Map) remove).entrySet()) {
                    if (!StringUtils.isEmpty((CharSequence) entry.getKey()) && (pair = (Pair) entry.getValue()) != null && !StringUtils.isEmpty((CharSequence) pair.first)) {
                        String str = ((String) pair.first) + ":" + pair.second;
                        StnLogic.setDebugIP((String) entry.getKey(), str);
                        sb.append((String) entry.getKey());
                        sb.append("=");
                        sb.append(str);
                        sb.append(",");
                    }
                }
                if (sb.length() <= 0) {
                    return;
                }
                LogCatUtil.info(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "[setBindedHostsInfo] Finished. hosts info = [" + sb.toString() + riy.ARRAY_END_STR);
            } catch (Throwable th) {
                LogCatUtil.error(AmnetTunnelManager.LOG_VAL_BIFROST_LIB, "[setBindedHostsInfo] Exception: " + th.toString(), th);
            }
        }
    }

    private static String b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)}) : String.valueOf(j);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : String.valueOf(i);
    }

    private static String a(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3af7cdcc", new Object[]{new Byte(b)}) : String.valueOf((int) b);
    }
}
