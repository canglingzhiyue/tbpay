package com.taobao.android.litecreator.sdk;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.litecreator.sdk.nav.a;
import com.taobao.android.litecreator.service.b;
import com.taobao.android.nav.e;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class LiteCreatorNavProcessor implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "LiteCreatorNavProcessor";
    private final List<a> mInterceptors = new ArrayList();

    static {
        kge.a(876502388);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : NAME;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiteCreatorNavProcessor() {
        this.mInterceptors.add(b.a(d.class, new Object[0]));
        this.mInterceptors.add(new com.taobao.android.litecreator.sdk.nav.interceptor.d());
        this.mInterceptors.add(new com.taobao.android.litecreator.sdk.nav.interceptor.c());
        this.mInterceptors.add(new com.taobao.android.litecreator.sdk.nav.interceptor.b());
        this.mInterceptors.add(new com.taobao.android.litecreator.sdk.nav.interceptor.a());
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && dVar != null && dVar.a() != null) {
            for (a aVar : this.mInterceptors) {
                if (aVar.intercept(intent, dVar.a())) {
                    aVar.nav(intent, dVar.a());
                    return false;
                }
            }
            if ((!l.d(dVar.a()) && !l.b(dVar.a())) || (data = intent.getData()) == null) {
                return true;
            }
            intent.setData(data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
        }
        return true;
    }
}
