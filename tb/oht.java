package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.tao.topmultitab.c;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class oht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TARCK_KEY_PAGE_HOME = "Page_Home";
    public static final String TARCK_KEY_PAGE_MINI_APP_HOME = "Page_MiniappHome";

    static {
        kge.a(-1198179466);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            ksp.c("SecondFloorUtUtil", "pageProvider == null");
            return;
        }
        las.b((Object) b.getCurActivity());
        ksp.b("SecondFloorUtUtil", "clearUt");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            ksp.c("SecondFloorUtUtil", "pageProvider == null");
            return;
        }
        las.a((Object) b.getCurActivity());
        if (!TextUtils.isEmpty(str)) {
            ksp.b("SecondFloorUtUtil", "utWrite pageName : " + str);
            las.a(b.getCurActivity(), str);
        } else {
            ksp.b("SecondFloorUtUtil", "utWrite default pageName : " + str);
            las.a((Context) b.getCurActivity());
        }
        if (TextUtils.equals(TARCK_KEY_PAGE_MINI_APP_HOME, str)) {
            a(str2, b);
        } else {
            a(b);
        }
    }

    private static void a(String str, lbq lbqVar) {
        JSONObject parseObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32642507", new Object[]{str, lbqVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.isHierarchical()) {
            String queryParameter = parse.getQueryParameter("spm");
            if (JSON.parseObject(parse.getQueryParameter("passParams")) != null) {
                str2 = parseObject.getString(ood.HOME_BUCKETS) + "_9999";
            } else {
                str2 = "";
            }
            hashMap.put("spm-cnt", "a2141.miniapp");
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put("spm-url", queryParameter);
            }
            hashMap.put(ood.HOME_BUCKETS, str2);
        }
        kss.a(lbqVar.getCurActivity(), hashMap);
    }

    private static void a(lbq lbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f279af3d", new Object[]{lbqVar});
            return;
        }
        String a2 = i.a();
        if (c.a().z() == null) {
            return;
        }
        Activity curActivity = lbqVar.getCurActivity();
        kss.a(curActivity, lbo.b().a(a2).c());
        kss.a(curActivity, lbo.b().a(a2).a());
        las.b((Context) curActivity);
        boolean b = lbqVar.getHomePageManager().o().b();
        if (c.a().D()) {
            las.a(curActivity, b);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ut_isbk", "1");
        hashMap.put("spm-url", "a2141.1.tabbar.homepage");
        kss.a(lbqVar.getCurActivity(), hashMap);
    }
}
