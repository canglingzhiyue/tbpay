package com.alipay.mobile.common.logging.api.monitor;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class Performance implements Parcelable {
    public static final Parcelable.Creator<Performance> CREATOR = new Parcelable.Creator<Performance>() { // from class: com.alipay.mobile.common.logging.api.monitor.Performance.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public final Performance mo565createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Performance) ipChange.ipc$dispatch("1b7d1dc6", new Object[]{this, parcel}) : new Performance(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public final Performance[] mo566newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Performance[]) ipChange.ipc$dispatch("1651e36f", new Object[]{this, new Integer(i)}) : new Performance[i];
        }
    };
    public static final String KEY_LOG_HEADER = "header";

    /* renamed from: a  reason: collision with root package name */
    private String f5423a;
    private String b;
    private String c;
    private String d;
    private Map<String, String> e;
    private String f;
    private int g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Performance f5424a = new Performance();

        public Builder setSubType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9d15a5d", new Object[]{this, str});
            }
            this.f5424a.setSubType(str);
            return this;
        }

        public Builder setParam1(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("612b692f", new Object[]{this, str});
            }
            this.f5424a.setParam1(str);
            return this;
        }

        public Builder setParam2(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c386800e", new Object[]{this, str});
            }
            this.f5424a.setParam2(str);
            return this;
        }

        public Builder setParam3(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("25e196ed", new Object[]{this, str});
            }
            this.f5424a.setParam3(str);
            return this;
        }

        public Builder setPageId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9028cfa9", new Object[]{this, str});
            }
            this.f5424a.setPageId(str);
            return this;
        }

        public Builder addExtParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5171c9de", new Object[]{this, str, str2});
            }
            this.f5424a.addExtParam(str, str2);
            return this;
        }

        public Builder setLoggerLevel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9906295c", new Object[]{this, new Integer(i)});
            }
            this.f5424a.setLoggerLevel(i);
            return this;
        }

        public Performance build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Performance) ipChange.ipc$dispatch("9967f448", new Object[]{this}) : this.f5424a;
        }

        public void performance(PerformanceID performanceID) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d28c103", new Object[]{this, performanceID});
            } else {
                LoggerFactory.getMonitorLogger().performance(performanceID, this.f5424a);
            }
        }
    }

    public String getSubType() {
        return this.f5423a;
    }

    public void setSubType(String str) {
        this.f5423a = str;
    }

    public String getParam1() {
        return this.b;
    }

    public void setParam1(String str) {
        this.b = str;
    }

    public String getParam2() {
        return this.c;
    }

    public void setParam2(String str) {
        this.c = str;
    }

    public String getParam3() {
        return this.d;
    }

    public void setParam3(String str) {
        this.d = str;
    }

    public Map<String, String> getExtPramas() {
        return this.e;
    }

    public void addExtParam(String str, String str2) {
        this.e.put(str, str2);
    }

    public void removeExtParam(String str) {
        this.e.remove(str);
    }

    public String getPageId() {
        return this.f;
    }

    public void setPageId(String str) {
        this.f = str;
    }

    public int getLoggerLevel() {
        return this.g;
    }

    public void setLoggerLevel(int i) {
        this.g = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5423a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        Map<String, String> map = this.e;
        if (map == null) {
            map = new HashMap<>();
        }
        this.e = map;
        parcel.writeInt(this.e.size());
        for (Map.Entry<String, String> entry : this.e.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public Performance() {
        this.e = new HashMap();
        this.g = 2;
    }

    protected Performance(Parcel parcel) {
        this.e = new HashMap();
        this.g = 2;
        this.f5423a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        int readInt = parcel.readInt();
        this.e = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.e.put(parcel.readString(), parcel.readString());
        }
    }
}
