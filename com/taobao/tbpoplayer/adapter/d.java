package com.taobao.tbpoplayer.adapter;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1980868485);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "PopLayerProcessor";
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
        try {
            String dataString = intent.getDataString();
            if (!StringUtils.isEmpty(dataString) && dataString.startsWith("poplayer")) {
                com.alibaba.poplayer.utils.c.b("triggerEvent", "", "MatchSchema.BroadcastTrigger.PopLayerHooker.url=" + dataString);
                Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent2.putExtra("event", dataString);
                intent2.putExtra("param", dataString);
                intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "navUrl");
                LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent2);
                com.alibaba.poplayer.utils.c.b("triggerEvent", "", "BroadcastTrigger.PopLayerHooker.hook.success");
                return false;
            }
            return true;
        } catch (Throwable unused) {
            Log.e("TBPoplayer", "PopLayerNavHooker.hook.error");
            return true;
        }
    }
}
