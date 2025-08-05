package com.taobao.tao;

import android.app.Application;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.global.setting.SettingStateWVApiPlugin;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.footprint.a;
import com.taobao.mytaobao.homepage.plugin.MytaobaoRereshPlugin;
import com.taobao.mytaobao.homepage.plugin.TBMyTaobaoWVPlugin;
import com.taobao.mytaobao.newsetting.dx.b;
import com.taobao.mytaobao.pop.bridge.TBMyTaobaoPopWVApiPlugin;
import com.taobao.search.common.util.i;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.muk;
import tb.mwx;
import tb.mxa;
import tb.mxr;
import tb.mxz;
import tb.nwv;
import tb.tfd;
import tb.tfe;
import tb.tff;
import tb.tfg;
import tb.tfh;
import tb.tfi;
import tb.tfj;
import tb.tfk;
import tb.tfm;
import tb.tfn;
import tb.tfo;
import tb.tfp;
import tb.tfq;

/* loaded from: classes8.dex */
public class MytaobaoApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean isPageCreated;
    public static boolean isinit;
    private static MytaobaoApplication mytaobaoApplication;
    public static long onCreateTimeMillis;

    public static /* synthetic */ Object ipc$super(MytaobaoApplication mytaobaoApplication2, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-499161738);
        isinit = false;
        isPageCreated = false;
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        nwv.b();
        onCreateTimeMillis = System.currentTimeMillis();
        TLog.logi("MytaobaoApplication", i.b.MEASURE_ONCREATE + isinit);
        if (!isinit) {
            isinit = true;
            mxr.E();
            mxz.a();
        }
        mytaobaoApplication = this;
        mxa.b();
        mwx.b();
        muk.a();
        registerModule();
        new com.taobao.mytaobao.newsetting.j().a();
        a.INSTANCE.a();
    }

    public static MytaobaoApplication getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MytaobaoApplication) ipChange.ipc$dispatch("f23a768e", new Object[0]) : mytaobaoApplication;
    }

    public void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[]{this});
            return;
        }
        try {
            q.a("MyTaobaoRefresh", (Class<? extends android.taobao.windvane.jsbridge.e>) MytaobaoRereshPlugin.class);
            q.a(TBMyTaobaoWVPlugin.TAG, (Class<? extends android.taobao.windvane.jsbridge.e>) TBMyTaobaoWVPlugin.class);
            q.a("TBMyTaobaoSettingStateWVApiPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) SettingStateWVApiPlugin.class);
            q.a(TBMyTaobaoPopWVApiPlugin.TAG, (Class<? extends android.taobao.windvane.jsbridge.e>) TBMyTaobaoPopWVApiPlugin.class);
            MUSEngine.registerModule("taoLiveModule", MtbBasementWeexApiPlugin.class);
            registerSetting();
            ComponentFrmModule.init();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void registerSetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b585f034", new Object[]{this});
            return;
        }
        ClassPool.instance().put("eventhandler.mtb.widget.setting.ut", com.taobao.mytaobao.newsetting.dx.c.class);
        ClassPool.instance().put("source.mtb.common.mtop.snapshot", com.taobao.mytaobao.newsetting.dx.d.class);
        ClassPool.instance().put("eventhandler.mtb.widget.setting.switch", com.taobao.mytaobao.newsetting.dx.e.class);
        ClassPool.instance().put("eventhandler.mtb.widget.settingUriLink", b.class);
        ClassPool.instance().put("eventhandler.mtb.widget.applicationLink", com.taobao.mytaobao.newsetting.dx.a.class);
        ClassPool.instance().put("source.mtb.settings.resource", tfn.class);
        ClassPool.instance().put("eventHandler.mtb.logout.account", tfm.class);
        ClassPool.instance().put("eventHandler.mtb.switch.account", tfo.class);
        ClassPool.instance().put("source.mtb.user.setting.status", tfi.class);
        ClassPool.instance().put(tfj.EVENT_HANDLER_CLICK_PICKER, tfj.class);
        ClassPool.instance().put(tfj.EVENT_HANDLER_SWITCH_PICKER, tfj.class);
        ClassPool.instance().put(tfk.EVENT_HANDLER_SWITCH_REVERSE, tfk.class);
        ClassPool.instance().put("transformer.mtb.general.settings.mergeItemAndStatus", tfg.class);
        ClassPool.instance().put("eventHandler.mtb.general.settings.onAppear", tfh.class);
        ClassPool.instance().put("source.mtb.widget.setting.video", tfq.class);
        ClassPool.instance().put(tfp.EVENT_HANDLER_SETTING_VIDEO, tfp.class);
        ClassPool.instance().put("source.mtb.widget.about.mytaobao", tff.class);
        ClassPool.instance().put("eventhandler.mtb.widget.versionUpdate", tfe.class);
        ClassPool.instance().put("eventhandler.mtb.widget.about.version", tfd.class);
    }
}
