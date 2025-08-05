package com.taobao.linkmanager.afc.xbs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.e;
import tb.kge;
import tb.koh;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1885596610);
    }

    public static void a(Context context, com.taobao.flowcustoms.afc.a aVar) {
        Intent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc04238d", new Object[]{context, aVar});
        } else if (context == null || (a2 = a(aVar)) == null) {
        } else {
            Intent a3 = a(context, aVar, a2);
            try {
                a3.putExtra(com.taobao.linkmanager.flowout.c.VISA, com.taobao.linkmanager.flowout.c.XBS_VISA);
                e.a(context, a3);
            } catch (Exception e) {
                com.taobao.flowcustoms.afc.utils.c.b("linkx", "jumpBack 异常：" + e.getMessage());
            }
        }
    }

    private static Intent a(Context context, com.taobao.flowcustoms.afc.a aVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ea987589", new Object[]{context, aVar, intent});
        }
        Intent intent2 = new Intent();
        intent2.setAction("com.alibaba.intent.action.GETWAY");
        intent2.setData(Uri.parse("tbopen://linkpartner/entrance?fl_out_id=8617ab96f88d12c0"));
        if (aVar != null && !TextUtils.isEmpty(com.taobao.flowcustoms.afc.a.b)) {
            intent2.setPackage(com.taobao.flowcustoms.afc.a.b);
        }
        intent2.putExtra("pluginRules", "forward");
        intent2.putExtra("linkIntent", intent);
        intent2.putExtra("sourcePackageName", context.getPackageName());
        intent2.putExtra(koh.SOURCE_VC, context.getClass().getName());
        return intent2;
    }

    private static Intent a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cf7ed7de", new Object[]{aVar});
        }
        if (aVar == null || TextUtils.isEmpty(aVar.h)) {
            return null;
        }
        Uri parse = Uri.parse(aVar.h);
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setFlags(268435456);
        intent.setFlags(131072);
        if (!TextUtils.isEmpty(com.taobao.flowcustoms.afc.a.b)) {
            intent.setPackage(com.taobao.flowcustoms.afc.a.b);
        }
        return intent;
    }
}
