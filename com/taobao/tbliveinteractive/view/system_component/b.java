package com.taobao.tbliveinteractive.view.system_component;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.business.intimacy.MtopTaobaoGiuliaIntimacyQueryLiveResponse;
import com.taobao.tbliveinteractive.business.intimacy.a;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import tb.ane;
import tb.ddv;
import tb.ddw;
import tb.hig;
import tb.kge;
import tb.pqj;
import tb.qmv;
import tb.qmz;
import tb.qne;
import tb.qnh;
import tb.tkg;
import tb.tki;
import tb.xkw;

@MemCheck(field = "mContext")
/* loaded from: classes8.dex */
public class b implements d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22178a;
    private a b;
    private ViewGroup c;
    private DXRootView d;
    private JSONObject e;
    private final String f;
    private Context g;
    private e h;
    private com.taobao.tbliveinteractive.b i;
    private boolean k;
    private String l;
    private Runnable m = new Runnable() { // from class: com.taobao.tbliveinteractive.view.system_component.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b bVar = b.this;
            b.a(bVar, b.a(bVar), "statusChange");
        }
    };
    private Runnable n = new Runnable() { // from class: com.taobao.tbliveinteractive.view.system_component.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.a(b.this, 3);
            }
        }
    };
    private com.taobao.tbliveinteractive.c o;

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : e.EVENTCENTER_BIZCODE;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public static /* synthetic */ Runnable a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("9bb0b02d", new Object[]{bVar}) : bVar.m;
    }

    public static /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97121dc", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.a(i);
        }
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c545c9", new Object[]{bVar, jSONObject});
        } else {
            bVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4858f", new Object[]{bVar, runnable, str});
        } else {
            bVar.a(runnable, str);
        }
    }

    static {
        kge.a(1839179779);
        kge.a(191318335);
        kge.a(-797454141);
        f22178a = b.class.getSimpleName();
    }

    public b(String str, Context context, e eVar, com.taobao.tbliveinteractive.b bVar, com.taobao.tbliveinteractive.c cVar) {
        this.f = str;
        this.g = context;
        this.h = eVar;
        this.i = bVar;
        this.o = cVar;
    }

    public ViewGroup a(ViewStub viewStub, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8febdadc", new Object[]{this, viewStub, viewGroup, new Boolean(z)});
        }
        this.k = z;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_room_interactive_system_component);
            try {
                this.c = (FrameLayout) viewStub.inflate();
                this.c.setVisibility(8);
            } catch (Exception unused) {
            }
        } else if (viewGroup == null) {
            return null;
        } else {
            this.c = viewGroup;
            this.c.setVisibility(8);
        }
        if (tki.a()) {
            e eVar = this.h;
            if (eVar != null) {
                a(eVar.r());
            }
        } else {
            c();
        }
        return this.c;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IntimacyParams b = this.h.o().b();
        this.b = new a(this);
        this.b.a(b, "");
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else if (!(aVar instanceof h)) {
        } else {
            h hVar = (h) aVar;
            if (hVar.O() == null) {
                return;
            }
            hVar.O().a(new b.a() { // from class: com.taobao.tbliveinteractive.view.system_component.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
                    JSONObject a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
                    } else if (unImportantLiveInfoResponseData == null || (a2 = tkg.a(unImportantLiveInfoResponseData.intimacyData)) == null) {
                    } else {
                        b.a(b.this, a2);
                    }
                }
            });
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.e = new JSONObject(jSONObject);
        ane a2 = this.h.r().z().K().a("taolive_intimacy_coin".hashCode());
        if (a2 != null && hig.a()) {
            this.d = a2.a();
        } else {
            this.d = qmz.a(this.h, this.g, "taolive_intimacy_coin");
        }
        DXRootView dXRootView = this.d;
        if (dXRootView != null) {
            this.c.addView(dXRootView);
            int a3 = com.taobao.taolive.room.utils.d.a(this.g, 3.0f);
            this.c.setPadding(a3, 0, a3, 0);
        }
        this.l = this.h.o().b().accountId;
        b();
        ddw.a().a(this);
    }

    public void a() {
        Runnable runnable;
        Runnable runnable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            jSONObject.clear();
            this.e = null;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null && (runnable2 = this.m) != null) {
            viewGroup.removeCallbacks(runnable2);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null && (runnable = this.n) != null) {
            viewGroup2.removeCallbacks(runnable);
            this.c.setVisibility(8);
            this.c.removeAllViews();
            if (this.d != null && hig.a()) {
                this.h.r().z().K().a(new ane(this.d));
                this.c.removeView(this.d);
            }
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
        }
        this.o = null;
    }

    private void a(Runnable runnable, String str) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6098f30", new Object[]{this, runnable, str});
        } else if (this.e == null || (viewGroup = this.c) == null) {
        } else {
            viewGroup.removeCallbacks(runnable);
            this.e.remove(str);
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(this.h.o().b().follow);
        }
    }

    private void a(boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.d == null || (jSONObject = this.e) == null) {
        } else {
            jSONObject.put("noFollow", (Object) true);
            this.e.put("follow", (Object) Boolean.valueOf(z));
            this.e.put("enableNewMixLiveTopUI", (Object) Boolean.valueOf(qne.j()));
            qmz.a(this.h, this.d, new JSONObject(this.e), this.f);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("dataIntimacyCoin", this.e.toJSONString());
            hashMap.put("name", "intimacyCoinNative");
            qnh.a(this.h, "Show-intimate-bean", hashMap);
            com.taobao.tbliveinteractive.c cVar = this.o;
            if (cVar == null) {
                return;
            }
            cVar.b(null, hashMap);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2008943835:
                if (str.equals("com.taobao.taolive.room.dxmanager.event")) {
                    c = 3;
                    break;
                }
                break;
            case -1815430857:
                if (str.equals(xkw.EVENT_GET_FOLLOW_STATUS)) {
                    c = 2;
                    break;
                }
                break;
            case -830550742:
                if (str.equals(xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                    c = 0;
                    break;
                }
                break;
            case -554098287:
                if (str.equals(xkw.EVENT_ACTION_FOLLOW)) {
                    c = 1;
                    break;
                }
                break;
            case 785376962:
                if (str.equals("com.taobao.taolive.room.component.intimacy.update")) {
                    c = 4;
                    break;
                }
                break;
            case 1146938483:
                if (str.equals("com.taobao.taolive.room.interactive_component_load_complete")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            if (!(obj instanceof String) || !TextUtils.equals(this.l, (String) obj)) {
                return;
            }
            a(true);
        } else if (c == 2) {
            if (!(obj instanceof Boolean)) {
                return;
            }
            a(((Boolean) obj).booleanValue());
        } else if (c != 3) {
            if (c == 4) {
                if (!(obj instanceof String)) {
                    return;
                }
                this.e = pqj.b((String) obj);
                b();
            } else if (c != 5 || !(obj instanceof InteractiveComponent) || !qne.b(((InteractiveComponent) obj).fedName) || (viewGroup = this.c) == null) {
            } else {
                viewGroup.removeCallbacks(this.n);
                this.c.postDelayed(this.n, 1000L);
            }
        } else if (!(obj instanceof qmv.a)) {
        } else {
            qmv.a aVar = (qmv.a) obj;
            if (aVar.f32947a == null || aVar.f32947a.length < 2 || !"intimacy_coin_entry_click".equals(aVar.f32947a[1])) {
                return;
            }
            a(2);
            e eVar = this.h;
            String[] strArr = new String[1];
            JSONObject jSONObject = this.e;
            strArr[0] = jSONObject != null ? jSONObject.toJSONString() : "";
            qnh.a(eVar, "intimate-bean", strArr);
        }
    }

    private void a(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.e);
        hashMap.put("isLandscape", Boolean.valueOf(this.k));
        hashMap.put("status", Integer.valueOf(i));
        com.taobao.tbliveinteractive.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        if (i == 2) {
            bVar.g(qne.g(), hashMap);
        } else if (i != 3 || (jSONObject = this.e) == null || jSONObject.isEmpty()) {
        } else {
            this.i.i(qne.f(), hashMap);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, xkw.EVENT_ACTION_FOLLOW, xkw.EVENT_GET_FOLLOW_STATUS, "com.taobao.taolive.room.dxmanager.event", "com.taobao.taolive.room.component.intimacy.update", "com.taobao.taolive.room.interactive_component_load_complete"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.f;
    }

    public void a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e = pqj.b(str);
        String string = this.e.getString("currentLevel");
        if (!TextUtils.isEmpty(string)) {
            this.h.o().a(string);
        }
        JSONObject jSONObject2 = this.e.getJSONObject("intimacyCoin");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("point", (Object) jSONObject2.getString("addition"));
            jSONObject3.put(BaseMnnRunUnit.KEY_TASK_NAME, (Object) jSONObject2.getString("actionName"));
            this.e.put("statusChange", (Object) jSONObject3);
        }
        b();
        if (this.m == null || this.c == null || (jSONObject = this.e) == null || !jSONObject.containsKey("statusChange")) {
            return;
        }
        this.c.removeCallbacks(this.m);
        this.c.postDelayed(this.m, 3000L);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (!(netBaseOutDo instanceof MtopTaobaoGiuliaIntimacyQueryLiveResponse)) {
        } else {
            a(((MtopTaobaoGiuliaIntimacyQueryLiveResponse) netBaseOutDo).mo1437getData());
        }
    }
}
