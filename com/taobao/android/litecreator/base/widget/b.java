package com.taobao.android.litecreator.base.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.widget.LCTabView;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends LCTabView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CheckedTextView d;

    static {
        kge.a(348060129);
    }

    public b(int i, String str) {
        super(i, str);
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView.a
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.d = (CheckedTextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lay_lc_mediapick_tab_item, viewGroup, false);
        this.d.setText(this.b);
        return this.d;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d.setChecked(z);
        }
    }
}
