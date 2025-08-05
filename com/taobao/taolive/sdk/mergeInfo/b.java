package com.taobao.taolive.sdk.mergeInfo;

import android.content.Context;
import android.net.Uri;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.utils.n;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.pmd;
import tb.pqj;
import tb.tki;

/* loaded from: classes8.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ALL = "all";
    public static final String TYPE_PART = "part";
    public static final String VALUE_ITEM_HOLD_TYPE_CARD = "multiItemCard";

    /* renamed from: a  reason: collision with root package name */
    private boolean f21837a;
    private UnImportantLiveInfoResponseData c;
    private com.taobao.taolive.sdk.mergeInfo.a f;
    private h g;
    private Context h;
    private String i;
    private CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();
    private int d = -9999;
    private NetResponse e = null;

    /* loaded from: classes8.dex */
    public interface a {
        void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj);

        void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj);

        void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj);
    }

    static {
        kge.a(-15908380);
        kge.a(-797454141);
    }

    public static /* synthetic */ NetResponse a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetResponse) ipChange.ipc$dispatch("683a41ea", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4811915b", new Object[]{bVar})).intValue() : bVar.d;
    }

    public static /* synthetic */ UnImportantLiveInfoResponseData c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UnImportantLiveInfoResponseData) ipChange.ipc$dispatch("de3be580", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.mergeInfo.a d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.mergeInfo.a) ipChange.ipc$dispatch("f8191f8c", new Object[]{bVar}) : bVar.f;
    }

    public void a(Context context, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97d2400", new Object[]{this, context, hVar});
        } else if (!b() || this.f21837a) {
        } else {
            b("init");
            this.f21837a = true;
            this.f = new com.taobao.taolive.sdk.mergeInfo.a(this);
            this.g = hVar;
            this.h = context;
            this.i = UUID.randomUUID().toString();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!b() || !this.f21837a) {
        } else {
            b("unInit");
            this.f21837a = false;
            this.d = -9999;
            this.b.clear();
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
        }
    }

    public void a(UnImportantLiveInfoRequest unImportantLiveInfoRequest) {
        com.taobao.taolive.sdk.mergeInfo.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b65b", new Object[]{this, unImportantLiveInfoRequest});
        } else if (!b() || unImportantLiveInfoRequest == null || (aVar = this.f) == null) {
        } else {
            aVar.a((INetDataObject) unImportantLiveInfoRequest);
            String a2 = pqj.a(unImportantLiveInfoRequest);
            b("request " + a2);
            a(a2);
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38660ca", new Object[]{this, aVar});
        } else if (!b()) {
        } else {
            if (this.c != null) {
                ADaemon.postMainLooper(new Runnable() { // from class: com.taobao.taolive.sdk.mergeInfo.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (aVar == null || b.a(b.this) == null) {
                        } else {
                            aVar.onUnImportantLiveInfoSuccess(b.b(b.this), b.a(b.this), b.c(b.this), b.d(b.this));
                        }
                    }
                }, new long[0]);
            } else {
                this.b.add(aVar);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(final int i, final NetResponse netResponse, NetBaseOutDo netBaseOutDo, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (b()) {
            if (netBaseOutDo instanceof UnImportantLiveInfoResponse) {
                this.c = (UnImportantLiveInfoResponseData) ((UnImportantLiveInfoResponse) netBaseOutDo).mo1437getData();
            }
            this.d = i;
            this.e = netResponse;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                final a aVar = this.b.get(i2);
                if (aVar != null) {
                    ADaemon.postMainLooper(new Runnable() { // from class: com.taobao.taolive.sdk.mergeInfo.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            NetResponse netResponse2 = netResponse;
                            if (netResponse2 == null) {
                                return;
                            }
                            aVar.onUnImportantLiveInfoSuccess(i, netResponse2, b.c(b.this), obj);
                        }
                    }, new long[0]);
                }
            }
            this.b.clear();
            a(a(netResponse), true);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(final int i, final NetResponse netResponse, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (b()) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                final a aVar = this.b.get(i2);
                if (aVar != null) {
                    com.taobao.taolive.sdk.utils.h.a().a(new Runnable() { // from class: com.taobao.taolive.sdk.mergeInfo.b.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                aVar.onUnImportantLiveInfoError(i, netResponse, obj);
                            }
                        }
                    });
                }
            }
            this.b.clear();
            a(a(netResponse), false);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(final int i, final NetResponse netResponse, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (b()) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                final a aVar = this.b.get(i2);
                if (aVar != null) {
                    com.taobao.taolive.sdk.utils.h.a().a(new Runnable() { // from class: com.taobao.taolive.sdk.mergeInfo.b.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                aVar.onUnImportantLiveInfoSystemError(i, netResponse, obj);
                            }
                        }
                    });
                }
            }
            this.b.clear();
            a(a(netResponse), false);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : tki.a();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!tki.b()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(e.REQUEST_ID, this.i);
            h hVar = this.g;
            if (hVar != null) {
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, hVar.d);
            }
            hashMap.put("requestParams", Uri.encode(str));
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "mtopMergedReqMonitor", hashMap);
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (!tki.b()) {
        } else {
            b("RequestRet " + z + " traceId = " + str);
            HashMap hashMap = new HashMap();
            hashMap.put(e.REQUEST_ID, this.i);
            h hVar = this.g;
            if (hVar != null) {
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, hVar.d);
            }
            hashMap.put("traceId", str);
            hashMap.put("isSuccess", String.valueOf(z));
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "mtopMergedResMonitor", hashMap);
        }
    }

    private String a(NetResponse netResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4802013d", new Object[]{this, netResponse});
        }
        if (netResponse == null) {
            return "";
        }
        try {
            return (netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0) ? "" : list.get(0);
        } catch (Exception unused) {
            return "";
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.g != null) {
            n.a("UnImportantLiveInfoService", this.g.j() + " " + str);
        } else {
            n.a("UnImportantLiveInfoService", "null " + str);
        }
    }
}
