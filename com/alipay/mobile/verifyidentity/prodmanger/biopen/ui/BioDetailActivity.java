package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioDetailActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GET_DATA_SUCCESS = 1;
    public static final int GET_ICON = 2;

    /* renamed from: a  reason: collision with root package name */
    private static String f5977a = "BioDetailActivity";
    private static String b = "BIC_REG_PICTURE";
    private static String c = "BIS_REG_PICTURE";
    private static String d = "BIS_FACELOGIN_REG_PICTURE";
    private static String e = "BIC_REG_DEFAULT";
    private CheckBox A;
    private Bundle C;
    private BaseProdManager D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private boolean R;
    private boolean S;
    private BroadcastReceiver T;
    private LocalBroadcastManager U;
    private long X;
    private LinearLayout f;
    private RelativeLayout g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private Button q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private LinearLayout u;
    private LinearLayout v;
    private RelativeLayout w;
    private RelativeLayout x;
    private View y;
    private View z;
    private boolean B = false;
    private a V = new a(this);
    private String W = "";
    private String Y = "";

    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<BioDetailActivity> f6000a;

        public a(BioDetailActivity bioDetailActivity) {
            this.f6000a = new WeakReference<>(bioDetailActivity);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            BioDetailActivity bioDetailActivity = this.f6000a.get();
            if (bioDetailActivity == null) {
                return;
            }
            Bitmap bitmap = (Bitmap) message.obj;
            int i = message.what;
            if (i == 1) {
                BioDetailActivity.m(bioDetailActivity).setImageBitmap(bitmap);
            } else if (i != 2) {
            } else {
                BioDetailActivity.n(bioDetailActivity).setImageBitmap(bitmap);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(BioDetailActivity bioDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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

    public static /* synthetic */ Button a(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("c19597de", new Object[]{bioDetailActivity}) : bioDetailActivity.q;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f5977a;
    }

    public static /* synthetic */ String a(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72eea9ec", new Object[]{bioDetailActivity, str});
        }
        bioDetailActivity.E = str;
        return str;
    }

    public static /* synthetic */ void a(BioDetailActivity bioDetailActivity, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa741c7", new Object[]{bioDetailActivity, str, str2, map});
        } else {
            a(str, str2, map);
        }
    }

    public static /* synthetic */ void b(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94c2113", new Object[]{bioDetailActivity, str});
        } else {
            bioDetailActivity.a(str);
        }
    }

    public static /* synthetic */ void b(BioDetailActivity bioDetailActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e893c6b", new Object[]{bioDetailActivity, new Boolean(z)});
        } else {
            bioDetailActivity.a(z);
        }
    }

    public static /* synthetic */ boolean b(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a204678d", new Object[]{bioDetailActivity})).booleanValue() : bioDetailActivity.R;
    }

    public static /* synthetic */ Bundle c(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("87cb1bec", new Object[]{bioDetailActivity}) : bioDetailActivity.C;
    }

    public static /* synthetic */ void d(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4070ac7", new Object[]{bioDetailActivity});
        } else {
            bioDetailActivity.b();
        }
    }

    public static /* synthetic */ String e(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc9530fa", new Object[]{bioDetailActivity}) : bioDetailActivity.M;
    }

    public static /* synthetic */ String e(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d2f1f0", new Object[]{bioDetailActivity, str});
        }
        bioDetailActivity.W = str;
        return str;
    }

    public static /* synthetic */ String f(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4db713b", new Object[]{bioDetailActivity}) : bioDetailActivity.I;
    }

    public static /* synthetic */ String g(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d21b17c", new Object[]{bioDetailActivity}) : bioDetailActivity.G;
    }

    public static /* synthetic */ String h(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4567f1bd", new Object[]{bioDetailActivity}) : bioDetailActivity.F;
    }

    public static /* synthetic */ String i(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6dae31fe", new Object[]{bioDetailActivity}) : bioDetailActivity.E;
    }

    public static /* synthetic */ boolean j(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a0ef485", new Object[]{bioDetailActivity})).booleanValue() : bioDetailActivity.B;
    }

    public static /* synthetic */ String k(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be3ab280", new Object[]{bioDetailActivity}) : bioDetailActivity.H;
    }

    public static /* synthetic */ a l(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f7416724", new Object[]{bioDetailActivity}) : bioDetailActivity.V;
    }

    public static /* synthetic */ ImageView m(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("5c4c3bf2", new Object[]{bioDetailActivity}) : bioDetailActivity.s;
    }

    public static /* synthetic */ ImageView n(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("9fb2ab33", new Object[]{bioDetailActivity}) : bioDetailActivity.t;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.C = getIntent().getExtras();
        }
        setContentView(R.layout.bio_open_view);
        if (this.C != null) {
            this.D = MicroModuleContext.getInstance().findProManager(this.C.getString("token"));
        }
        this.f = (LinearLayout) findViewById(R.id.full_page);
        this.y = findViewById(R.id.rl_titlebar);
        this.z = findViewById(R.id.face_login_divider);
        this.x = (RelativeLayout) findViewById(R.id.face_login_titlebar);
        this.h = (TextView) findViewById(R.id.tv_title_name);
        this.i = (TextView) findViewById(R.id.tv_skip);
        this.p = (TextView) findViewById(R.id.tv_protocol);
        this.u = (LinearLayout) findViewById(R.id.liner_finger_page);
        this.j = (TextView) findViewById(R.id.tv_finger_page_guide);
        this.k = (TextView) findViewById(R.id.tv_finger_page_content);
        this.n = (TextView) findViewById(R.id.ing_tle);
        this.o = (TextView) findViewById(R.id.ing_des);
        this.q = (Button) findViewById(R.id.bio_open_button);
        this.r = (ImageView) findViewById(R.id.iv_finger_imageView);
        this.s = (ImageView) findViewById(R.id.iv_tpl);
        this.w = (RelativeLayout) findViewById(R.id.business_module);
        this.v = (LinearLayout) findViewById(R.id.business_info);
        this.t = (ImageView) findViewById(R.id.business_icon);
        this.l = (TextView) findViewById(R.id.business_text);
        this.m = (TextView) findViewById(R.id.bottom_content);
        this.A = (CheckBox) findViewById(R.id.business_switch);
        this.g = (RelativeLayout) findViewById(R.id.ing_layout);
        Bundle bundle2 = this.C;
        VerifyLogCat.d(f5977a, "初始化生物开通页面");
        if (bundle2 != null) {
            if (bundle2.getBundle("InitParams") != null) {
                this.I = bundle2.getBundle("InitParams").getString("sceneId");
            }
            this.F = bundle2.getString(rrv.PRODUCT_ID);
            this.G = bundle2.getString(aw.PARAM_PRODUCT_TYPE);
            this.J = bundle2.getString("btnText");
            this.K = bundle2.getString("biolink");
            this.L = bundle2.getString("biolinkurl");
            this.M = bundle2.getString("gnUrl");
            this.N = bundle2.getString("gnPrefix");
            this.O = bundle2.getString("gnProl");
            if (!bundle2.containsKey("intgeable")) {
                this.S = false;
                this.R = true;
            } else {
                this.R = bundle2.getBoolean("intgeable");
                this.S = false;
            }
            this.P = bundle2.getString("intgetitle");
            this.Q = bundle2.getString("intgedesc");
            if (StringUtils.isEmpty(this.F)) {
                if ("1".equalsIgnoreCase(this.G)) {
                    this.F = CommonConstant.FINGERPRINT_PAY;
                } else if ("4".equalsIgnoreCase(this.G)) {
                    this.F = CommonConstant.FACEID_PAY;
                }
            }
            String str = this.F;
            String string = bundle2.getString("pageTitle");
            if (CommonConstant.FACELOGIN.equalsIgnoreCase(str)) {
                this.y.setVisibility(8);
                this.x.setVisibility(0);
                this.z.setVisibility(0);
                this.i.setVisibility(0);
                this.h.setText(string);
                this.i.setText(getResources().getString(R.string.face_skip));
                this.i.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            BioDetailActivity.this.notifyCancel();
                        }
                    }
                });
            } else {
                this.x.setVisibility(8);
                this.z.setVisibility(8);
                TitleBarAdapter titleBarAdapter = new TitleBarAdapter();
                titleBarAdapter.a(this, string, false);
                titleBarAdapter.f5944a = new TitleBarAdapter.OnLeftButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnLeftButtonClickListener
                    public final void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            BioDetailActivity.this.notifyCancel();
                        }
                    }
                };
            }
            if (!StringUtils.isEmpty(bundle2.getString("tplId")) && !e.equalsIgnoreCase(bundle2.getString("tplId"))) {
                VerifyLogCat.i(f5977a, "inter tplId");
                this.u.setVisibility(8);
                this.s.setVisibility(0);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = (i * 432) / 375;
                this.s.setLayoutParams(layoutParams);
                this.s.setBackgroundColor(Color.parseColor("#ffffff"));
                if (!StringUtils.isEmpty(this.C.getString(e.KEY_BG_IMG))) {
                    a(this.C.getString(e.KEY_BG_IMG), "REG_PICTURE");
                }
                if (b.equalsIgnoreCase(bundle2.getString("tplId")) || c.equalsIgnoreCase(bundle2.getString("tplId"))) {
                    this.f.setBackgroundColor(Color.parseColor("#F5F5F9"));
                    this.q.setVisibility(0);
                    if (!StringUtils.isEmpty(bundle2.getString("btnNormalColor")) && !StringUtils.isEmpty(bundle2.getString("btnPressedColor"))) {
                        this.q.setBackgroundColor(Color.parseColor(bundle2.getString("btnNormalColor")));
                        final String string2 = bundle2.getString("btnNormalColor");
                        final String string3 = bundle2.getString("btnPressedColor");
                        this.q.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                                }
                                if (view.getId() == R.id.bio_open_button) {
                                    if (motionEvent.getAction() == 1) {
                                        BioDetailActivity.a(BioDetailActivity.this).setBackgroundColor(Color.parseColor(string2));
                                    }
                                    if (motionEvent.getAction() == 0) {
                                        BioDetailActivity.a(BioDetailActivity.this).setBackgroundColor(Color.parseColor(string3));
                                    }
                                }
                                return false;
                            }
                        });
                    } else {
                        this.q.setBackgroundResource(R.drawable.au_button_open);
                    }
                    if (!StringUtils.isEmpty(bundle2.getString("bottomContent"))) {
                        this.q.setText(bundle2.getString("bottomContent"));
                    } else {
                        this.q.setText(getResources().getString(R.string.bio_open));
                    }
                    this.q.setTextColor(getResources().getColor(R.color.colorWhite));
                    bundle2.getString("protocol_url");
                    d();
                } else if (d.equalsIgnoreCase(bundle2.getString("tplId"))) {
                    this.f.setBackgroundColor(Color.parseColor("#ffffff"));
                    if (bundle2.getBoolean("sliderVisible")) {
                        this.w.setVisibility(0);
                        this.v.setVisibility(0);
                        String string4 = bundle2.getString("text");
                        String string5 = bundle2.getString("highlight");
                        this.H = bundle2.getString("url");
                        a(bundle2.getString("icon"), "ICON");
                        if ("disable".equalsIgnoreCase(bundle2.getString("status"))) {
                            this.A.setVisibility(8);
                            this.l.setText(string4);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                            layoutParams2.addRule(13);
                            this.v.setLayoutParams(layoutParams2);
                            this.v.setClickable(false);
                        } else {
                            this.A.setVisibility(0);
                            if (!StringUtils.isEmpty(string4) && !StringUtils.isEmpty(string5) && string4.contains(string5)) {
                                int indexOf = string4.indexOf(string5);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#1677ff")), indexOf, string5.length() + indexOf, 33);
                                this.l.setText(spannableStringBuilder);
                            }
                            if ("open".equalsIgnoreCase(bundle2.getString("status"))) {
                                this.A.setChecked(true);
                                this.E = "open";
                            } else if ("close".equalsIgnoreCase(bundle2.getString("status"))) {
                                this.A.setChecked(false);
                                this.E = "close";
                            }
                            this.A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                                    } else if (z) {
                                        BioDetailActivity.a(BioDetailActivity.this, "open");
                                    } else {
                                        BioDetailActivity.a(BioDetailActivity.this, "close");
                                    }
                                }
                            });
                            d();
                        }
                    }
                    this.q.setVisibility(0);
                    this.m.setVisibility(0);
                    if (StringUtils.isEmpty(bundle2.getString("bottomContent"))) {
                        this.m.setText(getResources().getString(R.string.face_bottomContent));
                    } else {
                        this.m.setText(bundle2.getString("bottomContent"));
                    }
                    this.q.setText(getResources().getString(R.string.face_login_open));
                }
                this.B = false;
            } else if (!StringUtils.isEmpty(bundle2.getString("code")) && !bundle2.getBoolean("isViewable")) {
                VerifyLogCat.i(f5977a, "inter code and not viewable");
                this.f.setBackgroundColor(Color.parseColor("#F5F5F9"));
                if ("1".equalsIgnoreCase(this.G)) {
                    this.r.setBackgroundResource(R.drawable.vi_finger_open_style);
                } else if ("4".equalsIgnoreCase(this.G)) {
                    this.r.setBackgroundResource(R.drawable.vi_face_open_style);
                } else {
                    this.r.setBackgroundResource(R.drawable.vi_finger_error);
                }
                this.j.setText(bundle2.getString("pageGuide"));
                this.k.setText(bundle2.getString(rrv.PAGE_CONTENT));
            } else {
                VerifyLogCat.i(f5977a, "inter other");
                this.f.setBackgroundColor(Color.parseColor("#F5F5F9"));
                if (!this.C.getBoolean("isViewable") || !"close".equals(this.C.get("productStatus"))) {
                    if (this.C.getBoolean("isViewable") && "open".equals(this.C.get("productStatus"))) {
                        VerifyLogCat.i(f5977a, "setClosedPage");
                        c();
                        this.q.setBackgroundResource(R.drawable.au_button_close);
                        this.q.setTextColor(getResources().getColor(R.color.button_red));
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.q.getLayoutParams();
                        layoutParams3.setMargins(42, 90, 42, 0);
                        this.q.setLayoutParams(layoutParams3);
                        if (!StringUtils.isEmpty(this.J)) {
                            this.q.setText(this.J);
                        } else if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.F)) {
                            this.q.setText(getResources().getString(R.string.finger_close));
                        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.F)) {
                            this.q.setText(getResources().getString(R.string.face_close));
                        }
                        this.B = true;
                        this.Y = "open";
                    }
                } else {
                    VerifyLogCat.i(f5977a, "setOpenPage");
                    c();
                    this.q.setBackgroundResource(R.drawable.au_button_open);
                    if (!StringUtils.isEmpty(this.J)) {
                        this.q.setText(this.J);
                    } else {
                        this.q.setText(getResources().getString(R.string.bio_open));
                    }
                    this.q.setTextColor(getResources().getColor(R.color.button_blue));
                    d();
                    this.B = false;
                    this.Y = "close";
                }
                if (!StringUtils.isEmpty(this.M) && !StringUtils.isEmpty(this.O)) {
                    if (StringUtils.isEmpty(this.N)) {
                        this.N = "";
                    }
                    String str2 = this.N + this.O;
                    int indexOf2 = str2.indexOf(this.O);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#1677ff")), indexOf2, this.O.length() + indexOf2, 33);
                    this.p.setText(str2);
                    this.p.setText(spannableStringBuilder2);
                    this.p.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.19
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else if (StringUtils.isEmpty(BioDetailActivity.e(BioDetailActivity.this)) || BioDetailActivity.this.isDoubleClick()) {
                            } else {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("bicListUrl", BioDetailActivity.e(BioDetailActivity.this));
                                BioDetailActivity.a(BioDetailActivity.this, bundle3);
                            }
                        }
                    });
                    this.p.setVisibility(0);
                } else {
                    this.p.setVisibility(8);
                }
                b();
            }
        }
        final Bundle bundle3 = this.C;
        VerifyLogCat.i(f5977a, "bioDetail code:" + bundle3.getString("code"));
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r10) {
                /*
                    r9 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.AnonymousClass20.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L15
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r9
                    r2 = 1
                    r1[r2] = r10
                    java.lang.String r10 = "8dfcefe2"
                    r0.ipc$dispatch(r10, r1)
                    return
                L15:
                    android.os.Bundle r10 = r2
                    java.lang.String r0 = "InitParams"
                    android.os.Bundle r10 = r10.getBundle(r0)
                    android.os.Bundle r0 = r2
                    java.lang.String r1 = "module"
                    java.lang.String r5 = r0.getString(r1)
                    android.os.Bundle r0 = r2
                    java.lang.String r1 = "token"
                    java.lang.String r4 = r0.getString(r1)
                    android.os.Bundle r0 = r2
                    java.lang.String r1 = "action"
                    java.lang.String r6 = r0.getString(r1)
                    android.os.Bundle r7 = new android.os.Bundle
                    r7.<init>()
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.f(r0)
                    java.lang.String r1 = "sceneId"
                    r7.putString(r1, r0)
                    java.lang.String r0 = "bizId"
                    java.lang.String r1 = r10.getString(r0)
                    r7.putString(r0, r1)
                    java.lang.String r0 = "tbsid"
                    java.lang.String r1 = r10.getString(r0)
                    r7.putString(r0, r1)
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.g(r0)
                    java.lang.String r1 = "productType"
                    r7.putString(r1, r0)
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.h(r0)
                    java.lang.String r1 = "FACELOGIN"
                    boolean r0 = r1.equalsIgnoreCase(r0)
                    if (r0 == 0) goto L8b
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r10 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    java.lang.String r10 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.i(r10)
                    java.lang.String r0 = "sliderStatus"
                    r7.putString(r0, r10)
                    java.lang.String r10 = com.alipay.mobile.verifyidentity.info.EnvInfoUtil.getBioMetaInfo()
                    java.lang.String r0 = "bioMetaInfo"
                L87:
                    r7.putString(r0, r10)
                    goto Lac
                L8b:
                    java.lang.String r0 = "userId"
                    java.lang.String r1 = r10.getString(r0)
                    boolean r1 = android.text.StringUtils.isEmpty(r1)
                    if (r1 != 0) goto Lac
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r1 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager r1 = com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.getInstance(r1)
                    if (r1 == 0) goto Lac
                    java.lang.String r10 = r10.getString(r0)
                    java.lang.String r10 = r1.getSecData(r10)
                    java.lang.String r0 = "secData"
                    goto L87
                Lac:
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r10 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    boolean r10 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.j(r10)
                    if (r10 == 0) goto Lc4
                    java.lang.String r10 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()
                    java.lang.String r0 = "进行关闭"
                    com.alipay.mobile.verifyidentity.log.VerifyLogCat.d(r10, r0)
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r10 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a(r10, r4, r5, r6, r7)
                    return
                Lc4:
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r2 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this
                    android.os.Bundle r8 = r2
                    java.lang.String r3 = "open"
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a(r2, r3, r4, r5, r6, r7, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.AnonymousClass20.onClick(android.view.View):void");
            }
        });
        this.T = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (!ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action) && !"android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
                    return;
                }
                BioDetailActivity.b(BioDetailActivity.this, true);
            }
        };
        this.U = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT);
        this.U.registerReceiver(this.T, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.T, intentFilter2);
    }

    public void notifyCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673f922a", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5977a, "cancel");
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", this.I);
        hashMap.put(rrv.PRODUCT_ID, this.F);
        a("UC-MobileIC-20180705-1", "", hashMap);
        a("1003");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowIntelligent)) || !this.S || "close".equalsIgnoreCase(this.Y)) {
        } else {
            if (StringUtils.isEmpty(this.P)) {
                if (this.R) {
                    this.P = getResources().getString(R.string.intelligent_title_open);
                } else {
                    this.P = getResources().getString(R.string.intelligent_title_close);
                }
            }
            if (StringUtils.isEmpty(this.Q)) {
                if (this.R) {
                    this.Q = getResources().getString(R.string.intelligent_desc_open);
                } else {
                    this.Q = getResources().getString(R.string.intelligent_desc_close);
                }
            }
            if (!this.P.endsWith(">")) {
                this.P += " >";
            }
            this.n.setText(this.P);
            this.o.setText(this.Q);
            this.g.setVisibility(0);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string;
                    String string2;
                    Resources resources;
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (BioDetailActivity.b(BioDetailActivity.this)) {
                        string = BioDetailActivity.this.getResources().getString(R.string.intelligent_single_alert_close);
                        string2 = BioDetailActivity.this.getResources().getString(R.string.ing_know);
                        resources = BioDetailActivity.this.getResources();
                        i = R.string.ing_close;
                    } else {
                        string = BioDetailActivity.this.getResources().getString(R.string.intelligent_single_alert_open);
                        string2 = BioDetailActivity.this.getResources().getString(R.string.ing_open);
                        resources = BioDetailActivity.this.getResources();
                        i = R.string.ing_close_ignore;
                    }
                    BioDetailActivity.this.alert((String) null, string, string2, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.15.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            } else if (BioDetailActivity.b(BioDetailActivity.this)) {
                            } else {
                                BioDetailActivity.a(BioDetailActivity.this, true);
                            }
                        }
                    }, resources.getString(i), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.15.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            } else if (!BioDetailActivity.b(BioDetailActivity.this)) {
                            } else {
                                BioDetailActivity.a(BioDetailActivity.this, false);
                            }
                        }
                    }, (Boolean) false);
                }
            });
        }
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.X;
        if (0 < j && j < 1000) {
            return true;
        }
        this.X = elapsedRealtime;
        return false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f.setBackgroundColor(Color.parseColor("#F5F5F5"));
        if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.F)) {
            this.r.setBackgroundResource(R.drawable.vi_finger_open_style);
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.F)) {
            this.r.setBackgroundResource(R.drawable.vi_face_open_style);
        }
        this.j.setText(this.C.getString("pageGuide"));
        this.k.setText(this.C.getString(rrv.PAGE_CONTENT));
        this.q.setVisibility(0);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.v.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(rrv.PRODUCT_ID, BioDetailActivity.h(BioDetailActivity.this));
                    bundle.putString("protoUrl", BioDetailActivity.k(BioDetailActivity.this));
                    BioDetailActivity.a(BioDetailActivity.this, bundle);
                }
            });
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ProdManagerResult prodManagerResult = new ProdManagerResult(str);
        BaseProdManager baseProdManager = this.D;
        if (baseProdManager != null) {
            baseProdManager.callback(prodManagerResult, null);
        } else {
            VerifyLogCat.d(f5977a, "fingerManager为空！无法回调！");
        }
        finish();
    }

    private synchronized void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.net.HttpURLConnection] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.String r0 = "关闭流异常"
                        com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.AnonymousClass11.$ipChange
                        boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                        r3 = 1
                        if (r2 == 0) goto L15
                        java.lang.Object[] r0 = new java.lang.Object[r3]
                        r2 = 0
                        r0[r2] = r7
                        java.lang.String r2 = "5c510192"
                        r1.ipc$dispatch(r2, r0)
                        return
                    L15:
                        r1 = 0
                        java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f java.lang.OutOfMemoryError -> L9d
                        java.lang.String r4 = r2     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f java.lang.OutOfMemoryError -> L9d
                        r2.<init>(r4)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f java.lang.OutOfMemoryError -> L9d
                        java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f java.lang.OutOfMemoryError -> L9d
                        java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f java.lang.OutOfMemoryError -> L9d
                        java.lang.String r4 = "GET"
                        r2.setRequestMethod(r4)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        r4 = 10000(0x2710, float:1.4013E-41)
                        r2.setConnectTimeout(r4)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        r2.setDoInput(r3)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        int r4 = r2.getResponseCode()     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        r5 = 200(0xc8, float:2.8E-43)
                        if (r4 != r5) goto L69
                        java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        android.os.Message r5 = android.os.Message.obtain()     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        r5.obj = r4     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        java.lang.String r4 = "REG_PICTURE"
                        java.lang.String r6 = r3     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        boolean r4 = r4.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        if (r4 == 0) goto L53
                        r5.what = r3     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        goto L60
                    L53:
                        java.lang.String r3 = "ICON"
                        java.lang.String r4 = r3     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        if (r3 == 0) goto L60
                        r3 = 2
                        r5.what = r3     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                    L60:
                        com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r3 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity$a r3 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.l(r3)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                        r3.sendMessage(r5)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L9e java.lang.Throwable -> Lbb
                    L69:
                        if (r1 == 0) goto L76
                        r1.close()     // Catch: java.lang.Exception -> L6f
                        goto L76
                    L6f:
                        java.lang.String r1 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r1, r0)
                    L76:
                        if (r2 == 0) goto Lba
                        r2.disconnect()
                        return
                    L7c:
                        r3 = move-exception
                        r2 = r1
                        goto Lbc
                    L7f:
                        r2 = r1
                    L80:
                        java.lang.String r3 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()     // Catch: java.lang.Throwable -> Lbb
                        java.lang.String r4 = "加载图片异常"
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r3, r4)     // Catch: java.lang.Throwable -> Lbb
                        if (r1 == 0) goto L97
                        r1.close()     // Catch: java.lang.Exception -> L90
                        goto L97
                    L90:
                        java.lang.String r1 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r1, r0)
                    L97:
                        if (r2 == 0) goto Lba
                        r2.disconnect()
                        return
                    L9d:
                        r2 = r1
                    L9e:
                        java.lang.String r3 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()     // Catch: java.lang.Throwable -> Lbb
                        java.lang.String r4 = "加载图片内存溢出异常"
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r3, r4)     // Catch: java.lang.Throwable -> Lbb
                        if (r1 == 0) goto Lb5
                        r1.close()     // Catch: java.lang.Exception -> Lae
                        goto Lb5
                    Lae:
                        java.lang.String r1 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r1, r0)
                    Lb5:
                        if (r2 == 0) goto Lba
                        r2.disconnect()
                    Lba:
                        return
                    Lbb:
                        r3 = move-exception
                    Lbc:
                        if (r1 == 0) goto Lc9
                        r1.close()     // Catch: java.lang.Exception -> Lc2
                        goto Lc9
                    Lc2:
                        java.lang.String r1 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.a()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r1, r0)
                    Lc9:
                        if (r2 == 0) goto Lce
                        r2.disconnect()
                    Lce:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.AnonymousClass11.run():void");
                }
            }, "ViloadImage").start();
        }
    }

    private static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            VerifyLogger.getInstance().eventBehavior(str, "", "", str2, map);
        }
    }

    private void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BioDetailActivity.a(BioDetailActivity.this).setClickable(z);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!CommonConstant.FACEID_PAY.equalsIgnoreCase(this.F) && !CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.F)) {
            return;
        }
        try {
            AuthenticatorManager.getInstance(this).stopAuth(this, Integer.valueOf(this.G).intValue());
            a(true);
        } catch (Throwable th) {
            VerifyLogCat.d(f5977a, th.getMessage());
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            notifyCancel();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MicroModuleContext.getInstance().onDestroyProManager();
        LocalBroadcastManager localBroadcastManager = this.U;
        if (localBroadcastManager == null) {
            return;
        }
        localBroadcastManager.unregisterReceiver(this.T);
        unregisterReceiver(this.T);
    }

    public static /* synthetic */ void a(BioDetailActivity bioDetailActivity, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97605a2a", new Object[]{bioDetailActivity, new Boolean(z)});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BioDetailActivity.this.showProgressDialog("", false, null);
                        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                        mICProdmngRequest.module = ModuleConstants.VI_MODULE_MENU;
                        mICProdmngRequest.action = "changeIntelligent";
                        mICProdmngRequest.params = new HashMap();
                        mICProdmngRequest.params.put("intelligentEnable", String.valueOf(z));
                        mICProdmngRequest.params.put("_rpcSource_", "ALIAPP");
                        Bundle bundle = BioDetailActivity.c(BioDetailActivity.this).getBundle("InitParams");
                        if (bundle != null) {
                            mICProdmngRequest.params.put("tbsid", bundle.getString("tbsid"));
                            String a2 = BioDetailActivity.a();
                            VerifyLogCat.i(a2, "tbsid:" + bundle.getString("tbsid"));
                        }
                        BioDetailActivity.a(BioDetailActivity.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest), z);
                    } catch (RpcException unused) {
                        BioDetailActivity.this.dismissProgressDialog();
                        BioDetailActivity.a(BioDetailActivity.this, (MICProdmngResponse) null, z);
                        VerifyLogCat.e(BioDetailActivity.a(), "RpcException");
                    }
                }
            }, "sendintelligentRpc");
        }
    }

    public static /* synthetic */ void a(BioDetailActivity bioDetailActivity, MICProdmngResponse mICProdmngResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8583f40a", new Object[]{bioDetailActivity, mICProdmngResponse, new Boolean(z)});
            return;
        }
        bioDetailActivity.dismissProgressDialog();
        if (mICProdmngResponse == null || !mICProdmngResponse.success) {
            if (z) {
                bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_open_fail), R.drawable.warning, 0);
                return;
            } else {
                bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_close_fail), R.drawable.warning, 0);
                return;
            }
        }
        Map<String, String> map = mICProdmngResponse.data;
        if (map != null) {
            bioDetailActivity.P = map.get("intelligentTitle");
            bioDetailActivity.Q = map.get("intelligentDesc");
        }
        if (StringUtils.isEmpty(bioDetailActivity.P)) {
            bioDetailActivity.P = "";
        }
        if (StringUtils.isEmpty(bioDetailActivity.Q)) {
            bioDetailActivity.Q = "";
        }
        if (z) {
            bioDetailActivity.R = true;
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_open_success), R.drawable.open_success, 0);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BioDetailActivity.d(BioDetailActivity.this);
                    }
                }
            });
            return;
        }
        bioDetailActivity.R = false;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BioDetailActivity.d(BioDetailActivity.this);
                }
            }
        });
        bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_close_success), R.drawable.open_success, 0);
    }

    public static /* synthetic */ void a(BioDetailActivity bioDetailActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac422aa", new Object[]{bioDetailActivity, bundle});
            return;
        }
        Intent intent = new Intent(bioDetailActivity, BioProtoActivity.class);
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    public static /* synthetic */ void a(BioDetailActivity bioDetailActivity, final String str, final String str2, final String str3, final Bundle bundle) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb52b8c", new Object[]{bioDetailActivity, str, str2, str3, bundle});
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(CommonConstant.alertTextColor, true);
        if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(bioDetailActivity.F)) {
            str4 = bioDetailActivity.getResources().getString(R.string.finger_closed_dialog_title);
            str5 = bioDetailActivity.getResources().getString(R.string.finger_closed_dialog_msg);
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(bioDetailActivity.F)) {
            str5 = bioDetailActivity.getResources().getString(R.string.face_closed_dialog_title);
            str4 = null;
        } else {
            str4 = null;
            str5 = null;
        }
        bioDetailActivity.alert(str4, str5, bioDetailActivity.getResources().getString(R.string.finger_closed_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    BioDetailActivity.a(BioDetailActivity.this, "close", str, str2, str3, bundle, new Bundle());
                }
            }
        }, bioDetailActivity.getResources().getString(R.string.finger_closed_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("selectCode", "0");
                hashMap.put("sceneId", BioDetailActivity.f(BioDetailActivity.this));
                BioDetailActivity.a(BioDetailActivity.this, "UC-MobileIC-20180315-4", "", hashMap);
            }
        }, bundle2);
    }

    public static /* synthetic */ void a(BioDetailActivity bioDetailActivity, String str, String str2, String str3, String str4, Bundle bundle, Bundle bundle2) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d71612", new Object[]{bioDetailActivity, str, str2, str3, str4, bundle, bundle2});
            return;
        }
        VerifyLogCat.d(f5977a, "进行开通:");
        String string2 = bundle2.getString("code");
        String string3 = bundle2.getString("alertText");
        if (bundle != null) {
            bundle.putString("alertText", string3);
        }
        String str5 = f5977a;
        VerifyLogCat.i(str5, "开通Code:" + string2);
        if ("not_exist_bic_feature".equalsIgnoreCase(string2)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(CommonConstant.alertTextColor, true);
            if ("1".equalsIgnoreCase(bioDetailActivity.G)) {
                string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_print);
            } else {
                string = "4".equalsIgnoreCase(bioDetailActivity.G) ? MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_print) : "";
            }
            MicroModuleContext.getInstance().alert(null, string, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_register), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AuthenticatorManager.getInstance(BioDetailActivity.this).startBioManager(Integer.valueOf(BioDetailActivity.g(BioDetailActivity.this)).intValue());
                    BioDetailActivity.a(BioDetailActivity.this, "UC-MobileIC-20190425-5", "", new HashMap());
                    BioDetailActivity.b(BioDetailActivity.this, "1003");
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioDetailActivity.b(BioDetailActivity.this, "1003");
                    BioDetailActivity.a(BioDetailActivity.this, "UC-MobileIC-20190425-6", "", new HashMap());
                }
            }, bundle3);
            return;
        }
        bioDetailActivity.a(false);
        BioOpenHandler bioOpenHandler = new BioOpenHandler();
        Bundle bundle4 = new Bundle();
        bundle4.putString(rrv.PRODUCT_ID, bioDetailActivity.F);
        bundle4.putString("status", str);
        bundle4.putString("token", str2);
        bundle4.putString("module", str3);
        bundle4.putString("action", str4);
        bundle4.putBundle("extParams", bundle);
        bioOpenHandler.a(bioDetailActivity, bundle4, new BioOpenHandler.BioOpenCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.BioOpenCallback
            public final void a(String str6, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123ece2", new Object[]{this, str6, new Boolean(z)});
                    return;
                }
                String a2 = BioDetailActivity.a();
                VerifyLogCat.i(a2, "DetailCode：" + str6);
                BioDetailActivity.c(BioDetailActivity.this, str6);
                if (z) {
                    BioDetailActivity.b(BioDetailActivity.this, true);
                } else {
                    BioDetailActivity.d(BioDetailActivity.this, str6);
                }
            }
        });
    }

    public static /* synthetic */ void c(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cde8f2", new Object[]{bioDetailActivity, str});
        } else if (ErrorConstant.ERRCODE_SYSTEM_ERROR.equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
        } else if ("OPEN_SUCCESS".equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
        } else if ("CLOSE_SUCCESS".equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.close_success), R.drawable.open_success, 0);
        } else if (!"RPC_EXCEPTION".equalsIgnoreCase(str)) {
        } else {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
        }
    }

    public static /* synthetic */ void d(BioDetailActivity bioDetailActivity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4fb0d1", new Object[]{bioDetailActivity, str});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioDetailActivity.b(BioDetailActivity.this, str);
                    if (!BioDetailActivity.j(BioDetailActivity.this)) {
                        return;
                    }
                    if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(BioDetailActivity.h(BioDetailActivity.this))) {
                        BioDetailActivity.e(BioDetailActivity.this, CommonConstant.FINGER_PAY_CLOSE_KEY);
                    } else if (!CommonConstant.FACEID_PAY.equalsIgnoreCase(BioDetailActivity.h(BioDetailActivity.this))) {
                    } else {
                        BioDetailActivity.e(BioDetailActivity.this, CommonConstant.FACEID_PAY_CLOSE_KEY);
                    }
                }
            }, 2000L);
        }
    }
}
