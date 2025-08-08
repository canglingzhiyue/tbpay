package com.alibaba.aliweex.bundle;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f2019a;
    private View b;
    private View.OnClickListener c;
    private TextView d;

    static {
        kge.a(-1645117209);
    }

    public static /* synthetic */ View.OnClickListener a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("2a9d81f3", new Object[]{iVar}) : iVar.c;
    }

    public i(Context context, View view) {
        this.f2019a = context;
        this.b = ((ViewStub) view.findViewById(R.id.wx_fragment_error)).inflate();
        this.d = (TextView) view.findViewById(R.id.wa_common_error_text);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TextView textView = this.d;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
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
        this.c = onClickListener;
        view.setClickable(true);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.aliweex.bundle.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (i.a(i.this) == null) {
                } else {
                    i.a(i.this).onClick(view2);
                }
            }
        });
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b == null || this.f2019a == null) {
        } else {
            if (StringUtils.isEmpty(str)) {
                str = a(R.string.weex_common_error_data);
            }
            b(str);
            this.b.setVisibility(0);
        }
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : this.f2019a.getResources().getString(i);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
