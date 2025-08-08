package com.taobao.share.copy;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.poplayer.PopLayer;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.pha.core.rescache.RequestInterceptor;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.caa;
import tb.kge;
import tb.nyg;
import tb.nyi;
import tb.nyj;
import tb.nym;
import tb.nyp;
import tb.nyy;
import tb.nyz;
import tb.nzv;
import tb.oan;
import tb.oay;
import tb.obm;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GET_PASSWORD_FAIL = 3;
    public static final int GET_PASSWORD_FINISH = 5;
    public static final int LOAD_CLIP_SERVICE = 6;
    public static final int NO_STATE = 0;
    public static final int RETRY_PASSWORD = 4;
    public static final int SHOW_LOADING = 1;
    public static final int SHOW_PASSWORD_DIALOG = 2;
    private static List<String> p;

    /* renamed from: a  reason: collision with root package name */
    public Context f19604a;
    public String b;
    public String c;
    private WeakReference<Activity> d;
    private Dialog e;
    private com.taobao.share.taopassword.busniess.model.f f;
    private ClipboardManager g;
    private long h;
    private long i;
    private boolean j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final HandlerC0803a q;
    private com.taobao.share.taopassword.busniess.model.d r;
    private c s;

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f19608a;

        static {
            kge.a(2012421084);
            f19608a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("caa165af", new Object[0]) : f19608a;
        }
    }

    /* loaded from: classes8.dex */
    public interface c {
        Activity a();
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beccf1e7", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.k = i;
        return i;
    }

    public static /* synthetic */ ClipboardManager a(a aVar, ClipboardManager clipboardManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipboardManager) ipChange.ipc$dispatch("663219c7", new Object[]{aVar, clipboardManager});
        }
        aVar.g = clipboardManager;
        return clipboardManager;
    }

    public static /* synthetic */ com.taobao.share.taopassword.busniess.model.d a(a aVar, com.taobao.share.taopassword.busniess.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.taopassword.busniess.model.d) ipChange.ipc$dispatch("c2c39dc7", new Object[]{aVar, dVar});
        }
        aVar.r = dVar;
        return dVar;
    }

    public static /* synthetic */ void a(a aVar, com.taobao.share.taopassword.busniess.model.f fVar, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a941c849", new Object[]{aVar, fVar, new Boolean(z), str, map});
        } else {
            aVar.a(fVar, z, str, map);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e51f5ef3", new Object[]{aVar})).booleanValue() : aVar.o;
    }

    public static /* synthetic */ com.taobao.share.taopassword.busniess.model.d b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.share.taopassword.busniess.model.d) ipChange.ipc$dispatch("6e16a2f1", new Object[]{aVar}) : aVar.r;
    }

    public static /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e678b620", new Object[]{aVar})).intValue() : aVar.k;
    }

    public static /* synthetic */ WeakReference d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("cf3b649a", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7d20d6f", new Object[]{aVar})).booleanValue() : aVar.l;
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e87eb90e", new Object[]{aVar})).booleanValue() : aVar.m;
    }

    static {
        kge.a(-2092129015);
        ArrayList arrayList = new ArrayList();
        p = arrayList;
        arrayList.add("com.taobao.tao.welcome.Welcome");
        p.add("com.taobao.tao.ad.AdNavActivity");
        p.add("com.taobao.open.oauth.OauthActivity");
        p.add("com.taobao.open.GetWayActivity");
        p.add("com.taobao.bootimage.activity.BootImageActivity");
        p.add("com.taobao.runtimepermission.PermissionActivity");
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("caa165af", new Object[0]) : b.a();
    }

    private a() {
        this.f = null;
        this.h = 0L;
        this.i = 0L;
        this.j = true;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = new HandlerC0803a(this, Looper.getMainLooper());
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        nyp.a("ClipUrlWatcherControl", "register com.taobao.share.taopassword receiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PopLayer.ACTION_OUT_DISPLAY);
        intentFilter.addAction(PopLayer.ACTION_OUT_DISMISS);
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.share.copy.ClipUrlWatcherControl$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                nyp.c("TaoPasswordReceiver", "onReceive action =" + intent.getAction());
                if (!intent.getAction().equals(PopLayer.ACTION_OUT_DISPLAY)) {
                    if (!intent.getAction().equals(PopLayer.ACTION_OUT_DISMISS)) {
                        return;
                    }
                    a.a().c(false);
                    return;
                }
                String stringExtra = intent.getStringExtra("event");
                nyy.a("onReceive event value =" + stringExtra);
                if (StringUtils.isEmpty(stringExtra) || !stringExtra.contains("no_tbSecretOrder")) {
                    return;
                }
                a.a().c(true);
            }
        }, intentFilter);
        nyp.a("ClipUrlWatcherControl", "register com.taobao.share.taopassword receiver success");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKPREPAREDATASTART);
        if (com.taobao.share.globalmodel.e.b().d()) {
            nyy.a("ClipUrlWatcherControl", "检测到您的分享流程还没有完成，不检查口令");
            return;
        }
        this.o = "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNeedReCheckPic", "true"));
        nyy.b("ClipUrlWatcherControl", " 检测口令入口");
        a(System.currentTimeMillis());
        this.l = false;
        String a3 = com.taobao.share.clipboard.a.a(this.g);
        this.r = new com.taobao.share.taopassword.busniess.model.d();
        this.r.f19658a = a3;
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKPREPAREDATAEND);
        b(map);
    }

    public void b(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKPASSWORDCHECKSTART);
        if (!StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("android_share", "backFlowAppKeys", ""))) {
            String string = nym.a().getSharedPreferences(ShareConstants.SP_SHARE, 0).getString(ShareConstants.KEY_TAO_PASSWORD, "");
            if (!StringUtils.isEmpty(this.r.f19658a) && StringUtils.equals(string, this.r.f19658a)) {
                nyy.a("ClipUrlWatcherControl", "检测到跟缓存的非当前app的口令一致，直接返回");
                return;
            }
        }
        if (nyg.g()) {
            oan.a(new nyj());
            oan.a(new nyi());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (!StringUtils.isEmpty(this.r.f19658a)) {
            TBS.Ext.commitEvent("Share_Exception", 19999, caa.TRACK_TYPE_BACK_FLOW, "info", "口令检测入口", "cbd=" + this.r.f19658a);
        }
        com.taobao.share.taopassword.a.a().a(nym.a(), this.r, new nzv() { // from class: com.taobao.share.copy.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nzv
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!a.a(a.this)) {
                } else {
                    a.b(a.this).f19658a = null;
                    a.this.b(map);
                }
            }

            @Override // tb.nzv
            public void a(Object obj, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                    return;
                }
                com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKPASSWORDCHECKEND);
                com.taobao.share.taopassword.busniess.model.c cVar = (com.taobao.share.taopassword.busniess.model.c) obj;
                a.a(a.this, cVar.a());
                com.taobao.share.taopassword.busniess.model.f a2 = com.taobao.share.copy.process.a.a((Map) obj2, a.b(a.this));
                a2.M = JSON.toJSONString(obj2);
                a.this.c = a2.A;
                TBS.Ext.commitEvent("Share_Exception", 19999, caa.TRACK_TYPE_BACK_FLOW, "info", "口令检测成功", JSON.toJSONString(a2));
                String str = a2.A + "," + a2.E + "," + nym.b() + "," + a2.y;
                if (a2 instanceof oay) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(",");
                    oay oayVar = (oay) a2;
                    sb.append(oayVar.p);
                    sb.append(",");
                    sb.append(oayVar.U);
                    str = sb.toString();
                }
                TBS.Ext.commitEvent("Page_Share", 19999, "GetPasswordContentSuccess", null, null, str);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                TBS.Ext.commitEvent("UT", 19999, "Page_Share-CheckPassword", null, null, a2.A + "," + a2.E + "," + currentTimeMillis2);
                if ("pic".equals(a2.E)) {
                    TBS.Ext.commitEvent("UT", 19999, "Page_Share-FetchLastPic", null, null, a2.A + "," + currentTimeMillis2);
                    TBS.Ext.commitEvent("Page_Extend", 19999, a2.x, "qrcode", a2.z);
                }
                if (cVar != null && cVar.L != null) {
                    a2.L = cVar.L;
                }
                a2.W = map;
                a.a(a.this, a2, true, cVar.b, map);
            }

            @Override // tb.nzv
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                a.this.c = null;
                com.taobao.share.taopassword.busniess.model.f fVar = new com.taobao.share.taopassword.busniess.model.f();
                fVar.F = str;
                fVar.G = str2;
                Map<String, Object> map2 = map;
                fVar.W = map2;
                a.a(a.this, fVar, true, null, map2);
                TBS.Ext.commitEvent("Share_Exception", 19999, caa.TRACK_TYPE_BACK_FLOW, "err", "口令检测失败", "错误码：" + str + " 错误信息：" + str2);
                StringBuilder sb = new StringBuilder();
                sb.append("onFail： ");
                sb.append(str2);
                nyp.c("ClipUrlWatcherControl", sb.toString());
                TBS.Ext.commitEvent("Page_Share", 19999, "GetPasswordContentFailed", null, null, a.b(a.this).f19658a + "," + nym.b() + "," + str + ", " + str2);
            }
        });
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.l) {
            nyy.a("ClipUrlWatcherControl", " 用户点击close，不在显示淘口令");
        } else if (this.m) {
            nyy.a("ClipUrlWatcherControl", " 红包雨已弹出，不显示淘口令");
        } else if (this.d == null) {
            nyy.a("ClipUrlWatcherControl", " mWeakRefActivity=null，不显示淘口令");
        } else {
            com.taobao.share.taopassword.busniess.model.f fVar = this.f;
            if (fVar == null) {
                if (this.j) {
                    int i = this.k;
                    if (i == 1) {
                        a(this.f19604a, 1);
                    } else if (i == 3) {
                        a(this.f19604a, 3);
                    } else if (i == 4) {
                        a(this.f19604a, 4);
                    }
                }
                nyy.a("ClipUrlWatcherControl", " data=null，不显示淘口令 mCurrentState:" + this.k);
            } else if (fVar.F != null) {
                if (StringUtils.equals("PASSWORD_INVALID", this.f.F)) {
                    com.taobao.share.clipboard.a.b(this.g);
                }
                this.k = 3;
                if (!this.j) {
                    if (StringUtils.equals("PASSWORD_INVALID", this.f.F)) {
                        a(this.f19604a, 3);
                    }
                } else if (this.f.F.contains(RequestInterceptor.ResourceSource.NETWORK) || this.f.F.contains(LogStrategyManager.SP_STRATEGY_KEY_NETWORK)) {
                    this.k = 4;
                    a(this.f19604a, 4);
                } else {
                    a(this.f19604a, 3);
                }
                nyy.a("ClipUrlWatcherControl", " GET_PASSWORD_FAIL，不显示淘口令 data.errorCode:" + this.f.F);
            } else {
                this.k = 2;
                a(this.f19604a, 2);
                nyy.b("ClipUrlWatcherControl", " BackFlowDialogService.showDialog 显示淘口令");
            }
        }
    }

    /* renamed from: com.taobao.share.copy.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class HandlerC0803a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final a f19607a;

        static {
            kge.a(275258883);
        }

        public HandlerC0803a(a aVar, Looper looper) {
            super(looper);
            this.f19607a = aVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message == null || (aVar = this.f19607a) == null) {
            } else {
                int i = message.what;
                if (i == 1) {
                    if (a.c(aVar) == 5 || a.c(aVar) == 2 || a.c(aVar) == 3 || a.c(aVar) == 1) {
                        return;
                    }
                    TBS.Ext.commitEventBegin("Page_Extend_ShowLoading", null);
                    a.a(aVar, 1);
                    if (a.d(aVar) == null) {
                        nyp.a("ClipUrlWatcherControl", "showDialog weakActivity is null");
                    } else {
                        a.a(aVar.f19604a, 1);
                    }
                } else if (i == 2) {
                    a.a(aVar, 2);
                    if (a.d(aVar) == null) {
                        nyp.a("ClipUrlWatcherControl", "showDialog weakActivity is null");
                    } else {
                        a.a(aVar.f19604a, 2);
                    }
                } else if (i == 3) {
                    a.a(aVar, 3);
                    if (a.d(aVar) == null) {
                        nyp.a("ClipUrlWatcherControl", "showDialog weakActivity is null");
                    } else {
                        a.a(aVar.f19604a, 3);
                    }
                } else if (i != 4) {
                    if (i != 6) {
                        return;
                    }
                    a.a(aVar, (ClipboardManager) aVar.f19604a.getSystemService("clipboard"));
                } else if (a.c(aVar) != 1) {
                } else {
                    nyp.c("ClipUrlWatcherControl", "RETRY_PASSWORD mIsStop=" + a.e(aVar));
                    if (a.e(aVar) || a.f(aVar)) {
                        return;
                    }
                    if (a.c(aVar) == 1) {
                        TBS.Ext.commitEventEnd("Page_Extend_ShowLoading", null);
                    }
                    a.a(aVar, 4);
                    if (a.d(aVar) == null) {
                        nyp.a("ClipUrlWatcherControl", "showDialog weakActivity is null");
                    } else {
                        a.a(aVar.f19604a, 4);
                    }
                }
            }
        }
    }

    private void a(com.taobao.share.taopassword.busniess.model.f fVar, boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d383f0", new Object[]{this, fVar, new Boolean(z), str, map});
            return;
        }
        if (this.k == 1) {
            TBS.Ext.commitEventEnd("Page_Extend_ShowLoading", null);
        }
        this.k = 5;
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKPASSWORDVALIDSTART);
        String config = OrangeConfig.getInstance().getConfig("android_share", "backFlowAppKeys", "");
        if (!StringUtils.isEmpty(config) && (StringUtils.isEmpty(str) || (!StringUtils.isEmpty(str) && !config.contains(str)))) {
            SharedPreferences.Editor edit = nym.a().getSharedPreferences(ShareConstants.SP_SHARE, 0).edit();
            edit.putString(ShareConstants.KEY_TAO_PASSWORD, fVar.A);
            edit.apply();
            LocalBroadcastManager.getInstance(nym.a()).sendBroadcast(new Intent(ShareConstants.ACTION_TAO_PASSWORD));
            nyy.a("不是当前的app生成的口令，不显示淘口令，存起来，发通知");
        } else if (this.l) {
            nyy.a("用户点击close，不在显示淘口令");
        } else if (fVar == null && this.f == null) {
            nyy.a("没数据");
            if (!z) {
                return;
            }
            b(map);
        } else {
            if (fVar != null) {
                if (StringUtils.equals(fVar.F, "NOSHOW_PASSWORD_FRAME")) {
                    if ("true".equals(OrangeConfig.getInstance().getConfig("android_share", "clear_clipboard_on_security_err", "true"))) {
                        com.taobao.share.clipboard.a.b(this.g);
                    }
                    AppMonitor.Alarm.commitFail("share", "response_not_show_pwd", "0", "NOSHOW_PASSWORD_FRAME");
                    nyy.a("Share->Clip: Error code is NOSHOW_PASSWORD_FRAME, should not show dialog.");
                    return;
                } else if (!this.j && fVar.F != null && !StringUtils.equals("PASSWORD_INVALID", fVar.F)) {
                    nyy.a("不显示异常框");
                    return;
                } else {
                    this.f = fVar;
                }
            }
            if (this.m) {
                if (StringUtils.isEmpty(this.f.F) || StringUtils.equals("PASSWORD_INVALID", this.f.F)) {
                    com.taobao.share.clipboard.a.b(this.g);
                }
                nyy.a("红包雨已弹出，不显示淘口令");
            } else if (l()) {
                a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKPASSWORDVALIDEND);
                this.q.post(new Runnable() { // from class: com.taobao.share.copy.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.this.d();
                        }
                    }
                });
            } else {
                nyy.a("当前Activity不允许显示淘口令");
            }
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            this.d = weakReference;
        }
    }

    public WeakReference<Activity> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("8ffd9d3a", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.d;
        if (weakReference == null || weakReference.get() == null) {
            TLog.loge("ClipUrlWatcherControl", "getCurrentActivity is empty, use onlineMonitor data.");
            c cVar = this.s;
            if (cVar != null) {
                return new WeakReference<>(cVar.a());
            }
            return new WeakReference<>(null);
        }
        return this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public com.taobao.share.taopassword.busniess.model.f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.share.taopassword.busniess.model.f) ipChange.ipc$dispatch("d9f16c4e", new Object[]{this}) : this.f;
    }

    public void a(com.taobao.share.taopassword.busniess.model.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a4aa09", new Object[]{this, fVar});
        } else {
            this.f = fVar;
        }
    }

    public Dialog g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("105dd261", new Object[]{this}) : this.e;
    }

    public void a(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
        } else {
            this.e = dialog;
        }
    }

    public ClipboardManager h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClipboardManager) ipChange.ipc$dispatch("af9cf9c9", new Object[]{this}) : this.g;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : this.h;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.i;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            if (this.e != null) {
                this.e.dismiss();
            }
        } catch (Exception unused) {
            nyp.a("ClipUrlWatcherControl", "dismiss error");
        } finally {
            this.e = null;
        }
    }

    public boolean l() {
        String str;
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.d;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            str = "";
        } else {
            str = activity.getClass().getName();
            nyp.b("ClipUrlWatcherControl", " isCanDisplayOnThisActivity2 :activityname:" + str);
        }
        List<String> h = ShareBizAdapter.getInstance().getAppEnv().h();
        boolean e = ShareBizAdapter.getInstance().getAppEnv().e();
        boolean z = p.contains(str) || (h != null && h.contains(str));
        if ("com.taobao.tao.welcome.Welcome".equals(str)) {
            if (e) {
                nyy.a("Welcome页面弹淘口令弹窗");
                return true;
            }
            nyy.a("Welcome页面不弹淘口令弹窗");
        }
        nyp.b("ClipUrlWatcherControl", " isCanDisplayOnThisActivity ;result:" + z);
        return !z;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.f19604a = context;
        Message message = new Message();
        message.what = 6;
        this.q.sendMessage(message);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.k = 0;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.l;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[]{this})).longValue() : j() - i();
    }

    public String p() {
        ClipData primaryClip;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        if (!obm.f31892a) {
            if (obm.a()) {
                return com.alibaba.wireless.aliprivacyext.c.a(ShareBizAdapter.getInstance().getAppEnv().b());
            }
            return null;
        }
        ClipboardManager clipboardManager = this.g;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0) != null && primaryClip.getItemAt(0).getText() != null) {
            return primaryClip.getItemAt(0).getText().toString();
        }
        return null;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!l()) {
        } else {
            nyp.c("ClipUrlWatcherControl", "in showDialogByCase showDialog");
            d();
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19994010", new Object[]{this, cVar});
        } else {
            this.s = cVar;
        }
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        a().b(System.currentTimeMillis());
        long o = a().o();
        String str = "pic".equals(Integer.valueOf(i)) ? "Page_Extend_ShowSavePic_Time" : "Page_Extend_ShowCopy_Time";
        Properties properties = new Properties();
        properties.put("time", Long.valueOf(o));
        TBS.Ext.commitEvent(str, properties);
        nyz backFlowEngine = ShareBizAdapter.getInstance().getBackFlowEngine();
        if (backFlowEngine == null) {
            return;
        }
        com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKINITDIALOG);
        backFlowEngine.a(i);
    }

    public boolean r() {
        com.taobao.share.taopassword.busniess.model.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ClipUrlWatcherControl#hasTaoPassword mIsStop=");
        sb.append(this.l);
        sb.append(" mHasPopLayer=");
        sb.append(this.m);
        sb.append(" dataIsNull=");
        sb.append(this.f == null);
        sb.append("errCode=");
        com.taobao.share.taopassword.busniess.model.f fVar2 = this.f;
        sb.append(fVar2 == null ? "null" : fVar2.F);
        nyy.b("ClipUrlWatcherControl", sb.toString());
        return !this.l && !this.m && (fVar = this.f) != null && fVar.F == null;
    }
}
