package com.taobao.android.detail.wrapper.ext.request.redpacket;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class OpenRedPacketClient extends MtopRequestClient<OpenRedPacketParams, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String API;
    private String TAG;

    static {
        kge.a(-1570262193);
    }

    public static /* synthetic */ Object ipc$super(OpenRedPacketClient openRedPacketClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ a access$000(OpenRedPacketClient openRedPacketClient, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e49f1a0", new Object[]{openRedPacketClient, str}) : openRedPacketClient.parserResult(str);
    }

    public static /* synthetic */ WeakReference access$100(OpenRedPacketClient openRedPacketClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("56c566a8", new Object[]{openRedPacketClient}) : openRedPacketClient.mRequestListenerRef;
    }

    public OpenRedPacketClient(OpenRedPacketParams openRedPacketParams, String str, MtopRequestListener<a> mtopRequestListener) {
        super(openRedPacketParams, str, mtopRequestListener);
        this.TAG = OpenRedPacketClient.class.getSimpleName();
        this.API = "mtop.taobao.pagani.api.freshman.hongbao.get";
        emu.a("com.taobao.android.detail.wrapper.ext.request.redpacket.OpenRedPacketClient");
    }

    private a parserResult(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9311e2c8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return null;
        }
        String string = jSONObject2.getString("message");
        Boolean bool = jSONObject2.getBoolean("success");
        a aVar = new a();
        aVar.f11372a = bool.booleanValue();
        aVar.c = str;
        aVar.b = string;
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.wrapper.ext.request.redpacket.OpenRedPacketClient$1] */
    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, a>() { // from class: com.taobao.android.detail.wrapper.ext.request.redpacket.OpenRedPacketClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.android.detail.wrapper.ext.request.redpacket.a] */
                @Override // android.os.AsyncTask
                public /* synthetic */ a doInBackground(MtopResponse[] mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, aVar});
                    } else {
                        a(aVar);
                    }
                }

                public a a(MtopResponse... mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (a) ipChange2.ipc$dispatch("fd488f8d", new Object[]{this, mtopResponseArr});
                    }
                    try {
                        return OpenRedPacketClient.access$000(OpenRedPacketClient.this, mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return null;
                    }
                }

                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6051c43", new Object[]{this, aVar});
                        return;
                    }
                    MtopRequestListener mtopRequestListener = null;
                    try {
                        mtopRequestListener = (MtopRequestListener) OpenRedPacketClient.access$100(OpenRedPacketClient.this).get();
                    } catch (Exception unused) {
                    }
                    if (mtopRequestListener == null) {
                        return;
                    }
                    if (aVar == null) {
                        mtopRequestListener.a(mtopResponse);
                    } else {
                        mtopRequestListener.b(aVar);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        mtopRequestListener.a(mtopResponse);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        mtopRequestListener.a(mtopResponse);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : ((OpenRedPacketParams) this.mParams).apiName;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : ((OpenRedPacketParams) this.mParams).version;
    }
}
