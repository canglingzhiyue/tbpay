package com.ut.share.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareData implements Parcelable {
    public static final Parcelable.Creator<ShareData> CREATOR;
    private String bizType;
    private String businessId;
    private String imagePath;
    private String imageUrl;
    private String link;
    private float price;
    private String sourceType = "";
    private String text;
    private String title;
    private MessageType type;
    private Map<String, String> userInfo;

    /* loaded from: classes9.dex */
    public enum MessageType {
        TEXT(0),
        IMAGE(1),
        VIDEO(2),
        MEDIA(3),
        WEBPAGE(4),
        OTHER(5);
        
        private int value;

        MessageType(int i) {
            this.value = i;
        }

        public static MessageType getEnum(int i) {
            MessageType[] values;
            for (MessageType messageType : values()) {
                if (messageType.value == i) {
                    return messageType;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return name();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareData() {
        this.businessId = "";
        this.title = "";
        this.text = "";
        this.link = "";
        this.imageUrl = "";
        this.imagePath = "";
        this.type = MessageType.MEDIA;
        this.price = 0.0f;
        this.bizType = "";
        this.businessId = "";
        this.title = "";
        this.text = "";
        this.link = "";
        this.imageUrl = "";
        this.imagePath = "";
        this.price = 0.0f;
        this.bizType = "";
        this.type = MessageType.MEDIA;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String str) {
        this.businessId = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public MessageType getType() {
        return this.type;
    }

    public void setType(MessageType messageType) {
        this.type = messageType;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public Map<String, String> getUserInfo() {
        return this.userInfo;
    }

    public void setUserInfo(Map<String, String> map) {
        this.userInfo = map;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.businessId);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.link);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.type.ordinal());
        parcel.writeFloat(this.price);
        parcel.writeString(this.bizType);
    }

    static {
        kge.a(-1518583050);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ShareData>() { // from class: com.ut.share.data.ShareData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public ShareData mo1612createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ShareData) ipChange.ipc$dispatch("f2abc732", new Object[]{this, parcel});
                }
                ShareData shareData = new ShareData();
                shareData.setBusinessId(parcel.readString());
                shareData.setTitle(parcel.readString());
                shareData.setText(parcel.readString());
                shareData.setLink(parcel.readString());
                shareData.setImageUrl(parcel.readString());
                shareData.setImagePath(parcel.readString());
                shareData.setType(MessageType.values()[parcel.readInt()]);
                shareData.setPrice(parcel.readFloat());
                shareData.setBizType(parcel.readString());
                return shareData;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public ShareData[] mo1613newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ShareData[]) ipChange.ipc$dispatch("505e50e9", new Object[]{this, new Integer(i)}) : new ShareData[i];
            }
        };
    }
}
