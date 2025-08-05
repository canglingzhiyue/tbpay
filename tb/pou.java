package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.media.MediaConstant;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.media.request.UrlListResponse;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.s;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.pos;

/* loaded from: classes8.dex */
public class pou implements d, IMediaPlayer.b, IMediaPlayer.g, pos {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL = "KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL";
    public static final String KEY_LAST_AUTO_SWITCH_WHEN_MANUAL = "KEY_LAST_AUTO_SWITCH_WHEN_MANUAL";
    public static final String NEW_DEFINITION = "NEW_DEFINITION";
    public static final int REASON_AUTO = 1;
    public static final int REASON_USER_RECOM = 2;
    public static final int REASON_USER_SWITCH = 0;
    public static final String SWITCH_MODE = "SWITCH_MODE";
    public static final int SWITCH_MODE_AUTO = 1;
    public static final int SWITCH_MODE_NOT_AUTO = 2;
    public static final String TAG;
    private String b;
    private String e;
    private String f;
    private String g;
    private String h;
    private Context k;
    private IMediaPlayer m;
    private pos.a p;
    private a q;
    private Object r;

    /* renamed from: a  reason: collision with root package name */
    private int f32788a = 1;
    private List<s> c = null;
    private boolean d = false;
    private ArrayList<String> i = new ArrayList<>();
    private boolean j = false;
    private com.taobao.taolive.sdk.business.media.request.a l = null;
    private List<pos.c> n = new ArrayList();
    private List<pos.b> o = new ArrayList();

    static {
        kge.a(-183251667);
        kge.a(-449281332);
        kge.a(961736582);
        kge.a(-797454141);
        kge.a(-1562152594);
        TAG = pou.class.getSimpleName();
    }

    public pou(Context context, String str, a aVar) {
        this.k = context;
        this.e = str;
        this.q = aVar;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f32788a = ad.b(SWITCH_MODE, 1);
        this.b = ad.a(NEW_DEFINITION);
        String str = TAG;
        n.a(str, "init mSwitchMode = " + this.f32788a + " mNewDefinition = " + this.b + " mLiveContextKey = " + this.e);
    }

    @Override // tb.ppm
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = TAG;
        n.a(str, "unInit mLiveContextKey = " + this.e);
        pov.a();
        com.taobao.taolive.sdk.business.media.request.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        IMediaPlayer iMediaPlayer = this.m;
        if (iMediaPlayer != null) {
            iMediaPlayer.a((IMediaPlayer.b) null);
        }
        List<pos.c> list = this.n;
        if (list != null) {
            list.clear();
        }
        List<pos.b> list2 = this.o;
        if (list2 != null) {
            list2.clear();
        }
        this.p = null;
        this.j = false;
        this.d = false;
    }

    @Override // tb.pos
    public void a(IMediaPlayer iMediaPlayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb58c0b6", new Object[]{this, iMediaPlayer, new Boolean(z)});
            return;
        }
        String str = TAG;
        n.a(str, "initStreamChooseInfoWithPlayer mLiveContextKey = " + this.e);
        if (iMediaPlayer == null) {
            String str2 = TAG;
            n.a(str2, "initStreamChooseInfoWithPlayer mediaPlayController = null mLiveContextKey = " + this.e);
            return;
        }
        this.m = iMediaPlayer;
        if (z) {
            a(iMediaPlayer, "hd");
            iMediaPlayer.o(true);
        } else if (this.f32788a == 1) {
            a(iMediaPlayer, "auto");
            iMediaPlayer.o(true);
        } else {
            if (!TextUtils.isEmpty(this.b)) {
                a(iMediaPlayer, this.b);
            }
            iMediaPlayer.o(false);
        }
        a(iMediaPlayer);
        iMediaPlayer.a((IMediaPlayer.g) this);
        iMediaPlayer.a((IMediaPlayer.b) this);
        if (!this.j) {
            return;
        }
        k();
    }

    @Override // tb.pos
    public void a(String str, pos.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b64472f", new Object[]{this, str, cVar});
            return;
        }
        String str2 = TAG;
        n.a(str2, "updateUrlList mLiveContextKey = " + this.e);
        this.l = new com.taobao.taolive.sdk.business.media.request.a(this);
        this.l.a(str);
        List<pos.c> list = this.n;
        if (list == null || list.contains(cVar)) {
            return;
        }
        this.n.add(cVar);
    }

    @Override // tb.pos
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = TAG;
        n.a(str, "notifyFirstFrame mLiveContextKey = " + this.e);
        this.j = true;
        k();
    }

    @Override // tb.pos
    public void a(pos.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c401be5", new Object[]{this, cVar});
            return;
        }
        List<pos.c> list = this.n;
        if (list == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // tb.pos
    public void a(pos.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3fa786", new Object[]{this, bVar});
            return;
        }
        List<pos.b> list = this.o;
        if (list == null || list.contains(bVar)) {
            return;
        }
        this.o.add(bVar);
    }

    @Override // tb.pos
    public void b(pos.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61b11c7", new Object[]{this, bVar});
            return;
        }
        List<pos.b> list = this.o;
        if (list == null) {
            return;
        }
        list.remove(bVar);
    }

    @Override // tb.pos
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = TAG;
        n.a(str2, "saveNewDefinition newDefinition = " + str + " mLiveContextKey = " + this.e);
        if (str == null || str.equals(this.b)) {
            return;
        }
        String str3 = TAG;
        n.a(str3, "saveNewDefinition success newDefinition = " + str + " mLiveContextKey = " + this.e);
        this.d = true;
        this.b = str;
        IMediaPlayer iMediaPlayer = this.m;
        if (iMediaPlayer != null) {
            iMediaPlayer.a(i, this.b);
        }
        if (i == 1) {
            return;
        }
        ad.a(NEW_DEFINITION, str);
    }

    @Override // tb.pos
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        n.a(str, "saveSwitchMode switchMode = " + i + " mLiveContextKey = " + this.e);
        this.f32788a = i;
        ad.a(SWITCH_MODE, i);
        IMediaPlayer iMediaPlayer = this.m;
        if (iMediaPlayer == null) {
            return;
        }
        if (this.f32788a == 1) {
            iMediaPlayer.o(true);
        } else {
            iMediaPlayer.o(false);
        }
    }

    @Override // tb.pos
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f32788a;
    }

    @Override // tb.pos
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.pos
    public void a(pos.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3f3327", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    @Override // tb.pos
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.p = null;
        }
    }

    @Override // tb.pos
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.pos
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // tb.pos
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (!u.aC()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.i.size(); i++) {
            sb.append(this.i.get(i));
            if (i < this.i.size() - 1) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    @Override // tb.pos
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.r = obj;
        }
    }

    @Override // tb.pos
    public HashMap<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("liveid", this.f);
        hashMap.put("livesource", this.g);
        hashMap.put("entryLiveSource", this.h);
        IMediaPlayer iMediaPlayer = this.m;
        if (iMediaPlayer != null) {
            hashMap.put("width", String.valueOf(iMediaPlayer.j()));
            hashMap.put("height", String.valueOf(this.m.k()));
        }
        return hashMap;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        String str = TAG;
        n.a(str, "updateUrlList onSuccess mLiveContextKey = " + this.e);
        if (this.m == null) {
            return;
        }
        List<MediaData.QualityLiveItem> a2 = a(netBaseOutDo);
        if (a2 != null && !a2.isEmpty()) {
            this.m.a(a2);
        }
        List<s> n = this.m.n(true);
        this.c = new ArrayList();
        s sVar = null;
        if (n != null) {
            for (int i2 = 0; i2 < n.size(); i2++) {
                if (n.get(i2) != null && n.get(i2).a()) {
                    this.c.add(n.get(i2));
                    if (n.get(i2).e) {
                        this.b = n.get(i2).b;
                        sVar = n.get(i2);
                    }
                }
            }
        }
        if (sVar == null) {
            i();
        }
        List<pos.c> list = this.n;
        if (list == null) {
            return;
        }
        for (pos.c cVar : list) {
            cVar.onUpdateUrlListSuccess(this.c);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = TAG;
        n.a(str, "updateUrlList onError mLiveContextKey = " + this.e);
        if (this.m == null) {
            return;
        }
        i();
        List<pos.c> list = this.n;
        if (list == null) {
            return;
        }
        for (pos.c cVar : list) {
            cVar.onUpdateUrlListError(this.c);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = TAG;
        n.a(str, "updateUrlList onSystemError mLiveContextKey = " + this.e);
        if (this.m == null) {
            return;
        }
        i();
        List<pos.c> list = this.n;
        if (list == null) {
            return;
        }
        for (pos.c cVar : list) {
            cVar.onUpdateUrlListError(this.c);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        String str = TAG;
        n.a(str, "onSwitchedToDefinition mLiveContextKey = " + this.e);
        this.d = false;
        if (hashMap == null || hashMap.get(com.taobao.mtop.wvplugin.a.RESULT_KEY) == null) {
            return;
        }
        String str2 = hashMap.get(com.taobao.mtop.wvplugin.a.RESULT_KEY);
        String str3 = hashMap.get("reason");
        if (str2 == null || str3 == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(str2);
            int parseInt2 = Integer.parseInt(str3);
            String str4 = TAG;
            n.a(str4, "onSwitchedToDefinition ret mLiveContextKey = " + this.e + " isSwitching = " + this.d + " ret = " + parseInt + " reason = " + parseInt2);
            a(parseInt, parseInt2);
            b(hashMap);
            if (parseInt == -1) {
                if (parseInt2 == 0 && this.k != null) {
                    pov.a(this.k.getApplicationContext(), "清晰度切换失败");
                }
                j();
                if (parseInt2 != 1) {
                    ad.a(NEW_DEFINITION, this.b);
                }
                if (this.o == null) {
                    return;
                }
                for (pos.b bVar : this.o) {
                    bVar.onSwitchNewDefinitionError(this.m.C(), parseInt2);
                }
                return;
            }
            if (parseInt2 == 2 && this.k != null) {
                pov.a(this.k.getApplicationContext(), "切换成功");
            }
            k();
            if (this.o == null) {
                return;
            }
            for (pos.b bVar2 : this.o) {
                bVar2.onSwitchNewDefinitionSuccess(this.m.C(), parseInt2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        int i = (int) j;
        if (i == 12001) {
            a(iMediaPlayer, j2, obj);
        } else if (i == 12003) {
            b(iMediaPlayer, j2, obj);
        }
        return false;
    }

    private void a(IMediaPlayer iMediaPlayer, long j, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417ed702", new Object[]{this, iMediaPlayer, new Long(j), obj});
            return;
        }
        String str = TAG;
        n.a(str, "handleInfo12001 mLiveContextKey = " + this.e);
        if (!(obj instanceof Map)) {
            return;
        }
        Map map = (Map) obj;
        if (j != 1) {
            z = false;
        }
        String str2 = null;
        String valueOf = map.containsKey("recomDefinition") ? String.valueOf(map.get("recomDefinition")) : null;
        String valueOf2 = map.containsKey("recomDefinitionName") ? String.valueOf(map.get("recomDefinitionName")) : null;
        String valueOf3 = map.containsKey("currentDefinition") ? String.valueOf(map.get("currentDefinition")) : null;
        if (map.containsKey("currentDefinitionName")) {
            str2 = String.valueOf(map.get("currentDefinitionName"));
        }
        if (p.d() && valueOf3 != null) {
            this.b = valueOf3;
        }
        String str3 = TAG;
        n.a(str3, "handleInfo12001 recomDefinition = " + valueOf + " recomDefinitionName = " + valueOf2 + " currentDefinition = " + valueOf3 + " currentDefinitionName = " + str2 + " isUp = " + z);
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        a(iMediaPlayer, valueOf, z);
    }

    private void b(IMediaPlayer iMediaPlayer, long j, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5f37a1", new Object[]{this, iMediaPlayer, new Long(j), obj});
            return;
        }
        String str = TAG;
        n.a(str, "handleInfo12003 mLiveContextKey = " + this.e);
        if (!(obj instanceof Map)) {
            return;
        }
        Map map = (Map) obj;
        if (j != 1) {
            z = false;
        }
        String str2 = null;
        String valueOf = map.containsKey("recomDefinition") ? String.valueOf(map.get("recomDefinition")) : null;
        String valueOf2 = map.containsKey("recomDefinitionName") ? String.valueOf(map.get("recomDefinitionName")) : null;
        String valueOf3 = map.containsKey("currentDefinition") ? String.valueOf(map.get("currentDefinition")) : null;
        if (map.containsKey("currentDefinitionName")) {
            str2 = String.valueOf(map.get("currentDefinitionName"));
        }
        if (valueOf3 != null) {
            this.b = valueOf3;
        }
        String str3 = TAG;
        n.a(str3, "handleInfo12003 recomDefinition = " + valueOf + " recomDefinitionName = " + valueOf2 + " currentDefinition = " + valueOf3 + " currentDefinitionName = " + str2 + " isUp = " + z);
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        d(valueOf);
    }

    private void a(IMediaPlayer iMediaPlayer, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e299dbac", new Object[]{this, iMediaPlayer, str, new Boolean(z)});
        } else if (this.f32788a == 1) {
            if (!u.ay()) {
                return;
            }
            a(1, str);
            a(str, "auto");
        } else if (!z) {
            if (p.k()) {
                String str2 = TAG;
                n.a(str2, "trySwitchNewDivination autoSwitchStreamWhenManual mLiveContextKey = " + this.e);
                if (System.currentTimeMillis() - ad.b(KEY_LAST_AUTO_SWITCH_WHEN_MANUAL) > p.m()) {
                    ad.a(KEY_LAST_AUTO_SWITCH_WHEN_MANUAL, System.currentTimeMillis());
                    a(1);
                    Context context = this.k;
                    if (context != null) {
                        Toast.makeText(context.getApplicationContext(), "网络卡顿，已自动调整清晰度", 1).show();
                    }
                    if (System.currentTimeMillis() - ad.b(KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL) > p.n()) {
                        ad.a(KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL, System.currentTimeMillis());
                        pos.a aVar = this.p;
                        if (aVar != null) {
                            aVar.a(this.e);
                        }
                    }
                }
            } else if (u.ax()) {
                String str3 = TAG;
                n.a(str3, "trySwitchNewDivination onShowAskSwitchDialog mLiveContextKey = " + this.e);
                pos.a aVar2 = this.p;
                if (aVar2 != null) {
                    aVar2.a(this.e, str);
                }
            }
            a(str, BizTaskData.MANUAL_TIME);
        } else {
            String str4 = TAG;
            n.a(str4, "trySwitchNewDivination isUp = " + z + " mLiveContextKey = " + this.e);
        }
    }

    private void a(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b25c28", new Object[]{this, iMediaPlayer, str});
        } else if (iMediaPlayer == null) {
            String str2 = TAG;
            n.a(str2, "initDefinition mediaPlayController = null mLiveContextKey = " + this.e);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("initDefinition", str);
            iMediaPlayer.a((Map<String, String>) hashMap);
        }
    }

    private void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer == null) {
            String str = TAG;
            n.a(str, "setLiveMode mediaPlayController = null mLiveContextKey = " + this.e);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enAdaptiveLiveSwitch", "1");
            iMediaPlayer.a((Map<String, String>) hashMap);
        }
    }

    private List<MediaData.QualityLiveItem> a(NetBaseOutDo netBaseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("58174b83", new Object[]{this, netBaseOutDo});
        }
        if (!(netBaseOutDo instanceof UrlListResponse)) {
            return null;
        }
        return ((UrlListResponse) netBaseOutDo).mo1437getData().liveUrlList;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        s j = j();
        List<s> list = this.c;
        if (list != null) {
            list.clear();
        } else {
            this.c = new ArrayList();
        }
        if (!j.b()) {
            return;
        }
        this.c.add(j);
    }

    private s j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("7d90390c", new Object[]{this});
        }
        s C = this.m.C();
        if (C == null || !C.b()) {
            C = new s();
            C.e = true;
            C.c = "高清";
            C.d = MediaConstant.DEFINITION_MD;
        }
        if (C.a()) {
            this.b = C.b;
        } else {
            this.b = C.d;
        }
        String str = TAG;
        n.a(str, "setCurSafeDefinition mNewDefinition = " + this.b + " mLiveContextKey = " + this.e);
        return C;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!u.aC()) {
        } else {
            HashMap<String, String> e = e();
            e.put("definition", str);
            e.put("type", str2);
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().b("Page_TaobaoLiveWatch", "Show-WeakNetworkTips", e);
        }
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!u.aC()) {
        } else {
            String str = this.b;
            if (i2 == 1) {
                i3 = 1;
            }
            String str2 = i == -1 ? "failed" : "success";
            String str3 = this.f32788a == 1 ? "auto" : BizTaskData.MANUAL_TIME;
            if (i2 == 0) {
                a(str, i3, str2);
            } else {
                a(str, str3, str2);
            }
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap<String, String> e = e();
        e.put("definition", str);
        e.put("type", str2);
        e.put("result", str3);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", "Button-WeakNetworkSwitched", e);
    }

    private void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        HashMap<String, String> e = e();
        e.put("definition", str);
        e.put("isAutoMode", String.valueOf(i));
        e.put("result", str2);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", "Button-DefinitionSwitched", e);
    }

    private void k() {
        IMediaPlayer iMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!u.aC() || (iMediaPlayer = this.m) == null) {
        } else {
            int j = iMediaPlayer.j();
            int k = this.m.k();
            ArrayList<String> arrayList = this.i;
            arrayList.add(j + "*" + k);
            HashMap hashMap = new HashMap();
            hashMap.put("definition", h());
            Object obj = this.r;
            if (obj != null) {
                com.taobao.taolive.sdk.core.a.a(this.q, obj, hashMap);
            } else {
                com.taobao.taolive.sdk.core.a.a(this.q, this.k, hashMap);
            }
        }
    }

    private void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        String str = hashMap.get("autoSwitch");
        if (str == null) {
            return;
        }
        if (l.a(str) == 1) {
            z = true;
        }
        if (z && this.f32788a == 1) {
            String str2 = TAG;
            n.a(str2, "check right autoSwitch = true mLiveContextKey = " + this.e + " mSwitchMode = " + this.f32788a);
        } else if (!z && this.f32788a != 1) {
            String str3 = TAG;
            n.a(str3, "check right autoSwitch = false mLiveContextKey = " + this.e + " mSwitchMode = " + this.f32788a);
        } else {
            String str4 = TAG;
            n.a(str4, "check wrong autoSwitch = " + z + " mLiveContextKey = " + this.e + " mSwitchMode = " + this.f32788a);
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        n.a(str2, "adapterAutoSwitch newDefinition = " + str + " mLiveContextKey = " + this.e);
        this.d = true;
        this.b = str;
    }
}
