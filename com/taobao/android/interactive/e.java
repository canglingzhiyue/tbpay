package com.taobao.android.interactive;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.interactive_common.video.b;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-717459192);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "VideoListNavProcessor";
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
        if (intent == null || dVar == null) {
            return true;
        }
        try {
            ComponentName component = intent.getComponent();
            if (component != null && TextUtils.equals("com.taobao.android.interactive.timeline.VideoListActivity2", component.getClassName()) && b.a(intent)) {
                intent.setClassName(dVar.a(), CXCommonActivity.class.getName());
            }
        } catch (Throwable th) {
            TLog.loge("VideoListNavProcessor", "afterNavTo error", th);
        }
        return true;
    }
}
