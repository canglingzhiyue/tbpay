package android.taobao.windvane.extra.uc;

import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.taobao.windvane.util.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import java.net.URLEncoder;
import java.util.Map;
import tb.kge;
import tb.mtj;

/* loaded from: classes2.dex */
public class MTopSSRRequest implements IRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVaneMTopSSRRequest";
    private EventHandler mEventHandler;
    private final Map<String, String> mHeaders;
    private final boolean mIsUCProxyReq;
    public int mLoadType;
    private final String mMethod;
    public int mRequestType;
    private final mtj mSsrRequest;
    private final Map<String, String> mUcHeaders;
    public Map<String, byte[]> mUploadDataMap;
    public Map<String, String> mUploadFileMap;
    public long mUploadFileTotalLen;
    private final String mUrl;

    static {
        kge.a(1002051875);
        kge.a(-2100482115);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public MTopSSRRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        if (j.commonConfig.ch && map != null) {
            map.put("tb-client-context", a.b());
            String aPICallRecords = APIContextHelper.getAPICallRecords(str);
            if (aPICallRecords != null) {
                if (j.commonConfig.cL) {
                    try {
                        aPICallRecords = URLEncoder.encode(aPICallRecords, "UTF-8");
                    } catch (Exception e) {
                        e.a(RVLLevel.Error, TAG).a("encodeAPIContext").a("msg", (Object) e.getMessage()).a();
                    }
                }
                map.put("api-context", aPICallRecords);
            }
        }
        this.mEventHandler = eventHandler;
        this.mUrl = str;
        this.mMethod = str2;
        this.mIsUCProxyReq = z;
        this.mHeaders = map;
        this.mUcHeaders = map2;
        this.mUploadFileMap = map3;
        this.mUploadDataMap = map4;
        this.mUploadFileTotalLen = j;
        this.mRequestType = i;
        this.mLoadType = i2;
        this.mSsrRequest = new mtj.a().a(str).a(map).b(str2).a();
    }

    public mtj getSsrRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mtj) ipChange.ipc$dispatch("a6f222e9", new Object[]{this}) : this.mSsrRequest;
    }

    public IRequest copyRequest(INetwork iNetwork) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRequest) ipChange.ipc$dispatch("5b0fbdb4", new Object[]{this, iNetwork}) : iNetwork.formatRequest(this.mEventHandler, this.mUrl, this.mMethod, this.mIsUCProxyReq, this.mHeaders, this.mUcHeaders, this.mUploadFileMap, this.mUploadDataMap, this.mUploadFileTotalLen, this.mRequestType, this.mLoadType);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void setEventHandler(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cc001", new Object[]{this, eventHandler});
        } else {
            this.mEventHandler = eventHandler;
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.mUrl;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.mMethod;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public EventHandler getEventHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventHandler) ipChange.ipc$dispatch("ccb6ed91", new Object[]{this}) : this.mEventHandler;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.mHeaders;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, String> getUploadFileMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("96766785", new Object[]{this}) : this.mUploadFileMap;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, byte[]> getUploadDataMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e57f3617", new Object[]{this}) : this.mUploadDataMap;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public long getUploadFileTotalLen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6542f2df", new Object[]{this})).longValue() : this.mUploadFileTotalLen;
    }
}
