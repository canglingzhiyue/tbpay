package com.taobao.taolive.sdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.UserLevelAvatar;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TaskStatusMsg;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import tb.dlx;
import tb.fmg;
import tb.ipz;
import tb.kge;
import tb.pmd;
import tb.pnn;
import tb.pns;
import tb.poy;
import tb.ppt;
import tb.pqh;
import tb.pqi;
import tb.qzp;
import tb.rmx;

/* loaded from: classes8.dex */
public class i implements com.taobao.taolive.sdk.core.b, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f21826a;
    private com.taobao.taolive.sdk.model.d d;
    private TBLiveDataModel e;
    private LiveEmbedType f;
    private pnn g;
    private String h;
    private com.taobao.alilive.aliliveframework.frame.a i;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean p;
    private boolean q;
    private ArrayList<ppt> b = new ArrayList<>();
    private HashMap<c, MessageTypeFilter> c = new HashMap<>();
    private boolean j = true;
    private b r = new b();
    private a s = new a();
    private boolean n = false;
    private Object o = null;
    private BroadcastReceiver t = new BroadcastReceiver() { // from class: com.taobao.taolive.sdk.core.SingleRoomManageEngine$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Context h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (i.a(i.this) == null || !(i.a(i.this).z() instanceof com.taobao.taolive.sdk.controller.e) || (h = ((com.taobao.taolive.sdk.controller.e) i.a(i.this).z()).h()) == null || intent == null || intent.getAction() == null) {
            } else {
                String str = "";
                if (intent.getAction().equals("mega.stdPop.broadcast.windowStateChanged")) {
                    i iVar = i.this;
                    if (intent.getStringExtra("windowState") != null) {
                        str = intent.getStringExtra("windowState");
                    }
                    i.a(iVar, h, str, z.a(intent));
                } else if (!intent.getAction().equals("mega.stdPop.broadcast.popStateChanged")) {
                } else {
                    i iVar2 = i.this;
                    if (intent.getStringExtra("popState") != null) {
                        str = intent.getStringExtra("popState");
                    }
                    i.b(iVar2, h, str, z.a(intent));
                }
            }
        }
    };

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("3103af8c", new Object[]{iVar}) : iVar.i;
    }

    public static /* synthetic */ void a(i iVar, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c52e75", new Object[]{iVar, context, str, jSONObject});
        } else {
            iVar.b(context, str, jSONObject);
        }
    }

    public static /* synthetic */ void b(i iVar, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d15854", new Object[]{iVar, context, str, jSONObject});
        } else {
            iVar.a(context, str, jSONObject);
        }
    }

    static {
        kge.a(834753809);
        kge.a(-2101054629);
        kge.a(-940829745);
        f21826a = i.class.getSimpleName();
    }

    public i(com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.i = aVar;
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58702c20", new Object[]{this, aVar, str, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
        } else {
            String str2 = f21826a;
            m.a(str2, "initRoomInfo liveContextKey = " + str + " mLiveContextKey = " + this.h);
            this.e = tBLiveDataModel;
            this.k = true;
            String str3 = tBLiveDataModel.mVideoInfo.topic;
            String str4 = tBLiveDataModel.mVideoInfo.channel;
            boolean z = tBLiveDataModel.mVideoInfo.fetchCommentsUseMtop;
            boolean z2 = tBLiveDataModel.mVideoInfo.fetchCommentsUseLMSDK;
            boolean z3 = tBLiveDataModel.mVideoInfo.status == 1;
            tBLiveDataModel.mRoomInfo = new ChatRoomInfo();
            tBLiveDataModel.mRoomInfo.roomId = tBLiveDataModel.mVideoInfo.topic;
            String str5 = tBLiveDataModel.mVideoInfo.broadCaster != null ? tBLiveDataModel.mVideoInfo.broadCaster.anchorSideKey : "";
            this.h = str;
            if (p.r()) {
                a(aVar, str, tBLiveDataModel, str3, str4, z, z2, z3, str5);
            } else {
                b(aVar, str, tBLiveDataModel, str3, str4, z, z2, z3, str5);
            }
            if ((aVar instanceof e) && tBLiveDataModel.mVideoInfo != null && this.g != null) {
                ((e) aVar).a(new ipz(str4, "1".equals(tBLiveDataModel.mVideoInfo.roomStatus), str3, tBLiveDataModel.mVideoInfo.liveId, this.g.getHeartParams()));
            }
            a(this.i);
            this.q = true;
        }
    }

    public void a(LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdec55f", new Object[]{this, liveEmbedType});
        } else {
            this.f = liveEmbedType;
        }
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe19b21", new Object[]{this, aVar, new Boolean(z), str});
            return;
        }
        String str2 = f21826a;
        m.a(str2, "destroyRoomInfo liveContextKey = " + str + " mLiveContextKey = " + this.h);
        poy.e("", aVar);
        this.k = false;
        k();
        if (p.r()) {
            n();
        } else {
            m();
        }
        HashMap<c, MessageTypeFilter> hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
            this.c = null;
        }
        this.g = null;
        this.h = null;
        this.o = null;
        this.n = false;
        this.q = false;
    }

    public TBLiveDataModel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("3e10eb27", new Object[]{this}) : this.e;
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else {
            this.e = tBLiveDataModel;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String str = f21826a;
        m.a(str, "backToLive mLiveContextKey = " + this.h);
        if (!this.n) {
            return false;
        }
        this.n = false;
        this.o = null;
        ArrayList<ppt> arrayList = this.b;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<ppt> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a_(5, this.o);
            }
        }
        a(1004, this.o);
        return true;
    }

    public pns c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pns) ipChange.ipc$dispatch("1e6c8447", new Object[]{this});
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return null;
        }
        return dVar.j();
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void addPowerMessageInterceptor(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9565e9b", new Object[]{this, dVar});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar2 = this.d;
        if (dVar2 == null) {
            return;
        }
        dVar2.a(dVar);
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void registerMessageListener(c cVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b47b693", new Object[]{this, cVar, messageTypeFilter});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap<>();
        }
        if (cVar == null) {
            return;
        }
        this.c.put(cVar, messageTypeFilter);
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void unRegisterMessageListener(c cVar) {
        HashMap<c, MessageTypeFilter> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c01c6df", new Object[]{this, cVar});
        } else if (cVar == null || (hashMap = this.c) == null) {
        } else {
            hashMap.remove(cVar);
        }
    }

    public void a(pnn pnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f4cea8", new Object[]{this, pnnVar});
            return;
        }
        this.g = pnnVar;
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(pnnVar);
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        JoinNotifyMessage joinNotifyMessage;
        ShareGoodsListMessage shareGoodsListMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        pqi.a().a("onMessageReceived", String.valueOf(i), 1.0d);
        if (i == 102) {
            TBLiveDataModel tBLiveDataModel = this.e;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && this.e.mVideoInfo.status != 1 && (joinNotifyMessage = (JoinNotifyMessage) obj) != null) {
                this.e.mVideoInfo.joinCount = joinNotifyMessage.onlineCount;
                this.e.mVideoInfo.totalJoinCount = joinNotifyMessage.totalCount;
                this.e.mVideoInfo.viewCount = joinNotifyMessage.pageViewCount;
            }
        } else if (i == 1002) {
            TBLiveDataModel tBLiveDataModel2 = this.e;
            if (tBLiveDataModel2 != null && tBLiveDataModel2.mVideoInfo != null && this.e.mVideoInfo.status != 1) {
                CountInfoMessage countInfoMessage = (CountInfoMessage) obj;
                if (countInfoMessage.value != null && countInfoMessage.value.get(PowerMsgType.KEY_FAVOR) != null) {
                    this.e.mVideoInfo.praiseCount = countInfoMessage.value.get(PowerMsgType.KEY_FAVOR).longValue();
                }
            }
        } else if (i == 1009) {
            TBLiveDataModel tBLiveDataModel3 = this.e;
            if (tBLiveDataModel3 != null && tBLiveDataModel3.mVideoInfo != null && this.e.mVideoInfo.status != 1 && (shareGoodsListMessage = (ShareGoodsListMessage) obj) != null) {
                this.e.mVideoInfo.curItemNum = shareGoodsListMessage.totalCount;
                if (shareGoodsListMessage.goodsList != null) {
                    this.e.mVideoInfo.curItemList = new ArrayList<>();
                    for (ShareGoodMessage shareGoodMessage : shareGoodsListMessage.goodsList) {
                        LiveItem a2 = com.taobao.taolive.sdk.utils.j.a(shareGoodMessage);
                        if (a2 != null) {
                            a2.goodsIndex = shareGoodsListMessage.goodsIndex;
                            a2.groupNum = shareGoodsListMessage.goodsIndex;
                        }
                        this.e.mVideoInfo.curItemList.add(a2);
                    }
                }
            }
        } else if (i == 1039) {
            TBLiveDataModel tBLiveDataModel4 = this.e;
            if (tBLiveDataModel4 != null && tBLiveDataModel4.mVideoInfo != null && this.e.mVideoInfo.tbtvLiveDO != null && (obj instanceof TBTVProgramMessage)) {
                TBTVProgramMessage tBTVProgramMessage = (TBTVProgramMessage) obj;
                if (TextUtils.equals(this.e.mVideoInfo.liveId, tBTVProgramMessage.liveDO.liveId) || TextUtils.equals(this.e.mVideoInfo.tbtvLiveDO.liveId, tBTVProgramMessage.liveDO.liveId)) {
                    return;
                }
                this.e.mVideoInfo.tbtvLiveDO = tBTVProgramMessage.liveDO;
                this.e.mVideoInfo.curItemNum = 0;
                this.e.mVideoInfo.millionBaby = tBTVProgramMessage.liveDO.millionBaby;
                b(6, null);
            }
        } else if (i != 1053) {
            switch (i) {
                case 1004:
                    TBLiveDataModel tBLiveDataModel5 = this.e;
                    if (tBLiveDataModel5 != null && tBLiveDataModel5.mVideoInfo != null) {
                        this.e.mVideoInfo.status = 1;
                        this.e.mVideoInfo.roomStatus = "2";
                    }
                    b(5, obj);
                    break;
                case 1006:
                    TBLiveDataModel tBLiveDataModel6 = this.e;
                    if (tBLiveDataModel6 != null && tBLiveDataModel6.mVideoInfo != null) {
                        this.e.mVideoInfo.status = 3;
                        this.e.mVideoInfo.streamStatus = "0";
                    }
                    b(3, null);
                    if (!o.w()) {
                        return;
                    }
                    break;
                case 1007:
                    TBLiveDataModel tBLiveDataModel7 = this.e;
                    if (tBLiveDataModel7 != null && tBLiveDataModel7.mVideoInfo != null) {
                        this.e.mVideoInfo.status = 0;
                        this.e.mVideoInfo.streamStatus = "1";
                    }
                    b(4, null);
                    return;
            }
        } else {
            TBLiveDataModel tBLiveDataModel8 = this.e;
            VideoInfo videoInfo = (tBLiveDataModel8 == null || tBLiveDataModel8.mVideoInfo == null) ? null : this.e.mVideoInfo;
            if (videoInfo != null && videoInfo.broadCaster != null && (obj instanceof TaskStatusMsg)) {
                UserLevelAvatar userLevelAvatar = new UserLevelAvatar();
                userLevelAvatar.userid = pmd.a().q().a();
                userLevelAvatar.nick = pmd.a().q().b();
                if (userLevelAvatar.identify == null) {
                    userLevelAvatar.identify = new HashMap<>();
                }
                userLevelAvatar.identify.put(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER, ((TaskStatusMsg) obj).currentLevel);
                com.taobao.taolive.sdk.business.g.a(videoInfo.liveId, videoInfo.broadCaster.accountId, videoInfo.topic, 10033, JSON.toJSONString(userLevelAvatar), null, null, c());
            }
        }
        if (1004 == i && com.taobao.taolive.sdk.playcontrol.c.i(null) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return;
        }
        a(i, obj);
    }

    private void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        try {
            if (this.c == null || this.c.size() <= 0) {
                return;
            }
            Set<c> keySet = this.c.keySet();
            if (keySet.size() <= 0) {
                return;
            }
            for (c cVar : keySet) {
                MessageTypeFilter messageTypeFilter = this.c.get(cVar);
                if (messageTypeFilter != null && messageTypeFilter.filter(i)) {
                    cVar.onMessageReceived(i, obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void dispatchUserPowerMessage(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88896dbb", new Object[]{this, tLiveMsg});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.b(tLiveMsg);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p = z;
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(this.p);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.e();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String str = f21826a;
        m.a(str, "onStart liveContextKey = " + this.h);
        this.j = true;
        if (!p.r()) {
            return;
        }
        o();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = f21826a;
        m.a(str, "onStop liveContextKey = " + this.h);
        this.j = false;
        if (!p.r()) {
            return;
        }
        p();
    }

    @Override // com.taobao.taolive.sdk.core.b
    public ArrayList<ChatMessage> getMessagesFromPool(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1a638e28", new Object[]{this, new Long(j), new Integer(i)});
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar != null) {
            return dVar.a(j, i);
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void startGetNewMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e93c02", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.o();
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void pauseGetNewMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c0b4ee", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.p();
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void resumeGetNewMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84dae797", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.q();
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void stopGetNewMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df9ac62", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.r();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (!(dVar instanceof com.taobao.taolive.sdk.model.d)) {
            return;
        }
        dVar.l();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (!(dVar instanceof com.taobao.taolive.sdk.model.d)) {
            return;
        }
        dVar.u();
    }

    @Override // com.taobao.taolive.sdk.core.b
    public void addItemUUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1002ca60", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.model.d dVar = this.d;
        if (!(dVar instanceof com.taobao.taolive.sdk.model.d)) {
            return;
        }
        dVar.e(str);
    }

    public void a(ppt pptVar) {
        ArrayList<ppt> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa13b7e4", new Object[]{this, pptVar});
        } else if (pptVar == null || (arrayList = this.b) == null) {
        } else {
            arrayList.add(pptVar);
        }
    }

    public void b(ppt pptVar) {
        ArrayList<ppt> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e896be65", new Object[]{this, pptVar});
        } else if (pptVar == null || (arrayList = this.b) == null) {
        } else {
            arrayList.remove(pptVar);
        }
    }

    private void b(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), obj});
        } else if (5 == i && com.taobao.taolive.sdk.playcontrol.c.i(this.i) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            this.n = true;
            this.o = obj;
        } else {
            ArrayList<ppt> arrayList = this.b;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            Iterator<ppt> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a_(i, obj);
            }
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f079c6a", new Object[]{this, aVar, str, tBLiveDataModel, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), str4});
            return;
        }
        this.h = str;
        if (this.d != null) {
            p();
            this.d.g();
        }
        if (z3) {
            this.d = new com.taobao.taolive.sdk.model.d(1, tBLiveDataModel.mVideoInfo.topic, str4, z2, z, tBLiveDataModel.mVideoInfo.forceCommentsUseCdn, false, this);
        } else {
            poy.e(com.taobao.taolive.sdk.controller.k.a(tBLiveDataModel.mVideoInfo), aVar);
            this.d = new com.taobao.taolive.sdk.model.k(1, str2, str4, str3, z2, z, tBLiveDataModel.mVideoInfo.forceCommentsUseCdn, false, "1".equals(tBLiveDataModel.mVideoInfo.roomStatus), false, !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl) || (tBLiveDataModel.mVideoInfo.fetchItemUseCdn && u.r() && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl)), this);
            pqi.a().a("Page_TaobaoLiveWatch", "LiveRoomInit", pqi.a().b());
        }
        if (u.aP() && tBLiveDataModel.mVideoInfo.isOfficialType()) {
            this.d.b(true);
            this.d.f(tBLiveDataModel.mVideoInfo.officialLiveInfo.encryptAnchorId);
            this.d.g(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            this.d.h(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveTopic);
        }
        this.d.a(this.f);
        this.d.a(this.g);
        this.d.a(this.p);
        this.d.c(tBLiveDataModel.mVideoInfo.liveId);
        this.d.a(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl);
        this.d.b(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl);
        this.d.d();
        o();
    }

    private void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325bfb2b", new Object[]{this, aVar, str, tBLiveDataModel, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), str4});
            return;
        }
        this.h = str;
        pqh.a().a(aVar, str, tBLiveDataModel, str2, str3, z, z2, z3, str4, false, this.f, this.g, this.p, this);
        this.d = pqh.a().c();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            pqh.a().a(this.h);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.d == null) {
        } else {
            p();
            this.d.g();
            this.d = null;
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!p.r()) {
        } else {
            String str = f21826a;
            m.a(str, "tryEnterChatRoom liveContextKey = " + this.h + " isSubscribedPM = " + this.m + " hasLiveInfo = " + this.k + " isPageVisible = " + this.j + " isFullInsideDetailOpen = " + this.l + " mMessageProvider = " + this.d);
            if (this.d == null || !this.k || !this.j || this.l || this.m) {
                return;
            }
            String str2 = f21826a;
            m.a(str2, "tryEnterChatRoom success liveContextKey = " + this.h);
            this.d.a();
            this.m = true;
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!p.r()) {
        } else {
            String str = f21826a;
            m.a(str, "tryExitChatRoom liveContextKey = " + this.h + " isSubscribedPM = " + this.m);
            if (this.d == null || !this.m) {
                return;
            }
            String str2 = f21826a;
            m.a(str2, "tryExitChatRoom success liveContextKey = " + this.h);
            this.d.c();
            this.m = false;
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else if (!p.r()) {
        } else {
            String str = f21826a;
            m.a(str, "subscribeInsideDetail liveContextKey = " + this.h);
            if (aVar == null || !(aVar.z() instanceof com.taobao.taolive.sdk.controller.e)) {
                return;
            }
            if (((com.taobao.taolive.sdk.controller.e) aVar.z()).x()) {
                h();
                return;
            }
            Context h = ((com.taobao.taolive.sdk.controller.e) aVar.z()).h();
            if (h == null) {
                return;
            }
            a(h);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.r.a(context);
        this.s.a(context);
        if (context instanceof rmx) {
            ((rmx) context).a(this.r);
        }
        if (!(context instanceof qzp)) {
            return;
        }
        ((qzp) context).a(this.s);
    }

    private boolean a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{this, context, jSONObject})).booleanValue() : (jSONObject == null || context == null || !String.valueOf(context.hashCode()).equals(jSONObject.getString("popId"))) ? false : true;
    }

    /* loaded from: classes8.dex */
    public class b implements fmg {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context b;

        static {
            kge.a(-555648409);
            kge.a(1861127946);
        }

        private b() {
            i.this = r1;
        }

        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            } else {
                this.b = context;
            }
        }

        @Override // tb.fmg
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            } else {
                i.a(i.this, this.b, str, jSONObject);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class a implements dlx {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context b;

        static {
            kge.a(-721803593);
            kge.a(478546929);
        }

        @Override // tb.dlx
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            }
        }

        private a() {
            i.this = r1;
        }

        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            } else {
                this.b = context;
            }
        }

        @Override // tb.dlx
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            } else {
                i.b(i.this, this.b, str, jSONObject);
            }
        }
    }

    private void a(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564cf206", new Object[]{this, context, str, jSONObject});
        } else if (!this.q || !a(context, jSONObject)) {
        } else {
            if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                String str2 = f21826a;
                m.a(str2, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_INSIDE_DESTROY liveContextKey = " + this.h);
                this.l = false;
                o();
            } else if (!IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
            } else {
                String str3 = f21826a;
                m.a(str3, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_INSIDE_CREATE liveContextKey = " + this.h);
            }
        }
    }

    private void b(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c64807", new Object[]{this, context, str, jSONObject});
        } else if (!this.q || !a(context, jSONObject)) {
        } else {
            if (IAKPopRender.WindowState.STD_POP_HALF.equals(str)) {
                String str2 = f21826a;
                m.a(str2, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_HALF_SCREEN liveContextKey = " + this.h);
                this.l = false;
                o();
            } else if (!IAKPopRender.WindowState.STD_POP_FULL_SCREEN.equals(str)) {
            } else {
                String str3 = f21826a;
                m.a(str3, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_FULL_SCREEN liveContextKey = " + this.h);
                this.l = true;
                p();
            }
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.i;
        if (aVar == null || !(aVar.z() instanceof com.taobao.taolive.sdk.controller.e)) {
            return;
        }
        Context h = ((com.taobao.taolive.sdk.controller.e) this.i.z()).h();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("mega.stdPop.broadcast.windowStateChanged");
        intentFilter.addAction("mega.stdPop.broadcast.popStateChanged");
        intentFilter.addAction("mega.stdPop.broadcast.positionChanged");
        LocalBroadcastManager.getInstance(h).registerReceiver(this.t, intentFilter);
    }

    private void k() {
        Context h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.i;
        if (aVar == null || !(aVar.z() instanceof com.taobao.taolive.sdk.controller.e) || (h = ((com.taobao.taolive.sdk.controller.e) this.i.z()).h()) == null) {
            return;
        }
        LocalBroadcastManager.getInstance(h).unregisterReceiver(this.t);
    }
}
