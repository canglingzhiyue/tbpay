package com.taobao.android.scancode.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.uc.webview.export.media.MessageID;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_CALLBACK_ACTION_PARAM = "callback_action";
    public static final String GATEWAY_CALLBACK_JSON_PARAM = "json_string";
    public static final String GATEWAY_CALLBACK_RESULT_PARAM = "callback_result";
    public static final String SCANCODE_GATEWAY_URL = "http://tb.cn/n/scancode";
    public static final String SCANCODE_PREFIX = "scan_common_";

    /* renamed from: a */
    private final HashSet<BroadcastReceiver> f14939a = new HashSet<>(10);
    private final Context b;

    /* renamed from: com.taobao.android.scancode.common.util.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC0570a {
        void a(ScancodeResult scancodeResult);
    }

    public static /* synthetic */ HashSet a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("d88d050", new Object[]{aVar}) : aVar.f14939a;
    }

    public a(Context context) {
        this.b = context;
    }

    public void a(InterfaceC0570a interfaceC0570a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf68f56", new Object[]{this, interfaceC0570a});
        } else {
            a(interfaceC0570a, null);
        }
    }

    public void a(InterfaceC0570a interfaceC0570a, ScancodeType[] scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cafd0cc", new Object[]{this, interfaceC0570a, scancodeTypeArr});
            return;
        }
        String b = b(interfaceC0570a);
        Bundle bundle = new Bundle();
        bundle.putString(GATEWAY_CALLBACK_ACTION_PARAM, b);
        Nav.from(this.b).withExtras(bundle).toUri(b(scancodeTypeArr));
    }

    public void a(InterfaceC0570a interfaceC0570a, String str, ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1643fc2", new Object[]{this, interfaceC0570a, str, scancodeTypeArr});
            return;
        }
        String b = b(interfaceC0570a);
        Bundle bundle = new Bundle();
        bundle.putString(GATEWAY_CALLBACK_ACTION_PARAM, b);
        bundle.putString(GATEWAY_CALLBACK_JSON_PARAM, str);
        Nav.from(this.b).withExtras(bundle).toUri(b(scancodeTypeArr));
    }

    private Uri b(ScancodeType[] scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3fdc1ad0", new Object[]{this, scancodeTypeArr});
        }
        Uri.Builder buildUpon = Uri.parse("https://m.taobao.com/scan_imagesearch").buildUpon();
        buildUpon.appendQueryParameter("fromScan", "true");
        String a2 = a(scancodeTypeArr);
        if (!TextUtils.isEmpty(a2)) {
            buildUpon.appendQueryParameter("scanType", a2);
        }
        Uri build = buildUpon.build();
        m.c("scan_common_Scancode", "uri===" + build.toString());
        return build;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        m.c("scan_common_Scancode", MessageID.onDestroy);
        Iterator<BroadcastReceiver> it = this.f14939a.iterator();
        while (it.hasNext()) {
            try {
                this.b.unregisterReceiver(it.next());
            } catch (Exception unused) {
            }
        }
        this.f14939a.clear();
    }

    private static String a(ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebc0f3e6", new Object[]{scancodeTypeArr});
        }
        if (scancodeTypeArr != null && scancodeTypeArr.length > 0) {
            return TextUtils.join("-", scancodeTypeArr);
        }
        return null;
    }

    public static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.split("-");
        }
        return null;
    }

    private String b(final InterfaceC0570a interfaceC0570a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9916b7cb", new Object[]{this, interfaceC0570a});
        }
        if (interfaceC0570a == null) {
            return null;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.scancode.common.util.Scancode$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    Serializable serializableExtra = intent.getSerializableExtra(a.GATEWAY_CALLBACK_RESULT_PARAM);
                    if (serializableExtra instanceof ScancodeResult) {
                        interfaceC0570a.a((ScancodeResult) serializableExtra);
                    }
                    a.a(a.this).remove(this);
                    context.unregisterReceiver(this);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        String uuid = UUID.randomUUID().toString();
        this.b.registerReceiver(broadcastReceiver, new IntentFilter(uuid));
        return uuid;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (str.startsWith("8") && str.length() == 20) || ((str.startsWith("10") || str.startsWith("11")) && str.length() == 16);
    }
}
