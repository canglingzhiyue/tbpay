package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import com.ut.mini.UTTracker;
import com.ut.mini.l;
import com.ut.mini.module.trackerlistener.b;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;
import tb.ogg;

@CleanAnnotation(name = "clean")
/* loaded from: classes5.dex */
public class RouteListenerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<String, g.c> f13254a;

    public static /* synthetic */ JSONObject a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("78ab1fb0", new Object[]{str, str2, str3, str4}) : b(str, str2, str3, str4);
    }

    static {
        kge.a(1633545925);
        kge.a(-818961104);
        f13254a = new WeakHashMap<>();
    }

    public static void registerPageListener(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919f4972", new Object[]{cVar});
        } else if (!"true".equals(OrangeConfig.getInstance().getConfig("tnode", "openRouteListenerModule", "true")) || !(cVar.b instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) cVar.b).getString("scence");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f13254a.put(string, cVar);
            a.a(new a.InterfaceC0512a() { // from class: com.taobao.android.layoutmanager.module.RouteListenerModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.module.RouteListenerModule.a.InterfaceC0512a
                public void a(String str, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
                    } else if (str != null && str2 != null && str3 != null && str4 != null) {
                        ogg.a("TnodeRouteListenerModule", "routePath:" + str + "->" + str3);
                        for (Map.Entry<String, g.c> entry : RouteListenerModule.f13254a.entrySet()) {
                            g.c value = entry.getValue();
                            if (value != null) {
                                value.c.a(value, RouteListenerModule.a(str, str2, str3, str4));
                            }
                        }
                    }
                }
            });
        }
    }

    private static JSONObject b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("59b75a31", new Object[]{str, str2, str3, str4});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lastPage", (Object) str);
        jSONObject.put("lastActivity", (Object) str2);
        jSONObject.put("currentPage", (Object) str3);
        jSONObject.put("currentActivity", (Object) str4);
        return jSONObject;
    }

    public static void unregisterPageListener(g.c cVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d501ba79", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || (string = ((JSONObject) cVar.b).getString("scence")) == null) {
        } else {
            f13254a.remove(string);
            if (f13254a.size() != 0) {
                return;
            }
            a.a();
        }
    }

    public static void clean(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f1097", new Object[]{abVar});
            return;
        }
        f13254a.clear();
        a.a();
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static a h;

        /* renamed from: a  reason: collision with root package name */
        public int f13255a = 1;
        public String b = "";
        public String c = "";
        public String d = "";
        public String e = "";
        public InterfaceC0512a f = null;
        public com.ut.mini.module.trackerlistener.a g = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.taobao.android.layoutmanager.module.RouteListenerModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC0512a {
            void a(String str, String str2, String str3, String str4);
        }

        public static /* synthetic */ boolean a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92c2c6d0", new Object[]{aVar, new Integer(i)})).booleanValue() : aVar.a(i);
        }

        static {
            kge.a(1083060433);
            h = null;
        }

        public static void a(InterfaceC0512a interfaceC0512a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c45d1d7a", new Object[]{interfaceC0512a});
            } else if (h != null) {
            } else {
                a aVar = new a();
                h = aVar;
                aVar.b();
                h.f = interfaceC0512a;
            }
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            try {
                if (h != null && h.g != null) {
                    b.getInstance().unregisterListener(h.g);
                }
                h = null;
            } catch (Throwable th) {
                ogg.a("RouteListenerModule", "exception:" + th.getMessage());
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            try {
                this.g = new com.ut.mini.module.trackerlistener.a() { // from class: com.taobao.android.layoutmanager.module.RouteListenerModule.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == -1491668773) {
                            super.pageAppear((UTTracker) objArr[0], objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // com.ut.mini.module.trackerlistener.a
                    public String trackerListenerName() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1d8246a2", new Object[]{this}) : "tnode";
                    }

                    @Override // com.ut.mini.module.trackerlistener.a
                    public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
                        Uri data;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
                            return;
                        }
                        try {
                            super.pageAppear(uTTracker, obj, str, z);
                            a.a(a.this, 2);
                            if (str != null) {
                                updatePageName(uTTracker, obj, str);
                            }
                            if (!(obj instanceof BrowserActivity) || (data = ((Activity) obj).getIntent().getData()) == null) {
                                return;
                            }
                            updatePageName(uTTracker, obj, data.getHost() + data.getPath());
                        } catch (Throwable th) {
                            ogg.a("RouteListenerModule", th.getMessage());
                        }
                    }

                    @Override // com.ut.mini.module.trackerlistener.a
                    public void pageDisAppear(UTTracker uTTracker, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
                        } else {
                            a.a(a.this, 1);
                        }
                    }

                    @Override // com.ut.mini.module.trackerlistener.a
                    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
                        } else if (str == null) {
                        } else {
                            try {
                                if (str.equals(a.this.c) || obj == null || !a.a(a.this, 4)) {
                                    return;
                                }
                                a.this.b = a.this.c;
                                a.this.d = a.this.e;
                                a.this.c = str;
                                a.this.e = obj.getClass().getSimpleName();
                                a.this.f.a(a.this.b, a.this.d, a.this.c, a.this.e);
                            } catch (Throwable th) {
                                ogg.a("RouteListenerModule", th.getMessage());
                            }
                        }
                    }
                };
                b.getInstance().registerListener(this.g);
                if (l.getInstance() == null) {
                    return;
                }
                this.c = l.getInstance().getCurrentPageName();
            } catch (Throwable th) {
                ogg.a("RouteListenerModule", "exception:" + th.getMessage());
            }
        }

        private boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i != 1) {
                if (i == 2) {
                    if (b(1)) {
                        this.f13255a = i;
                        return true;
                    }
                } else if (i == 4 && b(2)) {
                    this.f13255a = i;
                    return true;
                }
            } else if (b(7)) {
                this.f13255a = i;
                return true;
            }
            return false;
        }

        private boolean b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : (i & this.f13255a) != 0;
        }
    }
}
