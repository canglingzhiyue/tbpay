package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.a;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.sur;

/* loaded from: classes8.dex */
public class piq extends pgm<a> implements a.InterfaceC0818a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.tab2interact.core.component.browser.a f32692a;
    private ShortVideoTabMessageObserver c;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32696a;
        public ShortVideoTabMessageObserver.ContentType b;
        public boolean c = false;
        public long d;
        public boolean e;

        static {
            kge.a(2104764656);
        }
    }

    static {
        kge.a(1022221521);
        kge.a(2040405034);
    }

    public static /* synthetic */ Object ipc$super(piq piqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012643660:
                super.c((String) objArr[0]);
                return null;
            case -650670724:
                super.a((String) objArr[0], (String) objArr[1]);
                return null;
            case -227024002:
                super.c((String) objArr[0], (String) objArr[1]);
                return null;
            case 1708636285:
                super.b((String) objArr[0], (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(piq piqVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adabaa7a", new Object[]{piqVar, jSONObject, str});
        } else {
            piqVar.a(jSONObject, str);
        }
    }

    public static /* synthetic */ void a(piq piqVar, ShortVideoTabMessageObserver.VideoState videoState, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c5fc93", new Object[]{piqVar, videoState, str});
        } else {
            piqVar.a(videoState, str);
        }
    }

    public static /* synthetic */ void a(piq piqVar, String str, ShortVideoTabMessageObserver.ContentType contentType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f83c6de", new Object[]{piqVar, str, contentType, str2});
        } else {
            piqVar.a(str, contentType, str2);
        }
    }

    @Override // tb.pbu
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : i();
    }

    public piq(sus susVar, com.taobao.tab2interact.core.data.baseinfo.a aVar, est estVar, com.taobao.tab2interact.core.component.browser.a aVar2) {
        super(susVar, aVar, estVar);
        this.c = new ShortVideoTabMessageObserver() { // from class: tb.piq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 331403702) {
                    super.a((String) objArr[0], (ShortVideoTabMessageObserver.ContentType) objArr[1], (String) objArr[2]);
                    return null;
                } else if (hashCode != 986050747) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.a((ShortVideoTabMessageObserver.VideoState) objArr[0], (String) objArr[1]);
                    return null;
                }
            }

            @Override // com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver
            public void a(String str, ShortVideoTabMessageObserver.ContentType contentType, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("13c0d1b6", new Object[]{this, str, contentType, str2});
                    return;
                }
                super.a(str, contentType, str2);
                if (!skq.d()) {
                    return;
                }
                piq.a(piq.this, str, contentType, str2);
            }

            @Override // com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver
            public void a(ShortVideoTabMessageObserver.VideoState videoState, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3ac5f0bb", new Object[]{this, videoState, str});
                    return;
                }
                super.a(videoState, str);
                if (!skq.d()) {
                    return;
                }
                piq.a(piq.this, videoState, str);
            }
        };
        this.f32692a = aVar2;
        aVar2.a(this);
    }

    @Override // tb.pbu, tb.suv
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        super.c(str, str2);
        if (!a(str) || !this.f32692a.a(str)) {
            return;
        }
        g(str);
        i(str);
    }

    @Override // tb.suv
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        super.a(str, str2);
        if (!a(str) || !this.f32692a.a(str)) {
            return;
        }
        j();
    }

    @Override // tb.suv
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        super.b(str, str2);
        if (!a(str) || !this.f32692a.a(str)) {
            return;
        }
        j();
    }

    @Override // tb.pbu, tb.suv
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        super.c(str);
        if (!a(str) || !this.f32692a.a(str)) {
            return;
        }
        h(str);
    }

    private void a(String str, ShortVideoTabMessageObserver.ContentType contentType, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c0d1b6", new Object[]{this, str, contentType, str2});
            return;
        }
        a f = f(str2);
        if (f == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "处理当前Active卡片的数据，tabInfo为空");
            return;
        }
        f.f32696a = str;
        f.b = contentType;
        if (contentType == ShortVideoTabMessageObserver.ContentType.VIDEO) {
            z = false;
        }
        f.c = z;
        f.e = false;
        f.d = 0L;
        if (!j(str2)) {
            return;
        }
        if (f.c) {
            this.f32692a.K();
        }
        j();
        if (!o()) {
            return;
        }
        this.f32692a.h("ACTIVE_CARD_CHANGE_FAIL_RETRY");
    }

    private void a(ShortVideoTabMessageObserver.VideoState videoState, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac5f0bb", new Object[]{this, videoState, str});
            return;
        }
        a f = f(str);
        if (f == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "处理卡片的视频状态，tabInfo为空");
        } else if (videoState == ShortVideoTabMessageObserver.VideoState.START || videoState == ShortVideoTabMessageObserver.VideoState.PROGRESS_UPDATE) {
            f.c = true;
            if (!j(str) || f.e) {
                return;
            }
            this.f32692a.K();
        } else if (videoState == ShortVideoTabMessageObserver.VideoState.PAUSE) {
            f.c = false;
            if (!j(str)) {
                return;
            }
            this.f32692a.f(com.taobao.tab2interact.core.component.browser.a.PAUSE_ANIMATE_SCENE_VIDEO_PAUSED);
        } else if (videoState != ShortVideoTabMessageObserver.VideoState.PROGRESS_FINISH) {
        } else {
            f.e = true;
            if (!j(str)) {
                return;
            }
            this.f32692a.f(com.taobao.tab2interact.core.component.browser.a.PAUSE_ANIMATE_SCENE_VIDEO_FINISHED);
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.a.InterfaceC0818a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "组件开启的时机");
        a e = e();
        if (e == null || e.e || !e.c) {
            return;
        }
        this.f32692a.K();
    }

    @Override // com.taobao.tab2interact.core.component.browser.a.InterfaceC0818a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "组件暂停的时机");
        this.f32692a.f(com.taobao.tab2interact.core.component.browser.a.PAUSE_ANIMATE_SCENE_COMPONENT_STOPPED);
    }

    @Override // com.taobao.tab2interact.core.component.browser.a.InterfaceC0818a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "浏览任务进度获取的时机");
        a e = e();
        if (e == null || !e.c || e.e) {
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "浏览任务进度获取的时机，开启浏览任务计时器");
        this.f32692a.K();
    }

    @Override // com.taobao.tab2interact.core.component.browser.a.InterfaceC0818a
    public void a(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262808dc", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        a e = e();
        if (e != null && !e.e && a(j3)) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "浏览任务进度发生改变的时机，检查已达到最大浏览时长");
            e.e = true;
            this.f32692a.f(com.taobao.tab2interact.core.component.browser.a.PAUSE_ANIMATE_SCENE_MAX_TIMING_DURATION_REACHED);
        }
        long k = j - k();
        if (j2 <= j || b(k)) {
            this.f32692a.b(j, j2, k);
        } else if (l() || k < 50) {
        } else {
            if (skq.m() && StringUtils.equals(m(), com.taobao.tab2interact.core.component.browser.a.PAUSE_ANIMATE_SCENE_VIDEO_PAUSED)) {
                this.f32692a.a(j, j2, k, skq.n());
            } else {
                this.f32692a.b(j, j2, k);
            }
        }
    }

    private boolean a(long j) {
        BrowserBadgeModel.BrowserTaskModel browserTaskModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        BrowserBadgeModel n = n();
        if (n == null || (browserTaskModel = n.d) == null) {
            return true;
        }
        Map<BrowserBadgeModel.BrowserTaskModel.ContentType, BrowserBadgeModel.BrowserTaskModel.a> map = browserTaskModel.d;
        if (map == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "检查是否达到最大浏览时长，timingRuleModelMap为空");
            return true;
        }
        a e = e();
        if (e == null || e.b == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "检查是否达到最大浏览时长，tabInfo不满足条件");
            return true;
        }
        BrowserBadgeModel.BrowserTaskModel.ContentType contentType = null;
        switch (e.b) {
            case VIDEO:
                contentType = BrowserBadgeModel.BrowserTaskModel.ContentType.VIDEO;
                break;
            case LIVE:
                contentType = BrowserBadgeModel.BrowserTaskModel.ContentType.LIVE;
                break;
            case PICTURE_ALBUM:
                contentType = BrowserBadgeModel.BrowserTaskModel.ContentType.PICTURE_ALBUM;
                break;
            case GG_GAME:
                contentType = BrowserBadgeModel.BrowserTaskModel.ContentType.GG_GAME;
                break;
            case COLLECTION:
                contentType = BrowserBadgeModel.BrowserTaskModel.ContentType.COLLECTION;
                break;
            case EXT:
                contentType = BrowserBadgeModel.BrowserTaskModel.ContentType.EXT;
                break;
        }
        BrowserBadgeModel.BrowserTaskModel.a aVar = map.get(contentType);
        if (aVar == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeShortVideoTabAdapter", "检查是否达到最大浏览时长，timingRuleModel为空");
            return true;
        }
        e.d += j;
        return aVar.f19736a >= 0 && aVar.f19736a <= e.d;
    }

    private boolean b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66fff", new Object[]{this, new Long(j)})).booleanValue();
        }
        BrowserBadgeModel n = n();
        return (n == null || n.d == null || n.d.c > j) ? false : true;
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(suz.CARD_DATA_CHANGE_NAME);
        arrayList.add(suz.VIDEO_STATE_CHANGE_NAME);
        sva.INSTANCE.a(f(), g(), str, arrayList, this.c, h());
    }

    private void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            sva.INSTANCE.a(f(), g(), str, this.c, h());
        }
    }

    private void i(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) suz.GET_CARD_DATA_NAME);
        sva.INSTANCE.a(g(), jSONObject, str, new sur.a() { // from class: tb.piq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sur.a
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                } else {
                    piq.a(piq.this, jSONObject2, str);
                }
            }
        }, h());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r11.equals("VIDEO") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alibaba.fastjson.JSONObject r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.piq.a(com.alibaba.fastjson.JSONObject, java.lang.String):void");
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        String d = g().d();
        if (StringUtils.equals(d, "video")) {
            hashMap.put("x_tab_source", "recommend");
        } else if (StringUtils.equals(d, "newFollow")) {
            hashMap.put("x_tab_source", "follow");
        }
        a e = e();
        if (e != null) {
            hashMap.put("x_content_id", e.f32696a);
        }
        this.f32692a.b(hashMap);
    }

    private long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.f32692a.N();
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.f32692a.O();
    }

    private String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.f32692a.P();
    }

    private BrowserBadgeModel n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BrowserBadgeModel) ipChange.ipc$dispatch("f798015d", new Object[]{this}) : this.f32692a.Q();
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.f32692a.U();
    }

    private boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f64af7f", new Object[]{this, str})).booleanValue();
        }
        String d = g().d();
        return d != null && StringUtils.equals(str, d);
    }

    public a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("80479fa1", new Object[]{this}) : new a();
    }
}
