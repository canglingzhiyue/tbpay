package com.taobao.search.sf.widgets.list.listcell.crosstips;

import android.app.Activity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.taobao.R;
import tb.itd;
import tb.ium;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends itd<CrossTipsBean, com.taobao.search.sf.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f19525a;

    static {
        kge.a(-1508189729);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 107615098) {
            super.s();
            return null;
        } else if (hashCode != 108538619) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.t();
            return null;
        }
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    public b(Activity activity, ium iumVar, ViewGroup viewGroup, ListStyle listStyle, int i, com.taobao.search.sf.a aVar) {
        super(LayoutInflater.from(activity).inflate(R.layout.tbsearch_item_cross_tips, viewGroup, false), activity, iumVar, listStyle, i, aVar);
        this.f19525a = (TextView) this.itemView.findViewById(R.id.tv_tips);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Override // tb.itd
    public void a(int i, CrossTipsBean crossTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e135b5f", new Object[]{this, new Integer(i), crossTipsBean});
        } else {
            this.f19525a.setText(crossTipsBean.title);
        }
    }

    @Override // tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        if (this.itemView.getTop() >= 0) {
            return;
        }
        postEvent(new a(true));
    }

    @Override // tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        postEvent(new a(false));
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f19526a;

        static {
            kge.a(159872332);
        }

        public a(boolean z) {
            this.f19526a = z;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f19526a;
        }
    }
}
