package com.taobao.taobao.scancode.barcode.util;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.kakalib.express.ExpressResult;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.express.activity.ExpressDialogFragment;
import com.taobao.taobao.scancode.gateway.util.m;
import com.taobao.taobao.scancode.huoyan.ui.KakaLibLoadingDialogFragment;
import com.taobao.taobao.scancode.huoyan.ui.KakaLibTextDialogFragment;
import java.util.ArrayList;
import tb.kge;
import tb.oys;

/* loaded from: classes8.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1657533267);
    }

    public b(m mVar) {
        super(mVar);
    }

    public void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
            return;
        }
        KakaLibTextDialogFragment newInstance = KakaLibTextDialogFragment.newInstance(fragmentActivity.getString(R.string.kakalib_network_error));
        newInstance.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.barcode.util.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    b.this.startPreview();
                }
            }
        });
        a(fragmentActivity, newInstance, "REQUEST_PRODUCT");
        oys.a().a("Dialog_show_net_work_error");
    }

    public void a(FragmentActivity fragmentActivity, String str, ArrayList<ExpressResult> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1f239e", new Object[]{this, fragmentActivity, str, arrayList, new Integer(i)});
            return;
        }
        ExpressDialogFragment newInstance = ExpressDialogFragment.newInstance(str, arrayList, i);
        newInstance.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.barcode.util.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    b.this.startPreview();
                }
            }
        });
        a(fragmentActivity, newInstance, "REQUEST_PRODUCT");
        oys.a().a("Dialog_show_express");
    }

    public void b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c95e35a", new Object[]{this, fragmentActivity});
            return;
        }
        KakaLibLoadingDialogFragment newInstance = KakaLibLoadingDialogFragment.newInstance();
        newInstance.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.barcode.util.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    b.this.startPreview();
                }
            }
        });
        a(fragmentActivity, newInstance, "REQUEST_PRODUCT", new com.taobao.taobao.scancode.huoyan.ui.a() { // from class: com.taobao.taobao.scancode.barcode.util.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.scancode.huoyan.ui.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.taobao.scancode.huoyan.ui.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    b.this.startPreview();
                }
            }
        });
        oys.a().a("Dialog_show_request_loading");
    }
}
