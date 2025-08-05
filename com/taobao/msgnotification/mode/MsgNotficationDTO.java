package com.taobao.msgnotification.mode;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MsgNotficationDTO implements Parcelable {
    public static final Parcelable.Creator<MsgNotficationDTO> CREATOR;
    public int bizType;
    public String channelId;
    public String extraImgUrl;
    public String importance;
    public boolean isMultiContent;
    public int mergeType;
    public String notification;
    public int notificationId;
    public String personalImgUrl;
    public int popup;
    public JSONObject sceneTemplateData;
    public int sceneTemplateId;
    public String sound;
    public String text;
    public String ticker;
    public String title;
    public String url;
    public int view_type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MsgNotficationDTO() {
        this.mergeType = 0;
        this.view_type = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
    }

    public MsgNotficationDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, int i5, JSONObject jSONObject, int i6) {
        this.mergeType = 0;
        this.view_type = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
        this.title = str;
        this.ticker = str2;
        this.text = str3;
        this.url = str4;
        this.personalImgUrl = str5;
        this.notification = str6;
        this.sound = str7;
        this.popup = i;
        this.notificationId = i2;
        this.view_type = i3;
        this.mergeType = i4;
        this.sceneTemplateId = i5;
        this.sceneTemplateData = jSONObject;
        this.bizType = i6;
    }

    public MsgNotficationDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3) {
        this.mergeType = 0;
        this.view_type = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
        this.title = str;
        this.ticker = str2;
        this.text = str3;
        this.url = str4;
        this.personalImgUrl = str5;
        this.notification = str6;
        this.sound = str7;
        this.popup = i;
        this.notificationId = i2;
        this.view_type = i3;
    }

    public MsgNotficationDTO(Parcel parcel) {
        this.mergeType = 0;
        this.view_type = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
        this.title = parcel.readString();
        this.ticker = parcel.readString();
        this.text = parcel.readString();
        this.url = parcel.readString();
        this.personalImgUrl = parcel.readString();
        this.notification = parcel.readString();
        this.sound = parcel.readString();
        this.popup = parcel.readInt();
        this.notificationId = parcel.readInt();
        this.view_type = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.ticker);
        parcel.writeString(this.text);
        parcel.writeString(this.url);
        parcel.writeString(this.personalImgUrl);
        parcel.writeString(this.notification);
        parcel.writeString(this.sound);
        parcel.writeInt(this.popup);
        parcel.writeInt(this.notificationId);
        parcel.writeInt(this.view_type);
    }

    static {
        kge.a(1278954690);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MsgNotficationDTO>() { // from class: com.taobao.msgnotification.mode.MsgNotficationDTO.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.msgnotification.mode.MsgNotficationDTO] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MsgNotficationDTO createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.msgnotification.mode.MsgNotficationDTO[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MsgNotficationDTO[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MsgNotficationDTO[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MsgNotficationDTO[]) ipChange.ipc$dispatch("8ebf2965", new Object[]{this, new Integer(i)}) : new MsgNotficationDTO[i];
            }

            public MsgNotficationDTO a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MsgNotficationDTO) ipChange.ipc$dispatch("43ebd574", new Object[]{this, parcel}) : new MsgNotficationDTO(parcel);
            }
        };
    }
}
