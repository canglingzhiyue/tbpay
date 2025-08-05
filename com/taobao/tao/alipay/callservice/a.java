package com.taobao.tao.alipay.callservice;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f19831a;
    private b b;

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c7b4e4b5", new Object[0]);
        }
        if (f19831a == null) {
            f19831a = new a();
        }
        return f19831a;
    }

    public void a(Context context, String str, String str2, String str3, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d7903e", new Object[]{this, context, str, str2, str3, bVar});
            return;
        }
        this.b = bVar;
        Intent intent = new Intent(context, AlipayCallServiceActivity.class);
        intent.putExtra("bizType", str);
        intent.putExtra("sign_params", str2);
        intent.putExtra(MtopJSBridge.MtopJSParam.ACCOUNT_SITE, str3);
        context.startActivity(intent);
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (this.b == null) {
        } else {
            String str = null;
            if (intent == null || intent.getExtras() == null || intent.getStringExtra("errorCode") == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("errorCode");
            if (stringExtra != null) {
                str = stringExtra.toString();
            }
            if (a(str, "0")) {
                this.b.a(str, intent.getStringExtra("result"));
            } else {
                this.b.b(str, intent.getStringExtra("result"));
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    private a() {
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!a(str2) && !a(str)) {
            return str.equals(str2);
        }
        return false;
    }

    private boolean a(CharSequence charSequence) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{this, charSequence})).booleanValue();
        }
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
