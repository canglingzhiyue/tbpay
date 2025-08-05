package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.taobao.windvane.monitor.a;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import tb.kge;
import tb.mtd;
import tb.mtj;
import tb.mtk;

/* loaded from: classes2.dex */
public class MtopSsrNetworkAdapter implements INetwork {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXCEPTION_FAILED_CODE = 417;
    private static final String MODULE = "WindVane/NetworkSSR";
    private final INetwork mDowngradeNetwork;
    private MtopRequestListener mMtopRequestListener;
    private WVUCWebView mWebView;
    private long mRequestId = 0;
    private String mParentId = "";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface MtopRequestListener {
        void beforeRequest(long j, String str, Map<String, String> map);

        void onFinish(long j, String str, long j2, boolean z);

        void onResponse(long j, String str, int i, Map<String, List<String>> map);
    }

    static {
        kge.a(-1177514995);
        kge.a(-1352689828);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : "1.0";
    }

    public static /* synthetic */ String access$000(MtopSsrNetworkAdapter mtopSsrNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34c2ccc7", new Object[]{mtopSsrNetworkAdapter}) : mtopSsrNetworkAdapter.mParentId;
    }

    public static /* synthetic */ INetwork access$100(MtopSsrNetworkAdapter mtopSsrNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INetwork) ipChange.ipc$dispatch("e24952f", new Object[]{mtopSsrNetworkAdapter}) : mtopSsrNetworkAdapter.mDowngradeNetwork;
    }

    public MtopSsrNetworkAdapter(INetwork iNetwork, WVUCWebView wVUCWebView) {
        this.mDowngradeNetwork = iNetwork;
        this.mWebView = wVUCWebView;
        setRequestListener(new MtopRequestListener() { // from class: android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.MtopRequestListener
            public void beforeRequest(long j, String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fab35b0e", new Object[]{this, new Long(j), str, map});
                } else {
                    e.a(RVLLevel.Info, MtopSsrNetworkAdapter.MODULE).a("request", String.valueOf(j)).b(MtopSsrNetworkAdapter.access$000(MtopSsrNetworkAdapter.this)).a("url", (Object) str).a("header", map).a();
                }
            }

            @Override // android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.MtopRequestListener
            public void onResponse(long j, String str, int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fe29489", new Object[]{this, new Long(j), str, new Integer(i), map});
                    return;
                }
                RVLLevel rVLLevel = (i < 200 || i > 300) ? RVLLevel.Warn : RVLLevel.Info;
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if (entry.getValue() != null && entry.getValue().size() > 0) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str2 : entry.getValue()) {
                                jSONArray.put(str2);
                            }
                            if (entry.getKey() != null) {
                                jSONObject.put(entry.getKey(), (Object) jSONArray);
                            }
                        } else {
                            jSONObject.put(entry.getKey(), (Object) entry.getValue());
                        }
                    }
                }
                e.a(rVLLevel, MtopSsrNetworkAdapter.MODULE).a(InputFrame3.TYPE_RESPONSE, String.valueOf(j)).b(MtopSsrNetworkAdapter.access$000(MtopSsrNetworkAdapter.this)).a("url", (Object) str).a("statusCode", Integer.valueOf(i)).a("header", jSONObject).a();
            }

            @Override // android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.MtopRequestListener
            public void onFinish(long j, String str, long j2, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("59c46365", new Object[]{this, new Long(j), str, new Long(j2), new Boolean(z)});
                } else {
                    e.a(RVLLevel.Info, MtopSsrNetworkAdapter.MODULE).a("finish", String.valueOf(j)).b(MtopSsrNetworkAdapter.access$000(MtopSsrNetworkAdapter.this)).a("url", (Object) str).a("dataSize", Long.valueOf(j2)).a("isSuccess", Boolean.valueOf(z)).a();
                }
            }
        });
    }

    public void setParentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aaf138", new Object[]{this, str});
        } else {
            this.mParentId = str;
        }
    }

    private void setRequestListener(MtopRequestListener mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f05f13", new Object[]{this, mtopRequestListener});
        } else {
            this.mMtopRequestListener = mtopRequestListener;
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85230ab7", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)})).booleanValue() : sendRequest(formatRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2));
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRequest) ipChange.ipc$dispatch("5c346fdd", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)}) : new MTopSSRRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean sendRequest(final IRequest iRequest) {
        mtj ssrRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f55a9b04", new Object[]{this, iRequest})).booleanValue();
        }
        if (!(iRequest instanceof MTopSSRRequest) || (ssrRequest = ((MTopSSRRequest) iRequest).getSsrRequest()) == null) {
            return false;
        }
        mtd createSsrService = MtopSsrServiceFactory.createSsrService();
        final EventHandler eventHandler = iRequest.getEventHandler();
        if (createSsrService != null && eventHandler != null) {
            this.mRequestId++;
            final long j = this.mRequestId;
            final MtopRequestListener mtopRequestListener = this.mMtopRequestListener;
            if (mtopRequestListener != null) {
                mtopRequestListener.beforeRequest(j, ssrRequest.f31244a, ssrRequest.c);
            }
            return createSsrService.asyncSend(ssrRequest, new ChunkCacheRequestCallback() { // from class: android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private long mTotalSize = 0;

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
                public void onCustomCallback(int i, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                    }
                }

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
                public void onNetworkResponse(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                    }
                }

                @Override // tb.mtc
                public void onResponse(mtj mtjVar, int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a35e9ad6", new Object[]{this, mtjVar, new Integer(i), map});
                        return;
                    }
                    if (map.containsKey(HttpConstant.X_PROTOCOL) && map.get(HttpConstant.X_PROTOCOL).size() != 0) {
                        String str = map.get(HttpConstant.X_PROTOCOL).get(0);
                        if (!str.equals("http") && !str.equals("https")) {
                            eventHandler.status(2, 0, i, "");
                        } else {
                            eventHandler.status(0, 0, i, "");
                        }
                    } else if (map.containsKey(HttpConstant.STATUS)) {
                        eventHandler.status(2, 0, i, "");
                    } else {
                        eventHandler.status(0, 0, i, "");
                    }
                    eventHandler.headers(map);
                    if (mtopRequestListener == null) {
                        return;
                    }
                    String str2 = null;
                    if (mtjVar != null) {
                        str2 = mtjVar.f31244a;
                    }
                    mtopRequestListener.onResponse(j, str2, i, map);
                }

                @Override // tb.mtc
                public void onReceiveData(mtj mtjVar, byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d536689", new Object[]{this, mtjVar, bArr});
                        return;
                    }
                    eventHandler.data(bArr, bArr.length);
                    this.mTotalSize += bArr.length;
                }

                @Override // tb.mtc
                public void onError(mtj mtjVar, mtk mtkVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab769ea9", new Object[]{this, mtjVar, mtkVar});
                    } else if (mtjVar == null || mtkVar == null) {
                    } else {
                        if (mtkVar.f31246a == 417) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", (Object) mtjVar.f31244a);
                            a.commitSuccess("mtopSSRDowngrade", jSONObject.toJSONString());
                            e.a(RVLLevel.Error, MtopSsrNetworkAdapter.MODULE, "downgrade network to normal request");
                            MtopSsrNetworkAdapter.access$100(MtopSsrNetworkAdapter.this).sendRequest(((MTopSSRRequest) iRequest).copyRequest(MtopSsrNetworkAdapter.access$100(MtopSsrNetworkAdapter.this)));
                            return;
                        }
                        eventHandler.error(mtkVar.f31246a, mtkVar.c);
                        e.a(RVLLevel.Error, MtopSsrNetworkAdapter.MODULE).a("ssr request").a("url", (Object) mtjVar.f31244a).a(mtkVar.f31246a, mtkVar.c).a();
                        if (mtopRequestListener == null) {
                            return;
                        }
                        mtopRequestListener.onFinish(j, mtjVar.f31244a, this.mTotalSize, false);
                    }
                }

                @Override // tb.mtc
                public void onFinish(mtj mtjVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cfd81c6", new Object[]{this, mtjVar});
                        return;
                    }
                    eventHandler.endData();
                    MtopRequestListener mtopRequestListener2 = mtopRequestListener;
                    if (mtopRequestListener2 == null || mtjVar == null) {
                        return;
                    }
                    mtopRequestListener2.onFinish(j, mtjVar.f31244a, this.mTotalSize, true);
                }
            }, null);
        }
        return false;
    }
}
