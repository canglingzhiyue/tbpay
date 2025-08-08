package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogg;

/* loaded from: classes5.dex */
public class ShareModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShareModule";

    static {
        kge.a(95059719);
        kge.a(-818961104);
    }

    public static /* synthetic */ Bundle access$000(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("352416dd", new Object[]{jSONObject}) : generateReportBundle(jSONObject);
    }

    public static void share(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34c959", new Object[]{cVar});
        } else {
            ShareBusiness.share((Activity) cVar.a(), getShareContent((JSONObject) cVar.b), new ShareBusinessListener() { // from class: com.taobao.android.layoutmanager.module.ShareModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.share.business.ShareBusinessListener
                public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                    } else if (g.c.this.c == null) {
                    } else {
                        g.c.this.c.a(g.c.this, shareTargetType != null ? shareTargetType.toString() : "");
                    }
                }

                @Override // com.ut.share.business.ShareBusinessListener
                public void onFinished(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map});
                    } else if (g.c.this.c == null) {
                    } else {
                        g.c.this.c.a(g.c.this, map);
                    }
                }
            });
        }
    }

    public static void shareWithCallback(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7977ee", new Object[]{cVar});
        } else {
            ShareBusiness.share((Activity) cVar.a(), getShareContent((JSONObject) cVar.b), new ShareBusinessListener() { // from class: com.taobao.android.layoutmanager.module.ShareModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.share.business.ShareBusinessListener
                public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                    } else if (g.c.this.c == null) {
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", "target_click");
                        hashMap.put("data", shareTargetType != null ? shareTargetType.toString() : "");
                        g.c.this.c.a(g.c.this, hashMap);
                    }
                }

                @Override // com.ut.share.business.ShareBusinessListener
                public void onFinished(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map});
                    } else if (g.c.this.c == null) {
                    } else {
                        HashMap hashMap = new HashMap();
                        String str = null;
                        if (map != null) {
                            str = map.get(com.taobao.mtop.wvplugin.a.RESULT_KEY);
                        }
                        String str2 = "close";
                        if (StringUtils.equals(str, "success")) {
                            str2 = "target_success";
                        } else if (StringUtils.equals(str, "fail")) {
                            hashMap.put("msg", map != null ? map.get("errorMessage") : "");
                            str2 = "target_failed";
                        } else if (StringUtils.equals(str, "cancel")) {
                            str2 = "target_canceled";
                        } else if (!StringUtils.equals(str, str2)) {
                            str2 = "unknown";
                        }
                        hashMap.put("type", str2);
                        g.c.this.c.a(g.c.this, hashMap);
                    }
                }
            });
        }
    }

    public static void showMore(final g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6d29a6", new Object[]{cVar});
        } else if (cVar != null && (jSONObject = (JSONObject) cVar.b) != null) {
            View rootView = getRootView(cVar);
            final TBPublicMenu publicMenu = getPublicMenu(cVar);
            if (publicMenu == null) {
                Context a2 = cVar.a();
                if (!(a2 instanceof Activity)) {
                    return;
                }
                TBPublicMenu tBPublicMenu = new TBPublicMenu((Activity) a2);
                if (rootView != null) {
                    rootView.setTag(R.id.share_module_show_more_menu_tag, tBPublicMenu);
                }
                publicMenu = tBPublicMenu;
            }
            final ShareContent shareContent = getShareContent(jSONObject.getJSONObject(com.taobao.share.ui.engine.jsbridge.a.SHARE_CONTENT_KEY));
            if (shareContent != null && shareContent.businessId != null) {
                publicMenu.setShareContentCallBack(new ShareContentCallBack() { // from class: com.taobao.android.layoutmanager.module.ShareModule.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
                    public Object getQueryShareParameters() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("febe4434", new Object[]{this}) : ShareContent.this;
                    }
                });
            } else {
                publicMenu.setShareContentCallBack(null);
            }
            final JSONObject jSONObject2 = jSONObject.getJSONObject("reportArgs");
            if (jSONObject2 != null) {
                publicMenu.setReportArguments(new ITBPublicMenu() { // from class: com.taobao.android.layoutmanager.module.ShareModule.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
                    public Bundle pageUserInfo() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Bundle) ipChange2.ipc$dispatch("65615653", new Object[]{this}) : ShareModule.access$000(JSONObject.this);
                    }

                    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
                    public TBPublicMenu getPublicMenu() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (TBPublicMenu) ipChange2.ipc$dispatch("1f3d234e", new Object[]{this}) : publicMenu;
                    }
                });
            } else {
                publicMenu.setReportArguments(null);
            }
            publicMenu.clearExternalMenus();
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("menuList");
            for (int i = 0; jSONArray != null && i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int intValue = jSONObject3.getIntValue("id");
                String string = jSONObject3.getString("iconFontName");
                String string2 = jSONObject3.getString("title");
                Boolean bool = jSONObject3.getBoolean("closeAfterClick");
                TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                TBPublicMenuItem.Builder id = builder.setId(intValue);
                id.setTitle(string + ":" + string2);
                if (bool != null && !bool.booleanValue()) {
                    builder.setMenuNeedtoBeClosedAfterItemClicked(false);
                } else {
                    builder.setMenuNeedtoBeClosedAfterItemClicked(true);
                }
                arrayList.add(builder.build());
            }
            if (rootView != null) {
                rootView.setTag(R.id.share_module_show_more_menu_list_tag, arrayList);
            }
            publicMenu.addExternalMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.layoutmanager.module.ShareModule.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    } else if (g.c.this.c == null || tBPublicMenuItem == null) {
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put((JSONObject) "type", "onItemClick");
                        jSONObject4.put((JSONObject) "id", (String) Integer.valueOf(tBPublicMenuItem.getId()));
                        String title = tBPublicMenuItem.getTitle();
                        if (title != null && title.contains(":")) {
                            String[] split = title.split(":");
                            jSONObject4.put((JSONObject) "iconFontName", split[0]);
                            jSONObject4.put((JSONObject) "title", split[1]);
                        }
                        g.c.this.c.a(g.c.this, jSONObject4);
                    }
                }
            });
            publicMenu.setOnMenuShowedListener(new TBPublicMenu.TBOnMenuShowedListener() { // from class: com.taobao.android.layoutmanager.module.ShareModule.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuShowedListener
                public void onMenuShowed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91fdc161", new Object[]{this});
                    } else if (g.c.this.c == null) {
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put((JSONObject) "type", "onShow");
                        g.c.this.c.a(g.c.this, jSONObject4);
                    }
                }
            });
            publicMenu.setOnMenuHidedListener(new TBPublicMenu.TBOnMenuHidedListener() { // from class: com.taobao.android.layoutmanager.module.ShareModule.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuHidedListener
                public void onMenuHided() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("143e58ab", new Object[]{this});
                        return;
                    }
                    if (g.c.this.c != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put((JSONObject) "type", "onHide");
                        g.c.this.c.a(g.c.this, jSONObject4);
                    }
                    publicMenu.clearExternalMenus();
                }
            });
            publicMenu.show();
        }
    }

    private static Bundle generateReportBundle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("bbef1682", new Object[]{jSONObject});
        }
        Bundle bundle = new Bundle();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                bundle.putBundle(str, generateReportBundle((JSONObject) obj));
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    public static void reloadMore(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b56c8a", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) cVar.b;
        if (jSONObject == null) {
            ogg.a(TAG, "reloadMore args==null");
            return;
        }
        View rootView = getRootView(cVar);
        if (rootView == null) {
            ogg.a(TAG, "reloadMore rootView==null");
            return;
        }
        Object tag = rootView.getTag(R.id.share_module_show_more_menu_list_tag);
        if (!(tag instanceof ArrayList)) {
            ogg.a(TAG, "reloadMore tag ! instanceof ArrayList");
            return;
        }
        int intValue = jSONObject.getInteger("index").intValue();
        if (intValue >= 0) {
            ArrayList arrayList = (ArrayList) tag;
            if (intValue < arrayList.size()) {
                Object obj = arrayList.get(intValue);
                if (!(obj instanceof TBPublicMenuItem)) {
                    ogg.a(TAG, "reloadMore o ! instanceof TBPublicMenuItem");
                    return;
                }
                TBPublicMenuItem tBPublicMenuItem = (TBPublicMenuItem) obj;
                String string = jSONObject.getString("iconFontName");
                String string2 = jSONObject.getString("title");
                tBPublicMenuItem.setTitle(string + ":" + string2);
                tBPublicMenuItem.update();
                return;
            }
        }
        ogg.a(TAG, "reloadMore index error index=" + intValue);
    }

    private static TBPublicMenu getPublicMenu(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("38af7923", new Object[]{cVar});
        }
        Context a2 = cVar.a();
        TBPublicMenu publicMenu = a2 instanceof ITBPublicMenu ? ((ITBPublicMenu) a2).getPublicMenu() : null;
        if (publicMenu != null) {
            return publicMenu;
        }
        View rootView = getRootView(cVar);
        if (rootView == null) {
            return null;
        }
        Object tag = rootView.getTag(R.id.share_module_show_more_menu_tag);
        if (!(tag instanceof TBPublicMenu)) {
            return null;
        }
        return (TBPublicMenu) tag;
    }

    private static View getRootView(g.c cVar) {
        ab abVar;
        aa A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("69f0e05d", new Object[]{cVar});
        }
        if (cVar != null && (abVar = cVar.f19938a) != null && (A = abVar.A()) != null) {
            return A.x();
        }
        return null;
    }

    private static ShareContent getShareContent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("5aa0d335", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString("contentType");
        String string4 = jSONObject.getString("desc");
        if (StringUtils.isEmpty(string4)) {
            string4 = jSONObject.getString("description");
        }
        if (StringUtils.isEmpty(string4)) {
            string4 = jSONObject.getString("text");
        }
        String string5 = jSONObject.getString("url");
        String string6 = jSONObject.getString("templateId");
        String string7 = jSONObject.getString("image");
        String string8 = jSONObject.getString("shareScene");
        JSONObject jSONObject2 = jSONObject.getJSONObject("templateParams");
        JSONObject jSONObject3 = jSONObject.getJSONObject("extendParams");
        ShareContent shareContent = new ShareContent();
        shareContent.shareScene = string8;
        shareContent.title = string;
        shareContent.imageUrl = string7;
        shareContent.businessId = string2;
        shareContent.description = string4;
        shareContent.contentType = string3;
        shareContent.url = string5;
        shareContent.extendParams = oec.b((Map) jSONObject3);
        shareContent.templateId = string6;
        shareContent.templateParams = jSONObject2;
        return shareContent;
    }
}
