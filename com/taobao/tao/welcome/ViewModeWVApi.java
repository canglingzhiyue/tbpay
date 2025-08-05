package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.d;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class ViewModeWVApi extends com.taobao.android.lightvane.jsbridge.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_IS_VIEW_MODE = "isViewMode";
    private static final String ACTION_OPEN = "requestPermission";
    private static final ConcurrentHashMap<String, a> actionExtensions;

    /* loaded from: classes8.dex */
    public interface a {
        boolean a(String str, com.taobao.android.lightvane.jsbridge.d dVar);
    }

    public static /* synthetic */ Object ipc$super(ViewModeWVApi viewModeWVApi, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.android.lightvane.jsbridge.i access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.lightvane.jsbridge.i) ipChange.ipc$dispatch("ea0f9fbc", new Object[]{str}) : obtainResult(str);
    }

    static {
        kge.a(-1529188282);
        actionExtensions = new ConcurrentHashMap<>();
    }

    public static void registerActionListener(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400804aa", new Object[]{str, aVar});
        } else {
            actionExtensions.put(str, aVar);
        }
    }

    public static void unRegisterActionListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4c7697", new Object[]{str});
        } else {
            actionExtensions.remove(str);
        }
    }

    private static com.taobao.android.lightvane.jsbridge.i obtainResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.lightvane.jsbridge.i) ipChange.ipc$dispatch("254e7e6e", new Object[]{str});
        }
        com.taobao.android.lightvane.jsbridge.i iVar = new com.taobao.android.lightvane.jsbridge.i();
        iVar.a("msg", str);
        return iVar;
    }

    private boolean requestPermission(final com.taobao.android.lightvane.jsbridge.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6860ddcf", new Object[]{this, dVar})).booleanValue();
        }
        com.taobao.android.lightvane.webview.a a2 = dVar.a();
        if (a2 == null) {
            dVar.b(obtainResult("webview of context is null"));
            return false;
        }
        Context context = a2.getView().getContext();
        if (!(context instanceof Activity)) {
            dVar.b(obtainResult("the container should be Android Activity"));
            return false;
        }
        Activity activity = (Activity) context;
        if (activity.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getInt(HostController.KEY_APP_VIEW_MODE, -1) != 1) {
            dVar.b(obtainResult("not in view mode, no need to request permission"));
            return false;
        }
        h.a(h.TYPE_GENERAL, activity, new d.a() { // from class: com.taobao.tao.welcome.ViewModeWVApi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.welcome.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    dVar.a(ViewModeWVApi.access$000("permission authorized"));
                }
            }

            @Override // com.taobao.tao.welcome.d.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                dVar.b(ViewModeWVApi.access$000("permission rejected, actionId=" + i));
            }
        }).a();
        return true;
    }

    private boolean isViewMode(com.taobao.android.lightvane.jsbridge.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6208a2db", new Object[]{this, dVar})).booleanValue();
        }
        com.taobao.android.lightvane.webview.a a2 = dVar.a();
        if (a2 == null) {
            dVar.b(obtainResult("webview of context is null"));
            return false;
        }
        Context context = a2.getView().getContext();
        if (context instanceof Activity) {
            return ((Activity) context).getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getInt(HostController.KEY_APP_VIEW_MODE, -1) == 1;
        }
        dVar.b(obtainResult("the container should be Android Activity"));
        return false;
    }

    @Override // com.taobao.android.lightvane.jsbridge.c
    public boolean execute(String str, String str2, com.taobao.android.lightvane.jsbridge.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd3390e4", new Object[]{this, str, str2, dVar})).booleanValue();
        }
        if (TextUtils.equals(str, "requestPermission")) {
            return requestPermission(dVar);
        }
        if (TextUtils.equals(str, ACTION_IS_VIEW_MODE)) {
            return isViewMode(dVar);
        }
        a aVar = actionExtensions.get(str);
        if (aVar != null) {
            return aVar.a(str2, dVar);
        }
        dVar.b(obtainResult("unsupported action: " + str));
        return false;
    }
}
