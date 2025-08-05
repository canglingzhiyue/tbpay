package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.weex_framework.util.a;
import com.taobao.homepage.pop.utils.c;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.Iterator;

/* loaded from: classes.dex */
public class lqu extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_FETCHICONLINE = 7208901696738191400L;

    static {
        kge.a(1804507554);
    }

    public static /* synthetic */ Object ipc$super(lqu lquVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0) {
            c.a("FetchIconLine ", "operationList is empty");
            return null;
        }
        String obj = objArr[0] == null ? null : objArr[0].toString();
        if (TextUtils.isEmpty(obj)) {
            c.a("FetchIconLine ", "itemBizCode is empty");
            return null;
        }
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        BaseSubSectionModel mo1098getSubSection = b == null ? null : b.mo1098getSubSection();
        if (mo1098getSubSection == null) {
            return null;
        }
        Iterator<String> it = mo1098getSubSection.keySet().iterator();
        int i = -1;
        int i2 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject2 = mo1098getSubSection.getJSONObject(next);
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("item")) != null) {
                Iterator<String> it2 = jSONObject.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next2 = it2.next();
                        JSONObject jSONObject3 = jSONObject.getJSONObject(next2);
                        if (jSONObject3 != null && TextUtils.equals(obj, jSONObject3.getString("itemBizCode"))) {
                            i2 = a(next2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i2 >= 0) {
                    i = a(next);
                    break;
                }
            }
        }
        if (i2 < 0 || i < 0) {
            return null;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(a.ATOM_EXT_row, (Object) Integer.valueOf(i2));
        jSONObject4.put(a.ATOM_EXT_column, (Object) Integer.valueOf(i));
        return jSONObject4;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (Throwable th) {
            c.a("getIntegerValue error", th);
            return -1;
        }
    }
}
