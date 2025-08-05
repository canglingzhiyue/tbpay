package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class ShowTBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShowTBPublicMenu";

    /* loaded from: classes9.dex */
    public interface CallBack {
        void callBack(String str);
    }

    static {
        kge.a(1571810917);
    }

    public static void show(final Context context, String str, final CallBack callBack) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74933a99", new Object[]{context, str, callBack});
            return;
        }
        final TBPublicMenu tBPublicMenu = new TBPublicMenu((Activity) context);
        final ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("customPopoverItems")) {
            JSONArray jSONArray = jSONObject.getJSONArray("customPopoverItems");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                if (jSONObject2.has("title")) {
                    builder.setTitle(jSONObject2.getString("title"));
                }
                if (jSONObject2.has("iconFont") && jSONObject2.has("title")) {
                    String string = jSONObject2.getString("iconFont");
                    String string2 = jSONObject2.getString("title");
                    builder.setTitle(string + ":" + string2);
                } else if (jSONObject2.has("imageUrl")) {
                    builder.setIcon(jSONObject2.getString("imageUrl"));
                }
                if (jSONObject2.has("isAdaptationI8n")) {
                    builder.setI18nSupported(jSONObject2.getBoolean("isAdaptationI8n"));
                }
                TBPublicMenuItem build = builder.build();
                arrayList.add(build);
                TLog.loge(TAG, "customPopoverItems: title: " + build.getTitle() + "; imageUrl: " + build.getIconUrl());
            }
        }
        if (jSONObject.has("removeDefaultToolItems")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("removeDefaultToolItems");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                tBPublicMenu.removeCustomMenuItemsByType(jSONArray2.getString(i2));
            }
        }
        if (jSONObject.has("addDefaultToolItems")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("addDefaultToolItems");
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                tBPublicMenu.showMenuItem(jSONArray3.getString(i3));
            }
        }
        tBPublicMenu.addCustomMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.ShowTBPublicMenu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    return;
                }
                tBPublicMenuItem.getId();
                if (TBPublicMenu.this.isClickDefaultItem(context, tBPublicMenuItem)) {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("index", arrayList.indexOf(tBPublicMenuItem));
                } catch (JSONException unused) {
                }
                callBack.callBack(jSONObject3.toString());
                TLog.loge(ShowTBPublicMenu.TAG, "item: " + arrayList.indexOf(tBPublicMenuItem));
            }
        });
        tBPublicMenu.show();
    }
}
