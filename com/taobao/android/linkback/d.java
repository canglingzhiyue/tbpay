package com.taobao.android.linkback;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> S_ROUTE_EXCLUSION = new ArrayList<String>() { // from class: com.taobao.android.linkback.LinkBackUrlExecutor$1
        {
            add("com.taobao.android.shop.activity.ShopUrlRouterActivity");
            add("com.taobao.browser.router.FromH5RouterActivity");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f13300a;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static d f13301a = new d();

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2b47870", new Object[0]) : f13301a;
        }
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2b47870", new Object[0]) : a.a();
    }

    private d() {
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!TextUtils.equals(str, this.f13300a)) {
            f.a(str);
        }
        this.f13300a = str;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f13300a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f13300a = "";
        }
    }
}
