package com.taobao.themis.open.permission.auth.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class LocalAuthDialog$show$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAuthDialog$show$1(d dVar) {
        super(0);
        this.this$0 = dVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.this$0.b().isFinishing()) {
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.this$0.b());
            builder.setMessage(this.this$0.c());
            builder.setPositiveButton(R.string.tms_core_grant, new DialogInterface.OnClickListener() { // from class: com.taobao.themis.open.permission.auth.ui.LocalAuthDialog$show$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        LocalAuthDialog$show$1.this.this$0.d().a();
                    }
                }
            });
            builder.setNegativeButton(R.string.tms_core_cancel, new DialogInterface.OnClickListener() { // from class: com.taobao.themis.open.permission.auth.ui.LocalAuthDialog$show$1.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        LocalAuthDialog$show$1.this.this$0.d().b();
                    }
                }
            });
            AlertDialog create = builder.create();
            create.setCancelable(false);
            create.show();
        }
    }
}
