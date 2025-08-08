package tb;

import android.content.Intent;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.c;
import com.taobao.taolive.sdk.business.h;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponseData;
import com.taobao.taolive.sdk.model.common.UserAvatar;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.e;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.interact.Comment;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.LiveEndMessage;
import com.taobao.taolive.sdk.model.message.LiveInteractiveMessage;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TaskStatusMsg;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.j;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class hua implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_TYPE_ACTOR_SWITCH = 1016;
    public static final int MSG_TYPE_ANCHOR_BACK = 1007;
    public static final int MSG_TYPE_ANCHOR_BROADCAST = 1019;
    public static final int MSG_TYPE_ANCHOR_LEAVE = 1006;
    public static final int MSG_TYPE_BIZ_MEDIAPLATFORM_INFO = 2037;
    public static final int MSG_TYPE_BROADCAST_MSG = 1037;
    public static final int MSG_TYPE_CHAT_AI_MESSAGE = 1050;
    public static final int MSG_TYPE_COMMON_TIPS_SHOW = 1057;
    public static final int MSG_TYPE_CUSTOM_SERVE_GOOD_INTRO = 1056;
    public static final int MSG_TYPE_DEFAULT = 1018;
    public static final int MSG_TYPE_DISPATCH_ERROR = 1027;
    public static final int MSG_TYPE_ENTER_FAIL = 100000;
    public static final int MSG_TYPE_ENTER_GROUP_SHOW = 10035;
    public static final int MSG_TYPE_ENTER_SUCCESS = 1005;
    public static final int MSG_TYPE_FANS_LEVEL_UPGRADE = 1051;
    public static final int MSG_TYPE_FAVOR = 1002;
    public static final int MSG_TYPE_FOLLOW = 1049;
    public static final int MSG_TYPE_GET_ROOM_INFO = 1013;
    public static final int MSG_TYPE_GET_USERS = 1012;
    public static final int MSG_TYPE_GIFT = 1008;
    public static final int MSG_TYPE_H265_MSG = 1024;
    public static final int MSG_TYPE_INTERACTIVE = 1014;
    public static final int MSG_TYPE_LINK_LIVE = 1020;
    public static final int MSG_TYPE_LIVE_END = 1004;
    public static final int MSG_TYPE_MEDIA_PLATFORM = 1036;
    public static final int MSG_TYPE_MEDIA_PLATFORM_LEVEL = 1053;
    public static final int MSG_TYPE_MEDIA_PLATFORM_NORMAL = 1052;
    public static final int MSG_TYPE_NOTICE_MSG = 1023;
    public static final int MSG_TYPE_PLAYER_SWITCH = 1017;
    public static final int MSG_TYPE_PLAY_ERROR_MSG = 1026;
    public static final int MSG_TYPE_PRODUCT = 1001;
    public static final int MSG_TYPE_PRODUCT_LIST = 1009;
    public static final int MSG_TYPE_PULL_MESSAGE = 1029;
    public static final int MSG_TYPE_ROOM_SWITCH = 1039;
    public static final int MSG_TYPE_STAGE_GROUP_TIPS_SHOW = 1062;
    public static final int MSG_TYPE_SYSTEM = 100;
    public static final int MSG_TYPE_SYSTEM_BROADCAST = 1015;
    public static final int MSG_TYPE_SYSTEM_STUDIO = 101;
    public static final int MSG_TYPE_TAOLIVE_PK_ASSIST = 1061;
    public static final int MSG_TYPE_TAOLIVE_PK_HOT = 1060;
    public static final int MSG_TYPE_TAOLIVE_PV = 1059;
    public static final int MSG_TYPE_TAOLIVE_SWITCH_ROOM = 1058;
    public static final int MSG_TYPE_TASK_INTERACTIVE_MSG = 1055;
    public static final int MSG_TYPE_TIMESHIFT = 2000;
    public static final int MSG_TYPE_TRADE_SHOW = 1011;
    public static final int MSG_TYPE_TXT = 1000;
    public static final int MSG_TYPE_UPDATE_BROADCASTER_SCORE = 1033;
    public static final int MSG_TYPE_UPDATE_SKIN = 1041;
    public static final int MSG_TYPE_UPDATE_SKIN_4_FRAME = 1042;
    public static final int MSG_TYPE_USER_LEVEL_ENTER = 1040;
    public static final int MSG_TYPE_USER_UPDATE = 1003;
    public static final int MSG_TYPE_USER_UPDATE_ITEM = 102;
    public static final int MSG_TYPE_VIDEO_HIGHLIGHTS_MSG = 1038;
    private static final String h;

    /* renamed from: a  reason: collision with root package name */
    public a f28784a;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    private String i;
    private int j;
    private boolean l;
    private c m;
    private h n;
    private HashSet<String> p;
    private long k = 5000;
    public f b = null;
    private e o = new e();

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, Object obj);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ e a(hua huaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2dc9ae4b", new Object[]{huaVar}) : huaVar.o;
    }

    public static /* synthetic */ void a(hua huaVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ae5de0", new Object[]{huaVar, new Long(j)});
        } else {
            huaVar.a(j);
        }
    }

    public static /* synthetic */ void a(hua huaVar, ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17b007c", new Object[]{huaVar, shareGoodsListMessage, new Boolean(z)});
        } else {
            huaVar.a(shareGoodsListMessage, z);
        }
    }

    public static /* synthetic */ long b(hua huaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db2dcbd9", new Object[]{huaVar})).longValue() : huaVar.k;
    }

    public static /* synthetic */ long b(hua huaVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a8c2773", new Object[]{huaVar, new Long(j)})).longValue();
        }
        huaVar.k = j;
        return j;
    }

    public static /* synthetic */ void c(hua huaVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c69f11e", new Object[]{huaVar, new Long(j)});
        } else {
            huaVar.b(j);
        }
    }

    static {
        kge.a(-1316079119);
        kge.a(-1905361424);
        h = d.class.getSimpleName();
    }

    public hua(int i, String str, boolean z, boolean z2, a aVar) {
        this.l = false;
        this.i = str;
        this.j = i;
        this.l = z;
        this.f28784a = aVar;
        this.c = z2;
    }

    private boolean c(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77903b23", new Object[]{this, tLiveMsg})).booleanValue();
        }
        if (tLiveMsg.type == 10099 || tLiveMsg.type == 10016) {
            return true;
        }
        if (tLiveMsg.type != 10001) {
            return false;
        }
        return "playerswitch".equals(j.a(new String(tLiveMsg.data)));
    }

    public void b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b7a0c0", new Object[]{this, tLiveMsg});
        } else if (tLiveMsg == null) {
        } else {
            if (b.d(com.taobao.taolive.sdk.core.f.a().b())) {
                Intent intent = new Intent("action.com.taobao.taolive.room.powerMessage");
                String jSONString = JSONObject.toJSONString(tLiveMsg);
                intent.putExtra("msg", jSONString);
                LocalBroadcastManager.getInstance(com.taobao.taolive.sdk.core.f.a().b()).sendBroadcast(intent);
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "Message: dispatch msg: " + jSONString);
            }
            if (this.b == null) {
                this.b = new f(this);
            }
            Message obtainMessage = this.b.obtainMessage(1000);
            obtainMessage.obj = tLiveMsg;
            if (c(tLiveMsg)) {
                this.b.sendMessageDelayed(obtainMessage, u.k());
            } else {
                this.b.sendMessage(obtainMessage);
            }
        }
    }

    public void a(TLiveMsg tLiveMsg) {
        TBLivePVMsg tBLivePVMsg;
        TBLiveSwitchMsg tBLiveSwitchMsg;
        TBTVProgramMessage tBTVProgramMessage;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
            return;
        }
        int i = tLiveMsg.type;
        try {
            if (b.d(com.taobao.taolive.sdk.core.f.a().b())) {
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "Message: handlePowerMessage msg: " + JSONObject.toJSONString(tLiveMsg));
            }
            if (i == 10105) {
                ChatMessage a2 = j.a(tLiveMsg);
                if (!a(a2) && !this.l) {
                    this.o.a(a2);
                }
                if (this.f28784a == null || this.l) {
                    return;
                }
                this.f28784a.a(1000, tLiveMsg);
            } else if (i == 10001) {
                String str = new String(tLiveMsg.data);
                if (this.f28784a != null) {
                    this.f28784a.a(100, str);
                }
                String a3 = j.a(str);
                if ("endLiveVideo".equals(a3)) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1004, (LiveEndMessage) JSON.parseObject(str, LiveEndMessage.class));
                } else if ("playerswitch".equals(a3)) {
                    LiveSystemMessage liveSystemMessage = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1017, liveSystemMessage);
                } else if ("1".equals(a3) || "2".equals(a3) || "3".equals(a3)) {
                    LiveSystemMessage liveSystemMessage2 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1015, liveSystemMessage2);
                }
            } else {
                Long l = null;
                if (i == 10002) {
                    String str2 = new String(tLiveMsg.data);
                    if (this.f28784a != null) {
                        this.f28784a.a(101, str2);
                    }
                    String a4 = j.a(str2);
                    if ("liveVideoStreamBreak".equals(a4)) {
                        if (this.f28784a == null) {
                            return;
                        }
                        this.f28784a.a(1006, null);
                    } else if ("liveVideoStreamRestore".equals(a4) && this.f28784a != null) {
                        this.f28784a.a(1007, null);
                    }
                } else if (i == 23001) {
                    LiveInteractiveMessage liveInteractiveMessage = new LiveInteractiveMessage();
                    liveInteractiveMessage.messageId = tLiveMsg.messageId;
                    liveInteractiveMessage.data = new String(tLiveMsg.data);
                    if (this.f28784a == null) {
                        return;
                    }
                    if (j.b(liveInteractiveMessage.data)) {
                        this.f28784a.a(1055, liveInteractiveMessage);
                    } else {
                        this.f28784a.a(1014, liveInteractiveMessage);
                    }
                } else if (i == 10103) {
                    JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) JSON.parseObject(new String(tLiveMsg.data), JoinNotifyMessage.class);
                    if (joinNotifyMessage == null || (map = joinNotifyMessage.addUsers) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : map.keySet()) {
                        pnk q = pmd.a().q();
                        if (q == null || !str3.equals(q.a())) {
                            UserAvatar userAvatar = new UserAvatar();
                            userAvatar.id = l.b(str3);
                            userAvatar.name = map.get(str3);
                            userAvatar.headImg = com.taobao.taolive.sdk.core.f.a().b().getString(R.string.minilive_user_header_url, new Object[]{Long.valueOf(userAvatar.id)});
                            arrayList.add(userAvatar);
                        }
                    }
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(102, joinNotifyMessage);
                    this.f28784a.a(1003, arrayList);
                } else if (i == 10104) {
                    CountInfoMessage countInfoMessage = (CountInfoMessage) JSON.parseObject(new String(tLiveMsg.data), CountInfoMessage.class);
                    if (countInfoMessage.value != null) {
                        l = countInfoMessage.value.get(PowerMsgType.KEY_FAVOR);
                    }
                    if (this.f28784a == null || l == null) {
                        return;
                    }
                    this.f28784a.a(1002, l);
                } else if (i == 10101) {
                    if (this.f28784a == null) {
                        return;
                    }
                    try {
                        a((ShareGoodsListMessage) JSON.parseObject(new String(tLiveMsg.data), ShareGoodsListMessage.class), true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (i == 10010) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1011, tLiveMsg.from);
                } else if (i == 10035) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(10035, tLiveMsg.from);
                } else if (i == 10055) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1057, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                } else if (i == 70008) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1050, tLiveMsg);
                } else if (i == 20002) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1023, tLiveMsg);
                } else if (i == 10099) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1024, (LiveSystemMessage) JSON.parseObject(new String(tLiveMsg.data), LiveSystemMessage.class));
                } else if (i == 10098) {
                    if (this.f28784a == null) {
                        return;
                    }
                    this.f28784a.a(1026, new String(tLiveMsg.data));
                } else {
                    if (i != 10015 && i != 60008) {
                        if (i == 10016) {
                            if (this.f28784a == null || (tBTVProgramMessage = (TBTVProgramMessage) JSON.parseObject(new String(tLiveMsg.data), TBTVProgramMessage.class)) == null || !tBTVProgramMessage.inTime) {
                                return;
                            }
                            this.f28784a.a(1039, tBTVProgramMessage);
                            return;
                        } else if (i == 40001) {
                            if (this.f28784a == null || (tBLiveSwitchMsg = (TBLiveSwitchMsg) JSON.parseObject(new String(tLiveMsg.data), TBLiveSwitchMsg.class)) == null) {
                                return;
                            }
                            this.f28784a.a(1058, tBLiveSwitchMsg);
                            return;
                        } else if (i == 40002) {
                            if (this.f28784a == null || (tBLivePVMsg = (TBLivePVMsg) JSON.parseObject(new String(tLiveMsg.data), TBLivePVMsg.class)) == null) {
                                return;
                            }
                            this.f28784a.a(1059, tBLivePVMsg);
                            return;
                        } else if (i == 10031) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(1040, new String(tLiveMsg.data));
                            return;
                        } else if (i == 10033) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(1051, new String(tLiveMsg.data));
                            return;
                        } else if (i == 10056) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(1056, new String(tLiveMsg.data));
                            return;
                        } else if (i == 122233) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(1060, new String(tLiveMsg.data));
                            return;
                        } else if (i == 122234) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(1061, new String(tLiveMsg.data));
                            return;
                        } else if (i == 30005) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(2000, new String(tLiveMsg.data));
                            return;
                        } else if (i == 610000) {
                            if (com.taobao.android.miniLive.services.e.a().f() == null) {
                                return;
                            }
                            com.taobao.android.miniLive.services.e.a().f().a(tLiveMsg);
                            return;
                        } else if (i == 10119) {
                            if (this.f28784a == null) {
                                return;
                            }
                            this.f28784a.a(1062, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                            return;
                        } else if (this.f28784a == null) {
                            return;
                        } else {
                            this.f28784a.a(1018, tLiveMsg);
                            return;
                        }
                    }
                    c(new String(tLiveMsg.data));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if ("expTask".equals(parseObject.getString("type"))) {
                    TaskStatusMsg taskStatusMsg = (TaskStatusMsg) JSON.parseObject(parseObject.getString("data"), TaskStatusMsg.class);
                    if ("normal".equals(taskStatusMsg.type)) {
                        if (this.f28784a != null) {
                            this.f28784a.a(1052, taskStatusMsg);
                        }
                    } else if ("level".equals(taskStatusMsg.type) && this.f28784a != null) {
                        this.f28784a.a(1053, taskStatusMsg);
                    }
                } else if (a(parseObject) && this.f28784a != null) {
                    this.f28784a.a(2037, str);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        a aVar = this.f28784a;
        if (aVar == null) {
            return;
        }
        aVar.a(1036, str);
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("type");
        return ("activity".equals(string) && "auction".equals(JSON.parseObject(jSONObject.getString("data")).getString("bizType"))) || "auction".equals(string);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.o;
        if (eVar != null) {
            eVar.f();
        }
        HashSet<String> hashSet = this.p;
        if (hashSet == null) {
            return;
        }
        hashSet.clear();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f();
        c cVar = this.m;
        if (cVar != null) {
            cVar.b();
            this.m = null;
        }
        if (this.n == null) {
            return;
        }
        this.n = null;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f28784a = null;
        e eVar = this.o;
        if (eVar != null) {
            eVar.f();
        }
        HashSet<String> hashSet = this.p;
        if (hashSet == null) {
            return;
        }
        hashSet.clear();
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 273) {
            if (this.n == null) {
                this.n = new h();
            }
            if (StringUtils.isEmpty(this.g)) {
                return;
            }
            this.n.a(this.f, this.g, new h.a() { // from class: tb.hua.1
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
                            hua.a(hua.this, shareGoodsListMessage, false);
                        }
                    }
                    hua.a(hua.this, u.a());
                }

                @Override // com.taobao.taolive.sdk.business.h.a
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        hua.a(hua.this, u.a());
                    }
                }
            });
        } else if (i == 1000) {
            a((TLiveMsg) message.obj);
        } else if (i != 10000) {
        } else {
            if (this.m == null) {
                this.m = new c();
            }
            this.m.a(this.i, this.j, this.c, new com.taobao.taolive.sdk.adapter.network.d() { // from class: tb.hua.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
                    } else if (netBaseOutDo == null) {
                    } else {
                        FetchCommentResponseData fetchCommentResponseData = (FetchCommentResponseData) netBaseOutDo.mo1437getData();
                        if (fetchCommentResponseData != null) {
                            if (fetchCommentResponseData.comments != null && fetchCommentResponseData.comments.size() > 0) {
                                Iterator<Comment> it = fetchCommentResponseData.comments.iterator();
                                while (it.hasNext()) {
                                    Comment next = it.next();
                                    pnk q = pmd.a().q();
                                    String b = q != null ? q.b() : "";
                                    boolean equals = obj instanceof String ? StringUtils.equals(String.valueOf(obj), "") : true;
                                    if (StringUtils.isEmpty(b) || !b.equals(next.publisherNick) || equals) {
                                        ChatMessage chatMessage = new ChatMessage();
                                        chatMessage.mMessageId = next.timestamp;
                                        if (!StringUtils.isEmpty(next.tbNick)) {
                                            chatMessage.mUserNick = next.tbNick;
                                        } else {
                                            chatMessage.mUserNick = next.publisherNick;
                                        }
                                        chatMessage.mTimestamp = next.timestamp;
                                        chatMessage.mContent = next.content;
                                        chatMessage.mUserId = next.publisherId;
                                        chatMessage.renders = next.renders;
                                        chatMessage.commodities = next.commodities;
                                        if (hua.a(hua.this) != null && hua.a(hua.this).b() < 200) {
                                            hua.a(hua.this).a(chatMessage);
                                        }
                                    }
                                }
                            }
                            if (fetchCommentResponseData.delay != 0) {
                                hua.b(hua.this, fetchCommentResponseData.delay);
                            }
                            hua huaVar = hua.this;
                            hua.c(huaVar, hua.b(huaVar));
                            return;
                        }
                        hua huaVar2 = hua.this;
                        hua.c(huaVar2, hua.b(huaVar2));
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
                        return;
                    }
                    hua huaVar = hua.this;
                    hua.c(huaVar, hua.b(huaVar));
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj});
                        return;
                    }
                    hua huaVar = hua.this;
                    hua.c(huaVar, hua.b(huaVar));
                }
            });
        }
    }

    private boolean a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4873583", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null) {
            return false;
        }
        pnk q = pmd.a().q();
        String a2 = q != null ? q.a() : "";
        return !StringUtils.isEmpty(a2) && a2.equals(String.valueOf(chatMessage.mUserId));
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.a();
        }
        e eVar = this.o;
        if (eVar != null) {
            eVar.f();
        }
        f fVar = this.b;
        if (fVar == null) {
            return;
        }
        fVar.removeMessages(10000);
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (this.b == null) {
            this.b = new f(this);
        }
        this.b.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
        this.b.sendEmptyMessageDelayed(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, j);
    }

    private void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        if (this.b == null) {
            this.b = new f(this);
        }
        this.b.removeMessages(10000);
        this.b.sendEmptyMessageDelayed(10000, j);
    }

    private void a(ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2477f8", new Object[]{this, shareGoodsListMessage, new Boolean(z)});
        } else if (shareGoodsListMessage == null || shareGoodsListMessage.goodsList == null || shareGoodsListMessage.goodsList.length <= 0) {
        } else {
            String str = "";
            if (z && pmd.a().e() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", shareGoodsListMessage.goodsList[0].itemId);
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.f);
                hashMap.put("topic", this.i);
                hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : str);
                pmd.a().e().a(htz.UT_PAGE_NAME, "PM_goodMsg", hashMap);
            }
            ShareGoodMessage[] shareGoodMessageArr = shareGoodsListMessage.goodsList;
            if (shareGoodMessageArr != null && shareGoodMessageArr[0] != null) {
                if (this.p == null) {
                    this.p = new HashSet<>();
                }
                Map<String, String> map = shareGoodMessageArr[0].extendVal;
                if (map != null) {
                    String str2 = map.get(d.TYPE_MSG_UUID);
                    if (!StringUtils.isEmpty(str2) && this.p.contains(str2)) {
                        return;
                    }
                    if (!StringUtils.isEmpty(str2) && !this.p.contains(str2)) {
                        b(str2);
                        if (!z) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("itemId", shareGoodsListMessage.goodsList[0].itemId);
                            hashMap2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.f);
                            hashMap2.put("topic", this.i);
                            if (pmd.a().q() != null) {
                                str = pmd.a().q().a();
                            }
                            hashMap2.put("userId", str);
                            pmd.a().e().a(htz.UT_PAGE_NAME, "CDN_goodMsg", hashMap2);
                        }
                    }
                }
            }
            this.f28784a.a(1009, shareGoodsListMessage);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            if (this.p == null) {
                this.p = new HashSet<>();
            }
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.p.add(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
