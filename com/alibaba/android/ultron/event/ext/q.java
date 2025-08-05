package com.alibaba.android.ultron.event.ext;

import android.app.Activity;
import com.alibaba.android.ultron.event.ext.model.PopConfigModel;
import com.alibaba.android.ultron.vfw.commonpopupwindow.a;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bkd;
import tb.bnv;
import tb.kge;

/* loaded from: classes2.dex */
public class q extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ULTRON_DATA = "ultronData";
    public static final String NEXT_TAG_DISMISS = "dismiss";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2598a;
    private f b = null;

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-6850332895952941978";
    }

    static {
        kge.a(1972715140);
        f2598a = false;
    }

    public q a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("d98ae6c3", new Object[]{this, fVar});
        }
        this.b = fVar;
        return this;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (!(eVar.a() instanceof Activity)) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "context error:" + eVar.a());
        } else {
            Activity activity = (Activity) eVar.a();
            if (f2598a) {
                return;
            }
            f2598a = true;
            UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
            ultronInstanceConfig.a(true);
            ultronInstanceConfig.a(eVar.h().g());
            com.alibaba.android.ultron.vfw.commonpopupwindow.a aVar = new com.alibaba.android.ultron.vfw.commonpopupwindow.a(activity, ultronInstanceConfig);
            if (this.b != null) {
                com.alibaba.android.ultron.vfw.instance.d a2 = aVar.a();
                a2.a(com.taobao.android.order.core.dinamicX.parser.t.DX_ULTRON_SUBMIT_DATA, new com.taobao.android.order.core.dinamicX.parser.t());
                this.b.a(a2);
            }
            String str = "getEventFields == null";
            if (e(eVar) == null || !(e(eVar).get(FIELD_ULTRON_DATA) instanceof JSONObject)) {
                if (e(eVar) != null) {
                    str = "ultronData data 为空";
                }
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
                f2598a = false;
                return;
            }
            a.b bVar = new a.b();
            PopConfigModel popConfigModel = null;
            if (e(eVar) != null) {
                try {
                    popConfigModel = (PopConfigModel) JSONObject.parseObject(e(eVar).toJSONString(), PopConfigModel.class);
                } catch (Exception e) {
                    bkd.a(getClass().getSimpleName(), "onHandleEventChain", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "JSON PARSE ERROR:" + bkd.a(e) + "ERROR JSON:" + e(eVar).toJSONString());
                }
            }
            if (popConfigModel != null) {
                PopConfigModel.Css css = popConfigModel.getCss();
                if (css != null) {
                    try {
                        bVar.a(Float.parseFloat(css.getHeight()));
                    } catch (Exception e2) {
                        bkd.a(getClass().getSimpleName(), "onHandleEventChain", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", bkd.a(e2));
                    }
                } else {
                    bVar.a(0.6f);
                }
                bVar.a(80);
            }
            if (e(eVar) != null && (e(eVar).get(FIELD_ULTRON_DATA) instanceof JSONObject)) {
                aVar.a(e(eVar).getJSONObject(FIELD_ULTRON_DATA), new a());
            } else {
                if (e(eVar) != null) {
                    str = "ultronData data 为空";
                }
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
            }
            aVar.a(bVar);
            aVar.a(new a.InterfaceC0097a() { // from class: com.alibaba.android.ultron.event.ext.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.commonpopupwindow.a.InterfaceC0097a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else {
                        q.this.a(eVar, "dismiss");
                    }
                }
            });
            f2598a = false;
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, String[]> f2600a;

        static {
            kge.a(984727041);
            kge.a(-312919124);
            f2600a = new HashMap<String, String[]>() { // from class: com.alibaba.android.ultron.event.ext.UltronPopV2Subscriber$DXTemplateHookProcessor$1
                {
                    put("ultron_pop_title", new String[]{"overseas_babel_order_cancel_title", "4", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_order_cancel_title/1718781844952/overseas_babel_order_cancel_title.zip"});
                    put("tborder_dialog_tip_d3", new String[]{"overseas_tborder_dialog_tip_d3", "6", "https://dinamicx.alibabausercontent.com/l_pub/overseas_tborder_dialog_tip_d3/1721289356826/overseas_tborder_dialog_tip_d3.zip"});
                    put("tborder_dialog_check_tip", new String[]{"overseas_tborder_dialog_check_tip", "2", "https://dinamicx.alibabausercontent.com/l_pub/overseas_tborder_dialog_check_tip/1721290028555/overseas_tborder_dialog_check_tip.zip"});
                    put("ultron_pop_check", new String[]{"overseas_ultron_pop_check", "3", "https://dinamicx.alibabausercontent.com/l_pub/overseas_ultron_pop_check/1721287256405/overseas_ultron_pop_check.zip"});
                    put("tborder_dialog_two_button_d3", new String[]{"overseas_tborder_dialog_two_button_d3", "7", "https://dinamicx.alibabausercontent.com/l_pub/overseas_tborder_dialog_two_button_d3/1721301067694/overseas_tborder_dialog_two_button_d3.zip"});
                }
            };
        }

        private void a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
                return;
            }
            String[] strArr = f2600a.get(str);
            if (strArr == null) {
                return;
            }
            jSONObject.put("name", (Object) strArr[0]);
            jSONObject.put("version", (Object) strArr[1]);
            jSONObject.put("url", (Object) strArr[2]);
            jSONObject.put("md5", "");
        }

        private void a(com.taobao.android.ultron.common.model.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("395fa298", new Object[]{this, aVar});
                return;
            }
            String[] strArr = f2600a.get(aVar.c);
            if (strArr == null) {
                return;
            }
            aVar.c = strArr[0];
            aVar.e = strArr[1];
            aVar.d = strArr[2];
            aVar.f = "";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void a(List<IDMComponent> list, com.taobao.android.ultron.datamodel.imp.b bVar) {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf29721", new Object[]{this, list, bVar});
                return;
            }
            Iterator<IDMComponent> it = list.iterator();
            while (true) {
                char c2 = 65535;
                if (it.hasNext()) {
                    JSONObject containerInfo = it.next().getContainerInfo();
                    String string = containerInfo.getString("name");
                    switch (string.hashCode()) {
                        case -1135153941:
                            if (string.equals("tborder_dialog_tip_d3")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -929622164:
                            if (string.equals("tborder_dialog_check_tip")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 48723153:
                            if (string.equals("tborder_dialog_two_button_d3")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 1001206543:
                            if (string.equals("ultron_pop_check")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1016950879:
                            if (string.equals("ultron_pop_title")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0 || c2 == 1 || c2 == 2 || c2 == 3 || c2 == 4) {
                        a(containerInfo, string);
                    }
                } else {
                    for (com.taobao.android.ultron.common.model.a aVar : bVar.d()) {
                        String str = aVar.c;
                        switch (str.hashCode()) {
                            case -1135153941:
                                if (str.equals("tborder_dialog_tip_d3")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -929622164:
                                if (str.equals("tborder_dialog_check_tip")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 48723153:
                                if (str.equals("tborder_dialog_two_button_d3")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1001206543:
                                if (str.equals("ultron_pop_check")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1016950879:
                                if (str.equals("ultron_pop_title")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4) {
                            a(aVar);
                        }
                    }
                    return;
                }
            }
        }

        @Override // com.alibaba.android.ultron.vfw.instance.d.c
        public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            } else if (bVar != null && list != null) {
                if (com.alibaba.ability.localization.b.c()) {
                    a(list, bVar);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent != null) {
                        String b = com.taobao.android.ultron.datamodel.imp.f.b(iDMComponent);
                        if ("footer".equals(b)) {
                            arrayList2.add(iDMComponent);
                        } else if ("header".equals(b)) {
                            arrayList.add(iDMComponent);
                        } else if ("foreground".equalsIgnoreCase(b)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(iDMComponent);
                        } else if ("background".equalsIgnoreCase(b)) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(iDMComponent);
                        }
                    }
                    arrayList3.add(iDMComponent);
                }
                bnvVar.a(arrayList);
                bnvVar.e(arrayList2);
                bnvVar.b(arrayList3);
                bnvVar.f(arrayList4);
                bnvVar.g(arrayList5);
            }
        }
    }
}
