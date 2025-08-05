package com.taobao.taolive.sdk.core.impl;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import org.json.JSONException;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.ppq;
import tb.pqi;
import tb.pqj;

/* loaded from: classes8.dex */
public class TBLiveDataProvider implements d, IRemoteExtendListener, ppq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mErrorCode;
    private String mFeedId;
    private IRemoteExtendListener mIRemoteExtendListener;
    private LiveEmbedType mIsShopEmbedType;
    private com.taobao.taolive.sdk.business.detail.b mLiveDetailBusiness = null;
    private b mResponseHeaderListener;
    private ppq.a mVideoInfoListener;

    /* loaded from: classes8.dex */
    public interface b {
        void onGetHeaderFields(Map<String, List<String>> map);
    }

    static {
        kge.a(1675229821);
        kge.a(435275650);
        kge.a(-797454141);
        kge.a(600413623);
    }

    public static /* synthetic */ void access$100(TBLiveDataProvider tBLiveDataProvider, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1fa0b6", new Object[]{tBLiveDataProvider, str});
        } else {
            tBLiveDataProvider.onCdnSuccess(str);
        }
    }

    public static /* synthetic */ void access$200(TBLiveDataProvider tBLiveDataProvider, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c520f255", new Object[]{tBLiveDataProvider, str});
        } else {
            tBLiveDataProvider.onCdnFailed(str);
        }
    }

    public static /* synthetic */ ppq.a access$300(TBLiveDataProvider tBLiveDataProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppq.a) ipChange.ipc$dispatch("1bafdd2e", new Object[]{tBLiveDataProvider}) : tBLiveDataProvider.mVideoInfoListener;
    }

    public void setShopEmbedType(LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e24319", new Object[]{this, liveEmbedType});
        } else {
            this.mIsShopEmbedType = liveEmbedType;
        }
    }

    @Override // tb.ppq
    public void getVideoInfo(com.taobao.taolive.sdk.business.detail.a aVar, String str, ppq.a aVar2) {
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f549f50c", new Object[]{this, aVar, str, aVar2});
            return;
        }
        pmd.a().m().c(pnj.LOG_TAG, "getVideoInfo: feedId = " + aVar.b() + " userId = " + aVar.d() + "rcmd = " + str + " jsonStr = " + aVar.h());
        this.mVideoInfoListener = aVar2;
        if (l.e(aVar.b())) {
            b2 = "account_" + aVar.d();
        } else {
            b2 = aVar.b();
        }
        this.mFeedId = b2;
        this.mErrorCode = "";
        if (u.m()) {
            startCdnRequest(aVar.b());
            return;
        }
        if (this.mLiveDetailBusiness == null) {
            this.mLiveDetailBusiness = new com.taobao.taolive.sdk.business.detail.b(this);
            this.mLiveDetailBusiness.a((IRemoteExtendListener) this);
        }
        aVar.a(this.mIsShopEmbedType);
        this.mLiveDetailBusiness.a(aVar, str);
    }

    @Override // tb.ppq
    public void setIRemoteExtendListener(IRemoteExtendListener iRemoteExtendListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636bea08", new Object[]{this, iRemoteExtendListener});
        } else {
            this.mIRemoteExtendListener = iRemoteExtendListener;
        }
    }

    @Override // tb.ppq
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.business.detail.b bVar = this.mLiveDetailBusiness;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.mLiveDetailBusiness = null;
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
            return;
        }
        IRemoteExtendListener iRemoteExtendListener = this.mIRemoteExtendListener;
        if (iRemoteExtendListener == null) {
            return;
        }
        iRemoteExtendListener.dataParseBegin(j);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        VideoInfo videoInfo;
        FandomInfo fandomInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        pmd.a().m().c(pnj.LOG_TAG, "getVideoInfo --- onSuccess");
        if (!(obj instanceof com.taobao.taolive.sdk.business.detail.b)) {
            return;
        }
        if (this.mVideoInfoListener != null && netBaseOutDo != null && netResponse != null) {
            JSONObject jSONObject = (JSONObject) netBaseOutDo.mo1437getData();
            String str = null;
            if (jSONObject != null && "2".equals(jSONObject.getString("detailType"))) {
                pmd.a().m().c(pnj.LOG_TAG, "getVideoInfo --- detail type is fandom.");
                try {
                    fandomInfo = (FandomInfo) pqj.a(jSONObject, FandomInfo.class);
                } catch (Exception e) {
                    e.printStackTrace();
                    fandomInfo = null;
                }
                try {
                    str = new org.json.JSONObject(new String(netResponse.getBytedata())).optString("data");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                this.mVideoInfoListener.onGetFandomInfoSuccess(fandomInfo, str);
            } else {
                try {
                    videoInfo = (VideoInfo) pqj.a(jSONObject, VideoInfo.class);
                } catch (Exception e3) {
                    e3.printStackTrace();
                    videoInfo = null;
                }
                if (videoInfo != null && videoInfo.needFetchCdn) {
                    startCdnRequest(this.mFeedId);
                    pqi.a().a("forceLiveDetailCDN", 1.0d);
                    return;
                }
                try {
                    str = new org.json.JSONObject(new String(netResponse.getBytedata())).optString("data");
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                if (videoInfo != null) {
                    videoInfo.dataSource = "mtop";
                }
                this.mVideoInfoListener.onGetVideoInfoSuccess(videoInfo, str);
            }
            onMtopSuccess();
        } else {
            onMtopFailed("DATA_NULL", "DATA_NULL");
        }
        b bVar = this.mResponseHeaderListener;
        if (bVar == null || netResponse == null) {
            return;
        }
        bVar.onGetHeaderFields(netResponse.getHeaderFields());
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onSystemError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str2 = "";
        if (netResponse != null) {
            str2 = netResponse.getRetMsg();
            str = netResponse.getRetCode();
        } else {
            str = str2;
        }
        pnj m = pmd.a().m();
        m.c(pnj.LOG_TAG, "getVideoInfo: onError:" + str2);
        onMtopFailed(str, str2);
    }

    public void setResponseHeaderListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6316e3b", new Object[]{this, bVar});
        } else {
            this.mResponseHeaderListener = bVar;
        }
    }

    private void startCdnRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5122335", new Object[]{this, str});
        } else {
            new a().execute(str);
        }
    }

    /* loaded from: classes8.dex */
    public class a extends AsyncTask<String, Integer, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-951267474);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        public /* synthetic */ String doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, str});
            } else {
                a(str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.net.HttpURLConnection] */
        public String a(String... strArr) {
            Throwable th;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{this, strArr});
            }
            ?? r5 = u.o() + strArr[0];
            BufferedReader bufferedReader = null;
            try {
                try {
                    r5 = (HttpURLConnection) new URL(r5).openConnection();
                    try {
                        r5.setRequestMethod("GET");
                        r5.setConnectTimeout(3000);
                        r5.setReadTimeout(3000);
                        int responseCode = r5.getResponseCode();
                        if (responseCode != 200) {
                            String str = "" + responseCode;
                            if (r5 != 0) {
                                r5.disconnect();
                            }
                            return str;
                        }
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(r5.getInputStream()));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            if (l.e(sb.toString())) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                                if (r5 != 0) {
                                    r5.disconnect();
                                }
                                return "DATA_NULL";
                            }
                            String sb2 = sb.toString();
                            try {
                                bufferedReader2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            if (r5 != 0) {
                                r5.disconnect();
                            }
                            return sb2;
                        } catch (Exception e4) {
                            e = e4;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            String exc = e.toString();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (r5 != 0) {
                                r5.disconnect();
                            }
                            return exc;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                            }
                            if (r5 != 0) {
                                r5.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Exception e8) {
                    e = e8;
                    r5 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    r5 = 0;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public void a(String str) {
            VideoInfo videoInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            super.onPostExecute(str);
            try {
                videoInfo = (VideoInfo) JSONObject.parseObject(str, VideoInfo.class);
            } catch (Exception unused) {
                videoInfo = null;
            }
            try {
                TBLiveDataProvider.access$100(TBLiveDataProvider.this, String.valueOf(videoInfo.status));
            } catch (Exception unused2) {
                TBLiveDataProvider.access$200(TBLiveDataProvider.this, str);
                if (TBLiveDataProvider.access$300(TBLiveDataProvider.this) == null) {
                    return;
                }
                return;
            }
            if (TBLiveDataProvider.access$300(TBLiveDataProvider.this) == null || videoInfo == null) {
                return;
            }
            videoInfo.dataSource = "cdn";
            TBLiveDataProvider.access$300(TBLiveDataProvider.this).onGetVideoInfoSuccess(videoInfo, str);
        }
    }

    private void onCdnSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f23726", new Object[]{this, str});
            return;
        }
        pqi.a().a("liveroomLiveDetailFetchCdn", JSON.toJSONString(pqi.a().b()));
        onRequestSuccess();
    }

    private void onCdnFailed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e834fffc", new Object[]{this, str});
            return;
        }
        pqi.a().a("liveroomLiveDetailFetchCdn", JSON.toJSONString(pqi.a().b()), str, str);
        onRequestFailed(str);
    }

    private void onMtopSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619c843", new Object[]{this});
            return;
        }
        pqi.a().a("liveroomLiveDetailFetchMtop", JSON.toJSONString(pqi.a().b()));
        onRequestSuccess();
    }

    private void onMtopFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3791c57f", new Object[]{this, str, str2});
            return;
        }
        this.mErrorCode = str;
        if (ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            onRequestFailed(str);
            return;
        }
        pqi.a().a("liveroomLiveDetailFetchMtop", JSON.toJSONString(pqi.a().b()), str, str);
        if (u.n()) {
            startCdnRequest(this.mFeedId);
        } else {
            onRequestFailed(str);
        }
    }

    private void onRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1065913a", new Object[]{this});
        } else {
            pqi.a().a("liveroomLiveDetailFetchAll", JSON.toJSONString(pqi.a().b()));
        }
    }

    private void onRequestFailed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee02f2de", new Object[]{this, str});
            return;
        }
        pqi.a().a("liveroomLiveDetailFetchAll", JSON.toJSONString(pqi.a().b()), str, str);
        ppq.a aVar = this.mVideoInfoListener;
        if (aVar == null) {
            return;
        }
        aVar.onGetVideoInfoFail(this.mErrorCode);
    }
}
