package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* loaded from: classes.dex */
public class lem extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_APPEAREXPOSE = -1980042490983877383L;

    /* renamed from: a  reason: collision with root package name */
    private IMainLifecycleService f30530a;

    static {
        kge.a(-780362742);
    }

    public static /* synthetic */ Object ipc$super(lem lemVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            Object obj = objArr[0];
            if (!(obj instanceof JSONObject)) {
                return;
            }
            ljs a2 = lfq.a(dXRuntimeContext);
            if (a2 == null) {
                ldf.d("DXAppearExposeEventHandler", "infoFlowContext is null");
                return;
            }
            if (this.f30530a == null) {
                this.f30530a = (IMainLifecycleService) a2.a(IMainLifecycleService.class);
            }
            final JSONObject jSONObject = new JSONObject();
            if (objArr.length == 2) {
                jSONObject.put("skipCheck", (Object) Boolean.valueOf(!TypeUtils.castToBoolean(objArr[1]).booleanValue()));
            }
            if (!a(this.f30530a)) {
                return;
            }
            final BaseSectionModel<?> a3 = a(dXRuntimeContext, (JSONObject) obj);
            ljd.a().d(new Runnable() { // from class: tb.lem.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ljh.a((BaseSectionModel<?>) a3, jSONObject);
                    }
                }
            });
        }
    }

    private BaseSectionModel<?> a(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("f8895d47", new Object[]{this, dXRuntimeContext, jSONObject});
        }
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        if (b == null) {
            ldf.d("DXAppearExposeEventHandler", "sectionModel == null");
            return null;
        }
        BaseSectionModel<?> createBaseSectionModel = b.createBaseSectionModel(jSONObject);
        ljh.b(b, createBaseSectionModel);
        return createBaseSectionModel;
    }

    private boolean a(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("102fba24", new Object[]{this, iMainLifecycleService})).booleanValue();
        }
        if (iMainLifecycleService == null) {
            ldf.d("DXAppearExposeEventHandler", "isSelect sceneService == null");
            return true;
        }
        return iMainLifecycleService.isSelect();
    }
}
