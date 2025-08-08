package com.taobao.mytaobao.ultron.event;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.homepage.busniess.model.ClickParamBean;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mtp;
import tb.mwv;
import tb.mxq;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1066118821);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : "Page_MyTaobao_Button-OrderNews";
    }

    public static void a(Context context, JSONObject jSONObject, List<Object> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c13a2", new Object[]{context, jSONObject, list, new Integer(i)});
        } else if (jSONObject == null) {
        } else {
            Long l = jSONObject.getLong("id");
            String string = jSONObject.getString("jumpUrl");
            a(jSONObject, i);
            if (!StringUtils.isEmpty(string)) {
                Nav.from(context).toUri(string);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext").getJSONObject("extraInfo");
            if (jSONObject2 != null) {
                jSONObject2.toJSONString();
            }
            if (l != null && l.longValue() == -1 && jSONObject2 != null) {
                Nav.from(context).toUri(mxq.c(jSONObject2.getString("moreUrl")));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("data", mwv.a(list));
            bundle.putInt("currentPage", i);
            Nav.from(context).withExtras(bundle).toUri(mtp.NAV_URL_DELIVER);
            if (!(context instanceof Activity)) {
                return;
            }
            ((Activity) context).overridePendingTransition(R.anim.fade_in, 0);
        }
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        return "a2141.7631743.3." + (i + 26);
    }

    private static void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{jSONObject, new Integer(i)});
            return;
        }
        String str = "Page_MyTaobao";
        if (jSONObject.get("clickParam") != null) {
            try {
                ClickParamBean clickParamBean = (ClickParamBean) JSON.toJavaObject(jSONObject.getJSONObject("clickParam"), ClickParamBean.class);
                if (!StringUtils.isEmpty(clickParamBean.page)) {
                    str = clickParamBean.page;
                }
                String str2 = str;
                String str3 = StringUtils.isEmpty(clickParamBean.eventId) ? "2101" : clickParamBean.eventId;
                String a2 = StringUtils.isEmpty(clickParamBean.arg1) ? a(i) : clickParamBean.arg1;
                if (clickParamBean.args != null && !clickParamBean.args.isEmpty()) {
                    com.taobao.mytaobao.ut.c.a(str2, Integer.parseInt(str3), a2, clickParamBean.arg2, clickParamBean.arg3, clickParamBean.args);
                    if (clickParamBean.nextPage == null || clickParamBean.nextPage.isEmpty()) {
                        return;
                    }
                    com.taobao.mytaobao.ut.c.a(clickParamBean.nextPage);
                    return;
                }
                com.taobao.mytaobao.ut.c.a(str2, Integer.parseInt(str3), a2, clickParamBean.arg2, clickParamBean.arg3, com.taobao.mytaobao.ut.c.a(b(i), (String) null, (String) null, (Map<String, String>) null));
                if (clickParamBean.nextPage == null) {
                    return;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        com.taobao.mytaobao.ut.c.a(str, a(i), b(i));
    }
}
