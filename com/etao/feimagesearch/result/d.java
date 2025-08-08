package com.etao.feimagesearch.result;

import android.graphics.Bitmap;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.e;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6974a;
    public int b;
    public RectF c;
    public Bitmap e;
    public boolean g;
    public boolean h;
    public boolean d = false;
    public Map<String, String> f = null;

    static {
        kge.a(970875909);
    }

    public d(RectF rectF, boolean z, int i, String str) {
        this.f6974a = e.REGION_SEARCH;
        this.c = rectF;
        this.h = z;
        this.b = i;
        if (!StringUtils.isEmpty(str)) {
            this.f6974a = str;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : e.REGION_SCAN.equals(this.f6974a);
    }
}
