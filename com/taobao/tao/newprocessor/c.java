package com.taobao.tao.newprocessor;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.tao.log.TLog;
import tb.ecd;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1572331501);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "NewNavMunionAdProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            try {
                Uri parse = Uri.parse(AlimamaAdvertising.instance().handleAdUrl(data.toString()));
                TLog.loge("AlimamaAd", "NavMunionAdPreProcessor", String.format("originUri=[%1$s],newUri=[%2$s]", data.toString(), parse.toString()));
                intent.setData(parse);
                intent.putExtra(ecd.K_EFFECT_AD_TYPE, "1.0");
            } catch (Exception unused) {
            }
        }
        return true;
    }
}
