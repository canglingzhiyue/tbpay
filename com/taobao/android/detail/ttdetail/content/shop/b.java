package com.taobao.android.detail.ttdetail.content.shop;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.TTDetailViewPager;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TTDetailViewPager f10594a;
    private Context b;
    private String c;

    static {
        kge.a(421829906);
    }

    public b(Context context, TTDetailViewPager tTDetailViewPager) {
        this.b = context;
        this.f10594a = tTDetailViewPager;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        d();
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.c = str;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }
}
