package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes.dex */
public class leu extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RITEMEXPOSURE = 7882392389048015465L;

    static {
        kge.a(2585099);
    }

    public static /* synthetic */ Object ipc$super(leu leuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(leu leuVar, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdced1cc", new Object[]{leuVar, baseSectionModel, baseSectionModel2});
        } else {
            leuVar.a(baseSectionModel, baseSectionModel2);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
            ldf.d("DXItemExposureEventHandler", "args exception");
        } else {
            final BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
            if (b == null) {
                ldf.d("DXItemExposureEventHandler", "originSection is null");
                return;
            }
            final BaseSectionModel<?> a2 = a(b, objArr[0], a(dXEvent));
            if (a2 == null) {
                ldf.d("DXItemExposureEventHandler", "frameSection is null");
            } else {
                ljd.a().d(new Runnable() { // from class: tb.leu.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            leu.a(leu.this, b, a2);
                        }
                    }
                });
            }
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3224caf8", new Object[]{this, baseSectionModel, baseSectionModel2});
            return;
        }
        b(baseSectionModel, baseSectionModel2);
        ljh.a(baseSectionModel2, (JSONObject) null);
        lcy.a(baseSectionModel2.mo1096getExposureParam());
    }

    private int a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed70071d", new Object[]{this, dXEvent})).intValue();
        }
        if (!(dXEvent instanceof DXPageChangeEvent)) {
            return 0;
        }
        return ((DXPageChangeEvent) dXEvent).pageIndex;
    }

    private BaseSectionModel<?> a(BaseSectionModel<?> baseSectionModel, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("97651687", new Object[]{this, baseSectionModel, obj, new Integer(i)});
        }
        JSONObject a2 = a(obj, i);
        if (a2 == null) {
            ldf.d("DXItemExposureEventHandler", "sectionJson is null");
            return null;
        }
        return baseSectionModel.createBaseSectionModel(a2);
    }

    private void b(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7ec179", new Object[]{this, baseSectionModel, baseSectionModel2});
            return;
        }
        if (a(baseSectionModel)) {
            baseSectionModel2.getArgs().put("dataFlag", (Object) "1");
        }
        ljh.b(baseSectionModel, baseSectionModel2);
        if (baseSectionModel2.getString("adNamespace") != null) {
            return;
        }
        baseSectionModel2.put("adNamespace", (Object) "tb_recmd_homePage");
    }

    private boolean a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc98adb4", new Object[]{this, baseSectionModel})).booleanValue() : baseSectionModel.getExt().getBooleanValue("isBannerCard") && baseSectionModel.getArgs() != null && "1".equals(baseSectionModel.getArgs().getString("dataFlag"));
    }

    private JSONObject a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("45ef985f", new Object[]{this, obj, new Integer(i)});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.size() > i) {
                return jSONArray.getJSONObject(i);
            }
            return null;
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            return (JSONObject) obj;
        }
    }
}
