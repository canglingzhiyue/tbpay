package com.taobao.search.musie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import tb.kge;

/* loaded from: classes7.dex */
public class e implements com.taobao.android.weex_framework.adapter.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.weex_framework.adapter.d f19237a;

    static {
        kge.a(2043515139);
        kge.a(1277892050);
    }

    private com.taobao.android.weex_framework.adapter.d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.adapter.d) ipChange.ipc$dispatch("c754131", new Object[]{this});
        }
        if (this.f19237a == null) {
            this.f19237a = new l();
        }
        return this.f19237a;
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(Context context, String str, d.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6314fb9c", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            a().a(context, str, aVar, mUSImageQuality);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(Drawable drawable, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658e7eb0", new Object[]{this, drawable, aVar});
        } else {
            a().a(drawable, aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(String str, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b96a54a", new Object[]{this, str, aVar});
        } else {
            a().a(str, aVar);
        }
    }

    public void b(Context context, String str, d.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50dd5ebb", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            ((l) a()).b(context, str, aVar, mUSImageQuality);
        }
    }
}
