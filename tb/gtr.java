package tb;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class gtr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ArrayList<a> SCAN_INTENT_MATCHERS;

    /* loaded from: classes3.dex */
    interface a {
        boolean a(Intent intent);
    }

    static {
        kge.a(1571208149);
        ArrayList<a> arrayList = new ArrayList<>(10);
        SCAN_INTENT_MATCHERS = arrayList;
        arrayList.add(new a() { // from class: tb.gtr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                Uri data = intent.getData();
                return data != null && data.getBooleanQueryParameter("fromScan", false);
            }
        });
        SCAN_INTENT_MATCHERS.add(new a() { // from class: tb.gtr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                IntentFilter intentFilter = new IntentFilter("com.taobao.huoyan.scan");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                return intentFilter.matchAction(intent.getAction());
            }
        });
        SCAN_INTENT_MATCHERS.add(new a() { // from class: tb.gtr.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
                intentFilter.addCategory("android.intent.category.BROWSABLE");
                intentFilter.addDataScheme("http");
                intentFilter.addDataScheme("https");
                intentFilter.addDataAuthority("tb.cn", null);
                intentFilter.addDataPath("/x/hy/", 1);
                return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
            }
        });
        SCAN_INTENT_MATCHERS.add(new a() { // from class: tb.gtr.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                intentFilter.addCategory("android.intent.category.BROWSABLE");
                intentFilter.addDataScheme("http");
                intentFilter.addDataScheme("https");
                intentFilter.addDataAuthority("m.taobao.com", null);
                intentFilter.addDataPath("/scancode/scan", 0);
                return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
            }
        });
        SCAN_INTENT_MATCHERS.add(new a() { // from class: tb.gtr.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                intentFilter.addCategory("android.intent.category.BROWSABLE");
                intentFilter.addDataScheme("http");
                intentFilter.addDataScheme("https");
                intentFilter.addDataAuthority("tb.cn", null);
                intentFilter.addDataPath("/n/scancode", 0);
                return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
            }
        });
        SCAN_INTENT_MATCHERS.add(new a() { // from class: tb.gtr.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                intentFilter.addCategory("android.intent.category.BROWSABLE");
                intentFilter.addDataScheme("http");
                intentFilter.addDataScheme("https");
                intentFilter.addDataAuthority("tb.cn", null);
                intentFilter.addDataPath("/n/scancode", 0);
                return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
            }
        });
        SCAN_INTENT_MATCHERS.add(new a() { // from class: tb.gtr.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtr.a
            public boolean a(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                intentFilter.addCategory("android.intent.category.BROWSABLE");
                intentFilter.addDataScheme("http");
                intentFilter.addDataScheme("https");
                intentFilter.addDataScheme("taobao");
                intentFilter.addDataAuthority("h5.m.taobao.com", null);
                intentFilter.addDataPath("/tusou/capture_sys.html", 0);
                return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
            }
        });
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        Iterator<a> it = SCAN_INTENT_MATCHERS.iterator();
        while (it.hasNext()) {
            if (it.next().a(intent)) {
                Uri data = intent.getData();
                String action = data == null ? intent.getAction() : data.toString();
                if (action == null) {
                    action = "unknown";
                }
                if (com.a()) {
                    cuk a2 = cuk.a();
                    Application b = com.b();
                    a2.a(b, "matchIntent: " + action);
                }
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "matchScanUri", 19999, "param", action);
                return true;
            }
        }
        return false;
    }
}
