package com.taobao.accs.data;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.EncryptUtil;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLIENT_RECEIVE_TIME_KEY = 32;
    public static final int EXT_KEY_BY_PULL = 36;
    public static final int EXT_KEY_ROUTE = 35;
    public static final int EXT_KEY_STREAM = 34;
    public static final int EXT_TAG = 4;
    public static final int SERVER_SEND_TIME_KEY = 33;
    public static final int SPLITTED_DATA_INDEX = 17;
    public static final int SPLITTED_DATA_MD5 = 18;
    public static final int SPLITTED_DATA_NUMS = 16;
    public static final int SPLITTED_TIME_OUT = 15;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f8231a;
    private String b;
    private int c;
    private String d;
    private long e;
    private ScheduledFuture<?> g;
    private volatile int f = 0;
    private Map<Integer, byte[]> h = new TreeMap(new Comparator<Integer>() { // from class: com.taobao.accs.data.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Integer num, Integer num2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, num, num2})).intValue() : a(num, num2);
        }

        public int a(Integer num, Integer num2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d87044fb", new Object[]{this, num, num2})).intValue() : num.intValue() - num2.intValue();
        }
    });

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e933484", new Object[]{aVar})).intValue() : aVar.f;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83d3d085", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.f = i;
        return i;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("450de1ce", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ Map c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("88645288", new Object[]{aVar}) : aVar.h;
    }

    static {
        kge.a(-835129254);
        f8231a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public a(String str, int i, String str2) {
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 0) {
            j = 30000;
        }
        this.g = com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.data.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (a.this) {
                    if (a.a(a.this) == 0) {
                        ALog.e("AssembleMessage", "timeout", "dataId", a.b(a.this));
                        a.a(a.this, 1);
                        a.c(a.this).clear();
                        AppMonitor.getInstance().commitStat(new AssembleMonitor(a.b(a.this), String.valueOf(a.a(a.this))));
                    }
                }
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    public byte[] a(int i, int i2, byte[] bArr) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6a87d2e", new Object[]{this, new Integer(i), new Integer(i2), bArr});
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("AssembleMessage", "putBurst", "dataId", this.b, "index", Integer.valueOf(i));
        }
        if (i2 != this.c) {
            ALog.e("AssembleMessage", "putBurst fail as burstNums not match", new Object[0]);
            return null;
        } else if (i < 0 || i >= i2) {
            ALog.e("AssembleMessage", "putBurst fail as burstIndex invalid", new Object[0]);
            return null;
        } else {
            synchronized (this) {
                if (this.f != 0) {
                    ALog.e("AssembleMessage", "putBurst fail", "status", Integer.valueOf(this.f));
                } else if (this.h.get(Integer.valueOf(i)) != null) {
                    ALog.e("AssembleMessage", "putBurst fail as exist old", new Object[0]);
                    return null;
                } else {
                    if (this.h.isEmpty()) {
                        this.e = System.currentTimeMillis();
                    }
                    this.h.put(Integer.valueOf(i), bArr);
                    if (this.h.size() == this.c) {
                        byte[] bArr2 = null;
                        for (byte[] bArr3 : this.h.values()) {
                            if (bArr2 == null) {
                                bArr2 = bArr3;
                            } else {
                                byte[] bArr4 = new byte[bArr2.length + bArr3.length];
                                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                                System.arraycopy(bArr3, 0, bArr4, bArr2.length, bArr3.length);
                                bArr2 = bArr4;
                            }
                        }
                        if (!TextUtils.isEmpty(this.d)) {
                            String str = new String(a(EncryptUtil.md5(bArr2)));
                            if (!this.d.equals(str)) {
                                ALog.w("AssembleMessage", "putBurst fail", "dataId", this.b, "dataMd5", this.d, "finalDataMd5", str);
                                this.f = 3;
                                bArr2 = null;
                            }
                        }
                        long j2 = 0;
                        if (bArr2 != null) {
                            j2 = bArr2.length;
                            j = System.currentTimeMillis() - this.e;
                            this.f = 2;
                            ALog.i("AssembleMessage", "putBurst completed", "dataId", this.b, com.taobao.android.weex_framework.util.a.ATOM_length, Long.valueOf(j2), "cost", Long.valueOf(j));
                        } else {
                            j = 0;
                        }
                        AssembleMonitor assembleMonitor = new AssembleMonitor(this.b, String.valueOf(this.f));
                        assembleMonitor.assembleLength = j2;
                        assembleMonitor.assembleTimes = j;
                        AppMonitor.getInstance().commitStat(assembleMonitor);
                        this.h.clear();
                        if (this.g != null) {
                            this.g.cancel(false);
                        }
                        return bArr2;
                    }
                }
                return null;
            }
        }
    }

    private static char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("27137f8f", new Object[]{bArr});
        }
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f8231a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return cArr;
    }
}
