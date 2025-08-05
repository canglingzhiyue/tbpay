package com.taobao.tao.combo;

import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private CustomBaseActivity f19886a;
    private View b;
    private ProgressBar c;
    private View.OnClickListener d;
    private TextView e;

    static {
        kge.a(-487412829);
    }

    public static /* synthetic */ View.OnClickListener a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("af08739c", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a06a174", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    public e(CustomBaseActivity customBaseActivity) {
        this.f19886a = customBaseActivity;
        this.b = ((ViewStub) this.f19886a.findViewById(R.id.shop_common_error_pager)).inflate();
        this.c = (ProgressBar) this.f19886a.findViewById(R.id.shop_error_view_progress);
        this.e = (TextView) this.f19886a.findViewById(R.id.shop_common_error_text);
        c();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TextView textView = this.e;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.setVisibility(0);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c.setVisibility(8);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        this.d = onClickListener;
        view.setClickable(true);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.combo.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (e.a(e.this) == null) {
                } else {
                    e.b(e.this);
                    e.a(e.this).onClick(view2);
                }
            }
        });
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b == null || this.f19886a == null) {
        } else {
            c();
            if (z) {
                a(a(R.string.flowlimt_error_text));
            } else {
                a(a(R.string.shop_common_error_data));
            }
            this.b.setVisibility(0);
        }
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : this.f19886a.getResources().getString(i);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b == null) {
        } else {
            c();
            this.b.setVisibility(8);
        }
    }
}
