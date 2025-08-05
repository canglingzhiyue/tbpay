package com.taobao.android.detail.core.aura.broadcast;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.core.aura.observer.b;
import com.taobao.android.detail.core.aura.observer.d;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.dxu;
import tb.emu;
import tb.iyh;
import tb.kge;

/* loaded from: classes4.dex */
public class AliDetailSkuPVSelectedRefreshBroadcastReceiver extends AbsAliDetailBroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTENT_FILTER_ACTION = "com.taobao.sku.intent.action.selected_sku_frame";
    public static final String KEY_SELECTED_PROP_PATH = "selectedPropPath";
    public static final String KEY_UNIQUE_ID = "uniqueId";

    /* renamed from: a  reason: collision with root package name */
    public Context f9384a;
    private int b;
    private int c;
    private Handler d;
    private b e;
    private d f;

    static {
        kge.a(-337335143);
    }

    public static /* synthetic */ Object ipc$super(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2488791", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver})).intValue() : aliDetailSkuPVSelectedRefreshBroadcastReceiver.b;
    }

    public static /* synthetic */ int a(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96c8df18", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver, new Integer(i)})).intValue();
        }
        aliDetailSkuPVSelectedRefreshBroadcastReceiver.b = i;
        return i;
    }

    public static /* synthetic */ int a(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver, Context context, String str, iyh.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7acd7482", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver, context, str, aVar})).intValue() : aliDetailSkuPVSelectedRefreshBroadcastReceiver.a(context, str, aVar);
    }

    public static /* synthetic */ boolean a(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver, Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db497e5d", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver, context, new Integer(i)})).booleanValue() : aliDetailSkuPVSelectedRefreshBroadcastReceiver.a(context, i);
    }

    public static /* synthetic */ int b(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f559f77", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver, new Integer(i)})).intValue();
        }
        aliDetailSkuPVSelectedRefreshBroadcastReceiver.c = i;
        return i;
    }

    public static /* synthetic */ b b(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ed40e8d6", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver}) : aliDetailSkuPVSelectedRefreshBroadcastReceiver.e;
    }

    public static /* synthetic */ int c(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efbcf713", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver})).intValue() : aliDetailSkuPVSelectedRefreshBroadcastReceiver.c;
    }

    public static /* synthetic */ d d(AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9e62cd52", new Object[]{aliDetailSkuPVSelectedRefreshBroadcastReceiver}) : aliDetailSkuPVSelectedRefreshBroadcastReceiver.f;
    }

    public AliDetailSkuPVSelectedRefreshBroadcastReceiver(Context context, dxu dxuVar) {
        super(context, dxuVar);
        this.b = -1;
        this.c = -1;
        this.d = new Handler(Looper.getMainLooper());
        this.f9384a = context;
        this.e = new b(context, dxuVar);
        this.f = new d(context, dxuVar);
        emu.a("com.taobao.android.detail.core.aura.broadcast.AliDetailSkuPVSelectedRefreshBroadcastReceiver");
    }

    private String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent});
        }
        String stringExtra = intent.getStringExtra("uniqueId");
        Context context = this.f9384a;
        if ((context instanceof DetailCoreActivity) && TextUtils.equals(((DetailCoreActivity) context).h, stringExtra)) {
            return intent.getStringExtra(KEY_SELECTED_PROP_PATH);
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.aura.broadcast.AbsAliDetailBroadcastReceiver
    public void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
            return;
        }
        this.e.a(aURAGlobalData);
        this.f.a(aURAGlobalData);
        this.d.post(new Runnable() { // from class: com.taobao.android.detail.core.aura.broadcast.AliDetailSkuPVSelectedRefreshBroadcastReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(AliDetailSkuPVSelectedRefreshBroadcastReceiver.this) == -1) {
                    AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver = AliDetailSkuPVSelectedRefreshBroadcastReceiver.this;
                    AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(aliDetailSkuPVSelectedRefreshBroadcastReceiver, AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(aliDetailSkuPVSelectedRefreshBroadcastReceiver, aliDetailSkuPVSelectedRefreshBroadcastReceiver.f9384a, a.KEY_PROP_PATH, AliDetailSkuPVSelectedRefreshBroadcastReceiver.b(AliDetailSkuPVSelectedRefreshBroadcastReceiver.this)));
                }
                if (AliDetailSkuPVSelectedRefreshBroadcastReceiver.c(AliDetailSkuPVSelectedRefreshBroadcastReceiver.this) != -1) {
                    return;
                }
                AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver2 = AliDetailSkuPVSelectedRefreshBroadcastReceiver.this;
                AliDetailSkuPVSelectedRefreshBroadcastReceiver.b(aliDetailSkuPVSelectedRefreshBroadcastReceiver2, AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(aliDetailSkuPVSelectedRefreshBroadcastReceiver2, aliDetailSkuPVSelectedRefreshBroadcastReceiver2.f9384a, d.KEY_PRICE_MODEL, AliDetailSkuPVSelectedRefreshBroadcastReceiver.d(AliDetailSkuPVSelectedRefreshBroadcastReceiver.this)));
            }
        });
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).registerReceiver(this, intentFilter);
    }

    private int a(Context context, String str, iyh.a aVar) {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e01f9f8", new Object[]{this, context, str, aVar})).intValue();
        }
        if ((context instanceof a) && (a2 = ((a) context).a()) != null) {
            return a2.a(str, aVar);
        }
        return -1;
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
        this.d.post(new Runnable() { // from class: com.taobao.android.detail.core.aura.broadcast.AliDetailSkuPVSelectedRefreshBroadcastReceiver.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver = AliDetailSkuPVSelectedRefreshBroadcastReceiver.this;
                AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(aliDetailSkuPVSelectedRefreshBroadcastReceiver, context, AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(aliDetailSkuPVSelectedRefreshBroadcastReceiver));
                AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver2 = AliDetailSkuPVSelectedRefreshBroadcastReceiver.this;
                AliDetailSkuPVSelectedRefreshBroadcastReceiver.a(aliDetailSkuPVSelectedRefreshBroadcastReceiver2, context, AliDetailSkuPVSelectedRefreshBroadcastReceiver.c(aliDetailSkuPVSelectedRefreshBroadcastReceiver2));
            }
        });
    }

    private boolean a(Context context, int i) {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{this, context, new Integer(i)})).booleanValue();
        }
        if ((context instanceof a) && (a2 = ((a) context).a()) != null) {
            return a2.a(i);
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else {
            a(a(intent));
        }
    }

    private void a(String str) {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Context context = this.f9384a;
        if (!(context instanceof a) || (a2 = ((a) context).a()) == null) {
            return;
        }
        a2.a(a.KEY_PROP_PATH, g.a(a2.a(a.KEY_PROP_PATH), str));
    }
}
