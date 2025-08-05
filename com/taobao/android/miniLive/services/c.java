package com.taobao.android.miniLive.services;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.core.f;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.j;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import tb.htz;
import tb.hua;
import tb.kge;
import tb.pmd;
import tb.ppq;
import tb.ppt;

/* loaded from: classes6.dex */
public class c implements hua.a, ppq.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_ANCHOR_BACK = 4;
    public static final int STATUS_ANCHOR_END = 5;
    public static final int STATUS_ANCHOR_LEAVE = 3;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_INIT_FAIL = 2;
    public static final int STATUS_INIT_SUCCESS = 1;

    /* renamed from: a  reason: collision with root package name */
    private static c f14349a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private JSONObject h;
    private ppq l;
    private TBLiveDataModel m;
    private boolean n;
    private hua o;
    private boolean i = false;
    private ArrayList<ppt> j = new ArrayList<>();
    private String k = "0";
    private boolean p = false;
    private Object q = null;
    private HashMap<hua.a, MessageTypeFilter> r = new HashMap<>();

    static {
        kge.a(944369029);
        kge.a(788651310);
        kge.a(1406151845);
    }

    @Override // tb.ppq.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
        }
    }

    private c() {
        if (f.a().b() == null) {
            f.a().a(Globals.getApplication(), aw.BIZCODE_TAOBAO);
        }
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ad1b292", new Object[0]);
        }
        if (f14349a == null) {
            synchronized (c.class) {
                if (f14349a == null) {
                    f14349a = new c();
                }
            }
        }
        return f14349a;
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11451dcc", new Object[]{this, str, str2, str3, str4, str5, str6, jSONObject});
            return;
        }
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.c = str6;
        this.h = jSONObject;
    }

    public void a(ppt pptVar) {
        ArrayList<ppt> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa13b7e4", new Object[]{this, pptVar});
        } else if (pptVar == null || (arrayList = this.j) == null) {
        } else {
            arrayList.add(pptVar);
        }
    }

    public void b(ppt pptVar) {
        ArrayList<ppt> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e896be65", new Object[]{this, pptVar});
        } else if (pptVar == null || (arrayList = this.j) == null) {
        } else {
            arrayList.remove(pptVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l = f.a().c();
        if (this.l != null) {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("itemid", (Object) this.e);
            }
            jSONObject.put("guardAnchorSwitch", (Object) Boolean.valueOf(pmd.a().a("enableAnchorGuard")));
            jSONObject.put("version", (Object) "202003");
            JSONObject jSONObject2 = this.h;
            if (jSONObject2 != null) {
                jSONObject.putAll(jSONObject2);
            }
            this.l.getVideoInfo(new com.taobao.taolive.sdk.business.detail.a(this.b, "").c(this.f).d(this.g).e(this.c).f(jSONObject.toString()), this.k, this);
        }
        b(0, null);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    @Override // tb.ppq.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
        } else if (videoInfo == null) {
        } else {
            if (this.m == null) {
                this.m = new TBLiveDataModel();
            }
            TBLiveDataModel tBLiveDataModel = this.m;
            tBLiveDataModel.mVideoInfo = videoInfo;
            tBLiveDataModel.mRoomInfo = new ChatRoomInfo();
            this.m.mRoomInfo.roomId = videoInfo.topic;
            this.m.mRawData = str;
            if (videoInfo.status == 4 || videoInfo.status == 0 || videoInfo.status == 3 || videoInfo.status == 1) {
                String str2 = videoInfo.topic;
                String str3 = videoInfo.channel;
                boolean z2 = videoInfo.fetchCommentsUseMtop;
                if (videoInfo.status == 1) {
                    z = true;
                }
                a(str2, str3, z2, z);
            }
            b(1, this.m);
        }
    }

    private void a(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a078fc", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.m == null) {
            this.m = new TBLiveDataModel();
        }
        this.m.mRoomInfo = new ChatRoomInfo();
        this.m.mRoomInfo.roomId = str;
        if (!u.t()) {
            return;
        }
        hua huaVar = this.o;
        if (huaVar != null) {
            huaVar.b();
            this.o.d();
        }
        if (z2) {
            if (this.m.mVideoInfo == null) {
                return;
            }
            this.o = new hua(this.m.mVideoInfo.roomType, this.m.mVideoInfo.topic, z, this.m.mVideoInfo.forceCommentsUseCdn, this);
        } else {
            this.o = new htz(this.m.mVideoInfo.roomType, str, str2, z, this.m.mVideoInfo.forceCommentsUseCdn, this.i, u.r() && this.m.mVideoInfo.fetchItemUseCdn && !TextUtils.isEmpty(this.m.mVideoInfo.fetchItemUseCdnUrl), this);
        }
        this.o.a(this.n);
        this.o.a(this.m.mVideoInfo.liveId);
        this.o.c();
        this.o.a();
    }

    public TBLiveDataModel d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("130ddd84", new Object[]{this}) : this.m;
    }

    private void b(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), obj});
        } else if (5 == i && e.a().b() == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            this.p = true;
            this.q = obj;
        } else {
            ArrayList<ppt> arrayList = this.j;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            Iterator<ppt> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().a_(i, obj);
            }
        }
    }

    @Override // tb.ppq.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
        } else {
            b(2, str);
        }
    }

    @Override // tb.hua.a
    public void a(int i, Object obj) {
        JoinNotifyMessage joinNotifyMessage;
        ShareGoodsListMessage shareGoodsListMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (i == 102) {
            TBLiveDataModel tBLiveDataModel = this.m;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && this.m.mVideoInfo.status != 1 && (joinNotifyMessage = (JoinNotifyMessage) obj) != null) {
                this.m.mVideoInfo.joinCount = joinNotifyMessage.onlineCount;
                this.m.mVideoInfo.totalJoinCount = joinNotifyMessage.totalCount;
                this.m.mVideoInfo.viewCount = joinNotifyMessage.pageViewCount;
            }
        } else if (i == 1002) {
            TBLiveDataModel tBLiveDataModel2 = this.m;
            if (tBLiveDataModel2 != null && tBLiveDataModel2.mVideoInfo != null && this.m.mVideoInfo.status != 1) {
                this.m.mVideoInfo.praiseCount = ((Long) obj).longValue();
            }
        } else if (i == 1004) {
            TBLiveDataModel tBLiveDataModel3 = this.m;
            if (tBLiveDataModel3 != null && tBLiveDataModel3.mVideoInfo != null) {
                this.m.mVideoInfo.status = 1;
            }
            b(5, obj);
        } else if (i == 1009) {
            TBLiveDataModel tBLiveDataModel4 = this.m;
            if (tBLiveDataModel4 != null && tBLiveDataModel4.mVideoInfo != null && this.m.mVideoInfo.status != 1 && (shareGoodsListMessage = (ShareGoodsListMessage) obj) != null) {
                this.m.mVideoInfo.curItemNum = shareGoodsListMessage.totalCount;
                if (shareGoodsListMessage.goodsList != null) {
                    this.m.mVideoInfo.curItemList = new ArrayList<>();
                    for (ShareGoodMessage shareGoodMessage : shareGoodsListMessage.goodsList) {
                        this.m.mVideoInfo.curItemList.add(j.a(shareGoodMessage));
                    }
                }
            }
        } else if (i == 1006) {
            TBLiveDataModel tBLiveDataModel5 = this.m;
            if (tBLiveDataModel5 != null && tBLiveDataModel5.mVideoInfo != null) {
                this.m.mVideoInfo.status = 3;
            }
            b(3, null);
            return;
        } else if (i == 1007) {
            TBLiveDataModel tBLiveDataModel6 = this.m;
            if (tBLiveDataModel6 != null && tBLiveDataModel6.mVideoInfo != null) {
                this.m.mVideoInfo.status = 0;
            }
            b(4, null);
            return;
        }
        if (1004 == i && e.a().b() == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return;
        }
        c(i, obj);
    }

    private void c(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb731075", new Object[]{this, new Integer(i), obj});
            return;
        }
        try {
            if (this.r == null || this.r.size() <= 0) {
                return;
            }
            Set<hua.a> keySet = this.r.keySet();
            if (keySet.size() <= 0) {
                return;
            }
            for (hua.a aVar : keySet) {
                MessageTypeFilter messageTypeFilter = this.r.get(aVar);
                if (messageTypeFilter != null && messageTypeFilter.filter(i)) {
                    aVar.a(i, obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        hua huaVar = this.o;
        if (huaVar == null) {
            return;
        }
        huaVar.a();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        hua huaVar = this.o;
        if (huaVar == null) {
            return;
        }
        huaVar.b();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        hua huaVar = this.o;
        if (huaVar != null) {
            huaVar.b();
            this.o.d();
            this.o = null;
        }
        HashMap<hua.a, MessageTypeFilter> hashMap = this.r;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
        this.r = null;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ppq ppqVar = this.l;
        if (ppqVar != null) {
            ppqVar.destroy();
            this.l = null;
        }
        this.m = null;
        g();
        ArrayList<ppt> arrayList = this.j;
        if (arrayList != null) {
            arrayList.clear();
            this.j = null;
        }
        f14349a = null;
    }

    public void a(hua.a aVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26516b4", new Object[]{this, aVar, messageTypeFilter});
            return;
        }
        if (this.r == null) {
            this.r = new HashMap<>();
        }
        if (aVar == null) {
            return;
        }
        this.r.put(aVar, messageTypeFilter);
    }

    public void a(hua.a aVar) {
        HashMap<hua.a, MessageTypeFilter> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be3f487", new Object[]{this, aVar});
        } else if (aVar == null || (hashMap = this.r) == null) {
        } else {
            hashMap.remove(aVar);
        }
    }
}
