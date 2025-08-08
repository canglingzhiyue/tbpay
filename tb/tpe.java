package tb;

import android.content.res.AssetManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes5.dex */
public class tpe implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<DXWidgetNode> f34247a;
    private final int b = 5;
    private final int c = 10;

    static {
        kge.a(-1225192198);
        kge.a(-1390502639);
    }

    public tpe(DXWidgetNode dXWidgetNode) {
        this.f34247a = new WeakReference<>(dXWidgetNode);
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{dXWidgetNode});
        } else {
            kyc.a(new tpe(dXWidgetNode));
        }
    }

    public static void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b577266", new Object[]{dXWidgetNode});
        } else {
            new tpe(dXWidgetNode).run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        kxt.a(Thread.currentThread().getName() + " language loader");
        DXWidgetNode dXWidgetNode = this.f34247a.get();
        if (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) {
            return;
        }
        try {
            DXTemplateItem c = dXWidgetNode.getDXRuntimeContext().c();
            if (c != null && c.g != null && (map = c.g.b) != null && !map.isEmpty()) {
                if (c.e && map.containsKey(LoggingSPCache.STORAGE_LANGUAGE)) {
                    AssetManager assets = dXWidgetNode.getDXRuntimeContext().m().getAssets();
                    String str = map.get(LoggingSPCache.STORAGE_LANGUAGE);
                    String[] proxy_list = AssetsDelegate.proxy_list(assets, str);
                    if (proxy_list != null && proxy_list.length > 0) {
                        for (String str2 : proxy_list) {
                            map.put("language/" + str2, str + "/" + str2);
                        }
                    }
                }
                if (a(dXWidgetNode, map, "language/" + c.f11925a + "_" + c.b + "_language_")) {
                    return;
                }
                a(dXWidgetNode, map, "language/language_");
            }
        } catch (Exception unused) {
            fux.b("templateItem:" + dXWidgetNode.getDXRuntimeContext().c() + " 多语言文件读取失败～");
        }
    }

    private boolean a(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0faef2c", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        if (fqi.bi()) {
            return d(dXWidgetNode, map, str);
        }
        if (fqi.bh()) {
            return c(dXWidgetNode, map, str);
        }
        if (fqi.bg()) {
            return b(dXWidgetNode, map, str);
        }
        kxt.a("DXLanguageLoaderOpt extractLanguageConfig ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!StringUtils.isEmpty(key) && key.contains(str)) {
                JSONObject parseObject = JSONObject.parseObject(new String(fwn.a().a(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                String replace = new String(key.getBytes()).replace(str, "");
                if (!StringUtils.isEmpty(replace)) {
                    dXWidgetNode.addLanguageConfigSync(replace.replace(".json", ""), parseObject);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean b(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f82006d", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        kxt.a("DXLanguageLoaderOpt extractLanguageConfigSubStr ");
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!StringUtils.isEmpty(key) && key.indexOf(str) == 0) {
                JSONObject parseObject = JSONObject.parseObject(new String(fwn.a().a(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                String substring = key.substring(str.length());
                if (!StringUtils.isEmpty(substring) && substring.length() > 5) {
                    dXWidgetNode.addLanguageConfigSync(substring.substring(0, substring.length() - 5), parseObject);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean c(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0911ae", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        kxt.a("DXLanguageLoaderOpt extractLanguageConfigBugfix ");
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!StringUtils.isEmpty(key) && key.indexOf(str) == 0) {
                JSONObject parseObject = JSONObject.parseObject(new String(fwn.a().a(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                int length = key.length();
                char[] cArr = new char[5];
                if (length > 10) {
                    key.getChars(length - 10, length - 5, cArr, 0);
                    dXWidgetNode.addLanguageConfigSync(new String(cArr), parseObject);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean d(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c9022ef", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        kxt.a("DXLanguageLoaderOpt extractLanguageConfigPerfOpt ");
        String a2 = u.k().a();
        String str2 = map.get(str + a2 + ".json");
        if (StringUtils.isEmpty(str2)) {
            return false;
        }
        dXWidgetNode.addLanguageConfigSync(a2, JSONObject.parseObject(new String(fwn.a().a(str2, dXWidgetNode.getDXRuntimeContext()))));
        return true;
    }
}
