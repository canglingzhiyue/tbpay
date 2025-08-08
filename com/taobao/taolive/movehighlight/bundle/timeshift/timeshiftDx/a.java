package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.movehighlight.utils.e;
import com.taobao.taolive.movehighlight.utils.f;
import com.taobao.taolive.movehighlight.utils.j;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pfb;
import tb.pfk;
import tb.pfn;
import tb.pfy;
import tb.pgp;
import tb.pgq;
import tb.poz;
import tb.pqj;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21443a;
    private TBLiveDataModel b;
    private com.taobao.taolive.movehighlight.bussiness.highlight.newModel.a c;
    private int d = 0;
    private int e = 5;
    private View f;
    private com.taobao.alilive.aliliveframework.frame.a g;
    private pfn h;
    private String i;
    private C0896a j;

    /* loaded from: classes8.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(-151932101);
    }

    public static /* synthetic */ void a(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa2ee8a", new Object[]{aVar, bVar});
        } else {
            aVar.b(bVar);
        }
    }

    public static /* synthetic */ void a(a aVar, NetResponse netResponse, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655a43cf", new Object[]{aVar, netResponse, bVar});
        } else {
            aVar.a(netResponse, bVar);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, b bVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc98b0d", new Object[]{aVar, str, bVar, videoInfo});
        } else {
            aVar.a(str, bVar, videoInfo);
        }
    }

    public a(TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.b = tBLiveDataModel;
        this.f = view;
        this.g = aVar;
        b();
    }

    public a a(pfn pfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3089b25d", new Object[]{this, pfnVar});
        }
        this.h = pfnVar;
        return this;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.b;
        if (tBLiveDataModel == null || tBLiveDataModel.mInitParams == null) {
            return;
        }
        this.i = this.b.mInitParams.get(aw.PARAM_TRANSPARENT_PARAMS);
        this.i = j.a(this.i, this.b.mInitParams.get("timeMovingPcmIdParam"));
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, pgp pgpVar, String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2620a2a7", new Object[]{this, aVar, pgpVar, str, str2, bVar});
            return;
        }
        this.d = 0;
        this.e = 5;
        this.f21443a = str2;
        Map<String, String> a2 = poz.a(n.b(aVar), this.b);
        if (a2 != null && !StringUtils.isEmpty(a2.get(aw.PARAM_TIMEMOVING_ITEM_ID)) && StringUtils.isEmpty(str)) {
            str = a2.get(aw.PARAM_TIMEMOVING_ITEM_ID);
        }
        a(str, bVar, pgpVar);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b271d827", new Object[]{this, bVar});
            return;
        }
        this.e = 15;
        a((String) null, bVar, (pgp) null);
    }

    private void a(LiveTimemovingModel liveTimemovingModel) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4c8664", new Object[]{this, liveTimemovingModel});
            return;
        }
        pfb a2 = pfb.a(this.g);
        if (liveTimemovingModel != null && liveTimemovingModel.extendVal != null && !StringUtils.isEmpty(liveTimemovingModel.extendVal.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
            HashMap<String, String> a3 = pfk.a(timeMovingPlayInfo, liveTimemovingModel.extendVal.playUrl, this.g);
            if (a2.l() == null) {
                return;
            }
            a2.l().m(this.g, a3);
        } else if (liveTimemovingModel == null || liveTimemovingModel.extendVal == null || StringUtils.isEmpty(liveTimemovingModel.extendVal.playUrl)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(aw.PARAM_PLAY_URL, liveTimemovingModel.extendVal.playUrl);
            hashMap.put("type", "video");
            hashMap.put("loop", "true");
            if (a2.l() == null) {
                return;
            }
            a2.l().m(this.g, hashMap);
        }
    }

    /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0896a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f21445a;
        public final WeakReference<a> b;
        public final b c;
        public final pgp d;
        public String e;
        public VideoInfo f;
        public String g;

        static {
            kge.a(2082439070);
        }

        public static /* synthetic */ Object ipc$super(C0896a c0896a, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public C0896a(View view, a aVar, b bVar, pgp pgpVar, VideoInfo videoInfo, String str) {
            super("taolive_highlight_preloadThread");
            this.f21445a = new WeakReference<>(view);
            this.b = new WeakReference<>(aVar);
            this.c = bVar;
            this.d = pgpVar;
            this.f = videoInfo;
            this.g = str;
            a();
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            VideoInfo videoInfo = this.f;
            if (videoInfo == null || videoInfo.timeMovingPlayInfo == null) {
                return;
            }
            if (!StringUtils.isEmpty(this.f.timeMovingPlayInfo.keyPointId)) {
                this.e = this.f.timeMovingPlayInfo.keyPointId;
            } else if (!StringUtils.isEmpty(this.f.timeMovingPlayInfo.timeMovingId)) {
                this.e = this.f.timeMovingPlayInfo.timeMovingId;
            } else {
                this.e = null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            super.run();
            pgp pgpVar = this.d;
            if (pgpVar == null) {
                return;
            }
            try {
                final pgq take = pgpVar.d.take();
                if (take == null || this.f21445a.get() == null) {
                    return;
                }
                this.f21445a.get().post(new Runnable() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (C0896a.this.b.get() == null || C0896a.this.c == null) {
                        } else {
                            if (take.c != 0 || take.f32637a == null) {
                                a.a(C0896a.this.b.get(), C0896a.this.c);
                            } else if (take.b == null || !take.b.equals(C0896a.this.e)) {
                                a.a(C0896a.this.b.get(), C0896a.this.g, C0896a.this.c, C0896a.this.f);
                            } else {
                                a.a(C0896a.this.b.get(), take.f32637a, C0896a.this.c);
                            }
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str, b bVar, pgp pgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce02dd94", new Object[]{this, str, bVar, pgpVar});
            return;
        }
        VideoInfo a2 = k.a(this.b);
        if (this.d != 0) {
            this.i = j.a(this.i);
        }
        if (a2 == null || StringUtils.isEmpty(a2.liveId)) {
            return;
        }
        if (c.r() && this.d == 0 && pgpVar != null) {
            this.j = new C0896a(this.f, this, bVar, pgpVar, a2, str);
            this.j.start();
            return;
        }
        a(str, bVar, a2);
    }

    private void a(String str, final b bVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc63d10", new Object[]{this, str, bVar, videoInfo});
            return;
        }
        this.c = new com.taobao.taolive.movehighlight.bussiness.highlight.newModel.a(this.g, new d() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else {
                    a.a(a.this, netResponse, bVar);
                }
            }

            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    onSystemError(i, netResponse, obj);
                }
            }

            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a.a(a.this, bVar);
                }
            }
        });
        this.c.a(videoInfo.liveId, this.d, this.e, str, this.i, this.f21443a);
    }

    private void a(NetResponse netResponse, b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab588ec", new Object[]{this, netResponse, bVar});
            return;
        }
        if (this.d == 0) {
            f.a().c(System.currentTimeMillis());
        }
        if (netResponse == null || netResponse.getDataJsonObject() == null || (jSONObject = (JSONObject) pqj.a(netResponse.getDataJsonObject().toString())) == null || jSONObject.get("model") == null) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("model");
        if (jSONObject2 != null) {
            JSONArray jSONArray = jSONObject2.getJSONArray("timeMovingList");
            if (this.d == 0) {
                if (jSONArray != null && jSONArray.size() > 0) {
                    LiveTimemovingModel liveTimemovingModel = (LiveTimemovingModel) JSONObject.parseObject(((JSONObject) jSONArray.get(0)).toJSONString(), LiveTimemovingModel.class);
                    a(liveTimemovingModel);
                    pfn pfnVar = this.h;
                    if (pfnVar != null) {
                        pfnVar.a(liveTimemovingModel);
                    }
                    jSONObject.put("selectedItemId", (Object) liveTimemovingModel.itemId);
                    jSONObject.put("selectedItemIndex", (Object) 0);
                    LiveItem.TimeMovingPlayInfo a2 = pfy.a(liveTimemovingModel);
                    List<LiveItem.TimeMovingLabelInfos> a3 = pfy.a(JSONObject.toJSONString(a2));
                    if (a2 != null) {
                        if (a3.size() != 0) {
                            z = false;
                        }
                        jSONObject.put("hideStructList", (Object) Boolean.valueOf(z));
                        jSONObject.put("itemIsSpeaking", (Object) Boolean.valueOf(a2.isSpeaking));
                    }
                    jSONObject.put("kandianNewLayout", (Object) "new_layout_newCard");
                    e.a(this.g, this.b, liveTimemovingModel);
                } else {
                    jSONObject.put("hideStructList", (Object) true);
                    b(bVar);
                }
            }
            if (jSONArray != null && jSONArray.size() > 0) {
                this.d += this.e;
            }
        }
        bVar.a((JSONObject) jSONObject.clone());
    }

    private void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bc8d06", new Object[]{this, bVar});
        } else if (this.b == null || this.d != 0) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hideStructList", (Object) true);
            bVar.a(jSONObject);
            VideoInfo a2 = k.a(this.b);
            if (a2 == null || StringUtils.isEmpty(a2.replayUrl)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(aw.PARAM_PLAY_URL, a2.replayUrl);
            hashMap.put("type", "video");
            pfb a3 = pfb.a(this.g);
            if (a3.l() != null) {
                a3.l().m(this.g, hashMap);
            }
            if (a3.h() == null) {
                return;
            }
            a3.h().a(null);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.movehighlight.bussiness.highlight.newModel.a aVar = this.c;
        if (aVar != null) {
            aVar.a();
            this.c = null;
        }
        C0896a c0896a = this.j;
        if (c0896a == null) {
            return;
        }
        c0896a.interrupt();
        this.j = null;
    }
}
