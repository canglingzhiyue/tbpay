package com.taobao.android.processors;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-47676322);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "ExtraReferrerProcessor";
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
        Context a2 = dVar.a();
        if (a2 instanceof Activity) {
            Intent intent2 = ((Activity) a2).getIntent();
            if (intent2 != null) {
                Uri data = intent2.getData();
                if (data != null) {
                    intent.putExtra("referrer", data.toString());
                } else {
                    ComponentName component = intent2.getComponent();
                    if (component != null) {
                        intent.putExtra("referrer", new Intent().setComponent(component).toUri(0));
                    } else {
                        intent.putExtra("referrer", intent2.toUri(0));
                    }
                }
            }
        } else {
            intent.putExtra("referrer", a2.getPackageName());
        }
        return true;
    }
}
