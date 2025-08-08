package com.taobao.tao.handler.worker;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.kge;
import tb.nyk;
import tb.nyl;
import tb.oaf;
import tb.oak;
import tb.obc;
import tb.obd;
import tb.oif;
import tb.oir;
import tb.oup;

/* loaded from: classes8.dex */
public class b extends oir {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.share.ui.engine.render.b b;
    private com.taobao.tao.sharepanel.normal.view.b c;

    static {
        kge.a(-273296809);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.tao.sharepanel.normal.view.b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.sharepanel.normal.view.b) ipChange.ipc$dispatch("329a1dbe", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49386ed", new Object[]{bVar, str});
        } else {
            bVar.a(str);
        }
    }

    public static /* synthetic */ com.taobao.share.ui.engine.render.b b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.share.ui.engine.render.b) ipChange.ipc$dispatch("3573c135", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ oif c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oif) ipChange.ipc$dispatch("34f661f9", new Object[]{bVar}) : bVar.f32104a;
    }

    public b(oif oifVar) {
        super(oifVar);
        this.b = oifVar.b;
        if (this.b.f19682a instanceof com.taobao.tao.sharepanel.normal.view.b) {
            this.c = (com.taobao.tao.sharepanel.normal.view.b) this.b.f19682a;
        }
    }

    public void a(final Context context, final com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a21c99", new Object[]{this, context, bVar});
        } else if (bVar == null) {
        } else {
            final oaf oafVar = new oaf(context, bVar.b(), bVar.a().a(), null);
            oafVar.a(new oaf.a() { // from class: com.taobao.tao.handler.worker.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oaf.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else if (StringUtils.equals(str, "ANTISPAM_BLACK_USER")) {
                        b.a(b.this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23576));
                    } else {
                        b.a(b.this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23575));
                    }
                }

                @Override // tb.oaf.a
                public boolean a(TaoPasswordShareType taoPasswordShareType, obd obdVar, com.taobao.share.taopassword.busniess.model.b bVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("ae7089bc", new Object[]{this, taoPasswordShareType, obdVar, bVar2})).booleanValue();
                    }
                    if (bVar2 == null) {
                        return false;
                    }
                    if (!StringUtils.isEmpty(bVar2.c)) {
                        Date date = new Date(Long.parseLong(bVar2.c));
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17874));
                        String str = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17831) + simpleDateFormat.format(date) + com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17857);
                        com.taobao.share.globalmodel.e.b().j().validateTime = str;
                        oup.a(str, bVar2.c);
                    }
                    if (nyl.a()) {
                        AnalyticsUtil.traceWXAndQQShare(bVar, StringUtils.isEmpty(bVar2.d) ? bVar.a().a().url : bVar2.d, true, bVar2.b);
                    }
                    if (b.a(b.this) == null) {
                        oup.a(1);
                        oafVar.a();
                        return false;
                    }
                    if (StringUtils.equals("common", com.taobao.share.globalmodel.e.b().j().templateId)) {
                        b.a(b.this).e().i();
                    } else {
                        b.a(b.this).e().g();
                    }
                    if (SpUtils.getGuide(context, SpUtils.SHARE_GUIDE)) {
                        return true;
                    }
                    if (!StringUtils.equals("common", com.taobao.share.globalmodel.e.b().j().templateId)) {
                        b.a(b.this).a(oafVar);
                        return false;
                    }
                    if (b.a(b.this) == null) {
                        oafVar.a();
                    }
                    return true;
                }
            });
            oafVar.a(new oak() { // from class: com.taobao.tao.handler.worker.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oak
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    Toast.makeText(com.taobao.tao.config.a.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23580), 1).show();
                    if (b.b(b.this) == null) {
                        return;
                    }
                    b.b(b.this).a();
                }

                @Override // tb.oak
                public void b(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    } else if (StringUtils.isEmpty(str)) {
                        TLog.loge("CreatePassWorker", "onDidCopyed: isEmpty" + str);
                    } else {
                        com.taobao.share.taopassword.b.a();
                        ShareBizAdapter.getInstance().getAppEnv().b(str);
                    }
                }

                @Override // tb.oak
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    com.taobao.share.taopassword.b.a(bVar.b());
                    if (b.b(b.this) != null && com.taobao.share.taopassword.constants.a.b) {
                        oup.b(bVar.b(), "code");
                    }
                    if (b.a(b.this) != null) {
                        b.a(b.this).e().g();
                    } else {
                        if (b.c(b.this).b.e) {
                            Toast.makeText(com.taobao.tao.config.a.a(), com.alibaba.ability.localization.b.a(R.string.share_str_wx_copy_tips), 0).show();
                        }
                        oup.a(2);
                    }
                    if (b.b(b.this) == null || com.taobao.share.taopassword.constants.a.b) {
                        return;
                    }
                    b.b(b.this).a();
                }
            });
            if (nyk.b(com.taobao.share.globalmodel.e.b().j().businessId)) {
                if (nyl.a()) {
                    AnalyticsUtil.traceWXAndQQShare(bVar, bVar.a().a().url, true, "");
                }
                if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share", "ScreenShotAutoOpenApp", "true"))) {
                    return;
                }
                Toast.makeText(com.taobao.tao.config.a.a(), com.alibaba.ability.localization.b.a(R.string.share_str_wx_copy_tips), 0).show();
                this.b.a();
                obc.d(context, obc.a(StringUtils.equals(ShareTargetType.Share2Weixin.getValue(), bVar.b()) ? TPTargetType.WEIXIN : TPTargetType.QQFRIEND));
                return;
            }
            oafVar.b();
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Toast.makeText(com.taobao.tao.config.a.a(), str, 0).show();
        com.taobao.share.ui.engine.render.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }
}
