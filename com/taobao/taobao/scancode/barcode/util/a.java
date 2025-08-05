package com.taobao.taobao.scancode.barcode.util;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.gateway.util.m;
import com.taobao.taobao.scancode.v2.result.MaResult;
import tb.kge;
import tb.oxy;
import tb.oys;

/* loaded from: classes8.dex */
public class a extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1759564015);
    }

    public a(m mVar) {
        super(mVar);
    }

    public void a(FragmentActivity fragmentActivity, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d885201f", new Object[]{this, fragmentActivity, maResult});
        } else if (oxy.f()) {
            new AlertDialog.Builder(fragmentActivity).setTitle(R.string.kakalib_qr_dialog_title).setMessage(R.string.kakalib_qr_result_unresolved).setPositiveButton(R.string.kakalib_return_to_preview, new DialogInterface.OnClickListener() { // from class: com.taobao.taobao.scancode.barcode.util.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        a.this.startPreview();
                    }
                }
            }).setCancelable(false).show();
            oys.a().a("Dialog_show_qr_code");
        } else {
            startPreview();
        }
    }
}
