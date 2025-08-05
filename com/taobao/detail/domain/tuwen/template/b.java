package com.taobao.detail.domain.tuwen.template;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(767704214);
    }

    public static TuwenTemplate a(String str, Long l, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TuwenTemplate) ipChange.ipc$dispatch("46b8fc51", new Object[]{str, l, map});
        }
        Map<String, Object> hashMap = map == null ? new HashMap<>() : map;
        if (str.equals("main")) {
            f17003a = 0;
            return new TuwenTemplate("detail_layout_" + l, "native", "sys_list", null, null);
        } else if (str.equals("coupon")) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("extraText", "无更多优惠券");
            hashMap.put("coupon", true);
            StringBuilder sb = new StringBuilder();
            sb.append("coupon_division_title");
            int i = f17003a + 1;
            f17003a = i;
            sb.append(i);
            return new TuwenTemplate("_SL_Coupon", "native", "detail_container_style2", hashMap2, a(a(sb.toString(), "native", "detail_division_title", "0xffffff", "0x051b28", "0xffffff", "优惠券"), a("_SL_Coupon_Component", "native", "detail_coupon", "loop")));
        } else if (str.equals("activity")) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("childrenStyle", "sequence");
            hashMap.put("activity", true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("activity_division_title");
            int i2 = f17003a + 1;
            f17003a = i2;
            sb2.append(i2);
            return new TuwenTemplate("_SL_Activity", "native", "detail_container_style2", hashMap3, a(a(sb2.toString(), "native", "detail_division_title", "0xffffff", "0x051b28", "0xffffff", "店铺活动"), a("_SL_Activity_Component", "native", "detail_pic_jumper", "loop")));
        } else if (str.equals("recommend")) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("childrenStyle", "sequence");
            hashMap.put("recommend", true);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("sellerRecommend_division_title");
            int i3 = f17003a + 1;
            f17003a = i3;
            sb3.append(i3);
            return new TuwenTemplate("_SL_SellerRecommend", "native", "detail_container_style3", hashMap4, a(a(sb3.toString(), "native", "detail_division_title", "0xffffff", "0x051b28", "0xffffff", "卖家推荐"), a("_SL_SellerRecommend_Component", "native", "detail_iteminfo", "loop")));
        } else if (str.equals("see_more")) {
            HashMap hashMap5 = new HashMap();
            hashMap5.put("childrenStyle", "sequence");
            hashMap.put("see_more", true);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("seemore_division_title");
            int i4 = f17003a + 1;
            f17003a = i4;
            sb4.append(i4);
            return new TuwenTemplate("_SL_SeeMore", "native", "detail_container_style3", hashMap5, a(a(sb4.toString(), "native", "detail_division_title", "0xffffff", "0x051b28", "0xffffff", "看了又看"), a("_SL_SeeMore_Component", "native", "detail_iteminfo", "loop")));
        } else if (str.equals("picture")) {
            HashMap hashMap6 = new HashMap();
            hashMap6.put("childrenStyle", "sequence");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("detail_pic_");
            int i5 = f17003a + 1;
            f17003a = i5;
            sb5.append(i5);
            return new TuwenTemplate(sb5.toString(), "native", "detail_container_style7", hashMap6, null);
        } else if (str.equals("fixed_picture")) {
            HashMap hashMap7 = new HashMap();
            hashMap7.put("childrenStyle", "sequence");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("detail_pic_");
            int i6 = f17003a + 1;
            f17003a = i6;
            sb6.append(i6);
            return new TuwenTemplate(sb6.toString(), "native", "detail_container_style1", hashMap7, null);
        } else if (!str.equals("recommend_2")) {
            return new TuwenTemplate();
        } else {
            HashMap hashMap8 = new HashMap();
            hashMap8.put("childrenStyle", "sequence");
            hashMap.put("recommend_2", true);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("sellerRecommend_division_title");
            int i7 = f17003a + 1;
            f17003a = i7;
            sb7.append(i7);
            return new TuwenTemplate("_SL_SellerRecommend_2", "native", "detail_container_style6", hashMap8, a(a(sb7.toString(), "native", "detail_division_title", "0xffffff", "0x051b28", "0xffffff", "卖家推荐"), a("_SL_SellerRecommend_Component_2", "native", "detail_iteminfo2", "loop", 0.33d)));
        }
    }
}
