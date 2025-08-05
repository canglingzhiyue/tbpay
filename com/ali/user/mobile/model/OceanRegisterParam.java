package com.ali.user.mobile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class OceanRegisterParam implements Parcelable {
    public static final Parcelable.Creator<OceanRegisterParam> CREATOR;
    public String checkCode;
    public String codeLength;
    public String companyName;
    public String countryCode;
    public String email;
    public Map<String, String> externParams;
    public String firstName;
    public boolean haveCompany;
    public String lastName;
    public String locale;
    public String loginSourcePage;
    public String loginSourceType;
    public String mobileAreaCode;
    public String mobileNum;
    public String nick;
    public String password;
    public String sendType;
    public String sessionId;
    public String thirdType;
    public String thirdUserId;
    public String token;
    public String traceId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.checkCode);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.mobileAreaCode);
        parcel.writeString(this.mobileNum);
        parcel.writeString(this.email);
        parcel.writeString(this.password);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.companyName);
        parcel.writeString(this.thirdUserId);
        parcel.writeString(this.thirdType);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.sendType);
        parcel.writeInt(this.haveCompany ? 1 : 0);
    }

    public OceanRegisterParam() {
    }

    protected OceanRegisterParam(Parcel parcel) {
        this.checkCode = parcel.readString();
        this.countryCode = parcel.readString();
        this.mobileAreaCode = parcel.readString();
        this.mobileNum = parcel.readString();
        this.email = parcel.readString();
        this.password = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.companyName = parcel.readString();
        this.thirdUserId = parcel.readString();
        this.thirdType = parcel.readString();
        this.sessionId = parcel.readString();
        this.sendType = parcel.readString();
        this.haveCompany = parcel.readInt() != 1 ? false : true;
    }

    static {
        kge.a(-830527174);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<OceanRegisterParam>() { // from class: com.ali.user.mobile.model.OceanRegisterParam.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public OceanRegisterParam mo103createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (OceanRegisterParam) ipChange.ipc$dispatch("8a5672b4", new Object[]{this, parcel}) : new OceanRegisterParam(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public OceanRegisterParam[] mo104newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (OceanRegisterParam[]) ipChange.ipc$dispatch("9d2faddd", new Object[]{this, new Integer(i)}) : new OceanRegisterParam[i];
            }
        };
    }
}
