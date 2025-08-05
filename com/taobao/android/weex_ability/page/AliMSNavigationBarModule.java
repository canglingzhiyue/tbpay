package com.taobao.android.weex_ability.page;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.j;
import com.taobao.android.weex_ability.page.b;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class AliMSNavigationBarModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_INDEX = "index";
    private static final String KEY_TRANSPARENT = "transparent";
    public static final String NAME = "navigationBar";

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f15953a;
        public com.taobao.android.weex_framework.bridge.b b;
        public com.taobao.android.weex_framework.bridge.b c;

        static {
            kge.a(306774661);
        }

        public a(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
            this.f15953a = jSONObject;
            this.b = bVar;
            this.c = bVar2;
        }
    }

    static {
        kge.a(-642055913);
    }

    public static /* synthetic */ Object ipc$super(AliMSNavigationBarModule aliMSNavigationBarModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AliMSNavigationBarModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void show(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa4681a", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        com.taobao.android.weex_ability.page.a a2 = adapter.a(getInstance(), jSONObject);
        if (a2 != null) {
            bVar = bVar2;
        }
        bVar.a(getResultData(a2));
    }

    @MUSMethod(uiThread = true)
    public void hasMenu(Boolean bool, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df28c6db", new Object[]{this, bool, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("show", (Object) bool);
            com.taobao.android.weex_ability.page.a d = adapter.d(getInstance(), jSONObject);
            if (d != null) {
                bVar = bVar2;
            }
            if (bVar == null) {
                return;
            }
            bVar.a(getResultData(d));
        } catch (Throwable unused) {
            if (bVar2 == null) {
                return;
            }
            notSupported(bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void hide(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f063f5", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        com.taobao.android.weex_ability.page.a b = adapter.b(getInstance(), jSONObject);
        if (b != null) {
            bVar = bVar2;
        }
        bVar.a(getResultData(b));
    }

    @MUSMethod(uiThread = true)
    public void setTitle(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f88ea1", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        com.taobao.android.weex_ability.page.a g = adapter.g(getInstance(), jSONObject);
        if (g != null) {
            bVar = bVar2;
        }
        if (bVar == null) {
            return;
        }
        bVar.a(getResultData(g));
    }

    @MUSMethod(uiThread = true)
    public void setLeftItem(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1896c13b", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            setMenuItem(new a(jSONObject, bVar, bVar2), true);
        }
    }

    @MUSMethod(uiThread = true)
    public void setRightItem(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1a880a", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            setMenuItem(new a(jSONObject, bVar, bVar2), false);
        }
    }

    @MUSMethod(uiThread = true)
    public void appendMenu(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f0ecfe", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        com.taobao.android.weex_ability.page.a c = adapter.c(getInstance(), jSONObject, new b.a() { // from class: com.taobao.android.weex_ability.page.AliMSNavigationBarModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_ability.page.b.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("index", (Object) Integer.valueOf(i));
                bVar.b(jSONObject2);
            }
        });
        JSONObject resultData = getResultData(c);
        if (c == null) {
            bVar.b(resultData);
        } else {
            bVar2.a(resultData);
        }
    }

    @MUSMethod(uiThread = true)
    public void setStyle(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea89e8", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        com.taobao.android.weex_ability.page.a c = adapter.c(getInstance(), jSONObject);
        if (c != null) {
            bVar = bVar2;
        }
        bVar.a(getResultData(c));
    }

    @MUSMethod(uiThread = true)
    public void setBadgeStyle(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23c3627", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        com.taobao.android.weex_ability.page.a f = adapter.f(getInstance(), jSONObject);
        if (f != null) {
            bVar = bVar2;
        }
        bVar.a(getResultData(f));
    }

    @MUSMethod(uiThread = true)
    public void showMenu(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc8d7b", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter != null) {
            com.taobao.android.weex_ability.page.a h = adapter.h(getInstance(), jSONObject);
            if (h != null) {
                bVar = bVar2;
            }
            bVar.a(getResultData(h));
        } else if (getInstance() == null || getInstance().getContext() == null || !(getInstance().getContext().a() instanceof Activity)) {
        } else {
            TBPublicMenu tBPublicMenu = new TBPublicMenu((Activity) getInstance().getContext().a());
            tBPublicMenu.setReportArguments(new ITBPublicMenu() { // from class: com.taobao.android.weex_ability.page.AliMSNavigationBarModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.ITBPublicMenu
                public TBPublicMenu getPublicMenu() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (TBPublicMenu) ipChange2.ipc$dispatch("1f3d234e", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.uikit.actionbar.ITBPublicMenu
                public Bundle pageUserInfo() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Bundle) ipChange2.ipc$dispatch("65615653", new Object[]{this});
                    }
                    return null;
                }
            });
            tBPublicMenu.show();
        }
    }

    @MUSMethod(uiThread = true)
    public void setStatusBarStyle(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13772c5", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (Build.VERSION.SDK_INT < 23 || !(getInstance().getUIContext() instanceof Activity)) {
            if (bVar2 == null) {
                return;
            }
            bVar2.a(getResultData(new com.taobao.android.weex_ability.page.a("WX_FAILED", "not support device")));
        } else {
            Window window = ((Activity) getInstance().getUIContext()).getWindow();
            if (!"lightContent".equals(jSONObject.getString("style"))) {
                addSystemUiFlag(window, 8192);
            } else {
                removeSystemUiFlag(window, 8192);
            }
            if (bVar == null) {
                return;
            }
            bVar.a(new Object[0]);
        }
    }

    private static void addSystemUiFlag(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d3bb3", new Object[]{window, new Integer(i)});
            return;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return;
        }
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    private static void removeSystemUiFlag(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ab956", new Object[]{window, new Integer(i)});
            return;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return;
        }
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & i) <= 0) {
            return;
        }
        decorView.setSystemUiVisibility(i ^ systemUiVisibility);
    }

    @MUSMethod(uiThread = false)
    public int getStatusBarHeight(com.taobao.android.weex_framework.bridge.b bVar) {
        com.taobao.android.weex_ability.page.a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b45bb23", new Object[]{this, bVar})).intValue();
        }
        b adapter = getAdapter(getInstance(), null);
        if (adapter != null && (b = adapter.b(getInstance())) != null) {
            return toDp(b.a());
        }
        return 0;
    }

    @MUSMethod(uiThread = false)
    public int getHeight() {
        com.taobao.android.weex_ability.page.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        b adapter = getAdapter(getInstance(), null);
        if (adapter != null && (a2 = adapter.a(getInstance())) != null) {
            return toDp(a2.a());
        }
        return 0;
    }

    private int toDp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("646347ab", new Object[]{this, str})).intValue();
        }
        try {
            return (int) ((Integer.parseInt(str) / getInstance().getUIContext().getResources().getDisplayMetrics().density) + 0.5f);
        } catch (Exception unused) {
            return 0;
        }
    }

    @MUSMethod(uiThread = true)
    public void setTransparent(boolean z, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64172c4b", new Object[]{this, new Boolean(z), bVar, bVar2});
            return;
        }
        b adapter = getAdapter(getInstance(), bVar2);
        if (adapter == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transparent", (Object) Boolean.valueOf(z));
            com.taobao.android.weex_ability.page.a e = adapter.e(getInstance(), jSONObject);
            if (e != null) {
                bVar = bVar2;
            }
            if (bVar == null) {
                return;
            }
            bVar.a(getResultData(e));
        } catch (Throwable unused) {
            if (bVar2 == null) {
                return;
            }
            notSupported(bVar2);
        }
    }

    private void notSupported(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ed9b39", new Object[]{this, bVar});
        } else if (bVar == null) {
            com.taobao.android.weex_framework.util.g.f(NAME, "notSupported -> failure callback is null");
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) "MS_NOT_SUPPORTED");
            bVar.a(jSONObject);
        }
    }

    private void setMenuItem(final a aVar, boolean z) {
        com.taobao.android.weex_ability.page.a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a0ca2", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        b adapter = getAdapter(getInstance(), aVar.c);
        if (adapter == null) {
            return;
        }
        if (z) {
            b = adapter.a(getInstance(), aVar.f15953a, new b.a() { // from class: com.taobao.android.weex_ability.page.AliMSNavigationBarModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_ability.page.b.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                    aVar.b.b(jSONObject);
                }
            });
        } else {
            b = adapter.b(getInstance(), aVar.f15953a, new b.a() { // from class: com.taobao.android.weex_ability.page.AliMSNavigationBarModule.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_ability.page.b.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                    aVar.b.b(jSONObject);
                }
            });
        }
        JSONObject resultData = getResultData(b);
        if (b == null) {
            aVar.b.b(resultData);
        } else {
            aVar.c.a(resultData);
        }
    }

    private static b getAdapter(p pVar, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("47d0fb8f", new Object[]{pVar, bVar});
        }
        b bVar2 = (b) pVar.getTag("ali_ms_navigation");
        if (bVar2 == null) {
            bVar2 = j.a().e();
        }
        if (bVar2 != null) {
            return bVar2;
        }
        com.taobao.android.weex_ability.page.a aVar = new com.taobao.android.weex_ability.page.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR, com.taobao.android.weex_ability.page.a.ERROR_NAVIGATION_ADAPTER);
        if (bVar != null) {
            bVar.a(getResultData(aVar));
        }
        return null;
    }

    private static JSONObject getResultData(com.taobao.android.weex_ability.page.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee2d4e2", new Object[]{aVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (aVar == null) {
            return jSONObject;
        }
        jSONObject.put("message", (Object) aVar.b());
        jSONObject.put("result", (Object) aVar.a());
        if (aVar.c() != null) {
            for (Map.Entry<String, Object> entry : aVar.c().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public boolean getIsStatusBarFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1fffcc7", new Object[]{this})).booleanValue();
        }
        if (getInstance() != null && getInstance().getContext() != null && (getInstance().getContext().a() instanceof Activity)) {
            Activity activity = (Activity) getInstance().getContext().a();
            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null && activity.getWindow().getDecorView().getSystemUiVisibility() == 1024) {
                return true;
            }
        }
        return false;
    }
}
