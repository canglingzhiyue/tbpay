package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class NetworkResponse implements Parcelable, Response {
    public static final Parcelable.Creator<NetworkResponse> CREATOR;
    private static final String TAG = "anet.NetworkResponse";
    byte[] bytedata;
    private Map<String, List<String>> connHeadFields;
    private String desc;
    private Throwable error;
    private StatisticData statisticData;
    int statusCode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
        this.desc = ErrorConstant.getErrMsg(i);
    }

    @Override // anetwork.channel.Response
    public byte[] getBytedata() {
        return this.bytedata;
    }

    public void setBytedata(byte[] bArr) {
        this.bytedata = bArr;
    }

    public void setConnHeadFields(Map<String, List<String>> map) {
        this.connHeadFields = map;
    }

    @Override // anetwork.channel.Response
    public Map<String, List<String>> getConnHeadFields() {
        return this.connHeadFields;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    @Override // anetwork.channel.Response
    public String getDesc() {
        return this.desc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse [");
        sb.append("statusCode=");
        sb.append(this.statusCode);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", connHeadFields=");
        sb.append(this.connHeadFields);
        sb.append(", bytedata=");
        byte[] bArr = this.bytedata;
        sb.append(bArr != null ? new String(bArr) : "");
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", statisticData=");
        sb.append(this.statisticData);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public NetworkResponse() {
    }

    public NetworkResponse(int i) {
        this.statusCode = i;
        this.desc = ErrorConstant.getErrMsg(i);
    }

    @Override // anetwork.channel.Response
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // anetwork.channel.Response
    public Throwable getError() {
        return this.error;
    }

    public void setError(Throwable th) {
        this.error = th;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.statusCode);
        parcel.writeString(this.desc);
        byte[] bArr = this.bytedata;
        int length = bArr != null ? bArr.length : 0;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.bytedata);
        }
        parcel.writeMap(this.connHeadFields);
        StatisticData statisticData = this.statisticData;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public static NetworkResponse readFromParcel(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.statusCode = parcel.readInt();
            networkResponse.desc = parcel.readString();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                networkResponse.bytedata = new byte[readInt];
                parcel.readByteArray(networkResponse.bytedata);
            }
            networkResponse.connHeadFields = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            networkResponse.statisticData = (StatisticData) parcel.readSerializable();
        } catch (Exception e) {
            ALog.w(TAG, "[readFromParcel]", null, e, new Object[0]);
        }
        return networkResponse;
    }

    static {
        kge.a(-1410187074);
        kge.a(-2097101041);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<NetworkResponse>() { // from class: anetwork.channel.aidl.NetworkResponse.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public NetworkResponse mo77createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (NetworkResponse) ipChange.ipc$dispatch("afcf2e2a", new Object[]{this, parcel}) : NetworkResponse.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public NetworkResponse[] mo78newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (NetworkResponse[]) ipChange.ipc$dispatch("ea263f21", new Object[]{this, new Integer(i)}) : new NetworkResponse[i];
            }
        };
    }

    public void setStatisticData(StatisticData statisticData) {
        this.statisticData = statisticData;
    }

    @Override // anetwork.channel.Response
    public StatisticData getStatisticData() {
        return this.statisticData;
    }
}
