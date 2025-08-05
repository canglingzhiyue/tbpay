package com.taobao.android.detail.ttdetail.request.preload;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f10795a = new d();

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final g f10796a;

        static {
            kge.a(-1479661336);
            f10796a = new g();
        }

        public static /* synthetic */ g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("afeff9af", new Object[0]) : f10796a;
        }
    }

    static {
        kge.a(-1428509432);
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("afeff9af", new Object[0]) : a.a();
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        i.a(b(intent)).a(this.f10795a.a(intent), this.f10795a);
    }

    private String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{this, intent});
        }
        if (intent == null) {
            return String.valueOf(UUID.randomUUID().hashCode());
        }
        String stringExtra = intent.getStringExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV);
        return TextUtils.isEmpty(stringExtra) ? String.valueOf(UUID.randomUUID().hashCode()) : stringExtra;
    }
}
