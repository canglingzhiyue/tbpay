package com.alibaba.poplayer.info.frequency;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bzn;
import tb.kge;

/* loaded from: classes.dex */
public abstract class FrequencyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FREQUENCY_CHECK_FAILED = 1;
    public static final int FREQUENCY_CHECK_FAILED_INTERVAL = 5;
    public static final int FREQUENCY_CHECK_FAILED_NOT_STARTED = 2;
    public static final int FREQUENCY_CHECK_FAILED_REACH_MAX = 3;
    public static final int FREQUENCY_CHECK_FAILED_UNABLE_SECTION = 4;
    public static final int FREQUENCY_CHECK_NOT_ENABLE = -1;
    public static final int FREQUENCY_CHECK_SUCCESS = 0;

    /* renamed from: a  reason: collision with root package name */
    public volatile JSONObject f3181a;
    private final bzn b = new bzn(b());

    static {
        kge.a(1503942871);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == -1 || i == 0;
    }

    public boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue() : j > 0 || j2 > 0;
    }

    public abstract String b();

    public abstract long c();

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f3181a = this.b.a();
        }
    }

    /* loaded from: classes3.dex */
    public static class FrequencyInfo implements Parcelable, Serializable {
        public static final Parcelable.Creator<FrequencyInfo> CREATOR;
        public long curFIndex;
        public long lastIncreaseTime;
        public Map<Long, Integer> popInfoMap;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FrequencyInfo() {
            this.curFIndex = 0L;
            this.popInfoMap = new HashMap();
            this.lastIncreaseTime = 0L;
        }

        protected FrequencyInfo(Parcel parcel) {
            this.curFIndex = 0L;
            this.popInfoMap = new HashMap();
            this.lastIncreaseTime = 0L;
            this.curFIndex = parcel.readLong();
            this.lastIncreaseTime = parcel.readLong();
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                this.popInfoMap.put(Long.valueOf(parcel.readLong()), Integer.valueOf(parcel.readInt()));
            }
        }

        static {
            kge.a(-1292079363);
            kge.a(1028243835);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<FrequencyInfo>() { // from class: com.alibaba.poplayer.info.frequency.FrequencyManager.FrequencyInfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.poplayer.info.frequency.FrequencyManager$FrequencyInfo, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FrequencyInfo createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.poplayer.info.frequency.FrequencyManager$FrequencyInfo[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FrequencyInfo[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public FrequencyInfo a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (FrequencyInfo) ipChange.ipc$dispatch("3e073483", new Object[]{this, parcel}) : new FrequencyInfo(parcel);
                }

                public FrequencyInfo[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (FrequencyInfo[]) ipChange.ipc$dispatch("ed3a20b2", new Object[]{this, new Integer(i)}) : new FrequencyInfo[i];
                }
            };
        }

        public void reduceMapSize(int i) {
            if (i <= 0) {
                return;
            }
            try {
                int size = this.popInfoMap.size();
                if (size <= i) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.popInfoMap.keySet());
                Collections.sort(arrayList);
                for (int i2 = 0; i2 < size - i; i2++) {
                    this.popInfoMap.remove(arrayList.get(i2));
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("FrequencyManager.reduceMapSize.error.", th);
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.curFIndex);
            parcel.writeLong(this.lastIncreaseTime);
            parcel.writeInt(this.popInfoMap.size());
            for (Map.Entry<Long, Integer> entry : this.popInfoMap.entrySet()) {
                parcel.writeLong(entry.getKey().longValue());
                parcel.writeInt(entry.getValue().intValue());
            }
        }
    }

    public int a(String str, String str2, long j, long j2, long j3, int i, long j4) {
        FrequencyInfo frequencyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("817a115c", new Object[]{this, str, str2, new Long(j), new Long(j2), new Long(j3), new Integer(i), new Long(j4)})).intValue();
        }
        try {
            if (a(j3, j4) && j2 > 0 && j > 0) {
                if (TextUtils.isEmpty(str)) {
                    com.alibaba.poplayer.utils.c.b("configCheck", str2, "updateFrequencyInfo.infoKey=null");
                    return 1;
                }
                synchronized (this) {
                    JSONObject jSONObject = this.f3181a;
                    if (jSONObject == null) {
                        com.alibaba.poplayer.utils.c.b("configCheck", str2, "updateFrequencyInfo.mFileJsonObject=null");
                        return 1;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    if (jSONObject2 == null) {
                        com.alibaba.poplayer.utils.c.b("configCheck", str2, "updateFrequencyInfo.infoJsonConfigObject=null");
                        return 1;
                    }
                    if (jSONObject2.containsKey(str2)) {
                        frequencyInfo = (FrequencyInfo) jSONObject2.getJSONObject(str2).toJavaObject(FrequencyInfo.class);
                    } else {
                        frequencyInfo = new FrequencyInfo();
                    }
                    if (j2 - j <= 0) {
                        com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.updateFrequencyInfo.not started.");
                        return 2;
                    }
                    long j5 = frequencyInfo.curFIndex;
                    if (frequencyInfo.popInfoMap.get(Long.valueOf(j5)) == null) {
                        frequencyInfo.popInfoMap.put(Long.valueOf(j5), 1);
                        frequencyInfo.lastIncreaseTime = j2;
                        com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.updateFrequencyInfo.init update.curFPopTimes=1.");
                    } else if (i > 0 && frequencyInfo.popInfoMap.get(Long.valueOf(j5)).intValue() >= i) {
                        com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.checkFrequencyInfo.same index.curFPopTimes=" + frequencyInfo.popInfoMap.get(Long.valueOf(j5)) + " is max.Can't open.index=" + j5);
                        return 3;
                    } else {
                        int intValue = frequencyInfo.popInfoMap.get(Long.valueOf(j5)).intValue() + 1;
                        frequencyInfo.popInfoMap.put(Long.valueOf(j5), Integer.valueOf(intValue));
                        frequencyInfo.lastIncreaseTime = j2;
                        com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.updateFrequencyInfo.update.curFPopTimes=" + intValue);
                    }
                    jSONObject2.put(str2, (Object) frequencyInfo);
                    jSONObject.put(str, (Object) jSONObject2);
                    d();
                    return 0;
                }
            }
            return -1;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("FrequencyManager.updateFrequencyInfo.error.", th);
            return 1;
        }
    }

    public int a(String str, String str2, long j, long j2, long j3, int i, long j4, long j5, long j6) {
        FrequencyInfo frequencyInfo;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        int i2 = 4;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4a339c", new Object[]{this, str, str2, new Long(j), new Long(j2), new Long(j3), new Integer(i), new Long(j4), new Long(j5), new Long(j6)})).intValue();
        }
        try {
            if (a(j3, j6) && j2 > 0 && j > 0) {
                synchronized (this) {
                    JSONObject jSONObject2 = this.f3181a;
                    if (jSONObject2 != null && !TextUtils.isEmpty(str)) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                        if (jSONObject3 == null) {
                            com.alibaba.poplayer.utils.c.b("configCheck", str2, "checkFrequencyInfo.infoJsonConfigObject=null");
                            return 1;
                        }
                        if (jSONObject3.containsKey(str2)) {
                            frequencyInfo = (FrequencyInfo) jSONObject3.getJSONObject(str2).toJavaObject(FrequencyInfo.class);
                        } else {
                            frequencyInfo = new FrequencyInfo();
                        }
                        FrequencyInfo frequencyInfo2 = frequencyInfo;
                        if (j6 > 0) {
                            jSONObject = jSONObject3;
                            if (frequencyInfo2.lastIncreaseTime > 0 && (j2 - frequencyInfo2.lastIncreaseTime) / 1000 < j6) {
                                com.alibaba.poplayer.utils.c.b("configCheck", str2, "checkFrequencyInfo.interval.fail.");
                                return 5;
                            }
                        } else {
                            jSONObject = jSONObject3;
                        }
                        if (j3 <= 0) {
                            com.alibaba.poplayer.utils.c.b("configCheck", str2, "checkFrequencyInfo.frequencySecs<=0.");
                            return 0;
                        }
                        JSONObject jSONObject4 = jSONObject;
                        long a2 = a(j3, j2, j, j4);
                        if (a2 < 0) {
                            com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.checkFrequencyInfo.not started.");
                            return 2;
                        }
                        frequencyInfo2.curFIndex = a2;
                        if (a(j3, j2, j, j4, j5)) {
                            if (frequencyInfo2.popInfoMap.get(Long.valueOf(a2)) == null) {
                                frequencyInfo2.popInfoMap.put(Long.valueOf(a2), 0);
                            } else if (i > 0 && frequencyInfo2.popInfoMap.get(Long.valueOf(a2)).intValue() >= i) {
                                com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.checkFrequencyInfo.index=" + a2 + ".curFPopTimes" + frequencyInfo2.popInfoMap.get(Long.valueOf(a2)) + "is max.Can't open.");
                                return 3;
                            }
                            i2 = 0;
                        } else {
                            com.alibaba.poplayer.utils.c.b("configCheck", str2, "FrequencyManager.checkFrequencyInfo.not inEnableSection.index=" + a2);
                        }
                        jSONObject4.put(str2, (Object) frequencyInfo2);
                        jSONObject2.put(str, (Object) jSONObject4);
                        d();
                        return i2;
                    }
                    com.alibaba.poplayer.utils.c.b("configCheck", str2, "checkFrequencyInfo.mFileJsonObject=null");
                    return 1;
                }
            }
            return -1;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("FrequencyManager.checkFrequencyInfo.error.", th);
            return 1;
        }
    }

    public FrequencyInfo a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrequencyInfo) ipChange.ipc$dispatch("a8f5262c", new Object[]{this, str, str2});
        }
        try {
            synchronized (this) {
                JSONObject jSONObject = this.f3181a;
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 == null) {
                    return null;
                }
                return jSONObject2.containsKey(str2) ? (FrequencyInfo) jSONObject2.getObject(str2, FrequencyInfo.class) : null;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("FrequencyManager.getFrequencyInfo.error.", th);
            return null;
        }
    }

    public void a(String str, Set<String> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d171427", new Object[]{this, str, set, new Boolean(z)});
        } else if (set != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    com.alibaba.poplayer.utils.c.a("Please don't execute on UI Thread.");
                    return;
                }
                synchronized (this) {
                    JSONObject jSONObject = this.f3181a;
                    if (jSONObject != null && !TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                        JSONObject jSONObject3 = new JSONObject();
                        ArrayList<String> arrayList = new ArrayList(set);
                        if (jSONObject2 != null) {
                            for (String str2 : jSONObject2.keySet()) {
                                if (!TextUtils.isEmpty(str2)) {
                                    FrequencyInfo frequencyInfo = (FrequencyInfo) jSONObject2.getJSONObject(str2).toJavaObject(FrequencyInfo.class);
                                    if (arrayList.contains(str2) || !a(frequencyInfo)) {
                                        FrequencyInfo frequencyInfo2 = new FrequencyInfo();
                                        frequencyInfo.reduceMapSize(100);
                                        frequencyInfo2.popInfoMap = frequencyInfo.popInfoMap;
                                        frequencyInfo2.curFIndex = frequencyInfo.curFIndex;
                                        frequencyInfo2.lastIncreaseTime = frequencyInfo.lastIncreaseTime;
                                        jSONObject3.put(str2, (Object) frequencyInfo2);
                                        arrayList.remove(str2);
                                    }
                                }
                            }
                        }
                        if (z) {
                            for (String str3 : arrayList) {
                                jSONObject3.put(str3, (Object) new FrequencyInfo());
                            }
                        }
                        jSONObject.put(str, (Object) jSONObject3);
                        d();
                    }
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("FrequencyManager.putFrequencyInfos.error.", th);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.a(this.f3181a.toJSONString());
        }
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            synchronized (this) {
                for (String str : list) {
                    if (this.f3181a.containsKey(str)) {
                        this.f3181a.put(str, (Object) new JSONObject());
                    }
                }
                d();
            }
        }
    }

    private boolean a(FrequencyInfo frequencyInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4586f7e", new Object[]{this, frequencyInfo})).booleanValue() : (PopLayer.getReference().getCurrentTimeStamp(false) - frequencyInfo.lastIncreaseTime) / 1000 > c();
    }

    private long a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed9895c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)})).longValue();
        }
        long j5 = j2 - j3;
        if (j5 <= 0) {
            return -1L;
        }
        long j6 = j5 / 1000;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j4 <= 0) {
            return j6 / j;
        }
        if (j6 >= j4) {
            return ((j6 - j4) / j) + 1;
        }
        return 0L;
    }

    private boolean a(long j, long j2, long j3, long j4, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c581a60", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)})).booleanValue();
        }
        if (j5 <= 0 || j5 >= j) {
            return true;
        }
        long j6 = j2 - j3;
        if (j6 <= 0) {
            return false;
        }
        long j7 = j6 / 1000;
        if (j4 < 0) {
            j4 = 0;
        }
        return (j4 <= 0 || j7 >= j4) ? j7 - ((((j7 - j4) / j) * j) + j4) < j5 : j7 < j5;
    }
}
