package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.c;
import com.taobao.share.globalmodel.e;
import com.taobao.share.ui.engine.weex.b;
import com.taobao.tao.channel.a;
import com.taobao.tao.channel.b;
import com.taobao.tao.log.TLog;
import com.taobao.tao.sharepanel.normal.NativeSharePanel;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class oub implements b.InterfaceC0815b, b.a, nze {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String TAG = "BaseSharePanel";
    private b.a mDowngradeListener;
    private boolean mIsHasInitConfigData;
    public oif mShareActionDispatcher;
    public c mShareContext;
    public com.taobao.share.ui.engine.render.b mSharePanel;

    static {
        kge.a(-123482240);
        kge.a(-1464040953);
        kge.a(-1300108356);
        kge.a(371377943);
    }

    public abstract void initPanelData(TBShareContent tBShareContent, a aVar, String str, int i, boolean z, String str2, String str3, String str4);

    public abstract void initSharePanel(Activity activity);

    @Override // tb.nze
    public void renderSharePanel(final ArrayList<String> arrayList, final TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352e7b25", new Object[]{this, arrayList, tBShareContent});
            return;
        }
        Activity shareActivity = ShareBusiness.getInstance().getShareActivity();
        if (shareActivity == null) {
            shareActivity = com.taobao.share.copy.a.a().e().get();
        }
        if (tBShareContent == null || shareActivity == null) {
            TLog.loge("BaseSharePanel", "return doShared : content or activity is null");
            return;
        }
        this.mShareActionDispatcher = new oif();
        this.mShareContext = new c();
        this.mShareContext.a(this.mShareActionDispatcher);
        this.mShareContext.a(tBShareContent);
        this.mDowngradeListener = new b.a() { // from class: tb.oub.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.ui.engine.weex.b.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (oub.this.mSharePanel != null) {
                    oub.this.mSharePanel.c();
                }
                new NativeSharePanel().renderSharePanel(arrayList, tBShareContent);
            }
        };
        initSharePanel(shareActivity);
        e.b().b(true);
    }

    @Override // com.taobao.share.ui.engine.weex.b.InterfaceC0815b
    public b.a getDowngradeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("5cc644e5", new Object[]{this}) : this.mDowngradeListener;
    }

    @Override // com.taobao.tao.channel.b.a
    public void onConfigData(TBShareContent tBShareContent, a aVar, String str, int i, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6348df6e", new Object[]{this, tBShareContent, aVar, str, new Integer(i), new Boolean(z), str2, str3, str4});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.BIZ_CONFIG_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        com.taobao.share.ui.engine.jsbridge.a.a().b();
        nyy.c("TIMECOST", "biz_config_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
        if (this.mIsHasInitConfigData) {
            return;
        }
        this.mIsHasInitConfigData = true;
        long currentTimeMillis = System.currentTimeMillis();
        tBShareContent.activityUrl = TextUtils.isEmpty(str4) ? "" : str4;
        this.mShareContext.a(tBShareContent);
        AnalyticsUtil.traceShowShareView(tBShareContent);
        com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREPANELGETSHARECONFIGEND);
        initPanelData(tBShareContent, aVar, str, i, z, str2, str3, str4);
        AnalyticsUtil.tracePopupEvent(tBShareContent, System.currentTimeMillis() - currentTimeMillis);
    }

    public com.taobao.share.ui.engine.render.b getPanel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.share.ui.engine.render.b) ipChange.ipc$dispatch("3f5d2508", new Object[]{this}) : this.mSharePanel;
    }

    public oif getShareActionDispatcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oif) ipChange.ipc$dispatch("59ade4d", new Object[]{this}) : this.mShareActionDispatcher;
    }
}
