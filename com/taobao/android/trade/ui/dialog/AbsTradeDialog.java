package com.taobao.android.trade.ui.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class AbsTradeDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f15639a;
    public TextView b;
    public TextView c;
    public TextView d;
    public String h;
    public String i;
    public String j;
    public View.OnClickListener k;
    public View.OnClickListener l;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public boolean m = true;
    public boolean n = true;
    private boolean o = false;

    static {
        kge.a(1113814116);
    }

    public static /* synthetic */ Object ipc$super(AbsTradeDialog absTradeDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract View a(ViewGroup viewGroup);

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.trade_container_dialog, (ViewGroup) null);
        this.f15639a = (FrameLayout) inflate.findViewById(R.id.fl_container);
        this.d = (TextView) inflate.findViewById(R.id.tv_title);
        this.b = (TextView) inflate.findViewById(R.id.tv_confirm);
        this.c = (TextView) inflate.findViewById(R.id.tv_cancel);
        View a2 = a(this.f15639a);
        if (a2 != null) {
            this.f15639a.addView(a2, new ViewGroup.LayoutParams(-1, -2));
        }
        if (this.e > 0) {
            this.h = getResources().getString(this.e);
        }
        if (this.f > 0) {
            this.i = getResources().getString(this.f);
        }
        int i = this.g;
        if (i > 0) {
            this.d.setText(i);
        }
        if (!TextUtils.isEmpty(this.h)) {
            this.b.setText(this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.c.setText(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            this.d.setText(this.j);
        }
        this.b.setOnClickListener(this.k);
        this.c.setOnClickListener(this.l);
        int i2 = 8;
        this.b.setVisibility(this.m ? 0 : 8);
        this.c.setVisibility(this.n ? 0 : 8);
        TextView textView = this.d;
        if (this.o) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        return inflate;
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.k = onClickListener;
        }
    }

    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else {
            this.l = onClickListener;
        }
    }
}
