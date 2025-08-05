package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.h;
import com.taobao.homepage.pop.protocol.model.section.BasePopItemModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.utils.f;

/* loaded from: classes.dex */
public abstract class kyx extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(kyx kyxVar, String str, Object... objArr) {
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

    public void a(BasePopSectionModel basePopSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0104022", new Object[]{this, basePopSectionModel, jSONObject});
        } else if (basePopSectionModel == null && jSONObject == null) {
        } else {
            f.a(basePopSectionModel, jSONObject, (JSONObject) null);
        }
    }

    public JSONObject a(int i, BasePopSectionModel basePopSectionModel) {
        BasePopItemModel mo1074getItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52c3e961", new Object[]{this, new Integer(i), basePopSectionModel});
        }
        if (basePopSectionModel != null && (mo1074getItem = basePopSectionModel.mo1074getItem()) != null && !mo1074getItem.isEmpty()) {
            Object obj = mo1074getItem.get(String.valueOf(i));
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
        }
        return null;
    }
}
