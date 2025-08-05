package com.ap.zoloz.hummer.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f6451a;
    private zoloz.ap.com.toolkit.ui.a b;
    private Context c;

    static {
        kge.a(-189937089);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ec704d4a", new Object[0]);
        }
        if (f6451a == null) {
            synchronized (a.class) {
                if (f6451a == null) {
                    f6451a = new a();
                }
            }
        }
        return f6451a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
            this.b = null;
        }
        f6451a = null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.c = context;
        zoloz.ap.com.toolkit.ui.a aVar = this.b;
        if (aVar == null) {
            this.b = new zoloz.ap.com.toolkit.ui.a((Activity) context);
        } else {
            aVar.a((Activity) context);
        }
    }

    public void a(String str, String str2, String str3, String str4, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475bcb89", new Object[]{this, str, str2, str3, str4, dVar});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a();
        if (StringUtil.isNullorEmpty(str4)) {
            this.b.a(str, str2, str3, new DialogInterface.OnClickListener() { // from class: com.ap.zoloz.hummer.common.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    dialogInterface.dismiss();
                    dVar.a();
                }
            }, null, null);
        } else {
            this.b.a(str, str2, str3, new DialogInterface.OnClickListener() { // from class: com.ap.zoloz.hummer.common.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    dialogInterface.dismiss();
                    dVar.a();
                }
            }, str4, new DialogInterface.OnClickListener() { // from class: com.ap.zoloz.hummer.common.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    dialogInterface.dismiss();
                    dVar.b();
                }
            });
        }
    }

    public void a(final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b4adc0", new Object[]{this, eVar});
            return;
        }
        Context context = this.c;
        if (context == null) {
            return;
        }
        a(context.getApplicationContext().getString(R.string.system_error_title), this.c.getApplicationContext().getString(R.string.system_error_msg), this.c.getApplicationContext().getString(R.string.system_error_got_it), null, new d() { // from class: com.ap.zoloz.hummer.common.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ap.zoloz.hummer.common.d
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // com.ap.zoloz.hummer.common.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                e eVar2 = eVar;
                if (eVar2 == null) {
                    return;
                }
                eVar2.a();
            }
        });
    }

    public void a(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c260ddd9", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(str, z, onCancelListener, z2);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public void b(final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8d6d81", new Object[]{this, eVar});
            return;
        }
        Context context = this.c;
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        a().a(applicationContext.getString(R.string.network_error_title), applicationContext.getString(R.string.network_error_msg), applicationContext.getString(R.string.network_error_retry), applicationContext.getString(R.string.network_error_exit), new d() { // from class: com.ap.zoloz.hummer.common.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ap.zoloz.hummer.common.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                e eVar2 = eVar;
                if (eVar2 == null) {
                    return;
                }
                eVar2.a(true);
            }

            @Override // com.ap.zoloz.hummer.common.d
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                e eVar2 = eVar;
                if (eVar2 == null) {
                    return;
                }
                eVar2.a(false);
            }
        });
    }
}
