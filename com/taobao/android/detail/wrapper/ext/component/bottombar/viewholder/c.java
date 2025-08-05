package com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import tb.dzi;
import tb.eac;
import tb.edf;
import tb.egv;
import tb.emu;
import tb.eno;
import tb.fag;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends eac<fag> implements j<edf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView g;

    static {
        kge.a(1462037531);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -422543804) {
            super.a((c) ((egv) objArr[0]));
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edf edfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edfVar}) : a(edfVar);
    }

    public c(Context context) {
        super(context);
        com.taobao.android.trade.event.f.a(context).a(eno.a(edf.class), this);
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.BottomBarReminderViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        try {
            this.g = (TextView) LayoutInflater.from(context).inflate(R.layout.x_detail_bottombar_reminder, (ViewGroup) null);
        } catch (Throwable unused) {
            this.g = new TextView(this.f9568a);
        }
        this.g.setGravity(17);
        this.g.setTypeface(Typeface.defaultFromStyle(1));
        return this.g;
    }

    @Override // tb.eac
    public void a(fag fagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e829f84c", new Object[]{this, fagVar});
            return;
        }
        super.a((c) fagVar);
        if (fagVar == null) {
            return;
        }
        if (!fagVar.d) {
            this.g.setText(fagVar.f27713a);
            this.g.setEnabled(!fagVar.d);
        } else {
            this.g.setText(fagVar.c);
            this.g.setEnabled(!fagVar.d);
        }
        dzi.a(this.g, fagVar, "BtmBarRmd");
    }

    public i a(edf edfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("3cbb097e", new Object[]{this, edfVar});
        }
        if (edfVar != null && edfVar.f27207a != null) {
            this.g.setEnabled(!edfVar.f27207a.f);
            this.g.setText(((fag) this.c).c);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        com.taobao.android.trade.event.f.a(this.f9568a).b(eno.a(edf.class), this);
    }
}
