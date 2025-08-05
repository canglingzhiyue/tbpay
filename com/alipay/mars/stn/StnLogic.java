package com.alipay.mars.stn;

import com.alipay.mars.Mars;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class StnLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONNECTED = 4;
    public static final int CONNECTTING = 3;
    public static int ECHECK_NEVER = 2;
    public static int ECHECK_NEXT = 1;
    public static int ECHECK_NOW = 0;
    public static final int GATEWAY_FAILED = 1;
    public static final int INVALID_TASK_ID = -1;
    public static final int NETWORK_UNAVAILABLE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static int RESP_FAIL_HANDLE_DEFAULT = -1;
    public static int RESP_FAIL_HANDLE_NORMAL = 0;
    public static int RESP_FAIL_HANDLE_SESSION_TIMEOUT = -13;
    public static int RESP_FAIL_HANDLE_TASK_END = -14;
    public static final int SERVER_DOWN = 5;
    public static final int SERVER_FAILED = 2;
    public static final String TAG = "bifrost.StnLogic";

    /* renamed from: a  reason: collision with root package name */
    private static ICallBack f5329a = null;
    public static final int ectDial = 2;
    public static final int ectDns = 3;
    public static final int ectEnDecode = 7;
    public static final int ectFalse = 1;
    public static final int ectHttp = 5;
    public static final int ectLocal = 9;
    public static final int ectNetMsgXP = 6;
    public static final int ectOK = 0;
    public static final int ectServer = 8;
    public static final int ectSocket = 4;

    /* loaded from: classes3.dex */
    public interface ICallBack {
        int buf2Resp(int i, Object obj, byte[] bArr, byte[] bArr2, int[] iArr, int i2);

        int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr);

        boolean isLogoned();

        boolean makesureAuthed();

        boolean onLongLinkIdentifyResp(byte[] bArr, byte[] bArr2);

        String[] onNewDns(String str);

        void onPush(long j, int i, int i2, byte[] bArr, byte[] bArr2);

        int onTaskEnd(int i, Object obj, int i2, int i3);

        void reportConnectInfo(int i, int i2);

        void reportTaskProfile(String str);

        boolean req2Buf(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr, int i2);

        void requestDoSync();

        String[] requestNetCheckShortLinkHosts();

        void trafficData(int i, int i2);
    }

    public static native void clearTask();

    private static native ArrayList<String> getLoadLibraries();

    public static native boolean hasTask(int i);

    public static native void keepSignalling();

    public static native void makesureLongLinkConnected();

    public static native void redoTask();

    public static native void reset();

    public static native void setBackupIPs(String str, String[] strArr);

    public static native void setDebugIP(String str, String str2);

    public static native void setLonglinkSvrAddr(String str, int[] iArr, String str2);

    public static native void setProductID(short s);

    public static native void setShortlinkSvrAddr(int i, String str);

    public static native void setSignallingStrategy(long j, long j2);

    public static native void startTask(Task task);

    public static native void stopSignalling();

    public static native void stopTask(int i);

    public static void checkLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf8a19a", new Object[0]);
            return;
        }
        ArrayList<String> arrayList = null;
        try {
            arrayList = getLoadLibraries();
        } catch (Throwable unused) {
            Mars.loadDefaultMarsLibrary();
        }
        Mars.checkLoadedModules(arrayList, TAG);
    }

    /* loaded from: classes3.dex */
    public static class Task {
        public static final int EBoth = 3;
        public static final int EFAST = 1;
        public static final int ELong = 2;
        public static final int ENORMAL = 0;
        public static final int EShort = 1;
        public static final int ETASK_PRIORITY_0 = 0;
        public static final int ETASK_PRIORITY_1 = 1;
        public static final int ETASK_PRIORITY_2 = 2;
        public static final int ETASK_PRIORITY_3 = 3;
        public static final int ETASK_PRIORITY_4 = 4;
        public static final int ETASK_PRIORITY_5 = 5;
        public static final int ETASK_PRIORITY_HIGHEST = 0;
        public static final int ETASK_PRIORITY_LOWEST = 5;
        public static final int ETASK_PRIORITY_NORMAL = 3;

        /* renamed from: a  reason: collision with root package name */
        private static AtomicInteger f5330a = new AtomicInteger(0);
        public String cgi;
        public int channelSelect;
        public int channelStrategy;
        public int cmdID;
        public boolean limitFlow;
        public boolean limitFrequency;
        public boolean needAuthed;
        public boolean networkStatusSensitive;
        public int priority;
        public String reportArg;
        public int retryCount;
        public boolean sendOnly;
        public int serverProcessCost;
        public ArrayList<String> shortLinkHostList;
        public int taskID;
        public int totalTimeout;
        public Object userContext;

        public Task() {
            this.retryCount = -1;
            this.taskID = f5330a.incrementAndGet();
        }

        public Task(int i, int i2, String str, ArrayList<String> arrayList) {
            this.retryCount = -1;
            this.taskID = f5330a.incrementAndGet();
            this.channelSelect = i;
            this.cmdID = i2;
            this.cgi = str;
            this.shortLinkHostList = arrayList;
            this.sendOnly = false;
            this.needAuthed = true;
            this.limitFlow = true;
            this.limitFrequency = true;
            this.channelStrategy = 0;
            this.networkStatusSensitive = false;
            this.priority = 3;
            this.retryCount = -1;
            this.serverProcessCost = 0;
            this.totalTimeout = 0;
            this.userContext = null;
        }
    }

    public static void setCallBack(ICallBack iCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0ef0bd", new Object[]{iCallBack});
        } else {
            f5329a = iCallBack;
        }
    }

    public static void setLonglinkSvrAddr(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0c0a47", new Object[]{str, iArr});
        } else {
            setLonglinkSvrAddr(str, iArr, null);
        }
    }

    public static void setShortlinkSvrAddr(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bc4eb0", new Object[]{new Integer(i)});
        } else {
            setShortlinkSvrAddr(i, null);
        }
    }

    public static String exception2String(Exception exc) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c15c10d5", new Object[]{exc}) : exc.toString();
    }

    public static boolean makesureAuthed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad49c8b5", new Object[0])).booleanValue();
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.makesureAuthed();
        }
        return false;
    }

    public static String[] onNewDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4c3afa48", new Object[]{str});
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.onNewDns(str);
        }
        return null;
    }

    public static void onPush(long j, int i, int i2, byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96960a52", new Object[]{new Long(j), new Integer(i), new Integer(i2), bArr, bArr2});
            return;
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack == null) {
            return;
        }
        iCallBack.onPush(j, i, i2, bArr, bArr2);
    }

    public static boolean req2Buf(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0fcff60", new Object[]{new Integer(i), obj, byteArrayOutputStream, byteArrayOutputStream2, iArr, new Integer(i2)})).booleanValue();
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.req2Buf(i, obj, byteArrayOutputStream, byteArrayOutputStream2, iArr, i2);
        }
        return false;
    }

    public static int buf2Resp(int i, Object obj, byte[] bArr, byte[] bArr2, int[] iArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1e88c31", new Object[]{new Integer(i), obj, bArr, bArr2, iArr, new Integer(i2)})).intValue();
        }
        ICallBack iCallBack = f5329a;
        return iCallBack == null ? RESP_FAIL_HANDLE_TASK_END : iCallBack.buf2Resp(i, obj, bArr, bArr2, iArr, i2);
    }

    public static int onTaskEnd(int i, Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77bec34", new Object[]{new Integer(i), obj, new Integer(i2), new Integer(i3)})).intValue();
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.onTaskEnd(i, obj, i2, i3);
        }
        return 0;
    }

    public static void reportTaskProfile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b445521", new Object[]{str});
            return;
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack == null) {
            return;
        }
        iCallBack.reportTaskProfile(str);
    }

    public static void reportConnectStatus(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb40dcf", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack == null) {
            return;
        }
        iCallBack.reportConnectInfo(i, i2);
    }

    public static int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37df3d38", new Object[]{byteArrayOutputStream, byteArrayOutputStream2, iArr})).intValue();
        }
        ICallBack iCallBack = f5329a;
        return iCallBack == null ? ECHECK_NEVER : iCallBack.getLongLinkIdentifyCheckBuffer(byteArrayOutputStream, byteArrayOutputStream2, iArr);
    }

    public static boolean onLongLinkIdentifyResp(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a2e10a", new Object[]{bArr, bArr2})).booleanValue();
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.onLongLinkIdentifyResp(bArr, bArr2);
        }
        return false;
    }

    public static void trafficData(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7b4d2e", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack == null) {
            return;
        }
        iCallBack.trafficData(i, i2);
    }

    public static String[] requestNetCheckShortLinkHosts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("7ae5e5", new Object[0]);
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.requestNetCheckShortLinkHosts();
        }
        return null;
    }

    public static void requestDoSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c7b73c", new Object[0]);
            return;
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack == null) {
            return;
        }
        iCallBack.requestDoSync();
    }

    public static boolean isLogoned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8750d003", new Object[0])).booleanValue();
        }
        ICallBack iCallBack = f5329a;
        if (iCallBack != null) {
            return iCallBack.isLogoned();
        }
        return false;
    }
}
