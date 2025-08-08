package com.taobao.taolive.sdk.model;

import android.app.Application;
import android.content.Intent;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.h;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponseData;
import com.taobao.taolive.sdk.model.common.UserAvatar;
import com.taobao.taolive.sdk.model.interact.Comment;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CommentCountMessage;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.DisableAddOneCommentMessage;
import com.taobao.taolive.sdk.model.message.ExplainBehaviorReportMessage;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.LiveEndMessage;
import com.taobao.taolive.sdk.model.message.LiveGiftMessage;
import com.taobao.taolive.sdk.model.message.LiveInteractiveMessage;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveEndMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveInfoMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.SwitchOfficialMessage;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TUserMsg;
import com.taobao.taolive.sdk.model.message.TaskStatusMsg;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pnk;
import tb.pnn;
import tb.pns;
import tb.pqi;
import tb.pqj;

/* loaded from: classes8.dex */
public class d implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_TYPE_ACTOR_SWITCH = 1016;
    public static final int MSG_TYPE_ANCHOR_BACK = 1007;
    public static final int MSG_TYPE_ANCHOR_BROADCAST = 1019;
    public static final int MSG_TYPE_ANCHOR_LEAVE = 1006;
    public static final int MSG_TYPE_BIZ_MEDIAPLATFORM_INFO = 2037;
    public static final int MSG_TYPE_CHATTOP_MESSAGE_BROADCAST = 3009;
    public static final int MSG_TYPE_CHAT_AI_MESSAGE = 1050;
    public static final int MSG_TYPE_CHAT_ROOM_INFO = 6004;
    public static final int MSG_TYPE_CHEER_BUY_GIFT = 2999;
    public static final int MSG_TYPE_COMMENT = 3007;
    public static final int MSG_TYPE_COMMENT_COUNT = 1043;
    public static final int MSG_TYPE_COMMENT_STATUS = 1072;
    public static final int MSG_TYPE_COMMON_TIPS_SHOW = 1057;
    public static final int MSG_TYPE_CUSTOM_SERVE_GOOD_INTRO = 1056;
    public static final int MSG_TYPE_DEFAULT = 1018;
    public static final int MSG_TYPE_DISPATCH_ERROR = 1027;
    public static final int MSG_TYPE_DUKE_GIFT = 3001;
    public static final int MSG_TYPE_DUKE_LEAD_BOARD = 3002;
    public static final int MSG_TYPE_ENTER_FAIL = 100000;
    public static final int MSG_TYPE_ENTER_GROUP_SHOW = 10035;
    public static final int MSG_TYPE_ENTER_SUCCESS = 1005;
    public static final int MSG_TYPE_FANDOM_LIVE_START = 10001;
    public static final int MSG_TYPE_FANS_LEVEL_UPGRADE = 1051;
    public static final int MSG_TYPE_FAVOR = 1002;
    public static final int MSG_TYPE_GIFT = 1008;
    public static final int MSG_TYPE_GIFT_PK_RANK = 3003;
    public static final int MSG_TYPE_GIFT_WISH = 2998;
    public static final int MSG_TYPE_GOODS_SIMPLE_RIGHTS = 2001;
    public static final int MSG_TYPE_H265_MSG = 1024;
    public static final int MSG_TYPE_HOT_BUY = 1070;
    public static final int MSG_TYPE_IMPORTANT_EVENT_NOTIFY = 2888;
    public static final int MSG_TYPE_IMPORTANT_REWARD_ENTER = 6002;
    public static final int MSG_TYPE_INTERACTIVE = 1014;
    public static final int MSG_TYPE_LINK_LIVE = 1020;
    public static final int MSG_TYPE_LIVE_END = 1004;
    public static final int MSG_TYPE_MEDIADATA = 3005;
    public static final int MSG_TYPE_MEDIA_PLATFORM = 1036;
    public static final int MSG_TYPE_MEDIA_PLATFORM_LEVEL = 1053;
    public static final int MSG_TYPE_MEDIA_PLATFORM_NORMAL = 1052;
    public static final int MSG_TYPE_NOTICE_DX = 6001;
    public static final int MSG_TYPE_NOTICE_MSG = 1023;
    public static final int MSG_TYPE_PLAYER_SWITCH = 1017;
    public static final int MSG_TYPE_PLAY_ERROR_MSG = 1026;
    public static final int MSG_TYPE_PRODUCT_EXPLAIN_DELETE = 10097;
    public static final int MSG_TYPE_PRODUCT_EXPLAIN_NEW = 10096;
    public static final int MSG_TYPE_PRODUCT_HIDE_CASE_WITH_PM = 10094;
    public static final int MSG_TYPE_PRODUCT_HOT_GOOD = 10095;
    public static final int MSG_TYPE_PRODUCT_ITEM_NO_BEAUTY_UPDATE = 10099;
    public static final int MSG_TYPE_PRODUCT_LIST = 1009;
    public static final int MSG_TYPE_PRODUCT_LIST_ITEM_UPDATE = 10098;
    public static final int MSG_TYPE_PRODUCT_LIST_WITH_CDN = 10092;
    public static final int MSG_TYPE_PRODUCT_LIST_WITH_CDN_INVALID = 10093;
    public static final int MSG_TYPE_PRODUCT_LIST_WITH_PM = 10091;
    public static final int MSG_TYPE_PULL_MESSAGE = 1029;
    public static final int MSG_TYPE_RANK_USERS = 3000;
    public static final int MSG_TYPE_REWARD_FEED_CAT_UPDATE = 6003;
    public static final int MSG_TYPE_REWARD_SMALL_CARD_ACTIVITY = 6000;
    public static final int MSG_TYPE_REWARD_TOAST = 6005;
    public static final int MSG_TYPE_ROOM_SETTINGS_CHANGE = 6006;
    public static final int MSG_TYPE_ROOM_SWITCH = 1039;
    public static final int MSG_TYPE_SECKILL_SELLOUT = 1071;
    public static final int MSG_TYPE_STAGE_GROUP_TIPS_SHOW = 1062;
    public static final int MSG_TYPE_SWITCH_OFFICIAL = 3006;
    public static final int MSG_TYPE_SYSTEM = 100;
    public static final int MSG_TYPE_SYSTEM_BROADCAST = 1015;
    public static final int MSG_TYPE_SYSTEM_STUDIO = 101;
    public static final int MSG_TYPE_TAOLIVE_MSG_AI_REPLY_MESSAGE = 1068;
    public static final int MSG_TYPE_TAOLIVE_MSG_AI_REPLY_RECOMMEND = 1069;
    public static final int MSG_TYPE_TAOLIVE_MSG_CARD = 1064;
    public static final int MSG_TYPE_TAOLIVE_PK_ASSIST = 1061;
    public static final int MSG_TYPE_TAOLIVE_PK_HOT = 1060;
    public static final int MSG_TYPE_TAOLIVE_PV = 1059;
    public static final int MSG_TYPE_TAOLIVE_SWITCH_ROOM = 1058;
    public static final int MSG_TYPE_TASK_INTERACTIVE_COIN_MSG = 11055;
    public static final int MSG_TYPE_TASK_INTERACTIVE_MSG = 1055;
    public static final int MSG_TYPE_TIMESHIFT = 2000;
    public static final int MSG_TYPE_TOP_ATMOSPHERE = 1044;
    public static final int MSG_TYPE_TRADE_SHOW = 1011;
    public static final int MSG_TYPE_TXT_HISTORY = 1993;
    public static final int MSG_TYPE_USER_LEVEL_ENTER = 1040;
    public static final int MSG_TYPE_USER_LEVEL_ENTER_FOR_DUKE = 3008;
    public static final int MSG_TYPE_USER_UPDATE = 1003;
    public static final int MSG_TYPE_USER_UPDATE_ITEM = 102;
    public static final String TYPE_MSG_UUID = "msgUuid";
    public static String i;
    public static int n;
    private static final String x;
    private long A;
    private boolean B;
    private boolean C;
    private com.taobao.taolive.sdk.business.c D;
    private ArrayList<String> E;
    private Set<String> F;
    private com.taobao.taolive.sdk.business.h G;
    private com.taobao.taolive.sdk.business.i H;
    private e I;
    private Queue<String> J;
    private int K;
    private boolean L;

    /* renamed from: a  reason: collision with root package name */
    public int f21848a;
    public a b;
    public f c;
    public com.taobao.taolive.sdk.core.d d;
    public boolean e;
    public boolean f;
    public boolean g;
    public pnn h;
    public LiveEmbedType j;
    public boolean k;
    public boolean l;
    public pns m;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public List<String> s;
    public boolean t;
    public String u;
    public String v;
    public String w;
    private String y;
    private String z;

    /* loaded from: classes8.dex */
    public interface a extends com.taobao.taolive.sdk.core.c {
    }

    /* loaded from: classes8.dex */
    public interface b extends com.taobao.taolive.sdk.core.d {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public static /* synthetic */ long a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("afa97ed6", new Object[]{dVar})).longValue() : dVar.A;
    }

    public static /* synthetic */ long a(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4586d416", new Object[]{dVar, new Long(j)})).longValue();
        }
        dVar.A = j;
        return j;
    }

    public static /* synthetic */ void a(d dVar, ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1d7be", new Object[]{dVar, shareGoodsListMessage, new Boolean(z)});
        } else {
            dVar.a(shareGoodsListMessage, z);
        }
    }

    public static /* synthetic */ void a(d dVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19343a3e", new Object[]{dVar, obj});
        } else {
            dVar.a(obj);
        }
    }

    public static /* synthetic */ void a(d dVar, Object obj, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4883d22c", new Object[]{dVar, obj, arrayList});
        } else {
            dVar.a(obj, arrayList);
        }
    }

    public static /* synthetic */ void b(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d970c1", new Object[]{dVar, new Long(j)});
        } else {
            dVar.b(j);
        }
    }

    public static /* synthetic */ void c(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c0d60", new Object[]{dVar, new Long(j)});
        } else {
            dVar.a(j);
        }
    }

    static {
        kge.a(-1960470405);
        kge.a(-1905361424);
        x = d.class.getSimpleName();
        n = 100;
    }

    public d(int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, a aVar) {
        this(i2, str, str2, z, z2, z3, z4, null, aVar);
    }

    public d(int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, pns pnsVar, a aVar) {
        this.A = 5000L;
        boolean z5 = false;
        this.C = false;
        this.E = new ArrayList<>();
        this.F = new HashSet();
        this.c = null;
        this.K = 100;
        this.L = false;
        this.y = str;
        this.z = str2;
        this.f21848a = i2;
        if (z && !z4 && u.I()) {
            z5 = true;
        }
        this.B = z5;
        this.C = z2;
        this.b = aVar;
        this.e = z3;
        this.f = z4;
        if (pnsVar != null) {
            this.m = pnsVar;
        } else {
            this.m = pmd.a().i();
        }
        this.I = new e();
        n = u.N();
    }

    public pns j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pns) ipChange.ipc$dispatch("544809e0", new Object[]{this}) : this.m;
    }

    public void g(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef2a49b", new Object[]{this, tLiveMsg});
        } else if (!p.x() || !com.taobao.taolive.sdk.utils.b.b() || pmd.a().u() == null || pmd.a().u().c() == null) {
        } else {
            Application c = pmd.a().u().c();
            Toast.makeText(c, "PM串流异常: " + tLiveMsg, 1).show();
        }
    }

    private boolean d(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a568d582", new Object[]{this, tLiveMsg})).booleanValue();
        }
        if (tLiveMsg.type == 10099 || tLiveMsg.type == 10016) {
            return true;
        }
        if (tLiveMsg.type != 10001) {
            return false;
        }
        return "playerswitch".equals(com.taobao.taolive.sdk.utils.j.a(new String(tLiveMsg.data)));
    }

    public void b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b7a0c0", new Object[]{this, tLiveMsg});
        } else {
            c(tLiveMsg);
        }
    }

    public void c(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77903b1f", new Object[]{this, tLiveMsg});
        } else if (tLiveMsg == null) {
        } else {
            if (com.taobao.taolive.sdk.utils.b.d(pmd.a().u().c())) {
                Intent intent = new Intent("action.com.taobao.taolive.room.powerMessage");
                String jSONString = JSONObject.toJSONString(tLiveMsg);
                intent.putExtra("msg", jSONString);
                LocalBroadcastManager.getInstance(pmd.a().u().c()).sendBroadcast(intent);
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "Message: dispatch msg: " + jSONString);
            }
            if (this.c == null) {
                this.c = new f(this);
            }
            Message obtainMessage = this.c.obtainMessage(1000);
            obtainMessage.obj = tLiveMsg;
            if (d(tLiveMsg)) {
                this.c.sendMessageDelayed(obtainMessage, u.k());
            } else {
                this.c.sendMessage(obtainMessage);
            }
        }
    }

    public void a(com.taobao.taolive.sdk.core.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd497c", new Object[]{this, dVar});
        } else {
            this.d = dVar;
        }
    }

    public void a(pnn pnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f4cea8", new Object[]{this, pnnVar});
        } else {
            this.h = pnnVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r4 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        r0 = (com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg) tb.pqj.a(r0, com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
        r0.itemList.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
        if (r7.b == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        r7.b.onMessageReceived(com.taobao.taolive.sdk.model.d.MSG_TYPE_TAOLIVE_MSG_AI_REPLY_RECOMMEND, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e(com.taobao.taolive.sdk.model.message.TLiveMsg r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.model.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "d3416fe1"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            if (r8 == 0) goto Lba
            int r0 = r8.type
            r1 = 10086(0x2766, float:1.4133E-41)
            if (r0 != r1) goto Lba
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lb6
            byte[] r8 = r8.data     // Catch: java.lang.Throwable -> Lb6
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<com.taobao.taolive.sdk.model.message.InteractiveMsg> r8 = com.taobao.taolive.sdk.model.message.InteractiveMsg.class
            java.lang.Object r8 = tb.pqj.a(r0, r8)     // Catch: java.lang.Throwable -> Lb6
            com.taobao.taolive.sdk.model.message.InteractiveMsg r8 = (com.taobao.taolive.sdk.model.message.InteractiveMsg) r8     // Catch: java.lang.Throwable -> Lb6
            if (r8 == 0) goto Lba
            java.lang.String r0 = "anchor-me"
            java.lang.String r1 = r8.name     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lba
            java.util.ArrayList<com.taobao.taolive.sdk.model.message.InteractiveMsg$Component> r8 = r8.components     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> Lb6
            com.taobao.taolive.sdk.model.message.InteractiveMsg$Component r8 = (com.taobao.taolive.sdk.model.message.InteractiveMsg.Component) r8     // Catch: java.lang.Throwable -> Lb6
            com.taobao.taolive.sdk.model.message.InteractiveMsg$Data r8 = r8.data     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r8.message     // Catch: java.lang.Throwable -> Lb6
            com.alibaba.fastjson.JSONObject r8 = tb.pqj.b(r8)     // Catch: java.lang.Throwable -> Lb6
            if (r8 != 0) goto L52
            return r3
        L52:
            java.lang.String r0 = "content"
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "requestId"
            r8.getString(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "type"
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> Lb6
            r4 = -1
            int r5 = r1.hashCode()     // Catch: java.lang.Throwable -> Lb6
            r6 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r5 == r6) goto L80
            r6 = 989204668(0x3af610bc, float:0.0018773298)
            if (r5 == r6) goto L75
            goto L8a
        L75:
            java.lang.String r5 = "recommend"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L8a
            r4 = 1
            goto L8a
        L80:
            java.lang.String r5 = "message"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L8a
            r4 = 0
        L8a:
            if (r4 == 0) goto Laa
            if (r4 == r2) goto L8f
            goto Lba
        L8f:
            java.lang.Class<com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg> r1 = com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg.class
            java.lang.Object r0 = tb.pqj.a(r0, r1)     // Catch: java.lang.Throwable -> Lb6
            com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg r0 = (com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg) r0     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lba
            java.util.List<com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg$ItemList> r0 = r0.itemList     // Catch: java.lang.Throwable -> Lb6
            r0.get(r3)     // Catch: java.lang.Throwable -> Lb6
            com.taobao.taolive.sdk.model.d$a r0 = r7.b     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto La9
            com.taobao.taolive.sdk.model.d$a r0 = r7.b     // Catch: java.lang.Throwable -> Lb6
            r1 = 1069(0x42d, float:1.498E-42)
            r0.onMessageReceived(r1, r8)     // Catch: java.lang.Throwable -> Lb6
        La9:
            return r2
        Laa:
            com.taobao.taolive.sdk.model.d$a r0 = r7.b     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb5
            com.taobao.taolive.sdk.model.d$a r0 = r7.b     // Catch: java.lang.Throwable -> Lb6
            r1 = 1068(0x42c, float:1.497E-42)
            r0.onMessageReceived(r1, r8)     // Catch: java.lang.Throwable -> Lb6
        Lb5:
            return r2
        Lb6:
            r8 = move-exception
            r8.printStackTrace()
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.model.d.e(com.taobao.taolive.sdk.model.message.TLiveMsg):boolean");
    }

    public void a(TLiveMsg tLiveMsg) {
        Comment comment;
        TBLivePVMsg tBLivePVMsg;
        TBLiveSwitchMsg tBLiveSwitchMsg;
        TBTVProgramMessage tBTVProgramMessage;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
        } else if (!e(tLiveMsg) || !u.f()) {
            com.taobao.taolive.sdk.core.d dVar = this.d;
            if (dVar != null && dVar.onInterceptPowerMessage(tLiveMsg)) {
                return;
            }
            int i2 = tLiveMsg.type;
            try {
                if (com.taobao.taolive.sdk.utils.b.d(pmd.a().u().c())) {
                    pnj m = pmd.a().m();
                    m.c(pnj.LOG_TAG, "Message: handlePowerMessage msg: " + JSONObject.toJSONString(tLiveMsg));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i2 == 10001) {
                String str = new String(tLiveMsg.data);
                if (this.b != null) {
                    this.b.onMessageReceived(100, str);
                }
                String a2 = com.taobao.taolive.sdk.utils.j.a(str);
                if ("endLiveVideo".equals(a2)) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1004, (LiveEndMessage) JSON.parseObject(str, LiveEndMessage.class));
                } else if ("actorswitch".equals(a2)) {
                    LiveSystemMessage liveSystemMessage = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1016, liveSystemMessage);
                } else if ("playerswitch".equals(a2)) {
                    LiveSystemMessage liveSystemMessage2 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1017, liveSystemMessage2);
                } else {
                    if (!"1".equals(a2) && !"2".equals(a2) && !"3".equals(a2)) {
                        if (!"liveVideoPlayerBroadcast".equals(a2)) {
                            return;
                        }
                        LiveSystemMessage liveSystemMessage3 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                        if (this.b == null) {
                            return;
                        }
                        this.b.onMessageReceived(1019, liveSystemMessage3);
                        return;
                    }
                    LiveSystemMessage liveSystemMessage4 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1015, liveSystemMessage4);
                }
            } else if (i2 == 10002) {
                String str2 = new String(tLiveMsg.data);
                if (this.b != null) {
                    this.b.onMessageReceived(101, str2);
                }
                String a3 = com.taobao.taolive.sdk.utils.j.a(str2);
                if ("liveVideoStreamBreak".equals(a3)) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1006, null);
                } else if ("liveVideoStreamRestore".equals(a3)) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1007, null);
                } else if ("liveGift".equals(a3)) {
                    LiveGiftMessage liveGiftMessage = (LiveGiftMessage) JSON.parseObject(str2, LiveGiftMessage.class);
                    liveGiftMessage.msgId = tLiveMsg.timestamp;
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1008, liveGiftMessage);
                }
            } else if (i2 == 23001) {
                LiveInteractiveMessage liveInteractiveMessage = new LiveInteractiveMessage();
                liveInteractiveMessage.messageId = tLiveMsg.messageId;
                liveInteractiveMessage.data = new String(tLiveMsg.data);
                if (this.b == null) {
                    return;
                }
                if (com.taobao.taolive.sdk.utils.j.b(liveInteractiveMessage.data)) {
                    this.b.onMessageReceived(1055, liveInteractiveMessage);
                } else {
                    this.b.onMessageReceived(1014, liveInteractiveMessage);
                }
            } else if (i2 == 10103) {
                JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) JSON.parseObject(new String(tLiveMsg.data), JoinNotifyMessage.class);
                if (joinNotifyMessage == null || (map = joinNotifyMessage.addUsers) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str3 : map.keySet()) {
                    pnk q = pmd.a().q();
                    if (q == null || !str3.equals(q.a())) {
                        UserAvatar userAvatar = new UserAvatar();
                        userAvatar.id = com.taobao.taolive.sdk.utils.l.b(str3);
                        userAvatar.name = map.get(str3);
                        userAvatar.headImg = pmd.a().u().c().getString(R.string.taolive_user_header_url, new Object[]{Long.valueOf(userAvatar.id)});
                        arrayList.add(userAvatar);
                    }
                }
                if (this.b == null) {
                    return;
                }
                this.b.onMessageReceived(102, joinNotifyMessage);
                this.b.onMessageReceived(1003, arrayList);
            } else if (i2 == 200001) {
                JoinNotifyMessage joinNotifyMessage2 = (JoinNotifyMessage) JSON.parseObject(new String(tLiveMsg.data), JoinNotifyMessage.class);
                if (joinNotifyMessage2 == null || this.b == null) {
                    return;
                }
                this.b.onMessageReceived(102, joinNotifyMessage2);
            } else if (i2 == 10104) {
                CountInfoMessage countInfoMessage = (CountInfoMessage) JSON.parseObject(new String(tLiveMsg.data), CountInfoMessage.class);
                if (this.b == null || countInfoMessage == null) {
                    return;
                }
                this.b.onMessageReceived(1002, countInfoMessage);
            } else if (i2 == 200002) {
                CountInfoMessage countInfoMessage2 = (CountInfoMessage) JSON.parseObject(new String(tLiveMsg.data), CountInfoMessage.class);
                if (this.b == null || countInfoMessage2 == null) {
                    return;
                }
                this.b.onMessageReceived(1002, countInfoMessage2);
            } else {
                if (i2 == 10101) {
                    if (this.b == null) {
                        return;
                    }
                    try {
                        this.m.a(tLiveMsg, 104, true);
                        Map<String, String> a4 = pqi.a().a(tLiveMsg);
                        a4.put("status", "1");
                        pqi.a().a("Page_TaobaoLiveWatch", "PM_STEP_ITEM_PARSE_JSON", a4);
                        a(tLiveMsg, (ShareGoodsListMessage) JSON.parseObject(new String(tLiveMsg.data), ShareGoodsListMessage.class), true);
                        return;
                    } catch (Exception e2) {
                        this.m.a(tLiveMsg, 104, false);
                        Map<String, String> a5 = pqi.a().a(tLiveMsg);
                        a5.put("status", "0");
                        a5.put("errorCode", pqi.a().a(e2));
                        pqi a6 = pqi.a();
                        a6.d("PM_STEP_ITEM_PARSE_JSON:" + new String(tLiveMsg.data) + ":" + pqi.a().a(e2));
                        pqi.a().a("liveroomItemMsg", JSON.toJSONString(a5), "PM_STEP_ITEM_PARSE_JSON", pqi.a().a(e2));
                        e2.printStackTrace();
                        return;
                    }
                } else if (i2 == 10010) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1011, tLiveMsg.from);
                    return;
                } else if (i2 == 11015) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(3009, tLiveMsg);
                    return;
                } else if (i2 == 10035) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(10035, tLiveMsg.from);
                    return;
                } else if (i2 == 10055) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1057, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                    return;
                } else if (i2 == 10021) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1020, new String(tLiveMsg.data));
                    return;
                } else if (i2 == 70008) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1050, tLiveMsg);
                    return;
                } else if (i2 == 20002) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1023, tLiveMsg);
                    return;
                } else if (i2 == 10099) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1024, (LiveSystemMessage) JSON.parseObject(new String(tLiveMsg.data), LiveSystemMessage.class));
                    return;
                } else if (i2 == 10098) {
                    if (this.b == null) {
                        return;
                    }
                    this.b.onMessageReceived(1026, new String(tLiveMsg.data));
                    return;
                } else {
                    if (i2 != 10015 && i2 != 60008) {
                        if (i2 == 10016) {
                            if (this.b == null || (tBTVProgramMessage = (TBTVProgramMessage) JSON.parseObject(new String(tLiveMsg.data), TBTVProgramMessage.class)) == null || !tBTVProgramMessage.inTime) {
                                return;
                            }
                            this.b.onMessageReceived(1039, tBTVProgramMessage);
                            return;
                        } else if (i2 == 40001) {
                            if (this.b == null || (tBLiveSwitchMsg = (TBLiveSwitchMsg) JSON.parseObject(new String(tLiveMsg.data), TBLiveSwitchMsg.class)) == null) {
                                return;
                            }
                            this.b.onMessageReceived(1058, tBLiveSwitchMsg);
                            return;
                        } else if (i2 == 40002) {
                            if (this.b == null || (tBLivePVMsg = (TBLivePVMsg) JSON.parseObject(new String(tLiveMsg.data), TBLivePVMsg.class)) == null) {
                                return;
                            }
                            this.b.onMessageReceived(1059, tBLivePVMsg);
                            return;
                        } else if (i2 == 10031) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(1040, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 100000000) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(3008, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 10033) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(1051, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 10056) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(1056, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 122233) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(1060, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 122234) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(1061, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 30005) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(2000, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 610000) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(3005, tLiveMsg);
                            return;
                        } else if (i2 == 10119) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(1062, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                            return;
                        } else if (i2 == 10036) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(MSG_TYPE_TAOLIVE_MSG_CARD, new String(tLiveMsg.data));
                            return;
                        } else if (i2 == 10110) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(MSG_TYPE_COMMENT_COUNT, (CommentCountMessage) pqj.a(new String(tLiveMsg.data), CommentCountMessage.class));
                            return;
                        } else if (i2 == 10144) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(MSG_TYPE_TOP_ATMOSPHERE, (TopAtmosphereMessage) pqj.a(new String(tLiveMsg.data), TopAtmosphereMessage.class));
                            return;
                        } else if (i2 == 200003) {
                            if (this.b == null) {
                                return;
                            }
                            this.b.onMessageReceived(10001, JSON.parseObject(new String(tLiveMsg.data)).getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID));
                            return;
                        } else {
                            if (i2 != 881000048 && i2 != 881000259 && i2 != 881000260 && i2 != 880000267) {
                                if (i2 == 18782) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(3001, tLiveMsg);
                                    return;
                                } else if (i2 == 18790) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(3002, tLiveMsg);
                                    return;
                                } else if (i2 == 100000009) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(3003, tLiveMsg);
                                    return;
                                } else if (i2 == 100000010) {
                                    f(tLiveMsg);
                                    return;
                                } else if (i2 == 880000090) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(MSG_TYPE_PRODUCT_HIDE_CASE_WITH_PM, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000112) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(3006, (SwitchOfficialMessage) JSON.parseObject(new String(tLiveMsg.data), SwitchOfficialMessage.class));
                                    return;
                                } else if (i2 == 881000154) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(MSG_TYPE_HOT_BUY, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000160) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(MSG_TYPE_SECKILL_SELLOUT, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000157) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(2001, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000168) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(PowerMsgType.swash_letters_msg, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000202) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(MSG_TYPE_COMMENT_STATUS, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000204) {
                                    if (this.b == null || tLiveMsg.data == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(MSG_TYPE_PRODUCT_HOT_GOOD, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000205) {
                                    this.b.onMessageReceived(MSG_TYPE_PRODUCT_EXPLAIN_NEW, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000206) {
                                    this.b.onMessageReceived(MSG_TYPE_PRODUCT_EXPLAIN_DELETE, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000210) {
                                    this.b.onMessageReceived(MSG_TYPE_IMPORTANT_EVENT_NOTIFY, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000238) {
                                    this.b.onMessageReceived(MSG_TYPE_CHEER_BUY_GIFT, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000248) {
                                    this.b.onMessageReceived(MSG_TYPE_GIFT_WISH, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000242) {
                                    this.b.onMessageReceived(3000, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000247) {
                                    this.b.onMessageReceived(6000, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000253) {
                                    this.b.onMessageReceived(6001, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000255) {
                                    this.b.onMessageReceived(6002, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000258) {
                                    this.b.onMessageReceived(6004, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000257) {
                                    this.b.onMessageReceived(6003, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000277) {
                                    this.b.onMessageReceived(6006, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000264) {
                                    this.b.onMessageReceived(6005, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000217) {
                                    this.b.onMessageReceived(i2, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000219) {
                                    this.b.onMessageReceived(10098, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000227) {
                                    this.b.onMessageReceived(10099, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000228) {
                                    this.b.onMessageReceived(10080, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 881000244) {
                                    this.b.onMessageReceived(10084, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000246) {
                                    this.b.onMessageReceived(10085, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000249) {
                                    this.b.onMessageReceived(PowerMsgType.ASIAN_GAMES_BADGE_MSG, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 880000272) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(PowerMsgType.FANS_CLUB_MSG, new String(tLiveMsg.data));
                                    return;
                                } else if (i2 == 888000111) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(i2, (OfficialLiveSwitchNextMessage) JSON.parseObject(new String(tLiveMsg.data), OfficialLiveSwitchNextMessage.class));
                                    return;
                                } else if (i2 == 888000112) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(i2, (OfficialLiveInfoMessage) JSON.parseObject(new String(tLiveMsg.data), OfficialLiveInfoMessage.class));
                                    return;
                                } else if (i2 == 888000113) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(i2, (OfficialLiveEndMessage) JSON.parseObject(new String(tLiveMsg.data), OfficialLiveEndMessage.class));
                                    return;
                                } else if (i2 == 880000269) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(i2, (DisableAddOneCommentMessage) JSON.parseObject(new String(tLiveMsg.data), DisableAddOneCommentMessage.class));
                                    return;
                                } else if (i2 == 880000279) {
                                    if (this.b == null) {
                                        return;
                                    }
                                    this.b.onMessageReceived(i2, (ExplainBehaviorReportMessage) pqj.a(tLiveMsg.data, ExplainBehaviorReportMessage.class, new Feature[0]));
                                    return;
                                } else if (this.b == null) {
                                    return;
                                } else {
                                    this.b.onMessageReceived(1018, tLiveMsg);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("type", (Object) Integer.valueOf(i2));
                                    String str4 = new String(tLiveMsg.data);
                                    if (!StringUtils.isEmpty(str4)) {
                                        jSONObject.put("subType", (Object) com.taobao.taolive.sdk.utils.j.a(str4));
                                        try {
                                            jSONObject.put("data", (Object) JSONObject.parseObject(str4));
                                        } catch (Exception e3) {
                                            String str5 = x;
                                            q.b(str5, "handlePowerMessage error: " + e3.getMessage());
                                        }
                                    }
                                    this.b.onMessageReceived(com.taobao.android.live.plugin.proxy.c.g(), jSONObject);
                                    return;
                                }
                            }
                            if (!this.B || (comment = (Comment) pqj.a(new String(tLiveMsg.data), Comment.class)) == null) {
                                return;
                            }
                            a(comment, true);
                            return;
                        }
                    }
                    i(new String(tLiveMsg.data));
                    return;
                }
                e.printStackTrace();
            }
        }
    }

    private void f(TLiveMsg tLiveMsg) {
        ChatMessage b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a0a3c", new Object[]{this, tLiveMsg});
        } else if (!this.l || (b2 = com.taobao.taolive.sdk.utils.j.b(tLiveMsg)) == null) {
        } else {
            a(b2);
        }
    }

    public void b(TUserMsg tUserMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b5f85f", new Object[]{this, tUserMsg});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        try {
            aVar.onMessageReceived(tUserMsg.type, tUserMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                String string = parseObject.getString("type");
                if ("expTask".equals(string)) {
                    TaskStatusMsg taskStatusMsg = (TaskStatusMsg) JSON.parseObject(parseObject.getString("data"), TaskStatusMsg.class);
                    if ("normal".equals(taskStatusMsg.type)) {
                        if (this.b != null) {
                            this.b.onMessageReceived(1052, taskStatusMsg);
                        }
                    } else if ("level".equals(taskStatusMsg.type) && this.b != null) {
                        this.b.onMessageReceived(1053, taskStatusMsg);
                    }
                } else if ("intimacyCoinTask".equals(string)) {
                    String string2 = parseObject.getString("data");
                    if (this.b != null) {
                        this.b.onMessageReceived(MSG_TYPE_TASK_INTERACTIVE_COIN_MSG, string2);
                    }
                } else if (a(parseObject)) {
                    String string3 = parseObject.getString(TYPE_MSG_UUID);
                    if (!StringUtils.isEmpty(string3)) {
                        if (this.J == null) {
                            this.K = u.b();
                            this.J = new ArrayDeque(this.K);
                        }
                        if (this.J.contains(string3)) {
                            return;
                        }
                        if (this.J.size() == this.K) {
                            this.J.poll();
                        }
                        this.J.offer(string3);
                    }
                    if (this.b != null) {
                        this.b.onMessageReceived(2037, str);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.onMessageReceived(1036, str);
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("type");
        return ("activity".equals(string) && "auction".equals(JSON.parseObject(jSONObject.getString("data")).getString("bizType"))) || "auction".equals(string);
    }

    public void a(LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdec55f", new Object[]{this, liveEmbedType});
            return;
        }
        this.j = liveEmbedType;
        this.k = u.h();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f();
        }
        Queue<String> queue = this.J;
        if (queue == null) {
            return;
        }
        queue.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        r();
        com.taobao.taolive.sdk.business.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
            this.D = null;
        }
        if (this.G != null) {
            this.G = null;
        }
        com.taobao.taolive.sdk.business.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
            this.H = null;
        }
        this.F.clear();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.b = null;
        this.h = null;
        this.d = null;
        e eVar = this.I;
        if (eVar != null) {
            eVar.f();
        }
        Queue<String> queue = this.J;
        if (queue == null) {
            return;
        }
        queue.clear();
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i2 = message.what;
        if (i2 == 273) {
            h();
        } else if (i2 == 1000) {
            a((TLiveMsg) message.obj);
        } else if (i2 == 5000) {
            if (!(message.obj instanceof TUserMsg)) {
                return;
            }
            b((TUserMsg) message.obj);
        } else if (i2 != 10000) {
        } else {
            if (this.D == null) {
                this.D = new com.taobao.taolive.sdk.business.c();
            }
            this.D.a(this.y, this.z, this.f, this.e, new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.taolive.sdk.model.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i3, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i3), netResponse, netBaseOutDo, obj});
                    } else if (netBaseOutDo == null) {
                    } else {
                        FetchCommentResponseData fetchCommentResponseData = (FetchCommentResponseData) netBaseOutDo.mo1437getData();
                        if (fetchCommentResponseData != null) {
                            if (fetchCommentResponseData.comments != null && fetchCommentResponseData.comments.size() > 0) {
                                d.a(d.this, obj, fetchCommentResponseData.comments);
                            }
                            if (fetchCommentResponseData.delay != 0) {
                                d.a(d.this, fetchCommentResponseData.delay);
                            }
                        }
                        d dVar = d.this;
                        d.b(dVar, d.a(dVar));
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i3, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i3), netResponse, obj});
                        return;
                    }
                    d dVar = d.this;
                    d.b(dVar, d.a(dVar));
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i3, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i3), netResponse, obj});
                        return;
                    }
                    d dVar = d.this;
                    d.b(dVar, d.a(dVar));
                }
            });
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.E;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    private void a(Comment comment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14483470", new Object[]{this, comment, new Boolean(z)});
        } else if (!a(comment)) {
        } else {
            a(b(comment));
        }
    }

    private boolean a(Comment comment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3233dae8", new Object[]{this, comment})).booleanValue();
        }
        return StringUtils.isEmpty(i) || comment.renders == null || !i.equals(comment.renders.get("userToken")) || (comment.renders != null && ("follow".equals(comment.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE)) || "share".equals(comment.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE)) || "fandomShare".equals(comment.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE))));
    }

    private void a(Object obj, ArrayList<Comment> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2c59e6", new Object[]{this, obj, arrayList});
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String a2 = pmd.a().x().a(pmd.a().u().c());
        long L = u.L();
        Iterator<Comment> it = arrayList.iterator();
        while (it.hasNext()) {
            Comment next = it.next();
            arrayList2.add(next.commentId);
            if (a(next, obj) && a(b(next))) {
                if (Math.abs((next.commentId + a2).hashCode()) % 100000 < L) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("commentId", next.commentId);
                    hashMap.put("receiveTs", String.valueOf(pmd.a().w().a()));
                    hashMap.put("topic", this.y);
                    pmd.a().e().b("Page_TaobaoLiveWatch", "Show-commentReceive", hashMap);
                }
            }
        }
        this.E.clear();
        this.E.addAll(arrayList2);
    }

    private boolean a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4873583", new Object[]{this, chatMessage})).booleanValue();
        }
        if (this.I != null && chatMessage != null) {
            if (u.aa() && !this.I.a() && this.I.b(chatMessage)) {
                String str = x;
                q.b(str, "Duplicate Message: " + chatMessage.mMessageId);
                return false;
            } else if (p.b()) {
                if (this.I.c() >= 300) {
                    b(this.I.e());
                    this.I.d();
                }
                this.I.a(chatMessage);
                return true;
            } else if (this.I.c() <= 300) {
                this.I.a(chatMessage);
                return true;
            }
        }
        return false;
    }

    private boolean a(Comment comment, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3b459c4", new Object[]{this, comment, obj})).booleanValue();
        }
        boolean z = comment.renders != null && ("follow".equals(comment.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE)) || "share".equals(comment.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE)) || "fandomShare".equals(comment.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE)));
        boolean z2 = !this.E.contains(comment.commentId);
        if (!StringUtils.isEmpty(i) && comment.renders != null && i.equals(comment.renders.get("userToken")) && !z) {
            return false;
        }
        return z2;
    }

    private ChatMessage b(Comment comment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("497cc64a", new Object[]{this, comment});
        }
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mCommentId = comment.commentId;
        chatMessage.mMessageId = comment.timestamp;
        chatMessage.mTimestamp = comment.timestamp;
        if (p.o() && pmd.a().w() != null) {
            chatMessage.mReceivedTimestamp = pmd.a().w().a();
        }
        chatMessage.mContent = comment.content;
        chatMessage.mUserId = comment.publisherId;
        chatMessage.renders = comment.renders;
        chatMessage.commodities = comment.commodities;
        chatMessage.mUserNick = comment.getDisplayUserNick(this.z);
        chatMessage.mUserIcon = comment.publisherIcon;
        return chatMessage;
    }

    public ArrayList<ChatMessage> a(long j, int i2) {
        e eVar;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("69a09181", new Object[]{this, new Long(j), new Integer(i2)});
        }
        if (this.l) {
            e eVar2 = this.I;
            if (eVar2 != null && !eVar2.a()) {
                return this.I.a(i2);
            }
            return null;
        } else if (i2 <= 0 || (eVar = this.I) == null || eVar.a()) {
            return null;
        } else {
            ArrayList<ChatMessage> a2 = this.I.a(i2);
            Iterator<ChatMessage> it = a2.iterator();
            while (it.hasNext()) {
                if (it.next().mType != ChatMessage.MessageType.FOLLOW) {
                    i3++;
                }
            }
            while (i3 < i2 && !this.I.a()) {
                a2.addAll(this.I.a(1));
                i3++;
            }
            return a2;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.business.c cVar = this.D;
        if (cVar != null) {
            cVar.a();
        }
        if (this.B) {
            return;
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f();
        }
        if (this.c == null) {
            this.c = new f(this);
        }
        this.c.removeMessages(10000);
        this.c.sendEmptyMessage(10000);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.removeMessages(10000);
    }

    public void q() {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.B || (fVar = this.c) == null) {
        } else {
            fVar.removeMessages(10000);
            this.c.sendEmptyMessage(10000);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.business.c cVar = this.D;
        if (cVar != null) {
            cVar.a();
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f();
        }
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.removeMessages(10000);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!this.g) {
        } else {
            if (this.c == null) {
                this.c = new f(this);
            }
            this.c.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
            this.c.sendEmptyMessageDelayed(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, u.a());
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (!this.g) {
        } else {
            Queue<String> queue = this.J;
            if (queue != null) {
                queue.clear();
            }
            f fVar = this.c;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
        }
    }

    private void a(Object obj) {
        ShareGoodsListMessage shareGoodsListMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj instanceof String) {
            JSONObject parseObject = JSON.parseObject(String.valueOf(obj));
            for (String str : this.s) {
                JSONArray jSONArray = parseObject.getJSONArray(str);
                if (jSONArray != null && jSONArray.size() > 0) {
                    if (StringUtils.equals(str, String.valueOf(10101))) {
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if ((next instanceof JSONObject) && (shareGoodsListMessage = (ShareGoodsListMessage) JSON.parseObject(JSON.toJSONString(next), ShareGoodsListMessage.class)) != null) {
                                a(shareGoodsListMessage, false);
                            }
                        }
                    } else {
                        Iterator<Object> it2 = jSONArray.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            if ((next2 instanceof JSONObject) && StringUtils.equals(str, String.valueOf(10015))) {
                                try {
                                    i(((JSONObject) next2).toJSONString());
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.g && u.s() && !StringUtils.isEmpty(this.w)) {
            if (this.H == null) {
                this.H = new com.taobao.taolive.sdk.business.i(new com.taobao.taolive.sdk.business.f() { // from class: com.taobao.taolive.sdk.model.d.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.business.f
                    public void onSuccess(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                            return;
                        }
                        try {
                            d.a(d.this, obj);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        d.c(d.this, u.a());
                    }

                    @Override // com.taobao.taolive.sdk.business.f
                    public void onError(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                        } else {
                            d.c(d.this, u.a());
                        }
                    }
                });
            }
            this.H.a(this.w);
        } else if (!this.g || StringUtils.isEmpty(this.v) || !u.r()) {
        } else {
            if (this.G == null) {
                this.G = new com.taobao.taolive.sdk.business.h();
            }
            this.G.a(this.u, this.v, new h.a() { // from class: com.taobao.taolive.sdk.model.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.business.h.a
                public void a(Object obj) {
                    List<ShareGoodsListMessage> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    if ((obj instanceof List) && (list = (List) obj) != null && list.size() > 0) {
                        for (ShareGoodsListMessage shareGoodsListMessage : list) {
                            d.a(d.this, shareGoodsListMessage, false);
                        }
                    }
                    d.c(d.this, u.a());
                }

                @Override // com.taobao.taolive.sdk.business.h.a
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        d.c(d.this, u.a());
                    }
                }
            });
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (this.c == null) {
            this.c = new f(this);
        }
        this.c.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
        this.c.sendEmptyMessageDelayed(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, j);
    }

    private void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        if (this.c == null) {
            this.c = new f(this);
        }
        this.c.removeMessages(10000);
        this.c.sendEmptyMessageDelayed(10000, j);
    }

    private void a(ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2477f8", new Object[]{this, shareGoodsListMessage, new Boolean(z)});
        } else {
            a((TLiveMsg) null, shareGoodsListMessage, z);
        }
    }

    private void a(TLiveMsg tLiveMsg, ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac63109f", new Object[]{this, tLiveMsg, shareGoodsListMessage, new Boolean(z)});
            return;
        }
        String str = "PM";
        if (shareGoodsListMessage == null || shareGoodsListMessage.goodsList == null || shareGoodsListMessage.goodsList.length <= 0) {
            if (tLiveMsg != null) {
                this.m.a(tLiveMsg, 105, false);
            }
            if (shareGoodsListMessage == null) {
                return;
            }
            Map<String, String> a2 = pqi.a().a(tLiveMsg);
            a2.put("status", "0");
            if (!z) {
                str = "CDN";
            }
            a2.put("type", str);
            a2.put("errorCode", "goodsMsg:" + JSON.toJSONString(shareGoodsListMessage));
            pqi a3 = pqi.a();
            a3.d("PM_STEP_ITEM_CHECK_GOOD_LIST:" + JSON.toJSONString(shareGoodsListMessage));
            pqi.a().a("liveroomItemMsg", JSON.toJSONString(a2), "PM_STEP_ITEM_CHECK_GOOD_LIST", "PM_STEP_ITEM_CHECK_GOOD_LIST");
            return;
        }
        if (z) {
            this.m.a(tLiveMsg, 105, true);
        }
        ShareGoodMessage[] shareGoodMessageArr = shareGoodsListMessage.goodsList;
        if (shareGoodMessageArr != null && shareGoodMessageArr[0] != null) {
            if (this.J == null) {
                this.K = u.b();
                this.J = new ArrayDeque(this.K);
            }
            Map<String, String> map = shareGoodMessageArr[0].extendVal;
            if (map != null) {
                String str2 = map.get(TYPE_MSG_UUID);
                if (!StringUtils.isEmpty(str2) && this.J.contains(str2)) {
                    if (tLiveMsg == null) {
                        return;
                    }
                    this.m.a(tLiveMsg, 199, true);
                    pqi.a().b("liveroomItemMsg");
                    a aVar = this.b;
                    if (aVar == null) {
                        return;
                    }
                    aVar.onMessageReceived(MSG_TYPE_PRODUCT_LIST_WITH_CDN_INVALID, tLiveMsg);
                    return;
                } else if (!StringUtils.isEmpty(str2) && !this.J.contains(str2)) {
                    e(str2);
                    Map<String, String> a4 = pqi.a().a(tLiveMsg);
                    a4.put("itemId", shareGoodsListMessage.goodsList[0].itemId);
                    if (!z) {
                        str = "CDN";
                    }
                    a4.put("type", str);
                    pqi.a().a("Page_TaobaoLiveWatch", "ItemInfoArrivalFirst", a4);
                    if (tLiveMsg != null) {
                        this.m.a(tLiveMsg, 106, true);
                    }
                } else if (StringUtils.isEmpty(str2) && !z) {
                    return;
                }
            }
        }
        this.b.onMessageReceived(1009, shareGoodsListMessage);
        if (tLiveMsg != null) {
            this.b.onMessageReceived(MSG_TYPE_PRODUCT_LIST_WITH_PM, tLiveMsg);
        } else {
            this.b.onMessageReceived(MSG_TYPE_PRODUCT_LIST_WITH_CDN, shareGoodsListMessage);
        }
    }

    private void b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddb8ac0", new Object[]{this, chatMessage});
        } else if (chatMessage == null || chatMessage.renders == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(chatMessage.renders.get("userReply2UserCommentId"))) {
                hashMap.put("is_reply", "1");
            } else {
                hashMap.put("is_reply", "0");
            }
            if (!StringUtils.isEmpty(chatMessage.renders.get("comment_type"))) {
                hashMap.put("comment_type", chatMessage.renders.get("comment_type"));
            }
            if (!StringUtils.isEmpty(chatMessage.renders.get("comment_location"))) {
                hashMap.put("comment_location", chatMessage.renders.get("comment_location"));
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "Comment_LineDrop", hashMap);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        Queue<String> queue = this.J;
        if (queue == null) {
            return;
        }
        queue.clear();
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        try {
            if (this.J == null) {
                this.K = u.b();
                this.J = new ArrayDeque(this.K);
            }
            if (StringUtils.isEmpty(str)) {
                return;
            }
            if (this.J.size() == this.K) {
                this.J.poll();
            }
            this.J.offer(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.r;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("topic", str2);
        pnn pnnVar = this.h;
        if (pnnVar != null) {
            hashMap.putAll(pnnVar.getHeartParams());
            if (this.h.getHeartParams().get("liveAlgoParams") != null) {
                hashMap.putAll(b(pqj.b(this.h.getHeartParams().get("liveAlgoParams"))));
            }
            if (this.h.getHeartParams().get("liveServerParams") != null) {
                hashMap.putAll(b(pqj.b(this.h.getHeartParams().get("liveServerParams"))));
            }
        }
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", str, hashMap);
    }

    private HashMap<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1413b1ca", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof JSONObject) {
                        hashMap.putAll(b((JSONObject) value));
                    } else {
                        hashMap.put(key, JSON.toJSONString(value));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
