package com.android.tools.ir.runtime;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.application.common.a;
import java.io.File;
import tb.cjd;
import tb.cje;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6429a;

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a694ca29", new Object[]{aVar}) : aVar.f6429a;
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3386b7", new Object[]{aVar, context});
        } else {
            aVar.b(context);
        }
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f6429a = context;
        com.taobao.application.common.c.a(new a.b() { // from class: com.android.tools.ir.runtime.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    com.taobao.application.common.c.b(this);
                    a.a(a.this, context);
                } else if (i != 50) {
                } else {
                    a.a(a.this, context);
                    com.taobao.application.common.c.b(this);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.android.tools.ir.runtime.a$2] */
    private void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.android.tools.ir.runtime.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    if (!cjd.b(context)) {
                        return null;
                    }
                    cje.a(new File(a.a(a.this).getFilesDir(), WXStorageModule.NAME));
                    cjd.c(a.a(a.this));
                    cjd.d(a.a(a.this));
                    return null;
                }
            }.execute(new Void[0]);
        }
    }
}
