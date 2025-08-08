package tb;

import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.Map;
import tb.hua;

/* loaded from: classes6.dex */
public class htz extends hua {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_TBMiniLive";
    private static final String h;
    private static HashMap<String, String> p;
    private String i;
    private String j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private String o;
    private pnr q;

    public static /* synthetic */ Object ipc$super(htz htzVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 467600993:
                super.a((TLiveMsg) objArr[0]);
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ String a(htz htzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c63862b6", new Object[]{htzVar}) : htzVar.o;
    }

    public static /* synthetic */ boolean a(htz htzVar, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7eba5363", new Object[]{htzVar, tLiveMsg})).booleanValue() : htzVar.c(tLiveMsg);
    }

    static {
        kge.a(240105189);
        kge.a(-735385134);
        kge.a(-1192303951);
        h = htz.class.getSimpleName();
        p = new HashMap<>();
    }

    private boolean c(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77903b23", new Object[]{this, tLiveMsg})).booleanValue() : tLiveMsg.type == 10086 || tLiveMsg.type == 10101 || tLiveMsg.type == 10102;
    }

    public htz(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, hua.a aVar) {
        super(i, str, z, z2, aVar);
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = "TBLiveMSG";
        this.q = new pnr() { // from class: tb.htz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnr
            public void a(TLiveMsg tLiveMsg) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
                    return;
                }
                if (!htz.this.e) {
                    htz.this.b(tLiveMsg);
                }
                if (pmd.a().e() == null || !u.p() || tLiveMsg == null || !htz.a(htz.this, tLiveMsg)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("topic", tLiveMsg.topic);
                hashMap.put("messageId", tLiveMsg.messageId);
                hashMap.put("msgType", String.valueOf(tLiveMsg.type));
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, htz.this.f);
                hashMap.put("timestamp", String.valueOf(tLiveMsg.timestamp));
                hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : "");
                pmd.a().e().a(htz.UT_PAGE_NAME, "PM_onDispatch", hashMap);
                if (10101 != tLiveMsg.type) {
                    return;
                }
                htz.a(htz.this);
            }

            @Override // tb.pnr
            public void a(int i2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i2), obj});
                    return;
                }
                htz.a(htz.this);
                if (i2 != -3006) {
                    return;
                }
                if (htz.this.b == null) {
                    htz htzVar = htz.this;
                    htzVar.b = new f(htzVar);
                }
                htz.this.b.obtainMessage(1003).sendToTarget();
            }
        };
        this.i = str;
        this.j = str2;
        this.n = z3;
        this.d = z4;
    }

    @Override // tb.hua
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
        } else if (StringUtils.isEmpty(tLiveMsg.topic) || !StringUtils.equals(tLiveMsg.topic, this.i) || this.m) {
            if (StringUtils.equals(tLiveMsg.topic, this.i)) {
                return;
            }
            pmd.a().h().a(1, tLiveMsg, 502);
        } else {
            if (tLiveMsg.type == 10181) {
                tLiveMsg.type = 10101;
            }
            super.a(tLiveMsg);
        }
    }

    @Override // tb.hua
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        pnk q = pmd.a().q();
        String str = "";
        String b = q != null ? q.b() : str;
        if (!u.t()) {
            return;
        }
        pmd.a().h().a(1, this.i, this.n ? 4 : 3);
        pnq pnqVar = new pnq() { // from class: tb.htz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                    return;
                }
                htz.a(htz.this);
                if (htz.this.b == null) {
                    htz htzVar = htz.this;
                    htzVar.b = new f(htzVar);
                }
                Message obtainMessage = htz.this.b.obtainMessage(1001);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
            }
        };
        if (!StringUtils.isEmpty(this.j)) {
            pmd.a().h().a(1, this.i, this.j, b, "tb", pnqVar, new Object[0]);
        } else {
            pmd.a().h().a(1, this.i, b, "tb", pnqVar, new Object[0]);
        }
        if (pmd.a().e() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic", this.i);
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.f);
            hashMap.put("status", "1");
            if (pmd.a().q() != null) {
                str = pmd.a().q().a();
            }
            hashMap.put("userId", str);
            pmd.a().e().a(UT_PAGE_NAME, "PM_subscribe", hashMap);
        }
        p.put(this.i, toString());
    }

    @Override // tb.hua
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (!toString().equals(p.get(this.i))) {
            return;
        }
        p.remove(this.i);
        if (!u.t()) {
            return;
        }
        pnk q = pmd.a().q();
        String str = "";
        String b = q != null ? q.b() : str;
        pnq pnqVar = new pnq() { // from class: tb.htz.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                    return;
                }
                if (htz.this.b == null) {
                    htz htzVar = htz.this;
                    htzVar.b = new f(htzVar);
                }
                Message obtainMessage = htz.this.b.obtainMessage(1002);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
            }
        };
        if (!StringUtils.isEmpty(this.j)) {
            pmd.a().h().b(1, this.i, this.j, b, "tb", pnqVar, new Object[0]);
        } else {
            pmd.a().h().b(1, this.i, b, "tb", pnqVar, new Object[0]);
        }
        if (pmd.a().e() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("topic", this.i);
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.f);
        if (pmd.a().q() != null) {
            str = pmd.a().q().a();
        }
        hashMap.put("userId", str);
        pmd.a().e().a(UT_PAGE_NAME, "PM_unsubscribe", hashMap);
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            e();
        } else {
            a(i);
        }
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
        } else {
            b(i);
        }
    }

    @Override // tb.hua
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (!u.t()) {
            return;
        }
        if (!StringUtils.isEmpty(this.j)) {
            pmd.a().h().a(1, this.j, this.q);
        } else {
            pmd.a().h().a(1, (String) null, this.q);
        }
    }

    @Override // tb.hua
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        if (!u.t()) {
            return;
        }
        if (!StringUtils.isEmpty(this.j)) {
            if (!u.q()) {
                return;
            }
            pmd.a().h().a(1, this.j, (pnr) null);
        } else if (!u.q()) {
        } else {
            pmd.a().h().a(1, (String) null, (pnr) null);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f28784a == null) {
        } else {
            this.f28784a.a(1005, 0);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.k;
        if (i2 < 3) {
            this.k = i2 + 1;
            a();
            return;
        }
        if (this.f28784a != null) {
            this.f28784a.a(100000, 0);
        }
        this.k = 0;
    }

    @Override // tb.hua, com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        switch (message.what) {
            case 1001:
                c(message.arg1);
                break;
            case 1002:
                d(message.arg1);
                break;
            case 1003:
                if (this.f28784a != null) {
                    this.f28784a.a(1027, null);
                    break;
                }
                break;
            case 1004:
                if (this.f28784a != null) {
                    this.f28784a.a(1029, message.obj);
                    break;
                }
                break;
        }
        super.handleMessage(message);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.l;
        if (i2 < 3) {
            this.l = i2 + 1;
            b();
            return;
        }
        this.l = 0;
    }
}
