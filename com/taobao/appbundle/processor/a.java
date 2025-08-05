package com.taobao.appbundle.processor;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.appbundle.c;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.runtime.ModuleDependencyUtils;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.mbn;

/* loaded from: classes6.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(848953953);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "NewFeatureNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        g c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Log.e("NewFeatureNavProcessor", "beforeNavTo+ " + intent);
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if (component != null && component.getClassName() != null) {
            String className = component.getClassName();
            if (!TextUtils.isEmpty(className)) {
                boolean o = com.android.tools.bundleInfo.b.a().o(className);
                BundleListing.a l = com.android.tools.bundleInfo.b.a().l(className);
                ArrayList arrayList = new ArrayList();
                if (o && !TextUtils.isEmpty(l.d)) {
                    arrayList.add(l.d);
                    arrayList.addAll(ModuleDependencyUtils.getDependencies(l.d));
                    com.taobao.appbundle.remote.a.b(l.d, intent.getDataString());
                }
                if (o && (a(className) || !a(arrayList))) {
                    Log.e("NewFeatureNavProcessor", intent.toString());
                    if (com.android.tools.bundleInfo.b.a().g() && (c = c.Companion.a().c()) != null) {
                        j.b(c.Companion.a().a(), (String[]) arrayList.toArray(new String[0]));
                        if (c.a().containsAll(arrayList)) {
                            return true;
                        }
                        if (c.Companion.a().a(l.d) != null) {
                            intent2.setClass(dVar.a(), c.Companion.a().a(l.d));
                        }
                    }
                    a(l.d, intent2);
                    intent2.setPackage(dVar.k());
                    intent2.putExtra("feature_name", l.d);
                    intent2.putExtra("orignal_intent", intent);
                    if (dVar.f() > 0) {
                        intent2.putExtra("request_code", dVar.f());
                        if (dVar.a() instanceof Activity) {
                            ((Activity) dVar.a()).startActivityForResult(intent2, dVar.f());
                        }
                    } else {
                        intent2.setFlags(268435456);
                        c.Companion.a().a().startActivity(intent2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue() : c.Companion.a().c().a().containsAll(list);
    }

    public static void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{str, intent});
        } else if (TextUtils.isEmpty(c.Companion.a().b(str))) {
        } else {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(Uri.parse(c.Companion.a().b(str)));
            intent2.addCategory(mbn.BROWSER_ONLY_CATEGORY);
            intent.putExtra("load_config", new LoadConfig.a().a(intent2).a());
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            Class.forName(str);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : c.Companion.a().a() == null || com.android.tools.bundleInfo.b.a().f();
    }
}
