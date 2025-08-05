package com.taobao.mmad.preview;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.b;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.pbe;
import tb.pbg;
import tb.srq;
import tb.srs;
import tb.sru;
import tb.ssf;
import tb.stt;
import tb.stv;
import tb.tir;
import tb.tjb;
import tb.tjk;
import tb.tjn;
import tb.tjo;
import tb.xno;

/* loaded from: classes7.dex */
public class TopshowPreviewActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private tjb f18114a;
    private Handler b = new Handler(Looper.getMainLooper(), new a());
    private TUrlImageView c;
    private View d;
    private View e;
    private tir f;
    private pbe g;

    /* loaded from: classes7.dex */
    public enum ShowState {
        START_TO_DOWNLOAD(0),
        RENDER_VIEW(1);
        
        final int what;

        ShowState(int i) {
            this.what = i;
        }
    }

    static {
        kge.a(-1690759227);
    }

    public static /* synthetic */ Object ipc$super(TopshowPreviewActivity topshowPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void lambda$cqTyM4f2fReZgCoxLs7LT2wddFY(TopshowPreviewActivity topshowPreviewActivity) {
        topshowPreviewActivity.e();
    }

    public static /* synthetic */ void lambda$vDXx13Y4WzmYVasp9SOS4u93_SU(TopshowPreviewActivity topshowPreviewActivity, View view) {
        topshowPreviewActivity.a(view);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ tir a(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tir) ipChange.ipc$dispatch("9c9f9617", new Object[]{topshowPreviewActivity}) : topshowPreviewActivity.f;
    }

    public static /* synthetic */ void a(TopshowPreviewActivity topshowPreviewActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1296211", new Object[]{topshowPreviewActivity, new Integer(i)});
        } else {
            topshowPreviewActivity.a(i);
        }
    }

    public static /* synthetic */ void a(TopshowPreviewActivity topshowPreviewActivity, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4c1b85", new Object[]{topshowPreviewActivity, message});
        } else {
            topshowPreviewActivity.a(message);
        }
    }

    public static /* synthetic */ void a(TopshowPreviewActivity topshowPreviewActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2771fe", new Object[]{topshowPreviewActivity, jSONObject});
        } else {
            topshowPreviewActivity.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(TopshowPreviewActivity topshowPreviewActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f50fb46", new Object[]{topshowPreviewActivity, str, str2});
        } else {
            topshowPreviewActivity.a(str, str2);
        }
    }

    public static /* synthetic */ void b(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0a8b3", new Object[]{topshowPreviewActivity});
        } else {
            topshowPreviewActivity.a();
        }
    }

    public static /* synthetic */ void b(TopshowPreviewActivity topshowPreviewActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1858c047", new Object[]{topshowPreviewActivity, str, str2});
        } else {
            topshowPreviewActivity.b(str, str2);
        }
    }

    public static /* synthetic */ Handler c(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1125a012", new Object[]{topshowPreviewActivity}) : topshowPreviewActivity.b;
    }

    public static /* synthetic */ void c(TopshowPreviewActivity topshowPreviewActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608548", new Object[]{topshowPreviewActivity, str, str2});
        } else {
            topshowPreviewActivity.c(str, str2);
        }
    }

    /* loaded from: classes7.dex */
    public class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(307526530);
            kge.a(-1043440182);
        }

        public a() {
            TopshowPreviewActivity.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message.what == ShowState.START_TO_DOWNLOAD.what) {
                ArrayList arrayList = new ArrayList();
                JSONObject parseObject = JSONObject.parseObject((String) message.obj);
                arrayList.add(parseObject);
                TopshowPreviewActivity.a(TopshowPreviewActivity.this).a(arrayList, 1001);
                TopshowPreviewActivity.a(TopshowPreviewActivity.this, parseObject);
            } else if (message.what == ShowState.RENDER_VIEW.what) {
                JSONObject jSONObject = (JSONObject) message.obj;
                TopshowPreviewActivity.a(TopshowPreviewActivity.this, jSONObject.getString("imgUrl"), jSONObject.getString("videoUrl"));
            }
            return true;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_BootImage);
        super.onCreate(bundle);
        this.f = new tir(new srq() { // from class: com.taobao.mmad.preview.TopshowPreviewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.srq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // tb.srq
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.srq
            public void a(int i, srs srsVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138e4097", new Object[]{this, new Integer(i), srsVar});
                }
            }

            @Override // tb.srq
            public void a(BootImageInfo bootImageInfo, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1729a26e", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
                }
            }

            @Override // tb.srq
            public void a(List<sru> list, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
                }
            }

            @Override // tb.srq
            public boolean a(JSONObject jSONObject, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("4a78e87f", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
                }
                return true;
            }

            @Override // tb.srq
            public boolean a(b.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
                }
                return false;
            }

            @Override // tb.srq
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // tb.srq
            public void b(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.srq
            public void c(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                }
            }

            {
                TopshowPreviewActivity.this = this;
            }
        });
        this.f18114a = new tjb(this.f.a());
        new SystemBarDecorator(this).enableImmersiveStatusBar();
        this.d = LayoutInflater.from(this).inflate(R.layout.bootimage_base, (ViewGroup) null, false);
        setContentView(this.d);
        c();
        a(b());
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.taobao.mmad.preview.-$$Lambda$TopshowPreviewActivity$cqTyM4f2fReZgCoxLs7LT2wddFY
            {
                TopshowPreviewActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TopshowPreviewActivity.lambda$cqTyM4f2fReZgCoxLs7LT2wddFY(TopshowPreviewActivity.this);
            }
        });
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        tjn.a("数据获取失败，请确认二维码有效性！");
        finish();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!Login.checkSessionValid()) {
            tjn.a("请先登录账号");
            finish();
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.alimama.topshow.interact");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(true);
            mtopRequest.setNeedSession(true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("namespace", (Object) "preview");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("creativeId", (Object) str);
            jSONObject2.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Integer.valueOf(stt.a()));
            jSONObject2.put("screenHeight", (Object) Integer.valueOf(stt.b()));
            jSONObject.put("data", (Object) jSONObject2.toString());
            mtopRequest.setData(jSONObject.toString());
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, this), mtopRequest);
            build.mo1312setConnectionTimeoutMilliSecond(3000);
            build.mo1326setSocketTimeoutMilliSecond(5000);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mmad.preview.TopshowPreviewActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TopshowPreviewActivity.this = this;
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        TopshowPreviewActivity.b(TopshowPreviewActivity.this);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || mtopResponse.getDataJsonObject() == null) {
                    } else {
                        org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        try {
                            String string = dataJsonObject.getString("failure");
                            org.json.JSONObject jSONObject3 = dataJsonObject.getJSONObject("model");
                            if ("true".equals(string)) {
                                TopshowPreviewActivity.b(TopshowPreviewActivity.this);
                                return;
                            }
                            org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                            if (TopshowPreviewActivity.c(TopshowPreviewActivity.this) == null) {
                                return;
                            }
                            Message obtainMessage = TopshowPreviewActivity.c(TopshowPreviewActivity.this).obtainMessage(ShowState.START_TO_DOWNLOAD.what);
                            obtainMessage.obj = jSONObject4.toString();
                            TopshowPreviewActivity.a(TopshowPreviewActivity.this, obtainMessage);
                        } catch (JSONException unused) {
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        TopshowPreviewActivity.b(TopshowPreviewActivity.this);
                    }
                }
            });
            build.startRequest();
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.c;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(i);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", b());
        tjo.b("Page_Topshow_Preview", 2001, "show", "", "", hashMap);
        this.f.a().g().a((FrameLayout) this.d.findViewById(R.id.iv_bg_view).getParent());
        this.c.setImageUrl(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.g = (pbe) AliAdaptServiceManager.getInstance().findAliAdaptService(pbe.class);
        if (this.g == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_container);
        pbg pbgVar = new pbg("SplashPreview", Login.getUserId());
        pbgVar.c = 2;
        pbgVar.d = 2;
        pbgVar.f = 0;
        this.g.initConfig(linearLayout.getContext(), pbgVar);
        this.g.setVideoPath(str2);
        this.g.setMuted(true);
        this.g.setListener(new pbe.a() { // from class: com.taobao.mmad.preview.TopshowPreviewActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TopshowPreviewActivity.this = this;
            }

            @Override // tb.pbe.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    TopshowPreviewActivity.a(TopshowPreviewActivity.this, 8);
                }
            }

            @Override // tb.pbe.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    TopshowPreviewActivity.a(TopshowPreviewActivity.this, 0);
                }
            }

            @Override // tb.pbe.a
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                stv.a("TopshowPreviewActivity", "show video: onError." + i + " " + i2);
            }
        });
        this.e = this.g.getPlayView();
        View view = this.e;
        if (view == null) {
            return;
        }
        linearLayout.addView(view);
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.g.start();
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imgUrl", (Object) str);
        jSONObject.put("videoUrl", (Object) str2);
        Message obtainMessage = this.b.obtainMessage(ShowState.RENDER_VIEW.what);
        obtainMessage.obj = jSONObject;
        this.b.sendMessage(obtainMessage);
    }

    private void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
            b(str, str2);
        } else {
            this.f18114a.a(str2);
            this.f18114a.a(new AnonymousClass4(str));
        }
    }

    /* renamed from: com.taobao.mmad.preview.TopshowPreviewActivity$4 */
    /* loaded from: classes7.dex */
    public class AnonymousClass4 implements xno {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f18117a;

        public AnonymousClass4(String str) {
            TopshowPreviewActivity.this = r1;
            this.f18117a = str;
        }

        @Override // tb.xno
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                TopshowPreviewActivity.b(TopshowPreviewActivity.this, this.f18117a, str2);
            }
        }

        @Override // tb.xno
        public void a(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            } else if (TopshowPreviewActivity.c(TopshowPreviewActivity.this) == null) {
            } else {
                TopshowPreviewActivity.c(TopshowPreviewActivity.this).post($$Lambda$TopshowPreviewActivity$4$kPPAQpD_JhmETL5tqeVbsemJA.INSTANCE);
            }
        }

        public static /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                tjn.a("视频资源下载失败");
            }
        }
    }

    private void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (this.f.a().g().b().a(tjk.b(this.f.a().d().d().getJSONObject("template"))) != null) {
            c(str, str2);
        } else {
            this.f.a().g().b().a(new AnonymousClass5(str, str2));
        }
    }

    /* renamed from: com.taobao.mmad.preview.TopshowPreviewActivity$5 */
    /* loaded from: classes7.dex */
    public class AnonymousClass5 implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f18118a;
        public final /* synthetic */ String b;

        public AnonymousClass5(String str, String str2) {
            TopshowPreviewActivity.this = r1;
            this.f18118a = str;
            this.b = str2;
        }

        @Override // tb.fve
        public void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (!fvbVar.f28139a.isEmpty()) {
                TopshowPreviewActivity.c(TopshowPreviewActivity.this, this.f18118a, this.b);
            } else if (TopshowPreviewActivity.c(TopshowPreviewActivity.this) == null) {
            } else {
                TopshowPreviewActivity.c(TopshowPreviewActivity.this).post($$Lambda$TopshowPreviewActivity$5$RvBNrqPrfnJYuPJ_UYTVKIctMak.INSTANCE);
            }
        }

        public static /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                tjn.a("资源下载失败");
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f.a().g().b().e();
        this.f.a().g().b().a(jSONObject);
        JSONObject b = ssf.b(jSONObject);
        if (b == null) {
            return;
        }
        d(b.getString("imgUrl"), b.getString("videoUrl"));
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (getIntent() == null || getIntent().getData() == null) {
            return "";
        }
        String queryParameter = getIntent().getData().getQueryParameter("creativeId");
        return TextUtils.isEmpty(queryParameter) ? "" : queryParameter;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = (TUrlImageView) findViewById(R.id.iv_main);
        this.c.setBackgroundColor(-16777216);
        findViewById(R.id.iv_left_top_tb_logo).setVisibility(0);
        findViewById(R.id.iv_ipv6_logo).setVisibility(0);
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TextView textView = (TextView) findViewById(R.id.tv_close);
        textView.setText("跳过广告");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mmad.preview.-$$Lambda$TopshowPreviewActivity$vDXx13Y4WzmYVasp9SOS4u93_SU
            {
                TopshowPreviewActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopshowPreviewActivity.lambda$vDXx13Y4WzmYVasp9SOS4u93_SU(TopshowPreviewActivity.this, view);
            }
        });
        textView.setTextColor(-1);
        textView.setTextSize(13.0f);
        TextView textView2 = (TextView) findViewById(R.id.tv_countdown);
        textView2.setTextSize(13.0f);
        textView2.setText("5");
        textView2.setTextColor(-1);
        View findViewById = findViewById(R.id.ll_close);
        findViewById.setBackgroundResource(R.drawable.bootimage_commercial_skip_bg);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = stt.a(23.0f);
        layoutParams.width = stt.a(75.0f);
        findViewById.setLayoutParams(layoutParams);
    }

    public /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.b = null;
        }
        pbe pbeVar = this.g;
        if (pbeVar != null) {
            pbeVar.release();
            this.g = null;
        }
        this.e = null;
        this.f = null;
        this.c = null;
        this.f18114a = null;
        this.d = null;
    }
}
