package com.taobao.android.nav;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class r implements p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> queryFilters;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final r f14460a;

        static {
            kge.a(798194280);
            f14460a = new r();
        }

        public static /* synthetic */ r a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("a22fd46a", new Object[0]) : f14460a;
        }
    }

    static {
        kge.a(-634083927);
        kge.a(-788052296);
    }

    @Override // com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    public static r getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("d6069b00", new Object[0]) : a.a();
    }

    public void addQueryFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925eac50", new Object[]{this, str});
            return;
        }
        if (this.queryFilters == null) {
            this.queryFilters = new ArrayList();
        }
        this.queryFilters.add(str);
    }

    @Override // com.taobao.android.nav.p
    public boolean queryFilter(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a7f144", new Object[]{this, uri})).booleanValue();
        }
        List<String> list = this.queryFilters;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (uri.isOpaque()) {
            return false;
        }
        for (String str : this.queryFilters) {
            if (uri.getQueryParameter(str) != null) {
                return true;
            }
        }
        return false;
    }
}
