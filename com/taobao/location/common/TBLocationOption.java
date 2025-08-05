package com.taobao.location.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.StringUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLocationOption implements Parcelable {
    public static final Parcelable.Creator<TBLocationOption> CREATOR;
    private int accuracy;
    private int dataModel;
    private int timeLimit;
    private long timeout;

    /* loaded from: classes7.dex */
    public enum Accuracy {
        DEFAULT(0, 100, 999),
        TENMETER(1, 10, 99),
        HEKTOMETER(2, 100, 999),
        KILOMETER(3, 1000, 9999);
        
        private int key;
        private int maxMeter;
        private int minMeter;

        Accuracy(int i, int i2, int i3) {
            this.key = i;
            this.minMeter = i2;
            this.maxMeter = i3;
        }

        public static Accuracy valueOf(int i) {
            Accuracy[] values;
            for (Accuracy accuracy : values()) {
                if (accuracy.key == i) {
                    return accuracy;
                }
            }
            return DEFAULT;
        }

        public int getKey() {
            return this.key;
        }

        public int getMaxMeter() {
            return this.maxMeter;
        }

        public int getMinMeter() {
            return this.minMeter;
        }

        public boolean matchAccuray(int i) {
            return i <= this.maxMeter;
        }
    }

    /* loaded from: classes7.dex */
    public enum DataModel {
        DEFAULT(0),
        NEED_ADDRESS(1),
        NEED_POI(2),
        NEED_ADDRESS_POI(3);
        
        private int type;

        DataModel(int i) {
            this.type = i;
        }

        public static DataModel valueOf(int i) {
            DataModel[] values;
            for (DataModel dataModel : values()) {
                if (dataModel.getType() == i) {
                    return dataModel;
                }
            }
            return DEFAULT;
        }

        public int getType() {
            return this.type;
        }

        public boolean matchAddressModel(TBLocationDTO tBLocationDTO) {
            int i = this.type;
            if (i == 1 || i == 3) {
                return tBLocationDTO != null && !StringUtil.isEmpty(tBLocationDTO.getAddress());
            }
            return true;
        }

        public boolean matchPoiModel(TBLocationDTO tBLocationDTO) {
            int i = this.type;
            if (i == 2 || i == 3) {
                return (tBLocationDTO == null || tBLocationDTO.pois == null || tBLocationDTO.pois.isEmpty()) ? false : true;
            }
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public enum TimeLimit {
        DEFAULT(0, 30),
        NO_CACHE(1, 0),
        TEN_MIN(2, 10),
        HALF_HOUR(3, 30),
        ONE_HOUR(4, 60),
        HALF_DAY(5, 720),
        ONE_DAY(6, 1440),
        ONE_MIN(7, 1),
        SEC_MIN(8, 2),
        THR_MIN(9, 3),
        FOR_MIN(10, 4),
        FIR_MIN(11, 5),
        TWO_HOUR(12, 120);
        
        private int key;
        private int time;

        TimeLimit(int i, int i2) {
            this.key = i;
            this.time = i2;
        }

        public static TimeLimit valueOf(int i) {
            TimeLimit[] values;
            for (TimeLimit timeLimit : values()) {
                if (timeLimit.key == i) {
                    return timeLimit;
                }
            }
            return DEFAULT;
        }

        public int getKey() {
            return this.key;
        }

        public int getTime() {
            return this.time;
        }

        public boolean matchTimeLimit(long j, long j2) {
            return j2 - j < ((long) ((this.time * 60) * 1000));
        }
    }

    /* loaded from: classes7.dex */
    public enum Timeout {
        DEFAULT(0),
        HALF_SECOND(500),
        ONE_SECOND(1000),
        TWO_SECONDS(2000),
        THREE_SECONDS(3000),
        FIVE_SECONDS(5000),
        TEN_SECONDS(10000);
        
        private long length;

        Timeout(long j) {
            this.length = j;
        }

        public static Timeout valueOf(long j) {
            Timeout[] values;
            for (Timeout timeout : values()) {
                if (timeout.length == j) {
                    return timeout;
                }
            }
            return DEFAULT;
        }

        public long getLength() {
            return this.length;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TBLocationOption() {
    }

    private TBLocationOption(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataModel);
        parcel.writeInt(this.timeLimit);
        parcel.writeInt(this.accuracy);
    }

    public void readFromParcel(Parcel parcel) {
        this.dataModel = parcel.readInt();
        this.timeLimit = parcel.readInt();
        this.accuracy = parcel.readInt();
    }

    public DataModel getDataModel() {
        return DataModel.valueOf(this.dataModel);
    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel.getType();
    }

    public void setTimeLimit(TimeLimit timeLimit) {
        this.timeLimit = timeLimit.getKey();
    }

    public TimeLimit getTimeLimit() {
        return TimeLimit.valueOf(this.timeLimit);
    }

    public Accuracy getAccuracy() {
        return Accuracy.valueOf(this.accuracy);
    }

    public void setAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy.getKey();
    }

    public Timeout getTimeout() {
        return Timeout.valueOf(this.timeout);
    }

    public void setTimeout(Timeout timeout) {
        this.timeout = timeout.getLength();
    }

    static {
        kge.a(-1926851563);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TBLocationOption>() { // from class: com.taobao.location.common.TBLocationOption.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.location.common.TBLocationOption, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBLocationOption createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.location.common.TBLocationOption[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBLocationOption[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TBLocationOption a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBLocationOption) ipChange.ipc$dispatch("38d620c1", new Object[]{this, parcel}) : new TBLocationOption(parcel);
            }

            public TBLocationOption[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBLocationOption[]) ipChange.ipc$dispatch("29ef7d72", new Object[]{this, new Integer(i)}) : new TBLocationOption[i];
            }
        };
    }
}
