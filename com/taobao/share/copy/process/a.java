package com.taobao.share.copy.process;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.busniess.model.d;
import com.taobao.share.taopassword.busniess.model.f;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.eby;
import tb.kge;
import tb.nzt;
import tb.oau;
import tb.oav;
import tb.oaw;
import tb.oax;
import tb.oay;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(608459866);
    }

    private static <T> T a(Class<T> cls, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("869357ef", new Object[]{cls, map, dVar});
        }
        try {
            return (T) JSON.parseObject(JSONObject.parseObject(map.toString()).toJSONString(), cls);
        } catch (Exception e) {
            Log.e("ResponseProcessor", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18272) + e.toString());
            a(new f(), map, dVar);
            return null;
        }
    }

    public static f a(Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1831197", new Object[]{map, dVar});
        }
        if (map == null || map.isEmpty()) {
            return new f();
        }
        String str = map.get("templateId");
        if (StringUtils.isEmpty(str) || TemplateId.COMMON.equals(str)) {
            String str2 = map.get("sourceType");
            if ("shop".equals(str2)) {
                str = TemplateId.SHOP.toString();
            } else if ("item".equals(str2)) {
                str = TemplateId.ITEM.toString();
            }
            map.put("templateId", str);
        }
        String str3 = map.get("popType");
        if (!StringUtils.isEmpty(str3) && str3.equalsIgnoreCase(TemplateId.WEEX.name()) && !StringUtils.isEmpty(map.get("popUrl"))) {
            oay oayVar = new oay();
            a((oau) oayVar, map, dVar);
            oayVar.y = TemplateId.WEEX.toString();
            oayVar.U = oayVar.H.remove("popUrl");
            return oayVar;
        } else if (TemplateId.ITEM.equals(str)) {
            oaw oawVar = new oaw();
            a((oau) oawVar, map, dVar);
            String remove = oawVar.H.remove("price");
            try {
                if (StringUtils.isEmpty(remove)) {
                    remove = (String) ((Map) JSONObject.parse(oawVar.H.get(MspGlobalDefine.EXTENDINFO))).remove("price");
                }
            } catch (Exception unused) {
            }
            oawVar.U = remove;
            return oawVar;
        } else if (TemplateId.SHOP.equals(str)) {
            oax oaxVar = new oax();
            a((oau) oaxVar, map, dVar);
            oaxVar.U = oaxVar.H.remove("rankPic");
            oaxVar.V = oaxVar.H.remove("rankNum");
            return oaxVar;
        } else if (TemplateId.COUPON.equals(str)) {
            oav oavVar = new oav();
            a(oavVar, map, dVar);
            oavVar.f31881a = oavVar.H.remove("content");
            oavVar.b = oavVar.H.remove("title");
            oavVar.c = oavVar.H.remove(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
            oavVar.d = oavVar.H.remove("prefixPrice");
            oavVar.e = oavVar.H.remove("price");
            oavVar.f = oavVar.H.remove("suffixPrice");
            oavVar.h = oavVar.H.remove("description");
            oavVar.i = oavVar.H.remove("leftButtonText");
            oavVar.j = oavVar.H.remove("rightButtonText");
            oavVar.g = oavVar.H.remove(eby.KEY_PIC_URL);
            return oavVar;
        } else if (TemplateId.COMMON.equals(str)) {
            oau oauVar = new oau();
            a(oauVar, map, dVar);
            return oauVar;
        } else {
            if (!StringUtils.isEmpty(str) && nzt.a() != null && nzt.a().containsKey(str)) {
                try {
                    Class<?> cls = nzt.a().get(str);
                    if (cls.isAssignableFrom(f.class)) {
                        return (f) a(cls, map, dVar);
                    }
                } catch (Exception e) {
                    Log.e("ResponseProcessor", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18272) + e.toString());
                }
            }
            f fVar = new f();
            a(fVar, map, dVar);
            return fVar;
        }
    }

    private static void a(oau oauVar, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21dd54e3", new Object[]{oauVar, map, dVar});
            return;
        }
        a((f) oauVar, map, dVar);
        oauVar.N = oauVar.H.remove("content");
        oauVar.O = oauVar.H.remove("title");
        oauVar.P = oauVar.H.remove(eby.KEY_PIC_URL);
        oauVar.Q = oauVar.H.remove("leftButtonText");
        oauVar.R = oauVar.H.remove("rightButtonText");
        oauVar.S = oauVar.H.remove("ownerName");
        oauVar.T = oauVar.H.remove("taopwdOwnerId");
        oauVar.f19657a = dVar;
    }

    private static void a(f fVar, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c598d7", new Object[]{fVar, map, dVar});
            return;
        }
        fVar.A = dVar.f19658a;
        fVar.E = dVar.b;
        fVar.H = new HashMap();
        fVar.H.putAll(map);
        fVar.x = fVar.H.remove("bizId");
        fVar.y = fVar.H.remove("templateId");
        fVar.z = fVar.H.remove("url");
        fVar.C = fVar.H.remove("isTaoFriend");
        fVar.D = fVar.H.remove("taoFriendIcon");
        try {
            String remove = fVar.H.remove("bizData");
            if (StringUtils.isEmpty(remove)) {
                return;
            }
            fVar.I = (Map) JSON.parseObject(remove, Map.class);
        } catch (Exception unused) {
        }
    }
}
