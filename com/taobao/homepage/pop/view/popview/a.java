package com.taobao.homepage.pop.view.popview;

import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopItemModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.f;
import tb.jqm;
import tb.lah;

/* loaded from: classes7.dex */
public class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BasePopView f17271a;
    private IPopData b;
    private TextView c;
    private long d = 0;

    public static /* synthetic */ TextView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("d5246201", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ TextView a(a aVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("252b1cb", new Object[]{aVar, textView});
        }
        aVar.c = textView;
        return textView;
    }

    public a(final BasePopView basePopView, IPopData iPopData) {
        this.f17271a = basePopView;
        this.b = iPopData;
        if (!jqm.a() || basePopView == null || basePopView.getContext() == null) {
            return;
        }
        lah.a().b(new Runnable() { // from class: com.taobao.homepage.pop.view.popview.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this, new TextView(basePopView.getContext()));
                a.a(a.this).setTextColor(Color.parseColor("#ff0000"));
                a.a(a.this).setTextSize(12.0f);
                basePopView.addView(a.a(a.this), new FrameLayout.LayoutParams(-2, -2));
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f17271a.isFinished() || !this.f17271a.isCurrentVisible()) {
            this.f17271a.triggerInvalidPopRemove();
        } else {
            this.d += this.b.getPopConfig().getRefreshInterval();
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(String.valueOf(this.d));
            }
            c.b("PopTimerRunnable ", "update time=" + this.d + ", businessId=" + this.b.getBusinessID() + ", " + hashCode());
            this.f17271a.updatePopViewByTimer(this.d);
            if (this.d < this.b.getPopConfig().getShowTimeMills()) {
                return;
            }
            a(this.b);
            if (this.b.getPopConfig().isPopMessage()) {
                this.f17271a.triggerPopMessage("endTime", this.b.getBusinessID(), null);
            } else {
                this.f17271a.triggerPopViewEvent(2, this.b.getBusinessID());
            }
        }
    }

    private void a(IPopData iPopData) {
        BasePopItemModel mo1074getItem;
        BasePopSubItemModel mo1071getBaseItemModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
            return;
        }
        BasePopSectionModel mo1070fetchPopSection = iPopData.mo1070fetchPopSection();
        if (mo1070fetchPopSection == null || (mo1074getItem = mo1070fetchPopSection.mo1074getItem()) == null || (mo1071getBaseItemModel = mo1074getItem.mo1071getBaseItemModel(2)) == null) {
            return;
        }
        f.a(mo1070fetchPopSection, mo1071getBaseItemModel, (JSONObject) null);
    }
}
