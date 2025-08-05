package com.heytap.mspsdk.keychain.impl;

import android.os.Bundle;
import com.heytap.msp.keychain.a;
import java.util.HashMap;
import tb.cwl;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends a.AbstractBinderC0260a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnResultListener f7248a;

    static {
        kge.a(1355228026);
    }

    public a(OnResultListener onResultListener) {
        this.f7248a = onResultListener;
    }

    public void a(com.heytap.msp.keychain.b bVar) {
        cwl cwlVar = new cwl();
        cwlVar.a(bVar.f7247a);
        cwlVar.a(bVar.b);
        Bundle bundle = bVar.c;
        if (bundle != null) {
            cwlVar.a((HashMap) bundle.getSerializable("result_map"));
        }
        this.f7248a.onResult(cwlVar);
    }
}
