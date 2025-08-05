package tb;

import android.app.Activity;
import android.view.animation.AlphaAnimation;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.nwg;

/* loaded from: classes8.dex */
public final class nwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nwj INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static AlphaAnimation f31806a;
    private static AlphaAnimation b;

    static {
        kge.a(-412760066);
        INSTANCE = new nwj();
    }

    private nwj() {
    }

    @JvmStatic
    public static final MuiseBean a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("97f26019", new Object[]{str, str2, str3, str4, jSONObject});
        }
        MuiseBean muiseBean = new MuiseBean();
        if (str == null) {
            str = "";
        }
        muiseBean.type = str;
        if (str2 == null) {
            str2 = "";
        }
        muiseBean.rn = str2;
        if (str3 == null) {
            str3 = "";
        }
        muiseBean.abtest = str3;
        if (str4 == null) {
            str4 = "";
        }
        muiseBean.pageType = str4;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        muiseBean.model = jSONObject;
        return muiseBean;
    }

    @JvmStatic
    public static final boolean a(nwg.b bVar, Integer num, BaseCellBean baseCellBean, JSONObject jSONObject, Integer num2, Integer num3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f66903c7", new Object[]{bVar, num, baseCellBean, jSONObject, num2, num3})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) ((num3 != null && num3.intValue() == 0) ? "listCoverHeight" : "wfCoverHeight"), (String) Float.valueOf(j.d(num2 != null ? num2.intValue() : 0)));
        jSONObject3.put((JSONObject) "placeholder", "true");
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!q.a((Object) "tItemType", (Object) entry.getKey())) {
                jSONObject3.put((JSONObject) entry.getKey(), (String) entry.getValue());
            }
        }
        String valueOf = String.valueOf(jSONObject.get("tItemType"));
        MuiseBean muiseBean = new MuiseBean();
        muiseBean.type = valueOf;
        muiseBean.model = jSONObject2;
        ListStyle fromInt = ListStyle.fromInt(num3 != null ? num3.intValue() : 1);
        if (num2 != null) {
            i = num2.intValue();
        }
        muiseBean.updateCachedHeight(fromInt, i);
        MuiseCellBean muiseCellBean = new MuiseCellBean();
        muiseCellBean.type = valueOf;
        muiseCellBean.mMuiseBean = muiseBean;
        if (baseCellBean != null) {
            muiseCellBean.cardType = baseCellBean.cardType;
            muiseCellBean.itemId = baseCellBean.itemId;
            if (baseCellBean.curItemIds != null) {
                muiseCellBean.curItemIds = baseCellBean.curItemIds;
            }
            if (baseCellBean.curP4pIds != null) {
                muiseCellBean.curP4pIds = baseCellBean.curP4pIds;
            }
            muiseCellBean.isP4p = baseCellBean.isP4p;
            muiseCellBean.isDynamicLandP4p = baseCellBean.isDynamicLandP4p;
        }
        if (bVar != null) {
            bVar.a(muiseCellBean, num != null ? num.intValue() : -1);
        }
        return true;
    }

    @JvmStatic
    public static final AlphaAnimation a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("34d6cf22", new Object[]{new Boolean(z)});
        }
        if (z) {
            if (f31806a == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                f31806a = alphaAnimation;
                alphaAnimation.setDuration(500L);
            }
            return f31806a;
        }
        if (b == null) {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            b = alphaAnimation2;
            alphaAnimation2.setDuration(500L);
        }
        return b;
    }

    @JvmStatic
    public static final void a(Activity activity, nwh nwhVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec52112f", new Object[]{activity, nwhVar, jSONObject, new Boolean(z)});
        } else if (activity != null && jSONObject != null && nwhVar != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                q.a((Object) key, "key");
                hashMap.put(key, value != null ? value.toString() : null);
            }
            hashMap.put(noa.KEY_GRAY_HAIR, String.valueOf(z));
            nwhVar.a(activity, hashMap);
        }
    }
}
