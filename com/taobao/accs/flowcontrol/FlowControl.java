package com.taobao.accs.flowcontrol;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class FlowControl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DELAY_MAX = -1;
    public static final int DELAY_MAX_BRUSH = -1000;
    public static final int HIGH_FLOW_CTRL = 2;
    public static final int HIGH_FLOW_CTRL_BRUSH = 3;
    public static final int LOW_FLOW_CTRL = 1;
    public static final int NO_FLOW_CTRL = 0;
    public static final String SERVICE_ALL = "ALL";
    public static final String SERVICE_ALL_BRUSH = "ALL_BRUSH";
    public static final int STATUS_FLOW_CTRL_ALL = 420;
    public static final int STATUS_FLOW_CTRL_BRUSH = 422;
    public static final int STATUS_FLOW_CTRL_CUR = 421;

    /* renamed from: a  reason: collision with root package name */
    private Context f8240a;
    private FlowCtrlInfoHolder b;

    static {
        kge.a(-1268995259);
    }

    public FlowControl(Context context) {
        this.f8240a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0136 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:47:0x0136, B:48:0x0153, B:44:0x0124, B:52:0x015d), top: B:78:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.util.Map<java.lang.Integer, java.lang.String> r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.a(java.util.Map, java.lang.String):int");
    }

    private boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        if (j != 0 && j2 > 0) {
            return true;
        }
        ALog.e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0105, TryCatch #0 {, blocks: (B:14:0x0038, B:16:0x0057, B:19:0x005e, B:22:0x0064, B:25:0x006b, B:28:0x0071, B:31:0x0078, B:34:0x007e, B:37:0x0085, B:58:0x00b1, B:63:0x00bf, B:64:0x00c2, B:61:0x00b9), top: B:71:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[Catch: all -> 0x0105, TryCatch #0 {, blocks: (B:14:0x0038, B:16:0x0057, B:19:0x005e, B:22:0x0064, B:25:0x006b, B:28:0x0071, B:31:0x0078, B:34:0x007e, B:37:0x0085, B:58:0x00b1, B:63:0x00bf, B:64:0x00c2, B:61:0x00b9), top: B:71:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[Catch: all -> 0x0105, TryCatch #0 {, blocks: (B:14:0x0038, B:16:0x0057, B:19:0x005e, B:22:0x0064, B:25:0x006b, B:28:0x0071, B:31:0x0078, B:34:0x007e, B:37:0x0085, B:58:0x00b1, B:63:0x00bf, B:64:0x00c2, B:61:0x00b9), top: B:71:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.a(java.lang.String, java.lang.String):long");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.b;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null) {
            return;
        }
        synchronized (this) {
            Iterator<Map.Entry<String, FlowControlInfo>> it = this.b.flowCtrlMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().isExpired()) {
                    it.remove();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class FlowControlInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        static {
            kge.a(1091465758);
            kge.a(1028243835);
        }

        public FlowControlInfo(String str, String str2, int i, long j, long j2, long j3) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i;
            this.delayTime = j;
            long j4 = 0;
            this.expireTime = j2 <= 0 ? 0L : j2;
            this.startTime = j3 > 0 ? j3 : j4;
        }

        public boolean isExpired() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue() : System.currentTimeMillis() - (this.startTime + this.expireTime) > 0;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("flow ctrl serviceId:");
            stringBuffer.append(this.serviceId);
            stringBuffer.append(" bizId:");
            stringBuffer.append(this.bizId);
            stringBuffer.append(" status:");
            stringBuffer.append(this.status);
            stringBuffer.append(" delayTime:");
            stringBuffer.append(this.delayTime);
            stringBuffer.append(" startTime:");
            stringBuffer.append(this.startTime);
            stringBuffer.append(" expireTime:");
            stringBuffer.append(this.expireTime);
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class FlowCtrlInfoHolder implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 6307563052429742524L;
        public Map<String, FlowControlInfo> flowCtrlMap = null;

        static {
            kge.a(1187452274);
            kge.a(1028243835);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49b69ef9", new Object[]{this, str, str2, flowControlInfo});
                return;
            }
            if (!StringUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }

        public FlowControlInfo get(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlowControlInfo) ipChange.ipc$dispatch("6b06b444", new Object[]{this, str, str2});
            }
            if (this.flowCtrlMap == null) {
                return null;
            }
            if (!StringUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            return this.flowCtrlMap.get(str);
        }
    }
}
