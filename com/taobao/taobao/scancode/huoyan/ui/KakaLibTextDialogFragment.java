package com.taobao.taobao.scancode.huoyan.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.qnt;

/* loaded from: classes8.dex */
public class KakaLibTextDialogFragment extends KaDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int textColor;
    private int textSize;

    static {
        kge.a(770099351);
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.textSize = i;
        }
    }

    public static KakaLibTextDialogFragment newInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibTextDialogFragment) ipChange.ipc$dispatch("1b3237e8", new Object[]{str});
        }
        KakaLibTextDialogFragment kakaLibTextDialogFragment = new KakaLibTextDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(qnt.TYPE_TEXT, str);
        kakaLibTextDialogFragment.setArguments(bundle);
        return kakaLibTextDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        String string = getArguments().getString(qnt.TYPE_TEXT);
        View inflate = layoutInflater.inflate(R.layout.kakalib_one_text_msg_dialog, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.aaa);
        int i = this.textColor;
        if (i > 0) {
            textView.setTextColor(i);
        }
        int i2 = this.textSize;
        if (i2 > 0) {
            textView.setTextSize(i2);
        }
        textView.setText(string);
        return inflate;
    }
}
