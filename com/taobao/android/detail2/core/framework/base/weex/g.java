package com.taobao.android.detail2.core.framework.base.weex;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.p;
import java.util.HashMap;
import java.util.Map;
import tb.idk;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11501a;
    public Map<String, String> b = new HashMap();
    public a c;
    private String d;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f11503a;

        static {
            kge.a(-665383309);
        }
    }

    static {
        kge.a(1684044414);
    }

    public static /* synthetic */ String a(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b38c2754", new Object[]{gVar, str});
        }
        gVar.d = str;
        return str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f11501a;
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f11501a = str;
        if (ipa.g()) {
            this.d = idk.b(str);
            if (!TextUtils.isEmpty(this.d)) {
                return;
            }
            idk.a(str, new Runnable() { // from class: com.taobao.android.detail2.core.framework.base.weex.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.a(g.this, idk.b(str));
                    }
                }
            });
            return;
        }
        this.d = p.b(str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }
}
