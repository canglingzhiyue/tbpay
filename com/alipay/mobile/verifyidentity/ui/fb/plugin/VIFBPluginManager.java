package com.alipay.mobile.verifyidentity.ui.fb.plugin;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class VIFBPluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IS_PLUGIN_MODE = "isPluginMode";
    public static final String KEY_PLUGIN_NAME = "PluginName";
    public static final String KEY_SOURCE_PLUGIN_NAME = "sourcePluginName";
    public static final String KEY_SUPPORT_EMBED_VI = "supportEmbedVi";
    public static final String KEY_SUPPORT_NO_PWD_UI = "supportNoPwdUI";

    /* renamed from: a  reason: collision with root package name */
    private static final String f6087a = "VIFBPluginManager";
    public static BaseFBPlugin mBackPlugin;
    public static HashMap<String, ArrayList<BaseFBPlugin>> plugins = new HashMap<>();
    public static HashMap<String, ArrayList<BaseFBPlugin>> cachedPlugins = new HashMap<>();

    public static void addPlugin(String str, BaseFBPlugin baseFBPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcc5052", new Object[]{str, baseFBPlugin});
            return;
        }
        ArrayList<BaseFBPlugin> arrayList = plugins.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            plugins.put(str, arrayList);
        }
        arrayList.add(baseFBPlugin);
    }

    public static synchronized void cachePlugin(String str, BaseFBPlugin baseFBPlugin) {
        synchronized (VIFBPluginManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fcdac33", new Object[]{str, baseFBPlugin});
                return;
            }
            ArrayList<BaseFBPlugin> arrayList = cachedPlugins.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                cachedPlugins.put(str, arrayList);
            }
            arrayList.add(baseFBPlugin);
            String str2 = f6087a;
            VerifyLogCat.i(str2, "插件缓存添加后：" + cachedPlugins);
        }
    }

    public static synchronized void flushPlugins(String str) {
        synchronized (VIFBPluginManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77b1fd8d", new Object[]{str});
                return;
            }
            if (!StringUtils.isEmpty(str) && !cachedPlugins.isEmpty()) {
                ArrayList<BaseFBPlugin> arrayList = cachedPlugins.get(str);
                if (arrayList != null && !arrayList.isEmpty()) {
                    plugins.put(str, arrayList);
                }
                cachedPlugins.remove(str);
                String str2 = f6087a;
                VerifyLogCat.i(str2, "插件缓存flush后：" + cachedPlugins);
                return;
            }
            String str3 = f6087a;
            VerifyLogCat.i(str3, "flushPlugins时终止。verifyId：" + str + "，cachedPlugins：" + cachedPlugins);
        }
    }

    public static BaseFBPlugin getPlugin(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFBPlugin) ipChange.ipc$dispatch("b31ffd1f", new Object[]{str, str2});
        }
        ArrayList<BaseFBPlugin> arrayList = plugins.get(str);
        if (StringUtils.isEmpty(str2) || arrayList == null) {
            return null;
        }
        Iterator<BaseFBPlugin> it = arrayList.iterator();
        while (it.hasNext()) {
            BaseFBPlugin next = it.next();
            String str3 = f6087a;
            VerifyLogCat.i(str3, "getPlugin [目标插件名]: " + str2 + " , [遍历到插件]: " + next.getPluginName());
            if (str2.equalsIgnoreCase(next.getPluginName())) {
                return next;
            }
        }
        return null;
    }

    public static void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[0]);
            return;
        }
        HashMap<String, ArrayList<BaseFBPlugin>> hashMap = plugins;
        if (hashMap == null) {
            return;
        }
        for (String str : hashMap.keySet()) {
            cleanByVerifyId(str);
        }
        plugins.clear();
    }

    public static synchronized void cleanByVerifyId(String str) {
        synchronized (VIFBPluginManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e3dbfa5", new Object[]{str});
                return;
            }
            ArrayList<BaseFBPlugin> arrayList = plugins.get(str);
            if (plugins != null && arrayList != null) {
                if (!arrayList.isEmpty()) {
                    String str2 = f6087a;
                    VerifyLogCat.i(str2, "cleanByVerifyId 需要删除的插件有: " + arrayList + " , 对应[verifyId]为" + str);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        BaseFBPlugin baseFBPlugin = (BaseFBPlugin) it.next();
                        if (baseFBPlugin != null) {
                            baseFBPlugin.clear();
                        }
                    }
                    plugins.get(str).clear();
                }
                plugins.remove(str);
            }
        }
    }

    public static synchronized void cleanByVidAndPluginName(String str, String str2) {
        synchronized (VIFBPluginManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("505cefbf", new Object[]{str, str2});
                return;
            }
            ArrayList<BaseFBPlugin> arrayList = plugins.get(str);
            if (plugins != null && arrayList != null) {
                Iterator<BaseFBPlugin> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (StringUtils.equals(it.next().getPluginName(), str2)) {
                        it.remove();
                        String str3 = f6087a;
                        VerifyLogCat.i(str3, "删除插件: " + str2 + ", 对应verifyId为: " + str);
                    }
                }
            }
        }
    }
}
