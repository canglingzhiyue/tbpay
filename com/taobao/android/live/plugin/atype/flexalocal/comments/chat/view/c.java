package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b;
import com.taobao.taolive.room.business.trivial.TrivialQueryResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ddv;
import tb.hkk;
import tb.kge;
import tb.ply;
import tb.pmd;
import tb.pnj;
import tb.pqj;
import tb.xkw;

/* loaded from: classes5.dex */
public class c implements a.InterfaceC0528a, com.taobao.taolive.sdk.model.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int g;
    private static int h;
    private static String l;

    /* renamed from: a  reason: collision with root package name */
    public TBLiveDataModel f13642a;
    private a.b b;
    private Context e;
    private b f;
    private com.taobao.alilive.aliliveframework.frame.a j;
    private boolean n;
    private Long c = 0L;
    private com.taobao.taolive.sdk.model.f d = new com.taobao.taolive.sdk.model.f(this);
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.h m = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.h();
    private int i = 0;
    private d.a k = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.c.2
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
                    c.a(c.this).a(liveSystemMessage.contentMap);
                } else if (!"3".equals(liveSystemMessage.type) || c.a(c.this).a()) {
                } else {
                    c.a(c.this).a(liveSystemMessage.contentMap);
                }
            } else if (i == 1043) {
                if (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.i()) {
                    return;
                }
                c.a(c.this).c(obj);
            } else if (i == 1044) {
                c.a(c.this).d(obj);
            } else if (i == 1068 || i == 1050) {
            } else {
                if (i == 1993) {
                    if (!(obj instanceof ArrayList)) {
                        return;
                    }
                    ArrayList<ChatMessage> arrayList = new ArrayList<>();
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof ChatMessage) {
                            ChatMessage chatMessage = (ChatMessage) next;
                            chatMessage.mType = (StringUtils.isEmpty(chatMessage.mContent) || !chatMessage.mContent.startsWith(com.taobao.taolive.sdk.utils.j.SYS_PREFIX)) ? ChatMessage.MessageType.TXT : ChatMessage.MessageType.FOLLOW;
                            arrayList.add(chatMessage);
                        }
                    }
                    c.a(c.this).a(arrayList);
                } else if (i == 3009) {
                    if (!(obj instanceof TLiveMsg)) {
                        return;
                    }
                    TLiveMsg tLiveMsg = (TLiveMsg) obj;
                    ChatTopMessage chatTopMessage = new ChatTopMessage(i, tLiveMsg.from, null, null);
                    if (!c.a(chatTopMessage, tLiveMsg)) {
                        return;
                    }
                    c.a(c.this).a(i, chatTopMessage);
                } else if (i != 10084) {
                    if (c.b(c.this) != 0) {
                        return;
                    }
                    c.a(c.this).a(i, obj);
                } else {
                    if (hkk.O()) {
                        q.b("ChatPresenter2", "881000244 message type: MSG_TYPE_CHAT_COMMENT_COMMON, msg data: " + obj.toString());
                    }
                    c.a(c.this).e(obj);
                }
            }
        }
    };
    private int o = 0;

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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ChatPresenter2";
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ a.b a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("ff50a132", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ int b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7e391ca", new Object[]{cVar})).intValue() : cVar.i;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.comments.chat.h c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.h) ipChange.ipc$dispatch("157c5f09", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.model.f d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.model.f) ipChange.ipc$dispatch("36fd8dd5", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ int e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("92ee120d", new Object[]{cVar})).intValue() : cVar.d();
    }

    static {
        kge.a(-1890580444);
        kge.a(99903760);
        kge.a(191318335);
        kge.a(-1905361424);
        g = 400;
        h = 1;
        l = null;
    }

    public c(Context context, a.b bVar, com.taobao.alilive.aliliveframework.frame.a aVar, b bVar2) {
        this.e = context;
        this.b = bVar;
        this.j = aVar;
        this.f = bVar2;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.f13642a = tBLiveDataModel;
        h();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.j.f().registerMessageListener(this.k, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1011 || i == 1015 || i == 1005 || i == 1040 || i == 1051 || i == 1057 || i == 10035 || i == 1062 || i == 1043 || i == 1044 || i == 1068 || i == 1050 || i == 1993 || i == 3008 || i == 3009 || i == 10084;
            }
        });
        this.j.e().a(this);
        p();
        if (com.taobao.taolive.room.utils.d.k() == 2) {
            z = true;
        }
        if (ply.l() && z) {
            if (this.d == null) {
                this.d = new com.taobao.taolive.sdk.model.f(this);
            }
            this.d.removeCallbacksAndMessages(null);
            this.d.sendEmptyMessageDelayed(1001, 3000L);
            return;
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
        b("ChatPresenter2 startMessageLoop");
        this.j.f().startGetNewMessage();
        n();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.j.f().pauseGetNewMessage();
        o();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.j.f().resumeGetNewMessage();
        n();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.j.f().stopGetNewMessage();
        o();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            b(0);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (p.B() && this.n) {
        } else {
            this.n = true;
            if (this.d == null) {
                this.d = new com.taobao.taolive.sdk.model.f(this);
            }
            this.d.removeCallbacksAndMessages(null);
            this.d.sendEmptyMessageDelayed(1004, i);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.model.f fVar = this.d;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        this.n = false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            k();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.f13642a;
        return (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.status != 1) ? false : true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.j.e().b(this);
        this.o = 0;
        m();
        this.j.f().unRegisterMessageListener(this.k);
        this.m.b();
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
            ArrayList arrayList = new ArrayList();
            arrayList.add((ChatMessage) obj);
            this.f.a(arrayList, a2, new b.c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.c
                public void a(List<ChatMessage> list, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19a0788b", new Object[]{this, list, new Long(j)});
                        return;
                    }
                    for (ChatMessage chatMessage : list) {
                        if (chatMessage.mType != ChatMessage.MessageType.FOLLOW) {
                            c.a(c.this).c(chatMessage);
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
            } else if (!ply.m()) {
                this.b.c();
            } else if (com.taobao.taolive.room.utils.j.a(this.f13642a)) {
            } else {
                this.b.c();
            }
        } else if (!xkw.EVENT_GET_TRIVIAL_DATA_SUCCESS.equals(str) || !(obj instanceof JSONObject)) {
        } else {
            Object obj2 = ((JSONObject) obj).get("data");
            if (!(obj2 instanceof TrivialQueryResponseData)) {
                return;
            }
            this.b.a((TrivialQueryResponseData) obj2);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_ADD_ITEM_LISTS, xkw.EVENT_RESET_FOR_REPLAY, xkw.EVENT_ADD_ITEM, xkw.EVENT_ADD_PRICE_FROM_AUCTION, xkw.EVENT_TIMESHIFT_BABYLIST_VISIBILITY, xkw.EVENT_GET_TRIVIAL_DATA_SUCCESS};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.j;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    private List<ChatMessage> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c8f176b", new Object[]{this, new Long(j)});
        }
        ArrayList<ChatMessage> messagesFromPool = this.j.f().getMessagesFromPool(j, i());
        if (messagesFromPool != null && messagesFromPool.size() > 0) {
            Iterator<ChatMessage> it = messagesFromPool.iterator();
            while (it.hasNext()) {
                ChatMessage next = it.next();
                if (!StringUtils.isEmpty(next.mContent) && next.mContent.startsWith(com.taobao.taolive.sdk.utils.j.SYS_PREFIX)) {
                    next.mType = ChatMessage.MessageType.FOLLOW;
                } else {
                    next.mType = ChatMessage.MessageType.TXT;
                }
            }
            this.c = Long.valueOf(messagesFromPool.get(messagesFromPool.size() - 1).mMessageId);
        }
        return messagesFromPool;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.InterfaceC0528a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = 0L;
        if (!p.B()) {
            j();
        } else if (z) {
        } else {
            j();
        }
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        List<ChatMessage> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1001) {
            j();
        } else if (i != 1004) {
        } else {
            this.o++;
            if (this.i == 0 && (a2 = a(this.c.longValue())) != null && a2.size() > 0) {
                a(a2);
            } else {
                this.d.sendEmptyMessageDelayed(1004, d());
            }
        }
    }

    private void a(List<ChatMessage> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f.a(list, com.taobao.taolive.room.utils.d.a(this.e, 15.0f), new b.c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.c
                public void a(List<ChatMessage> list2, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19a0788b", new Object[]{this, list2, new Long(j)});
                        return;
                    }
                    for (ChatMessage chatMessage : list2) {
                        if (chatMessage.mType != ChatMessage.MessageType.FOLLOW) {
                            c.a(c.this).c(chatMessage);
                            c.c(c.this).a(c.this.f13642a, chatMessage);
                        }
                    }
                    if (j >= c.e(c.this)) {
                        c.d(c.this).sendEmptyMessage(1004);
                    } else {
                        c.d(c.this).sendEmptyMessageDelayed(1004, c.e(c.this) - j);
                    }
                }
            });
        }
    }

    public static boolean a(ChatTopMessage chatTopMessage, TLiveMsg tLiveMsg) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7fea1c8", new Object[]{chatTopMessage, tLiveMsg})).booleanValue();
        }
        if (chatTopMessage == null || tLiveMsg == null || tLiveMsg.data == null) {
            return false;
        }
        chatTopMessage.mData = pqj.b(new String(tLiveMsg.data));
        if (chatTopMessage.mData == null) {
            return false;
        }
        String string = chatTopMessage.mData.getString("bizType");
        if (!a(string)) {
            pnj m = pmd.a().m();
            m.c("ChatPresenter2", "setUpChatMsgInfo | bizType=" + string);
            return false;
        }
        JSONObject jSONObject2 = chatTopMessage.mData.getJSONObject("msgData");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("styleConfig")) == null) {
            return false;
        }
        String string2 = jSONObject.getString("templateName");
        if (!StringUtils.isEmpty(string2)) {
            chatTopMessage.mDxTemplateName = string2;
        }
        int a2 = com.taobao.taolive.sdk.utils.g.a(jSONObject, "showDuration", -1);
        if (a2 > 0) {
            chatTopMessage.mShowTime = a2 * 1000;
        }
        return true;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (l == null) {
            l = v.b.a("tblive", "supportAtmosDXBizTypes", "level_upgrade,intimacy_exchange");
        }
        String str2 = l;
        if (str2 == null) {
            return false;
        }
        return str2.contains(str);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a()) {
        } else {
            g = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.b();
            h = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.c();
        }
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (!p.B()) {
            return g;
        }
        return com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.o();
    }

    private int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        if (!p.B()) {
            return h;
        }
        return h;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.j == null) {
        } else {
            q.b("ChatWarmOpt", this.j.j() + " " + str);
        }
    }
}
