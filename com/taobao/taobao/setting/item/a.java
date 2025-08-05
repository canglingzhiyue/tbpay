package com.taobao.taobao.setting.item;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.ArrayList;
import java.util.List;
import tb.tjs;
import tb.tjt;

/* loaded from: classes8.dex */
public class a extends RecyclerView.ViewHolder implements tjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f21298a;
    public View b;
    public ViewGroup c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TIconFontTextView g;
    public View h;
    public int i;
    public List<TextView> j;

    @Override // tb.tjt
    public List<ViewGroup> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        return null;
    }

    public a(View view) {
        super(view);
        this.i = 1;
        this.f21298a = view.findViewById(R.id.pay_setting_page_item_divider_narrow);
        this.b = view.findViewById(R.id.pay_setting_page_item_group_divider);
        this.c = (ViewGroup) view.findViewById(R.id.pay_setting_page_item);
        this.d = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_name);
        this.e = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_subtitle);
        this.f = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_desc);
        this.g = (TIconFontTextView) view.findViewById(R.id.if_pay_setting_page_item_arrow);
        this.h = view.findViewById(R.id.pay_btn_red_dot);
        d();
        tjs.a().a(this, view.getContext());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j = new ArrayList();
        this.j.add(this.d);
        this.j.add(this.e);
        this.j.add(this.f);
    }

    @Override // tb.tjt
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.i;
    }

    @Override // tb.tjt
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // tb.tjt
    public List<TextView> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.j;
    }
}
