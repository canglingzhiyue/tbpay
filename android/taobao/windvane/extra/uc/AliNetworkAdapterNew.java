package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.config.j;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.export.network.f;
import android.taobao.windvane.export.network.g;
import android.taobao.windvane.export.network.l;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.taobao.windvane.jsbridge.t;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.adm;
import tb.kge;
import tb.mth;

/* loaded from: classes2.dex */
public class AliNetworkAdapterNew implements INetwork, adm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AliNetworkAdapter mAliNetworkAdapter;
    private final MtopSsrNetworkAdapter mMtopSsrNetworkAdapter;
    private WVUCWebView mWebView;

    static {
        kge.a(1394089311);
        kge.a(-1352689828);
        kge.a(1616078155);
    }

    public static /* synthetic */ WVUCWebView access$000(AliNetworkAdapterNew aliNetworkAdapterNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("5ef11a6c", new Object[]{aliNetworkAdapterNew}) : aliNetworkAdapterNew.mWebView;
    }

    public AliNetworkAdapterNew(Context context, String str) {
        this.mAliNetworkAdapter = new AliNetworkAdapter(context, 2, str);
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(this.mAliNetworkAdapter, null);
    }

    public AliNetworkAdapterNew(Context context, String str, WVUCWebView wVUCWebView) {
        this.mAliNetworkAdapter = new AliNetworkAdapter(context, str, wVUCWebView);
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(this.mAliNetworkAdapter, wVUCWebView);
        this.mWebView = wVUCWebView;
        if (!j.commonConfig.bY || wVUCWebView == null) {
            return;
        }
        this.mMtopSsrNetworkAdapter.setParentId(wVUCWebView.pageTracker.getPageIdentifier());
    }

    public AliNetworkAdapterNew(Context context, int i) {
        this.mAliNetworkAdapter = new AliNetworkAdapter(context, i);
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(this.mAliNetworkAdapter, null);
    }

    public AliNetworkAdapterNew(Context context) {
        this.mAliNetworkAdapter = new AliNetworkAdapter(context);
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(this.mAliNetworkAdapter, null);
    }

    public AliNetworkAdapterNew(Context context, int i, String str) {
        this.mAliNetworkAdapter = new AliNetworkAdapter(context, i, str);
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(this.mAliNetworkAdapter, null);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.mAliNetworkAdapter.getVersion();
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85230ab7", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (j.commonConfig.bY && mth.a(str)) {
            return this.mMtopSsrNetworkAdapter.requestURL(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
        }
        return this.mAliNetworkAdapter.requestURL(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRequest) ipChange.ipc$dispatch("5c346fdd", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)});
        }
        if (j.commonConfig.bY && mth.a(str)) {
            return this.mMtopSsrNetworkAdapter.formatRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
        }
        return this.mAliNetworkAdapter.formatRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
    }

    private boolean consumePrefetchRequest(IRequest iRequest) {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e5edd9", new Object[]{this, iRequest})).booleanValue();
        }
        if (iRequest == null || (wVUCWebView = this.mWebView) == null) {
            return false;
        }
        g prefetchInfo = wVUCWebView.getPrefetchInfo();
        String url = iRequest.getUrl();
        final EventHandler eventHandler = iRequest.getEventHandler();
        RequestCallback requestCallback = new RequestCallback() { // from class: android.taobao.windvane.extra.uc.AliNetworkAdapterNew.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onResponse(int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
                    return;
                }
                if (map != null) {
                    if (map.containsKey(HttpConstant.X_PROTOCOL)) {
                        List<String> list = map.get(HttpConstant.X_PROTOCOL);
                        if (list != null && list.size() > 0) {
                            String str = list.get(0);
                            if (!"http".equals(str) && !"https".equals(str)) {
                                eventHandler.status(2, 0, i, "");
                            } else {
                                eventHandler.status(0, 0, i, "");
                            }
                        }
                    } else if (map.containsKey(HttpConstant.STATUS)) {
                        eventHandler.status(2, 0, i, "");
                    } else {
                        eventHandler.status(0, 0, i, "");
                    }
                }
                eventHandler.headers(map);
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onReceiveData(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                } else {
                    eventHandler.data(bArr, bArr.length);
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onError(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                } else {
                    eventHandler.error(i, str);
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                } else {
                    eventHandler.endData();
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onCustomCallback(int i, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                } else if (i == 0) {
                    if (objArr == null || objArr.length != 1) {
                        return;
                    }
                    Object obj = objArr[0];
                    WVUCWebView access$000 = AliNetworkAdapterNew.access$000(AliNetworkAdapterNew.this);
                    if (!(obj instanceof Integer) || access$000 == null) {
                        return;
                    }
                    access$000.getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("H5_snapshotMatchType", obj);
                } else if (i != 1 || objArr == null || objArr.length != 1) {
                } else {
                    Object obj2 = objArr[0];
                    WVUCWebView access$0002 = AliNetworkAdapterNew.access$000(AliNetworkAdapterNew.this);
                    if (!(obj2 instanceof Boolean) || access$0002 == null) {
                        return;
                    }
                    access$0002.getWebViewContext().setHitSnapshot(((Boolean) obj2).booleanValue());
                }
            }
        };
        l stageRecorder = getStageRecorder();
        if (prefetchInfo != null && eventHandler != null && !TextUtils.isEmpty(url) && TextUtils.equals(url, prefetchInfo.f1601a) && f.a(prefetchInfo.b, requestCallback, stageRecorder)) {
            return true;
        }
        return f.a(url, requestCallback, stageRecorder);
    }

    private l getStageRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("17018e84", new Object[]{this});
        }
        final WVUCWebView wVUCWebView = this.mWebView;
        return new l() { // from class: android.taobao.windvane.extra.uc.AliNetworkAdapterNew.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.export.network.l
            public void recordStage(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a661a86", new Object[]{this, str, new Long(j)});
                    return;
                }
                WVUCWebView wVUCWebView2 = wVUCWebView;
                if (wVUCWebView2 == null || !t.b(wVUCWebView2)) {
                    return;
                }
                wVUCWebView.getWebViewContext().getWebViewPageModel().onStage(str, j);
            }

            @Override // android.taobao.windvane.export.network.l
            public void recordProperty(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d2bd161", new Object[]{this, str, str2});
                    return;
                }
                WVUCWebView wVUCWebView2 = wVUCWebView;
                if (wVUCWebView2 == null || !t.b(wVUCWebView2)) {
                    return;
                }
                wVUCWebView.getWebViewContext().getWebViewPageModel().onPropertyIfAbsent(str, str2);
            }
        };
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean sendRequest(IRequest iRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f55a9b04", new Object[]{this, iRequest})).booleanValue();
        }
        if (consumePrefetchRequest(iRequest)) {
            try {
                WVUCWebView wVUCWebView = this.mWebView;
                if (wVUCWebView != null) {
                    wVUCWebView.getWebViewContext().getWebViewPageModel().onProperty("documentPrefetchHit", true);
                }
            } catch (Exception unused) {
            }
            return true;
        } else if (iRequest instanceof MTopSSRRequest) {
            return this.mMtopSsrNetworkAdapter.sendRequest(iRequest);
        } else {
            return this.mAliNetworkAdapter.sendRequest(iRequest);
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue() : this.mAliNetworkAdapter.getNetworkType();
    }

    public void destoryWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78625e6c", new Object[]{this});
        } else {
            this.mAliNetworkAdapter.destoryWebView();
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mAliNetworkAdapter.setBizCode(str);
        }
    }

    public void setId(adm admVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddb8aa", new Object[]{this, admVar});
        } else {
            this.mAliNetworkAdapter.setId(admVar);
        }
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
        } else {
            this.mAliNetworkAdapter.updateCurId();
        }
    }

    @Override // tb.adm
    public String getCurId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this}) : this.mAliNetworkAdapter.getCurId();
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this}) : this.mAliNetworkAdapter.getPId();
    }
}
