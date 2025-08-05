package tb;

import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.c;
import com.taobao.global.setting.d;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/MTBGeneralSettingMergeTransformer;", "Lcom/taobao/message/lab/comfrm/inner2/Transformer;", "()V", "getSpecialSettingRightTip", "", "key", "isSettingShouldShow", "", "settingItemShowConfig", "Lcom/alibaba/fastjson/JSONObject;", "setItemStatus", "", "item", "settingItemStatus", "transform", "Lcom/taobao/message/lab/comfrm/inner2/SharedState;", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "sharedState", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfg implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2116368033);
        kge.a(1437606424);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        if ((!q.a((Object) StdActions.UPDATE_ORIGINAL_DATA, (Object) (action != null ? action.getName() : null))) || sharedState == null || (jSONObject = (JSONObject) sharedState.getOriginData("settingItemsSource", JSONObject.class, null)) == null || (jSONObject2 = (JSONObject) sharedState.getOriginData("settingStatusSource", JSONObject.class, null)) == null) {
            return sharedState;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("settingItems");
        JSONArray jSONArray2 = jSONArray;
        if (!(jSONArray2 == null || jSONArray2.isEmpty())) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("settingItemStatus");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("settingItemShowConfig");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            int i = 0;
            while (i < jSONArray.size()) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                JSONArray jSONArray3 = jSONObject5 != null ? jSONObject5.getJSONArray("items") : null;
                JSONArray jSONArray4 = jSONArray3;
                if (jSONArray4 == null || jSONArray4.isEmpty()) {
                    jSONArray.mo1572remove(i);
                } else {
                    int i2 = 0;
                    while (i2 < jSONArray3.size()) {
                        JSONObject jSONObject6 = jSONArray3.getJSONObject(i2);
                        String string = jSONObject6 != null ? jSONObject6.getString("key") : null;
                        String str = string;
                        if (str == null || str.length() == 0) {
                            jSONArray3.mo1572remove(i2);
                        } else if (!a(string, jSONObject4)) {
                            jSONArray3.mo1572remove(i2);
                        } else {
                            a(string, jSONObject6, jSONObject3);
                            i2++;
                        }
                    }
                    if (jSONArray3.isEmpty()) {
                        jSONArray.mo1572remove(i);
                    } else {
                        i++;
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settingItems", jSONArray);
        return sharedState.updateRuntimeData(linkedHashMap);
    }

    private final boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{this, str, jSONObject})).booleanValue();
        }
        Boolean bool = jSONObject.getBoolean(str);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    private final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca495b2", new Object[]{this, str, jSONObject, jSONObject2});
            return;
        }
        String string = jSONObject.getString("style");
        if (q.a((Object) string, (Object) "linkStyle")) {
            String a2 = a(str);
            String str3 = a2;
            if (str3 == null || str3.length() == 0) {
                a2 = jSONObject2.getString(str);
            }
            String str4 = a2;
            if (str4 != null && str4.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            jSONObject.put((JSONObject) "remindTitle", a2);
        } else if (!q.a((Object) string, (Object) "switchStyle")) {
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("switchStyle");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject.put((JSONObject) "switchStyle", (String) jSONObject3);
            }
            boolean a3 = q.a((Object) "true", (Object) jSONObject3.getString("defaultSwitchState"));
            Boolean bool = jSONObject2.getBoolean(str);
            if (bool != null) {
                a3 = bool.booleanValue();
            }
            d a4 = d.a();
            q.a((Object) a4, "GlobalEnv.getInstance()");
            if (!a4.b() || !q.a((Object) mxr.KEY_INLINE_VOLUME, (Object) str)) {
                str2 = "";
            } else {
                a3 = !a3;
                str2 = tfk.EVENT_HANDLER_SWITCH_REVERSE;
            }
            JSONObject jSONObject4 = jSONObject3;
            jSONObject4.put((JSONObject) "switchStatus", (String) Boolean.valueOf(a3));
            if (q.a((Object) "timeFrameMute", (Object) str)) {
                if (a3) {
                    c a5 = c.a(Globals.getApplication(), "mytaobao");
                    q.a((Object) a5, "TaobaoGlobalSettings\n   …MTBConstant.MTB_BIZ_NAME)");
                    ksz b = a5.b();
                    jSONObject.put((JSONObject) "remindTitle", tfl.INSTANCE.a((String) b.a("mytaobao", str + "Sub", "", null)));
                } else {
                    jSONObject.put((JSONObject) "remindTitle", "");
                }
                JSONObject jSONObject5 = jSONObject.getJSONObject("linkStyle");
                if (jSONObject5 == null) {
                    jSONObject5 = new JSONObject();
                    jSONObject.put((JSONObject) "linkStyle", (String) jSONObject5);
                }
                if (a3) {
                    jSONObject5.put((JSONObject) "eventName", tfj.EVENT_HANDLER_CLICK_PICKER);
                } else {
                    jSONObject5.put((JSONObject) "eventName", "");
                }
                str2 = tfj.EVENT_HANDLER_SWITCH_PICKER;
            }
            jSONObject4.put((JSONObject) "eventName", str2);
        }
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (q.a((Object) "video", (Object) str)) {
            int F = mxr.F();
            if (F == 1) {
                return b.a(R.string.mt_videoPlay4GAndWiFi);
            }
            if (F == 2) {
                return b.a(R.string.mt_videoPlayClose);
            }
            return b.a(R.string.mt_videoPlayWiFiOnly);
        } else if (q.a((Object) "region", (Object) str)) {
            return mxr.D();
        } else {
            if (!q.a((Object) mxr.KEY_CLEAN_CACHE, (Object) str)) {
                return null;
            }
            return " ";
        }
    }
}
