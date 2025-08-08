package com.alibaba.android.ultron.vfw.weex2;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.kge;

/* loaded from: classes2.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1090311014);
    }

    public static void a(FrameLayout frameLayout, IDMComponent iDMComponent) {
        JSONObject fields;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bc1c49", new Object[]{frameLayout, iDMComponent});
        } else if (frameLayout == null || iDMComponent == null || (fields = iDMComponent.getFields()) == null || !fields.containsKey("config")) {
        } else {
            String string = fields.getJSONObject("config").getString("downgradeStrategy");
            if (StringUtils.isEmpty(string)) {
                string = "invisible";
            }
            int hashCode = string.hashCode();
            if (hashCode != -1901805651) {
                if (hashCode == 3178655 && string.equals("gone")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (string.equals("invisible")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                frameLayout.setVisibility(4);
                return;
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                return;
            }
            layoutParams.height = 0;
            frameLayout.requestLayout();
        }
    }

    public static boolean a(FrameLayout frameLayout, IDMComponent iDMComponent, String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcc825d7", new Object[]{frameLayout, iDMComponent, str})).booleanValue();
        }
        if (frameLayout == null || iDMComponent == null || (parseObject = JSON.parseObject(str)) == null || !parseObject.containsKey("height")) {
            return false;
        }
        int intValue = parseObject.getInteger("height").intValue();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, intValue));
        } else {
            layoutParams.height = intValue;
            frameLayout.requestLayout();
        }
        return true;
    }

    public static String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || !"weex2".equals(iDMComponent.getContainerType())) {
            return null;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields != null && !StringUtils.isEmpty(fields.getString("url"))) {
            return fields.getString("url");
        }
        JSONObject containerInfo = iDMComponent.getContainerInfo();
        if (containerInfo != null) {
            return containerInfo.getString("url");
        }
        return null;
    }
}
