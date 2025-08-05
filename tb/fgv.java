package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.debug.a;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.l;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class fgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27935a;
    private static boolean b;
    private static boolean c;

    static {
        kge.a(-789055829);
        f27935a = false;
        b = false;
        c = false;
        emu.a("com.taobao.android.detail.wrapper.utils.MainPicGalleryGrayUtil");
    }

    public static boolean a(Activity activity, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa5571d8", new Object[]{activity, bVar})).booleanValue();
        }
        if (bVar == null) {
            fgw.a((b) null, activity, "nodeBundle");
            return false;
        } else if (a.a(activity) && f27935a) {
            i.a("MainPicGalleryGrayUtil", "强制开启新头图");
            return true;
        } else if (a.a(activity) && b) {
            i.a("MainPicGalleryGrayUtil", "强制关闭新头图");
            return false;
        } else if (a.a(activity) && c) {
            i.a("MainPicGalleryGrayUtil", "强制忽略orange和feature标");
            return !b(activity, bVar);
        } else if (!ecu.N) {
            fgw.a(bVar, activity, "orangeUnableNewMainPic");
            i.a("MainPicGalleryGrayUtil", "isNewMainPicGallery orange: false");
            return false;
        } else if (l.a()) {
            i.a("MainPicGalleryGrayUtil", "4位数版本号忽略feature标放量");
            return !b(activity, bVar);
        } else {
            FeatureNode f = eqb.f(bVar);
            if (f == null) {
                i.a("MainPicGalleryGrayUtil", "isNewMainPicGallery featureNode is null");
                fgw.d();
                fgw.a(bVar, activity, "featureNode");
                return false;
            } else if (!f.enableNewMainPic) {
                i.a("MainPicGalleryGrayUtil", "isNewMainPicGallery featureNode.enableNewMainPic: false");
                fgw.d();
                fgw.a(bVar, activity, fgo.ENABLE_NEW_MAIN_PIC);
                return false;
            } else {
                if (ecu.a("Page_Detail_Has_Feature_Flag")) {
                    fgw.c();
                }
                return !b(activity, bVar);
            }
        }
    }

    private static boolean b(Activity activity, b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b241df59", new Object[]{activity, bVar})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("android_detail", "newMainPicConfig", "{\"skipKeys\":[]}");
        ArrayList<String> arrayList = new ArrayList();
        try {
            Iterator<Object> it = JSONObject.parseObject(config).getJSONArray("skipKeys").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    arrayList.add(String.valueOf(next));
                }
            }
        } catch (Throwable unused) {
        }
        JSONObject a2 = bVar.a();
        ItemNode c2 = eqb.c(bVar);
        String str = c2 != null ? c2.itemId : "";
        StringBuilder sb = new StringBuilder("[新头图未命中]\n");
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str2)) {
                Object a3 = jju.a(a2, "${" + str2 + riy.BLOCK_END_STR);
                if ((a3 instanceof Boolean) && Boolean.parseBoolean(a3.toString())) {
                    sb.append(str2 + " : 为true \n");
                    fgw.a(str2, str);
                } else if (a3 instanceof JSONObject) {
                    if (!((JSONObject) a3).isEmpty()) {
                        sb.append(str2 + " : JsonObject不为空 \n");
                        fgw.a(str2, str);
                    }
                } else if (a3 instanceof JSONArray) {
                    if (!((JSONArray) a3).isEmpty()) {
                        sb.append(str2 + " : JsonArray不为空 \n");
                        fgw.a(str2, str);
                    }
                } else {
                    boolean z2 = a3 instanceof String;
                    if (z2 && "true".equalsIgnoreCase(a3.toString())) {
                        sb.append(str2 + " : 为true \n");
                        fgw.a(str2, str);
                    } else if (!z2 || !"false".equalsIgnoreCase(a3.toString())) {
                        if (a3 != null && !TextUtils.isEmpty(a3.toString())) {
                            sb.append(str2 + " : toString不为空 \n");
                            fgw.a(str2, str);
                        }
                    }
                }
                z = true;
            }
        }
        if (z) {
            fgw.a(bVar, activity, "hasExcludeNode");
            i.a("MainPicGalleryGrayUtil", sb.toString());
        } else {
            i.a("MainPicGalleryGrayUtil", "数据节点skipKeys通过");
        }
        return z;
    }
}
