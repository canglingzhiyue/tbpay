package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class RPTopBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f3585a;
    public ViewGroup b;
    public TextView c;

    public RPTopBar(Context context) {
        this(context, null);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f3585a = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.rp_alrealidentity_top_bar, (ViewGroup) null);
        addView(this.f3585a, new LinearLayout.LayoutParams(-1, -1));
        this.b = (ViewGroup) this.f3585a.findViewById(R.id.left);
        this.c = (TextView) this.f3585a.findViewById(R.id.tv_title);
        setClickable(true);
    }

    public ViewGroup getIvLeftParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("291f461a", new Object[]{this}) : this.b;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.f3585a.setBackgroundColor(i);
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.c.setText(str);
        }
    }

    public RPTopBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RPTopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
