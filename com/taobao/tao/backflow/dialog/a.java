package com.taobao.tao.backflow.dialog;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.busniess.model.f;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.statistic.TBS;
import com.taobao.tao.backflow.mtop.TaoPassWordRequest;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import com.taobao.uikit.extend.feature.view.TPriceTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXSDKEngine;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.eby;
import tb.kge;
import tb.njn;
import tb.nyl;
import tb.nym;
import tb.nyq;
import tb.nyt;
import tb.nyy;
import tb.oau;
import tb.oaw;
import tb.oax;
import tb.oay;
import tb.obc;
import tb.obf;
import tb.obh;
import tb.obi;

/* loaded from: classes8.dex */
public class a extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int d;
    private static int e;
    private WeexBizView A;
    private f B;

    /* renamed from: a  reason: collision with root package name */
    private View f19835a;
    private View.OnClickListener b;
    private Context c;
    private boolean f;
    private boolean g;
    private b h;
    private String i;
    private ViewGroup j;
    private TpwdLoadingView k;
    private ViewGroup l;
    private ViewGroup m;
    private ViewGroup n;
    private ViewGroup o;
    private ViewGroup p;
    private ViewGroup q;
    private ViewStub r;
    private ViewStub s;
    private ViewStub t;
    private ViewStub u;
    private ViewStub v;
    private ViewStub w;
    private int x;
    private boolean y;
    private int z;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ ViewGroup a(a aVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a88f97d3", new Object[]{aVar, viewGroup});
        }
        aVar.q = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ ViewGroup a(a aVar, ViewGroup viewGroup, ViewStub viewStub, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("668a57b4", new Object[]{aVar, viewGroup, viewStub, new Integer(i)}) : aVar.a(viewGroup, viewStub, i);
    }

    public static /* synthetic */ WeexBizView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBizView) ipChange.ipc$dispatch("37e1a936", new Object[]{aVar}) : aVar.A;
    }

    public static /* synthetic */ void a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370c372f", new Object[]{aVar, view});
        } else {
            aVar.c(view);
        }
    }

    public static /* synthetic */ void a(a aVar, ViewGroup viewGroup, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5181772f", new Object[]{aVar, viewGroup, fVar});
        } else {
            aVar.a(viewGroup, fVar);
        }
    }

    public static /* synthetic */ void a(a aVar, oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73104870", new Object[]{aVar, oauVar});
        } else {
            aVar.a(oauVar);
        }
    }

    public static /* synthetic */ View.OnClickListener b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("a292f66d", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void b(a aVar, oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88a6eb1", new Object[]{aVar, oauVar});
        } else {
            aVar.b(oauVar);
        }
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d7f3b49", new Object[]{aVar})).booleanValue() : aVar.g;
    }

    public static /* synthetic */ ViewGroup d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("72ad70cf", new Object[]{aVar}) : aVar.q;
    }

    public static /* synthetic */ ViewStub e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewStub) ipChange.ipc$dispatch("5377e43b", new Object[]{aVar}) : aVar.v;
    }

    public static /* synthetic */ f f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9dcc7429", new Object[]{aVar}) : aVar.B;
    }

    public static /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1831849", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ TpwdLoadingView h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TpwdLoadingView) ipChange.ipc$dispatch("3d989d0", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ ViewGroup i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("57e59eea", new Object[]{aVar}) : aVar.j;
    }

    static {
        kge.a(40175058);
        d = 300;
        e = Result.ALIPAY_GENERATE_UNREG_NODE_FAILED;
    }

    public a(Context context, boolean z, String str) {
        super(context, R.style.ShareTBDialog);
        this.f = false;
        this.g = false;
        this.i = null;
        this.x = -1;
        this.y = true;
        this.z = 0;
        f();
        this.c = context;
        a(context, z, str);
        this.v = (ViewStub) findViewById(R.id.tpd_view_error);
        if (this.A == null) {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.j = (ViewGroup) findViewById(R.id.tpd_common_container);
        this.f19835a = findViewById(R.id.tpd_common_close);
        this.k = (TpwdLoadingView) findViewById(R.id.tpd_common_loading);
        this.r = (ViewStub) findViewById(R.id.tpd_view_shop);
        this.s = (ViewStub) findViewById(R.id.tpd_view_item);
        this.t = (ViewStub) findViewById(R.id.tpd_view_common);
        this.u = (ViewStub) findViewById(R.id.tpd_view_weex);
        this.w = (ViewStub) findViewById(R.id.tpd_view_anti_hijack);
        if (this.y) {
            return;
        }
        d = 200;
        this.k.findViewById(R.id.clip_tpd_loading_view1).setVisibility(8);
        this.k.getLayoutParams().height = nyq.a(this.c, d);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            if (obh.r()) {
                window.getDecorView().setSystemUiVisibility(3330);
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else {
            getWindow().addFlags(67108864);
        }
    }

    private void a(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b06cf3e", new Object[]{this, context, new Boolean(z), str});
            return;
        }
        LayoutInflater from = LayoutInflater.from(nym.a());
        String j = obh.j();
        if (obh.f(str)) {
            j = obh.x();
        }
        if ((obh.f(str) && !StringUtils.isEmpty(j)) || (WXSDKEngine.isInitialized() && !z && obh.c(str) && !StringUtils.isEmpty(j))) {
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_BackFlow", "WeexBackFlow", str, "weexUrl=" + j);
            this.A = new WeexBizView(context);
            com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKINITWEEX);
            this.A.initBackFlow(new AnonymousClass1(j, str), str);
            setContentView(this.A);
        } else {
            setContentView(from.inflate(R.layout.clip_taopassword_ui, (ViewGroup) null));
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        if (context instanceof Application) {
            getWindow().setType(2003);
        }
        setCanceledOnTouchOutside(false);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.tao.backflow.dialog.a.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 4 && keyEvent.getRepeatCount() == 0 && a.c(a.this)) {
                    com.taobao.share.clipboard.a.b(com.taobao.share.copy.a.a().h());
                }
                return false;
            }
        });
        if (context.getResources().getConfiguration().orientation != 1) {
            z2 = false;
        }
        this.y = z2;
        WindowManager windowManager = getWindow().getWindowManager();
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        if (height > width) {
            height = width;
        }
        this.z = height;
        this.x = (int) (height * 0.7733333333333333d);
    }

    /* renamed from: com.taobao.tao.backflow.dialog.a$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 implements WeexBizView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19836a;
        public final /* synthetic */ String b;

        public AnonymousClass1(String str, String str2) {
            this.b = str;
            this.f19836a = str2;
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            com.taobao.android.share.resource.a.a().a(a.a(a.this), com.taobao.android.share.resource.a.SHARE_BACKFLOW_DESTROYE);
            a.a(a.this).clear();
            a.b(a.this).onClick(null);
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(WeexBizView weexBizView, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48e048d7", new Object[]{this, weexBizView, view});
            } else {
                com.taobao.android.share.resource.a.a().a(a.a(a.this), com.taobao.android.share.resource.a.SHARE_BACKFLOW_CREATE, com.taobao.android.share.resource.a.SHARE_BACKFLOW_PAGENAME, this.b, null);
            }
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(WeexBizView weexBizView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98ac8c1b", new Object[]{this, weexBizView});
                return;
            }
            String str = this.f19836a;
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_BackFlow", "WeexRenderError", str, "weexUrl=" + this.b + ",err=" + weexBizView.getTag().toString());
            com.taobao.android.share.resource.a.a().a(a.a(a.this), com.taobao.android.share.resource.a.SHARE_BACKFLOW_DESTROYE);
            a.a(a.this).post(new Runnable() { // from class: com.taobao.tao.backflow.dialog.a.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AnonymousClass1.this.a();
                    com.taobao.share.copy.a.a().k();
                    com.taobao.share.copy.a.a().a((f) null);
                    com.taobao.share.copy.a.a().a(0);
                }
            });
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
                return;
            }
            com.taobao.android.share.resource.a.a().a(a.a(a.this), com.taobao.android.share.resource.a.SHARE_BACKFLOW_DESTROYE);
            a.a(a.this).clear();
            com.taobao.share.copy.a.a().f().J = str;
            com.taobao.share.copy.a.a().f().K = map;
            String str2 = "update url:" + str;
            a.b(a.this).onClick(a.a(a.this));
        }
    }

    public void a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7867cbc8", new Object[]{this, onClickListener, onClickListener2});
            return;
        }
        View view = this.f19835a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        this.b = onClickListener2;
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.f19835a.setOnClickListener(onClickListener);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = true;
        a((View) null);
        this.f19835a.setVisibility(0);
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a4aa09", new Object[]{this, fVar});
        } else if (this.A != null) {
            b(fVar);
        } else {
            ViewGroup viewGroup = null;
            if (fVar == null || !StringUtils.isEmpty(fVar.F)) {
                if (nyl.b(fVar != null ? fVar.F : null)) {
                    ViewGroup viewGroup2 = this.q;
                    if (viewGroup2 == null) {
                        this.q = a(viewGroup2, this.v, R.id.tpd_view_error);
                    }
                    g();
                    a(this.q, fVar);
                    viewGroup = this.q;
                } else {
                    com.taobao.share.copy.a.a().k();
                }
            } else {
                ViewGroup viewGroup3 = this.q;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                viewGroup = c(fVar);
                if (viewGroup == null) {
                    ViewGroup viewGroup4 = this.q;
                    if (viewGroup4 == null) {
                        this.q = a(viewGroup4, this.v, R.id.tpd_view_error);
                    }
                    g();
                    a(this.q, fVar);
                    viewGroup = this.q;
                }
            }
            if (this.f) {
                b(viewGroup);
            } else {
                this.j.setVisibility(0);
                this.k.setVisibility(4);
            }
            this.f = false;
        }
    }

    private void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17d4468", new Object[]{this, fVar});
            return;
        }
        com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKRENDER);
        if (fVar == null || !StringUtils.isEmpty(fVar.F)) {
            com.taobao.share.copy.a.a().k();
            return;
        }
        String j = obh.j();
        if (obh.f(fVar.x)) {
            j = obh.x();
        }
        try {
            Map<String, String> map = (Map) JSON.parseObject(fVar.H.get(MspGlobalDefine.EXTENDINFO), Map.class);
            if (fVar instanceof oay) {
                oay oayVar = (oay) fVar;
                map.put("taopassword_ownerName", oayVar.S);
                map.put("taopassword_ownerId", oayVar.T);
                map.put("taopassword_url", oayVar.z);
            }
            map.put("share_weex_backflow_data", fVar.M);
            map.put("launcherParams", fVar.W);
            if ("true".equals(obh.k()) && !obh.f(fVar.x)) {
                String str = ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext().getFilesDir().getAbsolutePath() + File.separator + obf.KEY_SHARE_BACKFLOW_JS;
                if ("true".equals(obc.b(this.c, obf.KEY_SHARE_BACKFLOW))) {
                    if (new File(str).exists()) {
                        this.A.render("file://" + str, map);
                        nyy.a("render weex url by file cache,path=" + str);
                    } else {
                        this.A.render(j, map);
                        nyy.a("render weex url by url, url=" + j);
                    }
                } else {
                    this.A.render(j, map);
                    nyy.a("render weex url by netowrk, url=" + j);
                }
                obf.a(ShareBizAdapter.getInstance().getAppEnv().b(), j, obf.KEY_SHARE_BACKFLOW_JS, obf.KEY_SHARE_BACKFLOW, false);
            } else {
                this.A.render(j, map);
                nyy.a("orange close, render weex url by netowrk,url=" + j);
            }
            d(fVar);
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c("NewTaoPasswordDialog", "render err: " + th.toString());
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_BackFlow", "WeexSetDataError", fVar.x, "weexUrl=" + j + ",err=" + th.toString());
            com.taobao.share.copy.a.a().k();
        }
        String str2 = fVar.y + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + fVar.A + "," + fVar.x;
        if (fVar instanceof oay) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(",");
            oay oayVar2 = (oay) fVar;
            sb.append(oayVar2.p);
            sb.append(",");
            sb.append(oayVar2.U);
            str2 = sb.toString();
        }
        TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewShow", fVar.x, fVar.y, str2 + "," + e.b().m());
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.q.setVisibility(0);
        d(this.q);
    }

    private void a(ViewGroup viewGroup, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac00bea", new Object[]{this, viewGroup, fVar});
            return;
        }
        if (!this.y) {
            viewGroup.getLayoutParams().height = nyq.a(this.c, 200.0f);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_error_description);
        TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_error_icon);
        ((TextView) viewGroup.findViewById(R.id.tpd_error_action)).setVisibility(8);
        if (fVar == null) {
            textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17876));
            tUrlImageView.asyncSetImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Ba48wr1dRlADInLvO_!!6000000003733-2-tps-440-440.png");
        } else if (StringUtils.equals("PASSWORD_INVALID", fVar.F) || StringUtils.equals("PASSWORD_NOT_EXIST", fVar.F)) {
            textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17855));
            tUrlImageView.asyncSetImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01lAMzMc1jrlLVhW0b6_!!6000000004602-2-tps-330-330.png");
        } else {
            textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17876));
            tUrlImageView.asyncSetImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Ba48wr1dRlADInLvO_!!6000000003733-2-tps-440-440.png");
        }
    }

    private ViewGroup c(f fVar) {
        oau oauVar;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b29b8b6e", new Object[]{this, fVar});
        }
        String str = fVar.y;
        if (!(fVar instanceof oau)) {
            return null;
        }
        d(fVar);
        if (StringUtils.equals((String) a(fVar.H, "weakShow", ""), "1")) {
            this.p = a(this.p, this.w, R.id.tpd_view_anti_hijack);
            ViewGroup viewGroup2 = this.p;
            b(viewGroup2, (oau) fVar);
            viewGroup = viewGroup2;
        } else if (TemplateId.ITEM.equals(str)) {
            this.m = a(this.m, this.s, R.id.tpd_view_item);
            viewGroup = this.m;
            a(viewGroup, (oaw) fVar);
        } else if (TemplateId.SHOP.equals(str)) {
            this.l = a(this.l, this.r, R.id.tpd_view_shop);
            viewGroup = this.l;
            a(viewGroup, (oax) fVar);
        } else if (TemplateId.WEEX.equals(str) && this.y) {
            oay oayVar = (oay) fVar;
            if (this.o == null) {
                this.o = (ViewGroup) this.u.inflate().findViewById(R.id.tpd_view_weex);
                if (!StringUtils.isEmpty(oayVar.U)) {
                    if (oayVar.U.contains("bigMode")) {
                        this.o.getLayoutParams().height = nyq.a(this.c, 494.0f);
                    } else {
                        this.o.getLayoutParams().height = nyq.a(this.c, 332.0f);
                    }
                }
                a(this.o.getLayoutParams());
            }
            this.o.setVisibility(0);
            viewGroup = this.o;
            a(viewGroup, oayVar);
        } else {
            if (StringUtils.isEmpty(str)) {
                oauVar = e(fVar);
            } else {
                oauVar = (oau) fVar;
            }
            this.n = a(this.n, this.t, R.id.tpd_view_common);
            viewGroup = this.n;
            a(viewGroup, oauVar);
        }
        String str2 = str + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + fVar.A + "," + fVar.x;
        if (fVar instanceof oay) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(",");
            oay oayVar2 = (oay) fVar;
            sb.append(oayVar2.p);
            sb.append(",");
            sb.append(oayVar2.U);
            str2 = sb.toString();
        }
        TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewShow", fVar.x, fVar.y, str2 + "," + e.b().m());
        return viewGroup;
    }

    private void d(final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2e7926", new Object[]{this, fVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.backflow.dialog.a.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put(LoadingChatActivity.LOAD_CHAT_KEY, fVar.z);
                        TFCCommonUtils.a(TFCCommonUtils.FlowType.SHARE, fVar.z, hashMap);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        nyy.c("NewTaoPasswordDialog", "handleFlowParams err:" + th.getMessage());
                    }
                }
            });
        }
    }

    private ViewGroup a(ViewGroup viewGroup, ViewStub viewStub, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1fc8ec6f", new Object[]{this, viewGroup, viewStub, new Integer(i)});
        }
        if (viewGroup == null) {
            if (viewStub != null) {
                viewStub.inflate();
            }
            viewGroup = (ViewGroup) findViewById(i);
            a(viewGroup.getLayoutParams());
        }
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    private void a(final ViewGroup viewGroup, final oay oayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dd09d0", new Object[]{this, viewGroup, oayVar});
            return;
        }
        d(viewGroup);
        String str = oayVar.H.get(MspGlobalDefine.EXTENDINFO);
        final WeexBizView weexBizView = (WeexBizView) viewGroup.findViewById(R.id.tpd_weex_view);
        viewGroup.setVisibility(0);
        weexBizView.init(new WeexBizView.a() { // from class: com.taobao.tao.backflow.dialog.a.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(WeexBizView weexBizView2, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("48e048d7", new Object[]{this, weexBizView2, view});
                }
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(WeexBizView weexBizView2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98ac8c1b", new Object[]{this, weexBizView2});
                    return;
                }
                viewGroup.setVisibility(4);
                if (a.d(a.this) == null) {
                    a aVar = a.this;
                    a.a(aVar, a.a(aVar, a.d(aVar), a.e(a.this), R.id.tpd_view_error));
                }
                a aVar2 = a.this;
                a.a(aVar2, a.d(aVar2), oayVar);
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(String str2, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20476513", new Object[]{this, str2, map});
                    return;
                }
                weexBizView.clear();
                com.taobao.share.copy.a.a().f().J = str2;
                com.taobao.share.copy.a.a().f().K = map;
                String str3 = "update url:" + str2;
                a.b(a.this).onClick(weexBizView);
            }
        });
        try {
            Map<String, String> map = (Map) JSON.parseObject(str, Map.class);
            map.put("taopassword_ownerName", oayVar.S);
            map.put("taopassword_ownerId", oayVar.T);
            map.put("taopassword_url", oayVar.z);
            weexBizView.render(oayVar.U, map);
        } catch (Exception unused) {
        }
        c(viewGroup, oayVar);
    }

    private void a(final ViewGroup viewGroup, oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67db3854", new Object[]{this, viewGroup, oauVar});
            return;
        }
        d(viewGroup);
        if (this.y) {
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_common_img);
            if (!StringUtils.isEmpty(oauVar.P)) {
                tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.backflow.dialog.a.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        viewGroup.findViewById(R.id.tpd_common_img_default).setVisibility(4);
                        return false;
                    }
                });
                tUrlImageView.setImageUrl(oauVar.P);
            }
        } else {
            viewGroup.findViewById(R.id.tpd_common_top_area).setVisibility(8);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_common_text);
        textView.setText(oauVar.N);
        c(viewGroup, oauVar);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tpd_common_action);
        textView2.setOnClickListener(this.b);
        a(textView2, textView, (TextView) null);
    }

    private void a(final ViewGroup viewGroup, oax oaxVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dc9571", new Object[]{this, viewGroup, oaxVar});
            return;
        }
        d(viewGroup);
        if (this.y) {
            try {
                str = new JSONObject(oaxVar.H == null ? null : oaxVar.H.get(MspGlobalDefine.EXTENDINFO)).getString("shopSignPic");
            } catch (Throwable unused) {
                str = oaxVar.P;
            }
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_shop_sign);
            if (!StringUtils.isEmpty(str)) {
                tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.backflow.dialog.a.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        viewGroup.findViewById(R.id.tpd_shop_sign_default).setVisibility(4);
                        return false;
                    }
                });
                tUrlImageView.setImageUrl(str);
            }
        } else {
            viewGroup.findViewById(R.id.tpd_shop_top_area).setVisibility(8);
        }
        ((TUrlImageView) viewGroup.findViewById(R.id.tpd_shop_logo)).setImageUrl(oaxVar.P);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_shop_name);
        textView.setText(oaxVar.N);
        ((TUrlImageView) viewGroup.findViewById(R.id.tpd_shop_grade)).setImageUrl(oaxVar.U);
        c(viewGroup, oaxVar);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tpd_shop_action);
        textView2.setOnClickListener(this.b);
        a(textView2, textView, (TextView) null);
    }

    private void b(ViewGroup viewGroup, oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b830bd5", new Object[]{this, viewGroup, oauVar});
            return;
        }
        d(viewGroup);
        TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_image);
        if (this.y) {
            tUrlImageView.setErrorImageResId(R.drawable.tb_image_error);
            tUrlImageView.setImageUrl(oauVar.P);
        } else {
            tUrlImageView.setVisibility(8);
        }
        View findViewById = viewGroup.findViewById(R.id.contacts_share_anti_hijack_title_layout);
        ((TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_item_name)).setText(oauVar.N);
        TextView textView = (TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_title_view);
        textView.setOnClickListener(this.b);
        ((TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_go_on)).setOnClickListener(this.b);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_report);
        textView2.setOnClickListener(this.b);
        String f = obi.a.f();
        int h = obi.a.h();
        int g = obi.a.g();
        if (!StringUtils.isEmpty(f)) {
            textView.setText(f);
        }
        if (h != -1 && findViewById != null) {
            findViewById.setBackgroundColor(h);
        }
        if (g != -1) {
            textView2.setTextColor(g);
        }
        TBS.Ext.commitEvent("WeakShowPop", 19999, "WeakShowPop_Show", oauVar.m + "," + nyt.a(oauVar), oauVar.z);
    }

    private void a(final ViewGroup viewGroup, oaw oawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dc2112", new Object[]{this, viewGroup, oawVar});
            return;
        }
        d(viewGroup);
        if (this.y) {
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_item_img);
            if (!StringUtils.isEmpty(oawVar.P)) {
                tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.backflow.dialog.a.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        viewGroup.findViewById(R.id.tpd_item_img_default).setVisibility(4);
                        return false;
                    }
                });
                tUrlImageView.setImageUrl(oawVar.P);
            }
        } else {
            viewGroup.findViewById(R.id.tpd_item_top_area).setVisibility(8);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_item_action);
        textView.setOnClickListener(this.b);
        if (oawVar.H != null) {
            Map<String, Object> map = oawVar.I;
            if (map != null && !StringUtils.isEmpty(String.valueOf(map.get("tipimage")))) {
                TUrlImageView tUrlImageView2 = (TUrlImageView) viewGroup.findViewById(R.id.tpd_item_tag_image);
                tUrlImageView2.setVisibility(0);
                tUrlImageView2.setImageUrl(String.valueOf(map.get("tipimage")));
            }
            if (map != null && !StringUtils.isEmpty(String.valueOf(map.get("buttonText")))) {
                textView.setText(String.valueOf(map.get("buttonText")));
            }
        }
        TPriceTextView tPriceTextView = (TPriceTextView) viewGroup.findViewById(R.id.tpd_item_price);
        try {
            float floatValue = Float.valueOf(oawVar.U).floatValue();
            tPriceTextView.setVisibility(0);
            tPriceTextView.setPrice(floatValue);
        } catch (Exception unused) {
            if (!StringUtils.isEmpty(oawVar.U)) {
                tPriceTextView.setVisibility(0);
                tPriceTextView.setText("¥ " + oawVar.U);
            } else {
                tPriceTextView.setVisibility(4);
            }
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tpd_item_content);
        textView2.setText(oawVar.N);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
        marginLayoutParams.leftMargin = marginLayoutParams.rightMargin;
        textView2.setLayoutParams(marginLayoutParams);
        c(viewGroup, oawVar);
        a(textView, textView2, tPriceTextView);
    }

    public void a(final View view, TextView textView, TextView textView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c56496a", new Object[]{this, view, textView, textView2});
        } else if (view == null) {
        } else {
            String b = obi.a.b();
            int a2 = obi.a.a();
            if (!StringUtils.isEmpty(b)) {
                com.taobao.phenix.intf.b.h().a(b).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.backflow.dialog.a.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            if (succPhenixEvent.getDrawable() instanceof com.taobao.phenix.cache.memory.f) {
                                ((com.taobao.phenix.cache.memory.f) succPhenixEvent.getDrawable()).a();
                            }
                            view.setBackground(drawable);
                        }
                        return false;
                    }
                }).fetch();
            }
            if (a2 != -1 && (view instanceof TextView)) {
                ((TextView) view).setTextColor(a2);
            }
            int b2 = obi.b();
            if (b2 != -1 && textView != null) {
                textView.setTextColor(b2);
            }
            int a3 = obi.a();
            if (a3 == -1 || textView2 == null) {
                return;
            }
            textView2.setTextColor(a3);
        }
    }

    private void c(ViewGroup viewGroup, final oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2adf56", new Object[]{this, viewGroup, oauVar});
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_common_area_ownerInfo);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ll_report);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.arrow);
        if (textView == null || oauVar == null) {
            return;
        }
        String d2 = obi.a.d();
        if (StringUtils.isEmpty(d2)) {
            d2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17860);
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.backflow.dialog.a.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.a(a.this, oauVar);
                }
            }
        });
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        textView.setText(d2);
        String e2 = obi.a.e();
        if (StringUtils.isEmpty(e2)) {
            e2 = "https://gw.alicdn.com/tfs/TB1KjBDxHGYBuNjy0FoXXciBFXa-41-41.png";
        }
        ((TUrlImageView) viewGroup.findViewById(R.id.iv_report)).setImageUrl(e2);
        TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.iv_header);
        if (oauVar.H.get("ownerFace") != null && tUrlImageView != null) {
            tUrlImageView.setImageUrl(oauVar.H.get("ownerFace"));
            tUrlImageView.setVisibility(0);
        } else if (tUrlImageView != null) {
            tUrlImageView.setVisibility(4);
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_desc_title);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ll_image);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.iv_share_tip);
        String str = oauVar.S;
        if (StringUtils.isEmpty(str)) {
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() > 7) {
            sb.append(str.charAt(0));
            sb.append("**");
            sb.append(str.charAt(str.length() - 1));
        } else {
            sb.append(str);
        }
        if (textView2 == null || textView3 == null) {
            return;
        }
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView2.setText(sb);
        int c = obi.a.c();
        if (c != -1) {
            textView2.setTextColor(c);
        }
        if (viewGroup2 == null || !StringUtils.equals(oauVar.C, "true") || StringUtils.isEmpty(oauVar.D)) {
            return;
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) viewGroup2.findViewWithTag("friendFlagIv");
        if (tUrlImageView2 == null) {
            tUrlImageView2 = new TUrlImageView(this.c);
        } else {
            viewGroup2.removeView(tUrlImageView2);
        }
        int a2 = nyq.a(39.0f);
        int a3 = nyq.a(17.0f);
        int a4 = nyq.a(this.c, 2.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a3);
        layoutParams.gravity = 16;
        layoutParams.rightMargin = a4;
        layoutParams.leftMargin = a4;
        tUrlImageView2.setLayoutParams(layoutParams);
        tUrlImageView2.setTag("friendFlagIv");
        tUrlImageView2.setImageUrl(oauVar.D);
        viewGroup2.addView(tUrlImageView2, viewGroup2.indexOfChild(textView2) + 1);
    }

    private void a(final oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78bf315", new Object[]{this, oauVar});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.c, R.style.NormalDialogStyle);
        View inflate = getLayoutInflater().inflate(R.layout.taopassword_report_layout, (ViewGroup) null);
        final AlertDialog create = builder.create();
        ((TextView) inflate.findViewById(R.id.tv_canle)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.backflow.dialog.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    create.dismiss();
                }
            }
        });
        ((TextView) inflate.findViewById(R.id.tv_confirm)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.backflow.dialog.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                create.dismiss();
                a.b(a.this, oauVar);
            }
        });
        create.show();
        create.getWindow().setContentView(inflate);
    }

    private void b(oau oauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60ef996", new Object[]{this, oauVar});
            return;
        }
        TaoPassWordRequest taoPassWordRequest = new TaoPassWordRequest();
        if (oauVar.f19657a.f19658a != null) {
            taoPassWordRequest.setPasswordContent(oauVar.f19657a.f19658a);
        } else {
            taoPassWordRequest.setPasswordContent(oauVar.N);
        }
        final String passwordContent = taoPassWordRequest.getPasswordContent();
        RemoteBusiness.build((IMTOPDataObject) taoPassWordRequest, ShareBizAdapter.getInstance().getAppEnv().a()).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.backflow.dialog.NewTaoPasswordDialog$12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    AppMonitor.Alarm.commitFail("share", "userTipOff", "SHARE_USERTIPOFF_FAILED", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17853), passwordContent);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                TBToast.makeText(nym.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17866)).show();
                AppMonitor.Alarm.commitSuccess("share", "userTipOff", passwordContent);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    AppMonitor.Alarm.commitFail("share", "userTipOff", "SHARE_USERTIPOFF_FAILED", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17853), passwordContent);
                }
            }
        }).startRequest();
    }

    private oau e(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oau) ipChange.ipc$dispatch("c0f622de", new Object[]{this, fVar});
        }
        oau oauVar = new oau();
        try {
            oauVar.N = fVar.H.remove("content");
            oauVar.O = fVar.H.remove("title");
            oauVar.P = fVar.H.remove(eby.KEY_PIC_URL);
            oauVar.Q = fVar.H.remove("leftButtonText");
            oauVar.R = fVar.H.remove("rightButtonText");
        } catch (Throwable unused) {
            TLog.logi("TaoPasswordDialog", " parseCommonData error.");
        }
        oauVar.m = fVar.x;
        oauVar.y = fVar.y;
        oauVar.z = fVar.z;
        oauVar.i = fVar.A;
        oauVar.B = fVar.B;
        oauVar.E = fVar.E;
        oauVar.F = fVar.F;
        oauVar.G = fVar.G;
        oauVar.H = fVar.H;
        return oauVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i = ShareBizAdapter.getInstance().getAppEnv().d();
        if (StringUtils.isEmpty(this.i)) {
            TLog.loge("NewTaoPasswordDialog", "mCurPageName", "mCurPageName isEmpty just show");
            show();
            return;
        }
        this.B = com.taobao.share.copy.a.a().f();
        new AsyncTaskC0826a(this).execute(this.B);
    }

    /* renamed from: com.taobao.tao.backflow.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class AsyncTaskC0826a extends AsyncTask<f, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f19852a;

        static {
            kge.a(395365904);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Boolean doInBackground(f[] fVarArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, fVarArr}) : a(fVarArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public AsyncTaskC0826a(a aVar) {
            this.f19852a = new WeakReference<>(aVar);
        }

        public Boolean a(f... fVarArr) {
            f fVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("e004121", new Object[]{this, fVarArr});
            }
            if (this.f19852a.get() != null && (fVar = fVarArr[0]) != null) {
                String str = fVar.x;
                if (nyl.d(str)) {
                    if (!SpUtils.getPlayTogetherIsShowing()) {
                        SpUtils.saveShareShowingTimestamp(System.currentTimeMillis());
                    } else {
                        nyy.a("【异常】一起逛不弹淘口令，bizId=" + str);
                        return false;
                    }
                }
            }
            return true;
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
            } else if (bool.booleanValue()) {
                a aVar = this.f19852a.get();
                if (aVar != null) {
                    if (aVar.c() == null) {
                        aVar.a(new b(aVar));
                    }
                    boolean a2 = njn.a(aVar.d()).a(aVar.c());
                    nyy.a("调用IPopCenter#addPopOperation,result=" + a2);
                    return;
                }
                nyy.a("【异常】dialog=null");
            } else {
                nyy.a("【异常】isNeedShowing=false");
            }
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7dc122", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bd58966", new Object[]{this}) : this.h;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        nyy.a("淘口令弹窗dismiss");
        if (this.h != null && !StringUtils.isEmpty(this.i)) {
            nyy.a("invoke IPopCenter#finishPopOperation, mCurPageName=" + this.i);
            njn.a(this.i).b(this.h);
        }
        super.dismiss();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.tao.backflow.dialog.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.f(a.this) == null || !nyl.d(a.f(a.this).x)) {
                } else {
                    SpUtils.saveShareShowingTimestamp(0L);
                }
            }
        });
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.f = true;
        if (view == null) {
            this.k.setVisibility(0);
            e(this.k);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            this.k.startAnimation(scaleAnimation);
        } else if (view.getParent() == null || view.getParent() != this.j) {
        } else {
            int a2 = nyq.a(this.c, d);
            int a3 = nyq.a(this.c, e);
            int height = view.getHeight();
            int width = view.getWidth();
            e(this.k);
            if (a2 != height || a3 != width) {
                ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
                layoutParams.height = height;
                layoutParams.width = width;
                this.k.setLayoutParams(layoutParams);
                this.k.setVisibility(0);
                float f = a3 / width;
                float f2 = a2 / height;
                String.format("loading scalex:%s,y:%s. target(x:%s,y:%s)", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(width), Integer.valueOf(height));
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, f, 1.0f, f2, 1, 0.5f, 1, 0.0f);
                scaleAnimation2.setDuration(300L);
                scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation2.setFillAfter(false);
                scaleAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.backflow.dialog.a.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        } else {
                            a.g(a.this);
                        }
                    }
                });
                this.k.setAnimation(scaleAnimation2);
                scaleAnimation2.start();
                return;
            }
            h();
        }
    }

    private void b(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            e(this.k);
            this.k.setVisibility(0);
            view.setVisibility(4);
            this.j.setVisibility(4);
            int height = this.k.getHeight();
            int width = this.k.getWidth();
            int i = view.getLayoutParams().height;
            int i2 = view.getLayoutParams().width;
            if (i == 0 || i2 == 0) {
                i = nyq.a(getContext(), 332.0f);
                i2 = nyq.a(getContext(), 290.0f);
            }
            if (height != i || width != i2) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, i2 / width, 1.0f, i / height, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(400L);
                scaleAnimation.setFillAfter(false);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.backflow.dialog.a.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        } else {
                            a.h(a.this).setInnerViewsVisibility(false);
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                            return;
                        }
                        view.setVisibility(0);
                        a.i(a.this).setVisibility(0);
                        a.h(a.this).setInnerViewsVisibility(true);
                        a.a(a.this, view);
                    }
                });
                this.k.setVisibility(0);
                this.k.setAnimation(scaleAnimation);
                scaleAnimation.startNow();
                return;
            }
            c(view);
        }
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            return;
        }
        e(view);
        view.setVisibility(0);
        this.j.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.k.getAlpha(), 0.0f);
        alphaAnimation.setDuration(300L);
        this.k.setAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.backflow.dialog.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    a.h(a.this).setVisibility(4);
                }
            }
        });
        alphaAnimation.startNow();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.k.setVisibility(0);
        if (this.k.getAlpha() == 1.0f) {
            return;
        }
        e(this.k);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.k.getAlpha(), 1.0f);
        alphaAnimation.setDuration(200L);
        this.k.setAnimation(alphaAnimation);
        alphaAnimation.startNow();
    }

    private void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup != null && view != viewGroup) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.m;
        if (viewGroup2 != null && view != viewGroup2) {
            viewGroup2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.n;
        if (viewGroup3 != null && view != viewGroup3) {
            viewGroup3.setVisibility(8);
        }
        ViewGroup viewGroup4 = this.o;
        if (viewGroup4 != null && view != viewGroup4) {
            viewGroup4.setVisibility(8);
        }
        ViewGroup viewGroup5 = this.p;
        if (viewGroup5 != null && view != viewGroup5) {
            viewGroup5.setVisibility(8);
        }
        ViewGroup viewGroup6 = this.q;
        if (viewGroup6 == null || view == viewGroup6) {
            return;
        }
        viewGroup6.setVisibility(8);
    }

    private void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else {
            view.animate().cancel();
        }
    }

    private void a(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85567735", new Object[]{this, layoutParams});
        } else if (this.x < 0) {
        } else {
            if (this.y) {
                int i = layoutParams.width;
                int i2 = this.x;
                layoutParams.width = i2;
                layoutParams.height = (int) ((layoutParams.height * (i2 / i)) + 20.0d);
                return;
            }
            int i3 = this.z;
            layoutParams.width = (int) ((i3 / 750.0f) * 640.0f);
            layoutParams.height = (int) (((i3 / 750.0f) - 80.0f) * 418.0f);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!nyl.b("RETRY_PASSWORD")) {
            com.taobao.share.copy.a.a().k();
        } else {
            ViewGroup viewGroup = this.q;
            if (viewGroup == null) {
                this.q = a(viewGroup, this.v, R.id.tpd_view_error);
            }
            a(this.q, (f) null);
            ((TextView) this.q.findViewById(R.id.tpd_error_description)).setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17848));
            TextView textView = (TextView) this.q.findViewById(R.id.tpd_error_action);
            textView.setVisibility(0);
            textView.setOnClickListener(this.b);
            if (!this.f) {
                return;
            }
            this.f = false;
            b(this.q);
        }
    }

    public static <K, V> V a(Map<K, V> map, K k, V v) {
        V v2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("d5e2037d", new Object[]{map, k, v}) : (map == null || map.isEmpty() || (v2 = map.get(k)) == null) ? v : v2;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        nyy.a("淘口令弹窗show");
    }
}
