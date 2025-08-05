package com.taobao.android.trade.ui.dialog;

import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class TradeAlertDialog extends AbsTradeDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String o;
    public int p = -1;
    public Spannable q;
    public TextView r;

    static {
        kge.a(-103310422);
    }

    public static /* synthetic */ Object ipc$super(TradeAlertDialog tradeAlertDialog, String str, Object... objArr) {
        if (str.hashCode() == -1126882532) {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.trade.ui.dialog.AbsTradeDialog
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.r = new TextView(getActivity());
        this.r.setTextColor(getResources().getColor(R.color.TC_A_H));
        this.r.setTextSize(1, 16.0f);
        Spannable spannable = this.q;
        if (spannable != null) {
            this.r.setText(spannable);
        } else {
            this.r.setText(this.p != -1 ? getResources().getString(this.p) : this.o);
        }
        return this.r;
    }

    @Override // com.taobao.android.trade.ui.dialog.AbsTradeDialog, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.android.trade.ui.dialog.TradeAlertDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TradeAlertDialog.this.dismiss();
                }
            }
        };
        setCancelable(false);
        if (this.k == null) {
            a(onClickListener);
        }
        if (this.l == null) {
            b(onClickListener);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
