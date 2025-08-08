package tb;

import android.content.Context;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.movehighlight.utils.m;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class pfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VideoInfo f32592a;
    public a b;
    private TBLiveDataModel c;
    private Context d;
    private DXRootView e;
    private com.taobao.alilive.aliliveframework.frame.a f;
    private String g;
    private long h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(String str, String str2);
    }

    static {
        kge.a(1139828700);
    }

    public static /* synthetic */ TBLiveDataModel a(pfm pfmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("9bcc65ee", new Object[]{pfmVar}) : pfmVar.c;
    }

    public static /* synthetic */ void a(pfm pfmVar, boolean z, JSONObject jSONObject, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e7b348", new Object[]{pfmVar, new Boolean(z), jSONObject, aVar});
        } else {
            pfmVar.a(z, jSONObject, aVar);
        }
    }

    public static /* synthetic */ Context b(pfm pfmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b4015dba", new Object[]{pfmVar}) : pfmVar.d;
    }

    public static /* synthetic */ void c(pfm pfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d689ab43", new Object[]{pfmVar});
        } else {
            pfmVar.c();
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a d(pfm pfmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("f308a279", new Object[]{pfmVar}) : pfmVar.f;
    }

    public pfm(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, Context context, DXRootView dXRootView) {
        this.c = tBLiveDataModel;
        this.d = context;
        this.e = dXRootView;
        this.f = aVar;
        a();
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        VideoInfo videoInfo = this.f32592a;
        if (videoInfo != null) {
            jSONObject.put("goodsNumber", (Object) String.valueOf(videoInfo.curItemNum));
            if (this.f32592a.timeMovingPlayInfo != null && !StringUtils.isEmpty(this.f32592a.timeMovingPlayInfo.liveGuideTxt)) {
                jSONObject.put("liveGuideTxt", (Object) this.f32592a.timeMovingPlayInfo.liveGuideTxt);
            } else {
                jSONObject.put("liveGuideTxt", "直播间抢购中");
            }
            jSONObject.put("enableMuteAbility", (Object) Boolean.valueOf(sst.b(this.f)));
            boolean z = this.f32592a.latestPreUserSubscribe;
            if (c.D() && this.f32592a.curPreLiveInfo != null) {
                z = this.f32592a.curPreLiveInfo.curPreUserSubscribe;
            }
            a(z, jSONObject, this.f);
            b(jSONObject);
        }
        return jSONObject;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h = System.currentTimeMillis();
        this.f32592a = k.a(this.c);
        if (this.f32592a == null) {
            return;
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        pfb.a(this.f).a(new com.taobao.taolive.movehighlight.bundle.dxbottomBar.a() { // from class: tb.pfm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.movehighlight.bundle.dxbottomBar.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (pfm.a(pfm.this) != null && pfm.a(pfm.this).mInitParams != null && pfm.b(pfm.this) != null) {
                    if ("livePointTab3".equals(pfm.a(pfm.this).mInitParams.get("livePointTab3")) && c.v()) {
                        String str = pfm.a(pfm.this).mInitParams.get("shop2fSkipTab3Url");
                        if (StringUtils.isEmpty(str)) {
                            return;
                        }
                        s.a(pfm.b(pfm.this), str);
                        return;
                    }
                    pfm.c(pfm.this);
                } else {
                    pfm.c(pfm.this);
                }
            }

            @Override // com.taobao.taolive.movehighlight.bundle.dxbottomBar.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (pfm.this.f32592a == null) {
                } else {
                    if (c.D() && pfm.this.f32592a.curPreLiveInfo != null) {
                        if (pfm.this.f32592a != null && pfm.this.f32592a.curPreLiveInfo != null && pfm.this.f32592a.broadCaster != null) {
                            poa z = pmd.a().z();
                            String str = pfm.this.f32592a.curPreLiveInfo.curPreLiveId;
                            Context b2 = pfm.b(pfm.this);
                            pfm pfmVar = pfm.this;
                            z.b(str, "tblive_siyu", "taoLiveStartNotify", b2, new b(pfmVar.f32592a.curPreLiveInfo.curPreLiveId, pfm.this.f32592a.broadCaster.accountId, pfm.this.b));
                        }
                    } else if (pfm.this.f32592a != null && pfm.this.f32592a.latestPreLiveId != null && pfm.this.f32592a.broadCaster != null) {
                        poa z2 = pmd.a().z();
                        String str2 = pfm.this.f32592a.latestPreLiveId;
                        Context b3 = pfm.b(pfm.this);
                        pfm pfmVar2 = pfm.this;
                        z2.b(str2, "tblive_siyu", "taoLiveStartNotify", b3, new b(pfmVar2.f32592a.latestPreLiveId, pfm.this.f32592a.broadCaster.accountId, pfm.this.b));
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", "2");
                    o.a(pfm.d(pfm.this), "jiangjieintolivebottom-click", (Map<String, String>) hashMap);
                }
            }

            @Override // com.taobao.taolive.movehighlight.bundle.dxbottomBar.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                if (c.D() && pfm.this.f32592a.curPreLiveInfo != null) {
                    if (pfm.this.f32592a != null && pfm.this.f32592a.curPreLiveInfo != null && pfm.this.f32592a.broadCaster != null) {
                        poa z = pmd.a().z();
                        String str = pfm.this.f32592a.curPreLiveInfo.curPreLiveId;
                        Context b2 = pfm.b(pfm.this);
                        pfm pfmVar = pfm.this;
                        z.c(str, "tblive_siyu", "taoLiveStartNotify", b2, new b(pfmVar.f32592a.curPreLiveInfo.curPreLiveId, pfm.this.f32592a.broadCaster.accountId, pfm.this.b));
                    }
                } else if (pfm.this.f32592a != null && pfm.this.f32592a.latestPreLiveId != null && pfm.this.f32592a.broadCaster != null) {
                    poa z2 = pmd.a().z();
                    String str2 = pfm.this.f32592a.latestPreLiveId;
                    Context b3 = pfm.b(pfm.this);
                    pfm pfmVar2 = pfm.this;
                    z2.c(str2, "tblive_siyu", "taoLiveStartNotify", b3, new b(pfmVar2.f32592a.latestPreLiveId, pfm.this.f32592a.broadCaster.accountId, pfm.this.b));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("type", "3");
                o.a(pfm.d(pfm.this), "jiangjieintolivebottom-click", (Map<String, String>) hashMap);
            }
        });
        this.b = new a() { // from class: tb.pfm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pfm.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (pfm.this.f32592a == null || pfm.this.f32592a.latestPreLiveId == null) {
                } else {
                    pfm pfmVar = pfm.this;
                    pfm.a(pfmVar, true, null, pfm.d(pfmVar));
                    Context b2 = pfm.b(pfm.this);
                    m.a(b2, "您已成功预约" + pfm.this.f32592a.broadCaster.accountName + "直播间");
                }
            }

            @Override // tb.pfm.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else if (pfm.this.f32592a == null || pfm.this.f32592a.latestPreLiveId == null) {
                } else {
                    pfm pfmVar = pfm.this;
                    pfm.a(pfmVar, false, null, pfm.d(pfmVar));
                    Context b2 = pfm.b(pfm.this);
                    m.a(b2, "您已成功取消预约" + pfm.this.f32592a.broadCaster.accountName + "直播间");
                }
            }
        };
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        VideoInfo videoInfo = this.f32592a;
        if (videoInfo != null && "1".equals(videoInfo.roomStatus) && !"0".equals(this.f32592a.streamStatus)) {
            a(true, jSONObject);
            return;
        }
        VideoInfo videoInfo2 = this.f32592a;
        if (videoInfo2 == null || "1".equals(videoInfo2.roomStatus)) {
            return;
        }
        this.g = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("model")) != null && l.d(jSONObject2.getString("hasLivingNow"))) {
            String string = jSONObject2.getString("livingRoomId");
            String string2 = jSONObject2.getString("livingStreamStatus");
            if (!StringUtils.isEmpty(string) && !"0".equals(string2)) {
                this.g = string;
            }
        }
        if (this.g != null) {
            a(true, jSONObject);
        } else {
            a(false, jSONObject);
        }
    }

    public void a(boolean z) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        DXRootView dXRootView = this.e;
        if (dXRootView == null || (data = dXRootView.getData()) == null) {
            return;
        }
        data.put("enableMuteAbility", (Object) Boolean.valueOf(z));
        DXRootView dXRootView2 = this.e;
        if (dXRootView2 == null || dXRootView2.getExpandWidgetNode() == null) {
            return;
        }
        a(this.e.getExpandWidgetNode().queryWidgetNodeByUserId("highlightBottomLayout"));
    }

    private void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        DXRootView dXRootView = this.e;
        if (dXRootView == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = dXRootView.getData();
        }
        if (jSONObject == null) {
            return;
        }
        jSONObject.put("isLiving", (Object) Boolean.valueOf(z));
        DXRootView dXRootView2 = this.e;
        if (dXRootView2 == null || dXRootView2.getExpandWidgetNode() == null) {
            return;
        }
        a(this.e.getExpandWidgetNode().queryWidgetNodeByUserId("liveroomStatusTip"));
    }

    private void a(boolean z, JSONObject jSONObject, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0daa41", new Object[]{this, new Boolean(z), jSONObject, aVar});
            return;
        }
        DXRootView dXRootView = this.e;
        if (dXRootView == null || this.f32592a == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = dXRootView.getData();
        }
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (c.D() && this.f32592a.curPreLiveInfo != null) {
            jSONObject2.put("latestPreLiveId", (Object) this.f32592a.curPreLiveInfo.curPreLiveId);
            jSONObject2.put("latestPreLiveStartTimeDesc", (Object) this.f32592a.curPreLiveInfo.curPreLiveStartTimeDesc);
            jSONObject2.put("preUserSubscribe", (Object) Boolean.valueOf(z));
        } else {
            jSONObject2.put("latestPreLiveId", (Object) this.f32592a.latestPreLiveId);
            jSONObject2.put("latestPreLiveStartTimeDesc", (Object) this.f32592a.latestPreLiveStartTimeDesc);
            jSONObject2.put("preUserSubscribe", (Object) Boolean.valueOf(z));
        }
        jSONObject.put("highlightLastPreLiveInfo", (Object) jSONObject2);
        DXRootView dXRootView2 = this.e;
        if (dXRootView2 == null || dXRootView2.getExpandWidgetNode() == null) {
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = this.e.getExpandWidgetNode().queryWidgetNodeByUserId("liveroomStatusTip");
        String str = this.e.getDxTemplateItem().f11925a;
        if (queryWidgetNodeByUserId != null) {
            a(queryWidgetNodeByUserId);
        } else if (!"highlight_room_status_action".equals(str)) {
        } else {
            pfx.a().a(this.e, (JSONObject) jSONObject.clone(), aVar);
        }
    }

    public void a(final DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            final DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().a(2).a(true).b(true).a();
            new Handler().postDelayed(new Runnable() { // from class: tb.pfm.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        pfx.a().f32613a.a(dXWidgetNode, 0, a2);
                    }
                }
            }, 100L);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.f32592a;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        pfb a2 = pfb.a(this.f);
        if (!"1".equals(this.f32592a.roomStatus)) {
            if (StringUtils.isEmpty(this.g) || a2.l() == null) {
                return;
            }
            a2.l().d(this.f, this.g);
            o.a(this.f, "PlaybackToLive", new String[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        VideoInfo videoInfo2 = this.f32592a;
        if (videoInfo2 != null) {
            if (videoInfo2.broadCaster != null) {
                hashMap.put("account_id", this.f32592a.broadCaster.accountId);
            }
            hashMap.put("feed_id", this.f32592a.liveId);
        }
        hashMap.put("istimeshift", "1");
        hashMap.put("duration", (System.currentTimeMillis() - this.h) + "");
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f;
        if ((aVar instanceof e) && ((e) aVar).D() != null) {
            hashMap.put("item_id", ((e) this.f).D().aD());
        }
        hashMap.put("click_time", Long.toString(System.currentTimeMillis()));
        hashMap.put("type", "1");
        o.a(this.f, "Gotolive", (Map<String, String>) hashMap);
        m.a(this.d, "正在传送到直播中状态...");
        if (a2.l() != null) {
            a2.l().j(this.f, null);
        }
        o.a(this.f, "jiangjieintolivebottom-click", (Map<String, String>) hashMap);
    }

    /* loaded from: classes8.dex */
    public class b implements pob {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;
        private a d;

        static {
            kge.a(-896564013);
            kge.a(703403124);
        }

        public b(String str, String str2, a aVar) {
            this.b = str;
            this.c = str2;
            this.d = aVar;
        }

        @Override // tb.pob
        public void a(poc pocVar) {
            List<pod> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fde614", new Object[]{this, pocVar});
            } else if (pocVar != null && !l.e(pocVar.a())) {
                if (!"SUCCESS".equals(pocVar.a()) || (b = pocVar.b()) == null) {
                    return;
                }
                for (int i = 0; i < b.size(); i++) {
                    pod podVar = b.get(i);
                    if (!l.e(podVar.b()) && podVar.b().equals(this.b) && "1".equals(podVar.a())) {
                        a aVar = this.d;
                        if (aVar == null) {
                            return;
                        }
                        aVar.a();
                        return;
                    } else if (!l.e(podVar.b()) && podVar.b().equals(this.b) && "0".equals(podVar.a())) {
                        a aVar2 = this.d;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(this.b, this.c);
                        return;
                    }
                }
            } else {
                m.a(pfm.b(pfm.this), "订阅失败");
            }
        }
    }
}
