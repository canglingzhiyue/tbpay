package com.taobao.share.core.share.interceptor;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.ut.share.utils.FlowOutFacade;
import java.util.ArrayList;
import tb.kge;
import tb.nyk;
import tb.obk;

/* loaded from: classes8.dex */
public class g implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SystemShare";

    static {
        kge.a(224590268);
        kge.a(-1805296056);
    }

    @Override // com.taobao.share.core.share.interceptor.b
    public boolean b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("846ab17a", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        if ("false".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "SysShareDisable", "true"))) {
            return false;
        }
        boolean equals = "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "ScreenShotUseSysShare", "false"));
        if (tBShareContent != null && nyk.b(tBShareContent.businessId) && equals) {
            com.taobao.share.globalmodel.c cVar = new com.taobao.share.globalmodel.c();
            cVar.a(tBShareContent);
            com.taobao.share.ui.engine.structure.a aVar = new com.taobao.share.ui.engine.structure.a();
            aVar.a(TAG);
            aVar.a(cVar);
            obk.a().onEvent(aVar);
            return true;
        } else if (tBShareContent == null || tBShareContent.extraParams == null || !StringUtils.equals(tBShareContent.extraParams.get("sysSharePanel"), "true")) {
            return false;
        } else {
            String str2 = tBShareContent.extraParams.get("sysShareText") == null ? "" : tBShareContent.extraParams.get("sysShareText");
            if (!StringUtils.isEmpty(tBShareContent.extraParams.get("sysShareTarget"))) {
                str2 = str2 + tBShareContent.extraParams.get("sysShareTarget");
            }
            a(tBShareContent, str2);
            return true;
        }
    }

    private void a(TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a226d18f", new Object[]{this, tBShareContent, str});
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(Constants.SHARETYPE);
        FlowOutFacade.getInstance().startActivity(ShareBizAdapter.getInstance().getAppEnv().c(), Intent.createChooser(intent, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18281)));
        TBS.Ext.commitEvent("Page_Share", 19999, "Popup", tBShareContent.businessId, null, "sysSharePanel=1");
    }
}
