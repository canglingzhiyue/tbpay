package com.alibaba.triver.cannal_engine.widgetInfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<TRWidgetInfo> CREATOR;
    String configData;
    String extData;
    String metaInfo;
    String orderId;
    @JSONField(name = "url")
    String relationUrl;
    viewConfig viewConfig;
    String widgetDataId;
    Long widgetId;
    String widgetVersion;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TRWidgetInfo() {
    }

    protected TRWidgetInfo(Parcel parcel) {
        this.configData = parcel.readString();
        this.extData = parcel.readString();
        this.metaInfo = parcel.readString();
        this.orderId = parcel.readString();
        this.widgetId = Long.valueOf(parcel.readLong());
        this.widgetVersion = parcel.readString();
        this.widgetDataId = parcel.readString();
        this.viewConfig = (viewConfig) parcel.readParcelable(viewConfig.class.getClassLoader());
        this.relationUrl = parcel.readString();
    }

    static {
        kge.a(2046447584);
        kge.a(1630535278);
        kge.a(1028243835);
        CREATOR = new Parcelable.Creator<TRWidgetInfo>() { // from class: com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TRWidgetInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TRWidgetInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TRWidgetInfo a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TRWidgetInfo) ipChange.ipc$dispatch("4071ca40", new Object[]{this, parcel}) : new TRWidgetInfo(parcel);
            }

            public TRWidgetInfo[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TRWidgetInfo[]) ipChange.ipc$dispatch("7ec6552f", new Object[]{this, new Integer(i)}) : new TRWidgetInfo[i];
            }
        };
    }

    public String getConfigData() {
        return this.configData;
    }

    public void setConfigData(String str) {
        this.configData = str;
    }

    public String getExtData() {
        return this.extData;
    }

    public void setExtData(String str) {
        this.extData = str;
    }

    public String getMetaInfo() {
        return this.metaInfo;
    }

    public void setMetaInfo(String str) {
        this.metaInfo = str;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public Long getWidgetId() {
        return this.widgetId;
    }

    public void setWidgetId(Long l) {
        this.widgetId = l;
    }

    public String getWidgetVersion() {
        return this.widgetVersion;
    }

    public void setWidgetVersion(String str) {
        this.widgetVersion = str;
    }

    public String getWidgetDataId() {
        return this.widgetDataId;
    }

    public void setWidgetDataId(String str) {
        this.widgetDataId = str;
    }

    public viewConfig getViewConfig() {
        return this.viewConfig;
    }

    public void setViewConfig(viewConfig viewconfig) {
        this.viewConfig = viewconfig;
    }

    public String getRelationUrl() {
        return this.relationUrl;
    }

    public void setRelationUrl(String str) {
        this.relationUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.configData);
        parcel.writeString(this.extData);
        parcel.writeString(this.metaInfo);
        parcel.writeString(this.orderId);
        parcel.writeLong(this.widgetId.longValue());
        parcel.writeString(this.widgetVersion);
        parcel.writeString(this.widgetDataId);
        parcel.writeParcelable(this.viewConfig, i);
        parcel.writeString(this.relationUrl);
    }

    /* loaded from: classes3.dex */
    public static class viewConfig implements Parcelable, Serializable {
        public static final Parcelable.Creator<viewConfig> CREATOR;
        String alignment;
        String height;
        String widgetDegradePic;
        String width;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public viewConfig() {
        }

        protected viewConfig(Parcel parcel) {
            this.height = parcel.readString();
            this.width = parcel.readString();
            this.alignment = parcel.readString();
            this.widgetDegradePic = parcel.readString();
        }

        static {
            kge.a(1490321803);
            kge.a(1630535278);
            kge.a(1028243835);
            CREATOR = new Parcelable.Creator<viewConfig>() { // from class: com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo.viewConfig.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo$viewConfig, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ viewConfig createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo$viewConfig[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ viewConfig[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public viewConfig a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (viewConfig) ipChange.ipc$dispatch("5efe610b", new Object[]{this, parcel}) : new viewConfig(parcel);
                }

                public viewConfig[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (viewConfig[]) ipChange.ipc$dispatch("9628fabc", new Object[]{this, new Integer(i)}) : new viewConfig[i];
                }
            };
        }

        public String getHeight() {
            return this.height;
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public String getWidth() {
            return this.width;
        }

        public void setWidth(String str) {
            this.width = str;
        }

        public String getAlignment() {
            return this.alignment;
        }

        public void setAlignment(String str) {
            this.alignment = str;
        }

        public String getWidgetDegradePic() {
            return this.widgetDegradePic;
        }

        public void setWidgetDegradePic(String str) {
            this.widgetDegradePic = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.height);
            parcel.writeString(this.width);
            parcel.writeString(this.alignment);
            parcel.writeString(this.widgetDegradePic);
        }
    }
}
