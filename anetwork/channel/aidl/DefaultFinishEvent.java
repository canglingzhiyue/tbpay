package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.NetworkEvent;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class DefaultFinishEvent implements Parcelable, NetworkEvent.FinishEvent {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR;
    int code;
    Object context;
    String desc;
    public final Request request;
    public final RequestStatistic rs;
    StatisticData statisticData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getContext() {
        return this.context;
    }

    public void setContext(Object obj) {
        this.context = obj;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public int getHttpCode() {
        return this.code;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public String getDesc() {
        return this.desc;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public StatisticData getStatisticData() {
        return this.statisticData;
    }

    public DefaultFinishEvent(int i) {
        this(i, null, null, null);
    }

    public DefaultFinishEvent(int i, String str, RequestStatistic requestStatistic) {
        this(i, str, null, requestStatistic);
    }

    public DefaultFinishEvent(int i, String str, Request request) {
        this(i, str, request, request != null ? request.rs : null);
    }

    private DefaultFinishEvent(int i, String str, Request request, RequestStatistic requestStatistic) {
        this.statisticData = new StatisticData();
        this.code = i;
        this.desc = str == null ? ErrorConstant.getErrMsg(i) : str;
        this.request = request;
        this.rs = requestStatistic;
    }

    public String toString() {
        return "DefaultFinishEvent [code=" + this.code + ", desc=" + this.desc + ", context=" + this.context + ", statisticData=" + this.statisticData + riy.ARRAY_END_STR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.desc);
        StatisticData statisticData = this.statisticData;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    static DefaultFinishEvent readFromParcel(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.code = parcel.readInt();
            defaultFinishEvent.desc = parcel.readString();
            defaultFinishEvent.statisticData = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }

    static {
        kge.a(-1310766537);
        kge.a(-1998897955);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<DefaultFinishEvent>() { // from class: anetwork.channel.aidl.DefaultFinishEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public DefaultFinishEvent mo73createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultFinishEvent) ipChange.ipc$dispatch("b574a2d7", new Object[]{this, parcel}) : DefaultFinishEvent.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public DefaultFinishEvent[] mo74newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultFinishEvent[]) ipChange.ipc$dispatch("cf73da80", new Object[]{this, new Integer(i)}) : new DefaultFinishEvent[i];
            }
        };
    }
}
