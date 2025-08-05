package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.taobao.windvane.connect.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.j;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.n;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.ddn;
import tb.ddq;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class Message implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BINDAPP_V1 = "1";
    public static final String BINDAPP_V2 = "2";
    public static int CONTROL_MAX_RETRY_TIMES = 0;
    public static final int EXT_HEADER_VALUE_MAX_LEN = 1023;
    public static final int FLAG_ACK_TYPE = 32;
    public static final int FLAG_BIZ_RET = 64;
    public static final int FLAG_DATA_TYPE = 32768;
    public static final int FLAG_ERR = 4096;
    public static final int FLAG_REQ_BIT1 = 16384;
    public static final int FLAG_REQ_BIT2 = 8192;
    public static final int FLAG_RET = 2048;
    public static final String KEY_BINDAPP = "ctrl_bindapp";
    public static final String KEY_BINDSERVICE = "ctrl_bindservice";
    public static final String KEY_BINDUSER = "ctrl_binduser";
    public static final String KEY_UNBINDAPP = "ctrl_unbindapp";
    public static final String KEY_UNBINDSERVICE = "ctrl_unbindservice";
    public static final String KEY_UNBINDUSER = "ctrl_unbinduser";
    public static final int MAX_RETRY_TIMES = 3;
    private static final String TAG = "Msg";
    public static long baseMessageId;
    public long accsUpTime;
    public String cunstomDataId;
    public byte[] data;
    public String dataId;
    public short dataLength;
    public Map<Integer, String> extHeader;
    public short extHeaderLength;
    public short flags;
    public URL host;
    public Id msgId;
    public transient NetPerformanceMonitor netPerformanceMonitor;
    public int node;
    public long sendEndTime;
    public long sendTime;
    public String source;
    public byte sourceLength;
    public long startSendTime;
    public String target;
    public byte targetLength;
    public short totalLength;
    public boolean isAck = false;
    public boolean force = false;
    public boolean isCancel = false;
    public byte compress = 0;
    public byte noUse = 0;
    public int type = -1;
    public String packageName = null;
    public Integer command = null;
    public Integer updateDevice = 0;
    public String appKey = null;
    public String appSign = null;
    public Integer osType = null;
    public String osVersion = null;
    public String venderOsName = null;
    public String venderOsVersion = null;
    public String exts = null;
    public String appVersion = null;
    public Integer sdkVersion = null;
    public String ttid = null;
    public String macAddress = null;
    public String userinfo = null;
    public String serviceId = null;
    public String model = null;
    public String brand = null;
    public String imei = null;
    public String imsi = null;
    public String notifyEnable = null;
    public long delyTime = 0;
    public int retryTimes = 0;
    public int timeout = 40000;
    public String bizId = null;
    public String tag = null;

    /* loaded from: classes.dex */
    public static class MsgResType implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        static {
            kge.a(-1932792463);
            kge.a(1028243835);
        }

        public static String name(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e783c90f", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? e.DEFAULT_HTTPS_ERROR_INVALID : "NEED_ACK" : "NO_ACK";
        }

        public static int valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c8593527", new Object[]{new Integer(i)})).intValue();
            }
            if (i == 0) {
                return 0;
            }
            if (i != 1) {
            }
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class MsgType implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        static {
            kge.a(-1980737245);
            kge.a(1028243835);
        }

        public static String name(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e783c90f", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? e.DEFAULT_HTTPS_ERROR_INVALID : "HANDSHAKE" : "PING" : "DATA" : "CONTROL";
        }

        public static int valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c8593527", new Object[]{new Integer(i)})).intValue();
            }
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 1;
            }
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? DATA : RES : REQ : ACK : DATA;
        }
    }

    static {
        kge.a(1265875852);
        kge.a(1028243835);
        CONTROL_MAX_RETRY_TIMES = 5;
        baseMessageId = 1L;
    }

    /* loaded from: classes.dex */
    public static class Id implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String dataId;
        private int id;

        static {
            kge.a(1894685011);
            kge.a(1028243835);
        }

        public Id(int i, String str) {
            this.id = i;
            this.dataId = str;
        }

        public int getId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.id;
        }

        public String getDataId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bbd4c7e", new Object[]{this}) : this.dataId;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Id id = (Id) obj;
            return this.id == id.getId() || this.dataId.equals(id.getDataId());
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.dataId.hashCode();
        }
    }

    public Message() {
        synchronized (Message.class) {
            this.startSendTime = System.currentTimeMillis();
            this.dataId = this.startSendTime + "." + baseMessageId;
            long j = baseMessageId;
            baseMessageId = 1 + j;
            this.msgId = new Id((int) j, this.dataId);
        }
    }

    public int getNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("beb89ef2", new Object[]{this})).intValue() : this.node;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public String getDataId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bbd4c7e", new Object[]{this}) : this.dataId;
    }

    public boolean isControlFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f3edfe5", new Object[]{this})).booleanValue() : Constants.TARGET_CONTROL.equals(this.target);
    }

    public boolean isForeBgMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ae07827", new Object[]{this})).booleanValue() : Constants.TARGET_FORE.equals(this.target) || Constants.TARGET_BACK.equals(this.target);
    }

    public String getTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this}) : this.target;
    }

    public Id getMsgId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Id) ipChange.ipc$dispatch("be2cf18b", new Object[]{this}) : this.msgId;
    }

    public long getAccsUpTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f05232b", new Object[]{this})).longValue() : this.accsUpTime;
    }

    public void setAccsUpTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87653e1", new Object[]{this, new Long(j)});
        } else {
            this.accsUpTime = j;
        }
    }

    public void setSendTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be95486", new Object[]{this, new Long(j)});
        } else {
            this.sendTime = j;
        }
    }

    public long getSendTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe3a66e6", new Object[]{this})).longValue() : this.sendTime;
    }

    public long getSendEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6808afe5", new Object[]{this})).longValue() : this.sendEndTime;
    }

    public void setSendEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0a59ff", new Object[]{this, new Long(j)});
        } else {
            this.sendEndTime = j;
        }
    }

    public NetPerformanceMonitor getNetPermanceMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetPerformanceMonitor) ipChange.ipc$dispatch("6f04fb9e", new Object[]{this}) : this.netPerformanceMonitor;
    }

    public long getDelyTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cbdbef2c", new Object[]{this})).longValue() : this.delyTime;
    }

    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue() : this.retryTimes;
    }

    private String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return TAG + "_" + this.tag;
    }

    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        String str = this.packageName;
        return str == null ? "" : str;
    }

    public boolean isTimeOut() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93da6dc2", new Object[]{this})).booleanValue();
        }
        if ((System.currentTimeMillis() - this.startSendTime) + this.delyTime < this.timeout) {
            z = false;
        }
        if (z) {
            String tag = getTag();
            ALog.d(tag, "delay time:" + this.delyTime + " beforeSendTime:" + (System.currentTimeMillis() - this.startSendTime) + " timeout" + this.timeout, new Object[0]);
        }
        return z;
    }

    public byte[] build(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf4272ed", new Object[]{this, context, new Integer(i)}) : build(context, i, null, null);
    }

    public byte[] build(Context context, int i, Boolean bool, com.taobao.accs.net.c cVar) {
        byte[] bytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("17ca5380", new Object[]{this, context, new Integer(i), bool, cVar});
        }
        try {
            buildData();
        } catch (UnsupportedEncodingException e) {
            ALog.e(getTag(), "build2", e, new Object[0]);
        } catch (JSONException e2) {
            ALog.e(getTag(), "build1", e2, new Object[0]);
        }
        byte[] bArr = this.data;
        String str = bArr != null ? new String(bArr) : "";
        compressData();
        if (!this.isAck) {
            StringBuilder sb = new StringBuilder();
            sb.append(l.s(context) ? l.q(context) : UtilityImpl.getDeviceId(context));
            sb.append("|");
            sb.append(this.packageName);
            sb.append("|");
            String str2 = this.serviceId;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append("|");
            String str3 = this.userinfo;
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            this.source = sb.toString();
        }
        try {
            bytes = (this.dataId + "").getBytes("utf-8");
            this.sourceLength = (byte) this.source.getBytes("utf-8").length;
            this.targetLength = (byte) this.target.getBytes("utf-8").length;
        } catch (Exception e3) {
            e3.printStackTrace();
            ALog.e(getTag(), "build3", e3, new Object[0]);
            bytes = (this.dataId + "").getBytes();
            this.sourceLength = (byte) this.source.getBytes().length;
            this.targetLength = (byte) this.target.getBytes().length;
        }
        short extHeaderLen = getExtHeaderLen(this.extHeader);
        int length = this.targetLength + 3 + 1 + this.sourceLength + 1 + bytes.length;
        byte[] bArr2 = this.data;
        this.dataLength = (short) (length + (bArr2 == null ? 0 : bArr2.length) + extHeaderLen + 2);
        this.totalLength = (short) (this.dataLength + 2);
        j jVar = new j(this.totalLength + 2 + 4);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(getTag(), "Build Message", "dataId", new String(bytes));
        }
        try {
            jVar.a((byte) (this.compress | 32));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag = getTag();
                ALog.d(tag, "\tversion:2 compress:" + ((int) this.compress), new Object[0]);
            }
            if (i == 0) {
                jVar.a(Byte.MIN_VALUE);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(getTag(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                if (bool != null) {
                    if (bool.booleanValue()) {
                        jVar.a((byte) 80);
                    } else {
                        jVar.a((byte) 96);
                    }
                } else {
                    jVar.a((byte) 64);
                }
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(getTag(), "\tflag: 0x40", new Object[0]);
                }
            }
            jVar.a(this.totalLength);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag2 = getTag();
                ALog.d(tag2, "\ttotalLength:" + ((int) this.totalLength), new Object[0]);
            }
            jVar.a(this.dataLength);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag3 = getTag();
                ALog.d(tag3, "\tdataLength:" + ((int) this.dataLength), new Object[0]);
            }
            jVar.a(this.flags);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag4 = getTag();
                ALog.d(tag4, "\tflags:" + Integer.toHexString(this.flags), new Object[0]);
            }
            jVar.a(this.targetLength);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag5 = getTag();
                ALog.d(tag5, "\ttargetLength:" + ((int) this.targetLength), new Object[0]);
            }
            jVar.write(this.target.getBytes("utf-8"));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag6 = getTag();
                ALog.d(tag6, "\ttarget:" + this.target, new Object[0]);
            }
            jVar.a(this.sourceLength);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag7 = getTag();
                ALog.d(tag7, "\tsourceLength:" + ((int) this.sourceLength), new Object[0]);
            }
            jVar.write(this.source.getBytes("utf-8"));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag8 = getTag();
                ALog.d(tag8, "\tsource:" + this.source, new Object[0]);
            }
            jVar.a((byte) bytes.length);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag9 = getTag();
                ALog.d(tag9, "\tdataIdLength:" + bytes.length, new Object[0]);
            }
            jVar.write(bytes);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag10 = getTag();
                ALog.d(tag10, "\tdataId:" + new String(bytes), new Object[0]);
            }
            jVar.a(extHeaderLen);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag11 = getTag();
                ALog.d(tag11, "\textHeader len:" + ((int) extHeaderLen), new Object[0]);
            }
            if (this.extHeader != null) {
                for (Integer num : this.extHeader.keySet()) {
                    int intValue = num.intValue();
                    String str4 = this.extHeader.get(Integer.valueOf(intValue));
                    if (!TextUtils.isEmpty(str4)) {
                        jVar.a((short) ((((short) intValue) << 10) | ((short) (str4.getBytes("utf-8").length & 1023))));
                        jVar.write(str4.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            String tag12 = getTag();
                            ALog.d(tag12, "\textHeader key:" + intValue + " value:" + str4, new Object[0]);
                        }
                    }
                }
            }
            if (this.data != null) {
                jVar.write(this.data);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag13 = getTag();
                ALog.d(tag13, "\toriData:" + str, new Object[0]);
            }
            jVar.flush();
        } catch (IOException e4) {
            ALog.e(getTag(), "build4", e4, new Object[0]);
        }
        byte[] byteArray = jVar.toByteArray();
        try {
            jVar.close();
        } catch (IOException e5) {
            ALog.e(getTag(), "build5", e5, new Object[0]);
        }
        return byteArray;
    }

    public short getExtHeaderLen(Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        short s = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9da135e", new Object[]{this, map})).shortValue();
        }
        if (map != null) {
            try {
                for (Integer num : map.keySet()) {
                    String str = map.get(Integer.valueOf(num.intValue()));
                    if (!TextUtils.isEmpty(str)) {
                        s = (short) (s + ((short) (str.getBytes("utf-8").length & 1023)) + 2);
                    }
                }
            } catch (Exception e) {
                e.toString();
            }
        }
        return s;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public void compressData() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.accs.data.Message.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r6
            java.lang.String r2 = "a7ca5cb3"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            r0 = 0
            byte[] r1 = r6.data     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L18
            return
        L18:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L47
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L47
            byte[] r0 = r6.data     // Catch: java.lang.Throwable -> L41
            r3.write(r0)     // Catch: java.lang.Throwable -> L41
            r3.finish()     // Catch: java.lang.Throwable -> L41
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3a
            int r4 = r0.length     // Catch: java.lang.Throwable -> L41
            byte[] r5 = r6.data     // Catch: java.lang.Throwable -> L41
            int r5 = r5.length     // Catch: java.lang.Throwable -> L41
            if (r4 >= r5) goto L3a
            r6.data = r0     // Catch: java.lang.Throwable -> L41
            r6.compress = r2     // Catch: java.lang.Throwable -> L41
        L3a:
            r3.close()     // Catch: java.lang.Exception -> L40
            r1.close()     // Catch: java.lang.Exception -> L40
        L40:
            return
        L41:
            r0 = move-exception
            goto L54
        L43:
            r2 = move-exception
            r3 = r0
            r0 = r2
            goto L6f
        L47:
            r2 = move-exception
            r3 = r0
            r0 = r2
            goto L54
        L4b:
            r1 = move-exception
            r3 = r0
            r0 = r1
            r1 = r3
            goto L6f
        L50:
            r1 = move-exception
            r3 = r0
            r0 = r1
            r1 = r3
        L54:
            java.lang.String r2 = r6.getTag()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L6e
            android.util.Log.e(r2, r4)     // Catch: java.lang.Throwable -> L6e
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.lang.Exception -> L6d
        L67:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Exception -> L6d
        L6d:
            return
        L6e:
            r0 = move-exception
        L6f:
            if (r3 == 0) goto L74
            r3.close()     // Catch: java.lang.Exception -> L79
        L74:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Exception -> L79
        L79:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.Message.compressData():void");
    }

    public void buildData() throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c486bbf", new Object[]{this});
            return;
        }
        Integer num = this.command;
        if (num == null || num.intValue() == 100 || this.command.intValue() == 102) {
            return;
        }
        this.data = buidJsonObject().a().toString().getBytes("utf-8");
    }

    public i.a buidJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i.a) ipChange.ipc$dispatch("820d28d3", new Object[]{this});
        }
        return new i.a().a("command", this.command.intValue() == 100 ? null : this.command).a("appKey", this.appKey).a(Constants.KEY_OS_TYPE, this.osType).a("sign", this.appSign).a("sdkVersion", this.sdkVersion).a("appVersion", this.appVersion).a("ttid", this.ttid).a("model", this.model).a("brand", this.brand).a("imei", this.imei).a("imsi", this.imsi).a(Constants.KYE_MAC_ADDRESS, this.macAddress).a("os", this.osVersion).a(Constants.KEY_EXTS, this.exts);
    }

    public void printByte(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf784923", new Object[]{this, bArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!ALog.isPrintLog(ALog.Level.D)) {
            return;
        }
        ALog.d(getTag(), "len:" + bArr.length, new Object[0]);
        if (bArr.length >= 512) {
            return;
        }
        for (byte b : bArr) {
            sb.append(Integer.toHexString(b & 255));
            sb.append(" ");
        }
        if (!ALog.isPrintLog(ALog.Level.D)) {
            return;
        }
        ALog.d(getTag(), sb.toString(), new Object[0]);
    }

    public static Message BuildPing(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("29700363", new Object[]{new Boolean(z), new Integer(i)});
        }
        Message message = new Message();
        message.type = 2;
        message.command = 201;
        message.force = z;
        message.delyTime = i;
        return message;
    }

    public static Message buildMassMessage(String str, String str2, String str3, String str4, String str5, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("4ef93acf", new Object[]{str, str2, str3, str4, str5, context});
        }
        Message buildSendData = buildSendData(str4, str5, "", context, context.getPackageName(), new ACCSManager.AccsRequest("", Constants.TARGET_SERVICE_MASS, com.taobao.mass.a.a(context, str, str3, str2), ""));
        Object[] objArr = new Object[1];
        objArr[0] = buildSendData == null ? "null" : buildSendData.dataId;
        ALog.e(TAG, "buildMassMessage = ", objArr);
        return buildSendData;
    }

    public static Message buildEventMessage(int i, long j, String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("90f01fc8", new Object[]{new Integer(i), new Long(j), str, str2, context}) : buildSendData(str, str2, "", context, context.getPackageName(), new ACCSManager.AccsRequest("", Constants.TARGET_SERVICE_EVENT_COLLECT, ddn.a(context, i, j), ""));
    }

    public static Message buildSync(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("a04e7f37", new Object[]{str, str2, str3, str4, str5, new Integer(i), new Integer(i2)});
        }
        Message message = new Message();
        message.type(1, ReqType.REQ, 1);
        message.command = 100;
        message.target = Constants.TARGET_SYNC;
        message.userinfo = str5;
        message.packageName = str3;
        message.serviceId = str2;
        message.timeout = 10000;
        message.data = ddq.a(str2, str4, i, i2);
        setControlHost(str, message);
        ALog.e(TAG, "buildSync", "dataId", message.getDataId(), "serviceId", str2, "streamId", str4, "fromSeq", Integer.valueOf(i), "toSeq", Integer.valueOf(i2));
        return message;
    }

    public static Message buildForeground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("c26c7b17", new Object[]{str});
        }
        Message message = new Message();
        message.type(1, ReqType.DATA, 0);
        message.command = 100;
        message.target = Constants.TARGET_FORE;
        setControlHost(str, message);
        ALog.e(TAG, "buildFgId = ", message.dataId);
        return message;
    }

    public static Message buildAServerPingControl(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("c02a60fb", new Object[]{str, new Long(j)});
        }
        Message message = new Message();
        message.type(1, ReqType.DATA, 0);
        message.command = 100;
        message.target = Constants.TARGET_AServer_PING_CONTROL;
        setControlHost(str, message);
        message.data = String.valueOf(j).getBytes();
        ALog.e(TAG, "buildAServerPingControl ", "dataId", message.dataId, "secs", Long.valueOf(j / 1000));
        return message;
    }

    public static Message buildBackground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("d748654c", new Object[]{str});
        }
        Context context = GlobalClientInfo.getContext();
        Message message = new Message();
        if (l.f() && context != null && UtilityImpl.isChannelProcess(context) && !com.taobao.accs.connection.state.a.a().a(context)) {
            message.type(1, ReqType.DATA, 0);
            message.command = 100;
            message.target = Constants.TARGET_BACK_LIMIT;
            setControlHost(str, message);
            ALog.e(TAG, "buildBgLimitId = ", message.dataId);
            return message;
        }
        message.type(1, ReqType.DATA, 0);
        message.command = 100;
        message.target = Constants.TARGET_BACK;
        setControlHost(str, message);
        ALog.e(TAG, "buildBgId = ", message.dataId);
        return message;
    }

    public static Message buildHandshake(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("bd7c253f", new Object[]{str});
        }
        Message message = new Message();
        message.type(3, ReqType.DATA, 1);
        message.packageName = str;
        message.target = Constants.TARGET_CONTROL;
        message.command = 200;
        return message;
    }

    public static Message buildBindApp(String str, String str2, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("230f5545", new Object[]{str, str2, context, intent});
        }
        Message message = null;
        try {
            message = buildBindApp(context, str2, intent.getStringExtra("appKey"), intent.getStringExtra("app_sercet"), intent.getStringExtra("packageName"), intent.getStringExtra("ttid"), intent.getStringExtra("appVersion"));
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildBindApp", e.getMessage());
            return message;
        }
    }

    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("14b0b412", new Object[]{context, str, str2, str3, str4, str5, str6});
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.osType = 1;
        messageV2.osVersion = Build.VERSION.SDK_INT + "";
        messageV2.packageName = str4;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 1;
        messageV2.appKey = str2;
        String deviceId = UtilityImpl.getDeviceId(context);
        if (configByTag != null && 2 == configByTag.getSecurity()) {
            i = 0;
        }
        messageV2.appSign = UtilityImpl.getAppsign(context, str2, str3, deviceId, str, i);
        messageV2.sdkVersion = Integer.valueOf(Constants.SDK_VERSION_CODE);
        messageV2.appVersion = str6;
        messageV2.packageName = str4;
        messageV2.ttid = str5;
        messageV2.model = Build.MODEL;
        messageV2.brand = Build.BRAND;
        messageV2.cunstomDataId = KEY_BINDAPP;
        messageV2.tag = str;
        messageV2.exts = new i.a().a("notifyEnable", UtilityImpl.isNotificationEnabled(context)).a("romInfo", n.b().a()).a().toString();
        UtilityImpl.saveNotificationState(context, Constants.SP_FILE_NAME, UtilityImpl.isNotificationEnabled(context));
        return messageV2;
    }

    @Deprecated
    public static Message buildUnbindApp(com.taobao.accs.net.c cVar, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("a0962d6a", new Object[]{cVar, context, intent}) : buildUnbindApp(cVar.c(null), intent);
    }

    public static Message buildUnbindApp(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("ad61002e", new Object[]{str, intent});
        }
        Message message = null;
        try {
            message = buildUnbindApp(str, intent.getStringExtra("packageName"));
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildUnbindApp1", e.getMessage());
            return message;
        }
    }

    @Deprecated
    public static Message buildUnbindApp(com.taobao.accs.net.c cVar, Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("382c6cdf", new Object[]{cVar, context, str, str2, str3, str4}) : buildUnbindApp(cVar.c(null), str);
    }

    public static Message buildUnbindApp(String str, String str2) {
        MessageV2 messageV2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("3568dac1", new Object[]{str, str2});
        }
        try {
            ALog.d(TAG, "buildUnbindApp", new Object[0]);
        } catch (Exception e) {
            e = e;
            messageV2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        messageV2 = new MessageV2();
        try {
            messageV2.node = 1;
            messageV2.type(1, ReqType.DATA, 1);
            messageV2.packageName = str2;
            messageV2.target = Constants.TARGET_CONTROL;
            messageV2.command = 2;
            messageV2.packageName = str2;
            messageV2.sdkVersion = Integer.valueOf(Constants.SDK_VERSION_CODE);
            messageV2.cunstomDataId = KEY_UNBINDAPP;
            setControlHost(str, messageV2);
        } catch (Exception e2) {
            e = e2;
            ALog.e(TAG, "buildUnbindApp", e.getMessage());
            return messageV2;
        }
        return messageV2;
    }

    @Deprecated
    public static Message buildBindService(com.taobao.accs.net.c cVar, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("e46aa4bd", new Object[]{cVar, context, intent}) : buildBindService(cVar.c(null), cVar.o, intent);
    }

    public static Message buildBindService(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("c6642bf7", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildBindService(intent.getStringExtra("packageName"), intent.getStringExtra("serviceId"));
            message.tag = str2;
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildBindService", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    @Deprecated
    public static Message buildBindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("ce406f26", new Object[]{context, str, str2, str3, str4, str5, str6}) : buildBindService(str, str3);
    }

    public static Message buildBindService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("51abff94", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 5;
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.sdkVersion = Integer.valueOf(Constants.SDK_VERSION_CODE);
        messageV2.cunstomDataId = KEY_BINDSERVICE;
        return messageV2;
    }

    @Deprecated
    public static Message buildUnbindService(com.taobao.accs.net.c cVar, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("c670d556", new Object[]{cVar, context, intent}) : buildUnbindService(cVar.c(null), cVar.o, intent);
    }

    public static Message buildUnbindService(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e683ba10", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildUnbindService(intent.getStringExtra("packageName"), intent.getStringExtra("serviceId"));
            message.tag = str2;
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildUnbindService", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    @Deprecated
    public static Message buildUnbindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("1838f52d", new Object[]{context, str, str2, str3, str4, str5, str6}) : buildUnbindService(str, str3);
    }

    public static Message buildUnbindService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("ff5f08ad", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 6;
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.sdkVersion = Integer.valueOf(Constants.SDK_VERSION_CODE);
        messageV2.cunstomDataId = KEY_UNBINDSERVICE;
        return messageV2;
    }

    @Deprecated
    public static Message buildBindUser(com.taobao.accs.net.c cVar, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("519e9c71", new Object[]{cVar, context, intent}) : buildBindUser(cVar.c(null), cVar.o, intent);
    }

    public static Message buildBindUser(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("1da711ab", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildBindUser(intent.getStringExtra("packageName"), intent.getStringExtra("userInfo"));
            if (message != null) {
                message.tag = str2;
                setControlHost(str, message);
            }
        } catch (Exception e) {
            ALog.e(TAG, "buildBindUser", e, new Object[0]);
            e.printStackTrace();
        }
        return message;
    }

    @Deprecated
    public static Message buildBindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("11ba5c3c", new Object[]{context, str, str2, str3, str4, str5}) : buildBindUser(str, str4);
    }

    public static Message buildBindUser(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("59ebc148", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.userinfo = str2;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 3;
        messageV2.packageName = str;
        messageV2.userinfo = str2;
        messageV2.sdkVersion = Integer.valueOf(Constants.SDK_VERSION_CODE);
        messageV2.cunstomDataId = KEY_BINDUSER;
        return messageV2;
    }

    @Deprecated
    public static Message buildUnbindUser(com.taobao.accs.net.c cVar, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("7c4ada78", new Object[]{cVar, context, intent}) : buildUnbindUser(cVar.c(null), cVar.o, intent);
    }

    public static Message buildUnbindUser(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e472e232", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildUnbindUser(intent.getStringExtra("packageName"));
            message.tag = str2;
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildUnbindUser", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    @Deprecated
    public static Message buildUnbindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("98a3fd5", new Object[]{context, str, str2, str3, str4, str5}) : buildUnbindUser(str);
    }

    public static Message buildUnbindUser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("ebb8ec59", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 4;
        messageV2.sdkVersion = Integer.valueOf(Constants.SDK_VERSION_CODE);
        messageV2.cunstomDataId = KEY_UNBINDUSER;
        return messageV2;
    }

    @Deprecated
    public static Message buildSendData(com.taobao.accs.net.c cVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("b491bdeb", new Object[]{cVar, context, str, str2, accsRequest}) : buildSendData(cVar.c(null), cVar.o, cVar.j.getStoreId(), context, str, accsRequest, true);
    }

    @Deprecated
    public static Message buildSendData(com.taobao.accs.net.c cVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("2be271f3", new Object[]{cVar, context, str, str2, accsRequest, new Boolean(z)}) : buildSendData(cVar.c(null), cVar.o, cVar.j.getStoreId(), context, str, accsRequest, z);
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("a2a8b4f", new Object[]{str, str2, str3, context, str4, accsRequest}) : buildSendData(str, str2, str3, context, str4, accsRequest, true);
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("8963510f", new Object[]{str, str2, str3, context, str4, accsRequest, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.node = 1;
        message.type(1, ReqType.DATA, 1);
        message.command = 100;
        message.packageName = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.data = accsRequest.data;
        String str5 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.TARGET_SERVICE_PRE);
        sb.append(str5);
        sb.append("|");
        sb.append(accsRequest.target == null ? "" : accsRequest.target);
        message.target = sb.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        if (accsRequest.timeout > 0) {
            message.timeout = accsRequest.timeout;
        }
        if (z) {
            setUnit(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        fillExtHeader(context, message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.mCookieSec, accsRequest);
        try {
            if (ACCSClient.getAccsClient(str2).isAccsConnected()) {
                message.netPerformanceMonitor = new NetPerformanceMonitor();
                message.netPerformanceMonitor.setDataId(message.getMsgId().getDataId());
                message.netPerformanceMonitor.setServiceId(accsRequest.serviceId);
                message.netPerformanceMonitor.setHost(message.host.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        message.tag = str2;
        return message;
    }

    public void putSendTimeInExt(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafaba5", new Object[]{this, new Long(j)});
            return;
        }
        if (this.extHeader == null) {
            this.extHeader = new HashMap();
        }
        Map<Integer, String> map = this.extHeader;
        map.put(32, j + "");
    }

    @Deprecated
    public static Message buildRequest(com.taobao.accs.net.c cVar, Context context, String str, String str2, String str3, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("88a1bae8", new Object[]{cVar, context, str, str2, str3, accsRequest, new Boolean(z)}) : buildRequest(context, cVar.c(null), cVar.o, cVar.j.getStoreId(), str, str2, accsRequest, z);
    }

    public static Message buildRequest(Context context, String str, String str2, String str3, String str4, String str5, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("6675a86a", new Object[]{context, str, str2, str3, str4, str5, accsRequest, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.node = 1;
        message.type(1, ReqType.REQ, 1);
        message.command = 100;
        message.packageName = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.data = accsRequest.data;
        String str6 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(str6);
        sb.append("|");
        sb.append(accsRequest.target == null ? "" : accsRequest.target);
        message.target = sb.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        message.tag = str2;
        if (accsRequest.timeout > 0) {
            message.timeout = accsRequest.timeout;
        }
        if (z) {
            setUnit(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        fillExtHeader(context, message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.mCookieSec, accsRequest);
        try {
            if (ACCSClient.getAccsClient(str2).isAccsConnected()) {
                message.netPerformanceMonitor = new NetPerformanceMonitor();
                message.netPerformanceMonitor.setDataId(message.getMsgId().getDataId());
                message.netPerformanceMonitor.setServiceId(accsRequest.serviceId);
                message.netPerformanceMonitor.setHost(message.host.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        message.tag = str2;
        return message;
    }

    private static void setUnit(String str, Message message, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a67abd", new Object[]{str, message, accsRequest});
        } else if (accsRequest.host == null) {
            try {
                message.host = new URL(str);
            } catch (MalformedURLException e) {
                ALog.e(TAG, "setUnit", e, new Object[0]);
                e.printStackTrace();
            }
        } else {
            message.host = accsRequest.host;
        }
    }

    private static void setControlHost(String str, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e77f97", new Object[]{str, message});
            return;
        }
        try {
            message.host = new URL(str);
        } catch (Exception e) {
            ALog.e(TAG, "setControlHost", e, new Object[0]);
        }
    }

    @Deprecated
    public static Message buildPushAck(com.taobao.accs.net.c cVar, String str, String str2, String str3, boolean z, short s, String str4, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("b5955767", new Object[]{cVar, str, str2, str3, new Boolean(z), new Short(s), str4, map}) : buildPushAck(cVar.c(null), cVar.o, str, str2, str3, z, s, str4, map);
    }

    public static Message buildPushAck(String str, String str2, String str3, String str4, String str5, boolean z, short s, String str6, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("83994491", new Object[]{str, str2, str3, str4, str5, new Boolean(z), new Short(s), str6, map});
        }
        Message message = new Message();
        message.node = 1;
        message.setPushAckFlag(s, z);
        message.source = str3;
        message.target = str4;
        message.dataId = str5;
        message.isAck = true;
        message.extHeader = map;
        try {
            if (TextUtils.isEmpty(str6)) {
                message.host = new URL(str);
            } else {
                message.host = new URL(str6);
            }
            message.tag = str2;
            if (message.host == null) {
                message.host = new URL(str);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return message;
    }

    public static Message buildParameterError(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("efa03614", new Object[]{str, new Integer(i)});
        }
        Message message = new Message();
        message.type(1, ReqType.ACK, 0);
        message.command = Integer.valueOf(i);
        message.packageName = str;
        return message;
    }

    private static void fillExtHeader(Context context, Message message, String str, String str2, String str3, String str4, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61bbf96", new Object[]{context, message, str, str2, str3, str4, accsRequest});
            return;
        }
        if (!TextUtils.isEmpty(accsRequest.businessId) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(accsRequest.tag) || str4 != null) {
            message.extHeader = new HashMap();
            if (accsRequest.businessId != null && UtilityImpl.getByteLen(accsRequest.businessId) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), accsRequest.businessId);
            }
            if (str != null && UtilityImpl.getByteLen(str) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
            }
            if (str2 != null && UtilityImpl.getByteLen(str2) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
            }
            if (accsRequest.tag != null && UtilityImpl.getByteLen(accsRequest.tag) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), accsRequest.tag);
            }
            if (str4 != null && UtilityImpl.getByteLen(str4) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
            }
            if (str3 != null && UtilityImpl.getByteLen(str3) <= 1023) {
                message.extHeader.put(19, str3);
            }
        }
        try {
            Map<Integer, String> ext = accsRequest.getExt();
            if (ext == null || ext.size() <= 0 || !ext.containsKey(35)) {
                return;
            }
            if (message.extHeader == null) {
                message.extHeader = new HashMap();
            }
            message.extHeader.put(35, ext.get(35));
        } catch (Throwable th) {
            ALog.e(TAG, "fillExtHeader err", th, new Object[0]);
            d.a("accs", BaseMonitor.COUNT_VERIFY, "fillExtHeader", mto.a.GEO_NOT_SUPPORT);
        }
    }

    private void type(int i, ReqType reqType, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a9e492", new Object[]{this, new Integer(i), reqType, new Integer(i2)});
            return;
        }
        this.type = i;
        if (i == 2) {
            return;
        }
        this.flags = (short) (((((i & 1) << 4) | (reqType.ordinal() << 2)) | i2) << 11);
    }

    private void setPushAckFlag(short s, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c05547", new Object[]{this, new Short(s), new Boolean(z)});
            return;
        }
        this.type = 1;
        this.flags = s;
        this.flags = (short) (this.flags & (-16385));
        this.flags = (short) (this.flags | 8192);
        this.flags = (short) (this.flags & (-2049));
        this.flags = (short) (this.flags & (-65));
        if (!z) {
            return;
        }
        this.flags = (short) (this.flags | 32);
    }

    public boolean noTimeoutRequired() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3807992a", new Object[]{this})).booleanValue() : Constants.TARGET_AServer_PING_CONTROL.equals(this.target);
    }
}
