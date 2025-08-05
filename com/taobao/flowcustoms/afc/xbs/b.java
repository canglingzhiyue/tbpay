package com.taobao.flowcustoms.afc.xbs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(563281307);
    }

    public static void a(Context context, com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc04238d", new Object[]{context, aVar});
            return;
        }
        Intent a2 = a(aVar);
        if (a2 == null || context == null) {
            return;
        }
        try {
            if (!(context instanceof Activity)) {
                a2.addFlags(268435456);
            }
            a2.putExtra(com.taobao.linkmanager.flowout.c.VISA, com.taobao.linkmanager.flowout.c.XBS_VISA);
            context.startActivity(a2);
        } catch (Throwable th) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TipsBack === jumpBack  异常：" + th.toString());
        }
    }

    private static Intent a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cf7ed7de", new Object[]{aVar});
        }
        String str = "";
        String str2 = aVar == null ? str : aVar.h;
        if (aVar != null) {
            str = com.taobao.flowcustoms.afc.a.b;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Uri parse = Uri.parse(str2);
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setFlags(268435456);
        intent.setFlags(131072);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return intent;
    }
}
