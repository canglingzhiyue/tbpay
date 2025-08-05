package com.taobao.taolive.room.ui.view;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import java.util.HashMap;
import tb.ddw;
import tb.kge;
import tb.pfd;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class b extends a implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;

    static {
        kge.a(-903726245);
        kge.a(-1201612728);
        c = b.class.getSimpleName();
    }

    public b(Context context) {
        super(context, R.style.taolive_top_dialog);
        getWindow().setDimAmount(0.0f);
    }

    @Override // com.taobao.taolive.room.ui.view.a
    public WindowManager.LayoutParams a(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("9ad0565b", new Object[]{this, displayMetrics});
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 48;
        attributes.width = displayMetrics.widthPixels;
        attributes.height = d.a(getContext(), 171.0f);
        attributes.flags |= 1024;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        return attributes;
    }

    @Override // com.taobao.taolive.room.ui.view.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.f21750a).inflate(R.layout.taolive_top_more_btn_layout, (ViewGroup) null);
        if (poy.J(n.a())) {
            inflate.findViewById(R.id.taolive_top_more_report).setVisibility(8);
        } else {
            ((AliUrlImageView) inflate.findViewById(R.id.taolive_top_more_report_img)).setImageUrl("https://gw.alicdn.com/tfs/TB1OBQVNAL0gK0jSZFtXXXQCXXa-128-128.png");
            inflate.findViewById(R.id.taolive_top_more_report).setOnClickListener(this);
        }
        ((AliUrlImageView) inflate.findViewById(R.id.taolive_top_more_tobehost_img)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01VDHOlI1gZx6ci3QyD_!!6000000004157-2-tps-128-128.png");
        inflate.findViewById(R.id.taolive_top_more_close_btn).setOnClickListener(this);
        inflate.findViewById(R.id.taolive_top_more_tobehost).setOnClickListener(this);
        ai.a(n.a(), "Show-more_anchor", (HashMap<String, String>) null);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_top_more_report) {
            if (pmd.a().q() != null && pmd.a().q().c()) {
                ddw.a().a(pfd.EVENT_START_REPORT, null, n.c());
            } else if (pmd.a().q() != null) {
                try {
                    pmd.a().q().a((Activity) this.f21750a, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dismiss();
        } else if (view.getId() == R.id.taolive_top_more_close_btn) {
            dismiss();
        } else if (view.getId() != R.id.taolive_top_more_tobehost) {
        } else {
            s.a(this.f21750a, aa.a(this.f21750a));
            dismiss();
            ai.a(n.a(), "more_anchor", new String[0]);
        }
    }
}
