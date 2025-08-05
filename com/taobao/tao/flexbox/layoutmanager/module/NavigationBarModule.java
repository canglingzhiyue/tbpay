package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.ohd;

@CleanAnnotation(name = "remove")
/* loaded from: classes8.dex */
public class NavigationBarModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<ab, ArrayList<b>> menusMap;

    /* loaded from: classes8.dex */
    public interface a {
        public static final int MENU_FEEDBACK = 3;
        public static final int MENU_HELP = 2;
        public static final int MENU_HOME = 1;
        public static final int MENU_MESSAGE = 0;
        public static final int[] defaultMenus = {0, 1, 2, 3};

        void a(int[] iArr);
    }

    public static void hideStatusBar(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a72d99", new Object[]{cVar});
        }
    }

    public static void showStatusBar(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd27b94", new Object[]{cVar});
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20442a;
        public String b;
        public String c;
        public g.d d;

        static {
            kge.a(113130912);
        }

        public b(String str, String str2, g.d dVar) {
            this.f20442a = str;
            this.b = str2;
            this.d = dVar;
        }

        public b(String str, String str2, String str3, g.d dVar) {
            this.f20442a = str;
            this.b = str2;
            this.c = str3;
            this.d = dVar;
        }
    }

    static {
        kge.a(-1804085135);
        kge.a(-818961104);
        menusMap = new HashMap<>();
    }

    public static ArrayList<b> getMenus(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9a285626", new Object[]{abVar}) : menusMap.get(abVar);
    }

    public static void remove(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbfae12", new Object[]{abVar});
        } else {
            menusMap.remove(abVar);
        }
    }

    public static void setTitle(g.c cVar) {
        final ActionBar actionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6114702", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            String str = null;
            String string = ((JSONObject) cVar.b).containsKey("title") ? ((JSONObject) cVar.b).getString("title") : null;
            String string2 = ((JSONObject) cVar.b).containsKey("subtitle") ? ((JSONObject) cVar.b).getString("subtitle") : null;
            if (((JSONObject) cVar.b).containsKey("icon")) {
                str = ((JSONObject) cVar.b).getString("icon");
            }
            String str2 = str;
            if (cVar.f19938a.g() instanceof f) {
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                ((f) cVar.f19938a.g()).setTitle(string);
            } else if (cVar.a() instanceof AppCompatActivity) {
                final android.support.v7.app.ActionBar supportActionBar = ((AppCompatActivity) cVar.a()).getSupportActionBar();
                if (supportActionBar == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(cVar.a(), str2, -1, -1, new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                        public void onImageLoadFailed() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                            } else {
                                android.support.v7.app.ActionBar.this.a(bitmapDrawable);
                            }
                        }
                    });
                    return;
                }
                if (!TextUtils.isEmpty(string)) {
                    supportActionBar.c(12);
                    supportActionBar.a(string);
                }
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                supportActionBar.b(string2);
            } else if (!(cVar.a() instanceof Activity) || (actionBar = ((Activity) cVar.a()).getActionBar()) == null) {
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(cVar.a(), str2, -1, -1, new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                        public void onImageLoadFailed() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                            } else {
                                actionBar.setIcon(bitmapDrawable);
                            }
                        }
                    });
                    return;
                }
                if (!TextUtils.isEmpty(string)) {
                    actionBar.setTitle(string);
                }
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                actionBar.setSubtitle(string2);
            }
        }
    }

    public static void setStyle(g.c cVar) {
        int identifier;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b66cc9", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) cVar.b).getString("color");
            String string2 = ((JSONObject) cVar.b).getString("backgroundColor");
            ((JSONObject) cVar.b).getString("borderBottomWidth");
            ((JSONObject) cVar.b).getString("borderBottomColor");
            if (cVar.a() instanceof AppCompatActivity) {
                android.support.v7.app.ActionBar supportActionBar = ((AppCompatActivity) cVar.a()).getSupportActionBar();
                if (!TextUtils.isEmpty(string2)) {
                    supportActionBar.b(new ColorDrawable(Color.parseColor(string2)));
                }
            } else if ((cVar.a() instanceof Activity) && !TextUtils.isEmpty(string2)) {
                ((Activity) cVar.a()).getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(string2)));
            }
            if (TextUtils.isEmpty(string) || (identifier = Resources.getSystem().getIdentifier("action_bar_title", "id", "android")) <= 0 || (textView = (TextView) ((AppCompatActivity) cVar.a()).findViewById(identifier)) == null) {
                return;
            }
            textView.setTextColor(Color.parseColor(string));
        }
    }

    public static void show(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359915fb", new Object[]{cVar});
        } else if (cVar.f19938a.g() instanceof f) {
            ((f) cVar.f19938a.g()).showActionBar();
        } else if (cVar.a() instanceof AppCompatActivity) {
            ((AppCompatActivity) cVar.a()).getSupportActionBar().d();
        } else if (!(cVar.a() instanceof Activity)) {
        } else {
            ((Activity) cVar.a()).getActionBar().show();
        }
    }

    public static void hide(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d041a56", new Object[]{cVar});
        } else if (cVar.f19938a.g() instanceof f) {
            ((f) cVar.f19938a.g()).hideActionBar();
        } else if (cVar.a() instanceof AppCompatActivity) {
            ((AppCompatActivity) cVar.a()).getSupportActionBar().e();
        } else if (!(cVar.a() instanceof Activity)) {
        } else {
            ((Activity) cVar.a()).getActionBar().hide();
        }
    }

    public static void appendNaviMenu(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb34dd9", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) cVar.b;
        String string = jSONObject.getString("icon");
        String string2 = jSONObject.getString("title");
        Activity activity = (Activity) cVar.a();
        ArrayList<b> arrayList = menusMap.get(cVar.f19938a);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            menusMap.put(cVar.f19938a, arrayList);
        }
        arrayList.add(new b(string, string2, cVar.c));
        activity.invalidateOptionsMenu();
    }

    public static void setNaviMenu(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602d8191", new Object[]{cVar});
            return;
        }
        try {
            JSONArray jSONArray = ((JSONObject) cVar.b).getJSONArray("menu");
            if (jSONArray == null) {
                return;
            }
            int[] iArr = new int[jSONArray.size()];
            for (int i = 0; i < jSONArray.size(); i++) {
                iArr[i] = jSONArray.getIntValue(i);
            }
            if (!(cVar.a() instanceof a)) {
                return;
            }
            ((a) cVar.a()).a(iArr);
        } catch (Throwable unused) {
        }
    }

    public static void showNaviMenu(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc2356", new Object[]{cVar});
        } else {
            cVar.a();
        }
    }

    public static void setNaviBarLeftItem(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f55d153", new Object[]{cVar});
        } else {
            setTitle(cVar);
        }
    }

    public static void setNaviBarRightItem(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b284414", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            String str = null;
            String string = ((JSONObject) cVar.b).containsKey("title") ? ((JSONObject) cVar.b).getString("title") : null;
            if (((JSONObject) cVar.b).containsKey("icon")) {
                str = ((JSONObject) cVar.b).getString("icon");
            }
            Activity activity = (Activity) cVar.a();
            ArrayList<b> arrayList = menusMap.get(cVar.f19938a);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                menusMap.put(cVar.f19938a, arrayList);
            }
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    z = false;
                    break;
                }
                b bVar = arrayList.get(i);
                if (bVar != null && ((!TextUtils.isEmpty(bVar.f20442a) && bVar.f20442a.equals(str)) || (!TextUtils.isEmpty(bVar.b) && bVar.b.equals(string)))) {
                    break;
                }
                i++;
            }
            if (!z) {
                arrayList.add(new b(str, string, RVStartParams.TRANSPARENT_TITLE_ALWAYS, cVar.c));
            }
            activity.invalidateOptionsMenu();
        }
    }

    public static void setStatusBarStyle(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236d6126", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || Build.VERSION.SDK_INT < 23) {
        } else {
            String string = ((JSONObject) cVar.b).getString("style");
            Context a2 = cVar.a();
            if (!(a2 instanceof Activity)) {
                return;
            }
            if (TextUtils.equals("lightContent", string)) {
                ohd.a((Activity) a2, 0, false);
            } else if (!TextUtils.equals("default", string)) {
            } else {
                ohd.a((Activity) a2, 0, true);
            }
        }
    }
}
