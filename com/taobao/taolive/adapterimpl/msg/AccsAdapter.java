package com.taobao.taolive.adapterimpl.msg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.pnl;
import tb.pnm;

/* loaded from: classes8.dex */
public class AccsAdapter implements pnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21377a;
    private AccsStateReceiver b;
    private List<pnm> c = new ArrayList();

    static {
        kge.a(-1181969669);
        kge.a(1254592997);
    }

    public static /* synthetic */ List a(AccsAdapter accsAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6f69b28b", new Object[]{accsAdapter}) : accsAdapter.c;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            if (this.b == null) {
                this.b = new AccsStateReceiver();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
            context.registerReceiver(this.b, intentFilter);
            this.f21377a = true;
        } catch (Exception unused) {
            this.f21377a = false;
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        AccsStateReceiver accsStateReceiver = this.b;
        if (accsStateReceiver == null) {
            return;
        }
        context.unregisterReceiver(accsStateReceiver);
        this.b = null;
        this.f21377a = false;
    }

    @Override // tb.pnl
    public void a(Context context, pnm pnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c09da41", new Object[]{this, context, pnmVar});
        } else if (pnmVar == null) {
        } else {
            if (this.c.isEmpty()) {
                a(context);
            }
            if (!this.c.contains(pnmVar)) {
                this.c.add(pnmVar);
            }
            if (this.f21377a) {
                return;
            }
            pnmVar.a(null, -1, "");
        }
    }

    @Override // tb.pnl
    public void b(Context context, pnm pnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5c76e0", new Object[]{this, context, pnmVar});
        } else if (pnmVar == null) {
        } else {
            this.c.remove(pnmVar);
            if (!this.c.isEmpty()) {
                return;
            }
            b(context);
        }
    }

    /* loaded from: classes8.dex */
    public class AccsStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1854755547);
        }

        private AccsStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getSerializableExtra(Constants.KEY_CONNECT_INFO);
                if (connectInfo == null) {
                    return;
                }
                for (pnm pnmVar : AccsAdapter.a(AccsAdapter.this)) {
                    if (pnmVar != null) {
                        pnmVar.a(Boolean.valueOf(connectInfo.connected), connectInfo.errorCode, connectInfo.errordetail);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
