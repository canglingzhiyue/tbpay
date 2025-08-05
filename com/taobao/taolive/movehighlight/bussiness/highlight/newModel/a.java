package com.taobao.taolive.movehighlight.bussiness.highlight.newModel;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.utils.l;
import tb.kge;
import tb.poy;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alilive.aliliveframework.frame.a f21460a;

    static {
        kge.a(-869170097);
    }

    public a(com.taobao.alilive.aliliveframework.frame.a aVar, d dVar) {
        super(dVar);
        this.f21460a = aVar;
    }

    public void a(String str, int i, int i2, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4572870", new Object[]{this, str, new Integer(i), new Integer(i2), str2, str3, str4});
        } else if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
        } else {
            HighlightRowRequest highlightRowRequest = new HighlightRowRequest();
            highlightRowRequest.setLiveId(l.b(str));
            if (!TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2)) {
                highlightRowRequest.setWswgItemId(l.b(str2));
            }
            highlightRowRequest.s = i;
            highlightRowRequest.n = i2;
            highlightRowRequest.transParams = str3;
            highlightRowRequest.entryLiveSource = poy.R(this.f21460a);
            highlightRowRequest.liveSource = poy.ac(this.f21460a);
            if (c.b(highlightRowRequest.liveSource)) {
                highlightRowRequest.isTimeMovingV2 = true;
                highlightRowRequest.n = 0;
            } else {
                highlightRowRequest.isTimeMovingV2 = false;
            }
            if (c.q()) {
                highlightRowRequest.keyPointId = str4;
            }
            a(0, highlightRowRequest, HighlightRowResponse.class);
        }
    }
}
