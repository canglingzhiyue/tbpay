package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.qrcode.result.Result;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.busniess.model.f;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Properties;
import mtopsdk.mtop.domain.MtopRequest;

/* loaded from: classes8.dex */
public class odk implements View.OnClickListener, nyz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f31945a;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static odk f31950a;

        static {
            kge.a(-1649731719);
            f31950a = new odk();
        }

        public static /* synthetic */ odk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (odk) ipChange.ipc$dispatch("f089ea8", new Object[0]) : f31950a;
        }
    }

    static {
        kge.a(52525734);
        kge.a(-1201612728);
        kge.a(491820887);
    }

    public static /* synthetic */ void a(odk odkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b1ade2", new Object[]{odkVar});
        } else {
            odkVar.f();
        }
    }

    public static odk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (odk) ipChange.ipc$dispatch("f089ea8", new Object[0]) : a.a();
    }

    private odk() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (com.taobao.share.copy.a.a().g() != null) {
            nyy.a("ClipUrlWatcherControl", " showDialogWithLoading ！=null");
        } else {
            if (com.taobao.share.copy.a.a().g() == null) {
                a(com.taobao.share.copy.a.a().e());
            }
            if (com.taobao.share.copy.a.a().g() == null) {
                nyy.a("ClipUrlWatcherControl", " Init ClipUrlDialog failed!");
                return;
            }
            f();
            ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).a();
            ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).b();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String p = com.taobao.share.copy.a.a().p();
        if (StringUtils.isEmpty(p)) {
            com.taobao.share.copy.a.a().k();
            nyy.a("ClipUrlWatcherControl", b.a(R.string.taobao_app_1010_1_17880));
            return;
        }
        if (!a(this.f31945a, com.taobao.share.copy.a.a().e())) {
            com.taobao.share.copy.a.a().k();
            a(com.taobao.share.copy.a.a().e());
        } else if (com.taobao.share.copy.a.a().g() == null) {
            a(com.taobao.share.copy.a.a().e());
        }
        if (com.taobao.share.copy.a.a().g() == null) {
            nyy.a("ClipUrlWatcherControl", " Init ClipUrlDialog failed!");
            return;
        }
        ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).a(new View.OnClickListener() { // from class: tb.odk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.share.clipboard.a.b(com.taobao.share.copy.a.a().h());
                com.taobao.share.copy.a.a().k();
                com.taobao.share.copy.a.a().a((f) null);
                com.taobao.share.copy.a.a().a(0);
                TBS.Ext.commitEvent("CopyTips_TimeOut_Close", (Properties) null);
            }
        }, new View.OnClickListener() { // from class: tb.odk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TLog.logi("ClipUrlWatcherControl", "click re-loading");
                com.taobao.share.copy.a.a().a(1);
                com.taobao.share.copy.a.a().a((f) null);
                com.taobao.share.copy.a.a().b((Map<String, Object>) null);
                odk.a(odk.this);
                com.taobao.share.copy.a.a().g();
                TBS.Ext.commitEvent("CopyTips_TimeOut_Reload", (Properties) null);
            }
        });
        if (com.taobao.share.copy.a.a().g() == null) {
            nyy.a("ClipUrlWatcherControl", "Init ClipUrlDialog failed!");
            return;
        }
        ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).a(p);
        try {
            if (com.taobao.share.copy.a.a().g() != null) {
                ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).b();
                nyy.b("ClipUrlWatcherControl", "ok, final showWithPopUpCenter");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TBS.Ext.commitEvent("Page_Extend_ShowCopy_timeOut", (Properties) null);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).a(new View.OnClickListener() { // from class: tb.odk.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TBS.Ext.commitEvent("Page_Extend_CloseLoading", (Properties) null);
                    TLog.logi("ClipUrlWatcherControlImp", "closeWithParam loading_close");
                    com.taobao.share.copy.a.a().b(true);
                    com.taobao.share.copy.a.a().m();
                    com.taobao.share.copy.a.a().a((f) null);
                    com.taobao.share.clipboard.a.b(com.taobao.share.copy.a.a().h());
                    com.taobao.share.copy.a.a().k();
                }
            });
        }
    }

    @Override // tb.nyz
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKSHOWDIALOG);
        if (com.taobao.share.copy.a.a().n()) {
            nyy.a("ClipUrlWatcherControl", " showTaoPasswordStop true");
        } else if (i == 1) {
            b();
        } else if (i == 2) {
            d();
        } else if (i == 3) {
            d();
        } else if (i != 4) {
        } else {
            c();
        }
    }

    public void d() {
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g();
        if (com.taobao.share.copy.a.a().g() == null || com.taobao.share.copy.a.a().e() == null || (weakReference = this.f31945a) == null || weakReference.get() == null || this.f31945a.get().isFinishing()) {
            return;
        }
        ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).b();
        if (com.taobao.share.copy.a.a().f() == null) {
            return;
        }
        String str = com.taobao.share.copy.a.a().f().F;
        if (!StringUtils.isEmpty(str) && !StringUtils.equals("PASSWORD_INVALID", str)) {
            if (StringUtils.equals("PASSWORD_NOT_EXIST", str)) {
                TBS.Ext.commitEvent("Page_Extend_ShowCopy_notExist", (Properties) null);
            } else {
                TBS.Ext.commitEvent("Page_Extend_ShowCopy_others", (Properties) null);
            }
            AppMonitor.Alarm.commitFail("share", "Share_opentaopwd", str, b.a(R.string.taobao_app_1010_1_17887));
            return;
        }
        AppMonitor.Alarm.commitSuccess("share", "Share_opentaopwd");
        a(a(com.taobao.share.copy.a.a().f(), "Page_Extend_ShowCopy", "Page_Extend_ShowSavePic"), com.taobao.share.copy.a.a().f().B ? "mycopy" : "otherscopy", (String) null);
        com.taobao.share.copy.a.a().a(System.currentTimeMillis());
        com.taobao.share.clipboard.a.b(com.taobao.share.copy.a.a().h());
    }

    private void a(WeakReference<Activity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            a(weakReference, false, (String) null);
        }
    }

    private void a(WeakReference<Activity> weakReference, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f758a8", new Object[]{this, weakReference, new Boolean(z), str});
        } else if (weakReference == null) {
        } else {
            Activity activity = weakReference.get();
            if (activity == null) {
                TLog.loge("ClipUrlWatcherControl", "showDialog activity is null");
                return;
            }
            if (com.taobao.share.copy.a.a().g() != null) {
                com.taobao.share.copy.a.a().k();
            }
            com.taobao.share.copy.a.a().a(new com.taobao.tao.backflow.dialog.a(activity, z, str));
            com.taobao.share.copy.a.a().g().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.odk.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    com.taobao.share.copy.a.a().k();
                    com.taobao.share.copy.a.a().a((f) null);
                    com.taobao.share.copy.a.a().m();
                }
            });
            this.f31945a = weakReference;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (com.taobao.share.copy.a.a().f() == null) {
        } else {
            f f = com.taobao.share.copy.a.a().f();
            if (TemplateId.WEEX.equals(f.y) && (f instanceof oay)) {
                z = true;
            }
            if (!a(this.f31945a, com.taobao.share.copy.a.a().e())) {
                com.taobao.share.copy.a.a().k();
                a(com.taobao.share.copy.a.a().e(), z, f.x);
            } else if (com.taobao.share.copy.a.a().g() == null) {
                a(com.taobao.share.copy.a.a().e(), z, f.x);
            }
            if (com.taobao.share.copy.a.a().g() == null) {
                nyy.a("ClipUrlWatcherControl", "Init ClipUrlDialog failed!");
                return;
            }
            ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).a(this, this);
            ((com.taobao.tao.backflow.dialog.a) com.taobao.share.copy.a.a().g()).a(com.taobao.share.copy.a.a().f());
            nyy.b("ClipUrlWatcherControl", "ok,显示淘口令对话框!");
        }
    }

    private boolean a(WeakReference<Activity> weakReference, WeakReference<Activity> weakReference2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("931c72c", new Object[]{this, weakReference, weakReference2})).booleanValue() : (weakReference == null || weakReference2 == null || weakReference.get() != weakReference2.get()) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (com.taobao.share.copy.a.a().g() == null) {
        } else {
            int id = view != null ? view.getId() : 0;
            if (id == R.id.tpd_common_close || id == 0) {
                f f = com.taobao.share.copy.a.a().f();
                if (f != null) {
                    String str = f.y + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + f.A + "," + f.y;
                    if (f instanceof oay) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(",");
                        oay oayVar = (oay) f;
                        sb.append(oayVar.p);
                        sb.append(",");
                        sb.append(oayVar.U);
                        str = sb.toString();
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewClose", null, null, str);
                }
                com.taobao.share.copy.a.a().k();
            } else if (id == R.id.contacts_share_anti_hijack_title_view) {
                Nav.from(nym.a()).toUri("http://huodong.m.taobao.com/act/com.taobao.share.taopassword.html");
                com.taobao.share.copy.a.a().k();
            } else if (id == R.id.contacts_share_anti_hijack_report) {
                com.taobao.share.copy.a.a().k();
                e();
                Toast.makeText(nym.a(), R.string.contacts_share_anti_hijack_report_success, 0).show();
                f f2 = com.taobao.share.copy.a.a().f();
                if (f2 != null) {
                    String str2 = f2.y + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + f2.A + "," + f2.y;
                    if (f2 instanceof oay) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(",");
                        oay oayVar2 = (oay) f2;
                        sb2.append(oayVar2.p);
                        sb2.append(",");
                        sb2.append(oayVar2.U);
                        str2 = sb2.toString();
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewReport", null, null, str2);
                }
            } else {
                com.taobao.share.copy.a.a().k();
                f f3 = com.taobao.share.copy.a.a().f();
                if (f3 == null || StringUtils.isEmpty(f3.z) || !StringUtils.isEmpty(f3.F)) {
                    return;
                }
                if (!StringUtils.isEmpty(f3.J)) {
                    String str3 = f3.J;
                    if (!obh.s()) {
                        try {
                            String queryParameter = Uri.parse(f3.z).getQueryParameter("ut_sk");
                            if (!StringUtils.isEmpty(queryParameter)) {
                                Uri parse = Uri.parse(f3.J);
                                if (!"/n/im/dynamic/quickchat.html".equals(parse.getPath()) && !"/n/im/dynamic/middleContainer.html".equals(parse.getPath())) {
                                    Uri.Builder buildUpon = parse.buildUpon();
                                    buildUpon.appendQueryParameter("ut_sk", queryParameter);
                                    buildUpon.appendQueryParameter("s_share_url", URLEncoder.encode(f3.J, "utf-8"));
                                    str3 = buildUpon.build().toString();
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (ShareBizAdapter.getInstance().getAppEnv().c(str3)) {
                        Nav.from(nym.a()).toUri(str3);
                    }
                } else if (ShareBizAdapter.getInstance().getAppEnv().c(f3.z)) {
                    Nav.from(nym.a()).toUri(f3.z);
                }
                String str4 = f3.y + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + f3.A + "," + f3.y;
                if (f3 instanceof oay) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append(",");
                    oay oayVar3 = (oay) f3;
                    sb3.append(oayVar3.p);
                    sb3.append(",");
                    sb3.append(oayVar3.U);
                    str4 = sb3.toString();
                }
                TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewGo", null, null, str4);
            }
            com.taobao.share.clipboard.a.b(com.taobao.share.copy.a.a().h());
            a(id, a(com.taobao.share.copy.a.a().f(), "CopyTips_Close", "SavePic_Close"), com.taobao.share.copy.a.a().f());
            com.taobao.share.copy.a.a().a((f) null);
            com.taobao.share.copy.a.a().a(0);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharepassword.securitytipoff");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedSession(false);
        RemoteBusiness.build(mtopRequest).startRequest();
    }

    private void a(int i, String str, f fVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e507c2c", new Object[]{this, new Integer(i), str, fVar});
        } else if (fVar == null || StringUtils.isEmpty(fVar.y) || a(i, fVar)) {
        } else {
            if (fVar.B) {
                str2 = "uncheck";
                str3 = "mycopy";
            } else {
                str2 = FactoryType.TYPE_INVALID;
                str3 = "otherscopy";
            }
            a(str, str3, str2);
        }
    }

    private boolean a(int i, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9656e27a", new Object[]{this, new Integer(i), fVar})).booleanValue();
        }
        if (i == R.id.contacts_share_anti_hijack_title_view) {
            TBS.Ext.commitEvent("Page_Share", 19999, "WeakShowPop_Button-ClickInfor");
            return true;
        } else if (i == R.id.contacts_share_anti_hijack_go_on) {
            TBS.Ext.commitEvent("Page_Share", 19999, "WeakShowPop_Button-ClickOpen", fVar.x + "," + nyt.a(fVar), fVar.z);
            return true;
        } else if (i != R.id.contacts_share_anti_hijack_report) {
            return false;
        } else {
            TBS.Ext.commitEvent("Page_Share", 19999, "WeakShowPop_Button-ClickFeedback", fVar.x + "," + nyt.a(fVar), fVar.z);
            return true;
        }
    }

    private void a(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String str5 = com.taobao.share.copy.a.a().f().y;
        if (TemplateId.ITEM.equals(str5)) {
            str4 = "item";
        } else if (TemplateId.SHOP.equals(str5)) {
            str4 = "shop";
        } else if (TemplateId.COUPON.equals(str5)) {
            str4 = "coupon";
        } else {
            str4 = TemplateId.COMMON.equals(str5) ? "common" : "others";
        }
        Properties properties = new Properties();
        if (com.taobao.share.copy.a.a().f().F == null) {
            properties.put("returnType", Result.MSG_SUCCESS);
        } else {
            properties.put("returnType", com.taobao.share.copy.a.a().f().F);
        }
        if (!StringUtils.isEmpty(com.taobao.share.copy.a.a().f().x)) {
            properties.put("BID", com.taobao.share.copy.a.a().f().x);
        } else {
            properties.put("BID", "");
        }
        if (str == null) {
            return;
        }
        properties.put("shareType", str4);
        if (!StringUtils.isEmpty(com.taobao.share.copy.a.a().f().z)) {
            properties.put("url", com.taobao.share.copy.a.a().f().z);
        }
        properties.put("showType", "taobao");
        if (!StringUtils.isEmpty(str2)) {
            properties.put("pageType", str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            properties.put("alertType", str3);
        }
        if (!StringUtils.isEmpty(com.taobao.share.copy.a.a().f().E)) {
            properties.put("passwordType", com.taobao.share.copy.a.a().f().E);
        } else {
            properties.put("passwordType", "");
        }
        f f = com.taobao.share.copy.a.a().f();
        if (f instanceof oaw) {
            if (!StringUtils.isEmpty(((oaw) f).S)) {
                properties.put("ShowUserName", "1");
            } else {
                properties.put("ShowUserName", "0");
            }
        }
        if (com.taobao.share.copy.a.a().f().H != null) {
            String str6 = com.taobao.share.copy.a.a().f().H.get("createAppkey");
            if (!StringUtils.isEmpty(str6)) {
                properties.put("appKey", str6);
            }
        }
        f f2 = com.taobao.share.copy.a.a().f();
        if (f2.K != null && !f2.K.isEmpty()) {
            properties.put("s_appendParam", f2.K);
        }
        if (f2.A != null) {
            properties.put("passwordorigin", f2.A);
        }
        TBS.Ext.commitEvent(str, properties);
    }

    private String a(f fVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("825613a3", new Object[]{this, fVar, str, str2});
        }
        if (fVar != null) {
            z = "pic".equals(fVar.E);
        }
        return z ? str2 : str;
    }
}
