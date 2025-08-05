package com.taobao.android.diagnose.message;

import android.content.Context;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.c;
import com.taobao.android.diagnose.message.protocol.ServerMessage;
import com.taobao.android.diagnose.v;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static com.taobao.android.diagnose.scene.a f11712a;
    private static b b;
    private static Context c;

    /* renamed from: lambda$ZsCNojIGesLe7YPLaq90ab-41Cw */
    public static /* synthetic */ void m909lambda$ZsCNojIGesLe7YPLaq90ab41Cw(byte[] bArr) {
        b(bArr);
    }

    static {
        kge.a(1772047978);
        f11712a = null;
        b = null;
        c = null;
    }

    public static void a(Context context, com.taobao.android.diagnose.scene.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3291144", new Object[]{context, aVar, bVar});
            return;
        }
        f11712a = aVar;
        b = bVar;
        c = context;
    }

    public static void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
            return;
        }
        v.a("DiagnoseMessageManager", "Handle accs data");
        if (bArr == null) {
            v.a("DiagnoseMessageManager", "response is null");
        } else {
            c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.message.-$$Lambda$a$ZsCNojIGesLe7YPLaq90ab-41Cw
                @Override // java.lang.Runnable
                public final void run() {
                    a.m909lambda$ZsCNojIGesLe7YPLaq90ab41Cw(bArr);
                }
            });
        }
    }

    public static /* synthetic */ void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{bArr});
            return;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (decode == null) {
                return;
            }
            ServerMessage serverMessage = (ServerMessage) JSON.parseObject(decode, ServerMessage.class, new Feature[0]);
            if (serverMessage == null) {
                v.d("DiagnoseMessageManager", "Failed to parse date to ServerMessage");
            } else {
                a(serverMessage);
            }
        } catch (Exception e) {
            v.a("DiagnoseMessageManager", "onData error.", e);
        }
    }

    private static void a(ServerMessage serverMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3dbe84", new Object[]{serverMessage});
            return;
        }
        int i = serverMessage.command;
        if (i == 1) {
            com.taobao.android.diagnose.scene.a aVar = f11712a;
            if (aVar == null) {
                return;
            }
            aVar.c();
        } else if (i == 2) {
            com.taobao.android.diagnose.scene.a aVar2 = f11712a;
            if (aVar2 == null) {
                return;
            }
            aVar2.b(serverMessage.data);
        } else if (i == 3) {
            com.taobao.android.diagnose.scene.a aVar3 = f11712a;
            if (aVar3 == null) {
                return;
            }
            aVar3.c(serverMessage.data);
        } else {
            v.a("DiagnoseMessageManager", "Unsupported command: " + serverMessage.command);
        }
    }
}
