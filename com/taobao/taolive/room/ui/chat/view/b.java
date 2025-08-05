package com.taobao.taolive.room.ui.chat.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.taolive.room.ui.chat.view.a;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.j;
import com.taobao.taolive.sdk.utils.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.cgl;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.poy;
import tb.xkw;

/* loaded from: classes8.dex */
public class b implements a.InterfaceC0528a, com.taobao.taolive.sdk.model.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int h;

    /* renamed from: a  reason: collision with root package name */
    public TBLiveDataModel f21702a;
    private a.b b;
    private Context e;
    private a f;
    private boolean g;
    private Handler j;
    public String l;
    private com.taobao.alilive.aliliveframework.frame.a m;
    private Long c = 0L;
    private f d = new f(this);
    private int i = 0;
    private d.a k = new d.a() { // from class: com.taobao.taolive.room.ui.chat.view.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.core.c
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (i == 1015) {
                LiveSystemMessage liveSystemMessage = (LiveSystemMessage) obj;
                if (liveSystemMessage == null) {
                    return;
                }
                if ("1".equals(liveSystemMessage.type)) {
                    b.a(b.this).a(liveSystemMessage.contentMap);
                } else if ("2".equals(liveSystemMessage.type) || !"3".equals(liveSystemMessage.type) || b.a(b.this).a()) {
                } else {
                    b.a(b.this).a(liveSystemMessage.contentMap);
                }
            } else if (i == 1043) {
                b.a(b.this).c(obj);
            } else if (i == 1044) {
                b.a(b.this).d(obj);
            } else if (i == 1068) {
                if (!(obj instanceof JSONObject)) {
                    return;
                }
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getString("content");
                String string = jSONObject.getString(e.REQUEST_ID);
                b.a(b.this);
                if (pmd.a().e() == null) {
                    return;
                }
                VideoInfo a2 = k.a(b.this.f21702a);
                HashMap hashMap = new HashMap();
                hashMap.put(e.REQUEST_ID, string);
                if (k.a(b.this.f21702a) != null) {
                    hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, a2.liveId);
                }
                if (cgl.i() != null) {
                    hashMap.put("userId", cgl.i().a());
                }
                hashMap.put("timeStamp", String.valueOf(cgl.j().a()));
                pmd.a().e().b("Page_TaobaoLiveAlime", "Page_TaobaoLiveAlime_REPLY_EXP", hashMap);
            } else if (i == 1050) {
                if (!aa.ai() || !(obj instanceof TLiveMsg)) {
                    return;
                }
                JSONObject parseObject = JSONObject.parseObject(new String(((TLiveMsg) obj).data));
                parseObject.getString("content");
                parseObject.getString("headerline");
                b.a(b.this);
            } else if (i != 1993) {
                if (b.b(b.this) != 0) {
                    return;
                }
                b.a(b.this).a(i, obj);
            } else if (!(obj instanceof ArrayList)) {
            } else {
                ArrayList<ChatMessage> arrayList = new ArrayList<>();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof ChatMessage) {
                        ChatMessage chatMessage = (ChatMessage) next;
                        chatMessage.mType = (TextUtils.isEmpty(chatMessage.mContent) || !chatMessage.mContent.startsWith(j.SYS_PREFIX)) ? ChatMessage.MessageType.TXT : ChatMessage.MessageType.FOLLOW;
                        arrayList.add(chatMessage);
                    }
                }
                b.a(b.this).a(arrayList);
            }
        }
    };

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ChatPresenter";
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ a.b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("e227d4c5", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16e86d57", new Object[]{bVar})).intValue() : bVar.i;
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1892fe9", new Object[]{bVar})).booleanValue() : bVar.g;
    }

    public static /* synthetic */ f d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2a056128", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : h;
    }

    static {
        kge.a(892868450);
        kge.a(99903760);
        kge.a(191318335);
        kge.a(-1905361424);
        h = 400;
    }

    public b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, a.b bVar, TBLiveDataModel tBLiveDataModel, boolean z, boolean z2) {
        this.g = true;
        this.l = null;
        this.e = context;
        this.m = aVar;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.m;
        if (aVar2 != null) {
            this.l = aVar2.G();
        }
        this.b = bVar;
        this.f21702a = tBLiveDataModel;
        this.g = z2;
        this.f = new a(this.e);
        this.m = aVar;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        h = aa.as();
        com.taobao.taolive.sdk.core.j.a(this.m, this.k, new MessageTypeFilter() { // from class: com.taobao.taolive.room.ui.chat.view.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1011 || i == 1015 || i == 1005 || i == 1040 || i == 1051 || i == 1057 || i == 10035 || i == 1062 || i == 1043 || i == 1044 || i == 1068 || i == 1050 || i == 1993;
            }
        });
        ddw.a().a(this);
        if (com.taobao.taolive.room.utils.k.a() == 2) {
            z = true;
        }
        if (aa.D() && z) {
            if (!this.g) {
                return;
            }
            if (this.d == null) {
                this.d = new f(this);
            }
            this.d.removeCallbacksAndMessages(null);
            this.d.sendEmptyMessageDelayed(1001, 3000L);
        } else {
            k();
        }
        j();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        FandomInfo a2 = poy.a(this.f21702a, n.a());
        if (a2 == null || a2.preLives == null || a2.preLives.isEmpty()) {
            return;
        }
        if (this.j == null) {
            this.j = new f(this);
        }
        this.j.sendEmptyMessageDelayed(1003, Math.max(l.b(a2.preLives.get(0).startTime) - cgl.j().a(), 0L));
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.f21702a == null) {
        } else {
            com.taobao.taolive.sdk.core.j.i(this.m);
            o();
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.core.j.j(this.m);
        p();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.core.j.k(this.m);
        o();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.core.j.l(this.m);
        p();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            b(0);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.g) {
        } else {
            if (this.d == null) {
                this.d = new f(this);
            }
            this.d.removeCallbacksAndMessages(null);
            this.d.sendEmptyMessageDelayed(1004, i);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            m();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.f21702a;
        if (tBLiveDataModel == null) {
            tBLiveDataModel = com.taobao.taolive.sdk.core.j.c(this.m);
        }
        return (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.status != 1) ? false : true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        n();
        a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
        com.taobao.taolive.sdk.core.j.a(this.m, this.k);
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.removeMessages(1003);
        this.j = null;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_ADD_ITEM_LISTS.equals(str)) {
            this.b.a(obj);
        } else if (xkw.EVENT_RESET_FOR_REPLAY.equals(str)) {
            this.b.b(obj);
        } else if (xkw.EVENT_ADD_ITEM.equals(str)) {
            if (!(obj instanceof ChatMessage)) {
                return;
            }
            int a2 = com.taobao.taolive.room.utils.d.a(this.e, 15.0f);
            ArrayList<ChatMessage> arrayList = new ArrayList<>();
            arrayList.add((ChatMessage) obj);
            this.f.a(this.m, arrayList, a2, new a.c() { // from class: com.taobao.taolive.room.ui.chat.view.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.ui.chat.view.a.c
                public void a(ArrayList<ChatMessage> arrayList2, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1640c0c2", new Object[]{this, arrayList2, new Long(j)});
                        return;
                    }
                    Iterator<ChatMessage> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ChatMessage next = it.next();
                        if (next.mType != ChatMessage.MessageType.FOLLOW) {
                            b.a(b.this).c(next);
                        }
                    }
                }
            });
        } else if (xkw.EVENT_ADD_PRICE_FROM_AUCTION.equals(str)) {
            this.b.a(2037, obj);
        } else if (xkw.EVENT_TIMESHIFT_BABYLIST_VISIBILITY.equals(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            if (((Boolean) ((Map) obj).get("timeShiftListVisibility")).booleanValue()) {
                this.b.b();
            } else if (!aa.ay()) {
                this.b.c();
            } else if (com.taobao.taolive.room.utils.j.a(this.f21702a)) {
            } else {
                this.b.c();
            }
        } else if (!xkw.EVENT_ADD_MESSAGE.equals(str) || !(obj instanceof ArrayList)) {
        } else {
            a(this.m, (ArrayList) obj);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_ADD_ITEM_LISTS, xkw.EVENT_RESET_FOR_REPLAY, xkw.EVENT_ADD_ITEM, xkw.EVENT_ADD_PRICE_FROM_AUCTION, xkw.EVENT_TIMESHIFT_BABYLIST_VISIBILITY, xkw.EVENT_ADD_MESSAGE};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.m;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    private ArrayList<ChatMessage> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fb533536", new Object[]{this, new Long(j)});
        }
        ArrayList<ChatMessage> a2 = com.taobao.taolive.sdk.core.j.a(this.m, j, aa.at());
        if (a2 != null && a2.size() > 0) {
            Iterator<ChatMessage> it = a2.iterator();
            while (it.hasNext()) {
                ChatMessage next = it.next();
                if (!TextUtils.isEmpty(next.mContent) && next.mContent.startsWith(j.SYS_PREFIX)) {
                    next.mType = ChatMessage.MessageType.FOLLOW;
                } else {
                    next.mType = ChatMessage.MessageType.TXT;
                }
            }
            this.c = Long.valueOf(a2.get(a2.size() - 1).mMessageId);
        }
        return a2;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = 0L;
        k();
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1001) {
            k();
        } else if (i != 1004) {
        } else {
            ArrayList<ChatMessage> a2 = a(this.c.longValue());
            if (a2 != null && a2.size() > 0 && this.i == 0) {
                ddw.a().a(xkw.EVENT_ADD_MESSAGE, a2, this.l);
            } else if (!this.g) {
            } else {
                this.d.sendEmptyMessageDelayed(1004, h);
            }
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, ArrayList<ChatMessage> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3106d", new Object[]{this, aVar, arrayList});
        } else {
            this.f.a(aVar, arrayList, com.taobao.taolive.room.utils.d.a(this.e, 16.0f), new a.c() { // from class: com.taobao.taolive.room.ui.chat.view.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.ui.chat.view.a.c
                public void a(ArrayList<ChatMessage> arrayList2, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1640c0c2", new Object[]{this, arrayList2, new Long(j)});
                        return;
                    }
                    Iterator<ChatMessage> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ChatMessage next = it.next();
                        if (next.mType != ChatMessage.MessageType.FOLLOW) {
                            b.a(b.this).c(next);
                        }
                    }
                    if (!b.c(b.this)) {
                        return;
                    }
                    if (j >= b.i()) {
                        b.d(b.this).sendEmptyMessage(1004);
                    } else {
                        b.d(b.this).sendEmptyMessageDelayed(1004, b.i() - j);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else {
            this.f21702a = tBLiveDataModel;
        }
    }
}
