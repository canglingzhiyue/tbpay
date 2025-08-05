package com.taobao.android.editionswitcher;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.kxf;
import tb.lbq;
import tb.njn;
import tb.njr;

/* loaded from: classes5.dex */
public class c implements njr {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<lbq> f12283a;
    int b;
    boolean c;
    private TBMaterialDialog d;
    private HomeLocationResult e;

    static {
        kge.a(396811826);
        kge.a(1885639559);
    }

    @Override // tb.njr
    public String a() {
        return "normal";
    }

    @Override // tb.njr
    public long d() {
        return 0L;
    }

    public c(lbq lbqVar, int i, HomeLocationResult homeLocationResult) {
        this.c = false;
        this.f12283a = new WeakReference<>(lbqVar);
        this.b = i;
        this.e = homeLocationResult;
        this.d = a(lbqVar.getCurActivity(), i, homeLocationResult);
    }

    public c(Context context, int i, HomeLocationResult homeLocationResult) {
        this.c = false;
        this.f12283a = new WeakReference<>(null);
        this.b = i;
        this.e = homeLocationResult;
        this.d = a(context, i, homeLocationResult);
    }

    @Override // tb.njr
    public void b() {
        this.c = true;
        TBMaterialDialog tBMaterialDialog = this.d;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.show();
            View customView = this.d.getCustomView();
            if (!(customView instanceof EditionSwitchView)) {
                return;
            }
            ((EditionSwitchView) customView).traceShowEvent();
            return;
        }
        e();
    }

    @Override // tb.njr
    public boolean c() {
        return this.c;
    }

    private TBMaterialDialog a(Context context, int i, HomeLocationResult homeLocationResult) {
        View hTaoEditionSwitchView;
        if (context == null) {
            return null;
        }
        try {
            h hVar = new h() { // from class: com.taobao.android.editionswitcher.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.editionswitcher.h
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.this.e();
                    }
                }
            };
            if (l.f(context)) {
                if (l.i(context)) {
                    hTaoEditionSwitchView = new OldEditionSwitchView(context, i, hVar);
                } else {
                    hTaoEditionSwitchView = new HTaoEditionSwitchView(context, i, hVar);
                }
            } else if (l.e(context)) {
                hTaoEditionSwitchView = new OldEditionSwitchView(context, i, hVar);
            } else {
                hTaoEditionSwitchView = new HTaoEditionSwitchView(context, i, hVar);
            }
            com.taobao.android.home.component.utils.e.b("EditionSwitcherPopOperation", hTaoEditionSwitchView.getClass().getName());
            TBMaterialDialog build = new TBMaterialDialog.Builder(hTaoEditionSwitchView.getContext()).customView(hTaoEditionSwitchView, false).cardDialog(true).build();
            a(build);
            build.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.editionswitcher.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    View customView = c.this.d.getCustomView();
                    if (customView instanceof EditionSwitchView) {
                        EditionSwitchView editionSwitchView = (EditionSwitchView) customView;
                        editionSwitchView.traceCancelEvent();
                        editionSwitchView.onDismiss();
                    }
                    lbq lbqVar = c.this.f12283a.get();
                    if (lbqVar != null) {
                        njn.a(lbqVar.getClass().getName()).b(c.this);
                    }
                    kxf.a().c(50019);
                }
            });
            return build;
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.b("EditionSwitcherPopOperation", th, new String[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        TBMaterialDialog tBMaterialDialog = this.d;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.setOnDismissListener(null);
            this.d.dismiss();
        }
        lbq lbqVar = this.f12283a.get();
        if (lbqVar != null) {
            njn.a(lbqVar.getClass().getName()).b(this);
        }
    }

    private void a(TBMaterialDialog tBMaterialDialog) {
        HomeLocationResult homeLocationResult;
        if (!l.g(tBMaterialDialog.getContext()) || this.b != 0 || (homeLocationResult = this.e) == null || !TextUtils.equals(homeLocationResult.isNewVillageDialog, "y") || !TextUtils.equals(this.e.villageForceSwitch, "y")) {
            return;
        }
        try {
            tBMaterialDialog.getView().findViewById(R.id.uik_mdButtonClose).setVisibility(8);
            tBMaterialDialog.setCanceledOnTouchOutside(false);
            tBMaterialDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.android.editionswitcher.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue() : i == 4;
                }
            });
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.b("EditionSwitcherPopOperation", th, new String[0]);
        }
    }
}
