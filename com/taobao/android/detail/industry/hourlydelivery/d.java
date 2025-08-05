package com.taobao.android.detail.industry.hourlydelivery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBErrorView f10092a;
    private final a b;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-363930343);
    }

    public static /* synthetic */ a a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1aa1b5ed", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a8c8fb", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    public d(a aVar) {
        this.b = aVar;
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.f10092a = b(context);
        a(false);
        return this.f10092a;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TBErrorView tBErrorView = this.f10092a;
        if (tBErrorView == null || this.b == null) {
            return;
        }
        if (z) {
            tBErrorView.setTitle("正在加载中");
            this.f10092a.setSubTitle("请稍后...");
            this.f10092a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "加载中", new View.OnClickListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            this.f10092a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 4);
            return;
        }
        tBErrorView.setTitle("系统出了点问题");
        this.f10092a.setSubTitle("尝试刷新一下吧");
        this.f10092a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新页面", new View.OnClickListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                d.a(d.this, true);
                d.a(d.this).a();
            }
        });
        this.f10092a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
    }

    private TBErrorView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("2f7d1f18", new Object[]{this, context});
        }
        this.f10092a = new TBErrorView(context);
        this.f10092a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f10092a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        this.f10092a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.f10092a;
    }
}
