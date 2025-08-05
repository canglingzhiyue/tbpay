package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.pbn;

/* loaded from: classes8.dex */
public class pbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f32548a;
    public Application.ActivityLifecycleCallbacks b;
    private JSONObject c;
    private FrameLayout d;
    private FrameLayout e;
    private FrameLayout f;
    private ImageView g;
    private TextView h;
    private Context i;
    private TBLiveOpenCardView k;
    private boolean l;
    private a m;
    private final String n = pbm.class.getSimpleName();
    private pbn j = new pbn();
    private boolean o = false;

    /* loaded from: classes8.dex */
    public interface a {
        void a(boolean z);
    }

    static {
        kge.a(-1959159702);
    }

    public static /* synthetic */ Context a(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fb19f835", new Object[]{pbmVar}) : pbmVar.i;
    }

    public static /* synthetic */ DXTemplateItem a(pbm pbmVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("ad47be58", new Object[]{pbmVar, str}) : pbmVar.c(str);
    }

    public static /* synthetic */ boolean a(pbm pbmVar, Context context, Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db89cf41", new Object[]{pbmVar, context, activity})).booleanValue() : pbmVar.a(context, activity);
    }

    public static /* synthetic */ boolean a(pbm pbmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301d7a3b", new Object[]{pbmVar, new Boolean(z)})).booleanValue();
        }
        pbmVar.l = z;
        return z;
    }

    public static /* synthetic */ JSONObject b(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8b9279de", new Object[]{pbmVar}) : pbmVar.c;
    }

    public static /* synthetic */ boolean b(pbm pbmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11fb43da", new Object[]{pbmVar, new Boolean(z)})).booleanValue();
        }
        pbmVar.o = z;
        return z;
    }

    public static /* synthetic */ a c(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cd39fdaf", new Object[]{pbmVar}) : pbmVar.m;
    }

    public static /* synthetic */ boolean d(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4d453c4", new Object[]{pbmVar})).booleanValue() : pbmVar.l;
    }

    public static /* synthetic */ TBLiveOpenCardView e(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveOpenCardView) ipChange.ipc$dispatch("c0592be3", new Object[]{pbmVar}) : pbmVar.k;
    }

    public static /* synthetic */ ImageView f(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("4bed1d0e", new Object[]{pbmVar}) : pbmVar.g;
    }

    public static /* synthetic */ TextView g(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ca0536b7", new Object[]{pbmVar}) : pbmVar.h;
    }

    public static /* synthetic */ FrameLayout h(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("e0c52095", new Object[]{pbmVar}) : pbmVar.e;
    }

    public static /* synthetic */ void i(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d637445", new Object[]{pbmVar});
        } else {
            pbmVar.f();
        }
    }

    public static /* synthetic */ String j(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ab9e9a", new Object[]{pbmVar}) : pbmVar.n;
    }

    public static /* synthetic */ boolean k(pbm pbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a69814b", new Object[]{pbmVar})).booleanValue() : pbmVar.o;
    }

    public pbm(Context context, View view, JSONObject jSONObject, String str, a aVar) {
        String str2 = "TBLiveFllowContentController: init" + hashCode();
        this.c = jSONObject;
        this.i = context;
        this.m = aVar;
        this.k = new TBLiveOpenCardView(this.i);
        this.l = pro.d(str);
        this.f32548a = view;
        a(this.f32548a);
        g();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.e = (FrameLayout) view.findViewById(R.id.taolive_fllow_content_dx_frame);
        this.f = (FrameLayout) view.findViewById(R.id.taolive_fllow_content_player_frame);
        this.d = (FrameLayout) view.findViewById(R.id.tblive_uikit_follow_content_layout);
        this.g = (ImageView) view.findViewById(R.id.tbl_follow_content_voice_img);
        this.h = (TextView) view.findViewById(R.id.tbl_follow_content_error_tips);
        this.h.setVisibility(8);
        this.e.removeAllViews();
        this.f.removeAllViews();
        this.f.addView(this.k, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    public void a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = "startPlayer: " + hashCode();
        if (!TextUtils.isEmpty(str)) {
            this.l = pro.d(str);
        }
        if (this.k == null || (jSONObject = this.c) == null) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("fields");
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("liveInfo")) != null) {
            this.k.setPlayerData(jSONObject2);
            this.k.setPlayVideo(true);
            this.k.setCloseSkipPlaySwitch(true);
            this.k.playVideo(null, null);
            this.k.setMuted(this.l);
        }
        if (this.l) {
            this.g.setBackgroundResource(R.drawable.tblive_follow_voice_close);
        } else {
            this.g.setBackgroundResource(R.drawable.tblive_follow_voice_enable);
        }
        d();
        a();
    }

    public void a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.i == null || pmd.a().e() == null) {
        } else {
            pmd.a().e().a(this.i);
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = this.c;
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("fields")) != null) {
                hashMap.putAll(pbk.a(this.c));
                JSONObject jSONObject3 = jSONObject.getJSONObject("liveInfo");
                if (jSONObject3 != null) {
                    hashMap.put(ag.KEY_LIVE_STATUS, jSONObject3.getString("roomStatus"));
                }
            }
            pmd.a().e().a(this.i, hashMap);
            pmd.a().e().a(this.i, "Page_TaobaoLiveWatch");
            pmd.a().e().c(this.i);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = "stopPlayer: " + hashCode();
        TBLiveOpenCardView tBLiveOpenCardView = this.k;
        if (tBLiveOpenCardView == null || !tBLiveOpenCardView.isPlaying()) {
            return;
        }
        this.k.stopVideo();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = "onWidgetRender: " + hashCode();
        if (this.e == null || this.f == null || this.d == null || this.g == null || this.k == null) {
            return;
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            final JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            String str2 = "onWidgetRender: " + hashCode() + this.l;
            if (jSONObject2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("liveRoomInfo");
                if (this.k != null && jSONObject3 != null) {
                    String string = jSONObject3.getString(aw.PARAM_COVER_IMG);
                    if (!TextUtils.isEmpty(string)) {
                        this.k.setImageUrl(string);
                        this.k.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                }
            }
            e();
            this.d.setOnClickListener(new View.OnClickListener() { // from class: tb.pbm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    JSONObject jSONObject4 = jSONObject2;
                    if (jSONObject4 == null) {
                        return;
                    }
                    String string2 = jSONObject4.getString("jumpUrl");
                    if (!TextUtils.isEmpty(string2) && pbm.a(pbm.this) != null) {
                        Nav.from(pbm.a(pbm.this)).toUri(string2);
                    }
                    Map<String, String> a2 = pbk.a(pbm.b(pbm.this));
                    a2.put("click_class", "clickvideo");
                    pru.a("Page_TaobaoLiveWatch", "focus_livecard_click", a2);
                }
            });
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.pbm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (pbm.c(pbm.this) == null) {
                } else {
                    pbm pbmVar = pbm.this;
                    pbm.a(pbmVar, !pbm.d(pbmVar));
                    if (pbm.d(pbm.this)) {
                        pbm.c(pbm.this).a(true);
                        pbm.e(pbm.this).setMuted(true);
                        pbm.f(pbm.this).setBackgroundResource(R.drawable.tblive_follow_voice_close);
                        return;
                    }
                    pbm.c(pbm.this).a(false);
                    pbm.e(pbm.this).setMuted(false);
                    pbm.f(pbm.this).setBackgroundResource(R.drawable.tblive_follow_voice_enable);
                }
            }
        });
    }

    private void d() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.c.getJSONObject("fields");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("liveRoomInfo")) == null) {
            return;
        }
        String string = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        b(string);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String str2 = "handleUpdateCheckRequest: " + hashCode();
        pbn pbnVar = this.j;
        if (pbnVar == null) {
            return;
        }
        pbnVar.a(str, new pbn.a() { // from class: tb.pbm.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pbn.a
            public void a(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d87613d2", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            @Override // tb.pbn.a
            public void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                JSONObject jSONObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("943cf852", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                JSONObject b = pqj.b(netResponse.getDataJsonObject().toString());
                if (b == null || (jSONObject = b.getJSONObject("model")) == null) {
                    return;
                }
                Integer integer = jSONObject.getInteger("roomStatus");
                pbm.g(pbm.this).setVisibility(8);
                if (integer != null && integer.intValue() != 1) {
                    pbm.g(pbm.this).setText("主播暂时不在，稍等一会儿回来哦～");
                    pbm.g(pbm.this).setVisibility(0);
                }
                Integer integer2 = jSONObject.getInteger("streamStatus");
                if (integer2 == null || integer2.intValue() == 1) {
                    return;
                }
                pbm.g(pbm.this).setText("亲，直播间被挤爆了，请刷新再试");
                pbm.g(pbm.this).setVisibility(0);
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        pbn pbnVar = this.j;
        if (pbnVar != null) {
            pbnVar.a(new pbn.a() { // from class: tb.pbm.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pbn.a
                public void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("943cf852", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    if (netResponse != null && netResponse.getDataJsonObject() != null) {
                        DXTemplateItem a2 = pbm.a(pbm.this, netResponse.getDataJsonObject().toString());
                        if (pbm.b(pbm.this) != null && pbm.h(pbm.this) != null && pbm.a(pbm.this) != null && a2 != null) {
                            pbl.a().a(a2, pbm.b(pbm.this), pbm.a(pbm.this), pbm.h(pbm.this));
                            return;
                        }
                    }
                    pbm.i(pbm.this);
                }

                @Override // tb.pbn.a
                public void a(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d87613d2", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        pbm.i(pbm.this);
                    }
                }
            });
        } else {
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = "tbl_fllow_content_layer";
        dXTemplateItem.c = "https://dinamicx.alibabausercontent.com/pub/tbl_fllow_content_layer/1690774440223/tbl_fllow_content_layer.zip";
        dXTemplateItem.b = 3L;
        if (this.c == null || this.i == null || this.e == null) {
            return;
        }
        pbl.a().a(dXTemplateItem, this.c, this.i, this.e);
    }

    private DXTemplateItem c(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f069eb8b", new Object[]{this, str});
        }
        try {
            jSONObject = (JSONObject) pqj.a(str);
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            return null;
        }
        Iterator<Object> it = jSONObject.getJSONArray("result").iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = ((JSONObject) next).getString("name");
            if ("tbl_fllow_content_layer".equals(string)) {
                String string2 = ((JSONObject) next).getString("url4Android");
                long longValue = ((JSONObject) next).getLongValue("version4Android");
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f11925a = string;
                dXTemplateItem.c = string2;
                dXTemplateItem.b = longValue;
                return dXTemplateItem;
            }
        }
        return null;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            if (this.b == null) {
                this.b = new Application.ActivityLifecycleCallbacks() { // from class: tb.pbm.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                            return;
                        }
                        pbm pbmVar = pbm.this;
                        if (!pbm.a(pbmVar, pbm.a(pbmVar), activity)) {
                            return;
                        }
                        pbm.j(pbm.this);
                        String str = "onActivityDestroyed: " + hashCode();
                        if (pbm.e(pbm.this) == null || pbm.e(pbm.this).isPlaying() || !pbm.k(pbm.this)) {
                            return;
                        }
                        pbm.this.a((String) null);
                        pbm.b(pbm.this, false);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                            return;
                        }
                        pbm pbmVar = pbm.this;
                        if (!pbm.a(pbmVar, pbm.a(pbmVar), activity)) {
                            return;
                        }
                        pbm.j(pbm.this);
                        String str = "onActivityDestroyed: " + hashCode();
                        if (pbm.e(pbm.this) == null || !pbm.e(pbm.this).isPlaying()) {
                            return;
                        }
                        pbm.this.b();
                        pbm.b(pbm.this, true);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                            return;
                        }
                        pbm pbmVar = pbm.this;
                        if (!pbm.a(pbmVar, pbm.a(pbmVar), activity)) {
                            return;
                        }
                        pbm.j(pbm.this);
                        String str = "onActivityDestroyed: " + hashCode();
                        pbm.this.b();
                        if (pbm.a(pbm.this) == null) {
                            return;
                        }
                        ((Application) pbm.a(pbm.this).getApplicationContext()).unregisterActivityLifecycleCallbacks(pbm.this.b);
                    }
                };
            }
            if (this.i == null) {
                return;
            }
            ((Application) this.i.getApplicationContext()).registerActivityLifecycleCallbacks(this.b);
        } catch (Throwable unused) {
        }
    }

    private boolean a(Context context, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b62453b6", new Object[]{this, context, activity})).booleanValue();
        }
        if (context != null && activity != null && activity.getComponentName() != null) {
            Activity activity2 = (Activity) context;
            if (activity2.getComponentName() != null) {
                return activity.getComponentName().equals(activity2.getComponentName());
            }
        }
        return false;
    }
}
