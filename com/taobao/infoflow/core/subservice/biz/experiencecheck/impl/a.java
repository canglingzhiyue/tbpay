package com.taobao.infoflow.core.subservice.biz.experiencecheck.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.kge;
import tb.lja;
import tb.nog;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MAIN_IMAGE_URL = "checkMainImageUrl";
    public static final String KEY_MAIN_TITLE = "checkMainTitle";
    public static final String KEY_PRICE = "checkPrice";

    static {
        kge.a(132073);
    }

    public static void a(BaseSectionModel<?> baseSectionModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{baseSectionModel});
        } else if (baseSectionModel == null || (ext = baseSectionModel.getExt()) == null || TextUtils.equals("true", ext.getString("isCardSaved"))) {
        } else {
            ext.put("isCardSaved", (Object) "true");
            String str = (String) lja.a("item.0.smartContent.price.v", baseSectionModel);
            String str2 = (String) lja.a("item.0.smartContent.main_title.v", baseSectionModel);
            String str3 = (String) lja.a("item.0.smartContent.main_image.v", baseSectionModel);
            if (str3 == null) {
                str3 = (String) lja.a("item.0.smartContent.main_image.image", baseSectionModel);
            }
            if (str2 == null) {
                str2 = (String) lja.a("item.0.content.title", baseSectionModel);
            }
            if (str3 == null) {
                str3 = (String) lja.a("item.0.content.mainImg", baseSectionModel);
            }
            if (str == null) {
                str = (String) lja.a("item.0.content.price", baseSectionModel);
            }
            if (str2 == null) {
                str2 = (String) lja.a("item.0.content.main_title", baseSectionModel);
            }
            if (str3 == null) {
                str3 = (String) lja.a("item.0.content.main_image", baseSectionModel);
            }
            if (str == null) {
                str = (String) lja.a("item.0.content.price", baseSectionModel);
            }
            if (str2 == null) {
                str2 = (String) lja.a("item.0.smartContent.main_title.v", baseSectionModel);
            }
            if (str3 == null) {
                str3 = (String) lja.a("item.0.smartContent.main_image.v", baseSectionModel);
            }
            if (str == null) {
                str = (String) lja.a("item.0.smartContent.price.v", baseSectionModel);
            }
            if (str != null) {
                ext.put(KEY_PRICE, (Object) a(str));
            }
            if (str2 != null) {
                ext.put(KEY_MAIN_TITLE, (Object) str2);
            }
            if (str3 == null) {
                return;
            }
            ext.put(KEY_MAIN_IMAGE_URL, (Object) str3);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString(com.taobao.android.weex_framework.util.a.ATOM_symbol);
        if (string == null) {
            string = "";
        }
        String string2 = parseObject.getString("yuan");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parseObject.getString("separator");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parseObject.getString("cent");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = parseObject.getString(nog.PRICE_UNIT);
        if (string5 == null) {
            string5 = "";
        }
        return string + string2 + string3 + string4 + string5;
    }
}
