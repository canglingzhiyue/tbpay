package com.alipay.mobile.common.logging.api.antevent;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class AntEvent implements Parcelable {
    public static final Parcelable.Creator<AntEvent> CREATOR = new Parcelable.Creator<AntEvent>() { // from class: com.alipay.mobile.common.logging.api.antevent.AntEvent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public final AntEvent mo561createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AntEvent) ipChange.ipc$dispatch("99adde12", new Object[]{this, parcel}) : new AntEvent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public final AntEvent[] mo562newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AntEvent[]) ipChange.ipc$dispatch("3f19f9fb", new Object[]{this, new Integer(i)}) : new AntEvent[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f5415a;
    private String b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private Map<String, String> k;
    private Map<String, String> l;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AntEvent f5416a = new AntEvent();

        public Builder setEventID(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("583d356e", new Object[]{this, str});
            }
            this.f5416a.f5415a = str;
            return this;
        }

        public Builder setBizType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f2bd36b6", new Object[]{this, str});
            }
            this.f5416a.setBizType(str);
            return this;
        }

        public Builder addExtParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("27fef5ea", new Object[]{this, str, str2});
            }
            AntEvent.access$200(this.f5416a, str, str2);
            return this;
        }

        public Builder setLoggerLevel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("47811ce8", new Object[]{this, new Integer(i)});
            }
            this.f5416a.setLoggerLevel(i);
            return this;
        }

        public AntEvent build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AntEvent) ipChange.ipc$dispatch("e2006d14", new Object[]{this}) : this.f5416a;
        }
    }

    private AntEvent() {
        this.c = 2;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private AntEvent(Parcel parcel) {
        this.c = 2;
        this.k = new HashMap();
        this.l = new HashMap();
        this.f5415a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.k = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.k.put(parcel.readString(), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        this.l = new HashMap(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.l.put(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5415a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        Map<String, String> map = this.k;
        if (map == null) {
            map = new HashMap<>();
        }
        this.k = map;
        parcel.writeInt(this.k.size());
        for (Map.Entry<String, String> entry : this.k.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map2 = this.l;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        this.l = map2;
        parcel.writeInt(this.l.size());
        for (Map.Entry<String, String> entry2 : this.l.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public String getEventID() {
        return this.f5415a;
    }

    public String getBizType() {
        return this.b;
    }

    void setBizType(String str) {
        this.b = str;
    }

    public int getLoggerLevel() {
        return this.c;
    }

    void setLoggerLevel(int i) {
        this.c = i;
    }

    public String getParam1() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setParam1(String str) {
        this.d = str;
    }

    public String getParam2() {
        return this.e;
    }

    void setParam2(String str) {
        this.e = str;
    }

    public String getParam3() {
        return this.f;
    }

    void setParam3(String str) {
        this.f = str;
    }

    public Map<String, String> getExtParams() {
        return this.k;
    }

    void setExtParams(Map<String, String> map) {
        this.k = map;
    }

    public String getPageId() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPageId(String str) {
        this.g = str;
    }

    public String getAbtestId() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAbtestId(String str) {
        this.h = str;
    }

    public String getRenderBizType() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRenderBizType(String str) {
        this.i = str;
    }

    public boolean isNeedAbtest() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNeedAbtest(boolean z) {
        this.j = z;
    }

    public Map<String, String> getExtParams5() {
        return this.l;
    }

    void setExtParams5(Map<String, String> map) {
        this.l = map;
    }

    public void addExtParam5(String str, String str2) {
        this.l.put(str, str2);
    }

    public void send() {
        LoggerFactory.getEventLogger().antEvent(AntEventUtil.getLogCategory(this), this);
    }

    static /* synthetic */ void access$200(AntEvent antEvent, String str, String str2) {
        antEvent.k.put(str, str2);
    }
}
