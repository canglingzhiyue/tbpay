package com.taobao.monitor.impl.data.thread;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.o;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.mpi;

/* loaded from: classes7.dex */
public class LooperMonitor implements Printer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18162a = false;
    private static final Map<Looper, LooperMonitor> b = new HashMap();
    private static int c = 250;
    private Looper d;
    private boolean e = true;
    private boolean f = false;
    private int g = 0;
    private int h = 0;
    private long i = System.nanoTime();
    private long j = SystemClock.currentThreadTimeMillis();
    private String k = "";
    private long l = 0;
    private int m = 0;
    private final LinkedList<HeavyMsgRecord> n = new LinkedList<>();
    private final Map<String, Integer> o = new HashMap();

    private LooperMonitor() {
    }

    public static void a(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcf7f3d", new Object[]{looper});
        } else if (looper == null || b.get(looper) != null) {
        } else {
            LooperMonitor looperMonitor = new LooperMonitor();
            looper.setMessageLogging(looperMonitor);
            b.put(looper, looperMonitor);
            looperMonitor.d = looper;
            looperMonitor.e = false;
            mpi.c("LooperMonitor", "LooperMonitor start.");
        }
    }

    @Override // android.util.Printer
    public void println(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
        } else if (this.e) {
        } else {
            long nanoTime = System.nanoTime();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (str.charAt(0) == '>') {
                a(str, nanoTime, currentThreadTimeMillis);
            } else if (str.charAt(0) != '<') {
            } else {
                b(str, nanoTime, currentThreadTimeMillis);
            }
        }
    }

    private void a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        this.f = true;
        this.k = str;
        this.i = j;
        this.j = j2;
        if (!f18162a) {
            return;
        }
        Log.e("LooperMonitor", "dispatchBegin: " + str);
    }

    private void b(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27832d33", new Object[]{this, str, new Long(j), new Long(j2)});
        } else if (!this.f) {
            if (!f18162a) {
                return;
            }
            Log.e("LooperMonitor", "dispatchEnd: no start");
        } else {
            if (f18162a) {
                Log.e("LooperMonitor", "dispatchEnd: " + str + "  消息耗时(NanoTime):" + (j - this.i) + "ns, 消息耗时(CpuTime):" + (j2 - this.j) + "ms");
            }
            this.f = false;
            this.h++;
            long j3 = this.i;
            if (j - j3 > c * 1000000) {
                this.g++;
                a(j3, this.j, j, j2, this.k);
            }
            if (!f18162a) {
                return;
            }
            long j4 = this.l;
            if (j4 == 0) {
                this.l = j / 1000000;
                return;
            }
            long j5 = j / 1000000;
            long j6 = j5 - j4;
            this.m++;
            if (j6 <= 1000) {
                return;
            }
            Log.e("LooperMonitor", "dispatchEnd cost: " + j6 + " QPS: " + this.m);
            this.l = j5;
            this.m = 0;
        }
    }

    private void a(long j, long j2, long j3, long j4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e62932", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), str});
            return;
        }
        HeavyMsgRecord heavyMsgRecord = new HeavyMsgRecord();
        heavyMsgRecord.mBeginNanoTime = j;
        heavyMsgRecord.mBeginCpuMillisTime = j2;
        heavyMsgRecord.mEndNanoTime = j3;
        heavyMsgRecord.mEndCpuMillisTime = j4;
        heavyMsgRecord.mBeginLog = str;
        heavyMsgRecord.mHeavyMsgCounter = this.o;
        heavyMsgRecord.mHeavyMsgRecords = this.n;
        heavyMsgRecord.looper = this.d;
        e.a().d().post(heavyMsgRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static final class HeavyMsgRecord implements Parcelable, Runnable {
        public static final Parcelable.Creator<HeavyMsgRecord> CREATOR = new Parcelable.Creator<HeavyMsgRecord>() { // from class: com.taobao.monitor.impl.data.thread.LooperMonitor.HeavyMsgRecord.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.monitor.impl.data.thread.LooperMonitor$HeavyMsgRecord] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ HeavyMsgRecord createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.monitor.impl.data.thread.LooperMonitor$HeavyMsgRecord[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ HeavyMsgRecord[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public HeavyMsgRecord a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (HeavyMsgRecord) ipChange.ipc$dispatch("16f1af53", new Object[]{this, parcel}) : new HeavyMsgRecord(parcel);
            }

            public HeavyMsgRecord[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (HeavyMsgRecord[]) ipChange.ipc$dispatch("10ffdb42", new Object[]{this, new Integer(i)}) : new HeavyMsgRecord[i];
            }
        };
        private transient Looper looper;
        private long mBeginCpuMillisTime;
        private String mBeginLog;
        private long mBeginNanoTime;
        private String mCallback;
        private long mEndCpuMillisTime;
        private long mEndNanoTime;
        private transient Map<String, Integer> mHeavyMsgCounter;
        private transient LinkedList<HeavyMsgRecord> mHeavyMsgRecords;
        private transient HeavyMsgRecord mNext;
        private String mTarget;
        private String mWhat;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public HeavyMsgRecord() {
        }

        protected HeavyMsgRecord(Parcel parcel) {
            this.mBeginNanoTime = parcel.readLong();
            this.mBeginCpuMillisTime = parcel.readLong();
            this.mEndNanoTime = parcel.readLong();
            this.mEndCpuMillisTime = parcel.readLong();
            this.mTarget = parcel.readString();
            this.mCallback = parcel.readString();
            this.mWhat = parcel.readString();
            this.mBeginLog = parcel.readString();
        }

        @Override // java.lang.Runnable
        public void run() {
            String substring;
            Integer num;
            if (TextUtils.isEmpty(this.mBeginLog)) {
                return;
            }
            try {
                String substring2 = this.mBeginLog.substring(this.mBeginLog.indexOf(40) + 1, this.mBeginLog.indexOf(41));
                if (this.mBeginLog.contains("@")) {
                    substring = this.mBeginLog.substring(this.mBeginLog.indexOf(125) + 2, this.mBeginLog.indexOf(64));
                } else {
                    substring = this.mBeginLog.substring(this.mBeginLog.indexOf(125) + 2, this.mBeginLog.indexOf(58));
                }
                String str = substring2 + "_" + substring + "_" + this.mBeginLog.substring(this.mBeginLog.indexOf(58) + 2);
                if (this.mHeavyMsgCounter != null && ((num = this.mHeavyMsgCounter.get(str)) != null || this.mHeavyMsgCounter.size() < 500)) {
                    this.mHeavyMsgCounter.put(str, Integer.valueOf(num == null ? 1 : Integer.valueOf(num.intValue() + 1).intValue()));
                }
                if (this.mHeavyMsgRecords != null) {
                    this.mHeavyMsgRecords.add(this);
                    if (this.mHeavyMsgRecords.size() > 100) {
                        this.mHeavyMsgRecords.removeLast();
                    }
                }
                this.mHeavyMsgCounter = null;
                this.mHeavyMsgRecords = null;
                m a2 = f.a(a.LOOPER_HEAVY_MSG_DISPATCHER);
                if (a2 instanceof o) {
                    ((o) a2).a(this.looper, str);
                }
                this.looper = null;
                mpi.c("LooperMonitor", "heavy msg: " + str + "  cost: " + ((this.mEndNanoTime - this.mBeginNanoTime) / 1000000) + " cpuCost: " + (this.mEndCpuMillisTime - this.mBeginCpuMillisTime));
            } catch (Throwable th) {
                mpi.c("LooperMonitor", "Thread looper msg parse error", th);
            }
        }

        public HeavyMsgRecord copy() {
            HeavyMsgRecord heavyMsgRecord = new HeavyMsgRecord();
            heavyMsgRecord.mBeginNanoTime = this.mBeginNanoTime;
            heavyMsgRecord.mBeginCpuMillisTime = this.mBeginCpuMillisTime;
            heavyMsgRecord.mEndNanoTime = this.mEndNanoTime;
            heavyMsgRecord.mEndCpuMillisTime = this.mEndCpuMillisTime;
            heavyMsgRecord.mTarget = this.mTarget;
            heavyMsgRecord.mCallback = this.mCallback;
            heavyMsgRecord.mWhat = this.mWhat;
            heavyMsgRecord.mBeginLog = this.mBeginLog;
            heavyMsgRecord.mNext = this.mNext;
            return heavyMsgRecord;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.mBeginNanoTime);
            parcel.writeLong(this.mBeginCpuMillisTime);
            parcel.writeLong(this.mEndNanoTime);
            parcel.writeLong(this.mEndCpuMillisTime);
            parcel.writeString(this.mTarget);
            parcel.writeString(this.mCallback);
            parcel.writeString(this.mWhat);
            parcel.writeString(this.mBeginLog);
        }

        public void readFromParcel(Parcel parcel) {
            this.mBeginNanoTime = parcel.readLong();
            this.mBeginCpuMillisTime = parcel.readLong();
            this.mEndNanoTime = parcel.readLong();
            this.mEndCpuMillisTime = parcel.readLong();
            this.mTarget = parcel.readString();
            this.mCallback = parcel.readString();
            this.mWhat = parcel.readString();
            this.mBeginLog = parcel.readString();
        }
    }
}
