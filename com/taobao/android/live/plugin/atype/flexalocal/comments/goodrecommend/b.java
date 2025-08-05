package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ddv;
import tb.ddw;
import tb.hkk;
import tb.kge;
import tb.phq;

/* loaded from: classes5.dex */
public class b implements d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f13675a;
    private long b;
    private long c;
    private ImportantEventItem d;
    private a f;
    private String k;
    private final phq l;
    private LinkedBlockingQueue<ImportantEventItem> g = new LinkedBlockingQueue<>();
    private AtomicBoolean h = new AtomicBoolean();
    private AtomicBoolean i = new AtomicBoolean(false);
    private AtomicInteger j = new AtomicInteger();
    private Handler e = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                b.a(b.this);
            } else if (i != 2) {
            } else {
                b.a(b.this, (ImportantEventItem) message.obj);
            }
        }
    };

    static {
        kge.a(-518269043);
        kge.a(-797454141);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "GoodRecommendManager";
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b7dbf4", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ void a(b bVar, ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8afb63", new Object[]{bVar, importantEventItem});
        } else {
            bVar.a(importantEventItem);
        }
    }

    public b(phq phqVar) {
        this.l = phqVar;
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else if (!hkk.p() || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.liveId) || !hkk.a(tBLiveDataModel.mVideoInfo)) {
        } else {
            this.k = tBLiveDataModel.mVideoInfo.liveId;
            this.f13675a = hkk.q();
            this.b = hkk.u();
            this.c = hkk.v();
            ddw.a().a(this);
            this.f = new a(this);
            a(hkk.s());
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        Handler handler = this.e;
        if (handler == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, j * 1000);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!hkk.p()) {
        } else {
            ddw.a().b(this);
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.e = null;
            }
            this.f = null;
            this.g.clear();
            this.h.set(false);
            this.d = null;
            this.i.set(false);
            this.j.set(0);
            this.k = null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h.set(false);
        ImportantEventItem importantEventItem = this.d;
        if (importantEventItem == null) {
            return;
        }
        a(importantEventItem);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.h.set(true);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if ((netBaseOutDo instanceof GoodRecommendResponse) && (netBaseOutDo.mo1437getData() instanceof GoodRecommendDO)) {
            GoodRecommendDO goodRecommendDO = (GoodRecommendDO) netBaseOutDo.mo1437getData();
            this.f13675a = goodRecommendDO.pullInterval > 0 ? goodRecommendDO.pullInterval : this.f13675a;
            this.b = goodRecommendDO.showItemDelay > 0 ? goodRecommendDO.showItemDelay : this.b;
            this.c = goodRecommendDO.showGroupCount > 0 ? goodRecommendDO.showGroupCount : this.c;
            List<ImportantEventItem> list = goodRecommendDO.items;
            if (list != null && !list.isEmpty()) {
                this.g.addAll(list);
                b(0L);
            }
        }
        a(this.f13675a);
    }

    private void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (this.g.isEmpty() || this.e == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.obj = this.g.poll();
            obtain.what = 2;
            this.e.sendMessageDelayed(obtain, j * 1000);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a(this.f13675a);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a(this.f13675a);
        }
    }

    private void a(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61639fd7", new Object[]{this, importantEventItem});
        } else if (importantEventItem == null) {
        } else {
            if (this.h.get()) {
                this.d = importantEventItem;
            } else if (this.j.incrementAndGet() > this.c && !this.i.get()) {
                a();
            } else {
                this.d = null;
                if (hkk.x() && importantEventItem.dataMessage != null && !TextUtils.isEmpty(this.k)) {
                    importantEventItem.dataMessage.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) this.k);
                }
                ddw.a().a("com.taobao.taolive.room.important_event_goods_recommend", importantEventItem);
                b(this.b);
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.a(this.k);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.goods_list_showing".equals(str) && (obj instanceof Boolean)) {
            if (((Boolean) obj).booleanValue()) {
                c();
            } else {
                b();
            }
        } else if (!"com.taobao.taolive.room.important_event_goods_recommend_click".equals(str)) {
        } else {
            this.i.set(true);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.goods_list_showing", "com.taobao.taolive.room.important_event_goods_recommend_click"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        phq phqVar = this.l;
        if (phqVar != null) {
            return phqVar.G();
        }
        return null;
    }
}
