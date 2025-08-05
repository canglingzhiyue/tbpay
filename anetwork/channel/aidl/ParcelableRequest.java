package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.Param;
import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class ParcelableRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequest> CREATOR;
    private static final String TAG = "anet.ParcelableRequest";
    public boolean allowRedirect;
    public String bizId;
    public BodyEntry bodyEntry;
    public String charset;
    public int connectTimeout;
    public Map<String, String> extProperties;
    public Map<String, String> headers;
    public String method;
    public Map<String, String> params;
    public int readTimeout;
    public Request request;
    public int retryTime;
    public String seqNo;
    public String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableRequest(Request request) {
        this.headers = null;
        this.params = null;
        this.request = request;
        if (request != null) {
            this.url = request.getUrlString();
            this.retryTime = request.getRetryTime();
            this.charset = request.getCharset();
            this.allowRedirect = request.getFollowRedirects();
            this.method = request.getMethod();
            List<Header> headers = request.getHeaders();
            if (headers != null) {
                this.headers = new HashMap();
                for (Header header : headers) {
                    this.headers.put(header.getName(), header.getValue());
                }
            }
            List<Param> params = request.getParams();
            if (params != null) {
                this.params = new HashMap();
                for (Param param : params) {
                    this.params.put(param.getKey(), param.getValue());
                }
            }
            this.bodyEntry = request.getBodyEntry();
            this.connectTimeout = request.getConnectTimeout();
            this.readTimeout = request.getReadTimeout();
            this.bizId = request.getBizId();
            this.seqNo = request.getSeqNo();
            this.extProperties = request.getExtProperties();
        }
    }

    public ParcelableRequest() {
        this.headers = null;
        this.params = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Request request = this.request;
        if (request == null) {
            return;
        }
        try {
            parcel.writeInt(request.getRetryTime());
            parcel.writeString(this.url);
            parcel.writeString(this.request.getCharset());
            int i2 = 1;
            parcel.writeInt(this.request.getFollowRedirects() ? 1 : 0);
            parcel.writeString(this.request.getMethod());
            parcel.writeInt(this.headers == null ? 0 : 1);
            if (this.headers != null) {
                parcel.writeMap(this.headers);
            }
            parcel.writeInt(this.params == null ? 0 : 1);
            if (this.params != null) {
                parcel.writeMap(this.params);
            }
            parcel.writeParcelable(this.bodyEntry, 0);
            parcel.writeInt(this.request.getConnectTimeout());
            parcel.writeInt(this.request.getReadTimeout());
            parcel.writeString(this.request.getBizId());
            parcel.writeString(this.request.getSeqNo());
            Map<String, String> extProperties = this.request.getExtProperties();
            if (extProperties == null) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            if (extProperties == null) {
                return;
            }
            parcel.writeMap(extProperties);
        } catch (Throwable th) {
            ALog.w(TAG, "[writeToParcel]", null, th, new Object[0]);
        }
    }

    public static ParcelableRequest readFromParcel(Parcel parcel) {
        ParcelableRequest parcelableRequest = new ParcelableRequest();
        try {
            parcelableRequest.retryTime = parcel.readInt();
            parcelableRequest.url = parcel.readString();
            parcelableRequest.charset = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            parcelableRequest.allowRedirect = z;
            parcelableRequest.method = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.headers = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                parcelableRequest.params = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            parcelableRequest.bodyEntry = (BodyEntry) parcel.readParcelable(ParcelableRequest.class.getClassLoader());
            parcelableRequest.connectTimeout = parcel.readInt();
            parcelableRequest.readTimeout = parcel.readInt();
            parcelableRequest.bizId = parcel.readString();
            parcelableRequest.seqNo = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.extProperties = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
        } catch (Throwable th) {
            ALog.w(TAG, "[readFromParcel]", null, th, new Object[0]);
        }
        return parcelableRequest;
    }

    static {
        kge.a(1249187995);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ParcelableRequest>() { // from class: anetwork.channel.aidl.ParcelableRequest.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public ParcelableRequest mo81createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParcelableRequest) ipChange.ipc$dispatch("68ad4aad", new Object[]{this, parcel}) : ParcelableRequest.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public ParcelableRequest[] mo82newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParcelableRequest[]) ipChange.ipc$dispatch("6983f9e4", new Object[]{this, new Integer(i)}) : new ParcelableRequest[i];
            }
        };
    }

    public String getExtProperty(String str) {
        Map<String, String> map = this.extProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }
}
