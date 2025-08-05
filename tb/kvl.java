package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.j;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend3.util.c;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class kvl extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RTAP = 37581716043L;
    public static final String TAG = "rTap";

    static {
        kge.a(1111074163);
    }

    public static /* synthetic */ Object ipc$super(kvl kvlVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(kvl kvlVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c5d7a9", new Object[]{kvlVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            kvlVar.a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null) {
        } else {
            String string = jSONObject2.getString("page");
            if (TextUtils.isEmpty(string) || !string.equals("Page_Home")) {
                return;
            }
            gmq.a("Page_Home", "track_center_action", "rec_list_item_click_count");
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(final DXEvent dXEvent, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        try {
            j.a(dXRuntimeContext.m(), new j.a() { // from class: tb.kvl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.utils.j.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        kvl.a(kvl.this, dXEvent, objArr, dXRuntimeContext);
                    }
                }
            });
        } catch (Exception e) {
            ksr.b("rTap", "2.0", "rTapError", e.getMessage(), null, null);
            lap.a("rTap", "handleEvent crash:", e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.android.dinamicx.expression.event.DXEvent r21, java.lang.Object[] r22, com.taobao.android.dinamicx.DXRuntimeContext r23) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kvl.a(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    private String a(Context context, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c40f7f22", new Object[]{this, context, bundle, str});
        }
        try {
            if (TextUtils.isEmpty(str) || !TextUtils.equals("ContentDetailPage", Uri.parse(str).getQueryParameter("currentChannel"))) {
                return str;
            }
            Map<String, String> pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(context);
            if (!TextUtils.equals("true", pageProperties.get("useEntryUtparam"))) {
                return str;
            }
            str = str + "&useEntryUtparam=true";
            bundle.putString("entryUtParam", URLDecoder.decode(pageProperties.get("entryUtparam")));
            bundle.putString("entrySpm", pageProperties.get("entrySpm"));
            bundle.putString(pqq.KEY_ENTRY_SCM, pageProperties.get(pqq.KEY_ENTRY_SCM));
            return str;
        } catch (Exception e) {
            e.e("Page_Home_Track", "DX3Rap update imagedetailUt failed" + Log.getStackTraceString(e));
            return str;
        }
    }

    private void a() {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ope f = d.f(null);
        if (f == null || (g = f.g()) == null || g.size() <= 0) {
            return;
        }
        String jSONString = g.toJSONString();
        kss.a((HashMap) JSON.parseObject(jSONString, new TypeReference<HashMap<String, String>>() { // from class: tb.kvl.2
        }, new Feature[0]));
        kss.a(jSONString);
        e.e("Page_Home_Track", "DX3Rap updateNextPageUtParams");
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, View view) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9138ff6a", new Object[]{this, jSONObject, jSONObject2, view});
            return;
        }
        Object tag = view.getTag(R.id.tag_recommend_containerId);
        String str = null;
        String obj = tag == null ? null : tag.toString();
        String string = jSONObject2.getJSONObject("clickParam").getString("itemId");
        String string2 = jSONObject.getString("sectionBizCode");
        c.b(obj, string);
        c.a(obj, string, string2, b(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        if (tag != null) {
            str = tag.toString();
        }
        jSONObject3.put("containerId", (Object) str);
        jSONObject3.put("itemId", (Object) string);
        if (oqc.b(obj)) {
            bVar = new b("RTapClick", oqc.f, jSONObject3);
        } else {
            bVar = new b("RTapClick", opb.g, jSONObject3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null) {
            d.b(obj).a(message);
        }
        a(jSONObject, jSONObject2);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("args");
            jSONObject3.put(aw.PARAM_PVID, (Object) jSONObject4.getString(aw.PARAM_PVID));
            jSONObject3.put("spm", (Object) jSONObject4.getString("spm"));
            JSONObject jSONObject5 = jSONObject4.getJSONObject("utLogMapEdge");
            if (jSONObject5 != null) {
                jSONObject3.put(kox.X_OBJECT_ID, (Object) jSONObject5.getString(kox.X_OBJECT_ID));
                if (jqm.a()) {
                    e.e(oor.TAG, "commit tap, it can get utLogMapEdge");
                }
            } else {
                String string = jSONObject4.getString("utLogMap");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject3.put(kox.X_OBJECT_ID, (Object) JSONObject.parseObject(URLDecoder.decode(string, "utf-8")).getString(kox.X_OBJECT_ID));
                    }
                } catch (UnsupportedEncodingException e) {
                    ksp.a("rTap", "utLogMap catch decode error", e);
                } catch (NullPointerException e2) {
                    ksp.a("rTap", "utLogMap catch npe error", e2);
                }
            }
        }
        if (jSONObject2.getJSONObject("clickParam") != null) {
            str2 = jSONObject2.getJSONObject("clickParam").getString("itemId");
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
        } else {
            str = "click_recommend_item";
            str2 = null;
        }
        com.taobao.android.behavix.h.a("Page_Home", str, (String) null, str2, nlr.b(jSONObject3));
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        if (jSONObject.getJSONObject("bizData") == null) {
            return null;
        }
        return jSONObject.getJSONObject("bizData").getJSONObject("itemPassParam");
    }
}
