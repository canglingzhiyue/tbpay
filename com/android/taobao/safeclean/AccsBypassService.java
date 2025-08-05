package com.android.taobao.safeclean;

import android.content.Intent;
import android.taobao.safemode.o;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.exception.IPCException;
import tb.kge;

/* loaded from: classes3.dex */
public class AccsBypassService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(194229429);
    }

    public static /* synthetic */ Object ipc$super(AccsBypassService accsBypassService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if ("false".equals(o.a(this, "support_command_safemode", "false"))) {
        } else {
            try {
                if (System.currentTimeMillis() - Long.parseLong(o.a(this, "lastTime", "0")) < 14400000) {
                    return;
                }
            } catch (Exception unused) {
            }
            o.b(this, "lastTime", String.valueOf(System.currentTimeMillis()));
            try {
                Intent intent = new Intent(this, Class.forName("android.taobao.safemode.SafeModeReceiver"));
                intent.setPackage(getPackageName());
                intent.putExtra("Launch", true);
                intent.putExtra(HeaderConstant.HEADER_KEY_VERSION, str2);
                intent.putExtra("command", str);
                sendBroadcast(intent);
            } catch (Throwable unused2) {
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent(this, MainProcessAccsReceiver.class);
        intent.putExtra("command", str);
        sendBroadcast(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    @Override // com.taobao.accs.base.AccsDataListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onData(java.lang.String r5, java.lang.String r6, java.lang.String r7, byte[] r8, com.taobao.accs.base.TaoBaseService.ExtraInfo r9) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.android.taobao.safeclean.AccsBypassService.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L21
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            r1[r5] = r7
            r5 = 4
            r1[r5] = r8
            r5 = 5
            r1[r5] = r9
            java.lang.String r5 = "694255fc"
            r0.ipc$dispatch(r5, r1)
            return
        L21:
            r5 = 0
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = "utf-8"
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            java.lang.String r8 = "appVersion"
            java.lang.String r9 = "0"
            java.lang.String r8 = r7.optString(r8, r9)     // Catch: java.lang.Throwable -> L42
            java.lang.String r9 = "type"
            java.lang.String r5 = r7.optString(r9)     // Catch: java.lang.Throwable -> L43
            r3 = r6
            r6 = r5
            r5 = r3
            goto L44
        L42:
            r8 = r5
        L43:
            r6 = r5
        L44:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L4b
            return
        L4b:
            java.lang.String r7 = "AccsSource"
            android.util.Log.e(r7, r5)
            java.lang.String r7 = "safemode"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L6b
            com.android.taobao.safeclean.g r6 = com.android.taobao.safeclean.g.a()
            java.lang.String r6 = r6.f()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L6e
            r4.a(r5, r8)
            return
        L6b:
            r4.a(r5)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.taobao.safeclean.AccsBypassService.onData(java.lang.String, java.lang.String, java.lang.String, byte[], com.taobao.accs.base.TaoBaseService$ExtraInfo):void");
    }
}
