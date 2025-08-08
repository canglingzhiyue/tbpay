package com.taobao.android.ultron.datamodel.imp.delta;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.jok;
import tb.jon;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "modify";

    /* renamed from: a  reason: collision with root package name */
    public final String f15777a = "OperateModify";
    private final String b = "add";
    private final String c = "remove";
    private final String d = "update";

    static {
        kge.a(-410866036);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.ultron.datamodel.imp.delta.a
    public void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        ArrayMap<String, Object> extMap;
        Pattern pattern;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278c96f", new Object[]{this, bVar, jSONObject, list});
        } else if (jSONObject != null && jSONObject.containsKey("operations")) {
            JSONArray jSONArray = jSONObject.getJSONArray("operations");
            String str = "target";
            String string = jSONObject.getString(str);
            if (jSONArray == null || jSONArray.isEmpty()) {
                UnifyLog.a(bVar.h(), "OperateModify", "modify operations is null", new String[0]);
                return;
            }
            Map<String, DMComponent> u = bVar.u();
            DMComponent dMComponent = u.get(string);
            if (dMComponent == null) {
                UnifyLog.a(bVar.h(), "OperateModify", "local target component is null", new String[0]);
                return;
            }
            DMComponent a2 = a(dMComponent);
            if (a2 == null) {
                UnifyLog.a(bVar.h(), "OperateModify", "modify target component is null", new String[0]);
                return;
            }
            JSONObject jSONObject2 = bVar.o().getJSONObject(string);
            if (jSONObject2 == null) {
                UnifyLog.a(bVar.h(), "OperateModify", "modify source component is null", new String[0]);
                return;
            }
            JSONObject data = a2.getData();
            Pattern compile = Pattern.compile("[`${}]");
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string2 = jSONObject3.getString("type");
                JSONArray jSONArray2 = jSONArray;
                String string3 = jSONObject3.getString(str);
                String str2 = str;
                String string4 = jSONObject3.getString("source");
                if (StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3) || StringUtils.isEmpty(string4)) {
                    pattern = compile;
                } else {
                    Matcher matcher = compile.matcher(string3);
                    Matcher matcher2 = compile.matcher(string4);
                    String trim = matcher.replaceAll("").trim();
                    String trim2 = matcher2.replaceAll("").trim();
                    pattern = compile;
                    boolean z = trim.startsWith("fields") || trim.startsWith("events");
                    boolean z2 = trim2.startsWith("fields") || trim2.startsWith("events");
                    if (!z || !z2) {
                        UnifyLog.a(bVar.h(), "OperateModify", "modify operations node path format is invalid ", new String[0]);
                        i++;
                        compile = pattern;
                        jSONArray = jSONArray2;
                        str = str2;
                    } else {
                        a(data, trim.split("\\."), a(jSONObject2, trim2.split("\\.")), string2);
                    }
                }
                i++;
                compile = pattern;
                jSONArray = jSONArray2;
                str = str2;
            }
            a2.writeBackDataAndReloadEvent(data, false);
            bVar.o().put(string, (Object) a2.getData());
            DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
            if (dMComponent2 == null) {
                return;
            }
            int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
            if (indexOf == -1) {
                UnifyLog.a(bVar.h(), "OperateModify", "target component index is -1", new String[0]);
            }
            dMComponent2.getChildren().remove(indexOf);
            dMComponent2.getChildren().add(indexOf, a2);
            a2.setParent(dMComponent2);
            ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
            if (extMap2 != null && (extMap = a2.getExtMap()) != null) {
                for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                    extMap.put(entry.getKey(), entry.getValue());
                }
            }
            String b = i.b(a2, dMComponent2);
            String a3 = i.a(a2, dMComponent2);
            a2.setComponentCardGroupTag(b);
            a2.setComponentPosition(a3);
            jon jonVar = new jon();
            jonVar.a(a2);
            jonVar.b(dMComponent);
            jonVar.a(indexOf);
            list.add(jonVar);
            List<IDMComponent> b2 = bVar.b();
            int indexOf2 = b2.indexOf(dMComponent);
            b2.remove(indexOf2);
            b2.add(indexOf2, a2);
            u.put(string, a2);
        }
    }

    private DMComponent a(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("52a735d8", new Object[]{this, dMComponent});
        }
        try {
            return new DMComponent(JSONObject.parseObject(dMComponent.getData().toJSONString()), dMComponent.getContainerType(), JSONObject.parseObject(dMComponent.getContainerInfo().toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Object a(JSONObject jSONObject, String[] strArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e72ab7b", new Object[]{this, jSONObject, strArr});
        }
        while (strArr.length > 1) {
            String str = strArr[0];
            if (str.endsWith(riy.ARRAY_END_STR)) {
                int indexOf = str.indexOf(riy.ARRAY_START_STR);
                JSONArray jSONArray = jSONObject.getJSONArray(str.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str.substring(indexOf + 1, str.length() - 1));
                } catch (Throwable unused) {
                    i = 0;
                }
                if (i < jSONArray.size()) {
                    jSONObject = jSONArray.getJSONObject(i);
                    strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
                }
            } else {
                jSONObject = jSONObject.getJSONObject(str);
                strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
            }
        }
        return jSONObject.get(strArr[0]);
    }

    private void a(JSONObject jSONObject, String[] strArr, Object obj, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323167bd", new Object[]{this, jSONObject, strArr, obj, str});
        } else if (strArr.length == 1) {
            if ("remove".equals(str)) {
                jSONObject.remove(str);
            } else if (!"add".equals(str) && !"update".equals(str)) {
            } else {
                jSONObject.put(strArr[0], obj);
            }
        } else {
            String str2 = strArr[0];
            if (str2.endsWith(riy.ARRAY_END_STR)) {
                int indexOf = str2.indexOf(riy.ARRAY_START_STR);
                JSONArray jSONArray = jSONObject.getJSONArray(str2.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str2.substring(indexOf + 1, str2.length() - 1));
                } catch (Throwable unused) {
                }
                if (jSONArray == null || i >= jSONArray.size()) {
                    return;
                }
                a(jSONArray.getJSONObject(i), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
                return;
            }
            a(jSONObject.getJSONObject(str2), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
        }
    }
}
