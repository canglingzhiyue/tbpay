package com.alibaba.poplayer.trigger;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cai;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR;
    public final String attachKeyCode;
    private String augeCode;
    private long createSystemTime;
    private long createTimeStamp;
    public final String curPage;
    public final String curPageUrl;
    protected cai mProcessCallBack;
    public BaseConfigItem originConfigItem;
    public String originUri;
    public final String param;
    private PreDealCustomEventParams preDealCustomEventParams;
    public final int source;
    private String traceInfo;
    private JSONObject ucpBackFlowTrackInfo;
    public final String uri;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int BroadcastDirectly = 3;
        public static final int BroadcastPreDeal = 4;
        public static final int BroadcastSchema = 1;
        public static final int PageSwitch = 2;
        public static final int PopHub = 5;

        static {
            kge.a(-1469322198);
        }

        public static boolean a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 1 || i == 3 || i == 4 || i == 5;
        }

        public static String b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
            }
            if (i == 1) {
                return "BroadcastSchema";
            }
            if (i == 2) {
                return "PageSwitch";
            }
            if (i == 3) {
                return "BroadcastDirectly";
            }
            if (i == 4) {
                return "BroadcastPreDeal";
            }
            if (i == 5) {
                return "PopHub";
            }
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Event(String str, BaseConfigItem baseConfigItem, String str2, String str3, String str4, String str5, String str6, int i) {
        this.uri = str;
        this.originUri = this.uri;
        this.traceInfo = str3;
        this.originConfigItem = baseConfigItem;
        this.param = str2;
        this.attachKeyCode = str4;
        this.curPage = str5;
        this.source = i;
        this.curPageUrl = str6;
        this.createTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        this.createSystemTime = SystemClock.elapsedRealtime();
    }

    public Event(String str, String str2, String str3, PreDealCustomEventParams preDealCustomEventParams) {
        this("", null, "", "", str, str2, str3, 4);
        this.preDealCustomEventParams = preDealCustomEventParams;
    }

    protected Event(Parcel parcel) {
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.traceInfo = parcel.readString();
        this.source = parcel.readInt();
        this.attachKeyCode = parcel.readString();
        this.curPage = parcel.readString();
        this.curPageUrl = parcel.readString();
        this.originUri = parcel.readString();
        this.createTimeStamp = parcel.readLong();
        this.preDealCustomEventParams = (PreDealCustomEventParams) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeString(this.traceInfo);
        parcel.writeInt(this.source);
        parcel.writeString(this.attachKeyCode);
        parcel.writeString(this.curPage);
        parcel.writeString(this.curPageUrl);
        parcel.writeString(this.originUri);
        parcel.writeLong(this.createTimeStamp);
        parcel.writeSerializable(this.preDealCustomEventParams);
    }

    static {
        kge.a(-1182237803);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Event>() { // from class: com.alibaba.poplayer.trigger.Event.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.poplayer.trigger.Event] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Event createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.poplayer.trigger.Event[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Event[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public Event a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Event) ipChange.ipc$dispatch("10c8eeb", new Object[]{this, parcel}) : new Event(parcel);
            }

            public Event[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Event[]) ipChange.ipc$dispatch("8d43f71a", new Object[]{this, new Integer(i)}) : new Event[i];
            }
        };
    }

    public static boolean isDirectlyOpen(String str) {
        if (!str.startsWith("poplayer")) {
            return false;
        }
        return "directly".equals(Uri.parse(str).getQueryParameter("openType"));
    }

    public String getTraceInfo() {
        return this.traceInfo;
    }

    public long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public long getCreateSystemTime() {
        return this.createSystemTime;
    }

    public PreDealCustomEventParams getPreDealCustomEventParams() {
        return this.preDealCustomEventParams;
    }

    public JSONObject getUcpBackFlowTrackInfo() {
        return this.ucpBackFlowTrackInfo;
    }

    public String getAugeCode() {
        return this.augeCode;
    }

    public void setAugeCode(String str) {
        this.augeCode = str;
    }

    public void setUcpBackFlowTrackInfo(JSONObject jSONObject) {
        this.ucpBackFlowTrackInfo = jSONObject;
    }

    public void setProcessCallBack(cai caiVar) {
        this.mProcessCallBack = caiVar;
    }

    public cai getProcessCallBack() {
        return this.mProcessCallBack;
    }

    public String toString() {
        try {
            return "{uri:+ " + this.uri + ",param:" + this.param + ",keyCode:" + this.attachKeyCode + ",curPage:" + this.curPage + ",source:" + this.source + riy.BRACKET_END_STR;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Event.toString.error", th);
            return "_event:" + this.uri;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Event) {
            Event event = (Event) obj;
            int i = event.source;
            int i2 = this.source;
            if (i != i2 || a.a(i2)) {
                return super.equals(obj);
            }
            return com.alibaba.poplayer.utils.g.a((Object) this.uri, (Object) event.uri) && com.alibaba.poplayer.utils.g.a((Object) this.attachKeyCode, (Object) event.attachKeyCode) && com.alibaba.poplayer.utils.g.a((Object) this.curPage, (Object) event.curPage) && com.alibaba.poplayer.utils.g.a((Object) this.curPageUrl, (Object) event.curPageUrl);
        }
        return super.equals(obj);
    }
}
