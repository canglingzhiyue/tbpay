package com.taobao.taolive.room.afccoldlunch;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQueryResponse;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQueryResponseData;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.c;
import com.taobao.taolive.sdk.business.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.pqj;

/* loaded from: classes8.dex */
public class b implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.room.afccoldlunch.simple.a f21531a;
    private boolean b;
    private boolean c;
    private boolean d;
    private volatile SimpleVideoInfo e;
    private List<com.taobao.taolive.room.afccoldlunch.a> f;
    private Handler g;
    private HandlerThread h;
    private Handler i;

    /* loaded from: classes8.dex */
    public static class a {
        public static final b INSTANCE;

        static {
            kge.a(-385580897);
            INSTANCE = new b();
        }
    }

    public static /* synthetic */ List a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ab4d5eb", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    public static /* synthetic */ SimpleVideoInfo b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleVideoInfo) ipChange.ipc$dispatch("5eb2c178", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1482de2", new Object[]{bVar})).booleanValue() : bVar.b;
    }

    public static /* synthetic */ boolean d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4be8f063", new Object[]{bVar})).booleanValue() : bVar.c;
    }

    public static /* synthetic */ boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e689b2e4", new Object[]{bVar})).booleanValue() : bVar.d;
    }

    static {
        kge.a(-1966215220);
        kge.a(1432974066);
        TAG = b.class.getSimpleName();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b4f40422", new Object[0]) : a.INSTANCE;
    }

    private b() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = new ArrayList();
        this.g = new Handler(Looper.getMainLooper());
    }

    public void a(c cVar, PreSimpleRequestParams preSimpleRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adfed86", new Object[]{this, cVar, preSimpleRequestParams, str});
        } else {
            b(cVar, preSimpleRequestParams, str);
        }
    }

    private void b(c cVar, PreSimpleRequestParams preSimpleRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e11e525", new Object[]{this, cVar, preSimpleRequestParams, str});
        } else if (preSimpleRequestParams == null) {
            b("params null");
        } else {
            com.taobao.taolive.room.afccoldlunch.simple.a aVar = this.f21531a;
            if (aVar != null) {
                aVar.a();
            }
            this.b = true;
            this.c = false;
            this.d = false;
            this.e = null;
            this.h = new HandlerThread("PreSimpleRequestLive");
            this.h.start();
            this.i = new Handler(this.h.getLooper());
            String a2 = ak.a(preSimpleRequestParams.transParams, str);
            this.f21531a = new com.taobao.taolive.room.afccoldlunch.simple.a(cVar);
            this.f21531a.a(preSimpleRequestParams.needRecommend, preSimpleRequestParams.liveSource, preSimpleRequestParams.entryLiveSource, preSimpleRequestParams.feedId, preSimpleRequestParams.userId, preSimpleRequestParams.itemIds, preSimpleRequestParams.holdType, a2);
            this.f21531a.a(this);
            this.f21531a.a(this.i);
            b("startSimpleRequest :" + preSimpleRequestParams.needRecommend + " " + preSimpleRequestParams.liveSource + " " + preSimpleRequestParams.entryLiveSource);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.afccoldlunch.simple.a aVar = this.f21531a;
        if (aVar != null) {
            aVar.a();
            this.f21531a = null;
        }
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = null;
        List<com.taobao.taolive.room.afccoldlunch.a> list = this.f;
        if (list != null) {
            list.clear();
            this.f = null;
        }
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.g = null;
        }
        HandlerThread handlerThread = this.h;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.h = null;
        }
        Handler handler2 = this.i;
        if (handler2 == null) {
            return;
        }
        handler2.removeCallbacksAndMessages(null);
        this.i = null;
    }

    private void d() {
        List<com.taobao.taolive.room.afccoldlunch.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.g == null || (list = this.f) == null || list.isEmpty() || this.e == null) {
        } else {
            this.g.post(new Runnable() { // from class: com.taobao.taolive.room.afccoldlunch.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (b.a(b.this) != null && b.b(b.this) != null) {
                        b.a("sendSuccess :" + b.c(b.this) + " " + b.d(b.this) + " " + b.e(b.this));
                        for (com.taobao.taolive.room.afccoldlunch.a aVar : b.a(b.this)) {
                            aVar.a(b.b(b.this));
                        }
                    }
                }
            });
        }
    }

    private void e() {
        List<com.taobao.taolive.room.afccoldlunch.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.g == null || (list = this.f) == null || list.isEmpty()) {
        } else {
            this.g.post(new Runnable() { // from class: com.taobao.taolive.room.afccoldlunch.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (b.a(b.this) != null) {
                        b.a("sendFail :" + b.c(b.this) + " " + b.d(b.this) + " " + b.e(b.this));
                        for (com.taobao.taolive.room.afccoldlunch.a aVar : b.a(b.this)) {
                            aVar.a();
                        }
                    }
                }
            });
        }
    }

    public boolean a(com.taobao.taolive.room.afccoldlunch.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c063481", new Object[]{this, aVar})).booleanValue();
        }
        b("setResponseListener :" + this.b + " " + this.c + " " + this.d);
        if (this.b) {
            if (this.c) {
                if (this.d) {
                    if (aVar != null) {
                        aVar.a(this.e);
                    }
                } else if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
            List<com.taobao.taolive.room.afccoldlunch.a> list = this.f;
            if (list != null) {
                list.add(aVar);
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    public static LiveItem.SpfPlayVideo a(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.SpfPlayVideo) ipChange.ipc$dispatch("9783434a", new Object[]{simpleVideoInfo});
        }
        if (simpleVideoInfo == null || TextUtils.isEmpty(simpleVideoInfo.timeMovingSpfPlayVideo)) {
            return null;
        }
        return (LiveItem.SpfPlayVideo) pqj.a(simpleVideoInfo.timeMovingSpfPlayVideo, LiveItem.SpfPlayVideo.class);
    }

    public static MediaData b(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("c989bbe8", new Object[]{simpleVideoInfo});
        }
        if (simpleVideoInfo == null) {
            return null;
        }
        MediaData mediaData = new MediaData();
        mediaData.liveUrlList = simpleVideoInfo.liveUrlList;
        mediaData.liveId = simpleVideoInfo.liveId;
        mediaData.anchorId = simpleVideoInfo.accountId;
        return mediaData;
    }

    @Override // com.taobao.taolive.sdk.business.e
    public void a(NetResponse netResponse, NetBaseOutDo netBaseOutDo) {
        MtopTbliveRecommendVideoSimpleQueryResponseData mo1437getData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99ef3c9", new Object[]{this, netResponse, netBaseOutDo});
            return;
        }
        this.c = true;
        if ((netBaseOutDo instanceof MtopTbliveRecommendVideoSimpleQueryResponse) && (mo1437getData = ((MtopTbliveRecommendVideoSimpleQueryResponse) netBaseOutDo).mo1437getData()) != null && mo1437getData.model != null) {
            this.e = mo1437getData.model;
            this.d = true;
            m.d();
            d();
            return;
        }
        this.d = false;
        e();
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        m.b(TAG + "_" + str);
    }
}
