package com.taobao.tao;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import tb.ecd;
import tb.kge;

/* loaded from: classes.dex */
public class NavMunionAdPreProcessor implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_MODULE_NAME = "AlimamaAd";
    private static final String TAG = "NavMunionAdPreProcessor";

    static {
        kge.a(1880487991);
        kge.a(-234059470);
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            try {
                if (!com.taobao.alimama.utils.c.k()) {
                    Uri parse = Uri.parse(AlimamaAdvertising.instance().handleAdUrl(data.toString()));
                    TLog.loge(LOG_MODULE_NAME, TAG, String.format("originUri=[%1$s],newUri=[%2$s]", data.toString(), parse.toString()));
                    intent.setData(parse);
                    intent.putExtra(ecd.K_EFFECT_AD_TYPE, "1.0");
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }
}
