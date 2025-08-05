package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.af;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.tbliveinteractive.business.task.a;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class pip implements af.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32691a;
    private phm c;
    private a e;
    private LiveDetailMessinfoResponseData.AdEurlParams f;
    private com.taobao.alilive.aliliveframework.frame.a g;
    private Context h;
    private af i;
    private int b = 0;
    private int d = aa.u();

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaskInteractiveManager";
    }

    static {
        kge.a(1638142639);
        kge.a(191318335);
        kge.a(-1182921746);
        kge.a(-1491353344);
        f32691a = pip.class.getSimpleName();
    }

    public pip(e eVar, VideoInfo videoInfo, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.e = eVar.a(videoInfo, z);
        this.h = eVar.q();
        ddw.a().a(this);
        this.i = new af();
        this.i.a(this);
        this.g = aVar;
    }

    public void a(LiveDetailMessinfoResponseData.AdEurlParams adEurlParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4930a18", new Object[]{this, adEurlParams});
        } else {
            this.f = adEurlParams;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        af afVar = this.i;
        if (afVar == null) {
            return;
        }
        afVar.a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        af afVar = this.i;
        if (afVar == null) {
            return;
        }
        afVar.c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        af afVar = this.i;
        if (afVar != null) {
            afVar.b();
            this.i = null;
        }
        this.b = 0;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str2 = null;
        if (u.aZ() && "com.taobao.taolive.room.good_click".equals(str) && (obj instanceof String[])) {
            a((String[]) obj);
            return;
        }
        try {
            switch (str.hashCode()) {
                case -1832948174:
                    if (str.equals("com.taobao.taolive.room.add_item_new")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1473773571:
                    if (str.equals(xkw.EVENT_ACTION_ADD_FAVOR)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1450449455:
                    if (str.equals(xkw.EVENT_ADD_ITEM)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -830550742:
                    if (str.equals(xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -554098287:
                    if (str.equals(xkw.EVENT_ACTION_FOLLOW)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -462319263:
                    if (str.equals("com.taobao.taolive.room.addcart")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 119727352:
                    if (str.equals("com.taobao.taolive.room.enter")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 132460031:
                    if (str.equals("com.taobao.taolive.room.share")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 458859892:
                    if (str.equals("com.taobao.taolive.room.gotoDetail")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 1053794852:
                    if (str.equals("com.taobao.taolive.room.fandom.subscribe_live_success")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2061259993:
                    if (str.equals("com.taobao.taolive.room.gotoShop")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    str2 = "subscribe";
                    break;
                case 1:
                    str2 = tfu.ADD_CART;
                    jSONObject.put("itemId", obj);
                    break;
                case 2:
                    str2 = tfu.GOTO_DETAIL;
                    jSONObject.put("itemId", obj);
                    break;
                case 3:
                    str2 = "gotoShop";
                    jSONObject.put(g.KEY_APM_SHOP_URL, obj);
                    break;
                case 4:
                    str2 = "addFavor";
                    if (obj != null && (obj instanceof Map)) {
                        HashMap hashMap = (HashMap) obj;
                        jSONObject.put("favorCount", hashMap.get("favorCount"));
                        jSONObject.put("totalFavorCount", hashMap.get("totalFavorCount"));
                        Integer.parseInt((String) hashMap.get("totalFavorCount"));
                        break;
                    }
                    break;
                case 5:
                case 6:
                    str2 = "follow";
                    jSONObject.put("accountId", obj);
                    break;
                case 7:
                    str2 = "share";
                    break;
                case '\b':
                case '\t':
                    if (obj != null && (obj instanceof ChatMessage)) {
                        ChatMessage chatMessage = (ChatMessage) obj;
                        if (chatMessage.renders != null && "joinMember".equals(chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE))) {
                            return;
                        }
                        str2 = tfu.COMMENT;
                        jSONObject.put("commentContent", (Object) ((ChatMessage) obj).mContent);
                        break;
                    }
                    break;
                case '\n':
                    str2 = g4.b.i;
                    e();
                    break;
            }
        } catch (Exception unused) {
        }
        a(str2, jSONObject);
        b(str2, jSONObject);
        a(str2);
    }

    private void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        VideoInfo u = poy.u(this.g);
        if (!aa.bY() || u == null || u.alimamaEnjoyFirst == null || u.alimamaEnjoyFirst.eurl == null) {
            return;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String b = b(u.alimamaEnjoyFirst.eurl);
        if (this.c == null) {
            this.c = new phm();
        }
        String replaceAll = u.alimamaEnjoyFirst.eurl.replaceAll("__INTERACT_TYPE__", tfu.GOTO_DETAIL).replaceAll(gvw.ITEM_ID_PLACE_HOLDER, str2).replaceAll("__TIMESTAMP__", String.valueOf(System.currentTimeMillis() / 1000));
        this.c.a(replaceAll.replaceAll("__APPINFO__", d() + "_0"), f());
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
        hashMap.put("itemId", str2);
        hashMap.put("alimamaLiveId", b);
        hashMap.put("isSame", TextUtils.equals(str, b) ? "true" : "false");
        ai.b("alimamaTcpReportCheck", hashMap);
    }

    private void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        VideoInfo u = poy.u(this.g);
        if (u == null || u.alimamaEnjoyFirst == null || u.alimamaEnjoyFirst.ifs == null || !aa.bY()) {
            return;
        }
        if (u.aZ()) {
            String str2 = u.alimamaEnjoyFirst.ifs;
            str = str2.replaceAll("__APPINFO__", d() + "_0");
        } else {
            str = u.alimamaEnjoyFirst.ifs;
        }
        phm.a(str, f(), "TargetQzt");
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        Matcher matcher = Pattern.compile("feedid=(\\d+)").matcher(Uri.decode(str));
        return matcher.find() ? matcher.group(1) : "";
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String b = pmd.a().u() != null ? pmd.a().u().b() : "21646297";
        String K = poy.K(this.g);
        String ac = poy.ac(this.g);
        return "appKey=" + b + "#livesource=" + ac + "#spm=" + K;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : pmd.a().u() != null ? pmd.a().u().b() : "21646297";
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (this.e == null) {
        } else {
            if (poy.J(this.g)) {
                this.e.a(str, jSONObject, poz.p(n.b(this.g)), poy.H(this.g));
            } else {
                this.e.a(str, jSONObject, poy.u(this.g));
            }
        }
    }

    private void b() {
        JSONObject b;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!aa.s()) {
        } else {
            if (this.f != null && aa.bN()) {
                if (this.f.pay_time >= 0) {
                    this.d = this.f.pay_time;
                }
                if (this.b != this.d) {
                    return;
                }
                if (this.c == null) {
                    this.c = new phm();
                }
                this.c.a(this.f.eurl);
                com.taobao.alilive.aliliveframework.frame.a aVar = this.g;
                ai.a(aVar, "Alimama_Click", "alimamaClickId=" + this.f.eurl);
                return;
            }
            LiveDetailMessinfoResponseData.AlimamaInfo p = poy.p(this.g);
            if (p != null) {
                if (p.pay_time >= 0) {
                    this.d = p.pay_time;
                }
                if (this.b != this.d) {
                    return;
                }
                if (this.c == null) {
                    this.c = new phm();
                }
                this.c.a(p.clickid);
                com.taobao.alilive.aliliveframework.frame.a aVar2 = this.g;
                ai.a(aVar2, "Alimama_Click", "alimamaClickId=" + p.clickid);
            } else if (poy.Z(this.g) == null || !aa.f() || (b = pqj.b(poy.Z(this.g))) == null || (integer = b.getInteger("pay_time")) == null || integer.intValue() != this.b || b.getString("pay_url") == null) {
            } else {
                if (this.c == null) {
                    this.c = new phm();
                }
                this.c.a(b.getString("pay_url"));
                com.taobao.alilive.aliliveframework.frame.a aVar3 = this.g;
                ai.a(aVar3, "Alimama_Click", "alimamaClickId=" + b.getString("pay_url"));
            }
        }
    }

    private void a(String str) {
        LiveDetailMessinfoResponseData.AlimamaInfo2 q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!aa.t() || (q = poy.q(this.g)) == null) {
        } else {
            if (this.c == null) {
                this.c = new phm();
            }
            VideoInfo u = poy.u(this.g);
            if (u == null) {
                return;
            }
            if (((TextUtils.isEmpty(u.liveId) || TextUtils.isEmpty(q.adLiveId) || !q.adLiveId.equals(u.liveId)) && !TextUtils.isEmpty(q.adLiveId)) || q.action_list == null || q.action_list.size() <= 0 || !q.action_list.contains(str)) {
                return;
            }
            System.out.println(q.pay_url);
            String str2 = q.pay_url + "&acttype=${" + str + riy.BLOCK_END_STR;
            this.c.a(str2, str, q.action_list);
            ai.a(this.g, "Alimama_AdTransParams_Click", "url=" + str2 + " actionType=" + str + " action_list=" + q.action_list + " live_os=Android liveType=2");
        }
    }

    private void b(String str, JSONObject jSONObject) {
        JSONObject b;
        Integer integer;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else if (!aa.s()) {
        } else {
            LiveDetailMessinfoResponseData.AlimamaInfo p = poy.p(this.g);
            if (p != null) {
                if (this.c == null) {
                    this.c = new phm();
                }
                if (g4.b.i.equals(str)) {
                    if (p.pay_time >= 0) {
                        this.d = p.pay_time;
                    }
                    if (this.d != 0) {
                        return;
                    }
                    this.c.a(p.clickid);
                    ai.a(this.g, "Alimama_Click", "alimamaClickId=" + p.clickid);
                    return;
                }
                String str3 = p.interactiveid;
                if (!TextUtils.isEmpty(str3) && poy.u(this.g) != null && poy.u(this.g).broadCaster != null && cgl.i() != null) {
                    if (str3.contains("?")) {
                        str2 = str3 + "&action=" + str + "&liveId=" + poy.u(this.g).liveId + "&userId=" + cgl.i().a() + "&anchorId=" + poy.u(this.g).broadCaster.accountId;
                    } else {
                        str2 = str3 + "?action=" + str + "&liveId=" + poy.u(this.g).liveId + "&userId=" + cgl.i().a() + "&anchorId=" + poy.u(this.g).broadCaster.accountId;
                    }
                    if ((tfu.ADD_CART.equals(str) || tfu.GOTO_DETAIL.equals(str)) && jSONObject != null) {
                        str2 = str2 + "&itemId=" + jSONObject.getString("itemId");
                    }
                    this.c.a(str2);
                    ai.a(this.g, "Alimama_Interactive", "alimamaInteractiveId=" + p.interactiveid);
                    return;
                }
                ai.a(this.g, "Alimama_Interactive_urlerror", new String[0]);
            } else if (poy.Z(this.g) == null || !aa.f() || !g4.b.i.equals(str) || (b = pqj.b(poy.Z(this.g))) == null || (integer = b.getInteger("pay_time")) == null || integer.intValue() != 0 || b.getString("pay_url") == null) {
            } else {
                if (this.c == null) {
                    this.c = new phm();
                }
                this.c.a(b.getString("pay_url"));
                ai.a(this.g, "Alimama_Click", "alimamaClickId=" + b.getString("pay_url"));
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.addcart", "com.taobao.taolive.room.gotoDetail", "com.taobao.taolive.room.gotoShop", xkw.EVENT_ACTION_FOLLOW, "com.taobao.taolive.room.share", xkw.EVENT_ADD_ITEM, "com.taobao.taolive.room.add_item_new", xkw.EVENT_ACTION_ADD_FAVOR, xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, "com.taobao.taolive.room.enter", "com.taobao.taolive.room.fandom.subscribe_live_success", "com.taobao.taolive.room.good_click"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.g;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    @Override // com.taobao.taolive.room.utils.af.a
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.b++;
        b();
        if (this.b % 60 != 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stayTime", (Object) Integer.valueOf(this.b));
        a("stay", jSONObject);
    }
}
