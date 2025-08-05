package com.alibaba.android.ultron.trade.event;

import android.text.TextUtils;
import com.alibaba.android.ultron.trade.event.model.OpenPopupWindowEventModel;
import com.alibaba.android.ultron.trade.event.model.SimplePopupModel;
import com.alibaba.android.ultron.vfw.popupwindow.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bmz;
import tb.bnd;
import tb.bnf;
import tb.bnv;
import tb.kge;

/* loaded from: classes2.dex */
public class m extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BODY_TEMPLATE_NAME = "buy_popup_check_box_simple";
    public static final String DEFAULT_FOOTER_TEMPLATE_NAME = "buy_dialog_bottom_simple";
    public static final String DEFAULT_HEADER_TEMPLATE_NAME = "buy_dialog_title_simple";
    public static final String KEY_COMPONENT_TYPE = "componentType";
    public static final String KEY_FOOTER_TYPE = "footerType";
    public static final String KEY_HEADER_TYPE = "headerType";
    public static final String KEY_ID = "id";
    public static final String KEY_SIMPLE_POPUP_FIELDS = "simplePopupFields";
    public static final String KEY_SIMPLE_POPUP_MODEL = "simplePopupModel";

    /* renamed from: a  reason: collision with root package name */
    public String f2667a = DEFAULT_FOOTER_TEMPLATE_NAME;
    public String b = DEFAULT_HEADER_TEMPLATE_NAME;
    public String c = DEFAULT_BODY_TEMPLATE_NAME;

    static {
        kge.a(-1196261794);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(final bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject fields = this.h.getFields();
        if (fields == null) {
            return;
        }
        bmzVar.a((bnf) new bnd(this.h, this.f));
        String string = fields.getString(KEY_COMPONENT_TYPE);
        List<IDMComponent> a2 = a(fields);
        List<IDMComponent> a3 = a(fields, string);
        List<IDMComponent> b = b(fields);
        bnv bnvVar = new bnv();
        bnvVar.a(a2);
        bnvVar.b(a3);
        bnvVar.e(b);
        this.f.y().a(bnvVar, (OpenPopupWindowEventModel) null, new b.a() { // from class: com.alibaba.android.ultron.trade.event.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.popupwindow.b.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    bmzVar.g();
                }
            }
        });
        this.f.F().b(bmzVar);
    }

    public List<IDMComponent> a(JSONObject jSONObject) {
        final DMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        String str = null;
        if (jSONObject.containsKey(KEY_HEADER_TYPE)) {
            str = jSONObject.getString(KEY_HEADER_TYPE);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fields", (Object) jSONObject);
        jSONObject2.put("type", (Object) str);
        if (TextUtils.isEmpty(str)) {
            a2 = b(jSONObject2, (com.taobao.android.ultron.datamodel.imp.b) this.g, this.b);
        } else {
            a2 = a(jSONObject2, (com.taobao.android.ultron.datamodel.imp.b) this.g, str);
        }
        return new ArrayList<IDMComponent>() { // from class: com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber$2
            {
                add(a2);
            }
        };
    }

    public List<IDMComponent> a(JSONObject jSONObject, String str) {
        DMComponent a2;
        List<String> selectedIds;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("954730b5", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        SimplePopupModel simplePopupModel = null;
        try {
            simplePopupModel = (SimplePopupModel) JSONObject.toJavaObject(jSONObject, SimplePopupModel.class);
        } catch (Exception e) {
            UnifyLog.a(this.f.s(), "OpenSimplePopupSubscriber", "getBodyComponent exception", e.getMessage());
        }
        if (simplePopupModel == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (simplePopupModel.getAsSelect() != null && (selectedIds = simplePopupModel.getAsSelect().getSelectedIds()) != null) {
            arrayList2.addAll(selectedIds);
        }
        JSONArray components = simplePopupModel.getComponents();
        if (components == null) {
            return arrayList;
        }
        if (jSONObject.containsKey(KEY_COMPONENT_TYPE)) {
            str = jSONObject.getString(KEY_COMPONENT_TYPE);
        }
        DMComponent f = f();
        f.getExtMap().put(KEY_SIMPLE_POPUP_MODEL, simplePopupModel);
        f.getExtMap().put(KEY_SIMPLE_POPUP_FIELDS, jSONObject);
        Iterator<Object> it = components.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next;
                String string = jSONObject2.getString("id");
                if (arrayList2.contains(string)) {
                    jSONObject2.put("isChecked", (Object) "true");
                } else {
                    jSONObject2.put("isChecked", (Object) "false");
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("fields", next);
                String string2 = jSONObject2.containsKey("type") ? jSONObject2.getString("type") : str;
                jSONObject3.put("type", (Object) string2);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject3.put("id", (Object) string);
                }
                if (TextUtils.isEmpty(string2)) {
                    a2 = b(jSONObject3, (com.taobao.android.ultron.datamodel.imp.b) this.g, this.c);
                } else {
                    a2 = a(jSONObject3, (com.taobao.android.ultron.datamodel.imp.b) this.g, string2);
                }
                a2.setParent(f);
                f.addChild(a2);
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public DMComponent f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("1f8288e5", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "block$null$emptyBlock");
        return a(jSONObject, (com.taobao.android.ultron.datamodel.imp.b) this.g, "block$null$emptyBlock");
    }

    public List<IDMComponent> b(JSONObject jSONObject) {
        final DMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        String str = null;
        if (jSONObject.containsKey(KEY_FOOTER_TYPE)) {
            str = jSONObject.getString(KEY_FOOTER_TYPE);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fields", (Object) jSONObject);
        jSONObject2.put("type", (Object) str);
        if (TextUtils.isEmpty(str)) {
            a2 = b(jSONObject2, (com.taobao.android.ultron.datamodel.imp.b) this.g, this.f2667a);
        } else {
            a2 = a(jSONObject2, (com.taobao.android.ultron.datamodel.imp.b) this.g, str);
        }
        return new ArrayList<IDMComponent>() { // from class: com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber$3
            {
                add(a2);
            }
        };
    }

    public DMComponent a(JSONObject jSONObject, com.taobao.android.ultron.datamodel.imp.b bVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("83ede454", new Object[]{this, jSONObject, bVar, str});
        }
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject2 = bVar.j().get(str);
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString("containerType");
        } else {
            String s = this.f.s();
            UnifyLog.a(s, "OpenSimplePopupSubscriber", "通过type，component container信息未匹配到： " + str, new String[0]);
            str2 = "native";
        }
        return new DMComponent(jSONObject, str2, jSONObject2, null);
    }

    public DMComponent b(JSONObject jSONObject, com.taobao.android.ultron.datamodel.imp.b bVar, String str) {
        JSONObject jSONObject2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("af0a6d95", new Object[]{this, jSONObject, bVar, str});
        }
        if (bVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<JSONObject> it = bVar.j().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                jSONObject2 = null;
                break;
            }
            jSONObject2 = it.next();
            if (jSONObject2 != null && str.equals(jSONObject2.getString("name"))) {
                break;
            }
        }
        if (jSONObject2 == null) {
            UnifyLog.a(this.f.s(), "OpenSimplePopupSubscriber", "通过type，component container信息未匹配到： " + str, new String[0]);
        }
        String str3 = "";
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString("containerType");
            JSONArray jSONArray = jSONObject2.getJSONArray("type");
            if (jSONArray != null && jSONArray.size() > 0) {
                str3 = (String) jSONArray.get(0);
            }
        } else {
            str2 = "native";
        }
        jSONObject.put("type", (Object) str3);
        return new DMComponent(jSONObject, str2, jSONObject2, null);
    }
}
