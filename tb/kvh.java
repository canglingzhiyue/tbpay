package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.taolive.room.utils.aw;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public class kvh extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_INSERTCARDS = 204709052093538189L;

    static {
        kge.a(-1207807676);
    }

    public static /* synthetic */ Object ipc$super(kvh kvhVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        JSONObject e = dXRuntimeContext.e();
        if (!(e instanceof JSONObject)) {
            lap.a("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "section数据错误");
            return;
        }
        String string = e.getString("sectionBizCode");
        if (TextUtils.isEmpty(string)) {
            lap.a("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "sectionBizCode为空");
            return;
        }
        JSONObject jSONObject = (JSONObject) objArr[0];
        if (!(jSONObject instanceof JSONObject)) {
            lap.a("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "item数据错误 : " + string);
            return;
        }
        a(jSONObject, string, dXRuntimeContext);
        kss.b(e, jSONObject);
        a(e, jSONObject);
    }

    private void a(JSONObject jSONObject, String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9c3343", new Object[]{this, jSONObject, str, dXRuntimeContext});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            lap.a("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "item.content数据错误 : " + str);
        } else if (dXRuntimeContext == null) {
        } else {
            ba b = dXRuntimeContext.b();
            if (!(b instanceof RecommendDxUserContext)) {
                return;
            }
            Object object = ((RecommendDxUserContext) b).getObject(osp.RMD_CONTAINER);
            if (!(object instanceof WeakReference)) {
                return;
            }
            Object obj = ((WeakReference) object).get();
            if (!(obj instanceof osm)) {
                return;
            }
            String string = jSONObject2.getString("upBizParam");
            if (TextUtils.isEmpty(string)) {
                lap.a("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "item.upBizParam 为空 : " + str);
            }
            String a2 = a(jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("sectionBizCode", (Object) str);
            jSONObject3.put("upBizParam", (Object) string);
            jSONObject3.put("clickId", (Object) a2);
            ((osm) obj).a(jSONObject3);
        }
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
                    ksp.a("DXInsertCardsEventHandler", "utLogMap catch decode error", e);
                } catch (NullPointerException e2) {
                    ksp.a("DXInsertCardsEventHandler", "utLogMap catch npe error", e2);
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

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            e.e("DXInsertCardsEventHandler", "getClickId item is null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
        if (jSONObject2 != null) {
            return jSONObject2.getString("itemId");
        }
        e.e("DXInsertCardsEventHandler", "getClickId clickParam is null item = " + jSONObject);
        return null;
    }
}
